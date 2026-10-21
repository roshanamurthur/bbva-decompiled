package com.mypinpad.tsdk.isolation;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.bbva.sdkcatalog.openpay.plugin.data.error.ErrorCodes;
import com.bbva.sl.ar.android.libkeymanagement.exception.ReturnCode;
import com.mypinpad.tsdk.api.Terminal;
import com.mypinpad.tsdk.api.TerminalSession;
import com.mypinpad.tsdk.api.callbacks.SessionActivationFailure;
import java.lang.ref.WeakReference;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001JS\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042 \u0010\u000b\u001a\u001c\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b\u0012\u0004\u0012\u00020\t0\u0006j\u0002`\n2\u0010\u0010\u000e\u001a\f\u0012\u0004\u0012\u00020\t0\fj\u0002`\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0011\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0017¢\u0006\u0004\b\u0017\u0010\u0018J\u0011\u0010\u0019\u001a\u0004\u0018\u00010\u0004H\u0017¢\u0006\u0004\b\u0019\u0010\u001a"}, d2 = {"Lcom/mypinpad/tsdk/i/xf;", "Lcom/mypinpad/tsdk/api/Terminal;", "Ljava/util/UUID;", "p0", "", "p1", "Lkotlin/Function2;", "Lcom/mypinpad/tsdk/api/TerminalSession;", "Lcom/mypinpad/tsdk/api/callbacks/SessionActivationFailure;", "", "Lcom/mypinpad/tsdk/api/callbacks/OnTerminalSessionActivate;", "p2", "Lkotlin/Function0;", "Lcom/mypinpad/tsdk/api/callbacks/OnTerminalSessionTimeout;", "p3", "activateSession", "(Ljava/util/UUID;[BLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function0;)V", "", "configBeepVolume", "(F)V", "dispose", "()V", "", "getInstallationId", "()Ljava/lang/String;", "getInstallationPublicKey", "()[B"}, k = 1, mv = {1, 8, 0})
public final class xf implements Terminal {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static int f61810e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static int f61811f = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final TerminalCallbackKt f61812a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public WeakReference<xc> f61813b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final AtomicBoolean f61814c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public Integer f61815d;

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "setDividerPadding", "()V"}, k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class a extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public static int f61817q0 = 0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public static int f61818r0 = 1;

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Function2<TerminalSession, rh, Unit> f61819p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(Function2<? super TerminalSession, ? super rh, Unit> function2) {
            super(0);
            this.f61819p0 = function2;
        }

        public static /* synthetic */ Unit a(Object[] objArr, int i10, int i11, int i12) {
            int i13 = (i11 * (-475)) + (i10 * 477);
            int i14 = ~((~i10) | i11);
            int i15 = ~i11;
            int i16 = ~(i15 | i10 | i12);
            if (((~(i10 | i15 | (~i12))) * 476) + (i16 * 952) + ((i14 | i16) * (-476)) + i13 == 1) {
                ((a) objArr[0]).f61819p0.invoke(null, new to(rk.setLayoutAnimation, null));
                int i17 = f61818r0;
                int i18 = i17 ^ 87;
                int i19 = (i17 & 87) << 1;
                int i20 = (i18 & i19) + (i19 | i18);
                f61817q0 = i20 % 128;
                if (i20 % 2 == 0) {
                    return null;
                }
                throw null;
            }
            a aVar = (a) objArr[0];
            int i21 = f61817q0;
            int i22 = (((i21 | 12) << 1) - (i21 ^ 12)) - 1;
            f61818r0 = i22 % 128;
            int i23 = i22 % 2;
            a(new Object[]{aVar}, -2063543288, 2063543289, System.identityHashCode(aVar));
            Unit unit = Unit.INSTANCE;
            int i24 = f61818r0;
            int i25 = i24 ^ 37;
            int i26 = (i24 & 37) << 1;
            int i27 = (i25 ^ i26) + ((i26 & i25) << 1);
            f61817q0 = i27 % 128;
            if (i27 % 2 == 0) {
                return unit;
            }
            int i28 = 90 / 0;
            return unit;
        }

        @Override // kotlin.jvm.functions.Function0
        public final /* synthetic */ Unit invoke() {
            return a(new Object[]{this}, 1985061236, -1985061236, System.identityHashCode(this));
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "setX", "()V"}, k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class b extends Lambda implements Function0<Unit> {
        public static int v0 = 0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public static int f61820w0 = 1;

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ UUID f61821p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ byte[] f61822q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ xf f61823r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f61824s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ Function2<TerminalSession, rh, Unit> f61825t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final /* synthetic */ Function2<TerminalSession, SessionActivationFailure, Unit> f61826u0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(UUID uuid, byte[] bArr, xf xfVar, Function0<Unit> function0, Function2<? super TerminalSession, ? super rh, Unit> function2, Function2<? super TerminalSession, ? super SessionActivationFailure, Unit> function3) {
            super(0);
            this.f61821p0 = uuid;
            this.f61822q0 = bArr;
            this.f61823r0 = xfVar;
            this.f61824s0 = function0;
            this.f61825t0 = function2;
            this.f61826u0 = function3;
        }

        public static Unit a(Object[] objArr, int i10, int i11, int i12) throws Throwable {
            int i13 = ~i10;
            int i14 = ~i11;
            int i15 = (((~(i13 | i14)) | (~(i13 | i12))) * ReturnCode.ERR_CONN_IO) + (i11 * (-751)) + (i10 * (-751));
            int i16 = i11 | i13;
            if ((((~(i10 | i14)) | (~i16)) * 752) + ((~(i12 | i16)) * (-1504)) + i15 != 1) {
                b bVar = (b) objArr[0];
                int i17 = v0 + 32;
                int i18 = (i17 ^ (-1)) + (i17 << 1);
                f61820w0 = i18 % 128;
                if (i18 % 2 != 0) {
                    a(new Object[]{bVar}, -2021383363, 2021383364, System.identityHashCode(bVar));
                    return Unit.INSTANCE;
                }
                a(new Object[]{bVar}, -2021383363, 2021383364, System.identityHashCode(bVar));
                Unit unit = Unit.INSTANCE;
                throw null;
            }
            b bVar2 = (b) objArr[0];
            MainProcessManager mainProcessManager = MainProcessManager.setX;
            UUID uuid = bVar2.f61821p0;
            xf$2$setY xf_2_sety = new xf$2$setY();
            xf_2_sety.f61816p0 = bVar2.f61824s0;
            vj vjVar = (vj) MainProcessManager.setX(new Object[]{mainProcessManager, uuid, bVar2.f61822q0, xf_2_sety}, -1975912237, 1975912261, System.identityHashCode(mainProcessManager));
            xf xfVar = bVar2.f61823r0;
            if (((AtomicBoolean) xf.setCompoundDrawableTintBlendMode(new Object[]{xfVar}, 193149737, -193149736, (int) System.currentTimeMillis())).get()) {
                int i19 = v0;
                int i20 = i19 | 49;
                int i21 = i20 << 1;
                int i22 = -((~(i19 & 49)) & i20);
                int i23 = (i21 ^ i22) + ((i22 & i21) << 1);
                f61820w0 = i23 % 128;
                int i24 = i23 % 2;
                return null;
            }
            vd vdVar = vd.INSTANCE;
            vd.setDividerPadding(new Object[]{new y00(vjVar, bVar2.f61825t0, xfVar, bVar2.f61826u0)}, 1115627770, -1115627770, (int) System.currentTimeMillis());
            if (((Boolean) mi.setX(new Object[]{vjVar}, -594807234, 594807237, (int) System.currentTimeMillis())).booleanValue()) {
                int i25 = v0;
                int i26 = i25 & 89;
                int i27 = (i26 - (~(-(-((i25 ^ 89) | i26))))) - 1;
                f61820w0 = i27 % 128;
                int i28 = i27 % 2;
                MainProcessManager.setX(new Object[]{mainProcessManager}, 1296257365, -1296257351, System.identityHashCode(mainProcessManager));
                int i29 = f61820w0;
                int i30 = ((i29 & 20) + (i29 | 20)) - 1;
                v0 = i30 % 128;
                int i31 = i30 % 2;
            }
            int i32 = f61820w0;
            int i33 = ((i32 | 63) << 1) - (i32 ^ 63);
            v0 = i33 % 128;
            if (i33 % 2 == 0) {
                return null;
            }
            throw null;
        }

        @Override // kotlin.jvm.functions.Function0
        public final /* synthetic */ Unit invoke() {
            return a(new Object[]{this}, -1254033054, 1254033054, System.identityHashCode(this));
        }
    }

    public static final class setDividerPadding extends setVisibility {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static int f61827c = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static int f61828d = 1;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Function2<TerminalSession, rh, Unit> f61830b;

        @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "setCompoundDrawableTintBlendMode", "()V"}, k = 3, mv = {1, 8, 0}, xi = 48)
        public static final class a extends Lambda implements Function0<Unit> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public final /* synthetic */ Function2<TerminalSession, rh, Unit> f61831p0;

            /* JADX INFO: renamed from: q0, reason: collision with root package name */
            public final /* synthetic */ Throwable f61832q0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(Function2<? super TerminalSession, ? super rh, Unit> function2, Throwable th2) {
                super(0);
                this.f61831p0 = function2;
                this.f61832q0 = th2;
            }

            public static /* synthetic */ Unit a(Object[] objArr, int i10, int i11, int i12) {
                int i13 = (i11 * TypedValues.MotionType.TYPE_EASING) + (i10 * 302);
                int i14 = ~i10;
                int i15 = ~i12;
                if (((~(i11 | i15)) * 301) + (((~(i10 | i15 | i11)) | (~(i12 | i14)) | (~((~i11) | i14))) * (-301)) + (((~(i14 | i15)) | i11) * (-602)) + i13 != 1) {
                    a aVar = (a) objArr[0];
                    a(new Object[]{aVar}, -480036612, 480036613, System.identityHashCode(aVar));
                    return Unit.INSTANCE;
                }
                a aVar2 = (a) objArr[0];
                aVar2.f61831p0.invoke(null, new to(rk.setOnDragListener, rx.setOnFocusChangeListener(aVar2.f61832q0)));
                return null;
            }

            @Override // kotlin.jvm.functions.Function0
            public final /* synthetic */ Unit invoke() {
                return a(new Object[]{this}, 1858471317, -1858471317, System.identityHashCode(this));
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public setDividerPadding(Function2<? super TerminalSession, ? super rh, Unit> function2) {
            this.f61830b = function2;
        }

        public static /* synthetic */ Object setCompoundDrawableTintBlendMode(Object[] objArr, int i10, int i11, int i12) {
            setDividerPadding setdividerpadding = (setDividerPadding) objArr[0];
            Throwable th2 = (Throwable) objArr[1];
            int i13 = f61827c;
            int i14 = i13 & 123;
            int i15 = ((i13 ^ 123) | i14) << 1;
            int i16 = -((i13 | 123) & (~i14));
            int i17 = (i15 & i16) + (i16 | i15);
            f61828d = i17 % 128;
            if (i17 % 2 == 0) {
                Intrinsics.checkNotNullParameter(th2, "");
                ((AtomicBoolean) xf.setCompoundDrawableTintBlendMode(new Object[]{xf.this}, 193149737, -193149736, (int) System.currentTimeMillis())).get();
                throw null;
            }
            Intrinsics.checkNotNullParameter(th2, "");
            if (((AtomicBoolean) xf.setCompoundDrawableTintBlendMode(new Object[]{xf.this}, 193149737, -193149736, (int) System.currentTimeMillis())).get()) {
                int i18 = f61827c;
                int i19 = i18 & 119;
                int i20 = (i18 | 119) & (~i19);
                int i21 = -(-(i19 << 1));
                int i22 = (i20 & i21) + (i20 | i21);
                f61828d = i22 % 128;
                if (i22 % 2 == 0) {
                    throw null;
                }
            } else {
                vd vdVar = vd.INSTANCE;
                vd.setDividerPadding(new Object[]{new a(setdividerpadding.f61830b, th2)}, 1115627770, -1115627770, (int) System.currentTimeMillis());
                int i23 = f61828d;
                int i24 = i23 & 45;
                int i25 = (i23 | 45) & (~i24);
                int i26 = i24 << 1;
                int i27 = (i25 ^ i26) + ((i25 & i26) << 1);
                f61827c = i27 % 128;
                int i28 = i27 % 2;
            }
            return null;
        }

        @Override // com.mypinpad.tsdk.isolation.setVisibility
        public final void exceptionHandler(@NotNull Throwable th2) {
            setCompoundDrawableTintBlendMode(new Object[]{this, th2}, 820465941, -820465941, System.identityHashCode(this));
        }
    }

    public xf(TerminalCallbackKt terminalCallbackKt, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        terminalCallbackKt = (i10 & 1) != 0 ? vi.setOnFocusChangeListener() : terminalCallbackKt;
        Intrinsics.checkNotNullParameter(terminalCallbackKt, "");
        this.f61812a = terminalCallbackKt;
        this.f61814c = new AtomicBoolean(false);
        MainProcessManager mainProcessManager = MainProcessManager.setX;
        this.f61815d = Integer.valueOf(((Integer) MainProcessManager.setX(new Object[]{new a10(this)}, 177599820, -177599805, (int) System.currentTimeMillis())).intValue());
    }

    public static /* synthetic */ Object setCompoundDrawableTintBlendMode(Object[] objArr, int i10, int i11, int i12) throws Throwable {
        Object obj;
        int i13;
        xc xcVar;
        int i14 = ~i12;
        int i15 = ~i10;
        int i16 = ~i11;
        int i17 = i14 | (~(i15 | i16));
        int i18 = ~(i10 | i11);
        switch ((((~(i10 | i16)) | (~(i11 | i15))) * ErrorCodes.STORAGE_PERMISSION) + (((~(i12 | i11)) | (~(i10 | i12)) | i18) * (-1444)) + ((i17 | i18) * 1444) + (i11 * (-721)) + (i10 * (-721))) {
            case 1:
                xf xfVar = (xf) objArr[0];
                int i19 = f61810e;
                int i20 = i19 & 65;
                int i21 = ((((i19 ^ 65) | i20) << 1) - (~(-((~i20) & (i19 | 65))))) - 1;
                f61811f = i21 % 128;
                int i22 = i21 % 2;
                obj = xfVar.f61814c;
                if (i22 == 0) {
                    int i23 = 45 / 0;
                }
                int i24 = (-2) - ((i19 + 12) ^ (-1));
                f61811f = i24 % 128;
                if (i24 % 2 == 0) {
                    throw null;
                }
                return obj;
            case 2:
                xf xfVar2 = (xf) objArr[0];
                int i25 = f61811f;
                int i26 = i25 & 55;
                int i27 = (i25 | 55) & (~i26);
                int i28 = i26 << 1;
                int i29 = ((i27 | i28) << 1) - (i27 ^ i28);
                f61810e = i29 % 128;
                if (i29 % 2 == 0) {
                    return xfVar2.f61813b;
                }
                WeakReference<xc> weakReference = xfVar2.f61813b;
                throw null;
            case 3:
                xf xfVar3 = (xf) objArr[0];
                int i30 = f61810e;
                int i31 = ((i30 | 35) << 1) - (i30 ^ 35);
                f61811f = i31 % 128;
                try {
                    if (i31 % 2 == 0) {
                        xfVar3.f61814c.get();
                        try {
                            throw null;
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    if (!(!xfVar3.f61814c.get())) {
                        int i32 = f61811f;
                        int i33 = i32 ^ 17;
                        int i34 = ((((i32 & 17) | i33) << 1) - (~(-i33))) - 1;
                        f61810e = i34 % 128;
                        if (i34 % 2 != 0) {
                            int i35 = 90 / 0;
                        }
                        return null;
                    }
                    MainProcessManager mainProcessManager = MainProcessManager.setX;
                    obj = (String) MainProcessManager.setX(new Object[]{mainProcessManager}, -827323898, 827323911, System.identityHashCode(mainProcessManager));
                    int i36 = f61810e;
                    int i37 = (((i36 & (-58)) | ((~i36) & 57)) - (~(-(-((i36 & 57) << 1))))) - 1;
                    f61811f = i37 % 128;
                    if (i37 % 2 == 0) {
                        int i38 = 18 / 0;
                    }
                    return obj;
                } catch (Exception e5) {
                    mr mrVar = mr.setAlwaysDrawnWithCacheEnabled;
                    StringBuilder sb2 = new StringBuilder("exception when getInstallationId ");
                    sb2.append(e5.getMessage());
                    mt.setX(new Object[]{mrVar, sb2.toString()}, 135701020, -135701017, (int) System.currentTimeMillis());
                }
                break;
            case 4:
                xf xfVar4 = (xf) objArr[0];
                UUID uuid = (UUID) objArr[1];
                byte[] bArr = (byte[]) objArr[2];
                Function2 function2 = (Function2) objArr[3];
                Function0 function0 = (Function0) objArr[4];
                int i39 = f61811f;
                int i40 = i39 & 107;
                int i41 = (i40 - (~(-(-((i39 ^ 107) | i40))))) - 1;
                f61810e = i41 % 128;
                if (i41 % 2 != 0) {
                    Intrinsics.checkNotNullParameter(uuid, "");
                    Intrinsics.checkNotNullParameter(bArr, "");
                    Intrinsics.checkNotNullParameter(function2, "");
                    Intrinsics.checkNotNullParameter(function0, "");
                    xfVar4.f61814c.get();
                    throw null;
                }
                Intrinsics.checkNotNullParameter(uuid, "");
                Intrinsics.checkNotNullParameter(bArr, "");
                Intrinsics.checkNotNullParameter(function2, "");
                Intrinsics.checkNotNullParameter(function0, "");
                Function2 function3 = (Function2) rj.setY(new Object[]{function2}, 2084858729, -2084858725, (int) System.currentTimeMillis());
                if (xfVar4.f61814c.get()) {
                    vd vdVar = vd.INSTANCE;
                    vd.setDividerPadding(new Object[]{new a(function3)}, 1115627770, -1115627770, (int) System.currentTimeMillis());
                    int i42 = f61811f + 17;
                    f61810e = i42 % 128;
                    if (i42 % 2 != 0) {
                        int i43 = 24 / 0;
                    }
                } else {
                    xfVar4.f61812a.setCompoundDrawableTintBlendMode(xfVar4.new setDividerPadding(function3), new b(uuid, bArr, xfVar4, function0, function3, function2));
                    int i44 = f61811f + 61;
                    f61810e = i44 % 128;
                    int i45 = i44 % 2;
                }
                return null;
            case 5:
                xf xfVar5 = (xf) objArr[0];
                float fFloatValue = ((Number) objArr[1]).floatValue();
                int i46 = f61810e + 105;
                f61811f = i46 % 128;
                int i47 = i46 % 2;
                if (xfVar5.f61814c.get()) {
                    int i48 = f61811f;
                    int i49 = (i48 ^ 101) + ((i48 & 101) << 1);
                    f61810e = i49 % 128;
                    int i50 = i49 % 2;
                    return null;
                }
                MainProcessManager mainProcessManager2 = MainProcessManager.setX;
                MainProcessManager.setX(new Object[]{mainProcessManager2, Float.valueOf(fFloatValue)}, -1326524124, 1326524135, System.identityHashCode(mainProcessManager2));
                int i51 = f61810e;
                int i52 = (i51 & 41) + (i51 | 41);
                f61811f = i52 % 128;
                if (i52 % 2 != 0) {
                    return null;
                }
                throw null;
            case 6:
                xf xfVar6 = (xf) objArr[0];
                int i53 = f61810e + 23;
                f61811f = i53 % 128;
                int i54 = i53 % 2;
                if (!xfVar6.f61814c.getAndSet(true)) {
                    int i55 = f61811f;
                    int i56 = i55 ^ 99;
                    int i57 = (i55 & 99) << 1;
                    int i58 = ((i56 | i57) << 1) - (i57 ^ i56);
                    f61810e = i58 % 128;
                    try {
                        if (i58 % 2 != 0) {
                            try {
                                throw null;
                            } catch (Throwable th3) {
                                throw th3;
                            }
                        }
                        WeakReference<xc> weakReference2 = xfVar6.f61813b;
                        if (weakReference2 == null || (xcVar = weakReference2.get()) == null) {
                            int i59 = f61810e;
                            int i60 = ((i59 ^ 1) | (i59 & 1)) << 1;
                            int i61 = -(((~i59) & 1) | (i59 & (-2)));
                            i13 = ((i60 | i61) << 1) - (i61 ^ i60);
                            f61811f = i13 % 128;
                        } else {
                            int i62 = f61810e;
                            int i63 = ((i62 & (-30)) | ((~i62) & 29)) + ((i62 & 29) << 1);
                            f61811f = i63 % 128;
                            if (i63 % 2 == 0) {
                                xc.setX(new Object[]{xcVar}, 1784869663, -1784869657, System.identityHashCode(xcVar));
                                try {
                                    throw null;
                                } catch (Throwable th4) {
                                    throw th4;
                                }
                            }
                            xc.setX(new Object[]{xcVar}, 1784869663, -1784869657, System.identityHashCode(xcVar));
                            int i64 = f61811f;
                            int i65 = i64 ^ 17;
                            int i66 = (i64 & 17) << 1;
                            i13 = ((i65 | i66) << 1) - (i66 ^ i65);
                            f61810e = i13 % 128;
                        }
                        int i67 = i13 % 2;
                        xfVar6.f61813b = null;
                        Integer num = xfVar6.f61815d;
                        if (num != null) {
                            int i68 = f61811f;
                            int i69 = ((i68 ^ 78) + ((i68 & 78) << 1)) - 1;
                            f61810e = i69 % 128;
                            int i70 = i69 % 2;
                            int iIntValue = num.intValue();
                            MainProcessManager mainProcessManager3 = MainProcessManager.setX;
                            MainProcessManager.setX(new Object[]{Integer.valueOf(iIntValue)}, 1405103874, -1405103873, iIntValue);
                            int i71 = f61811f;
                            int i72 = ((i71 ^ 29) | (i71 & 29)) << 1;
                            int i73 = -(((~i71) & 29) | (i71 & (-30)));
                            int i74 = ((i72 | i73) << 1) - (i73 ^ i72);
                            f61810e = i74 % 128;
                            int i75 = i74 % 2;
                        } else {
                            int i76 = f61810e;
                            int i77 = ((i76 ^ 69) | (i76 & 69)) << 1;
                            int i78 = -(((~i76) & 69) | (i76 & (-70)));
                            int i79 = ((i77 | i78) << 1) - (i78 ^ i77);
                            f61811f = i79 % 128;
                            int i80 = i79 % 2;
                        }
                        xfVar6.f61815d = null;
                        MainProcessManager mainProcessManager4 = MainProcessManager.setX;
                        MainProcessManager.setX(new Object[]{mainProcessManager4}, 1347538267, -1347538241, System.identityHashCode(mainProcessManager4));
                        int i81 = f61811f + 49;
                        f61810e = i81 % 128;
                        if (i81 % 2 == 0) {
                            return null;
                        }
                        throw null;
                    } catch (Exception e7) {
                        mr mrVar2 = mr.setAlwaysDrawnWithCacheEnabled;
                        StringBuilder sb3 = new StringBuilder("exception when dispose ");
                        sb3.append(e7.getMessage());
                        mt.setX(new Object[]{mrVar2, sb3.toString()}, 135701020, -135701017, (int) System.currentTimeMillis());
                    }
                }
                int i82 = f61811f + 65;
                f61810e = i82 % 128;
                int i83 = i82 % 2;
                return null;
            case 7:
                xf xfVar7 = (xf) objArr[0];
                int i84 = f61810e;
                int i85 = i84 & 3;
                int i86 = -(-(3 | i84));
                int i87 = ((i85 | i86) << 1) - (i86 ^ i85);
                f61811f = i87 % 128;
                int i88 = i87 % 2;
                try {
                    if (!xfVar7.f61814c.get()) {
                        int i89 = (-2) - ((f61811f + 108) ^ (-1));
                        f61810e = i89 % 128;
                        if (i89 % 2 != 0) {
                            MainProcessManager mainProcessManager5 = MainProcessManager.setX;
                            try {
                                throw null;
                            } catch (Throwable th5) {
                                throw th5;
                            }
                        }
                        MainProcessManager mainProcessManager6 = MainProcessManager.setX;
                        obj = (byte[]) MainProcessManager.setX(new Object[]{mainProcessManager6}, -1625062096, 1625062113, System.identityHashCode(mainProcessManager6));
                        int i90 = f61811f;
                        int i91 = (i90 ^ 69) + ((i90 & 69) << 1);
                        f61810e = i91 % 128;
                        if (i91 % 2 != 0) {
                            int i92 = 86 / 0;
                        }
                        return obj;
                    }
                } catch (Exception e10) {
                    mr mrVar3 = mr.setAlwaysDrawnWithCacheEnabled;
                    StringBuilder sb4 = new StringBuilder("exception when getInstallationPublicKey ");
                    sb4.append(e10.getMessage());
                    mt.setX(new Object[]{mrVar3, sb4.toString()}, 135701020, -135701017, (int) System.currentTimeMillis());
                }
                int i93 = (-2) - ((f61810e + 72) ^ (-1));
                f61811f = i93 % 128;
                int i94 = i93 % 2;
                return null;
            default:
                xf xfVar8 = (xf) objArr[0];
                WeakReference<xc> weakReference3 = (WeakReference) objArr[1];
                int i95 = f61810e;
                int i96 = i95 + 121;
                f61811f = i96 % 128;
                int i97 = i96 % 2;
                xfVar8.f61813b = weakReference3;
                if (i97 == 0) {
                    throw null;
                }
                int i98 = i95 & 41;
                int i99 = (i95 ^ 41) | i98;
                int i100 = (i98 ^ i99) + ((i98 & i99) << 1);
                f61811f = i100 % 128;
                int i101 = i100 % 2;
                return null;
        }
    }

    public static final /* synthetic */ AtomicBoolean setOnFocusChangeListener(xf xfVar) {
        return (AtomicBoolean) setCompoundDrawableTintBlendMode(new Object[]{xfVar}, 193149737, -193149736, (int) System.currentTimeMillis());
    }

    public static final /* synthetic */ WeakReference setX(xf xfVar) {
        return (WeakReference) setCompoundDrawableTintBlendMode(new Object[]{xfVar}, -1685641773, 1685641775, (int) System.currentTimeMillis());
    }

    @Override // com.mypinpad.tsdk.api.Terminal
    public final void activateSession(@NotNull UUID p4, @NotNull byte[] p10, @NotNull Function2<? super TerminalSession, ? super SessionActivationFailure, Unit> p11, @NotNull Function0<Unit> p12) throws Throwable {
        setCompoundDrawableTintBlendMode(new Object[]{this, p4, p10, p11, p12}, -808494013, 808494017, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.api.Terminal
    public final void configBeepVolume(float p4) throws Throwable {
        setCompoundDrawableTintBlendMode(new Object[]{this, Float.valueOf(p4)}, -697410349, 697410354, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.api.Terminal
    public final void dispose() throws Throwable {
        setCompoundDrawableTintBlendMode(new Object[]{this}, -6134601, 6134607, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.api.Terminal
    @Nullable
    public final String getInstallationId() {
        return (String) setCompoundDrawableTintBlendMode(new Object[]{this}, 1245898991, -1245898988, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.api.Terminal
    @Nullable
    public final byte[] getInstallationPublicKey() {
        return (byte[]) setCompoundDrawableTintBlendMode(new Object[]{this}, 2050653339, -2050653332, System.identityHashCode(this));
    }

    public xf() {
        this(null, 1, null);
    }
}
