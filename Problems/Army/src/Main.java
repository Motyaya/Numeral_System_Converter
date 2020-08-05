class Army {

    public static void createArmy() {
        Unit petr = new Unit("Petr");
        Unit petr1 = new Unit("Petr1");
        Unit petr2 = new Unit("Petr2");
        Unit petr3 = new Unit("Petr3");
        Unit petr4 = new Unit("Petr4");

        Knight knight = new Knight("Fafel");
        Knight knight1 = new Knight("Fafel1");
        Knight knight2 = new Knight("Fafel2");

        General general = new General("RotoRo");

        Doctor doctor = new Doctor("Doc");
    }


    // Don't change the code below
    static class Unit {
        static String nameUnit;
        static int countUnit;

        public Unit(String name) {
            countUnit++;
            nameUnit = name;

        }
    }

    static class Knight {
        static String nameKnight;
        static int countKnight;

        public Knight(String name) {
            countKnight++;
            nameKnight = name;

        }
    }

    static class General {
        static String nameGeneral;
        static int countGeneral;

        public General(String name) {
            countGeneral++;
            nameGeneral = name;

        }
    }

    static class Doctor {
        static String nameDoctor;
        static int countDoctor;

        public Doctor(String name) {
            countDoctor++;
            nameDoctor = name;

        }
    }

    public static void main(String[] args) {
        createArmy();
        System.out.println(Unit.countUnit);
        System.out.println(Knight.countKnight);
        System.out.println(General.countGeneral);
        System.out.println(Doctor.countDoctor);
    }

}