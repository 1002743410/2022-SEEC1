def cal_max_difference():
    n=input()
    n=[int(value) for value in n.split(" ")]
    l1=len(n)
    temp=list()
    #计算并保存所有大于0的值到数组temp中
    for i in range(l1-1):
        for j in range(i+1,l1):
            if n[i]>=n[j]:
                continue
            else:
                temp.append(n[j]-n[i])
    l2=len(temp)
    result=0
    #输出数组temp中最大的值，如果没有，则输出-1
    for i in temp:
        if i>result:
            result=i
    if result==0:
        print(-1,end="")
    else:
        print(result,end="")
    return
#cal_max_difference()




