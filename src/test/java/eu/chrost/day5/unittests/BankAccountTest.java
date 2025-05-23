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

}
