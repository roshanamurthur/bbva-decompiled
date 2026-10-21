package androidx.compose.ui.semantics;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: SemanticsOwner.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\b\u0002\u001a\u0018\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005\u001a\"\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00020\u0007*\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u0005H\u0000¨\u0006\n"}, d2 = {"getAllSemanticsNodes", "", "Landroidx/compose/ui/semantics/SemanticsNode;", "Landroidx/compose/ui/semantics/SemanticsOwner;", "mergingEnabled", "", "getAllSemanticsNodesToMap", "", "", "useUnmergedTree", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSemanticsOwner.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SemanticsOwner.kt\nandroidx/compose/ui/semantics/SemanticsOwnerKt\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,82:1\n33#2,6:83\n*S KotlinDebug\n*F\n+ 1 SemanticsOwner.kt\nandroidx/compose/ui/semantics/SemanticsOwnerKt\n*L\n73#1:83,6\n*E\n"})
public final class SemanticsOwnerKt {
    public static final void a(SemanticsNode semanticsNode, LinkedHashMap linkedHashMap) {
        linkedHashMap.put(Integer.valueOf(semanticsNode.getId()), semanticsNode);
        List<SemanticsNode> children = semanticsNode.getChildren();
        int size = children.size();
        for (int i10 = 0; i10 < size; i10++) {
            a(children.get(i10), linkedHashMap);
        }
    }

    @NotNull
    public static final List<SemanticsNode> getAllSemanticsNodes(@NotNull SemanticsOwner semanticsOwner, boolean z10) {
        Intrinsics.checkNotNullParameter(semanticsOwner, "<this>");
        return CollectionsKt___CollectionsKt.toList(getAllSemanticsNodesToMap(semanticsOwner, !z10).values());
    }

    @NotNull
    public static final Map<Integer, SemanticsNode> getAllSemanticsNodesToMap(@NotNull SemanticsOwner semanticsOwner, boolean z10) {
        Intrinsics.checkNotNullParameter(semanticsOwner, "<this>");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        a(z10 ? semanticsOwner.getUnmergedRootSemanticsNode() : semanticsOwner.getRootSemanticsNode(), linkedHashMap);
        return linkedHashMap;
    }

    public static /* synthetic */ Map getAllSemanticsNodesToMap$default(SemanticsOwner semanticsOwner, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        return getAllSemanticsNodesToMap(semanticsOwner, z10);
    }
}
