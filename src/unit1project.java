import java.util.Scanner;
public class unit1project {
    public static void main(String[] args){
    Scanner s= new Scanner(System.in);

    double totalBill;
    double bill;
    double tipPercentage;
    double totalTip;
    double tipPerPerson;
    double totalPerPerson;
    int numberOfPeople;

    System.out.println("Please input the bill amount.");
    bill = s.nextDouble();
    System.out.println("Please input the tip percentage as a whole number.");
    tipPercentage = s.nextDouble();
    tipPercentage = tipPercentage/100;
    System.out.println("Please input the number the people paying.");
    numberOfPeople = s.nextInt();
    System.out.println(numberOfPeople);
    totalTip = bill * tipPercentage;
    totalTip = Math.round(totalTip*100)/100;
    tipPerPerson = totalTip/numberOfPeople;
    totalBill = totalTip+bill;
    totalPerPerson = totalBill/numberOfPeople;
    totalPerPerson = Math.round(totalPerPerson*100)/100;

        System.out.println("Your total bill is $" + totalBill);
        System.out.println("Your total tip is $" + totalTip);
        System.out.println("Your tip per person is $" + tipPerPerson);
        if ((totalPerPerson % 0.1)==0) {
        }
        else {System.out.println("Your total per person is $" + totalPerPerson + "0");


    }}}
