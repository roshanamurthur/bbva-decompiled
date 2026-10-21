package androidx.compose.ui.node;

import androidx.compose.runtime.snapshots.SnapshotStateObserver;
import androidx.exifinterface.media.ExifInterface;
import com.bbva.plugin.localstorage.command.ClearCommand;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: OwnerSnapshotObserver.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B0\u0012'\u0010(\u001a#\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\f\b%\u0012\b\b&\u0012\u0004\b\b('\u0012\u0004\u0012\u00020\u00070\u0016¢\u0006\u0004\b)\u0010*J/\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0000¢\u0006\u0004\b\t\u0010\nJ/\u0010\r\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0000¢\u0006\u0004\b\f\u0010\nJ/\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0000¢\u0006\u0004\b\u000e\u0010\nJ%\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0000¢\u0006\u0004\b\u0010\u0010\u0011JC\u0010\u001a\u001a\u00020\u0007\"\b\b\u0000\u0010\u0014*\u00020\u00132\u0006\u0010\u0015\u001a\u00028\u00002\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00070\u00162\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0000¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001d\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010 \u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010\"\u001a\u00020\u0007H\u0000¢\u0006\u0004\b!\u0010\u001cJ\u000f\u0010$\u001a\u00020\u0007H\u0000¢\u0006\u0004\b#\u0010\u001c¨\u0006+"}, d2 = {"Landroidx/compose/ui/node/OwnerSnapshotObserver;", "", "Landroidx/compose/ui/node/LayoutNode;", "node", "", "affectsLookahead", "Lkotlin/Function0;", "", "block", "observeLayoutSnapshotReads$ui_release", "(Landroidx/compose/ui/node/LayoutNode;ZLkotlin/jvm/functions/Function0;)V", "observeLayoutSnapshotReads", "observeLayoutModifierSnapshotReads$ui_release", "observeLayoutModifierSnapshotReads", "observeMeasureSnapshotReads$ui_release", "observeMeasureSnapshotReads", "observeSemanticsReads$ui_release", "(Landroidx/compose/ui/node/LayoutNode;Lkotlin/jvm/functions/Function0;)V", "observeSemanticsReads", "Landroidx/compose/ui/node/OwnerScope;", ExifInterface.GPS_DIRECTION_TRUE, "target", "Lkotlin/Function1;", "onChanged", "observeReads$ui_release", "(Landroidx/compose/ui/node/OwnerScope;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)V", "observeReads", "clearInvalidObservations$ui_release", "()V", "clearInvalidObservations", "clear$ui_release", "(Ljava/lang/Object;)V", ClearCommand.ID, "startObserving$ui_release", "startObserving", "stopObserving$ui_release", "stopObserving", "Lkotlin/ParameterName;", "name", "callback", "onChangedExecutor", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "ui_release"}, k = 1, mv = {1, 8, 0})
public final class OwnerSnapshotObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final SnapshotStateObserver f16922a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final f f16923b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final g f16924c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final h f16925d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final b f16926e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final c f16927f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final d f16928g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public final e f16929h;

    /* JADX INFO: compiled from: OwnerSnapshotObserver.kt */
    public static final class a extends Lambda implements Function1<Object, Boolean> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final a f16930p0 = new a(1);

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(Object it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.valueOf(!((OwnerScope) it).isValidOwnerScope());
        }
    }

    /* JADX INFO: compiled from: OwnerSnapshotObserver.kt */
    public static final class b extends Lambda implements Function1<LayoutNode, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final b f16931p0 = new b(1);

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(LayoutNode layoutNode) {
            LayoutNode layoutNode2 = layoutNode;
            Intrinsics.checkNotNullParameter(layoutNode2, "layoutNode");
            if (layoutNode2.isValidOwnerScope()) {
                LayoutNode.requestRelayout$ui_release$default(layoutNode2, false, 1, null);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: OwnerSnapshotObserver.kt */
    public static final class c extends Lambda implements Function1<LayoutNode, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final c f16932p0 = new c(1);

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(LayoutNode layoutNode) {
            LayoutNode layoutNode2 = layoutNode;
            Intrinsics.checkNotNullParameter(layoutNode2, "layoutNode");
            if (layoutNode2.isValidOwnerScope()) {
                LayoutNode.requestRelayout$ui_release$default(layoutNode2, false, 1, null);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: OwnerSnapshotObserver.kt */
    public static final class d extends Lambda implements Function1<LayoutNode, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final d f16933p0 = new d(1);

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(LayoutNode layoutNode) {
            LayoutNode layoutNode2 = layoutNode;
            Intrinsics.checkNotNullParameter(layoutNode2, "layoutNode");
            if (layoutNode2.isValidOwnerScope()) {
                LayoutNode.requestLookaheadRelayout$ui_release$default(layoutNode2, false, 1, null);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: OwnerSnapshotObserver.kt */
    public static final class e extends Lambda implements Function1<LayoutNode, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final e f16934p0 = new e(1);

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(LayoutNode layoutNode) {
            LayoutNode layoutNode2 = layoutNode;
            Intrinsics.checkNotNullParameter(layoutNode2, "layoutNode");
            if (layoutNode2.isValidOwnerScope()) {
                LayoutNode.requestLookaheadRelayout$ui_release$default(layoutNode2, false, 1, null);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: OwnerSnapshotObserver.kt */
    public static final class f extends Lambda implements Function1<LayoutNode, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final f f16935p0 = new f(1);

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(LayoutNode layoutNode) {
            LayoutNode layoutNode2 = layoutNode;
            Intrinsics.checkNotNullParameter(layoutNode2, "layoutNode");
            if (layoutNode2.isValidOwnerScope()) {
                LayoutNode.requestLookaheadRemeasure$ui_release$default(layoutNode2, false, false, 3, null);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: OwnerSnapshotObserver.kt */
    public static final class g extends Lambda implements Function1<LayoutNode, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final g f16936p0 = new g(1);

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(LayoutNode layoutNode) {
            LayoutNode layoutNode2 = layoutNode;
            Intrinsics.checkNotNullParameter(layoutNode2, "layoutNode");
            if (layoutNode2.isValidOwnerScope()) {
                LayoutNode.requestRemeasure$ui_release$default(layoutNode2, false, false, 3, null);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: OwnerSnapshotObserver.kt */
    public static final class h extends Lambda implements Function1<LayoutNode, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final h f16937p0 = new h(1);

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(LayoutNode layoutNode) {
            LayoutNode layoutNode2 = layoutNode;
            Intrinsics.checkNotNullParameter(layoutNode2, "layoutNode");
            if (layoutNode2.isValidOwnerScope()) {
                layoutNode2.invalidateSemantics$ui_release();
            }
            return Unit.INSTANCE;
        }
    }

    public OwnerSnapshotObserver(@NotNull Function1<? super Function0<Unit>, Unit> onChangedExecutor) {
        Intrinsics.checkNotNullParameter(onChangedExecutor, "onChangedExecutor");
        this.f16922a = new SnapshotStateObserver(onChangedExecutor);
        this.f16923b = f.f16935p0;
        this.f16924c = g.f16936p0;
        this.f16925d = h.f16937p0;
        this.f16926e = b.f16931p0;
        this.f16927f = c.f16932p0;
        this.f16928g = d.f16933p0;
        this.f16929h = e.f16934p0;
    }

    public static /* synthetic */ void observeLayoutModifierSnapshotReads$ui_release$default(OwnerSnapshotObserver ownerSnapshotObserver, LayoutNode layoutNode, boolean z10, Function0 function0, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = true;
        }
        ownerSnapshotObserver.observeLayoutModifierSnapshotReads$ui_release(layoutNode, z10, function0);
    }

    public static /* synthetic */ void observeLayoutSnapshotReads$ui_release$default(OwnerSnapshotObserver ownerSnapshotObserver, LayoutNode layoutNode, boolean z10, Function0 function0, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = true;
        }
        ownerSnapshotObserver.observeLayoutSnapshotReads$ui_release(layoutNode, z10, function0);
    }

    public static /* synthetic */ void observeMeasureSnapshotReads$ui_release$default(OwnerSnapshotObserver ownerSnapshotObserver, LayoutNode layoutNode, boolean z10, Function0 function0, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = true;
        }
        ownerSnapshotObserver.observeMeasureSnapshotReads$ui_release(layoutNode, z10, function0);
    }

    public final void clear$ui_release(@NotNull Object target) {
        Intrinsics.checkNotNullParameter(target, "target");
        this.f16922a.clear(target);
    }

    public final void clearInvalidObservations$ui_release() {
        this.f16922a.clearIf(a.f16930p0);
    }

    public final void observeLayoutModifierSnapshotReads$ui_release(@NotNull LayoutNode node, boolean affectsLookahead, @NotNull Function0<Unit> block) {
        Intrinsics.checkNotNullParameter(node, "node");
        Intrinsics.checkNotNullParameter(block, "block");
        if (!affectsLookahead || node.getLookaheadRoot() == null) {
            observeReads$ui_release(node, this.f16927f, block);
        } else {
            observeReads$ui_release(node, this.f16928g, block);
        }
    }

    public final void observeLayoutSnapshotReads$ui_release(@NotNull LayoutNode node, boolean affectsLookahead, @NotNull Function0<Unit> block) {
        Intrinsics.checkNotNullParameter(node, "node");
        Intrinsics.checkNotNullParameter(block, "block");
        if (!affectsLookahead || node.getLookaheadRoot() == null) {
            observeReads$ui_release(node, this.f16926e, block);
        } else {
            observeReads$ui_release(node, this.f16929h, block);
        }
    }

    public final void observeMeasureSnapshotReads$ui_release(@NotNull LayoutNode node, boolean affectsLookahead, @NotNull Function0<Unit> block) {
        Intrinsics.checkNotNullParameter(node, "node");
        Intrinsics.checkNotNullParameter(block, "block");
        if (!affectsLookahead || node.getLookaheadRoot() == null) {
            observeReads$ui_release(node, this.f16924c, block);
        } else {
            observeReads$ui_release(node, this.f16923b, block);
        }
    }

    public final <T extends OwnerScope> void observeReads$ui_release(@NotNull T target, @NotNull Function1<? super T, Unit> onChanged, @NotNull Function0<Unit> block) {
        Intrinsics.checkNotNullParameter(target, "target");
        Intrinsics.checkNotNullParameter(onChanged, "onChanged");
        Intrinsics.checkNotNullParameter(block, "block");
        this.f16922a.observeReads(target, onChanged, block);
    }

    public final void observeSemanticsReads$ui_release(@NotNull LayoutNode node, @NotNull Function0<Unit> block) {
        Intrinsics.checkNotNullParameter(node, "node");
        Intrinsics.checkNotNullParameter(block, "block");
        observeReads$ui_release(node, this.f16925d, block);
    }

    public final void startObserving$ui_release() {
        this.f16922a.start();
    }

    public final void stopObserving$ui_release() {
        SnapshotStateObserver snapshotStateObserver = this.f16922a;
        snapshotStateObserver.stop();
        snapshotStateObserver.clear();
    }
}
