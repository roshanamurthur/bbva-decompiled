package wl;

import java.io.IOException;
import net.lingala.zip4j.crypto.AESEncrypter;
import net.lingala.zip4j.crypto.Encrypter;
import net.lingala.zip4j.model.ZipParameters;

/* JADX INFO: compiled from: AesCipherOutputStream.java */
/* JADX INFO: loaded from: classes12.dex */
public final class a extends b<AESEncrypter> {

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public byte[] f94285r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public int f94286s0;

    @Override // wl.b
    public final void b() throws IOException {
        int i10 = this.f94286s0;
        if (i10 != 0) {
            super.write(this.f94285r0, 0, i10);
            this.f94286s0 = 0;
        }
        byte[] finalMac = ((AESEncrypter) this.f94288q0).getFinalMac();
        g gVar = this.f94287p0;
        gVar.getClass();
        gVar.write(finalMac, 0, finalMac.length);
        super.b();
    }

    @Override // wl.b
    public final Encrypter c(ZipParameters zipParameters, char[] cArr) throws IOException {
        AESEncrypter aESEncrypter = new AESEncrypter(cArr, zipParameters.getAesKeyStrength());
        byte[] saltBytes = aESEncrypter.getSaltBytes();
        g gVar = this.f94287p0;
        gVar.getClass();
        gVar.write(saltBytes, 0, saltBytes.length);
        byte[] derivedPasswordVerifier = aESEncrypter.getDerivedPasswordVerifier();
        g gVar2 = this.f94287p0;
        gVar2.getClass();
        gVar2.write(derivedPasswordVerifier, 0, derivedPasswordVerifier.length);
        return aESEncrypter;
    }

    @Override // wl.b, java.io.OutputStream
    public final void write(int i10) throws IOException {
        write(new byte[]{(byte) i10}, 0, 1);
    }

    @Override // wl.b, java.io.OutputStream
    public final void write(byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }

    @Override // wl.b, java.io.OutputStream
    public final void write(byte[] bArr, int i10, int i11) throws IOException {
        int i12;
        int i13 = this.f94286s0;
        int i14 = 16 - i13;
        byte[] bArr2 = this.f94285r0;
        if (i11 >= i14) {
            System.arraycopy(bArr, i10, bArr2, i13, 16 - i13);
            super.write(bArr2, 0, bArr2.length);
            int i15 = 16 - this.f94286s0;
            int i16 = i11 - i15;
            this.f94286s0 = 0;
            if (i16 != 0 && (i12 = i16 % 16) != 0) {
                System.arraycopy(bArr, (i16 + i15) - i12, bArr2, 0, i12);
                this.f94286s0 = i12;
                i16 -= i12;
            }
            super.write(bArr, i15, i16);
            return;
        }
        System.arraycopy(bArr, i10, bArr2, i13, i11);
        this.f94286s0 += i11;
    }
}
