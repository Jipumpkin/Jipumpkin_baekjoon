N,X = map(int, input().split())
numList = list(map(int, input().split()))
num =""
for i in numList:
    if i < X:
        num = num+str(i)+" "
        

print(num)