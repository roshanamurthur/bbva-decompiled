package androidx.compose.runtime;

import androidx.collection.MutableIntObjectMap;
import androidx.collection.MutableIntSet;
import androidx.collection.h;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.tooling.CompositionData;
import androidx.compose.runtime.tooling.CompositionGroup;
import androidx.exifinterface.media.ExifInterface;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.bbva.glomohybrid.cellsweb.presentation.verishow.constants.HearingDisabilitiesConstants;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.markers.KMappedMarker;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.l;
import m0.g0;
import m0.j;
import mx.openpay.library.domain.util.Constant;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: SlotTable.kt */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u009c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010(\n\u0002\b4\b\u0000\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B\u0007¢\u0006\u0004\bz\u0010{J9\u0010\u000b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00042!\u0010\n\u001a\u001d\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00028\u00000\u0005H\u0086\b¢\u0006\u0004\b\u000b\u0010\fJ9\u0010\u000f\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00042!\u0010\n\u001a\u001d\u0012\u0013\u0012\u00110\r¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00028\u00000\u0005H\u0086\b¢\u0006\u0004\b\u000f\u0010\fJ\u0006\u0010\u0010\u001a\u00020\u0006J\u0006\u0010\u0011\u001a\u00020\rJ\u000e\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012J\u000e\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014J\u000e\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\u0014J\u0016\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014J?\u0010\"\u001a\u00020\u001f2\u0006\u0010\t\u001a\u00020\u00062&\u0010\u001e\u001a\"\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u001bj\u0010\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u001c\u0018\u0001`\u001dH\u0000¢\u0006\u0004\b \u0010!J\u008f\u0001\u0010\"\u001a\u00020\u001f2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010$\u001a\u00020#2\u0006\u0010%\u001a\u00020\u00122\u000e\u0010(\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010'0&2\u0006\u0010)\u001a\u00020\u00122\u0016\u0010,\u001a\u0012\u0012\u0004\u0012\u00020\u00140*j\b\u0012\u0004\u0012\u00020\u0014`+2&\u0010\u001e\u001a\"\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u001bj\u0010\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u001c\u0018\u0001`\u001d2\u000e\u0010/\u001a\n\u0012\u0004\u0012\u00020.\u0018\u00010-H\u0000¢\u0006\u0004\b \u00100J\u0087\u0001\u00103\u001a\u00020\u001f2\u0006\u0010$\u001a\u00020#2\u0006\u0010%\u001a\u00020\u00122\u000e\u0010(\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010'0&2\u0006\u0010)\u001a\u00020\u00122\u0016\u0010,\u001a\u0012\u0012\u0004\u0012\u00020\u00140*j\b\u0012\u0004\u0012\u00020\u0014`+2&\u0010\u001e\u001a\"\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u001bj\u0010\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u001c\u0018\u0001`\u001d2\u000e\u0010/\u001a\n\u0012\u0004\u0012\u00020.\u0018\u00010-H\u0000¢\u0006\u0004\b1\u00102J\u001f\u00109\u001a\n\u0012\u0004\u0012\u000206\u0018\u0001052\u0006\u00104\u001a\u00020\u0012H\u0000¢\u0006\u0004\b7\u00108J\u0006\u0010:\u001a\u00020\u0017J\u0010\u0010<\u001a\u0004\u0018\u00010\u001c2\u0006\u0010;\u001a\u00020\u0012J\u0006\u0010=\u001a\u00020\u001fJ\u0006\u0010>\u001a\u00020\u001fJ\u0006\u0010?\u001a\u00020\u001fJ\u0006\u0010A\u001a\u00020@J\u001f\u0010C\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010'052\u0006\u0010;\u001a\u00020\u0012H\u0000¢\u0006\u0004\bB\u00108J!\u0010G\u001a\u0004\u0018\u00010'2\u0006\u0010;\u001a\u00020\u00122\u0006\u0010D\u001a\u00020\u0012H\u0000¢\u0006\u0004\bE\u0010FJ\u000f\u0010I\u001a\b\u0012\u0004\u0012\u00020\u00030HH\u0096\u0002J\u0012\u0010K\u001a\u0004\u0018\u00010\u00032\u0006\u0010J\u001a\u00020'H\u0016R$\u0010$\u001a\u00020#2\u0006\u0010L\u001a\u00020#8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bM\u0010N\u001a\u0004\bO\u0010PR$\u0010%\u001a\u00020\u00122\u0006\u0010L\u001a\u00020\u00128\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bQ\u0010R\u001a\u0004\bS\u0010TR4\u0010(\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010'0&2\u000e\u0010L\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010'0&8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bU\u0010V\u001a\u0004\bW\u0010XR$\u0010)\u001a\u00020\u00122\u0006\u0010L\u001a\u00020\u00128\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bY\u0010R\u001a\u0004\bZ\u0010TR$\u0010\u000e\u001a\u00020\u00172\u0006\u0010L\u001a\u00020\u00178\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b[\u0010\\\u001a\u0004\b]\u0010^R\"\u0010c\u001a\u00020\u00128\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b_\u0010R\u001a\u0004\b`\u0010T\"\u0004\ba\u0010bR2\u0010,\u001a\u0012\u0012\u0004\u0012\u00020\u00140*j\b\u0012\u0004\u0012\u00020\u0014`+8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bd\u0010e\u001a\u0004\bf\u0010g\"\u0004\bh\u0010iRB\u0010\u001e\u001a\"\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u001bj\u0010\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u001c\u0018\u0001`\u001d8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bj\u0010k\u001a\u0004\bl\u0010m\"\u0004\bn\u0010oR*\u0010/\u001a\n\u0012\u0004\u0012\u00020.\u0018\u00010-8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bp\u0010q\u001a\u0004\br\u0010s\"\u0004\bt\u0010uR\u0014\u0010v\u001a\u00020\u00178VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bv\u0010^R\u001a\u0010y\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bw\u0010x¨\u0006|"}, d2 = {"Landroidx/compose/runtime/SlotTable;", "Landroidx/compose/runtime/tooling/CompositionData;", "", "Landroidx/compose/runtime/tooling/CompositionGroup;", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlin/Function1;", "Landroidx/compose/runtime/SlotReader;", "Lkotlin/ParameterName;", "name", "reader", "block", "read", "(Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "Landroidx/compose/runtime/SlotWriter;", "writer", "write", "openReader", "openWriter", "", FirebaseAnalytics.Param.INDEX, "Landroidx/compose/runtime/Anchor;", "anchor", "anchorIndex", "", "ownsAnchor", "groupIndex", "groupContainsAnchor", "Ljava/util/HashMap;", "Landroidx/compose/runtime/GroupSourceInformation;", "Lkotlin/collections/HashMap;", "sourceInformationMap", "", "close$runtime_release", "(Landroidx/compose/runtime/SlotReader;Ljava/util/HashMap;)V", HearingDisabilitiesConstants.CLOSE_MODAL, "", "groups", "groupsSize", "", "", "slots", "slotsSize", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "anchors", "Landroidx/collection/MutableIntObjectMap;", "Landroidx/collection/MutableIntSet;", "calledByMap", "(Landroidx/compose/runtime/SlotWriter;[II[Ljava/lang/Object;ILjava/util/ArrayList;Ljava/util/HashMap;Landroidx/collection/MutableIntObjectMap;)V", "setTo$runtime_release", "([II[Ljava/lang/Object;ILjava/util/ArrayList;Ljava/util/HashMap;Landroidx/collection/MutableIntObjectMap;)V", "setTo", "target", "", "Landroidx/compose/runtime/RecomposeScopeImpl;", "invalidateGroupsWithKey$runtime_release", "(I)Ljava/util/List;", "invalidateGroupsWithKey", "containsMark", "group", "sourceInformationOf", "verifyWellFormed", "collectCalledByInformation", "collectSourceInformation", "", "toDebugString", "slotsOf$runtime_release", "slotsOf", "slotIndex", "slot$runtime_release", "(II)Ljava/lang/Object;", "slot", "", "iterator", "identityToFind", "find", "<set-?>", "p0", "[I", "getGroups", "()[I", "q0", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getGroupsSize", "()I", "r0", "[Ljava/lang/Object;", "getSlots", "()[Ljava/lang/Object;", "s0", "getSlotsSize", "u0", "Z", "getWriter$runtime_release", "()Z", "v0", "getVersion$runtime_release", "setVersion$runtime_release", "(I)V", "version", "w0", "Ljava/util/ArrayList;", "getAnchors$runtime_release", "()Ljava/util/ArrayList;", "setAnchors$runtime_release", "(Ljava/util/ArrayList;)V", "x0", "Ljava/util/HashMap;", "getSourceInformationMap$runtime_release", "()Ljava/util/HashMap;", "setSourceInformationMap$runtime_release", "(Ljava/util/HashMap;)V", "y0", "Landroidx/collection/MutableIntObjectMap;", "getCalledByMap$runtime_release", "()Landroidx/collection/MutableIntObjectMap;", "setCalledByMap$runtime_release", "(Landroidx/collection/MutableIntObjectMap;)V", "isEmpty", "getCompositionGroups", "()Ljava/lang/Iterable;", "compositionGroups", "<init>", "()V", "runtime_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nSlotTable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SlotTable.kt\nandroidx/compose/runtime/SlotTable\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Preconditions.kt\nandroidx/compose/runtime/PreconditionsKt\n+ 5 SlotTable.kt\nandroidx/compose/runtime/SlotTableKt\n+ 6 ActualJvm.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt\n+ 7 ListUtils.kt\nandroidx/compose/runtime/snapshots/ListUtilsKt\n*L\n1#1,4151:1\n158#1,8:4237\n174#1,5:4245\n180#1,3:4257\n1#2:4152\n1#2:4256\n4553#3,7:4153\n4553#3,7:4160\n4553#3,7:4167\n4553#3,7:4187\n4553#3,7:4194\n4553#3,7:4208\n4553#3,7:4215\n4553#3,7:4222\n33#4,7:4174\n33#4,7:4201\n33#4,7:4230\n50#4,7:4260\n50#4,7:4267\n33#4,7:4278\n33#4,7:4285\n33#4,7:4293\n33#4,7:4300\n50#4,7:4307\n50#4,7:4314\n50#4,7:4321\n50#4,7:4328\n50#4,7:4335\n50#4,7:4342\n50#4,7:4349\n50#4,7:4356\n50#4,7:4363\n50#4,7:4370\n50#4,7:4377\n33#4,7:4388\n33#4,7:4395\n4018#5,6:4181\n89#6:4229\n33#7,6:4250\n33#7,4:4274\n38#7:4292\n33#7,4:4384\n38#7:4402\n*S KotlinDebug\n*F\n+ 1 SlotTable.kt\nandroidx/compose/runtime/SlotTable\n*L\n357#1:4237,8\n394#1:4245,5\n394#1:4257,3\n394#1:4256\n203#1:4153,7\n204#1:4160,7\n220#1:4167,7\n233#1:4187,7\n244#1:4194,7\n264#1:4208,7\n265#1:4215,7\n277#1:4222,7\n221#1:4174,7\n245#1:4201,7\n306#1:4230,7\n513#1:4260,7\n520#1:4267,7\n529#1:4278,7\n532#1:4285,7\n555#1:4293,7\n558#1:4300,7\n451#1:4307,7\n456#1:4314,7\n459#1:4321,7\n465#1:4328,7\n468#1:4335,7\n472#1:4342,7\n478#1:4349,7\n482#1:4356,7\n491#1:4363,7\n496#1:4370,7\n501#1:4377,7\n541#1:4388,7\n544#1:4395,7\n224#1:4181,6\n280#1:4229\n396#1:4250,6\n527#1:4274,4\n527#1:4292\n538#1:4384,4\n538#1:4402\n*E\n"})
public final class SlotTable implements CompositionData, Iterable<CompositionGroup>, KMappedMarker {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: q0, reason: collision with root package name and from kotlin metadata */
    public int groupsSize;

    /* JADX INFO: renamed from: s0, reason: collision with root package name and from kotlin metadata */
    public int slotsSize;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public int f14754t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name and from kotlin metadata */
    public boolean writer;

    /* JADX INFO: renamed from: v0, reason: from kotlin metadata */
    public int version;

    /* JADX INFO: renamed from: x0, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public HashMap<Anchor, GroupSourceInformation> sourceInformationMap;

    /* JADX INFO: renamed from: y0, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public MutableIntObjectMap<MutableIntSet> calledByMap;

    /* JADX INFO: renamed from: p0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public int[] groups = new int[0];

    /* JADX INFO: renamed from: r0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public Object[] slots = new Object[0];

    /* JADX INFO: renamed from: w0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public ArrayList<Anchor> anchors = new ArrayList<>();

    public static final void c(SlotReader slotReader, MutableIntSet mutableIntSet, ArrayList arrayList, Ref.BooleanRef booleanRef, SlotTable slotTable, ArrayList arrayList2) {
        RecomposeScopeImpl recomposeScopeImplB;
        int groupKey = slotReader.getGroupKey();
        if (!mutableIntSet.contains(groupKey)) {
            slotReader.startGroup();
            while (!slotReader.isGroupEnd()) {
                c(slotReader, mutableIntSet, arrayList, booleanRef, slotTable, arrayList2);
            }
            slotReader.endGroup();
            return;
        }
        if (groupKey != -3) {
            arrayList.add(SlotReader.anchor$default(slotReader, 0, 1, null));
        }
        if (booleanRef.element) {
            RecomposeScopeImpl recomposeScopeImplB2 = slotTable.b(slotReader.getCurrentGroup());
            if (recomposeScopeImplB2 != null) {
                arrayList2.add(recomposeScopeImplB2);
                Anchor anchor = recomposeScopeImplB2.getAnchor();
                if (anchor != null && anchor.getLocation() == slotReader.getCurrentGroup() && (recomposeScopeImplB = slotTable.b(slotReader.getParent())) != null) {
                    arrayList2.add(recomposeScopeImplB);
                }
            } else {
                booleanRef.element = false;
                arrayList2.clear();
            }
        }
        slotReader.skipGroup();
    }

    public static final int d(Ref.IntRef intRef, SlotTable slotTable, int i10, int i11) {
        int i12 = intRef.element;
        int i13 = i12 + 1;
        intRef.element = i13;
        int iAccess$parentAnchor = SlotTableKt.access$parentAnchor(slotTable.groups, i12);
        if (iAccess$parentAnchor != i10) {
            StringBuilder sbE = h.e("Invalid parent index detected at ", i12, ", expected parent index to be ", i10, " found ");
            sbE.append(iAccess$parentAnchor);
            PreconditionsKt.throwIllegalStateException(sbE.toString());
        }
        int iAccess$groupSize = SlotTableKt.access$groupSize(slotTable.groups, i12) + i12;
        if (iAccess$groupSize > slotTable.groupsSize) {
            PreconditionsKt.throwIllegalStateException("A group extends past the end of the table at " + i12);
        }
        if (iAccess$groupSize > i11) {
            PreconditionsKt.throwIllegalStateException("A group extends past its parent group at " + i12);
        }
        int iAccess$dataAnchor = SlotTableKt.access$dataAnchor(slotTable.groups, i12);
        int iAccess$dataAnchor2 = i12 >= slotTable.groupsSize - 1 ? slotTable.slotsSize : SlotTableKt.access$dataAnchor(slotTable.groups, i13);
        if (iAccess$dataAnchor2 > slotTable.slots.length) {
            PreconditionsKt.throwIllegalStateException("Slots for " + i12 + " extend past the end of the slot table");
        }
        if (iAccess$dataAnchor > iAccess$dataAnchor2) {
            PreconditionsKt.throwIllegalStateException("Invalid data anchor at " + i12);
        }
        if (SlotTableKt.access$slotAnchor(slotTable.groups, i12) > iAccess$dataAnchor2) {
            PreconditionsKt.throwIllegalStateException("Slots start out of range at " + i12);
        }
        if (iAccess$dataAnchor2 - iAccess$dataAnchor < (SlotTableKt.access$hasAux(slotTable.groups, i12) ? 1 : 0) + (SlotTableKt.access$hasObjectKey(slotTable.groups, i12) ? 1 : 0) + (SlotTableKt.access$isNode(slotTable.groups, i12) ? 1 : 0)) {
            PreconditionsKt.throwIllegalStateException("Not enough slots added for group " + i12);
        }
        boolean zAccess$isNode = SlotTableKt.access$isNode(slotTable.groups, i12);
        if (zAccess$isNode && slotTable.slots[SlotTableKt.access$nodeIndex(slotTable.groups, i12)] == null) {
            PreconditionsKt.throwIllegalStateException("No node recorded for a node group at " + i12);
        }
        int iD = 0;
        while (intRef.element < iAccess$groupSize) {
            iD += d(intRef, slotTable, i12, iAccess$groupSize);
        }
        int iAccess$nodeCount = SlotTableKt.access$nodeCount(slotTable.groups, i12);
        int iAccess$groupSize2 = SlotTableKt.access$groupSize(slotTable.groups, i12);
        if (!(iAccess$nodeCount == iD)) {
            StringBuilder sbE2 = h.e("Incorrect node count detected at ", i12, ", expected ", iAccess$nodeCount, ", received ");
            sbE2.append(iD);
            PreconditionsKt.throwIllegalStateException(sbE2.toString());
        }
        int i14 = intRef.element - i12;
        if (iAccess$groupSize2 != i14) {
            StringBuilder sbE3 = h.e("Incorrect slot count detected at ", i12, ", expected ", iAccess$groupSize2, ", received ");
            sbE3.append(i14);
            PreconditionsKt.throwIllegalStateException(sbE3.toString());
        }
        if (SlotTableKt.access$containsAnyMark(slotTable.groups, i12) && i12 > 0 && !SlotTableKt.access$containsMark(slotTable.groups, i10)) {
            PreconditionsKt.throwIllegalStateException("Expected group " + i10 + " to record it contains a mark because " + i12 + " does");
        }
        if (zAccess$isNode) {
            return 1;
        }
        return iD;
    }

    public static final void e(SlotTable slotTable, GroupSourceInformation groupSourceInformation) {
        ArrayList<Object> groups = groupSourceInformation.getGroups();
        if (groups != null) {
            int size = groups.size();
            for (int i10 = 0; i10 < size; i10++) {
                Object obj = groups.get(i10);
                if (obj instanceof Anchor) {
                    Anchor anchor = (Anchor) obj;
                    if (!anchor.getValid()) {
                        PreconditionsKt.throwIllegalArgumentException("Source map contains invalid anchor");
                    }
                    if (!slotTable.ownsAnchor(anchor)) {
                        PreconditionsKt.throwIllegalArgumentException("Source map anchor is not owned by the slot table");
                    }
                } else if (obj instanceof GroupSourceInformation) {
                    e(slotTable, (GroupSourceInformation) obj);
                }
            }
        }
    }

    public final int a(StringBuilder sb2, int i10, int i11) {
        String sourceInformation;
        for (int i12 = 0; i12 < i11; i12++) {
            sb2.append(' ');
        }
        sb2.append("Group(");
        sb2.append(i10);
        sb2.append(")");
        GroupSourceInformation groupSourceInformationSourceInformationOf = sourceInformationOf(i10);
        if (groupSourceInformationSourceInformationOf != null && (sourceInformation = groupSourceInformationSourceInformationOf.getSourceInformation()) != null && (l.startsWith$default(sourceInformation, "C(", false, 2, null) || l.startsWith$default(sourceInformation, "CC(", false, 2, null))) {
            int iIndexOf$default = StringsKt__StringsKt.indexOf$default((CharSequence) sourceInformation, "(", 0, false, 6, (Object) null) + 1;
            int iIndexOf$default2 = StringsKt__StringsKt.indexOf$default((CharSequence) sourceInformation, RootService.CLOSE_BRACKET, 0, false, 6, (Object) null);
            sb2.append(" ");
            String strSubstring = sourceInformation.substring(iIndexOf$default, iIndexOf$default2);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            sb2.append(strSubstring);
            sb2.append("()");
        }
        sb2.append(" key=");
        sb2.append(SlotTableKt.access$key(this.groups, i10));
        int iAccess$groupSize = SlotTableKt.access$groupSize(this.groups, i10);
        sb2.append(", nodes=");
        sb2.append(SlotTableKt.access$nodeCount(this.groups, i10));
        sb2.append(", size=");
        sb2.append(iAccess$groupSize);
        if (SlotTableKt.access$hasMark(this.groups, i10)) {
            sb2.append(", mark");
        }
        if (SlotTableKt.access$containsMark(this.groups, i10)) {
            sb2.append(", contains mark");
        }
        int iAccess$dataAnchor = i10 >= this.groupsSize ? this.slotsSize : SlotTableKt.access$dataAnchor(this.groups, i10);
        int iA = i10 + 1;
        int iAccess$dataAnchor2 = iA >= this.groupsSize ? this.slotsSize : SlotTableKt.access$dataAnchor(this.groups, iA);
        if (iAccess$dataAnchor < 0 || iAccess$dataAnchor > iAccess$dataAnchor2 || iAccess$dataAnchor2 > this.slotsSize) {
            sb2.append(", *invalid data offsets " + iAccess$dataAnchor + '-' + iAccess$dataAnchor2 + '*');
        } else {
            if (SlotTableKt.access$hasObjectKey(this.groups, i10)) {
                sb2.append(" objectKey=" + SlotTableKt.access$summarize(String.valueOf(this.slots[SlotTableKt.access$objectKeyIndex(this.groups, i10)]), 10));
            }
            if (SlotTableKt.access$isNode(this.groups, i10)) {
                sb2.append(" node=" + SlotTableKt.access$summarize(String.valueOf(this.slots[SlotTableKt.access$nodeIndex(this.groups, i10)]), 10));
            }
            if (SlotTableKt.access$hasAux(this.groups, i10)) {
                sb2.append(" aux=" + SlotTableKt.access$summarize(String.valueOf(this.slots[SlotTableKt.access$auxIndex(this.groups, i10)]), 10));
            }
            int iAccess$slotAnchor = SlotTableKt.access$slotAnchor(this.groups, i10);
            if (iAccess$slotAnchor < iAccess$dataAnchor2) {
                sb2.append(", slots=[");
                sb2.append(iAccess$slotAnchor);
                sb2.append(": ");
                for (int i13 = iAccess$slotAnchor; i13 < iAccess$dataAnchor2; i13++) {
                    if (i13 != iAccess$slotAnchor) {
                        sb2.append(", ");
                    }
                    sb2.append(SlotTableKt.access$summarize(String.valueOf(this.slots[i13]), 10));
                }
                sb2.append(Constant.BRACKET_CLOSE);
            }
        }
        sb2.append('\n');
        int i14 = i10 + iAccess$groupSize;
        while (iA < i14) {
            iA += a(sb2, iA, i11 + 1);
        }
        return iAccess$groupSize;
    }

    @NotNull
    public final Anchor anchor(int index) {
        if (!(!this.writer)) {
            ComposerKt.composeImmediateRuntimeError("use active SlotWriter to create an anchor location instead");
        }
        boolean z10 = false;
        if (index >= 0 && index < this.groupsSize) {
            z10 = true;
        }
        if (!z10) {
            PreconditionsKt.throwIllegalArgumentException("Parameter index is out of range");
        }
        ArrayList<Anchor> arrayList = this.anchors;
        int iB = SlotTableKt.b(arrayList, index, this.groupsSize);
        if (iB >= 0) {
            return arrayList.get(iB);
        }
        Anchor anchor = new Anchor(index);
        arrayList.add(-(iB + 1), anchor);
        return anchor;
    }

    public final int anchorIndex(@NotNull Anchor anchor) {
        if (!(!this.writer)) {
            ComposerKt.composeImmediateRuntimeError("Use active SlotWriter to determine anchor location instead");
        }
        if (!anchor.getValid()) {
            PreconditionsKt.throwIllegalArgumentException("Anchor refers to a group that was removed");
        }
        return anchor.getLocation();
    }

    public final RecomposeScopeImpl b(int i10) {
        int iAccess$parentAnchor = i10;
        while (iAccess$parentAnchor > 0) {
            int iAccess$dataAnchor = SlotTableKt.access$dataAnchor(getGroups(), iAccess$parentAnchor);
            int i11 = iAccess$parentAnchor + 1;
            int iAccess$dataAnchor2 = i11 < getGroupsSize() ? SlotTableKt.access$dataAnchor(getGroups(), i11) : getSlotsSize();
            while (true) {
                if (iAccess$dataAnchor < iAccess$dataAnchor2) {
                    Object obj = (iAccess$dataAnchor < 0 || iAccess$dataAnchor >= getSlots().length) ? null : getSlots()[iAccess$dataAnchor];
                    iAccess$dataAnchor++;
                    if (obj instanceof RecomposeScopeImpl) {
                        RecomposeScopeImpl recomposeScopeImpl = (RecomposeScopeImpl) obj;
                        if (recomposeScopeImpl.getUsed() && iAccess$parentAnchor != i10) {
                            return recomposeScopeImpl;
                        }
                        recomposeScopeImpl.setForcedRecompose(true);
                    }
                }
            }
            iAccess$parentAnchor = SlotTableKt.access$parentAnchor(this.groups, iAccess$parentAnchor);
        }
        return null;
    }

    public final void close$runtime_release(@NotNull SlotReader reader, @Nullable HashMap<Anchor, GroupSourceInformation> sourceInformationMap) {
        if (!(reader.getTable() == this && this.f14754t0 > 0)) {
            ComposerKt.composeImmediateRuntimeError("Unexpected reader close()");
        }
        this.f14754t0--;
        if (sourceInformationMap != null) {
            synchronized (this) {
                try {
                    HashMap<Anchor, GroupSourceInformation> map = this.sourceInformationMap;
                    if (map != null) {
                        map.putAll(sourceInformationMap);
                    } else {
                        this.sourceInformationMap = sourceInformationMap;
                    }
                    Unit unit = Unit.INSTANCE;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public final void collectCalledByInformation() {
        this.calledByMap = new MutableIntObjectMap<>(0, 1, null);
    }

    public final void collectSourceInformation() {
        this.sourceInformationMap = new HashMap<>();
    }

    public final boolean containsMark() {
        return this.groupsSize > 0 && SlotTableKt.access$containsMark(this.groups, 0);
    }

    @Override // androidx.compose.runtime.tooling.CompositionData
    @Nullable
    public CompositionGroup find(@NotNull Object identityToFind) {
        return new g0(0, this, getVersion()).find(identityToFind);
    }

    @NotNull
    public final ArrayList<Anchor> getAnchors$runtime_release() {
        return this.anchors;
    }

    @Nullable
    public final MutableIntObjectMap<MutableIntSet> getCalledByMap$runtime_release() {
        return this.calledByMap;
    }

    @NotNull
    public final int[] getGroups() {
        return this.groups;
    }

    public final int getGroupsSize() {
        return this.groupsSize;
    }

    @NotNull
    public final Object[] getSlots() {
        return this.slots;
    }

    public final int getSlotsSize() {
        return this.slotsSize;
    }

    @Nullable
    public final HashMap<Anchor, GroupSourceInformation> getSourceInformationMap$runtime_release() {
        return this.sourceInformationMap;
    }

    /* JADX INFO: renamed from: getVersion$runtime_release, reason: from getter */
    public final int getVersion() {
        return this.version;
    }

    /* JADX INFO: renamed from: getWriter$runtime_release, reason: from getter */
    public final boolean getWriter() {
        return this.writer;
    }

    public final boolean groupContainsAnchor(int groupIndex, @NotNull Anchor anchor) {
        if (!(!this.writer)) {
            ComposerKt.composeImmediateRuntimeError("Writer is active");
        }
        if (!(groupIndex >= 0 && groupIndex < this.groupsSize)) {
            ComposerKt.composeImmediateRuntimeError("Invalid group index");
        }
        if (ownsAnchor(anchor)) {
            int iAccess$groupSize = SlotTableKt.access$groupSize(this.groups, groupIndex) + groupIndex;
            int location$runtime_release = anchor.getLocation();
            if (groupIndex <= location$runtime_release && location$runtime_release < iAccess$groupSize) {
                return true;
            }
        }
        return false;
    }

    @Nullable
    public final List<RecomposeScopeImpl> invalidateGroupsWithKey$runtime_release(int target) {
        MutableIntSet mutableIntSet;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        booleanRef.element = true;
        MutableIntSet mutableIntSet2 = new MutableIntSet(0, 1, null);
        mutableIntSet2.add(target);
        mutableIntSet2.add(-3);
        MutableIntObjectMap<MutableIntSet> mutableIntObjectMap = this.calledByMap;
        if (mutableIntObjectMap != null && (mutableIntSet = mutableIntObjectMap.get(target)) != null) {
            mutableIntSet2.addAll(mutableIntSet);
        }
        SlotReader slotReaderOpenReader = openReader();
        try {
            c(slotReaderOpenReader, mutableIntSet2, arrayList, booleanRef, this, arrayList2);
            Unit unit = Unit.INSTANCE;
            slotReaderOpenReader.close();
            SlotWriter slotWriterOpenWriter = openWriter();
            try {
                slotWriterOpenWriter.startGroup();
                int size = arrayList.size();
                for (int i10 = 0; i10 < size; i10++) {
                    Anchor anchor = (Anchor) arrayList.get(i10);
                    if (anchor.toIndexFor(slotWriterOpenWriter) >= slotWriterOpenWriter.getCurrentGroup()) {
                        slotWriterOpenWriter.seek(anchor);
                        slotWriterOpenWriter.bashCurrentGroup();
                    }
                }
                slotWriterOpenWriter.skipToGroupEnd();
                slotWriterOpenWriter.endGroup();
                slotWriterOpenWriter.close(true);
                if (booleanRef.element) {
                    return arrayList2;
                }
                return null;
            } catch (Throwable th2) {
                slotWriterOpenWriter.close(false);
                throw th2;
            }
        } catch (Throwable th3) {
            slotReaderOpenReader.close();
            throw th3;
        }
    }

    @Override // androidx.compose.runtime.tooling.CompositionData
    public boolean isEmpty() {
        return this.groupsSize == 0;
    }

    @Override // java.lang.Iterable
    @NotNull
    public Iterator<CompositionGroup> iterator() {
        return new j(0, this, this.groupsSize);
    }

    @NotNull
    public final SlotReader openReader() {
        if (this.writer) {
            throw new IllegalStateException("Cannot read while a writer is pending".toString());
        }
        this.f14754t0++;
        return new SlotReader(this);
    }

    @NotNull
    public final SlotWriter openWriter() {
        if (!(!this.writer)) {
            ComposerKt.composeImmediateRuntimeError("Cannot start a writer when another writer is pending");
        }
        if (!(this.f14754t0 <= 0)) {
            ComposerKt.composeImmediateRuntimeError("Cannot start a writer when a reader is pending");
        }
        this.writer = true;
        this.version++;
        return new SlotWriter(this);
    }

    public final boolean ownsAnchor(@NotNull Anchor anchor) {
        int iB;
        return anchor.getValid() && (iB = SlotTableKt.b(this.anchors, anchor.getLocation(), this.groupsSize)) >= 0 && Intrinsics.areEqual(this.anchors.get(iB), anchor);
    }

    public final <T> T read(@NotNull Function1<? super SlotReader, ? extends T> block) {
        SlotReader slotReaderOpenReader = openReader();
        try {
            return block.invoke(slotReaderOpenReader);
        } finally {
            InlineMarker.finallyStart(1);
            slotReaderOpenReader.close();
            InlineMarker.finallyEnd(1);
        }
    }

    public final void setAnchors$runtime_release(@NotNull ArrayList<Anchor> arrayList) {
        this.anchors = arrayList;
    }

    public final void setCalledByMap$runtime_release(@Nullable MutableIntObjectMap<MutableIntSet> mutableIntObjectMap) {
        this.calledByMap = mutableIntObjectMap;
    }

    public final void setSourceInformationMap$runtime_release(@Nullable HashMap<Anchor, GroupSourceInformation> map) {
        this.sourceInformationMap = map;
    }

    public final void setTo$runtime_release(@NotNull int[] groups, int groupsSize, @NotNull Object[] slots, int slotsSize, @NotNull ArrayList<Anchor> anchors, @Nullable HashMap<Anchor, GroupSourceInformation> sourceInformationMap, @Nullable MutableIntObjectMap<MutableIntSet> calledByMap) {
        this.groups = groups;
        this.groupsSize = groupsSize;
        this.slots = slots;
        this.slotsSize = slotsSize;
        this.anchors = anchors;
        this.sourceInformationMap = sourceInformationMap;
        this.calledByMap = calledByMap;
    }

    public final void setVersion$runtime_release(int i10) {
        this.version = i10;
    }

    @Nullable
    public final Object slot$runtime_release(int group, int slotIndex) {
        int iAccess$slotAnchor = SlotTableKt.access$slotAnchor(this.groups, group);
        int i10 = group + 1;
        return (slotIndex < 0 || slotIndex >= (i10 < this.groupsSize ? SlotTableKt.access$dataAnchor(this.groups, i10) : this.slots.length) - iAccess$slotAnchor) ? Composer.INSTANCE.getEmpty() : this.slots[iAccess$slotAnchor + slotIndex];
    }

    @NotNull
    public final List<Object> slotsOf$runtime_release(int group) {
        int iAccess$dataAnchor = SlotTableKt.access$dataAnchor(this.groups, group);
        int i10 = group + 1;
        return ArraysKt___ArraysKt.toList(this.slots).subList(iAccess$dataAnchor, i10 < this.groupsSize ? SlotTableKt.access$dataAnchor(this.groups, i10) : this.slots.length);
    }

    @Nullable
    public final GroupSourceInformation sourceInformationOf(int group) {
        int i10;
        HashMap<Anchor, GroupSourceInformation> map = this.sourceInformationMap;
        if (map == null) {
            return null;
        }
        if (!(!this.writer)) {
            ComposerKt.composeImmediateRuntimeError("use active SlotWriter to crate an anchor for location instead");
        }
        Anchor anchorAccess$find = (group < 0 || group >= (i10 = this.groupsSize)) ? null : SlotTableKt.access$find(this.anchors, group, i10);
        if (anchorAccess$find != null) {
            return map.get(anchorAccess$find);
        }
        return null;
    }

    @NotNull
    public final String toDebugString() {
        if (this.writer) {
            return toString();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(toString());
        sb2.append('\n');
        int i10 = this.groupsSize;
        if (i10 > 0) {
            int iA = 0;
            while (iA < i10) {
                iA += a(sb2, iA, 0);
            }
        } else {
            sb2.append("<EMPTY>");
        }
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    public final void verifyWellFormed() {
        int i10;
        int i11;
        Ref.IntRef intRef = new Ref.IntRef();
        int i12 = -1;
        if (this.groupsSize > 0) {
            while (true) {
                i10 = intRef.element;
                i11 = this.groupsSize;
                if (i10 >= i11) {
                    break;
                } else {
                    d(intRef, this, -1, SlotTableKt.access$groupSize(this.groups, i10) + i10);
                }
            }
            if (!(i10 == i11)) {
                PreconditionsKt.throwIllegalStateException("Incomplete group at root " + intRef.element + " expected to be " + this.groupsSize);
            }
        }
        int length = this.slots.length;
        for (int i13 = this.slotsSize; i13 < length; i13++) {
            if (!(this.slots[i13] == null)) {
                PreconditionsKt.throwIllegalStateException("Non null value in the slot gap at index " + i13);
            }
        }
        ArrayList<Anchor> arrayList = this.anchors;
        int size = arrayList.size();
        int i14 = 0;
        while (i14 < size) {
            int indexFor = arrayList.get(i14).toIndexFor(this);
            if (!(indexFor >= 0 && indexFor <= this.groupsSize)) {
                PreconditionsKt.throwIllegalArgumentException("Invalid anchor, location out of bound");
            }
            if (!(i12 < indexFor)) {
                PreconditionsKt.throwIllegalArgumentException("Anchor is out of order");
            }
            i14++;
            i12 = indexFor;
        }
        HashMap<Anchor, GroupSourceInformation> map = this.sourceInformationMap;
        if (map != null) {
            for (Map.Entry<Anchor, GroupSourceInformation> entry : map.entrySet()) {
                Anchor key = entry.getKey();
                GroupSourceInformation value = entry.getValue();
                if (!key.getValid()) {
                    PreconditionsKt.throwIllegalArgumentException("Source map contains invalid anchor");
                }
                if (!ownsAnchor(key)) {
                    PreconditionsKt.throwIllegalArgumentException("Source map anchor is not owned by the slot table");
                }
                e(this, value);
            }
        }
    }

    public final <T> T write(@NotNull Function1<? super SlotWriter, ? extends T> block) {
        SlotWriter slotWriterOpenWriter = openWriter();
        int i10 = 1;
        char c10 = 1;
        boolean z10 = true;
        char c11 = 1;
        char c12 = 1;
        try {
            T tInvoke = block.invoke(slotWriterOpenWriter);
            InlineMarker.finallyStart(c11 == true ? 1 : 0);
            char c13 = c10 == true ? 1 : 0;
            return tInvoke;
        } finally {
            InlineMarker.finallyStart(i10);
            slotWriterOpenWriter.close(false);
            InlineMarker.finallyEnd(c12 == true ? 1 : 0);
        }
    }

    public final void close$runtime_release(@NotNull SlotWriter writer, @NotNull int[] groups, int groupsSize, @NotNull Object[] slots, int slotsSize, @NotNull ArrayList<Anchor> anchors, @Nullable HashMap<Anchor, GroupSourceInformation> sourceInformationMap, @Nullable MutableIntObjectMap<MutableIntSet> calledByMap) {
        if (!(writer.getTable() == this && this.writer)) {
            PreconditionsKt.throwIllegalArgumentException("Unexpected writer close()");
        }
        this.writer = false;
        setTo$runtime_release(groups, groupsSize, slots, slotsSize, anchors, sourceInformationMap, calledByMap);
    }

    @Override // androidx.compose.runtime.tooling.CompositionData
    @NotNull
    public Iterable<CompositionGroup> getCompositionGroups() {
        return this;
    }
}
