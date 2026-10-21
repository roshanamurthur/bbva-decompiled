package com.mypinpad.tsdk.isolation;

import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\n\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u0005\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001a\u0004\b\b\u0010\u0006"}, d2 = {"Lcom/mypinpad/tsdk/i/component4;", "", "", "a", "Ljava/lang/String;", "setX", "()Ljava/lang/String;", "b", "setCompoundDrawableTintBlendMode", "p0", "p1", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V"}, k = 1, mv = {1, 5, 1})
public final class component4 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int f54967c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static int f54968d = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String setX;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final String setCompoundDrawableTintBlendMode;

    public component4(@NotNull String str, @Nullable String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        this.setX = str;
        this.setCompoundDrawableTintBlendMode = str2;
        getPinPadLandscape.setY(new Object[]{str}, -1901136937, 1901136939, (int) System.currentTimeMillis());
    }

    public static /* synthetic */ Object setX(Object[] objArr, int i10, int i11, int i12) {
        int i13 = ((i10 | i11) * (-366)) + (i11 * 367) + (i10 * 367);
        int i14 = ~i11;
        if ((((~(i10 | i14 | i12)) | (~(i11 | (~i10)))) * 366) + (((~(i14 | i12)) | i10) * (-366)) + i13 == 1) {
            component4 component4Var = (component4) objArr[0];
            int i15 = f54967c;
            int i16 = (i15 ^ 19) + ((i15 & 19) << 1);
            f54968d = i16 % 128;
            int i17 = i16 % 2;
            String str = component4Var.setCompoundDrawableTintBlendMode;
            if (i17 != 0) {
                return str;
            }
            throw null;
        }
        component4 component4Var2 = (component4) objArr[0];
        int i18 = f54968d;
        int i19 = i18 + 121;
        f54967c = i19 % 128;
        int i20 = i19 % 2;
        String str2 = component4Var2.setX;
        int i21 = (i18 & 35) + (i18 | 35);
        f54967c = i21 % 128;
        int i22 = i21 % 2;
        return str2;
    }

    @JvmName(name = "setCompoundDrawableTintBlendMode")
    @Nullable
    public final String setCompoundDrawableTintBlendMode() {
        return (String) setX(new Object[]{this}, 2069738297, -2069738296, System.identityHashCode(this));
    }

    @JvmName(name = "setX")
    @NotNull
    public final String setX() {
        return (String) setX(new Object[]{this}, 2053087812, -2053087812, System.identityHashCode(this));
    }
}
