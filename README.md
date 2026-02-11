# S26-lab05

See the lab handout at: [https://github.com/CMU-17-214/s2026/blob/main/labs/lab05.md](https://github.com/CMU-17-214/s2026/blob/main/labs/lab05.md)

## Task 1
> In the frogger folder, navigate to the `Frogger.java` and `Road.java` classes and take a look at the code. What is it doing and which anti-pattern is present? Try to fix the design by modifying the two classes.

- **Feature Envy** is the anti-pattern present in the code. The `Frogger` class is accessing the `Road`'s internal data structure.

- Fix: move the logic to `Road`.

## Task 2
> Take a look at Records.java and then Frogger.java (again). What anti-pattern is present? Then try to fix the design by modifying the two classes. Alternatively, take a look at FroggerID.java. How might you use it?

- **Long Parameter List** is the anti-pattern present in the code. The `Frogger`'s constructor and `Records.addRecord` method have a long list of parameters.
- **Shotgun Surgery** is also present, as changes to the parameters in one class may require changes in multiple places across the codebase.
- Fix: Use the `FroggerID` class to encapsulate the parameters into a single object. This way, we can pass a `FroggerID` instance instead of multiple parameters, improving code readability and maintainability.

## Task 3

> - The "draw" function seems to duplicate itself. How would you refactor it so that we don't need to rewrite the functionality everytime we introduce a new file type?
> - Take a look at Drawing.java. Somewhere inside the "draw" function, the code seems to be explicitly creating an array of Lines and feeding it to the shape. How would you refactor it so that we don't need to expose and rely on such information inside our Drawing class?

- **Shotgun Surgery** and **Excessive Instanceof** are the anti-patterns present in the code.

- In `Shape.draw()`, we can move the logic of converting shapes to lines and writing them into the respective `FormatWriter` subclasses. The concrete writer classes `JPEGWriter` and `PNGWriter` can implement a `writeLine(Line line)` method and handle the conversion logic internally. This way, the `Drawing` class can simply call `shape.draw(writer)` without needing to know about the internal representation of shapes as lines.
- In `Drawing.draw()`, we can eliminate code duplication by directly calling `shape.draw(writer)` for each shape. This way, we don't need to duplicate the logic for different file formats. The only switching logic remains in the `createWriter` method, which is responsible for instantiating the correct writer based on the format.