package com.mypinpad.tsdk.isolation;

import androidx.camera.core.impl.utils.c;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
public final class aa extends t {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ KProperty<Object>[] f52007k = {c.e(aa.class, "l1_B1", "getL1_B1()Lcom/mypinpad/softpos/emv/terminal/kernel/common/model/error/Level1Error;", 0), c.e(aa.class, "l2_B2", "getL2_B2()Lcom/mypinpad/softpos/emv/terminal/kernel/common/model/error/Level2Error;", 0), c.e(aa.class, "l3_B3", "getL3_B3()Lcom/mypinpad/softpos/emv/terminal/kernel/common/model/error/Level3Error;", 0), c.e(aa.class, "sw12_B4B5", "getSw12_B4B5()[B", 0), c.e(aa.class, "msgOnError_B6", "getMsgOnError_B6()Lcom/mypinpad/softpos/emv/terminal/kernel/common/model/enums/KernelMessageIdentifierEnum;", 0)};

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static int f52008l = 0;
    public static int m = 1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final n f52009f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final n f52010g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public final n f52011h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final q f52012i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final n f52013j;

    static {
        int i10 = m;
        int i11 = (((i10 | 116) << 1) - (i10 ^ 116)) - 1;
        f52008l = i11 % 128;
        if (i11 % 2 != 0) {
            int i12 = 33 / 0;
        }
    }

    public aa() {
        super(setAnimation.onPinPadLaunchRequest().setDividerPadding());
        setItemChecked.Companion companion = setItemChecked.INSTANCE;
        this.f52009f = new n(0, 7, 0, (openContextMenu) setItemChecked.Companion.setY(new Object[0], -1838665501, 1838665501, (int) System.currentTimeMillis()));
        setContentCaptureSession.Companion companion2 = setContentCaptureSession.INSTANCE;
        this.f52010g = new n(1, 7, 0, (openContextMenu) setContentCaptureSession.Companion.setCompoundDrawableTintBlendMode(new Object[0], -803309742, 803309742, (int) System.currentTimeMillis()));
        setDrawSelectorOnTop.Companion companion3 = setDrawSelectorOnTop.INSTANCE;
        this.f52011h = new n(2, 7, 0, (openContextMenu) setDrawSelectorOnTop.Companion.setX(new Object[0], 89826911, -89826911, (int) System.currentTimeMillis()));
        this.f52012i = new q(3, 4);
        activateSession.Companion companion4 = activateSession.INSTANCE;
        this.f52013j = new n(5, 7, 0, activateSession.Companion.setOnFocusChangeListener());
    }

