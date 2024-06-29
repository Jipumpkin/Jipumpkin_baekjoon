N,M = map(int, input().split())
list = []
for i in range(N):
    list.append(0)
for ii in range(M):
    i,j,k = map(int, input().split())
    for j in range(i,j+1):
        list[j-1] = k
        
for i in list:
    print(i, end=" ")
        