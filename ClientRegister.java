/*
* (c) Viope Solutions Oy
* Example solution for:
* "Client register"
*/
public class ClientRegister {
    public static void main(String args[]) {
        CashClient client1 = new CashClient("Lisa", "101070-1111");
        AccountClient client2 = new AccountClient("Benny", "101070-1111");
        AccountClient client3 = new AccountClient("Barney", "040474-1571", "Someroad 3");
        Client client4 = new Client("Client", "111170-1111", "Road 4");
        client1.payCash(70);
        client2.deposit(100);
        client3.deposit(500);
        client2.withdraw(20);
        System.out.println(client2);
        System.out.println(client3);
    }
}

class Client {
    public String Name;
    public String ID;
    public String Address;

    public Client(String name, String id) {
        this.Name = name;
        this.ID = id;
    }

    public Client(String name, String id, String address) {
        this.Name = name;
        this.ID = id;
        this.Address = address;
    }
}

class CashClient extends Client {
    public CashClient(String name, String id) {
        super(name, id);
    }

    public void payCash(int amount) {
        System.out.println(this.Name + "(" + this.ID + "): Amount paid " + amount + " euros.");
    }
}

class AccountClient extends Client {
    private double balance;

    public AccountClient(String name, String id) {
        super(name, id);
    }

    public AccountClient(String name, String id, String address) {
        super(name, id, address);
    }

    public void deposit(int amount) {
        balance += amount;
    }

    public void withdraw(int amount) {
        balance -= amount;
    }
    
    public String toString() {
        return this.Name + "(" + this.ID + "): " + balance;
    }
}