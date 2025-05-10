rows=int(input("Enter the number of rows: "))
cols=int(input("Enter the number of columns: "))
num=int(input("Enter the tree number:"))

if num <= cols or num%rows==0  or num%cols==1:
    print("M")

else:
    print("S")

