package androidx.compose.ui.platform;

import android.graphics.Region;
import android.view.View;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.LayoutInfo;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.semantics.AccessibilityAction;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.semantics.SemanticsActions;
import androidx.compose.ui.semantics.SemanticsConfiguration;
import androidx.compose.ui.semantics.SemanticsConfigurationKt;
import androidx.compose.ui.semantics.SemanticsNode;
import androidx.compose.ui.semantics.SemanticsOwner;
import androidx.compose.ui.semantics.SemanticsProperties;
import androidx.compose.ui.semantics.SemanticsPropertyKey;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.viewinterop.AndroidViewHolder;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: AndroidComposeViewAccessibilityDelegateCompat.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001b\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00000\u0002*\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0080\u0002\u001a\u0018\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005*\u00020\u0004H\u0000\u001a\u001c\u0010\f\u001a\u0004\u0018\u00010\n*\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\u0006H\u0000\u001a\u0016\u0010\u000f\u001a\u0004\u0018\u00010\u000e*\u00020\r2\u0006\u0010\u000b\u001a\u00020\u0006H\u0000¨\u0006\u0010"}, d2 = {"", "that", "Landroidx/compose/ui/platform/OpenEndRange;", "rangeUntil", "Landroidx/compose/ui/semantics/SemanticsOwner;", "", "", "Landroidx/compose/ui/platform/SemanticsNodeWithAdjustedBounds;", "getAllUncoveredSemanticsNodesToMap", "", "Landroidx/compose/ui/platform/ScrollObservationScope;", "id", "findById", "Landroidx/compose/ui/platform/AndroidViewsHandler;", "Landroid/view/View;", "semanticsIdToView", "ui_release"}, k = 2, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nAndroidComposeViewAccessibilityDelegateCompat.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidComposeViewAccessibilityDelegateCompat.android.kt\nandroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat_androidKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,3508:1\n288#2,2:3509\n1#3:3511\n*S KotlinDebug\n*F\n+ 1 AndroidComposeViewAccessibilityDelegateCompat.android.kt\nandroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat_androidKt\n*L\n3507#1:3509,2\n*E\n"})
public final class AndroidComposeViewAccessibilityDelegateCompat_androidKt {
    public static final void a(Region region, SemanticsNode semanticsNode, LinkedHashMap linkedHashMap, SemanticsNode semanticsNode2) {
        LayoutInfo layoutInfo;
        boolean z10 = (semanticsNode2.getLayoutNode().isPlaced() && semanticsNode2.getLayoutNode().isAttached()) ? false : true;
        if (!region.isEmpty() || semanticsNode2.getId() == semanticsNode.getId()) {
            if (!z10 || semanticsNode2.getIsFake()) {
                Rect touchBoundsInRoot = semanticsNode2.getTouchBoundsInRoot();
                android.graphics.Rect rect = new android.graphics.Rect(mk.c.roundToInt(touchBoundsInRoot.getLeft()), mk.c.roundToInt(touchBoundsInRoot.getTop()), mk.c.roundToInt(touchBoundsInRoot.getRight()), mk.c.roundToInt(touchBoundsInRoot.getBottom()));
                Region region2 = new Region();
                region2.set(rect);
                int id = semanticsNode2.getId() == semanticsNode.getId() ? -1 : semanticsNode2.getId();
                if (region2.op(region, region2, Region.Op.INTERSECT)) {
                    Integer numValueOf = Integer.valueOf(id);
                    android.graphics.Rect bounds = region2.getBounds();
                    Intrinsics.checkNotNullExpressionValue(bounds, "region.bounds");
                    linkedHashMap.put(numValueOf, new SemanticsNodeWithAdjustedBounds(semanticsNode2, bounds));
                    List<SemanticsNode> replacedChildren$ui_release = semanticsNode2.getReplacedChildren$ui_release();
                    for (int size = replacedChildren$ui_release.size() - 1; -1 < size; size--) {
                        a(region, semanticsNode, linkedHashMap, replacedChildren$ui_release.get(size));
                    }
                    region.op(rect, region, Region.Op.REVERSE_DIFFERENCE);
                    return;
                }
                if (semanticsNode2.getIsFake()) {
                    SemanticsNode parent = semanticsNode2.getParent();
                    Rect rect2 = (parent == null || (layoutInfo = parent.getLayoutInfo()) == null || !layoutInfo.isPlaced()) ? new Rect(0.0f, 0.0f, 10.0f, 10.0f) : parent.getBoundsInRoot();
                    linkedHashMap.put(Integer.valueOf(id), new SemanticsNodeWithAdjustedBounds(semanticsNode2, new android.graphics.Rect(mk.c.roundToInt(rect2.getLeft()), mk.c.roundToInt(rect2.getTop()), mk.c.roundToInt(rect2.getRight()), mk.c.roundToInt(rect2.getBottom()))));
                } else if (id == -1) {
                    Integer numValueOf2 = Integer.valueOf(id);
                    android.graphics.Rect bounds2 = region2.getBounds();
                    Intrinsics.checkNotNullExpressionValue(bounds2, "region.bounds");
                    linkedHashMap.put(numValueOf2, new SemanticsNodeWithAdjustedBounds(semanticsNode2, bounds2));
                }
            }
        }
    }

