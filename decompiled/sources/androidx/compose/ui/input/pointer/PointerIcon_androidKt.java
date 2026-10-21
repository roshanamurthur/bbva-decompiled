package androidx.compose.ui.input.pointer;

import androidx.core.view.PointerIconCompat;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: PointerIcon.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0010\u001a\u000e\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000\u001a\u000e\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004\"\u001a\u0010\n\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\"\u001a\u0010\r\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0007\u001a\u0004\b\f\u0010\t\"\u001a\u0010\u0010\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0007\u001a\u0004\b\u000f\u0010\t\"\u001a\u0010\u0013\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0007\u001a\u0004\b\u0012\u0010\t¨\u0006\u0014"}, d2 = {"Landroid/view/PointerIcon;", "pointerIcon", "Landroidx/compose/ui/input/pointer/PointerIcon;", "PointerIcon", "", "pointerIconType", "a", "Landroidx/compose/ui/input/pointer/PointerIcon;", "getPointerIconDefault", "()Landroidx/compose/ui/input/pointer/PointerIcon;", "pointerIconDefault", "b", "getPointerIconCrosshair", "pointerIconCrosshair", "c", "getPointerIconText", "pointerIconText", "d", "getPointerIconHand", "pointerIconHand", "ui_release"}, k = 2, mv = {1, 8, 0})
public final class PointerIcon_androidKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final AndroidPointerIconType f16398a = new AndroidPointerIconType(1000);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final AndroidPointerIconType f16399b = new AndroidPointerIconType(1007);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final AndroidPointerIconType f16400c = new AndroidPointerIconType(PointerIconCompat.TYPE_TEXT);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final AndroidPointerIconType f16401d = new AndroidPointerIconType(1002);

    @NotNull
    public static final PointerIcon PointerIcon(@NotNull android.view.PointerIcon pointerIcon) {
        Intrinsics.checkNotNullParameter(pointerIcon, "pointerIcon");
        return new AndroidPointerIcon(pointerIcon);
    }

    @NotNull
    public static final PointerIcon getPointerIconCrosshair() {
        return f16399b;
    }

    @NotNull
    public static final PointerIcon getPointerIconDefault() {
        return f16398a;
    }

    @NotNull
    public static final PointerIcon getPointerIconHand() {
        return f16401d;
    }

    @NotNull
    public static final PointerIcon getPointerIconText() {
        return f16400c;
    }

    @NotNull
    public static final PointerIcon PointerIcon(int i10) {
        return new AndroidPointerIconType(i10);
    }
}
