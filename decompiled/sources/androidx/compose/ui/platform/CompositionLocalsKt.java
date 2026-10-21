package androidx.compose.ui.platform;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.ExperimentalComposeUiApi;
import androidx.compose.ui.autofill.Autofill;
import androidx.compose.ui.autofill.AutofillTree;
import androidx.compose.ui.focus.FocusManager;
import androidx.compose.ui.hapticfeedback.HapticFeedback;
import androidx.compose.ui.input.InputModeManager;
import androidx.compose.ui.input.pointer.PointerIconService;
import androidx.compose.ui.node.Owner;
import androidx.compose.ui.text.ExperimentalTextApi;
import androidx.compose.ui.text.font.Font;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.input.PlatformTextInputPluginRegistry;
import androidx.compose.ui.text.input.TextInputService;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Deprecated;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: CompositionLocals.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000¨\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a2\u0010\b\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0011\u0010\u0007\u001a\r\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\b\u0006H\u0001¢\u0006\u0004\b\b\u0010\t\"\u001f\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\n8\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"(\u0010\u0016\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\n8GX\u0087\u0004¢\u0006\u0012\n\u0004\b\u0012\u0010\r\u0012\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0013\u0010\u000f\"&\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00170\n8GX\u0087\u0004¢\u0006\u0012\n\u0004\b\u0018\u0010\r\u0012\u0004\b\u001a\u0010\u0015\u001a\u0004\b\u0019\u0010\u000f\"\u001d\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001c0\n8\u0006¢\u0006\f\n\u0004\b\u001d\u0010\r\u001a\u0004\b\u001e\u0010\u000f\"\u001d\u0010#\u001a\b\u0012\u0004\u0012\u00020 0\n8\u0006¢\u0006\f\n\u0004\b!\u0010\r\u001a\u0004\b\"\u0010\u000f\"\u001d\u0010'\u001a\b\u0012\u0004\u0012\u00020$0\n8\u0006¢\u0006\f\n\u0004\b%\u0010\r\u001a\u0004\b&\u0010\u000f\"&\u0010,\u001a\b\u0012\u0004\u0012\u00020(0\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b)\u0010\r\u0012\u0004\b+\u0010\u0015\u001a\u0004\b*\u0010\u000f\"\u001d\u00100\u001a\b\u0012\u0004\u0012\u00020-0\n8\u0006¢\u0006\f\n\u0004\b.\u0010\r\u001a\u0004\b/\u0010\u000f\"\u001d\u00104\u001a\b\u0012\u0004\u0012\u0002010\n8\u0006¢\u0006\f\n\u0004\b2\u0010\r\u001a\u0004\b3\u0010\u000f\"\u001d\u00108\u001a\b\u0012\u0004\u0012\u0002050\n8\u0006¢\u0006\f\n\u0004\b6\u0010\r\u001a\u0004\b7\u0010\u000f\"\u001d\u0010<\u001a\b\u0012\u0004\u0012\u0002090\n8\u0006¢\u0006\f\n\u0004\b:\u0010\r\u001a\u0004\b;\u0010\u000f\"\u001f\u0010@\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010=0\n8\u0006¢\u0006\f\n\u0004\b>\u0010\r\u001a\u0004\b?\u0010\u000f\"&\u0010E\u001a\b\u0012\u0004\u0012\u00020A0\n8GX\u0087\u0004¢\u0006\u0012\n\u0004\bB\u0010\r\u0012\u0004\bD\u0010\u0015\u001a\u0004\bC\u0010\u000f\"\u001d\u0010I\u001a\b\u0012\u0004\u0012\u00020F0\n8\u0006¢\u0006\f\n\u0004\bG\u0010\r\u001a\u0004\bH\u0010\u000f\"\u001d\u0010L\u001a\b\u0012\u0004\u0012\u00020\u00020\n8\u0006¢\u0006\f\n\u0004\bJ\u0010\r\u001a\u0004\bK\u0010\u000f\"\u001d\u0010P\u001a\b\u0012\u0004\u0012\u00020M0\n8\u0006¢\u0006\f\n\u0004\bN\u0010\r\u001a\u0004\bO\u0010\u000f\"\u001d\u0010T\u001a\b\u0012\u0004\u0012\u00020Q0\n8\u0006¢\u0006\f\n\u0004\bR\u0010\r\u001a\u0004\bS\u0010\u000f\"\"\u0010X\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010U0\n8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bV\u0010\r\u001a\u0004\bW\u0010\u000f¨\u0006Y"}, d2 = {"Landroidx/compose/ui/node/Owner;", "owner", "Landroidx/compose/ui/platform/UriHandler;", "uriHandler", "Lkotlin/Function0;", "", "Landroidx/compose/runtime/Composable;", "content", "ProvideCommonCompositionLocals", "(Landroidx/compose/ui/node/Owner;Landroidx/compose/ui/platform/UriHandler;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "Landroidx/compose/ui/platform/AccessibilityManager;", "a", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "getLocalAccessibilityManager", "()Landroidx/compose/runtime/ProvidableCompositionLocal;", "LocalAccessibilityManager", "Landroidx/compose/ui/autofill/Autofill;", "b", "getLocalAutofill", "getLocalAutofill$annotations", "()V", "LocalAutofill", "Landroidx/compose/ui/autofill/AutofillTree;", "c", "getLocalAutofillTree", "getLocalAutofillTree$annotations", "LocalAutofillTree", "Landroidx/compose/ui/platform/ClipboardManager;", "d", "getLocalClipboardManager", "LocalClipboardManager", "Landroidx/compose/ui/unit/Density;", "e", "getLocalDensity", "LocalDensity", "Landroidx/compose/ui/focus/FocusManager;", "f", "getLocalFocusManager", "LocalFocusManager", "Landroidx/compose/ui/text/font/Font$ResourceLoader;", "g", "getLocalFontLoader", "getLocalFontLoader$annotations", "LocalFontLoader", "Landroidx/compose/ui/text/font/FontFamily$Resolver;", "h", "getLocalFontFamilyResolver", "LocalFontFamilyResolver", "Landroidx/compose/ui/hapticfeedback/HapticFeedback;", "i", "getLocalHapticFeedback", "LocalHapticFeedback", "Landroidx/compose/ui/input/InputModeManager;", "j", "getLocalInputModeManager", "LocalInputModeManager", "Landroidx/compose/ui/unit/LayoutDirection;", "k", "getLocalLayoutDirection", "LocalLayoutDirection", "Landroidx/compose/ui/text/input/TextInputService;", "l", "getLocalTextInputService", "LocalTextInputService", "Landroidx/compose/ui/text/input/PlatformTextInputPluginRegistry;", "m", "getLocalPlatformTextInputPluginRegistry", "getLocalPlatformTextInputPluginRegistry$annotations", "LocalPlatformTextInputPluginRegistry", "Landroidx/compose/ui/platform/TextToolbar;", "n", "getLocalTextToolbar", "LocalTextToolbar", "o", "getLocalUriHandler", "LocalUriHandler", "Landroidx/compose/ui/platform/ViewConfiguration;", "p", "getLocalViewConfiguration", "LocalViewConfiguration", "Landroidx/compose/ui/platform/WindowInfo;", "q", "getLocalWindowInfo", "LocalWindowInfo", "Landroidx/compose/ui/input/pointer/PointerIconService;", "r", "getLocalPointerIconService", "LocalPointerIconService", "ui_release"}, k = 2, mv = {1, 8, 0})
public final class CompositionLocalsKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final ProvidableCompositionLocal<AccessibilityManager> f17148a = CompositionLocalKt.staticCompositionLocalOf(a.f17165p0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final ProvidableCompositionLocal<Autofill> f17149b = CompositionLocalKt.staticCompositionLocalOf(b.f17166p0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final ProvidableCompositionLocal<AutofillTree> f17150c = CompositionLocalKt.staticCompositionLocalOf(c.f17167p0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final ProvidableCompositionLocal<ClipboardManager> f17151d = CompositionLocalKt.staticCompositionLocalOf(d.f17168p0);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final ProvidableCompositionLocal<Density> f17152e = CompositionLocalKt.staticCompositionLocalOf(e.f17169p0);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public static final ProvidableCompositionLocal<FocusManager> f17153f = CompositionLocalKt.staticCompositionLocalOf(f.f17170p0);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public static final ProvidableCompositionLocal<Font.ResourceLoader> f17154g = CompositionLocalKt.staticCompositionLocalOf(h.f17172p0);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public static final ProvidableCompositionLocal<FontFamily.Resolver> f17155h = CompositionLocalKt.staticCompositionLocalOf(g.f17171p0);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public static final ProvidableCompositionLocal<HapticFeedback> f17156i = CompositionLocalKt.staticCompositionLocalOf(i.f17173p0);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public static final ProvidableCompositionLocal<InputModeManager> f17157j = CompositionLocalKt.staticCompositionLocalOf(j.f17174p0);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public static final ProvidableCompositionLocal<LayoutDirection> f17158k = CompositionLocalKt.staticCompositionLocalOf(k.f17175p0);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public static final ProvidableCompositionLocal<TextInputService> f17159l = CompositionLocalKt.staticCompositionLocalOf(n.f17178p0);

    @NotNull
    public static final ProvidableCompositionLocal<PlatformTextInputPluginRegistry> m = CompositionLocalKt.staticCompositionLocalOf(l.f17176p0);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public static final ProvidableCompositionLocal<TextToolbar> f17160n = CompositionLocalKt.staticCompositionLocalOf(o.f17179p0);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    public static final ProvidableCompositionLocal<UriHandler> f17161o = CompositionLocalKt.staticCompositionLocalOf(p.f17180p0);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    public static final ProvidableCompositionLocal<ViewConfiguration> f17162p = CompositionLocalKt.staticCompositionLocalOf(q.f17181p0);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NotNull
    public static final ProvidableCompositionLocal<WindowInfo> f17163q = CompositionLocalKt.staticCompositionLocalOf(r.f17182p0);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @NotNull
    public static final ProvidableCompositionLocal<PointerIconService> f17164r = CompositionLocalKt.staticCompositionLocalOf(m.f17177p0);

    /* JADX INFO: compiled from: CompositionLocals.kt */
    public static final class a extends Lambda implements Function0<AccessibilityManager> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final a f17165p0 = new a(0);

        @Override // kotlin.jvm.functions.Function0
        public final /* bridge */ /* synthetic */ AccessibilityManager invoke() {
            return null;
        }
    }

    /* JADX INFO: compiled from: CompositionLocals.kt */
    public static final class b extends Lambda implements Function0<Autofill> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final b f17166p0 = new b(0);

        @Override // kotlin.jvm.functions.Function0
        public final /* bridge */ /* synthetic */ Autofill invoke() {
            return null;
        }
    }

    /* JADX INFO: compiled from: CompositionLocals.kt */
    public static final class c extends Lambda implements Function0<AutofillTree> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final c f17167p0 = new c(0);

        @Override // kotlin.jvm.functions.Function0
        public final AutofillTree invoke() {
            CompositionLocalsKt.access$noLocalProvidedFor("LocalAutofillTree");
            throw new KotlinNothingValueException();
        }
    }

    /* JADX INFO: compiled from: CompositionLocals.kt */
    public static final class d extends Lambda implements Function0<ClipboardManager> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final d f17168p0 = new d(0);

        @Override // kotlin.jvm.functions.Function0
        public final ClipboardManager invoke() {
            CompositionLocalsKt.access$noLocalProvidedFor("LocalClipboardManager");
            throw new KotlinNothingValueException();
        }
    }

    /* JADX INFO: compiled from: CompositionLocals.kt */
    public static final class e extends Lambda implements Function0<Density> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final e f17169p0 = new e(0);

        @Override // kotlin.jvm.functions.Function0
        public final Density invoke() {
            CompositionLocalsKt.access$noLocalProvidedFor("LocalDensity");
            throw new KotlinNothingValueException();
        }
    }

    /* JADX INFO: compiled from: CompositionLocals.kt */
    public static final class f extends Lambda implements Function0<FocusManager> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final f f17170p0 = new f(0);

        @Override // kotlin.jvm.functions.Function0
        public final FocusManager invoke() {
            CompositionLocalsKt.access$noLocalProvidedFor("LocalFocusManager");
            throw new KotlinNothingValueException();
        }
    }

    /* JADX INFO: compiled from: CompositionLocals.kt */
    public static final class g extends Lambda implements Function0<FontFamily.Resolver> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final g f17171p0 = new g(0);

        @Override // kotlin.jvm.functions.Function0
        public final FontFamily.Resolver invoke() {
            CompositionLocalsKt.access$noLocalProvidedFor("LocalFontFamilyResolver");
            throw new KotlinNothingValueException();
        }
    }

    /* JADX INFO: compiled from: CompositionLocals.kt */
    public static final class h extends Lambda implements Function0<Font.ResourceLoader> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final h f17172p0 = new h(0);

        @Override // kotlin.jvm.functions.Function0
        public final Font.ResourceLoader invoke() {
            CompositionLocalsKt.access$noLocalProvidedFor("LocalFontLoader");
            throw new KotlinNothingValueException();
        }
    }

    /* JADX INFO: compiled from: CompositionLocals.kt */
    public static final class i extends Lambda implements Function0<HapticFeedback> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final i f17173p0 = new i(0);

        @Override // kotlin.jvm.functions.Function0
        public final HapticFeedback invoke() {
            CompositionLocalsKt.access$noLocalProvidedFor("LocalHapticFeedback");
            throw new KotlinNothingValueException();
        }
    }

    /* JADX INFO: compiled from: CompositionLocals.kt */
    public static final class j extends Lambda implements Function0<InputModeManager> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final j f17174p0 = new j(0);

        @Override // kotlin.jvm.functions.Function0
        public final InputModeManager invoke() {
            CompositionLocalsKt.access$noLocalProvidedFor("LocalInputManager");
            throw new KotlinNothingValueException();
        }
    }

    /* JADX INFO: compiled from: CompositionLocals.kt */
    public static final class k extends Lambda implements Function0<LayoutDirection> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final k f17175p0 = new k(0);

        @Override // kotlin.jvm.functions.Function0
        public final LayoutDirection invoke() {
            CompositionLocalsKt.access$noLocalProvidedFor("LocalLayoutDirection");
            throw new KotlinNothingValueException();
        }
    }

    /* JADX INFO: compiled from: CompositionLocals.kt */
    public static final class l extends Lambda implements Function0<PlatformTextInputPluginRegistry> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final l f17176p0 = new l(0);

        @Override // kotlin.jvm.functions.Function0
        public final PlatformTextInputPluginRegistry invoke() {
            throw new IllegalStateException("No PlatformTextInputPluginRegistry provided".toString());
        }
    }

    /* JADX INFO: compiled from: CompositionLocals.kt */
    public static final class m extends Lambda implements Function0<PointerIconService> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final m f17177p0 = new m(0);

        @Override // kotlin.jvm.functions.Function0
        public final /* bridge */ /* synthetic */ PointerIconService invoke() {
            return null;
        }
    }

    /* JADX INFO: compiled from: CompositionLocals.kt */
    public static final class n extends Lambda implements Function0<TextInputService> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final n f17178p0 = new n(0);

        @Override // kotlin.jvm.functions.Function0
        public final /* bridge */ /* synthetic */ TextInputService invoke() {
            return null;
        }
    }

    /* JADX INFO: compiled from: CompositionLocals.kt */
    public static final class o extends Lambda implements Function0<TextToolbar> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final o f17179p0 = new o(0);

        @Override // kotlin.jvm.functions.Function0
        public final TextToolbar invoke() {
            CompositionLocalsKt.access$noLocalProvidedFor("LocalTextToolbar");
            throw new KotlinNothingValueException();
        }
    }

    /* JADX INFO: compiled from: CompositionLocals.kt */
    public static final class p extends Lambda implements Function0<UriHandler> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final p f17180p0 = new p(0);

        @Override // kotlin.jvm.functions.Function0
        public final UriHandler invoke() {
            CompositionLocalsKt.access$noLocalProvidedFor("LocalUriHandler");
            throw new KotlinNothingValueException();
        }
    }

    /* JADX INFO: compiled from: CompositionLocals.kt */
    public static final class q extends Lambda implements Function0<ViewConfiguration> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final q f17181p0 = new q(0);

        @Override // kotlin.jvm.functions.Function0
        public final ViewConfiguration invoke() {
            CompositionLocalsKt.access$noLocalProvidedFor("LocalViewConfiguration");
            throw new KotlinNothingValueException();
        }
    }

    /* JADX INFO: compiled from: CompositionLocals.kt */
    public static final class r extends Lambda implements Function0<WindowInfo> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final r f17182p0 = new r(0);

        @Override // kotlin.jvm.functions.Function0
        public final WindowInfo invoke() {
            CompositionLocalsKt.access$noLocalProvidedFor("LocalWindowInfo");
            throw new KotlinNothingValueException();
        }
    }

    /* JADX INFO: compiled from: CompositionLocals.kt */
    public static final class s extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Owner f17183p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ UriHandler f17184q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ Function2<Composer, Integer, Unit> f17185r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ int f17186s0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public s(Owner owner, UriHandler uriHandler, Function2<? super Composer, ? super Integer, Unit> function2, int i10) {
            super(2);
            this.f17183p0 = owner;
            this.f17184q0 = uriHandler;
            this.f17185r0 = function2;
            this.f17186s0 = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f17186s0 | 1);
            UriHandler uriHandler = this.f17184q0;
            Function2<Composer, Integer, Unit> function2 = this.f17185r0;
            CompositionLocalsKt.ProvideCommonCompositionLocals(this.f17183p0, uriHandler, function2, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    @Composable
    @ExperimentalComposeUiApi
    @ComposableInferredTarget(scheme = "[0[0]]")
    public static final void ProvideCommonCompositionLocals(@NotNull Owner owner, @NotNull UriHandler uriHandler, @NotNull Function2<? super Composer, ? super Integer, Unit> content, @Nullable Composer composer, int i10) {
        int i11;
        Intrinsics.checkNotNullParameter(owner, "owner");
        Intrinsics.checkNotNullParameter(uriHandler, "uriHandler");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(874662829);
        if ((i10 & 14) == 0) {
            i11 = (composerStartRestartGroup.changed(owner) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 112) == 0) {
            i11 |= composerStartRestartGroup.changed(uriHandler) ? 32 : 16;
        }
        if ((i10 & 896) == 0) {
            i11 |= composerStartRestartGroup.changedInstance(content) ? 256 : 128;
        }
        if ((i11 & 731) == 146 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(874662829, i11, -1, "androidx.compose.ui.platform.ProvideCommonCompositionLocals (CompositionLocals.kt:189)");
            }
            CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{f17148a.provides(owner.getAccessibilityManager()), f17149b.provides(owner.getAutofill()), f17150c.provides(owner.getAutofillTree()), f17151d.provides(owner.getClipboardManager()), f17152e.provides(owner.getDensity()), f17153f.provides(owner.getFocusOwner()), f17154g.providesDefault(owner.getFontLoader()), f17155h.providesDefault(owner.getFontFamilyResolver()), f17156i.provides(owner.getHapticFeedBack()), f17157j.provides(owner.getInputModeManager()), f17158k.provides(owner.getLayoutDirection()), f17159l.provides(owner.getTextInputService()), m.provides(owner.getPlatformTextInputPluginRegistry()), f17160n.provides(owner.getTextToolbar()), f17161o.provides(uriHandler), f17162p.provides(owner.getViewConfiguration()), f17163q.provides(owner.getWindowInfo()), f17164r.provides(owner.getPointerIconService())}, content, composerStartRestartGroup, ((i11 >> 3) & 112) | 8);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new s(owner, uriHandler, content, i10));
    }

    public static final Void access$noLocalProvidedFor(String str) {
        throw new IllegalStateException(("CompositionLocal " + str + " not present").toString());
    }

    @NotNull
    public static final ProvidableCompositionLocal<AccessibilityManager> getLocalAccessibilityManager() {
        return f17148a;
    }

    @ExperimentalComposeUiApi
    @NotNull
    public static final ProvidableCompositionLocal<Autofill> getLocalAutofill() {
        return f17149b;
    }

    @ExperimentalComposeUiApi
    @NotNull
    public static final ProvidableCompositionLocal<AutofillTree> getLocalAutofillTree() {
        return f17150c;
    }

    @NotNull
    public static final ProvidableCompositionLocal<ClipboardManager> getLocalClipboardManager() {
        return f17151d;
    }

    @NotNull
    public static final ProvidableCompositionLocal<Density> getLocalDensity() {
        return f17152e;
    }

    @NotNull
    public static final ProvidableCompositionLocal<FocusManager> getLocalFocusManager() {
        return f17153f;
    }

    @NotNull
    public static final ProvidableCompositionLocal<FontFamily.Resolver> getLocalFontFamilyResolver() {
        return f17155h;
    }

    @NotNull
    public static final ProvidableCompositionLocal<Font.ResourceLoader> getLocalFontLoader() {
        return f17154g;
    }

    @NotNull
    public static final ProvidableCompositionLocal<HapticFeedback> getLocalHapticFeedback() {
        return f17156i;
    }

    @NotNull
    public static final ProvidableCompositionLocal<InputModeManager> getLocalInputModeManager() {
        return f17157j;
    }

    @NotNull
    public static final ProvidableCompositionLocal<LayoutDirection> getLocalLayoutDirection() {
        return f17158k;
    }

    @ExperimentalTextApi
    @NotNull
    public static final ProvidableCompositionLocal<PlatformTextInputPluginRegistry> getLocalPlatformTextInputPluginRegistry() {
        return m;
    }

    @NotNull
    public static final ProvidableCompositionLocal<PointerIconService> getLocalPointerIconService() {
        return f17164r;
    }

    @NotNull
    public static final ProvidableCompositionLocal<TextInputService> getLocalTextInputService() {
        return f17159l;
    }

    @NotNull
    public static final ProvidableCompositionLocal<TextToolbar> getLocalTextToolbar() {
        return f17160n;
    }

    @NotNull
    public static final ProvidableCompositionLocal<UriHandler> getLocalUriHandler() {
        return f17161o;
    }

    @NotNull
    public static final ProvidableCompositionLocal<ViewConfiguration> getLocalViewConfiguration() {
        return f17162p;
    }

    @NotNull
    public static final ProvidableCompositionLocal<WindowInfo> getLocalWindowInfo() {
        return f17163q;
    }

    @ExperimentalComposeUiApi
    public static /* synthetic */ void getLocalAutofill$annotations() {
    }

    @ExperimentalComposeUiApi
    public static /* synthetic */ void getLocalAutofillTree$annotations() {
    }

    @Deprecated(message = "LocalFontLoader is replaced with LocalFontFamilyResolver", replaceWith = @ReplaceWith(expression = "LocalFontFamilyResolver", imports = {}))
    public static /* synthetic */ void getLocalFontLoader$annotations() {
    }

    @ExperimentalTextApi
    public static /* synthetic */ void getLocalPlatformTextInputPluginRegistry$annotations() {
    }
}
