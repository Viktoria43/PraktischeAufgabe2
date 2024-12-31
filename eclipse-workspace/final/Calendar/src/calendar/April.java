package calendar;

class April extends Month {
    public April() {
        super("April");
        addHoliday("April Fools' Day");
        addHoliday("Easter");
        addEvent("Spring Cleanup");
        addEvent("Flower Festival");
        setEventPriority("Flower Festival", "Medium");
        setReminder("Flower Festival", "10:00 AM");
        setRecurringEvent("Flower Festival", "Yearly");
        addWeatherReminder("Flower Festival", "Mild");
        exportEvents();
        showStatistics();
    }
}