package com.mypinpad.tsdk.isolation;

import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
public class setClipToOutline implements setAccessibilityPaneTitle.setY {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int f59549c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static int f59550d = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public getBeepOnFailure f59551a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public getBeepOnFailure f59552b;

    public static /* synthetic */ Object setOnFocusChangeListener(Object[] objArr, int i10, int i11, int i12) throws Exception {
        int i13 = ~i10;
        int i14 = ~i11;
        int i15 = i13 | i14;
        int i16 = ~(i15 | i12);
        int i17 = ~i12;
        int i18 = (((~(i10 | i14 | i12)) | (~(i11 | i13 | i12)) | (~(i15 | i17))) * 920) + (((~i15) | (~(i13 | i17))) * 920) + ((i16 | (~(i14 | i17 | i10))) * 920) + (i11 * (-919)) + (i10 * (-919));
        if (i18 == 1) {
            setClipToOutline setcliptooutline = (setClipToOutline) objArr[0];
            int i19 = f59549c;
            int i20 = i19 & 65;
            int i21 = (i19 ^ 65) | i20;
            int i22 = ((i20 | i21) << 1) - (i21 ^ i20);
            int i23 = i22 % 128;
            f59550d = i23;
            int i24 = i22 % 2;
            getBeepOnFailure getbeeponfailure = setcliptooutline.f59551a;
            if (getbeeponfailure != null) {
                int i25 = i23 & 55;
                int i26 = ((i23 | 55) & (~i25)) + (i25 << 1);
                f59549c = i26 % 128;
                if (i26 % 2 != 0) {
                    getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure}, 1006797251, -1006797224, System.identityHashCode(getbeeponfailure));
                    int i27 = 35 / 0;
                } else {
                    getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure}, 1006797251, -1006797224, System.identityHashCode(getbeeponfailure));
                }
                int i28 = f59549c;
                int i29 = i28 & 89;
                int i30 = -(-((i28 ^ 89) | i29));
                int i31 = (i29 ^ i30) + ((i30 & i29) << 1);
                f59550d = i31 % 128;
                int i32 = i31 % 2;
            }
            getBeepOnFailure getbeeponfailure2 = setcliptooutline.f59552b;
            if (getbeeponfailure2 != null) {
                int i33 = f59549c;
                int i34 = (((i33 | 6) << 1) - (i33 ^ 6)) - 1;
                f59550d = i34 % 128;
                int i35 = i34 % 2;
                getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure2}, 1006797251, -1006797224, System.identityHashCode(getbeeponfailure2));
                int i36 = f59549c;
                int i37 = ((i36 | 99) << 1) - (i36 ^ 99);
                f59550d = i37 % 128;
                int i38 = i37 % 2;
            }
            int i39 = f59549c;
            int i40 = (i39 | 59) << 1;
            int i41 = -(((~i39) & 59) | (i39 & (-60)));
            int i42 = ((i40 | i41) << 1) - (i41 ^ i40);
            f59550d = i42 % 128;
            if (i42 % 2 != 0) {
                return null;
            }
            throw null;
        }
        if (i18 == 2) {
            setClipToOutline setcliptooutline2 = (setClipToOutline) objArr[0];
            getBeepOnFailure getbeeponfailure3 = (getBeepOnFailure) objArr[1];
            int i43 = f59549c + 83;
            f59550d = i43 % 128;
            int i44 = i43 % 2;
            setcliptooutline2.f59551a = getbeeponfailure3;
            if (i44 != 0) {
                return null;
            }
            int i45 = 97 / 0;
            return null;
        }
        if (i18 == 3) {
            setClipToOutline setcliptooutline3 = (setClipToOutline) objArr[0];
            int i46 = f59550d;
            int i47 = i46 & 91;
            int i48 = ((i46 ^ 91) | i47) << 1;
            int i49 = -((i46 | 91) & (~i47));
            int i50 = (i48 ^ i49) + ((i49 & i48) << 1);
            int i51 = i50 % 128;
            f59549c = i51;
            int i52 = i50 % 2;
            getBeepOnFailure getbeeponfailure4 = setcliptooutline3.f59552b;
            int i53 = i51 | 103;
            int i54 = (i53 << 1) - (i53 & (~(i51 & 103)));
            f59550d = i54 % 128;
            if (i54 % 2 != 0) {
                return getbeeponfailure4;
            }
            int i55 = 65 / 0;
            return getbeeponfailure4;
        }
        if (i18 == 4) {
            setClipToOutline setcliptooutline4 = (setClipToOutline) objArr[0];
            int i56 = f59549c;
            int i57 = (-2) - (((i56 ^ 116) + ((i56 & 116) << 1)) ^ (-1));
            f59550d = i57 % 128;
            if (i57 % 2 != 0) {
                return setcliptooutline4.f59551a;
            }
            getBeepOnFailure getbeeponfailure5 = setcliptooutline4.f59551a;
            throw null;
        }
        setClipToOutline setcliptooutline5 = (setClipToOutline) objArr[0];
        getBeepOnFailure getbeeponfailure6 = (getBeepOnFailure) objArr[1];
        int i58 = f59550d;
        int i59 = i58 + 82;
        int i60 = (i59 ^ (-1)) + (i59 << 1);
        f59549c = i60 % 128;
        int i61 = i60 % 2;
        setcliptooutline5.f59552b = getbeeponfailure6;
        int i62 = i58 + 77;
        f59549c = i62 % 128;
        int i63 = i62 % 2;
        return null;
    }

    @Override // com.mypinpad.tsdk.i.setAccessibilityPaneTitle.setY
    public final void setCompoundDrawableTintBlendMode() throws Exception {
        setOnFocusChangeListener(new Object[]{this}, -1993501927, 1993501928, System.identityHashCode(this));
    }

    @Nullable
    public final getBeepOnFailure setDividerPadding() {
        return (getBeepOnFailure) setOnFocusChangeListener(new Object[]{this}, -858335374, 858335378, System.identityHashCode(this));
    }

    public final void setX(@Nullable getBeepOnFailure getbeeponfailure) throws Exception {
        setOnFocusChangeListener(new Object[]{this, getbeeponfailure}, -1177243662, 1177243664, System.identityHashCode(this));
    }

    @Nullable
    public final getBeepOnFailure setY() {
        return (getBeepOnFailure) setOnFocusChangeListener(new Object[]{this}, -1323114687, 1323114690, System.identityHashCode(this));
    }

    public final void setCompoundDrawableTintBlendMode(@Nullable getBeepOnFailure getbeeponfailure) throws Exception {
        setOnFocusChangeListener(new Object[]{this, getbeeponfailure}, -1083661792, 1083661792, System.identityHashCode(this));
    }
}
