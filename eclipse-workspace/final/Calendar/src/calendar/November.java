package calendar;

class November extends Month {
    public November() {
        super("November");
        addHoliday("Thanksgiving");
        addHoliday("Veterans Day");
        addEvent("Family Dinner");
        addEvent("Parade");
        setEventPriority("Family Dinner", "High");
        setReminder("Family Dinner", "4:00 PM");
        setRecurringEvent("Family Dinner", "Yearly");
        addWeatherReminder("Family Dinner", "Cool");
        exportEvents();
        showStatistics();
    }
}