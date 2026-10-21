package androidx.compose.ui.node;

import com.bbva.cellscore.web.constant.NavigationOperations;
import com.bbva.plugin.localstorage.command.RemoveCommand;
import com.bbva.securesharing.plugin.SecureSharingCommandFactory;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: DepthSortedSet.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0004¢\u0006\u0004\b\u0013\u0010\u0014J\u0016\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u000e\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0016\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u0016\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u000e\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\n\u001a\u00020\u0002JF\u0010\u000f\u001a\u00020\u000728\b\u0004\u0010\u000e\u001a2\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u0003\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u0005\u0012\u0004\u0012\u00020\u00070\u000bH\u0086\bø\u0001\u0000J\u0006\u0010\u0010\u001a\u00020\u0004J\u0006\u0010\u0011\u001a\u00020\u0004\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0015"}, d2 = {"Landroidx/compose/ui/node/DepthSortedSetsForDifferentPasses;", "", "Landroidx/compose/ui/node/LayoutNode;", "node", "", "affectsLookahead", SecureSharingCommandFactory.ACTION_CONTAINS_VALUE, "", "add", RemoveCommand.ID, NavigationOperations.POP, "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "block", "popEach", "isEmpty", "isNotEmpty", "extraAssertions", "<init>", "(Z)V", "ui_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nDepthSortedSet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DepthSortedSet.kt\nandroidx/compose/ui/node/DepthSortedSetsForDifferentPasses\n+ 2 DepthSortedSet.kt\nandroidx/compose/ui/node/DepthSortedSet\n*L\n1#1,186:1\n100#2:187\n100#2:188\n*S KotlinDebug\n*F\n+ 1 DepthSortedSet.kt\nandroidx/compose/ui/node/DepthSortedSetsForDifferentPasses\n*L\n164#1:187\n176#1:188\n*E\n"})
public final class DepthSortedSetsForDifferentPasses {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final DepthSortedSet f16769a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final DepthSortedSet f16770b;

    public DepthSortedSetsForDifferentPasses(boolean z10) {
        this.f16769a = new DepthSortedSet(z10);
        this.f16770b = new DepthSortedSet(z10);
    }

    public final void add(@NotNull LayoutNode node, boolean affectsLookahead) {
        Intrinsics.checkNotNullParameter(node, "node");
        DepthSortedSet depthSortedSet = this.f16769a;
        if (affectsLookahead) {
            depthSortedSet.add(node);
        } else {
            if (depthSortedSet.contains(node)) {
                return;
            }
            this.f16770b.add(node);
        }
    }

    public final boolean contains(@NotNull LayoutNode node, boolean affectsLookahead) {
        Intrinsics.checkNotNullParameter(node, "node");
        boolean zContains = this.f16769a.contains(node);
        if (affectsLookahead) {
            return zContains;
        }
        return zContains || this.f16770b.contains(node);
    }

    public final boolean isEmpty() {
        return this.f16770b.isEmpty() && this.f16769a.isEmpty();
    }

    public final boolean isNotEmpty() {
        return !isEmpty();
    }

    @NotNull
    public final LayoutNode pop() {
        DepthSortedSet depthSortedSet = this.f16769a;
        return depthSortedSet.isEmpty() ^ true ? depthSortedSet.pop() : this.f16770b.pop();
    }

    public final void popEach(@NotNull Function2<? super LayoutNode, ? super Boolean, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        while (isNotEmpty()) {
            boolean z10 = !this.f16769a.isEmpty();
            block.invoke((z10 ? this.f16769a : this.f16770b).pop(), Boolean.valueOf(z10));
        }
    }

    public final boolean remove(@NotNull LayoutNode node, boolean affectsLookahead) {
        Intrinsics.checkNotNullParameter(node, "node");
        return affectsLookahead ? this.f16769a.remove(node) : this.f16770b.remove(node);
    }

    public final boolean contains(@NotNull LayoutNode node) {
        Intrinsics.checkNotNullParameter(node, "node");
        return this.f16769a.contains(node) || this.f16770b.contains(node);
    }

    public final boolean remove(@NotNull LayoutNode node) {
        Intrinsics.checkNotNullParameter(node, "node");
        return this.f16770b.remove(node) || this.f16769a.remove(node);
    }
}
