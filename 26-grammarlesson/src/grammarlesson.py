def isPetyaLanguage():
    sen_lst=input().split(' ')
    mas_lst=['lios','etr','initis']
    fem_lst=['liala','etra','inites']
    lst=mas_lst+fem_lst
    result=[]
    gender='null'
    state=0

    #check language
    for word in sen_lst:
        for i in lst:
            if i in word:
                state=1
                break
            else:
                state=0
        if state==0:
            break

    if state:
        # judge gender
        for word in sen_lst:
            for i in mas_lst:
                if i in word and 'etra' not in word:
                    if sen_lst.index(word)!=0:
                        if gender!=1:
                            gender='null'
                            break
                    else:
                        gender=1
                        break
            for j in fem_lst:
                if j in word:
                    if sen_lst.index(word)!=0:
                        if gender!=0:
                            gender='null'
                            break
                    else:
                        gender=0
                        break

        #judge structure
        for i in range(len(sen_lst)):
            if gender==1:
                if mas_lst[0] in sen_lst[i]:
                    sen_lst[i]=0
                elif mas_lst[1] in sen_lst[i]:
                    sen_lst[i]=1
                elif mas_lst[2] in sen_lst[i]:
                    sen_lst[i]=2
            elif gender==0:
                if fem_lst[0] in sen_lst[i]:
                    sen_lst[i]=3
                elif fem_lst[1] in sen_lst[i]:
                    sen_lst[i]=4
                elif fem_lst[2] in sen_lst[i]:
                    sen_lst[i]=5
            #其他类可设为0，再进行比较（阴：1，3，5、阳：2，4，6）

    #print result
    if state and gender!='null':
        result=sorted(sen_lst)
        if result==sen_lst:
            if result.count(1)==1 or result.count(4)==1 or len(sen_lst)==1:
                print('YES')
            else:
                print('NO')
        else:
            print('NO')
    else:
        print('NO')
    return

#isPetyaLanguage()