# 좌표 압축

import heapq


num = int(input())

ls = list(map(int, input().split()))

pq = []
s = set()
count = 0
ret = []
for i in range(num):
    if ls[i] not in s:
        s.add(ls[i])
        heapq.heappush(pq, ls[i])

for k in ls:
    re = []
    count = 0

    while pq[0] < k:
        re.append(heapq.heappop(pq))
        count += 1

    for i in range(len(re)):
        heapq.heappush(pq,re[i])

    ret.append(count)

print(ret)



