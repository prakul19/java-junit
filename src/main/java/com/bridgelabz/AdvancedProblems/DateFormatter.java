package com.bridgelabz.AdvancedProblems;
import java.time.*;
import java.time.format.*;
public class DateFormatter {
    public String formatDate(String inputDate) {
        try {
            DateTimeFormatter input = DateTimeFormatter.ofPattern("yyyy-MM-dd");
            DateTimeFormatter output = DateTimeFormatter.ofPattern("dd-MM-yyyy");
            LocalDate date = LocalDate.parse(inputDate, input);
            return date.format(output);
        } catch (DateTimeParseException e) {
            return null;
        }
    }
}
