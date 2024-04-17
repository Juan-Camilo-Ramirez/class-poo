package exercise5;

    public class DVDPlayer {

    boolean canRecord = false;

    void recordDVD(){
        System.out.println("DVD recording");
    }
    void PlayDVD(){
        System.out.println("DVD playing");//faltaba definir el metodo PlayDVD se estaba intentando llamar sin haber estado definido
    }

}
class DVDPlayerTestDrive {
    public static void main(String[] args) {
        DVDPlayer d = new DVDPlayer();
        d.canRecord = true;
        d.PlayDVD();

        if (d.canRecord == true){
            d.recordDVD();
        }
    }
}
