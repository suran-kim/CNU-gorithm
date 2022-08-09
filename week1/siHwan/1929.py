# 소수 구하기

import math

m , n = list(map(int , input().split()))

ls = [True for i in range(n+1)]

for i in range(2, int(math.sqrt(n)) + 1):
    if ls[i] == True: 

        j = 2
        while( i * j <= n ):
            ls[i*j] = False
            j+=1

for i in range(m, n+1):
    if ls[i]:
        print(i)
