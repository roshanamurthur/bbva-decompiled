package com.mypinpad.tsdk.isolation;

import androidx.camera.core.impl.utils.c;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
public final class cq extends t {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ KProperty<Object>[] f55010o = {c.e(cq.class, "manualKeyEntryCapable_B1b8", "getManualKeyEntryCapable_B1b8()Z", 0), c.e(cq.class, "magneticStripeCapable_B1b7", "getMagneticStripeCapable_B1b7()Z", 0), c.e(cq.class, "icWithContactsCapable_B1b6", "getIcWithContactsCapable_B1b6()Z", 0), c.e(cq.class, "plainTextPinforIccVerificationCapable_B2b8", "getPlainTextPinforIccVerificationCapable_B2b8()Z", 0), c.e(cq.class, "encipheredPinForOnlineVerificationCapable_B2b7", "getEncipheredPinForOnlineVerificationCapable_B2b7()Z", 0), c.e(cq.class, "signaturePaperCapable_B2b6", "getSignaturePaperCapable_B2b6()Z", 0), c.e(cq.class, "encipheredPinForOfflineVerificationCapable_B2b5", "getEncipheredPinForOfflineVerificationCapable_B2b5()Z", 0), c.e(cq.class, "noCvmRequiredCapable_B2b4", "getNoCvmRequiredCapable_B2b4()Z", 0), c.e(cq.class, "sdaCapable_B3b8", "getSdaCapable_B3b8()Z", 0), c.e(cq.class, "ddaCapable_B3b7", "getDdaCapable_B3b7()Z", 0), c.e(cq.class, "cardCaptureCapable_B3b6", "getCardCaptureCapable_B3b6()Z", 0), c.e(cq.class, "cdaCapable_B3b4", "getCdaCapable_B3b4()Z", 0)};

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static int f55011p = 0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static int f55012q = 1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final h f55013f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final h f55014g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public final h f55015h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final h f55016i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final h f55017j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final h f55018k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final h f55019l;

    @NotNull
    public final h m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public final h f55020n;

    static {
        int i10 = f55012q;
        int i11 = i10 ^ 111;
        int i12 = ((i10 & 111) | i11) << 1;
        int i13 = -i11;
        int i14 = (i12 ^ i13) + ((i12 & i13) << 1);
        f55011p = i14 % 128;
        int i15 = i14 % 2;
    }

    public cq() {
        super(setAnimation.CurrencyKt().setDividerPadding());
        new h(0, 7);
        new h(0, 6);
        this.f55013f = new h(0, 5);
        this.f55014g = new h(1, 7);
        this.f55015h = new h(1, 6);
        this.f55016i = new h(1, 5);
        this.f55017j = new h(1, 4);
        this.f55018k = new h(1, 3);
        this.f55019l = new h(2, 7);
        this.m = new h(2, 6);
        new h(2, 5);
        this.f55020n = new h(2, 3);
    }

