package com.mypinpad.tsdk.isolation;

import com.bbva.sl.ar.android.sslpinning.result.ResultCode;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.security.PrivateKey;

/* JADX INFO: loaded from: classes10.dex */
public final class bct implements bbx, PrivateKey {

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static int f54512r0 = 0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public static int f54513s0 = 1;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public transient ays f54514p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public transient aee f54515q0;

    public bct(ahw ahwVar) throws IOException {
        setOnFocusChangeListener(new Object[]{this, ahwVar}, -69386971, 69386972, System.identityHashCode(this));
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        int i10 = f54513s0;
        int i11 = i10 & 15;
        int i12 = i11 + ((i10 ^ 15) | i11);
        f54512r0 = i12 % 128;
        int i13 = i12 % 2;
        objectInputStream.defaultReadObject();
        setOnFocusChangeListener(new Object[]{this, (ahw) ahw.setX(new Object[]{(byte[]) objectInputStream.readObject()}, -1552871480, 1552871484, (int) System.currentTimeMillis())}, -69386971, 69386972, System.identityHashCode(this));
        int i14 = f54512r0;
        int i15 = i14 & 89;
        int i16 = ((i14 ^ 89) | i15) << 1;
        int i17 = -((i14 | 89) & (~i15));
        int i18 = (i16 ^ i17) + ((i17 & i16) << 1);
        f54513s0 = i18 % 128;
        if (i18 % 2 == 0) {
            int i19 = 1 / 0;
        }
    }

