package com.mypinpad.tsdk.isolation;

import androidx.annotation.VisibleForTesting;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0012\n\u0002\b\u0005\b \u0018\u00002\u00020\u0001R\"\u0010\t\u001a\u00020\u00028\u0017@\u0017X\u0097\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\u000f\u001a\u00020\n8WX\u0097\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/mypinpad/tsdk/i/setLayerType;", "Lcom/mypinpad/tsdk/i/setWidth;", "", "p0", "Z", "setY", "()Z", "setCompoundDrawableTintBlendMode", "()V", "setDividerPadding", "", "q0", "[B", "setOnFocusChangeListener", "()[B", "setX"}, k = 1, mv = {1, 5, 1})
public abstract class setLayerType implements setWidth {

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static int f59963r0 = 0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public static int f59964s0 = 1;

    /* JADX INFO: renamed from: p0, reason: collision with root package name and from kotlin metadata */
    public boolean setDividerPadding;

    /* JADX INFO: renamed from: q0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final byte[] setX;

    public setLayerType(byte[] bArr, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        z10 = (i10 & 2) != 0 ? false : z10;
        Intrinsics.checkNotNullParameter(bArr, "");
        this.setDividerPadding = z10;
        this.setX = bArr;
    }

    public static /* synthetic */ Object setCompoundDrawableTintBlendMode(Object[] objArr, int i10, int i11, int i12) {
        int i13 = ~i10;
        int i14 = i13 | i11;
        int i15 = (((~i14) | (~(i13 | i12)) | (~(i11 | i12))) * (-754)) + (i11 * (-753)) + (i10 * 755);
        int i16 = ~(i14 | i12);
        int i17 = ~i12;
        int i18 = ((i13 | i17) * 754) + (((~(i10 | i17 | i11)) | i16) * (-754)) + i15;
        if (i18 == 1) {
            setLayerType setlayertype = (setLayerType) objArr[0];
            byte[] bArr = (byte[]) objArr[1];
            int i19 = f59964s0;
            int i20 = (((i19 | 48) << 1) - (48 ^ i19)) - 1;
            f59963r0 = i20 % 128;
            if (i20 % 2 != 0) {
                setWidth.setX.setX(new Object[]{setlayertype, bArr}, -133223628, 133223628, (int) System.currentTimeMillis());
                throw null;
            }
            setWidth.setX.setX(new Object[]{setlayertype, bArr}, -133223628, 133223628, (int) System.currentTimeMillis());
            int i21 = f59964s0;
            int i22 = i21 ^ 81;
            int i23 = ((i21 & 81) | i22) << 1;
            int i24 = -i22;
            int i25 = (i23 & i24) + (i23 | i24);
            f59963r0 = i25 % 128;
            if (i25 % 2 == 0) {
                return null;
            }
            throw null;
        }
        if (i18 == 2) {
            setLayerType setlayertype2 = (setLayerType) objArr[0];
            int i26 = f59963r0;
            int i27 = ((i26 & (-24)) | ((~i26) & 23)) + ((i26 & 23) << 1);
            int i28 = i27 % 128;
            f59964s0 = i28;
            int i29 = i27 % 2;
            boolean z10 = setlayertype2.setDividerPadding;
            if (i29 == 0) {
                int i30 = 48 / 0;
            }
            int i31 = (i28 & 67) + (i28 | 67);
            f59963r0 = i31 % 128;
            int i32 = i31 % 2;
            return Boolean.valueOf(z10);
        }
        if (i18 == 3) {
            setLayerType setlayertype3 = (setLayerType) objArr[0];
            int i33 = f59964s0;
            int i34 = (i33 & 99) + (i33 | 99);
            int i35 = i34 % 128;
            f59963r0 = i35;
            int i36 = i34 % 2;
            setlayertype3.setDividerPadding = true;
            int i37 = (i35 & (-12)) | ((~i35) & 11);
            int i38 = (i35 & 11) << 1;
            int i39 = (i37 & i38) + (i37 | i38);
            f59964s0 = i39 % 128;
            if (i39 % 2 != 0) {
                return null;
            }
            int i40 = 25 / 0;
            return null;
        }
        if (i18 == 4) {
            setLayerType setlayertype4 = (setLayerType) objArr[0];
            int i41 = f59963r0;
            int i42 = i41 & 97;
            int i43 = (i41 | 97) & (~i42);
            int i44 = -(-(i42 << 1));
            int i45 = (i43 ^ i44) + ((i43 & i44) << 1);
            f59964s0 = i45 % 128;
            if (i45 % 2 != 0) {
                return Integer.valueOf(((Integer) setWidth.setX.setX(new Object[]{setlayertype4}, 972262101, -972262100, (int) System.currentTimeMillis())).intValue());
            }
            ((Integer) setWidth.setX.setX(new Object[]{setlayertype4}, 972262101, -972262100, (int) System.currentTimeMillis())).intValue();
            throw null;
        }
        setLayerType setlayertype5 = (setLayerType) objArr[0];
        int i46 = f59964s0;
        int i47 = (((i46 ^ 47) | (i46 & 47)) << 1) - (((~i46) & 47) | (i46 & (-48)));
        f59963r0 = i47 % 128;
        if (i47 % 2 != 0) {
            ((Boolean) setCompoundDrawableTintBlendMode(new Object[]{setlayertype5}, 1723095668, -1723095666, System.identityHashCode(setlayertype5))).booleanValue();
            throw null;
        }
        if (((Boolean) setCompoundDrawableTintBlendMode(new Object[]{setlayertype5}, 1723095668, -1723095666, System.identityHashCode(setlayertype5))).booleanValue()) {
            throw new IllegalStateException();
        }
        byte[] bArr2 = setlayertype5.setX;
        int i48 = f59963r0;
        int i49 = i48 ^ 13;
        int i50 = (((i48 & 13) | i49) << 1) - i49;
        f59964s0 = i50 % 128;
        int i51 = i50 % 2;
        return bArr2;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        int i10 = f59963r0;
        int i11 = i10 ^ 13;
        int i12 = -(-((i10 & 13) << 1));
        int i13 = (i11 ^ i12) + ((i12 & i11) << 1);
        f59964s0 = i13 % 128;
        Object[] objArr = new Object[1];
        if (i13 % 2 != 0) {
            objArr[0] = this;
            setWidth.setX.setX(objArr, 444139552, -444139550, (int) System.currentTimeMillis());
        } else {
            objArr[0] = this;
            setWidth.setX.setX(objArr, 444139552, -444139550, (int) System.currentTimeMillis());
            int i14 = 84 / 0;
        }
    }

