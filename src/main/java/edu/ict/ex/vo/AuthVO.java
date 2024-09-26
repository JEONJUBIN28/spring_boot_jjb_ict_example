package edu.ict.ex.vo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/*이름       널?       유형            
-------- -------- ------------- 
 username varchar2(50) not null, VARCHAR2(50)  
authority varchar2(50) not null, VARCHAR2(50) */ 

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class AuthVO {
	
	private String username;
	private String authority;
	
	
}

