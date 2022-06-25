"""write your code in method print_snake"""


def print_snake():
    n,m=input().split(' ')
    n,m=int(n),int(m)
    board=[['.' for i in range(m)] for j in range(n)]
    for i in range(n):
        for j in range(m):
            if i%2==0:
                board[i][j]='#'
            if i==1 or (i-1)%4==0:
                    board[i][m-1]='#'
            if (i-3)%4==0:
                    board[i][0]='#'
    for i in range(n):
        for j in range(m):
            print(board[i][j],end='')
        if i<n-1:
            print('')

    return

#print_snake()