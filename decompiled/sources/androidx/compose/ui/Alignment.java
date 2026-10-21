package androidx.compose.ui;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Alignment.kt */
/* JADX INFO: loaded from: classes.dex */
@Stable
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bç\u0080\u0001\u0018\u0000 \u000b2\u00020\u0001:\u0003\u000b\f\rJ-\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\bH&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\nø\u0001\u0002\u0082\u0002\u0011\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0004\b!0\u0001¨\u0006\u000eÀ\u0006\u0001"}, d2 = {"Landroidx/compose/ui/Alignment;", "", "align", "Landroidx/compose/ui/unit/IntOffset;", "size", "Landroidx/compose/ui/unit/IntSize;", "space", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "align-KFBX0sM", "(JJLandroidx/compose/ui/unit/LayoutDirection;)J", "Companion", "Horizontal", "Vertical", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface Alignment {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.f15380a;

    /* JADX INFO: compiled from: Alignment.kt */
    @Stable
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bç\u0080\u0001\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\bÀ\u0006\u0001"}, d2 = {"Landroidx/compose/ui/Alignment$Horizontal;", "", "align", "", "size", "space", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public interface Horizontal {
        int align(int size, int space, @NotNull LayoutDirection layoutDirection);
    }

    /* JADX INFO: compiled from: Alignment.kt */
    @Stable
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\bç\u0080\u0001\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, d2 = {"Landroidx/compose/ui/Alignment$Vertical;", "", "align", "", "size", "space", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public interface Vertical {
        int align(int size, int space);
    }

    /* JADX INFO: renamed from: align-KFBX0sM, reason: not valid java name */
    long mo2184alignKFBX0sM(long size, long space, @NotNull LayoutDirection layoutDirection);

    /* JADX INFO: compiled from: Alignment.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b'\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\bH\u0010\bR \u0010\t\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u0012\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R \u0010\r\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010\u0004\u0012\u0004\b\f\u0010\b\u001a\u0004\b\u000b\u0010\u0006R \u0010\u0011\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000e\u0010\u0004\u0012\u0004\b\u0010\u0010\b\u001a\u0004\b\u000f\u0010\u0006R \u0010\u0015\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0012\u0010\u0004\u0012\u0004\b\u0014\u0010\b\u001a\u0004\b\u0013\u0010\u0006R \u0010\u0019\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0016\u0010\u0004\u0012\u0004\b\u0018\u0010\b\u001a\u0004\b\u0017\u0010\u0006R \u0010\u001d\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001a\u0010\u0004\u0012\u0004\b\u001c\u0010\b\u001a\u0004\b\u001b\u0010\u0006R \u0010!\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001e\u0010\u0004\u0012\u0004\b \u0010\b\u001a\u0004\b\u001f\u0010\u0006R \u0010%\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\"\u0010\u0004\u0012\u0004\b$\u0010\b\u001a\u0004\b#\u0010\u0006R \u0010)\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b&\u0010\u0004\u0012\u0004\b(\u0010\b\u001a\u0004\b'\u0010\u0006R \u00100\u001a\u00020*8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b+\u0010,\u0012\u0004\b/\u0010\b\u001a\u0004\b-\u0010.R \u00104\u001a\u00020*8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b1\u0010,\u0012\u0004\b3\u0010\b\u001a\u0004\b2\u0010.R \u00108\u001a\u00020*8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b5\u0010,\u0012\u0004\b7\u0010\b\u001a\u0004\b6\u0010.R \u0010?\u001a\u0002098\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b:\u0010;\u0012\u0004\b>\u0010\b\u001a\u0004\b<\u0010=R \u0010C\u001a\u0002098\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b@\u0010;\u0012\u0004\bB\u0010\b\u001a\u0004\bA\u0010=R \u0010G\u001a\u0002098\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bD\u0010;\u0012\u0004\bF\u0010\b\u001a\u0004\bE\u0010=¨\u0006I"}, d2 = {"Landroidx/compose/ui/Alignment$Companion;", "", "Landroidx/compose/ui/Alignment;", "b", "Landroidx/compose/ui/Alignment;", "getTopStart", "()Landroidx/compose/ui/Alignment;", "getTopStart$annotations", "()V", "TopStart", "c", "getTopCenter", "getTopCenter$annotations", "TopCenter", "d", "getTopEnd", "getTopEnd$annotations", "TopEnd", "e", "getCenterStart", "getCenterStart$annotations", "CenterStart", "f", "getCenter", "getCenter$annotations", "Center", "g", "getCenterEnd", "getCenterEnd$annotations", "CenterEnd", "h", "getBottomStart", "getBottomStart$annotations", "BottomStart", "i", "getBottomCenter", "getBottomCenter$annotations", "BottomCenter", "j", "getBottomEnd", "getBottomEnd$annotations", "BottomEnd", "Landroidx/compose/ui/Alignment$Vertical;", "k", "Landroidx/compose/ui/Alignment$Vertical;", "getTop", "()Landroidx/compose/ui/Alignment$Vertical;", "getTop$annotations", "Top", "l", "getCenterVertically", "getCenterVertically$annotations", "CenterVertically", "m", "getBottom", "getBottom$annotations", "Bottom", "Landroidx/compose/ui/Alignment$Horizontal;", "n", "Landroidx/compose/ui/Alignment$Horizontal;", "getStart", "()Landroidx/compose/ui/Alignment$Horizontal;", "getStart$annotations", "Start", "o", "getCenterHorizontally", "getCenterHorizontally$annotations", "CenterHorizontally", "p", "getEnd", "getEnd$annotations", "End", "<init>", "ui_release"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ Companion f15380a = new Companion();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public static final BiasAlignment f15381b = new BiasAlignment(-1.0f, -1.0f);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public static final BiasAlignment f15382c = new BiasAlignment(0.0f, -1.0f);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public static final BiasAlignment f15383d = new BiasAlignment(1.0f, -1.0f);

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @NotNull
        public static final BiasAlignment f15384e = new BiasAlignment(-1.0f, 0.0f);

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @NotNull
        public static final BiasAlignment f15385f = new BiasAlignment(0.0f, 0.0f);

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @NotNull
        public static final BiasAlignment f15386g = new BiasAlignment(1.0f, 0.0f);

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        @NotNull
        public static final BiasAlignment f15387h = new BiasAlignment(-1.0f, 1.0f);

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        @NotNull
        public static final BiasAlignment f15388i = new BiasAlignment(0.0f, 1.0f);

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        @NotNull
        public static final BiasAlignment f15389j = new BiasAlignment(1.0f, 1.0f);

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        @NotNull
        public static final BiasAlignment.Vertical f15390k = new BiasAlignment.Vertical(-1.0f);

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        @NotNull
        public static final BiasAlignment.Vertical f15391l = new BiasAlignment.Vertical(0.0f);

        @NotNull
        public static final BiasAlignment.Vertical m = new BiasAlignment.Vertical(1.0f);

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        @NotNull
        public static final BiasAlignment.Horizontal f15392n = new BiasAlignment.Horizontal(-1.0f);

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        @NotNull
        public static final BiasAlignment.Horizontal f15393o = new BiasAlignment.Horizontal(0.0f);

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        @NotNull
        public static final BiasAlignment.Horizontal f15394p = new BiasAlignment.Horizontal(1.0f);

        @NotNull
        public final Vertical getBottom() {
            return m;
        }

        @NotNull
        public final Alignment getBottomCenter() {
            return f15388i;
        }

        @NotNull
        public final Alignment getBottomEnd() {
            return f15389j;
        }

        @NotNull
        public final Alignment getBottomStart() {
            return f15387h;
        }

        @NotNull
        public final Alignment getCenter() {
            return f15385f;
        }

        @NotNull
        public final Alignment getCenterEnd() {
            return f15386g;
        }

        @NotNull
        public final Horizontal getCenterHorizontally() {
            return f15393o;
        }

        @NotNull
        public final Alignment getCenterStart() {
            return f15384e;
        }

        @NotNull
        public final Vertical getCenterVertically() {
            return f15391l;
        }

        @NotNull
        public final Horizontal getEnd() {
            return f15394p;
        }

        @NotNull
        public final Horizontal getStart() {
            return f15392n;
        }

        @NotNull
        public final Vertical getTop() {
            return f15390k;
        }

        @NotNull
        public final Alignment getTopCenter() {
            return f15382c;
        }

        @NotNull
        public final Alignment getTopEnd() {
            return f15383d;
        }

        @NotNull
        public final Alignment getTopStart() {
            return f15381b;
        }

        @Stable
        public static /* synthetic */ void getBottom$annotations() {
        }

        @Stable
        public static /* synthetic */ void getBottomCenter$annotations() {
        }

        @Stable
        public static /* synthetic */ void getBottomEnd$annotations() {
        }

        @Stable
        public static /* synthetic */ void getBottomStart$annotations() {
        }

        @Stable
        public static /* synthetic */ void getCenter$annotations() {
        }

        @Stable
        public static /* synthetic */ void getCenterEnd$annotations() {
        }

        @Stable
        public static /* synthetic */ void getCenterHorizontally$annotations() {
        }

        @Stable
        public static /* synthetic */ void getCenterStart$annotations() {
        }

        @Stable
        public static /* synthetic */ void getCenterVertically$annotations() {
        }

        @Stable
        public static /* synthetic */ void getEnd$annotations() {
        }

        @Stable
        public static /* synthetic */ void getStart$annotations() {
        }

        @Stable
        public static /* synthetic */ void getTop$annotations() {
        }

        @Stable
        public static /* synthetic */ void getTopCenter$annotations() {
        }

        @Stable
        public static /* synthetic */ void getTopEnd$annotations() {
        }

        @Stable
        public static /* synthetic */ void getTopStart$annotations() {
        }
    }
}
