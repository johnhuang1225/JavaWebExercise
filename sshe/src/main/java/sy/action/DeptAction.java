package sy.action;

import org.apache.log4j.Logger;

import java.util.List;

import org.apache.struts2.convention.annotation.Action;

import sy.model.DepGeninf;
import sy.pageModel.Dept;
import sy.service.DeptServiceI;

import com.opensymphony.xwork2.ModelDriven;

@Action("deptAction")
public class DeptAction extends BaseAction implements ModelDriven<Dept> {
	/**
	 * Logger for this class
	 */
	private static final Logger logger = Logger.getLogger(DeptAction.class);

	private Dept dept = new Dept();
	private DeptServiceI deptService;

	public Dept getDept() {
		return dept;
	}

	public void setDept(Dept dept) {
		this.dept = dept;
	}

	public DeptServiceI getDeptService() {
		return deptService;
	}

	public void setDeptService(DeptServiceI deptService) {
		this.deptService = deptService;
	}

	@Override
	public Dept getModel() {
		return dept;
	}
	
	public void getTreeNode(){
		List<Dept> list = deptService.getTreeNode(dept.getId());
		super.writeJson(list);
	}
	

}
