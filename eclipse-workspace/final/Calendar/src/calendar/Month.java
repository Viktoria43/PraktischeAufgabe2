package calendar;
import java.util.ArrayList;
import java.util.List;
public abstract class Month {
	 protected String name;
	    protected List<String> events = new ArrayList<>();
	    protected List<String> priorities = new ArrayList<>();
	    protected List<String> reminders = new ArrayList<>();


	    public Month(String name) {
	        this.name = name;
	    }

	    public void addEvent(String event) {
	        events.add(event);
	    }

	    public void removeEvent(String event) {
	        events.remove(event);
	    }

	    public boolean hasEvent(String event) {
	        return events.contains(event);
	    }

	    public void clearEvents() {
	        events.clear();
	    }
	    
	    public int countEvents() {
	        return events.size();
	    }

	    public void showEvents() {
	        System.out.println("Events for " + name + ":");
	        if (events.isEmpty()) {
	            System.out.println("No events scheduled.");
	        } else {
	            for (String event : events) {
	                System.out.println(event);
	            }
	        }
	    }
	    
	 // Feature 1
	    public void setEventPriority(String event, String priority) {
	        if (hasEvent(event)) {
	            System.out.println("Priority for " + event + " set to: " + priority);
	        } else {
	            System.out.println("Event not found to set priority.");
	        }
	    }

	    // Feature 2
	    public void setReminder(String event, String reminderTime) {
	        if (hasEvent(event)) {
	            System.out.println("Reminder for " + event + " set at: " + reminderTime);
	        } else {
	            System.out.println("Event not found to set reminder.");
	        }
	    }
	    
	 // Feature 3
	    public void sendNotification(String event) {
	        if (reminders.contains(event) && priorities.contains(event)) {
	            System.out.println("Notification sent for event: " + event);
	        } else {
	            System.out.println("No reminder or priority found for event: " + event);
	        }
	    }
	    

	    // Feature 4
	    public void setRecurringEvent(String event, String frequency) {
	        if (hasEvent(event)) {
	            System.out.println("Recurring event set: " + event + " - Frequency: " + frequency);
	        } else {
	            System.out.println("Event not found to set as recurring.");
	        }
	    }

	    // Feature5
	    public void exportEvents() {
	        if (!events.isEmpty()) {
	            System.out.println("Exporting events for " + name + ": " + events);
	        } else {
	            System.out.println("No events to export.");
	        }
	    }

	    // Feature 6 
	    public void importEvents(List<String> importedEvents) {
	        events.addAll(importedEvents);
	        System.out.println("Imported events into " + name + ": " + importedEvents);
	    }

	    // Feature 7
	    public void showStatistics() {
	        System.out.println("Statistics for " + name + ":");
	        System.out.println("Total events: " + countEvents());
	    }

	    // Feature 8
	    public void addHoliday(String holiday) {
	        addEvent(holiday);
	        System.out.println("Holiday added: " + holiday);
	    }

	    // Feature 9
	    public void addWeatherReminder(String reminder, String weatherForecast) {
	        if (reminders.contains(reminder)) {
	            System.out.println("Weather reminder added for " + reminder + " - Forecast: " + weatherForecast);
	        } else {
	            System.out.println("Reminder not found for weather integration.");
	        }
	    }
	    
	 // Feature 9 are the months
	}
	
