package calendar;

public class Calendar {

    public static void main(String[] args) {
    	January jan = new January();
        February feb = new February();
        March mar = new March();
        April apr = new April();
        May may = new May();
        June jun = new June();
        July jul = new July();
        August aug = new August();
        September sep = new September();
        October oct = new October();
        November nov = new November();
        December dec = new December();

     
        jan.addEvent("New Year Celebration");
        jan.addEvent("Winter Carnival");
        feb.addEvent("Valentine's Day");
        feb.addEvent("President's Day");
        mar.addEvent("Spring Festival");
        mar.addEvent("Women's Day");

        jan.showEvents();
        feb.showEvents();
        mar.showEvents();

        jan.clearEvents();
        jan.showEvents();
    }
    }


