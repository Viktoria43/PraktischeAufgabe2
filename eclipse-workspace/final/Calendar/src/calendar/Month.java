package calendar;
import java.util.ArrayList;
import java.util.List;
public abstract class Month {
	 protected String name;
	    protected List<String> events = new ArrayList<>();
	    protected List<String> priorities = new ArrayList<>();
	    protected List<String> reminders = new ArrayList<>();


	    // Events
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

	    public void duplicateEvents() {
	        List<String> duplicateEvents = new ArrayList<>(events);
	        System.out.println("Duplicated events for " + name + ":");
	        for (String event : duplicateEvents) {
	            System.out.println(event);
	        }
	    }

	    public void reverseShowEvents() {
	        System.out.println("Reversed events for " + name + ":");
	        for (int i = events.size() - 1; i >= 0; i--) {
	            System.out.println(events.get(i));
	        }
	    }

	    // Priorities
	    public void addPriority(String event) {
	        if (hasEvent(event)) {
	            priorities.add(event);
	        }
	    }

	    public void removePriority(String event) {
	        priorities.remove(event);
	    }

	    public boolean hasPriority(String event) {
	        return priorities.contains(event);
	    }

	    public void clearPriorities() {
	        priorities.clear();
	    }

	    public int countPriorities() {
	        return priorities.size();
	    }

	    public void showPriorities() {
	        System.out.println("Priorities for " + name + ":");
	        if (priorities.isEmpty()) {
	            System.out.println("No priorities set.");
	        } else {
	            for (String priority : priorities) {
	                System.out.println(priority);
	            }
	        }
	    }

	    public void duplicatePriorities() {
	        List<String> duplicatePriorities = new ArrayList<>(priorities);
	        System.out.println("Duplicated priorities for " + name + ":");
	        for (String priority : duplicatePriorities) {
	            System.out.println(priority);
	        }
	    }

	    public void reverseShowPriorities() {
	        System.out.println("Reversed priorities for " + name + ":");
	        for (int i = priorities.size() - 1; i >= 0; i--) {
	            System.out.println(priorities.get(i));
	        }
	    }

	    // Reminders
	    public void addReminder(String event) {
	        if (hasEvent(event)) {
	            reminders.add(event);
	        }
	    }

	    public void removeReminder(String event) {
	        reminders.remove(event);
	    }

	    public boolean hasReminder(String event) {
	        return reminders.contains(event);
	    }

	    public void clearReminders() {
	        reminders.clear();
	    }

	    public int countReminders() {
	        return reminders.size();
	    }

	    public void showReminders() {
	        System.out.println("Reminders for " + name + ":");
	        if (reminders.isEmpty()) {
	            System.out.println("No reminders set.");
	        } else {
	            for (String reminder : reminders) {
	                System.out.println(reminder);
	            }
	        }
	    }

	    public void duplicateReminders() {
	        List<String> duplicateReminders = new ArrayList<>(reminders);
	        System.out.println("Duplicated reminders for " + name + ":");
	        for (String reminder : duplicateReminders) {
	            System.out.println(reminder);
	        }
	    }

	    public void reverseShowReminders() {
	        System.out.println("Reversed reminders for " + name + ":");
	        for (int i = reminders.size() - 1; i >= 0; i--) {
	            System.out.println(reminders.get(i));
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
	    
	 // Feature 10 are the months
	}
	
