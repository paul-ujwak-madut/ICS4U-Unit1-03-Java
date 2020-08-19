import java.util.Scanner; 

class Main {
    public static void main(String[] args) {
        System.out.print("Enter a mass of an object(kg): ");
        Scanner input = new Scanner(System.in);
        double mass, energy, lightSpeed;
        mass = input.nextDouble();
        lightSpeed = 2.998 * (Math.pow(10,8));
        energy = mass*(Math.pow(lightSpeed,2));
        System.out.print(energy + " joules of energy are released");
}
}