    public final int setDividerPadding() {
        return ((Integer) setCompoundDrawableTintBlendMode(new Object[]{this}, 652647922, -652647918, System.identityHashCode(this))).intValue();
    }

    @Override // com.mypinpad.tsdk.isolation.setWidth
    @JvmName(name = "setOnFocusChangeListener")
    @NotNull
    public final byte[] setOnFocusChangeListener() {
        return (byte[]) setCompoundDrawableTintBlendMode(new Object[]{this}, -1034568962, 1034568962, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.setWidth
    @VisibleForTesting
    public final void setX(@NotNull byte[] bArr) {
        setCompoundDrawableTintBlendMode(new Object[]{this, bArr}, -348464105, 348464106, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.setWidth
    @JvmName(name = "setY")
    public final boolean setY() {
        return ((Boolean) setCompoundDrawableTintBlendMode(new Object[]{this}, 1723095668, -1723095666, System.identityHashCode(this))).booleanValue();
    }

    @Override // com.mypinpad.tsdk.isolation.setWidth
    @JvmName(name = "setCompoundDrawableTintBlendMode")
    public final void setCompoundDrawableTintBlendMode() {
        setCompoundDrawableTintBlendMode(new Object[]{this}, 2137117566, -2137117563, System.identityHashCode(this));
    }
}
