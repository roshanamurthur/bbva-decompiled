package jh;

import com.google.zxing.pdf417.decoder.ec.ModulusGF;
import com.mastercard.mpsdk.mcbp.mcmlite.apdu.emv.ComputeCcCommandApdu;
import com.mastercard.mpsdk.mcbp.mcmlite.apdu.emv.GenerateAcCommandApdu;
import com.mastercard.mpsdk.mcbp.mcmlite.apdu.emv.GetProcessingOptionsCommandApdu;
import com.mastercard.mpsdk.mcbp.mcmlite.apdu.emv.ReadRecordCommandApdu;
import com.mastercard.mpsdk.mcbp.mcmlite.apdu.emv.ResponseApduFactory;
import com.mastercard.mpsdk.mcbp.mcmlite.crypto.McmLiteCrypto;
import com.mastercard.mpsdk.mcbp.mcmlite.impl.logic.contactless.ComputeCryptographicChecksum;
import com.mastercard.mpsdk.mcbp.mcmlite.impl.logic.contactless.GenerateApplicationCryptogram;
import com.mastercard.mpsdk.mcbp.mcmlite.impl.logic.contactless.ReadRecord;
import com.mastercard.mpsdk.mcbp.mcmlite.impl.state.ContactlessContext;
import wh.c;

