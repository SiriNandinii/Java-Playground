package oopsdemo2;

/**
* Author : sirin
* Date : Jul 7, 2026
* Time : 4:55:11 PM
* Email : sirinandini.a@gmail.com
*/

public class HierarchicalInheritanceDemo2 {

    public static void main(String[] args) {

        LifeInsurance life = new LifeInsurance();

        life.setPolicyDetails("Ravi Kumar", 12000);
        life.setLifeInsuranceDetails(20);

        System.out.println("------ Life Insurance ------");

        life.displayLifeInsuranceDetails();
    }
}