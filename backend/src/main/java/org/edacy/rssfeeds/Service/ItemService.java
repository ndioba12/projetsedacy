package org.edacy.rssfeeds.Service;

/**@author ndiane*/
import org.edacy.rssfeeds.entities.Item;
import org.edacy.rssfeeds.entities.ItemDto;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ItemService {
    Item saveItem(Item item);

    List<Item> saveAllItem(List<Item> items);

    Page<Item> getAllItemsPage(int page, int size);

    Item getItemById(Long id);

    Item updateItem(ItemDto itemDto);

     List<Item> getAllItems() ;

}
