package com.mypinpad.tsdk.isolation;

import java.io.IOException;

/* JADX INFO: loaded from: classes10.dex */
public abstract class adn extends ady implements aei {

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public static final a f52482u0 = new a(adn.class, 22);
    public static int v0 = 0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public static int f52483w0 = 1;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public byte[] f52484t0;

    public static class a extends j0 {
        @Override // com.mypinpad.tsdk.isolation.j0
        public final ady b(aft aftVar) {
            Object[] objArr = {this, aftVar};
            System.identityHashCode(this);
            aft aftVar2 = (aft) objArr[1];
            return (adn) adn.setX(new Object[]{(byte[]) ads.setDividerPadding(new Object[]{aftVar2}, -952512304, 952512305, System.identityHashCode(aftVar2))}, -1810944468, 1810944469, (int) System.currentTimeMillis());
        }
    }

    static {
        int i10 = f52483w0;
        int i11 = ((i10 | 102) << 1) - (i10 ^ 102);
        int i12 = (i11 ^ (-1)) + (i11 << 1);
        v0 = i12 % 128;
        if (i12 % 2 != 0) {
            throw null;
        }
    }

    public static Object setX(Object[] objArr, int i10, int i11, int i12) {
        adn afpVar;
        ady adyVarC;
        Object objValueOf;
        int i13 = (i11 * 246) + (i10 * (-244));
        int i14 = ~i11;
        int i15 = (((~((~i12) | i14)) | (~(i14 | i10))) * (-245)) + i13;
        int i16 = ~(i14 | i12);
        switch (((i10 | i16) * 245) + (i16 * (-245)) + i15) {
            case 1:
                byte[] bArr = (byte[]) objArr[0];
                afpVar = new afp();
                afpVar.f52484t0 = bArr;
                int i17 = f52483w0 + 87;
                v0 = i17 % 128;
                if (i17 % 2 != 0) {
                    throw null;
                }
                return afpVar;
            case 2:
                adn adnVar = (adn) objArr[0];
                boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
                int i18 = v0;
                int i19 = i18 & 59;
                int i20 = (i19 - (~(-(-((i18 ^ 59) | i19))))) - 1;
                f52483w0 = i20 % 128;
                int i21 = i20 % 2;
                int length = adnVar.f52484t0.length;
                int iIntValue = ((Integer) aeb.setX(new Object[]{Boolean.valueOf(zBooleanValue), Integer.valueOf(length)}, 1150803379, -1150803367, length)).intValue();
                int i22 = v0;
                int i23 = (-2) - (((i22 ^ 20) + ((i22 & 20) << 1)) ^ (-1));
                f52483w0 = i23 % 128;
                if (i23 % 2 != 0) {
                    return Integer.valueOf(iIntValue);
                }
                throw null;
            case 3:
                int i24 = v0;
                int i25 = (i24 & 115) + (i24 | 115);
                int i26 = i25 % 128;
                f52483w0 = i26;
                int i27 = i25 % 2;
                int i28 = i26 | 113;
                int i29 = (i28 << 1) - ((~(i26 & 113)) & i28);
                v0 = i29 % 128;
                if (i29 % 2 == 0) {
                    return Boolean.FALSE;
                }
                throw null;
            case 4:
                adn adnVar2 = (adn) objArr[0];
                aeb aebVar = (aeb) objArr[1];
                boolean zBooleanValue2 = ((Boolean) objArr[2]).booleanValue();
                int i30 = v0;
                int i31 = ((i30 ^ 27) | (i30 & 27)) << 1;
                int i32 = -(((~i30) & 27) | (i30 & (-28)));
                int i33 = (i31 & i32) + (i32 | i31);
                f52483w0 = i33 % 128;
                int i34 = i33 % 2;
                byte[] bArr2 = adnVar2.f52484t0;
                if (i34 == 0) {
                    aeb.setX(new Object[]{aebVar, Boolean.valueOf(zBooleanValue2), 32, bArr2}, 478760665, -478760661, 32);
                } else {
                    aeb.setX(new Object[]{aebVar, Boolean.valueOf(zBooleanValue2), 22, bArr2}, 478760665, -478760661, 22);
                }
                int i35 = v0;
                int i36 = (i35 & (-46)) | ((~i35) & 45);
                int i37 = -(-((i35 & 45) << 1));
                int i38 = (i36 ^ i37) + ((i37 & i36) << 1);
                f52483w0 = i38 % 128;
                if (i38 % 2 != 0) {
                    return null;
                }
                int i39 = 46 / 0;
                return null;
            case 5:
                aeh aehVar = (aeh) objArr[0];
                int i40 = v0;
                int i41 = i40 & 13;
                int i42 = i41 + ((i40 ^ 13) | i41);
                f52483w0 = i42 % 128;
                int i43 = i42 % 2;
                a aVar = f52482u0;
                Object[] objArr2 = new Object[3];
                if (i43 == 0) {
                    objArr2[0] = aVar;
                    objArr2[1] = aehVar;
                    objArr2[2] = Boolean.TRUE;
                    adyVarC = j0.c(-1072042084, 1072042084, System.identityHashCode(aVar), objArr2);
                } else {
                    objArr2[0] = aVar;
                    objArr2[1] = aehVar;
                    objArr2[2] = Boolean.FALSE;
                    adyVarC = j0.c(-1072042084, 1072042084, System.identityHashCode(aVar), objArr2);
                }
                objValueOf = (adn) adyVarC;
                break;
            case 6:
                adn adnVar3 = (adn) objArr[0];
                int i44 = v0;
                int i45 = ((i44 ^ 113) - (~((i44 & 113) << 1))) - 1;
                f52483w0 = i45 % 128;
                int i46 = i45 % 2;
                String str = (String) bez.setX(new Object[]{adnVar3.f52484t0}, -1321203111, 1321203112, (int) System.currentTimeMillis());
                int i47 = v0 + 113;
                f52483w0 = i47 % 128;
                int i48 = i47 % 2;
                return str;
            case 7:
                Object obj = objArr[0];
                int i49 = v0;
                int i50 = ((i49 | 25) << 1) - (i49 ^ 25);
                int i51 = i50 % 128;
                f52483w0 = i51;
                int i52 = i50 % 2;
                if (obj != null) {
                    int i53 = (i51 | 41) << 1;
                    int i54 = -(i51 ^ 41);
                    int i55 = (i53 & i54) + (i53 | i54);
                    v0 = i55 % 128;
                    if (i55 % 2 != 0) {
                        boolean z10 = obj instanceof adn;
                        throw null;
                    }
                    if (!(obj instanceof adn)) {
                        if (obj instanceof add) {
                            int i56 = (i51 & 70) + (i51 | 70);
                            int i57 = (i56 ^ (-1)) + (i56 << 1);
                            v0 = i57 % 128;
                            if (i57 % 2 != 0) {
                                boolean z11 = ((add) obj).UiMessageCallbackKtWhenMappings() instanceof adn;
                                throw null;
                            }
                            ady adyVarUiMessageCallbackKtWhenMappings = ((add) obj).UiMessageCallbackKtWhenMappings();
                            if (adyVarUiMessageCallbackKtWhenMappings instanceof adn) {
                                int i58 = v0;
                                int i59 = i58 & 7;
                                int i60 = ((i58 | 7) & (~i59)) + (i59 << 1);
                                int i61 = i60 % 128;
                                f52483w0 = i61;
                                int i62 = i60 % 2;
                                afpVar = (adn) adyVarUiMessageCallbackKtWhenMappings;
                                int i63 = (((i61 | 22) << 1) - (i61 ^ 22)) - 1;
                                v0 = i63 % 128;
                                if (i63 % 2 != 0) {
                                    throw null;
                                }
                                return afpVar;
                            }
                        }
                        throw new IllegalArgumentException(androidx.emoji2.text.flatbuffer.a.c(obj, "illegal object in getInstance: "));
                    }
                }
                objValueOf = (adn) obj;
                int i64 = v0;
                int i65 = ((i64 | 86) << 1) - (i64 ^ 86);
                int i66 = (i65 ^ (-1)) + (i65 << 1);
                f52483w0 = i66 % 128;
                int i67 = i66 % 2;
                break;
            case 8:
                adn adnVar4 = (adn) objArr[0];
                int i68 = v0;
                int i69 = i68 & 77;
                int i70 = (i68 ^ 77) | i69;
                int i71 = ((i69 | i70) << 1) - (i70 ^ i69);
                f52483w0 = i71 % 128;
                int i72 = i71 % 2;
                int iIntValue2 = ((Integer) bek.setOnFocusChangeListener(new Object[]{adnVar4.f52484t0}, -642573231, 642573231, (int) System.currentTimeMillis())).intValue();
                int i73 = f52483w0 + 83;
                v0 = i73 % 128;
                int i74 = i73 % 2;
                return Integer.valueOf(iIntValue2);
            default:
                adn adnVar5 = (adn) objArr[0];
                ady adyVar = (ady) objArr[1];
                int i75 = f52483w0;
                int i76 = i75 & 99;
                int i77 = -(-((i75 ^ 99) | i76));
                int i78 = ((i76 | i77) << 1) - (i76 ^ i77);
                v0 = i78 % 128;
                int i79 = i78 % 2;
                if (!(adyVar instanceof adn)) {
                    int i80 = i75 & 113;
                    int i81 = (i75 ^ 113) | i80;
                    int i82 = (i80 ^ i81) + ((i80 & i81) << 1);
                    int i83 = i82 % 128;
                    v0 = i83;
                    int i84 = i82 % 2;
                    int i85 = (i83 ^ 31) + ((i83 & 31) << 1);
                    f52483w0 = i85 % 128;
                    int i86 = i85 % 2;
                    objValueOf = Boolean.FALSE;
                } else {
                    boolean zBooleanValue3 = ((Boolean) bek.setOnFocusChangeListener(new Object[]{adnVar5.f52484t0, ((adn) adyVar).f52484t0}, -576846525, 576846546, (int) System.currentTimeMillis())).booleanValue();
                    int i87 = f52483w0 + 101;
                    v0 = i87 % 128;
                    int i88 = i87 % 2;
                    objValueOf = Boolean.valueOf(zBooleanValue3);
                }
                break;
        }
        return objValueOf;
    }

