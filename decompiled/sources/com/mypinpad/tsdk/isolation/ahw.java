package com.mypinpad.tsdk.isolation;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.io.IOException;
import java.util.Enumeration;

/* JADX INFO: loaded from: classes10.dex */
public final class ahw extends adw {

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public static int f52687w0 = 0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public static int f52688x0 = 1;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public adp f52689r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public aiw f52690s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public ads f52691t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public aee f52692u0;
    public acz v0;

    public ahw(aiw aiwVar, add addVar, aee aeeVar, byte[] bArr) throws IOException {
        this.f52689r0 = new adp(bArr != null ? bep.setY : bep.setCompoundDrawableTintBlendMode);
        this.f52690s0 = aiwVar;
        this.f52691t0 = new aft(addVar);
        this.f52692u0 = aeeVar;
        this.v0 = bArr == null ? null : new afk(bArr);
    }

    public static Object setX(Object[] objArr, int i10, int i11, int i12) {
        int i13;
        int i14 = ~i10;
        int i15 = ~i11;
        int i16 = ~i12;
        int i17 = (((~(i10 | i11)) | (~(i16 | i10)) | (~(i14 | i15))) * 184) + ((i10 | i15 | i16) * 184) + ((i11 | i14) * (-368)) + (i11 * 185) + (i10 * (-183));
        int i18 = -1;
        ahw ahwVar = null;
        switch (i17) {
            case 1:
                ahw ahwVar2 = (ahw) objArr[0];
                adh adhVar = new adh(5);
                adh.setCompoundDrawableTintBlendMode(new Object[]{adhVar, ahwVar2.f52689r0}, 240298319, -240298315, System.identityHashCode(adhVar));
                adh.setCompoundDrawableTintBlendMode(new Object[]{adhVar, ahwVar2.f52690s0}, 240298319, -240298315, System.identityHashCode(adhVar));
                adh.setCompoundDrawableTintBlendMode(new Object[]{adhVar, ahwVar2.f52691t0}, 240298319, -240298315, System.identityHashCode(adhVar));
                aee aeeVar = ahwVar2.f52692u0;
                if (aeeVar != null) {
                    adh.setCompoundDrawableTintBlendMode(new Object[]{adhVar, new afx(false, 0, aeeVar)}, 240298319, -240298315, System.identityHashCode(adhVar));
                    int i19 = f52687w0;
                    int i20 = ((i19 ^ 102) + ((i19 & 102) << 1)) - 1;
                    f52688x0 = i20 % 128;
                    int i21 = i20 % 2;
                }
                acz aczVar = ahwVar2.v0;
                if (aczVar != null) {
                    adh.setCompoundDrawableTintBlendMode(new Object[]{adhVar, new afx(false, 1, aczVar)}, 240298319, -240298315, System.identityHashCode(adhVar));
                    int i22 = f52688x0 + 89;
                    f52687w0 = i22 % 128;
                    int i23 = i22 % 2;
                }
                afv afvVar = new afv(adhVar);
                int i24 = f52688x0;
                int i25 = i24 & 81;
                int i26 = -(-((i24 ^ 81) | i25));
                int i27 = (i25 ^ i26) + ((i26 & i25) << 1);
                f52687w0 = i27 % 128;
                int i28 = i27 % 2;
                return afvVar;
            case 2:
                adp adpVar = (adp) objArr[0];
                int i29 = f52688x0;
                int i30 = (((i29 ^ 53) | (i29 & 53)) << 1) - (((~i29) & 53) | (i29 & (-54)));
                f52687w0 = i30 % 128;
                int i31 = i30 % 2;
                int iIntValue = ((Integer) adp.setOnFocusChangeListener(new Object[]{adpVar}, -2079758436, 2079758436, System.identityHashCode(adpVar))).intValue();
                if (iIntValue >= 0) {
                    int i32 = f52687w0;
                    int i33 = ((-1) << 1) - ((-1) ^ (i32 + 112));
                    f52688x0 = i33 % 128;
                    if (i33 % 2 != 0 ? iIntValue <= 1 : iIntValue <= 0) {
                        int i34 = i32 + 103;
                        f52688x0 = i34 % 128;
                        int i35 = i34 % 2;
                        return Integer.valueOf(iIntValue);
                    }
                }
                throw new IllegalArgumentException("invalid version for private key info");
            case 3:
                ahw ahwVar3 = (ahw) objArr[0];
                int i36 = f52687w0;
                int i37 = i36 & 87;
                int i38 = (((~i37) & (i36 | 87)) - (~(i37 << 1))) - 1;
                f52688x0 = i38 % 128;
                int i39 = i38 % 2;
                aee aeeVar2 = ahwVar3.f52692u0;
                if (i39 == 0) {
                    throw null;
                }
                int i40 = i36 | 7;
                int i41 = (i40 << 1) - ((~(i36 & 7)) & i40);
                f52688x0 = i41 % 128;
                if (i41 % 2 != 0) {
                    return aeeVar2;
                }
                int i42 = 78 / 0;
                return aeeVar2;
            case 4:
                Object obj = objArr[0];
                int iCurrentTimeMillis = (int) System.currentTimeMillis();
                int i43 = 1606080673 ^ iCurrentTimeMillis;
                int i44 = ~iCurrentTimeMillis;
                int i45 = iCurrentTimeMillis & 1606080673;
                int i46 = ((~((i45 & i43) | (i43 ^ i45))) * TypedValues.CycleType.TYPE_EASING) + 178631957;
                int i47 = i46 & 30972900;
                int i48 = (i46 ^ 30972900) | i47;
                int i49 = ((i47 | i48) << 1) - (i48 ^ i47);
                int i50 = (i44 ^ 1606080673) | (1606080673 & i44);
                int i51 = ~i50;
                int i52 = (i50 | i51) & i51;
                int i53 = (i49 - (~(-(-(((i52 & 1377484928) | (1377484928 ^ i52)) * TypedValues.CycleType.TYPE_EASING))))) - 1;
                int iCurrentTimeMillis2 = (int) System.currentTimeMillis();
                int i54 = ~((1455498113 & iCurrentTimeMillis2) | (1455498113 ^ iCurrentTimeMillis2));
                int i55 = -(~(((i54 & (-1472968670)) | ((~i54) & (-1472968670)) | (1472968669 & i54)) * 104));
                int i56 = ((2032904377 ^ i55) + ((i55 & 2032904377) << 1)) - 1;
                int i57 = ~iCurrentTimeMillis2;
                int i58 = i57 & (-357283421);
                int i59 = (i57 | (-357283421)) & (~i58);
                int i60 = (i59 & i58) | (i59 ^ i58);
                int i61 = i60 & (-1455498114);
                int i62 = (i60 | (-1455498114)) & (~i61);
                int i63 = ((~((i62 & i61) | (i62 ^ i61))) * (-104)) + i56;
                int i64 = (-357283421) & iCurrentTimeMillis2;
                int i65 = (iCurrentTimeMillis2 | (-357283421)) & (~i64);
                int i66 = -(-(((i65 & i64) | (i65 ^ i64)) * 104));
                int i67 = i63 & i66;
                if (i53 <= i67 + ((i66 ^ i63) | i67)) {
                    boolean z10 = obj instanceof ahw;
                    throw null;
                }
                if (!(obj instanceof ahw)) {
                    if (obj != null) {
                        aed compoundDrawableTintBlendMode = aed.setCompoundDrawableTintBlendMode(obj);
                        ahwVar = new ahw();
                        Enumeration dividerPadding = compoundDrawableTintBlendMode.setDividerPadding();
                        adp adpVar2 = (adp) adp.setOnFocusChangeListener(new Object[]{dividerPadding.nextElement()}, -837021952, 837021958, (int) System.currentTimeMillis());
                        ahwVar.f52689r0 = adpVar2;
                        int iIntValue2 = ((Integer) setX(new Object[]{adpVar2}, -1509304126, 1509304128, (int) System.currentTimeMillis())).intValue();
                        ahwVar.f52690s0 = (aiw) aiw.setOnFocusChangeListener(new Object[]{dividerPadding.nextElement()}, 866360717, -866360713, (int) System.currentTimeMillis());
                        ahwVar.f52691t0 = (ads) ads.setDividerPadding(new Object[]{dividerPadding.nextElement()}, 1337255032, -1337255030, (int) System.currentTimeMillis());
                        while (dividerPadding.hasMoreElements()) {
                            aeh aehVar = (aeh) dividerPadding.nextElement();
                            int iIntValue3 = ((Integer) aeh.setOnFocusChangeListener(new Object[]{aehVar}, -1417963191, 1417963201, System.identityHashCode(aehVar))).intValue();
                            if (iIntValue3 <= i18) {
                                throw new IllegalArgumentException("invalid optional field in private key info");
                            }
                            if (iIntValue3 == 0) {
                                ahwVar.f52692u0 = (aee) aee.setCompoundDrawableTintBlendMode(new Object[]{aehVar}, -474267233, 474267237, (int) System.currentTimeMillis());
                            } else {
                                if (iIntValue3 != 1) {
                                    throw new IllegalArgumentException("unknown optional field in private key info");
                                }
                                if (iIntValue2 <= 0) {
                                    throw new IllegalArgumentException("'publicKey' requires version v2(1) or later");
                                }
                                ahwVar.v0 = (acz) acz.setDividerPadding(new Object[]{aehVar}, -2033199183, 2033199187, (int) System.currentTimeMillis());
                            }
                            i18 = iIntValue3;
                        }
                        int i68 = f52688x0 + 69;
                        f52687w0 = i68 % 128;
                        int i69 = i68 % 2;
                    } else {
                        int i70 = f52688x0;
                        int i71 = (i70 & (-58)) | ((~i70) & 57);
                        int i72 = (i70 & 57) << 1;
                        i13 = (i71 & i72) + (i72 | i71);
                        f52687w0 = i13 % 128;
                    }
                    return ahwVar;
                }
                int i73 = f52687w0;
                int i74 = i73 & 103;
                int i75 = (~i74) & (i73 | 103);
                int i76 = -(-(i74 << 1));
                int i77 = (i75 ^ i76) + ((i76 & i75) << 1);
                f52688x0 = i77 % 128;
                ahw ahwVar4 = (ahw) obj;
                if (i77 % 2 == 0) {
                    int i78 = 36 / 0;
                }
                ahwVar = ahwVar4;
                int i79 = i73 & 47;
                int i80 = i73 | 47;
                i13 = (i79 & i80) + (i79 | i80);
                f52688x0 = i13 % 128;
                int i81 = i13 % 2;
                return ahwVar;
            case 5:
                ahw ahwVar5 = (ahw) objArr[0];
                int i82 = f52687w0;
                int i83 = ((i82 | 19) << 1) - (i82 ^ 19);
                f52688x0 = i83 % 128;
                int i84 = i83 % 2;
                acz aczVar2 = ahwVar5.v0;
                if (i84 != 0) {
                    return aczVar2;
                }
                throw null;
            case 6:
                ahw ahwVar6 = (ahw) objArr[0];
                int i85 = f52687w0;
                int i86 = ((i85 ^ 66) + ((i85 & 66) << 1)) - 1;
                int i87 = i86 % 128;
                f52688x0 = i87;
                int i88 = i86 % 2;
                aiw aiwVar = ahwVar6.f52690s0;
                int i89 = (i87 & (-110)) | ((~i87) & 109);
                int i90 = -(-((i87 & 109) << 1));
                int i91 = (i89 & i90) + (i90 | i89);
                f52687w0 = i91 % 128;
                if (i91 % 2 == 0) {
                    return aiwVar;
                }
                throw null;
            default:
                ahw ahwVar7 = (ahw) objArr[0];
                int i92 = f52688x0;
                int i93 = i92 & 59;
                int i94 = i93 + ((i92 ^ 59) | i93);
                f52687w0 = i94 % 128;
                int i95 = i94 % 2;
                ads adsVar = ahwVar7.f52691t0;
                ady adyVar = (ady) ady.setNavigationOnClickListener(new Object[]{(byte[]) ads.setDividerPadding(new Object[]{adsVar}, -952512304, 952512305, System.identityHashCode(adsVar))}, -1692126728, 1692126730, (int) System.currentTimeMillis());
                int i96 = f52688x0;
                int i97 = ((i96 ^ 47) | (i96 & 47)) << 1;
                int i98 = -(((~i96) & 47) | (i96 & (-48)));
                int i99 = ((i97 | i98) << 1) - (i98 ^ i97);
                f52687w0 = i99 % 128;
                if (i99 % 2 == 0) {
                    return adyVar;
                }
                throw null;
        }
    }

