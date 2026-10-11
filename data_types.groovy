// all of the below variables are Integer!
int a = 1;
Integer b = 2;
def c = 3;

// decimal numbers will automatically chose to be either Double of BigDecimal depending on size, unless another type is explicitly declared
def x = 1.0 // Double
def y = 1.349857349857389475394875349857394875 // BigDecimal
float z = 2.0 // Float (not recommended, Double or BigDecimal are better)

// Strings can be defined using double, or single quotes for single line, and triple double quotes for multiline
String hello1 = "hello, world!"
def hello2 = 'hello, world!'
def hello3 = """
hello, new line!
"""

// booleans are secretely Booleans!
def x = true
def y = false

// groovy gets crazy with arrays, because they're secretly ArrayLists, you can mix types!
int[] nums = [1, 2, 3]
def crazyArr = [true, "wow!", 2]

// like Java, maps exist in Groovy, and can be declared with dynamic typing easily, and are secretly LinkedHashMaps, which maintain entry order
def schoolColors = [simmons: "blue", harvard = "red"] // these school names are secretly strings!!