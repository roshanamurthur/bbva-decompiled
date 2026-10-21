package com.vasco.digipass.sdk.utils.utilities.obfuscated;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes9.dex */
public class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InputStream f66429a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f66430b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final byte[][] f66431c;

    public y(InputStream inputStream) {
        this(inputStream, i5.a(inputStream));
    }

    public g a(int i10) throws IOException {
        if (i10 == 4) {
            return new h0(this);
        }
        if (i10 == 8) {
            return new x0(this);
        }
        if (i10 == 16) {
            return new j0(this);
        }
        if (i10 == 17) {
            return new l0(this);
        }
        throw new j("unknown BER object encountered: 0x" + Integer.toHexString(i10));
    }

    public h b() throws IOException {
        h hVar = new h();
        while (true) {
            g gVarA = a();
            if (gVarA == null) {
                return hVar;
            }
            if (gVarA instanceof g3) {
                hVar.a(((g3) gVarA).a());
            } else {
                hVar.a(gVarA.toASN1Primitive());
            }
        }
    }

    public y(InputStream inputStream, int i10) {
        this.f66429a = inputStream;
        this.f66430b = i10;
        this.f66431c = new byte[11][];
    }

    public u a(boolean z10, int i10) throws IOException {
        if (!z10) {
            return new n1(false, i10, new e1(((k2) this.f66429a).b()));
        }
        h hVarB = b();
        if (this.f66429a instanceof h3) {
            if (hVarB.a() == 1) {
                return new m0(true, i10, hVarB.a(0));
            }
            return new m0(false, i10, f0.a(hVarB));
        }
        if (hVarB.a() == 1) {
            return new n1(true, i10, hVarB.a(0));
        }
        return new n1(false, i10, y0.a(hVarB));
    }

    public g a() throws IOException {
        int i10 = this.f66429a.read();
        if (i10 == -1) {
            return null;
        }
        a(false);
        int iB = l.b(this.f66429a, i10);
        boolean z10 = (i10 & 32) != 0;
        int iA = l.a(this.f66429a, this.f66430b);
        if (iA < 0) {
            if (z10) {
                y yVar = new y(new h3(this.f66429a, this.f66430b), this.f66430b);
                if ((i10 & 64) != 0) {
                    return new e0(iB, yVar);
                }
                if ((i10 & 128) != 0) {
                    return new n0(true, iB, yVar);
                }
                return yVar.a(iB);
            }
            throw new IOException("indefinite-length primitive encoding encountered");
        }
        k2 k2Var = new k2(this.f66429a, iA);
        if ((i10 & 64) != 0) {
            return new t0(z10, iB, k2Var.b());
        }
        if ((i10 & 128) != 0) {
            return new n0(z10, iB, new y(k2Var));
        }
        if (!z10) {
            if (iB != 4) {
                try {
                    return l.a(iB, k2Var, this.f66431c);
                } catch (IllegalArgumentException e5) {
                    throw new j("corrupted stream detected", e5);
                }
            }
            return new f1(k2Var);
        }
        if (iB == 4) {
            return new h0(new y(k2Var));
        }
        if (iB == 8) {
            return new x0(new y(k2Var));
        }
        if (iB == 16) {
            return new j1(new y(k2Var));
        }
        if (iB == 17) {
            return new l1(new y(k2Var));
        }
        throw new IOException(androidx.camera.core.impl.utils.b.a("unknown tag ", iB, " encountered"));
    }

    private void a(boolean z10) {
        InputStream inputStream = this.f66429a;
        if (inputStream instanceof h3) {
            ((h3) inputStream).b(z10);
        }
    }
}
