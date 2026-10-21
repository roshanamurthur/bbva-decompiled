package com.bbva.gp2.android.libs.networking.http.requests;

import ad.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: HttpRequestServerURI.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0003H\u0016J\b\u0010\u0006\u001a\u00020\u0003H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/bbva/gp2/android/libs/networking/http/requests/ServerURIByURL;", "Lcom/bbva/gp2/android/libs/networking/http/requests/HttpRequestServerURI;", "url", "", "(Ljava/lang/String;)V", "getServerURI", "toString", "gp2-ethermobile-network_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class ServerURIByURL extends HttpRequestServerURI {

    @NotNull
    private final String url;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ServerURIByURL(@NotNull String url) {
        super(null);
        Intrinsics.checkNotNullParameter(url, "url");
        this.url = url;
    }

    @Override // com.bbva.gp2.android.libs.networking.http.requests.HttpRequestServerURI
    @NotNull
    /* JADX INFO: renamed from: getServerURI, reason: from getter */
    public String getUrl() {
        return this.url;
    }

    @NotNull
    public String toString() {
        return d.f(new StringBuilder("HttpRequestServerURI(host='"), this.url, "')");
    }
}
