package com.mypinpad.tsdk.isolation;

import java.io.IOException;
import org.bouncycastle.asn1.ASN1Encoding;

/* JADX INFO: loaded from: classes10.dex */
public final class aft extends ads {
    public static int E0 = 1;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public static int f52602y0;

    public aft(add addVar) throws IOException {
        super(addVar.UiMessageCallbackKtWhenMappings().setX(ASN1Encoding.DER));
    }

    public static /* synthetic */ Object setCompoundDrawableTintBlendMode(Object[] objArr, int i10, int i11, int i12) throws IOException {
        Object obj;
        int i13 = ~i11;
        int i14 = (((~((~i12) | i13)) | (~(i13 | i10))) * (-245)) + (i11 * 246) + (i10 * (-244));
        int i15 = ~(i13 | i12);
        switch (((i10 | i15) * 245) + (i15 * (-245)) + i14) {
            case 1:
                obj = null;
                aeb aebVar = (aeb) objArr[0];
                byte[] bArr = (byte[]) objArr[1];
                int iIntValue = ((Number) objArr[2]).intValue();
                int iIntValue2 = ((Number) objArr[3]).intValue();
                int i16 = f52602y0;
                int i17 = (i16 & 19) + (i16 | 19);
                E0 = i17 % 128;
                if (i17 % 2 == 0) {
                    aeb.setX(new Object[]{aebVar, Boolean.FALSE, 3, bArr, Integer.valueOf(iIntValue), Integer.valueOf(iIntValue2)}, -734840943, 734840948, 3);
                } else {
                    aeb.setX(new Object[]{aebVar, Boolean.TRUE, 4, bArr, Integer.valueOf(iIntValue), Integer.valueOf(iIntValue2)}, -734840943, 734840948, 4);
                }
                int i18 = f52602y0 + 117;
                E0 = i18 % 128;
                int i19 = i18 % 2;
                break;
            case 2:
                int iIntValue3 = ((Number) objArr[0]).intValue();
                int i20 = ~iIntValue3;
                int i21 = ~i20;
                int i22 = 1528716566 & i20;
                int i23 = (~i22) & (1528716566 | i20);
                int i24 = (i22 & i23) | (i23 ^ i22);
                int i25 = (i24 & (-219529315)) | ((~i24) & 219529314);
                int i26 = i24 & 219529314;
                int i27 = ~((i26 & i25) | (i25 ^ i26));
                int i28 = ((-219529315) ^ i20) | ((-219529315) & i20);
                int i29 = (i28 & 1528716566) | ((~i28) & (-1528716567));
                int i30 = i28 & (-1528716567);
                int i31 = ~((i30 & i29) | (i29 ^ i30));
                int i32 = i27 & i31;
                int i33 = (i27 | i31) & (~i32);
                int i34 = -(-(((i33 & i32) | (i33 ^ i32)) * (-184)));
                int i35 = (((((-936901277) ^ i34) | ((-936901277) & i34)) << 1) - (~(-((i34 & 936901276) | ((-936901277) & (~i34)))))) - 1;
                int i36 = (i20 | iIntValue3) & i20;
                int i37 = 1528716566 & i36;
                int i38 = (1528716566 | i36) & (~i37);
                int i39 = ~((i38 & i37) | (i38 ^ i37));
                int i40 = 67207264 & i39;
                int i41 = (i39 | 67207264) & (~i40);
                int i42 = (i41 & i40) | (i41 ^ i40);
                int i43 = ~((-219529315) | i20);
                int i44 = i42 & i43;
                int i45 = (i42 | i43) & (~i44);
                int i46 = ((i45 & i44) | (i45 ^ i44)) * 184;
                int i47 = i35 & i46;
                int i48 = -(-(i46 | i35));
                int i49 = (i47 ^ i48) + ((i48 & i47) << 1);
                int i50 = i49 ^ 146479336;
                int i51 = (146479336 & i49) << 1;
                int i52 = (i50 ^ i51) + ((i51 & i50) << 1);
                int i53 = 2065488018 & i20;
                int i54 = (iIntValue3 & (-2065488019)) | i53;
                int i55 = 2065488018 & iIntValue3;
                int i56 = ~((i54 ^ i55) | (i54 & i55));
                int i57 = ~((i36 & (-957516225)) | (i36 & 957516224) | ((-957516225) & (~i36)) | (-2065488019));
                int i58 = i56 & i57;
                int i59 = (-1887986529) - (~((((~i58) & (i57 | i56)) | i58) * (-406)));
                int i60 = 2065488018 & i21;
                int i61 = i20 & (-2065488019);
                int i62 = i60 | i61;
                int i63 = (i62 & i53) | (i62 ^ i53);
                int i64 = (~((i63 & (-957516225)) | (i63 ^ (-957516225)))) * (-406);
                int i65 = i59 & i64;
                int i66 = (i64 | i59) & (~i65);
                int i67 = i65 << 1;
                int i68 = ((i66 | i67) << 1) - (i66 ^ i67);
                int i69 = (957516224 ^ iIntValue3) | (957516224 & iIntValue3);
                int i70 = ~i69;
                int i71 = (i69 | i70) & i70;
                int i72 = i20 ^ (-2065488019);
                int i73 = ~((i72 & i61) | (i72 ^ i61));
                int i74 = ((~i73) & i71) | ((~i71) & i73);
                int i75 = i71 & i73;
                int iIntValue4 = ((Integer) (i52 > (i68 - (~(-(-(((i75 & i74) | (i74 ^ i75)) * 406))))) - 1 ? aeb.setX(new Object[]{Boolean.TRUE, Integer.valueOf(iIntValue3)}, 1150803379, -1150803367, iIntValue3) : aeb.setX(new Object[]{Boolean.TRUE, Integer.valueOf(iIntValue3)}, 1150803379, -1150803367, iIntValue3))).intValue();
                int i76 = E0 + 99;
                f52602y0 = i76 % 128;
                if (i76 % 2 == 0) {
                    return Integer.valueOf(iIntValue4);
                }
                throw null;
            case 3:
                aft aftVar = (aft) objArr[0];
                aeb aebVar2 = (aeb) objArr[1];
                boolean zBooleanValue = ((Boolean) objArr[2]).booleanValue();
                int i77 = f52602y0;
                int i78 = i77 & 89;
                int i79 = (89 | i77) & (~i78);
                int i80 = i78 << 1;
                int i81 = (i79 & i80) + (i79 | i80);
                E0 = i81 % 128;
                int i82 = i81 % 2;
                aeb.setX(new Object[]{aebVar2, Boolean.valueOf(zBooleanValue), 4, aftVar.f52503t0}, 478760665, -478760661, 4);
                int i83 = f52602y0;
                int i84 = (i83 & (-40)) | ((~i83) & 39);
                int i85 = -(-((i83 & 39) << 1));
                int i86 = ((i84 | i85) << 1) - (i85 ^ i84);
                E0 = i86 % 128;
                int i87 = i86 % 2;
                return null;
            case 4:
                obj = (aft) objArr[0];
                int i88 = E0;
                int i89 = ((((i88 ^ 89) | (i88 & 89)) << 1) - (~(-(((~i88) & 89) | (i88 & (-90)))))) - 1;
                f52602y0 = i89 % 128;
                if (i89 % 2 != 0) {
                    throw null;
                }
                break;
            case 5:
                aft aftVar2 = (aft) objArr[0];
                int i90 = f52602y0;
                int i91 = i90 & 39;
                int i92 = -(-((i90 ^ 39) | i91));
                int i93 = (i91 ^ i92) + ((i91 & i92) << 1);
                E0 = i93 % 128;
                if (i93 % 2 == 0) {
                    int i94 = 43 / 0;
                }
                int i95 = i90 | 87;
                int i96 = (i95 << 1) - ((~(i90 & 87)) & i95);
                E0 = i96 % 128;
                int i97 = i96 % 2;
                return aftVar2;
            case 6:
                aft aftVar3 = (aft) objArr[0];
                boolean zBooleanValue2 = ((Boolean) objArr[1]).booleanValue();
                int i98 = E0 + 7;
                f52602y0 = i98 % 128;
                int i99 = i98 % 2;
                int length = aftVar3.f52503t0.length;
                int iIntValue5 = ((Integer) aeb.setX(new Object[]{Boolean.valueOf(zBooleanValue2), Integer.valueOf(length)}, 1150803379, -1150803367, length)).intValue();
                int i100 = E0;
                int i101 = (i100 ^ 70) + ((i100 & 70) << 1);
                int i102 = (i101 ^ (-1)) + (i101 << 1);
                f52602y0 = i102 % 128;
                if (i102 % 2 == 0) {
                    return Integer.valueOf(iIntValue5);
                }
                throw null;
            default:
                int i103 = E0;
                int i104 = i103 ^ 71;
                int i105 = (i103 & 71) << 1;
                int i106 = ((i104 | i105) << 1) - (i105 ^ i104);
                int i107 = i106 % 128;
                f52602y0 = i107;
                int i108 = i106 % 2;
                int i109 = i107 + 93;
                E0 = i109 % 128;
                if (i109 % 2 == 0) {
                    int i110 = 81 / 0;
                }
                obj = Boolean.FALSE;
                break;
        }
        return obj;
    }

    @Override // com.mypinpad.tsdk.isolation.ads, com.mypinpad.tsdk.isolation.ady
    public final ady a() {
        return (ady) setCompoundDrawableTintBlendMode(new Object[]{this}, 683796198, -683796194, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.ady
    public final int b(boolean z10) {
        return ((Integer) setCompoundDrawableTintBlendMode(new Object[]{this, Boolean.valueOf(z10)}, 1375783440, -1375783434, System.identityHashCode(this))).intValue();
    }

    @Override // com.mypinpad.tsdk.isolation.ady
    public final void c(aeb aebVar, boolean z10) throws IOException {
        setCompoundDrawableTintBlendMode(new Object[]{this, aebVar, Boolean.valueOf(z10)}, 147367083, -147367080, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.ads, com.mypinpad.tsdk.isolation.ady
    public final ady e() {
        return (ady) setCompoundDrawableTintBlendMode(new Object[]{this}, 506449444, -506449439, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.ady
    public final boolean setY() {
        return ((Boolean) setCompoundDrawableTintBlendMode(new Object[]{this}, -513290673, 513290673, System.identityHashCode(this))).booleanValue();
    }

    public aft(byte[] bArr) {
        super(bArr);
    }
}
