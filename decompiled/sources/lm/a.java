package lm;

import java.io.IOException;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes5.dex */
public final class a {

    /* JADX INFO: renamed from: lm.a$a, reason: collision with other inner class name */
    public static class C0464a extends IllegalStateException {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ IOException f83222p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0464a(String str, IOException iOException) {
            super(str);
            this.f83222p0 = iOException;
        }

        @Override // java.lang.Throwable
        public final Throwable getCause() {
            return this.f83222p0;
        }
    }

    public static DEROctetString a(byte[] bArr) {
        return bArr == null ? new DEROctetString(new byte[0]) : new DEROctetString(Arrays.clone(bArr));
    }

    public static byte[] b(ASN1Primitive aSN1Primitive) {
        try {
            return aSN1Primitive.getEncoded();
        } catch (IOException e5) {
            throw new C0464a(androidx.camera.core.impl.a.d(e5, new StringBuilder("Cannot get encoding: ")), e5);
        }
    }
}
