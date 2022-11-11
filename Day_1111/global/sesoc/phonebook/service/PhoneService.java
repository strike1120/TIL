package global.sesoc.phonebook.service;

import java.util.Map;

import global.sesoc.phonebook.vo.Phone;

public interface PhoneService { //interface -> 메소드만 먼저 정의해놓겠다

	//Create
	public boolean insert(Phone phone); // map
	
	//Read
	public Phone selectOne(String number);
	
	//Update
	public boolean update(Phone phone); //age와 relation만 바꿀 것
	
	//delete
	public boolean delete(String number); //delete할때는 고유값으로.
	
	//전체조회
	public Map<String, Phone> selectAll();
}
