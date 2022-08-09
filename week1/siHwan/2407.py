# 조합
def fatorial(n):
    result = 1
    for i in range(1, n+1):
        result *= i
    return result

ls = list(map(int, input().split()))
n = ls[0]
r = ls[1]

numerator = fatorial(n) 
denominator = fatorial(r) * fatorial(n-r)

print(numerator // denominator)