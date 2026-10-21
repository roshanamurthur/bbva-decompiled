package com.noknok.android.client.appsdk_plus;

import android.content.Context;
import android.util.Pair;
import java.util.HashMap;

/* JADX INFO: loaded from: classes11.dex */
public class DefaultRestClientFactory extends RestClientFactory {

    /* JADX INFO: renamed from: com.noknok.android.client.appsdk_plus.DefaultRestClientFactory$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f62930a;

        static {
            int[] iArr = new int[AuthType.values().length];
            f62930a = iArr;
            try {
                iArr[AuthType.COOKIE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f62930a[AuthType.MITREID.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f62930a[AuthType.PING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f62930a[AuthType.OPENAM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f62930a[AuthType.JSON.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    @Override // com.noknok.android.client.appsdk_plus.RestClientFactory
    public IRestClient createRestClient(Context context, String str) {
        if (str == null) {
            return new DefaultRestClient(context.getApplicationContext());
        }
        HashMap map = new HashMap();
        int i10 = AnonymousClass1.f62930a[AuthType.valueOf(str).ordinal()];
        if (i10 == 1) {
            DefaultRestClient.SessionType sessionType = DefaultRestClient.SessionType.COOKIE;
            map.put("default", new Pair(sessionType, sessionType));
            return new DefaultRestClient(context.getApplicationContext(), map);
        }
        if (i10 == 2 || i10 == 3) {
            map.put("default", new Pair(DefaultRestClient.SessionType.HEADER, DefaultRestClient.SessionType.JSON));
            return new OidcRestClient(context.getApplicationContext(), map);
        }
        if (i10 == 4 || i10 == 5) {
            return new DefaultRestClient(context.getApplicationContext());
        }
        throw new IllegalArgumentException();
    }
}
