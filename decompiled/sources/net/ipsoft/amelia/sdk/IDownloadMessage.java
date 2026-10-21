package net.ipsoft.amelia.sdk;

import android.content.Context;
import android.net.Uri;
import java.io.File;

/* JADX INFO: loaded from: classes12.dex */
public interface IDownloadMessage {
    void download(IDownloadListener iDownloadListener, Context context);

    void download(IDownloadListener iDownloadListener, File file);

    ContentDisplayOption getContentDisplayOption();

    IAmeliaError getError();

    IResourceToDisplay getFileInfo();

    String getMimeType();

    Uri getUri();
}
