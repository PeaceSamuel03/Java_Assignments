//student number: 121376141
//student name: Peace Samuel
//Program2: Beauty Salon

import java.util.*;

public class Salon{
    public static void main(String[] args){
        ///test the classes///
        Customer customer1 = new Customer("Peace");
        customer1.setMember(true);
        customer1.setMemberType("Premium");
        System.out.println(customer1.toString());
        Date date = new Date();
        Visit v1 = new Visit(customer1, date);
        v1.setProductExpense(500);
        v1.setServiceExpense(500);
        System.out.println("Service expense(with discount incl.): "+v1.getServiceExpense());
        System.out.println("Product expense(with discount incl.): "+v1.getProductExpense());
        System.out.println("Total expense(with discount incl.): "+v1.getTotalExpense());
        System.out.println(v1.toString());
    }
}

public class Customer {
    //(instance variables)
    String name; //name of customer
    Boolean member; //member or not
    String memberType; //membership type
//constructor
    public Customer(String name){
        this.name = name;
        this.member = false;
        this.memberType = "";
    }
//getters and setters
    public String getName(){
        return name;
    }

    public boolean isMember(){
        return member;
    }

    public void setMember(boolean member){
        this.member = member;
    }

    public String getMemberType(){
        return memberType;
    }

    public void setMemberType(String type){
        this.memberType = type;
    }

    public String toString(){
        String string = "";
        string = "Name: "+name+", Member: "+member+", Membership: "+ memberType;
        return string; 
    }
}

public class Visit{
    //(instance variables)
    Customer customer; //name,mem,mem_type
    Date date;
    double serviceExpense;
    double productExpense;

//constructor
    public Visit(Customer customer, Date date){
        this.customer = customer;
        this.date = date;
        this.serviceExpense = 0;
        this.productExpense = 0;
        //service expense and product expense set later in methods
        //initialize them to zero
    }

    public String getName(){
        return customer.getName();
    }

    public double getServiceExpense(){
        //create DiscountRate instance to find service expense with discount included
        DiscountRate discount = new DiscountRate();
        double rate = discount.getServiceDiscountRate(customer.getMemberType());
        double discount2, total;
        discount2 = rate * serviceExpense;
        total = serviceExpense - discount2;
        return total;
    }

    public void setServiceExpense(double ex){
        this.serviceExpense = ex;
    }

    public double getProductExpense(){
        //create DiscountRate instance to find product expense with the discount included
        DiscountRate discount = new DiscountRate();
        double rate = discount.getProductDiscountRate(customer.getMemberType());
        double discount1, total;
        discount1 = rate * productExpense;
        total = productExpense - discount1;
        return total;
    }

    public void setProductExpense(double ex){
        this.productExpense = ex;
    }

    public double getTotalExpense(){
        //use previous methods to find total expense
        double total_expense;
        total_expense = this.getProductExpense() + this.getServiceExpense();
        return total_expense;
    }

    public String toString(){
        String string = "";
        string = "Customer:" + customer.getName() + ", Total expense:"+ this.getTotalExpense()+ ", Date: "+date;
        return string;
    }
}

public class DiscountRate{
    //(instance variables)
    double serviceDiscountPremium;
    double serviceDiscountGold;
    double serviceDiscountSilver;
    double productDiscountPremium;
    double productDiscountGold;
    double productDiscountSilver;
//constructor
    public DiscountRate(){
        this.serviceDiscountPremium = 0.2;
        this.serviceDiscountGold = 0.15;
        this.serviceDiscountSilver = 0.1;
        this.productDiscountPremium = 0.1;
        this.productDiscountGold = 0.1;
        this.productDiscountSilver = 0.1;
    }

    public double getServiceDiscountRate(String type){
        double s_discount = 0;
        if (type == "Premium"){
            s_discount = serviceDiscountPremium;
        }
        if (type == "Gold"){
            s_discount = serviceDiscountGold;
        }
        if (type == "Silver"){
            s_discount = serviceDiscountSilver;
        }
        return s_discount;
    }

    public double getProductDiscountRate(String type){
        double p_discount= 0;
        if (type == "Premium"){
            p_discount = productDiscountPremium;
        }
        if (type == "Gold"){
            p_discount = productDiscountGold;
        }
        if (type == "Silver"){
            p_discount = productDiscountSilver;
        }
        return p_discount;
    }

}

