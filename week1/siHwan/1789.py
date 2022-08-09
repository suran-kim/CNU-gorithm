# 수들의 합

num = int(input())

sum = 0

count = 0
i = 1
while True:
    if sum > num:
        break
    count += 1
    sum += i
    i += 1

print(count + 1)

