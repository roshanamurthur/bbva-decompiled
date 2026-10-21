package org.bouncycastle.pqc.crypto.lms;

import androidx.databinding.c;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.bouncycastle.pqc.crypto.ExhaustedPrivateKeyException;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.io.Streams;
import um.a;
import um.e;
import um.f;
import um.h;

/* JADX INFO: loaded from: classes13.dex */
public class HSSPrivateKeyParameters extends LMSKeyParameters {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final int f91079q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final boolean f91080r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public List<LMSPrivateKeyParameters> f91081s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public List<f> f91082t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final long f91083u0;
    public long v0;

    public HSSPrivateKeyParameters(int i10, ArrayList arrayList, ArrayList arrayList2, long j10, long j11, boolean z10) {
        super(true);
        this.v0 = 0L;
        this.f91079q0 = i10;
        this.f91081s0 = Collections.unmodifiableList(arrayList);
        this.f91082t0 = Collections.unmodifiableList(arrayList2);
        this.v0 = j10;
        this.f91083u0 = j11;
        this.f91080r0 = z10;
    }

    public static HSSPrivateKeyParameters getInstance(Object obj) throws Throwable {
        if (obj instanceof HSSPrivateKeyParameters) {
            return (HSSPrivateKeyParameters) obj;
        }
        if (obj instanceof DataInputStream) {
            DataInputStream dataInputStream = (DataInputStream) obj;
            if (dataInputStream.readInt() != 0) {
                throw new IllegalStateException("unknown version for hss private key");
            }
            int i10 = dataInputStream.readInt();
            long j10 = dataInputStream.readLong();
            long j11 = dataInputStream.readLong();
            boolean z10 = dataInputStream.readBoolean();
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            for (int i11 = 0; i11 < i10; i11++) {
                arrayList.add(LMSPrivateKeyParameters.getInstance(obj));
            }
            for (int i12 = 0; i12 < i10 - 1; i12++) {
                arrayList2.add(f.a(obj));
            }
            return new HSSPrivateKeyParameters(i10, arrayList, arrayList2, j10, j11, z10);
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
                HSSPrivateKeyParameters hSSPrivateKeyParameters = getInstance(dataInputStream3);
                dataInputStream3.close();
                return hSSPrivateKeyParameters;
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

    public final synchronized List<LMSPrivateKeyParameters> a() {
        return this.f91081s0;
    }

    public final synchronized List<f> b() {
        return this.f91082t0;
    }

    public final synchronized void c() {
        this.v0++;
    }

    public Object clone() throws CloneNotSupportedException {
        try {
            return getInstance(getEncoded());
        } catch (Exception e5) {
            throw new RuntimeException(e5.getMessage(), e5);
        }
    }

    public final void d(int i10) {
        int i11;
        LMOtsParameters lMOtsParameters;
        byte[] bArr;
        byte[] bArr2;
        int i12 = i10 - 1;
        LMSPrivateKeyParameters lMSPrivateKeyParameters = this.f91081s0.get(i12);
        synchronized (lMSPrivateKeyParameters) {
            i11 = lMSPrivateKeyParameters.v0;
            if (i11 >= lMSPrivateKeyParameters.f91106t0) {
                throw new ExhaustedPrivateKeyException("ots private keys expired");
            }
            lMOtsParameters = lMSPrivateKeyParameters.f91105s0;
            bArr = lMSPrivateKeyParameters.f91103q0;
            bArr2 = lMSPrivateKeyParameters.f91107u0;
        }
        h hVar = new h(bArr, bArr2, a.a(lMOtsParameters.getDigestOID()));
        hVar.f93897d = i11;
        hVar.f93898e = -2;
        byte[] bArr3 = new byte[32];
        hVar.a(true, 0, bArr3);
        byte[] bArr4 = new byte[32];
        hVar.a(false, 0, bArr4);
        byte[] bArr5 = new byte[16];
        System.arraycopy(bArr4, 0, bArr5, 0, 16);
        ArrayList arrayList = new ArrayList(this.f91081s0);
        LMSPrivateKeyParameters lMSPrivateKeyParameters2 = this.f91081s0.get(i10);
        arrayList.set(i10, e.a(lMSPrivateKeyParameters2.getSigParameters(), lMSPrivateKeyParameters2.getOtsParameters(), 0, bArr5, bArr3));
        ArrayList arrayList2 = new ArrayList(this.f91082t0);
        arrayList2.set(i12, e.b((LMSPrivateKeyParameters) arrayList.get(i12), ((LMSPrivateKeyParameters) arrayList.get(i10)).getPublicKey().toByteArray()));
        this.f91081s0 = Collections.unmodifiableList(arrayList);
        this.f91082t0 = Collections.unmodifiableList(arrayList2);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x00d8 A[PHI: r14
      0x00d8: PHI (r14v5 byte[]) = (r14v2 byte[]), (r14v6 byte[]) binds: [B:18:0x00e8, B:14:0x00d6] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:16:0x00da A[PHI: r14
      0x00da: PHI (r14v3 byte[]) = (r14v2 byte[]), (r14v6 byte[]) binds: [B:18:0x00e8, B:14:0x00d6] A[DONT_GENERATE, DONT_INLINE]] */
    public final void e() {
        boolean z10;
        byte[] bArr;
        boolean z11;
        List<LMSPrivateKeyParameters> listA = a();
        int size = listA.size();
        long[] jArr = new long[size];
        long index = getIndex();
        for (int size2 = listA.size() - 1; size2 >= 0; size2--) {
            LMSigParameters sigParameters = listA.get(size2).getSigParameters();
            jArr[size2] = ((long) ((1 << sigParameters.getH()) - 1)) & index;
            index >>>= sigParameters.getH();
        }
        LMSPrivateKeyParameters[] lMSPrivateKeyParametersArr = (LMSPrivateKeyParameters[]) listA.toArray(new LMSPrivateKeyParameters[listA.size()]);
        List<f> list = this.f91082t0;
        f[] fVarArr = (f[]) list.toArray(new f[list.size()]);
        LMSPrivateKeyParameters lMSPrivateKeyParameters = this.f91081s0.get(0);
        if (lMSPrivateKeyParametersArr[0].getIndex() - 1 != jArr[0]) {
            lMSPrivateKeyParametersArr[0] = e.a(lMSPrivateKeyParameters.getSigParameters(), lMSPrivateKeyParameters.getOtsParameters(), (int) jArr[0], lMSPrivateKeyParameters.getI(), lMSPrivateKeyParameters.getMasterSecret());
            z10 = true;
        } else {
            z10 = false;
        }
        int i10 = 1;
        while (i10 < size) {
            int i11 = i10 - 1;
            LMSPrivateKeyParameters lMSPrivateKeyParameters2 = lMSPrivateKeyParametersArr[i11];
            byte[] bArr2 = new byte[16];
            byte[] bArr3 = new byte[32];
            h hVar = new h(lMSPrivateKeyParameters2.getI(), lMSPrivateKeyParameters2.getMasterSecret(), a.a(lMSPrivateKeyParameters2.getOtsParameters().getDigestOID()));
            int i12 = i10;
            hVar.f93897d = (int) jArr[i11];
            hVar.f93898e = -2;
            hVar.a(true, 0, bArr3);
            byte[] bArr4 = new byte[32];
            hVar.a(false, 0, bArr4);
            System.arraycopy(bArr4, 0, bArr2, 0, 16);
            if (i12 < size - 1) {
                bArr = bArr2;
                if (jArr[i12] == lMSPrivateKeyParametersArr[i12].getIndex() - 1) {
                    z11 = true;
                } else {
                    z11 = false;
                }
            } else {
                bArr = bArr2;
                if (jArr[i12] == lMSPrivateKeyParametersArr[i12].getIndex()) {
                    z11 = true;
                } else {
                    z11 = false;
                }
            }
            if (Arrays.areEqual(bArr, lMSPrivateKeyParametersArr[i12].getI()) && Arrays.areEqual(bArr3, lMSPrivateKeyParametersArr[i12].getMasterSecret())) {
                if (!z11) {
                    lMSPrivateKeyParametersArr[i12] = e.a(listA.get(i12).getSigParameters(), listA.get(i12).getOtsParameters(), (int) jArr[i12], bArr, bArr3);
                }
                i10 = i12 + 1;
            } else {
                LMSPrivateKeyParameters lMSPrivateKeyParametersA = e.a(listA.get(i12).getSigParameters(), listA.get(i12).getOtsParameters(), (int) jArr[i12], bArr, bArr3);
                lMSPrivateKeyParametersArr[i12] = lMSPrivateKeyParametersA;
                fVarArr[i11] = e.b(lMSPrivateKeyParametersArr[i11], lMSPrivateKeyParametersA.getPublicKey().toByteArray());
            }
            z10 = true;
            i10 = i12 + 1;
        }
        if (z10) {
            updateHierarchy(lMSPrivateKeyParametersArr, fVarArr);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        HSSPrivateKeyParameters hSSPrivateKeyParameters = (HSSPrivateKeyParameters) obj;
        if (this.f91079q0 == hSSPrivateKeyParameters.f91079q0 && this.f91080r0 == hSSPrivateKeyParameters.f91080r0 && this.f91083u0 == hSSPrivateKeyParameters.f91083u0 && this.v0 == hSSPrivateKeyParameters.v0 && this.f91081s0.equals(hSSPrivateKeyParameters.f91081s0)) {
            return this.f91082t0.equals(hSSPrivateKeyParameters.f91082t0);
        }
        return false;
    }

    public HSSPrivateKeyParameters extractKeyShard(int i10) {
        HSSPrivateKeyParameters hSSPrivateKeyParameters;
        synchronized (this) {
            try {
                long j10 = i10;
                if (getUsagesRemaining() < j10) {
                    throw new IllegalArgumentException("usageCount exceeds usages remaining in current leaf");
                }
                long j11 = this.v0;
                long j12 = j11 + j10;
                this.v0 = j12;
                try {
                    hSSPrivateKeyParameters = getInstance(new HSSPrivateKeyParameters(this.f91079q0, new ArrayList(a()), new ArrayList(b()), j11, j12, true).getEncoded());
                    e();
                } catch (Exception e5) {
                    throw new RuntimeException(e5.getMessage(), e5);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return hSSPrivateKeyParameters;
    }

    @Override // org.bouncycastle.pqc.crypto.lms.LMSKeyParameters, org.bouncycastle.util.Encodable
    public synchronized byte[] getEncoded() throws IOException {
        Composer composerBool;
        try {
            composerBool = Composer.compose().u32str(0).u32str(this.f91079q0).u64str(this.v0).u64str(this.f91083u0).bool(this.f91080r0);
            Iterator<LMSPrivateKeyParameters> it = this.f91081s0.iterator();
            while (it.hasNext()) {
                composerBool.bytes(it.next());
            }
            Iterator<f> it2 = this.f91082t0.iterator();
            while (it2.hasNext()) {
                composerBool.bytes(it2.next());
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return composerBool.build();
    }

    public synchronized long getIndex() {
        return this.v0;
    }

    public int getL() {
        return this.f91079q0;
    }

    public synchronized LMSParameters[] getLMSParameters() {
        LMSParameters[] lMSParametersArr;
        int size = this.f91081s0.size();
        lMSParametersArr = new LMSParameters[size];
        for (int i10 = 0; i10 < size; i10++) {
            LMSPrivateKeyParameters lMSPrivateKeyParameters = this.f91081s0.get(i10);
            lMSParametersArr[i10] = new LMSParameters(lMSPrivateKeyParameters.getSigParameters(), lMSPrivateKeyParameters.getOtsParameters());
        }
        return lMSParametersArr;
    }

    public synchronized HSSPublicKeyParameters getPublicKey() {
        return new HSSPublicKeyParameters(this.f91079q0, this.f91081s0.get(0).getPublicKey());
    }

    public long getUsagesRemaining() {
        return this.f91083u0 - this.v0;
    }

    public int hashCode() {
        int iHashCode = (this.f91082t0.hashCode() + ((this.f91081s0.hashCode() + (((this.f91079q0 * 31) + (this.f91080r0 ? 1 : 0)) * 31)) * 31)) * 31;
        long j10 = this.f91083u0;
        int i10 = (iHashCode + ((int) (j10 ^ (j10 >>> 32)))) * 31;
        long j11 = this.v0;
        return i10 + ((int) (j11 ^ (j11 >>> 32)));
    }

    public void updateHierarchy(LMSPrivateKeyParameters[] lMSPrivateKeyParametersArr, f[] fVarArr) {
        synchronized (this) {
            this.f91081s0 = Collections.unmodifiableList(java.util.Arrays.asList(lMSPrivateKeyParametersArr));
            this.f91082t0 = Collections.unmodifiableList(java.util.Arrays.asList(fVarArr));
        }
    }

    public HSSPrivateKeyParameters(int i10, List<LMSPrivateKeyParameters> list, List<f> list2, long j10, long j11) {
        super(true);
        this.v0 = 0L;
        this.f91079q0 = i10;
        this.f91081s0 = Collections.unmodifiableList(list);
        this.f91082t0 = Collections.unmodifiableList(list2);
        this.v0 = j10;
        this.f91083u0 = j11;
        this.f91080r0 = false;
        e();
    }
}
