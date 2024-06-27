H,M = map(int, input().split())
S = int(input())

M = M+S
if M>=60:
    H = H+(M//60)
    M = M%60
    if H>=24:
        H = H-24

print(H,M)