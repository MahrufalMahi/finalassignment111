    package Assignment9.task6;

    public class Bus {

        public int capacity;
        public String destination;
        public int passCount; 

        public Bus(int capacity, String destination){

            this.capacity = capacity;
            this.destination = destination;

            System.out.println("Capacity: " + this.capacity);
            System.out.println("Destination: " + this.destination);
        }
        
        public void addPassenger(String name, String destination){

            if(passCount < this.capacity){

                if(!this.destination.equals(destination)){

                    System.out.println("Sorry"  + name + "! The bus won't stop at " + destination);
                    System.out.println("Use another bus");
                    return;
                }

                System.out.println(name +" is added to the bus.");
                passCount++;
                

            }else{

                System.out.println("Bus is full");

            }
        }

        public void addPassenger(String name){

            if(passCount < this.capacity){

                System.out.println(name + " is added to the bus");
                System.out.println(name + "  will get off at the last stop");
                passCount++;
            }else{System.out.println("Bus is full");}
        }

    }  