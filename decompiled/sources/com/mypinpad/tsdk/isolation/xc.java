package com.mypinpad.tsdk.isolation;

import com.mypinpad.tsdk.api.TerminalSession;
import com.mypinpad.tsdk.api.callbacks.PinPadLaunchRequestListener;
import com.mypinpad.tsdk.api.callbacks.TransactionCancelReason;
import com.mypinpad.tsdk.api.callbacks.TransactionCancelled;
import com.mypinpad.tsdk.api.callbacks.TransactionErrorCause;
import com.mypinpad.tsdk.api.callbacks.TransactionFailed;
import com.mypinpad.tsdk.api.callbacks.TransactionResult;
import com.mypinpad.tsdk.api.callbacks.UiMessage;
import com.mypinpad.tsdk.api.models.TransactionParameters;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\r\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0004JQ\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0007\u001a\u00020\u00062\u0016\u0010\u000b\u001a\u0012\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00020\bj\u0002`\n2\b\u0010\r\u001a\u0004\u0018\u00010\f2\u0016\u0010\u0010\u001a\u0012\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00020\bj\u0002`\u000fH\u0017¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0019\u001a\u00020\u00148\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u001c\u001a\u00020\u0011X\u0007¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b"}, d2 = {"Lcom/mypinpad/tsdk/i/xc;", "Lcom/mypinpad/tsdk/api/TerminalSession;", "", "deactivate", "()V", "setOnFocusChangeListener", "Lcom/mypinpad/tsdk/api/models/TransactionParameters;", "p0", "Lkotlin/Function1;", "Lcom/mypinpad/tsdk/api/callbacks/UiMessage;", "Lcom/mypinpad/tsdk/api/callbacks/OnUiMessage;", "p1", "Lcom/mypinpad/tsdk/api/callbacks/PinPadLaunchRequestListener;", "p2", "Lcom/mypinpad/tsdk/api/callbacks/TransactionResult;", "Lcom/mypinpad/tsdk/api/callbacks/OnTransactionResult;", "p3", "", "startTransaction", "(Lcom/mypinpad/tsdk/api/models/TransactionParameters;Lkotlin/jvm/functions/Function1;Lcom/mypinpad/tsdk/api/callbacks/PinPadLaunchRequestListener;Lkotlin/jvm/functions/Function1;)Ljava/lang/String;", "", "a", "J", "getValidUntil", "()J", "setDividerPadding", "setCompoundDrawableTintBlendMode", "Ljava/lang/String;", "setX"}, k = 1, mv = {1, 8, 0})
public final class xc implements TerminalSession {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static int f61766e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static int f61767f = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final long setDividerPadding;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final nu f61769b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final TerminalCallbackKt f61770c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final AtomicBoolean f61771d;

