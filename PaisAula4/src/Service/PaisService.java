package Service;



import dao.PaisDAO;
import model.Pais;

public class PaisService {

	PaisDAO dao;
	
	public PaisService() {
		dao = new PaisDAO();
	}
	
	public void criar(Pais pais) {
		dao.criar(pais);
	}
	
	public void atualizar(Pais pais) {
		dao.atualizar(pais);
	}
	
	public void deletar(Pais pais) {
		dao.deletar(pais);
	}
	
	public Pais carregar(int id) {
		return dao.carregar(id);
	}
}
