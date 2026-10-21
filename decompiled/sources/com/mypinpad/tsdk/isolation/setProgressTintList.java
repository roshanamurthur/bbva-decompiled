package com.mypinpad.tsdk.isolation;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
public final class setProgressTintList {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static int f60383f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static int f60384g = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f60385a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final Long f60386b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final setOnItemLongClickListener f60387c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public final component14 f60388d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public final byte[] f60389e;

    public setProgressTintList(long j10, @Nullable Long l6, @NotNull setOnItemLongClickListener setonitemlongclicklistener, @Nullable component14 component14Var, @Nullable byte[] bArr) {
        Intrinsics.checkNotNullParameter(setonitemlongclicklistener, "");
        this.f60385a = j10;
        this.f60386b = l6;
        this.f60387c = setonitemlongclicklistener;
        this.f60388d = component14Var;
        this.f60389e = bArr;
    }

    public static /* synthetic */ Object setCompoundDrawableTintBlendMode(Object[] objArr, int i10, int i11, int i12) {
        int i13 = ~i11;
        int i14 = ~i10;
        int i15 = ~i12;
        int i16 = ((~(i10 | i11)) * 933) + (((~(i15 | i13)) | (~(i13 | i10))) * 933) + (((~(i14 | i15)) | i13) * (-933)) + (i11 * (-932)) + (i10 * 934);
        if (i16 == 1) {
            setProgressTintList setprogresstintlist = (setProgressTintList) objArr[0];
            int i17 = f60383f;
            int i18 = i17 & 63;
            int i19 = (i17 ^ 63) | i18;
            int i20 = (i18 & i19) + (i19 | i18);
            f60384g = i20 % 128;
            int i21 = i20 % 2;
            Long l6 = setprogresstintlist.f60386b;
            if (i21 != 0) {
                return l6;
            }
            throw null;
        }
        if (i16 == 2) {
            int i22 = f60384g + 5;
            f60383f = i22 % 128;
            int i23 = i22 % 2;
            setRenderEffect setrendereffect = setRenderEffect.INSTANCE;
            int i24 = f60383f;
            int i25 = (i24 ^ 41) + ((i24 & 41) << 1);
            f60384g = i25 % 128;
            int i26 = i25 % 2;
            return "";
        }
        if (i16 == 3) {
            setProgressTintList setprogresstintlist2 = (setProgressTintList) objArr[0];
            int i27 = f60383f;
            int i28 = (i27 & 73) + (i27 | 73);
            f60384g = i28 % 128;
            int i29 = i28 % 2;
            setOnItemLongClickListener setonitemlongclicklistener = setprogresstintlist2.f60387c;
            if (i29 != 0) {
                return setonitemlongclicklistener;
            }
            throw null;
        }
        if (i16 == 4) {
            setProgressTintList setprogresstintlist3 = (setProgressTintList) objArr[0];
            int i30 = f60384g;
            int i31 = i30 + 45;
            f60383f = i31 % 128;
            int i32 = i31 % 2;
            component14 component14Var = setprogresstintlist3.f60388d;
            if (i32 != 0) {
                int i33 = 71 / 0;
            }
            int i34 = i30 & 59;
            int i35 = i34 + ((i30 ^ 59) | i34);
            f60383f = i35 % 128;
            int i36 = i35 % 2;
            return component14Var;
        }
        if (i16 != 5) {
            setProgressTintList setprogresstintlist4 = (setProgressTintList) objArr[0];
            int i37 = f60383f;
            int i38 = (((i37 & (-6)) | ((~i37) & 5)) - (~(-(-((i37 & 5) << 1))))) - 1;
            int i39 = i38 % 128;
            f60384g = i39;
            int i40 = i38 % 2;
            byte[] bArr = setprogresstintlist4.f60389e;
            int i41 = (i39 & 78) + (i39 | 78);
            int i42 = (i41 ^ (-1)) + (i41 << 1);
            f60383f = i42 % 128;
            int i43 = i42 % 2;
            return bArr;
        }
        setProgressTintList setprogresstintlist5 = (setProgressTintList) objArr[0];
        int i44 = f60384g;
        int i45 = i44 & 17;
        int i46 = -(-((i44 ^ 17) | i45));
        int i47 = ((i45 | i46) << 1) - (i46 ^ i45);
        int i48 = i47 % 128;
        f60383f = i48;
        int i49 = i47 % 2;
        long j10 = setprogresstintlist5.f60385a;
        int i50 = (i48 ^ 23) + ((i48 & 23) << 1);
        f60384g = i50 % 128;
        if (i50 % 2 != 0) {
            return Long.valueOf(j10);
        }
        throw null;
    }

    @Nullable
    public final Long setDividerPadding() {
        return (Long) setCompoundDrawableTintBlendMode(new Object[]{this}, 20953999, -20953998, System.identityHashCode(this));
    }

    public final long setOnFocusChangeListener() {
        return ((Long) setCompoundDrawableTintBlendMode(new Object[]{this}, 1545724039, -1545724034, System.identityHashCode(this))).longValue();
    }

    @Nullable
    public final component14 setX() {
        return (component14) setCompoundDrawableTintBlendMode(new Object[]{this}, 1312334878, -1312334874, System.identityHashCode(this));
    }

    @NotNull
    public final setOnItemLongClickListener setY() {
        return (setOnItemLongClickListener) setCompoundDrawableTintBlendMode(new Object[]{this}, -1931532234, 1931532237, System.identityHashCode(this));
    }

    @NotNull
    public final String toString() {
        return (String) setCompoundDrawableTintBlendMode(new Object[]{this}, 717785310, -717785308, System.identityHashCode(this));
    }

    @Nullable
    public final byte[] setCompoundDrawableTintBlendMode() {
        return (byte[]) setCompoundDrawableTintBlendMode(new Object[]{this}, -614920731, 614920731, System.identityHashCode(this));
    }
}
