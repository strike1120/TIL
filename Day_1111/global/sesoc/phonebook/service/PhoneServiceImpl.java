package global.sesoc.phonebook.service;

import java.util.HashMap;
import java.util.Map;

import global.sesoc.phonebook.vo.Phone;

public class PhoneServiceImpl implements PhoneService { //Service 인터페이스를 구현한 구현체 class.
	Map<String, Phone> map = new HashMap<>();
	
	@Override
	public boolean insert(Phone phone) { 
		String key = phone.getPhone(); //1. Map에서 전화번호를 뽑는다
		if(map.get(key) != null){ // 3.데이터가 없으면 삽입, 있으면(=get()으로 꺼내지면) 삽입불가
			return false;
		}
		
		map.put(key, phone);
		return true;
	}

	@Override
	public Phone selectOne(String number) {
		return map.get(number);
	}

	@Override
	public boolean update(Phone phone) {
		//전화번호를 꺼낸다
		String key = phone.getPhone();
		map.put(key, phone);
		return true;
	}

	@Override
	public boolean delete(String number) {
		Phone p = map.remove(number);
		if(p != null) return true; //삭제가 된경우
		return false;
	}

	@Override
	public Map<String, Phone> selectAll() {
		return map;
	}

}
