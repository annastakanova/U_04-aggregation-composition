package by.epam.Unit04;

import java.util.Collections;
import java.util.Comparator;

public class ClientLogic {
    public int totalInvoiceAmount(Client client) {
        int sum = 0;
        for (Account account : client.getAccountList()) {
            sum += account.getMoney();
        }
        return sum;
    }

    public int totalPositiveAmount(Client client) {
        int positiveSum = 0;
        for (Account account : client.getAccountList()) {
            if (account.getMoney() > 0&&!account.isBlock()) {
                positiveSum += account.getMoney();
            }
        }
        return positiveSum;
    }

    public int totalNegativeAmount(Client client) {
        int negativeSum = 0;
        for (Account account : client.getAccountList()) {
            if (account.getMoney() < 0&&!account.isBlock()) {
                negativeSum += account.getMoney();
            }
        }
        return negativeSum;
    }

    public Account findAccount(Client client, String billNumber) {
        for (Account bill : client.getAccountList()) {
            if (bill.getAccountNumber().equals(billNumber)) {
                return bill;
            }
        }
        return null;
    }


    public Client sortOnMoneyAmount(Client client) {
        Collections.sort(client.getAccountList(), Comparator.comparing(Account::getAccountNumber));
        return client;
    }
}
