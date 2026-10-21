package com.vasco.digipass.sdk.utils.utilities.obfuscated;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Vector;

/* JADX INFO: loaded from: classes9.dex */
public class g0 extends q {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    private q[] f66041q0;

    public class a implements Enumeration {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f66042a = 0;

        public a() {
        }

        @Override // java.util.Enumeration
        public boolean hasMoreElements() {
            return this.f66042a < g0.this.f66041q0.length;
        }

        @Override // java.util.Enumeration
        public Object nextElement() {
            q[] qVarArr = g0.this.f66041q0;
            int i10 = this.f66042a;
            this.f66042a = i10 + 1;
            return qVarArr[i10];
        }
    }

    public g0(byte[] bArr) {
        super(bArr);
    }

    private Vector h() {
        Vector vector = new Vector();
        int i10 = 0;
        while (true) {
            byte[] bArr = this.f66256p0;
            if (i10 >= bArr.length) {
                return vector;
            }
            int i11 = i10 + 1000;
            int length = (i11 > bArr.length ? bArr.length : i11) - i10;
            byte[] bArr2 = new byte[length];
            System.arraycopy(bArr, i10, bArr2, 0, length);
            vector.addElement(new e1(bArr2));
            i10 = i11;
        }
    }

    @Override // com.vasco.digipass.sdk.utils.utilities.obfuscated.u
    public int c() throws IOException {
        Enumeration enumerationI = i();
        int iC = 0;
        while (enumerationI.hasMoreElements()) {
            iC += ((g) enumerationI.nextElement()).toASN1Primitive().c();
        }
        return iC + 4;
    }

    @Override // com.vasco.digipass.sdk.utils.utilities.obfuscated.u
    public boolean d() {
        return true;
    }

    @Override // com.vasco.digipass.sdk.utils.utilities.obfuscated.q
    public byte[] g() {
        return this.f66256p0;
    }

    public Enumeration i() {
        return this.f66041q0 == null ? h().elements() : new a();
    }

    public g0(q[] qVarArr) {
        super(a(qVarArr));
        this.f66041q0 = qVarArr;
    }

    private static byte[] a(q[] qVarArr) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        for (int i10 = 0; i10 != qVarArr.length; i10++) {
            try {
                byteArrayOutputStream.write(((e1) qVarArr[i10]).g());
            } catch (IOException e5) {
                throw new IllegalArgumentException("exception converting octets " + e5.toString());
            } catch (ClassCastException unused) {
                throw new IllegalArgumentException(qVarArr[i10].getClass().getName().concat(" found in input should only contain DEROctetString"));
            }
        }
        return byteArrayOutputStream.toByteArray();
    }

    @Override // com.vasco.digipass.sdk.utils.utilities.obfuscated.u
    public void a(s sVar) throws IOException {
        sVar.a(36);
        sVar.a(128);
        Enumeration enumerationI = i();
        while (enumerationI.hasMoreElements()) {
            sVar.a((g) enumerationI.nextElement());
        }
        sVar.a(0);
        sVar.a(0);
    }
}
