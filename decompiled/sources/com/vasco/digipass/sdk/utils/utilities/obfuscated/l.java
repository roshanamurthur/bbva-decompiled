package com.vasco.digipass.sdk.utils.utilities.obfuscated;

import java.io.ByteArrayInputStream;
import java.io.EOFException;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes9.dex */
public class l extends FilterInputStream {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    private final int f66171p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    private final boolean f66172q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    private final byte[][] f66173r0;

    public l(InputStream inputStream) {
        this(inputStream, i5.a(inputStream));
    }

    public u a(int i10, int i11, int i12) throws IOException {
        boolean z10 = (i10 & 32) != 0;
        k2 k2Var = new k2(this, i12);
        if ((i10 & 64) != 0) {
            return new t0(z10, i11, k2Var.b());
        }
        if ((i10 & 128) != 0) {
            return new y(k2Var).a(z10, i11);
        }
        if (!z10) {
            return a(i11, k2Var, this.f66173r0);
        }
        if (i11 != 4) {
            if (i11 == 8) {
                return new w0(a(k2Var));
            }
            if (i11 == 16) {
                return this.f66172q0 ? new m3(k2Var.b()) : y0.a(a(k2Var));
            }
            if (i11 == 17) {
                return y0.b(a(k2Var));
            }
            throw new IOException(androidx.camera.core.impl.utils.b.a("unknown tag ", i11, " encountered"));
        }
        h hVarA = a(k2Var);
        int iA = hVarA.a();
        q[] qVarArr = new q[iA];
        for (int i13 = 0; i13 != iA; i13++) {
            qVarArr[i13] = (q) hVarA.a(i13);
        }
        return new g0(qVarArr);
    }

    public int b() {
        return this.f66171p0;
    }

    public int c() throws IOException {
        return a(this, this.f66171p0);
    }

    public u d() throws IOException {
        int i10 = read();
        if (i10 <= 0) {
            if (i10 != 0) {
                return null;
            }
            throw new IOException("unexpected end-of-contents marker");
        }
        int iB = b(this, i10);
        boolean z10 = (i10 & 32) != 0;
        int iC = c();
        if (iC >= 0) {
            try {
                return a(i10, iB, iC);
            } catch (IllegalArgumentException e5) {
                throw new j("corrupted stream detected", e5);
            }
        }
        if (!z10) {
            throw new IOException("indefinite-length primitive encoding encountered");
        }
        y yVar = new y(new h3(this, this.f66171p0), this.f66171p0);
        if ((i10 & 64) != 0) {
            return new e0(iB, yVar).a();
        }
        if ((i10 & 128) != 0) {
            return new n0(true, iB, yVar).a();
        }
        if (iB == 4) {
            return new h0(yVar).a();
        }
        if (iB == 8) {
            return new x0(yVar).a();
        }
        if (iB == 16) {
            return new j0(yVar).a();
        }
        if (iB == 17) {
            return new l0(yVar).a();
        }
        throw new IOException("unknown BER object encountered");
    }

    public l(byte[] bArr) {
        this(new ByteArrayInputStream(bArr), bArr.length);
    }

    public static int b(InputStream inputStream, int i10) throws IOException {
        int i11 = i10 & 31;
        if (i11 != 31) {
            return i11;
        }
        int i12 = inputStream.read();
        if ((i12 & 127) == 0) {
            throw new IOException("corrupted stream - invalid high tag number found");
        }
        int i13 = 0;
        while (i12 >= 0 && (i12 & 128) != 0) {
            i13 = ((i12 & 127) | i13) << 7;
            i12 = inputStream.read();
        }
        if (i12 >= 0) {
            return i13 | (i12 & 127);
        }
        throw new EOFException("EOF found inside tag value.");
    }

    public l(byte[] bArr, boolean z10) {
        this(new ByteArrayInputStream(bArr), bArr.length, z10);
    }

