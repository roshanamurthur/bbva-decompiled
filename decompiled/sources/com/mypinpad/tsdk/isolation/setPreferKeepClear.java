package com.mypinpad.tsdk.isolation;

import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0003\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bR\u001c\u0010\u0011\u001a\u0004\u0018\u00010\f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010"}, d2 = {"Lcom/mypinpad/tsdk/i/setPreferKeepClear;", "", "", "toString", "()Ljava/lang/String;", "", GenerateActivationFormCommand.HASH_CODE, "()I", "p0", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/mypinpad/tsdk/i/l;", "a", "Lcom/mypinpad/tsdk/i/l;", "setDividerPadding", "()Lcom/mypinpad/tsdk/i/l;", "setOnFocusChangeListener", "<init>", "(Lcom/mypinpad/tsdk/i/l;)V"}, k = 1, mv = {1, 5, 1})
public final /* data */ class setPreferKeepClear {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f60330b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int f60331c = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final l setOnFocusChangeListener;

    public setPreferKeepClear(@Nullable l lVar) {
        this.setOnFocusChangeListener = lVar;
    }

    public static /* synthetic */ Object setY(Object[] objArr, int i10, int i11, int i12) {
        int i13 = ~i11;
        int i14 = (((~i10) | i13) * 824) + ((i11 | i10) * (-1648)) + ((i10 | i13) * (-824)) + (i11 * 825) + (i10 * 1649);
        boolean z10 = false;
        if (i14 == 1) {
            setPreferKeepClear setpreferkeepclear = (setPreferKeepClear) objArr[0];
            int i15 = f60330b;
            int i16 = ((i15 ^ 98) + ((i15 & 98) << 1)) - 1;
            int i17 = i16 % 128;
            f60331c = i17;
            int i18 = i16 % 2;
            l lVar = setpreferkeepclear.setOnFocusChangeListener;
            int i19 = i17 & 27;
            int i20 = i19 + ((i17 ^ 27) | i19);
            f60330b = i20 % 128;
            if (i20 % 2 == 0) {
                return lVar;
            }
            int i21 = 3 / 0;
            return lVar;
        }
        if (i14 != 2) {
            if (i14 != 3) {
                int i22 = f60331c;
                int i23 = i22 & 59;
                int i24 = (i22 | 59) & (~i23);
                int i25 = i23 << 1;
                int i26 = (i24 ^ i25) + ((i24 & i25) << 1);
                int i27 = i26 % 128;
                f60330b = i27;
                int i28 = i26 % 2;
                int i29 = (i27 & 94) + (i27 | 94);
                int i30 = (i29 ^ (-1)) + (i29 << 1);
                f60331c = i30 % 128;
                if (i30 % 2 != 0) {
                    return "PAR";
                }
                throw null;
            }
            setPreferKeepClear setpreferkeepclear2 = (setPreferKeepClear) objArr[0];
            int i31 = f60331c;
            int i32 = i31 | 95;
            int i33 = (i32 << 1) - ((~(i31 & 95)) & i32);
            int i34 = i33 % 128;
            f60330b = i34;
            int i35 = i33 % 2;
            l lVar2 = setpreferkeepclear2.setOnFocusChangeListener;
            if (i35 != 0) {
                throw null;
            }
            if (lVar2 == null) {
                int i36 = i34 & 67;
                int i37 = ((((i34 ^ 67) | i36) << 1) - (~(-((i34 | 67) & (~i36))))) - 1;
                f60331c = i37 % 128;
                if (i37 % 2 != 0) {
                    return 0;
                }
                throw null;
            }
            int iHashCode = lVar2.hashCode();
            int i38 = f60331c;
            int i39 = (((i38 | 52) << 1) - (i38 ^ 52)) - 1;
            f60330b = i39 % 128;
            if (i39 % 2 == 0) {
                return Integer.valueOf(iHashCode);
            }
            throw null;
        }
        setPreferKeepClear setpreferkeepclear3 = (setPreferKeepClear) objArr[0];
        Object obj = objArr[1];
        int i40 = f60331c;
        int i41 = i40 + 15;
        int i42 = i41 % 128;
        f60330b = i42;
        int i43 = i41 % 2;
        if (setpreferkeepclear3 != obj) {
            if (!(obj instanceof setPreferKeepClear)) {
                int i44 = (i42 & (-92)) | ((~i42) & 91);
                int i45 = -(-((i42 & 91) << 1));
                int i46 = (i44 ^ i45) + ((i44 & i45) << 1);
                f60331c = i46 % 128;
                if (i46 % 2 == 0) {
                    z10 = true;
                }
            } else if (!(!Intrinsics.areEqual(setpreferkeepclear3.setOnFocusChangeListener, ((setPreferKeepClear) obj).setOnFocusChangeListener))) {
                int i47 = f60331c;
                int i48 = i47 & 41;
                int i49 = (((i47 | 41) & (~i48)) - (~(-(-(i48 << 1))))) - 1;
                f60330b = i49 % 128;
                int i50 = i49 % 2;
            } else {
                int i51 = f60330b;
                int i52 = i51 & 81;
                int i53 = (i51 ^ 81) | i52;
                int i54 = (i52 & i53) + (i53 | i52);
                int i55 = i54 % 128;
                f60331c = i55;
                z10 = i54 % 2 == 0;
                int i56 = i55 + 35;
                f60330b = i56 % 128;
                int i57 = i56 % 2;
            }
            return Boolean.valueOf(z10);
        }
        int i58 = i40 & 19;
        int i59 = i40 | 19;
        int i60 = (i58 ^ i59) + ((i58 & i59) << 1);
        f60330b = i60 % 128;
        int i61 = i60 % 2;
        int i62 = i40 + 123;
        f60330b = i62 % 128;
        if (i62 % 2 != 0) {
            throw null;
        }
        return Boolean.TRUE;
    }

    public final boolean equals(@Nullable Object p4) {
        return ((Boolean) setY(new Object[]{this, p4}, 2043997564, -2043997562, System.identityHashCode(this))).booleanValue();
    }

    public final int hashCode() {
        return ((Integer) setY(new Object[]{this}, -1876074865, 1876074868, System.identityHashCode(this))).intValue();
    }

    @JvmName(name = "setDividerPadding")
    @Nullable
    public final l setDividerPadding() {
        return (l) setY(new Object[]{this}, 1306238022, -1306238021, System.identityHashCode(this));
    }

    @NotNull
    public final String toString() {
        return (String) setY(new Object[]{this}, 210065676, -210065676, System.identityHashCode(this));
    }

    public /* synthetic */ setPreferKeepClear(l lVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : lVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public setPreferKeepClear() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
