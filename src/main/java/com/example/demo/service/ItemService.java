package com.example.demo.service;


import com.example.demo.model.*;
import com.example.demo.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemService {

    @Autowired
    private BedroomItemRepository bedroomItemRepository;
    @Autowired
    private KitchenItemRepository kitchenItemRepository;
    @Autowired
    private LibraryItemRepository libraryItemRepository;
    @Autowired
    private LivingroomItemRepository livingroomItemRepository;
    @Autowired
    private StorageItemRepository storageItemRepository;


    // cateNo 별 전제품 찾기 ex.침실가구...
    public List<BedroomItem> getAllBedroomItems() {
        return bedroomItemRepository.findAll();
    }

    public List<KitchenItem> getAllKitchenItems() {
        return kitchenItemRepository.findAll();
    }

    public List<LibraryItem> getAllLibraryItems() {
        return libraryItemRepository.findAll();
    }

    public List<LivingroomItem> getAllLivingroomItems() {
        return livingroomItemRepository.findAll();
    }

    public List<StorageItem> getAllStorageItems() {
        return storageItemRepository.findAll();
    }


    // thisCateNo + cateNo 의 조합으로 제품들 찾기 ex.침실가구-협탁...
    public List<BedroomItem> getBedroomItemsByThisCateNo(String thisCateNo) {
        return bedroomItemRepository.findAllByThisCateNo(thisCateNo);
    }

    public List<KitchenItem> getKitchenItemsByThisCateNo(String thisCateNo) {
        return kitchenItemRepository.findAllByThisCateNo(thisCateNo);
    }

    public List<LibraryItem> getLibraryItemsByThisCateNo(String thisCateNo) {
        return libraryItemRepository.findAllByThisCateNo(thisCateNo);
    }

    public List<LivingroomItem> getLivingroomItemsByThisCateNo(String thisCateNo) {
        return livingroomItemRepository.findAllByThisCateNo(thisCateNo);
    }

    public List<StorageItem> getStorageItemsByThisCateNo(String thisCateNo) {
        return storageItemRepository.findAllByThisCateNo(thisCateNo);
    }


    // 작은 카테고리 각각 기본키로 제품 찾기기
    // 이것도 위에도... abstract 쓰고싶은데.... 우선 급하니까...

    public List<BedroomItem> getAllBedroomItemsByPK(int pdNo, String cateNo, String thisCateNo) {
        return bedroomItemRepository.findItemByPdNoAndCateNoAndThisCateNo(pdNo, cateNo, thisCateNo);
    }

    public List<KitchenItem> getAllKitchenItemsByPK(int pdNo, String cateNo, String thisCateNo) {
        return kitchenItemRepository.findItemByPdNoAndCateNoAndThisCateNo(pdNo, cateNo, thisCateNo);
    }

    public List<LibraryItem> getAllLibraryItemsByPK(int pdNo, String cateNo, String thisCateNo) {
        return libraryItemRepository.findItemByPdNoAndCateNoAndThisCateNo(pdNo, cateNo, thisCateNo);
    }

    public List<LivingroomItem> getAllLivingroomItemsByPK(int pdNo, String cateNo, String thisCateNo) {
        return livingroomItemRepository.findItemByPdNoAndCateNoAndThisCateNo(pdNo, cateNo, thisCateNo);
    }

    public List<StorageItem> getAllStorageItemsByPK(int pdNo, String cateNo, String thisCateNo) {
        return storageItemRepository.findItemByPdNoAndCateNoAndThisCateNo(pdNo, cateNo, thisCateNo);
    }


}
