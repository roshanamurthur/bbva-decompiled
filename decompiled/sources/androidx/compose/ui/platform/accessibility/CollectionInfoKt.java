package androidx.compose.ui.platform.accessibility;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.semantics.CollectionInfo;
import androidx.compose.ui.semantics.CollectionItemInfo;
import androidx.compose.ui.semantics.SemanticsConfiguration;
import androidx.compose.ui.semantics.SemanticsConfigurationKt;
import androidx.compose.ui.semantics.SemanticsNode;
import androidx.compose.ui.semantics.SemanticsProperties;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: CollectionInfo.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000\u001a\u0018\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000\u001a\f\u0010\b\u001a\u00020\u0007*\u00020\u0000H\u0000¨\u0006\t"}, d2 = {"Landroidx/compose/ui/semantics/SemanticsNode;", "node", "Landroidx/core/view/accessibility/AccessibilityNodeInfoCompat;", "info", "", "setCollectionInfo", "setCollectionItemInfo", "", "hasCollectionInfo", "ui_release"}, k = 2, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nCollectionInfo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CollectionInfo.kt\nandroidx/compose/ui/platform/accessibility/CollectionInfoKt\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 TempListUtils.kt\nandroidx/compose/ui/TempListUtilsKt\n*L\n1#1,153:1\n33#2,6:154\n33#2,6:160\n38#3,11:166\n68#3,7:177\n*S KotlinDebug\n*F\n+ 1 CollectionInfo.kt\nandroidx/compose/ui/platform/accessibility/CollectionInfoKt\n*L\n43#1:154,6\n87#1:160,6\n122#1:166,11\n130#1:177,7\n*E\n"})
public final class CollectionInfoKt {

    /* JADX INFO: compiled from: CollectionInfo.kt */
    public static final class a extends Lambda implements Function0<Boolean> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final a f17376p0 = new a(0);

        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return Boolean.FALSE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r11v1 */
    public static final boolean a(ArrayList arrayList) {
        ?? EmptyList;
        long f15533a;
        if (arrayList.size() < 2) {
            return true;
        }
        if (arrayList.size() == 0 || arrayList.size() == 1) {
            EmptyList = CollectionsKt__CollectionsKt.emptyList();
        } else {
            EmptyList = new ArrayList();
            Object obj = arrayList.get(0);
            int lastIndex = CollectionsKt__CollectionsKt.getLastIndex(arrayList);
            int i10 = 0;
            while (i10 < lastIndex) {
                i10++;
                Object obj2 = arrayList.get(i10);
                SemanticsNode semanticsNode = (SemanticsNode) obj2;
                SemanticsNode semanticsNode2 = (SemanticsNode) obj;
                EmptyList.add(Offset.m2264boximpl(OffsetKt.Offset(Math.abs(Offset.m2275getXimpl(semanticsNode2.getBoundsInRoot().m2305getCenterF1C5BW0()) - Offset.m2275getXimpl(semanticsNode.getBoundsInRoot().m2305getCenterF1C5BW0())), Math.abs(Offset.m2276getYimpl(semanticsNode2.getBoundsInRoot().m2305getCenterF1C5BW0()) - Offset.m2276getYimpl(semanticsNode.getBoundsInRoot().m2305getCenterF1C5BW0())))));
                obj = obj2;
            }
        }
        if (((Collection) EmptyList).size() == 1) {
            f15533a = ((Offset) CollectionsKt___CollectionsKt.first((List) EmptyList)).getF15533a();
        } else {
            if (EmptyList.isEmpty()) {
                throw new UnsupportedOperationException("Empty collection can't be reduced.");
            }
            Object objFirst = CollectionsKt___CollectionsKt.first((List<? extends Object>) EmptyList);
            int lastIndex2 = CollectionsKt__CollectionsKt.getLastIndex(EmptyList);
            if (1 <= lastIndex2) {
                int i11 = 1;
                while (true) {
                    objFirst = Offset.m2264boximpl(Offset.m2280plusMKHz9U(((Offset) objFirst).getF15533a(), ((Offset) EmptyList.get(i11)).getF15533a()));
                    if (i11 == lastIndex2) {
                        break;
                    }
                    i11++;
                }
            }
            f15533a = ((Offset) objFirst).getF15533a();
        }
        return Offset.m2266component2impl(f15533a) < Offset.m2265component1impl(f15533a);
    }

    public static final boolean hasCollectionInfo(@NotNull SemanticsNode semanticsNode) {
        Intrinsics.checkNotNullParameter(semanticsNode, "<this>");
        SemanticsConfiguration config = semanticsNode.getConfig();
        SemanticsProperties semanticsProperties = SemanticsProperties.INSTANCE;
        return (SemanticsConfigurationKt.getOrNull(config, semanticsProperties.getCollectionInfo()) == null && SemanticsConfigurationKt.getOrNull(semanticsNode.getConfig(), semanticsProperties.getSelectableGroup()) == null) ? false : true;
    }

