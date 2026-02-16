package com.app.haetssal_jangteo.controller.store;

import com.app.haetssal_jangteo.dto.StoreDTO;
import com.app.haetssal_jangteo.repository.StoreDAO;
import com.app.haetssal_jangteo.service.store.StoreService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.view.RedirectView;

@Controller
@RequestMapping("/store/**")
@RequiredArgsConstructor
public class StoreController {

    private final StoreService storeService;

    @GetMapping("write")
    public String goToWriteForm() {
        return "store/store-write";
    }

//    @PostMapping("write")
//    public RedirectView write(StoreDTO storeDTO, RedirectAttributes redirectAttributes) {
//
//        redirectAttributes("id", storeDTO.getId());
//        return RedirectView("/store/detail");
//    }

}
