# 스택

import sys

num = int(input())

stack = []

for i in range(num):
    ls = sys.stdin.readline().split()
    
    if ls[0] == 'push':
        stack.append(ls[1])
    elif ls[0] == 'pop':
        if len(stack) == 0:
            print(-1)
        else:
            print(stack.pop())
    elif ls[0] == 'size':
        if len(stack) == 0:
            print(0)
        else:
            print(len(stack))
    elif ls[0] == 'empty':
        if len(stack) == 0:
            print(1)
        else:
            print(0)
    elif ls[0] == 'top':
        if len(stack) == 0:
            print(-1)
        else:
            print(stack[-1])


