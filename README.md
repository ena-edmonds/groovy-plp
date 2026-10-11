# groovy-plp
Repository for the CS 330 PLP - Groovy

# history
Apache Groovy (or more colloquially, Groovy) was created by James Strachan in the early 2000s, with him first posting about it online in 2003, and submitting it to the Java Community Process for officially extending Java in 2004. Strachan's original blog post about Groovy stated he started work on the language as a direct reaction to the growing popularity of dynamically-typed languages like Python, which do not require a variable's type to be consistently defined.

Being capable of functioning as both a scripting language and a compiled language which is fully interoperable with regular Java, Groovy has several major use cases. Because of its dynamic typing, Groovy has become popular for writing unit tests for Java, since they can be much simpler without having to specify tests for all variable types. Groovy is also popular for use in automation and scripting within the Java world, where its interoperability with Java allows for compatible scripts and quick automations.

Groovy is well-documented on its website https://groovy-lang.org/.

# getting started
Groovy is generally recommended to be used in the [IntelliJ IDE](https://www.jetbrains.com/idea/) by JetBrains, since it carries out of the box support for Java and Groovy and can compile and run both languages. Installation using this method is simple and no extra steps are required to get Groovy working once IntelliJ is installed.

Since I prefer light-weight IDEs, I chose to instead use Groovy in VS Code, which required installation of Groovy language support (found by typing "Groovy" into the extension search) to have syntax highlighting for the language. To run Groovy files in VS Code, I installed the "Code Runner" plugin, which supports many popular coding languages and allows for scripts to be run like normal.

Comments in Groovy are written the same way that they are in Java, with `//` for single line and `/* */` for multiline.

```groovy
println("Hello, world!"); // a simple hello world command, all in 1 line!
```

Writing a Groovy hello world is much closer to Python than it is Java, since there is a more simplified "println" method. No class definitions or Public Static Void Main are required because of Groovy's scripting-oriented nature, so you just need a single line, and don't forget the semi-colon!!

# naming conventions
As Groovy maintains interoperability with Java, it takes on Java's naming conventions for variables as well. In Java and Groovy, local variables should be named in camel case, with the first letter being lower case. Constants (global variables) should be named in all caps with underscores separating words.

The first character of a variable name must be a letter, a $ dollar sign, or an underscore, and spaces are not allowed anywhere inside of variable names. Variables are also case-sensitive, so a variable named `"hiThere"` is distinct from a variable named `"Hithere"`


# common data types
Groovy contains all data types included in Java, with some notable changes. In base Java, almost all data types are objects excluding a few commonly used types which are given primitive versions not derived from the Object class, as well as uppercased Object counterparts, called Wrappers. This means a type like `int` is also available as its Wrapper, `Integer`, and the two can be used interchangeably in many contexts with Java automatically accepting both and making conversions based on context. This process is known as "boxing" when moving from primitive to Wrapper, and "unboxing" when moving from Wrapper to primitive.

In an attempt to be even closer to a 100% object-oriented language, Groovy almost entirely abandons primitives and will automatically convert *any* declarations of primitives to their Wrapper equivalent behind the scenes.
```groovy
int x = 1;
Integer y = 1;
def z = 1;

double a = 2.0;
def b = a + 1.0;
def c = 2.0;
```
In the above code snippet, variables `x`, `y` and `z` are *all* of the type Integer, and `a`, `b` and `c` are all of type Double.

This change also affects another Java primitive type conversion quirk known as widening. Widening is a process by which Java can automatically convert primitive types to other primitive types with larger memory capacity to make a line of code work. For example, addition of an `int` and a `double` will automatically widen the `int` to a `double` to match types.
```Java
// example of Java widening
int x = 1;
double y = 2.0;
System.out.println(x + y); // will output a double of value 3.0
```
Java prioritizes widening over boxing, but since all variables are automatically boxed, this hierarchy does not exist in Groovy code. In Groovy, the type for a primitive when multiple options exist is chosen based off of what fits, if you declare something too big for a given type, Groovy will automatically scale up, eventually landing at BigInteger or BigDecimal which both have more complex and accurate precision than `double` or `int`.

The included script `data_types.groovy` demonstrates definitions some commonly data types with comments on their nuances.
