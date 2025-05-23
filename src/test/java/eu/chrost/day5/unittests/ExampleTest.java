package eu.chrost.day5.unittests;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ExampleTest {
    @Test
    void givenNumbersTwoAndTwo_whenSumThem_thenSumShouldBeFour() {
        //given
        int a = 2;
        int b = 2;

        //when
        int sum = a + b;

        //then
        assertThat(sum).isEqualTo(4);
    }
}
