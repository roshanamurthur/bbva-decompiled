package org.bouncycastle.pqc.crypto.lms;

import java.io.ByteArrayOutputStream;
import org.bouncycastle.util.Encodable;

/* JADX INFO: loaded from: classes13.dex */
public class Composer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ByteArrayOutputStream f91076a = new ByteArrayOutputStream();

    public static Composer compose() {
        return new Composer();
    }

    public Composer bool(boolean z10) {
        this.f91076a.write(z10 ? 1 : 0);
        return this;
    }

    public byte[] build() {
        return this.f91076a.toByteArray();
    }

    public Composer bytes(Encodable encodable) {
        try {
            this.f91076a.write(encodable.getEncoded());
            return this;
        } catch (Exception e5) {
            throw new RuntimeException(e5.getMessage(), e5);
        }
    }

    public Composer pad(int i10, int i11) {
        while (i11 >= 0) {
            try {
                this.f91076a.write(i10);
                i11--;
            } catch (Exception e5) {
                throw new RuntimeException(e5.getMessage(), e5);
            }
        }
        return this;
    }

    public Composer padUntil(int i10, int i11) {
        while (true) {
            ByteArrayOutputStream byteArrayOutputStream = this.f91076a;
            if (byteArrayOutputStream.size() >= i11) {
                return this;
            }
            byteArrayOutputStream.write(i10);
        }
    }

    public Composer u16str(int i10) {
        int i11 = i10 & 65535;
        ByteArrayOutputStream byteArrayOutputStream = this.f91076a;
        byteArrayOutputStream.write((byte) (i11 >>> 8));
        byteArrayOutputStream.write((byte) i11);
        return this;
    }

    public Composer u32str(int i10) {
        ByteArrayOutputStream byteArrayOutputStream = this.f91076a;
        byteArrayOutputStream.write((byte) (i10 >>> 24));
        byteArrayOutputStream.write((byte) (i10 >>> 16));
        byteArrayOutputStream.write((byte) (i10 >>> 8));
        byteArrayOutputStream.write((byte) i10);
        return this;
    }

    public Composer u64str(long j10) {
        u32str((int) (j10 >>> 32));
        u32str((int) j10);
        return this;
    }

    public Composer bytes(byte[] bArr) {
        try {
            this.f91076a.write(bArr);
            return this;
        } catch (Exception e5) {
            throw new RuntimeException(e5.getMessage(), e5);
        }
    }

    public Composer bytes(byte[] bArr, int i10, int i11) {
        try {
            this.f91076a.write(bArr, i10, i11);
            return this;
        } catch (Exception e5) {
            throw new RuntimeException(e5.getMessage(), e5);
        }
    }

    public Composer bytes(Encodable[] encodableArr) {
        try {
            for (Encodable encodable : encodableArr) {
                this.f91076a.write(encodable.getEncoded());
            }
            return this;
        } catch (Exception e5) {
            throw new RuntimeException(e5.getMessage(), e5);
        }
    }

    public Composer bytes(byte[][] bArr) {
        try {
            for (byte[] bArr2 : bArr) {
                this.f91076a.write(bArr2);
            }
            return this;
        } catch (Exception e5) {
            throw new RuntimeException(e5.getMessage(), e5);
        }
    }

    public Composer bytes(byte[][] bArr, int i10, int i11) {
        while (i10 != i11) {
            try {
                this.f91076a.write(bArr[i10]);
                i10++;
            } catch (Exception e5) {
                throw new RuntimeException(e5.getMessage(), e5);
            }
        }
        return this;
    }
}
