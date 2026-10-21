package androidx.compose.ui.text.font;

import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: FontFamilyResolver.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0007\bR\u0012\u0010\u0003\u001a\u00020\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0002\t\nø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000bÀ\u0006\u0001"}, d2 = {"Landroidx/compose/ui/text/font/TypefaceResult;", "Landroidx/compose/runtime/State;", "", "cacheable", "", "getCacheable", "()Z", "Async", "Immutable", "Landroidx/compose/ui/text/font/TypefaceResult$Async;", "Landroidx/compose/ui/text/font/TypefaceResult$Immutable;", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface TypefaceResult extends State<Object> {

    /* JADX INFO: compiled from: FontFamilyResolver.kt */
    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B\u000f\u0012\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\t\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\f\u001a\u00020\u00038\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u0010\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0013"}, d2 = {"Landroidx/compose/ui/text/font/TypefaceResult$Async;", "Landroidx/compose/ui/text/font/TypefaceResult;", "Landroidx/compose/runtime/State;", "", "Landroidx/compose/ui/text/font/AsyncFontListLoader;", "p0", "Landroidx/compose/ui/text/font/AsyncFontListLoader;", "getCurrent$ui_text_release", "()Landroidx/compose/ui/text/font/AsyncFontListLoader;", "current", "getValue", "()Ljava/lang/Object;", "value", "", "getCacheable", "()Z", "cacheable", "<init>", "(Landroidx/compose/ui/text/font/AsyncFontListLoader;)V", "ui-text_release"}, k = 1, mv = {1, 8, 0})
    public static final class Async implements TypefaceResult, State<Object> {
        public static final int $stable = 0;

        /* JADX INFO: renamed from: p0, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final AsyncFontListLoader current;

        public Async(@NotNull AsyncFontListLoader current) {
            Intrinsics.checkNotNullParameter(current, "current");
            this.current = current;
        }

        @Override // androidx.compose.ui.text.font.TypefaceResult
        public boolean getCacheable() {
            return this.current.getCacheable();
        }

        @NotNull
        /* JADX INFO: renamed from: getCurrent$ui_text_release, reason: from getter */
        public final AsyncFontListLoader getCurrent() {
            return this.current;
        }

        @Override // androidx.compose.runtime.State
        @NotNull
        public Object getValue() {
            return this.current.getValue();
        }
    }

    boolean getCacheable();

    /* JADX INFO: compiled from: FontFamilyResolver.kt */
    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\r\u001a\u00020\b¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0007\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\r\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u0010"}, d2 = {"Landroidx/compose/ui/text/font/TypefaceResult$Immutable;", "Landroidx/compose/ui/text/font/TypefaceResult;", "", "p0", "Ljava/lang/Object;", "getValue", "()Ljava/lang/Object;", "value", "", "q0", "Z", "getCacheable", "()Z", "cacheable", "<init>", "(Ljava/lang/Object;Z)V", "ui-text_release"}, k = 1, mv = {1, 8, 0})
    public static final class Immutable implements TypefaceResult {
        public static final int $stable = 0;

        /* JADX INFO: renamed from: p0, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final Object value;

        /* JADX INFO: renamed from: q0, reason: collision with root package name and from kotlin metadata */
        public final boolean cacheable;

        public Immutable(@NotNull Object value, boolean z10) {
            Intrinsics.checkNotNullParameter(value, "value");
            this.value = value;
            this.cacheable = z10;
        }

        @Override // androidx.compose.ui.text.font.TypefaceResult
        public boolean getCacheable() {
            return this.cacheable;
        }

        @Override // androidx.compose.runtime.State
        @NotNull
        public Object getValue() {
            return this.value;
        }

        public /* synthetic */ Immutable(Object obj, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(obj, (i10 & 2) != 0 ? true : z10);
        }
    }
}
