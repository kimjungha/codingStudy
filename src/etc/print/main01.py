class Dog:
    def __init__(self,name):
        self.name = name
    def bark(self):
        print(f"{self.name}가 멍멍!")

dog1 = Dog("초롱이")
dog1.bark()