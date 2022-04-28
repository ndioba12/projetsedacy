package org.edacy.rssfeeds.entities;


import lombok.Data;

/**@author ndiane*/
@Data
public class ItemDto {
    private Long idItem;
    private String title;
    private String description;
	public Long getIdItem() {
		return idItem;
	}
	public void setIdItem(Long idItem) {
		this.idItem = idItem;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
    
}
