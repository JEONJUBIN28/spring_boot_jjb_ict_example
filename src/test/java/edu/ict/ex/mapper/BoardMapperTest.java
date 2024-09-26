package edu.ict.ex.mapper;

import java.util.List;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import edu.ict.ex.page.Criteria;
import edu.ict.ex.vo.BoardVO;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootTest
class BoardMapperTest {

	@Autowired
	private BoardMapper boardMapper;

	@Disabled
	@Test
	void testGetList() {
		System.out.println(boardMapper.getList());

		for (BoardVO vo : boardMapper.getList()) {
			System.out.println(vo);
		}
	}

	@Test
	void testRead() {
		System.out.println(boardMapper.read(1));

	}

	@Test
	void testdelete() {

		int count = boardMapper.delete(36);

		System.out.println("삭제된 갯수" + count);

		if (boardMapper.read(36) == null) {
			System.out.println("제대로 삭제되었음");
		}

	}
	
	@Test
	void testUpdate() {
		
		BoardVO board = new BoardVO();
		board.setBid(63);
		board.setBname("홍길동");
		board.setBtitle("홍길동");
		board.setBcontent("홍길동");

		int count = boardMapper.updateBoard(board);

		System.out.println("업데이트 갯수" + count);
		
		System.out.println(boardMapper.read(63));

	}
	
	@Test
	void getListWithPaging() {
		
		Criteria criteria = new Criteria();
		
		criteria.setAmount(10);
		criteria.setPageNum(3);
		
		List<BoardVO>list = boardMapper.getListWithPaging(criteria);
		System.out.println(list);

	}
	
}
