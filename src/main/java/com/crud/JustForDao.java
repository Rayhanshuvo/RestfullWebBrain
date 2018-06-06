package com.crud;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


@Repository
@Transactional
public class JustForDao {
	

@Autowired
SessionFactory sessionFactory;

private Session getSession(){
	return sessionFactory.getCurrentSession();
}

public void saveA(List<JustForTryEntity> just){
	getSession().save(just);
}


}
