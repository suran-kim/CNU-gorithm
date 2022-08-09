# 소수 구하기
                
def is_prime(num):
    if num==1:
        return False
    else:
        for i in range(2, int(num**0.5)+1):
            if num%i == 0:
                return False
        return True

m, n = map(int, input().split())

for i in range(m, n+1):
    if is_prime(i):
        print(i)
        
# 시간 초과
# m, n = map(int,input().split())
# for i in range(m,n+1) :
#     if i == 1 :
#         pass
#     elif i == 2 :
#         print(2)
#     else :
#         for j in range(2,i) :
#             if i%j == 0 :
#                 break
#             elif j==i-1 :
#                 print(i)
                