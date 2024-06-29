num = []

for i in range(9):
    num.append(int(input()))
max = num[0]
for i in num:
    if max < i:
        max = i
        
print(max,num.index(max)+1)