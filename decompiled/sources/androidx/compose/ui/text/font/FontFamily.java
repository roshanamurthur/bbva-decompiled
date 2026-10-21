package androidx.compose.ui.text.font;

import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.State;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: FontFamily.kt */
/* JADX INFO: loaded from: classes.dex */
@Immutable
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \n2\u00020\u0001:\u0002\n\u000bR\u001d\u0010\t\u001a\u00020\u00028G¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u0012\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0003\f\r\u000e¨\u0006\u000f"}, d2 = {"Landroidx/compose/ui/text/font/FontFamily;", "", "", "p0", "Z", "getCanLoadSynchronously", "()Z", "getCanLoadSynchronously$annotations", "()V", "canLoadSynchronously", "Companion", "Resolver", "Landroidx/compose/ui/text/font/FileBasedFontFamily;", "Landroidx/compose/ui/text/font/LoadedFontFamily;", "Landroidx/compose/ui/text/font/SystemFontFamily;", "ui-text_release"}, k = 1, mv = {1, 8, 0})
public abstract class FontFamily {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    @NotNull
    public static final DefaultFontFamily f17942q0 = new DefaultFontFamily();

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    @NotNull
    public static final GenericFontFamily f17943r0 = new GenericFontFamily("sans-serif", "FontFamily.SansSerif");

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    @NotNull
    public static final GenericFontFamily f17944s0 = new GenericFontFamily("serif", "FontFamily.Serif");

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    @NotNull
    public static final GenericFontFamily f17945t0 = new GenericFontFamily("monospace", "FontFamily.Monospace");

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    @NotNull
    public static final GenericFontFamily f17946u0 = new GenericFontFamily("cursive", "FontFamily.Cursive");

    /* JADX INFO: renamed from: p0, reason: collision with root package name and from kotlin metadata */
    public final boolean canLoadSynchronously;

    /* JADX INFO: compiled from: FontFamily.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u000b\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0006R\u0011\u0010\r\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u0006R\u0011\u0010\u000f\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0006¨\u0006\u0011"}, d2 = {"Landroidx/compose/ui/text/font/FontFamily$Companion;", "", "()V", "Cursive", "Landroidx/compose/ui/text/font/GenericFontFamily;", "getCursive", "()Landroidx/compose/ui/text/font/GenericFontFamily;", "Default", "Landroidx/compose/ui/text/font/SystemFontFamily;", "getDefault", "()Landroidx/compose/ui/text/font/SystemFontFamily;", "Monospace", "getMonospace", "SansSerif", "getSansSerif", "Serif", "getSerif", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final GenericFontFamily getCursive() {
            return FontFamily.f17946u0;
        }

        @NotNull
        public final SystemFontFamily getDefault() {
            return FontFamily.f17942q0;
        }

        @NotNull
        public final GenericFontFamily getMonospace() {
            return FontFamily.f17945t0;
        }

        @NotNull
        public final GenericFontFamily getSansSerif() {
            return FontFamily.f17943r0;
        }

        @NotNull
        public final GenericFontFamily getSerif() {
            return FontFamily.f17944s0;
        }
    }

    /* JADX INFO: compiled from: FontFamily.kt */
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001J\u0019\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H¦@ø\u0001\u0000¢\u0006\u0002\u0010\u0006JE\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\b2\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000eH&ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u0082\u0001\u0001\u0011ø\u0001\u0002\u0082\u0002\u0011\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0004\b!0\u0001¨\u0006\u0012À\u0006\u0001"}, d2 = {"Landroidx/compose/ui/text/font/FontFamily$Resolver;", "", "preload", "", "fontFamily", "Landroidx/compose/ui/text/font/FontFamily;", "(Landroidx/compose/ui/text/font/FontFamily;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "resolve", "Landroidx/compose/runtime/State;", "fontWeight", "Landroidx/compose/ui/text/font/FontWeight;", "fontStyle", "Landroidx/compose/ui/text/font/FontStyle;", "fontSynthesis", "Landroidx/compose/ui/text/font/FontSynthesis;", "resolve-DPcqOEQ", "(Landroidx/compose/ui/text/font/FontFamily;Landroidx/compose/ui/text/font/FontWeight;II)Landroidx/compose/runtime/State;", "Landroidx/compose/ui/text/font/FontFamilyResolverImpl;", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public interface Resolver {
        @Nullable
        Object preload(@NotNull FontFamily fontFamily, @NotNull Continuation<? super Unit> continuation);

        @NotNull
        /* JADX INFO: renamed from: resolve-DPcqOEQ, reason: not valid java name */
        State<Object> mo4038resolveDPcqOEQ(@Nullable FontFamily fontFamily, @NotNull FontWeight fontWeight, int fontStyle, int fontSynthesis);
    }

    public FontFamily(boolean z10, DefaultConstructorMarker defaultConstructorMarker) {
        this.canLoadSynchronously = z10;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "Unused property that has no meaning. Do not use.")
    public final boolean getCanLoadSynchronously() {
        return this.canLoadSynchronously;
    }

    public static /* synthetic */ void getCanLoadSynchronously$annotations() {
    }
}
