package ff;

import com.google.crypto.tink.HybridEncrypt;
import com.google.crypto.tink.proto.HpkePublicKey;
import com.google.crypto.tink.subtle.Bytes;
import com.google.errorprone.annotations.Immutable;
import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: HpkeEncrypt.java */
/* JADX INFO: loaded from: classes10.dex */
@Immutable
public final class g implements HybridEncrypt {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final byte[] f68430e = new byte[0];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HpkePublicKey f68431a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f68432b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f68433c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final d f68434d;

    public g(HpkePublicKey hpkePublicKey, h hVar, c cVar, d dVar) {
        this.f68431a = hpkePublicKey;
        this.f68432b = hVar;
        this.f68433c = cVar;
        this.f68434d = dVar;
    }

    @Override // com.google.crypto.tink.HybridEncrypt
    public final byte[] encrypt(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        byte[] bArr3 = bArr2;
        c cVar = this.f68433c;
        d dVar = this.f68434d;
        byte[] byteArray = this.f68431a.getPublicKey().toByteArray();
        h hVar = this.f68432b;
        i iVarB = hVar.b(byteArray);
        e eVarB = e.b(iVarB.f68436b, iVarB.f68435a, hVar, cVar, dVar, bArr3);
        return Bytes.concat(eVarB.f68421e, eVarB.f68417a.d(eVarB.f68419c, eVarB.a(), bArr, f68430e));
    }
}
