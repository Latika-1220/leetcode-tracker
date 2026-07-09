// Last updated: 09/07/2026, 09:53:02
class Solution {
    public double[] convertTemperature(double celsius) {
       double kelvin = celsius + 273.15;
       double fahrenheit = celsius * 1.80 + 32.00;
       return new double[]{kelvin , fahrenheit} ;
    }
}