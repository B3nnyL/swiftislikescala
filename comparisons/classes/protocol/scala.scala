interface Nameable {
    name(): string;
}

printName(x: Nameable) {
    console.log('Name is ' + x.name());
}