    public static final boolean access$accessibilityEquals(AccessibilityAction accessibilityAction, Object obj) {
        if (accessibilityAction == obj) {
            return true;
        }
        if (obj instanceof AccessibilityAction) {
            AccessibilityAction accessibilityAction2 = (AccessibilityAction) obj;
            if (Intrinsics.areEqual(accessibilityAction.getLabel(), accessibilityAction2.getLabel()) && ((accessibilityAction.getAction() != null || accessibilityAction2.getAction() == null) && (accessibilityAction.getAction() == null || accessibilityAction2.getAction() != null))) {
                return true;
            }
        }
        return false;
    }

    public static final boolean access$enabled(SemanticsNode semanticsNode) {
        return SemanticsConfigurationKt.getOrNull(semanticsNode.getConfig(), SemanticsProperties.INSTANCE.getDisabled()) == null;
    }

    public static final boolean access$excludeLineAndPageGranularities(SemanticsNode semanticsNode) {
        SemanticsConfiguration collapsedSemantics$ui_release;
        if (semanticsNode.getUnmergedConfig().contains(SemanticsActions.INSTANCE.getSetText()) && !Intrinsics.areEqual(SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig(), SemanticsProperties.INSTANCE.getFocused()), Boolean.TRUE)) {
            return true;
        }
        LayoutNode parent$ui_release = semanticsNode.getLayoutNode().getParent$ui_release();
        while (true) {
            if (parent$ui_release == null) {
                parent$ui_release = null;
                break;
            }
            if (((Boolean) v.f17453p0.invoke(parent$ui_release)).booleanValue()) {
                break;
            }
            parent$ui_release = parent$ui_release.getParent$ui_release();
        }
        return parent$ui_release != null && ((collapsedSemantics$ui_release = parent$ui_release.getCollapsedSemantics$ui_release()) == null || !Intrinsics.areEqual(SemanticsConfigurationKt.getOrNull(collapsedSemantics$ui_release, SemanticsProperties.INSTANCE.getFocused()), Boolean.TRUE));
    }

    public static final LayoutNode access$findClosestParentNode(LayoutNode layoutNode, Function1 function1) {
        for (LayoutNode parent$ui_release = layoutNode.getParent$ui_release(); parent$ui_release != null; parent$ui_release = parent$ui_release.getParent$ui_release()) {
            if (((Boolean) function1.invoke(parent$ui_release)).booleanValue()) {
                return parent$ui_release;
            }
        }
        return null;
    }

    public static final float access$getGetTraversalIndex(SemanticsNode semanticsNode) {
        SemanticsConfiguration config = semanticsNode.getConfig();
        SemanticsProperties semanticsProperties = SemanticsProperties.INSTANCE;
        if (config.contains(semanticsProperties.getTraversalIndex())) {
            return ((Number) semanticsNode.getConfig().get(semanticsProperties.getTraversalIndex())).floatValue();
        }
        return 0.0f;
    }

    public static final String access$getInfoContentDescriptionOrNull(SemanticsNode semanticsNode) {
        List list = (List) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig(), SemanticsProperties.INSTANCE.getContentDescription());
        if (list != null) {
            return (String) CollectionsKt___CollectionsKt.firstOrNull(list);
        }
        return null;
    }

    public static final boolean access$isRtl(SemanticsNode semanticsNode) {
        return semanticsNode.getLayoutInfo().getLayoutDirection() == LayoutDirection.Rtl;
    }

    public static final Boolean access$isTraversalGroup(SemanticsNode semanticsNode) {
        return (Boolean) SemanticsConfigurationKt.getOrNull(semanticsNode.getConfig(), SemanticsProperties.INSTANCE.getIsTraversalGroup());
    }

    public static final boolean access$isVisible(SemanticsNode semanticsNode) {
        return (semanticsNode.isTransparent$ui_release() || semanticsNode.getUnmergedConfig().contains(SemanticsProperties.INSTANCE.getInvisibleToUser())) ? false : true;
    }

    public static final boolean access$overlaps(OpenEndRange openEndRange, OpenEndRange openEndRange2) {
        return (openEndRange.isEmpty() || openEndRange2.isEmpty() || Math.max(((Number) openEndRange.getStart()).floatValue(), ((Number) openEndRange2.getStart()).floatValue()) >= Math.min(((Number) openEndRange.getEndExclusive()).floatValue(), ((Number) openEndRange2.getEndExclusive()).floatValue())) ? false : true;
    }

    public static final boolean access$propertiesDeleted(SemanticsNode semanticsNode, AndroidComposeViewAccessibilityDelegateCompat.SemanticsNodeCopy semanticsNodeCopy) {
        Iterator<Map.Entry<? extends SemanticsPropertyKey<?>, ? extends Object>> it = semanticsNodeCopy.getUnmergedConfig().iterator();
        while (it.hasNext()) {
            if (!semanticsNode.getConfig().contains(it.next().getKey())) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: access$toLegacyClassName-V4PA4sw, reason: not valid java name */
    public static final String m3784access$toLegacyClassNameV4PA4sw(int i10) {
        Role.Companion companion = Role.INSTANCE;
        if (Role.m3827equalsimpl0(i10, companion.m3831getButtono7Vup1c())) {
            return "android.widget.Button";
        }
        if (Role.m3827equalsimpl0(i10, companion.m3832getCheckboxo7Vup1c())) {
            return "android.widget.CheckBox";
        }
        if (Role.m3827equalsimpl0(i10, companion.m3835getRadioButtono7Vup1c())) {
            return "android.widget.RadioButton";
        }
        if (Role.m3827equalsimpl0(i10, companion.m3834getImageo7Vup1c())) {
            return "android.widget.ImageView";
        }
        if (Role.m3827equalsimpl0(i10, companion.m3833getDropdownListo7Vup1c())) {
            return "android.widget.Spinner";
        }
        return null;
    }

    @Nullable
    public static final ScrollObservationScope findById(@NotNull List<ScrollObservationScope> list, int i10) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            if (list.get(i11).getSemanticsNodeId() == i10) {
                return list.get(i11);
            }
        }
        return null;
    }

    @NotNull
    public static final Map<Integer, SemanticsNodeWithAdjustedBounds> getAllUncoveredSemanticsNodesToMap(@NotNull SemanticsOwner semanticsOwner) {
        Intrinsics.checkNotNullParameter(semanticsOwner, "<this>");
        SemanticsNode unmergedRootSemanticsNode = semanticsOwner.getUnmergedRootSemanticsNode();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (unmergedRootSemanticsNode.getLayoutNode().isPlaced() && unmergedRootSemanticsNode.getLayoutNode().isAttached()) {
            Region region = new Region();
            Rect boundsInRoot = unmergedRootSemanticsNode.getBoundsInRoot();
            region.set(new android.graphics.Rect(mk.c.roundToInt(boundsInRoot.getLeft()), mk.c.roundToInt(boundsInRoot.getTop()), mk.c.roundToInt(boundsInRoot.getRight()), mk.c.roundToInt(boundsInRoot.getBottom())));
            a(region, unmergedRootSemanticsNode, linkedHashMap, unmergedRootSemanticsNode);
        }
        return linkedHashMap;
    }

    @NotNull
    public static final OpenEndRange<Float> rangeUntil(float f6, float f10) {
        return new s0(f6, f10);
    }

    @Nullable
    public static final View semanticsIdToView(@NotNull AndroidViewsHandler androidViewsHandler, int i10) {
        Object next;
        Intrinsics.checkNotNullParameter(androidViewsHandler, "<this>");
        Set<Map.Entry<LayoutNode, AndroidViewHolder>> setEntrySet = androidViewsHandler.getLayoutNodeToHolder().entrySet();
        Intrinsics.checkNotNullExpressionValue(setEntrySet, "layoutNodeToHolder.entries");
        Iterator<T> it = setEntrySet.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((LayoutNode) ((Map.Entry) next).getKey()).getSemanticsId() != i10);
        Map.Entry entry = (Map.Entry) next;
        if (entry != null) {
            return (AndroidViewHolder) entry.getValue();
        }
        return null;
    }
}
