x, y = map(int,input().split())
s=list(map(int,input().split()))
c=0
 
for i in s:
    if i<= y:
        c=c+1
    else:
        c=c+2
        
print(c)