    public static final void setCollectionInfo(@NotNull SemanticsNode node, @NotNull AccessibilityNodeInfoCompat info) {
        Intrinsics.checkNotNullParameter(node, "node");
        Intrinsics.checkNotNullParameter(info, "info");
        SemanticsConfiguration config = node.getConfig();
        SemanticsProperties semanticsProperties = SemanticsProperties.INSTANCE;
        CollectionInfo collectionInfo = (CollectionInfo) SemanticsConfigurationKt.getOrNull(config, semanticsProperties.getCollectionInfo());
        if (collectionInfo != null) {
            info.setCollectionInfo(AccessibilityNodeInfoCompat.CollectionInfoCompat.obtain(collectionInfo.getRowCount(), collectionInfo.getColumnCount(), false, 0));
            return;
        }
        ArrayList arrayList = new ArrayList();
        if (SemanticsConfigurationKt.getOrNull(node.getConfig(), semanticsProperties.getSelectableGroup()) != null) {
            List<SemanticsNode> replacedChildren$ui_release = node.getReplacedChildren$ui_release();
            int size = replacedChildren$ui_release.size();
            for (int i10 = 0; i10 < size; i10++) {
                SemanticsNode semanticsNode = replacedChildren$ui_release.get(i10);
                if (semanticsNode.getConfig().contains(SemanticsProperties.INSTANCE.getSelected())) {
                    arrayList.add(semanticsNode);
                }
            }
        }
        if (!arrayList.isEmpty()) {
            boolean zA = a(arrayList);
            info.setCollectionInfo(AccessibilityNodeInfoCompat.CollectionInfoCompat.obtain(zA ? 1 : arrayList.size(), zA ? arrayList.size() : 1, false, 0));
        }
    }

    public static final void setCollectionItemInfo(@NotNull SemanticsNode node, @NotNull AccessibilityNodeInfoCompat info) {
        Intrinsics.checkNotNullParameter(node, "node");
        Intrinsics.checkNotNullParameter(info, "info");
        SemanticsConfiguration config = node.getConfig();
        SemanticsProperties semanticsProperties = SemanticsProperties.INSTANCE;
        CollectionItemInfo collectionItemInfo = (CollectionItemInfo) SemanticsConfigurationKt.getOrNull(config, semanticsProperties.getCollectionItemInfo());
        if (collectionItemInfo != null) {
            info.setCollectionItemInfo(AccessibilityNodeInfoCompat.CollectionItemInfoCompat.obtain(collectionItemInfo.getRowIndex(), collectionItemInfo.getRowSpan(), collectionItemInfo.getColumnIndex(), collectionItemInfo.getColumnSpan(), false, ((Boolean) node.getConfig().getOrElse(semanticsProperties.getSelected(), j1.a.f78758p0)).booleanValue()));
        }
        SemanticsNode parent = node.getParent();
        if (parent == null || SemanticsConfigurationKt.getOrNull(parent.getConfig(), semanticsProperties.getSelectableGroup()) == null) {
            return;
        }
        CollectionInfo collectionInfo = (CollectionInfo) SemanticsConfigurationKt.getOrNull(parent.getConfig(), semanticsProperties.getCollectionInfo());
        if ((collectionInfo == null || (collectionInfo.getRowCount() >= 0 && collectionInfo.getColumnCount() >= 0)) && node.getConfig().contains(semanticsProperties.getSelected())) {
            ArrayList arrayList = new ArrayList();
            List<SemanticsNode> replacedChildren$ui_release = parent.getReplacedChildren$ui_release();
            int size = replacedChildren$ui_release.size();
            int i10 = 0;
            for (int i11 = 0; i11 < size; i11++) {
                SemanticsNode semanticsNode = replacedChildren$ui_release.get(i11);
                if (semanticsNode.getConfig().contains(SemanticsProperties.INSTANCE.getSelected())) {
                    arrayList.add(semanticsNode);
                    if (semanticsNode.getLayoutNode().getPlaceOrder$ui_release() < node.getLayoutNode().getPlaceOrder$ui_release()) {
                        i10++;
                    }
                }
            }
            if (!arrayList.isEmpty()) {
                boolean zA = a(arrayList);
                AccessibilityNodeInfoCompat.CollectionItemInfoCompat collectionItemInfoCompatObtain = AccessibilityNodeInfoCompat.CollectionItemInfoCompat.obtain(zA ? 0 : i10, 1, zA ? i10 : 0, 1, false, ((Boolean) node.getConfig().getOrElse(SemanticsProperties.INSTANCE.getSelected(), a.f17376p0)).booleanValue());
                if (collectionItemInfoCompatObtain != null) {
                    info.setCollectionItemInfo(collectionItemInfoCompatObtain);
                }
            }
        }
    }
}
