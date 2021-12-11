s= input()
ls = [s[i:i+1] for i in range(len(s))]
l=0
u=0
 
for x in ls:
    if x==x.lower():
        l=l+1
    else:
        u=u+1
 
if l>=u:
    print(s.lower())
elif u>l:
    print(s.upper())
