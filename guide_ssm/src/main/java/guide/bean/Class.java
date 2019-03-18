package guide.bean;

public class Class {
	private String class_id;
	private String depar_id;
	private String class__name;
	private String phone_num;
	private String monitor_id;
	public Class(String class_id, String depar_id, String class__name, String phone_num, String monitor_id) {
		super();
		this.class_id = class_id;
		this.depar_id = depar_id;
		this.class__name = class__name;
		this.phone_num = phone_num;
		this.monitor_id = monitor_id;
	}
	public Class() {
	}
	public String getClass_id() {
		return class_id;
	}
	public void setClass_id(String class_id) {
		this.class_id = class_id;
	}
	public String getDepar_id() {
		return depar_id;
	}
	public void setDepar_id(String depar_id) {
		this.depar_id = depar_id;
	}
	public String getClass__name() {
		return class__name;
	}
	public void setClass__name(String class__name) {
		this.class__name = class__name;
	}
	public String getPhone_num() {
		return phone_num;
	}
	public void setPhone_num(String phone_num) {
		this.phone_num = phone_num;
	}
	public String getMonitor_id() {
		return monitor_id;
	}
	public void setMonitor_id(String monitor_id) {
		this.monitor_id = monitor_id;
	}
	@Override
	public String toString() {
		return "Class [class_id=" + class_id + ", depar_id=" + depar_id + ", class__name=" + class__name
				+ ", phone_num=" + phone_num + ", monitor_id=" + monitor_id + "]";
	}
	
}
