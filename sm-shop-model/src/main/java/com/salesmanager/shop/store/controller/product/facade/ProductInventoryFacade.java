package com.salesmanager.shop.store.controller.product.facade;

import com.salesmanager.core.model.merchant.MerchantStore;
import com.salesmanager.core.model.reference.language.Language;
import com.salesmanager.shop.model.catalog.product.inventory.PersistableInventory;
import com.salesmanager.shop.model.catalog.product.inventory.ReadableInventory;
import com.salesmanager.shop.model.entity.ReadableEntityList;

public interface ProductInventoryFacade {

  //ReadableEntityList<ReadableInventory> getInventory(Long productId, MerchantStore store, String child, Language language, int page, int count);
  
  ReadableInventory get(Long inventoryId, MerchantStore store, Language language);
 
  ReadableEntityList<ReadableInventory> get(String sku, MerchantStore store, Language language, int page, int count);
  
  ReadableInventory add(PersistableInventory inventory, MerchantStore store, Language language);
  
  void update(PersistableInventory inventory, MerchantStore store, Language language);
  
  void delete(Long inventoryId, MerchantStore store);
  
  

}
