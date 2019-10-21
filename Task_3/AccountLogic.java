package by.epam.Unit04;

public class AccountLogic {
    public Boolean blockAccount(Account account) {
        if (!account.isBlock()) {
            account.setBlock(true);
        }
        return true;
    }
}
