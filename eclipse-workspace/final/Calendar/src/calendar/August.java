package calendar;

class August extends Month {
    public August() {
        super("August");
        addHoliday("Friendship Day");
        addEvent("Summer Picnic");
        addEvent("Outdoor Movie Night");
        setEventPriority("Summer Picnic", "Medium");
        setReminder("Summer Picnic", "4:00 PM");
        setRecurringEvent("Summer Picnic", "Yearly");
        addWeatherReminder("Summer Picnic", "Sunny");
        exportEvents();
        showStatistics();
    }
}