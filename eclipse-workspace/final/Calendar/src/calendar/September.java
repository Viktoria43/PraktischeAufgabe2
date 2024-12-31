package calendar;

class September extends Month {
    public September() {
        super("September");
        addHoliday("Labor Day");
        addHoliday("Patriot Day");
        addEvent("Back to School Night");
        addEvent("Fall Festival");
        setEventPriority("Fall Festival", "Medium");
        setReminder("Fall Festival", "3:00 PM");
        setRecurringEvent("Fall Festival", "Yearly");
        addWeatherReminder("Fall Festival", "Cool");
        exportEvents();
        showStatistics();
    }
}