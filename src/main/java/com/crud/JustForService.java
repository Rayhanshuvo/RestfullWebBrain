package com.crud;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class JustForService {

	List<JustForTryEntity> just = new ArrayList<>(Arrays.asList(new JustForTryEntity(1, "ray", "Shuvo"),
			new JustForTryEntity(4, "A", "B")));

	public List<JustForTryEntity> getAllTopics() {

		return just;
	}

	public JustForTryEntity getSingleValue(int id) {
		return just.stream().filter(t -> t.getId().equals(id)).findFirst().get();

	}

	public void addProcessForSave(JustForTryEntity justForTryEntity) {
		// TODO Auto-generated method stub
		just.add(justForTryEntity);
		
	}

}
