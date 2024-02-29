package com.karina.test_dto;

import java.util.Arrays;
import java.util.List;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class TestController {
	@Autowired
	TestRepository trepo;
	
	@RequestMapping("/save")
	public String save()
	{
		Test t=new Test();
		t.setId(25);
		//t.setName("Jaydeep");
		//t.setCity("Koderma");
		t.setAge(17);
		
		trepo.save(t);
		return "data saved";
	}
	
	@RequestMapping("/saveall")
	public String saveAll()
	{
		Test t1=new Test();
		t1.setId(20);
		t1.setName("karina");
		t1.setCity("Tata");
		t1.setAge(19);
		
		Test t2=new Test();
		t2.setId(2);
		t2.setName("Priya");
		t2.setCity("Giridih");
		t2.setAge(12);
		
		Test t3=new Test();
		t3.setId(3);
		t3.setName("Gunjan");
		t3.setCity("Tilaiya");
		t3.setAge(11);
		
		Test t4=new Test();
		t4.setId(4);
		t4.setName("Riya");
		t4.setCity("Bokaro");
		t4.setAge(14);
		
		Test t5=new Test();
		t5.setId(5);
		t5.setName("Divya");
		t5.setCity("Phushro");
		t5.setAge(16);
		
		Test t6=new Test();
		t6.setId(6);
		t6.setName("Surbhi");
		t6.setCity("Deoghar");
		t6.setAge(18);
		
		Test t7=new Test();
		t7.setId(7);
		t7.setName("Mahi");
		t7.setCity("Dumka");
		t7.setAge(20);
		
		Test t8=new Test();
		t8.setId(8);
		t8.setName("Nisha");
		t8.setCity("Ramgarh");
		t8.setAge(27);
		
		Test t9=new Test();
		t9.setId(9);
		t9.setName("Mehak");
		t9.setCity("Jamtara");
		t9.setAge(23);
		
		Test t10=new Test();
		t10.setId(10);
		t10.setName("Diksha");
		t10.setCity("Pakud");
		t10.setAge(25);
		
		Test t11=new Test();
		t11.setId(11);
		t11.setName("Jaya");
		t11.setCity("Latehar");
		t11.setAge(33);
		
		Test t12=new Test();
		t12.setId(12);
		t12.setName("Shreya");
		t12.setCity("Chatra");
		t12.setAge(32);
		
		Test t13=new Test();
		t13.setId(13);
		t13.setName("Sakshi");
		t13.setCity("Simdega");
		t13.setAge(07);
		
		Test t14=new Test();
		t14.setId(14);
		t14.setName("Aisha");
		t14.setCity("Gumla");
		t14.setAge(30);
		
		Test t16=new Test();
		t16.setId(15);
		t16.setName("Vrinda");
		t16.setCity("Hazaribag");
		t16.setAge(40);
		
		Test t17=new Test();
		t17.setId(16);
		t17.setName("Mansi");
		t17.setCity("Ranchi");
		t17.setAge(9);
		
		Test t18=new Test();
		t18.setId(17);
		t18.setName("Vrsha");
		t18.setCity("Khunti");
		t18.setAge(13);
		
		Test t19=new Test();
		t19.setId(18);
		t19.setName("Manvi");
		t19.setCity("Garhwa");
		t19.setAge(03);
		
		Test t20=new Test();
		t20.setId(19);
		t20.setName("Kanak");
		t20.setCity("Chaibasa");
		t20.setAge(02);
		
		List<Test>list=Arrays.asList(t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11,t12,t13,t14,t16,t17,t18,t19,t20);
		trepo.saveAll(list);
		return "data is saved....!";
	}
	@RequestMapping("/all")
	public List<Test> all()
	{
		return trepo.findAll();
	}
	
	@RequestMapping("/new/{id}")
	public Test byid(@PathVariable int id)
	{
		return trepo.findById(id);
}
}
