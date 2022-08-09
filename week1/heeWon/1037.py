# 약수

n = int(input())
if n == 1 :
    m = int(input())
    print(m*m)
else :
    list = list(map(int, input().split()))
    print(min(list)*max(list))