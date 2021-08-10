import java.util.Scanner;

public class PetrolCalculatorDebug {
    public static void main(String[] args) {
        new PetrolCalculatorDebug().calculate();
    }

    public void calculate() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите тип топлива: 1 - АИ-92, 2 - АИ-95, 3 - АИ-100 => ");
        int petrolType = scanner.nextInt();
        System.out.print("Введите количество литров => ");
        double volume = scanner.nextDouble();
        System.out.print("Введите скидку в диапазоне 0..100 => ");
        double discount = scanner.nextDouble() / 100;

        if (petrolType == 1) {
            Ai92Calculator calculator = new Ai92Calculator();
            double price = calculator.calculate(volume, discount);
            System.out.println("Стоимость " + volume + " литров АИ-92 = " + price + "₽");
        } else if (petrolType == 2) {
            Ai95Calculator calculator = new Ai95Calculator();
            double price = calculator.calculate(volume, discount);
            System.out.println("Стоимость " + volume + " литров АИ-95 = " + price + "₽");
        } else if (petrolType == 3) {
            Ai100Calculator calculator = new Ai100Calculator();
            double price = calculator.calculate(volume, discount);
            System.out.println("Стоимость " + volume + " литров АИ-100 = " + price + "₽");
        }
    }
}

