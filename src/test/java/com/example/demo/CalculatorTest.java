package com.example.demo;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;


@SpringBootTest
class CalculatorTest {
    @Autowired
    private Calculator calculator;

    @Test
    void shouldAdd() {
        assertThat(calculator.add(2, 2)).isEqualTo(4);
    }

    @Test
    void shouldSub() {
        assertThat(calculator.sub(4, 2)).isEqualTo(2);
    }
}