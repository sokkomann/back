package com.app.haetssal_jangteo.repository;

import com.app.haetssal_jangteo.domain.StoreVO;
import com.app.haetssal_jangteo.mapper.StoreMapper;
import jakarta.mail.Store;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
@RequiredArgsConstructor
public class StoreDAO {
    private final StoreMapper storeMapper;

    // 가게 등록
    public void insert(StoreVO storeVO) {
        storeMapper.insert(storeVO);
    }

    // 가게 정보 수정
    public void update(StoreVO storeVO) {
        storeMapper.update(storeVO);
    }

    // 가게 상태 변경
    public void updateState(StoreVO storeVO) {
        storeMapper.updateState(storeVO);
    };

    // 가게 등록 승인
    public void updateIsConfirmed(Long id) {
        storeMapper.updateIsConfirmed(id);
    }

    // 전체 가게 조회
    public List<StoreVO> selectAll() {
        return storeMapper.selectAll();
    }

    // 장터 id로 소속 가게들 조회
    public List<StoreVO> selectByMarketId(Long marketId) {
        return storeMapper.selectByMarketId(marketId);
    }

    // id로 가게 조회
    public Optional<StoreVO> selectById(Long id) {
        return storeMapper.selectById(id);
    }

    // 가게 이름으로 조회
    public Optional<StoreVO> selectByStoreName(String storeName) {
        return storeMapper.selectByStoreName(storeName);
    }

    // 가게 소유주 id로 조회
    public Optional<StoreVO> selectByStoreOwnerId(Long ownerId) {
        return storeMapper.selectByStoreOwnerId(ownerId);
    }

    // 가게 비활성화
    public void delete(Long id) {
        storeMapper.delete(id);
    };

}
