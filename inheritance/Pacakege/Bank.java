package Pacakege;

class RBI {

    Double getrateofinterest() {
        return 8.0;
    }
}

class Sbi extends RBI {

    Double getrateofinterest() {
        return 8.1;
    }
}

class Hdfc extends RBI {

    Double getrateofinterest() {
        return 8.2;
    }
}

public class Bank {

    public static void main(String[] args) {

        RBI r = new RBI();
        System.out.println("RBI := " + r.getrateofinterest());

        r = new Sbi();
        System.out.println("SBI := " + r.getrateofinterest());

        r = new Hdfc();
        System.out.println("HDFC := " + r.getrateofinterest());
    }
} 