    public static /* synthetic */ Object setY(Object[] objArr, int i10, int i11, int i12) {
        Object compoundDrawableTintBlendMode;
        Object compoundDrawableTintBlendMode2;
        int i13 = ~i11;
        int i14 = ~i12;
        int i15 = (((~(i10 | i14)) | (~(i12 | (~i10))) | i13) * 45) + (((~(i11 | i10)) | (~(i13 | i12))) * (-45)) + (((~(i13 | i14)) | i10) * (-90)) + (i11 * 46) + (i10 * 46);
        KProperty<Object>[] kPropertyArr = f52007k;
        switch (i15) {
            case 1:
                aa aaVar = (aa) objArr[0];
                int i16 = m + 43;
                f52008l = i16 % 128;
                if (i16 % 2 != 0) {
                    n nVar = aaVar.f52011h;
                    compoundDrawableTintBlendMode = n.setCompoundDrawableTintBlendMode(new Object[]{nVar, aaVar, kPropertyArr[5]}, 2052976211, -2052976210, System.identityHashCode(nVar));
                } else {
                    n nVar2 = aaVar.f52011h;
                    compoundDrawableTintBlendMode = n.setCompoundDrawableTintBlendMode(new Object[]{nVar2, aaVar, kPropertyArr[2]}, 2052976211, -2052976210, System.identityHashCode(nVar2));
                }
                setDrawSelectorOnTop setdrawselectorontop = (setDrawSelectorOnTop) ((Enum) compoundDrawableTintBlendMode);
                int i17 = (-2) - ((m + 10) ^ (-1));
                f52008l = i17 % 128;
                if (i17 % 2 == 0) {
                    return setdrawselectorontop;
                }
                throw null;
            case 2:
                aa aaVar2 = (aa) objArr[0];
                int i18 = f52008l + 55;
                m = i18 % 128;
                if (i18 % 2 == 0) {
                    n nVar3 = aaVar2.f52010g;
                    compoundDrawableTintBlendMode2 = n.setCompoundDrawableTintBlendMode(new Object[]{nVar3, aaVar2, kPropertyArr[0]}, 2052976211, -2052976210, System.identityHashCode(nVar3));
                } else {
                    n nVar4 = aaVar2.f52010g;
                    compoundDrawableTintBlendMode2 = n.setCompoundDrawableTintBlendMode(new Object[]{nVar4, aaVar2, kPropertyArr[1]}, 2052976211, -2052976210, System.identityHashCode(nVar4));
                }
                return (setContentCaptureSession) ((Enum) compoundDrawableTintBlendMode2);
            case 3:
                aa aaVar3 = (aa) objArr[0];
                int i19 = f52008l;
                int i20 = i19 & 97;
                int i21 = i19 | 97;
                int i22 = (i20 ^ i21) + ((i21 & i20) << 1);
                m = i22 % 128;
                int i23 = i22 % 2;
                q qVar = aaVar3.f52012i;
                byte[] bArr = (byte[]) q.setY(new Object[]{qVar, aaVar3, kPropertyArr[3]}, 2085857005, -2085857004, System.identityHashCode(qVar));
                int i24 = m;
                int i25 = i24 ^ 105;
                int i26 = (i24 & 105) << 1;
                int i27 = ((i25 | i26) << 1) - (i26 ^ i25);
                f52008l = i27 % 128;
                int i28 = i27 % 2;
                return bArr;
            case 4:
                int i29 = m;
                int i30 = ((i29 ^ 2) + ((i29 & 2) << 1)) - 1;
                f52008l = i30 % 128;
                int i31 = i30 % 2;
                setRenderEffect setrendereffect = setRenderEffect.INSTANCE;
                int i32 = m;
                int i33 = (i32 & 9) + (i32 | 9);
                f52008l = i33 % 128;
                int i34 = i33 % 2;
                return "";
            case 5:
                aa aaVar4 = (aa) objArr[0];
                setContentCaptureSession setcontentcapturesession = (setContentCaptureSession) objArr[1];
                int i35 = m;
                int i36 = (i35 ^ 47) + ((i35 & 47) << 1);
                f52008l = i36 % 128;
                if (i36 % 2 == 0) {
                    Intrinsics.checkNotNullParameter(setcontentcapturesession, "");
                    n nVar5 = aaVar4.f52010g;
                    n.setCompoundDrawableTintBlendMode(new Object[]{nVar5, aaVar4, kPropertyArr[1], setcontentcapturesession}, 697712004, -697712004, System.identityHashCode(nVar5));
                } else {
                    Intrinsics.checkNotNullParameter(setcontentcapturesession, "");
                    n nVar6 = aaVar4.f52010g;
                    n.setCompoundDrawableTintBlendMode(new Object[]{nVar6, aaVar4, kPropertyArr[1], setcontentcapturesession}, 697712004, -697712004, System.identityHashCode(nVar6));
                }
                break;
            case 6:
                aa aaVar5 = (aa) objArr[0];
                int i37 = m;
                int i38 = i37 & 51;
                int i39 = ((i37 | 51) & (~i38)) + (i38 << 1);
                f52008l = i39 % 128;
                int i40 = i39 % 2;
                n nVar7 = aaVar5.f52013j;
                activateSession activatesession = (activateSession) ((Enum) n.setCompoundDrawableTintBlendMode(new Object[]{nVar7, aaVar5, kPropertyArr[4]}, 2052976211, -2052976210, System.identityHashCode(nVar7)));
                int i41 = f52008l + 51;
                m = i41 % 128;
                int i42 = i41 % 2;
                return activatesession;
            case 7:
                aa aaVar6 = (aa) objArr[0];
                int i43 = m;
                int i44 = i43 & 39;
                int i45 = (i43 | 39) & (~i44);
                int i46 = -(-(i44 << 1));
                int i47 = (i45 & i46) + (i45 | i46);
                f52008l = i47 % 128;
                int i48 = i47 % 2;
                n nVar8 = aaVar6.f52009f;
                setItemChecked setitemchecked = (setItemChecked) ((Enum) (i48 != 0 ? n.setCompoundDrawableTintBlendMode(new Object[]{nVar8, aaVar6, kPropertyArr[1]}, 2052976211, -2052976210, System.identityHashCode(nVar8)) : n.setCompoundDrawableTintBlendMode(new Object[]{nVar8, aaVar6, kPropertyArr[0]}, 2052976211, -2052976210, System.identityHashCode(nVar8))));
                int i49 = f52008l;
                int i50 = ((i49 | 68) << 1) - (i49 ^ 68);
                int i51 = (i50 ^ (-1)) + (i50 << 1);
                m = i51 % 128;
                if (i51 % 2 != 0) {
                    return setitemchecked;
                }
                throw null;
            case 8:
                aa aaVar7 = (aa) objArr[0];
                setItemChecked setitemchecked2 = (setItemChecked) objArr[1];
                int i52 = m;
                int i53 = i52 & 95;
                int i54 = -(-((i52 ^ 95) | i53));
                int i55 = ((i53 | i54) << 1) - (i54 ^ i53);
                f52008l = i55 % 128;
                int i56 = i55 % 2;
                Intrinsics.checkNotNullParameter(setitemchecked2, "");
                n nVar9 = aaVar7.f52009f;
                n.setCompoundDrawableTintBlendMode(new Object[]{nVar9, aaVar7, kPropertyArr[0], setitemchecked2}, 697712004, -697712004, System.identityHashCode(nVar9));
                int i57 = f52008l;
                int i58 = i57 ^ 111;
                int i59 = ((i57 & 111) | i58) << 1;
                int i60 = -i58;
                int i61 = (i59 & i60) + (i59 | i60);
                m = i61 % 128;
                if (i61 % 2 == 0) {
                    throw null;
                }
                break;
            case 9:
                aa aaVar8 = (aa) objArr[0];
                byte[] bArr2 = (byte[]) objArr[1];
                int i62 = m;
                int i63 = (i62 ^ 33) + ((33 & i62) << 1);
                f52008l = i63 % 128;
                if (i63 % 2 == 0) {
                    Intrinsics.checkNotNullParameter(bArr2, "");
                    q qVar2 = aaVar8.f52012i;
                    q.setY(new Object[]{qVar2, aaVar8, kPropertyArr[3], bArr2}, -1411167663, 1411167663, System.identityHashCode(qVar2));
                } else {
                    Intrinsics.checkNotNullParameter(bArr2, "");
                    q qVar3 = aaVar8.f52012i;
                    q.setY(new Object[]{qVar3, aaVar8, kPropertyArr[2], bArr2}, -1411167663, 1411167663, System.identityHashCode(qVar3));
                }
                break;
            case 10:
                aa aaVar9 = (aa) objArr[0];
                byte[] bArr3 = (byte[]) objArr[1];
                int iIntValue = ((Number) objArr[2]).intValue();
                int i64 = f52008l;
                int i65 = (i64 ^ 121) + ((i64 & 121) << 1);
                m = i65 % 128;
                int i66 = i65 % 2;
                if (bArr3 == null) {
                    throw new fh(21, null, 2, null);
                }
                int onFocusChangeListener = super.setOnFocusChangeListener(bArr3, iIntValue);
                int i67 = m;
                int i68 = (i67 ^ 83) + ((i67 & 83) << 1);
                f52008l = i68 % 128;
                int i69 = i68 % 2;
                return Integer.valueOf(onFocusChangeListener);
            case 11:
                aa aaVar10 = (aa) objArr[0];
                setDrawSelectorOnTop setdrawselectorontop2 = (setDrawSelectorOnTop) objArr[1];
                System.identityHashCode(aaVar10);
                System.identityHashCode(aaVar10);
                Intrinsics.checkNotNullParameter(setdrawselectorontop2, "");
                n nVar10 = aaVar10.f52011h;
                n.setCompoundDrawableTintBlendMode(new Object[]{nVar10, aaVar10, kPropertyArr[2], setdrawselectorontop2}, 697712004, -697712004, System.identityHashCode(nVar10));
                int i70 = m;
                int i71 = (i70 & (-66)) | ((~i70) & 65);
                int i72 = (i70 & 65) << 1;
                int i73 = ((i71 | i72) << 1) - (i72 ^ i71);
                f52008l = i73 % 128;
                if (i73 % 2 != 0) {
                    int i74 = 33 / 0;
                }
                break;
            default:
                aa aaVar11 = (aa) objArr[0];
                activateSession activatesession2 = (activateSession) objArr[1];
                int i75 = f52008l;
                int i76 = i75 & 65;
                int i77 = (((i75 ^ 65) | i76) << 1) - ((i75 | 65) & (~i76));
                m = i77 % 128;
                int i78 = i77 % 2;
                Intrinsics.checkNotNullParameter(activatesession2, "");
                n nVar11 = aaVar11.f52013j;
                n.setCompoundDrawableTintBlendMode(new Object[]{nVar11, aaVar11, kPropertyArr[4], activatesession2}, 697712004, -697712004, System.identityHashCode(nVar11));
                int i79 = f52008l;
                int i80 = i79 & 5;
                int i81 = (i79 ^ 5) | i80;
                int i82 = (i80 & i81) + (i81 | i80);
                m = i82 % 128;
                if (i82 % 2 == 0) {
                    throw null;
                }
                break;
        }
        return null;
    }

