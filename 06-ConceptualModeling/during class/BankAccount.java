
class BankAccount{

    private int acccountNumber;
    private String owner;
    private float balance = 0;

    public float getBalance(){
        return this.balance;
    }

    public float displayBalance(){
        return getBalance();
    }

    public void addMoney(float amount){
        this.balance += amount;
}
    public void withdrawMoney(float amount){
        if(amount > 500){
            System.out.println("Invalid operation. You can't withdraw so much money.");
        }
        else if(amount > this.balance){
            System.out.println("Invalid operation. You don't have enough money. Account balance: "+getBalance());
        }
        else{
            this.balance -= amount;
        }

}

    public static void main(String[] args){
        BankAccount b = new BankAccount();
        b.addMoney(500);
        System.out.println(b.displayBalance());
        b.withdrawMoney(200);
        System.out.println(b.displayBalance());
        b.withdrawMoney(500);
        System.out.println(b.displayBalance());
        b.addMoney(1000);
        System.out.println(b.displayBalance());
        b.withdrawMoney(700);
        System.out.println(b.displayBalance());
        
}


}