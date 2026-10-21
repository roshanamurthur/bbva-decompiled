package com.mypinpad.tsdk.isolation;

import android.content.Context;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b \u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u001b\u0010\u001cJQ\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH&¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0006H&¢\u0006\u0004\b\u0013\u0010\u0014R$\u0010\u0013\u001a\u0004\u0018\u00010\u00158\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u0014"}, d2 = {"Lcom/mypinpad/tsdk/i/nt;", "", "Landroid/content/Context;", "p0", "Lkotlin/Function1;", "Lcom/mypinpad/tsdk/i/px;", "", "p1", "Lcom/mypinpad/tsdk/i/ue;", "Lcom/mypinpad/tsdk/i/ug;", "p2", "", "p3", "Ljava/util/UUID;", "p4", "Lcom/mypinpad/tsdk/i/getEnableLocalAttestationForDebugBuilds;", "p5", "setY", "(Landroid/content/Context;Lkotlin/jvm/functions/Function1;Lcom/mypinpad/tsdk/i/ue;Ljava/lang/String;Ljava/util/UUID;Lcom/mypinpad/tsdk/i/getEnableLocalAttestationForDebugBuilds;)V", "setCompoundDrawableTintBlendMode", "()V", "Lcom/mypinpad/tsdk/i/re;", "a", "Lcom/mypinpad/tsdk/i/re;", "setDividerPadding", "()Lcom/mypinpad/tsdk/i/re;", "setX", "<init>", "(Lcom/mypinpad/tsdk/i/re;)V"}, k = 1, mv = {1, 8, 0})
public abstract class nt {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f57349b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int f57350c = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public re setCompoundDrawableTintBlendMode;

    public nt(@Nullable re reVar) {
        this.setCompoundDrawableTintBlendMode = reVar;
    }

    public static /* synthetic */ Object setX(Object[] objArr, int i10, int i11, int i12) {
        int i13 = ~((~i10) | i11);
        int i14 = ((i12 | i13) * 988) + (i11 * 989) + (i10 * (-1975));
        int i15 = ~i11;
        int i16 = ~(i15 | i10);
        int i17 = ~i12;
        if ((((~(i11 | i17)) | (~(i12 | i15)) | i13) * 988) + (((~(i10 | i17)) | i16) * (-1976)) + i14 == 1) {
            nt ntVar = (nt) objArr[0];
            int i18 = f57349b;
            int i19 = i18 & 57;
            int i20 = (i18 | 57) + i19;
            f57350c = i20 % 128;
            int i21 = i20 % 2;
            ntVar.setCompoundDrawableTintBlendMode = null;
            if (i21 == 0) {
                int i22 = 89 / 0;
            }
            int i23 = (i18 ^ 57) | i19;
            int i24 = (i19 ^ i23) + ((i23 & i19) << 1);
            f57350c = i24 % 128;
            int i25 = i24 % 2;
            return null;
        }
        nt ntVar2 = (nt) objArr[0];
        int i26 = f57350c;
        int i27 = i26 | 63;
        int i28 = i27 << 1;
        int i29 = -((~(i26 & 63)) & i27);
        int i30 = (i28 ^ i29) + ((i29 & i28) << 1);
        int i31 = i30 % 128;
        f57349b = i31;
        int i32 = i30 % 2;
        re reVar = ntVar2.setCompoundDrawableTintBlendMode;
        if (i32 != 0) {
            int i33 = 61 / 0;
        }
        int i34 = i31 & 75;
        int i35 = ((i31 ^ 75) | i34) << 1;
        int i36 = -((i31 | 75) & (~i34));
        int i37 = (i35 ^ i36) + ((i35 & i36) << 1);
        f57350c = i37 % 128;
        int i38 = i37 % 2;
        return reVar;
    }

    public abstract void setCompoundDrawableTintBlendMode();

    @JvmName(name = "setDividerPadding")
    @Nullable
    public final re setDividerPadding() {
        return (re) setX(new Object[]{this}, -1108058495, 1108058495, System.identityHashCode(this));
    }

    public abstract void setY(@NotNull Context p4, @NotNull Function1<? super px, Unit> p10, @NotNull ue<ug> p11, @NotNull String p12, @NotNull UUID p13, @NotNull getEnableLocalAttestationForDebugBuilds p14);

    public /* synthetic */ nt(re reVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : reVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public nt() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @JvmName(name = "setX")
    public final void setX() {
        setX(new Object[]{this}, 1734202189, -1734202188, System.identityHashCode(this));
    }
}
