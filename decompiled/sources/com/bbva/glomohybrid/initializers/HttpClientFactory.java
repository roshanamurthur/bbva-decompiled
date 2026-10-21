package com.bbva.glomohybrid.initializers;

import java.net.CookieHandler;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.JavaNetCookieJar;
import okhttp3.OkHttpClient;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: HttpClientFactory.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/bbva/glomohybrid/initializers/HttpClientFactory;", "", "()V", "create", "Lokhttp3/OkHttpClient;", "cookieHandler", "Ljava/net/CookieHandler;", "app_mexicoProdGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class HttpClientFactory {

    @NotNull
    public static final HttpClientFactory INSTANCE = new HttpClientFactory();

    @NotNull
    public final OkHttpClient create(@NotNull CookieHandler cookieHandler) {
        Intrinsics.checkNotNullParameter(cookieHandler, "cookieHandler");
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        builder.cookieJar(new JavaNetCookieJar(cookieHandler));
        TimeUnit timeUnit = TimeUnit.SECONDS;
        builder.callTimeout(30L, timeUnit);
        builder.readTimeout(30L, timeUnit);
        builder.writeTimeout(30L, timeUnit);
        builder.connectTimeout(30L, timeUnit);
        return builder.build();
    }
}
