package org.edacy.rssfeeds.Repository;

import org.edacy.rssfeeds.entities.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**@author ndiane*/
@Repository
public interface ItemRepository extends JpaRepository<Item, Long>{
}
