package com.mypinpad.tsdk.isolation;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/mypinpad/tsdk/i/ml;", "", "", "p0", "", "setCompoundDrawableTintBlendMode", "(Ljava/lang/String;)V", "<init>", "()V"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class ml {

    @NotNull
    public static final ml INSTANCE = new ml();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f57111a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f57112b = 1;

    static {
        int i10 = f57112b;
        int i11 = ((i10 ^ 64) + ((i10 & 64) << 1)) - 1;
        f57111a = i11 % 128;
        if (i11 % 2 != 0) {
            int i12 = 94 / 0;
        }
    }

    public static /* synthetic */ Object setY(Object[] objArr, int i10, int i11, int i12) {
        String str = (String) objArr[1];
        int i13 = f57111a;
        int i14 = i13 + 84;
        int i15 = (i14 ^ (-1)) + (i14 << 1);
        f57112b = i15 % 128;
        int i16 = i15 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        int i17 = i13 ^ 27;
        int i18 = (i13 & 27) << 1;
        int i19 = ((i17 | i18) << 1) - (i17 ^ i18);
        f57112b = i19 % 128;
        if (i19 % 2 != 0) {
            return null;
        }
        int i20 = 8 / 0;
        return null;
    }

    public final void setCompoundDrawableTintBlendMode(@NotNull String p4) {
        setY(new Object[]{this, p4}, 194155730, -194155730, System.identityHashCode(this));
    }
}
