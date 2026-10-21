package com.mypinpad.tsdk.isolation;

import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0007\u001a\u00020\u00028\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\r\u001a\u0004\u0018\u00010\b8\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/mypinpad/tsdk/i/to;", "Lcom/mypinpad/tsdk/i/rh;", "Lcom/mypinpad/tsdk/i/rk;", "a", "Lcom/mypinpad/tsdk/i/rk;", "setOnFocusChangeListener", "()Lcom/mypinpad/tsdk/i/rk;", "setCompoundDrawableTintBlendMode", "Lcom/mypinpad/tsdk/i/qw;", "b", "Lcom/mypinpad/tsdk/i/qw;", "setDividerPadding", "()Lcom/mypinpad/tsdk/i/qw;", "setY", "p0", "p1", "<init>", "(Lcom/mypinpad/tsdk/i/rk;Lcom/mypinpad/tsdk/i/qw;)V"}, k = 1, mv = {1, 8, 0})
public final class to implements rh {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int f61180c = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final rk setCompoundDrawableTintBlendMode;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final qw setY;

    public to(@NotNull rk rkVar, @Nullable qw qwVar) {
        Intrinsics.checkNotNullParameter(rkVar, "");
        this.setCompoundDrawableTintBlendMode = rkVar;
        this.setY = qwVar;
    }

    public static /* synthetic */ Object setOnFocusChangeListener(Object[] objArr, int i10, int i11, int i12) {
        Object obj;
        int i13 = ~i10;
        int i14 = ~i11;
        if (((i10 | i12) * 104) + ((~(i11 | (~i12) | i10)) * (-104)) + (((~(i13 | i14)) | (~(i14 | i12))) * 104) + (i11 * (-103)) + (i10 * (-103)) != 1) {
            to toVar = (to) objArr[0];
            int i15 = f61180c;
            int i16 = i15 & 51;
            int i17 = ((i15 ^ 51) | i16) << 1;
            int i18 = -((i15 | 51) & (~i16));
            int i19 = (i17 & i18) + (i18 | i17);
            int i20 = i19 % 128;
            int i21 = i19 % 2;
            obj = toVar.setCompoundDrawableTintBlendMode;
            if (i21 != 0) {
                throw null;
            }
            int i22 = i20 & 101;
            int i23 = (i20 ^ 101) | i22;
            int i24 = ((i22 | i23) << 1) - (i23 ^ i22);
            f61180c = i24 % 128;
            int i25 = i24 % 2;
        } else {
            to toVar2 = (to) objArr[0];
            int i26 = f61180c;
            int i27 = ((i26 ^ 116) + ((i26 & 116) << 1)) - 1;
            int i28 = i27 % 128;
            int i29 = i27 % 2;
            obj = toVar2.setY;
            int i30 = ((i26 ^ 37) | (i26 & 37)) << 1;
            int i31 = -(((~i26) & 37) | (i26 & (-38)));
            int i32 = (i30 & i31) + (i31 | i30);
            int i33 = i32 % 128;
            if (i32 % 2 != 0) {
                throw null;
            }
        }
        return obj;
    }

    @Override // com.mypinpad.tsdk.isolation.rh
    @JvmName(name = "setDividerPadding")
    @Nullable
    public final qw setDividerPadding() {
        return (qw) setOnFocusChangeListener(new Object[]{this}, -468190216, 468190217, System.identityHashCode(this));
    }

    public /* synthetic */ to(rk rkVar, qw qwVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(rkVar, (i10 & 2) != 0 ? null : qwVar);
    }

    @Override // com.mypinpad.tsdk.isolation.rh
    @JvmName(name = "setOnFocusChangeListener")
    @NotNull
    public final rk setOnFocusChangeListener() {
        return (rk) setOnFocusChangeListener(new Object[]{this}, -1344533808, 1344533808, System.identityHashCode(this));
    }
}
