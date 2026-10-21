package androidx.compose.ui.input.pointer;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutCoordinates;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: HitPathTracker.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u001a\u001a\u00020\u0015¢\u0006\u0004\b!\u0010\"J7\u0010\f\u001a\u00020\n2\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016ø\u0001\u0000J\u0010\u0010\r\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016J7\u0010\u000e\u001a\u00020\n2\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016ø\u0001\u0000J\b\u0010\u0010\u001a\u00020\u000fH\u0016J\u0006\u0010\u0011\u001a\u00020\u000fJ\u0010\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\bH\u0016J\b\u0010\u0014\u001a\u00020\u0013H\u0016R\u0017\u0010\u001a\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R \u0010 \u001a\b\u0012\u0004\u0012\u00020\u00030\u001b8\u0006ø\u0001\u0000¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006#"}, d2 = {"Landroidx/compose/ui/input/pointer/Node;", "Landroidx/compose/ui/input/pointer/NodeParent;", "", "Landroidx/compose/ui/input/pointer/PointerId;", "Landroidx/compose/ui/input/pointer/PointerInputChange;", "changes", "Landroidx/compose/ui/layout/LayoutCoordinates;", "parentCoordinates", "Landroidx/compose/ui/input/pointer/InternalPointerEvent;", "internalPointerEvent", "", "isInBounds", "dispatchMainEventPass", "dispatchFinalEventPass", "buildCache", "", "dispatchCancel", "markIsIn", "cleanUpHits", "", "toString", "Landroidx/compose/ui/Modifier$Node;", "b", "Landroidx/compose/ui/Modifier$Node;", "getModifierNode", "()Landroidx/compose/ui/Modifier$Node;", "modifierNode", "Landroidx/compose/runtime/collection/MutableVector;", "c", "Landroidx/compose/runtime/collection/MutableVector;", "getPointerIds", "()Landroidx/compose/runtime/collection/MutableVector;", "pointerIds", "<init>", "(Landroidx/compose/ui/Modifier$Node;)V", "ui_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nHitPathTracker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HitPathTracker.kt\nandroidx/compose/ui/input/pointer/Node\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 4 DelegatableNode.kt\nandroidx/compose/ui/node/DelegatableNodeKt\n+ 5 Modifier.kt\nandroidx/compose/ui/Modifier$Node\n+ 6 DelegatingNode.kt\nandroidx/compose/ui/node/DelegatingNode\n+ 7 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 8 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,557:1\n503#1,5:561\n510#1:665\n503#1,5:666\n510#1:726\n1182#2:558\n1161#2,2:559\n1182#2:587\n1161#2,2:588\n1182#2:642\n1161#2,2:643\n1182#2:692\n1161#2,2:693\n1182#2:748\n1161#2,2:749\n1182#2:822\n1161#2,2:823\n78#3:566\n78#3:621\n78#3:671\n78#3:727\n78#3:801\n383#4,6:567\n393#4,2:574\n395#4,8:579\n403#4,9:590\n412#4,8:602\n383#4,6:622\n393#4,2:629\n395#4,8:634\n403#4,9:645\n412#4,8:657\n383#4,6:672\n393#4,2:679\n395#4,8:684\n403#4,9:695\n412#4,8:707\n383#4,6:728\n393#4,2:735\n395#4,8:740\n403#4,9:751\n412#4,8:763\n383#4,6:802\n393#4,2:809\n395#4,8:814\n403#4,9:825\n412#4,8:837\n261#5:573\n261#5:628\n261#5:678\n261#5:734\n261#5:808\n234#6,3:576\n237#6,3:599\n234#6,3:631\n237#6,3:654\n234#6,3:681\n237#6,3:704\n234#6,3:737\n237#6,3:760\n234#6,3:811\n237#6,3:834\n460#7,11:610\n460#7,11:715\n48#7:771\n523#7:772\n48#7:779\n523#7:780\n460#7,11:790\n33#8,6:773\n116#8,2:781\n33#8,6:783\n118#8:789\n33#8,6:845\n*S KotlinDebug\n*F\n+ 1 HitPathTracker.kt\nandroidx/compose/ui/input/pointer/Node\n*L\n292#1:561,5\n292#1:665\n330#1:666,5\n330#1:726\n263#1:558\n263#1:559,2\n296#1:587\n296#1:588,2\n316#1:642\n316#1:643,2\n334#1:692\n334#1:693,2\n373#1:748\n373#1:749,2\n522#1:822\n522#1:823,2\n296#1:566\n316#1:621\n334#1:671\n373#1:727\n522#1:801\n296#1:567,6\n296#1:574,2\n296#1:579,8\n296#1:590,9\n296#1:602,8\n316#1:622,6\n316#1:629,2\n316#1:634,8\n316#1:645,9\n316#1:657,8\n334#1:672,6\n334#1:679,2\n334#1:684,8\n334#1:695,9\n334#1:707,8\n373#1:728,6\n373#1:735,2\n373#1:740,8\n373#1:751,9\n373#1:763,8\n522#1:802,6\n522#1:809,2\n522#1:814,8\n522#1:825,9\n522#1:837,8\n296#1:573\n316#1:628\n334#1:678\n373#1:734\n522#1:808\n296#1:576,3\n296#1:599,3\n316#1:631,3\n316#1:654,3\n334#1:681,3\n334#1:704,3\n373#1:737,3\n373#1:760,3\n522#1:811,3\n522#1:834,3\n302#1:610,11\n340#1:715,11\n383#1:771\n384#1:772\n424#1:779\n425#1:780\n521#1:790,11\n394#1:773,6\n432#1:781,2\n432#1:783,6\n432#1:789\n538#1:845,6\n*E\n"})
public final class Node extends NodeParent {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Modifier.Node modifierNode;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final MutableVector<PointerId> pointerIds;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final LinkedHashMap f16367d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public LayoutCoordinates f16368e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public PointerEvent f16369f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f16370g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f16371h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f16372i;

