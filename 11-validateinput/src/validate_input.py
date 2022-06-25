#! /usr/bin/env python
# -*- coding: utf-8 -*-
import re

def validate():

    def name_judge(name,label):
        if name=='':
            print('The {} must be filled in.'.format(label))
        else:
            if len(name)<2:
                print('"{}" is not a valid {}. It is too short.'.format(name,label))
        return

    def zipcode_judge(zipcode):
        if zipcode.isdigit():
            return
        else:
            print("The ZIP code must be numeric.")
            return



    def id_judge(id):
        flag=1
        if len(id)==7:
            for i in range(len(id)):
                if i<2:
                    if id[i]<'A' or id[i]>'Z':
                        flag=0
                elif i==2:
                    if id[i]!="-":
                        flag=0
                else:
                    if id[i]<'0' or id[i]>'9':
                        flag=0
        else:
            flag=0
        if flag==0:
            print('{} is not a valid ID.'.format(id))
        return


    firstname=input("Enter the first name:")
    lastname=input("Enter the last name:")
    zipcode=input("Enter the ZIP code:")
    id=input("Enter an employee ID:")
    keys=["firstname","lastname","zipcode","id"]
    values=[firstname,lastname,zipcode,id]
    information=dict(zip(keys,values))
    for i in information.items():
        if i[0]=="firstname":
            name_judge(i[1],"first name")
        elif i[0]=="lastname":
            name_judge(i[1],"last name")
        elif i[0]=="zipcode":
            zipcode_judge(i[1])
        else:
            id_judge(i[1])


#validate()