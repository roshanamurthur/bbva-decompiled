package org.bouncycastle.pqc.crypto.lms;

import androidx.databinding.c;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import org.bouncycastle.util.io.Streams;

/* JADX INFO: loaded from: classes13.dex */
public class HSSPublicKeyParameters extends LMSKeyParameters {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final int f91084q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final LMSPublicKeyParameters f91085r0;

    public HSSPublicKeyParameters(int i10, LMSPublicKeyParameters lMSPublicKeyParameters) {
        super(false);
        this.f91084q0 = i10;
        this.f91085r0 = lMSPublicKeyParameters;
    }

    public static HSSPublicKeyParameters getInstance(Object obj) throws Throwable {
        if (obj instanceof HSSPublicKeyParameters) {
            return (HSSPublicKeyParameters) obj;
        }
        if (obj instanceof DataInputStream) {
            return new HSSPublicKeyParameters(((DataInputStream) obj).readInt(), LMSPublicKeyParameters.getInstance(obj));
        }
        if (!(obj instanceof byte[])) {
            if (obj instanceof InputStream) {
                return getInstance(Streams.readAll((InputStream) obj));
            }
            throw new IllegalArgumentException(c.c("cannot parse ", obj));
        }
        DataInputStream dataInputStream = null;
        try {
            DataInputStream dataInputStream2 = new DataInputStream(new ByteArrayInputStream((byte[]) obj));
            try {
                HSSPublicKeyParameters hSSPublicKeyParameters = getInstance(dataInputStream2);
                dataInputStream2.close();
                return hSSPublicKeyParameters;
            } catch (Throwable th2) {
                th = th2;
                dataInputStream = dataInputStream2;
                if (dataInputStream != null) {
                    dataInputStream.close();
                }
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        HSSPublicKeyParameters hSSPublicKeyParameters = (HSSPublicKeyParameters) obj;
        if (this.f91084q0 != hSSPublicKeyParameters.f91084q0) {
            return false;
        }
        return this.f91085r0.equals(hSSPublicKeyParameters.f91085r0);
    }

    @Override // org.bouncycastle.pqc.crypto.lms.LMSKeyParameters, org.bouncycastle.util.Encodable
    public byte[] getEncoded() throws IOException {
        return Composer.compose().u32str(this.f91084q0).bytes(this.f91085r0.getEncoded()).build();
    }

    public int getL() {
        return this.f91084q0;
    }

    public LMSPublicKeyParameters getLMSPublicKey() {
        return this.f91085r0;
    }

    public int hashCode() {
        return this.f91085r0.hashCode() + (this.f91084q0 * 31);
    }
}
