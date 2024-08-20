public class Table {
    public static void main(String[] args) {

        String[] code; // Déclaratrion de la variable
        char[] alphabet = new char[26];
        String[] fruits = new String[5];
        int[] number1 = { 15, 58, 75, 65 };

        byte[] mybe = { 1, 2, 3 };
        mybe[1] = 8;
        System.out.println(mybe[1]);
        // ajout d'element dans le tableau de fruit
        fruits[3] = "banane";
        fruits[1] = "anane";
        fruits[0] = "nane";
        fruits[4] = "bana";
        fruits[2] = "ane";
        System.out.println(fruits[1]);
        System.out.println(fruits[3]);
        // parcourir le tableau

        for (int i = 0; i < fruits.length; i++) {
            System.out.println(" l'élement a l'index   " + i + "  est  " + fruits[i]);
        }

        for (String jus : fruits) {
            System.out.println(jus);
        }
        for (int num : number1) {
            System.out.println()(num);
        }
    }

}