package com.mypinpad.tsdk.isolation;

import java.io.IOException;
import java.security.Principal;
import org.bouncycastle.asn1.ASN1Encoding;

/* JADX INFO: loaded from: classes10.dex */
public final class apd extends ajq implements Principal {
    public static int H0 = 0;
    public static int I0 = 1;

    public apd(ain ainVar) {
        super((aed) ainVar.UiMessageCallbackKtWhenMappings());
    }

    public static /* synthetic */ Object setDividerPadding(Object[] objArr, int i10, int i11, int i12) {
        if ((((~(i10 | i12)) | (~(i11 | (~i12)))) * 627) + (((~((~i11) | i12)) | i10) * (-627)) + ((i11 | i12 | (~i10)) * (-627)) + (i11 * 628) + (i10 * 628) == 1) {
            apd apdVar = (apd) objArr[0];
            int i13 = I0;
            int i14 = (i13 & (-20)) | ((~i13) & 19);
            int i15 = -(-((i13 & 19) << 1));
            int i16 = (i14 & i15) + (i15 | i14);
            H0 = i16 % 128;
            if (i16 % 2 == 0) {
                return apdVar.toString();
            }
            apdVar.toString();
            throw null;
        }
        apd apdVar2 = (apd) objArr[0];
        int i17 = H0;
        int i18 = (i17 & (-118)) | ((~i17) & 117);
        int i19 = (i17 & 117) << 1;
        int i20 = (i18 ^ i19) + ((i19 & i18) << 1);
        I0 = i20 % 128;
        int i21 = i20 % 2;
        try {
            byte[] x4 = apdVar2.setX(ASN1Encoding.DER);
            int i22 = H0 + 99;
            I0 = i22 % 128;
            if (i22 % 2 != 0) {
                return x4;
            }
            throw null;
        } catch (IOException e5) {
            throw new RuntimeException(e5.toString());
        }
    }

    @Override // java.security.Principal
    public final String getName() {
        return (String) setDividerPadding(new Object[]{this}, -1794332040, 1794332041, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.adw, com.mypinpad.tsdk.isolation.ben
    public final byte[] setAlwaysDrawnWithCacheEnabled() {
        return (byte[]) setDividerPadding(new Object[]{this}, 974019832, -974019832, System.identityHashCode(this));
    }
}
