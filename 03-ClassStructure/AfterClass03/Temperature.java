public class Temperature{
    //Zad. 14
    
    public static double CelciusToKelvin(double tempC){
        return tempC+273.15;
    }
    
    public static double KelvinToCelcius(double tempK){
        return tempK-273.15;
    }
    
    public static double CelciusToFahrenheit(double tempC){
        return (tempC*1.8)+32.0;
    }
    
    public static double FahrenheitToCelcius(double tempF){
        return (tempF-32.0)/1.8;
    }
    
        public static double FahrenheitToKelvin(double tempF){
        return ((tempF-32.0)/1.8)+273.15;
    }
    
    public static double KelvinToFahrenheit(double tempK){
        return ((tempK-273.15)*1.8)+32.0;
    }
    
    public static void main(String[] args){
        System.out.println("a)\t25 Celcius = "+CelciusToKelvin(25.0)+
        " Kelvin = "+CelciusToFahrenheit(25.0)+" Fahrenheit");
        
        System.out.println("b)\t100 Fahrenheit = "+FahrenheitToKelvin(100.0)+
        " Kelvin = "+FahrenheitToCelcius(100.0)+" Celcius");
               
        System.out.println("b)\t0 Kelvin = "+KelvinToCelcius(0.0)+
        " Celcius = "+KelvinToFahrenheit(0.0)+" Fahrenheit");
    }
}