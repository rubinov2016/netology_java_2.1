public class Main {
    public static void main(String[] args) {
        int accountCurrentBalance;
        int transferAmount;
        int accountFinalBalance;
        accountCurrentBalance =  2_000_000_000; //(два миллиарда рублей)
        transferAmount = 500_000_000; //(пятьсот миллионов рублей)
        accountFinalBalance = accountCurrentBalance + transferAmount;
        System.out.println(accountFinalBalance);
    }
}
