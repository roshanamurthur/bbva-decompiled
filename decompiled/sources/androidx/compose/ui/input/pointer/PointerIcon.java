package androidx.compose.ui.input.pointer;

import androidx.compose.runtime.Stable;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: PointerIcon.kt */
/* JADX INFO: loaded from: classes.dex */
@Stable
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bg\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0003À\u0006\u0001"}, d2 = {"Landroidx/compose/ui/input/pointer/PointerIcon;", "", "Companion", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface PointerIcon {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.f16387a;

    /* JADX INFO: compiled from: PointerIcon.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0004\u001a\u0004\b\f\u0010\u0006R\u0017\u0010\u0010\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0004\u001a\u0004\b\u000f\u0010\u0006¨\u0006\u0013"}, d2 = {"Landroidx/compose/ui/input/pointer/PointerIcon$Companion;", "", "Landroidx/compose/ui/input/pointer/PointerIcon;", "b", "Landroidx/compose/ui/input/pointer/PointerIcon;", "getDefault", "()Landroidx/compose/ui/input/pointer/PointerIcon;", "Default", "c", "getCrosshair", "Crosshair", "d", "getText", "Text", "e", "getHand", "Hand", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ Companion f16387a = new Companion();

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public static final PointerIcon Default = PointerIcon_androidKt.getPointerIconDefault();

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public static final PointerIcon Crosshair = PointerIcon_androidKt.getPointerIconCrosshair();

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public static final PointerIcon Text = PointerIcon_androidKt.getPointerIconText();

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public static final PointerIcon Hand = PointerIcon_androidKt.getPointerIconHand();

        @NotNull
        public final PointerIcon getCrosshair() {
            return Crosshair;
        }

        @NotNull
        public final PointerIcon getDefault() {
            return Default;
        }

        @NotNull
        public final PointerIcon getHand() {
            return Hand;
        }

        @NotNull
        public final PointerIcon getText() {
            return Text;
        }
    }
}
