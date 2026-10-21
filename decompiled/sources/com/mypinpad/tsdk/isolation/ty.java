package com.mypinpad.tsdk.isolation;

import androidx.activity.b;
import androidx.appcompat.widget.r1;
import com.mypinpad.tsdk.api.errors.TerminalException;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@SourceDebugExtension({"SMAP\nTimeoutCounter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TimeoutCounter.kt\ncom/mypinpad/tsdk/internal/terminal/timeout/TimeoutCounter\n+ 2 ExceptionProcessing.kt\ncom/mypinpad/tsdk/internal/error/ExceptionProcessingKt\n*L\n1#1,50:1\n7#2,8:51\n*S KotlinDebug\n*F\n+ 1 TimeoutCounter.kt\ncom/mypinpad/tsdk/internal/terminal/timeout/TimeoutCounter\n*L\n27#1:51,8\n*E\n"})
public final class ty implements tq {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static int f61212f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static int f61213g = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f61214a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final ud f61215b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final uc f61216c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final Function1<ud, Unit> f61217d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public uf f61218e;

    /* JADX WARN: Multi-variable type inference failed */
    public ty(int i10, @NotNull ud udVar, @NotNull uc ucVar, @NotNull Function1<? super ud, Unit> function1) {
        Intrinsics.checkNotNullParameter(udVar, "");
        Intrinsics.checkNotNullParameter(ucVar, "");
        Intrinsics.checkNotNullParameter(function1, "");
        this.f61214a = i10;
        this.f61215b = udVar;
        this.f61216c = ucVar;
        this.f61217d = function1;
    }

