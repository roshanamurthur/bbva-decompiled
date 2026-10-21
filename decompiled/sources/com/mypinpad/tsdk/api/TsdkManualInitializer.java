package com.mypinpad.tsdk.api;

import android.app.Application;
import android.content.Context;
import com.bbva.nativesettings.common.Constants;
import com.bbva.tohu.android.product.valkyria.sdk.services.intents.SuspendTokenIntentService;
import com.mypinpad.tsdk.isolation.TerminalCallbackKt;
import com.mypinpad.tsdk.isolation.TerminalProviderIsolationWrapper;
import com.mypinpad.tsdk.isolation.getDisplayExponent;
import com.mypinpad.tsdk.isolation.mu;
import com.mypinpad.tsdk.isolation.mw;
import com.mypinpad.tsdk.isolation.ou;
import com.mypinpad.tsdk.isolation.pc;
import com.mypinpad.tsdk.isolation.setVisibility;
import com.mypinpad.tsdk.isolation.vi;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000e\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\fH\u0001¢\u0006\u0004\b\u000e\u0010\u000f"}, d2 = {"Lcom/mypinpad/tsdk/api/TsdkManualInitializer;", "", "Landroid/app/Application;", Constants.APPLICATION, "", "applicationCreated", "(Landroid/app/Application;)V", "Landroid/content/Context;", "context", "Lcom/mypinpad/tsdk/api/TerminalSdk;", "init", "(Landroid/content/Context;)Lcom/mypinpad/tsdk/api/TerminalSdk;", "", "shouldSetLifecycleCallbacks", "init$sdk_android_release", "(Landroid/content/Context;Z)Lcom/mypinpad/tsdk/api/TerminalSdk;", "<init>", "()V"}, k = 1, mv = {1, 8, 0})
public final class TsdkManualInitializer {

