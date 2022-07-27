# observer-pattern

## Introduction:

Intent: Define a one-to-many dependency between objects. When the state of an object changes, all objects that depend on it are notified and automatically updated.

The main solution: the problem of notifying other objects of changes in the state of an object, and taking into account ease of use and low coupling to ensure a high degree of collaboration.

When to use: When the state of an object (target object) changes, all dependent objects (observer objects) will be notified and broadcast notification.

How to fix: Using object-oriented techniques, this dependency can be weakened.

Key code: There is an ArrayList in the abstract class to store the observers.

### Application examples: 
* 1. During the auction, the auctioneer observes the highest bid, and then notifies other bidders to bid. 、
* 2. In Journey to the West, Wukong asked the Bodhisattva to surrender the red boy. The Bodhisattva sprinkled water on the ground and attracted an old tortoise. This tortoise was the observer.

Advantages: 
* 1. The observer and the observed are abstractly coupled. 
* 2. Establish a trigger mechanism.

Disadvantages: 1. If an observed object has many direct and indirect observers, it will take a lot of time to notify all observers. 2. If there is a circular dependency between the observer and the observation target, the observation target will trigger a cyclic call between them, which may cause the system to crash. 3. The observer mode has no corresponding mechanism to let the observer know how the observed target object has changed, but only know that the observed target has changed.

scenes to be used:

An abstract model has two aspects, one of which depends on the other. Encapsulating these aspects in separate objects allows them to be changed and reused independently of each other.
The change of one object will cause one or more other objects to change, and it is not known how many objects will change, which can reduce the coupling between objects.
An object must notify other objects without knowing who those objects are.
A trigger chain needs to be created in the system, the behavior of object A will affect object B, the behavior of object B will affect object C..., you can use the observer pattern to create a chain trigger mechanism.
Matters needing attention: 1. There is already a support class for the observer pattern in JAVA. 2. Avoid circular references. 3. If it is executed sequentially, an observer error will cause the system to get stuck. Generally, an asynchronous method is used.
