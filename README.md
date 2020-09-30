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

# Issues Encountered

Strategy: There has to be a better way to set the context than that. Ideally, we could somehow input our existing animal types rather than having to create a new animal object to set the context.

Observer: We originally tried to use the deprecated Observer/Observable pattern, and we had a lot of trouble trying to get a message relayed from ZooEmployee to ZooAnnouncer. Switching to PropertyChange went a lot smoother.

# Special Instructions

Only asks for an input of the day

