public class Main {
    public static void main(String[] args) {
        Object[] list = {new Dog(), new DogFood()};
        /**
         * //This is a classic kindly way to call Dog bark

         Dog dog = (Dog) list[0];
         dog.makeSound();
         **/

        //((Dog) list[0]).makeSound(); // This is a bit adv code to call Dog to bark
        // You can call by instanceof to check object is instance of another.
        /**
         for(Object object : list){
         if(object instanceof Animal){
         ((Animal) object).makeSound();
         }//end if
         }//end for
         **/

        Dog dog = new Dog();
        //   System.out.println(dog.toString()); // if you just call like this, it will call object Dog but id nr.
        //dog.makeSound();
        dog.findFood();
    }//end main
}//end class Main

abstract class Animal {
    String sound = "";

    Animal(String sound) {
        this.sound = sound;
    }

    abstract void findFood();

    public void makeSound() {
        System.out.println(sound);
    }

    //This method override from Class String!!
    public String toString() {
        return getClass().getSimpleName() + ": sound = " + sound;
    }
}//end class Animal

class Dog extends Animal {
    Dog() {
        super("bark");
    }//end constructor

    @Override
    void findFood() {
        System.out.println("*looks at human*");
        makeSound();
    }

    @Override
    public void makeSound() {
        super.makeSound();
        System.out.println("*wiggles tails*");
    }
}//end Dog

class DogFood { //todo är den extend Animal?

}//end DogFood
