# 카드

import sys
input = sys.stdin.readline  # 입력 줄 수가 많으므로 반드시 필요

n = int(input())
card_dic = {}

for i in range(n) :
    card = int(input())
    if card in card_dic :
        card_dic[card] += 1
    else :
        card_dic[card] = 1

result = sorted(card_dic.items(),key = lambda x : (-x[1],x[0]))
print(result[0][0])