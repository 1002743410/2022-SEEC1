"""write your code in method solve"""
def solve():
    n, m = map(int, input().split(' '))  # n栋房子，m件事情
    list_a = list(map(int, input().split()))  # 创建list
    count = list_a[0] - 1
    for i in range(1, m):
        if list_a[i - 1] > list_a[i]:
            count += n - (list_a[i - 1] - list_a[i])
        else:
            count += list_a[i] - list_a[i - 1]
    print(count)
    return

#solve()