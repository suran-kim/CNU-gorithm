# 피보나치 수 5

ls = []

n = int(input())

ls.append(0)
ls.append(1)

for i in range(2,n+1):
    ls.append(ls[i-1] + ls[i-2])

print(ls[n])
