package com.bbva.network.security;

import com.bbva.glomohybrid.login.domain.usecase.ValidatePasswordQualityUseCase;
import java.security.Principal;
import java.security.cert.Certificate;
import java.util.List;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSessionContext;
import javax.security.cert.X509Certificate;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: NetworkSSLSession.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00030(\u0012\u0006\u0010*\u001a\u00020\u0006¢\u0006\u0004\b+\u0010,J\u0015\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\t\u001a\u00020\bH\u0016J\b\u0010\u000b\u001a\u00020\nH\u0016J\b\u0010\r\u001a\u00020\fH\u0016J\b\u0010\u000e\u001a\u00020\fH\u0016J\b\u0010\u0010\u001a\u00020\u000fH\u0016J\b\u0010\u0012\u001a\u00020\u0011H\u0016J\u001c\u0010\u0016\u001a\u00020\u000f2\b\u0010\u0013\u001a\u0004\u0018\u00010\u00062\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0016J\u0012\u0010\u0017\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0006H\u0016J\u0012\u0010\u0018\u001a\u00020\u000f2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0006H\u0016J\u0015\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00060\u0002H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016¢\u0006\u0004\b\u001b\u0010\u0005J\u0015\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u0002H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\b\u0010 \u001a\u00020\u001fH\u0016J\b\u0010!\u001a\u00020\u001fH\u0016J\b\u0010\"\u001a\u00020\u0006H\u0016J\b\u0010#\u001a\u00020\u0006H\u0016J\b\u0010%\u001a\u00020$H\u0016J\b\u0010&\u001a\u00020$H\u0016J\b\u0010'\u001a\u00020$H\u0016¨\u0006-"}, d2 = {"Lcom/bbva/network/security/NetworkSSLSession;", "Ljavax/net/ssl/SSLSession;", "", "Ljava/security/cert/Certificate;", "getPeerCertificates", "()[Ljava/security/cert/Certificate;", "", "getCipherSuite", "", "getId", "Ljavax/net/ssl/SSLSessionContext;", "getSessionContext", "", "getCreationTime", "getLastAccessedTime", "", "invalidate", "", ValidatePasswordQualityUseCase.KEY_PASSWORD_VALID, "name", "", "value", "putValue", "getValue", "removeValue", "getValueNames", "()[Ljava/lang/String;", "getLocalCertificates", "Ljavax/security/cert/X509Certificate;", "getPeerCertificateChain", "()[Ljavax/security/cert/X509Certificate;", "Ljava/security/Principal;", "getPeerPrincipal", "getLocalPrincipal", "getProtocol", "getPeerHost", "", "getPeerPort", "getPacketBufferSize", "getApplicationBufferSize", "", "peerCertificates", "cipherSuite", "<init>", "(Ljava/util/List;Ljava/lang/String;)V", "network_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nNetworkSSLSession.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NetworkSSLSession.kt\ncom/bbva/network/security/NetworkSSLSession\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,97:1\n37#2,2:98\n*S KotlinDebug\n*F\n+ 1 NetworkSSLSession.kt\ncom/bbva/network/security/NetworkSSLSession\n*L\n17#1:98,2\n*E\n"})
public final class NetworkSSLSession implements SSLSession {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final List<Certificate> f35175a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final String f35176b;

    /* JADX WARN: Multi-variable type inference failed */
    public NetworkSSLSession(@NotNull List<? extends Certificate> peerCertificates, @NotNull String cipherSuite) {
        Intrinsics.checkNotNullParameter(peerCertificates, "peerCertificates");
        Intrinsics.checkNotNullParameter(cipherSuite, "cipherSuite");
        this.f35175a = peerCertificates;
        this.f35176b = cipherSuite;
    }

    @Override // javax.net.ssl.SSLSession
    public int getApplicationBufferSize() {
        throw new IllegalStateException("Not supported".toString());
    }

    @Override // javax.net.ssl.SSLSession
    @NotNull
    public String getCipherSuite() {
        return this.f35176b;
    }

    @Override // javax.net.ssl.SSLSession
    public long getCreationTime() {
        throw new IllegalStateException("Not supported".toString());
    }

    @Override // javax.net.ssl.SSLSession
    @NotNull
    public byte[] getId() {
        throw new IllegalStateException("Not supported".toString());
    }

    @Override // javax.net.ssl.SSLSession
    public long getLastAccessedTime() {
        throw new IllegalStateException("Not supported".toString());
    }

    @Override // javax.net.ssl.SSLSession
    @NotNull
    public Certificate[] getLocalCertificates() {
        throw new IllegalStateException("Not supported".toString());
    }

    @Override // javax.net.ssl.SSLSession
    @NotNull
    public Principal getLocalPrincipal() {
        throw new IllegalStateException("Not supported".toString());
    }

    @Override // javax.net.ssl.SSLSession
    public int getPacketBufferSize() {
        throw new IllegalStateException("Not supported".toString());
    }

    @Override // javax.net.ssl.SSLSession
    @NotNull
    public X509Certificate[] getPeerCertificateChain() {
        throw new IllegalStateException("Not supported".toString());
    }

    @Override // javax.net.ssl.SSLSession
    @NotNull
    public Certificate[] getPeerCertificates() {
        return (Certificate[]) this.f35175a.toArray(new Certificate[0]);
    }

    @Override // javax.net.ssl.SSLSession
    @NotNull
    public String getPeerHost() {
        throw new IllegalStateException("Not supported".toString());
    }

    @Override // javax.net.ssl.SSLSession
    public int getPeerPort() {
        throw new IllegalStateException("Not supported".toString());
    }

    @Override // javax.net.ssl.SSLSession
    @NotNull
    public Principal getPeerPrincipal() {
        throw new IllegalStateException("Not supported".toString());
    }

    @Override // javax.net.ssl.SSLSession
    @NotNull
    public String getProtocol() {
        throw new IllegalStateException("Not supported".toString());
    }

    @Override // javax.net.ssl.SSLSession
    @NotNull
    public SSLSessionContext getSessionContext() {
        throw new IllegalStateException("Not supported".toString());
    }

    @Override // javax.net.ssl.SSLSession
    @NotNull
    public Object getValue(@Nullable String name) {
        throw new IllegalStateException("Not supported".toString());
    }

    @Override // javax.net.ssl.SSLSession
    @NotNull
    public String[] getValueNames() {
        throw new IllegalStateException("Not supported".toString());
    }

    @Override // javax.net.ssl.SSLSession
    public void invalidate() {
        throw new IllegalStateException("Not supported".toString());
    }

    @Override // javax.net.ssl.SSLSession
    public boolean isValid() {
        throw new IllegalStateException("Not supported".toString());
    }

    @Override // javax.net.ssl.SSLSession
    public void putValue(@Nullable String name, @Nullable Object value) {
        throw new IllegalStateException("Not supported".toString());
    }

    @Override // javax.net.ssl.SSLSession
    public void removeValue(@Nullable String name) {
        throw new IllegalStateException("Not supported".toString());
    }
}
