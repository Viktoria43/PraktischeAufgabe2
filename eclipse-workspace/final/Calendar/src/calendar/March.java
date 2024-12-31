package calendar;

class March extends Month {
    public March() {
        super("March");
        addEvent("Spring Festival");
        addEvent("Women's Day");
        addEvent("International Happiness Day");
        addEvent("Equinox Celebration");

        setEventPriority("Spring Festival", "High");
        setEventPriority("Women's Day", "Medium");
        setEventPriority("Equinox Celebration", "Low");

        setReminder("Spring Festival", "10:00 AM");
        setReminder("Women's Day", "2:00 PM");
        setReminder("Equinox Celebration", "4:00 PM");

        setRecurringEvent("Spring Festival", "Yearly");
        setRecurringEvent("Women's Day", "Yearly");

        addHoliday("St. Patrick's Day");
        addHoliday("Pi Day");

        addWeatherReminder("Spring Festival", "Sunny");
        addWeatherReminder("Equinox Celebration", "Mild Weather");

        showStatistics();
        exportEvents();
    }
}