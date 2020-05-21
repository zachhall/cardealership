## Object Relationships

#### Association

- loose relationship, lifetimes of object are independent of one another
- "is-a" relationship (doesn't apply to every instance of an Association)

#### Compostion

- "has-a" relationship or a "part-of"
- A Dealership "has a" Department
  - The Departments don't exist outside of a Dealership, therefore its a **Compostion** relationship

#### Aggregation

- A Dealership also "has" Vehicles, but its a less tightly coupled relationship
- Vehicles come and go through the Dealership and the Dealership can manipulate them while it "owns" them
- But, ultimately, a Vehicle _can_ exist outside of a Dealership - this is called **aggregation**

## Generics

- allows us to create classes and methods that can be used on multiple kinds of data types, elements, etc
- <E> for elements, <T> for data type, <K> for key, <V> for value
- we can "bound" our generics to specific user-generate object/type by using the "Extends" keyword
  - example: <E extends Vehicle>

## OOP Design Patterns

- Sounds really intimidating, but its not
- A convention so well recognized that it has a name and when someone calls a pattern by its name, everyone knows what they're talking about

#### Factory Pattern

- a method for creating objects without exposing the logic needed for creation
- SUPER common pattern in OOP
- using a Factory insulates the consumer from the actual class implementaion

* Why is this important? Why use a factory instead of relying on the new keyword?
  - **abstraction** and **insulation**

## New Stuff we covered today

1. Factory Pattern (and Abstraction)
2. Implementing multiple Interfaces
3. Generic class (focusing on generic elements)
4. Composing objects at another objects creation

---

## When to use abstract classes, generic classes, and interfaces

#### Abstract Classes

A blueprint to use for something else

- Do you need both abstract and non-abstract methods?
- Are you okay with a class only being able to implement one of you?
- Do you expressly need to add new functionality or do need some other stuff too?

#### Interface

Added functionality to something already existing

- Do you only need non-abstract methods?
- Are you easily named as an adjective? (has -ible or -able at the end)
- Can you be paired with other interfaces and work together to add more functionality?

#### Generic Class

- Do you need to work with multiple data types or object types?
