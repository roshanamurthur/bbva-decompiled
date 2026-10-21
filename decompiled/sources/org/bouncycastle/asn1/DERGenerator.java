package org.bouncycastle.asn1;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes12.dex */
public abstract class DERGenerator extends ASN1Generator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f86565a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f86566b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f86567c;

    public DERGenerator(OutputStream outputStream) {
        super(outputStream);
        this.f86565a = false;
    }

    public static void a(OutputStream outputStream, int i10, byte[] bArr) throws IOException {
        outputStream.write(i10);
        int length = bArr.length;
        if (length > 127) {
            int i11 = length;
            int i12 = 1;
            while (true) {
                i11 >>>= 8;
                if (i11 == 0) {
                    break;
                } else {
                    i12++;
                }
            }
            outputStream.write((byte) (i12 | 128));
            for (int i13 = (i12 - 1) * 8; i13 >= 0; i13 -= 8) {
                outputStream.write((byte) (length >> i13));
            }
        } else {
            outputStream.write((byte) length);
        }
        outputStream.write(bArr);
    }

    public DERGenerator(OutputStream outputStream, int i10, boolean z10) {
        super(outputStream);
        this.f86565a = true;
        this.f86566b = z10;
        this.f86567c = i10;
    }
}
