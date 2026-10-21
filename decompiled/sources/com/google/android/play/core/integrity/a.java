package com.google.android.play.core.integrity;

/* JADX INFO: compiled from: com.google.android.play:integrity@@1.1.0 */
/* JADX INFO: loaded from: classes10.dex */
public final class a extends IntegrityTokenRequest.Builder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f46129a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Long f46130b;

    @Override // com.google.android.play.core.integrity.IntegrityTokenRequest.Builder
    public final IntegrityTokenRequest build() {
        String str = this.f46129a;
        if (str != null) {
            return new te.a(str, this.f46130b);
        }
        throw new IllegalStateException("Missing required properties: nonce");
    }

    @Override // com.google.android.play.core.integrity.IntegrityTokenRequest.Builder
    public final IntegrityTokenRequest.Builder setCloudProjectNumber(long j10) {
        this.f46130b = Long.valueOf(j10);
        return this;
    }

    @Override // com.google.android.play.core.integrity.IntegrityTokenRequest.Builder
    public final IntegrityTokenRequest.Builder setNonce(String str) {
        if (str == null) {
            throw new NullPointerException("Null nonce");
        }
        this.f46129a = str;
        return this;
    }
}
