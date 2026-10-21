package um;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import org.bouncycastle.pqc.crypto.lms.Composer;
import org.bouncycastle.pqc.crypto.lms.LMOtsParameters;
import org.bouncycastle.util.Encodable;
import org.bouncycastle.util.io.Streams;

/* JADX INFO: loaded from: classes13.dex */
public final class d implements Encodable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final LMOtsParameters f93885p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final byte[] f93886q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final byte[] f93887r0;

    public d(LMOtsParameters lMOtsParameters, byte[] bArr, byte[] bArr2) {
        this.f93885p0 = lMOtsParameters;
        this.f93886q0 = bArr;
        this.f93887r0 = bArr2;
    }

    public static d a(Object obj) throws Throwable {
        if (obj instanceof d) {
            return (d) obj;
        }
        if (obj instanceof DataInputStream) {
            DataInputStream dataInputStream = (DataInputStream) obj;
            LMOtsParameters parametersForType = LMOtsParameters.getParametersForType(dataInputStream.readInt());
            byte[] bArr = new byte[parametersForType.getN()];
            dataInputStream.readFully(bArr);
            byte[] bArr2 = new byte[parametersForType.getN() * parametersForType.getP()];
            dataInputStream.readFully(bArr2);
            return new d(parametersForType, bArr, bArr2);
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
                d dVarA = a(dataInputStream3);
                dataInputStream3.close();
                return dVarA;
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
        if (obj == null || d.class != obj.getClass()) {
            return false;
        }
        d dVar = (d) obj;
        LMOtsParameters lMOtsParameters = dVar.f93885p0;
        LMOtsParameters lMOtsParameters2 = this.f93885p0;
        if (lMOtsParameters2 == null ? lMOtsParameters != null : !lMOtsParameters2.equals(lMOtsParameters)) {
            return false;
        }
        if (Arrays.equals(this.f93886q0, dVar.f93886q0)) {
            return Arrays.equals(this.f93887r0, dVar.f93887r0);
        }
        return false;
    }

    @Override // org.bouncycastle.util.Encodable
    public final byte[] getEncoded() throws IOException {
        return Composer.compose().u32str(this.f93885p0.getType()).bytes(this.f93886q0).bytes(this.f93887r0).build();
    }

    public final int hashCode() {
        LMOtsParameters lMOtsParameters = this.f93885p0;
        return Arrays.hashCode(this.f93887r0) + ((Arrays.hashCode(this.f93886q0) + ((lMOtsParameters != null ? lMOtsParameters.hashCode() : 0) * 31)) * 31);
    }
}
