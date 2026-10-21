package com.mypinpad.tsdk.isolation;

import android.app.Application;
import android.content.Context;
import com.bbva.tohu.android.product.valkyria.sdk.services.intents.DeleteCardIntentService;
import com.mypinpad.tsdk.api.Terminal;
import com.mypinpad.tsdk.api.models.Endpoint;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: com.mypinpad.tsdk.i.xe, reason: from Kotlin metadata */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J@\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2 \u0010\r\u001a\u001c\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0012\u0004\u0012\u00020\u00060\u000ej\u0002`\u0011J\u0016\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016J\u000e\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0014R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/mypinpad/tsdk/isolation/TerminalProviderIsolationWrapper;", "", "()V", "threadPool", "Lcom/mypinpad/common/threading/ThreadPool;", "createTerminal", "", com.salesforce.marketingcloud.config.a.f64109t, "Lcom/mypinpad/tsdk/api/models/Endpoint;", "configuration", "Lcom/mypinpad/tsdk/internal/sdk/models/SdkConfiguration;", "clientCredentialsGrant", "Lcom/mypinpad/tsdk/internal/sdk/models/authorization/SdkClientCredentialsGrant;", "onSdkTerminal", "Lkotlin/Function2;", "Lcom/mypinpad/tsdk/api/Terminal;", "Lcom/mypinpad/tsdk/internal/sdk/callbacks/SdkTerminalCreationFailure;", "Lcom/mypinpad/tsdk/internal/sdk/callbacks/OnSdkTerminal;", "initialise", "context", "Landroid/content/Context;", "shouldSetLifecycleCallbacks", "", "setLifecycleCallback", "sdk-android_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class TerminalProviderIsolationWrapper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final TerminalCallbackKt f61793a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f61794b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int f61795c = 1;

    @NotNull
    public static final TerminalProviderIsolationWrapper setCompoundDrawableTintBlendMode = new TerminalProviderIsolationWrapper();

    /* JADX INFO: renamed from: com.mypinpad.tsdk.i.xe$a */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "setX", "()V"}, k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class a extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public static int f61796t0 = 0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public static int f61797u0 = 1;

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Endpoint f61798p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ sd f61799q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ st f61800r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ Function2<Terminal, rl, Unit> f61801s0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(Endpoint endpoint, sd sdVar, st stVar, Function2<? super Terminal, ? super rl, Unit> function2) {
            super(0);
            this.f61798p0 = endpoint;
            this.f61799q0 = sdVar;
            this.f61800r0 = stVar;
            this.f61801s0 = function2;
        }

        public static /* synthetic */ Unit a(Object[] objArr, int i10, int i11, int i12) throws Throwable {
            Unit unit;
            Unit unit2;
            int i13 = ~i10;
            int i14 = (((~(i13 | i11)) | (~(i13 | i12))) * (-283)) + (i11 * (-282)) + (i10 * 284);
            int i15 = ~i11;
            if (((~(i15 | i13 | i12)) * 283) + ((~(i10 | i15)) * 283) + i14 != 1) {
                a aVar = (a) objArr[0];
                int i16 = f61797u0;
                int i17 = i16 & 97;
                int i18 = -(-((i16 ^ 97) | i17));
                int i19 = (i17 & i18) + (i18 | i17);
                f61796t0 = i19 % 128;
                int i20 = i19 % 2;
                MainProcessManager mainProcessManager = MainProcessManager.setX;
                vr vrVar = (vr) MainProcessManager.setX(new Object[]{mainProcessManager, aVar.f61798p0, aVar.f61799q0, aVar.f61800r0}, 388349257, -388349236, System.identityHashCode(mainProcessManager));
                boolean z10 = vrVar instanceof vk;
                Function2<Terminal, rl, Unit> function2 = aVar.f61801s0;
                if (z10) {
                    vd vdVar = vd.INSTANCE;
                    vd.setDividerPadding(new Object[]{new x00(function2, vrVar)}, 1115627770, -1115627770, (int) System.currentTimeMillis());
                    int i21 = f61797u0;
                    int i22 = (i21 & 21) + (i21 | 21);
                    f61796t0 = i22 % 128;
                    int i23 = i22 % 2;
                } else if (vrVar instanceof vo) {
                    vd vdVar2 = vd.INSTANCE;
                    vd.setDividerPadding(new Object[]{new w00(function2)}, 1115627770, -1115627770, (int) System.currentTimeMillis());
                    int i24 = f61796t0;
                    int i25 = i24 & 91;
                    int i26 = -(-((i24 ^ 91) | i25));
                    int i27 = (i25 ^ i26) + ((i26 & i25) << 1);
                    f61797u0 = i27 % 128;
                    int i28 = i27 % 2;
                }
                Object[] objArr2 = {vrVar};
                unit2 = null;
                if (((Boolean) mi.setX(objArr2, -355129756, 355129766, (int) System.currentTimeMillis())).booleanValue()) {
                    int i29 = f61797u0;
                    int i30 = i29 & 29;
                    int i31 = (i30 - (~(-(-((i29 ^ 29) | i30))))) - 1;
                    f61796t0 = i31 % 128;
                    if (i31 % 2 != 0) {
                        MainProcessManager.setX(new Object[]{mainProcessManager}, 1296257365, -1296257351, System.identityHashCode(mainProcessManager));
                        throw null;
                    }
                    MainProcessManager.setX(new Object[]{mainProcessManager}, 1296257365, -1296257351, System.identityHashCode(mainProcessManager));
                    int i32 = f61797u0;
                    int i33 = ((i32 | 79) << 1) - (i32 ^ 79);
                    f61796t0 = i33 % 128;
                    int i34 = i33 % 2;
                }
                int i35 = f61796t0;
                int i36 = (i35 & 25) + (i35 | 25);
                f61797u0 = i36 % 128;
                if (i36 % 2 == 0) {
                    int i37 = 68 / 0;
                }
            } else {
                a aVar2 = (a) objArr[0];
                int i38 = f61797u0;
                int i39 = i38 & 69;
                int i40 = ((((i38 ^ 69) | i39) << 1) - (~(-((i38 | 69) & (~i39))))) - 1;
                f61796t0 = i40 % 128;
                if (i40 % 2 != 0) {
                    a(new Object[]{aVar2}, -780629271, 780629271, System.identityHashCode(aVar2));
                    unit = Unit.INSTANCE;
                    int i41 = 11 / 0;
                } else {
                    a(new Object[]{aVar2}, -780629271, 780629271, System.identityHashCode(aVar2));
                    unit = Unit.INSTANCE;
                }
                unit2 = unit;
                int i42 = f61796t0;
                int i43 = ((i42 ^ 43) | (i42 & 43)) << 1;
                int i44 = -(((~i42) & 43) | (i42 & (-44)));
                int i45 = ((i43 | i44) << 1) - (i44 ^ i43);
                f61797u0 = i45 % 128;
                int i46 = i45 % 2;
            }
            return unit2;
        }

        @Override // kotlin.jvm.functions.Function0
        public final /* synthetic */ Unit invoke() {
            return a(new Object[]{this}, 2016801603, -2016801602, System.identityHashCode(this));
        }
    }

    /* JADX INFO: renamed from: com.mypinpad.tsdk.i.xe$b */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "setY", "()V"}, k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class b extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public static int f61802q0 = 0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public static int f61803r0 = 1;

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Context f61804p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Context context) {
            super(0);
            this.f61804p0 = context;
        }

        public static /* synthetic */ Unit a(Object[] objArr, int i10, int i11, int i12) throws Throwable {
            int i13 = ~i11;
            int i14 = ((~((~i12) | i13 | i10)) * 130) + (i11 * 131) + (i10 * (-129));
            int i15 = i13 | i10;
            if ((((~((~i10) | i11)) | (~(i15 | i12))) * 130) + ((~i15) * (-260)) + i14 != 1) {
                b bVar = (b) objArr[0];
                int i16 = f61803r0;
                int i17 = i16 & 91;
                int i18 = ((i16 ^ 91) | i17) << 1;
                int i19 = -((i16 | 91) & (~i17));
                int i20 = (i18 & i19) + (i19 | i18);
                f61802q0 = i20 % 128;
                int i21 = i20 % 2;
                MainProcessManager mainProcessManager = MainProcessManager.setX;
                MainProcessManager.setX(new Object[]{mainProcessManager, bVar.f61804p0}, -291544253, 291544262, System.identityHashCode(mainProcessManager));
                int i22 = f61802q0;
                int i23 = (i22 ^ 117) + ((i22 & 117) << 1);
                f61803r0 = i23 % 128;
                int i24 = i23 % 2;
                return null;
            }
            b bVar2 = (b) objArr[0];
            int i25 = f61803r0;
            int i26 = i25 & 23;
            int i27 = -(-(i25 | 23));
            int i28 = (i26 ^ i27) + ((i27 & i26) << 1);
            f61802q0 = i28 % 128;
            if (i28 % 2 != 0) {
                a(new Object[]{bVar2}, 805671032, -805671032, System.identityHashCode(bVar2));
                Unit unit = Unit.INSTANCE;
                throw null;
            }
            a(new Object[]{bVar2}, 805671032, -805671032, System.identityHashCode(bVar2));
            Unit unit2 = Unit.INSTANCE;
            int i29 = f61803r0;
            int i30 = ((i29 ^ 50) + ((i29 & 50) << 1)) - 1;
            f61802q0 = i30 % 128;
            if (i30 % 2 == 0) {
                return unit2;
            }
            throw null;
        }

        @Override // kotlin.jvm.functions.Function0
        public final /* synthetic */ Unit invoke() {
            return a(new Object[]{this}, 1886790089, -1886790088, System.identityHashCode(this));
        }
    }

    /* JADX INFO: renamed from: com.mypinpad.tsdk.i.xe$setCompoundDrawableTintBlendMode */
    public static final class setCompoundDrawableTintBlendMode extends setVisibility {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Function2<Terminal, rl, Unit> f61805a;

        /* JADX INFO: renamed from: com.mypinpad.tsdk.i.xe$setCompoundDrawableTintBlendMode$a */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "setCompoundDrawableTintBlendMode", "()V"}, k = 3, mv = {1, 8, 0}, xi = 48)
        public static final class a extends Lambda implements Function0<Unit> {

            /* JADX INFO: renamed from: r0, reason: collision with root package name */
            public static int f61806r0 = 0;

            /* JADX INFO: renamed from: s0, reason: collision with root package name */
            public static int f61807s0 = 1;

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public final /* synthetic */ Function2<Terminal, rl, Unit> f61808p0;

            /* JADX INFO: renamed from: q0, reason: collision with root package name */
            public final /* synthetic */ Throwable f61809q0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(Function2<? super Terminal, ? super rl, Unit> function2, Throwable th2) {
                super(0);
                this.f61808p0 = function2;
                this.f61809q0 = th2;
            }

            public static /* synthetic */ Unit a(Object[] objArr, int i10, int i11, int i12) {
                int i13 = ~i10;
                int i14 = ~(i13 | i11);
                int i15 = ~(i13 | i12);
                int i16 = ~i11;
                int i17 = ((i15 | (~(i16 | i12))) * 140) + ((i14 | i15) * (-280)) + (i11 * (-139)) + (i10 * 141);
                int i18 = ~(i13 | i16 | i12);
                int i19 = ~i12;
                if ((((~(i10 | i19 | i16)) | (~(i11 | i13 | i19)) | i18) * 140) + i17 != 1) {
                    a aVar = (a) objArr[0];
                    aVar.f61808p0.invoke(null, new tc(ri.setDividerPadding, rx.setOnFocusChangeListener(aVar.f61809q0)));
                    int i20 = f61807s0;
                    int i21 = (i20 ^ 57) + ((i20 & 57) << 1);
                    f61806r0 = i21 % 128;
                    if (i21 % 2 == 0) {
                        return null;
                    }
                    throw null;
                }
                a aVar2 = (a) objArr[0];
                int i22 = f61806r0;
                int i23 = ((i22 ^ 25) | (i22 & 25)) << 1;
                int i24 = -(((~i22) & 25) | (i22 & (-26)));
                int i25 = (i23 ^ i24) + ((i24 & i23) << 1);
                f61807s0 = i25 % 128;
                if (i25 % 2 == 0) {
                    a(new Object[]{aVar2}, 902189096, -902189096, System.identityHashCode(aVar2));
                    Unit unit = Unit.INSTANCE;
                    throw null;
                }
                a(new Object[]{aVar2}, 902189096, -902189096, System.identityHashCode(aVar2));
                Unit unit2 = Unit.INSTANCE;
                int i26 = f61806r0;
                int i27 = i26 & 19;
                int i28 = (i26 ^ 19) | i27;
                int i29 = ((i27 | i28) << 1) - (i28 ^ i27);
                f61807s0 = i29 % 128;
                if (i29 % 2 != 0) {
                    return unit2;
                }
                throw null;
            }

            @Override // kotlin.jvm.functions.Function0
            public final /* synthetic */ Unit invoke() {
                return a(new Object[]{this}, 594476619, -594476618, System.identityHashCode(this));
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public setCompoundDrawableTintBlendMode(Function2<? super Terminal, ? super rl, Unit> function2) {
            this.f61805a = function2;
        }

        public static /* synthetic */ Object setX(Object[] objArr, int i10, int i11, int i12) {
            setCompoundDrawableTintBlendMode setcompounddrawabletintblendmode = (setCompoundDrawableTintBlendMode) objArr[0];
            Throwable th2 = (Throwable) objArr[1];
            Intrinsics.checkNotNullParameter(th2, "");
            mu.setCompoundDrawableTintBlendMode(new Object[]{Integer.valueOf(DeleteCardIntentService.JOB_ID), getDisplayExponent.setCompoundDrawableTintBlendMode(ri.setDividerPadding), null, 4}, -1968587119, 1968587120, DeleteCardIntentService.JOB_ID);
            vd vdVar = vd.INSTANCE;
            vd.setDividerPadding(new Object[]{new a(setcompounddrawabletintblendmode.f61805a, th2)}, 1115627770, -1115627770, (int) System.currentTimeMillis());
            return null;
        }

        @Override // com.mypinpad.tsdk.isolation.setVisibility
        public final void exceptionHandler(@NotNull Throwable th2) {
            setX(new Object[]{this, th2}, -1483263531, 1483263531, System.identityHashCode(this));
        }
    }

    /* JADX INFO: renamed from: com.mypinpad.tsdk.i.xe$setX */
    public static final class setX extends setVisibility {
        public static /* synthetic */ Object setDividerPadding(Object[] objArr, int i10, int i11, int i12) {
            Throwable th2 = (Throwable) objArr[1];
            Intrinsics.checkNotNullParameter(th2, "");
            mr mrVar = mr.setAlwaysDrawnWithCacheEnabled;
            StringBuilder sb2 = new StringBuilder("exception when initialise ");
            sb2.append(th2.getMessage());
            mt.setX(new Object[]{mrVar, sb2.toString()}, 135701020, -135701017, (int) System.currentTimeMillis());
            return null;
        }

        @Override // com.mypinpad.tsdk.isolation.setVisibility
        public final void exceptionHandler(@NotNull Throwable th2) {
            setDividerPadding(new Object[]{this, th2}, 1068637773, -1068637773, System.identityHashCode(this));
        }
    }

    static {
        vi viVar = vi.setDividerPadding;
        f61793a = (TerminalCallbackKt) vi.setOnFocusChangeListener(new Object[0], 711180205, -711180201, (int) System.currentTimeMillis());
        int i10 = f61795c;
        int i11 = i10 & 23;
        int i12 = -(-((i10 ^ 23) | i11));
        int i13 = (i11 & i12) + (i12 | i11);
        f61794b = i13 % 128;
        if (i13 % 2 != 0) {
            throw null;
        }
    }

    public final synchronized void setCompoundDrawableTintBlendMode(@NotNull Context context) {
        int i10 = f61794b;
        int i11 = i10 & 35;
        int i12 = (i10 ^ 35) | i11;
        int i13 = (i11 ^ i12) + ((i11 & i12) << 1);
        f61795c = i13 % 128;
        int i14 = i13 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNull(applicationContext, "");
        ((Application) applicationContext).registerActivityLifecycleCallbacks(sx.INSTANCE);
        int i15 = i10 & 111;
        int i16 = -(-((i10 ^ 111) | i15));
        int i17 = ((i15 | i16) << 1) - (i15 ^ i16);
        f61795c = i17 % 128;
        int i18 = i17 % 2;
    }

    public final synchronized void setDividerPadding(@NotNull Endpoint endpoint, @NotNull sd sdVar, @NotNull st stVar, @NotNull Function2<? super Terminal, ? super rl, Unit> function2) {
        Intrinsics.checkNotNullParameter(endpoint, "");
        Intrinsics.checkNotNullParameter(sdVar, "");
        Intrinsics.checkNotNullParameter(stVar, "");
        Intrinsics.checkNotNullParameter(function2, "");
        f61793a.setCompoundDrawableTintBlendMode(new setCompoundDrawableTintBlendMode(function2), new a(endpoint, sdVar, stVar, function2));
        int i10 = f61794b;
        int i11 = (i10 & (-46)) | ((~i10) & 45);
        int i12 = -(-((i10 & 45) << 1));
        int i13 = ((i11 | i12) << 1) - (i12 ^ i11);
        f61795c = i13 % 128;
        int i14 = i13 % 2;
    }

    public final synchronized void setX(@NotNull Context context, boolean z10) {
        try {
            int i10 = f61794b;
            int i11 = i10 & 29;
            int i12 = ((((i10 ^ 29) | i11) << 1) - (~(-((~i11) & (i10 | 29))))) - 1;
            f61795c = i12 % 128;
            int i13 = i12 % 2;
            Intrinsics.checkNotNullParameter(context, "");
            if (z10) {
                int i14 = i10 & 19;
                int i15 = i10 | 19;
                int i16 = (i14 ^ i15) + ((i14 & i15) << 1);
                f61795c = i16 % 128;
                int i17 = i16 % 2;
                setCompoundDrawableTintBlendMode(context);
                int i18 = i10 & 59;
                int i19 = -(-((i10 ^ 59) | i18));
                int i20 = ((i18 | i19) << 1) - (i18 ^ i19);
                f61795c = i20 % 128;
                int i21 = i20 % 2;
            }
            f61793a.setCompoundDrawableTintBlendMode(new setX(), new b(context));
            int i22 = (((i10 | 48) << 1) - (i10 ^ 48)) - 1;
            f61795c = i22 % 128;
            int i23 = i22 % 2;
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
