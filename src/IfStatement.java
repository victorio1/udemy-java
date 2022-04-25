public class IfStatement {
    public static void main(String[] args) {
        boolean isBluetoothEnabled = true;
        int fileSended = 3;

        if (isBluetoothEnabled){
            //Send file
            fileSended++;
            int i = 0;
            i++;
            System.out.println("Archivo Enviado");
        } else {
            System.out.println("Por favor enciende tu Bluoetooth, para inicar la transferencia");
        }

        System.out.println(isBluetoothEnabled);
        System.out.println(fileSended);

    }
}
