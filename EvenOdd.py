#EvenOdd
import array
s=int(input("Enter the array size: "))
ar=array.array('i',[])
ec=oc=0
print("Enter Elements: ")
for _ in range(s):
    el=int(input())
    ar.append(el)
    if el%2==0:
        ec=ec+1
    elif el%2!=0:
        oc=oc+1
print(f"Even Count: {ec}, Odd Count: {oc}")
