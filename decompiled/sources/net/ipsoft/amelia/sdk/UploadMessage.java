package net.ipsoft.amelia.sdk;

/* JADX INFO: loaded from: classes12.dex */
public class UploadMessage {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public IResourceToRequest f84573a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public IAmeliaError f84574b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f84575c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f84576d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f84577e;

    public UploadMessage(boolean z10, boolean z11) {
        this.f84577e = z10;
        this.f84576d = z11;
    }

    public IAmeliaError getRecentError() {
        return this.f84574b;
    }

    public IResourceToRequest getResourceToRequest() {
        return this.f84573a;
    }

    public boolean isCancellable() {
        return this.f84577e;
    }

    public boolean isMultiple() {
        return this.f84576d;
    }

    public boolean isUploaded() {
        return this.f84575c;
    }

    public void setCancellable(boolean z10) {
        this.f84577e = z10;
    }

    public void setMultiple(boolean z10) {
        this.f84576d = z10;
    }

    public void setRecentError(IAmeliaError iAmeliaError) {
        this.f84574b = iAmeliaError;
    }

    public void setResourceToRequest(IResourceToRequest iResourceToRequest) {
        this.f84573a = iResourceToRequest;
    }

    public void setUploaded(boolean z10) {
        this.f84575c = z10;
    }
}