    public static /* synthetic */ Object setOnFocusChangeListener(Object[] objArr, int i10, int i11, int i12) throws TerminalException {
        int i13;
        Unit unit;
        int i14 = ~i11;
        int i15 = ~i12;
        int i16 = (((~(i10 | i11)) | (~(i12 | i14))) * 49) + (((~((~i10) | i15)) | i14 | (~(i10 | i12))) * (-49)) + (((~(i14 | i15)) | (~(i14 | i10))) * 98) + (i11 * (-97)) + (i10 * 50);
        int i17 = 3;
        if (i16 == 1) {
            ty tyVar = (ty) objArr[0];
            int i18 = f61212f;
            int i19 = i18 & 87;
            int i20 = -(-(i18 | 87));
            int i21 = (i19 ^ i20) + ((i19 & i20) << 1);
            int i22 = i21 % 128;
            f61213g = i22;
            int i23 = i21 % 2;
            uf ufVar = tyVar.f61218e;
            if (ufVar != null) {
                int i24 = (i22 & (-126)) | ((~i22) & 125);
                int i25 = (i22 & 125) << 1;
                int i26 = ((i24 | i25) << 1) - (i24 ^ i25);
                f61212f = i26 % 128;
                if (i26 % 2 != 0) {
                    ufVar.setCompoundDrawableTintBlendMode(false);
                    throw null;
                }
                ufVar.setCompoundDrawableTintBlendMode(false);
                int i27 = f61212f;
                int i28 = i27 ^ 115;
                int i29 = (i27 & 115) << 1;
                i13 = (i28 ^ i29) + ((i29 & i28) << 1);
            } else {
                int i30 = i18 ^ 95;
                int i31 = -(-((i18 & 95) << 1));
                i13 = ((i30 | i31) << 1) - (i31 ^ i30);
            }
            f61213g = i13 % 128;
            int i32 = i13 % 2;
            uf ufVar2 = tyVar.f61218e;
            int i33 = tyVar.f61214a;
            if (ufVar2 != null) {
                int i34 = f61213g;
                int i35 = i34 | 87;
                int i36 = ((i35 << 1) - (~(-((~(i34 & 87)) & i35)))) - 1;
                f61212f = i36 % 128;
                if (i36 % 2 != 0) {
                    ufVar2.setY(new r1(tyVar, 9), i33, TimeUnit.MILLISECONDS);
                    Unit unit2 = Unit.INSTANCE;
                    throw null;
                }
                ufVar2.setY(new b(tyVar, i17), i33, TimeUnit.MILLISECONDS);
                unit = Unit.INSTANCE;
                int i37 = f61212f;
                int i38 = (i37 & (-24)) | ((~i37) & 23);
                int i39 = -(-((i37 & 23) << 1));
                int i40 = ((i38 | i39) << 1) - (i39 ^ i38);
                f61213g = i40 % 128;
                int i41 = i40 % 2;
            } else {
                int i42 = f61212f;
                int i43 = (-2) - ((((i42 | 20) << 1) - (i42 ^ 20)) ^ (-1));
                f61213g = i43 % 128;
                int i44 = i43 % 2;
                unit = null;
            }
            if (unit == null) {
                TerminalException terminalException = new TerminalException(10015, null, null);
                mt.setX(new Object[]{terminalException}, 1181816825, -1181816816, (int) System.currentTimeMillis());
                throw terminalException;
            }
            mu.setCompoundDrawableTintBlendMode(new Object[]{160007, new setIndicatorBounds(new getDynamicButtonIconTextSpacingDp[]{getDisplayExponent.setCompoundDrawableTintBlendMode(tyVar.f61215b), getDisplayExponent.setY(String.valueOf(i33))}, null, 2, null), null, 4}, -1968587119, 1968587120, 160007);
            int i45 = f61212f + 81;
            f61213g = i45 % 128;
            if (i45 % 2 == 0) {
                throw null;
            }
        } else if (i16 == 2) {
            ty tyVar2 = (ty) objArr[0];
            int i46 = f61213g;
            int i47 = (i46 ^ 101) + ((i46 & 101) << 1);
            f61212f = i47 % 128;
            if (i47 % 2 != 0) {
                setOnFocusChangeListener(new Object[]{tyVar2}, 516706940, -516706937, System.identityHashCode(tyVar2));
                tyVar2.f61218e = null;
                mu.setCompoundDrawableTintBlendMode(new Object[]{160006, getDisplayExponent.setCompoundDrawableTintBlendMode(tyVar2.f61215b), null, 5}, -1968587119, 1968587120, 160006);
            } else {
                setOnFocusChangeListener(new Object[]{tyVar2}, 516706940, -516706937, System.identityHashCode(tyVar2));
                tyVar2.f61218e = null;
                mu.setCompoundDrawableTintBlendMode(new Object[]{160006, getDisplayExponent.setCompoundDrawableTintBlendMode(tyVar2.f61215b), null, 4}, -1968587119, 1968587120, 160006);
            }
            int i48 = f61212f;
            int i49 = ((i48 | 13) << 1) - (((~i48) & 13) | (i48 & (-14)));
            f61213g = i49 % 128;
            if (i49 % 2 == 0) {
                throw null;
            }
        } else if (i16 == 3) {
            ty tyVar3 = (ty) objArr[0];
            int i50 = f61212f;
            int i51 = i50 | 95;
            int i52 = (i51 << 1) - (i51 & (~(i50 & 95)));
            int i53 = i52 % 128;
            f61213g = i53;
            int i54 = i52 % 2;
            uf ufVar3 = tyVar3.f61218e;
            if (ufVar3 != null) {
                int i55 = (((i53 & (-100)) | ((~i53) & 99)) - (~((i53 & 99) << 1))) - 1;
                f61212f = i55 % 128;
                if (i55 % 2 != 0) {
                    ufVar3.setCompoundDrawableTintBlendMode(false);
                    int i56 = 85 / 0;
                } else {
                    ufVar3.setCompoundDrawableTintBlendMode(false);
                }
                int i57 = f61212f + 123;
                f61213g = i57 % 128;
                int i58 = i57 % 2;
            } else {
                int i59 = (i50 ^ 39) + ((i50 & 39) << 1);
                f61213g = i59 % 128;
                int i60 = i59 % 2;
            }
            mu.setCompoundDrawableTintBlendMode(new Object[]{160008, getDisplayExponent.setCompoundDrawableTintBlendMode(tyVar3.f61215b), null, 4}, -1968587119, 1968587120, 160008);
            int i61 = f61213g;
            int i62 = i61 & 109;
            int i63 = (i61 | 109) & (~i62);
            int i64 = -(-(i62 << 1));
            int i65 = ((i63 | i64) << 1) - (i63 ^ i64);
            f61212f = i65 % 128;
            if (i65 % 2 != 0) {
                throw null;
            }
        } else if (i16 != 4) {
            ty tyVar4 = (ty) objArr[0];
            int i66 = f61213g;
            int i67 = i66 ^ 25;
            int i68 = (i66 & 25) << 1;
            int i69 = (i67 ^ i68) + ((i68 & i67) << 1);
            f61212f = i69 % 128;
            int i70 = i69 % 2;
            setOnFocusChangeListener(new Object[]{tyVar4}, 516706940, -516706937, System.identityHashCode(tyVar4));
            tyVar4.f61218e = tyVar4.f61216c.setX(tyVar4.f61215b.name());
            int i71 = f61212f;
            int i72 = (i71 & 99) + (i71 | 99);
            f61213g = i72 % 128;
            if (i72 % 2 == 0) {
                throw null;
            }
        } else {
            ty tyVar5 = (ty) objArr[0];
            int i73 = f61213g;
            int i74 = ((i73 & (-110)) | ((~i73) & 109)) + ((i73 & 109) << 1);
            f61212f = i74 % 128;
            int i75 = i74 % 2;
            Intrinsics.checkNotNullParameter(tyVar5, "");
            tyVar5.f61217d.invoke(tyVar5.f61215b);
            int i76 = f61212f;
            int i77 = i76 & 63;
            int i78 = i77 + ((i76 ^ 63) | i77);
            f61213g = i78 % 128;
            int i79 = i78 % 2;
        }
        return null;
    }

    @Override // com.mypinpad.tsdk.isolation.tq
    public final void setCompoundDrawableTintBlendMode() throws TerminalException {
        setOnFocusChangeListener(new Object[]{this}, -1991887822, 1991887823, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.tq
    public final void setX() throws TerminalException {
        setOnFocusChangeListener(new Object[]{this}, 516706940, -516706937, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.tq
    public final void setY() throws TerminalException {
        setOnFocusChangeListener(new Object[]{this}, 1499815585, -1499815583, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.tq
    public final void setOnFocusChangeListener() throws TerminalException {
        setOnFocusChangeListener(new Object[]{this}, 1812621779, -1812621779, System.identityHashCode(this));
    }
}
