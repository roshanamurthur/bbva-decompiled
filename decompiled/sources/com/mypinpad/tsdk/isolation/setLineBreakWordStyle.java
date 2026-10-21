package com.mypinpad.tsdk.isolation;

import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0012\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001R\u001a\u0010\u0007\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0005\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\u0007\u0010\u0006R\u001a\u0010\u000b\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0004\u001a\u0004\b\n\u0010\u0006R\u001a\u0010\u000e\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0004\u001a\u0004\b\r\u0010\u0006R\u001a\u0010\n\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0004\u001a\u0004\b\u000b\u0010\u0006R\u001a\u0010\r\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0004\u001a\u0004\b\u0011\u0010\u0006\u0082\u0001\u0002\u0012\u0013"}, d2 = {"Lcom/mypinpad/tsdk/i/setLineBreakWordStyle;", "", "", "a", "[B", "setY", "()[B", "setOnFocusChangeListener", "b", "c", "setCompoundDrawableTintBlendMode", "setDividerPadding", "d", "setX", "setLayoutAnimation", "e", "f", "setOnDragListener", "Lcom/mypinpad/tsdk/i/setOnKeyListener;", "Lcom/mypinpad/tsdk/i/setWillNotDraw;"}, k = 1, mv = {1, 5, 1})
public abstract class setLineBreakWordStyle {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static int f59984g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static int f59985h = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final byte[] setOnFocusChangeListener;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final byte[] setY;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final byte[] setDividerPadding;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final byte[] setLayoutAnimation;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final byte[] setCompoundDrawableTintBlendMode;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final byte[] setX;

    public setLineBreakWordStyle(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5, byte[] bArr6, DefaultConstructorMarker defaultConstructorMarker) {
        this.setOnFocusChangeListener = bArr;
        this.setY = bArr2;
        this.setDividerPadding = bArr3;
        this.setLayoutAnimation = bArr4;
        this.setCompoundDrawableTintBlendMode = bArr5;
        this.setX = bArr6;
    }

    public static /* synthetic */ Object setDividerPadding(Object[] objArr, int i10, int i11, int i12) {
        int i13 = (i11 * (-500)) + (i10 * (-500));
        int i14 = ~i11;
        int i15 = ~(i14 | i10);
        int i16 = ~i10;
        int i17 = ((~(i16 | (~i12) | i11)) * 501) + ((~(i14 | i16)) * 1002) + ((i15 | (~(i16 | i11 | i12))) * 501) + i13;
        if (i17 == 1) {
            setLineBreakWordStyle setlinebreakwordstyle = (setLineBreakWordStyle) objArr[0];
            int i18 = f59985h;
            int i19 = ((i18 ^ 5) | (i18 & 5)) << 1;
            int i20 = -((5 & (~i18)) | (i18 & (-6)));
            int i21 = (i19 ^ i20) + ((i20 & i19) << 1);
            f59984g = i21 % 128;
            int i22 = i21 % 2;
            byte[] bArr = setlinebreakwordstyle.setX;
            int i23 = (i18 & (-76)) | ((~i18) & 75);
            int i24 = -(-((i18 & 75) << 1));
            int i25 = (i23 & i24) + (i24 | i23);
            f59984g = i25 % 128;
            int i26 = i25 % 2;
            return bArr;
        }
        if (i17 == 2) {
            setLineBreakWordStyle setlinebreakwordstyle2 = (setLineBreakWordStyle) objArr[0];
            int i27 = f59984g;
            int i28 = i27 & 29;
            int i29 = i27 | 29;
            int i30 = (i28 ^ i29) + ((i29 & i28) << 1);
            f59985h = i30 % 128;
            int i31 = i30 % 2;
            byte[] bArr2 = setlinebreakwordstyle2.setLayoutAnimation;
            if (i31 != 0) {
                return bArr2;
            }
            throw null;
        }
        if (i17 == 3) {
            setLineBreakWordStyle setlinebreakwordstyle3 = (setLineBreakWordStyle) objArr[0];
            int i32 = f59985h + 51;
            f59984g = i32 % 128;
            int i33 = i32 % 2;
            byte[] bArr3 = setlinebreakwordstyle3.setOnFocusChangeListener;
            if (i33 == 0) {
                return bArr3;
            }
            int i34 = 58 / 0;
            return bArr3;
        }
        if (i17 == 4) {
            setLineBreakWordStyle setlinebreakwordstyle4 = (setLineBreakWordStyle) objArr[0];
            int i35 = f59984g;
            int i36 = i35 & 65;
            int i37 = -(-((i35 ^ 65) | i36));
            int i38 = ((i36 | i37) << 1) - (i37 ^ i36);
            int i39 = i38 % 128;
            f59985h = i39;
            int i40 = i38 % 2;
            byte[] bArr4 = setlinebreakwordstyle4.setY;
            if (i40 == 0) {
                throw null;
            }
            int i41 = i39 & 107;
            int i42 = (i39 ^ 107) | i41;
            int i43 = ((i41 | i42) << 1) - (i42 ^ i41);
            f59984g = i43 % 128;
            if (i43 % 2 == 0) {
                return bArr4;
            }
            int i44 = 62 / 0;
            return bArr4;
        }
        if (i17 != 5) {
            setLineBreakWordStyle setlinebreakwordstyle5 = (setLineBreakWordStyle) objArr[0];
            int i45 = f59985h;
            int i46 = i45 ^ 65;
            int i47 = ((i45 & 65) | i46) << 1;
            int i48 = -i46;
            int i49 = ((i47 | i48) << 1) - (i48 ^ i47);
            f59984g = i49 % 128;
            int i50 = i49 % 2;
            byte[] bArr5 = setlinebreakwordstyle5.setDividerPadding;
            int i51 = i45 & 35;
            int i52 = (i45 | 35) & (~i51);
            int i53 = -(-(i51 << 1));
            int i54 = ((i52 | i53) << 1) - (i52 ^ i53);
            f59984g = i54 % 128;
            if (i54 % 2 == 0) {
                return bArr5;
            }
            throw null;
        }
        setLineBreakWordStyle setlinebreakwordstyle6 = (setLineBreakWordStyle) objArr[0];
        int i55 = f59985h;
        int i56 = i55 & 91;
        int i57 = i55 | 91;
        int i58 = ((i56 | i57) << 1) - (i57 ^ i56);
        int i59 = i58 % 128;
        f59984g = i59;
        int i60 = i58 % 2;
        byte[] bArr6 = setlinebreakwordstyle6.setCompoundDrawableTintBlendMode;
        int i61 = i59 & 3;
        int i62 = (((i59 ^ 3) | i61) << 1) - ((i59 | 3) & (~i61));
        f59985h = i62 % 128;
        if (i62 % 2 != 0) {
            return bArr6;
        }
        int i63 = 56 / 0;
        return bArr6;
    }

    @JvmName(name = "setCompoundDrawableTintBlendMode")
    @NotNull
    public final byte[] setCompoundDrawableTintBlendMode() {
        return (byte[]) setDividerPadding(new Object[]{this}, 1983093524, -1983093524, System.identityHashCode(this));
    }

    @JvmName(name = "setOnDragListener")
    @NotNull
    public final byte[] setOnDragListener() {
        return (byte[]) setDividerPadding(new Object[]{this}, -2041063060, 2041063061, System.identityHashCode(this));
    }

    @JvmName(name = "setOnFocusChangeListener")
    @NotNull
    public final byte[] setOnFocusChangeListener() {
        return (byte[]) setDividerPadding(new Object[]{this}, 1068036593, -1068036589, System.identityHashCode(this));
    }

    @JvmName(name = "setX")
    @NotNull
    public final byte[] setX() {
        return (byte[]) setDividerPadding(new Object[]{this}, 2030043801, -2030043799, System.identityHashCode(this));
    }

    @JvmName(name = "setY")
    @NotNull
    public final byte[] setY() {
        return (byte[]) setDividerPadding(new Object[]{this}, 218655140, -218655137, System.identityHashCode(this));
    }

    @JvmName(name = "setDividerPadding")
    @NotNull
    public final byte[] setDividerPadding() {
        return (byte[]) setDividerPadding(new Object[]{this}, 1837279069, -1837279064, System.identityHashCode(this));
    }
}
