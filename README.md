# groovy-plp
Repository for the CS 330 PLP - Groovy

# history
Apache Groovy (or more colloquially, Groovy) was created by James Strachan in the early 2000s, with him first posting about it online in 2003, and submitting it to the Java Community Process for officially extending Java in 2004. Strachan's original blog post about Groovy stated he started work on the language as a direct reaction to the growing popularity of dynamically-typed languages like Python, which do not require a variable's type to be consistently defined.

Being capable of functioning as both a scripting language and a compiled language which is fully interoperable with regular Java, Groovy has several major use cases. Because of its dynamic typing, Groovy has become popular for writing unit tests for Java, since they can be much simpler without having to specify tests for all variable types. Groovy is also popular for use in automation and scripting within the Java world, where its interoperability with Java allows for compatible scripts and quick automations.

Groovy is well-documented on its website https://groovy-lang.org/.

# getting started
Groovy is generally recommended to be used in the IntelliJ IDE by JetBrains, since it carries out of the box support for Java and Groovy and can compile and run both languages. Installation using this method is simple and no extra steps are required to get Groovy working once IntelliJ is installed.

Since I prefer light-weight IDEs, I chose to instead use Groovy in VS Code, which required installation of Groovy language support (found by typing "Groovy" into the extension search) to have syntax highlighting for the language. To run Groovy files in VS Code, I installed the "Code Runner" plugin, which supports many popular coding languages and allows for scripts to be run like normal.

Comments in Groovy are written the same way that they are in Java, with `//` for single line and `/* */` for multiline.