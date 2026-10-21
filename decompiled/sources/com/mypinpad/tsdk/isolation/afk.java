package com.mypinpad.tsdk.isolation;

import com.bbva.sl.ar.android.libkeymanagement.exception.ReturnCode;
import java.io.IOException;
import org.bouncycastle.asn1.ASN1Encoding;

/* JADX INFO: loaded from: classes10.dex */
public class afk extends acz {
    public static int E0 = 1;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public static int f52594y0;

    public afk(add addVar) throws IOException {
        super(addVar.UiMessageCallbackKtWhenMappings().setX(ASN1Encoding.DER), 0);
    }

    public static /* synthetic */ Object setX(Object[] objArr, int i10, int i11, int i12) throws IOException {
        afk afkVar;
        int iIntValue;
        int i13 = ~i11;
        int i14 = ~i12;
        int i15 = (((~(i10 | i12)) | (~(i11 | i14))) * 950) + (((~(i14 | i10)) | (~(i11 | i12))) * (-950)) + (((~(i13 | i14)) | (~((~i10) | i12))) * ReturnCode.ERR_REPOSITORY) + (i11 * (-949)) + (i10 * (-949));
        if (i15 == 1) {
            afkVar = (afk) objArr[0];
            int i16 = E0;
            int i17 = i16 + 107;
            f52594y0 = i17 % 128;
            if (i17 % 2 != 0) {
                throw null;
            }
            int i18 = i16 & 15;
            int i19 = ((i16 | 15) & (~i18)) + (i18 << 1);
            f52594y0 = i19 % 128;
            if (i19 % 2 != 0) {
                int i20 = 89 / 0;
            }
        } else {
            if (i15 == 2) {
                afk afkVar2 = (afk) objArr[0];
                aeb aebVar = (aeb) objArr[1];
                boolean zBooleanValue = ((Boolean) objArr[2]).booleanValue();
                int i21 = E0;
                int i22 = i21 & 75;
                int i23 = i22 + ((i21 ^ 75) | i22);
                f52594y0 = i23 % 128;
                int i24 = i23 % 2;
                byte[] bArr = afkVar2.f52440t0;
                int i25 = bArr[0] & 255;
                int length = bArr.length;
                int iIdentityHashCode = System.identityHashCode(afkVar2);
                int i26 = -(-(length * 530));
                int i27 = 528 & i26;
                int i28 = (i27 - (~(-(-((i26 ^ 528) | i27))))) - 1;
                int i29 = ~iIdentityHashCode;
                int i30 = ~((i29 ^ (-1)) | i29);
                int i31 = ~length;
                int i32 = ~((i31 ^ length) | (i31 & length));
                int i33 = i30 & i32;
                int i34 = (~i33) & (i32 | i30);
                int i35 = -(-(((i33 & i34) | (i34 ^ i33)) * 529));
                int i36 = i28 & i35;
                int i37 = (i35 | i28) & (~i36);
                int i38 = -(-(i36 << 1));
                int i39 = ((i37 | i38) << 1) - (i37 ^ i38);
                int i40 = i31 & (i31 | length);
                int i41 = ~((i29 ^ iIdentityHashCode) | (i29 & iIdentityHashCode));
                int i42 = ((~i41) & i40) | ((~i40) & i41);
                int i43 = i40 & i41;
                int i44 = i39 - (~(-(-(((i43 & i42) | (i42 ^ i43)) * 529))));
                int i45 = (i44 ^ (-1)) + (i44 << 1);
                byte[] bArr2 = afkVar2.f52440t0;
                byte b10 = bArr2[i45];
                byte b11 = (byte) ((255 << i25) & b10);
                if (b10 == b11) {
                    int i46 = E0 + 79;
                    f52594y0 = i46 % 128;
                    if (i46 % 2 != 0) {
                        aeb.setX(new Object[]{aebVar, Boolean.valueOf(zBooleanValue), 3, bArr2}, 478760665, -478760661, 3);
                    } else {
                        aeb.setX(new Object[]{aebVar, Boolean.valueOf(zBooleanValue), 3, bArr2}, 478760665, -478760661, 3);
                    }
                } else {
                    aeb.setX(new Object[]{aebVar, Boolean.valueOf(zBooleanValue), bArr2, Integer.valueOf(i45), Byte.valueOf(b11)}, 2089246745, -2089246737, i45);
                    int i47 = E0;
                    int i48 = (i47 ^ 19) + ((i47 & 19) << 1);
                    f52594y0 = i48 % 128;
                    if (i48 % 2 != 0) {
                        int i49 = 51 / 0;
                    }
                }
                return null;
            }
            if (i15 == 3) {
                afk afkVar3 = (afk) objArr[0];
                boolean zBooleanValue2 = ((Boolean) objArr[1]).booleanValue();
                int i50 = E0;
                int i51 = ((((i50 ^ 59) | (i50 & 59)) << 1) - (~(-(((~i50) & 59) | (i50 & (-60)))))) - 1;
                f52594y0 = i51 % 128;
                int i52 = i51 % 2;
                byte[] bArr3 = afkVar3.f52440t0;
                if (i52 != 0) {
                    int length2 = bArr3.length;
                    iIntValue = ((Integer) aeb.setX(new Object[]{Boolean.valueOf(zBooleanValue2), Integer.valueOf(length2)}, 1150803379, -1150803367, length2)).intValue();
                    int i53 = 44 / 0;
                } else {
                    int length3 = bArr3.length;
                    iIntValue = ((Integer) aeb.setX(new Object[]{Boolean.valueOf(zBooleanValue2), Integer.valueOf(length3)}, 1150803379, -1150803367, length3)).intValue();
                }
                int i54 = E0;
                int i55 = ((i54 & 89) - (~(-(-(89 | i54))))) - 1;
                f52594y0 = i55 % 128;
                int i56 = i55 % 2;
                return Integer.valueOf(iIntValue);
            }
            if (i15 != 4) {
                int i57 = E0;
                int i58 = (i57 ^ 115) + ((i57 & 115) << 1);
                int i59 = i58 % 128;
                f52594y0 = i59;
                int i60 = i58 % 2;
                int i61 = ((-1) << 1) - ((-1) ^ ((i59 & 96) + (i59 | 96)));
                E0 = i61 % 128;
                int i62 = i61 % 2;
                return Boolean.FALSE;
            }
            afkVar = (afk) objArr[0];
            int i63 = f52594y0;
            int i64 = i63 & 19;
            int i65 = (i63 | 19) & (~i64);
            int i66 = -(-(i64 << 1));
            int i67 = (i65 ^ i66) + ((i65 & i66) << 1);
            int i68 = i67 % 128;
            E0 = i68;
            int i69 = i67 % 2;
            int i70 = ((i68 ^ 105) | (i68 & 105)) << 1;
            int i71 = -(((~i68) & 105) | (i68 & (-106)));
            int i72 = (i70 ^ i71) + ((i71 & i70) << 1);
            f52594y0 = i72 % 128;
            if (i72 % 2 != 0) {
                throw null;
            }
        }
        return afkVar;
    }

    @Override // com.mypinpad.tsdk.isolation.acz, com.mypinpad.tsdk.isolation.ady
    public final ady a() {
        return (ady) setX(new Object[]{this}, 443064502, -443064501, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.ady
    public final int b(boolean z10) {
        return ((Integer) setX(new Object[]{this, Boolean.valueOf(z10)}, 991452862, -991452859, System.identityHashCode(this))).intValue();
    }

    @Override // com.mypinpad.tsdk.isolation.ady
    public final void c(aeb aebVar, boolean z10) throws IOException {
        setX(new Object[]{this, aebVar, Boolean.valueOf(z10)}, -1851523499, 1851523501, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.acz, com.mypinpad.tsdk.isolation.ady
    public final ady e() {
        return (ady) setX(new Object[]{this}, 1697546399, -1697546395, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.ady
    public final boolean setY() {
        return ((Boolean) setX(new Object[]{this}, -1978012302, 1978012302, System.identityHashCode(this))).booleanValue();
    }

    public afk(byte[] bArr, int i10) {
        super(bArr, i10);
    }

    public afk(byte[] bArr) {
        this(bArr, 0);
    }
}
