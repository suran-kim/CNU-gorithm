# 최대공약수와 최소공배수

# 풀이 1
m, n = map(int, input().split())
a = []
b = []
for i in range(1,max(m,n)+1) :
    if m%i == 0 :
        a.append(i)
    if n%i == 0 :
        b.append(i)
list = [i for i in a if i in b]

print(max(list))
print(int(m*n/max(list)))

# 풀이 2 : 유클리드 호제법
def gcd(a,b) :
    while b > 0 :
        a, b = b, a%b
    return a
    
def lcm(a,b) :
    return a*b//gcd(a,b)

a, b = map(int, input().split())

if b>a :
    a, b = b, a

print(gcd(a,b))
print(lcm(a,b))