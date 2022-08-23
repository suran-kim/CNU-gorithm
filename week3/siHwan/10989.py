# 수 정렬하기

import sys


n = int(sys.stdin.readline())

ret = [0] * 10001

for i in range(n):
    num = int(sys.stdin.readline())
    if ret[num] == 0:
        ret[num] = 1
    else:
        ret[num] += 1

for i in range(1,10001):
    for j in range(ret[i]):
        print(i)
