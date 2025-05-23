package eu.chrost.day5.unittests;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class BankAccountTest {
    private static final String SOME_ACCOUNT_NUMBER = "0123";
    private static final int SOME_INITIAL_BALANCE = 3000;

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
    void givenAccountIsCreatedWithBalance_whenGetBalance_thenBalanceShouldBeAsProvided() {
        //when
        var balance = bankAccountWithInitialBalance.getBalance();

        //then
        assertThat(balance).isEqualTo(SOME_INITIAL_BALANCE);
    }

    //Napisac nastepujace testy:
    //1) zweryfikowac czy numer konta przekazany przy jego tworzeniu jest taki sam jak odczytany potem z niego
    //2) zweryfikowac czy dziala wplacanie na konto
    //3) zweryfikowac czy dziala wyplacanie z konta (dwa przypadki - wyplacana suma mniejsza i wieksza od salda)
    //4*) zweryfikowac czy dziala zabezpieczenie przed zalozeniem konta z ujemnym stanem

}
