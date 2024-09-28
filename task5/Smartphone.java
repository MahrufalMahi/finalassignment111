    package Assignment9.task5;

    public class Smartphone {
        public String name;
        public String[] featureKeys;
        public String[] featureValues;
        public static int featureCount;
        public Smartphone(){

            this.name = "";
            featureKeys = new String[10];
            featureValues = new String[10];
        }

        public Smartphone(String name){

            this.name = name;
            featureKeys = new String[10];
            featureValues = new String[10];
        }

        public void updateName(String newName){

            this.name = newName;
        }

        public void addFeature(String key, String value){

            if(!this.name.equals("")){

                
                if(key.equals("Ram")){
                    boolean ramFound = false;
                    for(int i = 0; i < 10; i++){
    
                        if(this.featureKeys[i].equals("Ram")){
                            ramFound = true;
                            this.featureValues[i] = this.featureValues[i] + ", " + value;
                            return;
                        }
                    }
                    if(ramFound == false){
                        this.featureKeys[featureCount] = key;
                        this.featureValues[featureCount++] = value;

                            
                    }

                    }else{

                this.featureKeys[featureCount] = key;
                this.featureValues[featureCount++] = value;
                    }
                
                
            }else{
                System.out.println("Feature can not be added without phone name");
            }
        }

        public void printDetail(){
            System.out.println("Phone Name: " + this.name);
            int i = 0;
            while(this.featureKeys[i] != null){

                System.out.println(this.featureKeys[i] + " : " + this.featureValues[i]);
                i++;
            }
        }
    }
