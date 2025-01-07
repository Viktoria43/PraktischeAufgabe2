package calendar;



class December extends Month {
    public December() {
        super("December");
        
        // Holidays
        addHoliday("Christmas");
        addHoliday("New Year's Eve");
        addHoliday("Hanukkah");
        addHoliday("Boxing Day");
        addHoliday("Winter Solstice");
        addHoliday("St. Nicholas Day");

        // Events
        addEvent("Gift Exchange");
        addEvent("Holiday Party");
        addEvent("Christmas Market Visit");
        addEvent("New Year Countdown");
        addEvent("Office Holiday Celebration");
        addEvent("Winter Charity Drive");
        addEvent("Ice Skating Event");
        addEvent("Family Gathering");
        addEvent("Community Carol Singing");
        addEvent("Tree Decoration Ceremony");
        addEvent("Secret Santa Gift Swap");
        addEvent("Winter Baking Contest");
        addEvent("Holiday Movie Night");
        addEvent("New Year Fireworks Show");
        addEvent("Gingerbread House Competition");

        // Settings for events
        setEventPriority("Gift Exchange", "High");
        setReminder("Gift Exchange", "5:00 PM");
        setRecurringEvent("Gift Exchange", "Yearly");
        addWeatherReminder("Gift Exchange", "Snowy");
        exportEvents();
        showStatistics();
    } 
}
