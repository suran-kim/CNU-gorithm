# 6.AC

## 문제

선영이는 주말에 할 일이 없어서 새로운 언어 AC를 만들었다. AC는 정수 배열에 연산을 하기 위해 만든 언어이다. 이 언어에는 두 가지 함수 R(뒤집기)과 D(버리기)가 있다.

함수 R은 배열에 있는 수의 순서를 뒤집는 함수이고, D는 첫 번째 수를 버리는 함수이다. 배열이 비어있는데 D를 사용한 경우에는 에러가 발생한다.

함수는 조합해서 한 번에 사용할 수 있다. 예를 들어, "AB"는 A를 수행한 다음에 바로 이어서 B를 수행하는 함수이다. 예를 들어, "RDD"는 배열을 뒤집은 다음 처음 두 수를 버리는 함수이다.

배열의 초기값과 수행할 함수가 주어졌을 때, 최종 결과를 구하는 프로그램을 작성하시오.

## 입력

첫째 줄에 테스트 케이스의 개수 T가 주어진다. T는 최대 100이다.

각 테스트 케이스의 첫째 줄에는 수행할 함수 p가 주어진다. p의 길이는 1보다 크거나 같고, 100,000보다 작거나 같다.

다음 줄에는 배열에 들어있는 수의 개수 n이 주어진다. (0 ≤ n ≤ 100,000)

다음 줄에는 [x1,...,xn]과 같은 형태로 배열에 들어있는 정수가 주어진다. (1 ≤ xi ≤ 100)

전체 테스트 케이스에 주어지는 p의 길이의 합과 n의 합은 70만을 넘지 않는다.

## 출력

각 테스트 케이스에 대해서, 입력으로 주어진 정수 배열에 함수를 수행한 결과를 출력한다. 만약, 에러가 발생한 경우에는 error를 출력한다.

## 예제 입력 1

```
4
RDD
4
[1,2,3,4]
DD
1
[42]
RRD
6
[1,1,2,3,5,8]
D
0
[]

```

## 예제 출력 1

```
[2,1]
error
[1,2,3,5,8]
error
```

---

# 풀이

## 전체코드

```java
package W2_6AC;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    static int num;
    static int length;
    static String[] arrays;
    static String[] command;
    static ArrayList<Integer> result;
    static int rcount;
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        num = Integer.parseInt(br.readLine());
        for (int i = 0; i < num; i++) {
            result = new ArrayList<>();

            command = br.readLine().split("");
            length = Integer.parseInt(br.readLine());
            arrays = br.readLine().replace("[","").replace("]","").split(",");
            ac();
            print();

        }
        bw.flush();

    }
    static void ac(){
        rcount=0;
        int backIndex = arrays.length-1;
        int frontIndex = 0;
        int index = 0;
        int add = 1;
        for (int i = 0; i < command.length; i++) {
            if(command[i].equals("R")){
                rcount++;
                if(rcount%2==1) {
                    index=backIndex;
                    add = -1;
                }
                else{
                    index = frontIndex;
                    add = 1;
                }
            }
            if(command[i].equals("D")){
                result.add(index);
                if(add==-1){
                    backIndex+=add;
                }
                else{
                    frontIndex+=add;
                }
                index+=add;
            }
        }
    }
    static void print() throws IOException {
        Collections.sort(result);
        int commaCount = 0;
        //System.out.println("result ="+result);
        int size = arrays.length;
        if(arrays[0] == ""){
            size-=1;
        }
        if(result.size()>size){
            bw.write("error"+"\n");
            return;
        }
        bw.write("[");
        if(rcount%2==0) {
            for (int i = 0; i < arrays.length; i++) {
                if(!result.isEmpty()){
                    if(result.get(0)==i){
                        result.remove(0);
                        continue;
                    }
                }

                if(commaCount == 0){
                    bw.write(arrays[i]);
                    commaCount++;
                }
                else{
                    bw.write(","+arrays[i]);
                }

                }
            }

        if(rcount%2==1){
            for (int i = arrays.length-1; i >=0; i--) {
                if(!result.isEmpty()) {
                    if (i == result.get(result.size()-1)) {
                        result.remove(result.size()-1);
                        continue;
                    }
                }

                if(commaCount == 0){
                    bw.write(arrays[i]);
                    commaCount++;
                }
                else{
                    bw.write(","+arrays[i]);
                }

            }
        }
        bw.write("]");
        bw.write("\n");

    }
}
```

처음에 출력과정에서 시간초과가 떠서 매우매우매우 애를 먹었다. 

## 핵심 아이디어

```java
 for (int i = 0; i < command.length; i++) {
            if(command[i].equals("R")){
                rcount++;
                if(rcount%2==1) {
                    index=backIndex;
                    add = -1;
                }
                else{
                    index = frontIndex;
                    add = 1;
                }
            }
            if(command[i].equals("D")){
                result.add(index);
                if(add==-1){
                    backIndex+=add;
                }
                else{
                    frontIndex+=add;
                }
                index+=add;
            }
        }
```

타겟이 [1,2,3,4]라고 했을때, 지워야하는 인덱스를 넣은 result배열을 만들었다.

backIndex는 뒤에서부터 시작하는 인덱스이고, (R이 홀수번 들어갔을 때)

frontIndex는 앞에서부터 시작하는 인덱스이다.(R이 짝수번 들어갔을 떄)

R을 넣으면 인덱스를 뒤집어주는 역할로 backIndex, frontIdex번갈아가면서 하는 그걸 방법을 사용.

이렇게 result배열을 만들어준다.

## 출력과정

처음에는 result.contains를 사용했다가 시간초과가 떠서,

for문 내부에 result.contains를 넣는게 아닌, result가 만들어지자마자 sort를 해버리고 양옆에서 데이터를 뽑으며 진행하는 방식으로 출력했다.