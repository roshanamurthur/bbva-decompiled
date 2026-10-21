package androidx.compose.ui.text.input;

import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.text.AnnotatedString;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: VisualTransformation.kt */
/* JADX INFO: loaded from: classes.dex */
@Immutable
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bç\u0080\u0001\u0018\u0000 \u00062\u00020\u0001:\u0001\u0006J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0007À\u0006\u0001"}, d2 = {"Landroidx/compose/ui/text/input/VisualTransformation;", "", "filter", "Landroidx/compose/ui/text/input/TransformedText;", "text", "Landroidx/compose/ui/text/AnnotatedString;", "Companion", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface VisualTransformation {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.f18167a;

    @NotNull
    TransformedText filter(@NotNull AnnotatedString text);

    /* JADX INFO: compiled from: VisualTransformation.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\bR \u0010\t\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u0012\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000b"}, d2 = {"Landroidx/compose/ui/text/input/VisualTransformation$Companion;", "", "Landroidx/compose/ui/text/input/VisualTransformation;", "b", "Landroidx/compose/ui/text/input/VisualTransformation;", "getNone", "()Landroidx/compose/ui/text/input/VisualTransformation;", "getNone$annotations", "()V", "None", "<init>", "ui-text_release"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ Companion f18167a = new Companion();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public static final a f18168b = a.f18169a;

        /* JADX INFO: compiled from: VisualTransformation.kt */
        public static final class a implements VisualTransformation {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f18169a = new a();

            @Override // androidx.compose.ui.text.input.VisualTransformation
            @NotNull
            public final TransformedText filter(@NotNull AnnotatedString text) {
                Intrinsics.checkNotNullParameter(text, "text");
                return new TransformedText(text, OffsetMapping.INSTANCE.getIdentity());
            }
        }

        @NotNull
        public final VisualTransformation getNone() {
            return f18168b;
        }

        @Stable
        public static /* synthetic */ void getNone$annotations() {
        }
    }
}
