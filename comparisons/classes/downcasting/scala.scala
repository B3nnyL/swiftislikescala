class Animal{
}

class Cat extends Animal {
    meow(){}
}

function downcasting(ragdoll: Animal){
    if (ragdoll instance of Cat){
        ragdoll.meow();
    }
}