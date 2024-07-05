T = int(input())

for i in range(T):
    rep, word = map(str, input().split())
    result = ""
    for i in word:
        for j in range(int(rep)):
            result = result+i
    print(result)

