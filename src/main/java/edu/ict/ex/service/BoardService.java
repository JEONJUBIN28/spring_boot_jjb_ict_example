package edu.ict.ex.service;

import java.util.List;

import edu.ict.ex.vo.BoardVO;


public interface BoardService {

	 List<BoardVO> getList();
	 BoardVO get(int bno);
	 
	 int remove(int bno);
	 
	 int write(String bname, String btitle, String bcontent);
	 
	 int modify(String bname, String btitle, String bcontent, int bid);
}
