package sy.dao.impl;

import java.io.Serializable;

import org.springframework.stereotype.Repository;

import sy.dao.DeptDaoI;
import sy.model.DepGeninf;

@Repository("deptDao")
public class DeptDaoImpl extends BaseDaoImpl<DepGeninf> implements DeptDaoI {

}
