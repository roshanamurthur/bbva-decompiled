package com.google.android.play.core.integrity;

import androidx.annotation.Nullable;

/* JADX INFO: compiled from: com.google.android.play:integrity@@1.1.0 */
/* JADX INFO: loaded from: classes10.dex */
public abstract class IntegrityTokenRequest {

    /* JADX INFO: compiled from: com.google.android.play:integrity@@1.1.0 */
    public static abstract class Builder {
        public abstract IntegrityTokenRequest build();

        public abstract Builder setCloudProjectNumber(long j10);

        public abstract Builder setNonce(String str);
    }

    public static Builder builder() {
        return new a();
    }

    @Nullable
    public abstract Long cloudProjectNumber();

    public abstract String nonce();
}
