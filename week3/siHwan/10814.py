# 나이순 정렬

num = int(input())
ls = []

for i in range(num):
    ls.append(input().split())
print(i)
max = 0
for i in range(len(ls)):
    if max < int(ls[i][0]):
        max = int(ls[i][0])

print(i)
ls_ = [[] for i in range(max+1)]

# i = 0

# for n,name in ls:
#     ls_[int(n)].append(name)

# for ls in ls_:
#     while ls != []:
#         print(i, ls.pop(0))
#     i += 1


