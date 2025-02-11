package com.daelim.board_back.service;

import org.springframework.http.ResponseEntity;

import com.daelim.board_back.dto.request.board.PatchBoardRequestDto;
import com.daelim.board_back.dto.request.board.PostBoardRequestDto;
import com.daelim.board_back.dto.request.board.PostCommentRequestDto;
import com.daelim.board_back.dto.response.board.DeleteBoardResponseDto;
import com.daelim.board_back.dto.response.board.GetBoardResponseDto;
import com.daelim.board_back.dto.response.board.GetCommentListResponseDto;
import com.daelim.board_back.dto.response.board.GetFavoriteListResponseDto;
import com.daelim.board_back.dto.response.board.IncreaseViewCountResoponseDto;
import com.daelim.board_back.dto.response.board.PatchBoardResponseDto;
import com.daelim.board_back.dto.response.board.PostBoardResponseDto;
import com.daelim.board_back.dto.response.board.PostCommentResponseDto;
import com.daelim.board_back.dto.response.board.PutFavoriteResponseDto;
import com.daelim.board_back.dto.response.board.GetLatestBoardListResponseDto;
import com.daelim.board_back.dto.response.board.GetLikedBoardsResponseDto;
import com.daelim.board_back.dto.response.board.GetSearchBoardListResponseDto;
import com.daelim.board_back.dto.response.board.GetTop3BoardListResponseDto;
import com.daelim.board_back.dto.response.board.GetUserBoardListResponseDto;


public interface BoardService {
    ResponseEntity<? super GetBoardResponseDto> getBoard(Integer boardNumber);
    ResponseEntity<? super GetFavoriteListResponseDto> getFavoriteList(Integer boardNumber);
    ResponseEntity<? super GetCommentListResponseDto> getCommentList(Integer boardNumber);
    ResponseEntity<? super GetLatestBoardListResponseDto> getLatestBoardList();
    ResponseEntity<? super GetTop3BoardListResponseDto> getTop3BoardList();
    ResponseEntity<? super GetSearchBoardListResponseDto> getSearchBoardList(String searchWord, String preSearchWord);
    ResponseEntity<? super GetUserBoardListResponseDto> getUserBoardList(String email);
    ResponseEntity<? super PostBoardResponseDto> postBoard(PostBoardRequestDto dto, String email);
    ResponseEntity<? super PostCommentResponseDto> postComment(PostCommentRequestDto dto, Integer boardNumber, String email);
    ResponseEntity<? super PutFavoriteResponseDto> putFavorite(Integer boardNumber, String email);
    ResponseEntity<? super PatchBoardResponseDto> patchBoard(PatchBoardRequestDto dto, Integer boardNumber, String email);
    ResponseEntity<? super IncreaseViewCountResoponseDto> increaseViewCount(Integer boardNumber);
    ResponseEntity<? super GetLikedBoardsResponseDto> getLikedBoards(String email);
    ResponseEntity<? super DeleteBoardResponseDto> deleteBoard(Integer boardNumber, String email);
}
