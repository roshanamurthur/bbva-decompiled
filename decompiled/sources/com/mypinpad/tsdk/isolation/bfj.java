package com.mypinpad.tsdk.isolation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class bfj implements bfi {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final List f54699d = Collections.unmodifiableList(new ArrayList());

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static int f54700e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static int f54701f = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f54702a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f54703b = Collections.unmodifiableList(f54699d);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f54704c;

    static {
        int i10 = f54700e;
        int i11 = (i10 | 91) << 1;
        int i12 = -(i10 ^ 91);
        int i13 = (i11 & i12) + (i12 | i11);
        f54701f = i13 % 128;
        int i14 = i13 % 2;
    }

    public bfj(String str, byte[] bArr) {
        this.f54702a = str;
        this.f54704c = bArr;
    }

    public static /* synthetic */ Object setCompoundDrawableTintBlendMode(Object[] objArr, int i10, int i11, int i12) {
        int i13 = (((~i10) | i11) * 160) + (i11 * (-159)) + (i10 * (-159));
        int i14 = ~i12;
        int i15 = ((i10 | (~((~i11) | i14))) * 160) + (((~(i14 | i10)) | (~(i10 | i11))) * (-160)) + i13;
        if (i15 == 1) {
            bfj bfjVar = (bfj) objArr[0];
            int i16 = f54701f;
            int i17 = (i16 & (-62)) | ((~i16) & 61);
            int i18 = -(-((i16 & 61) << 1));
            int i19 = ((i17 | i18) << 1) - (i18 ^ i17);
            int i20 = i19 % 128;
            f54700e = i20;
            int i21 = i19 % 2;
            int i22 = ((i20 & 62) + (i20 | 62)) - 1;
            f54701f = i22 % 128;
            if (i22 % 2 != 0) {
                return bfjVar;
            }
            throw null;
        }
        if (i15 == 2) {
            bfj bfjVar2 = (bfj) objArr[0];
            int i23 = f54700e;
            int i24 = ((i23 | 114) << 1) - (i23 ^ 114);
            int i25 = (i24 ^ (-1)) + (i24 << 1);
            f54701f = i25 % 128;
            int i26 = i25 % 2;
            List list = bfjVar2.f54703b;
            int i27 = ((i23 ^ 26) + ((i23 & 26) << 1)) - 1;
            f54701f = i27 % 128;
            int i28 = i27 % 2;
            return list;
        }
        if (i15 != 3) {
            bfj bfjVar3 = (bfj) objArr[0];
            int i29 = f54701f;
            int i30 = i29 & 59;
            int i31 = (i29 ^ 59) | i30;
            int i32 = ((i30 | i31) << 1) - (i31 ^ i30);
            f54700e = i32 % 128;
            int i33 = i32 % 2;
            String str = bfjVar3.f54702a;
            if (i33 == 0) {
                return str;
            }
            int i34 = 15 / 0;
            return str;
        }
        bfj bfjVar4 = (bfj) objArr[0];
        int i35 = f54700e;
        int i36 = i35 | 47;
        int i37 = i36 << 1;
        int i38 = -((~(i35 & 47)) & i36);
        int i39 = (i37 ^ i38) + ((i38 & i37) << 1);
        f54701f = i39 % 128;
        int i40 = i39 % 2;
        byte[] bArr = bfjVar4.f54704c;
        if (i40 != 0) {
            return bArr;
        }
        int i41 = 55 / 0;
        return bArr;
    }

    public final byte[] setDividerPadding() {
        return (byte[]) setCompoundDrawableTintBlendMode(new Object[]{this}, -2129009069, 2129009072, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.bfi
    public final bfj setX() throws bfk {
        return (bfj) setCompoundDrawableTintBlendMode(new Object[]{this}, -783663757, 783663758, System.identityHashCode(this));
    }

    public final String setY() {
        return (String) setCompoundDrawableTintBlendMode(new Object[]{this}, 928663106, -928663106, System.identityHashCode(this));
    }

    public final List setCompoundDrawableTintBlendMode() {
        return (List) setCompoundDrawableTintBlendMode(new Object[]{this}, 1025053102, -1025053100, System.identityHashCode(this));
    }
}
