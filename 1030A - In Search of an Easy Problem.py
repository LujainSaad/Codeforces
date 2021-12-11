n = int(input())
s=list(map(int,input().split()))
 
if s.count(1)>0:
    print("HARD")
else:
    print("EASY")
