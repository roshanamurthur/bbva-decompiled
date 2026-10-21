package androidx.compose.ui.modifier;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.node.BackwardsCompatNode;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.Owner;
import java.util.HashSet;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: ModifierLocalManager.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0011\u001a\u00020\f¢\u0006\u0004\b\u0012\u0010\u0013J\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0004\u001a\u00020\u0002J\u001a\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u0007J\u001a\u0010\n\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u0007J\u001a\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u0007R\u0017\u0010\u0011\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0014"}, d2 = {"Landroidx/compose/ui/modifier/ModifierLocalManager;", "", "", "invalidate", "triggerUpdates", "Landroidx/compose/ui/node/BackwardsCompatNode;", "node", "Landroidx/compose/ui/modifier/ModifierLocal;", "key", "updatedProvider", "insertedProvider", "removedProvider", "Landroidx/compose/ui/node/Owner;", "a", "Landroidx/compose/ui/node/Owner;", "getOwner", "()Landroidx/compose/ui/node/Owner;", "owner", "<init>", "(Landroidx/compose/ui/node/Owner;)V", "ui_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nModifierLocalManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ModifierLocalManager.kt\nandroidx/compose/ui/modifier/ModifierLocalManager\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 6 DelegatableNode.kt\nandroidx/compose/ui/node/DelegatableNodeKt\n+ 7 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 8 Modifier.kt\nandroidx/compose/ui/Modifier$Node\n+ 9 DelegatingNode.kt\nandroidx/compose/ui/node/DelegatingNode\n*L\n1#1,121:1\n1182#2:122\n1161#2,2:123\n1182#2:125\n1161#2,2:126\n1182#2:128\n1161#2,2:129\n1182#2:131\n1161#2,2:132\n1182#2:165\n1161#2,2:166\n476#3,7:134\n523#3:141\n483#3,4:142\n476#3,7:146\n523#3:153\n483#3,4:154\n728#3,2:233\n728#3,2:235\n728#3,2:237\n728#3,2:239\n728#3,2:241\n728#3,2:243\n1855#4,2:158\n80#5:160\n289#6:161\n163#6:162\n164#6:164\n165#6,12:168\n290#6:180\n383#6,5:181\n291#6,2:186\n388#6:188\n393#6,2:190\n395#6,17:195\n412#6,8:215\n293#6:223\n177#6,8:224\n294#6:232\n1#7:163\n261#8:189\n234#9,3:192\n237#9,3:212\n*S KotlinDebug\n*F\n+ 1 ModifierLocalManager.kt\nandroidx/compose/ui/modifier/ModifierLocalManager\n*L\n44#1:122\n44#1:123,2\n45#1:125\n45#1:126,2\n46#1:128\n46#1:129,2\n47#1:131\n47#1:132,2\n93#1:165\n93#1:166,2\n64#1:134,7\n65#1:141\n64#1:142,4\n77#1:146,7\n78#1:153\n77#1:154,4\n105#1:233,2\n106#1:235,2\n111#1:237,2\n112#1:239,2\n117#1:241,2\n118#1:243,2\n85#1:158,2\n93#1:160\n93#1:161\n93#1:162\n93#1:164\n93#1:168,12\n93#1:180\n93#1:181,5\n93#1:186,2\n93#1:188\n93#1:190,2\n93#1:195,17\n93#1:215,8\n93#1:223\n93#1:224,8\n93#1:232\n93#1:163\n93#1:189\n93#1:192,3\n93#1:212,3\n*E\n"})
public final class ModifierLocalManager {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Owner owner;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final MutableVector<BackwardsCompatNode> f16716b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final MutableVector<ModifierLocal<?>> f16717c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final MutableVector<LayoutNode> f16718d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final MutableVector<ModifierLocal<?>> f16719e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f16720f;

