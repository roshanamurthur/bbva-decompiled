package com.google.firebase.auth;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import java.util.Map;

/* JADX INFO: compiled from: com.google.firebase:firebase-auth-interop@@20.0.0 */
/* JADX INFO: loaded from: classes10.dex */
public class GetTokenResult {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final String f47641a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map<String, Object> f47642b;

    @KeepForSdk
    public GetTokenResult(@Nullable String str, @NonNull Map<String, Object> map) {
        this.f47641a = str;
        this.f47642b = map;
    }

    public long getAuthTimestamp() {
        Integer num = (Integer) this.f47642b.get("auth_time");
        if (num == null) {
            return 0L;
        }
        return num.longValue();
    }

    @NonNull
    public Map<String, Object> getClaims() {
        return this.f47642b;
    }

    public long getExpirationTimestamp() {
        Integer num = (Integer) this.f47642b.get("exp");
        if (num == null) {
            return 0L;
        }
        return num.longValue();
    }

    public long getIssuedAtTimestamp() {
        Integer num = (Integer) this.f47642b.get("iat");
        if (num == null) {
            return 0L;
        }
        return num.longValue();
    }

    @Nullable
    public String getSignInProvider() {
        Map map = (Map) this.f47642b.get("firebase");
        if (map != null) {
            return (String) map.get("sign_in_provider");
        }
        return null;
    }

    @Nullable
    @KeepForSdk
    public String getSignInSecondFactor() {
        Map map = (Map) this.f47642b.get("firebase");
        if (map != null) {
            return (String) map.get("sign_in_second_factor");
        }
        return null;
    }

    @Nullable
    public String getToken() {
        return this.f47641a;
    }
}
