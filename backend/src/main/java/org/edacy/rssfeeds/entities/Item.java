package org.edacy.rssfeeds.entities;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;


/**@author ndiane
 
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
@EqualsAndHashCode
@Entity
@Table(name = "Items")
public class Item implements Serializable {
    private static final long serialVersionUID = 1L;
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;
    @Column(name = "title")
    private String title;
    @Column(name = "pubDate")
    private String pubDate;
    @Column(name = "description", length = 1500)
    private String description;
    @Column(name = "link")
    private String link;
    @Column(name = "mediaContent")
    private String mediaContent;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getPubDate() {
		return pubDate;
	}
	public void setPubDate(String pubDate) {
		this.pubDate = pubDate;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getLink() {
		return link;
	}
	public void setLink(String link) {
		this.link = link;
	}
	public String getMediaContent() {
		return mediaContent;
	}
	public void setMediaContent(String mediaContent) {
		this.mediaContent = mediaContent;
	}
	public static Object builder() {
		// TODO Auto-generated method stub
		return null;
	}

    


}
