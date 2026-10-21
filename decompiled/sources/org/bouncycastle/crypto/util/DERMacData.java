package org.bouncycastle.crypto.util;

import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.DERTaggedObject;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Strings;

/* JADX INFO: loaded from: classes5.dex */
public final class DERMacData {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f89613a;

    public static final class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Type f89614a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final DEROctetString f89615b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final DEROctetString f89616c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final DEROctetString f89617d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final DEROctetString f89618e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public byte[] f89619f;

        public Builder(Type type, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
            this.f89614a = type;
            this.f89615b = lm.a.a(bArr);
            this.f89616c = lm.a.a(bArr2);
            this.f89617d = lm.a.a(bArr3);
            this.f89618e = lm.a.a(bArr4);
        }

        public DERMacData build() {
            int[] iArr = a.f89620a;
            Type type = this.f89614a;
            int i10 = iArr[type.ordinal()];
            DEROctetString dEROctetString = this.f89617d;
            DEROctetString dEROctetString2 = this.f89618e;
            DEROctetString dEROctetString3 = this.f89615b;
            DEROctetString dEROctetString4 = this.f89616c;
            if (i10 == 1 || i10 == 2) {
                return new DERMacData(Arrays.concatenate(Arrays.concatenate(type.getHeader(), lm.a.b(dEROctetString3), lm.a.b(dEROctetString4)), Arrays.concatenate(lm.a.b(dEROctetString), lm.a.b(dEROctetString2), this.f89619f)));
            }
            if (i10 != 3 && i10 != 4) {
                throw new IllegalStateException("Unknown type encountered in build");
            }
            return new DERMacData(Arrays.concatenate(Arrays.concatenate(type.getHeader(), lm.a.b(dEROctetString4), lm.a.b(dEROctetString3)), Arrays.concatenate(lm.a.b(dEROctetString2), lm.a.b(dEROctetString), this.f89619f)));
        }

        public Builder withText(byte[] bArr) {
            this.f89619f = lm.a.b(new DERTaggedObject(false, 0, lm.a.a(bArr)));
            return this;
        }
    }

    public enum Type {
        UNILATERALU("KC_1_U"),
        UNILATERALV("KC_1_V"),
        BILATERALU("KC_2_U"),
        BILATERALV("KC_2_V");

        private final String enc;

        Type(String str) {
            this.enc = str;
        }

        public byte[] getHeader() {
            return Strings.toByteArray(this.enc);
        }
    }

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f89620a;

        static {
            int[] iArr = new int[Type.values().length];
            f89620a = iArr;
            try {
                iArr[Type.UNILATERALU.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f89620a[Type.BILATERALU.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f89620a[Type.UNILATERALV.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f89620a[Type.BILATERALV.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public DERMacData(byte[] bArr) {
        this.f89613a = bArr;
    }

    public byte[] getMacData() {
        return Arrays.clone(this.f89613a);
    }
}
