package Singleton;

class ChocolateBoiler {

    // Private static variable to hold the single instance
    private static ChocolateBoiler instance;

    // Private variables to hold the state of the boiler
    private boolean empty;
    private boolean boiled;

    // Private constructor to prevent instantiation
    private ChocolateBoiler() {
        empty = true;
        boiled = false;
    }

    // Public static method to provide access to the instance
    public static synchronized ChocolateBoiler getInstance() {
        if (instance == null) {
            instance = new ChocolateBoiler();
        }
        return instance;
    }

    // Method to fill the boiler with a mixture
    public void fill() {
        if (isEmpty()) {
            empty = false;
            boiled = false;
            // Fill the boiler with a mixture
            System.out.println("Filling the boiler with a mixture.");
        }
    }

    // Method to drain the boiled mixture
    public void drain() {
        if (!isEmpty() && isBoiled()) {
            // Drain the boiled mixture
            empty = true;
            System.out.println("Draining the boiled mixture.");
        }
    }

    // Method to boil the mixture
    public void boil() {
        if (!isEmpty() && !isBoiled()) {
            // Boil the mixture
            boiled = true;
            System.out.println("Boiling the mixture.");
        }
    }

    // Method to check if the boiler is empty
    public boolean isEmpty() {
        return empty;
    }

    // Method to check if the mixture is boiled
    public boolean isBoiled() {
        return boiled;
    }


}


