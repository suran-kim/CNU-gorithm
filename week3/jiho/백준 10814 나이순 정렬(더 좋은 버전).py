import sys
input = sys.stdin.readline

N = int(input())

user = []

# 리스트 형태로 입력 받기
for _ in range(N):
	user.append(list(input().split()))

# 나이를 기준으로 정렬	
user.sort(key=lambda a:int(a[0])) # sort 와 lambda를 활용하였다. 또한, 문자열을 정수화 해주어야 하므로 int를 사용하였다. 

# 출력
for i in range(N):
	print(user[i][0], user[i][1]) # join 굳이 안써도 된다. 