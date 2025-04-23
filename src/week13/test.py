class Person:
    def __init__(self, name, age):
        self.name = name
        self.age = age
        self.alive = True

    def myfunc(self):
        print("Hello my name is " + self.name)
        self.wtfPython=True

    def __str__(self):
        temp= self.name+": "+str(self.age)+" alive: "+str(self.alive)
        temp+="\nwtf python? "+str(self.wtfPython)
        return temp

class Student(Person):
    def __init__(self, fname, lname, year):
        super().__init__(fname, lname)
        self.graduationyear = year

    def welcome(self):
        print("Welcome", self.name, self.age, "to the class of", self.graduationyear)

p1 = Person("John", 36)
p1.myfunc()
print(p1)
print(p1.wtfPython)
s1 = Student("bob","jones",2030)
s1.myfunc()
s1.welcome()
print(s1)