package androidx.compose.ui.text.input;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: OffsetMapping.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\bf\u0018\u0000 \u00062\u00020\u0001:\u0001\u0006J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H&J\u0010\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0007À\u0006\u0001"}, d2 = {"Landroidx/compose/ui/text/input/OffsetMapping;", "", "originalToTransformed", "", TypedValues.CycleType.S_WAVE_OFFSET, "transformedToOriginal", "Companion", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface OffsetMapping {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.f18097a;

    /* JADX INFO: compiled from: OffsetMapping.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Landroidx/compose/ui/text/input/OffsetMapping$Companion;", "", "Landroidx/compose/ui/text/input/OffsetMapping;", "b", "Landroidx/compose/ui/text/input/OffsetMapping;", "getIdentity", "()Landroidx/compose/ui/text/input/OffsetMapping;", "Identity", "<init>", "()V", "ui-text_release"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ Companion f18097a = new Companion();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public static final OffsetMapping$Companion$Identity$1 f18098b = new OffsetMapping() { // from class: androidx.compose.ui.text.input.OffsetMapping$Companion$Identity$1
            @Override // androidx.compose.ui.text.input.OffsetMapping
            public int originalToTransformed(int offset) {
                return offset;
            }

            @Override // androidx.compose.ui.text.input.OffsetMapping
            public int transformedToOriginal(int offset) {
                return offset;
            }
        };

        @NotNull
        public final OffsetMapping getIdentity() {
            return f18098b;
        }
    }

    int originalToTransformed(int offset);

    int transformedToOriginal(int offset);
}
