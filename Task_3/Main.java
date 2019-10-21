package by.epam.Unit04;
//Счета. Клиент может иметь несколько счетов в банке.
// Учитывать возможность блокировки/разблокировки счета.
// Реализовать поиск и сортировку счетов. Вычисление общей суммы по счетам.
// Вычисление суммы по всем счетам, имеющим положительный и отрицательный балансы отдельно.

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Account account1 = new Account("444000444000",false,1000);
        Account account2 = new Account("222000222000",false,2000);
        Account account3 = new Account("555000555000",false,-100);
        Account account4 = new Account("111000111000",false,-200);
        List<Account> accountList = new ArrayList<>();
        accountList.add(account1);
        accountList.add(account2);
        accountList.add(account3);
        accountList.add(account4);

        Client client = new Client(accountList,"Иванов");
        ClientLogic ClientLogic = new ClientLogic();

        System.out.println("\nДо сортировки: ");
        for (int i = 0; i < 4; i++) {
            System.out.println(accountList.get(i));
        }

        client = ClientLogic.sortOnMoneyAmount(client);
        System.out.println("\nПосле сортировки: ");
        for (int i = 0; i < 4; i++) {
            System.out.println(accountList.get(i));
        }

        int positiveAmount = ClientLogic.totalPositiveAmount(client);
        int negativeAmount = ClientLogic.totalNegativeAmount(client);
        int invoiceAmount = ClientLogic.totalInvoiceAmount(client);
        Account account = ClientLogic.findAccount(client,"555000555000");

        System.out.println("\nпоиск по номему счета:\n" + account);
        System.out.println("\nобщая сумма по всем счетам:" + invoiceAmount);
        System.out.println("сумма по всем положительным счетам:" + positiveAmount);
        System.out.println("сумма по всем отрицательным счетам:" + negativeAmount);
    }
}