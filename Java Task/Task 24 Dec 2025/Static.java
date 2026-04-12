class Student {

    int rollNumber;

    static String collegeName = "ABC University";

    Student(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    void display() {
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("College Name: " + collegeName);
        System.out.println();
    }

    public static void main(String[] args) {

        Student s1 = new Student(101);
        Student s2 = new Student(102);

        s1.display();
        s2.display();

        Student.collegeName = "XYZ University";

        s1.display();
        s2.display();
    }
}
