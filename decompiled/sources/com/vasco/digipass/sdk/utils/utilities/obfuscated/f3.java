package com.vasco.digipass.sdk.utils.utilities.obfuscated;

import com.bbva.tohu.android.product.valkyria.sdk.payments.paywave.Constants;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes9.dex */
public class f3 implements v2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final byte[] f66034a = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, Constants.DIRECTORY_ENTRY, 98, 99, 100, 101, 102};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final byte[] f66035b = new byte[128];

    public f3() {
        a();
    }

    private static boolean a(char c10) {
        return c10 == '\n' || c10 == '\r' || c10 == '\t' || c10 == ' ';
    }

    public void a() {
        int i10 = 0;
        int i11 = 0;
        while (true) {
            byte[] bArr = this.f66035b;
            if (i11 >= bArr.length) {
                break;
            }
            bArr[i11] = -1;
            i11++;
        }
        while (true) {
            byte[] bArr2 = this.f66034a;
            if (i10 >= bArr2.length) {
                byte[] bArr3 = this.f66035b;
                bArr3[65] = bArr3[97];
                bArr3[66] = bArr3[98];
                bArr3[67] = bArr3[99];
                bArr3[68] = bArr3[100];
                bArr3[69] = bArr3[101];
                bArr3[70] = bArr3[102];
                return;
            }
            this.f66035b[bArr2[i10]] = (byte) i10;
            i10++;
        }
    }

    @Override // com.vasco.digipass.sdk.utils.utilities.obfuscated.v2
    public int a(byte[] bArr, int i10, int i11, OutputStream outputStream) throws IOException {
        for (int i12 = i10; i12 < i10 + i11; i12++) {
            byte b10 = bArr[i12];
            outputStream.write(this.f66034a[(b10 & 255) >>> 4]);
            outputStream.write(this.f66034a[b10 & 15]);
        }
        return i11 * 2;
    }

    @Override // com.vasco.digipass.sdk.utils.utilities.obfuscated.v2
    public int a(String str, OutputStream outputStream) throws IOException {
        int length = str.length();
        while (length > 0 && a(str.charAt(length - 1))) {
            length--;
        }
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            while (i10 < length && a(str.charAt(i10))) {
                i10++;
            }
            int i12 = i10 + 1;
            byte b10 = this.f66035b[str.charAt(i10)];
            while (i12 < length && a(str.charAt(i12))) {
                i12++;
            }
            int i13 = i12 + 1;
            byte b11 = this.f66035b[str.charAt(i12)];
            if ((b10 | b11) >= 0) {
                outputStream.write((b10 << 4) | b11);
                i11++;
                i10 = i13;
            } else {
                throw new IOException("invalid characters encountered in Hex string");
            }
        }
        return i11;
    }
}
