// if statements are generally unchanged from Java outside of previously explained Groovy rules
def a = true
def b = false
def c = 0

if (b and a) { // this statement will short circuit; b is false so the entire statement can only be false
    c = a
} else {
    c = b
}

// switch cases are expanded and support more variable types
def x = 22.5
def result = 0
switch (x) {
    case 10..15: // between 10 and 15
        result = 1
        break
    case 15..20: // between 15 and 20
        result = 2
        break
    default:
        result = x
}

// for and while loops are also mostly unchanged
def y = 0
for (i in 0..9) {
    z = i
    while(z > 0) {
        y += z
        z--
    }
}