# Mr.Kongchan
# SimpleCalculator

class SimpleCalculator:
    @staticmethod
    def add(first_number, second_number):
        return first_number+second_number
    @staticmethod
    def subtract(first_number, second_number):
        return first_number-second_number
    @staticmethod
    def multiply(first_number, second_number):
        return first_number*second_number
    @staticmethod
    def divide(first_number, second_number):
        return first_number/second_number

calculator = SimpleCalculator()

print(calculator.add(4, 5))
print(calculator.subtract(4, 5))
print(calculator.multiply(4, 5))
print(calculator.divide(4, 5))
print(calculator.divide(4, 5))
        
        