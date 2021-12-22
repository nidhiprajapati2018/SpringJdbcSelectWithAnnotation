package com.jnit;

import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

public class SpringSelect {
	
	@Autowired
	private JdbcTemplate jt; 

	public void setJt(JdbcTemplate jt) {
		this.jt = jt;
	}

	public void exampleSelect() {

		List li = this.jt.queryForList("select * from student");
		Iterator it = li.iterator();
		while (it.hasNext()) {
			System.out.println(it.next().toString());
		}

	}

}
