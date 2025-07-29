# Step 1: Get user input
number = float(input("Enter a number: "))

# Step 2: Check the value of the number
if number > 0:
    print(f"{number} is a positive number")
elif number < 0:
    print(f"{number} is a negative number")
else:
    print("Inputted number Zero")

