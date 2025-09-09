n = int(input( ))

arr = list(map(int,input().split()))

arr_new = [elem*elem for elem in arr]

for i in range(n): 
    print(arr_new[i],end=" ")
