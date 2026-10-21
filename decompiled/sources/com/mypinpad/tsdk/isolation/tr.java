package com.mypinpad.tsdk.isolation;

import com.mypinpad.tsdk.api.errors.TerminalException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@SourceDebugExtension({"SMAP\nSessionTimeoutHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SessionTimeoutHandler.kt\ncom/mypinpad/tsdk/internal/terminal/session/SessionTimeoutHandler\n+ 2 ExceptionProcessing.kt\ncom/mypinpad/tsdk/internal/error/ExceptionProcessingKt\n*L\n1#1,53:1\n7#2,8:54\n*S KotlinDebug\n*F\n+ 1 SessionTimeoutHandler.kt\ncom/mypinpad/tsdk/internal/terminal/session/SessionTimeoutHandler\n*L\n41#1:54,8\n*E\n"})
public final class tr implements ue<ts> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int f61192c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static int f61193d = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ts f61194a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final tq f61195b;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/mypinpad/tsdk/i/ud;", "p0", "", "setDividerPadding", "(Lcom/mypinpad/tsdk/i/ud;)V"}, k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class a extends Lambda implements Function1<ud, Unit> {

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public static int f61196q0 = 0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public static int f61197r0 = 1;

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f61198p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Function0<Unit> function0) {
            super(1);
            this.f61198p0 = function0;
        }

        public static /* synthetic */ Unit a(Object[] objArr, int i10, int i11, int i12) {
            int i13 = ~i10;
            int i14 = ~i12;
            int i15 = i13 | i14;
            int i16 = ~(i15 | i11);
            int i17 = ~i11;
            int i18 = i14 | i17;
            int i19 = ((i10 | i11) * 184) + (((~i18) | (~(i13 | i17)) | (~i15)) * 184) + ((i16 | (~(i18 | i10))) * (-184)) + (i11 * (-183)) + (i10 * (-183));
            Unit unit = null;
            if (i19 != 1) {
                a aVar = (a) objArr[0];
                Object obj = objArr[1];
                int i20 = f61197r0;
                int i21 = (((i20 & (-84)) | ((~i20) & 83)) - (~(-(-((i20 & 83) << 1))))) - 1;
                f61196q0 = i21 % 128;
                ud udVar = (ud) obj;
                if (i21 % 2 != 0) {
                    a(new Object[]{aVar, udVar}, 1601058394, -1601058393, System.identityHashCode(aVar));
                    Unit unit2 = Unit.INSTANCE;
                    throw null;
                }
                a(new Object[]{aVar, udVar}, 1601058394, -1601058393, System.identityHashCode(aVar));
                unit = Unit.INSTANCE;
                int i22 = f61196q0;
                int i23 = (i22 ^ 5) + ((i22 & 5) << 1);
                f61197r0 = i23 % 128;
                if (i23 % 2 == 0) {
                    int i24 = 42 / 0;
                }
            } else {
                a aVar2 = (a) objArr[0];
                ud udVar2 = (ud) objArr[1];
                int i25 = f61196q0 + 31;
                f61197r0 = i25 % 128;
                if (i25 % 2 == 0) {
                    Intrinsics.checkNotNullParameter(udVar2, "");
                    aVar2.f61198p0.invoke();
                    throw null;
                }
                Intrinsics.checkNotNullParameter(udVar2, "");
                aVar2.f61198p0.invoke();
                int i26 = f61196q0;
                int i27 = (i26 & 91) + (i26 | 91);
                f61197r0 = i27 % 128;
                int i28 = i27 % 2;
            }
            return unit;
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(ud udVar) {
            return a(new Object[]{this, udVar}, -1399455198, 1399455198, System.identityHashCode(this));
        }
    }

    public /* synthetic */ class setCompoundDrawableTintBlendMode {
        public static final /* synthetic */ int[] setDividerPadding;

        static {
            int[] iArr = new int[ts.values().length];
            try {
                iArr[ts.setDividerPadding.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ts.setOnFocusChangeListener.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            setDividerPadding = iArr;
        }
    }

    public tr(@NotNull tv tvVar, int i10, @NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(tvVar, "");
        Intrinsics.checkNotNullParameter(function0, "");
        this.f61195b = tvVar.setX(i10, ud.setOnLongClickListener, new a(function0));
        a(ts.setDividerPadding);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x007a  */
    /* JADX WARN: Code duplicated, block: B:15:0x008b  */
    /* JADX WARN: Code duplicated, block: B:16:0x009d  */
    public static /* synthetic */ Object setDividerPadding(Object[] objArr, int i10, int i11, int i12) throws TerminalException {
        ts tsVar;
        int i13;
        int i14 = ~i12;
        int i15 = (((~((~i10) | i11)) | (~(i11 | i14))) * 560) + ((~(i12 | (~i11) | i10)) * (-560)) + ((~(i14 | i10)) * (-560)) + (i11 * 561) + (i10 * (-559));
        if (i15 == 1) {
            tr trVar = (tr) objArr[0];
            int i16 = f61193d;
            int i17 = i16 & 81;
            int i18 = (i16 | 81) & (~i17);
            int i19 = -(-(i17 << 1));
            int i20 = (i18 ^ i19) + ((i18 & i19) << 1);
            f61192c = i20 % 128;
            if (i20 % 2 != 0) {
                trVar.f61195b.setOnFocusChangeListener();
                int i21 = 44 / 0;
            } else {
                trVar.f61195b.setOnFocusChangeListener();
            }
        } else if (i15 != 2) {
            tr trVar2 = (tr) objArr[0];
            Object obj = objArr[1];
            int i22 = f61193d;
            int i23 = (i22 & 95) + (i22 | 95);
            f61192c = i23 % 128;
            int i24 = i23 % 2;
            trVar2.a((ts) obj);
            int i25 = f61193d;
            int i26 = (i25 & (-4)) | ((~i25) & 3);
            int i27 = (i25 & 3) << 1;
            int i28 = ((i26 | i27) << 1) - (i27 ^ i26);
            f61192c = i28 % 128;
            int i29 = i28 % 2;
        } else {
            tr trVar3 = (tr) objArr[0];
            int i30 = f61192c;
            int i31 = (i30 & (-84)) | ((~i30) & 83);
            int i32 = (i30 & 83) << 1;
            int i33 = (i31 ^ i32) + ((i32 & i31) << 1);
            int i34 = i33 % 128;
            f61193d = i34;
            if (i33 % 2 == 0) {
                tsVar = trVar3.f61194a;
                int i35 = 24 / 0;
                if (tsVar == null) {
                    int i36 = i34 & 49;
                    i13 = (i36 - (~(-(-((i34 ^ 49) | i36))))) - 1;
                    f61192c = i13 % 128;
                    if (i13 % 2 == 0) {
                        Intrinsics.throwUninitializedPropertyAccessException("");
                        throw null;
                    }
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    int i37 = f61193d;
                    int i38 = i37 & 73;
                    int i39 = i38 + ((i37 ^ 73) | i38);
                    f61192c = i39 % 128;
                    int i40 = i39 % 2;
                    tsVar = null;
                }
            } else {
                tsVar = trVar3.f61194a;
                if (tsVar == null) {
                    int i310 = i34 & 49;
                    i13 = (i310 - (~(-(-((i34 ^ 49) | i310))))) - 1;
                    f61192c = i13 % 128;
                    if (i13 % 2 == 0) {
                        Intrinsics.throwUninitializedPropertyAccessException("");
                        throw null;
                    }
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    int i311 = f61193d;
                    int i312 = i311 & 73;
                    int i313 = i312 + ((i311 ^ 73) | i312);
                    f61192c = i313 % 128;
                    int i41 = i313 % 2;
                    tsVar = null;
                }
            }
            if (setCompoundDrawableTintBlendMode.setDividerPadding[tsVar.ordinal()] != 1) {
                ts tsVar2 = trVar3.f61194a;
                if (tsVar2 == null) {
                    int i42 = f61192c;
                    int i43 = (((i42 | 96) << 1) - (i42 ^ 96)) - 1;
                    f61193d = i43 % 128;
                    if (i43 % 2 == 0) {
                        Intrinsics.throwUninitializedPropertyAccessException("");
                        throw null;
                    }
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    int i44 = f61193d;
                    int i45 = ((i44 | 97) << 1) - (i44 ^ 97);
                    f61192c = i45 % 128;
                    int i46 = i45 % 2;
                    tsVar2 = null;
                }
                TerminalException terminalException = new TerminalException(10015, String.valueOf(tsVar2), null);
                mt.setX(new Object[]{terminalException}, 1181816825, -1181816816, (int) System.currentTimeMillis());
                throw terminalException;
            }
            int i47 = f61193d;
            int i48 = (i47 & 85) + (i47 | 85);
            f61192c = i48 % 128;
            int i49 = i48 % 2;
            trVar3.f61195b.setCompoundDrawableTintBlendMode();
            int i50 = f61193d;
            int i51 = i50 & 17;
            int i52 = (((i50 | 17) & (~i51)) - (~(-(-(i51 << 1))))) - 1;
            f61192c = i52 % 128;
            int i53 = i52 % 2;
        }
        return null;
    }

    public final synchronized void a(@NotNull ts tsVar) {
        int i10;
        try {
            int i11 = f61193d;
            int i12 = (i11 ^ 21) + ((i11 & 21) << 1);
            f61192c = i12 % 128;
            int i13 = i12 % 2;
            Intrinsics.checkNotNullParameter(tsVar, "");
            int i14 = setCompoundDrawableTintBlendMode.setDividerPadding[tsVar.ordinal()];
            if (i14 != 1) {
                if (i14 == 2) {
                    setDividerPadding(new Object[]{this}, 1387762204, -1387762202, System.identityHashCode(this));
                    int i15 = f61192c;
                    i10 = (i15 & 43) + (i15 | 43);
                    f61193d = i10 % 128;
                }
                this.f61194a = tsVar;
                int i16 = f61193d;
                int i17 = i16 ^ 117;
                int i18 = (i16 & 117) << 1;
                int i19 = (i17 ^ i18) + ((i18 & i17) << 1);
                f61192c = i19 % 128;
                int i20 = i19 % 2;
            } else {
                setDividerPadding(new Object[]{this}, 2114767104, -2114767103, System.identityHashCode(this));
                i10 = ((-1) << 1) - ((f61193d + 44) ^ (-1));
                f61192c = i10 % 128;
            }
            int i21 = i10 % 2;
            this.f61194a = tsVar;
            int i110 = f61193d;
            int i111 = i110 ^ 117;
            int i112 = (i110 & 117) << 1;
            int i113 = (i111 ^ i112) + ((i112 & i111) << 1);
            f61192c = i113 % 128;
            int i22 = i113 % 2;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // com.mypinpad.tsdk.isolation.ue
    public final /* synthetic */ void setOnFocusChangeListener(ts tsVar) throws TerminalException {
        setDividerPadding(new Object[]{this, tsVar}, -378782676, 378782676, System.identityHashCode(this));
    }
}
