package com.mypinpad.tsdk.isolation;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
public final class cc extends t {
    public static int F = 0;
    public static int G = 1;
    public boolean A;
    public boolean B;
    public boolean C;
    public boolean D;
    public boolean E;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f54800f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f54801g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f54802h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f54803i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f54804j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f54805k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f54806l;
    public boolean m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f54807n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f54808o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f54809p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f54810q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f54811r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f54812s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f54813t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f54814u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f54815v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f54816w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f54817x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f54818y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f54819z;

    public cc() {
        super(setAnimation.setZ().setDividerPadding());
    }

    public static /* synthetic */ Object setDividerPadding(Object[] objArr, int i10, int i11, int i12) {
        int i13 = (((~(i10 | i12)) | (~(i11 | (~i12)))) * 627) + (((~((~i11) | i12)) | i10) * (-627)) + ((i11 | i12 | (~i10)) * (-627)) + (i11 * 628) + (i10 * 628);
        if (i13 == 1) {
            cc ccVar = (cc) objArr[0];
            int i14 = G;
            int i15 = i14 & 5;
            int i16 = -(-((i14 ^ 5) | i15));
            int i17 = (i15 & i16) + (i15 | i16);
            F = i17 % 128;
            int i18 = i17 % 2;
            boolean z10 = ccVar.f54800f;
            if (i18 != 0) {
                throw null;
            }
            int i19 = (i14 ^ 67) + ((i14 & 67) << 1);
            F = i19 % 128;
            if (i19 % 2 != 0) {
                int i20 = 94 / 0;
            }
            return Boolean.valueOf(z10);
        }
        if (i13 == 2) {
            cc ccVar2 = (cc) objArr[0];
            byte[] bArr = (byte[]) objArr[1];
            int iIntValue = ((Number) objArr[2]).intValue();
            int i21 = F;
            int i22 = (i21 ^ 27) + ((i21 & 27) << 1);
            G = i22 % 128;
            int i23 = i22 % 2;
            int onFocusChangeListener = super.setOnFocusChangeListener(bArr, iIntValue);
            ccVar2.E = ((Boolean) setLogo.setY(new Object[]{Byte.valueOf(ccVar2.setCompoundDrawableTintBlendMode()[4]), 0}, 1812344530, -1812344522, 0)).booleanValue();
            ccVar2.D = ((Boolean) setLogo.setY(new Object[]{Byte.valueOf(ccVar2.setCompoundDrawableTintBlendMode()[4]), 1}, 1812344530, -1812344522, 1)).booleanValue();
            ccVar2.C = ((Boolean) setLogo.setY(new Object[]{Byte.valueOf(ccVar2.setCompoundDrawableTintBlendMode()[4]), 2}, 1812344530, -1812344522, 2)).booleanValue();
            ccVar2.B = ((Boolean) setLogo.setY(new Object[]{Byte.valueOf(ccVar2.setCompoundDrawableTintBlendMode()[4]), 3}, 1812344530, -1812344522, 3)).booleanValue();
            ccVar2.A = ((Boolean) setLogo.setY(new Object[]{Byte.valueOf(ccVar2.setCompoundDrawableTintBlendMode()[4]), 4}, 1812344530, -1812344522, 4)).booleanValue();
            ccVar2.f54819z = ((Boolean) setLogo.setY(new Object[]{Byte.valueOf(ccVar2.setCompoundDrawableTintBlendMode()[4]), 5}, 1812344530, -1812344522, 5)).booleanValue();
            ccVar2.f54818y = ((Boolean) setLogo.setY(new Object[]{Byte.valueOf(ccVar2.setCompoundDrawableTintBlendMode()[4]), 6}, 1812344530, -1812344522, 6)).booleanValue();
            ccVar2.f54817x = ((Boolean) setLogo.setY(new Object[]{Byte.valueOf(ccVar2.setCompoundDrawableTintBlendMode()[4]), 7}, 1812344530, -1812344522, 7)).booleanValue();
            ccVar2.f54816w = ((Boolean) setLogo.setY(new Object[]{Byte.valueOf(ccVar2.setCompoundDrawableTintBlendMode()[3]), 0}, 1812344530, -1812344522, 0)).booleanValue();
            ccVar2.f54815v = ((Boolean) setLogo.setY(new Object[]{Byte.valueOf(ccVar2.setCompoundDrawableTintBlendMode()[3]), 1}, 1812344530, -1812344522, 1)).booleanValue();
            ccVar2.f54813t = ((Boolean) setLogo.setY(new Object[]{Byte.valueOf(ccVar2.setCompoundDrawableTintBlendMode()[3]), 5}, 1812344530, -1812344522, 5)).booleanValue();
            ccVar2.f54814u = ((Boolean) setLogo.setY(new Object[]{Byte.valueOf(ccVar2.setCompoundDrawableTintBlendMode()[3]), 4}, 1812344530, -1812344522, 4)).booleanValue();
            ccVar2.f54811r = ((Boolean) setLogo.setY(new Object[]{Byte.valueOf(ccVar2.setCompoundDrawableTintBlendMode()[3]), 7}, 1812344530, -1812344522, 7)).booleanValue();
            ccVar2.f54812s = ((Boolean) setLogo.setY(new Object[]{Byte.valueOf(ccVar2.setCompoundDrawableTintBlendMode()[3]), 6}, 1812344530, -1812344522, 6)).booleanValue();
            ccVar2.f54808o = ((Boolean) setLogo.setY(new Object[]{Byte.valueOf(ccVar2.setCompoundDrawableTintBlendMode()[2]), 6}, 1812344530, -1812344522, 6)).booleanValue();
            ccVar2.f54809p = ((Boolean) setLogo.setY(new Object[]{Byte.valueOf(ccVar2.setCompoundDrawableTintBlendMode()[2]), 5}, 1812344530, -1812344522, 5)).booleanValue();
            ccVar2.f54810q = ((Boolean) setLogo.setY(new Object[]{Byte.valueOf(ccVar2.setCompoundDrawableTintBlendMode()[2]), 4}, 1812344530, -1812344522, 4)).booleanValue();
            ccVar2.f54807n = ((Boolean) setLogo.setY(new Object[]{Byte.valueOf(ccVar2.setCompoundDrawableTintBlendMode()[2]), 7}, 1812344530, -1812344522, 7)).booleanValue();
            ccVar2.f54807n = ((Boolean) setLogo.setY(new Object[]{Byte.valueOf(ccVar2.setCompoundDrawableTintBlendMode()[1]), 7}, 1812344530, -1812344522, 7)).booleanValue();
            ccVar2.m = ((Boolean) setLogo.setY(new Object[]{Byte.valueOf(ccVar2.setCompoundDrawableTintBlendMode()[0]), 0}, 1812344530, -1812344522, 0)).booleanValue();
            ccVar2.f54800f = ((Boolean) setLogo.setY(new Object[]{Byte.valueOf(ccVar2.setCompoundDrawableTintBlendMode()[0]), 7}, 1812344530, -1812344522, 7)).booleanValue();
            ccVar2.f54803i = ((Boolean) setLogo.setY(new Object[]{Byte.valueOf(ccVar2.setCompoundDrawableTintBlendMode()[0]), 4}, 1812344530, -1812344522, 4)).booleanValue();
            ccVar2.f54801g = ((Boolean) setLogo.setY(new Object[]{Byte.valueOf(ccVar2.setCompoundDrawableTintBlendMode()[0]), 6}, 1812344530, -1812344522, 6)).booleanValue();
            ccVar2.f54804j = ((Boolean) setLogo.setY(new Object[]{Byte.valueOf(ccVar2.setCompoundDrawableTintBlendMode()[0]), 3}, 1812344530, -1812344522, 3)).booleanValue();
            ccVar2.f54806l = ((Boolean) setLogo.setY(new Object[]{Byte.valueOf(ccVar2.setCompoundDrawableTintBlendMode()[0]), 1}, 1812344530, -1812344522, 1)).booleanValue();
            ccVar2.f54802h = ((Boolean) setLogo.setY(new Object[]{Byte.valueOf(ccVar2.setCompoundDrawableTintBlendMode()[0]), 5}, 1812344530, -1812344522, 5)).booleanValue();
            ccVar2.f54805k = ((Boolean) setLogo.setY(new Object[]{Byte.valueOf(ccVar2.setCompoundDrawableTintBlendMode()[0]), 2}, 1812344530, -1812344522, 2)).booleanValue();
            int i24 = G;
            int i25 = i24 ^ 75;
            int i26 = (i24 & 75) << 1;
            int i27 = ((i25 | i26) << 1) - (i26 ^ i25);
            F = i27 % 128;
            if (i27 % 2 == 0) {
                return Integer.valueOf(onFocusChangeListener);
            }
            throw null;
        }
        cc ccVar3 = (cc) objArr[0];
        int i28 = G;
        int i29 = i28 & 105;
        int i30 = ((i28 ^ 105) | i29) << 1;
        int i31 = -((i28 | 105) & (~i29));
        int i32 = ((i30 | i31) << 1) - (i31 ^ i30);
        F = i32 % 128;
        int i33 = i32 % 2;
        setInputExtras.setDividerPadding(new Object[]{ccVar3.setCompoundDrawableTintBlendMode(), 4, 0, Boolean.valueOf(ccVar3.E)}, -91299280, 91299286, 4);
        setInputExtras.setDividerPadding(new Object[]{ccVar3.setCompoundDrawableTintBlendMode(), 4, 1, Boolean.valueOf(ccVar3.D)}, -91299280, 91299286, 4);
        setInputExtras.setDividerPadding(new Object[]{ccVar3.setCompoundDrawableTintBlendMode(), 4, 2, Boolean.valueOf(ccVar3.C)}, -91299280, 91299286, 4);
        setInputExtras.setDividerPadding(new Object[]{ccVar3.setCompoundDrawableTintBlendMode(), 4, 3, Boolean.valueOf(ccVar3.B)}, -91299280, 91299286, 4);
        setInputExtras.setDividerPadding(new Object[]{ccVar3.setCompoundDrawableTintBlendMode(), 4, 4, Boolean.valueOf(ccVar3.A)}, -91299280, 91299286, 4);
        setInputExtras.setDividerPadding(new Object[]{ccVar3.setCompoundDrawableTintBlendMode(), 4, 5, Boolean.valueOf(ccVar3.f54819z)}, -91299280, 91299286, 4);
        setInputExtras.setDividerPadding(new Object[]{ccVar3.setCompoundDrawableTintBlendMode(), 4, 6, Boolean.valueOf(ccVar3.f54818y)}, -91299280, 91299286, 4);
        setInputExtras.setDividerPadding(new Object[]{ccVar3.setCompoundDrawableTintBlendMode(), 4, 7, Boolean.valueOf(ccVar3.f54817x)}, -91299280, 91299286, 4);
        setInputExtras.setDividerPadding(new Object[]{ccVar3.setCompoundDrawableTintBlendMode(), 3, 0, Boolean.valueOf(ccVar3.f54816w)}, -91299280, 91299286, 3);
        setInputExtras.setDividerPadding(new Object[]{ccVar3.setCompoundDrawableTintBlendMode(), 3, 0, Boolean.valueOf(ccVar3.f54815v)}, -91299280, 91299286, 3);
        setInputExtras.setDividerPadding(new Object[]{ccVar3.setCompoundDrawableTintBlendMode(), 3, 5, Boolean.valueOf(ccVar3.f54813t)}, -91299280, 91299286, 3);
        setInputExtras.setDividerPadding(new Object[]{ccVar3.setCompoundDrawableTintBlendMode(), 3, 4, Boolean.valueOf(ccVar3.f54814u)}, -91299280, 91299286, 3);
        setInputExtras.setDividerPadding(new Object[]{ccVar3.setCompoundDrawableTintBlendMode(), 3, 7, Boolean.valueOf(ccVar3.f54811r)}, -91299280, 91299286, 3);
        setInputExtras.setDividerPadding(new Object[]{ccVar3.setCompoundDrawableTintBlendMode(), 3, 6, Boolean.valueOf(ccVar3.f54812s)}, -91299280, 91299286, 3);
        setInputExtras.setDividerPadding(new Object[]{ccVar3.setCompoundDrawableTintBlendMode(), 2, 6, Boolean.valueOf(ccVar3.f54808o)}, -91299280, 91299286, 2);
        setInputExtras.setDividerPadding(new Object[]{ccVar3.setCompoundDrawableTintBlendMode(), 2, 5, Boolean.valueOf(ccVar3.f54809p)}, -91299280, 91299286, 2);
        setInputExtras.setDividerPadding(new Object[]{ccVar3.setCompoundDrawableTintBlendMode(), 2, 4, Boolean.valueOf(ccVar3.f54810q)}, -91299280, 91299286, 2);
        setInputExtras.setDividerPadding(new Object[]{ccVar3.setCompoundDrawableTintBlendMode(), 2, 7, Boolean.valueOf(ccVar3.f54807n)}, -91299280, 91299286, 2);
        setInputExtras.setDividerPadding(new Object[]{ccVar3.setCompoundDrawableTintBlendMode(), 1, 7, Boolean.FALSE}, -91299280, 91299286, 1);
        setInputExtras.setDividerPadding(new Object[]{ccVar3.setCompoundDrawableTintBlendMode(), 0, 0, Boolean.valueOf(ccVar3.m)}, -91299280, 91299286, 0);
        setInputExtras.setDividerPadding(new Object[]{ccVar3.setCompoundDrawableTintBlendMode(), 0, 7, Boolean.valueOf(ccVar3.f54800f)}, -91299280, 91299286, 0);
        setInputExtras.setDividerPadding(new Object[]{ccVar3.setCompoundDrawableTintBlendMode(), 0, 4, Boolean.valueOf(ccVar3.f54803i)}, -91299280, 91299286, 0);
        setInputExtras.setDividerPadding(new Object[]{ccVar3.setCompoundDrawableTintBlendMode(), 0, 6, Boolean.valueOf(ccVar3.f54801g)}, -91299280, 91299286, 0);
        setInputExtras.setDividerPadding(new Object[]{ccVar3.setCompoundDrawableTintBlendMode(), 0, 3, Boolean.valueOf(ccVar3.f54804j)}, -91299280, 91299286, 0);
        setInputExtras.setDividerPadding(new Object[]{ccVar3.setCompoundDrawableTintBlendMode(), 0, 1, Boolean.valueOf(ccVar3.f54806l)}, -91299280, 91299286, 0);
        setInputExtras.setDividerPadding(new Object[]{ccVar3.setCompoundDrawableTintBlendMode(), 0, 5, Boolean.valueOf(ccVar3.f54802h)}, -91299280, 91299286, 0);
        setInputExtras.setDividerPadding(new Object[]{ccVar3.setCompoundDrawableTintBlendMode(), 0, 2, Boolean.valueOf(ccVar3.f54805k)}, -91299280, 91299286, 0);
        byte[] dividerPadding = super.setDividerPadding();
        int i34 = G;
        int i35 = i34 ^ 13;
        int i36 = ((i34 & 13) | i35) << 1;
        int i37 = -i35;
        int i38 = (i36 & i37) + (i36 | i37);
        F = i38 % 128;
        if (i38 % 2 == 0) {
            return dividerPadding;
        }
        int i39 = 67 / 0;
        return dividerPadding;
    }

    public final boolean setLayoutAnimation() {
        return ((Boolean) setDividerPadding(new Object[]{this}, 1479806194, -1479806193, System.identityHashCode(this))).booleanValue();
    }

    @Override // com.mypinpad.tsdk.isolation.setImageTintList, com.mypinpad.tsdk.isolation.setLeftTopRightBottom
    public final int setOnFocusChangeListener(@Nullable byte[] bArr, int i10) {
        return ((Integer) setDividerPadding(new Object[]{this, bArr, Integer.valueOf(i10)}, 1802665982, -1802665980, i10)).intValue();
    }

    @Override // com.mypinpad.tsdk.isolation.setImageTintList
    @NotNull
    public final byte[] setDividerPadding() {
        return (byte[]) setDividerPadding(new Object[]{this}, 286901154, -286901154, System.identityHashCode(this));
    }
}
