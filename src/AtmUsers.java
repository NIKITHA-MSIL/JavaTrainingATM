
    import java.util.ArrayList;
import java.util.Scanner;

    public class AtmUsers {
        ArrayList<AtmDetails> list = new ArrayList<>();
        String balance;


        private void addpinandpassword() {
            list.add(new AtmDetails("1121111122", "1234", "50000"));
            list.add(new AtmDetails("1121111123", "1235", "1000000"));
            list.add(new AtmDetails("1121111124", "1238", "150000"));
            list.add(new AtmDetails("1121111125", "1230", "160000"));
            list.add(new AtmDetails("1121111126", "1231", "126000"));
            list.add(new AtmDetails("1121111127", "1237", "160000"));
        }

        public void balance() {
            addpinandpassword();
            System.out.println("Enter the pin no and password");
            Scanner sc = new Scanner(System.in);
            String pin, password;
            pin = sc.nextLine();
            password = sc.nextLine();
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i).pinnum.equalsIgnoreCase(pin) && list.get(i).password.equalsIgnoreCase(password)) {
                    String amount = list.get(i).amount;
                    System.out.println("your balance is" + amount);
                    break;
                } else {
                    System.out.println("you have given incorrect pin or password");
                    break;
                }
            }
        }

        public void withdraw() {
            System.out.println("Enter the pin and password to be withdrawn");
            Scanner sc = new Scanner(System.in);
            String pin, password;
            pin = sc.nextLine();
            password = sc.nextLine();
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i).pinnum.equalsIgnoreCase(pin) && list.get(i).password.equalsIgnoreCase(password)) {
                    System.out.println("Enter the amount to be withdrawn");
                    String amount = sc.nextLine();
                    if (Integer.parseInt(amount) > Integer.parseInt(list.get(i).amount)) {
                        System.out.println("your balance is insufficient");

                    }
                     balance = list.get(i).amount;
                    balance = String.valueOf(Integer.parseInt(balance) - Integer.parseInt(amount));
                    System.out.println("Amount is withdrawn and your current balance is" + balance);
                }
            }
        }

        public void deposit() {
            System.out.println("Enter the pin and password to be withdrawn");
            Scanner sc = new Scanner(System.in);
            String pin, password;
            pin = sc.nextLine();
            password = sc.nextLine();
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i).pinnum.equalsIgnoreCase(pin) && list.get(i).password.equalsIgnoreCase(password)) {
                    System.out.println("Enter the amount to be deposited");
                    String amountnew = sc.nextLine();
                    balance=String.valueOf(Integer.parseInt(balance) + Integer.parseInt(amountnew));
                    System.out.println("your amount is deposited and current balance is" + balance);


                }


            }
        }
    }

