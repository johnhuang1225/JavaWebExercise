package sy.service;

import java.io.Serializable;

import sy.model.Tuser;

public interface UserServiceI {
	public void save();
	public Serializable save(Tuser t);
}
