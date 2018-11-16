package com.jimisun.action;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.ServletActionContext;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;

import javax.servlet.ServletContext;
import java.io.InputStream;

/**
 * @Author:jimisun
 * @Description:
 * @Date:Created in 15:31 2018-11-15
 * @Modified By:
 */
public class DownloadAction extends ActionSupport {

    // 文件的Mime类型
    private String contentType;

    // 文件的放置路径
    private String filePath;

    // 要下载的文件名称
    private String fileName;

    // 该属性设置与否都可以，但是比如提供get方法
    private InputStream fileInputStream;

    public InputStream getFileInputStream() {
        // 以及文件的mime类型以及创建流
        ServletContext context = ServletActionContext.getServletContext();
        contentType = context.getMimeType(context.getRealPath(filePath + "/" + fileName));
        setContentType(contentType);
        return context.getResourceAsStream(filePath + "/" + fileName);
    }

    @Override
    @Action(value = "download", params = {"filePath", "/file"}, results = {
            @Result(name = SUCCESS, type = "stream",
                    params = {"contentType", "${contentType}", "inputName", "fileInputStream", "contentDisposition", "attachment;filename=\"${fileName}\""})
    })
    public String execute() throws Exception {
        return SUCCESS;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileInputStream(InputStream fileInputStream) {
        this.fileInputStream = fileInputStream;
    }

    public String getContentType() {
        return contentType;
    }

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }


}
