package br.com.struts2sessionawareintegration.action;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.interceptor.SessionAware;
import java.util.Map;

public class LoginAction extends ActionSupport implements SessionAware {

	private static final long serialVersionUID = 9130975522874077086L;
	private String nome;
	private String senha;
	private Map<String, Object> session;

	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	@Override
	public String execute() {

		if (nome.equals("Jean") && senha.equals("1996")) {

			session.put("nome", nome);
			return SUCCESS;
		} else {
			System.out.println("Credenciais inválidas. Por favor, tente novamente.");
			return INPUT;
		}
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

}
