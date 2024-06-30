numlist = []
uninum = []

for i in range(10):
    numlist.append(int(input())%42)
    
for i in numlist:
    
    if i not in uninum:
        uninum.append(i)

print(len(uninum))
