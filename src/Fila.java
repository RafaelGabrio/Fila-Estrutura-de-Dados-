public class Fila {

    private Object[] elemento;
    private int inicial, ultimo, total;

    public Fila() {
        elemento = new Object[5];
        inicial = 0;
        ultimo = 0;
        total = 0;
    }

    public void inserir(Object e) {
        if (total == 4)
            ultimo = 0;
        elemento[ultimo] = e;
        ultimo++;
        total++;
    }

    public Object remove(){
        Object num = elemento[inicial];
        elemento[inicial] = null;
        inicial++;
        total--;
        return num;
    }

    public boolean isFull() {
        int cont = 0;
        for (int i = 0; i < 5; i++){
            if (elemento[i] != null)
                cont++;
        }
        if (cont == 4)
            return true;
        return false;
    }

}