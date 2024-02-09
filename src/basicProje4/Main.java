package basicProje4;

public class Main {

	public static void main(String[] args) {
		
		//constructor olmadan sınıf çağırma ve özelliklere değer verme,,
		/*
		Info info=new Info();
		info.id=1;
		info.name="Kodlama Bilgisi";
		info.from="kodlamaio";
		info.year=2024;
		*/
		
		//constructor info sınıfını çağırma:
		Info info=new Info(1, "Kodlama Bilgisi","Kodlamaio", 2024);
		
		
		
		System.out.println(info.from);
		
		//öğretmen sınıfını çağırdık ve özelliklere setter ile değer verdik. getter ile de istediğimiz yerde yazdırabiliriz.
		Teacher teacher=new Teacher();
		teacher.setName("yunus");
		teacher.setLastName("Akgül");
		teacher.setBranch("java developer");
		teacher.setOld(23);
		teacher.setSchool("Anadolu Üniversitesi");
		
		InfoManager infoManager=new InfoManager();
		
		infoManager.lessonInfo(info);
		
		infoManager.teacherInfo(teacher, info);

	}

}
