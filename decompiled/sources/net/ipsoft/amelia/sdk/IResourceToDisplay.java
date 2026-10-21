package net.ipsoft.amelia.sdk;

/* JADX INFO: loaded from: classes12.dex */
public interface IResourceToDisplay {
    String getBucketName();

    long getByteCount();

    String getDescription();

    ContentDisplayOption getDisplayOption();

    boolean getDownload();

    String getFileSize();

    String getFilename();

    String getLabel();

    boolean shouldDisplayFileName();

    boolean shouldDisplayFileSize();
}
