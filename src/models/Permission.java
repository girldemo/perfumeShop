package models;


public class Permission {
	private int id;
	private CatUser catUser;
	private Boolean addquyen;
	private Boolean editquyen;
	private Boolean delquyen;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public CatUser getCatUser() {
		return catUser;
	}
	public void setCatUser(CatUser catUser) {
		this.catUser = catUser;
	}
	public Boolean getAddquyen() {
		return addquyen;
	}
	public void setAddquyen(Boolean addquyen) {
		this.addquyen = addquyen;
	}
	public Boolean getEditquyen() {
		return editquyen;
	}
	public void setEditquyen(Boolean editquyen) {
		this.editquyen = editquyen;
	}
	public Boolean getDelquyen() {
		return delquyen;
	}
	public void setDelquyen(Boolean delquyen) {
		this.delquyen = delquyen;
	}
}
