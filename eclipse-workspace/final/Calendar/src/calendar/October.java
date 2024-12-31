package calendar;

class October extends Month {
    public October() {
        super("October");
        addHoliday("Halloween");
        addEvent("Pumpkin Carving Contest");
        addEvent("Costume Parade");
        setEventPriority("Pumpkin Carving Contest", "High");
        setReminder("Pumpkin Carving Contest", "6:00 PM");
        setRecurringEvent("Pumpkin Carving Contest", "Yearly");
        addWeatherReminder("Pumpkin Carving Contest", "Chilly");
        exportEvents();
        showStatistics();
    }
}