package com.bbva.network.model.response;

import java.net.URL;
import java.security.cert.Certificate;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: NetworkHandshake.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u00038&X§\u0004¢\u0006\f\u0012\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u0012\u0010\b\u001a\u00020\tX¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0018\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0007¨\u0006\u0013"}, d2 = {"Lcom/bbva/network/model/response/NetworkHandshake;", "", "URL", "Ljava/net/URL;", "getURL$annotations", "()V", "getURL", "()Ljava/net/URL;", "cipherSuite", "", "getCipherSuite", "()Ljava/lang/String;", "serverCertificates", "", "Ljava/security/cert/Certificate;", "getServerCertificates", "()[Ljava/security/cert/Certificate;", "url", "getUrl", "network_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface NetworkHandshake {
    @NotNull
    String getCipherSuite();

    @NotNull
    Certificate[] getServerCertificates();

    @Nullable
    URL getURL();

    @Nullable
    URL getUrl();

    /* JADX INFO: compiled from: NetworkHandshake.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class DefaultImpls {
        @Deprecated(level = DeprecationLevel.WARNING, message = "we are going to replace with url field", replaceWith = @ReplaceWith(expression = "url", imports = {}))
        public static /* synthetic */ void getURL$annotations() {
        }
    }
}
