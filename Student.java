class Student {
String name;
int age;

Student() {
name = "Aditya";
age = 19;
}

Student(String n, int a) {
name = n;
age = a;
}

void display() {
System.out.println("Name: " + name);
System.out.println("Age: " + age);
}

void display(String course) {
System.out.println("Name: " + name);
System.out.println("Age: " + age);
System.out.println("Course: " + course);
}

static void collegeName() {
System.out.println("College Name: Sheth L.U.J & S.I.R M.V. College Of Science & Commerce");
}

public static void main(String[] args) {
Student s1 = new Student();
Student s2 = new Student("Ramjoth", 19);

collegeName();

s1.display();
System.out.println();

s2.display("Computer Science");
}
}
