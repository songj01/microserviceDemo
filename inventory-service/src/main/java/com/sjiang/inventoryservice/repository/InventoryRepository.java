package com.sjiang.inventoryservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sjiang.inventoryservice.model.Inventory;

import java.util.List;

public interface InventoryRepository extends JpaRepository<Inventory, Long> {
    List<Inventory> findBySkuCodeIn(List<String> skuCode);
}
