package calendar;

class February extends Month {
    public February() {
        super("February");
        addHoliday("Valentine's Day");
        addHoliday("Presidents' Day");
        addEvent("Love Parade");
        addEvent("Winter Sports Day");
        setEventPriority("Love Parade", "Medium");
        setReminder("Love Parade", "2:00 PM");
        setRecurringEvent("Love Parade", "Yearly");
        addWeatherReminder("Love Parade", "Cold");
        exportEvents();
        showStatistics();
    }
}