public class Main {
    public static void main(String[] args) {
        int spring = 400;
        int summer = 600;
        int fall = 750;
        int winter = 830;
        int year = 0;
        System.out.println("The seasonal expense in the spring is " + spring);
        System.out.println("The seasonal expense in the summer is " + summer);
        System.out.println("The seasonal expense in the fall is " + fall);
        System.out.println("The seasonal expense in the winter is " + winter);
        year = spring + summer + fall + winter + year;
        System.out.println("The total yearly expense is " + year);
    }
}