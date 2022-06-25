#! /usr/bin/env python
# -*- coding: utf-8 -*-


def process(param):
	param=list(map(lambda x: x.title(), param))
	param_change=list()
	for i in param:
		if len(i)!=1:
			param_change.append(i)
	char=",".join(str(i) for i in param_change)
	print(char)
	return char
