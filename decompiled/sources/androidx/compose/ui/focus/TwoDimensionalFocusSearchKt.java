package androidx.compose.ui.focus;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.BeyondBoundsLayout;
import androidx.compose.ui.node.DelegatableNode;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.NodeKind;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: TwoDimensionalFocusSearch.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\b\u001a7\u0010\b\u001a\u0004\u0018\u00010\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00040\u0003H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0006\u0010\u0007\u001a5\u0010\u000b\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00040\u0003H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\n\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\f"}, d2 = {"Landroidx/compose/ui/focus/FocusTargetNode;", "Landroidx/compose/ui/focus/FocusDirection;", "direction", "Lkotlin/Function1;", "", "onFound", "twoDimensionalFocusSearch--OM-vw8", "(Landroidx/compose/ui/focus/FocusTargetNode;ILkotlin/jvm/functions/Function1;)Ljava/lang/Boolean;", "twoDimensionalFocusSearch", "findChildCorrespondingToFocusEnter--OM-vw8", "(Landroidx/compose/ui/focus/FocusTargetNode;ILkotlin/jvm/functions/Function1;)Z", "findChildCorrespondingToFocusEnter", "ui_release"}, k = 2, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nTwoDimensionalFocusSearch.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TwoDimensionalFocusSearch.kt\nandroidx/compose/ui/focus/TwoDimensionalFocusSearchKt\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 6 DelegatableNode.kt\nandroidx/compose/ui/node/DelegatableNodeKt\n+ 7 Modifier.kt\nandroidx/compose/ui/Modifier$Node\n+ 8 DelegatingNode.kt\nandroidx/compose/ui/node/DelegatingNode\n*L\n1#1,386:1\n1161#2,2:387\n1161#2,2:392\n1182#2:399\n1161#2,2:400\n1182#2:470\n1161#2,2:471\n359#3:389\n523#3:390\n48#3:409\n48#3:480\n460#3,11:536\n1#4:391\n1#4:397\n1#4:468\n90#5:394\n90#5:465\n276#6:395\n133#6:396\n134#6:398\n135#6,7:402\n142#6,9:410\n383#6,6:419\n393#6,2:426\n395#6,17:431\n412#6,8:451\n151#6,6:459\n276#6:466\n133#6:467\n134#6:469\n135#6,7:473\n142#6,9:481\n383#6,6:490\n393#6,2:497\n395#6,17:502\n412#6,8:522\n151#6,6:530\n261#7:425\n261#7:496\n234#8,3:428\n237#8,3:448\n234#8,3:499\n237#8,3:519\n*S KotlinDebug\n*F\n+ 1 TwoDimensionalFocusSearch.kt\nandroidx/compose/ui/focus/TwoDimensionalFocusSearchKt\n*L\n104#1:387,2\n160#1:392,2\n161#1:399\n161#1:400,2\n190#1:470\n190#1:471,2\n109#1:389\n109#1:390\n161#1:409\n190#1:480\n221#1:536,11\n161#1:397\n190#1:468\n161#1:394\n190#1:465\n161#1:395\n161#1:396\n161#1:398\n161#1:402,7\n161#1:410,9\n161#1:419,6\n161#1:426,2\n161#1:431,17\n161#1:451,8\n161#1:459,6\n190#1:466\n190#1:467\n190#1:469\n190#1:473,7\n190#1:481,9\n190#1:490,6\n190#1:497,2\n190#1:502,17\n190#1:522,8\n190#1:530,6\n161#1:425\n190#1:496\n161#1:428,3\n161#1:448,3\n190#1:499,3\n190#1:519,3\n*E\n"})
public final class TwoDimensionalFocusSearchKt {

