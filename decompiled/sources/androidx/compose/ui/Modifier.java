package androidx.compose.ui;

import androidx.compose.runtime.Stable;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.node.DelegatableNode;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.NodeCoordinator;
import androidx.compose.ui.node.ObserverNodeOwnerScope;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import com.mastercard.sonic.androidsvg.SVGParser;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import u0.e;
import u0.f;
import u0.g;

/* JADX INFO: compiled from: Modifier.kt */
/* JADX INFO: loaded from: classes.dex */
@Stable
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\bg\u0018\u0000 \u00112\u00020\u0001:\u0003\u0011\u0012\u0013J\u001c\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030\u0005H&J\u001c\u0010\u0007\u001a\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030\u0005H&J5\u0010\b\u001a\u0002H\t\"\u0004\b\u0000\u0010\t2\u0006\u0010\n\u001a\u0002H\t2\u0018\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u0002H\t\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u0002H\t0\fH&¢\u0006\u0002\u0010\rJ5\u0010\u000e\u001a\u0002H\t\"\u0004\b\u0000\u0010\t2\u0006\u0010\n\u001a\u0002H\t2\u0018\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u0002H\t\u0012\u0004\u0012\u0002H\t0\fH&¢\u0006\u0002\u0010\rJ\u0011\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u0000H\u0096\u0004ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0014À\u0006\u0003"}, d2 = {"Landroidx/compose/ui/Modifier;", "", SVGParser.XML_STYLESHEET_ATTR_MEDIA_ALL, "", "predicate", "Lkotlin/Function1;", "Landroidx/compose/ui/Modifier$Element;", "any", "foldIn", "R", "initial", "operation", "Lkotlin/Function2;", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "foldOut", "then", "other", "Companion", "Element", "Node", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface Modifier {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.f15408a;

    /* JADX INFO: compiled from: Modifier.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001c\u0010\u0003\u001a\u00020\u00042\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00040\u0006H\u0016J\u001c\u0010\b\u001a\u00020\u00042\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00040\u0006H\u0016J5\u0010\t\u001a\u0002H\n\"\u0004\b\u0000\u0010\n2\u0006\u0010\u000b\u001a\u0002H\n2\u0018\u0010\f\u001a\u0014\u0012\u0004\u0012\u0002H\n\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u0002H\n0\rH\u0016¢\u0006\u0002\u0010\u000eJ5\u0010\u000f\u001a\u0002H\n\"\u0004\b\u0000\u0010\n2\u0006\u0010\u000b\u001a\u0002H\n2\u0018\u0010\f\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u0002H\n\u0012\u0004\u0012\u0002H\n0\rH\u0016¢\u0006\u0002\u0010\u000eJ\u0011\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u0001H\u0096\u0004J\b\u0010\u0012\u001a\u00020\u0013H\u0016¨\u0006\u0014"}, d2 = {"Landroidx/compose/ui/Modifier$Companion;", "Landroidx/compose/ui/Modifier;", "()V", SVGParser.XML_STYLESHEET_ATTR_MEDIA_ALL, "", "predicate", "Lkotlin/Function1;", "Landroidx/compose/ui/Modifier$Element;", "any", "foldIn", "R", "initial", "operation", "Lkotlin/Function2;", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "foldOut", "then", "other", "toString", "", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion implements Modifier {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ Companion f15408a = new Companion();

        @Override // androidx.compose.ui.Modifier
        public boolean all(@NotNull Function1<? super Element, Boolean> predicate) {
            Intrinsics.checkNotNullParameter(predicate, "predicate");
            return true;
        }

        @Override // androidx.compose.ui.Modifier
        public boolean any(@NotNull Function1<? super Element, Boolean> predicate) {
            Intrinsics.checkNotNullParameter(predicate, "predicate");
            return false;
        }

        @Override // androidx.compose.ui.Modifier
        public <R> R foldIn(R initial, @NotNull Function2<? super R, ? super Element, ? extends R> operation) {
            Intrinsics.checkNotNullParameter(operation, "operation");
            return initial;
        }

        @Override // androidx.compose.ui.Modifier
        public <R> R foldOut(R initial, @NotNull Function2<? super Element, ? super R, ? extends R> operation) {
            Intrinsics.checkNotNullParameter(operation, "operation");
            return initial;
        }

        @Override // androidx.compose.ui.Modifier
        @NotNull
        public Modifier then(@NotNull Modifier other) {
            Intrinsics.checkNotNullParameter(other, "other");
            return other;
        }

        @NotNull
        public String toString() {
            return "Modifier";
        }
    }

    /* JADX INFO: compiled from: Modifier.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class DefaultImpls {
        @Deprecated
        @NotNull
        public static Modifier then(@NotNull Modifier modifier, @NotNull Modifier other) {
            Intrinsics.checkNotNullParameter(other, "other");
            return e.a(modifier, other);
        }
    }

    /* JADX INFO: compiled from: Modifier.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00030\u0005H\u0016J\u001c\u0010\u0006\u001a\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00030\u0005H\u0016J5\u0010\u0007\u001a\u0002H\b\"\u0004\b\u0000\u0010\b2\u0006\u0010\t\u001a\u0002H\b2\u0018\u0010\n\u001a\u0014\u0012\u0004\u0012\u0002H\b\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u0002H\b0\u000bH\u0016¢\u0006\u0002\u0010\fJ5\u0010\r\u001a\u0002H\b\"\u0004\b\u0000\u0010\b2\u0006\u0010\t\u001a\u0002H\b2\u0018\u0010\n\u001a\u0014\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u0002H\b\u0012\u0004\u0012\u0002H\b0\u000bH\u0016¢\u0006\u0002\u0010\fø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000eÀ\u0006\u0003"}, d2 = {"Landroidx/compose/ui/Modifier$Element;", "Landroidx/compose/ui/Modifier;", SVGParser.XML_STYLESHEET_ATTR_MEDIA_ALL, "", "predicate", "Lkotlin/Function1;", "any", "foldIn", "R", "initial", "operation", "Lkotlin/Function2;", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "foldOut", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public interface Element extends Modifier {

        /* JADX INFO: compiled from: Modifier.kt */
        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        public static final class DefaultImpls {
            @Deprecated
            public static boolean all(@NotNull Element element, @NotNull Function1<? super Element, Boolean> predicate) {
                Intrinsics.checkNotNullParameter(predicate, "predicate");
                return f.a(element, predicate);
            }

            @Deprecated
            public static boolean any(@NotNull Element element, @NotNull Function1<? super Element, Boolean> predicate) {
                Intrinsics.checkNotNullParameter(predicate, "predicate");
                return f.b(element, predicate);
            }

            @Deprecated
            public static <R> R foldIn(@NotNull Element element, R r3, @NotNull Function2<? super R, ? super Element, ? extends R> operation) {
                Intrinsics.checkNotNullParameter(operation, "operation");
                return (R) f.c(element, r3, operation);
            }

            @Deprecated
            public static <R> R foldOut(@NotNull Element element, R r3, @NotNull Function2<? super Element, ? super R, ? extends R> operation) {
                Intrinsics.checkNotNullParameter(operation, "operation");
                return (R) f.d(element, r3, operation);
            }

            @Deprecated
            @NotNull
            public static Modifier then(@NotNull Element element, @NotNull Modifier other) {
                Intrinsics.checkNotNullParameter(other, "other");
                return e.a(element, other);
            }
        }

        @Override // androidx.compose.ui.Modifier
        boolean all(@NotNull Function1<? super Element, Boolean> predicate);

        @Override // androidx.compose.ui.Modifier
        boolean any(@NotNull Function1<? super Element, Boolean> predicate);

        @Override // androidx.compose.ui.Modifier
        <R> R foldIn(R initial, @NotNull Function2<? super R, ? super Element, ? extends R> operation);

        @Override // androidx.compose.ui.Modifier
        <R> R foldOut(R initial, @NotNull Function2<? super Element, ? super R, ? extends R> operation);
    }

    boolean all(@NotNull Function1<? super Element, Boolean> predicate);

    boolean any(@NotNull Function1<? super Element, Boolean> predicate);

    <R> R foldIn(R initial, @NotNull Function2<? super R, ? super Element, ? extends R> operation);

    <R> R foldOut(R initial, @NotNull Function2<? super Element, ? super R, ? extends R> operation);

    @NotNull
    Modifier then(@NotNull Modifier other);

    /* JADX INFO: compiled from: Modifier.kt */
    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\b\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b^\u0010\u000fJ\u0019\u0010\u0007\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0010¢\u0006\u0004\b\u0005\u0010\u0006J\"\u0010\r\u001a\u00020\n2\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\bH\u0080\bø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u0010\u001a\u00020\u0004H\u0010¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0012\u001a\u00020\u0004H\u0010¢\u0006\u0004\b\u0011\u0010\u000fJ\u000f\u0010\u0014\u001a\u00020\u0004H\u0010¢\u0006\u0004\b\u0013\u0010\u000fJ\u000f\u0010\u0016\u001a\u00020\u0004H\u0010¢\u0006\u0004\b\u0015\u0010\u000fJ\u000f\u0010\u0018\u001a\u00020\u0004H\u0010¢\u0006\u0004\b\u0017\u0010\u000fJ\b\u0010\u0019\u001a\u00020\u0004H\u0016J\b\u0010\u001a\u001a\u00020\u0004H\u0016J\b\u0010\u001b\u001a\u00020\u0004H\u0016J\u0016\u0010\u001e\u001a\u00020\u00042\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00040\u001cH\u0007J\u0017\u0010\"\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\u0000H\u0000¢\u0006\u0004\b \u0010!R*\u0010)\u001a\u00020\u00002\u0006\u0010#\u001a\u00020\u00008\u0006@BX\u0086\u000e¢\u0006\u0012\n\u0004\b$\u0010%\u0012\u0004\b(\u0010\u000f\u001a\u0004\b&\u0010'R\"\u00101\u001a\u00020*8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\"\u00105\u001a\u00020*8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b2\u0010,\u001a\u0004\b3\u0010.\"\u0004\b4\u00100R$\u00109\u001a\u0004\u0018\u00010\u00008\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b6\u0010%\u001a\u0004\b7\u0010'\"\u0004\b8\u0010!R$\u0010=\u001a\u0004\u0018\u00010\u00008\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b:\u0010%\u001a\u0004\b;\u0010'\"\u0004\b<\u0010!R$\u0010E\u001a\u0004\u0018\u00010>8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b?\u0010@\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DR(\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010#\u001a\u0004\u0018\u00010\u00028\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\bF\u0010G\u001a\u0004\bH\u0010IR\"\u0010P\u001a\u00020\n8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bJ\u0010K\u001a\u0004\bL\u0010M\"\u0004\bN\u0010OR\"\u0010T\u001a\u00020\n8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bQ\u0010K\u001a\u0004\bR\u0010M\"\u0004\bS\u0010OR$\u0010V\u001a\u00020\n2\u0006\u0010#\u001a\u00020\n8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bU\u0010K\u001a\u0004\bV\u0010MR\u0011\u0010Z\u001a\u00020W8F¢\u0006\u0006\u001a\u0004\bX\u0010YR\u001a\u0010]\u001a\u00020\n8VX\u0096\u0004¢\u0006\f\u0012\u0004\b\\\u0010\u000f\u001a\u0004\b[\u0010M\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006_"}, d2 = {"Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/ui/node/DelegatableNode;", "Landroidx/compose/ui/node/NodeCoordinator;", "coordinator", "", "updateCoordinator$ui_release", "(Landroidx/compose/ui/node/NodeCoordinator;)V", "updateCoordinator", "Landroidx/compose/ui/node/NodeKind;", "kind", "", "isKind-H91voCI$ui_release", "(I)Z", "isKind", "markAsAttached$ui_release", "()V", "markAsAttached", "runAttachLifecycle$ui_release", "runAttachLifecycle", "runDetachLifecycle$ui_release", "runDetachLifecycle", "markAsDetached$ui_release", "markAsDetached", "reset$ui_release", "reset", "onAttach", "onDetach", "onReset", "Lkotlin/Function0;", "effect", "sideEffect", "owner", "setAsDelegateTo$ui_release", "(Landroidx/compose/ui/Modifier$Node;)V", "setAsDelegateTo", "<set-?>", "p0", "Landroidx/compose/ui/Modifier$Node;", "getNode", "()Landroidx/compose/ui/Modifier$Node;", "getNode$annotations", "node", "", "r0", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getKindSet$ui_release", "()I", "setKindSet$ui_release", "(I)V", "kindSet", "s0", "getAggregateChildKindSet$ui_release", "setAggregateChildKindSet$ui_release", "aggregateChildKindSet", "t0", "getParent$ui_release", "setParent$ui_release", "parent", "u0", "getChild$ui_release", "setChild$ui_release", "child", "Landroidx/compose/ui/node/ObserverNodeOwnerScope;", "v0", "Landroidx/compose/ui/node/ObserverNodeOwnerScope;", "getOwnerScope$ui_release", "()Landroidx/compose/ui/node/ObserverNodeOwnerScope;", "setOwnerScope$ui_release", "(Landroidx/compose/ui/node/ObserverNodeOwnerScope;)V", "ownerScope", "w0", "Landroidx/compose/ui/node/NodeCoordinator;", "getCoordinator$ui_release", "()Landroidx/compose/ui/node/NodeCoordinator;", "x0", "Z", "getInsertedNodeAwaitingAttachForInvalidation$ui_release", "()Z", "setInsertedNodeAwaitingAttachForInvalidation$ui_release", "(Z)V", "insertedNodeAwaitingAttachForInvalidation", "y0", "getUpdatedNodeAwaitingAttachForInvalidation$ui_release", "setUpdatedNodeAwaitingAttachForInvalidation$ui_release", "updatedNodeAwaitingAttachForInvalidation", "G0", "isAttached", "Lkotlinx/coroutines/CoroutineScope;", "getCoroutineScope", "()Lkotlinx/coroutines/CoroutineScope;", "coroutineScope", "getShouldAutoInvalidate", "getShouldAutoInvalidate$annotations", "shouldAutoInvalidate", "<init>", "ui_release"}, k = 1, mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nModifier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Modifier.kt\nandroidx/compose/ui/Modifier$Node\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,416:1\n1#2:417\n*E\n"})
    public static abstract class Node implements DelegatableNode {
        public static final int $stable = 8;
        public boolean E0;
        public boolean F0;

        /* JADX INFO: renamed from: G0, reason: from kotlin metadata */
        public boolean isAttached;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        @Nullable
        public CoroutineScope f15410q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name and from kotlin metadata */
        public int kindSet;

        /* JADX INFO: renamed from: t0, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public Node parent;

        /* JADX INFO: renamed from: u0, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public Node child;

        /* JADX INFO: renamed from: v0, reason: from kotlin metadata */
        @Nullable
        public ObserverNodeOwnerScope ownerScope;

        /* JADX INFO: renamed from: w0, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public NodeCoordinator coordinator;

        /* JADX INFO: renamed from: x0, reason: collision with root package name and from kotlin metadata */
        public boolean insertedNodeAwaitingAttachForInvalidation;

        /* JADX INFO: renamed from: y0, reason: collision with root package name and from kotlin metadata */
        public boolean updatedNodeAwaitingAttachForInvalidation;

        /* JADX INFO: renamed from: p0, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public Node node = this;

        /* JADX INFO: renamed from: s0, reason: collision with root package name and from kotlin metadata */
        public int aggregateChildKindSet = -1;

        /* JADX INFO: renamed from: getAggregateChildKindSet$ui_release, reason: from getter */
        public final int getAggregateChildKindSet() {
            return this.aggregateChildKindSet;
        }

        @Nullable
        /* JADX INFO: renamed from: getChild$ui_release, reason: from getter */
        public final Node getChild() {
            return this.child;
        }

        @Nullable
        /* JADX INFO: renamed from: getCoordinator$ui_release, reason: from getter */
        public final NodeCoordinator getCoordinator() {
            return this.coordinator;
        }

        @NotNull
        public final CoroutineScope getCoroutineScope() {
            CoroutineScope coroutineScope = this.f15410q0;
            if (coroutineScope != null) {
                return coroutineScope;
            }
            CoroutineScope CoroutineScope = CoroutineScopeKt.CoroutineScope(DelegatableNodeKt.requireOwner(this).getCoroutineContext().plus(JobKt.Job((Job) DelegatableNodeKt.requireOwner(this).getCoroutineContext().get(Job.INSTANCE))));
            this.f15410q0 = CoroutineScope;
            return CoroutineScope;
        }

        /* JADX INFO: renamed from: getInsertedNodeAwaitingAttachForInvalidation$ui_release, reason: from getter */
        public final boolean getInsertedNodeAwaitingAttachForInvalidation() {
            return this.insertedNodeAwaitingAttachForInvalidation;
        }

        /* JADX INFO: renamed from: getKindSet$ui_release, reason: from getter */
        public final int getKindSet() {
            return this.kindSet;
        }

        @Override // androidx.compose.ui.node.DelegatableNode
        @NotNull
        public final Node getNode() {
            return this.node;
        }

        @Nullable
        /* JADX INFO: renamed from: getOwnerScope$ui_release, reason: from getter */
        public final ObserverNodeOwnerScope getOwnerScope() {
            return this.ownerScope;
        }

        @Nullable
        /* JADX INFO: renamed from: getParent$ui_release, reason: from getter */
        public final Node getParent() {
            return this.parent;
        }

        public boolean getShouldAutoInvalidate() {
            return true;
        }

        /* JADX INFO: renamed from: getUpdatedNodeAwaitingAttachForInvalidation$ui_release, reason: from getter */
        public final boolean getUpdatedNodeAwaitingAttachForInvalidation() {
            return this.updatedNodeAwaitingAttachForInvalidation;
        }

        /* JADX INFO: renamed from: isAttached, reason: from getter */
        public final boolean getIsAttached() {
            return this.isAttached;
        }

        /* JADX INFO: renamed from: isKind-H91voCI$ui_release, reason: not valid java name */
        public final boolean m2185isKindH91voCI$ui_release(int kind) {
            return (kind & getKindSet()) != 0;
        }

        public void markAsAttached$ui_release() {
            if (!(!this.isAttached)) {
                throw new IllegalStateException("node attached multiple times".toString());
            }
            if (this.coordinator == null) {
                throw new IllegalStateException("attach invoked on a node without a coordinator".toString());
            }
            this.isAttached = true;
            this.E0 = true;
        }

        public void markAsDetached$ui_release() {
            if (!this.isAttached) {
                throw new IllegalStateException("Cannot detach a node that is not attached".toString());
            }
            if (!(!this.E0)) {
                throw new IllegalStateException("Must run runAttachLifecycle() before markAsDetached()".toString());
            }
            if (!(!this.F0)) {
                throw new IllegalStateException("Must run runDetachLifecycle() before markAsDetached()".toString());
            }
            this.isAttached = false;
            CoroutineScope coroutineScope = this.f15410q0;
            if (coroutineScope != null) {
                CoroutineScopeKt.cancel(coroutineScope, new g("The Modifier.Node was detached"));
                this.f15410q0 = null;
            }
        }

        public void reset$ui_release() {
            if (!this.isAttached) {
                throw new IllegalStateException("Check failed.".toString());
            }
            onReset();
        }

        public void runAttachLifecycle$ui_release() {
            if (!this.isAttached) {
                throw new IllegalStateException("Must run markAsAttached() prior to runAttachLifecycle".toString());
            }
            if (!this.E0) {
                throw new IllegalStateException("Must run runAttachLifecycle() only once after markAsAttached()".toString());
            }
            this.E0 = false;
            onAttach();
            this.F0 = true;
        }

        public void runDetachLifecycle$ui_release() {
            if (!this.isAttached) {
                throw new IllegalStateException("node detached multiple times".toString());
            }
            if (this.coordinator == null) {
                throw new IllegalStateException("detach invoked on a node without a coordinator".toString());
            }
            if (!this.F0) {
                throw new IllegalStateException("Must run runDetachLifecycle() once after runAttachLifecycle() and before markAsDetached()".toString());
            }
            this.F0 = false;
            onDetach();
        }

        public final void setAggregateChildKindSet$ui_release(int i10) {
            this.aggregateChildKindSet = i10;
        }

        public final void setAsDelegateTo$ui_release(@NotNull Node owner) {
            Intrinsics.checkNotNullParameter(owner, "owner");
            this.node = owner;
        }

        public final void setChild$ui_release(@Nullable Node node) {
            this.child = node;
        }

        public final void setInsertedNodeAwaitingAttachForInvalidation$ui_release(boolean z10) {
            this.insertedNodeAwaitingAttachForInvalidation = z10;
        }

        public final void setKindSet$ui_release(int i10) {
            this.kindSet = i10;
        }

        public final void setOwnerScope$ui_release(@Nullable ObserverNodeOwnerScope observerNodeOwnerScope) {
            this.ownerScope = observerNodeOwnerScope;
        }

        public final void setParent$ui_release(@Nullable Node node) {
            this.parent = node;
        }

        public final void setUpdatedNodeAwaitingAttachForInvalidation$ui_release(boolean z10) {
            this.updatedNodeAwaitingAttachForInvalidation = z10;
        }

        @ExperimentalComposeUiApi
        public final void sideEffect(@NotNull Function0<Unit> effect) {
            Intrinsics.checkNotNullParameter(effect, "effect");
            DelegatableNodeKt.requireOwner(this).registerOnEndApplyChangesListener(effect);
        }

        public void updateCoordinator$ui_release(@Nullable NodeCoordinator coordinator) {
            this.coordinator = coordinator;
        }

        public static /* synthetic */ void getNode$annotations() {
        }

        public static /* synthetic */ void getShouldAutoInvalidate$annotations() {
        }

        public void onAttach() {
        }

        public void onDetach() {
        }

        public void onReset() {
        }
    }
}
