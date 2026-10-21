package com.google.firebase.appcheck.internal;

import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.common.internal.Preconditions;
import com.google.firebase.appcheck.AppCheckToken;
import com.google.firebase.appcheck.internal.util.Clock;
import com.google.firebase.appcheck.internal.util.TokenParser;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public final class DefaultAppCheckToken extends AppCheckToken {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f47595a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f47596b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f47597c;

    @VisibleForTesting
    public DefaultAppCheckToken(@NonNull String str, long j10, long j11) {
        Preconditions.checkNotEmpty(str);
        this.f47595a = str;
        this.f47597c = j10;
        this.f47596b = j11;
    }

    public static long a(@NonNull String str, @NonNull Map map) {
        Preconditions.checkNotNull(map);
        Preconditions.checkNotEmpty(str);
        Integer num = (Integer) map.get(str);
        if (num == null) {
            return 0L;
        }
        return num.longValue();
    }

    @NonNull
    public static DefaultAppCheckToken constructFromAppCheckTokenResponse(@NonNull AppCheckTokenResponse appCheckTokenResponse) {
        long jA;
        Preconditions.checkNotNull(appCheckTokenResponse);
        try {
            jA = (long) (Double.parseDouble(appCheckTokenResponse.getTimeToLive().replace("s", "")) * 1000.0d);
        } catch (NumberFormatException unused) {
            Map<String, Object> tokenClaims = TokenParser.parseTokenClaims(appCheckTokenResponse.getToken());
            jA = 1000 * (a("exp", tokenClaims) - a("iat", tokenClaims));
        }
        return new DefaultAppCheckToken(appCheckTokenResponse.getToken(), jA, new Clock.DefaultClock().currentTimeMillis());
    }

    @NonNull
    public static DefaultAppCheckToken constructFromRawToken(@NonNull String str) {
        Preconditions.checkNotNull(str);
        Map<String, Object> tokenClaims = TokenParser.parseTokenClaims(str);
        long jA = a("iat", tokenClaims);
        return new DefaultAppCheckToken(str, (a("exp", tokenClaims) - jA) * 1000, jA * 1000);
    }

    @Override // com.google.firebase.appcheck.AppCheckToken
    public long getExpireTimeMillis() {
        return this.f47596b + this.f47597c;
    }

    @Override // com.google.firebase.appcheck.AppCheckToken
    @NonNull
    public String getToken() {
        return this.f47595a;
    }
}
