package com.mypinpad.tsdk.isolation;

import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\t\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007B!\u0012\u0006\u0010\u0012\u001a\u00020\u0002\u0012\u0006\u0010\u0013\u001a\u00020\b\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0007\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\f\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\u000bR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\r8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011"}, d2 = {"Lcom/mypinpad/tsdk/i/setTextCursorDrawable;", "Lcom/mypinpad/tsdk/i/component9;", "", "a", "Z", "setCompoundDrawableTintBlendMode", "()Z", "setOnFocusChangeListener", "", "b", "Ljava/lang/String;", "()Ljava/lang/String;", "setX", "", "c", "Ljava/lang/Long;", "setDividerPadding", "()Ljava/lang/Long;", "p0", "p1", "p2", "<init>", "(ZLjava/lang/String;Ljava/lang/Long;)V"}, k = 1, mv = {1, 5, 1})
public final class setTextCursorDrawable extends component9 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static int f60655d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static int f60656e = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final boolean setOnFocusChangeListener;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String setX;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final Long setDividerPadding;

    static {
        int i10 = f60656e;
        int i11 = (i10 & 104) + (i10 | 104);
        int i12 = (i11 ^ (-1)) + (i11 << 1);
        f60655d = i12 % 128;
        if (i12 % 2 != 0) {
            int i13 = 7 / 0;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public setTextCursorDrawable(boolean z10, @NotNull String str, @Nullable Long l6) {
        super(null);
        Intrinsics.checkNotNullParameter(str, "");
        this.setOnFocusChangeListener = z10;
        this.setX = str;
        this.setDividerPadding = l6;
        getPinPadLandscape.setY(new Object[]{str}, 165764303, -165764303, (int) System.currentTimeMillis());
        setCompoundDrawableTintBlendMode(new Object[]{this}, -201055275, 201055277, System.identityHashCode(this));
    }

    public static /* synthetic */ Object setCompoundDrawableTintBlendMode(Object[] objArr, int i10, int i11, int i12) {
        int i13 = ~i12;
        int i14 = ((i10 | i12) * 164) + (((~(i13 | i11)) | i10) * (-328)) + (i11 * (-163)) + (i10 * 165);
        int i15 = ~i10;
        int i16 = ~i11;
        int i17 = (((~(i10 | i13 | i11)) | (~(i12 | i16)) | (~(i15 | i16))) * 164) + i14;
        if (i17 == 1) {
            setTextCursorDrawable settextcursordrawable = (setTextCursorDrawable) objArr[0];
            int i18 = (-2) - ((f60655d + 92) ^ (-1));
            f60656e = i18 % 128;
            int i19 = i18 % 2;
            boolean z10 = settextcursordrawable.setOnFocusChangeListener;
            if (i19 != 0) {
                return Boolean.valueOf(z10);
            }
            throw null;
        }
        if (i17 == 2) {
            setTextCursorDrawable settextcursordrawable2 = (setTextCursorDrawable) objArr[0];
            int i20 = f60656e;
            int i21 = ((i20 ^ 71) | (i20 & 71)) << 1;
            int i22 = -(((~i20) & 71) | (i20 & (-72)));
            int i23 = (i21 & i22) + (i22 | i21);
            f60655d = i23 % 128;
            if (i23 % 2 == 0 ? settextcursordrawable2.setX.length() != 10 : settextcursordrawable2.setX.length() != 84) {
                throw new setIndeterminateDrawable(1005, settextcursordrawable2.setX, null, 4, null);
            }
            int i24 = f60656e;
            int i25 = (((i24 ^ 121) | (i24 & 121)) << 1) - (((~i24) & 121) | (i24 & (-122)));
            f60655d = i25 % 128;
            int i26 = i25 % 2;
            return null;
        }
        if (i17 == 3) {
            setTextCursorDrawable settextcursordrawable3 = (setTextCursorDrawable) objArr[0];
            int i27 = f60655d;
            int i28 = i27 + 51;
            f60656e = i28 % 128;
            int i29 = i28 % 2;
            String str = settextcursordrawable3.setX;
            int i30 = ((i27 | 23) << 1) - (i27 ^ 23);
            f60656e = i30 % 128;
            if (i30 % 2 != 0) {
                return str;
            }
            throw null;
        }
        setTextCursorDrawable settextcursordrawable4 = (setTextCursorDrawable) objArr[0];
        int i31 = f60655d;
        int i32 = i31 ^ 35;
        int i33 = ((i31 & 35) | i32) << 1;
        int i34 = -i32;
        int i35 = ((i33 | i34) << 1) - (i33 ^ i34);
        int i36 = i35 % 128;
        f60656e = i36;
        int i37 = i35 % 2;
        Long l6 = settextcursordrawable4.setDividerPadding;
        int i38 = i36 & 103;
        int i39 = ((((i36 ^ 103) | i38) << 1) - (~(-((i36 | 103) & (~i38))))) - 1;
        f60655d = i39 % 128;
        int i40 = i39 % 2;
        return l6;
    }

    @JvmName(name = "setDividerPadding")
    @Nullable
    public final Long setDividerPadding() {
        return (Long) setCompoundDrawableTintBlendMode(new Object[]{this}, 1127438340, -1127438340, System.identityHashCode(this));
    }

    @JvmName(name = "setOnFocusChangeListener")
    @NotNull
    public final String setOnFocusChangeListener() {
        return (String) setCompoundDrawableTintBlendMode(new Object[]{this}, -69742332, 69742335, System.identityHashCode(this));
    }

    @JvmName(name = "setCompoundDrawableTintBlendMode")
    public final boolean setCompoundDrawableTintBlendMode() {
        return ((Boolean) setCompoundDrawableTintBlendMode(new Object[]{this}, 1016853657, -1016853656, System.identityHashCode(this))).booleanValue();
    }
}
