class Encapsulation{
    public static void main(String[] args) {
        //Class object creation
        EmployeeE emp = new EmployeeE();
        System.out.println("--- Employee Info ---");
        emp.setEmplID(1);
        emp.setName("Shruti");
        System.out.print("ID : "+emp.getEmplId()+"  ");
        System.out.println("Name : "+emp.getName());

        emp.setEmplID(2);
        emp.setName("Swati");
        System.out.print("ID : "+emp.getEmplId()+"  ");
        System.out.println("Name : "+emp.getName());
    }
}
