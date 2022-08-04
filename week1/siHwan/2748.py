# 피보나치 수 2

ls = []

num = int(input())

for i in range(num+1):
    if i == 0:
        ls.append(0)
    elif i == 1:
        ls.append(1)
    else:
        ls.append(ls[i-2] + ls[i-1])

print(ls[-1])