package net.pushover.client;

import org.apache.http.entity.ContentType;

public class PushoverImage {
    private byte[] imageByteStream;

    private ContentType contentType = ContentType.IMAGE_JPEG;

    private String fileName;

    public byte[] getImageByteStream() {
        return imageByteStream;
    }

    public void setImageByteStream(byte[] imageByteStream) {
        this.imageByteStream = imageByteStream;
    }

    public ContentType getContentType() {
        return contentType;
    }

    public void setContentType(ContentType contentType) {
        this.contentType = contentType;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }
}
