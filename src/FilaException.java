public class FilaException extends Exception{

    private String msg;
    public FilaException(String erro){
        super(erro);
        this.msg = erro;
    }
}
