package androidx.compose.ui.node;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.modifier.ModifierLocal;
import androidx.compose.ui.modifier.ModifierLocalReadScope;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: BackwardsCompatNode.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui_release"}, k = 2, mv = {1, 8, 0})
public final class BackwardsCompatNodeKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final BackwardsCompatNodeKt$DetachedModifierLocalReadScope$1 f16742a = new ModifierLocalReadScope() { // from class: androidx.compose.ui.node.BackwardsCompatNodeKt$DetachedModifierLocalReadScope$1
        @Override // androidx.compose.ui.modifier.ModifierLocalReadScope
        public <T> T getCurrent(@NotNull ModifierLocal<T> modifierLocal) {
            Intrinsics.checkNotNullParameter(modifierLocal, "<this>");
            return modifierLocal.getDefaultFactory$ui_release().invoke();
        }
    };

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f16743b = a.f16745p0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final b f16744c = b.f16746p0;

    /* JADX INFO: compiled from: BackwardsCompatNode.kt */
    public static final class a extends Lambda implements Function1<BackwardsCompatNode, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final a f16745p0 = new a(1);

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(BackwardsCompatNode backwardsCompatNode) {
            BackwardsCompatNode it = backwardsCompatNode;
            Intrinsics.checkNotNullParameter(it, "it");
            it.onDrawCacheReadsChanged$ui_release();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: BackwardsCompatNode.kt */
    public static final class b extends Lambda implements Function1<BackwardsCompatNode, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final b f16746p0 = new b(1);

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(BackwardsCompatNode backwardsCompatNode) {
            BackwardsCompatNode it = backwardsCompatNode;
            Intrinsics.checkNotNullParameter(it, "it");
            it.updateModifierLocalConsumer();
            return Unit.INSTANCE;
        }
    }

    public static final boolean access$isChainUpdate(BackwardsCompatNode backwardsCompatNode) {
        Modifier.Node tail$ui_release = DelegatableNodeKt.requireLayoutNode(backwardsCompatNode).getNodes().getTail$ui_release();
        Intrinsics.checkNotNull(tail$ui_release, "null cannot be cast to non-null type androidx.compose.ui.node.TailModifierNode");
        return ((TailModifierNode) tail$ui_release).getAttachHasBeenRun();
    }
}
