package tw.elliot.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import tw.elliot.domain.core.AbstractStrOidAuditable;

@Entity
@Table(name = "T_USER")
public class User extends AbstractStrOidAuditable {
	private static final long serialVersionUID = 6973853293711914826L;

	@Column(name = "NAME", length = 50)
	private String name;


	public User() {
		super();
	}

	public User(String name) {
		this.name = name;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}

