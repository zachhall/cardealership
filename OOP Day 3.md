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
