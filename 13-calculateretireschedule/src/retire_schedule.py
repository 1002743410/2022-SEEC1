#! /usr/bin/env python
# -*- coding: utf-8 -*-


def calculate():
	age=int(input("-> What is your current age?\n<-"))
	retire_age=int(input("-> At what age would you like to retire?\n<-"))
	year=2022
	if age<=retire_age:
		retire_year=year+retire_age-age
		print("You have {} years left until you can retire.".format(retire_age - age))

	else:
		retire_year=year-(age-retire_age)
		print("You have 0 years left until you can retire.")
	print("It's {}, so you can retire in {}.".format(year, retire_year))
	pass

#calculate()