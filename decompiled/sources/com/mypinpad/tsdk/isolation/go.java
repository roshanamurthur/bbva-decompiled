package com.mypinpad.tsdk.isolation;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class go {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int f56050c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static int f56051d = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final fi f56052a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final getValue f56053b;

    public /* synthetic */ class setCompoundDrawableTintBlendMode {
        public static final /* synthetic */ int[] setCompoundDrawableTintBlendMode;

        static {
            int[] iArr = new int[setImageTintBlendMode.values().length];
            iArr[setImageTintBlendMode.setOnFocusChangeListener.ordinal()] = 1;
            setCompoundDrawableTintBlendMode = iArr;
            int i10 = 31 << 1;
            int i11 = -((~0) & 31);
            int i12 = ((i10 | i11) << 1) - (i10 ^ i11);
            int i13 = i12 % 128;
            int i14 = i12 % 2;
        }
    }

    public go(@NotNull fi fiVar, @NotNull getValue getvalue) {
        Intrinsics.checkNotNullParameter(fiVar, "");
        Intrinsics.checkNotNullParameter(getvalue, "");
        this.f56052a = fiVar;
        this.f56053b = getvalue;
    }

    public static /* synthetic */ Object setDividerPadding(Object[] objArr, int i10, int i11, int i12) {
        setFitsSystemWindows setfitssystemwindows;
        go goVar = (go) objArr[0];
        fi fiVar = goVar.f56052a;
        setAnimation setanimation = setAnimation.INSTANCE;
        byte[] bArr = (byte[]) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{fiVar, (TransactionFailed) setAnimation.setY(new Object[0], 2019562047, -2019561898, (int) System.currentTimeMillis())}, -1344789201, 1344789222, System.identityHashCode(fiVar));
        setImageTintBlendMode.Companion companion = setImageTintBlendMode.INSTANCE;
        if (setCompoundDrawableTintBlendMode.setCompoundDrawableTintBlendMode[((setImageTintBlendMode) setImageTintBlendMode.Companion.setCompoundDrawableTintBlendMode(new Object[]{new String(bArr, Charsets.UTF_8)}, 1542621082, -1542621082, (int) System.currentTimeMillis())).ordinal()] == 1) {
            int i13 = f56050c;
            int i14 = ((((i13 ^ 41) | (i13 & 41)) << 1) - (~(-(((~i13) & 41) | (i13 & (-42)))))) - 1;
            f56051d = i14 % 128;
            int i15 = i14 % 2;
            setfitssystemwindows = setFitsSystemWindows.setDividerPadding;
            int i16 = f56051d + 59;
            f56050c = i16 % 128;
            int i17 = i16 % 2;
        } else {
            setfitssystemwindows = setFitsSystemWindows.setOnFocusChangeListener;
            int i18 = f56050c;
            int i19 = (i18 ^ 17) + ((i18 & 17) << 1);
            f56051d = i19 % 128;
            int i20 = i19 % 2;
        }
        setEms setems = new setEms(setfitssystemwindows, false);
        ee eeVar = ee.setDividerPadding;
        fk fkVar = (fk) ee.setOnFocusChangeListener(new Object[]{goVar.f56052a, goVar.f56053b, setems}, -1377407442, 1377407459, (int) System.currentTimeMillis());
        int i21 = f56050c;
        int i22 = i21 & 39;
        int i23 = (i21 ^ 39) | i22;
        int i24 = ((i22 | i23) << 1) - (i23 ^ i22);
        f56051d = i24 % 128;
        int i25 = i24 % 2;
        return fkVar;
    }

    @NotNull
    public final fk setCompoundDrawableTintBlendMode() {
        return (fk) setDividerPadding(new Object[]{this}, -628542188, 628542188, System.identityHashCode(this));
    }
}