    /* JADX INFO: renamed from: setCompoundDrawableTintBlendMode, reason: from kotlin metadata */
    @NotNull
    public String setX;

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "setDividerPadding", "()V"}, k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class a extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Function1<TransactionResult, Unit> f61772p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(Function1<? super TransactionResult, Unit> function1) {
            super(0);
            this.f61772p0 = function1;
        }

        public static /* synthetic */ Unit a(Object[] objArr, int i10, int i11, int i12) {
            int i13 = (i11 * (-712)) + (i10 * 714);
            int i14 = ~i10;
            int i15 = ~i12;
            int i16 = (~(i14 | i11)) | (~(i14 | i15));
            int i17 = ~i11;
            int i18 = ~(i10 | i17 | i12);
            if (((~(i17 | i15)) * 713) + (i18 * 1426) + ((i16 | i18) * (-713)) + i13 == 1) {
                ((a) objArr[0]).f61772p0.invoke(new TransactionCancelled(TransactionCancelReason.TERMINAL_DISPOSED));
                return null;
            }
            a aVar = (a) objArr[0];
            a(new Object[]{aVar}, 864904724, -864904723, System.identityHashCode(aVar));
            Unit unit = Unit.INSTANCE;
            System.identityHashCode(aVar);
            System.identityHashCode(aVar);
            return unit;
        }

        @Override // kotlin.jvm.functions.Function0
        public final /* synthetic */ Unit invoke() {
            return a(new Object[]{this}, -1294051049, 1294051049, System.identityHashCode(this));
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "setOnFocusChangeListener", "()V"}, k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class b extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public static int f61773u0 = 0;
        public static int v0 = 1;

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ PinPadLaunchRequestListener f61774p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ TransactionParameters f61775q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ xc f61776r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ Function1<UiMessage, Unit> f61777s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ Function1<TransactionResult, Unit> f61778t0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(PinPadLaunchRequestListener pinPadLaunchRequestListener, TransactionParameters transactionParameters, xc xcVar, Function1<? super UiMessage, Unit> function1, Function1<? super TransactionResult, Unit> function2) {
            super(0);
            this.f61774p0 = pinPadLaunchRequestListener;
            this.f61775q0 = transactionParameters;
            this.f61776r0 = xcVar;
            this.f61777s0 = function1;
            this.f61778t0 = function2;
        }

        public static /* synthetic */ Unit a(Object[] objArr, int i10, int i11, int i12) throws Throwable {
            int i13 = ~i10;
            int i14 = ~i11;
            int i15 = ~(i13 | i14);
            int i16 = (~i12) | i13;
            if ((((~(i10 | i14)) | (~(i11 | i16))) * 241) + ((i10 | i11) * (-482)) + (((~i16) | i15) * (-241)) + (i11 * 242) + (i10 * 483) != 1) {
                b bVar = (b) objArr[0];
                t00 t00Var = new t00(bVar.f61776r0, bVar.f61777s0);
                xc xcVar = bVar.f61776r0;
                r00 r00Var = new r00(xcVar);
                PinPadLaunchRequestListener pinPadLaunchRequestListener = bVar.f61774p0;
                xd xdVar = new xd(t00Var, r00Var, pinPadLaunchRequestListener != null ? rd.setCompoundDrawableTintBlendMode(pinPadLaunchRequestListener) : null, new v00(xcVar, bVar.f61778t0));
                MainProcessManager mainProcessManager = MainProcessManager.setX;
                MainProcessManager.setX(new Object[]{mainProcessManager, (sq) sm.setY(new Object[]{bVar.f61775q0}, -2098458560, 2098458560, (int) System.currentTimeMillis()), xdVar}, -1140183811, 1140183839, System.identityHashCode(mainProcessManager));
                return null;
            }
            b bVar2 = (b) objArr[0];
            int i17 = f61773u0;
            int i18 = (-2) - (((i17 & 90) + (i17 | 90)) ^ (-1));
            v0 = i18 % 128;
            if (i18 % 2 == 0) {
                a(new Object[]{bVar2}, 1255221067, -1255221067, System.identityHashCode(bVar2));
                Unit unit = Unit.INSTANCE;
                throw null;
            }
            a(new Object[]{bVar2}, 1255221067, -1255221067, System.identityHashCode(bVar2));
            Unit unit2 = Unit.INSTANCE;
            int i19 = v0;
            int i20 = (((i19 & (-98)) | ((~i19) & 97)) - (~(-(-((i19 & 97) << 1))))) - 1;
            f61773u0 = i20 % 128;
            int i21 = i20 % 2;
            return unit2;
        }

        @Override // kotlin.jvm.functions.Function0
        public final /* synthetic */ Unit invoke() {
            return a(new Object[]{this}, -671058202, 671058203, System.identityHashCode(this));
        }
    }

    public static final class setCompoundDrawableTintBlendMode extends setVisibility {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static int f61779c = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static int f61780d = 1;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Function1<TransactionResult, Unit> f61782b;

        @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "setX", "()V"}, k = 3, mv = {1, 8, 0}, xi = 48)
        public static final class a extends Lambda implements Function0<Unit> {

            /* JADX INFO: renamed from: r0, reason: collision with root package name */
            public static int f61783r0 = 0;

            /* JADX INFO: renamed from: s0, reason: collision with root package name */
            public static int f61784s0 = 1;

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public final /* synthetic */ Function1<TransactionResult, Unit> f61785p0;

            /* JADX INFO: renamed from: q0, reason: collision with root package name */
            public final /* synthetic */ Throwable f61786q0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(Function1<? super TransactionResult, Unit> function1, Throwable th2) {
                super(0);
                this.f61785p0 = function1;
                this.f61786q0 = th2;
            }

            public static /* synthetic */ Unit a(Object[] objArr, int i10, int i11, int i12) {
                int i13 = ~i10;
                int i14 = ~i12;
                int i15 = ~(i13 | i14);
                int i16 = ~i11;
                int i17 = i13 | i16;
                if ((((~(i10 | i16 | i12)) | (~(i11 | i13 | i12)) | (~(i17 | i14))) * 867) + (((~i17) | (~(i13 | i12)) | (~(i16 | i12))) * (-1734)) + ((i15 | (~(i16 | i14))) * (-867)) + (i11 * 868) + (i10 * 868) != 1) {
                    a aVar = (a) objArr[0];
                    aVar.f61785p0.invoke(new TransactionFailed(new byte[0], TransactionErrorCause.INTERNAL_ERROR, aVar.f61786q0));
                    int i18 = f61783r0;
                    int i19 = i18 & 17;
                    int i20 = (i18 ^ 17) | i19;
                    int i21 = (i19 & i20) + (i20 | i19);
                    f61784s0 = i21 % 128;
                    if (i21 % 2 == 0) {
                        int i22 = 74 / 0;
                    }
                    return null;
                }
                a aVar2 = (a) objArr[0];
                int i23 = f61784s0 + 59;
                f61783r0 = i23 % 128;
                int i24 = i23 % 2;
                a(new Object[]{aVar2}, 1977325889, -1977325889, System.identityHashCode(aVar2));
                Unit unit = Unit.INSTANCE;
                int i25 = f61784s0;
                int i26 = i25 & 61;
                int i27 = (i25 | 61) & (~i26);
                int i28 = i26 << 1;
                int i29 = ((i27 | i28) << 1) - (i27 ^ i28);
                f61783r0 = i29 % 128;
                if (i29 % 2 == 0) {
                    return unit;
                }
                int i30 = 47 / 0;
                return unit;
            }

            @Override // kotlin.jvm.functions.Function0
            public final /* synthetic */ Unit invoke() {
                return a(new Object[]{this}, -1260274552, 1260274553, System.identityHashCode(this));
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public setCompoundDrawableTintBlendMode(Function1<? super TransactionResult, Unit> function1) {
            this.f61782b = function1;
        }

        public static /* synthetic */ Object setOnFocusChangeListener(Object[] objArr, int i10, int i11, int i12) {
            setCompoundDrawableTintBlendMode setcompounddrawabletintblendmode = (setCompoundDrawableTintBlendMode) objArr[0];
            Throwable th2 = (Throwable) objArr[1];
            int i13 = f61780d + 47;
            f61779c = i13 % 128;
            int i14 = i13 % 2;
            Intrinsics.checkNotNullParameter(th2, "");
            if (((AtomicBoolean) xc.setX(new Object[]{xc.this}, -1122694538, 1122694545, (int) System.currentTimeMillis())).get()) {
                int i15 = f61779c;
                int i16 = i15 & 41;
                int i17 = i16 + ((i15 ^ 41) | i16);
                f61780d = i17 % 128;
                int i18 = i17 % 2;
                return null;
            }
            ((nu) xc.setX(new Object[]{xc.this}, 902849077, -902849077, (int) System.currentTimeMillis())).setOnFocusChangeListener();
            vd vdVar = vd.INSTANCE;
            vd.setDividerPadding(new Object[]{new a(setcompounddrawabletintblendmode.f61782b, th2)}, 1115627770, -1115627770, (int) System.currentTimeMillis());
            int i19 = f61780d;
            int i20 = i19 & 107;
            int i21 = ((i19 | 107) & (~i20)) + (i20 << 1);
            f61779c = i21 % 128;
            int i22 = i21 % 2;
            return null;
        }

        @Override // com.mypinpad.tsdk.isolation.setVisibility
        public final void exceptionHandler(@NotNull Throwable th2) {
            setOnFocusChangeListener(new Object[]{this, th2}, 2054187458, -2054187458, System.identityHashCode(this));
        }
    }

    public xc(long j10, String str, nu nuVar, TerminalCallbackKt terminalCallbackKt, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        nuVar = (i10 & 4) != 0 ? new oc(0, 1, null) : nuVar;
        terminalCallbackKt = (i10 & 8) != 0 ? vi.setOnFocusChangeListener() : terminalCallbackKt;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(nuVar, "");
        Intrinsics.checkNotNullParameter(terminalCallbackKt, "");
        this.setDividerPadding = j10;
        this.setX = str;
        this.f61769b = nuVar;
        this.f61770c = terminalCallbackKt;
        this.f61771d = new AtomicBoolean(false);
    }

    public static /* synthetic */ Object setX(Object[] objArr, int i10, int i11, int i12) throws Throwable {
        Object objValueOf;
        int i13;
        int i14 = ~((~i10) | (~i11));
        int i15 = ~i12;
        int i16 = ((i14 | (~(i15 | i10 | i11))) * (-828)) + (i11 * 829) + (i10 * 829);
        int i17 = i10 | i11;
        switch (((~i17) * 828) + ((i17 | i15) * (-828)) + i16) {
            case 1:
                xc xcVar = (xc) objArr[0];
                TransactionParameters transactionParameters = (TransactionParameters) objArr[1];
                Function1 function1 = (Function1) objArr[2];
                PinPadLaunchRequestListener pinPadLaunchRequestListener = (PinPadLaunchRequestListener) objArr[3];
                Function1 function2 = (Function1) objArr[4];
                int i18 = f61767f;
                int i19 = i18 & 35;
                int i20 = (i18 ^ 35) | i19;
                int i21 = (i19 ^ i20) + ((i20 & i19) << 1);
                f61766e = i21 % 128;
                int i22 = i21 % 2;
                Intrinsics.checkNotNullParameter(transactionParameters, "");
                Intrinsics.checkNotNullParameter(function1, "");
                Intrinsics.checkNotNullParameter(function2, "");
                if (xcVar.f61771d.get()) {
                    vd vdVar = vd.INSTANCE;
                    vd.setDividerPadding(new Object[]{new a(function2)}, 1115627770, -1115627770, (int) System.currentTimeMillis());
                    objValueOf = xcVar.setX;
                    int i23 = f61766e;
                    i13 = ((((i23 ^ 39) | (i23 & 39)) << 1) - (~(-(((~i23) & 39) | (i23 & (-40)))))) - 1;
                } else {
                    xcVar.f61770c.setCompoundDrawableTintBlendMode(xcVar.new setCompoundDrawableTintBlendMode(function2), new b(pinPadLaunchRequestListener, transactionParameters, xcVar, function1, function2));
                    objValueOf = xcVar.setX;
                    int i24 = f61766e;
                    i13 = (i24 & 63) + (i24 | 63);
                }
                f61767f = i13 % 128;
                int i25 = i13 % 2;
                break;
            case 2:
                xc xcVar2 = (xc) objArr[0];
                int i26 = f61767f;
                int i27 = i26 ^ 55;
                int i28 = -(-((i26 & 55) << 1));
                int i29 = ((i27 | i28) << 1) - (i27 ^ i28);
                f61766e = i29 % 128;
                int i30 = i29 % 2;
                long j10 = xcVar2.setDividerPadding;
                int i31 = i26 + 65;
                f61766e = i31 % 128;
                if (i31 % 2 != 0) {
                    int i32 = 43 / 0;
                }
                objValueOf = Long.valueOf(j10);
                break;
            case 3:
                xc xcVar3 = (xc) objArr[0];
                int i33 = f61767f;
                int i34 = (((i33 & (-24)) | ((~i33) & 23)) - (~((i33 & 23) << 1))) - 1;
                f61766e = i34 % 128;
                int i35 = i34 % 2;
                if (!xcVar3.f61771d.get()) {
                    int i36 = f61766e;
                    int i37 = i36 | 1;
                    int i38 = i37 << 1;
                    int i39 = -((~(i36 & 1)) & i37);
                    int i40 = ((i38 | i39) << 1) - (i39 ^ i38);
                    f61767f = i40 % 128;
                    try {
                        if (i40 % 2 != 0) {
                            MainProcessManager mainProcessManager = MainProcessManager.setX;
                            MainProcessManager.setX(new Object[]{mainProcessManager}, -76332258, 76332266, System.identityHashCode(mainProcessManager));
                            return null;
                        }
                        MainProcessManager mainProcessManager2 = MainProcessManager.setX;
                        MainProcessManager.setX(new Object[]{mainProcessManager2}, -76332258, 76332266, System.identityHashCode(mainProcessManager2));
                        try {
                            throw null;
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    } catch (Exception e5) {
                        mr mrVar = mr.UiMessageCallbackKtWhenMappings;
                        StringBuilder sb2 = new StringBuilder("exception when deactivate ");
                        sb2.append(e5.getMessage());
                        mt.setX(new Object[]{mrVar, sb2.toString()}, 135701020, -135701017, (int) System.currentTimeMillis());
                    }
                }
                int i41 = f61767f + 43;
                f61766e = i41 % 128;
                if (i41 % 2 == 0) {
                    return null;
                }
                throw null;
            case 4:
                ok okVar = (ok) objArr[0];
                int i42 = f61766e;
                int i43 = i42 & 17;
                int i44 = i42 | 17;
                int i45 = (i43 ^ i44) + ((i44 & i43) << 1);
                f61767f = i45 % 128;
                try {
                    if (i45 % 2 == 0) {
                        MainProcessManager mainProcessManager3 = MainProcessManager.setX;
                        MainProcessManager.setX(new Object[]{mainProcessManager3, okVar}, 1998153295, -1998153291, System.identityHashCode(mainProcessManager3));
                        try {
                            throw null;
                        } catch (Throwable th3) {
                            throw th3;
                        }
                    }
                    MainProcessManager mainProcessManager4 = MainProcessManager.setX;
                    MainProcessManager.setX(new Object[]{mainProcessManager4, okVar}, 1998153295, -1998153291, System.identityHashCode(mainProcessManager4));
                    int i46 = f61767f;
                    int i47 = i46 & 21;
                    int i48 = (i46 ^ 21) | i47;
                    int i49 = ((i47 | i48) << 1) - (i48 ^ i47);
                    f61766e = i49 % 128;
                    if (i49 % 2 == 0) {
                        return null;
                    }
                    throw null;
                } catch (Exception e7) {
                    mr mrVar2 = mr.UiMessageCallbackKtWhenMappings;
                    StringBuilder sb3 = new StringBuilder("exception when onNfcResult ");
                    sb3.append(e7.getMessage());
                    mt.setX(new Object[]{mrVar2, sb3.toString()}, 135701020, -135701017, (int) System.currentTimeMillis());
                    return null;
                }
            case 5:
                ok okVar2 = (ok) objArr[1];
                int i50 = f61766e;
                int i51 = i50 & 111;
                int i52 = (i50 ^ 111) | i51;
                int i53 = (i51 ^ i52) + ((i52 & i51) << 1);
                f61767f = i53 % 128;
                if (i53 % 2 != 0) {
                    setX(new Object[]{okVar2}, -1810272059, 1810272063, (int) System.currentTimeMillis());
                    return null;
                }
                setX(new Object[]{okVar2}, -1810272059, 1810272063, (int) System.currentTimeMillis());
                int i54 = 5 / 0;
                return null;
            case 6:
                xc xcVar4 = (xc) objArr[0];
                int i55 = f61767f;
                int i56 = ((-1) << 1) - (((i55 & 22) + (i55 | 22)) ^ (-1));
                f61766e = i56 % 128;
                int i57 = i56 % 2;
                xcVar4.f61771d.set(true);
                return null;
            case 7:
                xc xcVar5 = (xc) objArr[0];
                int i58 = f61766e;
                int i59 = i58 & 31;
                int i60 = ((i58 | 31) & (~i59)) + (i59 << 1);
                f61767f = i60 % 128;
                int i61 = i60 % 2;
                objValueOf = xcVar5.f61771d;
                if (i61 == 0) {
                    throw null;
                }
                int iCurrentTimeMillis = (int) System.currentTimeMillis();
                int i62 = ~iCurrentTimeMillis;
                int i63 = ((-33817669) & i62) | (33817668 & iCurrentTimeMillis);
                int i64 = iCurrentTimeMillis & (-33817669);
                int i65 = ~((i64 & i63) | (i63 ^ i64));
                int i66 = (-1717951687) - ((958442207 - (~(-(~(-(-(((i65 & (-1786761070)) | ((-1786761070) ^ i65)) * 501))))))) ^ (-1));
                int i67 = (i66 ^ (-1)) + (i66 << 1);
                int i68 = ((~i62) & (-1652360270)) | (1652360269 & i62);
                int i69 = i62 & (-1652360270);
                int i70 = (i69 & i68) | (i68 ^ i69);
                int i71 = (i67 - (~(-(~((~((i70 & (-168218469)) | ((168218468 & i70) | ((~i70) & (-168218469))))) * 501))))) - 2;
                int iCurrentTimeMillis2 = (int) System.currentTimeMillis();
                int i72 = ~iCurrentTimeMillis2;
                int i73 = ~i72;
                int i74 = ((-6654242) & i73) | (6654241 & i72);
                int i75 = (-6654242) & i72;
                int i76 = -(~(((i75 & i74) | (i74 ^ i75)) * (-369)));
                int i77 = (((-963735824) & i76) + (i76 | (-963735824))) - 1;
                int i78 = (i72 | iCurrentTimeMillis2) & i72;
                int i79 = 1458412325 & i78;
                int i80 = (i78 | 1458412325) & (~i79);
                int i81 = ~((i80 & i79) | (i80 ^ i79));
                int i82 = ((i81 & (-6802850)) | ((-6802850) ^ i81)) * (-369);
                int i83 = (i77 ^ i82) + ((i82 & i77) << 1);
                int i84 = (-1458412326) ^ iCurrentTimeMillis2;
                int i85 = iCurrentTimeMillis2 & (-1458412326);
                int i86 = ~((i85 & i84) | (i84 ^ i85));
                int i87 = (i86 & 1451758084) | (1451758084 ^ i86);
                int i88 = (i73 & 1458412325) | ((-1458412326) & i72);
                int i89 = i72 & 1458412325;
                int i90 = (i89 & i88) | (i88 ^ i89);
                int i91 = (6802849 & i90) | ((~i90) & (-6802850));
                int i92 = i90 & (-6802850);
                int i93 = (i92 & i91) | (i91 ^ i92);
                int i94 = ~i93;
                int i95 = (i93 | i94) & i94;
                int i96 = -(~(-(-(((i87 & i95) | ((~i95) & i87) | ((~i87) & i95)) * 369))));
                int i97 = (i83 ^ i96) + ((i96 & i83) << 1);
                if (i71 <= (i97 ^ (-1)) + (i97 << 1)) {
                    throw null;
                }
                break;
            default:
                xc xcVar6 = (xc) objArr[0];
                int i98 = f61767f;
                int i99 = (i98 ^ 31) + ((i98 & 31) << 1);
                int i100 = i99 % 128;
                f61766e = i100;
                if (i99 % 2 != 0) {
                    nu nuVar = xcVar6.f61769b;
                    throw null;
                }
                nu nuVar2 = xcVar6.f61769b;
                int i101 = (((i100 | 10) << 1) - (i100 ^ 10)) - 1;
                f61767f = i101 % 128;
                if (i101 % 2 != 0) {
                    return nuVar2;
                }
                int i102 = 31 / 0;
                return nuVar2;
        }
        return objValueOf;
    }

    @Override // com.mypinpad.tsdk.api.TerminalSession
    public final void deactivate() throws Throwable {
        setX(new Object[]{this}, -1581155302, 1581155305, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.api.TerminalSession
    @JvmName(name = "getValidUntil")
    public final long getValidUntil() {
        return ((Long) setX(new Object[]{this}, -1607417858, 1607417860, System.identityHashCode(this))).longValue();
    }

    public final void setOnFocusChangeListener() throws Throwable {
        setX(new Object[]{this}, 1784869663, -1784869657, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.api.TerminalSession
    @NotNull
    public final String startTransaction(@NotNull TransactionParameters p4, @NotNull Function1<? super UiMessage, Unit> p10, @Nullable PinPadLaunchRequestListener p11, @NotNull Function1<? super TransactionResult, Unit> p12) {
        return (String) setX(new Object[]{this, p4, p10, p11, p12}, -752362614, 752362615, System.identityHashCode(this));
    }

    public static final /* synthetic */ AtomicBoolean setY(xc xcVar) {
        return (AtomicBoolean) setX(new Object[]{xcVar}, -1122694538, 1122694545, (int) System.currentTimeMillis());
    }

    public static final /* synthetic */ nu setX(xc xcVar) {
        return (nu) setX(new Object[]{xcVar}, 902849077, -902849077, (int) System.currentTimeMillis());
    }
}
