package pl.coderslab.util;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

class DateFormattingUtilTest {

    @Test
    void shouldFormatDate() {
        // given
        LocalDateTime input = LocalDateTime.parse("2024-03-15T08:00");

        // when
        String actual = DateFormattingUtil.formatDate(input);

        // then
        Assertions.assertThat(actual).isEqualTo("2024-03-15T08:00");
    }

    @Test
    void shouldReturnNullWhenInputIsNull() {
        // when
        // ustawiam null, zeby sprawdzic ze nie dostane nullpointera
        String actual = DateFormattingUtil.formatDate(null);

        // then
        //junit
        assertNull(actual);

        // assertJ
        Assertions.assertThat(actual).isNull();
    }
}