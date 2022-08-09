# 모든 순열

n = int(input())
s = [str(i+1) for i in range(n)]

def bf(arr,r):
    if arr:
        for i in range(n-len(r)):
            temp = list(r)
            temp.append(arr[i])
            new_arr = arr[:i] + arr[i+1:]
            bf(new_arr,temp)
    else:
        print(*r)

bf(s,[])

