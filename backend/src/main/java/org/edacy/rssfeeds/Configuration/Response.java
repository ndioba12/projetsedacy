package org.edacy.rssfeeds.Configuration;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;
import lombok.experimental.Accessors;

/** @author ndiane */

@Getter
@Setter
@Accessors(chain = true)
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
@AllArgsConstructor
@Builder
public class Response<T> {
	private Status status;
	private T payload;
	private Object errors;
	private Object metadata;
	private Object message;
	private String url;

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public T getPayload() {
		return payload;
	}



	public Object getErrors() {
		return errors;
	}

	public void setErrors(Object errors) {
		this.errors = errors;
	}

	public Object getMetadata() {
		return metadata;
	}

	public void setMetadata(Object metadata) {
		this.metadata = metadata;
	}

	public Object getMessage() {
		return message;
	}

	public void setMessage(Object message) {
		this.message = message;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public static <T> Response<T> notFound() {
		Response<T> response = new Response<>();
		response.setStatus(Status.NOT_FOUND);
		return response;
	}

	public static <T> Response<T> ok() {
		Response<T> response = new Response<>();
		response.setStatus(Status.OK);
		return response;
	}

	public static <T> Response<T> badRequest() {
		Response<T> response = new Response<>();
		response.setStatus(Status.BAD_REQUEST);
		return response;
	}

	public enum Status {
		OK, BAD_REQUEST, NOT_FOUND
	}

	@Getter
	@Accessors(chain = true)
	@JsonInclude(JsonInclude.Include.NON_NULL)
	@JsonIgnoreProperties(ignoreUnknown = true)
	public static class PageMetadata {
		private final int size;
		private final long nbElements;
		private final int nbPages;
		private final int number;

		public PageMetadata(int size, long nbElements, int nbPages, int number) {
			this.size = size;
			this.nbElements = nbElements;
			this.nbPages = nbPages;
			this.number = number;
		}
	}
}
