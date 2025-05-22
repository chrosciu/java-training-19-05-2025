package eu.chrost.day5.junit.lectures;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class BankAccountTest {
    @Test
    void givenCreateAccountWithoutBalance_whenGetBalance_thenBalanceIsZero() {
        //given
        var bankAccount = new BankAccount("0000");

        //when
        var balance = bankAccount.getBalance();

        //then
        assertThat(balance).isZero();
    }
}
