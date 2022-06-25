def is_anagram(str1, str2):
    # Complete this function. Remember to delete this line before you test your program
    flag=1
    if len(str1)==len(str2):
        for i in str1:
            if i in str2:
                flag=1
            else:
                flag=0
    else:
        flag=0
    if flag:
        return True
    else:
        return False
    return
