T = int(input())
score = list(map(int, input().split()))
scoreSum = 0

for i in score:
    scoreSum = scoreSum + i/max(score)*100

print(scoreSum/T)