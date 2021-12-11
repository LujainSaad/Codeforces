n =int(input())
s=list(map(int,input().split()))
 
s.sort(reverse = True)
c=0
b=0
 
for i in s:
    if b <= sum(s)//2:
        c=c+1
        b=b+i
    else:
        break
    
print(c) 
