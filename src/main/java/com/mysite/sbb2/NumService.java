package com.mysite.sbb2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NumService {
	@Autowired
	private NumMapper numMapper;
	
	public Num getNum(Integer id) {
		return numMapper.getNumById(id);
	}

}