    @Override // com.mypinpad.tsdk.isolation.ady
    public final int b(boolean z10) {
        return ((Integer) setX(new Object[]{this, Boolean.valueOf(z10)}, -1747884927, 1747884929, System.identityHashCode(this))).intValue();
    }

    @Override // com.mypinpad.tsdk.isolation.ady
    public final void c(aeb aebVar, boolean z10) throws IOException {
        setX(new Object[]{this, aebVar, Boolean.valueOf(z10)}, -1721931110, 1721931114, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.ady
    public final boolean d(ady adyVar) {
        return ((Boolean) setX(new Object[]{this, adyVar}, 515053701, -515053701, System.identityHashCode(this))).booleanValue();
    }

    @Override // com.mypinpad.tsdk.isolation.adw
    public final int hashCode() {
        return ((Integer) setX(new Object[]{this}, -2048286403, 2048286411, System.identityHashCode(this))).intValue();
    }

    @Override // com.mypinpad.tsdk.isolation.aei
    public final String setOnFocusChangeListener() {
        return (String) setX(new Object[]{this}, 1386730368, -1386730362, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.ady
    public final boolean setY() {
        return ((Boolean) setX(new Object[]{this}, -936224442, 936224445, System.identityHashCode(this))).booleanValue();
    }

    public String toString() {
        int i10 = f52483w0;
        int i11 = (i10 ^ 11) + ((i10 & 11) << 1);
        v0 = i11 % 128;
        if (i11 % 2 == 0) {
            return (String) setX(new Object[]{this}, 1386730368, -1386730362, System.identityHashCode(this));
        }
        throw null;
    }

    public static adn setOnFocusChangeListener(aeh aehVar) {
        return (adn) setX(new Object[]{aehVar}, 550412940, -550412935, (int) System.currentTimeMillis());
    }

    public static adn setY(Object obj) {
        return (adn) setX(new Object[]{obj}, 1552385900, -1552385893, (int) System.currentTimeMillis());
    }
}
