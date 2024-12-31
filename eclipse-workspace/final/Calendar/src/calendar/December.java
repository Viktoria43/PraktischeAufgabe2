package calendar;

class December extends Month {
    public December() {
        super("December");
        addHoliday("Christmas");
        addHoliday("New Year's Eve");
        addEvent("Gift Exchange");
        addEvent("Holiday Party");
        setEventPriority("Gift Exchange", "High");
        setReminder("Gift Exchange", "5:00 PM");
        setRecurringEvent("Gift Exchange", "Yearly");
        addWeatherReminder("Gift Exchange", "Snowy");
        exportEvents();
        showStatistics();
    } 
    }