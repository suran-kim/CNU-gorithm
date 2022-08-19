# 절대값 힙


import sys
import heapq


heap = []

num = int(input())

for i in range(num):
    n = int(sys.stdin.readline())

    if n != 0:
        heapq.heappush(heap, (abs(n) , n))
    else:
        if heap:
            print(heapq.heappop(heap)[1])
        else:
            print(0)
