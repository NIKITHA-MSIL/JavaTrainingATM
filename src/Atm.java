
    import java.util.Scanner;

    public class Atm {
        public static void main(String []args)
        {

            Scanner scanner = new Scanner(System.in);

            AtmUsers users=  new AtmUsers();
            while(true)
            {
                System.out.println("1.balance\n2.withdraw\n3.deposit\nselect the option");
                int option = scanner.nextInt();
                switch (option)
                {
                    case 1:users.balance();
                        break;
                    case 2 :users.withdraw();
                        break;

                    case 3 :users.deposit();
                    break;
                    default:
                        System.out.println("Not a valid choice.");
                        break;

                }
            }
        }

    }


