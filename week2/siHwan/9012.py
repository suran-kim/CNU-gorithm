# 괄호

import sys

num = int(input())

for i in range(num):
    stack = []
    flag = False
    ls = list(sys.stdin.readline().rstrip())

    for i in ls:
        if i == '(':
            stack.append(i)
        else:
            if len(stack) != 0:
                stack.pop()
                
            else:
                flag = True
                break

    if len(stack) == 0 and flag == False:
        print('YES')
    else:
        print('NO')