# 지영 공주님의 마법 거울

num = int(input())

ls = []

for i in range(num):
    ls.append(input())

n = int(input())

if n == 1:
    for i in range(num):
        print(ls[i])
elif n == 2:
    for i in range(num):
        ls[i] = ls[i][::-1]
    for i in range(num):
        print(ls[i])
else:
    ls = ls[::-1]
    for i in range(num):
      print(ls[i])



