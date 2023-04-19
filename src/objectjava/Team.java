package objectjava;



public class Team {

public static void main(String[] args)

 {
    EmployeeDetails emp1 = new EmployeeDetails(); //initialising in another class//
    emp1.empName = "abed";
    emp1.empId = 123;
    emp1.empLoc = "hyd";
    emp1.display();
    OrderDetails emp2 = new OrderDetails("ram-ya",34455); //parameterized constructor//
    emp2.orderDisplay();
    CompanyDetails emp3 = new CompanyDetails(); //default constructor//
    emp3.companyDisplay();
    PaymentDetails p1 = new PaymentDetails();
    p1.setType("Rama");
    p1.setCardNum(2344);
    p1.paymentDisplay();

}




}

