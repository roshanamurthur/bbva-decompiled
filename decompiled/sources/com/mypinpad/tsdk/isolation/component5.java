package com.mypinpad.tsdk.isolation;

import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u000f\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0007\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/mypinpad/tsdk/i/component5;", "Lcom/mypinpad/tsdk/i/component9;", "", "a", "Ljava/lang/String;", "setOnFocusChangeListener", "()Ljava/lang/String;", "setCompoundDrawableTintBlendMode", "p0", "<init>", "(Ljava/lang/String;)V", "setY"}, k = 1, mv = {1, 5, 1})
public final class component5 extends component9 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f54971b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int f54972c = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String setCompoundDrawableTintBlendMode;

    static {
        int i10 = ((-1) << 1) - ((f54971b + 20) ^ (-1));
        f54972c = i10 % 128;
        int i11 = i10 % 2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public component5(@NotNull String str) {
        super(null);
        Intrinsics.checkNotNullParameter(str, "");
        this.setCompoundDrawableTintBlendMode = str;
        getPinPadLandscape.setY(new Object[]{str}, 165764303, -165764303, (int) System.currentTimeMillis());
        setOnFocusChangeListener(new Object[]{this}, 1731515915, -1731515914, System.identityHashCode(this));
    }

    public static /* synthetic */ Object setOnFocusChangeListener(Object[] objArr, int i10, int i11, int i12) {
        if ((((~(i10 | i12)) | (~(i11 | (~i12)))) * 627) + (((~((~i11) | i12)) | i10) * (-627)) + ((i11 | i12 | (~i10)) * (-627)) + (i11 * 628) + (i10 * 628) != 1) {
            component5 component5Var = (component5) objArr[0];
            int i13 = f54971b;
            int i14 = i13 & 117;
            int i15 = (i13 ^ 117) | i14;
            int i16 = ((i14 | i15) << 1) - (i14 ^ i15);
            f54972c = i16 % 128;
            int i17 = i16 % 2;
            String str = component5Var.setCompoundDrawableTintBlendMode;
            int i18 = i13 ^ 67;
            int i19 = (((i13 & 67) | i18) << 1) - i18;
            f54972c = i19 % 128;
            if (i19 % 2 != 0) {
                return str;
            }
            throw null;
        }
        component5 component5Var2 = (component5) objArr[0];
        int i20 = f54972c;
        int i21 = i20 & 29;
        int i22 = (i20 | 29) & (~i21);
        int i23 = -(-(i21 << 1));
        int i24 = (i22 & i23) + (i22 | i23);
        f54971b = i24 % 128;
        int i25 = i24 % 2;
        if (component5Var2.setCompoundDrawableTintBlendMode.length() != 10) {
            throw new setIndeterminateDrawable(1005, component5Var2.setCompoundDrawableTintBlendMode, null, 4, null);
        }
        int i26 = f54972c + 75;
        f54971b = i26 % 128;
        int i27 = i26 % 2;
        return null;
    }

    @JvmName(name = "setOnFocusChangeListener")
    @NotNull
    public final String setOnFocusChangeListener() {
        return (String) setOnFocusChangeListener(new Object[]{this}, 2005816493, -2005816493, System.identityHashCode(this));
    }
}
