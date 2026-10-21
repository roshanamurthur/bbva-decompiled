package net.lingala.zip4j.io.inputstream;

import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import net.lingala.zip4j.crypto.AESDecrypter;
import net.lingala.zip4j.crypto.Decrypter;
import net.lingala.zip4j.exception.ZipException;
import net.lingala.zip4j.model.AESExtraDataRecord;
import net.lingala.zip4j.model.LocalFileHeader;
import net.lingala.zip4j.model.enums.CompressionMethod;
import net.lingala.zip4j.util.Zip4jUtil;

/* JADX INFO: compiled from: AesCipherInputStream.java */
/* JADX INFO: loaded from: classes12.dex */
public final class a extends b<AESDecrypter> {
    public int E0;
    public int F0;
    public int G0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public byte[] f84964u0;
    public byte[] v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public int f84965w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public int f84966x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public int f84967y0;

    @Override // net.lingala.zip4j.io.inputstream.b
    public final void a(InputStream inputStream) throws IOException {
        byte[] bArr = new byte[10];
        if (Zip4jUtil.readFully(inputStream, bArr) != 10) {
            throw new ZipException("Invalid AES Mac bytes. Could not read sufficient data");
        }
        LocalFileHeader localFileHeader = this.f84972t0;
        if (localFileHeader.isDataDescriptorExists() && CompressionMethod.DEFLATE.equals(Zip4jUtil.getCompressionMethod(localFileHeader))) {
            return;
        }
        byte[] bArr2 = new byte[10];
        System.arraycopy(((AESDecrypter) this.f84969q0).getCalculatedAuthenticationBytes(), 0, bArr2, 0, 10);
        if (!Arrays.equals(bArr, bArr2)) {
            throw new IOException("Reached end of data for this entry, but aes verification failed");
        }
    }

    @Override // net.lingala.zip4j.io.inputstream.b
    public final Decrypter b(LocalFileHeader localFileHeader, char[] cArr) throws IOException {
        AESExtraDataRecord aesExtraDataRecord = localFileHeader.getAesExtraDataRecord();
        if (localFileHeader.getAesExtraDataRecord() == null) {
            throw new IOException("invalid aes extra data record");
        }
        byte[] bArr = new byte[localFileHeader.getAesExtraDataRecord().getAesKeyStrength().getSaltLength()];
        c(bArr);
        byte[] bArr2 = new byte[2];
        c(bArr2);
        return new AESDecrypter(aesExtraDataRecord, cArr, bArr, bArr2);
    }

    public final void d(int i10, byte[] bArr) {
        int i11 = this.f84967y0;
        int i12 = this.f84966x0;
        if (i11 >= i12) {
            i11 = i12;
        }
        this.G0 = i11;
        System.arraycopy(this.v0, this.f84965w0, bArr, i10, i11);
        int i13 = this.G0;
        int i14 = this.f84965w0 + i13;
        this.f84965w0 = i14;
        if (i14 >= 15) {
            this.f84965w0 = 15;
        }
        int i15 = this.f84966x0 - i13;
        this.f84966x0 = i15;
        if (i15 <= 0) {
            this.f84966x0 = 0;
        }
        this.F0 += i13;
        this.f84967y0 -= i13;
        this.E0 += i13;
    }

    @Override // net.lingala.zip4j.io.inputstream.b, java.io.InputStream
    public final int read() throws IOException {
        byte[] bArr = this.f84964u0;
        if (read(bArr, 0, bArr.length) == -1) {
            return -1;
        }
        return bArr[0];
    }

    @Override // net.lingala.zip4j.io.inputstream.b, java.io.InputStream
    public final int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    @Override // net.lingala.zip4j.io.inputstream.b, java.io.InputStream
    public final int read(byte[] bArr, int i10, int i11) throws IOException {
        this.f84967y0 = i11;
        this.E0 = i10;
        this.F0 = 0;
        if (this.f84966x0 != 0) {
            d(i10, bArr);
            int i12 = this.F0;
            if (i12 == i11) {
                return i12;
            }
        }
        if (this.f84967y0 < 16) {
            byte[] bArr2 = this.v0;
            int i13 = super.read(bArr2, 0, bArr2.length);
            this.f84965w0 = 0;
            if (i13 == -1) {
                this.f84966x0 = 0;
                int i14 = this.F0;
                if (i14 > 0) {
                    return i14;
                }
                return -1;
            }
            this.f84966x0 = i13;
            d(this.E0, bArr);
            int i15 = this.F0;
            if (i15 == i11) {
                return i15;
            }
        }
        int i16 = this.E0;
        int i17 = this.f84967y0;
        int i18 = super.read(bArr, i16, i17 - (i17 % 16));
        if (i18 == -1) {
            int i19 = this.F0;
            if (i19 > 0) {
                return i19;
            }
            return -1;
        }
        return i18 + this.F0;
    }
}
