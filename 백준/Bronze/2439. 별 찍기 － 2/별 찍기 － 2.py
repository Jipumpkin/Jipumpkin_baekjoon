n = int(input())
star=""
count = 1
for i in range(n,0,-1):
    star = " "*(i-1)+"*"*count
    count += 1
    print(star)