    public Node(@NotNull Modifier.Node modifierNode) {
        Intrinsics.checkNotNullParameter(modifierNode, "modifierNode");
        this.modifierNode = modifierNode;
        this.pointerIds = new MutableVector<>(new PointerId[16], 0);
        this.f16367d = new LinkedHashMap();
        this.f16371h = true;
        this.f16372i = true;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0268  */
    /* JADX WARN: Code duplicated, block: B:80:0x01fd  */
    /* JADX WARN: Code duplicated, block: B:88:0x022d  */
    /* JADX WARN: Code duplicated, block: B:89:0x0232  */
    /* JADX WARN: Code duplicated, block: B:91:0x023a  */
    /* JADX WARN: Code duplicated, block: B:93:0x024a  */
    /* JADX WARN: Code duplicated, block: B:98:0x025a  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v7 */
    /* JADX WARN: Type inference failed for: r5v0, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r5v1, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r5v28 */
    /* JADX WARN: Type inference failed for: r5v29, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r5v30, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v31 */
    /* JADX WARN: Type inference failed for: r5v32 */
    /* JADX WARN: Type inference failed for: r5v33 */
    /* JADX WARN: Type inference failed for: r5v34 */
    /* JADX WARN: Type inference failed for: r5v35 */
    /* JADX WARN: Type inference failed for: r5v36 */
    /* JADX WARN: Type inference failed for: r6v20 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6, types: [int] */
    /*  JADX ERROR: NullPointerException in pass: PrepareForCodeGen
        java.lang.NullPointerException
        */
    @Override // androidx.compose.ui.input.pointer.NodeParent
    public boolean buildCache(@org.jetbrains.annotations.NotNull java.util.Map<androidx.compose.ui.input.pointer.PointerId, androidx.compose.ui.input.pointer.PointerInputChange> r36, @org.jetbrains.annotations.NotNull androidx.compose.ui.layout.LayoutCoordinates r37, @org.jetbrains.annotations.NotNull androidx.compose.ui.input.pointer.InternalPointerEvent r38, boolean r39) {
        /*
            Method dump skipped, instruction units count: 732
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.input.pointer.Node.buildCache(java.util.Map, androidx.compose.ui.layout.LayoutCoordinates, androidx.compose.ui.input.pointer.InternalPointerEvent, boolean):boolean");
    }

    @Override // androidx.compose.ui.input.pointer.NodeParent
    public void cleanUpHits(@NotNull InternalPointerEvent internalPointerEvent) {
        Intrinsics.checkNotNullParameter(internalPointerEvent, "internalPointerEvent");
        super.cleanUpHits(internalPointerEvent);
        PointerEvent pointerEvent = this.f16369f;
        if (pointerEvent == null) {
            return;
        }
        this.f16370g = this.f16371h;
        List<PointerInputChange> changes = pointerEvent.getChanges();
        int size = changes.size();
        for (int i10 = 0; i10 < size; i10++) {
            PointerInputChange pointerInputChange = changes.get(i10);
            if (!pointerInputChange.getPressed() && (!internalPointerEvent.m3412issuesEnterExitEvent0FcD4WY(pointerInputChange.getId()) || !this.f16371h)) {
                this.pointerIds.remove(PointerId.m3458boximpl(pointerInputChange.getId()));
            }
        }
        this.f16371h = false;
        this.f16372i = PointerEventType.m3428equalsimpl0(pointerEvent.getType(), PointerEventType.INSTANCE.m3433getExit7fucELk());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v6 */
    /*  JADX ERROR: NullPointerException in pass: PrepareForCodeGen
        java.lang.NullPointerException
        */
    @Override // androidx.compose.ui.input.pointer.NodeParent
    public void dispatchCancel() {
        /*
            r10 = this;
            androidx.compose.runtime.collection.MutableVector r0 = r10.getChildren()
            int r1 = r0.getSize()
            r2 = 0
            r3 = 1
            if (r1 <= 0) goto L1b
            java.lang.Object[] r0 = r0.getContent()
            r4 = r2
        L11:
            r5 = r0[r4]
            androidx.compose.ui.input.pointer.Node r5 = (androidx.compose.ui.input.pointer.Node) r5
            r5.dispatchCancel()
            int r4 = r4 + r3
            if (r4 < r1) goto L11
        L1b:
            r0 = 16
            int r1 = androidx.compose.ui.node.NodeKind.m3725constructorimpl(r0)
            r4 = 0
            androidx.compose.ui.Modifier$Node r5 = r10.modifierNode
            r6 = r4
        L25:
            if (r5 == 0) goto L72
            boolean r7 = r5 instanceof androidx.compose.ui.node.PointerInputModifierNode
            if (r7 == 0) goto L31
            androidx.compose.ui.node.PointerInputModifierNode r5 = (androidx.compose.ui.node.PointerInputModifierNode) r5
            r5.onCancelPointerInput()
            goto L6d
        L31:
            int r7 = r5.getKindSet()
            r7 = r7 & r1
            if (r7 == 0) goto L6d
            boolean r7 = r5 instanceof androidx.compose.ui.node.DelegatingNode
            if (r7 == 0) goto L6d
            r7 = r5
            androidx.compose.ui.node.DelegatingNode r7 = (androidx.compose.ui.node.DelegatingNode) r7
            androidx.compose.ui.Modifier$Node r7 = r7.getDelegate()
            r8 = r2
        L44:
            if (r7 == 0) goto L6a
            int r9 = r7.getKindSet()
            r9 = r9 & r1
            if (r9 == 0) goto L65
            int r8 = r8 + 1
            if (r8 != r3) goto L53
            r5 = r7
            goto L65
        L53:
            if (r6 != 0) goto L5c
            androidx.compose.runtime.collection.MutableVector r6 = new androidx.compose.runtime.collection.MutableVector
            androidx.compose.ui.Modifier$Node[] r9 = new androidx.compose.ui.Modifier.Node[r0]
            r6.<init>(r9, r2)
        L5c:
            if (r5 == 0) goto L62
            r6.add(r5)
            r5 = r4
        L62:
            r6.add(r7)
        L65:
            androidx.compose.ui.Modifier$Node r7 = r7.getChild()
            goto L44
        L6a:
            if (r8 != r3) goto L6d
            goto L25
        L6d:
            androidx.compose.ui.Modifier$Node r5 = androidx.compose.ui.node.DelegatableNodeKt.access$pop(r6)
            goto L25
        L72:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.input.pointer.Node.dispatchCancel():void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v6 */
    /*  JADX ERROR: NullPointerException in pass: PrepareForCodeGen
        java.lang.NullPointerException
        */
    @Override // androidx.compose.ui.input.pointer.NodeParent
    public boolean dispatchFinalEventPass(@org.jetbrains.annotations.NotNull androidx.compose.ui.input.pointer.InternalPointerEvent r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            java.lang.String r2 = "internalPointerEvent"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r2)
            java.util.LinkedHashMap r2 = r0.f16367d
            boolean r3 = r2.isEmpty()
            r5 = 0
            if (r3 == 0) goto L14
            goto La4
        L14:
            androidx.compose.ui.Modifier$Node r3 = r0.modifierNode
            boolean r6 = r3.getIsAttached()
            if (r6 != 0) goto L1e
            goto La4
        L1e:
            androidx.compose.ui.input.pointer.PointerEvent r6 = r0.f16369f
            kotlin.jvm.internal.Intrinsics.checkNotNull(r6)
            androidx.compose.ui.layout.LayoutCoordinates r7 = r0.f16368e
            kotlin.jvm.internal.Intrinsics.checkNotNull(r7)
            long r7 = r7.mo3581getSizeYbymL2g()
            r9 = 16
            int r10 = androidx.compose.ui.node.NodeKind.m3725constructorimpl(r9)
            r11 = r3
            r12 = 0
        L34:
            r13 = 1
            if (r11 == 0) goto L85
            boolean r14 = r11 instanceof androidx.compose.ui.node.PointerInputModifierNode
            if (r14 == 0) goto L43
            androidx.compose.ui.node.PointerInputModifierNode r11 = (androidx.compose.ui.node.PointerInputModifierNode) r11
            androidx.compose.ui.input.pointer.PointerEventPass r13 = androidx.compose.ui.input.pointer.PointerEventPass.Final
            r11.mo115onPointerEventH0pRuoY(r6, r13, r7)
            goto L80
        L43:
            int r14 = r11.getKindSet()
            r14 = r14 & r10
            if (r14 == 0) goto L80
            boolean r14 = r11 instanceof androidx.compose.ui.node.DelegatingNode
            if (r14 == 0) goto L80
            r14 = r11
            androidx.compose.ui.node.DelegatingNode r14 = (androidx.compose.ui.node.DelegatingNode) r14
            androidx.compose.ui.Modifier$Node r14 = r14.getDelegate()
            r15 = r5
        L56:
            if (r14 == 0) goto L7d
            int r16 = r14.getKindSet()
            r16 = r16 & r10
            if (r16 == 0) goto L78
            int r15 = r15 + 1
            if (r15 != r13) goto L66
            r11 = r14
            goto L78
        L66:
            if (r12 != 0) goto L6f
            androidx.compose.runtime.collection.MutableVector r12 = new androidx.compose.runtime.collection.MutableVector
            androidx.compose.ui.Modifier$Node[] r4 = new androidx.compose.ui.Modifier.Node[r9]
            r12.<init>(r4, r5)
        L6f:
            if (r11 == 0) goto L75
            r12.add(r11)
            r11 = 0
        L75:
            r12.add(r14)
        L78:
            androidx.compose.ui.Modifier$Node r14 = r14.getChild()
            goto L56
        L7d:
            if (r15 != r13) goto L80
            goto L34
        L80:
            androidx.compose.ui.Modifier$Node r11 = androidx.compose.ui.node.DelegatableNodeKt.access$pop(r12)
            goto L34
        L85:
            boolean r3 = r3.getIsAttached()
            if (r3 == 0) goto La3
            androidx.compose.runtime.collection.MutableVector r3 = r17.getChildren()
            int r4 = r3.getSize()
            if (r4 <= 0) goto La3
            java.lang.Object[] r3 = r3.getContent()
        L99:
            r6 = r3[r5]
            androidx.compose.ui.input.pointer.Node r6 = (androidx.compose.ui.input.pointer.Node) r6
            r6.dispatchFinalEventPass(r1)
            int r5 = r5 + r13
            if (r5 < r4) goto L99
        La3:
            r5 = r13
        La4:
            r17.cleanUpHits(r18)
            r2.clear()
            r1 = 0
            r0.f16368e = r1
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.input.pointer.Node.dispatchFinalEventPass(androidx.compose.ui.input.pointer.InternalPointerEvent):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v12 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /*  JADX ERROR: NullPointerException in pass: PrepareForCodeGen
        java.lang.NullPointerException
        */
    @Override // androidx.compose.ui.input.pointer.NodeParent
    public boolean dispatchMainEventPass(@org.jetbrains.annotations.NotNull java.util.Map<androidx.compose.ui.input.pointer.PointerId, androidx.compose.ui.input.pointer.PointerInputChange> r18, @org.jetbrains.annotations.NotNull androidx.compose.ui.layout.LayoutCoordinates r19, @org.jetbrains.annotations.NotNull androidx.compose.ui.input.pointer.InternalPointerEvent r20, boolean r21) {
        /*
            Method dump skipped, instruction units count: 277
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.input.pointer.Node.dispatchMainEventPass(java.util.Map, androidx.compose.ui.layout.LayoutCoordinates, androidx.compose.ui.input.pointer.InternalPointerEvent, boolean):boolean");
    }

    @NotNull
    public final Modifier.Node getModifierNode() {
        return this.modifierNode;
    }

    @NotNull
    public final MutableVector<PointerId> getPointerIds() {
        return this.pointerIds;
    }

    public final void markIsIn() {
        this.f16371h = true;
    }

    @NotNull
    public String toString() {
        return "Node(pointerInputFilter=" + this.modifierNode + ", children=" + getChildren() + ", pointerIds=" + this.pointerIds + RootService.CLOSE_BRACKET;
    }
}
