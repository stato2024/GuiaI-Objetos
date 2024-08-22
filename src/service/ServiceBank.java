package service;

import model.BankAccount;


public class ServiceBank {

    public ServiceBank() {
    }

    public BankAccount createAccount (Integer id, String name, Double balance){
        return new BankAccount(id,name,balance);
    }

    public void credito (BankAccount account,Double monto){
       account.setBalance(monto + account.getBalance());
       System.out.println("Se realizo un deposito, el balance es de " + account.getBalance() );
    }

    public void debito (BankAccount account, Double monto){
        if (monto <= account.getBalance()){
            account.setBalance(account.getBalance()-monto);
            System.out.println("Se realizo una compra, el balance es de " + account.getBalance() );
        }else {
            System.out.println("No tiene dinero en cuenta para esa sustraccion");
        }
    }

    public void ImprimirAccount (BankAccount account){
        System.out.println("Cuenta bancaria[id :" + account.getId() + " nombre :" + account.getName() + " Balance :" + account.getBalance()  + "]");
    }
}
