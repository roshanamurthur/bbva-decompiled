package net.ipsoft.amelia.sdk;

/* JADX INFO: loaded from: classes12.dex */
public interface IDownloadListener {
    void onDownloadFailed(IAmeliaError iAmeliaError);

    void onDownloadSuccess(IDownloadedMmo iDownloadedMmo);
}