/* JADX INFO: compiled from: ModulusPoly.java */
/* JADX INFO: loaded from: classes10.dex */
public final class a implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f79090a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f79091b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f79092c;

    public a(ModulusGF modulusGF, int[] iArr) {
        if (iArr.length == 0) {
            throw new IllegalArgumentException();
        }
        this.f79091b = modulusGF;
        int length = iArr.length;
        int i10 = 1;
        if (length <= 1 || iArr[0] != 0) {
            this.f79092c = iArr;
            return;
        }
        while (i10 < length && iArr[i10] == 0) {
            i10++;
        }
        if (i10 == length) {
            this.f79092c = new int[]{0};
            return;
        }
        int i11 = length - i10;
        int[] iArr2 = new int[i11];
        this.f79092c = iArr2;
        System.arraycopy(iArr, i10, iArr2, 0, i11);
    }

    @Override // wh.c
    public final byte[] a(ReadRecordCommandApdu readRecordCommandApdu) {
        return ReadRecord.of(readRecordCommandApdu, (ContactlessContext) this.f79091b).getResponse();
    }

    @Override // wh.c
    public final byte[] b(ComputeCcCommandApdu computeCcCommandApdu) {
        return ComputeCryptographicChecksum.of((McmLiteCrypto) this.f79092c, computeCcCommandApdu, (ContactlessContext) this.f79091b).response();
    }

    @Override // wh.c
    public final byte[] c(GenerateAcCommandApdu generateAcCommandApdu) {
        return GenerateApplicationCryptogram.of((McmLiteCrypto) this.f79092c, generateAcCommandApdu, (ContactlessContext) this.f79091b).response();
    }

    @Override // wh.c
    public final void cancelPayment() {
        ((ContactlessContext) this.f79091b).wipe();
    }

    @Override // wh.c
    public final byte[] d(GetProcessingOptionsCommandApdu getProcessingOptionsCommandApdu) {
        return ResponseApduFactory.conditionsOfUseNotSatisfied();
    }

    public final a e(a aVar) {
        ModulusGF modulusGF = (ModulusGF) this.f79091b;
        if (!modulusGF.equals((ModulusGF) aVar.f79091b)) {
            throw new IllegalArgumentException("ModulusPolys do not have same ModulusGF field");
        }
        if (i()) {
            return aVar;
        }
        if (aVar.i()) {
            return this;
        }
        int[] iArr = (int[]) this.f79092c;
        int[] iArr2 = (int[]) aVar.f79092c;
        if (iArr.length <= iArr2.length) {
            iArr = iArr2;
            iArr2 = iArr;
        }
        int[] iArr3 = new int[iArr.length];
        int length = iArr.length - iArr2.length;
        System.arraycopy(iArr, 0, iArr3, 0, length);
        for (int i10 = length; i10 < iArr.length; i10++) {
            iArr3[i10] = (iArr2[i10 - length] + iArr[i10]) % modulusGF.f50002e;
        }
        return new a(modulusGF, iArr3);
    }

    public final int f(int i10) {
        if (i10 == 0) {
            return g(0);
        }
        Object obj = this.f79091b;
        Object obj2 = this.f79092c;
        if (i10 == 1) {
            int i11 = 0;
            for (int i12 : (int[]) obj2) {
                i11 = (i11 + i12) % ((ModulusGF) obj).f50002e;
            }
            return i11;
        }
        int[] iArr = (int[]) obj2;
        int iB = iArr[0];
        int length = iArr.length;
        for (int i13 = 1; i13 < length; i13++) {
            ModulusGF modulusGF = (ModulusGF) obj;
            iB = (modulusGF.b(i10, iB) + iArr[i13]) % modulusGF.f50002e;
        }
        return iB;
    }

    public final int g(int i10) {
        Object obj = this.f79092c;
        return ((int[]) obj)[(((int[]) obj).length - 1) - i10];
    }

    public final int h() {
        return ((int[]) this.f79092c).length - 1;
    }

    public final boolean i() {
        return ((int[]) this.f79092c)[0] == 0;
    }

    public final a j(int i10) {
        Object obj = this.f79091b;
        if (i10 == 0) {
            return ((ModulusGF) obj).f50000c;
        }
        if (i10 == 1) {
            return this;
        }
        Object obj2 = this.f79092c;
        int length = ((int[]) obj2).length;
        int[] iArr = new int[length];
        for (int i11 = 0; i11 < length; i11++) {
            iArr[i11] = ((ModulusGF) obj).b(((int[]) obj2)[i11], i10);
        }
        return new a((ModulusGF) obj, iArr);
    }

    public final a k(a aVar) {
        ModulusGF modulusGF = (ModulusGF) this.f79091b;
        if (!modulusGF.equals((ModulusGF) aVar.f79091b)) {
            throw new IllegalArgumentException("ModulusPolys do not have same ModulusGF field");
        }
        if (i() || aVar.i()) {
            return modulusGF.f50000c;
        }
        int[] iArr = (int[]) this.f79092c;
        int length = iArr.length;
        int[] iArr2 = (int[]) aVar.f79092c;
        int length2 = iArr2.length;
        int[] iArr3 = new int[(length + length2) - 1];
        for (int i10 = 0; i10 < length; i10++) {
            int i11 = iArr[i10];
            for (int i12 = 0; i12 < length2; i12++) {
                int i13 = i10 + i12;
                iArr3[i13] = (modulusGF.b(i11, iArr2[i12]) + iArr3[i13]) % modulusGF.f50002e;
            }
        }
        return new a(modulusGF, iArr3);
    }

    public final a l() {
        int[] iArr = (int[]) this.f79092c;
        int length = iArr.length;
        int[] iArr2 = new int[length];
        int i10 = 0;
        while (true) {
            Object obj = this.f79091b;
            if (i10 >= length) {
                return new a((ModulusGF) obj, iArr2);
            }
            int i11 = iArr[i10];
            int i12 = ((ModulusGF) obj).f50002e;
            iArr2[i10] = (i12 - i11) % i12;
            i10++;
        }
    }

    public final a m(a aVar) {
        if (((ModulusGF) this.f79091b).equals((ModulusGF) aVar.f79091b)) {
            return aVar.i() ? this : e(aVar.l());
        }
        throw new IllegalArgumentException("ModulusPolys do not have same ModulusGF field");
    }

    public final String toString() {
        switch (this.f79090a) {
            case 0:
                StringBuilder sb2 = new StringBuilder(h() * 8);
                for (int iH = h(); iH >= 0; iH--) {
                    int iG = g(iH);
                    if (iG != 0) {
                        if (iG < 0) {
                            sb2.append(" - ");
                            iG = -iG;
                        } else if (sb2.length() > 0) {
                            sb2.append(" + ");
                        }
                        if (iH == 0 || iG != 1) {
                            sb2.append(iG);
                        }
                        if (iH != 0) {
                            if (iH == 1) {
                                sb2.append('x');
                            } else {
                                sb2.append("x^");
                                sb2.append(iH);
                            }
                        }
                    }
                }
                return sb2.toString();
            default:
                return super.toString();
        }
    }

    public a(McmLiteCrypto mcmLiteCrypto, ContactlessContext contactlessContext) {
        this.f79092c = mcmLiteCrypto;
        this.f79091b = contactlessContext;
    }
}
