# 소수 찾기

def is_prime(n):
    if n == 1:
        return False
    for i in range(2 , n):
        if n % i == 0:
            return False
    return True        

n = int(input())
ls = list(map(int , input().split()))
count = 0

for i in ls:
    if is_prime(i) == True:
        count += 1

print(count)

