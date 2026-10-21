package net.ipsoft.amelia.sdk.internal.common;

import android.net.Uri;
import net.ipsoft.amelia.sdk.IAmeliaError;
import net.ipsoft.amelia.sdk.IDownloadedMmo;

/* JADX INFO: loaded from: classes12.dex */
public class i implements IDownloadedMmo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Uri f84873a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f84874b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final IAmeliaError f84875c;

    public i(Uri uri, String str) {
        this.f84873a = uri;
        this.f84874b = str;
        this.f84875c = null;
    }

    @Override // net.ipsoft.amelia.sdk.IDownloadedMmo
    public String getMimeType() {
        return this.f84874b;
    }

    @Override // net.ipsoft.amelia.sdk.IDownloadedMmo
    public IAmeliaError getRecentError() {
        return this.f84875c;
    }

    @Override // net.ipsoft.amelia.sdk.IDownloadedMmo
    public Uri getUri() {
        return this.f84873a;
    }

    public i(IAmeliaError iAmeliaError) {
        this.f84873a = null;
        this.f84874b = null;
        this.f84875c = iAmeliaError;
    }
}
