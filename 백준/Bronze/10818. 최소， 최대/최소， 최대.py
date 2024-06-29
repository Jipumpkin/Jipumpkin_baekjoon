t = int(input())
numlist = list(map(int, input().split()))
max = numlist[0];
min = numlist[0];
for i in numlist:
    if max < i:
        max = i
    
    if min > i:
        min = i
        
print(min,max)