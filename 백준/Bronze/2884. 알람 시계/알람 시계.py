H,M = map(int, input().split())

M = M-45
if M<0:
    H = H-1
    a = M*-1
    M = 60-a
    if H>24:
        H = 0
    elif H<0:
        H = 23

print(H,M)