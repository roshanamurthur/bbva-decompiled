package com.vasco.digipass.sdk.utils.utilities.obfuscated;

import bc.org.bouncycastle.util.Arrays;
import java.io.ByteArrayOutputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes9.dex */
public abstract class d extends u {

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    private static final char[] f65998r0 = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    protected final byte[] f65999p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    protected final int f66000q0;

    public d(byte[] bArr, int i10) {
        if (bArr == null) {
            throw new NullPointerException("data cannot be null");
        }
        if (bArr.length == 0 && i10 != 0) {
            throw new IllegalArgumentException("zero length data with non-zero pad bits");
        }
        if (i10 > 7 || i10 < 0) {
            throw new IllegalArgumentException("pad bits cannot be greater than 7 or less than 0");
        }
        this.f65999p0 = Arrays.clone(bArr);
        this.f66000q0 = i10;
    }

    @Override // com.vasco.digipass.sdk.utils.utilities.obfuscated.u
    public boolean a(u uVar) {
        if (!(uVar instanceof d)) {
            return false;
        }
        d dVar = (d) uVar;
        return this.f66000q0 == dVar.f66000q0 && Arrays.areEqual(g(), dVar.g());
    }

    @Override // com.vasco.digipass.sdk.utils.utilities.obfuscated.u
    public u e() {
        return new v0(this.f65999p0, this.f66000q0);
    }

    @Override // com.vasco.digipass.sdk.utils.utilities.obfuscated.u
    public u f() {
        return new z1(this.f65999p0, this.f66000q0);
    }

    public byte[] g() {
        return a(this.f65999p0, this.f66000q0);
    }

    public byte[] h() {
        if (this.f66000q0 == 0) {
            return Arrays.clone(this.f65999p0);
        }
        throw new IllegalStateException("attempt to get non-octet aligned data from BIT STRING");
    }

    @Override // com.vasco.digipass.sdk.utils.utilities.obfuscated.u, com.vasco.digipass.sdk.utils.utilities.obfuscated.o
    public int hashCode() {
        return this.f66000q0 ^ Arrays.hashCode(g());
    }

    public int i() {
        return this.f66000q0;
    }

    public String j() {
        StringBuffer stringBuffer = new StringBuffer("#");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            new s(byteArrayOutputStream).a((g) this);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            for (int i10 = 0; i10 != byteArray.length; i10++) {
                char[] cArr = f65998r0;
                stringBuffer.append(cArr[(byteArray[i10] >>> 4) & 15]);
                stringBuffer.append(cArr[byteArray[i10] & 15]);
            }
            return stringBuffer.toString();
        } catch (IOException e5) {
            throw new t(androidx.camera.core.impl.a.d(e5, new StringBuilder("Internal error encoding BitString: ")), e5);
        }
    }

    public String toString() {
        return j();
    }

    public static byte[] a(byte[] bArr, int i10) {
        byte[] bArrClone = Arrays.clone(bArr);
        if (i10 > 0) {
            int length = bArr.length - 1;
            bArrClone[length] = (byte) ((255 << i10) & bArrClone[length]);
        }
        return bArrClone;
    }

    public static d a(int i10, InputStream inputStream) throws IOException {
        if (i10 >= 1) {
            int i11 = inputStream.read();
            int i12 = i10 - 1;
            byte[] bArr = new byte[i12];
            if (i12 != 0) {
                if (j5.a(inputStream, bArr) != i12) {
                    throw new EOFException("EOF encountered in middle of BIT STRING");
                }
                if (i11 > 0 && i11 < 8) {
                    byte b10 = bArr[i10 - 2];
                    if (b10 != ((byte) ((255 << i11) & b10))) {
                        return new z1(bArr, i11);
                    }
                }
            }
            return new v0(bArr, i11);
        }
        throw new IllegalArgumentException("truncated BIT STRING detected");
    }
}
