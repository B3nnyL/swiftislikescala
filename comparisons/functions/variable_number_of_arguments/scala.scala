function sumOf(...numbers: number[]): number{
    var sum = 0;
    for let (number of numbers){
        sum + = number;
    }
    return sum;
}

sumOf(42, 597, 12);