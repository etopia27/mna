package com.mna.dataCarrier.dto;

import java.util.Arrays;

import org.springframework.web.multipart.MultipartFile;

public class FileUploadDTO {

	private String extraField;

	private MultipartFile[] files;

	public String getExtraField() {
		return extraField;
	}

	public void setExtraField(String extraField) {
		this.extraField = extraField;
	}

	public MultipartFile[] getFiles() {
		return files;
	}

	public void setFiles(MultipartFile[] files) {
		this.files = files;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("FileUploadDTO [extraField=");
		builder.append(extraField);
		builder.append(", files=");
		builder.append(Arrays.toString(files));
		builder.append("]");
		return builder.toString();
	}

}