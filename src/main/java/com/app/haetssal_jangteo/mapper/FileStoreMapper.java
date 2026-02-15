package com.app.haetssal_jangteo.mapper;

import com.app.haetssal_jangteo.domain.FileStoreVO;
import com.app.haetssal_jangteo.dto.FileStoreDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.Optional;

@Mapper
public interface FileStoreMapper {
    // 유저 프로필 이미지 등록
    public void insert(FileStoreVO fileStoreVO);

    // 유저 id로 프로필 이미지 조회
    public Optional<FileStoreDTO> selectById(Long userId);
}
