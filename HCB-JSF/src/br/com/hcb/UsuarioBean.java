package br.com.hcb;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;

import br.com.bean.Usuario;


@ManagedBean
public class UsuarioBean {

	private Usuario usuario = new Usuario();
	
	private List<Usuario> listaUsuario = new ArrayList<>();

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public List<Usuario> getListaUsuario() {
		return listaUsuario;
	}

	public void setListaUsuario(List<Usuario> listaUsuario) {
		this.listaUsuario = listaUsuario;
	}
	
	
	
}
