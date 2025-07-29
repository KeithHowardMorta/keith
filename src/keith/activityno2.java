# Function to check the number
def check_number(number):
    if number == 0:
        return "Inputted number is Zero"
    elif number % 2 == 0:
        return "Inputted number is even"
    else:
        return "Inputted number is odd"

# Main program
try:
    user_input = int(input("Enter a number: "))
    result = check_number(user_input)
    print(result)
except ValueError:
    print("Please enter a valid integer.")
