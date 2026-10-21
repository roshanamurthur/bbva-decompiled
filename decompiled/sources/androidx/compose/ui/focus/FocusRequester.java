package androidx.compose.ui.focus;

import androidx.compose.runtime.Stable;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.ExperimentalComposeUiApi;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.NodeKind;
import com.bbva.plugin.localstorage.util.ConstantKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: FocusRequester.kt */
/* JADX INFO: loaded from: classes.dex */
@Stable
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u0006\u0010\u0003\u001a\u00020\u0002J\u000f\u0010\u0007\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u0006\u0010\b\u001a\u00020\u0004J\u0006\u0010\t\u001a\u00020\u0004R \u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0014"}, d2 = {"Landroidx/compose/ui/focus/FocusRequester;", "", "", "requestFocus", "", "focus$ui_release", "()Z", "focus", "captureFocus", "freeFocus", "Landroidx/compose/runtime/collection/MutableVector;", "Landroidx/compose/ui/focus/FocusRequesterModifierNode;", "a", "Landroidx/compose/runtime/collection/MutableVector;", "getFocusRequesterNodes$ui_release", "()Landroidx/compose/runtime/collection/MutableVector;", "focusRequesterNodes", "<init>", "()V", "Companion", "ui_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nFocusRequester.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FocusRequester.kt\nandroidx/compose/ui/focus/FocusRequester\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 5 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 6 DelegatableNode.kt\nandroidx/compose/ui/node/DelegatableNodeKt\n+ 7 Modifier.kt\nandroidx/compose/ui/Modifier$Node\n+ 8 DelegatingNode.kt\nandroidx/compose/ui/node/DelegatingNode\n*L\n1#1,211:1\n196#1:215\n197#1,4:217\n201#1:228\n202#1,5:258\n207#1:304\n208#1:309\n1182#2:212\n1161#2,2:213\n1182#2:233\n1161#2,2:234\n1182#2:345\n1161#2,2:346\n1#3:216\n1#3:310\n1#3:343\n460#4,7:221\n48#4:243\n467#4,4:305\n460#4,11:311\n460#4,11:322\n460#4,7:333\n48#4:355\n467#4,4:411\n90#5:229\n90#5:340\n276#6:230\n133#6,2:231\n135#6,7:236\n142#6,9:244\n383#6,5:253\n388#6:263\n393#6,2:265\n395#6,17:270\n412#6,8:290\n151#6,6:298\n276#6:341\n133#6:342\n134#6:344\n135#6,7:348\n142#6,9:356\n383#6,6:365\n393#6,2:372\n395#6,17:377\n412#6,8:397\n151#6,6:405\n261#7:264\n261#7:371\n234#8,3:267\n237#8,3:287\n234#8,3:374\n237#8,3:394\n*S KotlinDebug\n*F\n+ 1 FocusRequester.kt\nandroidx/compose/ui/focus/FocusRequester\n*L\n69#1:215\n69#1:217,4\n69#1:228\n69#1:258,5\n69#1:304\n69#1:309\n53#1:212\n53#1:213,2\n69#1:233\n69#1:234,2\n201#1:345\n201#1:346,2\n69#1:216\n201#1:343\n69#1:221,7\n69#1:243\n69#1:305,4\n98#1:311,11\n122#1:322,11\n200#1:333,7\n201#1:355\n200#1:411,4\n69#1:229\n201#1:340\n69#1:230\n69#1:231,2\n69#1:236,7\n69#1:244,9\n69#1:253,5\n69#1:263\n69#1:265,2\n69#1:270,17\n69#1:290,8\n69#1:298,6\n201#1:341\n201#1:342\n201#1:344\n201#1:348,7\n201#1:356,9\n201#1:365,6\n201#1:372,2\n201#1:377,17\n201#1:397,8\n201#1:405,6\n69#1:264\n201#1:371\n69#1:267,3\n69#1:287,3\n201#1:374,3\n201#1:394,3\n*E\n"})
public final class FocusRequester {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final FocusRequester f15506b = new FocusRequester();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final FocusRequester f15507c = new FocusRequester();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final MutableVector<FocusRequesterModifierNode> focusRequesterNodes = new MutableVector<>(new FocusRequesterModifierNode[16], 0);

