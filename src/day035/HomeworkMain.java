package day035;

public class HomeworkMain {
    public static void main(String[] args) {
        HomeworkDaire daire=new HomeworkDaire(3.75);
        System.out.printf("daire yaricapi %1.2f: %n",daire.getYaricap());
        System.out.printf("daire alani: %1.2f %n",daire.getAlan());

        System.out.println("====================");
        HomeworkSilindir silindir=new HomeworkSilindir(5.55,7.25);
        System.out.printf("silinder yaricapi: %1.2f %n",silindir.getYaricap());
        System.out.printf("silindir yuksekligi: %1.2f %n",silindir.getYukseklik());
        System.out.printf("silindir alani: %1.2f %n",silindir.getAlan());
        System.out.printf("silindir hacim: %1.2f %n",silindir.getHacim());

    }
}
