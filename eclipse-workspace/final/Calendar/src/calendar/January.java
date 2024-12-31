package calendar;

class January extends Month {
    public January() {
        super("January");
        addHoliday("New Year's Day");
        addHoliday("Martin Luther King Jr. Day");
        addEvent("Winter Carnival");
        addEvent("Ski Festival");
        setEventPriority("Winter Carnival", "High");
        setReminder("Winter Carnival", "9:00 AM");
        setRecurringEvent("Winter Carnival", "Yearly");
        addWeatherReminder("Winter Carnival", "Snowy");
        exportEvents();
        showStatistics();
    }
}