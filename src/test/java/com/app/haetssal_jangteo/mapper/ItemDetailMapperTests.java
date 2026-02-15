package com.app.haetssal_jangteo.mapper;

import com.app.haetssal_jangteo.dto.ItemDetailDTO;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

@SpringBootTest
@Slf4j
public class ItemDetailMapperTests {

    @Autowired
    private ItemDetailMapper itemDetailMapper;

    @Test
    public void selectById() {
        Optional<ItemDetailDTO> foundItemDetail = itemDetailMapper.selectById(7L);
        log.info("{}.......", foundItemDetail);
    }

}
