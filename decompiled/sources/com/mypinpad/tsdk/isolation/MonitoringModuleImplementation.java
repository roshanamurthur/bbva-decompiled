package com.mypinpad.tsdk.isolation;

import android.graphics.Color;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.core.view.PointerIconCompat;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.mypinpad.tsdk.i.component30, reason: from Kotlin metadata */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0016\u0010\u001d\u001a\u00020\u00172\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\u0002J\u0016\u0010\u001e\u001a\u00020\u00172\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00170 H\u0002J\b\u0010!\u001a\u00020\u0017H\u0016J\b\u0010\"\u001a\u00020\u0017H\u0016J\u000e\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\u0002J\u0010\u0010$\u001a\u00020\u00172\u0006\u0010%\u001a\u00020\u0013H\u0016JU\u0010&\u001a\u00020\u00172\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010'\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\n2+\u0010\u0010\u001a'\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00130\u0012¢\u0006\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b(\u0016\u0012\u0004\u0012\u00020\u00170\u0011j\u0002`\u0018H\u0016J\u0012\u0010(\u001a\u00020\u00172\b\b\u0002\u0010)\u001a\u00020*H\u0002R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R7\u0010\u0010\u001a+\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00130\u0012¢\u0006\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b(\u0016\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0011j\u0004\u0018\u0001`\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006+"}, d2 = {"Lcom/mypinpad/monitoring/implementation/MonitoringModuleImplementation;", "Lcom/mypinpad/monitoring/integration/MonitoringModuleApi;", "logger", "Lcom/mypinpad/common/logging/Logger;", "threadPool", "Lcom/mypinpad/common/threading/ThreadPool;", "monitoringEventStorage", "Lcom/mypinpad/monitoring/implementation/MonitoringEventStorage;", "(Lcom/mypinpad/common/logging/Logger;Lcom/mypinpad/common/threading/ThreadPool;Lcom/mypinpad/monitoring/implementation/MonitoringEventStorage;)V", "batchIntervalMillisThreshold", "", "batchSizeThreshold", "", "instanceId", "", "maximumBatchSize", "onReportCallback", "Lkotlin/Function1;", "", "Lcom/mypinpad/monitoring/integration/EventData;", "Lkotlin/ParameterName;", "name", "events", "", "Lcom/mypinpad/monitoring/integration/ReportCallback;", "reportingLock", "", "scheduledExecutorService", "Ljava/util/concurrent/ScheduledExecutorService;", "addEvents", "async", "task", "Lkotlin/Function0;", "clearReportCallback", "flushEvents", "getEventsForBatch", "raiseEvent", "eventData", "setReportCallback", "batchWaitingThresholdMillis", "submitEventsIfNeeded", "flush", "", "android-monitoring-module.implementation"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class MonitoringModuleImplementation implements MonitoringModuleApi {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final long f54902i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f54903j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final char f54904k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static int f54905l;
    public static int m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static int f54906n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static int f54907o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final byte[] f54908p = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final setColorFilter f54909a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final TerminalCallbackKt f54910b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final component31 f54911c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f54912d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f54913e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public Function1<? super List<? extends getCode>, Unit> f54914f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final Object f54915g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Nullable
    public ScheduledExecutorService f54916h;

    /* JADX INFO: renamed from: com.mypinpad.tsdk.i.component30$a */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "setX", "()V"}, k = 3, mv = {1, 5, 1}, xi = 48)
    public static final class a extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public static int f54917r0 = 0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public static int f54918s0 = 1;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ long f54920q0 = 2000;

        public a() {
            super(0);
        }

        public static /* synthetic */ Unit a(Object[] objArr, int i10, int i11, int i12) {
            int i13 = (i11 * 971) + (i10 * (-1939));
            int i14 = ~i11;
            int i15 = ~(i14 | i10);
            int i16 = ~((~i12) | i11);
            int i17 = ~i10;
            if ((((~(i17 | i14)) | i16) * 970) + ((~(i11 | i17)) * 1940) + ((i15 | i16) * (-970)) + i13 == 1) {
                a aVar = (a) objArr[0];
                int i18 = f54917r0;
                int i19 = i18 ^ 29;
                int i20 = ((i18 & 29) | i19) << 1;
                int i21 = -i19;
                int i22 = (i20 & i21) + (i20 | i21);
                f54918s0 = i22 % 128;
                int i23 = i22 % 2;
                a(new Object[]{aVar}, 80088792, -80088792, System.identityHashCode(aVar));
                Unit unit = Unit.INSTANCE;
                int i24 = f54918s0;
                int i25 = (i24 ^ 41) + ((i24 & 41) << 1);
                f54917r0 = i25 % 128;
                if (i25 % 2 == 0) {
                    return unit;
                }
                throw null;
            }
            a aVar2 = (a) objArr[0];
            int i26 = f54918s0;
            int i27 = i26 & 93;
            int i28 = (i26 | 93) & (~i27);
            int i29 = i27 << 1;
            int i30 = (i28 & i29) + (i28 | i29);
            f54917r0 = i30 % 128;
            int i31 = i30 % 2;
            setColorFilter.setCompoundDrawableTintBlendMode(new Object[]{MonitoringModuleImplementation.setX(MonitoringModuleImplementation.this), 1, null, null, 6}, 1173867142, -1173867141, 1);
            MonitoringModuleImplementation monitoringModuleImplementation = MonitoringModuleImplementation.this;
            ScheduledExecutorService dividerPadding = MonitoringModuleImplementation.setDividerPadding(monitoringModuleImplementation);
            if (dividerPadding != null) {
                int i32 = f54918s0;
                int i33 = i32 & 7;
                int i34 = (((i32 | 7) & (~i33)) - (~(-(-(i33 << 1))))) - 1;
                f54917r0 = i34 % 128;
                int i35 = i34 % 2;
                dividerPadding.shutdownNow();
                int i36 = f54918s0;
                int i37 = (-2) - (((i36 & 98) + (i36 | 98)) ^ (-1));
                f54917r0 = i37 % 128;
                int i38 = i37 % 2;
            }
            ScheduledExecutorService scheduledExecutorServiceNewSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor();
            long j10 = aVar2.f54920q0;
            scheduledExecutorServiceNewSingleThreadScheduledExecutor.scheduleWithFixedDelay(new k3(monitoringModuleImplementation, 0), j10, j10, TimeUnit.MILLISECONDS);
            Unit unit2 = Unit.INSTANCE;
            MonitoringModuleImplementation.setCompoundDrawableTintBlendMode(monitoringModuleImplementation, scheduledExecutorServiceNewSingleThreadScheduledExecutor);
            int i39 = f54917r0;
            int i40 = i39 & 47;
            int i41 = (i39 ^ 47) | i40;
            int i42 = ((i40 | i41) << 1) - (i41 ^ i40);
            f54918s0 = i42 % 128;
            if (i42 % 2 != 0) {
                return null;
            }
            int i43 = 61 / 0;
            return null;
        }

        @Override // kotlin.jvm.functions.Function0
        public final /* synthetic */ Unit invoke() {
            return a(new Object[]{this}, -98981867, 98981868, System.identityHashCode(this));
        }
    }

    /* JADX INFO: renamed from: com.mypinpad.tsdk.i.component30$b */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "setY", "()V"}, k = 3, mv = {1, 5, 1}, xi = 48)
    public static final class b extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ getCode f54922q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(getCode getcode) {
            super(0);
            this.f54922q0 = getcode;
        }

        public static /* synthetic */ Unit a(Object[] objArr, int i10, int i11, int i12) {
            int i13 = (i11 * 253) + (i10 * 253);
            int i14 = ~i10;
            int i15 = ~i11;
            int i16 = ~(i14 | i15);
            int i17 = i15 | (~i12);
            int i18 = i16 | (~i17);
            int i19 = i11 | i10;
            int i20 = ~(i12 | i19);
            if ((((~(i10 | i17)) | i20) * 252) + (i19 * (-252)) + ((i18 | i20) * (-252)) + i13 == 1) {
                b bVar = (b) objArr[0];
                a(new Object[]{bVar}, 1128839514, -1128839514, System.identityHashCode(bVar));
                return Unit.INSTANCE;
            }
            b bVar2 = (b) objArr[0];
            component31 component31Var = (component31) MonitoringModuleImplementation.setX(new Object[]{MonitoringModuleImplementation.this}, 1064033728, -1064033727, (int) System.currentTimeMillis());
            MonitoringModuleImplementation monitoringModuleImplementation = MonitoringModuleImplementation.this;
            getCode getcode = bVar2.f54922q0;
            synchronized (component31Var) {
                ((component31) MonitoringModuleImplementation.setX(new Object[]{monitoringModuleImplementation}, 1064033728, -1064033727, (int) System.currentTimeMillis())).setDividerPadding(getcode);
                Unit unit = Unit.INSTANCE;
            }
            MonitoringModuleImplementation.setX(new Object[]{MonitoringModuleImplementation.this}, 535478887, -535478887, (int) System.currentTimeMillis());
            return null;
        }

        @Override // kotlin.jvm.functions.Function0
        public final /* synthetic */ Unit invoke() {
            return a(new Object[]{this}, 1765890117, -1765890116, System.identityHashCode(this));
        }
    }

    /* JADX INFO: renamed from: com.mypinpad.tsdk.i.component30$c */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "setX", "()V"}, k = 3, mv = {1, 5, 1}, xi = 48)
    public static final class c extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public static int f54923q0 = 0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public static int f54924r0 = 1;

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f54925p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Function0<Unit> function0) {
            super(0);
            this.f54925p0 = function0;
        }

        public static /* synthetic */ Unit a(Object[] objArr, int i10, int i11, int i12) {
            int i13 = (~i10) | (~i12);
            if (((i10 | (~(i11 | i12))) * 519) + (((~(i13 | i11)) | (~(i10 | i11 | i12))) * (-519)) + (((~i13) | i11) * 519) + (i11 * (-518)) + (i10 * (-518)) != 1) {
                c cVar = (c) objArr[0];
                int i14 = f54924r0 + 105;
                f54923q0 = i14 % 128;
                if (i14 % 2 == 0) {
                    a(new Object[]{cVar}, -1839829066, 1839829067, System.identityHashCode(cVar));
                    return Unit.INSTANCE;
                }
                a(new Object[]{cVar}, -1839829066, 1839829067, System.identityHashCode(cVar));
                Unit unit = Unit.INSTANCE;
                throw null;
            }
            c cVar2 = (c) objArr[0];
            int i15 = f54923q0;
            int i16 = ((i15 ^ 97) | (i15 & 97)) << 1;
            int i17 = -(((~i15) & 97) | (i15 & (-98)));
            int i18 = (i16 & i17) + (i17 | i16);
            f54924r0 = i18 % 128;
            if (i18 % 2 == 0) {
                cVar2.f54925p0.invoke();
                throw null;
            }
            cVar2.f54925p0.invoke();
            int i19 = f54924r0;
            int i20 = (((i19 | 39) << 1) - (~(-(i19 ^ 39)))) - 1;
            f54923q0 = i20 % 128;
            if (i20 % 2 == 0) {
                return null;
            }
            throw null;
        }

        @Override // kotlin.jvm.functions.Function0
        public final /* synthetic */ Unit invoke() {
            return a(new Object[]{this}, -996773384, 996773384, System.identityHashCode(this));
        }
    }

    /* JADX INFO: renamed from: com.mypinpad.tsdk.i.component30$d */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "setY", "()V"}, k = 3, mv = {1, 5, 1}, xi = 48)
    public static final class d extends Lambda implements Function0<Unit> {
        public d() {
            super(0);
        }

        public static /* synthetic */ Unit a(Object[] objArr, int i10, int i11, int i12) {
            int i13 = ~i10;
            int i14 = ~i11;
            int i15 = ~i12;
            if ((((~(i10 | i11)) | (~(i13 | i15))) * 564) + ((~(i12 | i13 | i11)) * 1128) + (((~(i14 | i15)) | i13 | (~(i11 | i12))) * (-564)) + (i11 * 565) + (i10 * (-563)) != 1) {
                MonitoringModuleImplementation.setCompoundDrawableTintBlendMode(MonitoringModuleImplementation.this);
                return null;
            }
            d dVar = (d) objArr[0];
            a(new Object[]{dVar}, 1655909199, -1655909199, System.identityHashCode(dVar));
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function0
        public final /* synthetic */ Unit invoke() {
            return a(new Object[]{this}, 438855309, -438855308, System.identityHashCode(this));
        }
    }

    /* JADX INFO: renamed from: com.mypinpad.tsdk.i.component30$setX */
    public static final class setX extends setVisibility {
        public setX() {
        }

        public static /* synthetic */ Object setOnFocusChangeListener(Object[] objArr, int i10, int i11, int i12) {
            setX setx = (setX) objArr[0];
            Throwable th2 = (Throwable) objArr[1];
            Intrinsics.checkNotNullParameter(th2, "");
            setColorFilter.setCompoundDrawableTintBlendMode(new Object[]{MonitoringModuleImplementation.setX(MonitoringModuleImplementation.this), 3, null, th2, 2}, 1173867142, -1173867141, 3);
            return null;
        }

        @Override // com.mypinpad.tsdk.isolation.setVisibility
        public final void exceptionHandler(@NotNull Throwable th2) {
            setOnFocusChangeListener(new Object[]{this, th2}, -1521326900, 1521326900, System.identityHashCode(this));
        }
    }

    static {
        c();
        f54906n = 0;
        f54907o = 1;
        f54905l = 0;
        m = 1;
        f54904k = (char) 30296;
        f54902i = -2443367703579691432L;
        f54903j = -1296860687;
    }

    public MonitoringModuleImplementation(setColorFilter setcolorfilter, TerminalCallbackKt terminalCallbackKt, component31 component31Var, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        component31Var = (i10 & 4) != 0 ? setCompoundDrawablesWithIntrinsicBounds.INSTANCE : component31Var;
        Intrinsics.checkNotNullParameter(setcolorfilter, "");
        Intrinsics.checkNotNullParameter(terminalCallbackKt, "");
        Intrinsics.checkNotNullParameter(component31Var, "");
        this.f54909a = setcolorfilter;
        this.f54910b = terminalCallbackKt;
        this.f54911c = component31Var;
        this.f54912d = 20;
        this.f54913e = 100L;
        this.f54915g = new Object();
    }

    public static void a(char c10, int i10, Object[] objArr) throws Throwable {
        char[] charArray;
        int i11 = f54907o;
        int i12 = i11 + 91;
        f54906n = i12 % 128;
        int i13 = i12 % 2;
        int i14 = i11 + 119;
        f54906n = i14 % 128;
        int i15 = 0;
        if (i14 % 2 != 0) {
            charArray = "銡輽".toCharArray();
            int i16 = 6 / 0;
        } else {
            charArray = "銡輽".toCharArray();
        }
        char[] charArray2 = "\u0000\u0000\u0000\u0000".toCharArray();
        char[] charArray3 = "\u2fe2塩䈼㊢".toCharArray();
        UiMessageCallbackKtWhenMappings uiMessageCallbackKtWhenMappings = new UiMessageCallbackKtWhenMappings();
        int length = charArray3.length;
        char[] cArr = new char[length];
        int length2 = charArray2.length;
        char[] cArr2 = new char[length2];
        System.arraycopy(charArray3, 0, cArr, 0, length);
        System.arraycopy(charArray2, 0, cArr2, 0, length2);
        cArr[0] = (char) (cArr[0] ^ c10);
        cArr2[2] = (char) (cArr2[2] + ((char) i10));
        int length3 = charArray.length;
        char[] cArr3 = new char[length3];
        uiMessageCallbackKtWhenMappings.setX = 0;
        while (uiMessageCallbackKtWhenMappings.setX < length3) {
            try {
                Object[] objArr2 = new Object[1];
                objArr2[i15] = uiMessageCallbackKtWhenMappings;
                Map map = setTextScaleX.setMaxEms;
                Object method = map.get(20564334);
                if (method == null) {
                    Class cls = (Class) setTextScaleX.setX((char) (TextUtils.indexOf("", "") + 50678), 38 - Process.getGidForName(""), (ViewConfiguration.getJumpTapTimeout() >> 16) + 1737);
                    byte b10 = (byte) i15;
                    byte b11 = b10;
                    Object[] objArr3 = new Object[1];
                    b(b10, b11, b11, objArr3);
                    method = cls.getMethod((String) objArr3[0], Object.class);
                    map.put(20564334, method);
                }
                int iIntValue = ((Integer) ((Method) method).invoke(null, objArr2)).intValue();
                Object[] objArr4 = {uiMessageCallbackKtWhenMappings};
                Object method2 = map.get(-68974155);
                if (method2 == null) {
                    Class cls2 = (Class) setTextScaleX.setX((char) (8126 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), 37 - (ViewConfiguration.getScrollBarSize() >> 8), View.combineMeasuredStates(0, 0) + 646);
                    byte b12 = (byte) 0;
                    byte b13 = b12;
                    Object[] objArr5 = new Object[1];
                    b(b12, b13, (byte) (b13 + 3), objArr5);
                    method2 = cls2.getMethod((String) objArr5[0], Object.class);
                    map.put(-68974155, method2);
                }
                int iIntValue2 = ((Integer) ((Method) method2).invoke(null, objArr4)).intValue();
                Object[] objArr6 = {uiMessageCallbackKtWhenMappings, Integer.valueOf(cArr[uiMessageCallbackKtWhenMappings.setX % 4] * 32718), Integer.valueOf(cArr2[iIntValue])};
                Object method3 = map.get(-1108711559);
                if (method3 == null) {
                    Class cls3 = (Class) setTextScaleX.setX((char) (ExpandableListView.getPackedPositionChild(0L) + 1), Color.argb(0, 0, 0, 0) + 49, (ViewConfiguration.getKeyRepeatDelay() >> 16) + 434);
                    byte b14 = (byte) 0;
                    byte b15 = b14;
                    Object[] objArr7 = new Object[1];
                    b(b14, b15, (byte) (b15 + 1), objArr7);
                    String str = (String) objArr7[0];
                    Class<?> cls4 = Integer.TYPE;
                    method3 = cls3.getMethod(str, Object.class, cls4, cls4);
                    map.put(-1108711559, method3);
                }
                ((Method) method3).invoke(null, objArr6);
                Object[] objArr8 = {Integer.valueOf(cArr[iIntValue2] * 32718), Integer.valueOf(cArr2[iIntValue])};
                Object method4 = map.get(533021397);
                if (method4 == null) {
                    Class cls5 = (Class) setTextScaleX.setX((char) (Gravity.getAbsoluteGravity(0, 0) + 4449), 41 - ((byte) KeyEvent.getModifierMetaStateMask()), TextUtils.getCapsMode("", 0, 0) + PointerIconCompat.TYPE_GRABBING);
                    byte b16 = (byte) 0;
                    byte b17 = b16;
                    Object[] objArr9 = new Object[1];
                    b(b16, b17, (byte) (b17 | 6), objArr9);
                    String str2 = (String) objArr9[0];
                    Class<?> cls6 = Integer.TYPE;
                    method4 = cls5.getMethod(str2, cls6, cls6);
                    map.put(533021397, method4);
                }
                cArr2[iIntValue2] = ((Character) ((Method) method4).invoke(null, objArr8)).charValue();
                char c11 = uiMessageCallbackKtWhenMappings.setDividerPadding;
                cArr[iIntValue2] = c11;
                int i17 = uiMessageCallbackKtWhenMappings.setX;
                cArr3[i17] = (char) (((((long) (c11 ^ charArray[i17])) ^ (f54902i ^ (-2443367703579691432L))) ^ ((long) ((int) (((long) f54903j) ^ (-2443367703579691432L))))) ^ ((long) ((char) (((long) f54904k) ^ (-2443367703579691432L)))));
                uiMessageCallbackKtWhenMappings.setX = i17 + 1;
                int i18 = f54906n + 93;
                f54907o = i18 % 128;
                int i19 = i18 % 2;
                length3 = length3;
                cArr3 = cArr3;
                i15 = 0;
            } catch (Throwable th2) {
                Throwable cause = th2.getCause();
                if (cause == null) {
                    throw th2;
                }
                throw cause;
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
            int r6 = r6 * 3
            int r6 = 4 - r6
            int r8 = r8 + 113
            int r7 = r7 * 2
            int r0 = 1 - r7
            byte[] r0 = new byte[r0]
            r1 = 0
            int r7 = 0 - r7
            byte[] r2 = com.mypinpad.tsdk.isolation.MonitoringModuleImplementation.f54908p
            if (r2 != 0) goto L1a
            r4 = r1
            r3 = r2
            r2 = r0
            r0 = r9
            r9 = r8
            r8 = r7
            goto L34
        L1a:
            r3 = r1
        L1b:
            byte r4 = (byte) r8
            r0[r3] = r4
            if (r3 != r7) goto L28
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r1)
            r9[r1] = r6
            return
        L28:
            int r3 = r3 + 1
            r4 = r2[r6]
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
            int r6 = r6 + 1
            r9 = r0
            r0 = r2
            r2 = r3
            r3 = r4
            r5 = r8
            r8 = r7
            r7 = r5
            goto L1b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.MonitoringModuleImplementation.b(byte, byte, int, java.lang.Object[]):void");
    }

    public static void c() {
        f54908p = new byte[]{58, 35, -30, 127};
    }

    public static final /* synthetic */ void setCompoundDrawableTintBlendMode(MonitoringModuleImplementation monitoringModuleImplementation) {
        int i10 = m + 91;
        f54905l = i10 % 128;
        int i11 = i10 % 2;
        monitoringModuleImplementation.e(true);
        int i12 = f54905l + 29;
        m = i12 % 128;
        if (i12 % 2 == 0) {
            throw null;
        }
    }

    public static final /* synthetic */ ScheduledExecutorService setDividerPadding(MonitoringModuleImplementation monitoringModuleImplementation) {
        int i10 = f54905l;
        int i11 = i10 + 17;
        m = i11 % 128;
        int i12 = i11 % 2;
        ScheduledExecutorService scheduledExecutorService = monitoringModuleImplementation.f54916h;
        if (i12 == 0) {
            throw null;
        }
        int i13 = i10 + 105;
        m = i13 % 128;
        if (i13 % 2 == 0) {
            int i14 = 23 / 0;
        }
        return scheduledExecutorService;
    }

    public static /* synthetic */ Object setX(Object[] objArr, int i10, int i11, int i12) {
        int i13 = ~i10;
        int i14 = ~i12;
        int i15 = ~(i13 | i14);
        int i16 = ~(i13 | i11);
        int i17 = (((~(i14 | i11)) | i15 | i16) * (-397)) + (i11 * (-396)) + (i10 * 398);
        if ((((~(i10 | (~i11))) | i12 | i16) * 397) + (i16 * (-397)) + i17 == 1) {
            MonitoringModuleImplementation monitoringModuleImplementation = (MonitoringModuleImplementation) objArr[0];
            int i18 = f54905l + 53;
            m = i18 % 128;
            if (i18 % 2 != 0) {
                return monitoringModuleImplementation.f54911c;
            }
            component31 component31Var = monitoringModuleImplementation.f54911c;
            throw null;
        }
        MonitoringModuleImplementation monitoringModuleImplementation2 = (MonitoringModuleImplementation) objArr[0];
        int i19 = f54905l + 23;
        m = i19 % 128;
        int i20 = i19 % 2;
        monitoringModuleImplementation2.e(false);
        int i21 = m + 105;
        f54905l = i21 % 128;
        if (i21 % 2 == 0) {
            return null;
        }
        throw null;
    }

    public final void d(Function0<Unit> function0) {
        this.f54910b.setCompoundDrawableTintBlendMode(new setX(), new c(function0));
        int i10 = m + 21;
        f54905l = i10 % 128;
        if (i10 % 2 != 0) {
            throw null;
        }
    }

    public final void e(boolean z10) {
        if (z10 || this.f54911c.setDividerPadding() >= this.f54912d) {
            synchronized (this.f54915g) {
                Function1<? super List<? extends getCode>, Unit> function1 = this.f54914f;
                if (function1 != null) {
                    List<getCode> listF = f();
                    if (!listF.isEmpty()) {
                        try {
                            function1.invoke(listF);
                            setColorFilter setcolorfilter = this.f54909a;
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(listF.size());
                            Object[] objArr = new Object[1];
                            a((char) (TextUtils.getTrimmedLength("") + 41538), TextUtils.getOffsetBefore("", 0), objArr);
                            sb2.append(((String) objArr[0]).intern());
                            sb2.append(this.f54911c.setDividerPadding());
                            setColorFilter.setCompoundDrawableTintBlendMode(new Object[]{setcolorfilter, 4, getDisplayExponent.setY(sb2.toString()), null, 4}, 1173867142, -1173867141, 4);
                        } catch (Exception e5) {
                            setColorFilter.setCompoundDrawableTintBlendMode(new Object[]{this.f54909a, 5, null, e5, 2}, 1173867142, -1173867141, 5);
                            d(new l3(this, listF));
                            int i10 = f54905l + 103;
                            m = i10 % 128;
                            if (i10 % 2 == 0) {
                                throw null;
                            }
                        }
                    }
                    Unit unit = Unit.INSTANCE;
                }
            }
        }
    }

    public final List<getCode> f() {
        List<getCode> onFocusChangeListener;
        synchronized (this.f54911c) {
            onFocusChangeListener = this.f54911c.setOnFocusChangeListener(Long.valueOf(this.f54913e));
        }
        return onFocusChangeListener;
    }

    @Override // com.mypinpad.tsdk.isolation.MonitoringModuleApi
    public final void setOnFocusChangeListener() {
        setColorFilter.setCompoundDrawableTintBlendMode(new Object[]{this.f54909a, 2, null, null, 6}, 1173867142, -1173867141, 2);
        ScheduledExecutorService scheduledExecutorService = this.f54916h;
        if (scheduledExecutorService != null) {
            int i10 = f54905l + 91;
            m = i10 % 128;
            int i11 = i10 % 2;
            scheduledExecutorService.shutdownNow();
        }
        this.f54916h = null;
        this.f54914f = null;
        int i12 = m + 25;
        f54905l = i12 % 128;
        if (i12 % 2 != 0) {
            throw null;
        }
    }

    public static final /* synthetic */ void setCompoundDrawableTintBlendMode(MonitoringModuleImplementation monitoringModuleImplementation, ScheduledExecutorService scheduledExecutorService) {
        int i10 = m + 7;
        int i11 = i10 % 128;
        f54905l = i11;
        int i12 = i10 % 2;
        monitoringModuleImplementation.f54916h = scheduledExecutorService;
        if (i12 != 0) {
            int i13 = 21 / 0;
        }
        int i14 = i11 + 75;
        m = i14 % 128;
        if (i14 % 2 == 0) {
            throw null;
        }
    }

    @Override // com.mypinpad.tsdk.isolation.MonitoringModuleApi
    public final void setDividerPadding(@NotNull String str, int i10, long j10, long j11, @NotNull Function1<? super List<? extends getCode>, Unit> function1) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(function1, "");
        this.f54912d = 20;
        this.f54913e = 100L;
        this.f54914f = function1;
        d(new a());
        int i11 = m + 83;
        f54905l = i11 % 128;
        int i12 = i11 % 2;
    }

    public static final /* synthetic */ setColorFilter setX(MonitoringModuleImplementation monitoringModuleImplementation) {
        int i10 = m + 99;
        int i11 = i10 % 128;
        f54905l = i11;
        int i12 = i10 % 2;
        setColorFilter setcolorfilter = monitoringModuleImplementation.f54909a;
        int i13 = i11 + 23;
        m = i13 % 128;
        int i14 = i13 % 2;
        return setcolorfilter;
    }

    public final void setX() {
        d(new d());
        int i10 = m + 11;
        f54905l = i10 % 128;
        int i11 = i10 % 2;
    }

    @Override // com.mypinpad.tsdk.isolation.MonitoringModuleApi
    public final void setDividerPadding(@NotNull getCode getcode) {
        Intrinsics.checkNotNullParameter(getcode, "");
        d(new b(getcode));
        int i10 = f54905l + 115;
        m = i10 % 128;
        if (i10 % 2 == 0) {
            throw null;
        }
    }

    public static final /* synthetic */ component31 setOnFocusChangeListener(MonitoringModuleImplementation monitoringModuleImplementation) {
        return (component31) setX(new Object[]{monitoringModuleImplementation}, 1064033728, -1064033727, (int) System.currentTimeMillis());
    }
}
