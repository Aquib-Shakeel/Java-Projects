package in.pwskills.bean;

public class Model {

	static {
		System.out.println("Model class is loading .....");
	}
	
	public Model() {
		System.out.println("Model object is created .....");
	}
	private Integer mid;
	private String mtype;
	public Integer getMid() {
		return mid;
	}
	public void setMid(Integer mid) {
		this.mid = mid;
	}
	public String getMtype() {
		return mtype;
	}
	public void setMtype(String mtype) {
		this.mtype = mtype;
	}
	@Override
	public String toString() {
		return "Model [mid=" + mid + ", mtype=" + mtype + "]";
	}
	
	
	
}
