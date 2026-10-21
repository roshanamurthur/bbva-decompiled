package com.mypinpad.tsdk.isolation;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000e\b&\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0006\u001a\u00020\n\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u0010¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0017¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u000f\u001a\u00020\n8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\b\u0010\fR\u0017\u0010\u0003\u001a\u00020\u00108\u0007¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00058\u0001X\u0081\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u000f\u0010\u0017R\"\u0010\u001a\u001a\u00020\u00028\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u0004\"\u0004\b\u001a\u0010\u001b"}, d2 = {"Lcom/mypinpad/tsdk/i/zb;", "", "", "setY", "()J", "Lcom/mypinpad/tsdk/i/ze;", "p0", "", "setX", "(Lcom/mypinpad/tsdk/i/ze;)V", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "setOnFocusChangeListener", "", "b", "Z", "setDividerPadding", "()Z", "c", "Lcom/mypinpad/tsdk/i/ze;", "()Lcom/mypinpad/tsdk/i/ze;", "d", "J", "setCompoundDrawableTintBlendMode", "(J)V", "p1", "<init>", "(Ljava/lang/String;Z)V"}, k = 1, mv = {1, 6, 0})
public abstract class zb {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static int f62299e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static int f62300f = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String setOnFocusChangeListener;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final boolean setY;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public ze setDividerPadding;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public long setCompoundDrawableTintBlendMode;

    public zb(@NotNull String str, boolean z10) {
        Intrinsics.checkNotNullParameter(str, "");
        this.setOnFocusChangeListener = str;
        this.setY = z10;
        this.setCompoundDrawableTintBlendMode = -1L;
    }

    public static /* synthetic */ Object setCompoundDrawableTintBlendMode(Object[] objArr, int i10, int i11, int i12) {
        int i13 = ((~(i11 | i12)) * TypedValues.CycleType.TYPE_EASING) + (i11 * 421) + (i10 * (-419));
        int i14 = ~i10;
        int i15 = (((~(i14 | (~i11))) | (~(i11 | (~i12)))) * TypedValues.CycleType.TYPE_EASING) + ((i11 | i14) * (-420)) + i13;
        if (i15 == 1) {
            zb zbVar = (zb) objArr[0];
            long jLongValue = ((Number) objArr[1]).longValue();
            int i16 = f62299e;
            int i17 = i16 + 9;
            f62300f = i17 % 128;
            int i18 = i17 % 2;
            zbVar.setCompoundDrawableTintBlendMode = jLongValue;
            if (i18 == 0) {
                throw null;
            }
            int i19 = (i16 & 83) + (i16 | 83);
            f62300f = i19 % 128;
            if (i19 % 2 != 0) {
                return null;
            }
            throw null;
        }
        if (i15 == 2) {
            zb zbVar2 = (zb) objArr[0];
            int i20 = f62300f;
            int i21 = (i20 ^ 81) + ((i20 & 81) << 1);
            int i22 = i21 % 128;
            f62299e = i22;
            int i23 = i21 % 2;
            long j10 = zbVar2.setCompoundDrawableTintBlendMode;
            if (i23 != 0) {
                int i24 = 5 / 0;
            }
            int i25 = i22 + 1;
            f62300f = i25 % 128;
            int i26 = i25 % 2;
            return Long.valueOf(j10);
        }
        if (i15 == 3) {
            zb zbVar3 = (zb) objArr[0];
            int i27 = ((-1) << 1) - ((f62299e + 108) ^ (-1));
            int i28 = i27 % 128;
            f62300f = i28;
            int i29 = i27 % 2;
            String str = zbVar3.setOnFocusChangeListener;
            int i30 = i28 & 23;
            int i31 = -(-((i28 ^ 23) | i30));
            int i32 = (i30 ^ i31) + ((i30 & i31) << 1);
            f62299e = i32 % 128;
            int i33 = i32 % 2;
            return str;
        }
        if (i15 == 4) {
            zb zbVar4 = (zb) objArr[0];
            int i34 = f62299e;
            int i35 = i34 & 73;
            int i36 = (((i34 | 73) & (~i35)) - (~(-(-(i35 << 1))))) - 1;
            int i37 = i36 % 128;
            f62300f = i37;
            int i38 = i36 % 2;
            boolean z10 = zbVar4.setY;
            int i39 = ((i37 ^ 9) | (i37 & 9)) << 1;
            int i40 = -(((~i37) & 9) | (i37 & (-10)));
            int i41 = (i39 & i40) + (i39 | i40);
            f62299e = i41 % 128;
            if (i41 % 2 == 0) {
                return Boolean.valueOf(z10);
            }
            throw null;
        }
        if (i15 == 5) {
            zb zbVar5 = (zb) objArr[0];
            int i42 = f62300f;
            int i43 = ((i42 | 81) << 1) - (i42 ^ 81);
            int i44 = i43 % 128;
            f62299e = i44;
            int i45 = i43 % 2;
            ze zeVar = zbVar5.setDividerPadding;
            int i46 = i44 & 19;
            int i47 = -(-((i44 ^ 19) | i46));
            int i48 = ((i46 | i47) << 1) - (i47 ^ i46);
            f62300f = i48 % 128;
            if (i48 % 2 != 0) {
                return zeVar;
            }
            throw null;
        }
        zb zbVar6 = (zb) objArr[0];
        ze zeVar2 = (ze) objArr[1];
        int i49 = f62300f;
        int i50 = ((i49 ^ 92) + ((i49 & 92) << 1)) - 1;
        f62299e = i50 % 128;
        if (i50 % 2 != 0) {
            Intrinsics.checkNotNullParameter(zeVar2, "");
            ze zeVar3 = zbVar6.setDividerPadding;
            throw null;
        }
        Intrinsics.checkNotNullParameter(zeVar2, "");
        ze zeVar4 = zbVar6.setDividerPadding;
        if (zeVar4 == zeVar2) {
            int i51 = f62299e;
            int i52 = i51 & 53;
            int i53 = ((i51 ^ 53) | i52) << 1;
            int i54 = -((i51 | 53) & (~i52));
            int i55 = ((i53 | i54) << 1) - (i54 ^ i53);
            f62300f = i55 % 128;
            if (i55 % 2 != 0) {
                return null;
            }
            int i56 = 60 / 0;
            return null;
        }
        if (zeVar4 != null) {
            int i57 = f62300f;
            int i58 = i57 & 89;
            int i59 = ((i57 | 89) & (~i58)) + (i58 << 1);
            f62299e = i59 % 128;
            int i60 = i59 % 2;
            throw new IllegalStateException("task is in multiple queues".toString());
        }
        int i61 = f62299e;
        int i62 = (i61 ^ 41) + ((i61 & 41) << 1);
        int i63 = i62 % 128;
        f62300f = i63;
        int i64 = i62 % 2;
        int i65 = i63 + 47;
        int i66 = i65 % 128;
        f62299e = i66;
        int i67 = i65 % 2;
        zbVar6.setDividerPadding = zeVar2;
        int i68 = (i66 ^ 95) + ((i66 & 95) << 1);
        f62300f = i68 % 128;
        if (i68 % 2 != 0) {
            return null;
        }
        throw null;
    }

