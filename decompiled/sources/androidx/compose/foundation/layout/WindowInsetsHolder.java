package androidx.compose.foundation.layout;

import android.view.View;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.core.graphics.Insets;
import androidx.core.view.DisplayCutoutCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import x.e0;

/* JADX INFO: compiled from: WindowInsets.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0000\u0018\u0000 Y2\u00020\u0001:\u0001YJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0018\u0010\u000b\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\tJ\u000e\u0010\f\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007J\u000e\u0010\r\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007R\u0017\u0010\u0013\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0016\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0010\u001a\u0004\b\u0015\u0010\u0012R\u0017\u0010\u0019\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0010\u001a\u0004\b\u0018\u0010\u0012R\u0017\u0010\u001c\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0010\u001a\u0004\b\u001b\u0010\u0012R\u0017\u0010\u001f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0010\u001a\u0004\b\u001e\u0010\u0012R\u0017\u0010\"\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b \u0010\u0010\u001a\u0004\b!\u0010\u0012R\u0017\u0010%\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b#\u0010\u0010\u001a\u0004\b$\u0010\u0012R\u0017\u0010(\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b&\u0010\u0010\u001a\u0004\b'\u0010\u0012R\u0017\u0010+\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b)\u0010\u0010\u001a\u0004\b*\u0010\u0012R\u0017\u00101\u001a\u00020,8\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u0017\u00107\u001a\u0002028\u0006¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106R\u0017\u0010:\u001a\u0002028\u0006¢\u0006\f\n\u0004\b8\u00104\u001a\u0004\b9\u00106R\u0017\u0010=\u001a\u0002028\u0006¢\u0006\f\n\u0004\b;\u00104\u001a\u0004\b<\u00106R\u0017\u0010@\u001a\u00020,8\u0006¢\u0006\f\n\u0004\b>\u0010.\u001a\u0004\b?\u00100R\u0017\u0010C\u001a\u00020,8\u0006¢\u0006\f\n\u0004\bA\u0010.\u001a\u0004\bB\u00100R\u0017\u0010F\u001a\u00020,8\u0006¢\u0006\f\n\u0004\bD\u0010.\u001a\u0004\bE\u00100R\u0017\u0010I\u001a\u00020,8\u0006¢\u0006\f\n\u0004\bG\u0010.\u001a\u0004\bH\u00100R\u0017\u0010L\u001a\u00020,8\u0006¢\u0006\f\n\u0004\bJ\u0010.\u001a\u0004\bK\u00100R\u0017\u0010O\u001a\u00020,8\u0006¢\u0006\f\n\u0004\bM\u0010.\u001a\u0004\bN\u00100R\u0017\u0010R\u001a\u00020,8\u0006¢\u0006\f\n\u0004\bP\u0010.\u001a\u0004\bQ\u00100R\u0017\u0010X\u001a\u00020S8\u0006¢\u0006\f\n\u0004\bT\u0010U\u001a\u0004\bV\u0010W¨\u0006Z"}, d2 = {"Landroidx/compose/foundation/layout/WindowInsetsHolder;", "", "Landroid/view/View;", "view", "", "incrementAccessors", "decrementAccessors", "Landroidx/core/view/WindowInsetsCompat;", "windowInsets", "", "types", "update", "updateImeAnimationSource", "updateImeAnimationTarget", "Landroidx/compose/foundation/layout/AndroidWindowInsets;", "a", "Landroidx/compose/foundation/layout/AndroidWindowInsets;", "getCaptionBar", "()Landroidx/compose/foundation/layout/AndroidWindowInsets;", "captionBar", "b", "getDisplayCutout", "displayCutout", "c", "getIme", "ime", "d", "getMandatorySystemGestures", "mandatorySystemGestures", "e", "getNavigationBars", "navigationBars", "f", "getStatusBars", "statusBars", "g", "getSystemBars", "systemBars", "h", "getSystemGestures", "systemGestures", "i", "getTappableElement", "tappableElement", "Landroidx/compose/foundation/layout/ValueInsets;", "j", "Landroidx/compose/foundation/layout/ValueInsets;", "getWaterfall", "()Landroidx/compose/foundation/layout/ValueInsets;", "waterfall", "Landroidx/compose/foundation/layout/WindowInsets;", "k", "Landroidx/compose/foundation/layout/WindowInsets;", "getSafeDrawing", "()Landroidx/compose/foundation/layout/WindowInsets;", "safeDrawing", "l", "getSafeGestures", "safeGestures", "m", "getSafeContent", "safeContent", "n", "getCaptionBarIgnoringVisibility", "captionBarIgnoringVisibility", "o", "getNavigationBarsIgnoringVisibility", "navigationBarsIgnoringVisibility", "p", "getStatusBarsIgnoringVisibility", "statusBarsIgnoringVisibility", "q", "getSystemBarsIgnoringVisibility", "systemBarsIgnoringVisibility", "r", "getTappableElementIgnoringVisibility", "tappableElementIgnoringVisibility", "s", "getImeAnimationTarget", "imeAnimationTarget", "t", "getImeAnimationSource", "imeAnimationSource", "", "u", "Z", "getConsumes", "()Z", "consumes", "Companion", "foundation-layout_release"}, k = 1, mv = {1, 8, 0})
public final class WindowInsetsHolder {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @NotNull
    public static final WeakHashMap<View, WindowInsetsHolder> f4417x = new WeakHashMap<>();

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static boolean f4418y;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final AndroidWindowInsets captionBar;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final AndroidWindowInsets displayCutout;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final AndroidWindowInsets ime;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final AndroidWindowInsets mandatorySystemGestures;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final AndroidWindowInsets navigationBars;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final AndroidWindowInsets statusBars;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final AndroidWindowInsets systemBars;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final AndroidWindowInsets systemGestures;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final AndroidWindowInsets tappableElement;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final ValueInsets waterfall;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final WindowInsets safeDrawing;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final WindowInsets safeGestures;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @NotNull
    public final WindowInsets safeContent;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final ValueInsets captionBarIgnoringVisibility;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final ValueInsets navigationBarsIgnoringVisibility;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final ValueInsets statusBarsIgnoringVisibility;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final ValueInsets systemBarsIgnoringVisibility;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final ValueInsets tappableElementIgnoringVisibility;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final ValueInsets imeAnimationTarget;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final ValueInsets imeAnimationSource;

    /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata */
    public final boolean consumes;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f4439v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @NotNull
    public final e0 f4440w;

    /* JADX INFO: compiled from: WindowInsets.android.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000f\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0007\u0010\bR\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010\tR \u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00060\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0010"}, d2 = {"Landroidx/compose/foundation/layout/WindowInsetsHolder$Companion;", "", "", "testInsets", "", "setUseTestInsets", "Landroidx/compose/foundation/layout/WindowInsetsHolder;", "current", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/layout/WindowInsetsHolder;", "Z", "Ljava/util/WeakHashMap;", "Landroid/view/View;", "viewMap", "Ljava/util/WeakHashMap;", "<init>", "()V", "foundation-layout_release"}, k = 1, mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nWindowInsets.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WindowInsets.android.kt\nandroidx/compose/foundation/layout/WindowInsetsHolder$Companion\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,767:1\n76#2:768\n361#3,7:769\n1#4:776\n*S KotlinDebug\n*F\n+ 1 WindowInsets.android.kt\nandroidx/compose/foundation/layout/WindowInsetsHolder$Companion\n*L\n610#1:768\n628#1:769,7\n*E\n"})
    public static final class Companion {

        /* JADX INFO: compiled from: WindowInsets.android.kt */
        @SourceDebugExtension({"SMAP\nWindowInsets.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WindowInsets.android.kt\nandroidx/compose/foundation/layout/WindowInsetsHolder$Companion$current$1\n+ 2 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope\n*L\n1#1,767:1\n63#2,5:768\n*S KotlinDebug\n*F\n+ 1 WindowInsets.android.kt\nandroidx/compose/foundation/layout/WindowInsetsHolder$Companion$current$1\n*L\n615#1:768,5\n*E\n"})
        public static final class a extends Lambda implements Function1<DisposableEffectScope, DisposableEffectResult> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public final /* synthetic */ WindowInsetsHolder f4441p0;

            /* JADX INFO: renamed from: q0, reason: collision with root package name */
            public final /* synthetic */ View f4442q0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(WindowInsetsHolder windowInsetsHolder, View view) {
                super(1);
                this.f4441p0 = windowInsetsHolder;
                this.f4442q0 = view;
            }

            @Override // kotlin.jvm.functions.Function1
            public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
                DisposableEffectScope DisposableEffect = disposableEffectScope;
                Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                final WindowInsetsHolder windowInsetsHolder = this.f4441p0;
                final View view = this.f4442q0;
                windowInsetsHolder.incrementAccessors(view);
                return new DisposableEffectResult() { // from class: androidx.compose.foundation.layout.WindowInsetsHolder$Companion$current$1$invoke$$inlined$onDispose$1
                    @Override // androidx.compose.runtime.DisposableEffectResult
                    public void dispose() {
                        windowInsetsHolder.decrementAccessors(view);
                    }
                };
            }
        }

        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static final AndroidWindowInsets access$systemInsets(Companion companion, WindowInsetsCompat windowInsetsCompat, int i10, String str) {
            companion.getClass();
            AndroidWindowInsets androidWindowInsets = new AndroidWindowInsets(i10, str);
            if (windowInsetsCompat != null) {
                androidWindowInsets.update$foundation_layout_release(windowInsetsCompat, i10);
            }
            return androidWindowInsets;
        }

        public static final ValueInsets access$valueInsetsIgnoringVisibility(Companion companion, WindowInsetsCompat windowInsetsCompat, int i10, String str) {
            Insets insetsIgnoringVisibility;
            companion.getClass();
            if (windowInsetsCompat == null || (insetsIgnoringVisibility = windowInsetsCompat.getInsetsIgnoringVisibility(i10)) == null) {
                insetsIgnoringVisibility = Insets.NONE;
            }
            Intrinsics.checkNotNullExpressionValue(insetsIgnoringVisibility, "windowInsets?.getInsetsI…e) ?: AndroidXInsets.NONE");
            return WindowInsets_androidKt.ValueInsets(insetsIgnoringVisibility, str);
        }

        @Composable
        @NotNull
        public final WindowInsetsHolder current(@Nullable Composer composer, int i10) {
            WindowInsetsHolder windowInsetsHolder;
            composer.startReplaceableGroup(-1366542614);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1366542614, i10, -1, "androidx.compose.foundation.layout.WindowInsetsHolder.Companion.current (WindowInsets.android.kt:608)");
            }
            View view = (View) composer.consume(AndroidCompositionLocals_androidKt.getLocalView());
            synchronized (WindowInsetsHolder.f4417x) {
                try {
                    WeakHashMap weakHashMap = WindowInsetsHolder.f4417x;
                    Object windowInsetsHolder2 = weakHashMap.get(view);
                    if (windowInsetsHolder2 == null) {
                        windowInsetsHolder2 = new WindowInsetsHolder(null, view, null);
                        weakHashMap.put(view, windowInsetsHolder2);
                    }
                    windowInsetsHolder = (WindowInsetsHolder) windowInsetsHolder2;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            EffectsKt.DisposableEffect(windowInsetsHolder, new a(windowInsetsHolder, view), composer, 8);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceableGroup();
            return windowInsetsHolder;
        }

        public final void setUseTestInsets(boolean testInsets) {
            WindowInsetsHolder.f4418y = testInsets;
        }
    }

    public WindowInsetsHolder(WindowInsetsCompat windowInsetsCompat, View view, DefaultConstructorMarker defaultConstructorMarker) {
        DisplayCutoutCompat displayCutout;
        Companion companion = INSTANCE;
        this.captionBar = Companion.access$systemInsets(companion, windowInsetsCompat, WindowInsetsCompat.Type.captionBar(), "captionBar");
        AndroidWindowInsets androidWindowInsetsAccess$systemInsets = Companion.access$systemInsets(companion, windowInsetsCompat, WindowInsetsCompat.Type.displayCutout(), "displayCutout");
        this.displayCutout = androidWindowInsetsAccess$systemInsets;
        AndroidWindowInsets androidWindowInsetsAccess$systemInsets2 = Companion.access$systemInsets(companion, windowInsetsCompat, WindowInsetsCompat.Type.ime(), "ime");
        this.ime = androidWindowInsetsAccess$systemInsets2;
        AndroidWindowInsets androidWindowInsetsAccess$systemInsets3 = Companion.access$systemInsets(companion, windowInsetsCompat, WindowInsetsCompat.Type.mandatorySystemGestures(), "mandatorySystemGestures");
        this.mandatorySystemGestures = androidWindowInsetsAccess$systemInsets3;
        this.navigationBars = Companion.access$systemInsets(companion, windowInsetsCompat, WindowInsetsCompat.Type.navigationBars(), "navigationBars");
        this.statusBars = Companion.access$systemInsets(companion, windowInsetsCompat, WindowInsetsCompat.Type.statusBars(), "statusBars");
        AndroidWindowInsets androidWindowInsetsAccess$systemInsets4 = Companion.access$systemInsets(companion, windowInsetsCompat, WindowInsetsCompat.Type.systemBars(), "systemBars");
        this.systemBars = androidWindowInsetsAccess$systemInsets4;
        AndroidWindowInsets androidWindowInsetsAccess$systemInsets5 = Companion.access$systemInsets(companion, windowInsetsCompat, WindowInsetsCompat.Type.systemGestures(), "systemGestures");
        this.systemGestures = androidWindowInsetsAccess$systemInsets5;
        AndroidWindowInsets androidWindowInsetsAccess$systemInsets6 = Companion.access$systemInsets(companion, windowInsetsCompat, WindowInsetsCompat.Type.tappableElement(), "tappableElement");
        this.tappableElement = androidWindowInsetsAccess$systemInsets6;
        Insets waterfallInsets = (windowInsetsCompat == null || (displayCutout = windowInsetsCompat.getDisplayCutout()) == null || (waterfallInsets = displayCutout.getWaterfallInsets()) == null) ? Insets.NONE : waterfallInsets;
        Intrinsics.checkNotNullExpressionValue(waterfallInsets, "insets?.displayCutout?.w…ts ?: AndroidXInsets.NONE");
        ValueInsets ValueInsets = WindowInsets_androidKt.ValueInsets(waterfallInsets, "waterfall");
        this.waterfall = ValueInsets;
        WindowInsets windowInsetsUnion = WindowInsetsKt.union(WindowInsetsKt.union(androidWindowInsetsAccess$systemInsets4, androidWindowInsetsAccess$systemInsets2), androidWindowInsetsAccess$systemInsets);
        this.safeDrawing = windowInsetsUnion;
        WindowInsets windowInsetsUnion2 = WindowInsetsKt.union(WindowInsetsKt.union(WindowInsetsKt.union(androidWindowInsetsAccess$systemInsets6, androidWindowInsetsAccess$systemInsets3), androidWindowInsetsAccess$systemInsets5), ValueInsets);
        this.safeGestures = windowInsetsUnion2;
        this.safeContent = WindowInsetsKt.union(windowInsetsUnion, windowInsetsUnion2);
        this.captionBarIgnoringVisibility = Companion.access$valueInsetsIgnoringVisibility(companion, windowInsetsCompat, WindowInsetsCompat.Type.captionBar(), "captionBarIgnoringVisibility");
        this.navigationBarsIgnoringVisibility = Companion.access$valueInsetsIgnoringVisibility(companion, windowInsetsCompat, WindowInsetsCompat.Type.navigationBars(), "navigationBarsIgnoringVisibility");
        this.statusBarsIgnoringVisibility = Companion.access$valueInsetsIgnoringVisibility(companion, windowInsetsCompat, WindowInsetsCompat.Type.statusBars(), "statusBarsIgnoringVisibility");
        this.systemBarsIgnoringVisibility = Companion.access$valueInsetsIgnoringVisibility(companion, windowInsetsCompat, WindowInsetsCompat.Type.systemBars(), "systemBarsIgnoringVisibility");
        this.tappableElementIgnoringVisibility = Companion.access$valueInsetsIgnoringVisibility(companion, windowInsetsCompat, WindowInsetsCompat.Type.tappableElement(), "tappableElementIgnoringVisibility");
        this.imeAnimationTarget = Companion.access$valueInsetsIgnoringVisibility(companion, windowInsetsCompat, WindowInsetsCompat.Type.ime(), "imeAnimationTarget");
        this.imeAnimationSource = Companion.access$valueInsetsIgnoringVisibility(companion, windowInsetsCompat, WindowInsetsCompat.Type.ime(), "imeAnimationSource");
        Object parent = view.getParent();
        View view2 = parent instanceof View ? (View) parent : null;
        Object tag = view2 != null ? view2.getTag(androidx.compose.ui.R.id.consume_window_insets_tag) : null;
        Boolean bool = tag instanceof Boolean ? (Boolean) tag : null;
        this.consumes = bool != null ? bool.booleanValue() : true;
        this.f4440w = new e0(this);
    }

    public static /* synthetic */ void update$default(WindowInsetsHolder windowInsetsHolder, WindowInsetsCompat windowInsetsCompat, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        windowInsetsHolder.update(windowInsetsCompat, i10);
    }

    public final void decrementAccessors(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        int i10 = this.f4439v - 1;
        this.f4439v = i10;
        if (i10 == 0) {
            ViewCompat.setOnApplyWindowInsetsListener(view, null);
            ViewCompat.setWindowInsetsAnimationCallback(view, null);
            view.removeOnAttachStateChangeListener(this.f4440w);
        }
    }

    @NotNull
    public final AndroidWindowInsets getCaptionBar() {
        return this.captionBar;
    }

    @NotNull
    public final ValueInsets getCaptionBarIgnoringVisibility() {
        return this.captionBarIgnoringVisibility;
    }

    public final boolean getConsumes() {
        return this.consumes;
    }

    @NotNull
    public final AndroidWindowInsets getDisplayCutout() {
        return this.displayCutout;
    }

    @NotNull
    public final AndroidWindowInsets getIme() {
        return this.ime;
    }

    @NotNull
    public final ValueInsets getImeAnimationSource() {
        return this.imeAnimationSource;
    }

    @NotNull
    public final ValueInsets getImeAnimationTarget() {
        return this.imeAnimationTarget;
    }

    @NotNull
    public final AndroidWindowInsets getMandatorySystemGestures() {
        return this.mandatorySystemGestures;
    }

    @NotNull
    public final AndroidWindowInsets getNavigationBars() {
        return this.navigationBars;
    }

    @NotNull
    public final ValueInsets getNavigationBarsIgnoringVisibility() {
        return this.navigationBarsIgnoringVisibility;
    }

    @NotNull
    public final WindowInsets getSafeContent() {
        return this.safeContent;
    }

    @NotNull
    public final WindowInsets getSafeDrawing() {
        return this.safeDrawing;
    }

    @NotNull
    public final WindowInsets getSafeGestures() {
        return this.safeGestures;
    }

    @NotNull
    public final AndroidWindowInsets getStatusBars() {
        return this.statusBars;
    }

    @NotNull
    public final ValueInsets getStatusBarsIgnoringVisibility() {
        return this.statusBarsIgnoringVisibility;
    }

    @NotNull
    public final AndroidWindowInsets getSystemBars() {
        return this.systemBars;
    }

    @NotNull
    public final ValueInsets getSystemBarsIgnoringVisibility() {
        return this.systemBarsIgnoringVisibility;
    }

    @NotNull
    public final AndroidWindowInsets getSystemGestures() {
        return this.systemGestures;
    }

    @NotNull
    public final AndroidWindowInsets getTappableElement() {
        return this.tappableElement;
    }

    @NotNull
    public final ValueInsets getTappableElementIgnoringVisibility() {
        return this.tappableElementIgnoringVisibility;
    }

    @NotNull
    public final ValueInsets getWaterfall() {
        return this.waterfall;
    }

    public final void incrementAccessors(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        if (this.f4439v == 0) {
            e0 e0Var = this.f4440w;
            ViewCompat.setOnApplyWindowInsetsListener(view, e0Var);
            if (view.isAttachedToWindow()) {
                view.requestApplyInsets();
            }
            view.addOnAttachStateChangeListener(e0Var);
            ViewCompat.setWindowInsetsAnimationCallback(view, e0Var);
        }
        this.f4439v++;
    }

    public final void update(@NotNull WindowInsetsCompat windowInsets, int types) {
        Intrinsics.checkNotNullParameter(windowInsets, "windowInsets");
        if (f4418y) {
            android.view.WindowInsets windowInsets2 = windowInsets.toWindowInsets();
            Intrinsics.checkNotNull(windowInsets2);
            windowInsets = WindowInsetsCompat.toWindowInsetsCompat(windowInsets2);
        }
        Intrinsics.checkNotNullExpressionValue(windowInsets, "if (testInsets) {\n      …   windowInsets\n        }");
        this.captionBar.update$foundation_layout_release(windowInsets, types);
        this.ime.update$foundation_layout_release(windowInsets, types);
        this.displayCutout.update$foundation_layout_release(windowInsets, types);
        this.navigationBars.update$foundation_layout_release(windowInsets, types);
        this.statusBars.update$foundation_layout_release(windowInsets, types);
        this.systemBars.update$foundation_layout_release(windowInsets, types);
        this.systemGestures.update$foundation_layout_release(windowInsets, types);
        this.tappableElement.update$foundation_layout_release(windowInsets, types);
        this.mandatorySystemGestures.update$foundation_layout_release(windowInsets, types);
        if (types == 0) {
            Insets insetsIgnoringVisibility = windowInsets.getInsetsIgnoringVisibility(WindowInsetsCompat.Type.captionBar());
            Intrinsics.checkNotNullExpressionValue(insetsIgnoringVisibility, "insets.getInsetsIgnoring…aptionBar()\n            )");
            this.captionBarIgnoringVisibility.setValue$foundation_layout_release(WindowInsets_androidKt.toInsetsValues(insetsIgnoringVisibility));
            Insets insetsIgnoringVisibility2 = windowInsets.getInsetsIgnoringVisibility(WindowInsetsCompat.Type.navigationBars());
            Intrinsics.checkNotNullExpressionValue(insetsIgnoringVisibility2, "insets.getInsetsIgnoring…ationBars()\n            )");
            this.navigationBarsIgnoringVisibility.setValue$foundation_layout_release(WindowInsets_androidKt.toInsetsValues(insetsIgnoringVisibility2));
            Insets insetsIgnoringVisibility3 = windowInsets.getInsetsIgnoringVisibility(WindowInsetsCompat.Type.statusBars());
            Intrinsics.checkNotNullExpressionValue(insetsIgnoringVisibility3, "insets.getInsetsIgnoring…tatusBars()\n            )");
            this.statusBarsIgnoringVisibility.setValue$foundation_layout_release(WindowInsets_androidKt.toInsetsValues(insetsIgnoringVisibility3));
            Insets insetsIgnoringVisibility4 = windowInsets.getInsetsIgnoringVisibility(WindowInsetsCompat.Type.systemBars());
            Intrinsics.checkNotNullExpressionValue(insetsIgnoringVisibility4, "insets.getInsetsIgnoring…ystemBars()\n            )");
            this.systemBarsIgnoringVisibility.setValue$foundation_layout_release(WindowInsets_androidKt.toInsetsValues(insetsIgnoringVisibility4));
            Insets insetsIgnoringVisibility5 = windowInsets.getInsetsIgnoringVisibility(WindowInsetsCompat.Type.tappableElement());
            Intrinsics.checkNotNullExpressionValue(insetsIgnoringVisibility5, "insets.getInsetsIgnoring…leElement()\n            )");
            this.tappableElementIgnoringVisibility.setValue$foundation_layout_release(WindowInsets_androidKt.toInsetsValues(insetsIgnoringVisibility5));
            DisplayCutoutCompat displayCutout = windowInsets.getDisplayCutout();
            if (displayCutout != null) {
                Insets waterfallInsets = displayCutout.getWaterfallInsets();
                Intrinsics.checkNotNullExpressionValue(waterfallInsets, "cutout.waterfallInsets");
                this.waterfall.setValue$foundation_layout_release(WindowInsets_androidKt.toInsetsValues(waterfallInsets));
            }
        }
        Snapshot.INSTANCE.sendApplyNotifications();
    }

    public final void updateImeAnimationSource(@NotNull WindowInsetsCompat windowInsets) {
        Intrinsics.checkNotNullParameter(windowInsets, "windowInsets");
        Insets insets = windowInsets.getInsets(WindowInsetsCompat.Type.ime());
        Intrinsics.checkNotNullExpressionValue(insets, "windowInsets.getInsets(W…wInsetsCompat.Type.ime())");
        this.imeAnimationSource.setValue$foundation_layout_release(WindowInsets_androidKt.toInsetsValues(insets));
    }

    public final void updateImeAnimationTarget(@NotNull WindowInsetsCompat windowInsets) {
        Intrinsics.checkNotNullParameter(windowInsets, "windowInsets");
        Insets insets = windowInsets.getInsets(WindowInsetsCompat.Type.ime());
        Intrinsics.checkNotNullExpressionValue(insets, "windowInsets.getInsets(W…wInsetsCompat.Type.ime())");
        this.imeAnimationTarget.setValue$foundation_layout_release(WindowInsets_androidKt.toInsetsValues(insets));
    }
}
