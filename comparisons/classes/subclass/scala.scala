class NamedShape {
    var numberOfSides: Int = 0;
    var name: string;

    constructor(name: string) {
        this.name = name;
    }

    simpleDescription(): string {
        return "A shape with" + numberOfSides + " sides."
    }
}

class Square extends NamedShape {
    var sideLength: number;

    constructor(sideLength: number, name: String) {
        this.sideLength = sideLength;
        numberOfSides = 4;
        super(name);   
    }

    func area(): number {
        return sideLength * sideLength;
    }

    func simpleDescription() -> String {
        super.simpleDescription();
        return "A square with sides of length" +
                sideLength + ".";
    }
}

let test = Square(sideLength: 5.2, name: "my test square")
test.area()
test.simpleDescription()
