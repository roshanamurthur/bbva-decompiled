package bm;

import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import okhttp3.Handshake;
import okhttp3.internal.connection.RealConnection;

/* JADX INFO: compiled from: RealConnection.kt */
/* JADX INFO: loaded from: classes12.dex */
@SourceDebugExtension({"SMAP\nRealConnection.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RealConnection.kt\nokhttp3/internal/connection/RealConnection$connectTls$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,765:1\n1549#2:766\n1620#2,3:767\n*S KotlinDebug\n*F\n+ 1 RealConnection.kt\nokhttp3/internal/connection/RealConnection$connectTls$2\n*L\n411#1:766\n411#1:767,3\n*E\n"})
public final class b extends Lambda implements Function0<List<? extends X509Certificate>> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ RealConnection f25267p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(RealConnection realConnection) {
        super(0);
        this.f25267p0 = realConnection;
    }

    @Override // kotlin.jvm.functions.Function0
    public final List<? extends X509Certificate> invoke() {
        Handshake handshake = this.f25267p0.f85833e;
        Intrinsics.checkNotNull(handshake);
        List<Certificate> listPeerCertificates = handshake.peerCertificates();
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(listPeerCertificates, 10));
        for (Certificate certificate : listPeerCertificates) {
            Intrinsics.checkNotNull(certificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
            arrayList.add((X509Certificate) certificate);
        }
        return arrayList;
    }
}
