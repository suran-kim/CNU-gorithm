# 소수 구하기
m, n = map(int,input().split())
for i in range(m,n+1) :
    if i == 1 :
        pass
    elif i == 2 :
        print(2)
    else :
        for j in range(2,i) :
            if i%j == 0 :
                break
            elif j==i-1 :
                print(i)