package com.app.haetssal_jangteo.service.store;

import com.app.haetssal_jangteo.repository.StoreDAO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Transactional(rollbackFor = Exception.class)
public class StoreService {
    private final StoreDAO storeDAO;

    // 가게 등록

    // 가게 정보 수정

    // 가게 상태 변경

    // 가게 등록 승인

    // 장터 id로 소속 가게들 조회

    // id로 가게 조회

    // 가게 이름으로 조회

    // 소유주 id로 조회

    // 가게 비활성화

}
