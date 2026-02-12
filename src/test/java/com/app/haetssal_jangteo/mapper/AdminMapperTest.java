package com.app.haetssal_jangteo.mapper;

import com.app.haetssal_jangteo.common.enumeration.State;
import com.app.haetssal_jangteo.domain.ItemVO;
import com.app.haetssal_jangteo.dto.ItemDTO;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.Optional;

@SpringBootTest
@Slf4j
public class AdminMapperTest {

    @Autowired
    private AdminMapper adminMapper;

    @Test
    public void testInsert() {
        ItemDTO itemDTO = new ItemDTO();
        itemDTO.setId(1L);
        itemDTO.setItemStoreId(2L);
        itemDTO.setItemCategoryId(100L);
        itemDTO.setItemName("사과 박스");
        itemDTO.setItemPrice("15000");
        itemDTO.setItemStock("40");
        itemDTO.setItemContent("사과 1 BOX (10KG)");
        itemDTO.setItemType("GENERAL");           // 일반 상품
        itemDTO.setItemDeliveryFee("3000");       // 배송비
        itemDTO.setItemState(State.ACTIVE);       // 상태 (활성)
        itemDTO.setItemViewCount(0);              // 조회수

        adminMapper.insert(itemDTO);
    }

    @Test
    public void testSelectById() {
//        Optional<ItemVO> founditem = adminMapper.selectById(1L);
//        log.info("{}........", founditem);
    }
}

