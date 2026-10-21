package com.mypinpad.tsdk.isolation;

import com.bbva.sl.ar.android.libkeymanagement.exception.ReturnCode;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0005\u001a\u00020\u00028\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\f\u001a\u0004\u0018\u00010\u00078\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b"}, d2 = {"Lcom/mypinpad/tsdk/i/tc;", "Lcom/mypinpad/tsdk/i/rl;", "Lcom/mypinpad/tsdk/i/ri;", "p0", "Lcom/mypinpad/tsdk/i/ri;", "setOnFocusChangeListener", "()Lcom/mypinpad/tsdk/i/ri;", "Lcom/mypinpad/tsdk/i/qw;", "q0", "Lcom/mypinpad/tsdk/i/qw;", "setCompoundDrawableTintBlendMode", "()Lcom/mypinpad/tsdk/i/qw;", "setY", "p1", "<init>", "(Lcom/mypinpad/tsdk/i/ri;Lcom/mypinpad/tsdk/i/qw;)V"}, k = 1, mv = {1, 8, 0})
public final class tc implements rl {

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static int f61021r0 = 0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public static int f61022s0 = 1;

    /* JADX INFO: renamed from: p0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final ri setOnFocusChangeListener;

    /* JADX INFO: renamed from: q0, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final qw setY;

    public tc(@NotNull ri riVar, @Nullable qw qwVar) {
        Intrinsics.checkNotNullParameter(riVar, "");
        this.setOnFocusChangeListener = riVar;
        this.setY = qwVar;
    }

    public static /* synthetic */ Object setCompoundDrawableTintBlendMode(Object[] objArr, int i10, int i11, int i12) {
        Object obj;
        int i13 = ~i11;
        int i14 = ~i12;
        if ((((~(i10 | i12)) | (~(i11 | i14))) * 950) + (((~(i14 | i10)) | (~(i11 | i12))) * (-950)) + (((~(i13 | i14)) | (~((~i10) | i12))) * ReturnCode.ERR_REPOSITORY) + (i11 * (-949)) + (i10 * (-949)) != 1) {
            tc tcVar = (tc) objArr[0];
            int i15 = f61021r0;
            int i16 = i15 & 71;
            int i17 = (i16 - (~((i15 ^ 71) | i16))) - 1;
            f61022s0 = i17 % 128;
            int i18 = i17 % 2;
            obj = tcVar.setY;
            if (i18 == 0) {
                throw null;
            }
        } else {
            tc tcVar2 = (tc) objArr[0];
            int i19 = f61022s0;
            int i20 = (-2) - ((i19 + 14) ^ (-1));
            f61021r0 = i20 % 128;
            int i21 = i20 % 2;
            obj = tcVar2.setOnFocusChangeListener;
            int i22 = ((i19 ^ 71) - (~((i19 & 71) << 1))) - 1;
            f61021r0 = i22 % 128;
            if (i22 % 2 != 0) {
                int i23 = 9 / 0;
            }
        }
        return obj;
    }

    @Override // com.mypinpad.tsdk.isolation.rl
    @JvmName(name = "setOnFocusChangeListener")
    @NotNull
    public final ri setOnFocusChangeListener() {
        return (ri) setCompoundDrawableTintBlendMode(new Object[]{this}, 1115330562, -1115330561, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.rl
    @JvmName(name = "setCompoundDrawableTintBlendMode")
    @Nullable
    public final qw setCompoundDrawableTintBlendMode() {
        return (qw) setCompoundDrawableTintBlendMode(new Object[]{this}, 467199075, -467199075, System.identityHashCode(this));
    }
}