    @NotNull
    public final setDrawSelectorOnTop getNavBarTitleString() {
        return (setDrawSelectorOnTop) setY(new Object[]{this}, -1660639929, 1660639930, System.identityHashCode(this));
    }

    public final void setDividerPadding(@NotNull byte[] bArr) {
        setY(new Object[]{this, bArr}, 415517745, -415517736, System.identityHashCode(this));
    }

    @NotNull
    public final setContentCaptureSession setLayoutAnimation() {
        return (setContentCaptureSession) setY(new Object[]{this}, -590594959, 590594961, System.identityHashCode(this));
    }

    @NotNull
    public final setItemChecked setNavigationOnClickListener() {
        return (setItemChecked) setY(new Object[]{this}, -1955374645, 1955374652, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.setImageTintList, com.mypinpad.tsdk.isolation.setLeftTopRightBottom
    public final int setOnFocusChangeListener(@Nullable byte[] bArr, int i10) {
        return ((Integer) setY(new Object[]{this, bArr, Integer.valueOf(i10)}, 68062056, -68062046, i10)).intValue();
    }

    @NotNull
    public final byte[] setTextAlignment() {
        return (byte[]) setY(new Object[]{this}, -1720557339, 1720557342, System.identityHashCode(this));
    }

    @NotNull
    public final activateSession setZ() {
        return (activateSession) setY(new Object[]{this}, -914736988, 914736994, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.setImageTintList
    @NotNull
    public final String toString() {
        return (String) setY(new Object[]{this}, -1955721397, 1955721401, System.identityHashCode(this));
    }

    public final void setOnFocusChangeListener(@NotNull setDrawSelectorOnTop setdrawselectorontop) {
        setY(new Object[]{this, setdrawselectorontop}, -525329557, 525329568, System.identityHashCode(this));
    }

    public final void setY(@NotNull activateSession activatesession) {
        setY(new Object[]{this, activatesession}, 1989303771, -1989303771, System.identityHashCode(this));
    }

    public final void setY(@NotNull setContentCaptureSession setcontentcapturesession) {
        setY(new Object[]{this, setcontentcapturesession}, 1978933232, -1978933227, System.identityHashCode(this));
    }

    public final void setY(@NotNull setItemChecked setitemchecked) {
        setY(new Object[]{this, setitemchecked}, 1982273155, -1982273147, System.identityHashCode(this));
    }
}
