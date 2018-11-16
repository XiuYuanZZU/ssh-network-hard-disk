package com.jimisun.action;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;

/**
 * @Author:jimisun
 * @Description:
 * @Date:Created in 14:27 2018-11-15
 * @Modified By:
 */
public class UploadAction extends ActionSupport {
    private File[] upload;
    private String[] uploadFileName;
    private String uploadPath;
    private String result;

    public File[] getUpload() {
        return upload;
    }

    public void setUpload(File[] upload) {
        this.upload = upload;
    }
    

    public String[] getUploadFileName() {
        return uploadFileName;
    }

    public void setUploadFileName(String[] uploadFileName) {
        this.uploadFileName = uploadFileName;
    }

    public String getUploadPath() {
        return uploadPath;
    }

    public void setUploadPath(String uploadPath) {
        this.uploadPath = uploadPath;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    @Override
    @Action(value = "UploadAction", params = {"uploadPath", "D:/"}, results = {
            @Result(name = "success", location = "/result.jsp")
    })
    public String execute() throws Exception {
        for (int i = 0; i < uploadFileName.length; i++) {
            String fn = uploadPath + uploadFileName[i];
            FileOutputStream fileOutputStream = new FileOutputStream(fn);
            InputStream inputStream = new FileInputStream(upload[i]);
            byte[] buffer = new byte[8192];
            int count = 0;
            while ((count = inputStream.read(buffer)) > 0) {
                fileOutputStream.write(buffer, 0, count);
            }
            fileOutputStream.close();
            inputStream.close();
        }
        result = "文件上传成功!";
        return "success";
    }
}