    /* JADX INFO: compiled from: FocusRequester.kt */
    public static final class a extends Lambda implements Function1<FocusTargetNode, Boolean> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final a f15509p0 = new a(1);

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(FocusTargetNode focusTargetNode) {
            FocusTargetNode it = focusTargetNode;
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.valueOf(FocusTransactionsKt.requestFocus(it));
        }
    }

    public final boolean captureFocus() {
        MutableVector<FocusRequesterModifierNode> mutableVector = this.focusRequesterNodes;
        if (!mutableVector.isNotEmpty()) {
            throw new IllegalStateException("\n   FocusRequester is not initialized. Here are some possible fixes:\n\n   1. Remember the FocusRequester: val focusRequester = remember { FocusRequester() }\n   2. Did you forget to add a Modifier.focusRequester() ?\n   3. Are you attempting to request focus during composition? Focus requests should be made in\n   response to some event. Eg Modifier.clickable { focusRequester.requestFocus() }\n".toString());
        }
        int size = mutableVector.getSize();
        if (size > 0) {
            FocusRequesterModifierNode[] content = mutableVector.getContent();
            int i10 = 0;
            while (!FocusRequesterModifierNodeKt.captureFocus(content[i10])) {
                i10++;
                if (i10 >= size) {
                }
            }
            return true;
        }
        return false;
    }

    public final boolean focus$ui_release() {
        Companion companion = INSTANCE;
        if (this == companion.getDefault()) {
            throw new IllegalStateException("\n    Please check whether the focusRequester is FocusRequester.Cancel or FocusRequester.Default\n    before invoking any functions on the focusRequester.\n".toString());
        }
        if (this == companion.getCancel()) {
            throw new IllegalStateException("\n    Please check whether the focusRequester is FocusRequester.Cancel or FocusRequester.Default\n    before invoking any functions on the focusRequester.\n".toString());
        }
        MutableVector<FocusRequesterModifierNode> mutableVector = this.focusRequesterNodes;
        if (!mutableVector.isNotEmpty()) {
            throw new IllegalStateException("\n   FocusRequester is not initialized. Here are some possible fixes:\n\n   1. Remember the FocusRequester: val focusRequester = remember { FocusRequester() }\n   2. Did you forget to add a Modifier.focusRequester() ?\n   3. Are you attempting to request focus during composition? Focus requests should be made in\n   response to some event. Eg Modifier.clickable { focusRequester.requestFocus() }\n".toString());
        }
        int size = mutableVector.getSize();
        if (size <= 0) {
            return false;
        }
        FocusRequesterModifierNode[] content = mutableVector.getContent();
        int i10 = 0;
        boolean z10 = false;
        do {
            FocusRequesterModifierNode focusRequesterModifierNode = content[i10];
            int iM3725constructorimpl = NodeKind.m3725constructorimpl(1024);
            if (!focusRequesterModifierNode.getNode().getIsAttached()) {
                throw new IllegalStateException("visitChildren called on an unattached node".toString());
            }
            MutableVector mutableVector2 = new MutableVector(new Modifier.Node[16], 0);
            Modifier.Node child = focusRequesterModifierNode.getNode().getChild();
            if (child == null) {
                DelegatableNodeKt.access$addLayoutNodeChildren(mutableVector2, focusRequesterModifierNode.getNode());
            } else {
                mutableVector2.add(child);
            }
            while (mutableVector2.isNotEmpty()) {
                Modifier.Node nodeAccess$pop = (Modifier.Node) androidx.constraintlayout.core.parser.a.a(mutableVector2, 1);
                if ((nodeAccess$pop.getAggregateChildKindSet() & iM3725constructorimpl) == 0) {
                    DelegatableNodeKt.access$addLayoutNodeChildren(mutableVector2, nodeAccess$pop);
                } else {
                    while (nodeAccess$pop != null) {
                        if ((nodeAccess$pop.getKindSet() & iM3725constructorimpl) != 0) {
                            MutableVector mutableVector3 = null;
                            while (nodeAccess$pop != null) {
                                if (nodeAccess$pop instanceof FocusTargetNode) {
                                    FocusTargetNode focusTargetNode = (FocusTargetNode) nodeAccess$pop;
                                    if (focusTargetNode.fetchFocusProperties$ui_release().getCanFocus() ? FocusTransactionsKt.requestFocus(focusTargetNode) : TwoDimensionalFocusSearchKt.m2239findChildCorrespondingToFocusEnterOMvw8(focusTargetNode, FocusDirection.INSTANCE.m2218getEnterdhqQ8s(), a.f15509p0)) {
                                        z10 = true;
                                        break;
                                    }
                                } else if ((nodeAccess$pop.getKindSet() & iM3725constructorimpl) != 0 && (nodeAccess$pop instanceof DelegatingNode)) {
                                    int i11 = 0;
                                    for (Modifier.Node delegate$ui_release = ((DelegatingNode) nodeAccess$pop).getDelegate(); delegate$ui_release != null; delegate$ui_release = delegate$ui_release.getChild()) {
                                        if ((delegate$ui_release.getKindSet() & iM3725constructorimpl) != 0) {
                                            i11++;
                                            if (i11 == 1) {
                                                nodeAccess$pop = delegate$ui_release;
                                            } else {
                                                if (mutableVector3 == null) {
                                                    mutableVector3 = new MutableVector(new Modifier.Node[16], 0);
                                                }
                                                if (nodeAccess$pop != null) {
                                                    mutableVector3.add(nodeAccess$pop);
                                                    nodeAccess$pop = null;
                                                }
                                                mutableVector3.add(delegate$ui_release);
                                            }
                                        }
                                    }
                                    if (i11 == 1) {
                                    }
                                }
                                nodeAccess$pop = DelegatableNodeKt.access$pop(mutableVector3);
                            }
                            break;
                        }
                        nodeAccess$pop = nodeAccess$pop.getChild();
                    }
                }
            }
            i10++;
        } while (i10 < size);
        return z10;
    }

    public final boolean freeFocus() {
        MutableVector<FocusRequesterModifierNode> mutableVector = this.focusRequesterNodes;
        if (!mutableVector.isNotEmpty()) {
            throw new IllegalStateException("\n   FocusRequester is not initialized. Here are some possible fixes:\n\n   1. Remember the FocusRequester: val focusRequester = remember { FocusRequester() }\n   2. Did you forget to add a Modifier.focusRequester() ?\n   3. Are you attempting to request focus during composition? Focus requests should be made in\n   response to some event. Eg Modifier.clickable { focusRequester.requestFocus() }\n".toString());
        }
        int size = mutableVector.getSize();
        if (size > 0) {
            FocusRequesterModifierNode[] content = mutableVector.getContent();
            int i10 = 0;
            while (!FocusRequesterModifierNodeKt.freeFocus(content[i10])) {
                i10++;
                if (i10 >= size) {
                }
            }
            return true;
        }
        return false;
    }

    @NotNull
    public final MutableVector<FocusRequesterModifierNode> getFocusRequesterNodes$ui_release() {
        return this.focusRequesterNodes;
    }

    public final void requestFocus() {
        focus$ui_release();
    }

    /* JADX INFO: compiled from: FocusRequester.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\fB\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\n\u001a\u00020\u000bH\u0007R\u001c\u0010\u0003\u001a\u00020\u00048GX\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007¨\u0006\r"}, d2 = {"Landroidx/compose/ui/focus/FocusRequester$Companion;", "", "()V", ConstantKt.BIOMETRIC_NEGATIVE_BUTTON, "Landroidx/compose/ui/focus/FocusRequester;", "getCancel$annotations", "getCancel", "()Landroidx/compose/ui/focus/FocusRequester;", "Default", "getDefault", "createRefs", "Landroidx/compose/ui/focus/FocusRequester$Companion$FocusRequesterFactory;", "FocusRequesterFactory", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: compiled from: FocusRequester.kt */
        @StabilityInferred(parameters = 0)
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004H\u0086\u0002J\t\u0010\u0005\u001a\u00020\u0004H\u0086\u0002J\t\u0010\u0006\u001a\u00020\u0004H\u0086\u0002J\t\u0010\u0007\u001a\u00020\u0004H\u0086\u0002J\t\u0010\b\u001a\u00020\u0004H\u0086\u0002J\t\u0010\t\u001a\u00020\u0004H\u0086\u0002J\t\u0010\n\u001a\u00020\u0004H\u0086\u0002J\t\u0010\u000b\u001a\u00020\u0004H\u0086\u0002J\t\u0010\f\u001a\u00020\u0004H\u0086\u0002J\t\u0010\r\u001a\u00020\u0004H\u0086\u0002J\t\u0010\u000e\u001a\u00020\u0004H\u0086\u0002J\t\u0010\u000f\u001a\u00020\u0004H\u0086\u0002J\t\u0010\u0010\u001a\u00020\u0004H\u0086\u0002J\t\u0010\u0011\u001a\u00020\u0004H\u0086\u0002J\t\u0010\u0012\u001a\u00020\u0004H\u0086\u0002J\t\u0010\u0013\u001a\u00020\u0004H\u0086\u0002¨\u0006\u0014"}, d2 = {"Landroidx/compose/ui/focus/FocusRequester$Companion$FocusRequesterFactory;", "", "()V", "component1", "Landroidx/compose/ui/focus/FocusRequester;", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        @ExperimentalComposeUiApi
        public static final class FocusRequesterFactory {
            public static final int $stable = 0;

            @NotNull
            public static final FocusRequesterFactory INSTANCE = new FocusRequesterFactory();

            @NotNull
            public final FocusRequester component1() {
                return new FocusRequester();
            }

            @NotNull
            public final FocusRequester component10() {
                return new FocusRequester();
            }

            @NotNull
            public final FocusRequester component11() {
                return new FocusRequester();
            }

            @NotNull
            public final FocusRequester component12() {
                return new FocusRequester();
            }

            @NotNull
            public final FocusRequester component13() {
                return new FocusRequester();
            }

            @NotNull
            public final FocusRequester component14() {
                return new FocusRequester();
            }

            @NotNull
            public final FocusRequester component15() {
                return new FocusRequester();
            }

            @NotNull
            public final FocusRequester component16() {
                return new FocusRequester();
            }

            @NotNull
            public final FocusRequester component2() {
                return new FocusRequester();
            }

            @NotNull
            public final FocusRequester component3() {
                return new FocusRequester();
            }

            @NotNull
            public final FocusRequester component4() {
                return new FocusRequester();
            }

            @NotNull
            public final FocusRequester component5() {
                return new FocusRequester();
            }

            @NotNull
            public final FocusRequester component6() {
                return new FocusRequester();
            }

            @NotNull
            public final FocusRequester component7() {
                return new FocusRequester();
            }

            @NotNull
            public final FocusRequester component8() {
                return new FocusRequester();
            }

            @NotNull
            public final FocusRequester component9() {
                return new FocusRequester();
            }
        }

        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @ExperimentalComposeUiApi
        @NotNull
        public final FocusRequesterFactory createRefs() {
            return FocusRequesterFactory.INSTANCE;
        }

        @ExperimentalComposeUiApi
        @NotNull
        public final FocusRequester getCancel() {
            return FocusRequester.f15507c;
        }

        @NotNull
        public final FocusRequester getDefault() {
            return FocusRequester.f15506b;
        }

        @ExperimentalComposeUiApi
        public static /* synthetic */ void getCancel$annotations() {
        }
    }
}
