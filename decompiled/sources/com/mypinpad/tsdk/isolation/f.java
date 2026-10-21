package com.mypinpad.tsdk.isolation;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class f implements getDetailsFieldTextSizeSp {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static int f55448f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static int f55449g = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public activateSession f55450a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public setItemChecked f55451b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public setContentCaptureSession f55452c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public setDrawSelectorOnTop f55453d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final byte[] f55454e;

    public f(@NotNull activateSession activatesession, @NotNull setItemChecked setitemchecked, @NotNull setContentCaptureSession setcontentcapturesession, @NotNull setDrawSelectorOnTop setdrawselectorontop, @NotNull byte[] bArr) {
        Intrinsics.checkNotNullParameter(activatesession, "");
        Intrinsics.checkNotNullParameter(setitemchecked, "");
        Intrinsics.checkNotNullParameter(setcontentcapturesession, "");
        Intrinsics.checkNotNullParameter(setdrawselectorontop, "");
        Intrinsics.checkNotNullParameter(bArr, "");
        this.f55450a = activatesession;
        this.f55451b = setitemchecked;
        this.f55452c = setcontentcapturesession;
        this.f55453d = setdrawselectorontop;
        this.f55454e = bArr;
    }

    @NotNull
    public static String getNavBarTitleString() {
        return (String) setOnFocusChangeListener(new Object[0], -239259623, 239259628, (int) System.currentTimeMillis());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object setOnFocusChangeListener(Object[] objArr, int i10, int i11, int i12) {
        int i13 = ~i12;
        int i14 = (~i10) | i13;
        int i15 = (((~(i10 | i12)) | (~((~i11) | i10)) | (~(i11 | i14))) * 369) + (((~i14) | i11) * (-369)) + ((i10 | i11 | i13) * (-369)) + (i11 * 370) + (i10 * 370);
        String str = null;
        Object[] objArr2 = 0;
        int i16 = 2;
        switch (i15) {
            case 1:
                f fVar = (f) objArr[0];
                int i17 = f55448f;
                int i18 = i17 & 81;
                int i19 = (i17 | 81) & (~i18);
                int i20 = i18 << 1;
                int i21 = (i19 ^ i20) + ((i19 & i20) << 1);
                f55449g = i21 % 128;
                if (i21 % 2 == 0) {
                    fVar.f55450a = activateSession.N_A;
                    fVar.f55451b = setItemChecked.setDividerPadding;
                    fVar.f55452c = setContentCaptureSession.setCompoundDrawableTintBlendMode;
                    fVar.f55453d = setDrawSelectorOnTop.setDividerPadding;
                    setRemoteViewsAdapter.setX(new Object[]{fVar.f55454e}, 1811924153, -1811924153, (int) System.currentTimeMillis());
                    throw null;
                }
                fVar.f55450a = activateSession.N_A;
                fVar.f55451b = setItemChecked.setDividerPadding;
                fVar.f55452c = setContentCaptureSession.setCompoundDrawableTintBlendMode;
                fVar.f55453d = setDrawSelectorOnTop.setDividerPadding;
                setRemoteViewsAdapter.setX(new Object[]{fVar.f55454e}, 1811924153, -1811924153, (int) System.currentTimeMillis());
                int i22 = f55448f;
                int i23 = i22 & 119;
                int i24 = (i22 | 119) & (~i23);
                int i25 = i23 << 1;
                int i26 = (i24 & i25) + (i24 | i25);
                f55449g = i26 % 128;
                int i27 = i26 % 2;
                return null;
            case 2:
                f fVar2 = (f) objArr[0];
                int i28 = f55449g;
                int i29 = i28 & 27;
                int i30 = (i28 | 27) & (~i29);
                int i31 = i29 << 1;
                int i32 = (i30 ^ i31) + ((i30 & i31) << 1);
                f55448f = i32 % 128;
                if (i32 % 2 == 0) {
                    return fVar2.f55452c;
                }
                setContentCaptureSession setcontentcapturesession = fVar2.f55452c;
                throw null;
            case 3:
                f fVar3 = (f) objArr[0];
                TerminalLogger terminalLogger = new TerminalLogger(new getDetailsFieldTextSizeSp[]{getCause.setDividerPadding(fVar3.f55451b), getCause.setDividerPadding(fVar3.f55452c), getCause.setDividerPadding(fVar3.f55453d), getCause.setDividerPadding(fVar3.f55450a)}, str, i16, objArr2 == true ? 1 : 0);
                String str2 = (String) TerminalLogger.setOnFocusChangeListener(new Object[]{terminalLogger}, -1352067446, 1352067446, System.identityHashCode(terminalLogger));
                int i33 = f55448f;
                int i34 = ((i33 | 41) << 1) - (i33 ^ 41);
                f55449g = i34 % 128;
                if (i34 % 2 != 0) {
                    return str2;
                }
                int i35 = 44 / 0;
                return str2;
            case 4:
                f fVar4 = (f) objArr[0];
                int i36 = f55448f;
                int i37 = (i36 & 121) + (i36 | 121);
                f55449g = i37 % 128;
                int i38 = i37 % 2;
                byte[] bArr = fVar4.f55454e;
                if (i38 == 0) {
                    int i39 = 74 / 0;
                }
                return bArr;
            case 5:
                int i40 = f55448f + 3;
                f55449g = i40 % 128;
                if (i40 % 2 != 0) {
                    setRenderEffect setrendereffect = setRenderEffect.INSTANCE;
                    return "";
                }
                setRenderEffect setrendereffect2 = setRenderEffect.INSTANCE;
                throw null;
            case 6:
                f fVar5 = (f) objArr[0];
                int i41 = f55449g;
                int i42 = (i41 & 67) + (i41 | 67);
                f55448f = i42 % 128;
                int i43 = i42 % 2;
                setDrawSelectorOnTop setdrawselectorontop = fVar5.f55453d;
                int i44 = i41 & 109;
                int i45 = i41 | 109;
                int i46 = ((i44 | i45) << 1) - (i44 ^ i45);
                f55448f = i46 % 128;
                if (i46 % 2 == 0) {
                    return setdrawselectorontop;
                }
                int i47 = 49 / 0;
                return setdrawselectorontop;
            case 7:
                f fVar6 = (f) objArr[0];
                int i48 = f55448f;
                int i49 = (((i48 | 52) << 1) - (i48 ^ 52)) - 1;
                f55449g = i49 % 128;
                int i50 = i49 % 2;
                setItemChecked setitemchecked = fVar6.f55451b;
                int i51 = i48 ^ 7;
                int i52 = (((i48 & 7) | i51) << 1) - i51;
                f55449g = i52 % 128;
                if (i52 % 2 != 0) {
                    return setitemchecked;
                }
                int i53 = 81 / 0;
                return setitemchecked;
            default:
                f fVar7 = (f) objArr[0];
                int i54 = f55449g;
                int i55 = i54 + 54;
                int i56 = (i55 ^ (-1)) + (i55 << 1);
                f55448f = i56 % 128;
                int i57 = i56 % 2;
                activateSession activatesession = fVar7.f55450a;
                int i58 = i54 & 121;
                int i59 = ((i54 ^ 121) | i58) << 1;
                int i60 = -((i54 | 121) & (~i58));
                int i61 = (i59 ^ i60) + ((i59 & i60) << 1);
                f55448f = i61 % 128;
                if (i61 % 2 == 0) {
                    return activatesession;
                }
                int i62 = 21 / 0;
                return activatesession;
        }
    }

    @Override // com.mypinpad.tsdk.isolation.getDetailsFieldTextSizeSp
    @NotNull
    public final String setCompoundDrawableTintBlendMode() {
        return (String) setOnFocusChangeListener(new Object[]{this}, 460668974, -460668971, System.identityHashCode(this));
    }

    @NotNull
    public final setContentCaptureSession setDividerPadding() {
        return (setContentCaptureSession) setOnFocusChangeListener(new Object[]{this}, 1210785074, -1210785072, System.identityHashCode(this));
    }

    public final void setLayoutAnimation() {
        setOnFocusChangeListener(new Object[]{this}, 1929394231, -1929394230, System.identityHashCode(this));
    }

    @NotNull
    public final byte[] setOnDragListener() {
        return (byte[]) setOnFocusChangeListener(new Object[]{this}, -78406851, 78406855, System.identityHashCode(this));
    }

    @NotNull
    public final setDrawSelectorOnTop setX() {
        return (setDrawSelectorOnTop) setOnFocusChangeListener(new Object[]{this}, -1978094169, 1978094175, System.identityHashCode(this));
    }

    @NotNull
    public final activateSession setY() {
        return (activateSession) setOnFocusChangeListener(new Object[]{this}, -637740939, 637740939, System.identityHashCode(this));
    }

    @NotNull
    public final setItemChecked setOnFocusChangeListener() {
        return (setItemChecked) setOnFocusChangeListener(new Object[]{this}, -507364128, 507364135, System.identityHashCode(this));
    }
}
