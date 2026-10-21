package androidx.compose.foundation.layout;

import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import x.f;
import x.g;

/* JADX INFO: compiled from: Arrangement.kt */
/* JADX INFO: loaded from: classes.dex */
@Immutable
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b<\bÇ\u0002\u0018\u00002\u00020\u0001:\u0005OPQRSB\t\b\u0002¢\u0006\u0004\bN\u0010,J\u001d\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0005\u0010\u0006J%\u0010\u0007\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000b\u0010\fJ%\u0010\u0007\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\rH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000b\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0007J\u0010\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\rH\u0007J/\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u0016H\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ'\u0010\u001e\u001a\u00020\u00182\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u0016H\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ/\u0010 \u001a\u00020\u00182\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u0016H\u0000¢\u0006\u0004\b\u001f\u0010\u001aJ/\u0010\"\u001a\u00020\u00182\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u0016H\u0000¢\u0006\u0004\b!\u0010\u001aJ/\u0010$\u001a\u00020\u00182\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u0016H\u0000¢\u0006\u0004\b#\u0010\u001aJ/\u0010&\u001a\u00020\u00182\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u0016H\u0000¢\u0006\u0004\b%\u0010\u001aR \u0010-\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b'\u0010(\u0012\u0004\b+\u0010,\u001a\u0004\b)\u0010*R \u00101\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b.\u0010(\u0012\u0004\b0\u0010,\u001a\u0004\b/\u0010*R \u00107\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b2\u00103\u0012\u0004\b6\u0010,\u001a\u0004\b4\u00105R \u0010;\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b8\u00103\u0012\u0004\b:\u0010,\u001a\u0004\b9\u00105R \u0010A\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b<\u0010=\u0012\u0004\b@\u0010,\u001a\u0004\b>\u0010?R \u0010E\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bB\u0010=\u0012\u0004\bD\u0010,\u001a\u0004\bC\u0010?R \u0010I\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bF\u0010=\u0012\u0004\bH\u0010,\u001a\u0004\bG\u0010?R \u0010M\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bJ\u0010=\u0012\u0004\bL\u0010,\u001a\u0004\bK\u0010?\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006T"}, d2 = {"Landroidx/compose/foundation/layout/Arrangement;", "", "Landroidx/compose/ui/unit/Dp;", "space", "Landroidx/compose/foundation/layout/Arrangement$HorizontalOrVertical;", "spacedBy-0680j_4", "(F)Landroidx/compose/foundation/layout/Arrangement$HorizontalOrVertical;", "spacedBy", "Landroidx/compose/ui/Alignment$Horizontal;", "alignment", "Landroidx/compose/foundation/layout/Arrangement$Horizontal;", "spacedBy-D5KLDUw", "(FLandroidx/compose/ui/Alignment$Horizontal;)Landroidx/compose/foundation/layout/Arrangement$Horizontal;", "Landroidx/compose/ui/Alignment$Vertical;", "Landroidx/compose/foundation/layout/Arrangement$Vertical;", "(FLandroidx/compose/ui/Alignment$Vertical;)Landroidx/compose/foundation/layout/Arrangement$Vertical;", "aligned", "", "totalSize", "", "size", "outPosition", "", "reverseInput", "", "placeRightOrBottom$foundation_layout_release", "(I[I[IZ)V", "placeRightOrBottom", "placeLeftOrTop$foundation_layout_release", "([I[IZ)V", "placeLeftOrTop", "placeCenter$foundation_layout_release", "placeCenter", "placeSpaceEvenly$foundation_layout_release", "placeSpaceEvenly", "placeSpaceBetween$foundation_layout_release", "placeSpaceBetween", "placeSpaceAround$foundation_layout_release", "placeSpaceAround", "a", "Landroidx/compose/foundation/layout/Arrangement$Horizontal;", "getStart", "()Landroidx/compose/foundation/layout/Arrangement$Horizontal;", "getStart$annotations", "()V", "Start", "b", "getEnd", "getEnd$annotations", "End", "c", "Landroidx/compose/foundation/layout/Arrangement$Vertical;", "getTop", "()Landroidx/compose/foundation/layout/Arrangement$Vertical;", "getTop$annotations", "Top", "d", "getBottom", "getBottom$annotations", "Bottom", "e", "Landroidx/compose/foundation/layout/Arrangement$HorizontalOrVertical;", "getCenter", "()Landroidx/compose/foundation/layout/Arrangement$HorizontalOrVertical;", "getCenter$annotations", "Center", "f", "getSpaceEvenly", "getSpaceEvenly$annotations", "SpaceEvenly", "g", "getSpaceBetween", "getSpaceBetween$annotations", "SpaceBetween", "h", "getSpaceAround", "getSpaceAround$annotations", "SpaceAround", "<init>", "Absolute", "Horizontal", "HorizontalOrVertical", "SpacedAligned", "Vertical", "foundation-layout_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nArrangement.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Arrangement.kt\nandroidx/compose/foundation/layout/Arrangement\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,715:1\n706#1,2:721\n709#1,5:726\n706#1,2:731\n709#1,5:736\n706#1,2:744\n709#1,5:749\n706#1,2:757\n709#1,5:762\n706#1,2:770\n709#1,5:775\n706#1,2:783\n709#1,5:788\n154#2:716\n154#2:717\n13032#3,3:718\n13674#3,3:723\n13674#3,3:733\n13032#3,3:741\n13674#3,3:746\n13032#3,3:754\n13674#3,3:759\n13032#3,3:767\n13674#3,3:772\n13032#3,3:780\n13674#3,3:785\n13674#3,3:793\n*S KotlinDebug\n*F\n+ 1 Arrangement.kt\nandroidx/compose/foundation/layout/Arrangement\n*L\n619#1:721,2\n619#1:726,5\n627#1:731,2\n627#1:736,5\n641#1:744,2\n641#1:749,5\n656#1:757,2\n656#1:762,5\n680#1:770,2\n680#1:775,5\n699#1:783,2\n699#1:788,5\n355#1:716\n367#1:717\n617#1:718,3\n619#1:723,3\n627#1:733,3\n639#1:741,3\n641#1:746,3\n653#1:754,3\n656#1:759,3\n670#1:767,3\n680#1:772,3\n692#1:780,3\n699#1:785,3\n707#1:793,3\n*E\n"})
public final class Arrangement {
    public static final int $stable = 0;

    @NotNull
    public static final Arrangement INSTANCE = new Arrangement();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final Arrangement$Start$1 f4161a = new Horizontal() { // from class: androidx.compose.foundation.layout.Arrangement$Start$1
        @Override // androidx.compose.foundation.layout.Arrangement.Horizontal
        public void arrange(@NotNull Density density, int i10, @NotNull int[] sizes, @NotNull LayoutDirection layoutDirection, @NotNull int[] outPositions) {
            Intrinsics.checkNotNullParameter(density, "<this>");
            Intrinsics.checkNotNullParameter(sizes, "sizes");
            Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
            Intrinsics.checkNotNullParameter(outPositions, "outPositions");
            if (layoutDirection == LayoutDirection.Ltr) {
                Arrangement.INSTANCE.placeLeftOrTop$foundation_layout_release(sizes, outPositions, false);
            } else {
                Arrangement.INSTANCE.placeRightOrBottom$foundation_layout_release(i10, sizes, outPositions, true);
            }
        }

        @Override // androidx.compose.foundation.layout.Arrangement.Horizontal, androidx.compose.foundation.layout.Arrangement.Vertical
        /* JADX INFO: renamed from: getSpacing-D9Ej5fM */
        public final /* synthetic */ float getSpacing() {
            return x.e.a(this);
        }

        @NotNull
        public String toString() {
            return "Arrangement#Start";
        }
    };

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final Arrangement$End$1 f4162b = new Horizontal() { // from class: androidx.compose.foundation.layout.Arrangement$End$1
        @Override // androidx.compose.foundation.layout.Arrangement.Horizontal
        public void arrange(@NotNull Density density, int i10, @NotNull int[] sizes, @NotNull LayoutDirection layoutDirection, @NotNull int[] outPositions) {
            Intrinsics.checkNotNullParameter(density, "<this>");
            Intrinsics.checkNotNullParameter(sizes, "sizes");
            Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
            Intrinsics.checkNotNullParameter(outPositions, "outPositions");
            if (layoutDirection == LayoutDirection.Ltr) {
                Arrangement.INSTANCE.placeRightOrBottom$foundation_layout_release(i10, sizes, outPositions, false);
            } else {
                Arrangement.INSTANCE.placeLeftOrTop$foundation_layout_release(sizes, outPositions, true);
            }
        }

        @Override // androidx.compose.foundation.layout.Arrangement.Horizontal, androidx.compose.foundation.layout.Arrangement.Vertical
        /* JADX INFO: renamed from: getSpacing-D9Ej5fM */
        public final /* synthetic */ float getSpacing() {
            return x.e.a(this);
        }

        @NotNull
        public String toString() {
            return "Arrangement#End";
        }
    };

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final Arrangement$Top$1 f4163c = new Vertical() { // from class: androidx.compose.foundation.layout.Arrangement$Top$1
        @Override // androidx.compose.foundation.layout.Arrangement.Vertical
        public void arrange(@NotNull Density density, int i10, @NotNull int[] sizes, @NotNull int[] outPositions) {
            Intrinsics.checkNotNullParameter(density, "<this>");
            Intrinsics.checkNotNullParameter(sizes, "sizes");
            Intrinsics.checkNotNullParameter(outPositions, "outPositions");
            Arrangement.INSTANCE.placeLeftOrTop$foundation_layout_release(sizes, outPositions, false);
        }

        @Override // androidx.compose.foundation.layout.Arrangement.Vertical
        /* JADX INFO: renamed from: getSpacing-D9Ej5fM */
        public final /* synthetic */ float getSpacing() {
            return g.a(this);
        }

        @NotNull
        public String toString() {
            return "Arrangement#Top";
        }
    };

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final Arrangement$Bottom$1 f4164d = new Vertical() { // from class: androidx.compose.foundation.layout.Arrangement$Bottom$1
        @Override // androidx.compose.foundation.layout.Arrangement.Vertical
        public void arrange(@NotNull Density density, int i10, @NotNull int[] sizes, @NotNull int[] outPositions) {
            Intrinsics.checkNotNullParameter(density, "<this>");
            Intrinsics.checkNotNullParameter(sizes, "sizes");
            Intrinsics.checkNotNullParameter(outPositions, "outPositions");
            Arrangement.INSTANCE.placeRightOrBottom$foundation_layout_release(i10, sizes, outPositions, false);
        }

        @Override // androidx.compose.foundation.layout.Arrangement.Vertical
        /* JADX INFO: renamed from: getSpacing-D9Ej5fM */
        public final /* synthetic */ float getSpacing() {
            return g.a(this);
        }

        @NotNull
        public String toString() {
            return "Arrangement#Bottom";
        }
    };

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final Arrangement$Center$1 f4165e = new HorizontalOrVertical() { // from class: androidx.compose.foundation.layout.Arrangement$Center$1

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        public final float spacing = Dp.m4389constructorimpl(0);

        @Override // androidx.compose.foundation.layout.Arrangement.Horizontal
        public void arrange(@NotNull Density density, int i10, @NotNull int[] sizes, @NotNull LayoutDirection layoutDirection, @NotNull int[] outPositions) {
            Intrinsics.checkNotNullParameter(density, "<this>");
            Intrinsics.checkNotNullParameter(sizes, "sizes");
            Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
            Intrinsics.checkNotNullParameter(outPositions, "outPositions");
            if (layoutDirection == LayoutDirection.Ltr) {
                Arrangement.INSTANCE.placeCenter$foundation_layout_release(i10, sizes, outPositions, false);
            } else {
                Arrangement.INSTANCE.placeCenter$foundation_layout_release(i10, sizes, outPositions, true);
            }
        }

        @Override // androidx.compose.foundation.layout.Arrangement.HorizontalOrVertical, androidx.compose.foundation.layout.Arrangement.Horizontal, androidx.compose.foundation.layout.Arrangement.Vertical
        /* JADX INFO: renamed from: getSpacing-D9Ej5fM, reason: from getter */
        public float getSpacing() {
            return this.spacing;
        }

        @NotNull
        public String toString() {
            return "Arrangement#Center";
        }

        @Override // androidx.compose.foundation.layout.Arrangement.Vertical
        public void arrange(@NotNull Density density, int i10, @NotNull int[] sizes, @NotNull int[] outPositions) {
            Intrinsics.checkNotNullParameter(density, "<this>");
            Intrinsics.checkNotNullParameter(sizes, "sizes");
            Intrinsics.checkNotNullParameter(outPositions, "outPositions");
            Arrangement.INSTANCE.placeCenter$foundation_layout_release(i10, sizes, outPositions, false);
        }
    };

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public static final Arrangement$SpaceEvenly$1 f4166f = new HorizontalOrVertical() { // from class: androidx.compose.foundation.layout.Arrangement$SpaceEvenly$1

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        public final float spacing = Dp.m4389constructorimpl(0);

        @Override // androidx.compose.foundation.layout.Arrangement.Horizontal
        public void arrange(@NotNull Density density, int i10, @NotNull int[] sizes, @NotNull LayoutDirection layoutDirection, @NotNull int[] outPositions) {
            Intrinsics.checkNotNullParameter(density, "<this>");
            Intrinsics.checkNotNullParameter(sizes, "sizes");
            Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
            Intrinsics.checkNotNullParameter(outPositions, "outPositions");
            if (layoutDirection == LayoutDirection.Ltr) {
                Arrangement.INSTANCE.placeSpaceEvenly$foundation_layout_release(i10, sizes, outPositions, false);
            } else {
                Arrangement.INSTANCE.placeSpaceEvenly$foundation_layout_release(i10, sizes, outPositions, true);
            }
        }

        @Override // androidx.compose.foundation.layout.Arrangement.HorizontalOrVertical, androidx.compose.foundation.layout.Arrangement.Horizontal, androidx.compose.foundation.layout.Arrangement.Vertical
        /* JADX INFO: renamed from: getSpacing-D9Ej5fM, reason: from getter */
        public float getSpacing() {
            return this.spacing;
        }

        @NotNull
        public String toString() {
            return "Arrangement#SpaceEvenly";
        }

        @Override // androidx.compose.foundation.layout.Arrangement.Vertical
        public void arrange(@NotNull Density density, int i10, @NotNull int[] sizes, @NotNull int[] outPositions) {
            Intrinsics.checkNotNullParameter(density, "<this>");
            Intrinsics.checkNotNullParameter(sizes, "sizes");
            Intrinsics.checkNotNullParameter(outPositions, "outPositions");
            Arrangement.INSTANCE.placeSpaceEvenly$foundation_layout_release(i10, sizes, outPositions, false);
        }
    };

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public static final Arrangement$SpaceBetween$1 f4167g = new HorizontalOrVertical() { // from class: androidx.compose.foundation.layout.Arrangement$SpaceBetween$1

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        public final float spacing = Dp.m4389constructorimpl(0);

        @Override // androidx.compose.foundation.layout.Arrangement.Horizontal
        public void arrange(@NotNull Density density, int i10, @NotNull int[] sizes, @NotNull LayoutDirection layoutDirection, @NotNull int[] outPositions) {
            Intrinsics.checkNotNullParameter(density, "<this>");
            Intrinsics.checkNotNullParameter(sizes, "sizes");
            Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
            Intrinsics.checkNotNullParameter(outPositions, "outPositions");
            if (layoutDirection == LayoutDirection.Ltr) {
                Arrangement.INSTANCE.placeSpaceBetween$foundation_layout_release(i10, sizes, outPositions, false);
            } else {
                Arrangement.INSTANCE.placeSpaceBetween$foundation_layout_release(i10, sizes, outPositions, true);
            }
        }

        @Override // androidx.compose.foundation.layout.Arrangement.HorizontalOrVertical, androidx.compose.foundation.layout.Arrangement.Horizontal, androidx.compose.foundation.layout.Arrangement.Vertical
        /* JADX INFO: renamed from: getSpacing-D9Ej5fM, reason: from getter */
        public float getSpacing() {
            return this.spacing;
        }

        @NotNull
        public String toString() {
            return "Arrangement#SpaceBetween";
        }

        @Override // androidx.compose.foundation.layout.Arrangement.Vertical
        public void arrange(@NotNull Density density, int i10, @NotNull int[] sizes, @NotNull int[] outPositions) {
            Intrinsics.checkNotNullParameter(density, "<this>");
            Intrinsics.checkNotNullParameter(sizes, "sizes");
            Intrinsics.checkNotNullParameter(outPositions, "outPositions");
            Arrangement.INSTANCE.placeSpaceBetween$foundation_layout_release(i10, sizes, outPositions, false);
        }
    };

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public static final Arrangement$SpaceAround$1 f4168h = new HorizontalOrVertical() { // from class: androidx.compose.foundation.layout.Arrangement$SpaceAround$1

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        public final float spacing = Dp.m4389constructorimpl(0);

        @Override // androidx.compose.foundation.layout.Arrangement.Horizontal
        public void arrange(@NotNull Density density, int i10, @NotNull int[] sizes, @NotNull LayoutDirection layoutDirection, @NotNull int[] outPositions) {
            Intrinsics.checkNotNullParameter(density, "<this>");
            Intrinsics.checkNotNullParameter(sizes, "sizes");
            Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
            Intrinsics.checkNotNullParameter(outPositions, "outPositions");
            if (layoutDirection == LayoutDirection.Ltr) {
                Arrangement.INSTANCE.placeSpaceAround$foundation_layout_release(i10, sizes, outPositions, false);
            } else {
                Arrangement.INSTANCE.placeSpaceAround$foundation_layout_release(i10, sizes, outPositions, true);
            }
        }

        @Override // androidx.compose.foundation.layout.Arrangement.HorizontalOrVertical, androidx.compose.foundation.layout.Arrangement.Horizontal, androidx.compose.foundation.layout.Arrangement.Vertical
        /* JADX INFO: renamed from: getSpacing-D9Ej5fM, reason: from getter */
        public float getSpacing() {
            return this.spacing;
        }

        @NotNull
        public String toString() {
            return "Arrangement#SpaceAround";
        }

        @Override // androidx.compose.foundation.layout.Arrangement.Vertical
        public void arrange(@NotNull Density density, int i10, @NotNull int[] sizes, @NotNull int[] outPositions) {
            Intrinsics.checkNotNullParameter(density, "<this>");
            Intrinsics.checkNotNullParameter(sizes, "sizes");
            Intrinsics.checkNotNullParameter(outPositions, "outPositions");
            Arrangement.INSTANCE.placeSpaceAround$foundation_layout_release(i10, sizes, outPositions, false);
        }
    };

    /* JADX INFO: compiled from: Arrangement.kt */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u001f\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b,\u0010\u0016J\u001d\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0005\u0010\u0006J%\u0010\u0007\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000b\u0010\fJ%\u0010\u0007\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\rH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000b\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0007R \u0010\u0017\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u0012\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0013\u0010\u0014R \u0010\u001b\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0018\u0010\u0012\u0012\u0004\b\u001a\u0010\u0016\u001a\u0004\b\u0019\u0010\u0014R \u0010\u001f\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001c\u0010\u0012\u0012\u0004\b\u001e\u0010\u0016\u001a\u0004\b\u001d\u0010\u0014R \u0010#\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b \u0010\u0012\u0012\u0004\b\"\u0010\u0016\u001a\u0004\b!\u0010\u0014R \u0010'\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b$\u0010\u0012\u0012\u0004\b&\u0010\u0016\u001a\u0004\b%\u0010\u0014R \u0010+\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b(\u0010\u0012\u0012\u0004\b*\u0010\u0016\u001a\u0004\b)\u0010\u0014\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006-"}, d2 = {"Landroidx/compose/foundation/layout/Arrangement$Absolute;", "", "Landroidx/compose/ui/unit/Dp;", "space", "Landroidx/compose/foundation/layout/Arrangement$HorizontalOrVertical;", "spacedBy-0680j_4", "(F)Landroidx/compose/foundation/layout/Arrangement$HorizontalOrVertical;", "spacedBy", "Landroidx/compose/ui/Alignment$Horizontal;", "alignment", "Landroidx/compose/foundation/layout/Arrangement$Horizontal;", "spacedBy-D5KLDUw", "(FLandroidx/compose/ui/Alignment$Horizontal;)Landroidx/compose/foundation/layout/Arrangement$Horizontal;", "Landroidx/compose/ui/Alignment$Vertical;", "Landroidx/compose/foundation/layout/Arrangement$Vertical;", "(FLandroidx/compose/ui/Alignment$Vertical;)Landroidx/compose/foundation/layout/Arrangement$Vertical;", "aligned", "a", "Landroidx/compose/foundation/layout/Arrangement$Horizontal;", "getLeft", "()Landroidx/compose/foundation/layout/Arrangement$Horizontal;", "getLeft$annotations", "()V", "Left", "b", "getCenter", "getCenter$annotations", "Center", "c", "getRight", "getRight$annotations", "Right", "d", "getSpaceBetween", "getSpaceBetween$annotations", "SpaceBetween", "e", "getSpaceEvenly", "getSpaceEvenly$annotations", "SpaceEvenly", "f", "getSpaceAround", "getSpaceAround$annotations", "SpaceAround", "<init>", "foundation-layout_release"}, k = 1, mv = {1, 8, 0})
    @Immutable
    @SourceDebugExtension({"SMAP\nArrangement.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Arrangement.kt\nandroidx/compose/foundation/layout/Arrangement$Absolute\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,715:1\n154#2:716\n*S KotlinDebug\n*F\n+ 1 Arrangement.kt\nandroidx/compose/foundation/layout/Arrangement$Absolute\n*L\n556#1:716\n*E\n"})
    public static final class Absolute {
        public static final int $stable = 0;

        @NotNull
        public static final Absolute INSTANCE = new Absolute();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final Arrangement$Absolute$Left$1 f4169a = new Horizontal() { // from class: androidx.compose.foundation.layout.Arrangement$Absolute$Left$1
            @Override // androidx.compose.foundation.layout.Arrangement.Horizontal
            public void arrange(@NotNull Density density, int i10, @NotNull int[] sizes, @NotNull LayoutDirection layoutDirection, @NotNull int[] outPositions) {
                Intrinsics.checkNotNullParameter(density, "<this>");
                Intrinsics.checkNotNullParameter(sizes, "sizes");
                Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
                Intrinsics.checkNotNullParameter(outPositions, "outPositions");
                Arrangement.INSTANCE.placeLeftOrTop$foundation_layout_release(sizes, outPositions, false);
            }

            @Override // androidx.compose.foundation.layout.Arrangement.Horizontal, androidx.compose.foundation.layout.Arrangement.Vertical
            /* JADX INFO: renamed from: getSpacing-D9Ej5fM */
            public final /* synthetic */ float getSpacing() {
                return x.e.a(this);
            }

            @NotNull
            public String toString() {
                return "AbsoluteArrangement#Left";
            }
        };

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public static final Arrangement$Absolute$Center$1 f4170b = new Horizontal() { // from class: androidx.compose.foundation.layout.Arrangement$Absolute$Center$1
            @Override // androidx.compose.foundation.layout.Arrangement.Horizontal
            public void arrange(@NotNull Density density, int i10, @NotNull int[] sizes, @NotNull LayoutDirection layoutDirection, @NotNull int[] outPositions) {
                Intrinsics.checkNotNullParameter(density, "<this>");
                Intrinsics.checkNotNullParameter(sizes, "sizes");
                Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
                Intrinsics.checkNotNullParameter(outPositions, "outPositions");
                Arrangement.INSTANCE.placeCenter$foundation_layout_release(i10, sizes, outPositions, false);
            }

            @Override // androidx.compose.foundation.layout.Arrangement.Horizontal, androidx.compose.foundation.layout.Arrangement.Vertical
            /* JADX INFO: renamed from: getSpacing-D9Ej5fM, reason: not valid java name */
            public final /* synthetic */ float getSpacing() {
                return x.e.a(this);
            }

            @NotNull
            public String toString() {
                return "AbsoluteArrangement#Center";
            }
        };

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public static final Arrangement$Absolute$Right$1 f4171c = new Horizontal() { // from class: androidx.compose.foundation.layout.Arrangement$Absolute$Right$1
            @Override // androidx.compose.foundation.layout.Arrangement.Horizontal
            public void arrange(@NotNull Density density, int i10, @NotNull int[] sizes, @NotNull LayoutDirection layoutDirection, @NotNull int[] outPositions) {
                Intrinsics.checkNotNullParameter(density, "<this>");
                Intrinsics.checkNotNullParameter(sizes, "sizes");
                Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
                Intrinsics.checkNotNullParameter(outPositions, "outPositions");
                Arrangement.INSTANCE.placeRightOrBottom$foundation_layout_release(i10, sizes, outPositions, false);
            }

            @Override // androidx.compose.foundation.layout.Arrangement.Horizontal, androidx.compose.foundation.layout.Arrangement.Vertical
            /* JADX INFO: renamed from: getSpacing-D9Ej5fM */
            public final /* synthetic */ float getSpacing() {
                return x.e.a(this);
            }

            @NotNull
            public String toString() {
                return "AbsoluteArrangement#Right";
            }
        };

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public static final Arrangement$Absolute$SpaceBetween$1 f4172d = new Horizontal() { // from class: androidx.compose.foundation.layout.Arrangement$Absolute$SpaceBetween$1
            @Override // androidx.compose.foundation.layout.Arrangement.Horizontal
            public void arrange(@NotNull Density density, int i10, @NotNull int[] sizes, @NotNull LayoutDirection layoutDirection, @NotNull int[] outPositions) {
                Intrinsics.checkNotNullParameter(density, "<this>");
                Intrinsics.checkNotNullParameter(sizes, "sizes");
                Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
                Intrinsics.checkNotNullParameter(outPositions, "outPositions");
                Arrangement.INSTANCE.placeSpaceBetween$foundation_layout_release(i10, sizes, outPositions, false);
            }

            @Override // androidx.compose.foundation.layout.Arrangement.Horizontal, androidx.compose.foundation.layout.Arrangement.Vertical
            /* JADX INFO: renamed from: getSpacing-D9Ej5fM */
            public final /* synthetic */ float getSpacing() {
                return x.e.a(this);
            }

            @NotNull
            public String toString() {
                return "AbsoluteArrangement#SpaceBetween";
            }
        };

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @NotNull
        public static final Arrangement$Absolute$SpaceEvenly$1 f4173e = new Horizontal() { // from class: androidx.compose.foundation.layout.Arrangement$Absolute$SpaceEvenly$1
            @Override // androidx.compose.foundation.layout.Arrangement.Horizontal
            public void arrange(@NotNull Density density, int i10, @NotNull int[] sizes, @NotNull LayoutDirection layoutDirection, @NotNull int[] outPositions) {
                Intrinsics.checkNotNullParameter(density, "<this>");
                Intrinsics.checkNotNullParameter(sizes, "sizes");
                Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
                Intrinsics.checkNotNullParameter(outPositions, "outPositions");
                Arrangement.INSTANCE.placeSpaceEvenly$foundation_layout_release(i10, sizes, outPositions, false);
            }

            @Override // androidx.compose.foundation.layout.Arrangement.Horizontal, androidx.compose.foundation.layout.Arrangement.Vertical
            /* JADX INFO: renamed from: getSpacing-D9Ej5fM */
            public final /* synthetic */ float getSpacing() {
                return x.e.a(this);
            }

            @NotNull
            public String toString() {
                return "AbsoluteArrangement#SpaceEvenly";
            }
        };

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @NotNull
        public static final Arrangement$Absolute$SpaceAround$1 f4174f = new Horizontal() { // from class: androidx.compose.foundation.layout.Arrangement$Absolute$SpaceAround$1
            @Override // androidx.compose.foundation.layout.Arrangement.Horizontal
            public void arrange(@NotNull Density density, int i10, @NotNull int[] sizes, @NotNull LayoutDirection layoutDirection, @NotNull int[] outPositions) {
                Intrinsics.checkNotNullParameter(density, "<this>");
                Intrinsics.checkNotNullParameter(sizes, "sizes");
                Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
                Intrinsics.checkNotNullParameter(outPositions, "outPositions");
                Arrangement.INSTANCE.placeSpaceAround$foundation_layout_release(i10, sizes, outPositions, false);
            }

            @Override // androidx.compose.foundation.layout.Arrangement.Horizontal, androidx.compose.foundation.layout.Arrangement.Vertical
            /* JADX INFO: renamed from: getSpacing-D9Ej5fM */
            public final /* synthetic */ float getSpacing() {
                return x.e.a(this);
            }

            @NotNull
            public String toString() {
                return "AbsoluteArrangement#SpaceAround";
            }
        };

        /* JADX INFO: compiled from: Arrangement.kt */
        public static final class a extends Lambda implements Function2<Integer, LayoutDirection, Integer> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public final /* synthetic */ Alignment.Horizontal f4175p0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Alignment.Horizontal horizontal) {
                super(2);
                this.f4175p0 = horizontal;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Integer invoke(Integer num, LayoutDirection layoutDirection) {
                int iIntValue = num.intValue();
                LayoutDirection layoutDirection2 = layoutDirection;
                Intrinsics.checkNotNullParameter(layoutDirection2, "layoutDirection");
                return Integer.valueOf(this.f4175p0.align(0, iIntValue, layoutDirection2));
            }
        }

        /* JADX INFO: compiled from: Arrangement.kt */
        public static final class b extends Lambda implements Function2<Integer, LayoutDirection, Integer> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public final /* synthetic */ Alignment.Horizontal f4176p0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(Alignment.Horizontal horizontal) {
                super(2);
                this.f4176p0 = horizontal;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Integer invoke(Integer num, LayoutDirection layoutDirection) {
                int iIntValue = num.intValue();
                LayoutDirection layoutDirection2 = layoutDirection;
                Intrinsics.checkNotNullParameter(layoutDirection2, "layoutDirection");
                return Integer.valueOf(this.f4176p0.align(0, iIntValue, layoutDirection2));
            }
        }

        /* JADX INFO: compiled from: Arrangement.kt */
        public static final class c extends Lambda implements Function2<Integer, LayoutDirection, Integer> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public final /* synthetic */ Alignment.Vertical f4177p0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(Alignment.Vertical vertical) {
                super(2);
                this.f4177p0 = vertical;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Integer invoke(Integer num, LayoutDirection layoutDirection) {
                int iIntValue = num.intValue();
                Intrinsics.checkNotNullParameter(layoutDirection, "<anonymous parameter 1>");
                return Integer.valueOf(this.f4177p0.align(0, iIntValue));
            }
        }

        @Stable
        @NotNull
        public final Horizontal aligned(@NotNull Alignment.Horizontal alignment) {
            Intrinsics.checkNotNullParameter(alignment, "alignment");
            return new SpacedAligned(Dp.m4389constructorimpl(0), false, new a(alignment), null);
        }

        @NotNull
        public final Horizontal getCenter() {
            return f4170b;
        }

        @NotNull
        public final Horizontal getLeft() {
            return f4169a;
        }

        @NotNull
        public final Horizontal getRight() {
            return f4171c;
        }

        @NotNull
        public final Horizontal getSpaceAround() {
            return f4174f;
        }

        @NotNull
        public final Horizontal getSpaceBetween() {
            return f4172d;
        }

        @NotNull
        public final Horizontal getSpaceEvenly() {
            return f4173e;
        }

        @Stable
        @NotNull
        /* JADX INFO: renamed from: spacedBy-0680j_4, reason: not valid java name */
        public final HorizontalOrVertical m249spacedBy0680j_4(float space) {
            return new SpacedAligned(space, false, null, null);
        }

        @Stable
        @NotNull
        /* JADX INFO: renamed from: spacedBy-D5KLDUw, reason: not valid java name */
        public final Horizontal m250spacedByD5KLDUw(float space, @NotNull Alignment.Horizontal alignment) {
            Intrinsics.checkNotNullParameter(alignment, "alignment");
            return new SpacedAligned(space, false, new b(alignment), null);
        }

        @Stable
        @NotNull
        /* JADX INFO: renamed from: spacedBy-D5KLDUw, reason: not valid java name */
        public final Vertical m251spacedByD5KLDUw(float space, @NotNull Alignment.Vertical alignment) {
            Intrinsics.checkNotNullParameter(alignment, "alignment");
            return new SpacedAligned(space, false, new c(alignment), null);
        }

        @Stable
        public static /* synthetic */ void getCenter$annotations() {
        }

        @Stable
        public static /* synthetic */ void getLeft$annotations() {
        }

        @Stable
        public static /* synthetic */ void getRight$annotations() {
        }

        @Stable
        public static /* synthetic */ void getSpaceAround$annotations() {
        }

        @Stable
        public static /* synthetic */ void getSpaceBetween$annotations() {
        }

        @Stable
        public static /* synthetic */ void getSpaceEvenly$annotations() {
        }
    }

    /* JADX INFO: compiled from: Arrangement.kt */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J,\u0010\u0006\u001a\u00020\u0007*\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\fH&R\u001d\u0010\u0002\u001a\u00020\u00038VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005ø\u0001\u0003\u0082\u0002\u0015\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!\n\u0004\b!0\u0001¨\u0006\u0010À\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/layout/Arrangement$Horizontal;", "", "spacing", "Landroidx/compose/ui/unit/Dp;", "getSpacing-D9Ej5fM", "()F", "arrange", "", "Landroidx/compose/ui/unit/Density;", "totalSize", "", "sizes", "", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "outPositions", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @Stable
    @SourceDebugExtension({"SMAP\nArrangement.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Arrangement.kt\nandroidx/compose/foundation/layout/Arrangement$Horizontal\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,715:1\n154#2:716\n*S KotlinDebug\n*F\n+ 1 Arrangement.kt\nandroidx/compose/foundation/layout/Arrangement$Horizontal\n*L\n51#1:716\n*E\n"})
    public interface Horizontal {

        /* JADX INFO: compiled from: Arrangement.kt */
        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        public static final class DefaultImpls {
            @Deprecated
            /* JADX INFO: renamed from: getSpacing-D9Ej5fM, reason: not valid java name */
            public static float m253getSpacingD9Ej5fM(@NotNull Horizontal horizontal) {
                return x.e.a(horizontal);
            }
        }

        void arrange(@NotNull Density density, int i10, @NotNull int[] iArr, @NotNull LayoutDirection layoutDirection, @NotNull int[] iArr2);

        /* JADX INFO: renamed from: getSpacing-D9Ej5fM */
        float getSpacing();
    }

    /* JADX INFO: compiled from: Arrangement.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u00012\u00020\u0002R\u001d\u0010\u0003\u001a\u00020\u00048VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006ø\u0001\u0003\u0082\u0002\u0015\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!\n\u0004\b!0\u0001¨\u0006\u0007À\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/layout/Arrangement$HorizontalOrVertical;", "Landroidx/compose/foundation/layout/Arrangement$Horizontal;", "Landroidx/compose/foundation/layout/Arrangement$Vertical;", "spacing", "Landroidx/compose/ui/unit/Dp;", "getSpacing-D9Ej5fM", "()F", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @Stable
    @SourceDebugExtension({"SMAP\nArrangement.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Arrangement.kt\nandroidx/compose/foundation/layout/Arrangement$HorizontalOrVertical\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,715:1\n154#2:716\n*S KotlinDebug\n*F\n+ 1 Arrangement.kt\nandroidx/compose/foundation/layout/Arrangement$HorizontalOrVertical\n*L\n108#1:716\n*E\n"})
    public interface HorizontalOrVertical extends Horizontal, Vertical {

        /* JADX INFO: compiled from: Arrangement.kt */
        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        public static final class DefaultImpls {
            @Deprecated
            /* JADX INFO: renamed from: getSpacing-D9Ej5fM, reason: not valid java name */
            public static float m254getSpacingD9Ej5fM(@NotNull HorizontalOrVertical horizontalOrVertical) {
                return f.a(horizontalOrVertical);
            }
        }

        @Override // androidx.compose.foundation.layout.Arrangement.Horizontal, androidx.compose.foundation.layout.Arrangement.Vertical
        /* JADX INFO: renamed from: getSpacing-D9Ej5fM */
        float getSpacing();
    }

    /* JADX INFO: compiled from: Arrangement.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J$\u0010\u0006\u001a\u00020\u0007*\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fH&R\u001d\u0010\u0002\u001a\u00020\u00038VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005ø\u0001\u0003\u0082\u0002\u0015\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!\n\u0004\b!0\u0001¨\u0006\u000eÀ\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/layout/Arrangement$Vertical;", "", "spacing", "Landroidx/compose/ui/unit/Dp;", "getSpacing-D9Ej5fM", "()F", "arrange", "", "Landroidx/compose/ui/unit/Density;", "totalSize", "", "sizes", "", "outPositions", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @Stable
    @SourceDebugExtension({"SMAP\nArrangement.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Arrangement.kt\nandroidx/compose/foundation/layout/Arrangement$Vertical\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,715:1\n154#2:716\n*S KotlinDebug\n*F\n+ 1 Arrangement.kt\nandroidx/compose/foundation/layout/Arrangement$Vertical\n*L\n80#1:716\n*E\n"})
    public interface Vertical {

        /* JADX INFO: compiled from: Arrangement.kt */
        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        public static final class DefaultImpls {
            @Deprecated
            /* JADX INFO: renamed from: getSpacing-D9Ej5fM, reason: not valid java name */
            public static float m259getSpacingD9Ej5fM(@NotNull Vertical vertical) {
                return g.a(vertical);
            }
        }

        void arrange(@NotNull Density density, int i10, @NotNull int[] iArr, @NotNull int[] iArr2);

        /* JADX INFO: renamed from: getSpacing-D9Ej5fM */
        float getSpacing();
    }

    /* JADX INFO: compiled from: Arrangement.kt */
    public static final class a extends Lambda implements Function2<Integer, LayoutDirection, Integer> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Alignment.Horizontal f4186p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Alignment.Horizontal horizontal) {
            super(2);
            this.f4186p0 = horizontal;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Integer invoke(Integer num, LayoutDirection layoutDirection) {
            int iIntValue = num.intValue();
            LayoutDirection layoutDirection2 = layoutDirection;
            Intrinsics.checkNotNullParameter(layoutDirection2, "layoutDirection");
            return Integer.valueOf(this.f4186p0.align(0, iIntValue, layoutDirection2));
        }
    }

    /* JADX INFO: compiled from: Arrangement.kt */
    public static final class b extends Lambda implements Function2<Integer, LayoutDirection, Integer> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Alignment.Vertical f4187p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Alignment.Vertical vertical) {
            super(2);
            this.f4187p0 = vertical;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Integer invoke(Integer num, LayoutDirection layoutDirection) {
            int iIntValue = num.intValue();
            Intrinsics.checkNotNullParameter(layoutDirection, "<anonymous parameter 1>");
            return Integer.valueOf(this.f4187p0.align(0, iIntValue));
        }
    }

    /* JADX INFO: compiled from: Arrangement.kt */
    public static final class c extends Lambda implements Function2<Integer, LayoutDirection, Integer> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final c f4188p0 = new c(2);

        @Override // kotlin.jvm.functions.Function2
        public final Integer invoke(Integer num, LayoutDirection layoutDirection) {
            int iIntValue = num.intValue();
            LayoutDirection layoutDirection2 = layoutDirection;
            Intrinsics.checkNotNullParameter(layoutDirection2, "layoutDirection");
            return Integer.valueOf(Alignment.INSTANCE.getStart().align(0, iIntValue, layoutDirection2));
        }
    }

    /* JADX INFO: compiled from: Arrangement.kt */
    public static final class d extends Lambda implements Function2<Integer, LayoutDirection, Integer> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Alignment.Horizontal f4189p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Alignment.Horizontal horizontal) {
            super(2);
            this.f4189p0 = horizontal;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Integer invoke(Integer num, LayoutDirection layoutDirection) {
            int iIntValue = num.intValue();
            LayoutDirection layoutDirection2 = layoutDirection;
            Intrinsics.checkNotNullParameter(layoutDirection2, "layoutDirection");
            return Integer.valueOf(this.f4189p0.align(0, iIntValue, layoutDirection2));
        }
    }

    /* JADX INFO: compiled from: Arrangement.kt */
    public static final class e extends Lambda implements Function2<Integer, LayoutDirection, Integer> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Alignment.Vertical f4190p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Alignment.Vertical vertical) {
            super(2);
            this.f4190p0 = vertical;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Integer invoke(Integer num, LayoutDirection layoutDirection) {
            int iIntValue = num.intValue();
            Intrinsics.checkNotNullParameter(layoutDirection, "<anonymous parameter 1>");
            return Integer.valueOf(this.f4190p0.align(0, iIntValue));
        }
    }

    @Stable
    @NotNull
    public final Horizontal aligned(@NotNull Alignment.Horizontal alignment) {
        Intrinsics.checkNotNullParameter(alignment, "alignment");
        return new SpacedAligned(Dp.m4389constructorimpl(0), true, new a(alignment), null);
    }

    @NotNull
    public final Vertical getBottom() {
        return f4164d;
    }

    @NotNull
    public final HorizontalOrVertical getCenter() {
        return f4165e;
    }

    @NotNull
    public final Horizontal getEnd() {
        return f4162b;
    }

    @NotNull
    public final HorizontalOrVertical getSpaceAround() {
        return f4168h;
    }

    @NotNull
    public final HorizontalOrVertical getSpaceBetween() {
        return f4167g;
    }

    @NotNull
    public final HorizontalOrVertical getSpaceEvenly() {
        return f4166f;
    }

    @NotNull
    public final Horizontal getStart() {
        return f4161a;
    }

    @NotNull
    public final Vertical getTop() {
        return f4163c;
    }

    public final void placeCenter$foundation_layout_release(int totalSize, @NotNull int[] size, @NotNull int[] outPosition, boolean reverseInput) {
        Intrinsics.checkNotNullParameter(size, "size");
        Intrinsics.checkNotNullParameter(outPosition, "outPosition");
        int i10 = 0;
        int i11 = 0;
        for (int i12 : size) {
            i11 += i12;
        }
        float f6 = (totalSize - i11) / 2;
        if (!reverseInput) {
            int length = size.length;
            int i13 = 0;
            while (i10 < length) {
                int i14 = size[i10];
                outPosition[i13] = mk.c.roundToInt(f6);
                f6 += i14;
                i10++;
                i13++;
            }
            return;
        }
        int length2 = size.length;
        while (true) {
            length2--;
            if (-1 >= length2) {
                return;
            }
            int i15 = size[length2];
            outPosition[length2] = mk.c.roundToInt(f6);
            f6 += i15;
        }
    }

    public final void placeLeftOrTop$foundation_layout_release(@NotNull int[] size, @NotNull int[] outPosition, boolean reverseInput) {
        Intrinsics.checkNotNullParameter(size, "size");
        Intrinsics.checkNotNullParameter(outPosition, "outPosition");
        int i10 = 0;
        if (!reverseInput) {
            int length = size.length;
            int i11 = 0;
            int i12 = 0;
            while (i10 < length) {
                int i13 = size[i10];
                outPosition[i11] = i12;
                i12 += i13;
                i10++;
                i11++;
            }
            return;
        }
        int length2 = size.length;
        while (true) {
            length2--;
            if (-1 >= length2) {
                return;
            }
            int i14 = size[length2];
            outPosition[length2] = i10;
            i10 += i14;
        }
    }

    public final void placeRightOrBottom$foundation_layout_release(int totalSize, @NotNull int[] size, @NotNull int[] outPosition, boolean reverseInput) {
        Intrinsics.checkNotNullParameter(size, "size");
        Intrinsics.checkNotNullParameter(outPosition, "outPosition");
        int i10 = 0;
        int i11 = 0;
        for (int i12 : size) {
            i11 += i12;
        }
        int i13 = totalSize - i11;
        if (!reverseInput) {
            int length = size.length;
            int i14 = 0;
            while (i10 < length) {
                int i15 = size[i10];
                outPosition[i14] = i13;
                i13 += i15;
                i10++;
                i14++;
            }
            return;
        }
        int length2 = size.length;
        while (true) {
            length2--;
            if (-1 >= length2) {
                return;
            }
            int i16 = size[length2];
            outPosition[length2] = i13;
            i13 += i16;
        }
    }

    public final void placeSpaceAround$foundation_layout_release(int totalSize, @NotNull int[] size, @NotNull int[] outPosition, boolean reverseInput) {
        Intrinsics.checkNotNullParameter(size, "size");
        Intrinsics.checkNotNullParameter(outPosition, "outPosition");
        int i10 = 0;
        int i11 = 0;
        for (int i12 : size) {
            i11 += i12;
        }
        float length = (size.length == 0) ^ true ? (totalSize - i11) / size.length : 0.0f;
        float f6 = length / 2;
        if (reverseInput) {
            for (int length2 = size.length - 1; -1 < length2; length2--) {
                int i13 = size[length2];
                outPosition[length2] = mk.c.roundToInt(f6);
                f6 += i13 + length;
            }
            return;
        }
        int length3 = size.length;
        int i14 = 0;
        while (i10 < length3) {
            int i15 = size[i10];
            outPosition[i14] = mk.c.roundToInt(f6);
            f6 += i15 + length;
            i10++;
            i14++;
        }
    }

    public final void placeSpaceBetween$foundation_layout_release(int totalSize, @NotNull int[] size, @NotNull int[] outPosition, boolean reverseInput) {
        Intrinsics.checkNotNullParameter(size, "size");
        Intrinsics.checkNotNullParameter(outPosition, "outPosition");
        if (size.length == 0) {
            return;
        }
        int i10 = 0;
        int i11 = 0;
        for (int i12 : size) {
            i11 += i12;
        }
        float fMax = (totalSize - i11) / Math.max(ArraysKt___ArraysKt.getLastIndex(size), 1);
        float f6 = (reverseInput && size.length == 1) ? fMax : 0.0f;
        if (reverseInput) {
            for (int length = size.length - 1; -1 < length; length--) {
                int i13 = size[length];
                outPosition[length] = mk.c.roundToInt(f6);
                f6 += i13 + fMax;
            }
            return;
        }
        int length2 = size.length;
        int i14 = 0;
        while (i10 < length2) {
            int i15 = size[i10];
            outPosition[i14] = mk.c.roundToInt(f6);
            f6 += i15 + fMax;
            i10++;
            i14++;
        }
    }

    public final void placeSpaceEvenly$foundation_layout_release(int totalSize, @NotNull int[] size, @NotNull int[] outPosition, boolean reverseInput) {
        Intrinsics.checkNotNullParameter(size, "size");
        Intrinsics.checkNotNullParameter(outPosition, "outPosition");
        int i10 = 0;
        int i11 = 0;
        for (int i12 : size) {
            i11 += i12;
        }
        float length = (totalSize - i11) / (size.length + 1);
        if (reverseInput) {
            float f6 = length;
            for (int length2 = size.length - 1; -1 < length2; length2--) {
                int i13 = size[length2];
                outPosition[length2] = mk.c.roundToInt(f6);
                f6 += i13 + length;
            }
            return;
        }
        int length3 = size.length;
        float f10 = length;
        int i14 = 0;
        while (i10 < length3) {
            int i15 = size[i10];
            outPosition[i14] = mk.c.roundToInt(f10);
            f10 += i15 + length;
            i10++;
            i14++;
        }
    }

    @Stable
    @NotNull
    /* JADX INFO: renamed from: spacedBy-0680j_4, reason: not valid java name */
    public final HorizontalOrVertical m246spacedBy0680j_4(float space) {
        return new SpacedAligned(space, true, c.f4188p0, null);
    }

    @Stable
    @NotNull
    /* JADX INFO: renamed from: spacedBy-D5KLDUw, reason: not valid java name */
    public final Horizontal m247spacedByD5KLDUw(float space, @NotNull Alignment.Horizontal alignment) {
        Intrinsics.checkNotNullParameter(alignment, "alignment");
        return new SpacedAligned(space, true, new d(alignment), null);
    }

    @Stable
    @NotNull
    /* JADX INFO: renamed from: spacedBy-D5KLDUw, reason: not valid java name */
    public final Vertical m248spacedByD5KLDUw(float space, @NotNull Alignment.Vertical alignment) {
        Intrinsics.checkNotNullParameter(alignment, "alignment");
        return new SpacedAligned(space, false, new e(alignment), null);
    }

    @Stable
    @NotNull
    public final Vertical aligned(@NotNull Alignment.Vertical alignment) {
        Intrinsics.checkNotNullParameter(alignment, "alignment");
        return new SpacedAligned(Dp.m4389constructorimpl(0), false, new b(alignment), null);
    }

    /* JADX INFO: compiled from: Arrangement.kt */
    @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0002\b\u0013\b\u0081\b\u0018\u00002\u00020\u0001B6\u0012\u0006\u0010\u0016\u001a\u00020\u000e\u0012\u0006\u0010\u0017\u001a\u00020\u0012\u0012\u001a\u0010\u0018\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0014ø\u0001\u0002¢\u0006\u0004\b.\u0010/J,\u0010\u000b\u001a\u00020\n*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0005H\u0016J$\u0010\u000b\u001a\u00020\n*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0005H\u0016J\b\u0010\r\u001a\u00020\fH\u0016J\u0019\u0010\u0011\u001a\u00020\u000eHÆ\u0003ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u0013\u001a\u00020\u0012HÆ\u0003J\u001d\u0010\u0015\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0014HÆ\u0003JH\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0016\u001a\u00020\u000e2\b\b\u0002\u0010\u0017\u001a\u00020\u00122\u001c\b\u0002\u0010\u0018\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0014HÆ\u0001ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001J\u0013\u0010\u001f\u001a\u00020\u00122\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003R \u0010\u0016\u001a\u00020\u000e8\u0006ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010\u0010R\u0017\u0010\u0017\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R+\u0010\u0018\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00148\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R#\u0010-\u001a\u00020\u000e8\u0016X\u0096\u0004ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b+\u0010!\u001a\u0004\b,\u0010\u0010\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u00060"}, d2 = {"Landroidx/compose/foundation/layout/Arrangement$SpacedAligned;", "Landroidx/compose/foundation/layout/Arrangement$HorizontalOrVertical;", "Landroidx/compose/ui/unit/Density;", "", "totalSize", "", "sizes", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "outPositions", "", "arrange", "", "toString", "Landroidx/compose/ui/unit/Dp;", "component1-D9Ej5fM", "()F", "component1", "", "component2", "Lkotlin/Function2;", "component3", "space", "rtlMirror", "alignment", "copy-8Feqmps", "(FZLkotlin/jvm/functions/Function2;)Landroidx/compose/foundation/layout/Arrangement$SpacedAligned;", "copy", GenerateActivationFormCommand.HASH_CODE, "", "other", "equals", "a", "F", "getSpace-D9Ej5fM", "b", "Z", "getRtlMirror", "()Z", "c", "Lkotlin/jvm/functions/Function2;", "getAlignment", "()Lkotlin/jvm/functions/Function2;", "d", "getSpacing-D9Ej5fM", "spacing", "<init>", "(FZLkotlin/jvm/functions/Function2;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "foundation-layout_release"}, k = 1, mv = {1, 8, 0})
    @Immutable
    @SourceDebugExtension({"SMAP\nArrangement.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Arrangement.kt\nandroidx/compose/foundation/layout/Arrangement$SpacedAligned\n+ 2 Arrangement.kt\nandroidx/compose/foundation/layout/Arrangement\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,715:1\n706#2,2:716\n709#2,5:721\n13674#3,3:718\n*S KotlinDebug\n*F\n+ 1 Arrangement.kt\nandroidx/compose/foundation/layout/Arrangement$SpacedAligned\n*L\n586#1:716,2\n586#1:721,5\n586#1:718,3\n*E\n"})
    public static final /* data */ class SpacedAligned implements HorizontalOrVertical {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        public final float space;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        public final boolean rtlMirror;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public final Function2<Integer, LayoutDirection, Integer> alignment;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        public final float spacing;

        public SpacedAligned() {
            throw null;
        }

        public SpacedAligned(float f6, boolean z10, Function2 function2, DefaultConstructorMarker defaultConstructorMarker) {
            this.space = f6;
            this.rtlMirror = z10;
            this.alignment = function2;
            this.spacing = f6;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: copy-8Feqmps$default, reason: not valid java name */
        public static /* synthetic */ SpacedAligned m255copy8Feqmps$default(SpacedAligned spacedAligned, float f6, boolean z10, Function2 function2, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                f6 = spacedAligned.space;
            }
            if ((i10 & 2) != 0) {
                z10 = spacedAligned.rtlMirror;
            }
            if ((i10 & 4) != 0) {
                function2 = spacedAligned.alignment;
            }
            return spacedAligned.m257copy8Feqmps(f6, z10, function2);
        }

        @Override // androidx.compose.foundation.layout.Arrangement.Horizontal
        public void arrange(@NotNull Density density, int i10, @NotNull int[] sizes, @NotNull LayoutDirection layoutDirection, @NotNull int[] outPositions) {
            int i11;
            int iMin;
            Intrinsics.checkNotNullParameter(density, "<this>");
            Intrinsics.checkNotNullParameter(sizes, "sizes");
            Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
            Intrinsics.checkNotNullParameter(outPositions, "outPositions");
            if (sizes.length == 0) {
                return;
            }
            int iMo413roundToPx0680j_4 = density.mo413roundToPx0680j_4(this.space);
            boolean z10 = this.rtlMirror && layoutDirection == LayoutDirection.Rtl;
            Arrangement arrangement = Arrangement.INSTANCE;
            if (z10) {
                i11 = 0;
                iMin = 0;
                for (int length = sizes.length - 1; -1 < length; length--) {
                    int i12 = sizes[length];
                    int iMin2 = Math.min(i11, i10 - i12);
                    outPositions[length] = iMin2;
                    iMin = Math.min(iMo413roundToPx0680j_4, (i10 - iMin2) - i12);
                    i11 = outPositions[length] + i12 + iMin;
                }
            } else {
                int length2 = sizes.length;
                int i13 = 0;
                i11 = 0;
                iMin = 0;
                int i14 = 0;
                while (i13 < length2) {
                    int i15 = sizes[i13];
                    int iMin3 = Math.min(i11, i10 - i15);
                    outPositions[i14] = iMin3;
                    int iMin4 = Math.min(iMo413roundToPx0680j_4, (i10 - iMin3) - i15);
                    int i16 = outPositions[i14] + i15 + iMin4;
                    i13++;
                    i14++;
                    iMin = iMin4;
                    i11 = i16;
                }
            }
            int i17 = i11 - iMin;
            Function2<Integer, LayoutDirection, Integer> function2 = this.alignment;
            if (function2 == null || i17 >= i10) {
                return;
            }
            int iIntValue = function2.invoke(Integer.valueOf(i10 - i17), layoutDirection).intValue();
            int length3 = outPositions.length;
            for (int i18 = 0; i18 < length3; i18++) {
                outPositions[i18] = outPositions[i18] + iIntValue;
            }
        }

        /* JADX INFO: renamed from: component1-D9Ej5fM, reason: not valid java name and from getter */
        public final float getSpace() {
            return this.space;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final boolean getRtlMirror() {
            return this.rtlMirror;
        }

        @Nullable
        public final Function2<Integer, LayoutDirection, Integer> component3() {
            return this.alignment;
        }

        @NotNull
        /* JADX INFO: renamed from: copy-8Feqmps, reason: not valid java name */
        public final SpacedAligned m257copy8Feqmps(float space, boolean rtlMirror, @Nullable Function2<? super Integer, ? super LayoutDirection, Integer> alignment) {
            return new SpacedAligned(space, rtlMirror, alignment, null);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SpacedAligned)) {
                return false;
            }
            SpacedAligned spacedAligned = (SpacedAligned) other;
            return Dp.m4394equalsimpl0(this.space, spacedAligned.space) && this.rtlMirror == spacedAligned.rtlMirror && Intrinsics.areEqual(this.alignment, spacedAligned.alignment);
        }

        @Nullable
        public final Function2<Integer, LayoutDirection, Integer> getAlignment() {
            return this.alignment;
        }

        public final boolean getRtlMirror() {
            return this.rtlMirror;
        }

        /* JADX INFO: renamed from: getSpace-D9Ej5fM, reason: not valid java name */
        public final float m258getSpaceD9Ej5fM() {
            return this.space;
        }

        @Override // androidx.compose.foundation.layout.Arrangement.HorizontalOrVertical, androidx.compose.foundation.layout.Arrangement.Horizontal, androidx.compose.foundation.layout.Arrangement.Vertical
        /* JADX INFO: renamed from: getSpacing-D9Ej5fM, reason: from getter */
        public float getSpacing() {
            return this.spacing;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v3, types: [int] */
        /* JADX WARN: Type inference failed for: r1v1, types: [int] */
        /* JADX WARN: Type inference failed for: r1v6 */
        /* JADX WARN: Type inference failed for: r1v7 */
        public int hashCode() {
            int iM4395hashCodeimpl = Dp.m4395hashCodeimpl(this.space) * 31;
            boolean z10 = this.rtlMirror;
            ?? r1 = z10;
            if (z10) {
                r1 = 1;
            }
            int i10 = (iM4395hashCodeimpl + r1) * 31;
            Function2<Integer, LayoutDirection, Integer> function2 = this.alignment;
            return i10 + (function2 == null ? 0 : function2.hashCode());
        }

        @NotNull
        public String toString() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.rtlMirror ? "" : "Absolute");
            sb2.append("Arrangement#spacedAligned(");
            sb2.append((Object) Dp.m4400toStringimpl(this.space));
            sb2.append(", ");
            sb2.append(this.alignment);
            sb2.append(RootService.CLOSE_BRACKET);
            return sb2.toString();
        }

        @Override // androidx.compose.foundation.layout.Arrangement.Vertical
        public void arrange(@NotNull Density density, int i10, @NotNull int[] sizes, @NotNull int[] outPositions) {
            Intrinsics.checkNotNullParameter(density, "<this>");
            Intrinsics.checkNotNullParameter(sizes, "sizes");
            Intrinsics.checkNotNullParameter(outPositions, "outPositions");
            arrange(density, i10, sizes, LayoutDirection.Ltr, outPositions);
        }
    }

    @Stable
    public static /* synthetic */ void getBottom$annotations() {
    }

    @Stable
    public static /* synthetic */ void getCenter$annotations() {
    }

    @Stable
    public static /* synthetic */ void getEnd$annotations() {
    }

    @Stable
    public static /* synthetic */ void getSpaceAround$annotations() {
    }

    @Stable
    public static /* synthetic */ void getSpaceBetween$annotations() {
    }

    @Stable
    public static /* synthetic */ void getSpaceEvenly$annotations() {
    }

    @Stable
    public static /* synthetic */ void getStart$annotations() {
    }

    @Stable
    public static /* synthetic */ void getTop$annotations() {
    }
}
