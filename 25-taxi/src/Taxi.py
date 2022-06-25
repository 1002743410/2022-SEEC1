"""write your code in method solve"""
def solve():
    n=int(input())
    lst=input().split(' ')
    lst=[int(lst[i]) for i in range(n)]
    number_lst=[]
    taxi_number=0

    for i in range(4):
        number_lst.append(lst.count(i+1))

    while number_lst[0]!=0 or number_lst[0]==1:
        number_lst[3]+=number_lst[0]//4
        if number_lst[0] % 4 == 0:
            number_lst[0] = 0
        elif number_lst[0] % 4 == 1:
            number_lst[0] = 0
            number_lst[2] -= 1
            number_lst[3] += 1
        elif number_lst[0] % 4 == 2:
            if number_lst[1]%2==1:
                number_lst[0] = 0
                number_lst[1] += 1
            else:
                number_lst[0]=1
                number_lst[2]-=1
                number_lst[3]+=1
        elif number_lst[0] % 4 == 3:
            if number_lst[1]%2==1:
                number_lst[0]=1
                number_lst[1]+=1
            else:
                number_lst[0] = 0
                number_lst[2] += 1

        number_lst[3] += number_lst[1] // 2
        if number_lst[1]%2==0:
            number_lst[1]=0
        else:
            number_lst[1]=1

    for i in number_lst:
        if i>0:
            taxi_number+=i

    print(taxi_number)
    return

#solve()

#计算/模拟
#情况的考查
import math from ceil
def solve2():
    _=input()
    c1,c2,c3,c4=list(map(input().count,['1','2','3','4']))
    taxi_count=c4+c3+ceil(c2/2)+ceil(max(c1-c2%2)*2-c3,0)/4)
    print(taxi_count)
