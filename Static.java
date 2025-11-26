class Student {
    
    static String college = "GLA";
    int rollNo;
    String name;

    Student(int rollNo, String name) 
    {
        this.rollNo = rollNo;
        this.name = name;
    }

    void display() 
    {
        System.out.println("Name: " + name + ", Roll No: " + rollNo + ", College: " + college);
    }
    public static void main(String[] args) 
    {
       Student s1 = new Student(41, "Shivam");
        s1.display();       
    }
}
