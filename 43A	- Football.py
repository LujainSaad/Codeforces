n=int(input())
ls=[]
mx =''
c=0
for i in range(n):
    ls.append(input())
    x = ls.count(ls[i])
    if x>c:
        c=x
        mx=ls[i]
 
 
print(mx)
