package feb.assessment.ui.controller;
import feb.assessment.ui.response.RandomNumberResponse;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.Matchers.lessThan;
import static org.junit.jupiter.api.Assertions.*;

class RandomNumberTest {
    // Mocking the class
    RandomNumberResponse randomNumberResponse;

    @BeforeEach
    void setUp() {
        // Creating a dummy object of RandomNumber
        randomNumberResponse = new RandomNumberResponse();
    }

    @Test
    void getData() {
        // Expect that the random number is less than 1000000
        assertThat(randomNumberResponse.getRandomNumber(), lessThan(1000000));
        // Expect that the random number is greater than 0
        assertThat(randomNumberResponse.getRandomNumber(), greaterThan(0));
    }

    @Test
    void setData() {
        // Expect that the random number is less than 1000000
        randomNumberResponse.setRandomNumber(10);
        assertEquals(randomNumberResponse.getRandomNumber(),10);
    }
}