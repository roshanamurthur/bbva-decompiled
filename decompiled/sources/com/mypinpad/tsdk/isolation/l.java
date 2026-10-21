package com.mypinpad.tsdk.isolation;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
public final class l implements getDetailsFieldTextSizeSp {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static int f56866h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static int f56867i = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public activateSession f56868a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public ValueQualifier f56869b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final byte[] f56870c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public final byte[] f56871d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public setSelector f56872e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public final byte[] f56873f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public final byte[] f56874g;

    public l(@NotNull activateSession activatesession, @NotNull ValueQualifier valueQualifier, @NotNull byte[] bArr, @Nullable byte[] bArr2, @NotNull setSelector setselector, @Nullable byte[] bArr3, @Nullable byte[] bArr4) {
        Intrinsics.checkNotNullParameter(activatesession, "");
        Intrinsics.checkNotNullParameter(valueQualifier, "");
        Intrinsics.checkNotNullParameter(bArr, "");
        Intrinsics.checkNotNullParameter(setselector, "");
        this.f56868a = activatesession;
        this.f56869b = valueQualifier;
        this.f56870c = bArr;
        this.f56871d = bArr2;
        this.f56872e = setselector;
        this.f56873f = bArr3;
        this.f56874g = bArr4;
    }

    @NotNull
    public static String setOnLongClickListener() {
        return (String) setX(new Object[0], 1622929278, -1622929275, (int) System.currentTimeMillis());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object setX(Object[] objArr, int i10, int i11, int i12) {
        Object obj;
        int i13 = ~i10;
        int i14 = (((~((~i11) | i12)) | i13) * (-433)) + ((~((~i12) | i13 | i11)) * 433) + (i11 * 434) + (i10 * (-432));
        int i15 = ~(i12 | i13);
        String str = null;
        Object[] objArr2 = 0;
        int i16 = 2;
        switch ((((~(i10 | i11)) | i15) * 433) + i14) {
            case 1:
                l lVar = (l) objArr[0];
                activateSession activatesession = (activateSession) objArr[1];
                int i17 = f56866h;
                int i18 = (i17 ^ 21) + ((i17 & 21) << 1);
                f56867i = i18 % 128;
                int i19 = i18 % 2;
                Intrinsics.checkNotNullParameter(activatesession, "");
                lVar.f56868a = activatesession;
                int i20 = f56867i + 109;
                f56866h = i20 % 128;
                if (i20 % 2 != 0) {
                    int i21 = 70 / 0;
                }
                return null;
            case 2:
                l lVar2 = (l) objArr[0];
                int i22 = f56867i;
                int i23 = i22 & 117;
                int i24 = i23 + ((i22 ^ 117) | i23);
                int i25 = i24 % 128;
                f56866h = i25;
                int i26 = i24 % 2;
                activateSession activatesession2 = lVar2.f56868a;
                int i27 = i25 & 125;
                int i28 = (i25 ^ 125) | i27;
                int i29 = (i27 & i28) + (i27 | i28);
                f56867i = i29 % 128;
                int i30 = i29 % 2;
                return activatesession2;
            case 3:
                int i31 = f56866h;
                int i32 = ((i31 & (-72)) | ((~i31) & 71)) + ((i31 & 71) << 1);
                f56867i = i32 % 128;
                int i33 = i32 % 2;
                setRenderEffect setrendereffect = setRenderEffect.INSTANCE;
                int i34 = f56867i;
                int i35 = (i34 & 107) + (i34 | 107);
                f56866h = i35 % 128;
                if (i35 % 2 == 0) {
                    return "";
                }
                int i36 = 7 / 0;
                return "";
            case 4:
                l lVar3 = (l) objArr[0];
                int i37 = f56867i;
                int i38 = (((i37 | 18) << 1) - (i37 ^ 18)) - 1;
                int i39 = i38 % 128;
                f56866h = i39;
                int i40 = i38 % 2;
                byte[] bArr = lVar3.f56871d;
                int i41 = (i39 | 93) << 1;
                int i42 = -(((~i39) & 93) | (i39 & (-94)));
                int i43 = (i41 & i42) + (i41 | i42);
                f56867i = i43 % 128;
                int i44 = i43 % 2;
                return bArr;
            case 5:
                l lVar4 = (l) objArr[0];
                int i45 = f56866h;
                int i46 = ((i45 | 114) << 1) - (i45 ^ 114);
                int i47 = (i46 ^ (-1)) + (i46 << 1);
                int i48 = i47 % 128;
                f56867i = i48;
                int i49 = i47 % 2;
                obj = lVar4.f56869b;
                int i50 = ((i48 ^ 12) + ((i48 & 12) << 1)) - 1;
                f56866h = i50 % 128;
                if (i50 % 2 != 0) {
                    throw null;
                }
                return obj;
            case 6:
                l lVar5 = (l) objArr[0];
                int i51 = f56866h;
                int i52 = i51 & 123;
                int i53 = (((i51 ^ 123) | i52) << 1) - ((i51 | 123) & (~i52));
                f56867i = i53 % 128;
                int i54 = i53 % 2;
                lVar5.f56868a = activateSession.N_A;
                lVar5.f56869b = ValueQualifier.setOnDragListener;
                setRemoteViewsAdapter.setX(new Object[]{lVar5.f56870c}, 1811924153, -1811924153, (int) System.currentTimeMillis());
                byte[] bArr2 = lVar5.f56871d;
                if (bArr2 != null) {
                    int i55 = f56866h;
                    int i56 = (i55 & 63) + (i55 | 63);
                    f56867i = i56 % 128;
                    int i57 = i56 % 2;
                    setRemoteViewsAdapter.setX(new Object[]{bArr2}, 1811924153, -1811924153, (int) System.currentTimeMillis());
                    int i58 = f56866h;
                    int i59 = i58 & 45;
                    int i60 = (i58 ^ 45) | i59;
                    int i61 = (i59 & i60) + (i60 | i59);
                    f56867i = i61 % 128;
                    int i62 = i61 % 2;
                }
                lVar5.f56872e = setSelector.NONE;
                byte[] bArr3 = lVar5.f56873f;
                if (bArr3 != null) {
                    int i63 = f56866h;
                    int i64 = (((i63 | 32) << 1) - (i63 ^ 32)) - 1;
                    f56867i = i64 % 128;
                    int i65 = i64 % 2;
                    setRemoteViewsAdapter.setX(new Object[]{bArr3}, 1811924153, -1811924153, (int) System.currentTimeMillis());
                    int i66 = f56867i + 27;
                    f56866h = i66 % 128;
                    int i67 = i66 % 2;
                }
                int i68 = f56867i;
                int i69 = i68 ^ 89;
                int i70 = (((i68 & 89) | i69) << 1) - i69;
                f56866h = i70 % 128;
                int i71 = i70 % 2;
                return null;
            case 7:
                l lVar6 = (l) objArr[0];
                int i72 = f56867i;
                int i73 = i72 & 87;
                int i74 = -(-((i72 ^ 87) | i73));
                int i75 = (i73 ^ i74) + ((i74 & i73) << 1);
                f56866h = i75 % 128;
                int i76 = i75 % 2;
                obj = lVar6.f56870c;
                if (i76 != 0) {
                    int i77 = 46 / 0;
                }
                return obj;
            case 8:
                l lVar7 = (l) objArr[0];
                getDetailsFieldTextSizeSp[] getdetailsfieldtextsizespArr = new getDetailsFieldTextSizeSp[4];
                getdetailsfieldtextsizespArr[0] = setLogo.setX(lVar7.f56868a.setDividerPadding());
                getdetailsfieldtextsizespArr[1] = setLogo.setX(lVar7.f56869b.setCompoundDrawableTintBlendMode());
                byte[] bArr4 = lVar7.f56873f;
                getdetailsfieldtextsizespArr[2] = bArr4 == null ? null : setInputExtras.setNavigationOnClickListener(bArr4);
                byte[] bArr5 = lVar7.f56874g;
                getdetailsfieldtextsizespArr[3] = bArr5 == null ? null : setInputExtras.setNavigationOnClickListener(bArr5);
                TerminalLogger terminalLogger = new TerminalLogger(getdetailsfieldtextsizespArr, str, i16, objArr2 == true ? 1 : 0);
                return (String) TerminalLogger.setOnFocusChangeListener(new Object[]{terminalLogger}, -1352067446, 1352067446, System.identityHashCode(terminalLogger));
            case 9:
                l lVar8 = (l) objArr[0];
                int i78 = f56866h;
                int i79 = i78 & 21;
                int i80 = ((~i79) & (i78 | 21)) + (i79 << 1);
                f56867i = i80 % 128;
                int i81 = i80 % 2;
                byte[] bArr6 = lVar8.f56873f;
                int i82 = ((i78 | 73) << 1) - (((~i78) & 73) | (i78 & (-74)));
                f56867i = i82 % 128;
                if (i82 % 2 != 0) {
                    return bArr6;
                }
                throw null;
            case 10:
                l lVar9 = (l) objArr[0];
                int i83 = f56867i;
                int i84 = i83 ^ 21;
                int i85 = ((i83 & 21) | i84) << 1;
                int i86 = -i84;
                int i87 = ((i85 | i86) << 1) - (i85 ^ i86);
                int i88 = i87 % 128;
                f56866h = i88;
                int i89 = i87 % 2;
                byte[] bArr7 = lVar9.f56874g;
                int i90 = ((i88 | 59) << 1) - (((~i88) & 59) | (i88 & (-60)));
                f56867i = i90 % 128;
                int i91 = i90 % 2;
                return bArr7;
            default:
                l lVar10 = (l) objArr[0];
                int i92 = f56867i + 62;
                int i93 = (i92 ^ (-1)) + (i92 << 1);
                f56866h = i93 % 128;
                int i94 = i93 % 2;
                obj = lVar10.f56872e;
                if (i94 != 0) {
                    int i95 = 4 / 0;
                }
                return obj;
        }
    }

    @Nullable
    public final byte[] getNavBarTitleString() {
        return (byte[]) setX(new Object[]{this}, 1618171821, -1618171812, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.getDetailsFieldTextSizeSp
    @NotNull
    public final String setCompoundDrawableTintBlendMode() {
        return (String) setX(new Object[]{this}, 340536621, -340536613, System.identityHashCode(this));
    }

    @Nullable
    public final byte[] setDividerPadding() {
        return (byte[]) setX(new Object[]{this}, -1465947066, 1465947070, System.identityHashCode(this));
    }

    @NotNull
    public final setSelector setLayoutAnimation() {
        return (setSelector) setX(new Object[]{this}, -971999203, 971999203, System.identityHashCode(this));
    }

    public final void setNavigationOnClickListener() {
        setX(new Object[]{this}, 1961577412, -1961577406, System.identityHashCode(this));
    }

    @Nullable
    public final byte[] setOnDragListener() {
        return (byte[]) setX(new Object[]{this}, 37049979, -37049969, System.identityHashCode(this));
    }

    @NotNull
    public final byte[] setOnFocusChangeListener() {
        return (byte[]) setX(new Object[]{this}, -1193387599, 1193387606, System.identityHashCode(this));
    }

    @NotNull
    public final ValueQualifier setY() {
        return (ValueQualifier) setX(new Object[]{this}, 854075334, -854075329, System.identityHashCode(this));
    }

    public final void setX(@NotNull activateSession activatesession) {
        setX(new Object[]{this, activatesession}, 1689731204, -1689731203, System.identityHashCode(this));
    }

    @NotNull
    public final activateSession setX() {
        return (activateSession) setX(new Object[]{this}, 1218780914, -1218780912, System.identityHashCode(this));
    }
}
