package Social_Media_Task;

public class Picture {
    private byte[] image;
    private String extension;
    private String caption;

    public byte[] getImage() {
        return image;
    }

    public String getExtension() {
        return extension;
    }

    public String getCaption() {
        return caption;
    }

    public void setCaption(String caption) {
        this.caption = caption;
    }

    public Picture(byte[] image, String extension, String caption) {
        this.image = image;
        this.extension = extension;
        this.caption = caption;
    }
}
