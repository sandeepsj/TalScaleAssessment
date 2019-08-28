"""
Problem statement: You are given a maze with N cells. Each cell may have multiple entry points but not more than one exit (ie. entry/exit points are unidirectional doors like valves). The cells are named with an integer value from 0 to N-1. You need to find the following : 

find Maximum number of entry points (incoming edges) for any cell in the maze 

Note: Aim for O(N) solution. 

INPUT FORMAT - First line has the number of cells N 

Second line has list of N values of the edge[] array. edge[i] contains the cell number that can be reached from of cell ‘i’ in one step. edge[i] is -1 if the ‘i’th cell doesn’t have an exit. 

OUTPUT FORMAT - Find max weighted node
"""
n = int(input())
edge = list(map(int, input().split(",")))
def solution(edge,n):
    weight = [0]*n
    for i in range(n):
        if(edge[i]!=-1):
            weight[edge[i]-1]+=i
    return weight.index(max(weight))
print(solution(edge,n))
