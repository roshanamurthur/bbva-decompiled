package com.mypinpad.tsdk.isolation;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class hc {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static int f56173e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static int f56174f = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final byte[] f56175a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final byte[] f56176b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final activateSession f56177c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final ValueQualifier f56178d;

    public hc(@NotNull byte[] bArr, @NotNull byte[] bArr2, @NotNull activateSession activatesession, @NotNull ValueQualifier valueQualifier) {
        Intrinsics.checkNotNullParameter(bArr, "");
        Intrinsics.checkNotNullParameter(bArr2, "");
        Intrinsics.checkNotNullParameter(activatesession, "");
        Intrinsics.checkNotNullParameter(valueQualifier, "");
        this.f56175a = bArr;
        this.f56176b = bArr2;
        this.f56177c = activatesession;
        this.f56178d = valueQualifier;
    }

    public static /* synthetic */ Object setCompoundDrawableTintBlendMode(Object[] objArr, int i10, int i11, int i12) {
        int i13 = ~i11;
        int i14 = (((~i10) | i13) * 824) + ((i11 | i10) * (-1648)) + ((i10 | i13) * (-824)) + (i11 * 825) + (i10 * 1649);
        if (i14 == 1) {
            hc hcVar = (hc) objArr[0];
            int i15 = f56174f;
            int i16 = (-2) - (((i15 ^ 70) + ((i15 & 70) << 1)) ^ (-1));
            f56173e = i16 % 128;
            int i17 = i16 % 2;
            ValueQualifier valueQualifier = hcVar.f56178d;
            if (i17 == 0) {
                return valueQualifier;
            }
            throw null;
        }
        if (i14 == 2) {
            hc hcVar2 = (hc) objArr[0];
            int i18 = f56173e;
            int i19 = (i18 & 51) + (i18 | 51);
            f56174f = i19 % 128;
            int i20 = i19 % 2;
            byte[] bArr = hcVar2.f56175a;
            byte[] bArr2 = hcVar2.f56176b;
            byte[] bArr3 = {bArr[0], bArr[1], bArr[2], bArr2[0], bArr2[1], bArr2[2], hcVar2.f56177c.setDividerPadding(), hcVar2.f56178d.setCompoundDrawableTintBlendMode()};
            int i21 = f56173e;
            int i22 = (((i21 ^ 31) | (i21 & 31)) << 1) - (((~i21) & 31) | (i21 & (-32)));
            f56174f = i22 % 128;
            int i23 = i22 % 2;
            return bArr3;
        }
        if (i14 == 3) {
            hc hcVar3 = (hc) objArr[0];
            int i24 = f56174f;
            int i25 = i24 & 97;
            int i26 = ((i24 | 97) & (~i25)) + (i25 << 1);
            f56173e = i26 % 128;
            int i27 = i26 % 2;
            byte[] bArr4 = hcVar3.f56175a;
            if (i27 == 0) {
                return bArr4;
            }
            throw null;
        }
        if (i14 != 4) {
            hc hcVar4 = (hc) objArr[0];
            int i28 = f56173e;
            int i29 = i28 | 1;
            int i30 = (i29 << 1) - ((~(i28 & 1)) & i29);
            f56174f = i30 % 128;
            int i31 = i30 % 2;
            activateSession activatesession = hcVar4.f56177c;
            if (i31 != 0) {
                return activatesession;
            }
            throw null;
        }
        hc hcVar5 = (hc) objArr[0];
        int i32 = f56174f;
        int i33 = (((i32 | 60) << 1) - (i32 ^ 60)) - 1;
        f56173e = i33 % 128;
        int i34 = i33 % 2;
        byte[] bArr5 = hcVar5.f56176b;
        if (i34 != 0) {
            throw null;
        }
        int i35 = i32 + 17;
        f56173e = i35 % 128;
        int i36 = i35 % 2;
        return bArr5;
    }

    @NotNull
    public final activateSession setDividerPadding() {
        return (activateSession) setCompoundDrawableTintBlendMode(new Object[]{this}, 411744251, -411744251, System.identityHashCode(this));
    }

    @NotNull
    public final byte[] setOnFocusChangeListener() {
        return (byte[]) setCompoundDrawableTintBlendMode(new Object[]{this}, 81708909, -81708905, System.identityHashCode(this));
    }

    @NotNull
    public final ValueQualifier setX() {
        return (ValueQualifier) setCompoundDrawableTintBlendMode(new Object[]{this}, 40148315, -40148314, System.identityHashCode(this));
    }

    @NotNull
    public final byte[] setY() {
        return (byte[]) setCompoundDrawableTintBlendMode(new Object[]{this}, 1812981238, -1812981236, System.identityHashCode(this));
    }

    @NotNull
    public final byte[] setCompoundDrawableTintBlendMode() {
        return (byte[]) setCompoundDrawableTintBlendMode(new Object[]{this}, 59248592, -59248589, System.identityHashCode(this));
    }
}
