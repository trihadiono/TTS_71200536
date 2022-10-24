package com.rplbo.mycomputer;

public class App {
        //entry point
        public static void main( String[] args )
        {
            int SDCardSize = 10;
            int SSDSize = 100;
            Storage SDCard = new Storage(SDCardSize);
            Storage SSD = new Storage(SSDSize);
            CableData vivan = new CableData();
            CableData robot = new CableData();
            Smartphone smartphone = new Smartphone(SDCard, new TouchScreen());
            Laptop laptop = new Laptop(SSD, new Monitor(), new Keyboard());
            {
                System.out.println("======TEST 1=======");
                System.out.println("Ukuran storage smartphone\t: " +
                        checkBenar(smartphone.getStorage().getSizeOfData() == SDCardSize));
                System.out.println("Ukuran storage laptop \t\t: " +
                        checkBenar(laptop.getStorage().getSizeOfData() == SSDSize));
            }
            int i = 0;
            int j = 0;
            {
                System.out.println("======TEST 2=======");
                String checkDataSmartphone = "";
                String data = "Test String Data";
                for (; i < 5; i++){
                    smartphone.retrieveData(i);
                    checkDataSmartphone =
                            checkBenar(smartphone.getStorage().getData(i).equals(String.valueOf(i)));
                }
                smartphone.retrieveData(data);
                String checkDataLaptop = "";
                for (; j < 50; j++){
                    laptop.retrieveData(j);
                    checkDataLaptop =
                            checkBenar(laptop.getStorage().getData(j).equals(String.valueOf((double)j)));
                }
                laptop.retrieveData(data);
                System.out.println("Input data int smartphone\t: " +
                        checkDataSmartphone);
                System.out.println("Input data double laptop\t: " + checkDataLaptop);
                System.out.println("Input data string smartphone: " +
                        checkBenar(smartphone.getStorage().getData(i).equals(data)));
                System.out.println("Input data string laptop\t: " +
                        checkBenar(laptop.getStorage().getData(j).equals(data)));
            }
            {
                System.out.println("======TEST 3=======");
                boolean isSmartphoneSuccess = smartphone.attachCableData(vivan) &&
                        vivan.getComputer1() == smartphone;
                boolean isLaptopSuccess = laptop.attachCableData(vivan) &&
                        vivan.getComputer2() == laptop;
                boolean isFailed = !laptop.attachCableData(robot);
                boolean isFailed2 = robot.getComputer1() != laptop;
                System.out.println("Attach cable smartphone\t: " +
                        checkBenar(isSmartphoneSuccess));
                System.out.println("Attach cable laptop\t\t: " +
                        checkBenar(isLaptopSuccess));
                System.out.println("Attach cable failed\t\t: " + checkBenar(isFailed));
                System.out.println("Attach cable failed2\t: " + checkBenar(isFailed2));
            }
            {
                System.out.println("======TEST 4=======");
                String sendData = "SendData";
                System.out.println("Send data smartphone\t: " +
                        checkBenar(smartphone.sendData(sendData)));
                System.out.println("Send data laptop\t\t: " +
                        checkBenar(laptop.sendData(sendData)));
                System.out.println("Send data success1\t\t: " +
                        checkBenar(smartphone.getStorage().getData(++i).equals(sendData)));
                System.out.println("Send data success2\t\t: " +
                        checkBenar(laptop.getStorage().getData(++j).equals(sendData)));
            }
            {
                System.out.println("======TEST 5=======");
                System.out.println("Detach cable smartphone\t: " +
                        checkBenar(smartphone.detachCableData()));
                System.out.println("Detach cable success\t: " +
                        checkBenar(!laptop.sendData("Harusnya gagal")));
            }
            {
                System.out.println("======TEST 6=======");
                try{
                    smartphone.showDisplay();
                    laptop.showDisplay();
                    System.out.println("Show data BENAR");
                }catch (Exception e){
                    System.out.println("Show data SALAH");
                }
            }
        }
        public static String checkBenar(boolean check){
            return check? "BENAR" : "SALAH";
        }
    }