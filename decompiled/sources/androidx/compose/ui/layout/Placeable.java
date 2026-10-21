package androidx.compose.ui.layout;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.node.LayoutNodeLayoutDelegate;
import androidx.compose.ui.node.LookaheadCapablePlaceable;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.databinding.f;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import g1.g;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Placeable.kt */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000f\b'\u0018\u00002\u00020\u0001:\u0001/B\u0007¢\u0006\u0004\b-\u0010.J@\u0010\r\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0019\u0010\n\u001a\u0015\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006¢\u0006\u0002\b\tH$ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000b\u0010\fR$\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R$\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0015\u0010\u0011\u001a\u0004\b\u0016\u0010\u0013R3\u0010 \u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00188\u0004@DX\u0084\u000eø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR3\u0010%\u001a\u00020!2\u0006\u0010\u0019\u001a\u00020!8\u0004@DX\u0084\u000eø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0012\n\u0004\b\"\u0010\u001b\u001a\u0004\b#\u0010\u001d\"\u0004\b$\u0010\u001fR-\u0010(\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u00028\u0004@BX\u0084\u000eø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\f\n\u0004\b&\u0010\u001b\u001a\u0004\b'\u0010\u001dR\u0014\u0010*\u001a\u00020\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b)\u0010\u0013R\u0014\u0010,\u001a\u00020\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b+\u0010\u0013\u0082\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u00060"}, d2 = {"Landroidx/compose/ui/layout/Placeable;", "Landroidx/compose/ui/layout/Measured;", "Landroidx/compose/ui/unit/IntOffset;", "position", "", "zIndex", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/GraphicsLayerScope;", "", "Lkotlin/ExtensionFunctionType;", "layerBlock", "placeAt-f8xVGno", "(JFLkotlin/jvm/functions/Function1;)V", "placeAt", "", "<set-?>", "p0", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getWidth", "()I", "width", "q0", "getHeight", "height", "Landroidx/compose/ui/unit/IntSize;", "value", "r0", "J", "getMeasuredSize-YbymL2g", "()J", "setMeasuredSize-ozmzZPI", "(J)V", "measuredSize", "Landroidx/compose/ui/unit/Constraints;", "s0", "getMeasurementConstraints-msEJaDk", "setMeasurementConstraints-BRTryo0", "measurementConstraints", "t0", "getApparentToRealOffset-nOcc-ac", "apparentToRealOffset", "getMeasuredWidth", "measuredWidth", "getMeasuredHeight", "measuredHeight", "<init>", "()V", "PlacementScope", "ui_release"}, k = 1, mv = {1, 8, 0})
public abstract class Placeable implements Measured {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: p0, reason: collision with root package name and from kotlin metadata */
    public int width;

    /* JADX INFO: renamed from: q0, reason: collision with root package name and from kotlin metadata */
    public int height;

    /* JADX INFO: renamed from: r0, reason: collision with root package name and from kotlin metadata */
    public long measuredSize = IntSizeKt.IntSize(0, 0);

    /* JADX INFO: renamed from: s0, reason: collision with root package name and from kotlin metadata */
    public long measurementConstraints = PlaceableKt.f16654b;

    /* JADX INFO: renamed from: t0, reason: collision with root package name and from kotlin metadata */
    public long apparentToRealOffset = IntOffset.INSTANCE.m4517getZeronOccac();

