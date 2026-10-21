package org.bouncycastle.pqc.crypto.lms;

import androidx.databinding.c;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import org.bouncycastle.util.Encodable;
import org.bouncycastle.util.io.Streams;
import um.f;
import um.g;

/* JADX INFO: loaded from: classes13.dex */
public class HSSSignature implements Encodable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final int f91086p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final g[] f91087q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final f f91088r0;

    public HSSSignature(int i10, g[] gVarArr, f fVar) {
        this.f91086p0 = i10;
        this.f91087q0 = gVarArr;
        this.f91088r0 = fVar;
    }

    public static HSSSignature getInstance(Object obj, int i10) throws Throwable {
        if (obj instanceof HSSSignature) {
            return (HSSSignature) obj;
        }
        if (obj instanceof DataInputStream) {
            int i11 = ((DataInputStream) obj).readInt();
            if (i11 != i10 - 1) {
                throw new IllegalStateException("nspk exceeded maxNspk");
            }
            g[] gVarArr = new g[i11];
            if (i11 != 0) {
                for (int i12 = 0; i12 < i11; i12++) {
                    gVarArr[i12] = new g(f.a(obj), LMSPublicKeyParameters.getInstance(obj));
                }
            }
            return new HSSSignature(i11, gVarArr, f.a(obj));
        }
        if (!(obj instanceof byte[])) {
            if (obj instanceof InputStream) {
                return getInstance(Streams.readAll((InputStream) obj), i10);
            }
            throw new IllegalArgumentException(c.c("cannot parse ", obj));
        }
        DataInputStream dataInputStream = null;
        try {
            DataInputStream dataInputStream2 = new DataInputStream(new ByteArrayInputStream((byte[]) obj));
            try {
                HSSSignature hSSSignature = getInstance(dataInputStream2, i10);
                dataInputStream2.close();
                return hSSSignature;
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
        HSSSignature hSSSignature = (HSSSignature) obj;
        if (this.f91086p0 != hSSSignature.f91086p0) {
            return false;
        }
        g[] gVarArr = this.f91087q0;
        int length = gVarArr.length;
        g[] gVarArr2 = hSSSignature.f91087q0;
        if (length != gVarArr2.length) {
            return false;
        }
        for (int i10 = 0; i10 < gVarArr.length; i10++) {
            if (!gVarArr[i10].equals(gVarArr2[i10])) {
                return false;
            }
        }
        f fVar = hSSSignature.f91088r0;
        f fVar2 = this.f91088r0;
        if (fVar2 != null) {
            return fVar2.equals(fVar);
        }
        return fVar == null;
    }

    @Override // org.bouncycastle.util.Encodable
    public byte[] getEncoded() throws IOException {
        Composer composerCompose = Composer.compose();
        composerCompose.u32str(this.f91086p0);
        g[] gVarArr = this.f91087q0;
        if (gVarArr != null) {
            for (g gVar : gVarArr) {
                composerCompose.bytes(gVar);
            }
        }
        composerCompose.bytes(this.f91088r0);
        return composerCompose.build();
    }

    public f getSignature() {
        return this.f91088r0;
    }

    public g[] getSignedPubKey() {
        return this.f91087q0;
    }

    public int getlMinus1() {
        return this.f91086p0;
    }

    public int hashCode() {
        int iHashCode = ((this.f91086p0 * 31) + Arrays.hashCode(this.f91087q0)) * 31;
        f fVar = this.f91088r0;
        return iHashCode + (fVar != null ? fVar.hashCode() : 0);
    }
}
