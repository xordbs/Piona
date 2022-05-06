package com.jeans.bloom.api.service;

import com.jeans.bloom.api.request.ItemWriteReq;
import com.jeans.bloom.db.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * HHS | 2022.05.06
 * @name ItemServiceImpl
 * @des 상품 API 사용을 위한 Service
 */
@Service
public class ItemServiceImpl implements ItemService{

    @Autowired
    private ItemRepository itemRepository;

    /**
     * HHS | 2022.05.06
     * @name writeItem
     * @api {post} /item
     * @des 상품 정보를 받아 상품 등록해주는 메소드
     */
    @Override
    public void writeItem(ItemWriteReq itemWriteReq) throws Exception{
        itemRepository.save(itemWriteReq.toItem());
    }
}
