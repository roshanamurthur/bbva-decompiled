package com.mypinpad.tsdk.isolation;

import androidx.annotation.VisibleForTesting;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0019\n\u0002\b\u0003\b \u0018\u00002\u00020\u0001R\"\u0010\t\u001a\u00020\u00028\u0017@\u0017X\u0097\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\u0007\u001a\u00020\n8WX\u0097\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\r"}, d2 = {"Lcom/mypinpad/tsdk/i/getMessage;", "Lcom/mypinpad/tsdk/i/setPrivateImeOptions;", "", "p0", "Z", "setY", "()Z", "setCompoundDrawableTintBlendMode", "()V", "setX", "", "q0", "[C", "()[C"}, k = 1, mv = {1, 5, 1})
public abstract class getMessage implements setPrivateImeOptions {

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static int f55908r0 = 0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public static int f55909s0 = 1;

    /* JADX INFO: renamed from: p0, reason: collision with root package name and from kotlin metadata */
    public boolean setX;

    /* JADX INFO: renamed from: q0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final char[] setCompoundDrawableTintBlendMode;

    public getMessage(char[] cArr, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        z10 = (i10 & 2) != 0 ? false : z10;
        Intrinsics.checkNotNullParameter(cArr, "");
        this.setX = z10;
        this.setCompoundDrawableTintBlendMode = cArr;
    }

    public static /* synthetic */ Object setX(Object[] objArr, int i10, int i11, int i12) {
        int i13 = (i11 * 949) + (i10 * (-947));
        int i14 = ~i10;
        int i15 = ~i11;
        int i16 = ((i10 | i15) * 948) + ((~((~i12) | i14 | i15)) * (-948)) + (((~(i15 | i12)) | i14) * (-948)) + i13;
        if (i16 == 1) {
            getMessage getmessage = (getMessage) objArr[0];
            int i17 = f55909s0;
            int i18 = (i17 | 53) << 1;
            int i19 = -(((~i17) & 53) | (i17 & (-54)));
            int i20 = (i18 ^ i19) + ((i19 & i18) << 1);
            f55908r0 = i20 % 128;
            int i21 = i20 % 2;
            boolean z10 = getmessage.setX;
            if (i21 == 0) {
                return Boolean.valueOf(z10);
            }
            throw null;
        }
        if (i16 == 2) {
            getMessage getmessage2 = (getMessage) objArr[0];
            int i22 = f55908r0;
            int i23 = (i22 & (-78)) | ((~i22) & 77);
            int i24 = -(-((i22 & 77) << 1));
            int i25 = (i23 & i24) + (i24 | i23);
            f55909s0 = i25 % 128;
            int i26 = i25 % 2;
            if (((Boolean) setX(new Object[]{getmessage2}, -1446164225, 1446164226, System.identityHashCode(getmessage2))).booleanValue()) {
                throw new IllegalStateException();
            }
            char[] cArr = getmessage2.setCompoundDrawableTintBlendMode;
            int i27 = ((-1) << 1) - ((f55908r0 + 18) ^ (-1));
            f55909s0 = i27 % 128;
            int i28 = i27 % 2;
            return cArr;
        }
        if (i16 == 3) {
            getMessage getmessage3 = (getMessage) objArr[0];
            char[] cArr2 = (char[]) objArr[1];
            int i29 = f55909s0;
            int i30 = (-2) - ((-1) ^ ((i29 ^ 96) + ((i29 & 96) << 1)));
            f55908r0 = i30 % 128;
            int i31 = i30 % 2;
            setPrivateImeOptions.setY.setDividerPadding(new Object[]{getmessage3, cArr2}, -1264263145, 1264263145, (int) System.currentTimeMillis());
            int i32 = f55908r0 + 99;
            f55909s0 = i32 % 128;
            if (i32 % 2 != 0) {
                return null;
            }
            throw null;
        }
        getMessage getmessage4 = (getMessage) objArr[0];
        int i33 = f55909s0;
        int i34 = (i33 ^ 39) + ((i33 & 39) << 1);
        int i35 = i34 % 128;
        f55908r0 = i35;
        int i36 = i34 % 2;
        getmessage4.setX = true;
        int i37 = i35 & 93;
        int i38 = i35 | 93;
        int i39 = (i37 & i38) + (i37 | i38);
        f55909s0 = i39 % 128;
        if (i39 % 2 != 0) {
            return null;
        }
        int i40 = 51 / 0;
        return null;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        int i10 = f55909s0;
        int i11 = (i10 & (-56)) | ((~i10) & 55);
        int i12 = -(-((i10 & 55) << 1));
        int i13 = (i11 ^ i12) + ((i12 & i11) << 1);
        f55908r0 = i13 % 128;
        int i14 = i13 % 2;
        setPrivateImeOptions.setY.setDividerPadding(new Object[]{this}, -1381812867, 1381812868, (int) System.currentTimeMillis());
        int i15 = f55908r0;
        int i16 = (i15 ^ 105) + ((i15 & 105) << 1);
        f55909s0 = i16 % 128;
        if (i16 % 2 == 0) {
            int i17 = 42 / 0;
        }
    }

    @Override // com.mypinpad.tsdk.isolation.setPrivateImeOptions
    @VisibleForTesting
    public final void setCompoundDrawableTintBlendMode(@NotNull char[] cArr) {
        setX(new Object[]{this, cArr}, -1149638216, 1149638219, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.setPrivateImeOptions
    @JvmName(name = "setY")
    public final boolean setY() {
        return ((Boolean) setX(new Object[]{this}, -1446164225, 1446164226, System.identityHashCode(this))).booleanValue();
    }

    @Override // com.mypinpad.tsdk.isolation.setPrivateImeOptions
    @JvmName(name = "setCompoundDrawableTintBlendMode")
    public final void setCompoundDrawableTintBlendMode() {
        setX(new Object[]{this}, -1517917367, 1517917367, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.setPrivateImeOptions
    @JvmName(name = "setX")
    @NotNull
    public final char[] setX() {
        return (char[]) setX(new Object[]{this}, 82316430, -82316428, System.identityHashCode(this));
    }
}
