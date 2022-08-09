# 피보나치 수 2

cur, next = 0, 1
for _ in range(int(input())) :
    cur, next = next, cur + next
print(cur)

# 재귀함수이기 때문에 시간이 오래걸려 시간 초과
# def fibo(n) :
#     if n < 2 :
#         return n
#     else :
#         return fibo(n-1) + fibo(n-2)

# n = int(input())
# print(fibo(int(input())))