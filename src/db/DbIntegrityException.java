package db;

public class DbIntegrityException extends RuntimeException{

	private static final long serialVersionUID = 1L; // USAR QUANDO FOR EXCLUIR DADOS DE UMA TABELA

	public DbIntegrityException(String msg) {
      super(msg);
	
}
}
