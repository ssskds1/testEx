package kimdeoksoo.board.board.domain;

import java.sql.Date;

public class Board {
	/*create table "board" (
			  "board_no" number not null, -- 게시판번호
			  "board_title" VARCHAR2(200) null, -- 게시판 제목
			  "board_content" varchar2(4000) null, --게시판 내용
			  "board_date" date null --작성일
			  );*/

		private int boardNo;
		private String boardTitle;
		private String boardContent;
		private Date boardDate;
		public int getBoardNo() {
			return boardNo;
		}
		public void setBoardNo(int boardNo) {
			this.boardNo = boardNo;
		}
		public String getBoardTitle() {
			return boardTitle;
		}
		public void setBoardTitle(String boardTitle) {
			this.boardTitle = boardTitle;
		}
		public String getBoardContent() {
			return boardContent;
		}
		public void setBoardContent(String boardContent) {
			this.boardContent = boardContent;
		}
		public Date getBoardDate() {
			return boardDate;
		}
		public void setBoardDate(Date boardDate) {
			this.boardDate = boardDate;
		}
		@Override
		public String toString() {
			return "Board [boardNo=" + boardNo + ", boardTitle=" + boardTitle
					+ ", boardContent=" + boardContent + ", boardDate="
					+ boardDate + "]";
		}
		
		
}