    @Override // com.mypinpad.tsdk.isolation.adw, com.mypinpad.tsdk.isolation.add
    public final ady UiMessageCallbackKtWhenMappings() {
        return (ady) setX(new Object[]{this}, -1094698544, 1094698545, System.identityHashCode(this));
    }

    public final aiw setCompoundDrawableTintBlendMode() {
        return (aiw) setX(new Object[]{this}, 1453337808, -1453337802, System.identityHashCode(this));
    }

    public final aee setOnFocusChangeListener() {
        return (aee) setX(new Object[]{this}, 798237069, -798237066, System.identityHashCode(this));
    }

    public final acz setY() {
        return (acz) setX(new Object[]{this}, -1343059446, 1343059451, System.identityHashCode(this));
    }

    public ahw(aiw aiwVar, add addVar, aee aeeVar) throws IOException {
        this(aiwVar, addVar, aeeVar, null);
    }

    public static ahw setCompoundDrawableTintBlendMode(Object obj) {
        return (ahw) setX(new Object[]{obj}, -1552871480, 1552871484, (int) System.currentTimeMillis());
    }

    public ahw(aiw aiwVar, add addVar) throws IOException {
        this(aiwVar, addVar, null, null);
    }

    public final add setX() throws IOException {
        return (add) setX(new Object[]{this}, 26282903, -26282903, System.identityHashCode(this));
    }
}
