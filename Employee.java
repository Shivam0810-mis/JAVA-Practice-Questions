class Employee
{
    private static int employeecount=0;
    private String name;
    private int id;
    public Employee(String name)
    {
        this.name=name;
        this.id=++employeecount;
    }
    public void printDetails()
    {
        System.out.println("Employee ID:"+id);
        System.out.println("Name:"+name);
    }
    public static void printEmployeecount()
    {
        System.out.println("Total Employees:"+employeecount);
    }
    public static void main(String []args)
    {
        Employee emp1=new Employee("Sumit");
        Employee emp2=new Employee("Shubh");
        Employee emp3=new Employee("Saksham");
        emp1.printDetails();
        System.out.println("_____");
        emp2.printDetails();
        System.out.println("_____");
        emp3.printDetails();
        System.out.println("_____");
        Employee.printEmployeecount();
    }
}