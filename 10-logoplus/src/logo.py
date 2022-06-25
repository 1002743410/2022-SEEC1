def logo_play():
    """write your code here :)"""
    graph = [[i for i in range(20)] for i in range(20)]
    for i in range(20):
        for j in range(20):
            graph[i][j]=" "
    x=0
    y=0
    state="1"
    char=" "
    def move(move_graph,move_x,move_y,direction,step,move_char):
        for i in range(step):
            if direction == "U":
                move_y -= 1
            elif direction == "D":
                move_y += 1
            elif direction == "L":
                move_x -= 1
            else:
                move_x +=1
            if move_char==" ":
                if move_graph==" ":
                    move_graph[move_y][move_x]=move_char
            else:
                move_graph[move_y][move_x] = move_char
        return move_x,move_y

    def cross(cross_graph,cross_x,cross_y,cross_step,cross_char):
        cross_graph[cross_y][cross_x]=cross_char
        move(cross_graph,cross_x,cross_y,"U",cross_step,cross_char)
        move(cross_graph,cross_x,cross_y,"D",cross_step,cross_char)
        move(cross_graph,cross_x,cross_y,"L",cross_step,cross_char)
        move(cross_graph, cross_x, cross_y, "R", cross_step, cross_char)
        return


    def rect(rect_graph,rect_x,rect_y,step1,step2,rect_char):
        rect_x,rect_y=move(rect_graph,rect_x-1,rect_y,"R",step1,rect_char)
        rect_x,rect_y=move(rect_graph,rect_x,rect_y-1,"D",step2,rect_char)
        rect_x,rect_y=move(rect_graph,rect_x,rect_y,"L",step1-1,rect_char)
        move(rect_graph,rect_x,rect_y,"U",step2-1,rect_char)
        return

    def rect_f(rect_f_graph,rect_f_x,rect_f_y,step1,step2,rect_f_char):
        for i in range(step2, 0, -1):
            rect(rect_f_graph, rect_f_x, rect_f_y, step1, i, rect_f_char)

    def mapping(mapping_graph,index_x,index_y,mapping_instruct,mapping_state,mapping_char):
        mapping_print=1
        oldmapping_graph = [[i for i in range(20)] for i in range(20)]
        if mapping_state=="0":
            for i in range(20):
                for j in range(20):
                    oldmapping_graph[i][j]=mapping_graph[i][j]
        if mapping_instruct[0] == "move":
            index_x,index_y= move(mapping_graph,index_x,index_y,mapping_instruct[1], int(mapping_instruct[2]), mapping_char)
            if index_x<0 or index_y<0 or index_x>9 or index_y>9:
                mapping_print="0"
        elif mapping_instruct[0] == "cross":
            if (index_x-int(mapping_instruct[1]))<0 or (index_x+int(mapping_instruct[1]))>9 or (index_y-int(mapping_instruct[1]))<0 or (index_y+int(mapping_instruct[1]))>9:
                mapping_print="0"
            cross(mapping_graph,index_x,index_y, int(mapping_instruct[1]), mapping_char)
        else:
            if (index_x+int(mapping_instruct[1]))>10 or (index_y+int(mapping_instruct[2]))>10:
                mapping_print="0"
            if mapping_instruct[0] == "rect":
                rect(mapping_graph, index_x, index_y, int(mapping_instruct[1]), int(mapping_instruct[2]), mapping_char)
            else:
                rect_f(mapping_graph, index_x, index_y, int(mapping_instruct[1]), int(mapping_instruct[2]), mapping_char)
        if mapping_state=="1":
            return mapping_graph,index_x,index_y,mapping_print
        else:
            return oldmapping_graph,index_x,index_y,mapping_print


    while True:
        instruct=input().split()
        if instruct[0]=="end":
            break
        elif instruct[0]=="pen_up":
            state="0"
        elif instruct[0]=="pen_down":
            state="1"
        else:
            if instruct[0]=="cross":
                if len(instruct)==3:
                    char=instruct[2]
            else:
                if len(instruct)==4:
                    char=instruct[3]
            graph,x,y,print_state=mapping(graph,x,y,instruct,state,char)
    if print_state=="0":
        print("Error!")
    else:
        for i in range(10):
            for j in range(10):
                print(graph[i][j], end="")
            print("\n", end="")

#logo_play()