    public static /* synthetic */ Object setOnFocusChangeListener(Object[] objArr, int i10, int i11, int i12) {
        Object onFocusChangeListener;
        Object onFocusChangeListener2;
        Object onFocusChangeListener3;
        Object x4;
        int i13 = ((~i11) * (-783)) + (i11 * (-782)) + (i10 * 784);
        int i14 = ~i10;
        int i15 = ~i12;
        int i16 = ((i14 | (~(i11 | i15))) * 783) + ((~(i14 | i15 | i11)) * (-783)) + i13;
        KProperty<Object>[] kPropertyArr = f55010o;
        switch (i16) {
            case 1:
                cq cqVar = (cq) objArr[0];
                int i17 = f55011p + 27;
                f55012q = i17 % 128;
                if (i17 % 2 == 0) {
                    h hVar = cqVar.f55019l;
                    onFocusChangeListener = h.setOnFocusChangeListener(new Object[]{hVar, cqVar, kPropertyArr[22]}, -709183664, 709183665, System.identityHashCode(hVar));
                } else {
                    h hVar2 = cqVar.f55019l;
                    onFocusChangeListener = h.setOnFocusChangeListener(new Object[]{hVar2, cqVar, kPropertyArr[8]}, -709183664, 709183665, System.identityHashCode(hVar2));
                }
                boolean zBooleanValue = ((Boolean) onFocusChangeListener).booleanValue();
                int i18 = f55012q;
                int i19 = (i18 ^ 21) + ((i18 & 21) << 1);
                f55011p = i19 % 128;
                int i20 = i19 % 2;
                return Boolean.valueOf(zBooleanValue);
            case 2:
                cq cqVar2 = (cq) objArr[0];
                int i21 = f55011p;
                int i22 = i21 & 51;
                int i23 = -(-(i21 | 51));
                int i24 = (i22 ^ i23) + ((i23 & i22) << 1);
                f55012q = i24 % 128;
                int i25 = i24 % 2;
                h hVar3 = cqVar2.f55014g;
                boolean zBooleanValue2 = ((Boolean) (i25 == 0 ? h.setOnFocusChangeListener(new Object[]{hVar3, cqVar2, kPropertyArr[5]}, -709183664, 709183665, System.identityHashCode(hVar3)) : h.setOnFocusChangeListener(new Object[]{hVar3, cqVar2, kPropertyArr[3]}, -709183664, 709183665, System.identityHashCode(hVar3)))).booleanValue();
                int i26 = f55012q;
                int i27 = i26 ^ 19;
                int i28 = -(-((i26 & 19) << 1));
                int i29 = (i27 & i28) + (i28 | i27);
                f55011p = i29 % 128;
                int i30 = i29 % 2;
                return Boolean.valueOf(zBooleanValue2);
            case 3:
                cq cqVar3 = (cq) objArr[0];
                int i31 = f55011p;
                int i32 = ((i31 | 91) << 1) - (i31 ^ 91);
                f55012q = i32 % 128;
                int i33 = i32 % 2;
                h hVar4 = cqVar3.m;
                return Boolean.valueOf(((Boolean) (i33 == 0 ? h.setOnFocusChangeListener(new Object[]{hVar4, cqVar3, kPropertyArr[52]}, -709183664, 709183665, System.identityHashCode(hVar4)) : h.setOnFocusChangeListener(new Object[]{hVar4, cqVar3, kPropertyArr[9]}, -709183664, 709183665, System.identityHashCode(hVar4)))).booleanValue());
            case 4:
                cq cqVar4 = (cq) objArr[0];
                byte bByteValue = ((Byte) objArr[1]).byteValue();
                int i34 = f55011p + 11;
                f55012q = i34 % 128;
                int i35 = i34 % 2;
                cqVar4.setCompoundDrawableTintBlendMode()[2] = bByteValue;
                int i36 = f55012q;
                int i37 = (i36 ^ 25) + ((i36 & 25) << 1);
                f55011p = i37 % 128;
                int i38 = i37 % 2;
                return null;
            case 5:
                cq cqVar5 = (cq) objArr[0];
                int i39 = f55012q + 83;
                f55011p = i39 % 128;
                if (i39 % 2 != 0) {
                    h hVar5 = cqVar5.f55017j;
                    onFocusChangeListener2 = h.setOnFocusChangeListener(new Object[]{hVar5, cqVar5, kPropertyArr[86]}, -709183664, 709183665, System.identityHashCode(hVar5));
                } else {
                    h hVar6 = cqVar5.f55017j;
                    onFocusChangeListener2 = h.setOnFocusChangeListener(new Object[]{hVar6, cqVar5, kPropertyArr[6]}, -709183664, 709183665, System.identityHashCode(hVar6));
                }
                boolean zBooleanValue3 = ((Boolean) onFocusChangeListener2).booleanValue();
                int i40 = f55012q;
                int i41 = (i40 | 125) << 1;
                int i42 = -(i40 ^ 125);
                int i43 = ((i41 | i42) << 1) - (i42 ^ i41);
                f55011p = i43 % 128;
                int i44 = i43 % 2;
                return Boolean.valueOf(zBooleanValue3);
            case 6:
                cq cqVar6 = (cq) objArr[0];
                int i45 = f55011p;
                int i46 = (i45 ^ 55) + ((i45 & 55) << 1);
                f55012q = i46 % 128;
                int i47 = i46 % 2;
                h hVar7 = cqVar6.f55018k;
                return Boolean.valueOf(((Boolean) (i47 == 0 ? h.setOnFocusChangeListener(new Object[]{hVar7, cqVar6, kPropertyArr[85]}, -709183664, 709183665, System.identityHashCode(hVar7)) : h.setOnFocusChangeListener(new Object[]{hVar7, cqVar6, kPropertyArr[7]}, -709183664, 709183665, System.identityHashCode(hVar7)))).booleanValue());
            case 7:
                cq cqVar7 = (cq) objArr[0];
                int i48 = f55012q + 65;
                f55011p = i48 % 128;
                if (i48 % 2 == 0) {
                    setAnimation setanimation = setAnimation.INSTANCE;
                    TransactionFailed transactionFailed = (TransactionFailed) setAnimation.setY(new Object[0], 1526736749, -1526736594, (int) System.currentTimeMillis());
                    return Boolean.valueOf(((setFindListener) TransactionFailed.setX(new Object[]{transactionFailed}, -570885530, 570885532, System.identityHashCode(transactionFailed))).setX(cqVar7.setCompoundDrawableTintBlendMode()));
                }
                setAnimation setanimation2 = setAnimation.INSTANCE;
                TransactionFailed transactionFailed2 = (TransactionFailed) setAnimation.setY(new Object[0], 1526736749, -1526736594, (int) System.currentTimeMillis());
                ((setFindListener) TransactionFailed.setX(new Object[]{transactionFailed2}, -570885530, 570885532, System.identityHashCode(transactionFailed2))).setX(cqVar7.setCompoundDrawableTintBlendMode());
                throw null;
            case 8:
                cq cqVar8 = (cq) objArr[0];
                int i49 = f55012q;
                int i50 = ((i49 ^ 45) - (~((i49 & 45) << 1))) - 1;
                f55011p = i50 % 128;
                int i51 = i50 % 2;
                h hVar8 = cqVar8.f55020n;
                boolean zBooleanValue4 = ((Boolean) h.setOnFocusChangeListener(new Object[]{hVar8, cqVar8, kPropertyArr[11]}, -709183664, 709183665, System.identityHashCode(hVar8))).booleanValue();
                int i52 = f55011p + 49;
                f55012q = i52 % 128;
                if (i52 % 2 != 0) {
                    return Boolean.valueOf(zBooleanValue4);
                }
                throw null;
            case 9:
                cq cqVar9 = (cq) objArr[0];
                int i53 = f55011p;
                int i54 = ((i53 ^ 52) + ((i53 & 52) << 1)) - 1;
                f55012q = i54 % 128;
                int i55 = i54 % 2;
                h hVar9 = cqVar9.f55013f;
                return Boolean.valueOf(((Boolean) (i55 == 0 ? h.setOnFocusChangeListener(new Object[]{hVar9, cqVar9, kPropertyArr[2]}, -709183664, 709183665, System.identityHashCode(hVar9)) : h.setOnFocusChangeListener(new Object[]{hVar9, cqVar9, kPropertyArr[2]}, -709183664, 709183665, System.identityHashCode(hVar9)))).booleanValue());
            case 10:
                cq cqVar10 = (cq) objArr[0];
                int i56 = f55011p + 55;
                f55012q = i56 % 128;
                if (i56 % 2 == 0) {
                    h hVar10 = cqVar10.f55016i;
                    onFocusChangeListener3 = h.setOnFocusChangeListener(new Object[]{hVar10, cqVar10, kPropertyArr[3]}, -709183664, 709183665, System.identityHashCode(hVar10));
                } else {
                    h hVar11 = cqVar10.f55016i;
                    onFocusChangeListener3 = h.setOnFocusChangeListener(new Object[]{hVar11, cqVar10, kPropertyArr[5]}, -709183664, 709183665, System.identityHashCode(hVar11));
                }
                boolean zBooleanValue5 = ((Boolean) onFocusChangeListener3).booleanValue();
                int i57 = f55012q + 83;
                f55011p = i57 % 128;
                int i58 = i57 % 2;
                return Boolean.valueOf(zBooleanValue5);
            case 11:
                cq cqVar11 = (cq) objArr[0];
                byte bByteValue2 = ((Byte) objArr[1]).byteValue();
                int i59 = f55011p + 21;
                f55012q = i59 % 128;
                int i60 = i59 % 2;
                cqVar11.setCompoundDrawableTintBlendMode()[0] = bByteValue2;
                int i61 = f55011p;
                int i62 = i61 & 27;
                int i63 = -(-(i61 | 27));
                int i64 = (i62 ^ i63) + ((i63 & i62) << 1);
                f55012q = i64 % 128;
                if (i64 % 2 != 0) {
                    return null;
                }
                throw null;
            case 12:
                cq cqVar12 = (cq) objArr[0];
                int i65 = f55011p;
                int i66 = (i65 & 126) + (i65 | 126);
                int i67 = (i66 ^ (-1)) + (i66 << 1);
                f55012q = i67 % 128;
                int i68 = i67 % 2;
                h hVar12 = cqVar12.f55015h;
                boolean zBooleanValue6 = ((Boolean) h.setOnFocusChangeListener(new Object[]{hVar12, cqVar12, kPropertyArr[4]}, -709183664, 709183665, System.identityHashCode(hVar12))).booleanValue();
                int i69 = f55011p;
                int i70 = ((i69 ^ 75) | (i69 & 75)) << 1;
                int i71 = -(((~i69) & 75) | (i69 & (-76)));
                int i72 = (i70 & i71) + (i71 | i70);
                f55012q = i72 % 128;
                if (i72 % 2 == 0) {
                    int i73 = 27 / 0;
                }
                return Boolean.valueOf(zBooleanValue6);
            default:
                cq cqVar13 = (cq) objArr[0];
                byte[] bArr = (byte[]) objArr[1];
                int iIntValue = ((Number) objArr[2]).intValue();
                int i74 = f55011p;
                int i75 = i74 & 123;
                int i76 = ((i74 | 123) & (~i75)) + (i75 << 1);
                f55012q = i76 % 128;
                int i77 = i76 % 2;
                int onFocusChangeListener4 = super.setOnFocusChangeListener(bArr, iIntValue);
                if (!((Boolean) setOnFocusChangeListener(new Object[]{cqVar13}, -862474190, 862474197, System.identityHashCode(cqVar13))).booleanValue()) {
                    int i78 = f55011p;
                    int i79 = i78 & 71;
                    int i80 = ((i78 ^ 71) | i79) << 1;
                    int i81 = -((i78 | 71) & (~i79));
                    int i82 = (i80 ^ i81) + ((i81 & i80) << 1);
                    f55012q = i82 % 128;
                    if (i82 % 2 == 0) {
                        setAnimation setanimation3 = setAnimation.INSTANCE;
                        TransactionFailed transactionFailed3 = (TransactionFailed) setAnimation.setY(new Object[0], 1526736749, -1526736594, (int) System.currentTimeMillis());
                        x4 = TransactionFailed.setX(new Object[]{transactionFailed3}, -570885530, 570885532, System.identityHashCode(transactionFailed3));
                    } else {
                        setAnimation setanimation4 = setAnimation.INSTANCE;
                        TransactionFailed transactionFailed4 = (TransactionFailed) setAnimation.setY(new Object[0], 1526736749, -1526736594, (int) System.currentTimeMillis());
                        x4 = TransactionFailed.setX(new Object[]{transactionFailed4}, -570885530, 570885532, System.identityHashCode(transactionFailed4));
                    }
                    int onFocusChangeListener5 = ((setFindListener) x4).setOnFocusChangeListener();
                    byte[] bArr2 = new byte[onFocusChangeListener5];
                    int i83 = 0;
                    while (i83 < onFocusChangeListener5) {
                        int i84 = f55012q;
                        int i85 = (i84 & (-112)) | ((~i84) & 111);
                        int i86 = (i84 & 111) << 1;
                        int i87 = (i85 ^ i86) + ((i86 & i85) << 1);
                        int i88 = i87 % 128;
                        f55011p = i88;
                        if (i87 % 2 != 0) {
                            bArr2[i83] = 0;
                            i83--;
                        } else {
                            bArr2[i83] = 0;
                            i83 = ((i83 | 1) << 1) - (i83 ^ 1);
                        }
                        int i89 = (i88 & 61) + (i88 | 61);
                        f55012q = i89 % 128;
                        int i90 = i89 % 2;
                    }
                    cqVar13.setX(bArr2);
                    int i91 = f55012q;
                    int i92 = ((i91 & 76) + (i91 | 76)) - 1;
                    f55011p = i92 % 128;
                    int i93 = i92 % 2;
                }
                int i94 = f55011p;
                int i95 = (i94 & (-30)) | ((~i94) & 29);
                int i96 = (i94 & 29) << 1;
                int i97 = (i95 ^ i96) + ((i96 & i95) << 1);
                f55012q = i97 % 128;
                if (i97 % 2 != 0) {
                    return Integer.valueOf(onFocusChangeListener4);
                }
                throw null;
        }
    }

