package Lesson_5;


public class MainWorker {
    public static void main(String[] args) {
        Worker[] persArray = {
                new Worker("Leonid Parfenov", "Business analyst", "ParfenovL@AndeoidDeeveloper.com", "+79117776655", 1300, 41),
                new Worker("Leonid Parfenov", "Business analyst", "ParfenovL@AndeoidDeeveloper.com", "+79117776655", 1300, 41),
                new Worker("Semen Dobrolubov", "Project manager", "DobrolubovS@AndeoidDeeveloper.com", "+79117775684", 2500, 43),
                new Worker("Gregory Zverincev", "UI/UX Designer", "ZverincevG@AndeoidDeeveloper.com", "+79117773356", 1850, 27),
                new Worker("Fedor Petrovich", "Senior Java/Kotlin Developer", "PetrovichF@AndeoidDeeveloper.com", "+79117775699", 3000,39),
                new Worker("Victoria Zagorulkina", "Qality Assurance", "ZagorulkinV@AndeoidDeeveloper.com", "+79117776333", 2200, 33)};

        olderThen40(persArray);
    }
    static void olderThen40 (Worker[] wArray) {
        System.out.println("Employees over 40 years: ");
        System.out.println();
        for (int i = 0; i < wArray.length; i++) {
            if (wArray[i].getAge() > 40) wArray[i].info();
        }
    }
}