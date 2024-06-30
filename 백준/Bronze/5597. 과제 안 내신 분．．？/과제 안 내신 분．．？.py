lit = []
loslit = []
for i in range(28):
    lit.append(int(input()))
    
for i in range(30):
    if i+1 not in lit:
        loslit.append(i+1)
loslit.sort()

print(loslit[0], loslit[1])