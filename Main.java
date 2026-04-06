        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        System.out.println("Enter names:");
        for (int i = 0; i < n; i++) {
            String name = sc.nextLine();
            sq.enqueueStudent(name);
        }

        int choice;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Enqueue student");
            System.out.println("2. Prioritize student");
            System.out.println("3. Remove student");
            System.out.println("4. Display queue");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter name: ");
                    String name1 = sc.nextLine();
                    sq.enqueueStudent(name1);
                    break;

                case 2:
                    System.out.print("Enter name to prioritize: ");
                    String name2 = sc.nextLine();
                    sq.prioritizeStudent(name2);
                    break;

                case 3:
                    System.out.print("Enter name to remove: ");
                    String name3 = sc.nextLine();
                    sq.removeStudent(name3);
                    break;

                case 4:
                    sq.displayQueue();
                    break;

                case 5:
                    System.out.println("Program terminated.");
                    break;

                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        } while (choice != 5);

        sc.close();
    }
}


