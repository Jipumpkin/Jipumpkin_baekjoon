sumPrice = int(input())
type = int(input())

vfPrice = 0;

for i in range(type):
    price,num = map(int, input().split())
    
    vfPrice = vfPrice + price*num
    
if sumPrice == vfPrice:
    print("Yes")
else:
    print("No")