    /* JADX INFO: compiled from: Placeable.kt */
    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b'\u0018\u0000 )2\u00020\u0001:\u0001)B\u0005¢\u0006\u0002\u0010\u0002J)\u0010\u000f\u001a\u00020\u0010*\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u0015ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0016\u0010\u0017J$\u0010\u000f\u001a\u00020\u0010*\u00020\u00112\u0006\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\f2\b\b\u0002\u0010\u0014\u001a\u00020\u0015JJ\u0010\u001a\u001a\u00020\u0010*\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u001b\b\b\u0010\u001b\u001a\u0015\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u001c¢\u0006\u0002\b\u001eH\u0080\bø\u0001\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001f\u0010 JJ\u0010!\u001a\u00020\u0010*\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u001b\b\b\u0010\u001b\u001a\u0015\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u001c¢\u0006\u0002\b\u001eH\u0080\bø\u0001\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\"\u0010 J)\u0010#\u001a\u00020\u0010*\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u0015ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b$\u0010\u0017J$\u0010#\u001a\u00020\u0010*\u00020\u00112\u0006\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\f2\b\b\u0002\u0010\u0014\u001a\u00020\u0015JD\u0010%\u001a\u00020\u0010*\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00152\u0019\b\u0002\u0010\u001b\u001a\u0013\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u00100\u001c¢\u0006\u0002\b\u001eø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b&\u0010 J?\u0010%\u001a\u00020\u0010*\u00020\u00112\u0006\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\f2\b\b\u0002\u0010\u0014\u001a\u00020\u00152\u0019\b\u0002\u0010\u001b\u001a\u0013\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u00100\u001c¢\u0006\u0002\b\u001eJD\u0010'\u001a\u00020\u0010*\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00152\u0019\b\u0002\u0010\u001b\u001a\u0013\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u00100\u001c¢\u0006\u0002\b\u001eø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b(\u0010 J?\u0010'\u001a\u00020\u0010*\u00020\u00112\u0006\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\f2\b\b\u0002\u0010\u0014\u001a\u00020\u00152\u0019\b\u0002\u0010\u001b\u001a\u0013\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u00100\u001c¢\u0006\u0002\b\u001eR\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0012\u0010\u0007\u001a\u00020\bX¤\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0012\u0010\u000b\u001a\u00020\fX¤\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e\u0082\u0002\u0012\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0005\b\u009920\u0001¨\u0006*"}, d2 = {"Landroidx/compose/ui/layout/Placeable$PlacementScope;", "", "()V", "coordinates", "Landroidx/compose/ui/layout/LayoutCoordinates;", "getCoordinates", "()Landroidx/compose/ui/layout/LayoutCoordinates;", "parentLayoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "getParentLayoutDirection", "()Landroidx/compose/ui/unit/LayoutDirection;", "parentWidth", "", "getParentWidth", "()I", "place", "", "Landroidx/compose/ui/layout/Placeable;", "position", "Landroidx/compose/ui/unit/IntOffset;", "zIndex", "", "place-70tqf50", "(Landroidx/compose/ui/layout/Placeable;JF)V", "x", "y", "placeApparentToRealOffset", "layerBlock", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/GraphicsLayerScope;", "Lkotlin/ExtensionFunctionType;", "placeApparentToRealOffset-aW-9-wM$ui_release", "(Landroidx/compose/ui/layout/Placeable;JFLkotlin/jvm/functions/Function1;)V", "placeAutoMirrored", "placeAutoMirrored-aW-9-wM$ui_release", "placeRelative", "placeRelative-70tqf50", "placeRelativeWithLayer", "placeRelativeWithLayer-aW-9-wM", "placeWithLayer", "placeWithLayer-aW-9-wM", "Companion", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nPlaceable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Placeable.kt\nandroidx/compose/ui/layout/Placeable$PlacementScope\n+ 2 IntOffset.kt\nandroidx/compose/ui/unit/IntOffset\n*L\n1#1,426:1\n320#1,2:427\n337#1:429\n338#1:431\n323#1,2:432\n337#1,2:434\n329#1:436\n320#1,2:437\n337#1:439\n338#1:441\n323#1,2:442\n337#1,2:444\n329#1:446\n337#1:447\n338#1:449\n337#1:450\n338#1:452\n320#1,2:453\n337#1:455\n338#1:457\n323#1,2:458\n337#1,2:460\n329#1:462\n320#1,2:463\n337#1:465\n338#1:467\n323#1,2:468\n337#1,2:470\n329#1:472\n337#1:473\n338#1:475\n337#1:476\n338#1:478\n337#1:479\n338#1:481\n337#1:482\n338#1:484\n86#2:430\n86#2:440\n86#2:448\n86#2:451\n86#2:456\n86#2:466\n86#2:474\n86#2:477\n86#2:480\n86#2:483\n86#2:485\n*S KotlinDebug\n*F\n+ 1 Placeable.kt\nandroidx/compose/ui/layout/Placeable$PlacementScope\n*L\n186#1:427,2\n186#1:429\n186#1:431\n186#1:432,2\n186#1:434,2\n186#1:436\n202#1:437,2\n202#1:439\n202#1:441\n202#1:442,2\n202#1:444,2\n202#1:446\n214#1:447\n214#1:449\n226#1:450\n226#1:452\n249#1:453,2\n249#1:455\n249#1:457\n249#1:458,2\n249#1:460,2\n249#1:462\n273#1:463,2\n273#1:465\n273#1:467\n273#1:468,2\n273#1:470,2\n273#1:472\n293#1:473\n293#1:475\n312#1:476\n312#1:478\n321#1:479\n321#1:481\n323#1:482\n323#1:484\n186#1:430\n202#1:440\n214#1:448\n226#1:451\n249#1:456\n273#1:466\n293#1:474\n312#1:477\n321#1:480\n323#1:483\n337#1:485\n*E\n"})
    public static abstract class PlacementScope {
        public static final int $stable = 0;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static LayoutDirection f16649a = LayoutDirection.Ltr;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static int f16650b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        public static LayoutCoordinates f16651c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @Nullable
        public static LayoutNodeLayoutDelegate f16652d;

        /* JADX INFO: compiled from: Placeable.kt */
        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001d\u0010\u001eJA\u0010\f\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0019\b\u0004\u0010\u000b\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0002\b\nH\u0086\bø\u0001\u0000R$\u0010\u0005\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u00048\u0014@RX\u0094\u000e¢\u0006\f\n\u0004\b\u0005\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R$\u0010\u0003\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u00028\u0014@RX\u0094\u000e¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0017\u001a\u0004\u0018\u00010\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u001f"}, d2 = {"Landroidx/compose/ui/layout/Placeable$PlacementScope$Companion;", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "", "parentWidth", "Landroidx/compose/ui/unit/LayoutDirection;", "parentLayoutDirection", "Landroidx/compose/ui/node/LookaheadCapablePlaceable;", "lookaheadCapablePlaceable", "Lkotlin/Function1;", "", "Lkotlin/ExtensionFunctionType;", "block", "executeWithRtlMirroringValues", "<set-?>", "Landroidx/compose/ui/unit/LayoutDirection;", "getParentLayoutDirection", "()Landroidx/compose/ui/unit/LayoutDirection;", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getParentWidth", "()I", "Landroidx/compose/ui/layout/LayoutCoordinates;", "getCoordinates", "()Landroidx/compose/ui/layout/LayoutCoordinates;", "coordinates", "_coordinates", "Landroidx/compose/ui/layout/LayoutCoordinates;", "Landroidx/compose/ui/node/LayoutNodeLayoutDelegate;", "layoutDelegate", "Landroidx/compose/ui/node/LayoutNodeLayoutDelegate;", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 8, 0})
        public static final class Companion extends PlacementScope {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public static final boolean access$configureForPlacingForAlignment(Companion companion, LookaheadCapablePlaceable lookaheadCapablePlaceable) {
                companion.getClass();
                if (lookaheadCapablePlaceable == null) {
                    PlacementScope.f16651c = null;
                    PlacementScope.f16652d = null;
                    return false;
                }
                boolean zIsPlacingForAlignment$ui_release = lookaheadCapablePlaceable.getIsPlacingForAlignment();
                LookaheadCapablePlaceable parent = lookaheadCapablePlaceable.getParent();
                if (parent != null && parent.getIsPlacingForAlignment()) {
                    lookaheadCapablePlaceable.setPlacingForAlignment$ui_release(true);
                }
                PlacementScope.f16652d = lookaheadCapablePlaceable.getLayoutNode().getLayoutDelegate();
                if (lookaheadCapablePlaceable.getIsPlacingForAlignment() || lookaheadCapablePlaceable.getIsShallowPlacing()) {
                    PlacementScope.f16651c = null;
                } else {
                    PlacementScope.f16651c = lookaheadCapablePlaceable.getCoordinates();
                }
                return zIsPlacingForAlignment$ui_release;
            }

