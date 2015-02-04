package sy.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sy.dao.DeptDaoI;
import sy.model.DepGeninf;
import sy.pageModel.Dept;
import sy.service.DeptServiceI;

@Service("deptService")
public class DeptServiceImpl implements DeptServiceI {

	private DeptDaoI deptDao;

	public DeptDaoI getDeptDao() {
		return deptDao;
	}

	@Autowired
	public void setDeptDao(DeptDaoI deptDao) {
		this.deptDao = deptDao;
	}

	@Override
	public List<Dept> getTreeNode(String id) {
		List<Dept> deptResult = new ArrayList<Dept>();
		String hql = "";
		Map<String,Object> params = new HashMap<String,Object>();
		if (id == null || "".equals(id)) {
			hql = "from DepGeninf d where d.parentid = 'company'";
		} else {
			hql = "from DepGeninf d where d.parentid = :id";
			params.put("id", id);
		}
		
		List<DepGeninf> result = deptDao.find(hql,params);

		if (result != null && result.size() > 0) {
			for (DepGeninf depGeninf : result) {
				Dept dept = new Dept();
				copyDepGeninf2Dept(depGeninf, dept);
				deptResult.add(dept);
			}
		}
		return deptResult;
	}

	private void copyDepGeninf2Dept(DepGeninf depGeninf, Dept dept) {
		dept.setId(depGeninf.getDepid());
		dept.setText(depGeninf.getName());
		dept.setPid(depGeninf.getParentid());
		dept.setState("closed");

	}

}