    /* JADX INFO: compiled from: ModifierLocalManager.kt */
    public static final class a extends Lambda implements Function0<Unit> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            ModifierLocalManager.this.triggerUpdates();
            return Unit.INSTANCE;
        }
    }

    public ModifierLocalManager(@NotNull Owner owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        this.owner = owner;
        this.f16716b = new MutableVector<>(new BackwardsCompatNode[16], 0);
        this.f16717c = new MutableVector<>(new ModifierLocal[16], 0);
        this.f16718d = new MutableVector<>(new LayoutNode[16], 0);
        this.f16719e = new MutableVector<>(new ModifierLocal[16], 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v9 */
    /*  JADX ERROR: NullPointerException in pass: PrepareForCodeGen
        java.lang.NullPointerException
        */
    public static void a(androidx.compose.ui.Modifier.Node r12, androidx.compose.ui.modifier.ModifierLocal r13, java.util.HashSet r14) {
        /*
            Method dump skipped, instruction units count: 218
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.modifier.ModifierLocalManager.a(androidx.compose.ui.Modifier$Node, androidx.compose.ui.modifier.ModifierLocal, java.util.HashSet):void");
    }

    @NotNull
    public final Owner getOwner() {
        return this.owner;
    }

    public final void insertedProvider(@NotNull BackwardsCompatNode node, @NotNull ModifierLocal<?> key) {
        Intrinsics.checkNotNullParameter(node, "node");
        Intrinsics.checkNotNullParameter(key, "key");
        this.f16716b.add(node);
        this.f16717c.add(key);
        invalidate();
    }

    public final void invalidate() {
        if (this.f16720f) {
            return;
        }
        this.f16720f = true;
        this.owner.registerOnEndApplyChangesListener(new a());
    }

    public final void removedProvider(@NotNull BackwardsCompatNode node, @NotNull ModifierLocal<?> key) {
        Intrinsics.checkNotNullParameter(node, "node");
        Intrinsics.checkNotNullParameter(key, "key");
        this.f16718d.add(DelegatableNodeKt.requireLayoutNode(node));
        this.f16719e.add(key);
        invalidate();
    }

    public final void triggerUpdates() {
        int i10 = 0;
        this.f16720f = false;
        HashSet hashSet = new HashSet();
        MutableVector<LayoutNode> mutableVector = this.f16718d;
        int size = mutableVector.getSize();
        MutableVector<ModifierLocal<?>> mutableVector2 = this.f16719e;
        if (size > 0) {
            LayoutNode[] content = mutableVector.getContent();
            int i11 = 0;
            do {
                LayoutNode layoutNode = content[i11];
                ModifierLocal<?> modifierLocal = mutableVector2.getContent()[i11];
                if (layoutNode.getNodes().getCom.bbva.networkplugin.command.impl.HeadCommand.ID java.lang.String().getIsAttached()) {
                    a(layoutNode.getNodes().getCom.bbva.networkplugin.command.impl.HeadCommand.ID java.lang.String(), modifierLocal, hashSet);
                }
                i11++;
            } while (i11 < size);
        }
        mutableVector.clear();
        mutableVector2.clear();
        MutableVector<BackwardsCompatNode> mutableVector3 = this.f16716b;
        int size2 = mutableVector3.getSize();
        MutableVector<ModifierLocal<?>> mutableVector4 = this.f16717c;
        if (size2 > 0) {
            BackwardsCompatNode[] content2 = mutableVector3.getContent();
            do {
                BackwardsCompatNode backwardsCompatNode = content2[i10];
                ModifierLocal<?> modifierLocal2 = mutableVector4.getContent()[i10];
                if (backwardsCompatNode.getIsAttached()) {
                    a(backwardsCompatNode, modifierLocal2, hashSet);
                }
                i10++;
            } while (i10 < size2);
        }
        mutableVector3.clear();
        mutableVector4.clear();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((BackwardsCompatNode) it.next()).updateModifierLocalConsumer();
        }
    }

    public final void updatedProvider(@NotNull BackwardsCompatNode node, @NotNull ModifierLocal<?> key) {
        Intrinsics.checkNotNullParameter(node, "node");
        Intrinsics.checkNotNullParameter(key, "key");
        this.f16716b.add(node);
        this.f16717c.add(key);
        invalidate();
    }
}
