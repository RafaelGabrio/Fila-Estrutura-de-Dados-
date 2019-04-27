public class Cliente {

    public static void main(String[] args) {
        Fila fila = new Fila();
        fila.inserir(1);
        fila.inserir(2);
        fila.inserir(3);
        fila.inserir(4);
        //fila.inserir(5);
        System.out.println(fila.remove());
        System.out.println(fila.remove());
        System.out.println(fila.remove());
        fila.inserir(9);
        System.out.println(fila.remove());
        System.out.println(fila.remove());
        System.out.println(fila.isFull());
    }
}
