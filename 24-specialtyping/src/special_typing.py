def special_typing():
    # your code here ^_^
    for i in range(int(input())):
        s=list(input()[::-1])
        t=list(input()[::-1])
        while len(s)!=0 and len(t)!=0:
            if s.pop(0)==t[0]:
                t.pop(0)
            elif len(s)!=0:
                s.pop(0)
        if len(t)==0:
            print('YES')
        else:
            print('NO')

#special_typing()