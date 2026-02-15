package com.app.haetssal_jangteo.repository;

import com.app.haetssal_jangteo.mapper.StoreMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class StoreDAO {
    private final StoreMapper storeMapper;


}
