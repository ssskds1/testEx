package kimdeoksoo.board.board.controller;

import kimdeoksoo.board.board.service.BoardService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/board")

public class BoardController {
	@Autowired private BoardService boardService;

	@RequestMapping("/list")
	public String boardView(Model model){
		model.addAttribute("boardList",boardService.getBoards());
		return "board/list";
	}
}
