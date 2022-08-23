# 수 정렬하기

n = int(input())

ret = [0] * 10001

for i in range(n):
    num = int(input())
    if ret[num] == 0:
        ret[num] = 1
    else:
        ret[num] += 1

for i in range(1,10001):
    for j in range(ret[i]):
        print(i)