    /* JADX INFO: compiled from: TwoDimensionalFocusSearch.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[FocusStateImpl.values().length];
            try {
                iArr[FocusStateImpl.ActiveParent.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FocusStateImpl.Active.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[FocusStateImpl.Captured.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[FocusStateImpl.Inactive.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: compiled from: TwoDimensionalFocusSearch.kt */
    public static final class a extends Lambda implements Function1<BeyondBoundsLayout.BeyondBoundsScope, Boolean> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ FocusTargetNode f15518p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ FocusTargetNode f15519q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ int f15520r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ Function1<FocusTargetNode, Boolean> f15521s0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(FocusTargetNode focusTargetNode, FocusTargetNode focusTargetNode2, int i10, Function1<? super FocusTargetNode, Boolean> function1) {
            super(1);
            this.f15518p0 = focusTargetNode;
            this.f15519q0 = focusTargetNode2;
            this.f15520r0 = i10;
            this.f15521s0 = function1;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(BeyondBoundsLayout.BeyondBoundsScope beyondBoundsScope) {
            BeyondBoundsLayout.BeyondBoundsScope searchBeyondBounds = beyondBoundsScope;
            Intrinsics.checkNotNullParameter(searchBeyondBounds, "$this$searchBeyondBounds");
            Boolean boolValueOf = Boolean.valueOf(TwoDimensionalFocusSearchKt.h(this.f15518p0, this.f15519q0, this.f15520r0, this.f15521s0));
            if (boolValueOf.booleanValue() || !searchBeyondBounds.getHasMoreContent()) {
                return boolValueOf;
            }
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x006f  */
    /* JADX WARN: Code duplicated, block: B:28:0x0079  */
    /* JADX WARN: Code duplicated, block: B:33:0x008f  */
    /* JADX WARN: Code duplicated, block: B:35:0x0099  */
    /* JADX WARN: Code duplicated, block: B:37:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:39:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:41:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:42:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:44:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:47:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:49:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:51:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:53:0x0102  */
    /* JADX WARN: Code duplicated, block: B:55:0x010c  */
    /* JADX WARN: Code duplicated, block: B:56:0x0115  */
    /* JADX WARN: Code duplicated, block: B:58:0x011f  */
    /* JADX WARN: Code duplicated, block: B:62:0x0134  */
    /* JADX WARN: Code duplicated, block: B:64:0x013e  */
    /* JADX WARN: Code duplicated, block: B:69:? A[RETURN, SYNTHETIC] */
    public static final boolean a(Rect rect, Rect rect2, Rect rect3, int i10) {
        float top;
        float bottom;
        float top2;
        float bottom2;
        float f6;
        float fMax;
        float bottom3;
        float bottom4;
        float top3;
        float top4;
        float f10;
        if (b(i10, rect3, rect) || !b(i10, rect2, rect)) {
            return false;
        }
        FocusDirection.Companion companion = FocusDirection.INSTANCE;
        if (FocusDirection.m2209equalsimpl0(i10, companion.m2221getLeftdhqQ8s())) {
            if (rect.getLeft() >= rect3.getRight()) {
                if (!FocusDirection.m2209equalsimpl0(i10, companion.m2221getLeftdhqQ8s()) && !FocusDirection.m2209equalsimpl0(i10, companion.m2225getRightdhqQ8s())) {
                    if (FocusDirection.m2209equalsimpl0(i10, companion.m2221getLeftdhqQ8s())) {
                        top2 = rect.getLeft();
                        bottom2 = rect2.getRight();
                    } else {
                        if (FocusDirection.m2209equalsimpl0(i10, companion.m2225getRightdhqQ8s())) {
                            top = rect2.getLeft();
                            bottom = rect.getRight();
                        } else if (FocusDirection.m2209equalsimpl0(i10, companion.m2226getUpdhqQ8s())) {
                            top2 = rect.getTop();
                            bottom2 = rect2.getBottom();
                        } else {
                            if (FocusDirection.m2209equalsimpl0(i10, companion.m2217getDowndhqQ8s())) {
                                throw new IllegalStateException("This function should only be used for 2-D focus search".toString());
                            }
                            top = rect2.getTop();
                            bottom = rect.getBottom();
                        }
                        f6 = top - bottom;
                        fMax = Math.max(0.0f, f6);
                        if (FocusDirection.m2209equalsimpl0(i10, companion.m2221getLeftdhqQ8s())) {
                            top3 = rect.getLeft();
                            top4 = rect3.getLeft();
                        } else {
                            if (FocusDirection.m2209equalsimpl0(i10, companion.m2225getRightdhqQ8s())) {
                                bottom3 = rect3.getRight();
                                bottom4 = rect.getRight();
                            } else if (FocusDirection.m2209equalsimpl0(i10, companion.m2226getUpdhqQ8s())) {
                                top3 = rect.getTop();
                                top4 = rect3.getTop();
                            } else {
                                if (FocusDirection.m2209equalsimpl0(i10, companion.m2217getDowndhqQ8s())) {
                                    throw new IllegalStateException("This function should only be used for 2-D focus search".toString());
                                }
                                bottom3 = rect3.getBottom();
                                bottom4 = rect.getBottom();
                            }
                            f10 = bottom3 - bottom4;
                            if (fMax >= Math.max(1.0f, f10)) {
                                return false;
                            }
                        }
                        f10 = top3 - top4;
                        if (fMax >= Math.max(1.0f, f10)) {
                            return false;
                        }
                    }
                    f6 = top2 - bottom2;
                    fMax = Math.max(0.0f, f6);
                    if (FocusDirection.m2209equalsimpl0(i10, companion.m2221getLeftdhqQ8s())) {
                        top3 = rect.getLeft();
                        top4 = rect3.getLeft();
                    } else {
                        if (FocusDirection.m2209equalsimpl0(i10, companion.m2225getRightdhqQ8s())) {
                            bottom3 = rect3.getRight();
                            bottom4 = rect.getRight();
                        } else if (FocusDirection.m2209equalsimpl0(i10, companion.m2226getUpdhqQ8s())) {
                            top3 = rect.getTop();
                            top4 = rect3.getTop();
                        } else {
                            if (FocusDirection.m2209equalsimpl0(i10, companion.m2217getDowndhqQ8s())) {
                                throw new IllegalStateException("This function should only be used for 2-D focus search".toString());
                            }
                            bottom3 = rect3.getBottom();
                            bottom4 = rect.getBottom();
                        }
                        f10 = bottom3 - bottom4;
                        if (fMax >= Math.max(1.0f, f10)) {
                            return false;
                        }
                    }
                    f10 = top3 - top4;
                    if (fMax >= Math.max(1.0f, f10)) {
                        return false;
                    }
                }
            }
        } else if (FocusDirection.m2209equalsimpl0(i10, companion.m2225getRightdhqQ8s())) {
            if (rect.getRight() <= rect3.getLeft()) {
                if (!FocusDirection.m2209equalsimpl0(i10, companion.m2221getLeftdhqQ8s())) {
                    if (FocusDirection.m2209equalsimpl0(i10, companion.m2221getLeftdhqQ8s())) {
                        top2 = rect.getLeft();
                        bottom2 = rect2.getRight();
                    } else {
                        if (FocusDirection.m2209equalsimpl0(i10, companion.m2225getRightdhqQ8s())) {
                            top = rect2.getLeft();
                            bottom = rect.getRight();
                        } else if (FocusDirection.m2209equalsimpl0(i10, companion.m2226getUpdhqQ8s())) {
                            top2 = rect.getTop();
                            bottom2 = rect2.getBottom();
                        } else {
                            if (FocusDirection.m2209equalsimpl0(i10, companion.m2217getDowndhqQ8s())) {
                                throw new IllegalStateException("This function should only be used for 2-D focus search".toString());
                            }
                            top = rect2.getTop();
                            bottom = rect.getBottom();
                        }
                        f6 = top - bottom;
                        fMax = Math.max(0.0f, f6);
                        if (FocusDirection.m2209equalsimpl0(i10, companion.m2221getLeftdhqQ8s())) {
                            top3 = rect.getLeft();
                            top4 = rect3.getLeft();
                        } else {
                            if (FocusDirection.m2209equalsimpl0(i10, companion.m2225getRightdhqQ8s())) {
                                bottom3 = rect3.getRight();
                                bottom4 = rect.getRight();
                            } else if (FocusDirection.m2209equalsimpl0(i10, companion.m2226getUpdhqQ8s())) {
                                top3 = rect.getTop();
                                top4 = rect3.getTop();
                            } else {
                                if (FocusDirection.m2209equalsimpl0(i10, companion.m2217getDowndhqQ8s())) {
                                    throw new IllegalStateException("This function should only be used for 2-D focus search".toString());
                                }
                                bottom3 = rect3.getBottom();
                                bottom4 = rect.getBottom();
                            }
                            f10 = bottom3 - bottom4;
                            if (fMax >= Math.max(1.0f, f10)) {
                                return false;
                            }
                        }
                        f10 = top3 - top4;
                        if (fMax >= Math.max(1.0f, f10)) {
                            return false;
                        }
                    }
                    f6 = top2 - bottom2;
                    fMax = Math.max(0.0f, f6);
                    if (FocusDirection.m2209equalsimpl0(i10, companion.m2221getLeftdhqQ8s())) {
                        top3 = rect.getLeft();
                        top4 = rect3.getLeft();
                    } else {
                        if (FocusDirection.m2209equalsimpl0(i10, companion.m2225getRightdhqQ8s())) {
                            bottom3 = rect3.getRight();
                            bottom4 = rect.getRight();
                        } else if (FocusDirection.m2209equalsimpl0(i10, companion.m2226getUpdhqQ8s())) {
                            top3 = rect.getTop();
                            top4 = rect3.getTop();
                        } else {
                            if (FocusDirection.m2209equalsimpl0(i10, companion.m2217getDowndhqQ8s())) {
                                throw new IllegalStateException("This function should only be used for 2-D focus search".toString());
                            }
                            bottom3 = rect3.getBottom();
                            bottom4 = rect.getBottom();
                        }
                        f10 = bottom3 - bottom4;
                        if (fMax >= Math.max(1.0f, f10)) {
                            return false;
                        }
                    }
                    f10 = top3 - top4;
                    if (fMax >= Math.max(1.0f, f10)) {
                        return false;
                    }
                }
            }
        } else if (FocusDirection.m2209equalsimpl0(i10, companion.m2226getUpdhqQ8s())) {
            if (rect.getTop() >= rect3.getBottom()) {
                if (!FocusDirection.m2209equalsimpl0(i10, companion.m2221getLeftdhqQ8s())) {
                    if (FocusDirection.m2209equalsimpl0(i10, companion.m2221getLeftdhqQ8s())) {
                        top2 = rect.getLeft();
                        bottom2 = rect2.getRight();
                    } else {
                        if (FocusDirection.m2209equalsimpl0(i10, companion.m2225getRightdhqQ8s())) {
                            top = rect2.getLeft();
                            bottom = rect.getRight();
                        } else if (FocusDirection.m2209equalsimpl0(i10, companion.m2226getUpdhqQ8s())) {
                            top2 = rect.getTop();
                            bottom2 = rect2.getBottom();
                        } else {
                            if (FocusDirection.m2209equalsimpl0(i10, companion.m2217getDowndhqQ8s())) {
                                throw new IllegalStateException("This function should only be used for 2-D focus search".toString());
                            }
                            top = rect2.getTop();
                            bottom = rect.getBottom();
                        }
                        f6 = top - bottom;
                        fMax = Math.max(0.0f, f6);
                        if (FocusDirection.m2209equalsimpl0(i10, companion.m2221getLeftdhqQ8s())) {
                            top3 = rect.getLeft();
                            top4 = rect3.getLeft();
                        } else {
                            if (FocusDirection.m2209equalsimpl0(i10, companion.m2225getRightdhqQ8s())) {
                                bottom3 = rect3.getRight();
                                bottom4 = rect.getRight();
                            } else if (FocusDirection.m2209equalsimpl0(i10, companion.m2226getUpdhqQ8s())) {
                                top3 = rect.getTop();
                                top4 = rect3.getTop();
                            } else {
                                if (FocusDirection.m2209equalsimpl0(i10, companion.m2217getDowndhqQ8s())) {
                                    throw new IllegalStateException("This function should only be used for 2-D focus search".toString());
                                }
                                bottom3 = rect3.getBottom();
                                bottom4 = rect.getBottom();
                            }
                            f10 = bottom3 - bottom4;
                            if (fMax >= Math.max(1.0f, f10)) {
                                return false;
                            }
                        }
                        f10 = top3 - top4;
                        if (fMax >= Math.max(1.0f, f10)) {
                            return false;
                        }
                    }
                    f6 = top2 - bottom2;
                    fMax = Math.max(0.0f, f6);
                    if (FocusDirection.m2209equalsimpl0(i10, companion.m2221getLeftdhqQ8s())) {
                        top3 = rect.getLeft();
                        top4 = rect3.getLeft();
                    } else {
                        if (FocusDirection.m2209equalsimpl0(i10, companion.m2225getRightdhqQ8s())) {
                            bottom3 = rect3.getRight();
                            bottom4 = rect.getRight();
                        } else if (FocusDirection.m2209equalsimpl0(i10, companion.m2226getUpdhqQ8s())) {
                            top3 = rect.getTop();
                            top4 = rect3.getTop();
                        } else {
                            if (FocusDirection.m2209equalsimpl0(i10, companion.m2217getDowndhqQ8s())) {
                                throw new IllegalStateException("This function should only be used for 2-D focus search".toString());
                            }
                            bottom3 = rect3.getBottom();
                            bottom4 = rect.getBottom();
                        }
                        f10 = bottom3 - bottom4;
                        if (fMax >= Math.max(1.0f, f10)) {
                            return false;
                        }
                    }
                    f10 = top3 - top4;
                    if (fMax >= Math.max(1.0f, f10)) {
                        return false;
                    }
                }
            }
        } else {
            if (!FocusDirection.m2209equalsimpl0(i10, companion.m2217getDowndhqQ8s())) {
                throw new IllegalStateException("This function should only be used for 2-D focus search".toString());
            }
            if (rect.getBottom() <= rect3.getTop()) {
                if (!FocusDirection.m2209equalsimpl0(i10, companion.m2221getLeftdhqQ8s())) {
                    if (FocusDirection.m2209equalsimpl0(i10, companion.m2221getLeftdhqQ8s())) {
                        top2 = rect.getLeft();
                        bottom2 = rect2.getRight();
                    } else {
                        if (FocusDirection.m2209equalsimpl0(i10, companion.m2225getRightdhqQ8s())) {
                            top = rect2.getLeft();
                            bottom = rect.getRight();
                        } else if (FocusDirection.m2209equalsimpl0(i10, companion.m2226getUpdhqQ8s())) {
                            top2 = rect.getTop();
                            bottom2 = rect2.getBottom();
                        } else {
                            if (FocusDirection.m2209equalsimpl0(i10, companion.m2217getDowndhqQ8s())) {
                                throw new IllegalStateException("This function should only be used for 2-D focus search".toString());
                            }
                            top = rect2.getTop();
                            bottom = rect.getBottom();
                        }
                        f6 = top - bottom;
                        fMax = Math.max(0.0f, f6);
                        if (FocusDirection.m2209equalsimpl0(i10, companion.m2221getLeftdhqQ8s())) {
                            top3 = rect.getLeft();
                            top4 = rect3.getLeft();
                        } else {
                            if (FocusDirection.m2209equalsimpl0(i10, companion.m2225getRightdhqQ8s())) {
                                bottom3 = rect3.getRight();
                                bottom4 = rect.getRight();
                            } else if (FocusDirection.m2209equalsimpl0(i10, companion.m2226getUpdhqQ8s())) {
                                top3 = rect.getTop();
                                top4 = rect3.getTop();
                            } else {
                                if (FocusDirection.m2209equalsimpl0(i10, companion.m2217getDowndhqQ8s())) {
                                    throw new IllegalStateException("This function should only be used for 2-D focus search".toString());
                                }
                                bottom3 = rect3.getBottom();
                                bottom4 = rect.getBottom();
                            }
                            f10 = bottom3 - bottom4;
                            if (fMax >= Math.max(1.0f, f10)) {
                                return false;
                            }
                        }
                        f10 = top3 - top4;
                        if (fMax >= Math.max(1.0f, f10)) {
                            return false;
                        }
                    }
                    f6 = top2 - bottom2;
                    fMax = Math.max(0.0f, f6);
                    if (FocusDirection.m2209equalsimpl0(i10, companion.m2221getLeftdhqQ8s())) {
                        top3 = rect.getLeft();
                        top4 = rect3.getLeft();
                    } else {
                        if (FocusDirection.m2209equalsimpl0(i10, companion.m2225getRightdhqQ8s())) {
                            bottom3 = rect3.getRight();
                            bottom4 = rect.getRight();
                        } else if (FocusDirection.m2209equalsimpl0(i10, companion.m2226getUpdhqQ8s())) {
                            top3 = rect.getTop();
                            top4 = rect3.getTop();
                        } else {
                            if (FocusDirection.m2209equalsimpl0(i10, companion.m2217getDowndhqQ8s())) {
                                throw new IllegalStateException("This function should only be used for 2-D focus search".toString());
                            }
                            bottom3 = rect3.getBottom();
                            bottom4 = rect.getBottom();
                        }
                        f10 = bottom3 - bottom4;
                        if (fMax >= Math.max(1.0f, f10)) {
                            return false;
                        }
                    }
                    f10 = top3 - top4;
                    if (fMax >= Math.max(1.0f, f10)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public static final boolean b(int i10, Rect rect, Rect rect2) {
        FocusDirection.Companion companion = FocusDirection.INSTANCE;
        if (FocusDirection.m2209equalsimpl0(i10, companion.m2221getLeftdhqQ8s()) || FocusDirection.m2209equalsimpl0(i10, companion.m2225getRightdhqQ8s())) {
            if (rect.getBottom() <= rect2.getTop() || rect.getTop() >= rect2.getBottom()) {
                return false;
            }
        } else {
            if (!FocusDirection.m2209equalsimpl0(i10, companion.m2226getUpdhqQ8s()) && !FocusDirection.m2209equalsimpl0(i10, companion.m2217getDowndhqQ8s())) {
                throw new IllegalStateException("This function should only be used for 2-D focus search".toString());
            }
            if (rect.getRight() <= rect2.getLeft() || rect.getLeft() >= rect2.getRight()) {
                return false;
            }
        }
        return true;
    }

    public static final void c(DelegatableNode delegatableNode, MutableVector<FocusTargetNode> mutableVector) {
        int iM3725constructorimpl = NodeKind.m3725constructorimpl(1024);
        if (!delegatableNode.getNode().getIsAttached()) {
            throw new IllegalStateException("visitChildren called on an unattached node".toString());
        }
        MutableVector mutableVector2 = new MutableVector(new Modifier.Node[16], 0);
        Modifier.Node child = delegatableNode.getNode().getChild();
        if (child == null) {
            DelegatableNodeKt.access$addLayoutNodeChildren(mutableVector2, delegatableNode.getNode());
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
                                if (focusTargetNode.getIsAttached()) {
                                    if (focusTargetNode.fetchFocusProperties$ui_release().getCanFocus()) {
                                        mutableVector.add(focusTargetNode);
                                    } else {
                                        c(focusTargetNode, mutableVector);
                                    }
                                }
                            } else if ((nodeAccess$pop.getKindSet() & iM3725constructorimpl) != 0 && (nodeAccess$pop instanceof DelegatingNode)) {
                                int i10 = 0;
                                for (Modifier.Node delegate$ui_release = ((DelegatingNode) nodeAccess$pop).getDelegate(); delegate$ui_release != null; delegate$ui_release = delegate$ui_release.getChild()) {
                                    if ((delegate$ui_release.getKindSet() & iM3725constructorimpl) != 0) {
                                        i10++;
                                        if (i10 == 1) {
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
                                if (i10 == 1) {
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
    }

    public static final FocusTargetNode d(MutableVector<FocusTargetNode> mutableVector, Rect rect, int i10) {
        Rect rectTranslate;
        FocusDirection.Companion companion = FocusDirection.INSTANCE;
        if (FocusDirection.m2209equalsimpl0(i10, companion.m2221getLeftdhqQ8s())) {
            rectTranslate = rect.translate(rect.getWidth() + 1, 0.0f);
        } else if (FocusDirection.m2209equalsimpl0(i10, companion.m2225getRightdhqQ8s())) {
            rectTranslate = rect.translate(-(rect.getWidth() + 1), 0.0f);
        } else if (FocusDirection.m2209equalsimpl0(i10, companion.m2226getUpdhqQ8s())) {
            rectTranslate = rect.translate(0.0f, rect.getHeight() + 1);
        } else {
            if (!FocusDirection.m2209equalsimpl0(i10, companion.m2217getDowndhqQ8s())) {
                throw new IllegalStateException("This function should only be used for 2-D focus search".toString());
            }
            rectTranslate = rect.translate(0.0f, -(rect.getHeight() + 1));
        }
        int size = mutableVector.getSize();
        FocusTargetNode focusTargetNode = null;
        if (size > 0) {
            FocusTargetNode[] content = mutableVector.getContent();
            int i11 = 0;
            do {
                FocusTargetNode focusTargetNode2 = content[i11];
                if (FocusTraversalKt.isEligibleForFocusSearch(focusTargetNode2)) {
                    Rect rectFocusRect = FocusTraversalKt.focusRect(focusTargetNode2);
                    if (f(i10, rectFocusRect, rect) && (!f(i10, rectTranslate, rect) || a(rect, rectFocusRect, rectTranslate, i10) || (!a(rect, rectTranslate, rectFocusRect, i10) && g(i10, rect, rectFocusRect) < g(i10, rect, rectTranslate)))) {
                        focusTargetNode = focusTargetNode2;
                        rectTranslate = rectFocusRect;
                    }
                }
                i11++;
            } while (i11 < size);
        }
        return focusTargetNode;
    }

    public static final boolean e(FocusTargetNode focusTargetNode, FocusTargetNode focusTargetNode2, int i10, Function1<? super FocusTargetNode, Boolean> function1) {
        if (h(focusTargetNode, focusTargetNode2, i10, function1)) {
            return true;
        }
        Boolean bool = (Boolean) BeyondBoundsLayoutKt.m2205searchBeyondBoundsOMvw8(focusTargetNode, i10, new a(focusTargetNode, focusTargetNode2, i10, function1));
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public static final boolean f(int i10, Rect rect, Rect rect2) {
        FocusDirection.Companion companion = FocusDirection.INSTANCE;
        if (FocusDirection.m2209equalsimpl0(i10, companion.m2221getLeftdhqQ8s())) {
            if ((rect2.getRight() <= rect.getRight() && rect2.getLeft() < rect.getRight()) || rect2.getLeft() <= rect.getLeft()) {
                return false;
            }
        } else if (FocusDirection.m2209equalsimpl0(i10, companion.m2225getRightdhqQ8s())) {
            if ((rect2.getLeft() >= rect.getLeft() && rect2.getRight() > rect.getLeft()) || rect2.getRight() >= rect.getRight()) {
                return false;
            }
        } else if (FocusDirection.m2209equalsimpl0(i10, companion.m2226getUpdhqQ8s())) {
            if ((rect2.getBottom() <= rect.getBottom() && rect2.getTop() < rect.getBottom()) || rect2.getTop() <= rect.getTop()) {
                return false;
            }
        } else {
            if (!FocusDirection.m2209equalsimpl0(i10, companion.m2217getDowndhqQ8s())) {
                throw new IllegalStateException("This function should only be used for 2-D focus search".toString());
            }
            if ((rect2.getTop() >= rect.getTop() && rect2.getBottom() > rect.getTop()) || rect2.getBottom() >= rect.getBottom()) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: findChildCorrespondingToFocusEnter--OM-vw8, reason: not valid java name */
    public static final boolean m2239findChildCorrespondingToFocusEnterOMvw8(@NotNull FocusTargetNode findChildCorrespondingToFocusEnter, int i10, @NotNull Function1<? super FocusTargetNode, Boolean> onFound) {
        Rect rect;
        Intrinsics.checkNotNullParameter(findChildCorrespondingToFocusEnter, "$this$findChildCorrespondingToFocusEnter");
        Intrinsics.checkNotNullParameter(onFound, "onFound");
        MutableVector mutableVector = new MutableVector(new FocusTargetNode[16], 0);
        c(findChildCorrespondingToFocusEnter, mutableVector);
        if (mutableVector.getSize() <= 1) {
            FocusTargetNode focusTargetNode = (FocusTargetNode) (mutableVector.isEmpty() ? null : mutableVector.getContent()[0]);
            if (focusTargetNode != null) {
                return onFound.invoke(focusTargetNode).booleanValue();
            }
            return false;
        }
        FocusDirection.Companion companion = FocusDirection.INSTANCE;
        if (FocusDirection.m2209equalsimpl0(i10, companion.m2218getEnterdhqQ8s())) {
            i10 = companion.m2225getRightdhqQ8s();
        }
        if (FocusDirection.m2209equalsimpl0(i10, companion.m2225getRightdhqQ8s()) || FocusDirection.m2209equalsimpl0(i10, companion.m2217getDowndhqQ8s())) {
            Rect rectFocusRect = FocusTraversalKt.focusRect(findChildCorrespondingToFocusEnter);
            rect = new Rect(rectFocusRect.getLeft(), rectFocusRect.getTop(), rectFocusRect.getLeft(), rectFocusRect.getTop());
        } else {
            if (!FocusDirection.m2209equalsimpl0(i10, companion.m2221getLeftdhqQ8s()) && !FocusDirection.m2209equalsimpl0(i10, companion.m2226getUpdhqQ8s())) {
                throw new IllegalStateException("This function should only be used for 2-D focus search".toString());
            }
            Rect rectFocusRect2 = FocusTraversalKt.focusRect(findChildCorrespondingToFocusEnter);
            rect = new Rect(rectFocusRect2.getRight(), rectFocusRect2.getBottom(), rectFocusRect2.getRight(), rectFocusRect2.getBottom());
        }
        FocusTargetNode focusTargetNodeD = d(mutableVector, rect, i10);
        if (focusTargetNodeD != null) {
            return onFound.invoke(focusTargetNodeD).booleanValue();
        }
        return false;
    }

    public static final long g(int i10, Rect rect, Rect rect2) {
        float top;
        float bottom;
        float f6;
        float height;
        float top2;
        float height2;
        FocusDirection.Companion companion = FocusDirection.INSTANCE;
        if (FocusDirection.m2209equalsimpl0(i10, companion.m2221getLeftdhqQ8s())) {
            top = rect.getLeft();
            bottom = rect2.getRight();
        } else if (FocusDirection.m2209equalsimpl0(i10, companion.m2225getRightdhqQ8s())) {
            top = rect2.getLeft();
            bottom = rect.getRight();
        } else if (FocusDirection.m2209equalsimpl0(i10, companion.m2226getUpdhqQ8s())) {
            top = rect.getTop();
            bottom = rect2.getBottom();
        } else {
            if (!FocusDirection.m2209equalsimpl0(i10, companion.m2217getDowndhqQ8s())) {
                throw new IllegalStateException("This function should only be used for 2-D focus search".toString());
            }
            top = rect2.getTop();
            bottom = rect.getBottom();
        }
        long jAbs = (long) Math.abs(Math.max(0.0f, top - bottom));
        if (FocusDirection.m2209equalsimpl0(i10, companion.m2221getLeftdhqQ8s()) || FocusDirection.m2209equalsimpl0(i10, companion.m2225getRightdhqQ8s())) {
            f6 = 2;
            height = (rect.getHeight() / f6) + rect.getTop();
            top2 = rect2.getTop();
            height2 = rect2.getHeight();
        } else {
            if (!FocusDirection.m2209equalsimpl0(i10, companion.m2226getUpdhqQ8s()) && !FocusDirection.m2209equalsimpl0(i10, companion.m2217getDowndhqQ8s())) {
                throw new IllegalStateException("This function should only be used for 2-D focus search".toString());
            }
            f6 = 2;
            height = (rect.getWidth() / f6) + rect.getLeft();
            top2 = rect2.getLeft();
            height2 = rect2.getWidth();
        }
        long jAbs2 = (long) Math.abs(height - ((height2 / f6) + top2));
        return (jAbs2 * jAbs2) + (((long) 13) * jAbs * jAbs);
    }

    public static final boolean h(FocusTargetNode focusTargetNode, FocusTargetNode focusTargetNode2, int i10, Function1<? super FocusTargetNode, Boolean> function1) {
        FocusTargetNode focusTargetNodeD;
        MutableVector mutableVector = new MutableVector(new FocusTargetNode[16], 0);
        int iM3725constructorimpl = NodeKind.m3725constructorimpl(1024);
        if (!focusTargetNode.getNode().getIsAttached()) {
            throw new IllegalStateException("visitChildren called on an unattached node".toString());
        }
        MutableVector mutableVector2 = new MutableVector(new Modifier.Node[16], 0);
        Modifier.Node child = focusTargetNode.getNode().getChild();
        if (child == null) {
            DelegatableNodeKt.access$addLayoutNodeChildren(mutableVector2, focusTargetNode.getNode());
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
                                mutableVector.add((FocusTargetNode) nodeAccess$pop);
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
        while (mutableVector.isNotEmpty() && (focusTargetNodeD = d(mutableVector, FocusTraversalKt.focusRect(focusTargetNode2), i10)) != null) {
            if (focusTargetNodeD.fetchFocusProperties$ui_release().getCanFocus()) {
                return function1.invoke(focusTargetNodeD).booleanValue();
            }
            if (e(focusTargetNodeD, focusTargetNode2, i10, function1)) {
                return true;
            }
            mutableVector.remove(focusTargetNodeD);
        }
        return false;
    }

    @Nullable
    /* JADX INFO: renamed from: twoDimensionalFocusSearch--OM-vw8, reason: not valid java name */
    public static final Boolean m2240twoDimensionalFocusSearchOMvw8(@NotNull FocusTargetNode twoDimensionalFocusSearch, int i10, @NotNull Function1<? super FocusTargetNode, Boolean> onFound) {
        Intrinsics.checkNotNullParameter(twoDimensionalFocusSearch, "$this$twoDimensionalFocusSearch");
        Intrinsics.checkNotNullParameter(onFound, "onFound");
        FocusStateImpl focusState = twoDimensionalFocusSearch.getFocusState();
        int[] iArr = WhenMappings.$EnumSwitchMapping$0;
        int i11 = iArr[focusState.ordinal()];
        if (i11 != 1) {
            if (i11 == 2 || i11 == 3) {
                return Boolean.valueOf(m2239findChildCorrespondingToFocusEnterOMvw8(twoDimensionalFocusSearch, i10, onFound));
            }
            if (i11 == 4) {
                return twoDimensionalFocusSearch.fetchFocusProperties$ui_release().getCanFocus() ? onFound.invoke(twoDimensionalFocusSearch) : Boolean.FALSE;
            }
            throw new NoWhenBranchMatchedException();
        }
        FocusTargetNode activeChild = FocusTraversalKt.getActiveChild(twoDimensionalFocusSearch);
        if (activeChild == null) {
            throw new IllegalStateException("ActiveParent must have a focusedChild".toString());
        }
        int i12 = iArr[activeChild.getFocusState().ordinal()];
        if (i12 != 1) {
            if (i12 == 2 || i12 == 3) {
                return Boolean.valueOf(e(twoDimensionalFocusSearch, activeChild, i10, onFound));
            }
            if (i12 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            throw new IllegalStateException("ActiveParent must have a focusedChild".toString());
        }
        Boolean boolM2240twoDimensionalFocusSearchOMvw8 = m2240twoDimensionalFocusSearchOMvw8(activeChild, i10, onFound);
        if (!Intrinsics.areEqual(boolM2240twoDimensionalFocusSearchOMvw8, Boolean.FALSE)) {
            return boolM2240twoDimensionalFocusSearchOMvw8;
        }
        if (activeChild.getFocusState() != FocusStateImpl.ActiveParent) {
            throw new IllegalStateException("Check failed.".toString());
        }
        FocusTargetNode focusTargetNodeFindActiveFocusNode = FocusTraversalKt.findActiveFocusNode(activeChild);
        if (focusTargetNodeFindActiveFocusNode != null) {
            return Boolean.valueOf(e(twoDimensionalFocusSearch, focusTargetNodeFindActiveFocusNode, i10, onFound));
        }
        throw new IllegalStateException("ActiveParent must have a focusedChild".toString());
    }
}
