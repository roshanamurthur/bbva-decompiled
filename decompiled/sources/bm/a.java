package bm;

import java.security.cert.Certificate;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import okhttp3.Address;
import okhttp3.CertificatePinner;
import okhttp3.Handshake;
import okhttp3.internal.tls.CertificateChainCleaner;

/* JADX INFO: compiled from: RealConnection.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class a extends Lambda implements Function0<List<? extends Certificate>> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ CertificatePinner f25264p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ Handshake f25265q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ Address f25266r0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(CertificatePinner certificatePinner, Handshake handshake, Address address) {
        super(0);
        this.f25264p0 = certificatePinner;
        this.f25265q0 = handshake;
        this.f25266r0 = address;
    }

    @Override // kotlin.jvm.functions.Function0
    public final List<? extends Certificate> invoke() {
        CertificateChainCleaner certificateChainCleaner = this.f25264p0.getCertificateChainCleaner();
        Intrinsics.checkNotNull(certificateChainCleaner);
        return certificateChainCleaner.clean(this.f25265q0.peerCertificates(), this.f25266r0.url().host());
    }
}
