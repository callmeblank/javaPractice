To make a GUI, start with a window, usually a JFrame
JFrame frame = new JFrame();
-You can add widgets (buttons, text fields, etc.) to the
JFrame using:
frame.getContentPane().add(button);
-Unlike most other components, the JFrame doesn’t let
you add to it directly, so you must add to the JFrame’s
content pane. 
-To make the window (JFrame) display, you must give it
a size and tell it be visible:
frame.setSize(300,300);
frame.setVisible(true);
-To know when the user clicks a button (or takes some
other action on the user interface) you need to listen for
a GUI event.
-To listen for an event, you must register your interest
with an event source. An event source is the thing
(button, checkbox, etc.) that ‘fires’ an event based on
user interaction.
-The listener interface gives the event source a way
to call you back, because the interface defines the
method(s) the event source will call when an event
happens.
-To register for events with a source, call the source’s
registration method. Registration methods always take
the form of: add<EventType>Listener. To register for a
button’s ActionEvents, for example, call:
button.addActionListener(this);
-Implement the listener interface by implementing all of
the interface’s event-ndling methods. Put your event-handling code in the listener call-ck method. For
ActionEvents, the method is:
public void actionPerformed(ActionEvent 
 event) {
 button.setText(“you clicked!”);
 }
-The event object passed into the event-ndler method
carries information about the event, including the source
of the event.