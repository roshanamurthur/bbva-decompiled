package um;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import org.bouncycastle.pqc.crypto.lms.Composer;
import org.bouncycastle.pqc.crypto.lms.LMSigParameters;
import org.bouncycastle.util.Encodable;
import org.bouncycastle.util.io.Streams;

/* JADX INFO: loaded from: classes13.dex */
public final class f implements Encodable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final int f93888p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final d f93889q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final LMSigParameters f93890r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final byte[][] f93891s0;

    public f(int i10, d dVar, LMSigParameters lMSigParameters, byte[][] bArr) {
        this.f93888p0 = i10;
        this.f93889q0 = dVar;
        this.f93890r0 = lMSigParameters;
        this.f93891s0 = bArr;
    }

    public static f a(Object obj) throws Throwable {
        if (obj instanceof f) {
            return (f) obj;
        }
        if (obj instanceof DataInputStream) {
            DataInputStream dataInputStream = (DataInputStream) obj;
            int i10 = dataInputStream.readInt();
            d dVarA = d.a(obj);
            LMSigParameters lMSigParameters = LMSigParameters.f91118e.get(Integer.valueOf(dataInputStream.readInt()));
            int h4 = lMSigParameters.getH();
            byte[][] bArr = new byte[h4][];
            for (int i11 = 0; i11 < h4; i11++) {
                byte[] bArr2 = new byte[lMSigParameters.getM()];
                bArr[i11] = bArr2;
                dataInputStream.readFully(bArr2);
            }
            return new f(i10, dVarA, lMSigParameters, bArr);
        }
        if (!(obj instanceof byte[])) {
            if (obj instanceof InputStream) {
                return a(Streams.readAll((InputStream) obj));
            }
            throw new IllegalArgumentException(androidx.databinding.c.c("cannot parse ", obj));
        }
        DataInputStream dataInputStream2 = null;
        try {
            DataInputStream dataInputStream3 = new DataInputStream(new ByteArrayInputStream((byte[]) obj));
            try {
                f fVarA = a(dataInputStream3);
                dataInputStream3.close();
                return fVarA;
            } catch (Throwable th2) {
                th = th2;
                dataInputStream2 = dataInputStream3;
                if (dataInputStream2 != null) {
                    dataInputStream2.close();
                }
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || f.class != obj.getClass()) {
            return false;
        }
        f fVar = (f) obj;
        if (this.f93888p0 != fVar.f93888p0) {
            return false;
        }
        d dVar = fVar.f93889q0;
        d dVar2 = this.f93889q0;
        if (dVar2 == null ? dVar != null : !dVar2.equals(dVar)) {
            return false;
        }
        LMSigParameters lMSigParameters = fVar.f93890r0;
        LMSigParameters lMSigParameters2 = this.f93890r0;
        if (lMSigParameters2 == null ? lMSigParameters == null : lMSigParameters2.equals(lMSigParameters)) {
            return Arrays.deepEquals(this.f93891s0, fVar.f93891s0);
        }
        return false;
    }

    @Override // org.bouncycastle.util.Encodable
    public final byte[] getEncoded() throws IOException {
        return Composer.compose().u32str(this.f93888p0).bytes(this.f93889q0.getEncoded()).u32str(this.f93890r0.getType()).bytes(this.f93891s0).build();
    }

    public final int hashCode() {
        int i10 = this.f93888p0 * 31;
        d dVar = this.f93889q0;
        int iHashCode = (i10 + (dVar != null ? dVar.hashCode() : 0)) * 31;
        LMSigParameters lMSigParameters = this.f93890r0;
        return Arrays.deepHashCode(this.f93891s0) + ((iHashCode + (lMSigParameters != null ? lMSigParameters.hashCode() : 0)) * 31);
    }
}
