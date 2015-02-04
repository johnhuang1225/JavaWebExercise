package sy.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * DepGeninf entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "DEP_GENINF"
		, schema = "SSHE")
public class DepGeninf implements java.io.Serializable {

	// Fields

	private String depid;
	private String parentid;
	private String managerid;
	private String name;
	private String id;
	private String unitid;
	private String synopsis;
	private String respon;
	private String siblingorder;

	// Constructors

	/** default constructor */
	public DepGeninf() {
	}

	/** minimal constructor */
	public DepGeninf(String depid) {
		this.depid = depid;
	}

	/** full constructor */
	public DepGeninf(String depid, String parentid, String managerid, String name, String id, String unitid, String synopsis, String respon, String siblingorder) {
		this.depid = depid;
		this.parentid = parentid;
		this.managerid = managerid;
		this.name = name;
		this.id = id;
		this.unitid = unitid;
		this.synopsis = synopsis;
		this.respon = respon;
		this.siblingorder = siblingorder;
	}

	// Property accessors
	@Id
	@Column(name = "DEPID",  nullable = false, length = 30)
	public String getDepid() {
		return this.depid;
	}

	public void setDepid(String depid) {
		this.depid = depid;
	}

	@Column(name = "PARENTID", length = 30)
	public String getParentid() {
		return this.parentid;
	}

	public void setParentid(String parentid) {
		this.parentid = parentid;
	}

	@Column(name = "MANAGERID", length = 30)
	public String getManagerid() {
		return this.managerid;
	}

	public void setManagerid(String managerid) {
		this.managerid = managerid;
	}

	@Column(name = "NAME", length = 100)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "ID", length = 30)
	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Column(name = "UNITID", length = 30)
	public String getUnitid() {
		return this.unitid;
	}

	public void setUnitid(String unitid) {
		this.unitid = unitid;
	}

	@Column(name = "SYNOPSIS", length = 4000)
	public String getSynopsis() {
		return this.synopsis;
	}

	public void setSynopsis(String synopsis) {
		this.synopsis = synopsis;
	}

	@Column(name = "RESPON", length = 4000)
	public String getRespon() {
		return this.respon;
	}

	public void setRespon(String respon) {
		this.respon = respon;
	}

	@Column(name = "SIBLINGORDER", length = 30)
	public String getSiblingorder() {
		return this.siblingorder;
	}

	public void setSiblingorder(String siblingorder) {
		this.siblingorder = siblingorder;
	}

}