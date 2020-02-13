package kimdeoksoo.board.board.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kimdeoksoo.board.board.dao.mapper.BoardMapper;
import kimdeoksoo.board.board.domain.Board;

@Repository
public class BoardDaoImpl implements BoardDao{
	@Autowired private BoardMapper mapper = null;
	@Override
	public List<Board> getBoards() {
		return mapper.getBoards();
	}

}
