a,b = map(str, input().split())

a = a[-1] + a[1:-1] + a[0]
b = b[-1] + b[1:-1] + b[0]

numli = [int(a), int(b)]

print(max(numli))