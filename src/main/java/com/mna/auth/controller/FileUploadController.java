package com.mna.auth.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.mna.dataCarrier.dto.FileUploadDTO;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/file")
public class FileUploadController {

	private final Logger logger = LoggerFactory.getLogger(FileUploadController.class);

	@RequestMapping("/upload")
	public ResponseEntity<?> uploadFile(@RequestParam("file") MultipartFile uploadfile) {

		logger.debug("Single file upload!");

		if (uploadfile.isEmpty()) {
			return new ResponseEntity("please select a file!", HttpStatus.OK);
		}

		return new ResponseEntity("Successfully uploaded - " + uploadfile.getOriginalFilename(), new HttpHeaders(),
				HttpStatus.OK);

	}

	@RequestMapping("/upload/multi")
	public ResponseEntity<?> uploadFileMulti(@RequestParam("files") MultipartFile[] uploadfiles) {

		logger.debug("Multiple file upload!");

		// Get file name
		List<String> uploadedFileName = new ArrayList<>();
		for (MultipartFile multipartFile : uploadfiles) {

			if (!StringUtils.isEmpty(multipartFile.getOriginalFilename())) {
				uploadedFileName.add(multipartFile.getOriginalFilename());
			}
		}

		if (CollectionUtils.isEmpty(uploadedFileName)) {
			return new ResponseEntity("please select a file!", HttpStatus.OK);
		}
		return new ResponseEntity("Successfully uploaded - " + uploadedFileName, HttpStatus.OK);

	}

}