    public l(InputStream inputStream, int i10) {
        this(inputStream, i10, false);
    }

    public l(InputStream inputStream, int i10, boolean z10) {
        super(inputStream);
        this.f66171p0 = i10;
        this.f66172q0 = z10;
        this.f66173r0 = new byte[11][];
    }

    private static char[] b(k2 k2Var) throws IOException {
        int i10;
        int iA = k2Var.a() / 2;
        char[] cArr = new char[iA];
        for (int i11 = 0; i11 < iA; i11++) {
            int i12 = k2Var.read();
            if (i12 < 0 || (i10 = k2Var.read()) < 0) {
                break;
            }
            cArr[i11] = (char) ((i12 << 8) | (i10 & 255));
        }
        return cArr;
    }

    public h a() throws IOException {
        h hVar = new h();
        while (true) {
            u uVarD = d();
            if (uVarD == null) {
                return hVar;
            }
            hVar.a(uVarD);
        }
    }

    public h a(k2 k2Var) throws IOException {
        return new l(k2Var).a();
    }

    public static int a(InputStream inputStream, int i10) throws IOException {
        int i11 = inputStream.read();
        if (i11 < 0) {
            throw new EOFException("EOF found when length expected");
        }
        if (i11 == 128) {
            return -1;
        }
        if (i11 <= 127) {
            return i11;
        }
        int i12 = i11 & 127;
        if (i12 > 4) {
            throw new IOException(androidx.appcompat.widget.g0.c("DER length more than 4 bytes: ", i12));
        }
        int i13 = 0;
        for (int i14 = 0; i14 < i12; i14++) {
            int i15 = inputStream.read();
            if (i15 < 0) {
                throw new EOFException("EOF found reading length");
            }
            i13 = (i13 << 8) + i15;
        }
        if (i13 < 0) {
            throw new IOException("corrupted stream - negative length found");
        }
        if (i13 < i10) {
            return i13;
        }
        throw new IOException("corrupted stream - out of bounds length found");
    }

    private static byte[] a(k2 k2Var, byte[][] bArr) throws IOException {
        int iA = k2Var.a();
        if (k2Var.a() < bArr.length) {
            byte[] bArr2 = bArr[iA];
            if (bArr2 == null) {
                bArr2 = new byte[iA];
                bArr[iA] = bArr2;
            }
            j5.a(k2Var, bArr2);
            return bArr2;
        }
        return k2Var.b();
    }

    public static u a(int i10, k2 k2Var, byte[][] bArr) throws IOException {
        if (i10 == 10) {
            return i.b(a(k2Var, bArr));
        }
        if (i10 == 12) {
            return new o1(k2Var.b());
        }
        if (i10 != 30) {
            switch (i10) {
                case 1:
                    return e.b(a(k2Var, bArr));
                case 2:
                    return new m(k2Var.b(), false);
                case 3:
                    return d.a(k2Var.a(), k2Var);
                case 4:
                    return new e1(k2Var.b());
                case 5:
                    return c1.f65958p0;
                case 6:
                    return p.b(a(k2Var, bArr));
                default:
                    switch (i10) {
                        case 18:
                            return new d1(k2Var.b());
                        case 19:
                            return new h1(k2Var.b());
                        case 20:
                            return new m1(k2Var.b());
                        case 21:
                            return new q1(k2Var.b());
                        case 22:
                            return new b1(k2Var.b());
                        case 23:
                            return new a0(k2Var.b());
                        case 24:
                            return new k(k2Var.b());
                        case 25:
                            return new a1(k2Var.b());
                        case 26:
                            return new r1(k2Var.b());
                        case 27:
                            return new z0(k2Var.b());
                        case 28:
                            return new p1(k2Var.b());
                        default:
                            throw new IOException(androidx.camera.core.impl.utils.b.a("unknown tag ", i10, " encountered"));
                    }
            }
        }
        return new u0(b(k2Var));
    }
}
