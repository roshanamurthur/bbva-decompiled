package com.mypinpad.tsdk.isolation;

import androidx.camera.core.impl.utils.c;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class hg extends t {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ KProperty<Object>[] f56188h = {c.e(hg.class, "acType_B1b8b7", "getAcType_B1b8b7()Lcom/mypinpad/softpos/emv/terminal/kernel/common/model/enums/AcTypeEnum;", 0), c.e(hg.class, "cdaSignatureRequested_B1b5", "getCdaSignatureRequested_B1b5()Z", 0)};

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static int f56189i = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static int f56190j = 1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final n f56191f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final h f56192g;

    static {
        int i10 = f56190j;
        int i11 = i10 ^ 77;
        int i12 = ((i10 & 77) | i11) << 1;
        int i13 = -i11;
        int i14 = (i12 & i13) + (i12 | i13);
        f56189i = i14 % 128;
        int i15 = i14 % 2;
    }

    public hg() {
        super(setAnimation.setVisibility().setDividerPadding());
        setFitsSystemWindows.Companion companion = setFitsSystemWindows.INSTANCE;
        this.f56191f = new n(0, 7, 6, (openContextMenu) setFitsSystemWindows.Companion.setOnFocusChangeListener(new Object[0], -1783054430, 1783054431, (int) System.currentTimeMillis()));
        this.f56192g = new h(0, 4);
    }

    public static /* synthetic */ Object setDividerPadding(Object[] objArr, int i10, int i11, int i12) {
        Object onFocusChangeListener;
        Object compoundDrawableTintBlendMode;
        int i13 = ~i10;
        int i14 = ~i11;
        int i15 = i13 | i14;
        int i16 = ~i12;
        int i17 = (((~(i10 | i14 | i16)) | (~(i13 | i12))) * 765) + (((~i15) | (~(i13 | i16))) * 1530) + (((~(i11 | i13 | i12)) | (~(i15 | i16)) | (~(i14 | i10 | i12))) * 765) + (i11 * (-764)) + (i10 * (-1529));
        KProperty<Object>[] kPropertyArr = f56188h;
        if (i17 == 1) {
            hg hgVar = (hg) objArr[0];
            int i18 = f56190j;
            int i19 = i18 & 69;
            int i20 = -(-((i18 ^ 69) | i19));
            int i21 = ((i19 | i20) << 1) - (i20 ^ i19);
            f56189i = i21 % 128;
            if (i21 % 2 != 0) {
                h hVar = hgVar.f56192g;
                onFocusChangeListener = h.setOnFocusChangeListener(new Object[]{hVar, hgVar, kPropertyArr[1]}, -709183664, 709183665, System.identityHashCode(hVar));
            } else {
                h hVar2 = hgVar.f56192g;
                onFocusChangeListener = h.setOnFocusChangeListener(new Object[]{hVar2, hgVar, kPropertyArr[1]}, -709183664, 709183665, System.identityHashCode(hVar2));
            }
            boolean zBooleanValue = ((Boolean) onFocusChangeListener).booleanValue();
            int i22 = f56189i;
            int i23 = i22 & 119;
            int i24 = (i22 ^ 119) | i23;
            int i25 = (i23 & i24) + (i24 | i23);
            f56190j = i25 % 128;
            if (i25 % 2 != 0) {
                return Boolean.valueOf(zBooleanValue);
            }
            throw null;
        }
        if (i17 == 2) {
            hg hgVar2 = (hg) objArr[0];
            int i26 = ((-1) << 1) - ((f56190j + 106) ^ (-1));
            f56189i = i26 % 128;
            if (i26 % 2 != 0) {
                n nVar = hgVar2.f56191f;
                compoundDrawableTintBlendMode = n.setCompoundDrawableTintBlendMode(new Object[]{nVar, hgVar2, kPropertyArr[1]}, 2052976211, -2052976210, System.identityHashCode(nVar));
            } else {
                n nVar2 = hgVar2.f56191f;
                compoundDrawableTintBlendMode = n.setCompoundDrawableTintBlendMode(new Object[]{nVar2, hgVar2, kPropertyArr[0]}, 2052976211, -2052976210, System.identityHashCode(nVar2));
            }
            return (setFitsSystemWindows) ((Enum) compoundDrawableTintBlendMode);
        }
        if (i17 != 3) {
            hg hgVar3 = (hg) objArr[0];
            int i27 = f56189i + 81;
            f56190j = i27 % 128;
            int i28 = i27 % 2;
            h hVar3 = hgVar3.f56192g;
            h.setOnFocusChangeListener(new Object[]{hVar3, hgVar3, kPropertyArr[1], Boolean.TRUE}, 951550455, -951550455, System.identityHashCode(hVar3));
            int i29 = f56190j;
            int i30 = i29 & 25;
            int i31 = -(-((i29 ^ 25) | i30));
            int i32 = (i30 & i31) + (i31 | i30);
            f56189i = i32 % 128;
            int i33 = i32 % 2;
            return null;
        }
        hg hgVar4 = (hg) objArr[0];
        setFitsSystemWindows setfitssystemwindows = (setFitsSystemWindows) objArr[1];
        int i34 = f56189i + 25;
        f56190j = i34 % 128;
        int i35 = i34 % 2;
        Intrinsics.checkNotNullParameter(setfitssystemwindows, "");
        n nVar3 = hgVar4.f56191f;
        n.setCompoundDrawableTintBlendMode(new Object[]{nVar3, hgVar4, kPropertyArr[0], setfitssystemwindows}, 697712004, -697712004, System.identityHashCode(nVar3));
        int i36 = f56189i;
        int i37 = i36 & 7;
        int i38 = ((i36 | 7) & (~i37)) + (i37 << 1);
        f56190j = i38 % 128;
        int i39 = i38 % 2;
        return null;
    }

    public final boolean getNavBarTitleString() {
        return ((Boolean) setDividerPadding(new Object[]{this}, 1346757001, -1346757000, System.identityHashCode(this))).booleanValue();
    }

    @NotNull
    public final setFitsSystemWindows setLayoutAnimation() {
        return (setFitsSystemWindows) setDividerPadding(new Object[]{this}, 1836375893, -1836375891, System.identityHashCode(this));
    }

    public final void setNavigationOnClickListener() {
        setDividerPadding(new Object[]{this}, 54164532, -54164532, System.identityHashCode(this));
    }

    public final void setDividerPadding(@NotNull setFitsSystemWindows setfitssystemwindows) {
        setDividerPadding(new Object[]{this, setfitssystemwindows}, 1090718025, -1090718022, System.identityHashCode(this));
    }
}
