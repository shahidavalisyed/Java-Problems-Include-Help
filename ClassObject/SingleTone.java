package ClassObject;

// Java program to create Singleton class

class Singleton {
    private static Singleton singleRef = null;

    private Singleton() {
        System.out.println("Hello from Singleton class");
    }

    public void SayHello() {
        System.out.println("Hello world");
    }

    public static Singleton getSingletonInstance() {
        if (singleRef == null)
            singleRef = new Singleton();

        return singleRef;
    }

}

class Main1 {
    public static void main(String args[]) {
        Singleton obj = Singleton.getSingletonInstance();
        Singleton obj1 = Singleton.getSingletonInstance();

        System.out.println("Object1 HashCode "+obj.hashCode());
        System.out.println("Object2 HashCode "+obj1.hashCode());
    }
}

