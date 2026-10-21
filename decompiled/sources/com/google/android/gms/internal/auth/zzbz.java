package com.google.android.gms.internal.auth;

import androidx.annotation.Nullable;
import com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse;
import java.io.UnsupportedEncodingException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
/* JADX INFO: loaded from: classes9.dex */
public abstract class zzbz extends FastSafeParcelableJsonResponse {
    @Override // com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse
    @Nullable
    public final byte[] toByteArray() {
        try {
            return toString().getBytes("UTF-8");
        } catch (UnsupportedEncodingException unused) {
            return null;
        }
    }
}
