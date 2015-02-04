package sy.service;

import java.util.List;

import sy.pageModel.Dept;

public interface DeptServiceI {
	public List<Dept> getTreeNode(String id);
}
