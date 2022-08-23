from heapq import heappush, heappop

class Word:
    def __init__(self, word, count):
        self.word = word
        self.count = count
        
    def __lt__(self, other):
        if self.count != other.count:
            return self.count < other.count
        else:
            s = self.sum_digits_string(self.word)
            o = self.sum_digits_string(other.word)
            if s != o:
                return s < o
            else:
                return self.word < other.word
    
    def sum_digits_string(self, str1):
        sum_digit = 0
        for x in str1:
            if x.isdigit() == True:
                z = int(x)
                sum_digit = sum_digit + z

        return sum_digit
            


num = int(input())
ls = []
for i in range(num):
    ls.append(input())


pq = []

for word in ls:
    heappush(pq, Word(word, len(word)))

    
print(heappop(pq).word)
print(heappop(pq).word)
print(heappop(pq).word)
print(heappop(pq).word)
print(heappop(pq).word)
