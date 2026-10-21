package androidx.compose.ui.node;

import com.bbva.cellscore.web.constant.NavigationOperations;
import com.bbva.plugin.localstorage.command.RemoveCommand;
import com.bbva.securesharing.plugin.SecureSharingCommandFactory;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: DepthSortedSet.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u0004¢\u0006\u0004\b\u0012\u0010\u0013J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\t\u001a\u00020\u0002J\"\u0010\f\u001a\u00020\u00062\u0014\b\u0004\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\nH\u0086\bø\u0001\u0000J\u0006\u0010\r\u001a\u00020\u0004J\t\u0010\u000e\u001a\u00020\u0004H\u0086\bJ\b\u0010\u0010\u001a\u00020\u000fH\u0016\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Landroidx/compose/ui/node/DepthSortedSet;", "", "Landroidx/compose/ui/node/LayoutNode;", "node", "", SecureSharingCommandFactory.ACTION_CONTAINS_VALUE, "", "add", RemoveCommand.ID, NavigationOperations.POP, "Lkotlin/Function1;", "block", "popEach", "isEmpty", "isNotEmpty", "", "toString", "extraAssertions", "<init>", "(Z)V", "ui_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nDepthSortedSet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DepthSortedSet.kt\nandroidx/compose/ui/node/DepthSortedSet\n*L\n1#1,186:1\n100#1:187\n*S KotlinDebug\n*F\n+ 1 DepthSortedSet.kt\nandroidx/compose/ui/node/DepthSortedSet\n*L\n91#1:187\n*E\n"})
public final class DepthSortedSet {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f16765a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Lazy f16766b = LazyKt__LazyJVMKt.lazy(LazyThreadSafetyMode.NONE, (Function0) a.f16768p0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final TreeSet<LayoutNode> f16767c = new TreeSet<>(new Comparator<LayoutNode>() { // from class: androidx.compose.ui.node.DepthSortedSet$DepthComparator$1
        @Override // java.util.Comparator
        public int compare(@NotNull LayoutNode l6, @NotNull LayoutNode l7) {
            Intrinsics.checkNotNullParameter(l6, "l1");
            Intrinsics.checkNotNullParameter(l7, "l2");
            int iCompare = Intrinsics.compare(l6.getDepth(), l7.getDepth());
            return iCompare != 0 ? iCompare : Intrinsics.compare(l6.hashCode(), l7.hashCode());
        }
    });

    /* JADX INFO: compiled from: DepthSortedSet.kt */
    public static final class a extends Lambda implements Function0<Map<LayoutNode, Integer>> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final a f16768p0 = new a(0);

        @Override // kotlin.jvm.functions.Function0
        public final Map<LayoutNode, Integer> invoke() {
            return new LinkedHashMap();
        }
    }

    public DepthSortedSet(boolean z10) {
        this.f16765a = z10;
    }

    public final void add(@NotNull LayoutNode node) {
        Intrinsics.checkNotNullParameter(node, "node");
        if (!node.isAttached()) {
            throw new IllegalStateException("Check failed.".toString());
        }
        if (this.f16765a) {
            Lazy lazy = this.f16766b;
            Integer num = (Integer) ((Map) lazy.getValue()).get(node);
            if (num == null) {
                ((Map) lazy.getValue()).put(node, Integer.valueOf(node.getDepth()));
            } else {
                if (num.intValue() != node.getDepth()) {
                    throw new IllegalStateException("Check failed.".toString());
                }
            }
        }
        this.f16767c.add(node);
    }

    public final boolean contains(@NotNull LayoutNode node) {
        Intrinsics.checkNotNullParameter(node, "node");
        boolean zContains = this.f16767c.contains(node);
        if (!this.f16765a || zContains == ((Map) this.f16766b.getValue()).containsKey(node)) {
            return zContains;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    public final boolean isEmpty() {
        return this.f16767c.isEmpty();
    }

    public final boolean isNotEmpty() {
        return !isEmpty();
    }

    @NotNull
    public final LayoutNode pop() {
        LayoutNode node = this.f16767c.first();
        Intrinsics.checkNotNullExpressionValue(node, "node");
        remove(node);
        return node;
    }

    public final void popEach(@NotNull Function1<? super LayoutNode, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        while (!isEmpty()) {
            block.invoke(pop());
        }
    }

    public final boolean remove(@NotNull LayoutNode node) {
        Intrinsics.checkNotNullParameter(node, "node");
        if (!node.isAttached()) {
            throw new IllegalStateException("Check failed.".toString());
        }
        boolean zRemove = this.f16767c.remove(node);
        if (this.f16765a) {
            Integer num = (Integer) ((Map) this.f16766b.getValue()).remove(node);
            if (zRemove) {
                int depth = node.getDepth();
                if (num == null || num.intValue() != depth) {
                    throw new IllegalStateException("Check failed.".toString());
                }
            } else if (num != null) {
                throw new IllegalStateException("Check failed.".toString());
            }
        }
        return zRemove;
    }

    @NotNull
    public String toString() {
        String string = this.f16767c.toString();
        Intrinsics.checkNotNullExpressionValue(string, "set.toString()");
        return string;
    }
}
