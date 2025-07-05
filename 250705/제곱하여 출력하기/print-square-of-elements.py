n = int(input()) 

arr = list(map(int, input().split()))

arr2 = [i * i for i in arr] 

for i in range(n): 
    print(arr2[i], end=' ')
