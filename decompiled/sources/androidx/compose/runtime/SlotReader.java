package androidx.compose.runtime;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.bbva.glomohybrid.cellsweb.presentation.verishow.constants.HearingDisabilitiesConstants;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: SlotTable.kt */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b4\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010-\u001a\u00020(¢\u0006\u0004\bZ\u0010[J\u000e\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002J\u0010\u0010\b\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\t\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\n\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\f\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0002J\u0010\u0010\r\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0002J\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000fJ\u000e\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002J\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0002J\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0002J\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002J\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001J\u0006\u0010\u0019\u001a\u00020\u0018J\u0006\u0010\u001a\u001a\u00020\u0018J\u0006\u0010\u001b\u001a\u00020\u0018J\u0006\u0010\u001c\u001a\u00020\u0018J\u0006\u0010\u001d\u001a\u00020\u0018J\u0006\u0010\u001e\u001a\u00020\u0002J\u0006\u0010\u001f\u001a\u00020\u0018J\u000e\u0010 \u001a\u00020\u00182\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010!\u001a\u00020\u00182\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\"\u001a\u00020\u0018J\f\u0010%\u001a\b\u0012\u0004\u0012\u00020$0#J\b\u0010'\u001a\u00020&H\u0016J\u0010\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0003\u001a\u00020\u0002R\u001a\u0010-\u001a\u00020(8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R$\u00103\u001a\u00020\u00052\u0006\u0010.\u001a\u00020\u00058\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R$\u00108\u001a\u00020\u00022\u0006\u0010.\u001a\u00020\u00028\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107R$\u0010;\u001a\u00020\u00022\u0006\u0010.\u001a\u00020\u00028\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b9\u00105\u001a\u0004\b:\u00107R$\u0010\u0004\u001a\u00020\u00022\u0006\u0010.\u001a\u00020\u00028\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b<\u00105\u001a\u0004\b=\u00107R$\u0010@\u001a\u00020\u00052\u0006\u0010.\u001a\u00020\u00058\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b>\u00100\u001a\u0004\b?\u00102R\u0011\u0010B\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\bA\u00107R\u0011\u0010D\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\bC\u00107R\u0011\u0010\u0006\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u0006\u00102R\u0011\u0010\u0007\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\bE\u00107R\u0011\u0010F\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\bF\u00102R\u0011\u0010H\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\bG\u00102R\u0011\u0010\t\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\bI\u00107R\u0011\u0010\n\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\bJ\u00107R\u0011\u0010\u000b\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\bK\u00107R\u0011\u0010M\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\bL\u00107R\u0011\u0010\f\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\bN\u00102R\u0013\u0010\r\u001a\u0004\u0018\u00010\u00018F¢\u0006\u0006\u001a\u0004\bO\u0010PR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u00018F¢\u0006\u0006\u001a\u0004\bQ\u0010PR\u0013\u0010S\u001a\u0004\u0018\u00010\u00018F¢\u0006\u0006\u001a\u0004\bR\u0010PR\u0011\u0010U\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\bT\u00107R\u0011\u0010W\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\bV\u00107R\u0011\u0010Y\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\bX\u00107¨\u0006\\"}, d2 = {"Landroidx/compose/runtime/SlotReader;", "", "", FirebaseAnalytics.Param.INDEX, "parent", "", "isNode", "nodeCount", "node", "groupSize", "groupEnd", "groupKey", "hasObjectKey", "groupObjectKey", "groupAux", "Landroidx/compose/runtime/Anchor;", "anchor", "hasMark", "containsMark", "parentOf", "get", "groupGet", "group", "next", "", "beginEmpty", "endEmpty", HearingDisabilitiesConstants.CLOSE_MODAL, "startGroup", "startNode", "skipGroup", "skipToGroupEnd", "reposition", "restoreParent", "endGroup", "", "Landroidx/compose/runtime/KeyInfo;", "extractKeys", "", "toString", "Landroidx/compose/runtime/SlotTable;", "a", "Landroidx/compose/runtime/SlotTable;", "getTable$runtime_release", "()Landroidx/compose/runtime/SlotTable;", "table", "<set-?>", "f", "Z", "getClosed", "()Z", "closed", "g", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getCurrentGroup", "()I", "currentGroup", "h", "getCurrentEnd", "currentEnd", "i", "getParent", "n", "getHadNext", "hadNext", "getSize", "size", "getSlot", "slot", "getNodeCount", "isGroupEnd", "getInEmpty", "inEmpty", "getGroupSize", "getGroupEnd", "getGroupKey", "getGroupSlotIndex", "groupSlotIndex", "getHasObjectKey", "getGroupObjectKey", "()Ljava/lang/Object;", "getGroupAux", "getGroupNode", "groupNode", "getParentNodes", "parentNodes", "getRemainingSlots", "remainingSlots", "getGroupSlotCount", "groupSlotCount", "<init>", "(Landroidx/compose/runtime/SlotTable;)V", "runtime_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nSlotTable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SlotTable.kt\nandroidx/compose/runtime/SlotReader\n+ 2 Preconditions.kt\nandroidx/compose/runtime/PreconditionsKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 SlotTable.kt\nandroidx/compose/runtime/SlotTableKt\n*L\n1#1,4151:1\n33#2,7:4152\n33#2,7:4159\n33#2,7:4166\n33#2,7:4173\n4553#3,7:4180\n4553#3,7:4187\n4553#3,7:4194\n4553#3,7:4201\n4553#3,7:4208\n4018#4,6:4215\n*S KotlinDebug\n*F\n+ 1 SlotTable.kt\nandroidx/compose/runtime/SlotReader\n*L\n1078#1:4152,7\n1149#1:4159,7\n1169#1:4166,7\n1196#1:4173,7\n1205#1:4180,7\n1215#1:4187,7\n1225#1:4194,7\n1244#1:4201,7\n1258#1:4208,7\n1311#1:4215,6\n*E\n"})
public final class SlotReader {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final SlotTable table;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final int[] f14738b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f14739c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final Object[] f14740d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f14741e;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    public boolean closed;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    public int currentGroup;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    public int currentEnd;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    public int parent;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final IntStack f14746j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f14747k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f14748l;
    public int m;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    public boolean hadNext;

    public SlotReader(@NotNull SlotTable slotTable) {
        this.table = slotTable;
        this.f14738b = slotTable.getGroups();
        int groupsSize = slotTable.getGroupsSize();
        this.f14739c = groupsSize;
        this.f14740d = slotTable.getSlots();
        this.f14741e = slotTable.getSlotsSize();
        this.currentEnd = groupsSize;
        this.parent = -1;
        this.f14746j = new IntStack();
    }

    public static /* synthetic */ Anchor anchor$default(SlotReader slotReader, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = slotReader.currentGroup;
        }
        return slotReader.anchor(i10);
    }

    @NotNull
    public final Anchor anchor(int index) {
        ArrayList<Anchor> anchors$runtime_release = this.table.getAnchors$runtime_release();
        int iB = SlotTableKt.b(anchors$runtime_release, index, this.f14739c);
        if (iB >= 0) {
            return anchors$runtime_release.get(iB);
        }
        Anchor anchor = new Anchor(index);
        anchors$runtime_release.add(-(iB + 1), anchor);
        return anchor;
    }

    public final void beginEmpty() {
        this.f14747k++;
    }

    public final void close() {
        this.closed = true;
        this.table.close$runtime_release(this, null);
    }

    public final boolean containsMark(int index) {
        return SlotTableKt.access$containsMark(this.f14738b, index);
    }

    public final void endEmpty() {
        if (!(this.f14747k > 0)) {
            PreconditionsKt.throwIllegalArgumentException("Unbalanced begin/end empty");
        }
        this.f14747k--;
    }

    public final void endGroup() {
        if (this.f14747k == 0) {
            if (!(this.currentGroup == this.currentEnd)) {
                ComposerKt.composeImmediateRuntimeError("endGroup() not called at the end of a group");
            }
            int i10 = this.parent;
            int[] iArr = this.f14738b;
            int iAccess$parentAnchor = SlotTableKt.access$parentAnchor(iArr, i10);
            this.parent = iAccess$parentAnchor;
            int i11 = this.f14739c;
            this.currentEnd = iAccess$parentAnchor < 0 ? i11 : SlotTableKt.access$groupSize(iArr, iAccess$parentAnchor) + iAccess$parentAnchor;
            int iPop = this.f14746j.pop();
            if (iPop < 0) {
                this.f14748l = 0;
                this.m = 0;
            } else {
                this.f14748l = iPop;
                this.m = iAccess$parentAnchor >= i11 - 1 ? this.f14741e : SlotTableKt.access$dataAnchor(iArr, iAccess$parentAnchor + 1);
            }
        }
    }

    @NotNull
    public final List<KeyInfo> extractKeys() {
        ArrayList arrayList = new ArrayList();
        if (this.f14747k > 0) {
            return arrayList;
        }
        int iAccess$groupSize = this.currentGroup;
        int i10 = 0;
        while (iAccess$groupSize < this.currentEnd) {
            int[] iArr = this.f14738b;
            arrayList.add(new KeyInfo(SlotTableKt.access$key(iArr, iAccess$groupSize), SlotTableKt.access$hasObjectKey(iArr, iAccess$groupSize) ? this.f14740d[SlotTableKt.access$objectKeyIndex(iArr, iAccess$groupSize)] : null, iAccess$groupSize, SlotTableKt.access$isNode(iArr, iAccess$groupSize) ? 1 : SlotTableKt.access$nodeCount(iArr, iAccess$groupSize), i10));
            iAccess$groupSize += SlotTableKt.access$groupSize(iArr, iAccess$groupSize);
            i10++;
        }
        return arrayList;
    }

    @Nullable
    public final Object get(int index) {
        int i10 = this.f14748l + index;
        return i10 < this.m ? this.f14740d[i10] : Composer.INSTANCE.getEmpty();
    }

    public final boolean getClosed() {
        return this.closed;
    }

    public final int getCurrentEnd() {
        return this.currentEnd;
    }

    public final int getCurrentGroup() {
        return this.currentGroup;
    }

    @Nullable
    public final Object getGroupAux() {
        int i10 = this.currentGroup;
        if (i10 >= this.currentEnd) {
            return 0;
        }
        int[] iArr = this.f14738b;
        return SlotTableKt.access$hasAux(iArr, i10) ? this.f14740d[SlotTableKt.access$auxIndex(iArr, i10)] : Composer.INSTANCE.getEmpty();
    }

    public final int getGroupEnd() {
        return this.currentEnd;
    }

    public final int getGroupKey() {
        int i10 = this.currentGroup;
        if (i10 < this.currentEnd) {
            return SlotTableKt.access$key(this.f14738b, i10);
        }
        return 0;
    }

    @Nullable
    public final Object getGroupNode() {
        int i10 = this.currentGroup;
        if (i10 >= this.currentEnd) {
            return null;
        }
        int[] iArr = this.f14738b;
        return SlotTableKt.access$isNode(iArr, i10) ? this.f14740d[SlotTableKt.access$nodeIndex(iArr, i10)] : Composer.INSTANCE.getEmpty();
    }

    @Nullable
    public final Object getGroupObjectKey() {
        int i10 = this.currentGroup;
        if (i10 >= this.currentEnd) {
            return null;
        }
        int[] iArr = this.f14738b;
        if (SlotTableKt.access$hasObjectKey(iArr, i10)) {
            return this.f14740d[SlotTableKt.access$objectKeyIndex(iArr, i10)];
        }
        return null;
    }

    public final int getGroupSize() {
        return SlotTableKt.access$groupSize(this.f14738b, this.currentGroup);
    }

    public final int getGroupSlotCount() {
        int i10 = this.currentGroup;
        int[] iArr = this.f14738b;
        int iAccess$slotAnchor = SlotTableKt.access$slotAnchor(iArr, i10);
        int i11 = i10 + 1;
        return (i11 < this.f14739c ? SlotTableKt.access$dataAnchor(iArr, i11) : this.f14741e) - iAccess$slotAnchor;
    }

    public final int getGroupSlotIndex() {
        return this.f14748l - SlotTableKt.access$slotAnchor(this.f14738b, this.parent);
    }

    public final boolean getHadNext() {
        return this.hadNext;
    }

    public final boolean getHasObjectKey() {
        int i10 = this.currentGroup;
        return i10 < this.currentEnd && SlotTableKt.access$hasObjectKey(this.f14738b, i10);
    }

    public final boolean getInEmpty() {
        return this.f14747k > 0;
    }

    public final int getNodeCount() {
        return SlotTableKt.access$nodeCount(this.f14738b, this.currentGroup);
    }

    public final int getParent() {
        return this.parent;
    }

    public final int getParentNodes() {
        int i10 = this.parent;
        if (i10 >= 0) {
            return SlotTableKt.access$nodeCount(this.f14738b, i10);
        }
        return 0;
    }

    public final int getRemainingSlots() {
        return this.m - this.f14748l;
    }

    /* JADX INFO: renamed from: getSize, reason: from getter */
    public final int getF14739c() {
        return this.f14739c;
    }

    public final int getSlot() {
        return this.f14748l - SlotTableKt.access$slotAnchor(this.f14738b, this.parent);
    }

    @NotNull
    /* JADX INFO: renamed from: getTable$runtime_release, reason: from getter */
    public final SlotTable getTable() {
        return this.table;
    }

    @Nullable
    public final Object groupAux(int index) {
        int[] iArr = this.f14738b;
        return SlotTableKt.access$hasAux(iArr, index) ? this.f14740d[SlotTableKt.access$auxIndex(iArr, index)] : Composer.INSTANCE.getEmpty();
    }

    public final int groupEnd(int index) {
        return SlotTableKt.access$groupSize(this.f14738b, index) + index;
    }

    @Nullable
    public final Object groupGet(int index) {
        return groupGet(this.currentGroup, index);
    }

    public final int groupKey(int index) {
        return SlotTableKt.access$key(this.f14738b, index);
    }

    @Nullable
    public final Object groupObjectKey(int index) {
        int[] iArr = this.f14738b;
        if (SlotTableKt.access$hasObjectKey(iArr, index)) {
            return this.f14740d[SlotTableKt.access$objectKeyIndex(iArr, index)];
        }
        return null;
    }

    public final int groupSize(int index) {
        return SlotTableKt.access$groupSize(this.f14738b, index);
    }

    public final boolean hasMark(int index) {
        return SlotTableKt.access$hasMark(this.f14738b, index);
    }

    public final boolean hasObjectKey(int index) {
        return SlotTableKt.access$hasObjectKey(this.f14738b, index);
    }

    public final boolean isGroupEnd() {
        return getInEmpty() || this.currentGroup == this.currentEnd;
    }

    public final boolean isNode() {
        return SlotTableKt.access$isNode(this.f14738b, this.currentGroup);
    }

    @Nullable
    public final Object next() {
        int i10;
        if (this.f14747k > 0 || (i10 = this.f14748l) >= this.m) {
            this.hadNext = false;
            return Composer.INSTANCE.getEmpty();
        }
        this.hadNext = true;
        this.f14748l = i10 + 1;
        return this.f14740d[i10];
    }

    @Nullable
    public final Object node(int index) {
        int[] iArr = this.f14738b;
        if (SlotTableKt.access$isNode(iArr, index)) {
            return SlotTableKt.access$isNode(iArr, index) ? this.f14740d[SlotTableKt.access$nodeIndex(iArr, index)] : Composer.INSTANCE.getEmpty();
        }
        return null;
    }

    public final int nodeCount(int index) {
        return SlotTableKt.access$nodeCount(this.f14738b, index);
    }

    public final int parent(int index) {
        return SlotTableKt.access$parentAnchor(this.f14738b, index);
    }

    public final int parentOf(int index) {
        if (!(index >= 0 && index < this.f14739c)) {
            PreconditionsKt.throwIllegalArgumentException("Invalid group index " + index);
        }
        return SlotTableKt.access$parentAnchor(this.f14738b, index);
    }

    public final void reposition(int index) {
        if (!(this.f14747k == 0)) {
            ComposerKt.composeImmediateRuntimeError("Cannot reposition while in an empty region");
        }
        this.currentGroup = index;
        int[] iArr = this.f14738b;
        int i10 = this.f14739c;
        int iAccess$parentAnchor = index < i10 ? SlotTableKt.access$parentAnchor(iArr, index) : -1;
        this.parent = iAccess$parentAnchor;
        if (iAccess$parentAnchor < 0) {
            this.currentEnd = i10;
        } else {
            this.currentEnd = SlotTableKt.access$groupSize(iArr, iAccess$parentAnchor) + iAccess$parentAnchor;
        }
        this.f14748l = 0;
        this.m = 0;
    }

    public final void restoreParent(int index) {
        int iAccess$groupSize = SlotTableKt.access$groupSize(this.f14738b, index) + index;
        int i10 = this.currentGroup;
        if (!(i10 >= index && i10 <= iAccess$groupSize)) {
            ComposerKt.composeImmediateRuntimeError("Index " + index + " is not a parent of " + i10);
        }
        this.parent = index;
        this.currentEnd = iAccess$groupSize;
        this.f14748l = 0;
        this.m = 0;
    }

    public final int skipGroup() {
        if (!(this.f14747k == 0)) {
            ComposerKt.composeImmediateRuntimeError("Cannot skip while in an empty region");
        }
        int i10 = this.currentGroup;
        int[] iArr = this.f14738b;
        int iAccess$nodeCount = SlotTableKt.access$isNode(iArr, i10) ? 1 : SlotTableKt.access$nodeCount(iArr, this.currentGroup);
        int i11 = this.currentGroup;
        this.currentGroup = SlotTableKt.access$groupSize(iArr, i11) + i11;
        return iAccess$nodeCount;
    }

    public final void skipToGroupEnd() {
        if (!(this.f14747k == 0)) {
            ComposerKt.composeImmediateRuntimeError("Cannot skip the enclosing group while in an empty region");
        }
        this.currentGroup = this.currentEnd;
        this.f14748l = 0;
        this.m = 0;
    }

    public final void startGroup() {
        if (this.f14747k <= 0) {
            int i10 = this.parent;
            int i11 = this.currentGroup;
            int[] iArr = this.f14738b;
            if (!(SlotTableKt.access$parentAnchor(iArr, i11) == i10)) {
                PreconditionsKt.throwIllegalArgumentException("Invalid slot table detected");
            }
            int i12 = this.f14748l;
            int i13 = this.m;
            IntStack intStack = this.f14746j;
            if (i12 == 0 && i13 == 0) {
                intStack.push(-1);
            } else {
                intStack.push(i12);
            }
            this.parent = i11;
            this.currentEnd = SlotTableKt.access$groupSize(iArr, i11) + i11;
            int i14 = i11 + 1;
            this.currentGroup = i14;
            this.f14748l = SlotTableKt.access$slotAnchor(iArr, i11);
            this.m = i11 >= this.f14739c - 1 ? this.f14741e : SlotTableKt.access$dataAnchor(iArr, i14);
        }
    }

    public final void startNode() {
        if (this.f14747k <= 0) {
            if (!SlotTableKt.access$isNode(this.f14738b, this.currentGroup)) {
                PreconditionsKt.throwIllegalArgumentException("Expected a node group");
            }
            startGroup();
        }
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("SlotReader(current=");
        sb2.append(this.currentGroup);
        sb2.append(", key=");
        sb2.append(getGroupKey());
        sb2.append(", parent=");
        sb2.append(this.parent);
        sb2.append(", end=");
        return androidx.activity.a.d(sb2, this.currentEnd, RootService.CLOSE_BRACKET);
    }

    @Nullable
    public final Object groupGet(int group, int index) {
        int[] iArr = this.f14738b;
        int iAccess$slotAnchor = SlotTableKt.access$slotAnchor(iArr, group);
        int i10 = group + 1;
        int i11 = iAccess$slotAnchor + index;
        return i11 < (i10 < this.f14739c ? SlotTableKt.access$dataAnchor(iArr, i10) : this.f14741e) ? this.f14740d[i11] : Composer.INSTANCE.getEmpty();
    }

    public final int groupKey(@NotNull Anchor anchor) {
        if (!anchor.getValid()) {
            return 0;
        }
        return SlotTableKt.access$key(this.f14738b, this.table.anchorIndex(anchor));
    }

    public final boolean isNode(int index) {
        return SlotTableKt.access$isNode(this.f14738b, index);
    }
}
