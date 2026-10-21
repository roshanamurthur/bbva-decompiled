package com.mypinpad.tsdk.isolation;

import android.content.Context;
import android.media.AudioTrack;
import android.os.Process;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.view.PointerIconCompat;
import androidx.exifinterface.media.ExifInterface;
import com.mypinpad.tsdk.api.TerminalSdk;
import java.lang.reflect.Method;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0002\n\u0002\b\n\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J3\u0010\u0010\u001a\u0002H\u0011\"\u0004\b\u0000\u0010\u00112\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u0002H\u00110\u00042\u0010\b\u0002\u0010\u0013\u001a\n\u0012\u0004\u0012\u0002H\u0011\u0018\u00010\u0014H\u0002¢\u0006\u0002\u0010\u0015J\r\u0010\u0016\u001a\u00020\u0005H\u0000¢\u0006\u0002\b\u0017J\b\u0010\u0018\u001a\u00020\u0019H\u0002J\r\u0010\u001a\u001a\u00020\u0007H\u0000¢\u0006\u0002\b\u001bJ5\u0010\u001c\u001a\u0004\u0018\u0001H\u0011\"\u0004\b\u0000\u0010\u00112\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u0002H\u00110\u00042\u0010\b\u0002\u0010\u0013\u001a\n\u0012\u0004\u0012\u0002H\u0011\u0018\u00010\u0014H\u0002¢\u0006\u0002\u0010\u0015J\r\u0010\u001d\u001a\u00020\tH\u0000¢\u0006\u0002\b\u001eJ\u000f\u0010\u001f\u001a\u0004\u0018\u00010\u000bH\u0000¢\u0006\u0002\b J\r\u0010!\u001a\u00020\rH\u0000¢\u0006\u0002\b\"J\u0015\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u0019H\u0000¢\u0006\u0002\b&J7\u0010'\u001a\u0002H\u0011\"\u0004\b\u0000\u0010\u00112\u0006\u0010(\u001a\u00020\u000f2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u0002H\u00110\u00042\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u0002H\u00110\u0014H\u0002¢\u0006\u0002\u0010)J9\u0010*\u001a\u0004\u0018\u0001H\u0011\"\u0004\b\u0000\u0010\u00112\u0006\u0010(\u001a\u00020\u000f2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u0002H\u00110\u00042\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u0002H\u00110\u0014H\u0002¢\u0006\u0002\u0010)J\u0015\u0010+\u001a\u00020$2\u0006\u0010,\u001a\u00020\u000fH\u0000¢\u0006\u0002\b-R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006."}, d2 = {"Lcom/mypinpad/tsdk/internal/dependencies/ModuleProvider;", "", "()V", "ATTESTATION_API_MODULE_CLASS", "Ljava/lang/Class;", "Lcom/mypinpad/attestation/integration/AttestationModuleApi;", "MONITORING_API_MODULE_CLASS", "Lcom/mypinpad/monitoring/integration/MonitoringModuleApi;", "PIN_API_MODULE_CLASS", "Lcom/mypinpad/pin/integration/PinModuleApi;", "PLAY_INTEGRITY_API_MODULE_CLASS", "Lcom/mypinpad/playintegrity/PlayIntegrityApi;", "SECURITY_API_MODULE_CLASS", "Lcom/mypinpad/security/integration/SecurityModuleApi;", "frameworkService", "Lcom/mypinpad/framework/integration/ModuleFrameworkApi;", "get", ExifInterface.GPS_DIRECTION_TRUE, "moduleClass", "moduleConstructor", "Lkotlin/Function0;", "(Ljava/lang/Class;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "getAttestationApi", "getAttestationApi$sdk_android_release", "getContext", "Landroid/content/Context;", "getMonitoringApi", "getMonitoringApi$sdk_android_release", "getOptional", "getPinApi", "getPinApi$sdk_android_release", "getPlayIntegrityApi", "getPlayIntegrityApi$sdk_android_release", "getSecurityApi", "getSecurityApi$sdk_android_release", "init", "", "context", "init$sdk_android_release", "provideModuleApi", "moduleFrameworkApi", "(Lcom/mypinpad/framework/integration/ModuleFrameworkApi;Ljava/lang/Class;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "provideOptionalModuleApi", "setFrameworkService", "frameworkApi", "setFrameworkService$sdk_android_release", "sdk-android_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class nf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final Class<setDescendantFocusability> f57256a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final Class<getValueQualifier> f57257b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final Class<setBackgroundDrawable> f57258c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final Class<MonitoringModuleApi> f57259d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final Class<setSecondaryProgress> f57260e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public static final getPinPadConfiguration f57261f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static char[] f57262g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static int f57263h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static int f57264i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static int f57265j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static int f57266k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final byte[] f57267l = null;

    @NotNull
    public static final nf setOnFocusChangeListener;

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/mypinpad/tsdk/i/HandlePinPadLaunchRequestResult;", "setY", "()Lcom/mypinpad/tsdk/i/HandlePinPadLaunchRequestResult;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class a extends Lambda implements Function0<MonitoringModuleApi> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final a f57268p0 = new a();

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public static int f57269q0 = 0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public static int f57270r0 = 1;

        static {
            int i10 = f57269q0 + 113;
            f57270r0 = i10 % 128;
            if (i10 % 2 == 0) {
                int i11 = 69 / 0;
            }
        }

        public a() {
            super(0);
        }

        public static /* synthetic */ MonitoringModuleApi a(Object[] objArr, int i10, int i11, int i12) {
            int i13 = (i11 * 334) + (i10 * (-665));
            int i14 = ~i10;
            int i15 = (i14 * (-333)) + i13;
            int i16 = ~i12;
            if ((((~(i14 | i12)) | (~(i11 | i16))) * 333) + (((~(i14 | i16)) | (~(i11 | i12))) * 333) + i15 != 1) {
                component33 component33Var = component33.INSTANCE;
                pd pdVar = pd.INSTANCE;
                setColorFilter setcolorfilter = new setColorFilter(new b7(pdVar), new c7(pdVar));
                vi viVar = vi.setDividerPadding;
                MonitoringModuleApi monitoringModuleApi = (MonitoringModuleApi) component33.setDividerPadding(new Object[]{setcolorfilter, (TerminalCallbackKt) vi.setOnFocusChangeListener(new Object[0], 711180205, -711180201, (int) System.currentTimeMillis())}, -2140932970, 2140932970, (int) System.currentTimeMillis());
                int i17 = f57270r0;
                int i18 = (i17 & 21) + (i17 | 21);
                f57269q0 = i18 % 128;
                int i19 = i18 % 2;
                return monitoringModuleApi;
            }
            a aVar = (a) objArr[0];
            int i20 = f57269q0;
            int i21 = i20 & 13;
            int i22 = ((((i20 ^ 13) | i21) << 1) - (~(-((i20 | 13) & (~i21))))) - 1;
            f57270r0 = i22 % 128;
            int i23 = i22 % 2;
            MonitoringModuleApi monitoringModuleApiA = a(new Object[]{aVar}, -1345487451, 1345487451, System.identityHashCode(aVar));
            int i24 = f57270r0;
            int i25 = ((i24 | 75) << 1) - (i24 ^ 75);
            f57269q0 = i25 % 128;
            if (i25 % 2 == 0) {
                return monitoringModuleApiA;
            }
            throw null;
        }

        @Override // kotlin.jvm.functions.Function0
        public final /* synthetic */ MonitoringModuleApi invoke() {
            return a(new Object[]{this}, 1924406406, -1924406405, System.identityHashCode(this));
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/mypinpad/tsdk/i/setBackgroundDrawable;", "setOnFocusChangeListener", "()Lcom/mypinpad/tsdk/i/setBackgroundDrawable;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class b extends Lambda implements Function0<setBackgroundDrawable> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final b f57271p0 = new b();

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public static int f57272q0 = 0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public static int f57273r0 = 1;

        static {
            int i10 = f57273r0;
            int i11 = i10 ^ 17;
            int i12 = -(-((i10 & 17) << 1));
            int i13 = (i11 ^ i12) + ((i12 & i11) << 1);
            f57272q0 = i13 % 128;
            int i14 = i13 % 2;
        }

        public b() {
            super(0);
        }

        public static /* synthetic */ setBackgroundDrawable a(Object[] objArr, int i10, int i11, int i12) {
            int i13 = (i11 * 246) + (i10 * (-244));
            int i14 = ~i11;
            int i15 = (((~((~i12) | i14)) | (~(i14 | i10))) * (-245)) + i13;
            int i16 = ~(i14 | i12);
            if (((i10 | i16) * 245) + (i16 * (-245)) + i15 == 1) {
                b bVar = (b) objArr[0];
                int i17 = f57272q0;
                int i18 = i17 & 5;
                int i19 = -(-(i17 | 5));
                int i20 = ((i18 | i19) << 1) - (i19 ^ i18);
                f57273r0 = i20 % 128;
                Object[] objArr2 = new Object[1];
                if (i20 % 2 != 0) {
                    objArr2[0] = bVar;
                    return a(objArr2, -1282221945, 1282221945, System.identityHashCode(bVar));
                }
                objArr2[0] = bVar;
                int i21 = 78 / 0;
                return a(objArr2, -1282221945, 1282221945, System.identityHashCode(bVar));
            }
            int i22 = f57273r0;
            int i23 = i22 & 43;
            int i24 = (i22 ^ 43) | i23;
            int i25 = (i23 ^ i24) + ((i24 & i23) << 1);
            f57272q0 = i25 % 128;
            int i26 = i25 % 2;
            component26 component26Var = component26.INSTANCE;
            setBackgroundDrawable setbackgrounddrawable = (setBackgroundDrawable) component26.setOnFocusChangeListener(new Object[0], -1326539077, 1326539077, (int) System.currentTimeMillis());
            int i27 = f57273r0 + 99;
            f57272q0 = i27 % 128;
            if (i27 % 2 == 0) {
                return setbackgrounddrawable;
            }
            int i28 = 61 / 0;
            return setbackgrounddrawable;
        }

        @Override // kotlin.jvm.functions.Function0
        public final /* synthetic */ setBackgroundDrawable invoke() {
            return a(new Object[]{this}, 1408437330, -1408437329, System.identityHashCode(this));
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/mypinpad/tsdk/i/setSecondaryProgress;", "setOnFocusChangeListener", "()Lcom/mypinpad/tsdk/i/setSecondaryProgress;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class c extends Lambda implements Function0<setSecondaryProgress> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final c f57274p0 = new c();

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public static final int f57275q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public static int f57276r0 = 1;

        static {
            int i10 = f57276r0 + 73;
            f57275q0 = i10 % 128;
            if (i10 % 2 != 0) {
                int i11 = 56 / 0;
            }
        }

        public c() {
            super(0);
        }

        public static /* synthetic */ setSecondaryProgress a(Object[] objArr, int i10, int i11, int i12) {
            int i13 = ~i10;
            int i14 = ~i12;
            int i15 = ~(i13 | i14);
            int i16 = ~i11;
            int i17 = i13 | i16;
            int i18 = (((~(i10 | i16 | i12)) | (~(i11 | i13 | i12)) | (~(i17 | i14))) * 867) + (((~i17) | (~(i13 | i12)) | (~(i16 | i12))) * (-1734)) + ((i15 | (~(i16 | i14))) * (-867)) + (i11 * 868) + (i10 * 868);
            int i19 = f57275q0;
            if (i18 == 1) {
                setTitleMarginStart settitlemarginstart = setTitleMarginStart.INSTANCE;
                Context onFocusChangeListener = nf.setOnFocusChangeListener(nf.setOnFocusChangeListener);
                mj mjVar = mj.INSTANCE;
                setSecondaryProgress setsecondaryprogress = (setSecondaryProgress) setTitleMarginStart.setY(new Object[]{onFocusChangeListener, new setColorFilter(new e7(mjVar), new d7(mjVar))}, 40538597, -40538597, (int) System.currentTimeMillis());
                int i20 = i19 & 93;
                int i21 = i20 + ((i19 ^ 93) | i20);
                f57276r0 = i21 % 128;
                int i22 = i21 % 2;
                return setsecondaryprogress;
            }
            c cVar = (c) objArr[0];
            int i23 = i19 & 61;
            int i24 = -(-(i19 | 61));
            int i25 = ((i23 | i24) << 1) - (i23 ^ i24);
            f57276r0 = i25 % 128;
            Object[] objArr2 = new Object[1];
            if (i25 % 2 != 0) {
                objArr2[0] = cVar;
                return a(objArr2, -1553340077, 1553340078, System.identityHashCode(cVar));
            }
            objArr2[0] = cVar;
            a(objArr2, -1553340077, 1553340078, System.identityHashCode(cVar));
            throw null;
        }

        @Override // kotlin.jvm.functions.Function0
        public final /* synthetic */ setSecondaryProgress invoke() {
            return a(new Object[]{this}, -1264627623, 1264627623, System.identityHashCode(this));
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/mypinpad/tsdk/i/setDescendantFocusability;", "setCompoundDrawableTintBlendMode", "()Lcom/mypinpad/tsdk/i/setDescendantFocusability;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class d extends Lambda implements Function0<setDescendantFocusability> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final d f57277p0 = new d();

        static {
            int i10 = 1 + 97;
            int i11 = i10 % 128;
            if (i10 % 2 != 0) {
                int i12 = 80 / 0;
            }
        }

        public d() {
            super(0);
        }

        public static /* synthetic */ setDescendantFocusability a(Object[] objArr, int i10, int i11, int i12) {
            int i13 = ((~(i11 | i12)) * TypedValues.CycleType.TYPE_EASING) + (i11 * 421) + (i10 * (-419));
            int i14 = ~i10;
            if ((((~(i14 | (~i11))) | (~(i11 | (~i12)))) * TypedValues.CycleType.TYPE_EASING) + ((i11 | i14) * (-420)) + i13 == 1) {
                d dVar = (d) objArr[0];
                return a(new Object[]{dVar}, 792271413, -792271413, System.identityHashCode(dVar));
            }
            setScrollingCacheEnabled setscrollingcacheenabled = setScrollingCacheEnabled.INSTANCE;
            Context onFocusChangeListener = nf.setOnFocusChangeListener(nf.setOnFocusChangeListener);
            ss ssVar = ss.setCompoundDrawableTintBlendMode;
            setColorFilter setcolorfilter = new setColorFilter(new f7(ssVar), new g7(ssVar));
            vi viVar = vi.setDividerPadding;
            return (setDescendantFocusability) setScrollingCacheEnabled.setCompoundDrawableTintBlendMode(new Object[]{onFocusChangeListener, (TerminalCallbackKt) vi.setOnFocusChangeListener(new Object[0], 711180205, -711180201, (int) System.currentTimeMillis()), setcolorfilter}, -2064713275, 2064713275, (int) System.currentTimeMillis());
        }

        @Override // kotlin.jvm.functions.Function0
        public final /* synthetic */ setDescendantFocusability invoke() {
            return a(new Object[]{this}, -126340561, 126340562, System.identityHashCode(this));
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/mypinpad/tsdk/i/getValueQualifier;", "setCompoundDrawableTintBlendMode", "()Lcom/mypinpad/tsdk/i/getValueQualifier;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class e extends Lambda implements Function0<getValueQualifier> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final e f57278p0 = new e();

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public static int f57279q0 = 0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public static int f57280r0 = 1;

        static {
            int i10 = f57279q0;
            int i11 = (((i10 & (-50)) | ((~i10) & 49)) - (~((i10 & 49) << 1))) - 1;
            f57280r0 = i11 % 128;
            if (i11 % 2 == 0) {
                throw null;
            }
        }

        public e() {
            super(0);
        }

        public static /* synthetic */ getValueQualifier a(Object[] objArr, int i10, int i11, int i12) {
            getValueQualifier getvaluequalifierA;
            int i13 = (i11 * (-500)) + (i10 * (-500));
            int i14 = ~i11;
            int i15 = ~(i14 | i10);
            int i16 = ~i10;
            if (((~(i16 | (~i12) | i11)) * 501) + ((~(i14 | i16)) * 1002) + ((i15 | (~(i16 | i11 | i12))) * 501) + i13 != 1) {
                setNextFocusDownId setnextfocusdownid = setNextFocusDownId.INSTANCE;
                Context onFocusChangeListener = nf.setOnFocusChangeListener(nf.setOnFocusChangeListener);
                mk mkVar = mk.setOnFocusChangeListener;
                setColorFilter setcolorfilter = new setColorFilter(new i7(mkVar), new h7(mkVar));
                String version = TerminalSdk.getVersion();
                String emvLibVersion = TerminalSdk.getEmvLibVersion();
                vi viVar = vi.setDividerPadding;
                getvaluequalifierA = (getValueQualifier) setNextFocusDownId.setY(new Object[]{onFocusChangeListener, setcolorfilter, version, emvLibVersion, (TerminalCallbackKt) vi.setOnFocusChangeListener(new Object[0], -294985573, 294985579, (int) System.currentTimeMillis())}, 1254842923, -1254842923, (int) System.currentTimeMillis());
                int i17 = f57280r0;
                int i18 = i17 & 125;
                int i19 = (i17 ^ 125) | i18;
                int i20 = (i18 & i19) + (i19 | i18);
                f57279q0 = i20 % 128;
                if (i20 % 2 != 0) {
                    throw null;
                }
            } else {
                e eVar = (e) objArr[0];
                int i21 = f57279q0;
                int i22 = i21 & 109;
                int i23 = ((i21 ^ 109) | i22) << 1;
                int i24 = -((i21 | 109) & (~i22));
                int i25 = (i23 & i24) + (i24 | i23);
                f57280r0 = i25 % 128;
                Object[] objArr2 = new Object[1];
                if (i25 % 2 == 0) {
                    objArr2[0] = eVar;
                    getvaluequalifierA = a(objArr2, -1929608880, 1929608880, System.identityHashCode(eVar));
                    int i26 = 23 / 0;
                } else {
                    objArr2[0] = eVar;
                    getvaluequalifierA = a(objArr2, -1929608880, 1929608880, System.identityHashCode(eVar));
                }
                int i27 = f57279q0 + 75;
                f57280r0 = i27 % 128;
                if (i27 % 2 == 0) {
                    int i28 = 63 / 0;
                }
            }
            return getvaluequalifierA;
        }

        @Override // kotlin.jvm.functions.Function0
        public final /* synthetic */ getValueQualifier invoke() {
            return a(new Object[]{this}, 283422084, -283422083, System.identityHashCode(this));
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroid/content/Context;", "setY", "()Landroid/content/Context;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class f extends Lambda implements Function0<Context> {

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public static int f57281q0 = 0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public static int f57282r0 = 1;

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Context f57283p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Context context) {
            super(0);
            this.f57283p0 = context;
        }

        public static /* synthetic */ Context a(Object[] objArr, int i10, int i11, int i12) {
            int i13 = ~i10;
            int i14 = i13 | i11;
            int i15 = (((~i14) | (~(i13 | i12)) | (~(i11 | i12))) * (-754)) + (i11 * (-753)) + (i10 * 755);
            int i16 = ~(i14 | i12);
            int i17 = ~i12;
            if (((i13 | i17) * 754) + (((~(i10 | i17 | i11)) | i16) * (-754)) + i15 != 1) {
                f fVar = (f) objArr[0];
                int i18 = f57281q0;
                int i19 = (i18 | 109) << 1;
                int i20 = -(((~i18) & 109) | (i18 & (-110)));
                int i21 = (i19 ^ i20) + ((i20 & i19) << 1);
                f57282r0 = i21 % 128;
                int i22 = i21 % 2;
                Context contextA = a(new Object[]{fVar}, 657726472, -657726471, System.identityHashCode(fVar));
                int i23 = f57282r0;
                int i24 = ((i23 & 2) + (i23 | 2)) - 1;
                f57281q0 = i24 % 128;
                int i25 = i24 % 2;
                return contextA;
            }
            f fVar2 = (f) objArr[0];
            int i26 = f57281q0;
            int i27 = (i26 & 85) + (i26 | 85);
            f57282r0 = i27 % 128;
            int i28 = i27 % 2;
            Context applicationContext = fVar2.f57283p0.getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext, "");
            int i29 = f57282r0;
            int i30 = i29 ^ 25;
            int i31 = -(-((i29 & 25) << 1));
            int i32 = ((i30 | i31) << 1) - (i31 ^ i30);
            f57281q0 = i32 % 128;
            if (i32 % 2 == 0) {
                return applicationContext;
            }
            int i33 = 66 / 0;
            return applicationContext;
        }

        @Override // kotlin.jvm.functions.Function0
        public final /* synthetic */ Context invoke() {
            return a(new Object[]{this}, -2045050190, 2045050190, System.identityHashCode(this));
        }
    }

    static {
        c();
        f57265j = 0;
        f57266k = 1;
        f57263h = 0;
        f57264i = 1;
        e();
        setOnFocusChangeListener = new nf();
        f57256a = setDescendantFocusability.class;
        f57257b = getValueQualifier.class;
        f57258c = setBackgroundDrawable.class;
        f57259d = MonitoringModuleApi.class;
        f57260e = setSecondaryProgress.class;
        TerminalSession terminalSession = TerminalSession.INSTANCE;
        f57261f = (getPinPadConfiguration) TerminalSession.setX(new Object[0], 1006508601, -1006508601, (int) System.currentTimeMillis());
        int i10 = f57263h + 123;
        f57264i = i10 % 128;
        int i11 = i10 % 2;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x011d  */
    /* JADX WARN: Code duplicated, block: B:33:0x011e A[Catch: all -> 0x00c5, TryCatch #0 {all -> 0x00c5, blocks: (B:7:0x0032, B:11:0x009d, B:10:0x0053, B:30:0x00ff, B:34:0x0166, B:44:0x01f9, B:48:0x025a, B:47:0x0211, B:33:0x011e, B:37:0x017a, B:41:0x01e5, B:40:0x019a), top: B:77:0x0032 }] */
    /* JADX WARN: Code duplicated, block: B:36:0x0177  */
    /* JADX WARN: Code duplicated, block: B:39:0x0199  */
    /* JADX WARN: Code duplicated, block: B:40:0x019a A[Catch: all -> 0x00c5, TryCatch #0 {all -> 0x00c5, blocks: (B:7:0x0032, B:11:0x009d, B:10:0x0053, B:30:0x00ff, B:34:0x0166, B:44:0x01f9, B:48:0x025a, B:47:0x0211, B:33:0x011e, B:37:0x017a, B:41:0x01e5, B:40:0x019a), top: B:77:0x0032 }] */
    public static void a(String str, boolean z10, int[] iArr, Object[] objArr) throws Throwable {
        int i10;
        int i11;
        int i12;
        char c10;
        Map map;
        Object method;
        Map map2;
        Object method2;
        byte[] bytes = str.getBytes("ISO-8859-1");
        setNavigationOnClickListener setnavigationonclicklistener = new setNavigationOnClickListener();
        int i13 = iArr[0];
        int i14 = 1;
        int i15 = iArr[1];
        int i16 = 2;
        int i17 = iArr[2];
        int i18 = iArr[3];
        char[] cArr = f57262g;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i19 = 0;
            while (i19 < length) {
                int i20 = f57265j + 25;
                f57266k = i20 % 128;
                int i21 = i20 % i16;
                try {
                    Object[] objArr2 = new Object[i14];
                    objArr2[0] = Integer.valueOf(cArr[i19]);
                    Map map3 = setTextScaleX.setMaxEms;
                    Object method3 = map3.get(-637734149);
                    if (method3 == null) {
                        Class cls = (Class) setTextScaleX.setX((char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 1), (Process.myPid() >> 22) + 37, 609 - View.combineMeasuredStates(0, 0));
                        byte b10 = (byte) 0;
                        byte b11 = (byte) (b10 - 1);
                        Object[] objArr3 = new Object[1];
                        b(b10, b11, (byte) (b11 + 4), objArr3);
                        method3 = cls.getMethod((String) objArr3[0], Integer.TYPE);
                        map3.put(-637734149, method3);
                    }
                    cArr2[i19] = ((Character) ((Method) method3).invoke(null, objArr2)).charValue();
                    i19++;
                    int i22 = f57266k + 53;
                    f57265j = i22 % 128;
                    int i23 = i22 % 2;
                    length = length;
                    cArr = cArr;
                    i17 = i17;
                    i18 = i18;
                    i14 = 1;
                    i16 = 2;
                } catch (Throwable th2) {
                    Throwable cause = th2.getCause();
                    if (cause == null) {
                        throw th2;
                    }
                    throw cause;
                }
            }
            i10 = i17;
            i11 = i18;
            cArr = cArr2;
        } else {
            i10 = i17;
            i11 = i18;
        }
        char[] cArr3 = new char[i15];
        System.arraycopy(cArr, i13, cArr3, 0, i15);
        if (bytes != null) {
            char[] cArr4 = new char[i15];
            setnavigationonclicklistener.setX = 0;
            char c11 = 0;
            while (true) {
                int i24 = setnavigationonclicklistener.setX;
                if (i24 >= i15) {
                    break;
                }
                int i25 = f57265j + 23;
                f57266k = i25 % 128;
                if (i25 % 2 != 0) {
                    c10 = 1;
                    if (bytes[i24] == 1) {
                        char c12 = cArr3[i24];
                        Object[] objArr4 = new Object[2];
                        objArr4[c10] = Integer.valueOf(c11);
                        objArr4[0] = Integer.valueOf(c12);
                        map2 = setTextScaleX.setMaxEms;
                        method2 = map2.get(1737824323);
                        if (method2 != null) {
                            Class cls2 = (Class) setTextScaleX.setX((char) ((ViewConfiguration.getScrollDefaultDelay() >> 16) + 4449), 41 - TextUtils.indexOf((CharSequence) "", '0'), TextUtils.indexOf("", "", 0) + PointerIconCompat.TYPE_GRABBING);
                            byte b12 = (byte) 0;
                            byte b13 = (byte) (b12 - 1);
                            Object[] objArr5 = new Object[1];
                            b(b12, b13, (byte) (b13 + 1), objArr5);
                            String str2 = (String) objArr5[0];
                            Class<?> cls3 = Integer.TYPE;
                            method2 = cls2.getMethod(str2, cls3, cls3);
                            map2.put(1737824323, method2);
                        }
                        cArr4[i24] = ((Character) ((Method) method2).invoke(null, objArr4)).charValue();
                    } else {
                        Object[] objArr6 = {Integer.valueOf(cArr3[i24]), Integer.valueOf(c11)};
                        map = setTextScaleX.setMaxEms;
                        method = map.get(-504758789);
                        if (method != null) {
                            Class cls4 = (Class) setTextScaleX.setX((char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), 44 - TextUtils.lastIndexOf("", '0', 0), 2627 - (ViewConfiguration.getWindowTouchSlop() >> 8));
                            byte b14 = (byte) 0;
                            Object[] objArr7 = new Object[1];
                            b(b14, (byte) (b14 - 1), (byte) f57267l.length, objArr7);
                            String str3 = (String) objArr7[0];
                            Class<?> cls5 = Integer.TYPE;
                            method = cls4.getMethod(str3, cls5, cls5);
                            map.put(-504758789, method);
                        }
                        cArr4[i24] = ((Character) ((Method) method).invoke(null, objArr6)).charValue();
                    }
                } else if (bytes[i24] == 0) {
                    c10 = 1;
                    char c13 = cArr3[i24];
                    Object[] objArr8 = new Object[2];
                    objArr8[c10] = Integer.valueOf(c11);
                    objArr8[0] = Integer.valueOf(c13);
                    map2 = setTextScaleX.setMaxEms;
                    method2 = map2.get(1737824323);
                    if (method2 != null) {
                        Class cls6 = (Class) setTextScaleX.setX((char) ((ViewConfiguration.getScrollDefaultDelay() >> 16) + 4449), 41 - TextUtils.indexOf((CharSequence) "", '0'), TextUtils.indexOf("", "", 0) + PointerIconCompat.TYPE_GRABBING);
                        byte b15 = (byte) 0;
                        byte b16 = (byte) (b15 - 1);
                        Object[] objArr9 = new Object[1];
                        b(b15, b16, (byte) (b16 + 1), objArr9);
                        String str4 = (String) objArr9[0];
                        Class<?> cls7 = Integer.TYPE;
                        method2 = cls6.getMethod(str4, cls7, cls7);
                        map2.put(1737824323, method2);
                    }
                    cArr4[i24] = ((Character) ((Method) method2).invoke(null, objArr8)).charValue();
                } else {
                    Object[] objArr10 = {Integer.valueOf(cArr3[i24]), Integer.valueOf(c11)};
                    map = setTextScaleX.setMaxEms;
                    method = map.get(-504758789);
                    if (method != null) {
                        Class cls8 = (Class) setTextScaleX.setX((char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), 44 - TextUtils.lastIndexOf("", '0', 0), 2627 - (ViewConfiguration.getWindowTouchSlop() >> 8));
                        byte b17 = (byte) 0;
                        Object[] objArr11 = new Object[1];
                        b(b17, (byte) (b17 - 1), (byte) f57267l.length, objArr11);
                        String str5 = (String) objArr11[0];
                        Class<?> cls9 = Integer.TYPE;
                        method = cls8.getMethod(str5, cls9, cls9);
                        map.put(-504758789, method);
                    }
                    cArr4[i24] = ((Character) ((Method) method).invoke(null, objArr10)).charValue();
                }
                c11 = cArr4[setnavigationonclicklistener.setX];
                Object[] objArr12 = {setnavigationonclicklistener, setnavigationonclicklistener};
                Map map4 = setTextScaleX.setMaxEms;
                Object method4 = map4.get(-265085633);
                if (method4 == null) {
                    Class cls10 = (Class) setTextScaleX.setX((char) ((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 31347), 48 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 840 - (KeyEvent.getMaxKeyCode() >> 16));
                    byte b18 = (byte) 0;
                    byte b19 = (byte) (b18 - 1);
                    Object[] objArr13 = new Object[1];
                    b(b18, b19, (byte) (-b19), objArr13);
                    method4 = cls10.getMethod((String) objArr13[0], Object.class, Object.class);
                    map4.put(-265085633, method4);
                }
                ((Method) method4).invoke(null, objArr12);
            }
            cArr3 = cArr4;
        }
        if (i11 > 0) {
            int i26 = f57265j + 43;
            f57266k = i26 % 128;
            int i27 = i26 % 2;
            char[] cArr5 = new char[i15];
            i12 = 0;
            System.arraycopy(cArr3, 0, cArr5, 0, i15);
            int i28 = i15 - i11;
            int i29 = i11;
            System.arraycopy(cArr5, 0, cArr3, i28, i29);
            System.arraycopy(cArr5, i29, cArr3, 0, i28);
        } else {
            i12 = 0;
        }
        if (z10) {
            char[] cArr6 = new char[i15];
            while (true) {
                setnavigationonclicklistener.setX = i12;
                int i30 = setnavigationonclicklistener.setX;
                if (i30 >= i15) {
                    break;
                }
                int i31 = f57266k + 111;
                f57265j = i31 % 128;
                if (i31 % 2 != 0) {
                    cArr6[i30] = cArr3[(i15 - i30) >>> 1];
                    i12 = i30 / 0;
                } else {
                    cArr6[i30] = cArr3[(i15 - i30) - 1];
                    i12 = i30 + 1;
                }
            }
            cArr3 = cArr6;
        }
        if (i10 > 0) {
            int i32 = 0;
            while (true) {
                setnavigationonclicklistener.setX = i32;
                i32 = setnavigationonclicklistener.setX;
                if (i32 >= i15) {
                    break;
                }
                int i33 = f57265j + 93;
                f57266k = i33 % 128;
                if (i33 % 2 == 0) {
                    cArr3[i32] = (char) (cArr3[i32] - iArr[5]);
                } else {
                    cArr3[i32] = (char) (cArr3[i32] - iArr[2]);
                    i32++;
                }
            }
        }
        objArr[0] = new String(cArr3);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0028  */
    /* JADX WARN: Code duplicated, block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x0034). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0028
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static void b(byte r6, byte r7, int r8, java.lang.Object[] r9) {
        /*
            int r7 = r7 + 4
            int r8 = 101 - r8
            int r6 = r6 * 2
            int r0 = 1 - r6
            byte[] r0 = new byte[r0]
            r1 = 0
            int r6 = 0 - r6
            byte[] r2 = com.mypinpad.tsdk.isolation.nf.f57267l
            if (r2 != 0) goto L18
            r4 = r1
            r3 = r2
            r2 = r0
            r0 = r9
            r9 = r8
            r8 = r7
            goto L34
        L18:
            r3 = r1
        L19:
            byte r4 = (byte) r8
            int r7 = r7 + 1
            r0[r3] = r4
            if (r3 != r6) goto L28
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r1)
            r9[r1] = r6
            return
        L28:
            int r3 = r3 + 1
            r4 = r2[r7]
            r5 = r8
            r8 = r7
            r7 = r4
            r4 = r3
            r3 = r2
            r2 = r0
            r0 = r9
            r9 = r5
        L34:
            int r7 = r7 + r9
            r9 = r0
            r0 = r2
            r2 = r3
            r3 = r4
            r5 = r8
            r8 = r7
            r7 = r5
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.nf.b(byte, byte, int, java.lang.Object[]):void");
    }

    public static void c() {
        f57267l = new byte[]{33, -116, -123, 116};
    }

    public static <T> T d(Class<T> cls, Function0<? extends T> function0) throws Throwable {
        Object x4;
        if (function0 == null) {
            return null;
        }
        int i10 = f57263h + 41;
        f57264i = i10 % 128;
        int i11 = i10 % 2;
        getPinPadConfiguration getpinpadconfiguration = f57261f;
        T t10 = (T) getpinpadconfiguration.setOnFocusChangeListener(cls);
        if (t10 != null) {
            return t10;
        }
        int i12 = f57263h + 107;
        f57264i = i12 % 128;
        int i13 = i12 % 2;
        try {
            getpinpadconfiguration.setOnFocusChangeListener(cls, new k7(function0));
            x4 = getpinpadconfiguration.setOnFocusChangeListener(cls);
            int i14 = f57264i + 7;
            f57263h = i14 % 128;
            int i15 = i14 % 2;
        } catch (setNavigationIcon unused) {
            mr mrVar = mr.setOnFocusChangeListener;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(cls.getSimpleName());
            Object[] objArr = new Object[1];
            a("\u0000\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001", true, new int[]{0, 27, 0, 0}, objArr);
            sb2.append(((String) objArr[0]).intern());
            mt.setX(new Object[]{sb2.toString()}, 383964057, -383964053, (int) System.currentTimeMillis());
            x4 = getpinpadconfiguration.setX(cls);
        }
        int i16 = f57263h + 85;
        int i17 = i16 % 128;
        f57264i = i17;
        if (i16 % 2 == 0) {
            int i18 = 29 / 0;
        }
        int i19 = i17 + 39;
        f57263h = i19 % 128;
        int i20 = i19 % 2;
        return (T) x4;
    }

    public static void e() {
        f57262g = new char[]{59047, 59121, 59129, 59131, 59135, 59123, 59120, 59131, 59131, 59134, 59134, 59089, 59097, 59131, 59127, 59126, 59134, 59130, 59123, 59093, 59095, 59133, 59109, 59129, 59132, 59083, 59043, 59045, 59134, 59134, 59120, 59135, 59123, 59124, 59122, 59133, 59095, 59043, 59083, 59132, 59129, 59109, 59133, 59095, 59089, 59131, 59100, 59090, 59131, 59108, 59103};
    }

    public static <T> T f(Class<T> cls, Function0<? extends T> function0) throws Throwable {
        Object x4;
        int i10 = f57264i + 65;
        f57263h = i10 % 128;
        if (i10 % 2 != 0) {
            throw null;
        }
        getPinPadConfiguration getpinpadconfiguration = f57261f;
        if (function0 != null) {
            T t10 = (T) getpinpadconfiguration.setOnFocusChangeListener(cls);
            if (t10 == null) {
                int i11 = f57264i + 35;
                f57263h = i11 % 128;
                int i12 = i11 % 2;
                try {
                    getpinpadconfiguration.setOnFocusChangeListener(cls, new j7(function0));
                    x4 = getpinpadconfiguration.setX(cls);
                } catch (init e5) {
                    mr mrVar = mr.setOnFocusChangeListener;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(cls.getSimpleName());
                    Object[] objArr = new Object[1];
                    a("\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0000", false, new int[]{27, 24, 0, 9}, objArr);
                    sb2.append(((String) objArr[0]).intern());
                    mt.setX(new Object[]{sb2.toString()}, 1760239564, -1760239563, (int) System.currentTimeMillis());
                    throw e5;
                } catch (setNavigationIcon unused) {
                    mr mrVar2 = mr.setOnFocusChangeListener;
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(cls.getSimpleName());
                    Object[] objArr2 = new Object[1];
                    a("\u0000\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001", true, new int[]{0, 27, 0, 0}, objArr2);
                    sb3.append(((String) objArr2[0]).intern());
                    mt.setX(new Object[]{sb3.toString()}, 383964057, -383964053, (int) System.currentTimeMillis());
                    x4 = getpinpadconfiguration.setX(cls);
                }
                t10 = (T) x4;
                int i13 = f57263h + 67;
                f57264i = i13 % 128;
                int i14 = i13 % 2;
            }
            if (t10 != null) {
                return t10;
            }
        }
        T t11 = (T) getpinpadconfiguration.setX(cls);
        int i15 = f57263h + 1;
        f57264i = i15 % 128;
        int i16 = i15 % 2;
        return t11;
    }

    @NotNull
    public static setDescendantFocusability setCompoundDrawableTintBlendMode() {
        int i10 = f57263h + 103;
        f57264i = i10 % 128;
        int i11 = i10 % 2;
        Class<setDescendantFocusability> cls = f57256a;
        if (i11 == 0) {
            throw null;
        }
        setDescendantFocusability setdescendantfocusability = (setDescendantFocusability) f(cls, d.f57277p0);
        int i12 = f57264i + 47;
        f57263h = i12 % 128;
        if (i12 % 2 == 0) {
            return setdescendantfocusability;
        }
        throw null;
    }

    @Nullable
    public static setSecondaryProgress setDividerPadding() {
        return (setSecondaryProgress) setCompoundDrawableTintBlendMode(new Object[0], 1091921433, -1091921433, (int) System.currentTimeMillis());
    }

    public static final Context setOnFocusChangeListener(nf nfVar) {
        Context context;
        int i10 = f57263h + 115;
        f57264i = i10 % 128;
        int i11 = i10 % 2;
        nfVar.getClass();
        int i12 = f57263h + 101;
        f57264i = i12 % 128;
        if (i12 % 2 == 0) {
            context = (Context) setCompoundDrawableTintBlendMode(new Object[]{Context.class}, -1302526898, 1302526899, (int) System.currentTimeMillis());
            int i13 = 72 / 0;
        } else {
            context = (Context) setCompoundDrawableTintBlendMode(new Object[]{Context.class}, -1302526898, 1302526899, (int) System.currentTimeMillis());
        }
        int i14 = f57263h + 19;
        f57264i = i14 % 128;
        int i15 = i14 % 2;
        return context;
    }

    public static void setX(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        f57261f.setOnFocusChangeListener(Context.class, new f(context));
        int i10 = f57264i + 23;
        f57263h = i10 % 128;
        int i11 = i10 % 2;
    }

    @NotNull
    public static setBackgroundDrawable setY() {
        setBackgroundDrawable setbackgrounddrawable;
        int i10 = f57264i + 9;
        f57263h = i10 % 128;
        int i11 = i10 % 2;
        Class<setBackgroundDrawable> cls = f57258c;
        if (i11 != 0) {
            setbackgrounddrawable = (setBackgroundDrawable) f(cls, b.f57271p0);
            int i12 = 48 / 0;
        } else {
            setbackgrounddrawable = (setBackgroundDrawable) f(cls, b.f57271p0);
        }
        int i13 = f57264i + 53;
        f57263h = i13 % 128;
        int i14 = i13 % 2;
        return setbackgrounddrawable;
    }

    public static /* synthetic */ Object setCompoundDrawableTintBlendMode(Object[] objArr, int i10, int i11, int i12) throws Throwable {
        Object objF;
        int i13 = ~((~i10) | i11);
        int i14 = ~i12;
        int i15 = (((~(i14 | i11)) | i13) * (-1188)) + (i11 * (-1187)) + (i10 * 595);
        int i16 = ~i11;
        int i17 = (~(i12 | i16)) | i13;
        int i18 = ~(i14 | i10);
        if ((((~(i10 | i16)) | (~(i16 | i14)) | i18) * 594) + ((i17 | i18) * 594) + i15 != 1) {
            int i19 = f57264i + 117;
            f57263h = i19 % 128;
            int i20 = i19 % 2;
            Class<setSecondaryProgress> cls = f57260e;
            if (i20 != 0) {
                objF = (setSecondaryProgress) d(cls, c.f57274p0);
                int i21 = 71 / 0;
            } else {
                objF = (setSecondaryProgress) d(cls, c.f57274p0);
            }
            int i22 = f57264i + 117;
            f57263h = i22 % 128;
            if (i22 % 2 != 0) {
                throw null;
            }
        } else {
            Class cls2 = (Class) objArr[0];
            int i23 = f57263h + 51;
            f57264i = i23 % 128;
            int i24 = i23 % 2;
            objF = f(cls2, null);
            if (i24 == 0) {
                int i25 = 20 / 0;
            }
            int i26 = f57264i + 125;
            f57263h = i26 % 128;
            int i27 = i26 % 2;
        }
        return objF;
    }

    @NotNull
    public static MonitoringModuleApi setX() {
        int i10 = f57263h + 1;
        f57264i = i10 % 128;
        int i11 = i10 % 2;
        MonitoringModuleApi monitoringModuleApi = (MonitoringModuleApi) f(f57259d, a.f57268p0);
        int i12 = f57264i + 53;
        f57263h = i12 % 128;
        int i13 = i12 % 2;
        return monitoringModuleApi;
    }

    @NotNull
    public static getValueQualifier setOnFocusChangeListener() {
        int i10 = f57263h + 105;
        f57264i = i10 % 128;
        int i11 = i10 % 2;
        getValueQualifier getvaluequalifier = (getValueQualifier) f(f57257b, e.f57278p0);
        int i12 = f57263h + 7;
        f57264i = i12 % 128;
        if (i12 % 2 == 0) {
            int i13 = 14 / 0;
        }
        return getvaluequalifier;
    }
}
