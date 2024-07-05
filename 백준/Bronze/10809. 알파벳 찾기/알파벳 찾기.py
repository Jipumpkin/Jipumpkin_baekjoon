word = input()
listA = listA = ['a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z']

count = 0
for i in range(26):
    if  listA[i] in word:
        listA[i] = word.index(listA[i])
    else:
        listA[i] = -1
        
for i in listA:
    print(i, end=" ")
    