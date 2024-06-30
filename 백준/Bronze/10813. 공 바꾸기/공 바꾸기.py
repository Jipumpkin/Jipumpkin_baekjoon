N,M = map(int, input().split())
list = []
for i in range(N):
    list.append(i+1)
    
for i in range(M):
    a,b = map(int, input().split())
    aa = list[a-1]
    bb = list[b-1]
    list[b-1] = aa
    list[a-1] = bb
    
for i in list:
    print(i, end=" ")