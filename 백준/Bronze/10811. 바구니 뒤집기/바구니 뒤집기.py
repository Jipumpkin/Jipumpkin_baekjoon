N,M = map(int, input().split())
bas = []
for i in range(N):
    bas.append(i+1)
for i in range(M):
    a,b = map(int,input().split())

    rcount = 0;
    hanten = bas[a-1:b]
    
    while True:
        ii = hanten[rcount]
        jj = hanten[len(hanten)-1-rcount]
        hanten[rcount] = jj
        hanten[len(hanten)-1-rcount] = ii
        
        rcount = rcount + 1
        if rcount > (len(hanten)-1)//2:
            break

    bas[a-1:b] = hanten
for i in bas:
    print(i, end=" ")