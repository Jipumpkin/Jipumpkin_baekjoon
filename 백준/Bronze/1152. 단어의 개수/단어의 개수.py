word = input()
count = 0
if word[-1] == " ":
    count-=1
if word[0] == " ":
    count-=1
for i in word:
    if i == " ":
        count+=1
print(count+1)