package com.bbva.network.model.response;

import java.net.URL;
import java.security.cert.Certificate;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: NetworkHandshake.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0004\u0018\u00002\u00020\u0001B'\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00110\u0015\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0007\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\r\u001a\u0004\u0018\u00010\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u000f\u001a\u0004\u0018\u00010\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\fR\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0019"}, d2 = {"Lcom/bbva/network/model/response/DefaultNetworkHandshake;", "Lcom/bbva/network/model/response/NetworkHandshake;", "", "b", "Ljava/lang/String;", "getCipherSuite", "()Ljava/lang/String;", "cipherSuite", "Ljava/net/URL;", "c", "Ljava/net/URL;", "getUrl", "()Ljava/net/URL;", "url", "getURL", "URL", "", "Ljava/security/cert/Certificate;", "getServerCertificates", "()[Ljava/security/cert/Certificate;", "serverCertificates", "", "certificates", "<init>", "(Ljava/util/List;Ljava/lang/String;Ljava/net/URL;)V", "network_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nNetworkHandshake.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NetworkHandshake.kt\ncom/bbva/network/model/response/DefaultNetworkHandshake\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,34:1\n37#2,2:35\n*S KotlinDebug\n*F\n+ 1 NetworkHandshake.kt\ncom/bbva/network/model/response/DefaultNetworkHandshake\n*L\n32#1:35,2\n*E\n"})
public final class DefaultNetworkHandshake implements NetworkHandshake {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final List<Certificate> f35152a;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String cipherSuite;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final URL url;

    /* JADX WARN: Multi-variable type inference failed */
    public DefaultNetworkHandshake(@NotNull List<? extends Certificate> certificates, @NotNull String cipherSuite, @Nullable URL url) {
        Intrinsics.checkNotNullParameter(certificates, "certificates");
        Intrinsics.checkNotNullParameter(cipherSuite, "cipherSuite");
        this.f35152a = certificates;
        this.cipherSuite = cipherSuite;
        this.url = url;
    }

    @Override // com.bbva.network.model.response.NetworkHandshake
    @NotNull
    public String getCipherSuite() {
        return this.cipherSuite;
    }

    @Override // com.bbva.network.model.response.NetworkHandshake
    @NotNull
    public Certificate[] getServerCertificates() {
        return (Certificate[]) this.f35152a.toArray(new Certificate[0]);
    }

    @Override // com.bbva.network.model.response.NetworkHandshake
    @Nullable
    public URL getURL() {
        return getUrl();
    }

    @Override // com.bbva.network.model.response.NetworkHandshake
    @Nullable
    public URL getUrl() {
        return this.url;
    }
}
