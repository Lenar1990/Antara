package Food;



class Food {

}

class Grass extends Food {

}

class Meat extends  Food {

}

class Corn extends Grass {
    int energy = 10;
}

class Hay extends Grass {
    int energy = 15;
}

class Clover extends Grass {
    int energy = 20;
}

class Mutton extends  Meat {
    int energy = 30;
}

class Beef extends Meat {
    int energy = 33;
}

class Pork extends  Meat {
    int energy = 40;
}