    @JvmName(name = "setDividerPadding")
    public final boolean setDividerPadding() {
        return ((Boolean) setCompoundDrawableTintBlendMode(new Object[]{this}, 246357736, -246357732, System.identityHashCode(this))).booleanValue();
    }

    @JvmName(name = "setOnFocusChangeListener")
    @Nullable
    public final ze setOnFocusChangeListener() {
        return (ze) setCompoundDrawableTintBlendMode(new Object[]{this}, -216783788, 216783793, System.identityHashCode(this));
    }

    public final void setX(@NotNull ze p4) {
        setCompoundDrawableTintBlendMode(new Object[]{this, p4}, 1072267580, -1072267580, System.identityHashCode(this));
    }

    public abstract long setY();

    @NotNull
    public String toString() {
        int i10 = f62300f;
        int i11 = ((i10 & 90) + (i10 | 90)) - 1;
        int i12 = i11 % 128;
        f62299e = i12;
        if (i11 % 2 != 0) {
            throw null;
        }
        int i13 = i12 & 125;
        int i14 = (i12 | 125) & (~i13);
        int i15 = i13 << 1;
        int i16 = (i14 & i15) + (i14 | i15);
        f62300f = i16 % 128;
        int i17 = i16 % 2;
        return this.setOnFocusChangeListener;
    }

    @JvmName(name = "setX")
    @NotNull
    public final String setX() {
        return (String) setCompoundDrawableTintBlendMode(new Object[]{this}, -144211769, 144211772, System.identityHashCode(this));
    }

    public /* synthetic */ zb(String str, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i10 & 2) != 0 ? true : z10);
    }

    @JvmName(name = "setCompoundDrawableTintBlendMode")
    public final void setCompoundDrawableTintBlendMode(long j10) {
        setCompoundDrawableTintBlendMode(new Object[]{this, Long.valueOf(j10)}, -737772585, 737772586, System.identityHashCode(this));
    }

    @JvmName(name = "setCompoundDrawableTintBlendMode")
    public final long setCompoundDrawableTintBlendMode() {
        return ((Long) setCompoundDrawableTintBlendMode(new Object[]{this}, -137883736, 137883738, System.identityHashCode(this))).longValue();
    }
}
