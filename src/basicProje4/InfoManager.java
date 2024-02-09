package basicProje4;

public class InfoManager {
	
	public void lessonInfo(Info info) {
		System.out.println("Dersimizin adı: "+info.name);
		System.out.println("Dersi veren kurum: "+info.from);
		
		
	}
	
	public void teacherInfo(Teacher teacher,Info info) {
		System.out.println("Ders adı: "+info.name +"/ Dersin öğretmeni: "+teacher.getName()+" Branşı nedir? "+teacher.getBranch());
	}

}
