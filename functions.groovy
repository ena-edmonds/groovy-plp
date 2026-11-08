// methods (A.K.A functions) in groovy will always return a value,
// if no return line is specified, the most recently affected value will be returned
// here are several ways to write a method which multiplies 2 inputs in various java and groovy-esque styles:
double mult1(double a, double b) { // typical java method
    return a * b; 
} 

def mult2(double a, b) { return a * b } // slightly groovy-ified

def mult3(a, b) { a * b } // this will return the product of a and b because groovy methods always return a value!



// the below recursive method returns the nth number in the fibonacci sequence
def fib(n) {
    if (n < 2) return n;
    return (fib(n-1) + fib(n-2));
}



// Groovy supports typical Java string splitting logic, along with new "take" operators
def splitString(in) {
    def mid = (int) (in.length()/2)
    return [in.take(mid), in.takeRight(mid)] // returns a list of the two split variables
}
def (firstHalf, secondHalf) = splitString("HelloWorld") // like python, you can catch multiple parts of an output list together!
// firstHalf will be "Hello"
// secondHalf will be "World"



// like Java, Groovy is generally pass-by-value for methods, except for more complex Objects like ArrayLists which
// pass a reference to the original object, enabling side-effects
ArrayList<Integer> numsArr = new ArrayList<Integer>();
numsArr.add(1)
numsArr.add(2)
numsArr.add(3)

def valToPass = 9

def editList(arr) {
    arr.set(0, 5);
}

def editValue(a) {
    a = 6
}

println("ArrayList before edits: " + numsArr) // [1, 2, 3]
println("Variable before edits: " + valToPass) // 9
editList(numsArr)
editValue(valToPass)
println("ArrayList after edits: " + numsArr) // [5, 2, 3]
println("Variable after edits: " + valToPass) // 9