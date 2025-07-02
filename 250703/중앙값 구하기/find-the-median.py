a,b,c = map(int,input().split())

if ((a > b) and ( a < c)) or ((a<b) and (a>c)) or ((a>c) and (a<b))  :
    print(a)
    
if ((b > a) and ( b < c)) or ((b<a) and (b>c)) or ((b>c) and (b<a))  :
    print(b)

if ((c > a) and ( c < b)) or ((c<a) and (c>b)) or ((c>b) and (c<a))  :
    print(c)

     
 
 