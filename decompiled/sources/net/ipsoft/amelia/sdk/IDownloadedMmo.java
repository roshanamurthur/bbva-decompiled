package net.ipsoft.amelia.sdk;

import android.net.Uri;

/* JADX INFO: loaded from: classes12.dex */
public interface IDownloadedMmo {
    String getMimeType();

    IAmeliaError getRecentError();

    Uri getUri();
}
