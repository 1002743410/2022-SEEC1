#! /usr/bin/env python
# -*- coding: utf-8 -*-

import csv

def getcommand(file):

    def show(show_file):
        newline1 = []
        newline2 = []
        salary_sum = 0
        count = 0
        length1,length2,length3=0,0,0
        with open(show_file) as f:
            while True:
                line = f.readline()
                if len(line) == 0:
                    break
                temp = line.strip().split(',')
                newline1.append(temp)

            for item in newline1:
                l1,l2,l3=len(item[0]),len(item[1]),len(item[2])
                if l1>=length1:
                    length1=l1
                if l2>=length2:
                    length2=l2
                if l3>=length3:
                    length3=l3

            newline1.sort(key=lambda x: int(x[2]))
            print('Name'.ljust(length1), 'Title'.ljust(length2), 'Salary'.ljust(length3))
            for item in newline1:
                salary_sum += int(item[2])
                count += 1
                item[2] = "%.2f" % eval(item[2])
                newline2.append(item[0].ljust(length1))
                newline2.append(item[1].ljust(length2))
                newline2.append(item[2].ljust(length3))
                line = " ".join(newline2)
                print(line)
                newline2 = []
            print('AVG:{:.2f}'.format(salary_sum / count))
        return

    show_state = 0
    insert_state = 0
    data = []
    n = int(input())
    i = 1
    while i <= n:
        write_line = input()
        if write_line == 'SHOWALL':
            show_state = 1
            break
        else:
            if i == 1:
                insert_state = 1
            write_line = write_line[7:].split(',')
            data.append(write_line)
        i += 1

    with open(file, mode='a', newline='', encoding='utf8') as csvfile:
        csv_write = csv.writer(csvfile)
        if insert_state == 1:
            csv_write.writerow('')
        for item in data:
            csv_write.writerow(item)

    if show_state == 1:
        show(file)

