package ClassObject;

class Singleton1 {
    private static Singleton1 singleRef = null;

    public static Singleton1 getSingletonInstance() {
        if (singleRef == null)
            singleRef = new Singleton1();

        return singleRef;
    }
}

class Main2 {
    public static void main(String args[]) {
        Singleton1 obj1 = Singleton1.getSingletonInstance();
        Singleton1 obj2 = Singleton1.getSingletonInstance();
        Singleton1 obj3 = Singleton1.getSingletonInstance();

        if (obj1 == obj2 && obj1 == obj3)
            System.out.println("All objects are pointing to the same memory location.");
        else
            System.out.println("All objects are not pointing to the same memory location.");
    }
}
