package com.amigoscode.testing.utils;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class PhoneNumberValidatorTest {

    private PhoneNumberValidator underTest;

    @BeforeEach
    void setup() {
        underTest = new PhoneNumberValidator();
    }

    @ParameterizedTest
    @CsvSource({
            "+447000000000,true",
            "+4470000000000255,false",
            "447000000000,false"
    })
    void itShouldValidatePhoneNumber(String phoneNumber, boolean expected) {
        // When
        boolean isValid = underTest.test(phoneNumber);
        // Then
        assertThat(isValid).isEqualTo(expected);
    }

//    @Test
//    @DisplayName("Should fail when length is more than 13")
//    void itShouldValidatePhoneNumberWhenLengthMoreThan13digit() {
//        // Given
//        String phoneNumber = "+4470000000000255";
//        // When
//        boolean isValid = underTest.test(phoneNumber);
//        // Then
//        assertThat(isValid).isFalse();
//    }
//
//    @Test
//    @DisplayName("Should fail when does not start with +")
//    void itShouldValidatePhoneNumberWhenDoesNotStartWithPlusSign() {
//        // Given
//        String phoneNumber = "447000000000";
//        // When
//        boolean isValid = underTest.test(phoneNumber);
//        // Then
//        assertThat(isValid).isFalse();
//    }

}
