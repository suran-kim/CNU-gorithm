n = int(input())

for _ in range(n) :
    lst = list (input())    
    visited = [False] * len(lst)
    
    if len(visited) % 2 == 1:
        print("NO")
        exit()
    
    for i in range(len(lst)):
        if lst[i] == '(':
            continue
        elif  lst[i] == ')':
            visited[i] = True
        for j in range(i-1, -1, -1): # 이건 무조건맞음
            # 여기를 실행한다는거는 Lst[i] == ')'
            if visited[j] == True:
                continue
            if lst[j] == '(':
                visited[j] = True
                break
            elif lst[j] == ')':
                continue
            
    
    if sum(visited) == len(visited) :
        print("YES")
    else:
        print('NO')   
            
        