# Zoo Project

Kat Edfors, Athena Parker

# Comments and Assumptions

Strategy Pattern:

We created an interface, Noise, with a function getNoise that was used in each animal class to return the noise they make, rather than just implement the makeNoise function directly. 
We then created a class Context which took in the context for the strategy pattern (the type of animal in our case), then executed the strategy based on the context.
Finally, in the roll call function in the zookeeper class, we actually set the contexts, and executed the strategies.

Observer Pattern:

We created a class ZooAnnouncer which implements the PropertyChangeListener class, and most importantly the propertyChange function which communicates with our bean, which wraps ouor PropertyChangeSupport class (ZooEmployee).
We made the ZooEmployee class extend from PropertyChangeSupport, since Zookeeper and ZooFoodServer cannot extend from both ZooEmployee and PropertyChangeSupport.
Bean has a makeEvent function, called whenever Zookeeper does anything or ZooFoodServer serves food, which changes the event and notifies any listeners (ZooAnnouncer) of any events. At each event change, ZooAnnouncer announces the action that was just taken.

ZooClock:

The ZooClock class keeps track of the time on a 24 hours cycle. It increments each hour from 12am to 11 pm adding an hour each time until reaching 12 then resetting to 1 to follow a standard clock. The ZooClock class has an attribute "hour" that keeps track of the hour from 0 to 24 to control the meridiem. The meridiem is "am" to indicate the first twelve hours and "pm" for the last twelve. According to the CurrTime returned by the Time() function, the main in the Zookeeper class will respond in turn with the required action at each hour of the day. The function newDay() resets the clock to zero to indicate a new 24 cycle. 

ZooFoodServer:

ZooFoodServer extends from ZooEmployee and arrives, cooks, serves, cleans, and leaves according to the time of day. The ZooFoodServer makeEvent(event) triggers the ZooAnnouncer to announce when the ZooFoodServer serves lunch and dinner at noon and 5pm respectively. 



# Issues Encountered

Strategy: There has to be a better way to set the context than that. Ideally, we could somehow input our existing animal types rather than having to create a new animal object to set the context.

Observer: We originally tried to use the deprecated Observer/Observable pattern, and we had a lot of trouble trying to get a message relayed from ZooEmployee to ZooAnnouncer. Switching to PropertyChange went a lot smoother.

# Special Instructions

Only asks for an input of the day

