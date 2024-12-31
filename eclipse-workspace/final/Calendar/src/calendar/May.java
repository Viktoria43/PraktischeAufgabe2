package calendar;

class May extends Month {
    public May() {
        super("May");
        addHoliday("Labor Day");
        addHoliday("Mother's Day");
        addEvent("May Fair");
        addEvent("Music Festival");
        setEventPriority("May Fair", "High");
        setReminder("May Fair", "12:00 PM");
        setRecurringEvent("May Fair", "Yearly");
        addWeatherReminder("May Fair", "Warm");
        exportEvents();
        showStatistics();
    }
}