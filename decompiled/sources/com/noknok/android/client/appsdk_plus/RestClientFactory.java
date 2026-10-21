package com.noknok.android.client.appsdk_plus;

import android.content.Context;

/* JADX INFO: loaded from: classes11.dex */
public abstract class RestClientFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static RestClientFactory f62955a;

    public static RestClientFactory getInstance() {
        if (f62955a == null) {
            setInstance(new DefaultRestClientFactory());
        }
        return f62955a;
    }

    public static void setInstance(RestClientFactory restClientFactory) {
        synchronized (RestClientFactory.class) {
            f62955a = restClientFactory;
        }
    }

    public abstract IRestClient createRestClient(Context context, String str);
}
