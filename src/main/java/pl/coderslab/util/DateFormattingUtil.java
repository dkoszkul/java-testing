package pl.coderslab.util;

import lombok.experimental.UtilityClass;

import java.time.LocalDateTime;

@UtilityClass
public class DateFormattingUtil {

    public String formatDate(LocalDateTime date) {
        if (date == null) {
            return null;
        }
        return date.toString();
    }
}
