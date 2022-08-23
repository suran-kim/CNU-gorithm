# 색종이 만들기
def dfs(ls , left, right, up, down ):
    global white,blue

    c = ls[left][up]

    for i in range(left,right+1):
        for j in range(up,down+1):
            if ls[i][j] != c:
                print(left,right,up,down)
                dfs(ls, left,(left+right)//2,up,(up+down)//2)
                dfs(ls, ((left+right)//2)+1,right,up,(up+down)//2)
                dfs(ls, left,(left+right)//2,((up+down)//2)+1,down)
                dfs(ls, ((left+right)//2)+1,right,((up+down)//2)+1,down)
                return
            if i == right and j == down:
                if c == 0:
                    white += 1
                else:
                    blue += 1

    if right-left == 0:
        return

num = int(input())

ls = []
global white, blue

white = 0
blue = 0

for i in range(num):
    l = list(map(int, input().split(" ")))
    ls.append(l)

dfs(ls, 0,len(ls)-1,0,len(ls)-1)

print(white)
print(blue)


    


    