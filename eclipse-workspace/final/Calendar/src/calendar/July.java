package calendar;

class July extends Month {
    public July() {
        super("July");
        addHoliday("Independence Day");
        addEvent("Fireworks Show");
        addEvent("Parade");
        setEventPriority("Fireworks Show", "High");
        setReminder("Fireworks Show", "9:00 PM");
        setRecurringEvent("Fireworks Show", "Yearly");
        addWeatherReminder("Fireworks Show", "Clear Skies");
        exportEvents();
        showStatistics();
    }
}