interface Number {
    km(): number;
    cm(): number;
} 

Number.prototype.mm = function() : number {
    return this * 100;
}

Number.prototype.km = function() : number {
    return this / 1000;
}

let oneMeter = 1000.mm();
console.log("One meter is " + oneMeter + "centimeter");
let oneKilometer = 1000.km();
console.log("One kilometer is" + oneKilometer + "kilometer");
