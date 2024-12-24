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
	}
	