            public final void executeWithRtlMirroringValues(int parentWidth, @NotNull LayoutDirection parentLayoutDirection, @Nullable LookaheadCapablePlaceable lookaheadCapablePlaceable, @NotNull Function1<? super PlacementScope, Unit> block) {
                Intrinsics.checkNotNullParameter(parentLayoutDirection, "parentLayoutDirection");
                Intrinsics.checkNotNullParameter(block, "block");
                LayoutCoordinates layoutCoordinates = PlacementScope.f16651c;
                Companion companion = PlacementScope.INSTANCE;
                int parentWidth2 = companion.getParentWidth();
                LayoutDirection parentLayoutDirection2 = companion.getParentLayoutDirection();
                LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = PlacementScope.f16652d;
                PlacementScope.f16650b = parentWidth;
                PlacementScope.f16649a = parentLayoutDirection;
                boolean zAccess$configureForPlacingForAlignment = access$configureForPlacingForAlignment(this, lookaheadCapablePlaceable);
                block.invoke(this);
                if (lookaheadCapablePlaceable != null) {
                    lookaheadCapablePlaceable.setPlacingForAlignment$ui_release(zAccess$configureForPlacingForAlignment);
                }
                PlacementScope.f16650b = parentWidth2;
                PlacementScope.f16649a = parentLayoutDirection2;
                PlacementScope.f16651c = layoutCoordinates;
                PlacementScope.f16652d = layoutNodeLayoutDelegate;
            }

