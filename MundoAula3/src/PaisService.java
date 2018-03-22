import java.util.ArrayList;

public class PaisService {
	PaisDAO paisDao = new PaisDAO();
	Pais pais = new Pais();
	ArrayList<Pais> vet = new ArrayList<Pais>();

	public void criar() {
		paisDao.criar();
	}

	public void atualizar() {
		paisDao.atualizar();
	}

	public void excluir() {
		paisDao.excluir();
	}

	public void carregar() {
		paisDao.carregar();
	}
	
	public Pais maiorPop(){
		return pais;		
	}
	
	public Pais menorArea() {
		return pais;
	}
	
	public ArrayList<Pais> vetPais() {
		return vet;
	}
	
	
	
}