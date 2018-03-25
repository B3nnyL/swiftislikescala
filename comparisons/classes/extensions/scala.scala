interface Number {
    km(): number;
    mm(): number;
} 

Number.prototype.mm = function() : number {
    return this / 1000;
}

Number.prototype.km = function() : number {
    return this * 1000;
}

let oneMilimeter = 1.mm();
console.log("One milimeter is " + oneMeter + "meters");

let oneKilometer = 1.km();
console.log("One kilometer is" + oneKilometer + "meters");
