n = int(input())
s= input()
#ls = s.split()
ls = [s[i:i+1] for i in range(n)]
c=0
 
for i in range(n-2):
        if ls[i]=='x' and ls[i+1]=='x' and ls[i+2]=='x':
            c=c+1
 
print(c)
