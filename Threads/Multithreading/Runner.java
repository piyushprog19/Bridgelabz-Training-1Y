package Mutithreading;

public class Runner {
    public static void main(String[] args) throws Exception {
        System.out.println("Bank Account Simulation");
        Thread p1 = new Thread(new BankAccount("Ayushi", "Premium"));
        Thread p2 = new Thread(new BankAccount("Nikhil", "Regular"));
        Thread p3 = new Thread(new BankAccount("Amit", "Basic"));
        p1.setPriority(10);
        p2.setPriority(5);
        p3.setPriority(1);
        p1.start();
        p2.start();
        p3.start();
        p1.join();
        p2.join();
        p3.join();

        System.out.println("Smart Home Automation");
        Thread temp = new Thread(new Device("Temperature Sensor", 5000));
        Thread cam = new Thread(new Device("Security Camera", 3000));
        Thread light = new Thread(new Device("Light Controller", 4000));
        Thread door = new Thread(new Device("Door Lock", 6000));
        cam.setPriority(10);
        temp.setPriority(7);
        light.setPriority(5);
        door.setPriority(5);
        temp.start(); cam.start(); light.start(); door.start();
        temp.join(); cam.join(); light.join(); door.join();

        System.out.println("Food Delivery System");
        Thread o1 = new Thread(new Order(1, "KFC", 2), "Agent-1");
        Thread o2 = new Thread(new Order(2, "Pizza Hut", 3), "Agent-2");
        Thread o3 = new Thread(new Order(3, "Dominos", 1), "Agent-3");
        Thread o4 = new Thread(new Order(4, "Burger King", 4), "Agent-4");
        Thread o5 = new Thread(new Order(5, "Subway", 2), "Agent-5");
        o1.setPriority(10);
        o2.setPriority(5);
        o3.setPriority(3);
        o4.setPriority(5);
        o5.setPriority(3);
        o1.start(); o2.start(); o3.start(); o4.start(); o5.start();
        o1.join(); o2.join(); o3.join(); o4.join(); o5.join();

        System.out.println("Exam Hall Management");
        Thread entry = new Thread(new ExamTask("Student Entry", 0));
        Thread paper = new Thread(new ExamTask("Question Paper Distribution", 5000));
        Thread attendance = new Thread(new ExamTask("Attendance", 10000));
        Thread collection = new Thread(new ExamTask("Answer Sheet Collection", 15000));
        paper.setPriority(10);
        attendance.setPriority(8);
        entry.setPriority(5);
        collection.setPriority(7);
        entry.start(); paper.start(); attendance.start(); collection.start();
        entry.join(); paper.join(); attendance.join(); collection.join();

        System.out.println("Ticketing System");
        String[] types = {"Critical", "Feature", "Query", "Feedback"};
        int[] priorities = {10, 4, 2, 1};
        Ticket[] tickets = new Ticket[10];
        for (int i = 0; i < 10; i++) {
            int idx = (int)(Math.random() * 4);
            tickets[i] = new Ticket(i + 1, types[idx]);
            tickets[i].setPriority(priorities[idx]);
            tickets[i].setName("Agent-" + (i + 1));
        }
        for (Ticket t : tickets) t.start();
        for (Ticket t : tickets) t.join();
    }
}

