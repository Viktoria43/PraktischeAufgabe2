package calendar;

class June extends Month {
    public June() {
        super("June");
        addHoliday("Father's Day");
        addHoliday("Summer Solstice");
        addEvent("Beach Party");
        addEvent("Music Festival");
        setEventPriority("Beach Party", "High");
        setReminder("Beach Party", "3:00 PM");
        setRecurringEvent("Beach Party", "Yearly");
        addWeatherReminder("Beach Party", "Sunny");
        exportEvents();
        showStatistics();
    }
}