# S26-lab05

See the lab handout at: [https://github.com/CMU-17-214/s2026/blob/main/labs/lab05.md](https://github.com/CMU-17-214/s2026/blob/main/labs/lab05.md)

## Task 1
> In the frogger folder, navigate to the `Frogger.java` and `Road.java` classes and take a look at the code. What is it doing and which anti-pattern is present? Try to fix the design by modifying the two classes.

- **Feature Envy** is the anti-pattern present in the code. The `Frogger` class is accessing the `Road`'s internal data structure.

- Fix: move the logic to `Road`.

## Task 2
> Take a look at Records.java and then Frogger.java (again). What anti-pattern is present? Then try to fix the design by modifying the two classes. Alternatively, take a look at FroggerID.java. How might you use it?

- **Long Parameter List** is the anti-pattern present in the code. The `Frogger`'s constructor and `Records.addRecord` method have a long list of parameters.

- Fix: Use the `FroggerID` class to encapsulate the parameters into a single object. This way, we can pass a `FroggerID` instance instead of multiple parameters, improving code readability and maintainability.