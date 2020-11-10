a=5
b=0
try:
    print(a/b)
    k=int(input("Enter a no: "))
    print(k)
except ZeroDivisionError as e:
    print("Hey you can't divide by zero error is ",e)
except ValueError as e:
    print("Only integers are allowed in the division operation as error is  ",e)
except exception as e:
    printf("Something went wrong")
finally:
    print("Good bye")
    

    
