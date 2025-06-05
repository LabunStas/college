package org.college.practise.task1.task8;

public interface BankAbstractVisitor {
    String visitUser(User user);
    String visitAdministrator(Administrator admin);
    String visitBankAccount(BankAccount account);
    String visitInternalAccount(InternalAccount account);
}