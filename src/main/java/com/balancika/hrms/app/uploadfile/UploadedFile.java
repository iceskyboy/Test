package com.balancika.hrms.app.uploadfile;

import org.springframework.web.multipart.MultipartFile;

public class UploadedFile {
    private MultipartFile multipartFile;
    
    public MultipartFile getMultipartFile() {
        return multipartFile;
    }
    public void setMultipartFile(MultipartFile multipartFile) {
        this.multipartFile = multipartFile;
    }
}
