package eu.chrost.day5.unittests;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

class BankAccountTest {
    private static final String SOME_ACCOUNT_NUMBER = "0123";
    private static final int SOME_INITIAL_BALANCE = 3000;
    private static final int SOME_ADDITIONAL_AMOUNT = 500;

    private BankAccount bankAccountWithInitialBalance =
            new BankAccount(SOME_ACCOUNT_NUMBER, SOME_INITIAL_BALANCE);

    @Test
    void givenAccountIsCreatedWithoutBalance_whenGetBalance_thenBalanceShouldBeZero() {
        //given
        var bankAccount = new BankAccount(SOME_ACCOUNT_NUMBER);

        //when
        var balance = bankAccount.getBalance();

        //then
        assertThat(balance).isZero();
    }

    @Test
    void givenAccountIsCreatedWithBalance_whenGetBalance_thenBalanceShouldBeTheSameAsProvided() {
        //when
        var balance = bankAccountWithInitialBalance.getBalance();

        //then
        assertThat(balance).isEqualTo(SOME_INITIAL_BALANCE);
    }

    //Napisac nastepujace testy:
    //1) zweryfikowac czy numer konta przekazany przy jego tworzeniu jest taki sam jak odczytany potem z niego

    @Test
    void givenAccountNumber_whenAccountCreation_thenReadAccountNumber() {
        //when
        var accountNumber = bankAccountWithInitialBalance.getAccountNumber();
        //then
        assertThat(accountNumber).isEqualTo(SOME_ACCOUNT_NUMBER);
    }

    //2) zweryfikowac czy dziala wplacanie na konto
    @Test
    void givenBankAccount_whenAccountDeposit_thenBankAccountBalance() {
        //when
        bankAccountWithInitialBalance.deposit(SOME_ADDITIONAL_AMOUNT);

        //then
        assertThat(bankAccountWithInitialBalance.getBalance())
                .isEqualTo(SOME_INITIAL_BALANCE + SOME_ADDITIONAL_AMOUNT);
    }

    //3) zweryfikowac czy dziala wyplacanie z konta (dwa przypadki - wyplacana suma mniejsza i wieksza od salda)
    @Test
    void givenBankAccount_whenAccountWithdraw_thenBankAccountBalance() {
        //when
        bankAccountWithInitialBalance.withdraw(SOME_ADDITIONAL_AMOUNT);

        //then
        assertThat(bankAccountWithInitialBalance.getBalance())
                .isEqualTo(SOME_INITIAL_BALANCE - SOME_ADDITIONAL_AMOUNT);
    }

    @Test
    void givenBankAccount_whenAccountWithdraw_thenNegativeBankAccountBalance() {
        //when
        bankAccountWithInitialBalance.withdraw(SOME_INITIAL_BALANCE + SOME_ADDITIONAL_AMOUNT);
        //then
        assertThat(bankAccountWithInitialBalance.getBalance()).isEqualTo( SOME_INITIAL_BALANCE);
    }

    //4*) zweryfikowac czy dziala zabezpieczenie przed zalozeniem konta z ujemnym stanem
    @Test
    void givenNegativeBalance_whenAccountCreation_thenBankAccountError() {
        //when / then
        assertThrows(IllegalArgumentException.class,
                () -> new BankAccount(SOME_ACCOUNT_NUMBER, -SOME_INITIAL_BALANCE),
                "Initial balance cannot be negative");

    }

}
