# Zoo Project

Kat Edfors, Athena Parker

# Comments and Assumptions

Strategy Pattern:

We created an interface, Noise, with a function getNoise that was used in each animal class to return the noise they make, rather than just implement the makeNoise function directly. 
We then created a class Context which took in the context for the strategy pattern (the type of animal in our case), then executed the strategy based on the context.
Finally, in the roll call function in the zookeeper class, we actually set the contexts, and executed the strategies.

Observer Pattern:

We created a class ZooAnnouncer which implements the Observer class, and most importantly the update function which communicates with our Observable class (Zookeeper).
We made the ZooEmployee class extend from Observable, since Zookeeper cannot extend from both ZooEmployee and Observable.
Zookeeper now has a makeEvent function, which sets change and notifies any observers (ZooAnnouncer) of any events. Using a Message object, notifyObservers passes the action the Zookeeper is performing to the update function of the ZooAnnouncer, who prints the action.

# Issues Encountered

Current issues:

Strategy: There has to be a better way to set the context than that. Ideally, we could somehow input our existing animal types rather than having to create a new animal object to set the context.

Observer: The message is not passed correctly from notifyObservers in Zookeeper to update in ZooEmployee. Whenever we try to pass Message instead of Object as update's second argument, it gives error. How to fix?

# Special Instructions

Only asks for an input of the day

