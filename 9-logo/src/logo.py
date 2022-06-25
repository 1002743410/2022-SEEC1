
def logo_play():
    """write your code in method"""
    checkerboard=[['0' for i in range(10)] for j in range(10)]
    n=int(input())
    #初始化乌龟的位置，即棋盘左上角
    line=0
    column=0
    #分别对每条指令进行解读，并修改棋盘格中的内容
    for i in range(n):
        instruct=input().split(" ")
        if len(instruct)==3:
            first_instruct=instruct[0]
            second_instruct=int(instruct[1])
            third_instruct=instruct[2]
        else:
            first_instruct = instruct[0]
            second_instruct = int(instruct[1])
        #上移
        if first_instruct=="U":
            if line>=0 and column>=0 and line<10 and column<10:
                for j in range(1,second_instruct+1):
                    checkerboard[line-j][column]=third_instruct
                line=line-second_instruct
            else:
                print("Error!")
                break
        #下移
        if first_instruct=='D':
            if line>=0 and column>=0 and line<10 and column<10:
                for j in range(1,second_instruct+1):
                    checkerboard[line+j][column]=third_instruct
                line = line +second_instruct
            else:
                print("Error!")
                break
        #左移
        if first_instruct=='L':
            if line>=0 and column>=0 and line<10 and column<10:
                for j in range(1,second_instruct+1):
                    checkerboard[line][column-j]=third_instruct
                column=column-second_instruct
            else:
                print("Error!")
                break
        #右移
        if first_instruct=='R':
            if line>=0 and column>=0 and line<10 and column<10:
                for j in range(1,second_instruct+1):
                    checkerboard[line][column+j]=third_instruct
                column=column+second_instruct
            else:
                print("Error!")
                break
    #输出修改后的棋盘格的内容
    if line >= 0 and column >= 0 and line < 10 and column < 10:
        for i in range(10):
            for j in range(10):
                #’0‘为空白字符，不输出
                if checkerboard[i][j]=='0':
                    print(' ',sep="",end="")
                else:
                    print(checkerboard[i][j],sep="",end="")
                if j==9:
                    print(end="\n")
    else:
        print("Error!")#如果在第一条指令中就error，则需要在最终的输出中增加输出内容
    return

#logo_play()
