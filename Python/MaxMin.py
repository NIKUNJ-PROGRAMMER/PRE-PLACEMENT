#MaxMin
import array
s=int(input("Enter size of array: "))
ar=array.array('i',[])
print("Enter elements: ")
for _ in range(s):
    el=int(input())
    ar.append(el)
#Built-in function
maxv=max(ar)
minv=min(ar)

print(f"Output using Built-in function- max: {maxv}, min: {minv}")

#Manual function
man_max=ar[0]
man_min=ar[0]

for n in ar:
    if n>man_max:
        man_max=n
    if n<man_min:
        man_min=n

print(f"Output using Manual Function- max: {man_max}, min: {man_min}")