    public static /* synthetic */ Object setOnFocusChangeListener(Object[] objArr, int i10, int i11, int i12) {
        Object objValueOf;
        boolean zBooleanValue;
        int i13 = ~i10;
        int i14 = (((~(i13 | i11)) | (~(i13 | i12))) * (-566)) + (i11 * (-565)) + (i10 * 567);
        int i15 = ~i11;
        int i16 = ((~(i15 | i13 | i12)) * 566) + ((~(i10 | i15)) * 566) + i14;
        if (i16 == 1) {
            bct bctVar = (bct) objArr[0];
            ahw ahwVar = (ahw) objArr[1];
            int i17 = f54513s0 + 7;
            f54512r0 = i17 % 128;
            if (i17 % 2 != 0) {
                bctVar.f54515q0 = (aee) ahw.setX(new Object[]{ahwVar}, 798237069, -798237066, System.identityHashCode(ahwVar));
                bctVar.f54514p0 = (ays) ((amw) azx.setCompoundDrawableTintBlendMode(new Object[]{ahwVar}, -2058336283, 2058336284, (int) System.currentTimeMillis()));
                throw null;
            }
            bctVar.f54515q0 = (aee) ahw.setX(new Object[]{ahwVar}, 798237069, -798237066, System.identityHashCode(ahwVar));
            bctVar.f54514p0 = (ays) ((amw) azx.setCompoundDrawableTintBlendMode(new Object[]{ahwVar}, -2058336283, 2058336284, (int) System.currentTimeMillis()));
            int i18 = f54513s0;
            int i19 = i18 & 97;
            int i20 = -(-(i18 | 97));
            int i21 = (i19 & i20) + (i20 | i19);
            f54512r0 = i21 % 128;
            if (i21 % 2 == 0) {
                return null;
            }
            throw null;
        }
        if (i16 == 2) {
            bct bctVar2 = (bct) objArr[0];
            int i22 = f54513s0;
            int i23 = (i22 ^ 28) + ((i22 & 28) << 1);
            int i24 = (i23 ^ (-1)) + (i23 << 1);
            f54512r0 = i24 % 128;
            try {
                if (i24 % 2 == 0) {
                    return ((ahw) bab.setY(new Object[]{bctVar2.f54514p0, bctVar2.f54515q0}, 491760219, -491760218, (int) System.currentTimeMillis())).setAlwaysDrawnWithCacheEnabled();
                }
                ((ahw) bab.setY(new Object[]{bctVar2.f54514p0, bctVar2.f54515q0}, 491760219, -491760218, (int) System.currentTimeMillis())).setAlwaysDrawnWithCacheEnabled();
                throw null;
            } catch (IOException unused) {
                return null;
            }
        }
        if (i16 == 3) {
            bct bctVar3 = (bct) objArr[0];
            int i25 = f54512r0;
            int i26 = ((i25 | 95) << 1) - (i25 ^ 95);
            f54513s0 = i26 % 128;
            int i27 = i26 % 2;
            ays aysVar = bctVar3.f54514p0;
            int iIntValue = ((Integer) bek.setOnFocusChangeListener(new Object[]{(byte[]) ays.setDividerPadding(new Object[]{aysVar}, -1890867872, 1890867872, System.identityHashCode(aysVar))}, -642573231, 642573231, (int) System.currentTimeMillis())).intValue();
            int iIdentityHashCode = System.identityHashCode(bctVar3);
            int i28 = ~iIdentityHashCode;
            int i29 = i28 ^ (-1855534838);
            int i30 = i28 & (-1855534838);
            int i31 = (i29 & i30) | (i29 ^ i30);
            int i32 = ~i31;
            int i33 = (i31 | i32) & i32;
            int i34 = (-475299577) ^ i33;
            int i35 = i33 & (-475299577);
            int i36 = -(-(((i35 & i34) | (i34 ^ i35)) * (-1042)));
            int i37 = ((~i36) & (-487801866)) | (487801865 & i36);
            int i38 = (i36 & (-487801866)) << 1;
            int i39 = (i37 ^ i38) + ((i38 & i37) << 1);
            int i40 = (((-1855534838) ^ iIdentityHashCode) | ((-1855534838) & iIdentityHashCode)) * ResultCode.ERROR_TRUST_CERT_DATE_AFTERVALIDITY;
            int i41 = i39 & i40;
            int i42 = i41 + ((i40 ^ i39) | i41);
            int i43 = 475299576 & i28;
            int i44 = (iIdentityHashCode & (-475299577)) | i43;
            int i45 = iIdentityHashCode & 475299576;
            int i46 = (i45 & i44) | (i44 ^ i45);
            int i47 = ~i46;
            int i48 = (i46 | i47) & i47;
            int i49 = (-2128445182) ^ i48;
            int i50 = i48 & (-2128445182);
            int i51 = ((~i28) & (-475299577)) | i43;
            int i52 = i28 & (-475299577);
            int i53 = (i52 & i51) | (i51 ^ i52);
            int i54 = (1855534837 & i53) | ((~i53) & (-1855534838));
            int i55 = i53 & (-1855534838);
            int i56 = (i42 - (~(-(~(-(-((((i50 & i49) | (i49 ^ i50)) | (~((i55 & i54) | (i54 ^ i55)))) * ResultCode.ERROR_TRUST_CERT_DATE_AFTERVALIDITY))))))) - 2;
            int iIdentityHashCode2 = System.identityHashCode(bctVar3);
            int i57 = ~iIdentityHashCode2;
            int i58 = (i57 | iIdentityHashCode2) & i57;
            int i59 = ~i58;
            int i60 = (1906426377 & i59) | ((-1906426378) & i58);
            int i61 = 1906426377 & i58;
            int i62 = (-2) - (((-746583838) - (~(-(-(((i61 & i60) | (i60 ^ i61)) * (-757)))))) ^ (-1));
            int i63 = 1979046715 ^ iIdentityHashCode2;
            int i64 = 1979046715 & iIdentityHashCode2;
            int i65 = (~((i64 & i63) | (i63 ^ i64))) * 1514;
            int i66 = ((i62 ^ i65) - (~(-(-((i62 & i65) << 1))))) - 1;
            int i67 = (i59 & 1433753914) | ((-1433753915) & i58);
            int i68 = i58 & 1433753914;
            int i69 = (i68 & i67) | (i67 ^ i68);
            int i70 = ~i69;
            int i71 = (i69 | i70) & i70;
            int i72 = 545292801 & i71;
            int i73 = ((i71 | 545292801) & (~i72)) | i72;
            int i74 = ~((iIdentityHashCode2 & (-72620339)) | (i57 & (-72620339)) | (72620338 & iIdentityHashCode2));
            int i75 = i73 & i74;
            int i76 = (i74 | i73) & (~i75);
            int i77 = ((i76 & i75) | (i76 ^ i75)) * 757;
            int i78 = i66 & i77;
            int i79 = (i77 | i66) & (~i78);
            int i80 = i78 << 1;
            if (i56 <= (i79 ^ i80) + ((i79 & i80) << 1)) {
                int i81 = 50 / 0;
            }
            objValueOf = Integer.valueOf(iIntValue);
        } else {
            if (i16 == 4) {
                int i82 = f54512r0;
                int i83 = (i82 & (-22)) | ((~i82) & 21);
                int i84 = (i82 & 21) << 1;
                int i85 = (i83 ^ i84) + ((i83 & i84) << 1);
                f54513s0 = i85 % 128;
                int i86 = i85 % 2;
                int i87 = i82 & 111;
                int i88 = i87 + ((i82 ^ 111) | i87);
                f54513s0 = i88 % 128;
                int i89 = i88 % 2;
                return "Picnic";
            }
            if (i16 == 5) {
                int i90 = f54512r0;
                int i91 = (-2) - ((i90 + 68) ^ (-1));
                f54513s0 = i91 % 128;
                int i92 = i91 % 2;
                int i93 = (((i90 ^ 3) | (i90 & 3)) << 1) - (((~i90) & 3) | (i90 & (-4)));
                f54513s0 = i93 % 128;
                if (i93 % 2 != 0) {
                    return "PKCS#8";
                }
                throw null;
            }
            bct bctVar4 = (bct) objArr[0];
            Object obj = objArr[1];
            int i94 = f54513s0;
            int i95 = (i94 & 27) + (i94 | 27);
            int i96 = i95 % 128;
            f54512r0 = i96;
            int i97 = i95 % 2;
            if (obj == bctVar4) {
                int iIdentityHashCode3 = System.identityHashCode(bctVar4);
                int i98 = ~iIdentityHashCode3;
                int i99 = (i98 | iIdentityHashCode3) & i98;
                int i100 = ((~i99) & (-12603417)) | (i99 & 12603416);
                int i101 = i99 & (-12603417);
                int i102 = ~((i101 & i100) | (i100 ^ i101));
                int i103 = (-1645904899) ^ iIdentityHashCode3;
                int i104 = (-1645904899) & iIdentityHashCode3;
                int i105 = ~((i104 & i103) | (i103 ^ i104));
                int i106 = (i102 & i105) | (i102 ^ i105);
                int i107 = ((-287572610) & i98) | (287572609 & iIdentityHashCode3);
                int i108 = (-287572610) & iIdentityHashCode3;
                int i109 = ~((i108 & i107) | (i107 ^ i108));
                int i110 = i106 & i109;
                int i111 = (((i106 | i109) & (~i110)) | i110) * 765;
                int i112 = 765243418 & i111;
                int i113 = i112 + ((i111 ^ 765243418) | i112);
                int i114 = ((~(((-1658508315) ^ i98) | ((-1658508315) & i98))) | 12603416) * 1530;
                int i115 = ((((i113 ^ i114) | (i113 & i114)) << 1) - (~(-((i114 & (~i113)) | ((~i114) & i113))))) - 1;
                int i116 = (-1658508315) & iIdentityHashCode3;
                int i117 = (iIdentityHashCode3 | (-1658508315)) & (~i116);
                int i118 = ~((i117 & i116) | (i117 ^ i116));
                int i119 = (-300176026) & i98;
                int i120 = (i98 | (-300176026)) & (~i119);
                int i121 = (i120 & i119) | (i120 ^ i119);
                int i122 = i121 & 1658508314;
                int i123 = ((i121 | 1658508314) & (~i122)) | i122;
                int i124 = ~i123;
                int i125 = (i123 | i124) & i124;
                int i126 = i118 ^ i125;
                int i127 = i118 & i125;
                int i128 = ((i127 & i126) | (i126 ^ i127)) * 765;
                int i129 = i115 & i128;
                int i130 = ((i115 ^ i128) | i129) << 1;
                int i131 = -((i128 | i115) & (~i129));
                int i132 = (i130 & i131) + (i131 | i130);
                int iIdentityHashCode4 = System.identityHashCode(bctVar4);
                int i133 = ~iIdentityHashCode4;
                int i134 = 1105150327 & i133;
                int i135 = (iIdentityHashCode4 & 1105150327) | ((-1105150328) & iIdentityHashCode4) | i134;
                int i136 = ~i135;
                int i137 = (i135 | i136) & i136;
                int i138 = 1006669320 & i137;
                int i139 = (i137 | 1006669320) & (~i138);
                int i140 = -(-(((i139 & i138) | (i139 ^ i138)) * 576));
                int i141 = ((1533456340 | i140) << 1) - (i140 ^ 1533456340);
                int i142 = 1105150327 ^ i133;
                int i143 = (i142 & i134) | (i142 ^ i134);
                int i144 = i143 & 1027788364;
                int i145 = (i143 | 1027788364) & (~i144);
                int i146 = (-2) - (((i141 - (~(-(~(((~((i145 & i144) | (i145 ^ i144))) | 21119044) * 576))))) - 1) ^ (-1));
                zBooleanValue = !(i132 <= ((((-20943361) & i146) | ((~i146) & 20943360)) - (~(-(-((i146 & 20943360) << 1))))) - 1);
            } else if (!(obj instanceof bct)) {
                int i147 = i96 + 45;
                f54513s0 = i147 % 128;
                int i148 = i147 % 2;
                objValueOf = Boolean.FALSE;
            } else {
                int i149 = i96 + 21;
                f54513s0 = i149 % 128;
                bct bctVar5 = (bct) obj;
                if (i149 % 2 == 0) {
                    ays aysVar2 = bctVar4.f54514p0;
                    byte[] bArr = (byte[]) ays.setDividerPadding(new Object[]{aysVar2}, -1890867872, 1890867872, System.identityHashCode(aysVar2));
                    ays aysVar3 = bctVar5.f54514p0;
                    ((Boolean) bek.setOnFocusChangeListener(new Object[]{bArr, (byte[]) ays.setDividerPadding(new Object[]{aysVar3}, -1890867872, 1890867872, System.identityHashCode(aysVar3))}, -576846525, 576846546, (int) System.currentTimeMillis())).booleanValue();
                    throw null;
                }
                ays aysVar4 = bctVar4.f54514p0;
                byte[] bArr2 = (byte[]) ays.setDividerPadding(new Object[]{aysVar4}, -1890867872, 1890867872, System.identityHashCode(aysVar4));
                ays aysVar5 = bctVar5.f54514p0;
                zBooleanValue = ((Boolean) bek.setOnFocusChangeListener(new Object[]{bArr2, (byte[]) ays.setDividerPadding(new Object[]{aysVar5}, -1890867872, 1890867872, System.identityHashCode(aysVar5))}, -576846525, 576846546, (int) System.currentTimeMillis())).booleanValue();
            }
            objValueOf = Boolean.valueOf(zBooleanValue);
        }
        return objValueOf;
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        int i10 = f54512r0;
        int i11 = i10 & 59;
        int i12 = ((i10 ^ 59) | i11) << 1;
        int i13 = -((i10 | 59) & (~i11));
        int i14 = (i12 & i13) + (i13 | i12);
        f54513s0 = i14 % 128;
        int i15 = i14 % 2;
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject((byte[]) setOnFocusChangeListener(new Object[]{this}, 1176894243, -1176894241, System.identityHashCode(this)));
        int i16 = f54513s0;
        int i17 = (((i16 & (-100)) | ((~i16) & 99)) - (~(-(-((i16 & 99) << 1))))) - 1;
        f54512r0 = i17 % 128;
        int i18 = i17 % 2;
    }

    public final boolean equals(Object obj) {
        return ((Boolean) setOnFocusChangeListener(new Object[]{this, obj}, 948779489, -948779489, System.identityHashCode(this))).booleanValue();
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return (String) setOnFocusChangeListener(new Object[]{this}, 814296943, -814296939, System.identityHashCode(this));
    }

    @Override // java.security.Key
    public final byte[] getEncoded() {
        return (byte[]) setOnFocusChangeListener(new Object[]{this}, 1176894243, -1176894241, System.identityHashCode(this));
    }

    @Override // java.security.Key
    public final String getFormat() {
        return (String) setOnFocusChangeListener(new Object[]{this}, 949847989, -949847984, System.identityHashCode(this));
    }

    public final int hashCode() {
        return ((Integer) setOnFocusChangeListener(new Object[]{this}, 1605597624, -1605597621, System.identityHashCode(this))).intValue();
    }
}
