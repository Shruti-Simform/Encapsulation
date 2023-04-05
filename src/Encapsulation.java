class Encapsulation {
    public static void main(String[] args) {
        EmployeeE emp = new EmployeeE();
        System.out.println("--- Employee Info ---");
        emp.setEmplID(1);
        emp.setName("Shruti");
        System.out.println("ID : " + emp.getEmplId());
        System.out.println("Name : " + emp.getName());
    }
}
