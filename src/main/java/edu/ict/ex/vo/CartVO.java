package edu.ict.ex.vo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/*이름       널?       유형            
-------- -------- ------------- 
USERNAME NOT NULL VARCHAR2(50)  
PASSWORD NOT NULL VARCHAR2(100) 
ENABLED           CHAR(1)    */ 

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class CartVO {
	
	private String product = "사이다";
	private int count =5;
	
	
}

