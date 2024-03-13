package kr.or.kosa;

import lombok.Data;
import lombok.AllArgsConstructor;

// vo DTO DOMAIN 이라고 부른다.

@Data
@AllArgsConstructor

public class Emp {
	private int empno;
	private String ename;
	private String job;
	
	
}


