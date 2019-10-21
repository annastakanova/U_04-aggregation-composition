package by.epam.Unit04;

import java.util.List;
import java.util.Objects;

public class Client {
    private List<Account> accountList;
    private String clientName;

    public Client(List<Account> accountList, String clientName) {
        this.accountList = accountList;
        this.clientName = clientName;
    }

    public List<Account> getAccountList() {
        return accountList;
    }

    public String getClientName() {
        return clientName;
    }

    public void setAccountList(List<Account> accountList) {
        this.accountList = accountList;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Client client = (Client) o;
        return Objects.equals(accountList, client.accountList) &&
                Objects.equals(clientName, client.clientName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountList, clientName);
    }

    @Override
    public String toString() {
        return "Client{" +
                "accountList=" + accountList +
                ", clientName='" + clientName + '\'' +
                '}';
    }
}
