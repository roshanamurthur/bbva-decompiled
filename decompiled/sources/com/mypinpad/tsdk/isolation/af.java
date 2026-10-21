package com.mypinpad.tsdk.isolation;

import androidx.camera.core.impl.utils.c;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class af extends t {
    public static final /* synthetic */ KProperty<Object>[] m = {c.e(af.class, "messageIdentifier_B1", "getMessageIdentifier_B1()Lcom/mypinpad/softpos/emv/terminal/kernel/common/model/enums/KernelMessageIdentifierEnum;", 0), c.e(af.class, "status_B2", "getStatus_B2()Lcom/mypinpad/softpos/emv/terminal/kernel/common/model/enums/KernelStatusEnum;", 0), c.e(af.class, "holdTime_B3B5", "getHoldTime_B3B5()[B", 0), c.e(af.class, "languagePreference_B6B13", "getLanguagePreference_B6B13()[B", 0), c.e(af.class, "valueQualifier_B14", "getValueQualifier_B14()Lcom/mypinpad/softpos/emv/terminal/kernel/common/model/enums/ValueQualifier;", 0), c.e(af.class, "value_B15B20", "getValue_B15B20()[B", 0), c.e(af.class, "currencyCode_B21B22", "getCurrencyCode_B21B22()[B", 0)};

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static int f52573n = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static int f52574o = 1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final n f52575f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final n f52576g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public final q f52577h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final q f52578i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final n f52579j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final q f52580k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final q f52581l;

    static {
        int i10 = f52573n;
        int i11 = (i10 ^ 93) + ((i10 & 93) << 1);
        f52574o = i11 % 128;
        int i12 = i11 % 2;
    }

    public af() {
        super(setAnimation.setEnabled().setDividerPadding());
        activateSession.Companion companion = activateSession.INSTANCE;
        this.f52575f = new n(0, 7, 0, activateSession.Companion.setOnFocusChangeListener());
        ValueQualifier.Companion companion2 = ValueQualifier.INSTANCE;
        this.f52576g = new n(1, 7, 0, (openContextMenu) ValueQualifier.Companion.setDividerPadding(new Object[0], -1834904919, 1834904920, (int) System.currentTimeMillis()));
        this.f52577h = new q(2, 4);
        this.f52578i = new q(5, 12);
        setSelector.Companion companion3 = setSelector.INSTANCE;
        this.f52579j = new n(13, 7, 0, (openContextMenu) setSelector.Companion.setY(new Object[0], -534741162, 534741162, (int) System.currentTimeMillis()));
        this.f52580k = new q(14, 19);
        this.f52581l = new q(20, 21);
        setDividerPadding(new Object[]{this, activateSession.N_A}, 1583481674, -1583481662, System.identityHashCode(this));
        setDividerPadding(new Object[]{this, ValueQualifier.setOnDragListener}, 1991488095, -1991488092, System.identityHashCode(this));
    }

    public static /* synthetic */ Object setDividerPadding(Object[] objArr, int i10, int i11, int i12) {
        Object obj;
        Object compoundDrawableTintBlendMode;
        Object y7;
        int i13 = ((~(i10 | i11)) * (-495)) + (i11 * (-494)) + (i10 * (-494));
        int i14 = (~i12) | i10;
        int i15 = (((~((~i10) | (~i11))) | (~i14)) * 495) + (i14 * 495) + i13;
        KProperty<Object>[] kPropertyArr = m;
        switch (i15) {
            case 1:
                af afVar = (af) objArr[0];
                setSelector setselector = (setSelector) objArr[1];
                int i16 = f52574o;
                int i17 = i16 & 123;
                int i18 = (i16 | 123) & (~i17);
                int i19 = -(-(i17 << 1));
                int i20 = (i18 ^ i19) + ((i18 & i19) << 1);
                f52573n = i20 % 128;
                int i21 = i20 % 2;
                Intrinsics.checkNotNullParameter(setselector, "");
                n nVar = afVar.f52579j;
                n.setCompoundDrawableTintBlendMode(new Object[]{nVar, afVar, kPropertyArr[4], setselector}, 697712004, -697712004, System.identityHashCode(nVar));
                int i22 = f52573n;
                int i23 = ((i22 ^ 111) | (i22 & 111)) << 1;
                int i24 = -(((~i22) & 111) | (i22 & (-112)));
                int i25 = ((i23 | i24) << 1) - (i24 ^ i23);
                f52574o = i25 % 128;
                int i26 = i25 % 2;
                return null;
            case 2:
                af afVar2 = (af) objArr[0];
                int i27 = f52573n;
                int i28 = i27 & 13;
                int i29 = (((i27 ^ 13) | i28) << 1) - ((i27 | 13) & (~i28));
                f52574o = i29 % 128;
                int i30 = i29 % 2;
                q qVar = afVar2.f52580k;
                obj = (byte[]) (i30 == 0 ? q.setY(new Object[]{qVar, afVar2, kPropertyArr[5]}, 2085857005, -2085857004, System.identityHashCode(qVar)) : q.setY(new Object[]{qVar, afVar2, kPropertyArr[5]}, 2085857005, -2085857004, System.identityHashCode(qVar)));
                break;
            case 3:
                af afVar3 = (af) objArr[0];
                ValueQualifier valueQualifier = (ValueQualifier) objArr[1];
                int i31 = f52574o;
                int i32 = i31 & 27;
                int i33 = -(-((i31 ^ 27) | i32));
                int i34 = (i32 & i33) + (i33 | i32);
                f52573n = i34 % 128;
                if (i34 % 2 != 0) {
                    Intrinsics.checkNotNullParameter(valueQualifier, "");
                    n nVar2 = afVar3.f52576g;
                    n.setCompoundDrawableTintBlendMode(new Object[]{nVar2, afVar3, kPropertyArr[1], valueQualifier}, 697712004, -697712004, System.identityHashCode(nVar2));
                    return null;
                }
                Intrinsics.checkNotNullParameter(valueQualifier, "");
                n nVar3 = afVar3.f52576g;
                n.setCompoundDrawableTintBlendMode(new Object[]{nVar3, afVar3, kPropertyArr[1], valueQualifier}, 697712004, -697712004, System.identityHashCode(nVar3));
                return null;
            case 4:
                af afVar4 = (af) objArr[0];
                byte[] bArr = (byte[]) objArr[1];
                int i35 = f52574o;
                int i36 = ((i35 | 75) << 1) - (i35 ^ 75);
                f52573n = i36 % 128;
                int i37 = i36 % 2;
                Intrinsics.checkNotNullParameter(bArr, "");
                q qVar2 = afVar4.f52580k;
                q.setY(new Object[]{qVar2, afVar4, kPropertyArr[5], bArr}, -1411167663, 1411167663, System.identityHashCode(qVar2));
                int i38 = f52573n;
                int i39 = (i38 ^ 51) + ((i38 & 51) << 1);
                f52574o = i39 % 128;
                int i40 = i39 % 2;
                return null;
            case 5:
                af afVar5 = (af) objArr[0];
                int i41 = f52574o;
                int i42 = (i41 & 126) + (i41 | 126);
                int i43 = (i42 ^ (-1)) + (i42 << 1);
                f52573n = i43 % 128;
                if (i43 % 2 != 0) {
                    n nVar4 = afVar5.f52575f;
                    compoundDrawableTintBlendMode = n.setCompoundDrawableTintBlendMode(new Object[]{nVar4, afVar5, kPropertyArr[1]}, 2052976211, -2052976210, System.identityHashCode(nVar4));
                } else {
                    n nVar5 = afVar5.f52575f;
                    compoundDrawableTintBlendMode = n.setCompoundDrawableTintBlendMode(new Object[]{nVar5, afVar5, kPropertyArr[0]}, 2052976211, -2052976210, System.identityHashCode(nVar5));
                }
                obj = (activateSession) ((Enum) compoundDrawableTintBlendMode);
                break;
            case 6:
                af afVar6 = (af) objArr[0];
                byte[] bArr2 = (byte[]) objArr[1];
                int i44 = f52573n;
                int i45 = i44 & 51;
                int i46 = ((i44 ^ 51) | i45) << 1;
                int i47 = -((i44 | 51) & (~i45));
                int i48 = (i46 ^ i47) + ((i47 & i46) << 1);
                f52574o = i48 % 128;
                if (i48 % 2 == 0) {
                    Intrinsics.checkNotNullParameter(bArr2, "");
                    q qVar3 = afVar6.f52581l;
                    q.setY(new Object[]{qVar3, afVar6, kPropertyArr[26], bArr2}, -1411167663, 1411167663, System.identityHashCode(qVar3));
                } else {
                    Intrinsics.checkNotNullParameter(bArr2, "");
                    q qVar4 = afVar6.f52581l;
                    q.setY(new Object[]{qVar4, afVar6, kPropertyArr[6], bArr2}, -1411167663, 1411167663, System.identityHashCode(qVar4));
                }
                int i49 = f52574o + 48;
                int i50 = (i49 ^ (-1)) + (i49 << 1);
                f52573n = i50 % 128;
                int i51 = i50 % 2;
                return null;
            case 7:
                af afVar7 = (af) objArr[0];
                byte[] bArr3 = (byte[]) objArr[1];
                int i52 = f52573n;
                int i53 = i52 ^ 49;
                int i54 = -(-((i52 & 49) << 1));
                int i55 = (i53 ^ i54) + ((i54 & i53) << 1);
                f52574o = i55 % 128;
                int i56 = i55 % 2;
                Intrinsics.checkNotNullParameter(bArr3, "");
                q qVar5 = afVar7.f52577h;
                q.setY(new Object[]{qVar5, afVar7, kPropertyArr[2], bArr3}, -1411167663, 1411167663, System.identityHashCode(qVar5));
                int i57 = f52574o + 111;
                f52573n = i57 % 128;
                if (i57 % 2 == 0) {
                    return null;
                }
                throw null;
            case 8:
                af afVar8 = (af) objArr[0];
                int i58 = f52574o + 83;
                f52573n = i58 % 128;
                if (i58 % 2 != 0) {
                    q qVar6 = afVar8.f52577h;
                    y7 = q.setY(new Object[]{qVar6, afVar8, kPropertyArr[3]}, 2085857005, -2085857004, System.identityHashCode(qVar6));
                } else {
                    q qVar7 = afVar8.f52577h;
                    y7 = q.setY(new Object[]{qVar7, afVar8, kPropertyArr[2]}, 2085857005, -2085857004, System.identityHashCode(qVar7));
                }
                byte[] bArr4 = (byte[]) y7;
                int iIdentityHashCode = System.identityHashCode(afVar8);
                int i59 = (-208259973) & iIdentityHashCode;
                int i60 = ((-208259973) | iIdentityHashCode) & (~i59);
                int i61 = ~iIdentityHashCode;
                int i62 = (i60 & i59) | (i60 ^ i59);
                int i63 = ~i62;
                int i64 = (i62 | i63) & i63;
                int i65 = 278003792 ^ i64;
                int i66 = i64 & 278003792;
                int i67 = -(-(((i66 & i65) | (i65 ^ i66)) * 501));
                int i68 = ((2078754056 ^ i67) + ((i67 & 2078754056) << 1)) - (-709806378);
                int i69 = 1385570394 & i61;
                int i70 = (i61 | 1385570394) & (~i69);
                int i71 = (i70 & i69) | (i70 ^ i69);
                int i72 = i71 & (-1315826575);
                int i73 = (~(((i71 | (-1315826575)) & (~i72)) | i72)) * 501;
                int i74 = i68 & i73;
                int i75 = ((i68 ^ i73) | i74) << 1;
                int i76 = -((i73 | i68) & (~i74));
                int i77 = (i75 ^ i76) + ((i76 & i75) << 1);
                int iIdentityHashCode2 = System.identityHashCode(afVar8);
                int i78 = ~iIdentityHashCode2;
                int i79 = (iIdentityHashCode2 | i78) & i78;
                int i80 = (-2) - ((113883951 - (~(-(-(((i79 & (-10568742)) | ((-10568742) ^ i79)) * 184))))) ^ (-1));
                int i81 = ~((i78 & 828021650) | (i78 ^ 828021650));
                int i82 = 823663232 & i81;
                int i83 = (i81 | 823663232) & (~i82);
                int i84 = (i83 & i82) | (i83 ^ i82);
                int i85 = i84 & (-838590392);
                int i86 = (i84 | (-838590392)) & (~i85);
                int i87 = -(-(((i86 & i85) | (i86 ^ i85)) * 184));
                if (i77 <= (((i80 ^ i87) | (i80 & i87)) << 1) - (((~i80) & i87) | ((~i87) & i80))) {
                    return bArr4;
                }
                int i88 = 57 / 0;
                return bArr4;
            case 9:
                int i89 = f52574o;
                int i90 = ((i89 & 66) + (i89 | 66)) - 1;
                f52573n = i90 % 128;
                int i91 = i90 % 2;
                setRenderEffect setrendereffect = setRenderEffect.INSTANCE;
                int i92 = f52573n + 39;
                f52574o = i92 % 128;
                int i93 = i92 % 2;
                return "";
            case 10:
                af afVar9 = (af) objArr[0];
                int i94 = f52573n;
                int i95 = (i94 & (-68)) | ((~i94) & 67);
                int i96 = -(-((i94 & 67) << 1));
                int i97 = (i95 & i96) + (i96 | i95);
                f52574o = i97 % 128;
                int i98 = i97 % 2;
                n nVar6 = afVar9.f52576g;
                ValueQualifier valueQualifier2 = (ValueQualifier) ((Enum) n.setCompoundDrawableTintBlendMode(new Object[]{nVar6, afVar9, kPropertyArr[1]}, 2052976211, -2052976210, System.identityHashCode(nVar6)));
                int i99 = f52574o;
                int i100 = (((i99 | 38) << 1) - (i99 ^ 38)) - 1;
                f52573n = i100 % 128;
                if (i100 % 2 == 0) {
                    return valueQualifier2;
                }
                int i101 = 97 / 0;
                return valueQualifier2;
            case 11:
                af afVar10 = (af) objArr[0];
                int i102 = f52574o + 69;
                f52573n = i102 % 128;
                int i103 = i102 % 2;
                q qVar8 = afVar10.f52581l;
                byte[] bArr5 = (byte[]) q.setY(new Object[]{qVar8, afVar10, kPropertyArr[6]}, 2085857005, -2085857004, System.identityHashCode(qVar8));
                int i104 = f52574o;
                int i105 = (i104 & (-22)) | ((~i104) & 21);
                int i106 = -(-((i104 & 21) << 1));
                int i107 = (i105 & i106) + (i106 | i105);
                f52573n = i107 % 128;
                int i108 = i107 % 2;
                return bArr5;
            case 12:
                af afVar11 = (af) objArr[0];
                activateSession activatesession = (activateSession) objArr[1];
                int i109 = f52573n;
                int i110 = i109 ^ 45;
                int i111 = ((i109 & 45) | i110) << 1;
                int i112 = -i110;
                int i113 = ((i111 | i112) << 1) - (i111 ^ i112);
                f52574o = i113 % 128;
                if (i113 % 2 == 0) {
                    Intrinsics.checkNotNullParameter(activatesession, "");
                    n nVar7 = afVar11.f52575f;
                    n.setCompoundDrawableTintBlendMode(new Object[]{nVar7, afVar11, kPropertyArr[0], activatesession}, 697712004, -697712004, System.identityHashCode(nVar7));
                } else {
                    Intrinsics.checkNotNullParameter(activatesession, "");
                    n nVar8 = afVar11.f52575f;
                    n.setCompoundDrawableTintBlendMode(new Object[]{nVar8, afVar11, kPropertyArr[0], activatesession}, 697712004, -697712004, System.identityHashCode(nVar8));
                }
                int i114 = f52573n + 83;
                f52574o = i114 % 128;
                int i115 = i114 % 2;
                return null;
            case 13:
                af afVar12 = (af) objArr[0];
                int i116 = f52574o;
                int i117 = (i116 & 81) + (i116 | 81);
                f52573n = i117 % 128;
                int i118 = i117 % 2;
                n nVar9 = afVar12.f52579j;
                obj = (setSelector) ((Enum) (i118 != 0 ? n.setCompoundDrawableTintBlendMode(new Object[]{nVar9, afVar12, kPropertyArr[3]}, 2052976211, -2052976210, System.identityHashCode(nVar9)) : n.setCompoundDrawableTintBlendMode(new Object[]{nVar9, afVar12, kPropertyArr[4]}, 2052976211, -2052976210, System.identityHashCode(nVar9))));
                int i119 = f52574o + 77;
                f52573n = i119 % 128;
                if (i119 % 2 != 0) {
                    throw null;
                }
                break;
            case 14:
                af afVar13 = (af) objArr[0];
                byte[] bArr6 = (byte[]) objArr[1];
                int i120 = f52573n;
                int i121 = i120 & 45;
                int i122 = (i120 ^ 45) | i121;
                int i123 = ((i121 | i122) << 1) - (i122 ^ i121);
                f52574o = i123 % 128;
                int i124 = i123 % 2;
                Intrinsics.checkNotNullParameter(bArr6, "");
                q qVar9 = afVar13.f52578i;
                q.setY(new Object[]{qVar9, afVar13, kPropertyArr[3], bArr6}, -1411167663, 1411167663, System.identityHashCode(qVar9));
                int i125 = f52573n;
                int i126 = i125 & 123;
                int i127 = ((i125 | 123) & (~i126)) + (i126 << 1);
                f52574o = i127 % 128;
                int i128 = i127 % 2;
                return null;
            default:
                af afVar14 = (af) objArr[0];
                int i129 = f52574o;
                int i130 = i129 & 1;
                int i131 = ((i129 ^ 1) | i130) << 1;
                int i132 = -((i129 | 1) & (~i130));
                int i133 = (i131 ^ i132) + ((i132 & i131) << 1);
                f52573n = i133 % 128;
                int i134 = i133 % 2;
                q qVar10 = afVar14.f52578i;
                obj = (byte[]) (i134 != 0 ? q.setY(new Object[]{qVar10, afVar14, kPropertyArr[3]}, 2085857005, -2085857004, System.identityHashCode(qVar10)) : q.setY(new Object[]{qVar10, afVar14, kPropertyArr[3]}, 2085857005, -2085857004, System.identityHashCode(qVar10)));
                break;
        }
        return obj;
    }

    @NotNull
    public final byte[] UiMessageCallbackKtWhenMappings() {
        return (byte[]) setDividerPadding(new Object[]{this}, -1964906171, 1964906173, System.identityHashCode(this));
    }

    @NotNull
    public final activateSession getNavBarTitleString() {
        return (activateSession) setDividerPadding(new Object[]{this}, -1539226566, 1539226571, System.identityHashCode(this));
    }

    @NotNull
    public final byte[] setAlwaysDrawnWithCacheEnabled() {
        return (byte[]) setDividerPadding(new Object[]{this}, 376850173, -376850173, System.identityHashCode(this));
    }

    public final void setCompoundDrawableTintBlendMode(@NotNull byte[] bArr) {
        setDividerPadding(new Object[]{this, bArr}, 2106657059, -2106657053, System.identityHashCode(this));
    }

    @NotNull
    public final setSelector setIncludeFontPadding() {
        return (setSelector) setDividerPadding(new Object[]{this}, -943079573, 943079586, System.identityHashCode(this));
    }

    @NotNull
    public final byte[] setLayoutAnimation() {
        return (byte[]) setDividerPadding(new Object[]{this}, 260633922, -260633914, System.identityHashCode(this));
    }

    @NotNull
    public final ValueQualifier setNavigationOnClickListener() {
        return (ValueQualifier) setDividerPadding(new Object[]{this}, -973348551, 973348561, System.identityHashCode(this));
    }

    public final void setOnFocusChangeListener(@NotNull byte[] bArr) {
        setDividerPadding(new Object[]{this, bArr}, -730300567, 730300574, System.identityHashCode(this));
    }

    @NotNull
    public final byte[] setTextAlignment() {
        return (byte[]) setDividerPadding(new Object[]{this}, -1096391351, 1096391362, System.identityHashCode(this));
    }

    public final void setY(@NotNull byte[] bArr) {
        setDividerPadding(new Object[]{this, bArr}, 1964512517, -1964512513, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.setImageTintList
    @NotNull
    public final String toString() {
        return (String) setDividerPadding(new Object[]{this}, 1210085246, -1210085237, System.identityHashCode(this));
    }

    public final void setCompoundDrawableTintBlendMode(@NotNull activateSession activatesession) {
        setDividerPadding(new Object[]{this, activatesession}, 1583481674, -1583481662, System.identityHashCode(this));
    }

    public final void setY(@NotNull ValueQualifier valueQualifier) {
        setDividerPadding(new Object[]{this, valueQualifier}, 1991488095, -1991488092, System.identityHashCode(this));
    }

    public final void setDividerPadding(@NotNull setSelector setselector) {
        setDividerPadding(new Object[]{this, setselector}, -1098788825, 1098788826, System.identityHashCode(this));
    }

    public final void setDividerPadding(@NotNull byte[] bArr) {
        setDividerPadding(new Object[]{this, bArr}, -1405137347, 1405137361, System.identityHashCode(this));
    }
}