            @Override // androidx.compose.ui.layout.Placeable.PlacementScope
            @Nullable
            public LayoutCoordinates getCoordinates() {
                LayoutNodeLayoutDelegate layoutNodeLayoutDelegate;
                if (PlacementScope.f16651c == null && (layoutNodeLayoutDelegate = PlacementScope.f16652d) != null) {
                    layoutNodeLayoutDelegate.onCoordinatesUsed();
                }
                return PlacementScope.f16651c;
            }

            @Override // androidx.compose.ui.layout.Placeable.PlacementScope
            @NotNull
            public LayoutDirection getParentLayoutDirection() {
                return PlacementScope.f16649a;
            }

            @Override // androidx.compose.ui.layout.Placeable.PlacementScope
            public int getParentWidth() {
                return PlacementScope.f16650b;
            }

            public Companion() {
            }
        }

        public static /* synthetic */ void place$default(PlacementScope placementScope, Placeable placeable, int i10, int i11, float f6, int i12, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: place");
            }
            if ((i12 & 4) != 0) {
                f6 = 0.0f;
            }
            placementScope.place(placeable, i10, i11, f6);
        }

        /* JADX INFO: renamed from: place-70tqf50$default, reason: not valid java name */
        public static /* synthetic */ void m3611place70tqf50$default(PlacementScope placementScope, Placeable placeable, long j10, float f6, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: place-70tqf50");
            }
            if ((i10 & 2) != 0) {
                f6 = 0.0f;
            }
            placementScope.m3615place70tqf50(placeable, j10, f6);
        }

        public static /* synthetic */ void placeRelative$default(PlacementScope placementScope, Placeable placeable, int i10, int i11, float f6, int i12, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeRelative");
            }
            if ((i12 & 4) != 0) {
                f6 = 0.0f;
            }
            placementScope.placeRelative(placeable, i10, i11, f6);
        }

        /* JADX INFO: renamed from: placeRelative-70tqf50$default, reason: not valid java name */
        public static /* synthetic */ void m3612placeRelative70tqf50$default(PlacementScope placementScope, Placeable placeable, long j10, float f6, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeRelative-70tqf50");
            }
            if ((i10 & 2) != 0) {
                f6 = 0.0f;
            }
            placementScope.m3618placeRelative70tqf50(placeable, j10, f6);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void placeRelativeWithLayer$default(PlacementScope placementScope, Placeable placeable, int i10, int i11, float f6, Function1 function1, int i12, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeRelativeWithLayer");
            }
            if ((i12 & 4) != 0) {
                f6 = 0.0f;
            }
            float f10 = f6;
            if ((i12 & 8) != 0) {
                function1 = PlaceableKt.f16653a;
            }
            placementScope.placeRelativeWithLayer(placeable, i10, i11, f10, function1);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: placeRelativeWithLayer-aW-9-wM$default, reason: not valid java name */
        public static /* synthetic */ void m3613placeRelativeWithLayeraW9wM$default(PlacementScope placementScope, Placeable placeable, long j10, float f6, Function1 function1, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeRelativeWithLayer-aW-9-wM");
            }
            if ((i10 & 2) != 0) {
                f6 = 0.0f;
            }
            float f10 = f6;
            if ((i10 & 4) != 0) {
                function1 = PlaceableKt.f16653a;
            }
            placementScope.m3619placeRelativeWithLayeraW9wM(placeable, j10, f10, function1);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void placeWithLayer$default(PlacementScope placementScope, Placeable placeable, int i10, int i11, float f6, Function1 function1, int i12, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeWithLayer");
            }
            if ((i12 & 4) != 0) {
                f6 = 0.0f;
            }
            float f10 = f6;
            if ((i12 & 8) != 0) {
                function1 = PlaceableKt.f16653a;
            }
            placementScope.placeWithLayer(placeable, i10, i11, f10, function1);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: placeWithLayer-aW-9-wM$default, reason: not valid java name */
        public static /* synthetic */ void m3614placeWithLayeraW9wM$default(PlacementScope placementScope, Placeable placeable, long j10, float f6, Function1 function1, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeWithLayer-aW-9-wM");
            }
            if ((i10 & 2) != 0) {
                f6 = 0.0f;
            }
            float f10 = f6;
            if ((i10 & 4) != 0) {
                function1 = PlaceableKt.f16653a;
            }
            placementScope.m3620placeWithLayeraW9wM(placeable, j10, f10, function1);
        }

        @Nullable
        public LayoutCoordinates getCoordinates() {
            return null;
        }

        @NotNull
        public abstract LayoutDirection getParentLayoutDirection();

        public abstract int getParentWidth();

        public final void place(@NotNull Placeable placeable, int i10, int i11, float f6) {
            Intrinsics.checkNotNullParameter(placeable, "<this>");
            long jIntOffset = IntOffsetKt.IntOffset(i10, i11);
            long j10 = placeable.apparentToRealOffset;
            placeable.mo3579placeAtf8xVGno(f.b(j10, IntOffset.m4508getYimpl(jIntOffset), IntOffset.m4507getXimpl(j10) + IntOffset.m4507getXimpl(jIntOffset)), f6, null);
        }

        /* JADX INFO: renamed from: place-70tqf50, reason: not valid java name */
        public final void m3615place70tqf50(@NotNull Placeable place, long j10, float f6) {
            Intrinsics.checkNotNullParameter(place, "$this$place");
            long j11 = place.apparentToRealOffset;
            place.mo3579placeAtf8xVGno(f.b(j11, IntOffset.m4508getYimpl(j10), IntOffset.m4507getXimpl(j11) + IntOffset.m4507getXimpl(j10)), f6, null);
        }

        /* JADX INFO: renamed from: placeApparentToRealOffset-aW-9-wM$ui_release, reason: not valid java name */
        public final void m3616placeApparentToRealOffsetaW9wM$ui_release(@NotNull Placeable placeApparentToRealOffset, long j10, float f6, @Nullable Function1<? super GraphicsLayerScope, Unit> function1) {
            Intrinsics.checkNotNullParameter(placeApparentToRealOffset, "$this$placeApparentToRealOffset");
            long j11 = placeApparentToRealOffset.apparentToRealOffset;
            placeApparentToRealOffset.mo3579placeAtf8xVGno(f.b(j11, IntOffset.m4508getYimpl(j10), IntOffset.m4507getXimpl(j11) + IntOffset.m4507getXimpl(j10)), f6, function1);
        }

        /* JADX INFO: renamed from: placeAutoMirrored-aW-9-wM$ui_release, reason: not valid java name */
        public final void m3617placeAutoMirroredaW9wM$ui_release(@NotNull Placeable placeAutoMirrored, long j10, float f6, @Nullable Function1<? super GraphicsLayerScope, Unit> function1) {
            Intrinsics.checkNotNullParameter(placeAutoMirrored, "$this$placeAutoMirrored");
            if (getParentLayoutDirection() == LayoutDirection.Ltr || getParentWidth() == 0) {
                long j11 = placeAutoMirrored.apparentToRealOffset;
                placeAutoMirrored.mo3579placeAtf8xVGno(f.b(j11, IntOffset.m4508getYimpl(j10), IntOffset.m4507getXimpl(j11) + IntOffset.m4507getXimpl(j10)), f6, function1);
                return;
            }
            long jIntOffset = IntOffsetKt.IntOffset((getParentWidth() - placeAutoMirrored.getWidth()) - IntOffset.m4507getXimpl(j10), IntOffset.m4508getYimpl(j10));
            long j12 = placeAutoMirrored.apparentToRealOffset;
            placeAutoMirrored.mo3579placeAtf8xVGno(f.b(j12, IntOffset.m4508getYimpl(jIntOffset), IntOffset.m4507getXimpl(j12) + IntOffset.m4507getXimpl(jIntOffset)), f6, function1);
        }

        public final void placeRelative(@NotNull Placeable placeable, int i10, int i11, float f6) {
            Intrinsics.checkNotNullParameter(placeable, "<this>");
            long jIntOffset = IntOffsetKt.IntOffset(i10, i11);
            if (getParentLayoutDirection() == LayoutDirection.Ltr || getParentWidth() == 0) {
                long j10 = placeable.apparentToRealOffset;
                placeable.mo3579placeAtf8xVGno(f.b(j10, IntOffset.m4508getYimpl(jIntOffset), IntOffset.m4507getXimpl(j10) + IntOffset.m4507getXimpl(jIntOffset)), f6, null);
                return;
            }
            long jIntOffset2 = IntOffsetKt.IntOffset((getParentWidth() - placeable.getWidth()) - IntOffset.m4507getXimpl(jIntOffset), IntOffset.m4508getYimpl(jIntOffset));
            long j11 = placeable.apparentToRealOffset;
            placeable.mo3579placeAtf8xVGno(f.b(j11, IntOffset.m4508getYimpl(jIntOffset2), IntOffset.m4507getXimpl(j11) + IntOffset.m4507getXimpl(jIntOffset2)), f6, null);
        }

        /* JADX INFO: renamed from: placeRelative-70tqf50, reason: not valid java name */
        public final void m3618placeRelative70tqf50(@NotNull Placeable placeRelative, long j10, float f6) {
            Intrinsics.checkNotNullParameter(placeRelative, "$this$placeRelative");
            if (getParentLayoutDirection() == LayoutDirection.Ltr || getParentWidth() == 0) {
                long j11 = placeRelative.apparentToRealOffset;
                placeRelative.mo3579placeAtf8xVGno(f.b(j11, IntOffset.m4508getYimpl(j10), IntOffset.m4507getXimpl(j11) + IntOffset.m4507getXimpl(j10)), f6, null);
                return;
            }
            long jIntOffset = IntOffsetKt.IntOffset((getParentWidth() - placeRelative.getWidth()) - IntOffset.m4507getXimpl(j10), IntOffset.m4508getYimpl(j10));
            long j12 = placeRelative.apparentToRealOffset;
            placeRelative.mo3579placeAtf8xVGno(f.b(j12, IntOffset.m4508getYimpl(jIntOffset), IntOffset.m4507getXimpl(j12) + IntOffset.m4507getXimpl(jIntOffset)), f6, null);
        }

        public final void placeRelativeWithLayer(@NotNull Placeable placeable, int i10, int i11, float f6, @NotNull Function1<? super GraphicsLayerScope, Unit> layerBlock) {
            Intrinsics.checkNotNullParameter(placeable, "<this>");
            Intrinsics.checkNotNullParameter(layerBlock, "layerBlock");
            long jIntOffset = IntOffsetKt.IntOffset(i10, i11);
            if (getParentLayoutDirection() == LayoutDirection.Ltr || getParentWidth() == 0) {
                long j10 = placeable.apparentToRealOffset;
                placeable.mo3579placeAtf8xVGno(f.b(j10, IntOffset.m4508getYimpl(jIntOffset), IntOffset.m4507getXimpl(j10) + IntOffset.m4507getXimpl(jIntOffset)), f6, layerBlock);
                return;
            }
            long jIntOffset2 = IntOffsetKt.IntOffset((getParentWidth() - placeable.getWidth()) - IntOffset.m4507getXimpl(jIntOffset), IntOffset.m4508getYimpl(jIntOffset));
            long j11 = placeable.apparentToRealOffset;
            placeable.mo3579placeAtf8xVGno(f.b(j11, IntOffset.m4508getYimpl(jIntOffset2), IntOffset.m4507getXimpl(j11) + IntOffset.m4507getXimpl(jIntOffset2)), f6, layerBlock);
        }

        /* JADX INFO: renamed from: placeRelativeWithLayer-aW-9-wM, reason: not valid java name */
        public final void m3619placeRelativeWithLayeraW9wM(@NotNull Placeable placeRelativeWithLayer, long j10, float f6, @NotNull Function1<? super GraphicsLayerScope, Unit> layerBlock) {
            Intrinsics.checkNotNullParameter(placeRelativeWithLayer, "$this$placeRelativeWithLayer");
            Intrinsics.checkNotNullParameter(layerBlock, "layerBlock");
            if (getParentLayoutDirection() == LayoutDirection.Ltr || getParentWidth() == 0) {
                long j11 = placeRelativeWithLayer.apparentToRealOffset;
                placeRelativeWithLayer.mo3579placeAtf8xVGno(f.b(j11, IntOffset.m4508getYimpl(j10), IntOffset.m4507getXimpl(j11) + IntOffset.m4507getXimpl(j10)), f6, layerBlock);
                return;
            }
            long jIntOffset = IntOffsetKt.IntOffset((getParentWidth() - placeRelativeWithLayer.getWidth()) - IntOffset.m4507getXimpl(j10), IntOffset.m4508getYimpl(j10));
            long j12 = placeRelativeWithLayer.apparentToRealOffset;
            placeRelativeWithLayer.mo3579placeAtf8xVGno(f.b(j12, IntOffset.m4508getYimpl(jIntOffset), IntOffset.m4507getXimpl(j12) + IntOffset.m4507getXimpl(jIntOffset)), f6, layerBlock);
        }

        public final void placeWithLayer(@NotNull Placeable placeable, int i10, int i11, float f6, @NotNull Function1<? super GraphicsLayerScope, Unit> layerBlock) {
            Intrinsics.checkNotNullParameter(placeable, "<this>");
            Intrinsics.checkNotNullParameter(layerBlock, "layerBlock");
            long jIntOffset = IntOffsetKt.IntOffset(i10, i11);
            long j10 = placeable.apparentToRealOffset;
            placeable.mo3579placeAtf8xVGno(f.b(j10, IntOffset.m4508getYimpl(jIntOffset), IntOffset.m4507getXimpl(j10) + IntOffset.m4507getXimpl(jIntOffset)), f6, layerBlock);
        }

        /* JADX INFO: renamed from: placeWithLayer-aW-9-wM, reason: not valid java name */
        public final void m3620placeWithLayeraW9wM(@NotNull Placeable placeWithLayer, long j10, float f6, @NotNull Function1<? super GraphicsLayerScope, Unit> layerBlock) {
            Intrinsics.checkNotNullParameter(placeWithLayer, "$this$placeWithLayer");
            Intrinsics.checkNotNullParameter(layerBlock, "layerBlock");
            long j11 = placeWithLayer.apparentToRealOffset;
            placeWithLayer.mo3579placeAtf8xVGno(f.b(j11, IntOffset.m4508getYimpl(j10), IntOffset.m4507getXimpl(j11) + IntOffset.m4507getXimpl(j10)), f6, layerBlock);
        }
    }

    public final void a() {
        this.width = kotlin.ranges.c.coerceIn(IntSize.m4549getWidthimpl(this.measuredSize), Constraints.m4359getMinWidthimpl(this.measurementConstraints), Constraints.m4357getMaxWidthimpl(this.measurementConstraints));
        this.height = kotlin.ranges.c.coerceIn(IntSize.m4548getHeightimpl(this.measuredSize), Constraints.m4358getMinHeightimpl(this.measurementConstraints), Constraints.m4356getMaxHeightimpl(this.measurementConstraints));
        this.apparentToRealOffset = IntOffsetKt.IntOffset((this.width - IntSize.m4549getWidthimpl(this.measuredSize)) / 2, (this.height - IntSize.m4548getHeightimpl(this.measuredSize)) / 2);
    }

    /* JADX INFO: renamed from: getApparentToRealOffset-nOcc-ac, reason: not valid java name and from getter */
    public final long getApparentToRealOffset() {
        return this.apparentToRealOffset;
    }

    public final int getHeight() {
        return this.height;
    }

    @Override // androidx.compose.ui.layout.Measured
    public int getMeasuredHeight() {
        return IntSize.m4548getHeightimpl(this.measuredSize);
    }

    /* JADX INFO: renamed from: getMeasuredSize-YbymL2g, reason: not valid java name and from getter */
    public final long getMeasuredSize() {
        return this.measuredSize;
    }

    @Override // androidx.compose.ui.layout.Measured
    public int getMeasuredWidth() {
        return IntSize.m4549getWidthimpl(this.measuredSize);
    }

    /* JADX INFO: renamed from: getMeasurementConstraints-msEJaDk, reason: not valid java name and from getter */
    public final long getMeasurementConstraints() {
        return this.measurementConstraints;
    }

    @Override // androidx.compose.ui.layout.Measured, androidx.compose.ui.layout.IntrinsicMeasurable
    public /* synthetic */ Object getParentData() {
        return g.a(this);
    }

    public final int getWidth() {
        return this.width;
    }

    /* JADX INFO: renamed from: placeAt-f8xVGno */
    public abstract void mo3579placeAtf8xVGno(long position, float zIndex, @Nullable Function1<? super GraphicsLayerScope, Unit> layerBlock);

    /* JADX INFO: renamed from: setMeasuredSize-ozmzZPI, reason: not valid java name */
    public final void m3609setMeasuredSizeozmzZPI(long j10) {
        if (IntSize.m4547equalsimpl0(this.measuredSize, j10)) {
            return;
        }
        this.measuredSize = j10;
        a();
    }

    /* JADX INFO: renamed from: setMeasurementConstraints-BRTryo0, reason: not valid java name */
    public final void m3610setMeasurementConstraintsBRTryo0(long j10) {
        if (Constraints.m4351equalsimpl0(this.measurementConstraints, j10)) {
            return;
        }
        this.measurementConstraints = j10;
        a();
    }
}
