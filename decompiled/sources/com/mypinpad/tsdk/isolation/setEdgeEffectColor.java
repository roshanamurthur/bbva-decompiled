package com.mypinpad.tsdk.isolation;

import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u000f\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0007\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/mypinpad/tsdk/i/setEdgeEffectColor;", "Lcom/mypinpad/tsdk/i/component9;", "", "a", "Ljava/lang/String;", "setY", "()Ljava/lang/String;", "setOnFocusChangeListener", "p0", "<init>", "(Ljava/lang/String;)V", "setDividerPadding"}, k = 1, mv = {1, 5, 1})
public final class setEdgeEffectColor extends component9 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f59642b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int f59643c = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String setOnFocusChangeListener;

    static {
        int i10 = f59643c;
        int i11 = i10 & 69;
        int i12 = i11 + ((i10 ^ 69) | i11);
        f59642b = i12 % 128;
        int i13 = i12 % 2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public setEdgeEffectColor(@NotNull String str) {
        super(null);
        Intrinsics.checkNotNullParameter(str, "");
        this.setOnFocusChangeListener = str;
        getPinPadLandscape.setY(new Object[]{str}, 165764303, -165764303, (int) System.currentTimeMillis());
        setCompoundDrawableTintBlendMode(new Object[]{this}, 262312484, -262312483, System.identityHashCode(this));
    }

    public static /* synthetic */ Object setCompoundDrawableTintBlendMode(Object[] objArr, int i10, int i11, int i12) {
        int i13 = (i11 * 971) + (i10 * (-1939));
        int i14 = ~i11;
        int i15 = ~(i14 | i10);
        int i16 = ~((~i12) | i11);
        int i17 = ~i10;
        int i18 = (~(i11 | i17)) * 1940;
        int i19 = (((~(i17 | i14)) | i16) * 970) + i18 + ((i15 | i16) * (-970)) + i13;
        int i20 = f59642b;
        if (i19 != 1) {
            setEdgeEffectColor setedgeeffectcolor = (setEdgeEffectColor) objArr[0];
            int i21 = ((i20 & (-26)) | ((~i20) & 25)) + ((i20 & 25) << 1);
            f59643c = i21 % 128;
            if (i21 % 2 != 0) {
                return setedgeeffectcolor.setOnFocusChangeListener;
            }
            String str = setedgeeffectcolor.setOnFocusChangeListener;
            throw null;
        }
        setEdgeEffectColor setedgeeffectcolor2 = (setEdgeEffectColor) objArr[0];
        int i22 = i20 + 5;
        f59643c = i22 % 128;
        int i23 = i22 % 2;
        if (setedgeeffectcolor2.setOnFocusChangeListener.length() != 10) {
            throw new setIndeterminateDrawable(1005, setedgeeffectcolor2.setOnFocusChangeListener, null, 4, null);
        }
        int i24 = i20 & 93;
        int i25 = (~i24) & (i20 | 93);
        int i26 = i24 << 1;
        int i27 = ((i25 | i26) << 1) - (i26 ^ i25);
        f59643c = i27 % 128;
        if (i27 % 2 != 0) {
            return null;
        }
        throw null;
    }

    @JvmName(name = "setY")
    @NotNull
    public final String setY() {
        return (String) setCompoundDrawableTintBlendMode(new Object[]{this}, -304488956, 304488956, System.identityHashCode(this));
    }
}
