package Part5;

public class PaymentTerminal {
    private double money;  // amount of cash
    private int affordableMeals; // number of sold affordable meals
    private int heartyMeals;  // number of sold hearty meals

    public PaymentTerminal() {
        this.money = 1000;
        this.affordableMeals = 0; 
        this.heartyMeals = 0;
    }

    public double eatAffordably(double payment) {
        if (payment >= 2.50) {
        	money += 2.50; 
        	affordableMeals += 1;
        	return payment - 2.50;
        }else {
        	return payment;
        }
    }
    
    public boolean eatAffordably(PaymentCard card) {
    	if (card.balance() >= 2.5){
        	money += 2.50; 
        	affordableMeals += 1;
        	card.takeMoney(2.5);
        	return true;
        }else {
        	return false;
        }
    }

    public double eatHeartily(double payment) {
        if (payment >= 4.30) {
        	money += 4.30; 
        	heartyMeals += 1;
        	return payment - 4.30;
        }else {
        	return payment;
        }
    }

    public boolean eatHeartily(PaymentCard card) {
    	if (card.balance() >= 4.3){
        	money += 4.30; 
        	affordableMeals += 1;
        	card.takeMoney(4.3);
        	return true;
        }else {
        	return false;
        }
    }
    
    public void addMoneyToCard(PaymentCard card, double sum) {
    	if (money >= sum) {
    		card.addMoney(sum);
    		money -= sum;
		}
    }
    
    public String toString() {
        return "money: " + money + ", number of sold afforable meals: " + affordableMeals + ", number of sold hearty meals: " + heartyMeals;
    }
}