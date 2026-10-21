package com.bbva.gp2.android.libs.networking.http;

import com.bbva.gp2.android.libs.networking.http.requests.HttpRequest;
import com.bbva.gp2.android.libs.networking.http.responses.HttpMultipartResponse;
import com.bbva.gp2.android.libs.networking.http.responses.HttpResponse;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Gp2HttpClient.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\b"}, d2 = {"Lcom/bbva/gp2/android/libs/networking/http/Gp2HttpClient;", "", "execute", "Lcom/bbva/gp2/android/libs/networking/http/responses/HttpResponse;", "request", "Lcom/bbva/gp2/android/libs/networking/http/requests/HttpRequest;", "executeMultipartMixed", "Lcom/bbva/gp2/android/libs/networking/http/responses/HttpMultipartResponse;", "gp2-ethermobile-network_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public interface Gp2HttpClient {
    @NotNull
    HttpResponse execute(@NotNull HttpRequest request);

    @NotNull
    HttpMultipartResponse executeMultipartMixed(@NotNull HttpRequest request);
}
