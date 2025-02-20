public class TemperatureConverter {
    public static void main(String[] args) {
        // Step 1: Define the fahrenheit variable with a value between 0 and 100
        double fahrenheit = 75; // Example value
        
        // Step 2: Convert Fahrenheit to Celsius
        double celsius = (5.0 / 9) * (fahrenheit - 32);
        
        // Step 3: Print the result
        System.out.println(fahrenheit + "°F is equal to " + celsius + "°C.");
    }
}