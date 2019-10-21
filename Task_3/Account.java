package by.epam.Unit04;
import java.util.Objects;

public class Account {

    private String accountNumber;
    private boolean block;
    private int money;

    public Account(String accountNumber, boolean block, int money) {
        this.accountNumber = accountNumber;
        this.block = block;
        this.money = money;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public boolean isBlock() {
        return block;
    }

    public void setBlock(boolean block) {
        this.block = block;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Account account = (Account) o;
        return block == account.block &&
                money == account.money &&
                accountNumber.equals(account.accountNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountNumber, block, money);
    }

    @Override
    public String toString() {
        return "Номер счета: " + accountNumber + ", блокировка: " + block + ", сумма на счету: " + money;
    }
}
