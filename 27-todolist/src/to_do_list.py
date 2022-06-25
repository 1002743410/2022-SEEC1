"""write your code in following methods"""
file_path = './tasks.txt'

with open(file_path, 'a') as f:
    f.write('')

def to_do():

    #增加待办事项
    def todo_a(file,a_dict):
        for key,value in a_dict.items():
            s=value+key
            with open(file,'a') as f:
                f.writelines([s,'\r'])
        return

    #删除待办事项
    def todo_d(file,lst):
        with open(file, 'r') as f:
            lines = f.readlines()
        for i in range(len(lines)):
            for item in lst:
                if item in lines[i]:
                    lines[i] = ''
        lines = [x for x in lines if x != '']
        with open(file, 'w') as f:
            f.writelines(lines)
        return

    #修改待办事项为已完成
    def todo_c(file,lst):
        with open(file, 'r') as f:
            lines = f.readlines()
        for i in range(len(lines)):
            for item in lst:
                if item in lines[i]:
                    lines[i]='completed:'+lines[i][5:]
        with open(file, 'w') as f:
            f.writelines(lines)
        return

    #查询待办事项
    def todo_f(file,state):
        with open(file, 'r') as f:
            lines = f.readlines()
        for line in lines:
            if state in line:
                print(line,end='')
        return

    #查询所有待办事项
    def todo_all(file):
        with open(file, 'r') as f:
            lines = f.readlines()
        for line in lines:
            print(line,end='')
        return

    while True:
        instruct=input()
        if instruct=='todo -quit':
            break
        elif instruct=='todo -all':
            todo_all(file_path)
        elif 'todo -a' in instruct:
            instruct=instruct[8:]
            item=instruct.split('"')
            item=[x for x in item if x!='' and x!=' ']
            item_dict=dict(zip(item,['todo:']*len(item)))
            todo_a(file_path,item_dict)
        elif 'todo -d' in instruct:
            instruct=instruct[8:]
            item = instruct.split('"')
            item = [x for x in item if x != '' and x != ' ']
            todo_d(file_path,item)
        elif 'todo -c' in instruct:
            instruct=instruct[8:]
            item = instruct.split('"')
            item = [x for x in item if x != '' and x != ' ']
            todo_c(file_path,item)
        elif 'todo -f' in instruct:
            instruct=instruct[8:]
            todo_f(file_path,instruct)

    return

#to_do()