    public final boolean UiMessageCallbackKtWhenMappings() {
        return ((Boolean) setOnFocusChangeListener(new Object[]{this}, 273606682, -273606681, System.identityHashCode(this))).booleanValue();
    }

    public final boolean getNavBarTitleString() {
        return ((Boolean) setOnFocusChangeListener(new Object[]{this}, 112512454, -112512442, System.identityHashCode(this))).booleanValue();
    }

    public final boolean setAlwaysDrawnWithCacheEnabled() {
        return ((Boolean) setOnFocusChangeListener(new Object[]{this}, 1372457392, -1372457382, System.identityHashCode(this))).booleanValue();
    }

    public final boolean setChildDivider() {
        return ((Boolean) setOnFocusChangeListener(new Object[]{this}, 368924951, -368924943, System.identityHashCode(this))).booleanValue();
    }

    public final void setCompoundDrawableTintBlendMode(byte b10) {
        setOnFocusChangeListener(new Object[]{this, Byte.valueOf(b10)}, 1204488733, -1204488722, System.identityHashCode(this));
    }

    public final boolean setIncludeFontPadding() {
        return ((Boolean) setOnFocusChangeListener(new Object[]{this}, 191902400, -191902397, System.identityHashCode(this))).booleanValue();
    }

    public final boolean setLayoutAnimation() {
        return ((Boolean) setOnFocusChangeListener(new Object[]{this}, -315003085, 315003087, System.identityHashCode(this))).booleanValue();
    }

    public final boolean setNavigationOnClickListener() {
        return ((Boolean) setOnFocusChangeListener(new Object[]{this}, -850290927, 850290936, System.identityHashCode(this))).booleanValue();
    }

    public final boolean setTextAlignment() {
        return ((Boolean) setOnFocusChangeListener(new Object[]{this}, 1561715712, -1561715706, System.identityHashCode(this))).booleanValue();
    }

    public final void setX(byte b10) {
        setOnFocusChangeListener(new Object[]{this, Byte.valueOf(b10)}, 704875818, -704875814, System.identityHashCode(this));
    }

    public final boolean setZ() {
        return ((Boolean) setOnFocusChangeListener(new Object[]{this}, -1294890130, 1294890135, System.identityHashCode(this))).booleanValue();
    }

    @Override // com.mypinpad.tsdk.isolation.setImageTintList, com.mypinpad.tsdk.isolation.setLeftTopRightBottom
    public final int setOnFocusChangeListener(@Nullable byte[] bArr, int i10) {
        return ((Integer) setOnFocusChangeListener(new Object[]{this, bArr, Integer.valueOf(i10)}, -856545503, 856545503, i10)).intValue();
    }
}
