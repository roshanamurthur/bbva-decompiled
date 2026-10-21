package org.bouncycastle.pqc.crypto.lms;

import androidx.databinding.c;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.io.Streams;

/* JADX INFO: loaded from: classes13.dex */
public class LMSPublicKeyParameters extends LMSKeyParameters {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final LMSigParameters f91112q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final LMOtsParameters f91113r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final byte[] f91114s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final byte[] f91115t0;

    public LMSPublicKeyParameters(LMSigParameters lMSigParameters, LMOtsParameters lMOtsParameters, byte[] bArr, byte[] bArr2) {
        super(false);
        this.f91112q0 = lMSigParameters;
        this.f91113r0 = lMOtsParameters;
        this.f91114s0 = Arrays.clone(bArr2);
        this.f91115t0 = Arrays.clone(bArr);
    }

    public static LMSPublicKeyParameters getInstance(Object obj) throws Throwable {
        if (obj instanceof LMSPublicKeyParameters) {
            return (LMSPublicKeyParameters) obj;
        }
        if (obj instanceof DataInputStream) {
            DataInputStream dataInputStream = (DataInputStream) obj;
            LMSigParameters lMSigParameters = LMSigParameters.f91118e.get(Integer.valueOf(dataInputStream.readInt()));
            LMOtsParameters parametersForType = LMOtsParameters.getParametersForType(dataInputStream.readInt());
            byte[] bArr = new byte[16];
            dataInputStream.readFully(bArr);
            byte[] bArr2 = new byte[lMSigParameters.getM()];
            dataInputStream.readFully(bArr2);
            return new LMSPublicKeyParameters(lMSigParameters, parametersForType, bArr2, bArr);
        }
        if (!(obj instanceof byte[])) {
            if (obj instanceof InputStream) {
                return getInstance(Streams.readAll((InputStream) obj));
            }
            throw new IllegalArgumentException(c.c("cannot parse ", obj));
        }
        DataInputStream dataInputStream2 = null;
        try {
            DataInputStream dataInputStream3 = new DataInputStream(new ByteArrayInputStream((byte[]) obj));
            try {
                LMSPublicKeyParameters lMSPublicKeyParameters = getInstance(dataInputStream3);
                dataInputStream3.close();
                return lMSPublicKeyParameters;
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

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        LMSPublicKeyParameters lMSPublicKeyParameters = (LMSPublicKeyParameters) obj;
        if (this.f91112q0.equals(lMSPublicKeyParameters.f91112q0) && this.f91113r0.equals(lMSPublicKeyParameters.f91113r0) && Arrays.areEqual(this.f91114s0, lMSPublicKeyParameters.f91114s0)) {
            return Arrays.areEqual(this.f91115t0, lMSPublicKeyParameters.f91115t0);
        }
        return false;
    }

    @Override // org.bouncycastle.pqc.crypto.lms.LMSKeyParameters, org.bouncycastle.util.Encodable
    public byte[] getEncoded() throws IOException {
        return toByteArray();
    }

    public byte[] getI() {
        return Arrays.clone(this.f91114s0);
    }

    public LMSParameters getLMSParameters() {
        return new LMSParameters(getSigParameters(), getOtsParameters());
    }

    public LMOtsParameters getOtsParameters() {
        return this.f91113r0;
    }

    public LMSigParameters getSigParameters() {
        return this.f91112q0;
    }

    public byte[] getT1() {
        return Arrays.clone(this.f91115t0);
    }

    public int hashCode() {
        return Arrays.hashCode(this.f91115t0) + ((Arrays.hashCode(this.f91114s0) + ((this.f91113r0.hashCode() + (this.f91112q0.hashCode() * 31)) * 31)) * 31);
    }

    public final byte[] toByteArray() {
        return Composer.compose().u32str(this.f91112q0.getType()).u32str(this.f91113r0.getType()).bytes(this.f91114s0).bytes(this.f91115t0).build();
    }
}
