n = int(input())
s=list(map(int,input().split()))
z=s.copy()
c=1
 
for x in s:
    z[x-1] = c 
    c=c+1
        
for y in z:
    print(y, end=' ')
