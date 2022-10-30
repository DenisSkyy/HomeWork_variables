public class Main {
    public static void main(String[] args) {
        byte A = 100;
        System.out.println("Значение переменной А с типом byte равно " + A);
        short B = 1000;
        System.out.println("Значение переменной B с типом short равно " + B);
        int C = 99999;
        System.out.println("Значение переменной С с типом int равно " + C);
        long D = 999999;
        System.out.println("Значение переменной F с типом long равно " + D);
        double E = 1.000000005;
        System.out.println("Значение переменной E с типом double равно " + E);
        float F = -0.00001f;
        System.out.println("Значение переменной F с типом float равно" + F);

        float G = 27.17f;
        System.out.println("Тип переменной G - float и равен " + G);
        long H = 987678965549l;
        System.out.println("Тип переменной H - long и равен " + H);
        byte I = 2;
        System.out.println("Тип переменной I - byte и равен " + I);
        short J = 786;
        System.out.println("Тип переменной J - short и равен " + J);
        boolean K = false;
        System.out.println("Тип переменной K - boolean и равен " + K);
        short L = 569;
        System.out.println("Тип переменной L - short и равен " + L);
        short M = -159;
        System.out.println("Тип переменной M - short и равен " + M);
        short N = 27897;
        System.out.println("Тип переменной N - short и равен " + N);
        byte O = 67;
        System.out.println("Тип переменной O - byte и равен " + O);

        byte ludmilaPav = 23;
        byte annaSerg = 27;
        byte ekaterinaAndr = 30;
        short allPapers = 480;
        short paperForOneStudent = (short) (allPapers/ (ludmilaPav+annaSerg+ekaterinaAndr));
        System.out.println("На каждого ученика рассчитано " + paperForOneStudent + " листов бумаги");

        byte oneMin = 16/2;
        short twentyMin = (short) (oneMin * 20);
        System.out.println("За 20 минут машина произвела бутылок " + twentyMin + " штук" );
        short oneHour = (short) (oneMin* 60);
        short oneDay = (short) (oneHour*24);
        System.out.println("За сутки машины произвела бутылок " + oneDay + " штук");
        long threeDays = oneDay*3;
        System.out.println("За 3 суток машина произвела бутылок " + threeDays +  " штук");
        long oneMonth = oneDay*31;
        System.out.println("За один месяц машины произвела бутылок " + oneMonth + " штук");

        byte white = 2;
        byte brown = 4;
        byte allPaint = 120;
        short allClassroom = (short) (allPaint / (white+brown));
        short allWhite = (short) (allClassroom * white);
        short allBrown = (short) (allClassroom* brown);
        System.out.println("В школе, где " +allClassroom + " классов, нужно " + allWhite + " банок белой краски и " + allBrown + " банок коричневой краски");

        byte banana = 80;
        short all5Bananas = (short) (banana*5);
        byte milk100 = 105;
        short all200Milk = (short) (milk100*2);
        byte iceCream1pack = 100;
        short all2IceCream = (short) (iceCream1pack*2);
        byte egg = 70;
        short all4Eggs = (short) (egg*4);
        short allBreakfestGr = (short) (all5Bananas+all200Milk+all2IceCream+all4Eggs);
        float allBreakfestKg = (allBreakfestGr/ (float)1000);
        System.out.println("Вес спорт-завтрака " + allBreakfestKg + " кг");

        short overWeightKg = 7;
        short overWeightGr = (short) (overWeightKg*1000);
        short gramm250 = (short) (overWeightGr/250);
        short gramm500 = (short) (overWeightGr/500);
        System.out.println("Если терять в весе по 250 грамм в день, то нужно " + gramm250 + " дней, если терять по 500 грамм в день, то нужно " +gramm500 + " дней" );

        int mariya = 67760;
        int denis = 83690;
        int kristina = 76230;
        double mariya3years = mariya* 1.1;
        float denis3years = (float) (denis * 1.1);
        double kristina3years = kristina * 1.1;
        int mariyaAnnualIncomeOld = mariya*12;
        int denisAnnualIncomeOld = denis*12;
        int kristinaAnnualIncomeOld = kristina*12;
        double mariyaAnnualIncomeNew = mariya3years*12;
        double denisAnnualIncomeNew = denis3years*12;
        double kristinaAnnualIncomeNew = kristina3years*12;
        double mariyaDifference = mariyaAnnualIncomeNew - mariyaAnnualIncomeOld;
        double denisDifference = denisAnnualIncomeNew - denisAnnualIncomeOld;
        double kristinaDifference = kristinaAnnualIncomeNew - kristinaAnnualIncomeOld;
        System.out.println("Маша теперь получает " + mariya3years + " рублей. Годовой доход вырос на " + mariyaDifference + " рублей");
        System.out.println("Денис теперь получает " + denis3years + " рублей. Годовой доход вырос на " + denisDifference + " рублей");
        System.out.println("Кристина теперь получает " + kristina3years + " рублей. Годовой доход вырос на " + kristinaDifference + " рублей");














    }
}