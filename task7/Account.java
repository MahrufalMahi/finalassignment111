    package Assignment9.task7;

    public class Account {
        
        public static int count;
        public String name;
        private int age;
        private String occupation;
        private int balance;

        public Account(String name, int age, String occupation, int balance){

            this.name = name;
            this.age = age;
            this.occupation = occupation;
            this.balance = balance;
            count++;
        }

        public int getAge(){

            return this.age;
        }

        public int getBalance(){

            return this.balance;
        }

        public String getOcc(){

            return this.occupation;
        }

        public void addMoney(int tbAdded){

            this.balance += tbAdded;
        }

        public void withdrawMoney(int tbWithdr){

            if(tbWithdr <= this.balance){

                this.balance -= tbWithdr;
            }else{

                System.out.println("Insufficient money for withdrawal!\r\n");
            }
        }

        public void printDetails(){

            System.out.println("Name : " + this.name);
            System.out.println("Age : " + getAge());
            System.out.println("Occupation : " + getOcc());
            System.out.println("Total Amount: " + getBalance());
        }

    }
