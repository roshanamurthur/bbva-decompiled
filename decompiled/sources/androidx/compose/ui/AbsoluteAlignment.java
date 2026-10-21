package androidx.compose.ui;

import androidx.compose.runtime.Stable;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Alignment.kt */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\b\f\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b)\u0010\bR \u0010\t\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u0012\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R \u0010\r\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010\u0004\u0012\u0004\b\f\u0010\b\u001a\u0004\b\u000b\u0010\u0006R \u0010\u0011\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000e\u0010\u0004\u0012\u0004\b\u0010\u0010\b\u001a\u0004\b\u000f\u0010\u0006R \u0010\u0015\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0012\u0010\u0004\u0012\u0004\b\u0014\u0010\b\u001a\u0004\b\u0013\u0010\u0006R \u0010\u0019\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0016\u0010\u0004\u0012\u0004\b\u0018\u0010\b\u001a\u0004\b\u0017\u0010\u0006R \u0010\u001d\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001a\u0010\u0004\u0012\u0004\b\u001c\u0010\b\u001a\u0004\b\u001b\u0010\u0006R \u0010$\u001a\u00020\u001e8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001f\u0010 \u0012\u0004\b#\u0010\b\u001a\u0004\b!\u0010\"R \u0010(\u001a\u00020\u001e8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b%\u0010 \u0012\u0004\b'\u0010\b\u001a\u0004\b&\u0010\"¨\u0006*"}, d2 = {"Landroidx/compose/ui/AbsoluteAlignment;", "", "Landroidx/compose/ui/Alignment;", "a", "Landroidx/compose/ui/Alignment;", "getTopLeft", "()Landroidx/compose/ui/Alignment;", "getTopLeft$annotations", "()V", "TopLeft", "b", "getTopRight", "getTopRight$annotations", "TopRight", "c", "getCenterLeft", "getCenterLeft$annotations", "CenterLeft", "d", "getCenterRight", "getCenterRight$annotations", "CenterRight", "e", "getBottomLeft", "getBottomLeft$annotations", "BottomLeft", "f", "getBottomRight", "getBottomRight$annotations", "BottomRight", "Landroidx/compose/ui/Alignment$Horizontal;", "g", "Landroidx/compose/ui/Alignment$Horizontal;", "getLeft", "()Landroidx/compose/ui/Alignment$Horizontal;", "getLeft$annotations", "Left", "h", "getRight", "getRight$annotations", "Right", "<init>", "ui_release"}, k = 1, mv = {1, 8, 0})
public final class AbsoluteAlignment {
    public static final int $stable = 0;

    @NotNull
    public static final AbsoluteAlignment INSTANCE = new AbsoluteAlignment();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final BiasAbsoluteAlignment f15372a = new BiasAbsoluteAlignment(-1.0f, -1.0f);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final BiasAbsoluteAlignment f15373b = new BiasAbsoluteAlignment(1.0f, -1.0f);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final BiasAbsoluteAlignment f15374c = new BiasAbsoluteAlignment(-1.0f, 0.0f);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final BiasAbsoluteAlignment f15375d = new BiasAbsoluteAlignment(1.0f, 0.0f);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final BiasAbsoluteAlignment f15376e = new BiasAbsoluteAlignment(-1.0f, 1.0f);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public static final BiasAbsoluteAlignment f15377f = new BiasAbsoluteAlignment(1.0f, 1.0f);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public static final BiasAbsoluteAlignment.Horizontal f15378g = new BiasAbsoluteAlignment.Horizontal(-1.0f);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public static final BiasAbsoluteAlignment.Horizontal f15379h = new BiasAbsoluteAlignment.Horizontal(1.0f);

    @NotNull
    public final Alignment getBottomLeft() {
        return f15376e;
    }

    @NotNull
    public final Alignment getBottomRight() {
        return f15377f;
    }

    @NotNull
    public final Alignment getCenterLeft() {
        return f15374c;
    }

    @NotNull
    public final Alignment getCenterRight() {
        return f15375d;
    }

    @NotNull
    public final Alignment.Horizontal getLeft() {
        return f15378g;
    }

    @NotNull
    public final Alignment.Horizontal getRight() {
        return f15379h;
    }

    @NotNull
    public final Alignment getTopLeft() {
        return f15372a;
    }

    @NotNull
    public final Alignment getTopRight() {
        return f15373b;
    }

    @Stable
    public static /* synthetic */ void getBottomLeft$annotations() {
    }

    @Stable
    public static /* synthetic */ void getBottomRight$annotations() {
    }

    @Stable
    public static /* synthetic */ void getCenterLeft$annotations() {
    }

    @Stable
    public static /* synthetic */ void getCenterRight$annotations() {
    }

    @Stable
    public static /* synthetic */ void getLeft$annotations() {
    }

    @Stable
    public static /* synthetic */ void getRight$annotations() {
    }

    @Stable
    public static /* synthetic */ void getTopLeft$annotations() {
    }

    @Stable
    public static /* synthetic */ void getTopRight$annotations() {
    }
}
