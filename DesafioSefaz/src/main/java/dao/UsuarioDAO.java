package dao;

import java.util.List;

import entidade.Usuario;

public interface UsuarioDAO {
	
	public void inserirUsuario(Usuario usuario);
	
	public void editarUsuario(Usuario usuario);
	
	public void deletarUsuario(Usuario usuario);
	
	public Usuario pesquisarLogin(String cpf);
	
	public List<Usuario> pesquisarUsuario(String cpf, String nome);

}
