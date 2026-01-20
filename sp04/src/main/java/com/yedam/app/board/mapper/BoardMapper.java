package com.yedam.app.board.mapper;

import java.util.List;

import com.yedam.app.board.service.BoardVO;

public interface BoardMapper {
	// 전체조회
	public List<BoardVO> selectAll();
	
	// 단건조회
	public BoardVO selectOne(BoardVO boardVO);
	
	// 등록
	public int insertInfo(BoardVO boardVO);
	
	// 수정
	public int updateInfo(BoardVO boardVO);
	
	// 삭제
	public int deleteInfo(int bId);
	
}
