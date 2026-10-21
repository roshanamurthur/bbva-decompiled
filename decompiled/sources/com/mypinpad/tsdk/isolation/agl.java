package com.mypinpad.tsdk.isolation;

import com.bbva.sl.ar.android.sslpinning.result.ResultCode;
import java.io.IOException;

/* JADX INFO: loaded from: classes10.dex */
public final class agl implements aef {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static int f52618q0 = 0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static int f52619r0 = 1;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public aej f52620p0;

    public static /* synthetic */ Object setOnFocusChangeListener(Object[] objArr, int i10, int i11, int i12) {
        int i13 = (i11 * (-520)) + (i10 * ResultCode.ERROR_TRUST_CERT_DATE_BEFOREVALIDITY);
        int i14 = ~i12;
        int i15 = ((i11 | i12) * ResultCode.ERROR_TRUST_CERT_DATE_AFTERVALIDITY) + (((~(i14 | i11)) | i10) * (-1042)) + i13;
        int i16 = ~i10;
        if ((((~(i10 | i14 | i11)) | (~(i12 | i16)) | (~((~i11) | i16))) * ResultCode.ERROR_TRUST_CERT_DATE_AFTERVALIDITY) + i15 == 1) {
            agl aglVar = (agl) objArr[0];
            int i17 = f52618q0;
            int i18 = i17 & 87;
            int i19 = (i17 ^ 87) | i18;
            int i20 = ((i18 | i19) << 1) - (i19 ^ i18);
            f52619r0 = i20 % 128;
            int i21 = i20 % 2;
            aej aejVar = aglVar.f52620p0;
            if (i21 != 0) {
                return (ago) p0.a(new Object[]{(adh) aej.setCompoundDrawableTintBlendMode(new Object[]{aejVar}, 2021899958, -2021899954, System.identityHashCode(aejVar))}, -95689853, 95689854, (int) System.currentTimeMillis());
            }
            throw null;
        }
        agl aglVar2 = (agl) objArr[0];
        int i22 = f52619r0;
        int i23 = (i22 ^ 63) + ((i22 & 63) << 1);
        f52618q0 = i23 % 128;
        int i24 = i23 % 2;
        try {
            ady adyVar = (ady) setOnFocusChangeListener(new Object[]{aglVar2}, -1601840801, 1601840802, System.identityHashCode(aglVar2));
            int i25 = f52618q0;
            int i26 = (i25 & (-6)) | ((~i25) & 5);
            int i27 = -(-((i25 & 5) << 1));
            int i28 = ((i26 | i27) << 1) - (i27 ^ i26);
            f52619r0 = i28 % 128;
            if (i28 % 2 != 0) {
                return adyVar;
            }
            throw null;
        } catch (IOException e5) {
            throw new adx(e5.getMessage(), e5);
        }
    }

    @Override // com.mypinpad.tsdk.isolation.add
    public final ady UiMessageCallbackKtWhenMappings() {
        return (ady) setOnFocusChangeListener(new Object[]{this}, -2100114061, 2100114061, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.agt
    public final ady setLayoutAnimation() throws IOException {
        return (ady) setOnFocusChangeListener(new Object[]{this}, -1601840801, 1601840802, System.identityHashCode(this));
    }
}
