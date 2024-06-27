dice1, dice2, dice3 = map(int, input().split())
dice = [dice1, dice2, dice3]
maxdice = 0
if dice1==dice2==dice3:
    print(10000+(dice1*1000))
elif dice1==dice2 or dice3==dice1:
    print(1000+(dice1*100))
elif dice2==dice3:
    print(1000+(dice2*100))
else:
    for i in range(3):
        if dice[i] > maxdice:
            maxdice = dice[i]
    print(maxdice*100)