    @NotNull
    public static final TsdkManualInitializer INSTANCE = new TsdkManualInitializer();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static boolean f51635a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f51636b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int f51637c = 1;

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "setCompoundDrawableTintBlendMode", "()V"}, k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class a extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public static int f51638r0 = 0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public static int f51639s0 = 1;

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Context f51640p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ boolean f51641q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Context context, boolean z10) {
            super(0);
            this.f51640p0 = context;
            this.f51641q0 = z10;
        }

        public static /* synthetic */ Unit a(Object[] objArr, int i10, int i11, int i12) {
            int i13 = ~i11;
            int i14 = ~i12;
            if ((((~(i10 | i14)) | (~(i12 | (~i10))) | i13) * 45) + (((~(i11 | i10)) | (~(i13 | i12))) * (-45)) + (((~(i13 | i14)) | i10) * (-90)) + (i11 * 46) + (i10 * 46) == 1) {
                a aVar = (a) objArr[0];
                int i15 = f51638r0 + 67;
                f51639s0 = i15 % 128;
                if (i15 % 2 == 0) {
                    a(new Object[]{aVar}, 1709846804, -1709846804, System.identityHashCode(aVar));
                    Unit unit = Unit.INSTANCE;
                    throw null;
                }
                a(new Object[]{aVar}, 1709846804, -1709846804, System.identityHashCode(aVar));
                Unit unit2 = Unit.INSTANCE;
                int i16 = f51639s0;
                int i17 = (i16 & 17) + (i16 | 17);
                f51638r0 = i17 % 128;
                int i18 = i17 % 2;
                return unit2;
            }
            a aVar2 = (a) objArr[0];
            int i19 = f51639s0;
            int i20 = i19 & 97;
            int i21 = i20 + ((i19 ^ 97) | i20);
            f51638r0 = i21 % 128;
            if (i21 % 2 != 0) {
                TerminalProviderIsolationWrapper.setCompoundDrawableTintBlendMode.setX(aVar2.f51640p0, aVar2.f51641q0);
                throw null;
            }
            TerminalProviderIsolationWrapper.setCompoundDrawableTintBlendMode.setX(aVar2.f51640p0, aVar2.f51641q0);
            int i22 = f51638r0;
            int i23 = i22 & 101;
            int i24 = i23 + ((i22 ^ 101) | i23);
            f51639s0 = i24 % 128;
            if (i24 % 2 != 0) {
                return null;
            }
            throw null;
        }

        @Override // kotlin.jvm.functions.Function0
        public final /* synthetic */ Unit invoke() {
            return a(new Object[]{this}, -703283151, 703283152, System.identityHashCode(this));
        }
    }

    static {
        int i10 = f51636b;
        int i11 = i10 & 89;
        int i12 = -(-((i10 ^ 89) | i11));
        int i13 = (i11 & i12) + (i12 | i11);
        f51637c = i13 % 128;
        int i14 = i13 % 2;
    }

    private TsdkManualInitializer() {
    }

    public final void applicationCreated(@NotNull Application application) {
        int i10 = f51637c;
        int i11 = (i10 & 121) + (i10 | 121);
        f51636b = i11 % 128;
        int i12 = i11 % 2;
        Intrinsics.checkNotNullParameter(application, "");
        TerminalProviderIsolationWrapper terminalProviderIsolationWrapper = TerminalProviderIsolationWrapper.setCompoundDrawableTintBlendMode;
        Context applicationContext = application.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "");
        terminalProviderIsolationWrapper.setCompoundDrawableTintBlendMode(applicationContext);
        f51635a = true;
        int i13 = f51636b;
        int i14 = i13 & 7;
        int i15 = i14 + ((i13 ^ 7) | i14);
        f51637c = i15 % 128;
        int i16 = i15 % 2;
    }

    @NotNull
    public final TerminalSdk init(@NotNull Context context) {
        int i10 = f51636b + 115;
        f51637c = i10 % 128;
        if (i10 % 2 == 0) {
            Intrinsics.checkNotNullParameter(context, "");
        } else {
            Intrinsics.checkNotNullParameter(context, "");
        }
        return init$sdk_android_release(context, false);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0032  */
    /* JADX WARN: Code duplicated, block: B:12:0x0043  */
    @NotNull
    public final TerminalSdk init$sdk_android_release(@NotNull Context context, boolean shouldSetLifecycleCallbacks) throws Throwable {
        int i10 = f51636b;
        int i11 = (i10 & 45) + (i10 | 45);
        f51637c = i11 % 128;
        if (i11 % 2 == 0) {
            Intrinsics.checkNotNullParameter(context, "");
            int i12 = 11 / 0;
            if (!shouldSetLifecycleCallbacks) {
                int i13 = f51637c;
                int i14 = ((i13 | 37) << 1) - (i13 ^ 37);
                f51636b = i14 % 128;
                int i15 = i14 % 2;
                if (!f51635a) {
                    mu.setCompoundDrawableTintBlendMode(new Object[]{Integer.valueOf(SuspendTokenIntentService.JOB_ID), null, null, 6}, -1968587119, 1968587120, SuspendTokenIntentService.JOB_ID);
                    pc.setY(new ou(null, null, 10078, null, 11, null));
                    int i16 = f51637c;
                    int i17 = ((i16 | 92) << 1) - (i16 ^ 92);
                    int i18 = (i17 ^ (-1)) + (i17 << 1);
                    f51636b = i18 % 128;
                    int i19 = i18 % 2;
                }
            }
        } else {
            Intrinsics.checkNotNullParameter(context, "");
            if (!shouldSetLifecycleCallbacks) {
                int i110 = f51637c;
                int i111 = ((i110 | 37) << 1) - (i110 ^ 37);
                f51636b = i111 % 128;
                int i112 = i111 % 2;
                if (!f51635a) {
                    mu.setCompoundDrawableTintBlendMode(new Object[]{Integer.valueOf(SuspendTokenIntentService.JOB_ID), null, null, 6}, -1968587119, 1968587120, SuspendTokenIntentService.JOB_ID);
                    pc.setY(new ou(null, null, 10078, null, 11, null));
                    int i113 = f51637c;
                    int i114 = ((i113 | 92) << 1) - (i113 ^ 92);
                    int i115 = (i114 ^ (-1)) + (i114 << 1);
                    f51636b = i115 % 128;
                    int i116 = i115 % 2;
                }
            }
        }
        f51635a = false;
        mu.setCompoundDrawableTintBlendMode(new Object[]{200008, null, null, 6}, -1968587119, 1968587120, 200008);
        vi viVar = vi.setDividerPadding;
        ((TerminalCallbackKt) vi.setOnFocusChangeListener(new Object[0], 711180205, -711180201, (int) System.currentTimeMillis())).setCompoundDrawableTintBlendMode(new setVisibility() { // from class: com.mypinpad.tsdk.api.TsdkManualInitializer.init.1
            @Override // com.mypinpad.tsdk.isolation.setVisibility
            public final void exceptionHandler(@NotNull Throwable throwable) throws Throwable {
                Intrinsics.checkNotNullParameter(throwable, "");
                mu.setCompoundDrawableTintBlendMode(new Object[]{Integer.valueOf(SuspendTokenIntentService.JOB_ID), null, null, 6}, -1968587119, 1968587120, SuspendTokenIntentService.JOB_ID);
                pc.setY(new ou(null, null, 10054, getDisplayExponent.setCompoundDrawableTintBlendMode(getDisplayExponent.setY("100008"), mw.setDividerPadding(throwable)), 3, null));
            }
        }, new a(context, shouldSetLifecycleCallbacks));
        TerminalSdk terminalSdk = TerminalSdk.INSTANCE;
        int i20 = f51637c;
        int i21 = ((i20 ^ 55) | (i20 & 55)) << 1;
        int i22 = -(((~i20) & 55) | (i20 & (-56)));
        int i23 = ((i21 | i22) << 1) - (i22 ^ i21);
        f51636b = i23 % 128;
        if (i23 % 2 == 0) {
            return terminalSdk;
        }
        throw null;
    }
}
