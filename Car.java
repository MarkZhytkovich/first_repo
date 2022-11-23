public class Car {
        String brand = "mercedes";
        int acceleration;
        int speed;
        int braking;

        public Car(int acceleration, int speed, int braking) {
            this.acceleration = acceleration;
            this.speed = speed;
            this.braking = braking;

        }

        public void displayInfo() {
            System.out.println("Car's brand: \n" + brand + "\nDifference between acceleration and braking time: \n" + (acceleration-=braking) + "\nIs the acceleration and braking time equal? \n" + (acceleration==braking));
        }



    }



