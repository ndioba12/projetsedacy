package org.edacy.rssfeeds.Controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import org.edacy.rssfeeds.Service.ItemService;
import org.edacy.rssfeeds.Configuration.Response;
import org.edacy.rssfeeds.entities.Item;
import org.edacy.rssfeeds.entities.ItemDto;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**@author ndiane*/
@RestController
@RequiredArgsConstructor
@RequestMapping(value = "item")
@Slf4j
@CrossOrigin(origins = "*")
public class ItemController {
    private  ItemService itemService;

    @GetMapping(value = "getAllItems")
    public Response<?> getAllItems() {
        List<Item> items = itemService.getAllItems();
        return Response.ok();
    }

    @GetMapping(value = "getById/{id}")
    public Response<?> getItemById(@PathVariable("id") Long id) {
        return Response.ok();
    }

    @PutMapping(value = "updateItem")
    public Response<?> updateItem(@RequestBody ItemDto itemDto) {
        return Response.ok();
    }
 
}
