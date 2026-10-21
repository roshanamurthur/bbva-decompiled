package com.bbva.gp2.android.libs.networking.http.requests;

import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.mypinpad.tsdk.isolation.y2;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: HttpRequestServerURI.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0003H\u0016J\b\u0010\u0007\u001a\u00020\u0003H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/bbva/gp2/android/libs/networking/http/requests/ServerURIByHostAndPath;", "Lcom/bbva/gp2/android/libs/networking/http/requests/HttpRequestServerURI;", "host", "", "path", "(Ljava/lang/String;Ljava/lang/String;)V", "getServerURI", "toString", "gp2-ethermobile-network_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class ServerURIByHostAndPath extends HttpRequestServerURI {

    @NotNull
    private final String host;

    @NotNull
    private final String path;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    @JvmOverloads
    public ServerURIByHostAndPath(@NotNull String host) {
        this(host, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(host, "host");
    }

    @Override // com.bbva.gp2.android.libs.networking.http.requests.HttpRequestServerURI
    @NotNull
    public String getServerURI() {
        return this.host + this.path;
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("HttpRequestServerURI(host='");
        sb2.append(this.host);
        sb2.append("', path='");
        return y2.b(sb2, this.path, RootService.CLOSE_BRACKET);
    }

    public /* synthetic */ ServerURIByHostAndPath(String str, String str2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i10 & 2) != 0 ? "" : str2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ServerURIByHostAndPath(@NotNull String host, @NotNull String path) {
        super(null);
        Intrinsics.checkNotNullParameter(host, "host");
        Intrinsics.checkNotNullParameter(path, "path");
        this.host = host;
        this.path = path;
    }
}
