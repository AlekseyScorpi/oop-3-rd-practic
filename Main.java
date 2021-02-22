import java.util.Arrays;

class City{

    private String cityName;
    private int population;

    public City(String cityName, int population) {
        this.cityName = cityName;
        this.population = population;
    }

    public String getCityName() {
        return cityName;
    }

    public int getPopulation() {
        return population;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public void setPopulation(int population) {
        this.population = population;
    }
}
public class Main {
    public static void main(String[] args) {
        System.out.println("1-st task");
        task1();
        System.out.println("2-nd task");
        task2();
        System.out.println("3-rd task");
        task3();
        System.out.println("4-th task");
        task4();
        System.out.println("5-th task");
        task5();
        System.out.println("6-th task");
        task6();
        System.out.println("7-th task");
        task7();
        System.out.println("8-th task");
        task8();
        System.out.println("9-th task");
        task9();
        System.out.println("10-th task");
        task10();
    }
    public static void task1(){
        City[] cityList = millionsRounding(new City[]{new City("Nice", 942208),
                new City("Abu Dhabi", 1482816), new City("Naples", 2186853),
                new City("Vatican City", 572)});
        for (City city : cityList) {
            System.out.println(city.getCityName() + " " + city.getPopulation());
        }
    }
    public static City[] millionsRounding(City[] list){
        for (City city : list) {
            city.setPopulation(((int) (Math.round(((double) city.getPopulation()) / 1000000))) * 1000000);
        }
        return list;
    }
    public static void task2(){
        System.out.println(Arrays.toString(otherSides(1)));
        System.out.println(Arrays.toString(otherSides(12)));
        System.out.println(Arrays.toString(otherSides(2)));
        System.out.println(Arrays.toString(otherSides(3)));
    }
    public static double[] otherSides(double a){
        double b,c;
        b = (double)(Math.round(((Math.sqrt(3) * a) * 100))) / 100;
        c = (double)(Math.round(2 * a * 100)) / 100;
        return new double[]{c,b};
    }

    public static void task3(){
        System.out.println(rps("rock", "paper"));
        System.out.println(rps("paper", "rock"));
        System.out.println(rps("paper", "scissors"));
        System.out.println(rps("scissors", "scissors"));
        System.out.println(rps("scissors", "paper"));
    }

    public static String rps(String a, String b){
        if (a.equals(b)){
            return "TIE";
        }else{
            if (a.equals("rock")){
                if (b.equals("scissors")){
                    return "Player 1 wins";
                }else{
                    return "Player 2 wins";
                }
            }else if(a.equals("paper")){
                if (b.equals("rock")){
                    return "Player 1 wins";
                }else{
                    return "Player 2 wins";
                }
            }else{
                if (b.equals("paper")){
                    return "Player 1 wins";
                }else{
                    return "Player 2 wins";
                }
            }
        }
    }
    public static void task4(){
        System.out.println(warOfNumbers(new int[]{2, 8, 7, 5}));
        System.out.println(warOfNumbers(new int[]{12, 90, 75}));
        System.out.println(warOfNumbers(new int[]{5, 9, 45, 6, 2, 7, 34, 8, 6, 90, 5, 243}));
    }
    public static int warOfNumbers(int[] arr){
        int d = 0, nd = 0;
        for (int i : arr) {
            if (i % 2 == 0) {
                d += i;
            } else {
                nd += i;
            }
        }
        return Math.abs(d - nd);
    }

    public static void task5(){
        System.out.println(reverseCase("Happy Birthday"));
        System.out.println(reverseCase("MANY THANKS"));
        System.out.println(reverseCase("sPoNtAnEoUs"));
    }
    public static String reverseCase(String str){
        StringBuilder newStr = new StringBuilder();
        char ch;
        for (int i = 0; i < str.length(); i++){
            if(Character.isUpperCase(str.charAt(i))){
                ch = Character.toLowerCase(str.charAt(i));
            }else{
                ch = Character.toUpperCase(str.charAt(i));
            }
            newStr.append(ch);
        }
        return newStr.toString();
    }

    public static void task6(){
        System.out.println(inatorInator("Shrink"));
        System.out.println(inatorInator("Doom"));
        System.out.println(inatorInator("EvilClone"));
    }
    public static String inatorInator(String str){
        String key = "aeiouy";
        boolean isVowel = false;
        for (int i = 0; i < key.length(); i++){
            if (Character.toLowerCase(str.charAt(str.length() - 1)) == key.charAt(i)){
                isVowel = true;
                break;
            }
        }
        if (isVowel){
            return str + "-inator " + (int)(Math.random() * 9 + 1) + "000";
        }else
            return str + "inator " + (int)(Math.random() * 9 + 1) + "000";
    }

    public static void task7(){
        System.out.println(doesBrickFit(1, 1, 1, 1, 1));
        System.out.println(doesBrickFit(1, 2, 1 ,1, 1));
        System.out.println(doesBrickFit(1, 2, 2 ,1, 1));
    }
    public static boolean doesBrickFit(int a, int b, int c, int w, int h){
        return ((a * b) <= (w * h)) || ((a * c) <= (w * h)) || ((b * c) <= (w * h));
    }

    public static void task8(){
        System.out.println(totalDistance(70.0, 7.0, 0, false));
        System.out.println(totalDistance(36.1, 8.6, 3, true));
        System.out.println(totalDistance(55.5, 5.5, 5, false));
    }
    public static double totalDistance(double fuel, double cons, int pass, boolean cond){
        if (cond) {
            return (fuel / (((cons) + cons * ((double)(pass * 5)) / 100) * 1.1)) * 100;
        }else {
            return (fuel / ((cons) + cons * ((double)(pass * 5)) / 100)) * 100;
        }
    }

    public static void task9(){
        System.out.println(mean(new double[]{1, 0, 4, 5, 2, 4, 1, 2, 3, 3, 3}));
        System.out.println(mean(new double[]{2, 3, 2, 3}));
        System.out.println(mean(new double[]{3, 3, 3, 3, 3}));
    }
    public static double mean(double[] arr){
        double sum = 0;
        for (double i : arr) {
            sum += i;
        }
        return sum / arr.length;
    }

    public static void task10(){
        System.out.println(parityAnalysis(243));
        System.out.println(parityAnalysis(12));
        System.out.println(parityAnalysis(3));
    }
    public static boolean parityAnalysis(int num){
        int newNum = num, sum = 0;
        while (newNum > 0){
            sum += (newNum % 10);
            newNum = newNum / 10;
        }
        return (num % 2) == (sum % 2);
    }
}
