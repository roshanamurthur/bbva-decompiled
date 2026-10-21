package com.mypinpad.tsdk.isolation;

import androidx.camera.core.impl.utils.c;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class ct extends t {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ KProperty<Object>[] f55038i = {c.e(ct.class, "offlineDataAuthenticationPerformed_B1b8", "getOfflineDataAuthenticationPerformed_B1b8()Z", 0), c.e(ct.class, "cdaFailed_B1b7", "getCdaFailed_B1b7()Z", 0), c.e(ct.class, "expiredApplication_B1b6", "getExpiredApplication_B1b6()Z", 0)};

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static int f55039j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static int f55040k = 1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final h f55041f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final h f55042g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public final h f55043h;

    static {
        int i10 = f55040k;
        int i11 = ((i10 | 99) << 1) - (i10 ^ 99);
        f55039j = i11 % 128;
        if (i11 % 2 != 0) {
            int i12 = 79 / 0;
        }
    }

    public ct() {
        super(setAnimation.setLayoutAnimation().setDividerPadding());
        this.f55041f = new h(0, 7);
        this.f55042g = new h(0, 6);
        this.f55043h = new h(0, 5);
    }

    public static /* synthetic */ Object setY(Object[] objArr, int i10, int i11, int i12) {
        Object onFocusChangeListener;
        int i13 = (i11 * (-755)) + (i10 * (-755));
        int i14 = ~((~i10) | (~i11));
        int i15 = i10 | i11;
        int i16 = ((i15 | (~i12)) * 756) + (((~(i15 | i12)) | i14) * (-756)) + (i14 * 1512) + i13;
        KProperty<Object>[] kPropertyArr = f55038i;
        if (i16 == 1) {
            ct ctVar = (ct) objArr[0];
            System.identityHashCode(ctVar);
            System.identityHashCode(ctVar);
            h hVar = ctVar.f55041f;
            h.setOnFocusChangeListener(new Object[]{hVar, ctVar, kPropertyArr[0], Boolean.TRUE}, 951550455, -951550455, System.identityHashCode(hVar));
            int i17 = f55039j;
            int i18 = ((i17 ^ 108) + ((i17 & 108) << 1)) - 1;
            f55040k = i18 % 128;
            if (i18 % 2 != 0) {
                return null;
            }
            throw null;
        }
        if (i16 == 2) {
            ct ctVar2 = (ct) objArr[0];
            int i19 = f55039j;
            int i20 = ((i19 | 115) << 1) - (i19 ^ 115);
            f55040k = i20 % 128;
            int i21 = i20 % 2;
            h hVar2 = ctVar2.f55042g;
            h.setOnFocusChangeListener(new Object[]{hVar2, ctVar2, kPropertyArr[1], Boolean.TRUE}, 951550455, -951550455, System.identityHashCode(hVar2));
            int i22 = f55039j;
            int i23 = (i22 & 27) + (i22 | 27);
            f55040k = i23 % 128;
            if (i23 % 2 != 0) {
                return null;
            }
            throw null;
        }
        if (i16 == 3) {
            ct ctVar3 = (ct) objArr[0];
            int i24 = f55040k;
            int i25 = i24 & 17;
            int i26 = ((((i24 ^ 17) | i25) << 1) - (~(-((i24 | 17) & (~i25))))) - 1;
            f55039j = i26 % 128;
            if (i26 % 2 != 0) {
                h hVar3 = ctVar3.f55041f;
                onFocusChangeListener = h.setOnFocusChangeListener(new Object[]{hVar3, ctVar3, kPropertyArr[1]}, -709183664, 709183665, System.identityHashCode(hVar3));
            } else {
                h hVar4 = ctVar3.f55041f;
                onFocusChangeListener = h.setOnFocusChangeListener(new Object[]{hVar4, ctVar3, kPropertyArr[0]}, -709183664, 709183665, System.identityHashCode(hVar4));
            }
            return Boolean.valueOf(((Boolean) onFocusChangeListener).booleanValue());
        }
        ct ctVar4 = (ct) objArr[0];
        boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
        int i27 = f55039j;
        int i28 = i27 & 43;
        int i29 = (i27 | 43) & (~i28);
        int i30 = -(-(i28 << 1));
        int i31 = (i29 & i30) + (i29 | i30);
        f55040k = i31 % 128;
        int i32 = i31 % 2;
        h hVar5 = ctVar4.f55043h;
        if (i32 == 0) {
            h.setOnFocusChangeListener(new Object[]{hVar5, ctVar4, kPropertyArr[5], Boolean.valueOf(zBooleanValue)}, 951550455, -951550455, System.identityHashCode(hVar5));
        } else {
            h.setOnFocusChangeListener(new Object[]{hVar5, ctVar4, kPropertyArr[2], Boolean.valueOf(zBooleanValue)}, 951550455, -951550455, System.identityHashCode(hVar5));
        }
        int i33 = ((-1) << 1) - ((f55039j + 18) ^ (-1));
        f55040k = i33 % 128;
        int i34 = i33 % 2;
        return null;
    }

    public final boolean getNavBarTitleString() {
        return ((Boolean) setY(new Object[]{this}, -1674422501, 1674422504, System.identityHashCode(this))).booleanValue();
    }

    public final void setCompoundDrawableTintBlendMode(boolean z10) {
        setY(new Object[]{this, Boolean.valueOf(z10)}, -1484914280, 1484914280, System.identityHashCode(this));
    }

    public final void setLayoutAnimation() {
        setY(new Object[]{this}, 785942766, -785942764, System.identityHashCode(this));
    }

    public final void setNavigationOnClickListener() {
        setY(new Object[]{this}, -2015936104, 2015936105, System.identityHashCode(this));
    }
}
