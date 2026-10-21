package androidx.compose.runtime;

import androidx.collection.MutableIntObjectMap;
import androidx.collection.MutableIntSet;
import androidx.collection.h;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.bbva.cellswidgets.MaskTextWatcher;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.bbva.ethermobilesdk.tokencompat.storage.local.SharedPrefsStorage;
import com.bbva.glomohybrid.cellsweb.presentation.verishow.constants.HearingDisabilitiesConstants;
import com.bbva.notifications.constants.PushConstants;
import com.bbva.plugin.localstorage.command.SetCommand;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.markers.KMappedMarker;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: SlotTable.kt */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010(\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b2\b\u0000\u0018\u0000 \u0083\u00012\u00020\u0001:\u0002\u0083\u0001B\u0011\u0012\u0006\u0010S\u001a\u00020R¢\u0006\u0006\b\u0081\u0001\u0010\u0082\u0001J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002J\u0010\u0010\b\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\t\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002J\u0010\u0010\n\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\f\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0016\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u0002J\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0002J\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0011\u001a\u00020\u0010J\u000e\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0010J\u000e\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0004J\u0006\u0010\u0016\u001a\u00020\u0014J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u00012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001J\u0018\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001J\u000e\u0010\u001b\u001a\u00020\u00142\u0006\u0010\u001a\u001a\u00020\u0002J\u0010\u0010\u001c\u001a\u00020\u00142\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001J\u0010\u0010\u001d\u001a\u00020\u00142\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001J\u0006\u0010\u001e\u001a\u00020\u0014J\u000e\u0010!\u001a\u00020\u00142\u0006\u0010 \u001a\u00020\u001fJ\u0016\u0010#\u001a\u00020\u00142\u0006\u0010\"\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u001fJ\u0006\u0010$\u001a\u00020\u0014J\u0010\u0010%\u001a\u00020\u00142\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001J\u0018\u0010%\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001J\u0010\u0010&\u001a\u00020\u00142\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001J\u0010\u0010'\u001a\u00020\u00142\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001J\u001a\u0010'\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001J\u0016\u0010(\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002J\"\u0010'\u001a\u0004\u0018\u00010\u00012\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001J\b\u0010)\u001a\u0004\u0018\u00010\u0001J\u0018\u0010*\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u0002J\u0018\u0010*\u001a\u0004\u0018\u00010\u00012\u0006\u0010+\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002J5\u0010.\u001a\u00020\u00142\u0006\u0010+\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u00022\u001a\u0010-\u001a\u0016\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0004\u0012\u00020\u00140,H\u0086\bJ\u0017\u00101\u001a\u00020\u00022\u0006\u0010+\u001a\u00020\u0002H\u0000¢\u0006\u0004\b/\u00100J\u0017\u00103\u001a\u00020\u00022\u0006\u0010+\u001a\u00020\u0002H\u0000¢\u0006\u0004\b2\u00100J\u0017\u00105\u001a\u00020\u00022\u0006\u0010+\u001a\u00020\u0002H\u0000¢\u0006\u0004\b4\u00100J\u000e\u00107\u001a\u00020\u00142\u0006\u00106\u001a\u00020\u0002J\u000e\u00108\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u0010J\u0006\u00109\u001a\u00020\u0014J\u0006\u0010:\u001a\u00020\u0014J\u0006\u0010;\u001a\u00020\u0014J\u0006\u0010<\u001a\u00020\u0014J\u000e\u0010<\u001a\u00020\u00142\u0006\u0010\"\u001a\u00020\u0002J\u0018\u0010<\u001a\u00020\u00142\u0006\u0010\"\u001a\u00020\u00022\b\u0010=\u001a\u0004\u0018\u00010\u0001J\u0018\u0010?\u001a\u00020\u00142\u0006\u0010\"\u001a\u00020\u00022\b\u0010>\u001a\u0004\u0018\u00010\u0001J\"\u0010?\u001a\u00020\u00142\u0006\u0010\"\u001a\u00020\u00022\b\u0010>\u001a\u0004\u0018\u00010\u00012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001J\"\u0010A\u001a\u00020\u00142\u0006\u0010\"\u001a\u00020\u00022\b\u0010>\u001a\u0004\u0018\u00010\u00012\b\u0010@\u001a\u0004\u0018\u00010\u0001J\u0018\u0010A\u001a\u00020\u00142\u0006\u0010\"\u001a\u00020\u00022\b\u0010@\u001a\u0004\u0018\u00010\u0001J\u0006\u0010B\u001a\u00020\u0002J\u000e\u0010C\u001a\u00020\u00142\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010C\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u0010J\u0006\u0010D\u001a\u00020\u0002J\u0006\u0010E\u001a\u00020\u0004J\u000e\u0010G\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010FJK\u0010K\u001a\u00020\u00142\u0006\u0010\r\u001a\u00020\u000228\u0010-\u001a4\u0012\u0013\u0012\u00110\u0002¢\u0006\f\bH\u0012\b\bI\u0012\u0004\b\b(\u0003\u0012\u0015\u0012\u0013\u0018\u00010\u0001¢\u0006\f\bH\u0012\b\bI\u0012\u0004\b\b(J\u0012\u0004\u0012\u00020\u00140,H\u0086\bJK\u0010L\u001a\u00020\u00142\u0006\u0010\r\u001a\u00020\u000228\u0010-\u001a4\u0012\u0013\u0012\u00110\u0002¢\u0006\f\bH\u0012\b\bI\u0012\u0004\b\b(\u0003\u0012\u0015\u0012\u0013\u0018\u00010\u0001¢\u0006\f\bH\u0012\b\bI\u0012\u0004\b\b(J\u0012\u0004\u0012\u00020\u00140,H\u0086\bJ\u000e\u0010N\u001a\u00020\u00142\u0006\u0010M\u001a\u00020\u0002J$\u0010Q\u001a\b\u0012\u0004\u0012\u00020\u00100P2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010M\u001a\u00020\u00022\u0006\u0010O\u001a\u00020\u0000J&\u0010U\u001a\b\u0012\u0004\u0012\u00020\u00100P2\u0006\u0010S\u001a\u00020R2\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010T\u001a\u00020\u0004J\u0006\u0010V\u001a\u00020\u0014J$\u0010W\u001a\b\u0012\u0004\u0012\u00020\u00100P2\u0006\u0010M\u001a\u00020\u00022\u0006\u0010S\u001a\u00020R2\u0006\u0010\u0003\u001a\u00020\u0002J\u0010\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0003\u001a\u00020\u0002J\u0010\u0010X\u001a\u00020\u00142\b\b\u0002\u0010\r\u001a\u00020\u0002J\u000e\u0010Y\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0010J\b\u0010Z\u001a\u00020\u001fH\u0016J\u0019\u0010]\u001a\u0004\u0018\u00010\u00102\u0006\u0010\r\u001a\u00020\u0002H\u0000¢\u0006\u0004\b[\u0010\\J\u0006\u0010^\u001a\u00020\u001fJ\u000f\u0010a\u001a\u00020\u0014H\u0000¢\u0006\u0004\b_\u0010`J\u000f\u0010c\u001a\u00020\u0014H\u0000¢\u0006\u0004\bb\u0010`R\u001a\u0010S\u001a\u00020R8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bd\u0010e\u001a\u0004\bf\u0010gR$\u0010m\u001a\u00020\u00022\u0006\u0010h\u001a\u00020\u00028\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bi\u0010j\u001a\u0004\bk\u0010lR$\u0010p\u001a\u00020\u00022\u0006\u0010h\u001a\u00020\u00028\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bn\u0010j\u001a\u0004\bo\u0010lR$\u0010\u0012\u001a\u00020\u00022\u0006\u0010h\u001a\u00020\u00028\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bq\u0010j\u001a\u0004\br\u0010lR$\u0010w\u001a\u00020\u00042\u0006\u0010h\u001a\u00020\u00048\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bs\u0010t\u001a\u0004\bu\u0010vR\u0011\u0010x\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\bx\u0010vR\u0011\u0010z\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\by\u0010lR\u0011\u0010\u0005\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010vR\u0011\u0010|\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b{\u0010vR\u0011\u0010~\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b}\u0010vR\u0015\u0010\u0080\u0001\u001a\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u007f\u0010l¨\u0006\u0084\u0001"}, d2 = {"Landroidx/compose/runtime/SlotWriter;", "", "", FirebaseAnalytics.Param.INDEX, "", "isNode", "nodeCount", "groupKey", "groupObjectKey", "groupSize", "groupAux", "indexInParent", "indexInCurrentGroup", "group", "indexInGroup", "node", "Landroidx/compose/runtime/Anchor;", "anchor", "parent", "normalClose", "", HearingDisabilitiesConstants.CLOSE_MODAL, "reset", "value", "update", "appendSlot", "count", "trimTailSlots", "updateAux", "insertAux", "updateToTableMaps", "", "sourceInformation", "recordGroupSourceInformation", "key", "recordGrouplessCallSourceInformationStart", "recordGrouplessCallSourceInformationEnd", "updateNode", "updateParentNode", SetCommand.ID, "slotIndexOfGroupSlotIndex", "skip", "slot", "groupIndex", "Lkotlin/Function2;", "block", "forEachTailSlot", "slotsStartIndex$runtime_release", "(I)I", "slotsStartIndex", "slotsEndIndex$runtime_release", "slotsEndIndex", "slotsEndAllIndex$runtime_release", "slotsEndAllIndex", PushConstants.AMOUNT, "advanceBy", "seek", "skipToGroupEnd", "beginInsert", "endInsert", "startGroup", "dataKey", "objectKey", "startNode", "aux", "startData", "endGroup", "ensureStarted", "skipGroup", "removeGroup", "", "groupSlots", "Lkotlin/ParameterName;", "name", "data", "forEachData", "forAllData", TypedValues.CycleType.S_WAVE_OFFSET, "moveGroup", "writer", "", "moveTo", "Landroidx/compose/runtime/SlotTable;", "table", "removeSourceGroup", "moveFrom", "bashCurrentGroup", "moveIntoGroupFrom", "markGroup", "anchorIndex", "toString", "tryAnchor$runtime_release", "(I)Landroidx/compose/runtime/Anchor;", "tryAnchor", "toDebugString", "verifyDataAnchors$runtime_release", "()V", "verifyDataAnchors", "verifyParentAnchors$runtime_release", "verifyParentAnchors", "a", "Landroidx/compose/runtime/SlotTable;", "getTable$runtime_release", "()Landroidx/compose/runtime/SlotTable;", "<set-?>", "s", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getCurrentGroup", "()I", "currentGroup", "t", "getCurrentGroupEnd", "currentGroupEnd", "u", "getParent", SharedPrefsStorage.VERSION_KEY, "Z", "getClosed", "()Z", "closed", "isGroupEnd", "getSlotsSize", "slotsSize", "getCollectingSourceInformation", "collectingSourceInformation", "getCollectingCalledInformation", "collectingCalledInformation", "getSize$runtime_release", "size", "<init>", "(Landroidx/compose/runtime/SlotTable;)V", "Companion", "runtime_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nSlotTable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SlotTable.kt\nandroidx/compose/runtime/SlotWriter\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Preconditions.kt\nandroidx/compose/runtime/PreconditionsKt\n+ 4 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 5 SlotTable.kt\nandroidx/compose/runtime/SlotTable\n+ 6 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 7 SlotTable.kt\nandroidx/compose/runtime/SlotTableKt\n+ 8 ListUtils.kt\nandroidx/compose/runtime/snapshots/ListUtilsKt\n*L\n1#1,4151:1\n4553#2,7:4152\n4553#2,7:4159\n4553#2,7:4166\n4553#2,7:4173\n4553#2,7:4180\n4553#2,7:4201\n4553#2,7:4208\n4553#2,7:4215\n4553#2,7:4229\n4553#2,7:4243\n4553#2,7:4250\n4553#2,7:4257\n4553#2,7:4264\n4553#2,7:4271\n4553#2,7:4278\n4553#2,7:4285\n4553#2,7:4292\n4553#2,7:4299\n4553#2,7:4306\n4553#2,7:4338\n4553#2,7:4345\n4553#2,7:4352\n50#3,7:4187\n50#3,7:4222\n50#3,7:4236\n50#3,7:4365\n50#3,7:4372\n50#3,7:4379\n50#3,7:4386\n50#3,7:4393\n50#3,7:4400\n361#4,7:4194\n174#5,5:4313\n180#5,3:4319\n174#5,5:4322\n180#5,3:4328\n1#6:4318\n1#6:4327\n1#6:4337\n4018#7,6:4331\n33#8,6:4359\n82#8,3:4407\n33#8,4:4410\n85#8,2:4414\n38#8:4416\n87#8:4417\n231#8,3:4418\n64#8,4:4421\n234#8,2:4425\n69#8:4427\n236#8:4428\n*S KotlinDebug\n*F\n+ 1 SlotTable.kt\nandroidx/compose/runtime/SlotWriter\n*L\n1632#1:4152,7\n1655#1:4159,7\n1691#1:4166,7\n1704#1:4173,7\n1707#1:4180,7\n1796#1:4201,7\n1817#1:4208,7\n1903#1:4215,7\n1908#1:4229,7\n1948#1:4243,7\n1959#1:4250,7\n2115#1:4257,7\n2179#1:4264,7\n2184#1:4271,7\n2216#1:4278,7\n2288#1:4285,7\n2289#1:4292,7\n2302#1:4299,7\n2397#1:4306,7\n2962#1:4338,7\n2974#1:4345,7\n3184#1:4352,7\n1717#1:4187,7\n1904#1:4222,7\n1946#1:4236,7\n3376#1:4365,7\n3380#1:4372,7\n3384#1:4379,7\n3400#1:4386,7\n3408#1:4393,7\n3412#1:4400,7\n1759#1:4194,7\n2706#1:4313,5\n2706#1:4319,3\n2747#1:4322,5\n2747#1:4328,3\n2706#1:4318\n2747#1:4327\n2767#1:4331,6\n3285#1:4359,6\n3456#1:4407,3\n3456#1:4410,4\n3456#1:4414,2\n3456#1:4416\n3456#1:4417\n3459#1:4418,3\n3459#1:4421,4\n3459#1:4425,2\n3459#1:4427\n3459#1:4428\n*E\n"})
public final class SlotWriter {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final SlotTable table;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public int[] f14760b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public Object[] f14761c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public ArrayList<Anchor> f14762d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public HashMap<Anchor, GroupSourceInformation> f14763e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public MutableIntObjectMap<MutableIntSet> f14764f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f14765g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f14766h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f14767i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f14768j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f14769k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f14770l;
    public int m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f14771n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f14772o;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    public int currentGroup;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    public int currentGroupEnd;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    public boolean closed;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @Nullable
    public PrioritySet f14780w;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    public final IntStack f14773p = new IntStack();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NotNull
    public final IntStack f14774q = new IntStack();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @NotNull
    public final IntStack f14775r = new IntStack();

    /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata */
    public int parent = -1;

    /* JADX INFO: compiled from: SlotTable.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/runtime/SlotWriter$Companion;", "", "<init>", "()V", "runtime_release"}, k = 1, mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nSlotTable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SlotTable.kt\nandroidx/compose/runtime/SlotWriter$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 ListUtils.kt\nandroidx/compose/runtime/snapshots/ListUtilsKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,4151:1\n1#2:4152\n33#3,6:4153\n4553#4,7:4159\n*S KotlinDebug\n*F\n+ 1 SlotTable.kt\nandroidx/compose/runtime/SlotWriter$Companion\n*L\n2527#1:4153,6\n2583#1:4159,7\n*E\n"})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static List a(SlotWriter slotWriter, int i10, SlotWriter slotWriter2, boolean z10, boolean z11, boolean z12) {
            boolean z13;
            List listEmptyList;
            int iGroupSize = slotWriter.groupSize(i10);
            int i11 = i10 + iGroupSize;
            int iAccess$dataIndex = SlotWriter.access$dataIndex(slotWriter, i10);
            int iAccess$dataIndex2 = SlotWriter.access$dataIndex(slotWriter, i11);
            int i12 = iAccess$dataIndex2 - iAccess$dataIndex;
            boolean zAccess$containsAnyGroupMarks = SlotWriter.access$containsAnyGroupMarks(slotWriter, i10);
            slotWriter2.h(iGroupSize);
            slotWriter2.i(i12, slotWriter2.getCurrentGroup());
            if (slotWriter.f14765g < i11) {
                slotWriter.j(i11);
            }
            if (slotWriter.f14769k < iAccess$dataIndex2) {
                slotWriter.k(iAccess$dataIndex2, i11);
            }
            int[] iArr = slotWriter2.f14760b;
            int currentGroup = slotWriter2.getCurrentGroup();
            ArraysKt___ArraysJvmKt.copyInto(slotWriter.f14760b, iArr, currentGroup * 5, i10 * 5, i11 * 5);
            Object[] objArr = slotWriter2.f14761c;
            int i13 = slotWriter2.f14767i;
            ArraysKt___ArraysJvmKt.copyInto(slotWriter.f14761c, objArr, i13, iAccess$dataIndex, iAccess$dataIndex2);
            int parent = slotWriter2.getParent();
            SlotTableKt.access$updateParentAnchor(iArr, currentGroup, parent);
            int i14 = currentGroup - i10;
            int i15 = currentGroup + iGroupSize;
            int iAccess$dataIndex3 = i13 - SlotWriter.access$dataIndex(slotWriter2, iArr, currentGroup);
            int i16 = slotWriter2.m;
            int i17 = slotWriter2.f14770l;
            int length = objArr.length;
            int i18 = i16;
            int i19 = currentGroup;
            while (true) {
                z13 = 0;
                if (i19 >= i15) {
                    break;
                }
                if (i19 != currentGroup) {
                    SlotTableKt.access$updateParentAnchor(iArr, i19, SlotTableKt.access$parentAnchor(iArr, i19) + i14);
                }
                int i20 = iAccess$dataIndex3;
                SlotTableKt.access$updateDataAnchor(iArr, i19, SlotWriter.access$dataIndexToDataAnchor(slotWriter2, SlotWriter.access$dataIndex(slotWriter2, iArr, i19) + iAccess$dataIndex3, i18 >= i19 ? slotWriter2.f14769k : 0, i17, length));
                if (i19 == i18) {
                    i18++;
                }
                i19++;
                iAccess$dataIndex3 = i20;
                i15 = i15;
            }
            int i21 = i15;
            slotWriter2.m = i18;
            int iAccess$locationOf = SlotTableKt.access$locationOf(slotWriter.f14762d, i10, slotWriter.getSize$runtime_release());
            int iAccess$locationOf2 = SlotTableKt.access$locationOf(slotWriter.f14762d, i11, slotWriter.getSize$runtime_release());
            if (iAccess$locationOf < iAccess$locationOf2) {
                ArrayList arrayList = slotWriter.f14762d;
                ArrayList arrayList2 = new ArrayList(iAccess$locationOf2 - iAccess$locationOf);
                for (int i22 = iAccess$locationOf; i22 < iAccess$locationOf2; i22++) {
                    Anchor anchor = (Anchor) arrayList.get(i22);
                    anchor.setLocation$runtime_release(anchor.getLocation() + i14);
                    arrayList2.add(anchor);
                }
                slotWriter2.f14762d.addAll(SlotTableKt.access$locationOf(slotWriter2.f14762d, slotWriter2.getCurrentGroup(), slotWriter2.getSize$runtime_release()), arrayList2);
                arrayList.subList(iAccess$locationOf, iAccess$locationOf2).clear();
                listEmptyList = arrayList2;
            } else {
                listEmptyList = CollectionsKt__CollectionsKt.emptyList();
            }
            if (!listEmptyList.isEmpty()) {
                HashMap map = slotWriter.f14763e;
                HashMap map2 = slotWriter2.f14763e;
                if (map != null && map2 != null) {
                    int size = listEmptyList.size();
                    for (int i23 = 0; i23 < size; i23++) {
                        Anchor anchor2 = (Anchor) listEmptyList.get(i23);
                        GroupSourceInformation groupSourceInformation = (GroupSourceInformation) map.get(anchor2);
                        if (groupSourceInformation != null) {
                            map.remove(anchor2);
                            map2.put(anchor2, groupSourceInformation);
                        }
                    }
                }
            }
            int parent2 = slotWriter2.getParent();
            GroupSourceInformation groupSourceInformationQ = slotWriter2.q(parent);
            if (groupSourceInformationQ != null) {
                int iAccess$groupSize = parent2 + 1;
                int currentGroup2 = slotWriter2.getCurrentGroup();
                int i24 = -1;
                while (iAccess$groupSize < currentGroup2) {
                    i24 = iAccess$groupSize;
                    iAccess$groupSize = SlotTableKt.access$groupSize(slotWriter2.f14760b, iAccess$groupSize) + iAccess$groupSize;
                }
                groupSourceInformationQ.addGroupAfter(slotWriter2, i24, currentGroup2);
            }
            int iParent = slotWriter.parent(i10);
            if (z12) {
                if (z10) {
                    boolean z14 = iParent >= 0;
                    if (z14) {
                        slotWriter.startGroup();
                        slotWriter.advanceBy(iParent - slotWriter.getCurrentGroup());
                        slotWriter.startGroup();
                    }
                    slotWriter.advanceBy(i10 - slotWriter.getCurrentGroup());
                    boolean zRemoveGroup = slotWriter.removeGroup();
                    if (z14) {
                        slotWriter.skipToGroupEnd();
                        slotWriter.endGroup();
                        slotWriter.skipToGroupEnd();
                        slotWriter.endGroup();
                    }
                    z13 = zRemoveGroup;
                } else {
                    boolean zN = slotWriter.n(i10, iGroupSize);
                    slotWriter.o(iAccess$dataIndex, i12, i10 - 1);
                    z13 = zN;
                }
            }
            if ((!z13) == 0) {
                ComposerKt.composeImmediateRuntimeError("Unexpectedly removed anchors");
            }
            slotWriter2.f14772o += SlotTableKt.access$isNode(iArr, currentGroup) ? 1 : SlotTableKt.access$nodeCount(iArr, currentGroup);
            if (z11) {
                slotWriter2.currentGroup = i21;
                slotWriter2.f14767i = i13 + i12;
            }
            if (zAccess$containsAnyGroupMarks) {
                slotWriter2.s(parent);
            }
            return listEmptyList;
        }

        public static final /* synthetic */ List access$moveGroup(Companion companion, SlotWriter slotWriter, int i10, SlotWriter slotWriter2, boolean z10, boolean z11, boolean z12) {
            companion.getClass();
            return a(slotWriter, i10, slotWriter2, z10, z11, z12);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.runtime.SlotWriter$groupSlots$1, reason: invalid class name */
    /* JADX INFO: compiled from: SlotTable.kt */
    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0010(\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001J\t\u0010\u0004\u001a\u00020\u0003H\u0096\u0002J\u000b\u0010\u0005\u001a\u0004\u0018\u00010\u0002H\u0096\u0002R\"\u0010\r\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"androidx/compose/runtime/SlotWriter$groupSlots$1", "", "", "", "hasNext", "next", "", "p0", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getCurrent", "()I", "setCurrent", "(I)V", "current", "runtime_release"}, k = 1, mv = {1, 8, 0})
    public static final class AnonymousClass1 implements Iterator<Object>, KMappedMarker {

        /* JADX INFO: renamed from: p0, reason: collision with root package name and from kotlin metadata */
        public int current;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ int f14782q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ SlotWriter f14783r0;

        public AnonymousClass1(SlotWriter slotWriter, int i10, int i11) {
            this.f14782q0 = i11;
            this.f14783r0 = slotWriter;
            this.current = i10;
        }

        public final int getCurrent() {
            return this.current;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.current < this.f14782q0;
        }

        @Override // java.util.Iterator
        @Nullable
        public Object next() {
            if (!hasNext()) {
                return null;
            }
            SlotWriter slotWriter = this.f14783r0;
            Object[] objArr = slotWriter.f14761c;
            int i10 = this.current;
            this.current = i10 + 1;
            return objArr[slotWriter.b(i10)];
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public final void setCurrent(int i10) {
            this.current = i10;
        }
    }

    public SlotWriter(@NotNull SlotTable slotTable) {
        this.table = slotTable;
        this.f14760b = slotTable.getGroups();
        this.f14761c = slotTable.getSlots();
        this.f14762d = slotTable.getAnchors$runtime_release();
        this.f14763e = slotTable.getSourceInformationMap$runtime_release();
        this.f14764f = slotTable.getCalledByMap$runtime_release();
        this.f14765g = slotTable.getGroupsSize();
        this.f14766h = (this.f14760b.length / 5) - slotTable.getGroupsSize();
        this.f14769k = slotTable.getSlotsSize();
        this.f14770l = this.f14761c.length - slotTable.getSlotsSize();
        this.m = slotTable.getGroupsSize();
        this.currentGroupEnd = slotTable.getGroupsSize();
    }

    public static final boolean access$containsAnyGroupMarks(SlotWriter slotWriter, int i10) {
        if (i10 < 0) {
            slotWriter.getClass();
        } else if (SlotTableKt.access$containsAnyMark(slotWriter.f14760b, slotWriter.f(i10))) {
            return true;
        }
        return false;
    }

    public static final /* synthetic */ int access$dataIndex(SlotWriter slotWriter, int[] iArr, int i10) {
        return slotWriter.a(i10, iArr);
    }

    public static final /* synthetic */ int access$dataIndexToDataAnchor(SlotWriter slotWriter, int i10, int i11, int i12, int i13) {
        slotWriter.getClass();
        return c(i10, i11, i12, i13);
    }

    public static final /* synthetic */ int access$slotIndex(SlotWriter slotWriter, int[] iArr, int i10) {
        return slotWriter.p(i10, iArr);
    }

    public static /* synthetic */ Anchor anchor$default(SlotWriter slotWriter, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = slotWriter.currentGroup;
        }
        return slotWriter.anchor(i10);
    }

    public static int c(int i10, int i11, int i12, int i13) {
        return i10 > i11 ? -(((i13 - i12) - i10) + 1) : i10;
    }

    public static /* synthetic */ void markGroup$default(SlotWriter slotWriter, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = slotWriter.parent;
        }
        slotWriter.markGroup(i10);
    }

    public static /* synthetic */ List moveFrom$default(SlotWriter slotWriter, SlotTable slotTable, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            z10 = true;
        }
        return slotWriter.moveFrom(slotTable, i10, z10);
    }

    public final int a(int i10, int[] iArr) {
        if (i10 >= e()) {
            return this.f14761c.length - this.f14770l;
        }
        int iAccess$dataAnchor = SlotTableKt.access$dataAnchor(iArr, i10);
        return iAccess$dataAnchor < 0 ? (this.f14761c.length - this.f14770l) + iAccess$dataAnchor + 1 : iAccess$dataAnchor;
    }

    public final void advanceBy(int amount) {
        boolean z10 = false;
        if (!(amount >= 0)) {
            ComposerKt.composeImmediateRuntimeError("Cannot seek backwards");
        }
        if (!(this.f14771n <= 0)) {
            PreconditionsKt.throwIllegalStateException("Cannot call seek() while inserting");
        }
        if (amount == 0) {
            return;
        }
        int i10 = this.currentGroup + amount;
        if (i10 >= this.parent && i10 <= this.currentGroupEnd) {
            z10 = true;
        }
        if (!z10) {
            ComposerKt.composeImmediateRuntimeError("Cannot seek outside the current group (" + this.parent + '-' + this.currentGroupEnd + RootService.CLOSE_BRACKET);
        }
        this.currentGroup = i10;
        int iA = a(f(i10), this.f14760b);
        this.f14767i = iA;
        this.f14768j = iA;
    }

    @NotNull
    public final Anchor anchor(int index) {
        ArrayList<Anchor> arrayList = this.f14762d;
        int iB = SlotTableKt.b(arrayList, index, getSize$runtime_release());
        if (iB >= 0) {
            return arrayList.get(iB);
        }
        if (index > this.f14765g) {
            index = -(getSize$runtime_release() - index);
        }
        Anchor anchor = new Anchor(index);
        arrayList.add(-(iB + 1), anchor);
        return anchor;
    }

    public final int anchorIndex(@NotNull Anchor anchor) {
        int location$runtime_release = anchor.getLocation();
        return location$runtime_release < 0 ? location$runtime_release + getSize$runtime_release() : location$runtime_release;
    }

    public final void appendSlot(@NotNull Anchor anchor, @Nullable Object value) {
        if (!(this.f14771n == 0)) {
            ComposerKt.composeImmediateRuntimeError("Can only append a slot if not current inserting");
        }
        int i10 = this.f14767i;
        int i11 = this.f14768j;
        int iAnchorIndex = anchorIndex(anchor);
        int iA = a(f(iAnchorIndex + 1), this.f14760b);
        this.f14767i = iA;
        this.f14768j = iA;
        i(1, iAnchorIndex);
        if (i10 >= iA) {
            i10++;
            i11++;
        }
        this.f14761c[iA] = value;
        this.f14767i = i10;
        this.f14768j = i11;
    }

    public final int b(int i10) {
        return i10 < this.f14769k ? i10 : i10 + this.f14770l;
    }

    public final void bashCurrentGroup() {
        SlotTableKt.access$updateGroupKey(this.f14760b, this.currentGroup, -3);
    }

    public final void beginInsert() {
        int i10 = this.f14771n;
        this.f14771n = i10 + 1;
        if (i10 == 0) {
            this.f14774q.push((e() - this.f14766h) - this.currentGroupEnd);
        }
    }

    public final void close(boolean normalClose) {
        this.closed = true;
        if (normalClose && this.f14773p.isEmpty()) {
            j(getSize$runtime_release());
            k(this.f14761c.length - this.f14770l, this.f14765g);
            int i10 = this.f14769k;
            ArraysKt___ArraysJvmKt.fill(this.f14761c, (Object) null, i10, this.f14770l + i10);
            m();
        }
        this.table.close$runtime_release(this, this.f14760b, this.f14765g, this.f14761c, this.f14769k, this.f14762d, this.f14763e, this.f14764f);
    }

    public final void d(int i10, int i11, int i12) {
        if (i10 >= this.f14765g) {
            i10 = -((getSize$runtime_release() - i10) + 2);
        }
        while (i12 < i11) {
            SlotTableKt.access$updateParentAnchor(this.f14760b, f(i12), i10);
            int iAccess$groupSize = SlotTableKt.access$groupSize(this.f14760b, f(i12)) + i12;
            d(i12, iAccess$groupSize, i12 + 1);
            i12 = iAccess$groupSize;
        }
    }

    public final int e() {
        return this.f14760b.length / 5;
    }

    public final int endGroup() {
        boolean z10 = this.f14771n > 0;
        int i10 = this.currentGroup;
        int i11 = this.currentGroupEnd;
        int i12 = this.parent;
        int iF = f(i12);
        int i13 = this.f14772o;
        int i14 = i10 - i12;
        boolean zAccess$isNode = SlotTableKt.access$isNode(this.f14760b, iF);
        IntStack intStack = this.f14775r;
        if (z10) {
            SlotTableKt.access$updateGroupSize(this.f14760b, iF, i14);
            SlotTableKt.access$updateNodeCount(this.f14760b, iF, i13);
            this.f14772o = intStack.pop() + (zAccess$isNode ? 1 : i13);
            int iL = l(SlotTableKt.access$parentAnchor(this.f14760b, f(i12)));
            this.parent = iL;
            int size$runtime_release = iL < 0 ? getSize$runtime_release() : f(iL + 1);
            int iA = size$runtime_release >= 0 ? a(size$runtime_release, this.f14760b) : 0;
            this.f14767i = iA;
            this.f14768j = iA;
        } else {
            if (i10 != i11) {
                ComposerKt.composeImmediateRuntimeError("Expected to be at the end of a group");
            }
            int iAccess$groupSize = SlotTableKt.access$groupSize(this.f14760b, iF);
            int iAccess$nodeCount = SlotTableKt.access$nodeCount(this.f14760b, iF);
            SlotTableKt.access$updateGroupSize(this.f14760b, iF, i14);
            SlotTableKt.access$updateNodeCount(this.f14760b, iF, i13);
            int iPop = this.f14773p.pop();
            this.currentGroupEnd = (e() - this.f14766h) - this.f14774q.pop();
            this.parent = iPop;
            int iL2 = l(SlotTableKt.access$parentAnchor(this.f14760b, f(i12)));
            int iPop2 = intStack.pop();
            this.f14772o = iPop2;
            if (iL2 == iPop) {
                this.f14772o = iPop2 + (zAccess$isNode ? 0 : i13 - iAccess$nodeCount);
            } else {
                int i15 = i14 - iAccess$groupSize;
                int i16 = zAccess$isNode ? 0 : i13 - iAccess$nodeCount;
                if (i15 != 0 || i16 != 0) {
                    while (iL2 != 0 && iL2 != iPop && (i16 != 0 || i15 != 0)) {
                        int iF2 = f(iL2);
                        if (i15 != 0) {
                            SlotTableKt.access$updateGroupSize(this.f14760b, iF2, SlotTableKt.access$groupSize(this.f14760b, iF2) + i15);
                        }
                        if (i16 != 0) {
                            int[] iArr = this.f14760b;
                            SlotTableKt.access$updateNodeCount(iArr, iF2, SlotTableKt.access$nodeCount(iArr, iF2) + i16);
                        }
                        if (SlotTableKt.access$isNode(this.f14760b, iF2)) {
                            i16 = 0;
                        }
                        iL2 = l(SlotTableKt.access$parentAnchor(this.f14760b, f(iL2)));
                    }
                }
                this.f14772o += i16;
            }
        }
        return i13;
    }

    public final void endInsert() {
        if (this.f14771n <= 0) {
            PreconditionsKt.throwIllegalStateException("Unbalanced begin/end insert");
        }
        int i10 = this.f14771n - 1;
        this.f14771n = i10;
        if (i10 == 0) {
            if (this.f14775r.getF14573b() != this.f14773p.getF14573b()) {
                ComposerKt.composeImmediateRuntimeError("startGroup/endGroup mismatch while inserting");
            }
            this.currentGroupEnd = (e() - this.f14766h) - this.f14774q.pop();
        }
    }

    public final void ensureStarted(int index) {
        boolean z10 = false;
        if (!(this.f14771n <= 0)) {
            ComposerKt.composeImmediateRuntimeError("Cannot call ensureStarted() while inserting");
        }
        int i10 = this.parent;
        if (i10 != index) {
            if (index >= i10 && index < this.currentGroupEnd) {
                z10 = true;
            }
            if (!z10) {
                ComposerKt.composeImmediateRuntimeError("Started group at " + index + " must be a subgroup of the group at " + i10);
            }
            int i11 = this.currentGroup;
            int i12 = this.f14767i;
            int i13 = this.f14768j;
            this.currentGroup = index;
            startGroup();
            this.currentGroup = i11;
            this.f14767i = i12;
            this.f14768j = i13;
        }
    }

    public final int f(int i10) {
        return i10 < this.f14765g ? i10 : i10 + this.f14766h;
    }

    public final void forAllData(int group, @NotNull Function2<? super Integer, Object, Unit> block) {
        int iAccess$dataIndex = access$dataIndex(this, this.f14760b, f(groupSize(getCurrentGroup()) + getCurrentGroup()));
        for (int iAccess$dataIndex2 = access$dataIndex(this, this.f14760b, f(group)); iAccess$dataIndex2 < iAccess$dataIndex; iAccess$dataIndex2++) {
            block.invoke(Integer.valueOf(iAccess$dataIndex2), this.f14761c[b(iAccess$dataIndex2)]);
        }
    }

    public final void forEachData(int group, @NotNull Function2<? super Integer, Object, Unit> block) {
        int iAccess$slotIndex = access$slotIndex(this, this.f14760b, f(group));
        int iAccess$dataIndex = access$dataIndex(this, this.f14760b, f(group + 1));
        for (int i10 = iAccess$slotIndex; i10 < iAccess$dataIndex; i10++) {
            block.invoke(Integer.valueOf(i10 - iAccess$slotIndex), this.f14761c[b(i10)]);
        }
    }

    public final void forEachTailSlot(int groupIndex, int count, @NotNull Function2<? super Integer, Object, Unit> block) {
        int iSlotsStartIndex$runtime_release = slotsStartIndex$runtime_release(groupIndex);
        int iSlotsEndIndex$runtime_release = slotsEndIndex$runtime_release(groupIndex);
        for (int iMax = Math.max(iSlotsStartIndex$runtime_release, iSlotsEndIndex$runtime_release - count); iMax < iSlotsEndIndex$runtime_release; iMax++) {
            block.invoke(Integer.valueOf(iMax), this.f14761c[b(iMax)]);
        }
    }

    public final GroupSourceInformation g(int i10, String str) {
        HashMap<Anchor, GroupSourceInformation> map = this.f14763e;
        if (map == null) {
            return null;
        }
        Anchor anchor = anchor(i10);
        GroupSourceInformation groupSourceInformation = map.get(anchor);
        if (groupSourceInformation == null) {
            groupSourceInformation = new GroupSourceInformation(0, str, 0);
            if (str == null) {
                int iAccess$groupSize = i10 + 1;
                int i11 = this.currentGroup;
                while (iAccess$groupSize < i11) {
                    groupSourceInformation.reportGroup(this, iAccess$groupSize);
                    iAccess$groupSize += SlotTableKt.access$groupSize(this.f14760b, iAccess$groupSize);
                }
            }
            map.put(anchor, groupSourceInformation);
        }
        return groupSourceInformation;
    }

    public final boolean getClosed() {
        return this.closed;
    }

    public final boolean getCollectingCalledInformation() {
        return this.f14764f != null;
    }

    public final boolean getCollectingSourceInformation() {
        return this.f14763e != null;
    }

    public final int getCurrentGroup() {
        return this.currentGroup;
    }

    public final int getCurrentGroupEnd() {
        return this.currentGroupEnd;
    }

    public final int getParent() {
        return this.parent;
    }

    public final int getSize$runtime_release() {
        return e() - this.f14766h;
    }

    public final int getSlotsSize() {
        return this.f14761c.length - this.f14770l;
    }

    @NotNull
    /* JADX INFO: renamed from: getTable$runtime_release, reason: from getter */
    public final SlotTable getTable() {
        return this.table;
    }

    @Nullable
    public final Object groupAux(int index) {
        int iF = f(index);
        if (!SlotTableKt.access$hasAux(this.f14760b, iF)) {
            return Composer.INSTANCE.getEmpty();
        }
        Object[] objArr = this.f14761c;
        int[] iArr = this.f14760b;
        return objArr[SlotTableKt.a(SlotTableKt.access$groupInfo(iArr, iF) >> 29) + a(iF, iArr)];
    }

    public final int groupKey(int index) {
        return SlotTableKt.access$key(this.f14760b, f(index));
    }

    @Nullable
    public final Object groupObjectKey(int index) {
        int iF = f(index);
        if (SlotTableKt.access$hasObjectKey(this.f14760b, iF)) {
            return this.f14761c[SlotTableKt.access$objectKeyIndex(this.f14760b, iF)];
        }
        return null;
    }

    public final int groupSize(int index) {
        return SlotTableKt.access$groupSize(this.f14760b, f(index));
    }

    @NotNull
    public final Iterator<Object> groupSlots() {
        int iA = a(f(this.currentGroup), this.f14760b);
        int[] iArr = this.f14760b;
        int i10 = this.currentGroup;
        return new AnonymousClass1(this, iA, a(f(groupSize(i10) + i10), iArr));
    }

    public final void h(int i10) {
        if (i10 > 0) {
            int i11 = this.currentGroup;
            j(i11);
            int i12 = this.f14765g;
            int i13 = this.f14766h;
            int[] iArr = this.f14760b;
            int length = iArr.length / 5;
            int i14 = length - i13;
            if (i13 < i10) {
                int iMax = Math.max(Math.max(length * 2, i14 + i10), 32);
                int[] iArr2 = new int[iMax * 5];
                int i15 = iMax - i14;
                ArraysKt___ArraysJvmKt.copyInto(iArr, iArr2, 0, 0, i12 * 5);
                ArraysKt___ArraysJvmKt.copyInto(iArr, iArr2, (i12 + i15) * 5, (i13 + i12) * 5, length * 5);
                this.f14760b = iArr2;
                i13 = i15;
            }
            int i16 = this.currentGroupEnd;
            if (i16 >= i12) {
                this.currentGroupEnd = i16 + i10;
            }
            int i17 = i12 + i10;
            this.f14765g = i17;
            this.f14766h = i13 - i10;
            int iC = c(i14 > 0 ? a(f(i11 + i10), this.f14760b) : 0, this.m >= i12 ? this.f14769k : 0, this.f14770l, this.f14761c.length);
            for (int i18 = i12; i18 < i17; i18++) {
                SlotTableKt.access$updateDataAnchor(this.f14760b, i18, iC);
            }
            int i19 = this.m;
            if (i19 >= i12) {
                this.m = i19 + i10;
            }
        }
    }

    public final void i(int i10, int i11) {
        if (i10 > 0) {
            k(this.f14767i, i11);
            int i12 = this.f14769k;
            int i13 = this.f14770l;
            if (i13 < i10) {
                Object[] objArr = this.f14761c;
                int length = objArr.length;
                int i14 = length - i13;
                int iMax = Math.max(Math.max(length * 2, i14 + i10), 32);
                Object[] objArr2 = new Object[iMax];
                for (int i15 = 0; i15 < iMax; i15++) {
                    objArr2[i15] = null;
                }
                int i16 = iMax - i14;
                ArraysKt___ArraysJvmKt.copyInto(objArr, objArr2, 0, 0, i12);
                ArraysKt___ArraysJvmKt.copyInto(objArr, objArr2, i12 + i16, i13 + i12, length);
                this.f14761c = objArr2;
                i13 = i16;
            }
            int i17 = this.f14768j;
            if (i17 >= i12) {
                this.f14768j = i17 + i10;
            }
            this.f14769k = i12 + i10;
            this.f14770l = i13 - i10;
        }
    }

    public final boolean indexInCurrentGroup(int index) {
        return indexInGroup(index, this.currentGroup);
    }

    public final boolean indexInGroup(int index, int group) {
        int iIndexOf;
        int iE;
        if (group == this.parent) {
            iE = this.currentGroupEnd;
        } else {
            IntStack intStack = this.f14773p;
            if (group <= intStack.peekOr(0) && (iIndexOf = intStack.indexOf(group)) >= 0) {
                iE = (e() - this.f14766h) - this.f14774q.peek(iIndexOf);
            } else {
                int iGroupSize = groupSize(group);
                iE = iGroupSize + group;
            }
        }
        return index > group && index < iE;
    }

    public final boolean indexInParent(int index) {
        int i10 = this.parent;
        return (index > i10 && index < this.currentGroupEnd) || (i10 == 0 && index == 0);
    }

    public final void insertAux(@Nullable Object value) {
        if (this.f14771n < 0) {
            ComposerKt.composeImmediateRuntimeError("Cannot insert auxiliary data when not inserting");
        }
        int i10 = this.parent;
        int iF = f(i10);
        if (!(!SlotTableKt.access$hasAux(this.f14760b, iF))) {
            ComposerKt.composeImmediateRuntimeError("Group already has auxiliary data");
        }
        i(1, i10);
        int[] iArr = this.f14760b;
        int iA = SlotTableKt.a(SlotTableKt.access$groupInfo(iArr, iF) >> 29) + a(iF, iArr);
        int iB = b(iA);
        int i11 = this.f14767i;
        if (i11 > iA) {
            int i12 = i11 - iA;
            if (i12 >= 3) {
                PreconditionsKt.throwIllegalStateException("Moving more than two slot not supported");
            }
            if (i12 > 1) {
                Object[] objArr = this.f14761c;
                objArr[iB + 2] = objArr[iB + 1];
            }
            Object[] objArr2 = this.f14761c;
            objArr2[iB + 1] = objArr2[iB];
        }
        SlotTableKt.access$addAux(this.f14760b, iF);
        this.f14761c[iB] = value;
        this.f14767i++;
    }

    public final boolean isGroupEnd() {
        return this.currentGroup == this.currentGroupEnd;
    }

    public final boolean isNode() {
        int i10 = this.currentGroup;
        return i10 < this.currentGroupEnd && SlotTableKt.access$isNode(this.f14760b, f(i10));
    }

    public final void j(int i10) {
        Anchor anchor;
        int location$runtime_release;
        Anchor anchor2;
        int location$runtime_release2;
        int i11;
        int i12 = this.f14766h;
        int i13 = this.f14765g;
        if (i13 != i10) {
            if (!this.f14762d.isEmpty()) {
                int iE = e() - this.f14766h;
                if (i13 < i10) {
                    for (int iAccess$locationOf = SlotTableKt.access$locationOf(this.f14762d, i13, iE); iAccess$locationOf < this.f14762d.size() && (location$runtime_release2 = (anchor2 = this.f14762d.get(iAccess$locationOf)).getLocation()) < 0 && (i11 = location$runtime_release2 + iE) < i10; iAccess$locationOf++) {
                        anchor2.setLocation$runtime_release(i11);
                    }
                } else {
                    for (int iAccess$locationOf2 = SlotTableKt.access$locationOf(this.f14762d, i10, iE); iAccess$locationOf2 < this.f14762d.size() && (location$runtime_release = (anchor = this.f14762d.get(iAccess$locationOf2)).getLocation()) >= 0; iAccess$locationOf2++) {
                        anchor.setLocation$runtime_release(-(iE - location$runtime_release));
                    }
                }
            }
            if (i12 > 0) {
                int[] iArr = this.f14760b;
                int i14 = i10 * 5;
                int i15 = i12 * 5;
                int i16 = i13 * 5;
                if (i10 < i13) {
                    ArraysKt___ArraysJvmKt.copyInto(iArr, iArr, i15 + i14, i14, i16);
                } else {
                    ArraysKt___ArraysJvmKt.copyInto(iArr, iArr, i16, i16 + i15, i14 + i15);
                }
            }
            if (i10 < i13) {
                i13 = i10 + i12;
            }
            int iE2 = e();
            ComposerKt.runtimeCheck(i13 < iE2);
            while (i13 < iE2) {
                int iAccess$parentAnchor = SlotTableKt.access$parentAnchor(this.f14760b, i13);
                int iL = l(iAccess$parentAnchor);
                if (iL >= i10) {
                    iL = -((getSize$runtime_release() - iL) + 2);
                }
                if (iL != iAccess$parentAnchor) {
                    SlotTableKt.access$updateParentAnchor(this.f14760b, i13, iL);
                }
                i13++;
                if (i13 == i10) {
                    i13 += i12;
                }
            }
        }
        this.f14765g = i10;
    }

    public final void k(int i10, int i11) {
        int i12 = this.f14770l;
        int i13 = this.f14769k;
        int i14 = this.m;
        if (i13 != i10) {
            Object[] objArr = this.f14761c;
            if (i10 < i13) {
                ArraysKt___ArraysJvmKt.copyInto(objArr, objArr, i10 + i12, i10, i13);
            } else {
                ArraysKt___ArraysJvmKt.copyInto(objArr, objArr, i13, i13 + i12, i10 + i12);
            }
        }
        int iMin = Math.min(i11 + 1, getSize$runtime_release());
        if (i14 != iMin) {
            int length = this.f14761c.length - i12;
            if (iMin < i14) {
                int iF = f(iMin);
                int iF2 = f(i14);
                int i15 = this.f14765g;
                while (iF < iF2) {
                    int iAccess$dataAnchor = SlotTableKt.access$dataAnchor(this.f14760b, iF);
                    if (!(iAccess$dataAnchor >= 0)) {
                        ComposerKt.composeImmediateRuntimeError("Unexpected anchor value, expected a positive anchor");
                    }
                    SlotTableKt.access$updateDataAnchor(this.f14760b, iF, -((length - iAccess$dataAnchor) + 1));
                    iF++;
                    if (iF == i15) {
                        iF += this.f14766h;
                    }
                }
            } else {
                int iF3 = f(i14);
                int iF4 = f(iMin);
                while (iF3 < iF4) {
                    int iAccess$dataAnchor2 = SlotTableKt.access$dataAnchor(this.f14760b, iF3);
                    if (!(iAccess$dataAnchor2 < 0)) {
                        ComposerKt.composeImmediateRuntimeError("Unexpected anchor value, expected a negative anchor");
                    }
                    SlotTableKt.access$updateDataAnchor(this.f14760b, iF3, iAccess$dataAnchor2 + length + 1);
                    iF3++;
                    if (iF3 == this.f14765g) {
                        iF3 += this.f14766h;
                    }
                }
            }
            this.m = iMin;
        }
        this.f14769k = i10;
    }

    public final int l(int i10) {
        return i10 > -2 ? i10 : getSize$runtime_release() + i10 + 2;
    }

    public final void m() {
        boolean z10;
        PrioritySet prioritySet = this.f14780w;
        if (prioritySet != null) {
            while (prioritySet.isNotEmpty()) {
                int iTakeMax = prioritySet.takeMax();
                int iF = f(iTakeMax);
                int iGroupSize = iTakeMax + 1;
                int iGroupSize2 = groupSize(iTakeMax) + iTakeMax;
                while (true) {
                    if (iGroupSize >= iGroupSize2) {
                        z10 = false;
                        break;
                    } else {
                        if (SlotTableKt.access$containsAnyMark(this.f14760b, f(iGroupSize))) {
                            z10 = true;
                            break;
                        }
                        iGroupSize += groupSize(iGroupSize);
                    }
                }
                if (SlotTableKt.access$containsMark(this.f14760b, iF) != z10) {
                    SlotTableKt.access$updateContainsMark(this.f14760b, iF, z10);
                    int iParent = parent(iTakeMax);
                    if (iParent >= 0) {
                        prioritySet.add(iParent);
                    }
                }
            }
        }
    }

    public final void markGroup(int group) {
        int iF = f(group);
        if (SlotTableKt.access$hasMark(this.f14760b, iF)) {
            return;
        }
        SlotTableKt.access$updateMark(this.f14760b, iF, true);
        if (SlotTableKt.access$containsMark(this.f14760b, iF)) {
            return;
        }
        s(parent(group));
    }

    @NotNull
    public final List<Anchor> moveFrom(@NotNull SlotTable table, int index, boolean removeSourceGroup) {
        boolean z10 = false;
        ComposerKt.runtimeCheck(this.f14771n > 0 ? true : z10);
        if (index != 0 || this.currentGroup != 0 || this.table.getGroupsSize() != 0 || SlotTableKt.access$groupSize(table.getGroups(), index) != table.getGroupsSize()) {
            SlotWriter slotWriterOpenWriter = table.openWriter();
            try {
                return Companion.access$moveGroup(INSTANCE, slotWriterOpenWriter, index, this, true, true, removeSourceGroup);
            } finally {
                slotWriterOpenWriter.close(z10);
            }
        }
        int[] iArr = this.f14760b;
        Object[] objArr = this.f14761c;
        ArrayList<Anchor> arrayList = this.f14762d;
        HashMap<Anchor, GroupSourceInformation> map = this.f14763e;
        MutableIntObjectMap<MutableIntSet> mutableIntObjectMap = this.f14764f;
        int[] groups = table.getGroups();
        int groupsSize = table.getGroupsSize();
        Object[] slots = table.getSlots();
        int slotsSize = table.getSlotsSize();
        HashMap<Anchor, GroupSourceInformation> sourceInformationMap$runtime_release = table.getSourceInformationMap$runtime_release();
        MutableIntObjectMap<MutableIntSet> calledByMap$runtime_release = table.getCalledByMap$runtime_release();
        this.f14760b = groups;
        this.f14761c = slots;
        this.f14762d = table.getAnchors$runtime_release();
        this.f14765g = groupsSize;
        this.f14766h = (groups.length / 5) - groupsSize;
        this.f14769k = slotsSize;
        this.f14770l = slots.length - slotsSize;
        this.m = groupsSize;
        this.f14763e = sourceInformationMap$runtime_release;
        this.f14764f = calledByMap$runtime_release;
        table.setTo$runtime_release(iArr, 0, objArr, 0, arrayList, map, mutableIntObjectMap);
        return this.f14762d;
    }

    public final void moveGroup(int offset) {
        Anchor anchor;
        int iAnchorIndex;
        if (this.f14771n != 0) {
            ComposerKt.composeImmediateRuntimeError("Cannot move a group while inserting");
        }
        if (!(offset >= 0)) {
            ComposerKt.composeImmediateRuntimeError("Parameter offset is out of bounds");
        }
        if (offset == 0) {
            return;
        }
        int i10 = this.currentGroup;
        int i11 = this.parent;
        int i12 = this.currentGroupEnd;
        int iAccess$groupSize = i10;
        for (int i13 = offset; i13 > 0; i13--) {
            iAccess$groupSize += SlotTableKt.access$groupSize(this.f14760b, f(iAccess$groupSize));
            if (iAccess$groupSize > i12) {
                ComposerKt.composeImmediateRuntimeError("Parameter offset is out of bounds");
            }
        }
        int iAccess$groupSize2 = SlotTableKt.access$groupSize(this.f14760b, f(iAccess$groupSize));
        int iA = a(f(this.currentGroup), this.f14760b);
        int iA2 = a(f(iAccess$groupSize), this.f14760b);
        int i14 = iAccess$groupSize + iAccess$groupSize2;
        int iA3 = a(f(i14), this.f14760b);
        int i15 = iA3 - iA2;
        i(i15, Math.max(this.currentGroup - 1, 0));
        h(iAccess$groupSize2);
        int[] iArr = this.f14760b;
        int iF = f(i14) * 5;
        ArraysKt___ArraysJvmKt.copyInto(iArr, iArr, f(i10) * 5, iF, (iAccess$groupSize2 * 5) + iF);
        if (i15 > 0) {
            Object[] objArr = this.f14761c;
            ArraysKt___ArraysJvmKt.copyInto(objArr, objArr, iA, b(iA2 + i15), b(iA3 + i15));
        }
        int i16 = iA2 + i15;
        int i17 = i16 - iA;
        int i18 = this.f14769k;
        int i19 = this.f14770l;
        int length = this.f14761c.length;
        int i20 = this.m;
        int i21 = i10 + iAccess$groupSize2;
        int i22 = i10;
        while (i22 < i21) {
            int iF2 = f(i22);
            int i23 = i18;
            int i24 = i17;
            SlotTableKt.access$updateDataAnchor(iArr, iF2, c(c(a(iF2, iArr) - i17, i20 < iF2 ? 0 : i23, i19, length), this.f14769k, this.f14770l, this.f14761c.length));
            i22++;
            i18 = i23;
            i17 = i24;
            i19 = i19;
            length = length;
        }
        int i25 = i14 + iAccess$groupSize2;
        int size$runtime_release = getSize$runtime_release();
        int iAccess$locationOf = SlotTableKt.access$locationOf(this.f14762d, i14, size$runtime_release);
        ArrayList arrayList = new ArrayList();
        if (iAccess$locationOf >= 0) {
            while (iAccess$locationOf < this.f14762d.size() && (iAnchorIndex = anchorIndex((anchor = this.f14762d.get(iAccess$locationOf)))) >= i14 && iAnchorIndex < i25) {
                arrayList.add(anchor);
                this.f14762d.remove(iAccess$locationOf);
            }
        }
        int i26 = i10 - i14;
        int size = arrayList.size();
        for (int i27 = 0; i27 < size; i27++) {
            Anchor anchor2 = (Anchor) arrayList.get(i27);
            int iAnchorIndex2 = anchorIndex(anchor2) + i26;
            if (iAnchorIndex2 >= this.f14765g) {
                anchor2.setLocation$runtime_release(-(size$runtime_release - iAnchorIndex2));
            } else {
                anchor2.setLocation$runtime_release(iAnchorIndex2);
            }
            this.f14762d.add(SlotTableKt.access$locationOf(this.f14762d, iAnchorIndex2, size$runtime_release), anchor2);
        }
        if (!(!n(i14, iAccess$groupSize2))) {
            ComposerKt.composeImmediateRuntimeError("Unexpectedly removed anchors");
        }
        d(i11, this.currentGroupEnd, i10);
        if (i15 > 0) {
            o(i16, i15, i14 - 1);
        }
    }

    @NotNull
    public final List<Anchor> moveIntoGroupFrom(int offset, @NotNull SlotTable table, int index) {
        ComposerKt.runtimeCheck(this.f14771n <= 0 && groupSize(this.currentGroup + offset) == 1);
        int i10 = this.currentGroup;
        int i11 = this.f14767i;
        int i12 = this.f14768j;
        advanceBy(offset);
        startGroup();
        beginInsert();
        SlotWriter slotWriterOpenWriter = table.openWriter();
        try {
            INSTANCE.getClass();
            List<Anchor> listA = Companion.a(slotWriterOpenWriter, index, this, false, true, true);
            slotWriterOpenWriter.close(true);
            endInsert();
            endGroup();
            this.currentGroup = i10;
            this.f14767i = i11;
            this.f14768j = i12;
            return listA;
        } catch (Throwable th2) {
            slotWriterOpenWriter.close(false);
            throw th2;
        }
    }

    @NotNull
    public final List<Anchor> moveTo(@NotNull Anchor anchor, int offset, @NotNull SlotWriter writer) {
        ComposerKt.runtimeCheck(writer.f14771n > 0);
        ComposerKt.runtimeCheck(this.f14771n == 0);
        ComposerKt.runtimeCheck(anchor.getValid());
        int iAnchorIndex = anchorIndex(anchor) + offset;
        int i10 = this.currentGroup;
        ComposerKt.runtimeCheck(i10 <= iAnchorIndex && iAnchorIndex < this.currentGroupEnd);
        int iParent = parent(iAnchorIndex);
        int iGroupSize = groupSize(iAnchorIndex);
        int iNodeCount = isNode(iAnchorIndex) ? 1 : nodeCount(iAnchorIndex);
        INSTANCE.getClass();
        List<Anchor> listA = Companion.a(this, iAnchorIndex, writer, false, false, true);
        s(iParent);
        boolean z10 = iNodeCount > 0;
        while (iParent >= i10) {
            int iF = f(iParent);
            int[] iArr = this.f14760b;
            SlotTableKt.access$updateGroupSize(iArr, iF, SlotTableKt.access$groupSize(iArr, iF) - iGroupSize);
            if (z10) {
                if (SlotTableKt.access$isNode(this.f14760b, iF)) {
                    z10 = false;
                } else {
                    int[] iArr2 = this.f14760b;
                    SlotTableKt.access$updateNodeCount(iArr2, iF, SlotTableKt.access$nodeCount(iArr2, iF) - iNodeCount);
                }
            }
            iParent = parent(iParent);
        }
        if (z10) {
            ComposerKt.runtimeCheck(this.f14772o >= iNodeCount);
            this.f14772o -= iNodeCount;
        }
        return listA;
    }

    public final boolean n(int i10, int i11) {
        boolean z10 = false;
        if (i11 > 0) {
            ArrayList<Anchor> arrayList = this.f14762d;
            j(i10);
            if (!arrayList.isEmpty()) {
                HashMap<Anchor, GroupSourceInformation> map = this.f14763e;
                int i12 = i10 + i11;
                int iAccess$locationOf = SlotTableKt.access$locationOf(this.f14762d, i12, e() - this.f14766h);
                if (iAccess$locationOf >= this.f14762d.size()) {
                    iAccess$locationOf--;
                }
                int i13 = iAccess$locationOf + 1;
                int i14 = 0;
                while (iAccess$locationOf >= 0) {
                    Anchor anchor = this.f14762d.get(iAccess$locationOf);
                    int iAnchorIndex = anchorIndex(anchor);
                    if (iAnchorIndex < i10) {
                        break;
                    }
                    if (iAnchorIndex < i12) {
                        anchor.setLocation$runtime_release(Integer.MIN_VALUE);
                        if (map != null) {
                            map.remove(anchor);
                        }
                        if (i14 == 0) {
                            i14 = iAccess$locationOf + 1;
                        }
                        i13 = iAccess$locationOf;
                    }
                    iAccess$locationOf--;
                }
                z10 = i13 < i14;
                if (z10) {
                    this.f14762d.subList(i13, i14).clear();
                }
            }
            this.f14765g = i10;
            this.f14766h += i11;
            int i15 = this.m;
            if (i15 > i10) {
                this.m = Math.max(i10, i15 - i11);
            }
            int i16 = this.currentGroupEnd;
            if (i16 >= this.f14765g) {
                this.currentGroupEnd = i16 - i11;
            }
            int i17 = this.parent;
            if (i17 >= 0 && SlotTableKt.access$containsMark(this.f14760b, f(i17))) {
                s(i17);
            }
        }
        return z10;
    }

    @Nullable
    public final Object node(int index) {
        int iF = f(index);
        if (SlotTableKt.access$isNode(this.f14760b, iF)) {
            return this.f14761c[b(a(iF, this.f14760b))];
        }
        return null;
    }

    public final int nodeCount(int index) {
        return SlotTableKt.access$nodeCount(this.f14760b, f(index));
    }

    public final void o(int i10, int i11, int i12) {
        if (i11 > 0) {
            int i13 = this.f14770l;
            int i14 = i10 + i11;
            k(i14, i12);
            this.f14769k = i10;
            this.f14770l = i13 + i11;
            ArraysKt___ArraysJvmKt.fill(this.f14761c, (Object) null, i10, i14);
            int i15 = this.f14768j;
            if (i15 >= i10) {
                this.f14768j = i15 - i11;
            }
        }
    }

    public final int p(int i10, int[] iArr) {
        if (i10 >= e()) {
            return this.f14761c.length - this.f14770l;
        }
        int iAccess$slotAnchor = SlotTableKt.access$slotAnchor(iArr, i10);
        return iAccess$slotAnchor < 0 ? (this.f14761c.length - this.f14770l) + iAccess$slotAnchor + 1 : iAccess$slotAnchor;
    }

    public final int parent(int index) {
        return l(SlotTableKt.access$parentAnchor(this.f14760b, f(index)));
    }

    public final GroupSourceInformation q(int i10) {
        Anchor anchorTryAnchor$runtime_release;
        HashMap<Anchor, GroupSourceInformation> map = this.f14763e;
        if (map == null || (anchorTryAnchor$runtime_release = tryAnchor$runtime_release(i10)) == null) {
            return null;
        }
        return map.get(anchorTryAnchor$runtime_release);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void r(int i10, Object obj, boolean z10, Object obj2) {
        int iAccess$groupSize;
        GroupSourceInformation groupSourceInformationQ;
        int i11 = this.parent;
        Object[] objArr = this.f14771n > 0;
        this.f14775r.push(this.f14772o);
        if (objArr == true) {
            int i12 = this.currentGroup;
            int iA = a(f(i12), this.f14760b);
            h(1);
            this.f14767i = iA;
            this.f14768j = iA;
            int iF = f(i12);
            Composer.Companion companion = Composer.INSTANCE;
            int i13 = obj != companion.getEmpty() ? 1 : 0;
            int i14 = (z10 || obj2 == companion.getEmpty()) ? 0 : 1;
            int iC = c(iA, this.f14769k, this.f14770l, this.f14761c.length);
            if (iC >= 0 && this.m < i12) {
                iC = -(((this.f14761c.length - this.f14770l) - iC) + 1);
            }
            SlotTableKt.access$initGroup(this.f14760b, iF, i10, z10, i13, i14, this.parent, iC);
            int i15 = (z10 ? 1 : 0) + i13 + i14;
            if (i15 > 0) {
                i(i15, i12);
                Object[] objArr2 = this.f14761c;
                int i16 = this.f14767i;
                if (z10) {
                    objArr2[i16] = obj2;
                    i16++;
                }
                if (i13 != 0) {
                    objArr2[i16] = obj;
                    i16++;
                }
                if (i14 != 0) {
                    objArr2[i16] = obj2;
                    i16++;
                }
                this.f14767i = i16;
            }
            this.f14772o = 0;
            iAccess$groupSize = i12 + 1;
            this.parent = i12;
            this.currentGroup = iAccess$groupSize;
            if (i11 >= 0 && (groupSourceInformationQ = q(i11)) != null) {
                groupSourceInformationQ.reportGroup(this, i12);
            }
        } else {
            this.f14773p.push(i11);
            this.f14774q.push((e() - this.f14766h) - this.currentGroupEnd);
            int i17 = this.currentGroup;
            int iF2 = f(i17);
            if (!Intrinsics.areEqual(obj2, Composer.INSTANCE.getEmpty())) {
                if (z10) {
                    updateNode(obj2);
                } else {
                    updateAux(obj2);
                }
            }
            this.f14767i = p(iF2, this.f14760b);
            this.f14768j = a(f(this.currentGroup + 1), this.f14760b);
            this.f14772o = SlotTableKt.access$nodeCount(this.f14760b, iF2);
            this.parent = i17;
            this.currentGroup = i17 + 1;
            iAccess$groupSize = i17 + SlotTableKt.access$groupSize(this.f14760b, iF2);
        }
        this.currentGroupEnd = iAccess$groupSize;
    }

    public final void recordGroupSourceInformation(@NotNull String sourceInformation) {
        if (this.f14771n > 0) {
            g(this.parent, sourceInformation);
        }
    }

    public final void recordGrouplessCallSourceInformationEnd() {
        GroupSourceInformation groupSourceInformationG;
        if (this.f14771n <= 0 || (groupSourceInformationG = g(this.parent, null)) == null) {
            return;
        }
        groupSourceInformationG.endGrouplessCall(this.f14767i - slotsStartIndex$runtime_release(this.parent));
    }

    public final void recordGrouplessCallSourceInformationStart(int key, @NotNull String value) {
        if (this.f14771n > 0) {
            MutableIntObjectMap<MutableIntSet> mutableIntObjectMap = this.f14764f;
            if (mutableIntObjectMap != null) {
                SlotTableKt.access$add(mutableIntObjectMap, key, groupKey(this.parent));
            }
            GroupSourceInformation groupSourceInformationG = g(this.parent, null);
            if (groupSourceInformationG != null) {
                groupSourceInformationG.startGrouplessCall(key, value, this.f14767i - slotsStartIndex$runtime_release(this.parent));
            }
        }
    }

    public final boolean removeGroup() {
        Anchor anchorTryAnchor$runtime_release;
        if (!(this.f14771n == 0)) {
            ComposerKt.composeImmediateRuntimeError("Cannot remove group while inserting");
        }
        int i10 = this.currentGroup;
        int i11 = this.f14767i;
        int iA = a(f(i10), this.f14760b);
        int iSkipGroup = skipGroup();
        GroupSourceInformation groupSourceInformationQ = q(this.parent);
        if (groupSourceInformationQ != null && (anchorTryAnchor$runtime_release = tryAnchor$runtime_release(i10)) != null) {
            groupSourceInformationQ.removeAnchor(anchorTryAnchor$runtime_release);
        }
        PrioritySet prioritySet = this.f14780w;
        if (prioritySet != null) {
            while (prioritySet.isNotEmpty() && prioritySet.peek() >= i10) {
                prioritySet.takeMax();
            }
        }
        boolean zN = n(i10, this.currentGroup - i10);
        o(iA, this.f14767i - iA, i10 - 1);
        this.currentGroup = i10;
        this.f14767i = i11;
        this.f14772o -= iSkipGroup;
        return zN;
    }

    public final void reset() {
        if (!(this.f14771n == 0)) {
            ComposerKt.composeImmediateRuntimeError("Cannot reset when inserting");
        }
        m();
        this.currentGroup = 0;
        this.currentGroupEnd = e() - this.f14766h;
        this.f14767i = 0;
        this.f14768j = 0;
        this.f14772o = 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void s(int i10) {
        if (i10 >= 0) {
            PrioritySet prioritySet = this.f14780w;
            if (prioritySet == null) {
                prioritySet = new PrioritySet(null, 1, 0 == true ? 1 : 0);
                this.f14780w = prioritySet;
            }
            prioritySet.add(i10);
        }
    }

    public final void seek(@NotNull Anchor anchor) {
        advanceBy(anchor.toIndexFor(this) - this.currentGroup);
    }

    public final void set(@Nullable Object value) {
        if (!(this.f14767i <= this.f14768j)) {
            ComposerKt.composeImmediateRuntimeError("Writing to an invalid slot");
        }
        this.f14761c[b(this.f14767i - 1)] = value;
    }

    @Nullable
    public final Object skip() {
        if (this.f14771n > 0) {
            i(1, this.parent);
        }
        Object[] objArr = this.f14761c;
        int i10 = this.f14767i;
        this.f14767i = i10 + 1;
        return objArr[b(i10)];
    }

    public final int skipGroup() {
        int iF = f(this.currentGroup);
        int iAccess$groupSize = SlotTableKt.access$groupSize(this.f14760b, iF) + this.currentGroup;
        this.currentGroup = iAccess$groupSize;
        this.f14767i = a(f(iAccess$groupSize), this.f14760b);
        if (SlotTableKt.access$isNode(this.f14760b, iF)) {
            return 1;
        }
        return SlotTableKt.access$nodeCount(this.f14760b, iF);
    }

    public final void skipToGroupEnd() {
        int i10 = this.currentGroupEnd;
        this.currentGroup = i10;
        this.f14767i = a(f(i10), this.f14760b);
    }

    @Nullable
    public final Object slot(@NotNull Anchor anchor, int index) {
        return slot(anchorIndex(anchor), index);
    }

    public final int slotIndexOfGroupSlotIndex(int group, int index) {
        int iP = p(f(group), this.f14760b);
        int i10 = iP + index;
        if (!(i10 >= iP && i10 < a(f(group + 1), this.f14760b))) {
            ComposerKt.composeImmediateRuntimeError("Write to an invalid slot index " + index + " for group " + group);
        }
        return i10;
    }

    public final int slotsEndAllIndex$runtime_release(int groupIndex) {
        return a(f(groupSize(groupIndex) + groupIndex), this.f14760b);
    }

    public final int slotsEndIndex$runtime_release(int groupIndex) {
        return a(f(groupIndex + 1), this.f14760b);
    }

    public final int slotsStartIndex$runtime_release(int groupIndex) {
        return p(f(groupIndex), this.f14760b);
    }

    public final void startData(int key, @Nullable Object objectKey, @Nullable Object aux) {
        r(key, objectKey, false, aux);
    }

    public final void startGroup() {
        if (!(this.f14771n == 0)) {
            ComposerKt.composeImmediateRuntimeError("Key must be supplied when inserting");
        }
        Composer.Companion companion = Composer.INSTANCE;
        r(0, companion.getEmpty(), false, companion.getEmpty());
    }

    public final void startNode(int key, @Nullable Object objectKey) {
        r(key, objectKey, true, Composer.INSTANCE.getEmpty());
    }

    public final void t(int i10, Object obj) {
        int iF = f(i10);
        int[] iArr = this.f14760b;
        if (!(iF < iArr.length && SlotTableKt.access$isNode(iArr, iF))) {
            ComposerKt.composeImmediateRuntimeError("Updating the node of a group at " + i10 + " that was not created with as a node group");
        }
        this.f14761c[b(a(iF, this.f14760b))] = obj;
    }

    @NotNull
    public final String toDebugString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(toString());
        Intrinsics.checkNotNullExpressionValue(sb2, "append(value)");
        sb2.append('\n');
        Intrinsics.checkNotNullExpressionValue(sb2, "append('\\n')");
        sb2.append("  parent:    " + this.parent);
        Intrinsics.checkNotNullExpressionValue(sb2, "append(value)");
        sb2.append('\n');
        Intrinsics.checkNotNullExpressionValue(sb2, "append('\\n')");
        sb2.append("  current:   " + this.currentGroup);
        Intrinsics.checkNotNullExpressionValue(sb2, "append(value)");
        sb2.append('\n');
        Intrinsics.checkNotNullExpressionValue(sb2, "append('\\n')");
        sb2.append("  group gap: " + this.f14765g + '-' + (this.f14765g + this.f14766h) + RootService.OPEN_BRACKET + this.f14766h + RootService.CLOSE_BRACKET);
        Intrinsics.checkNotNullExpressionValue(sb2, "append(value)");
        sb2.append('\n');
        Intrinsics.checkNotNullExpressionValue(sb2, "append('\\n')");
        sb2.append("  slots gap: " + this.f14769k + '-' + (this.f14769k + this.f14770l) + RootService.OPEN_BRACKET + this.f14770l + RootService.CLOSE_BRACKET);
        Intrinsics.checkNotNullExpressionValue(sb2, "append(value)");
        sb2.append('\n');
        Intrinsics.checkNotNullExpressionValue(sb2, "append('\\n')");
        StringBuilder sb3 = new StringBuilder("  gap owner: ");
        sb3.append(this.m);
        sb2.append(sb3.toString());
        Intrinsics.checkNotNullExpressionValue(sb2, "append(value)");
        sb2.append('\n');
        Intrinsics.checkNotNullExpressionValue(sb2, "append('\\n')");
        int size$runtime_release = getSize$runtime_release();
        int i10 = 0;
        while (i10 < size$runtime_release) {
            int iF = f(i10);
            sb2.append("Group(");
            if (i10 < 10) {
                sb2.append(' ');
            }
            if (i10 < 100) {
                sb2.append(' ');
            }
            if (i10 < 1000) {
                sb2.append(' ');
            }
            sb2.append(i10);
            if (iF != i10) {
                sb2.append("(");
                sb2.append(iF);
                sb2.append(")");
            }
            sb2.append(MaskTextWatcher.WILDCARD);
            sb2.append(SlotTableKt.access$groupSize(this.f14760b, iF));
            sb2.append('^');
            sb2.append(l(SlotTableKt.access$parentAnchor(this.f14760b, iF)));
            sb2.append(": key=");
            sb2.append(SlotTableKt.access$key(this.f14760b, iF));
            sb2.append(", nodes=");
            sb2.append(SlotTableKt.access$nodeCount(this.f14760b, iF));
            sb2.append(", dataAnchor=");
            sb2.append(SlotTableKt.access$dataAnchor(this.f14760b, iF));
            sb2.append(", parentAnchor=");
            sb2.append(SlotTableKt.access$parentAnchor(this.f14760b, iF));
            if (SlotTableKt.access$isNode(this.f14760b, iF)) {
                sb2.append(", node=" + SlotTableKt.access$summarize(String.valueOf(this.f14761c[b(a(iF, this.f14760b))]), 10));
            }
            int iP = p(iF, this.f14760b);
            i10++;
            int iA = a(f(i10), this.f14760b);
            if (iA > iP) {
                sb2.append(", [");
                for (int i11 = iP; i11 < iA; i11++) {
                    if (i11 != iP) {
                        sb2.append(", ");
                    }
                    sb2.append(String.valueOf(SlotTableKt.access$summarize(String.valueOf(this.f14761c[b(i11)]), 10)));
                }
                sb2.append(AbstractJsonLexerKt.END_LIST);
            }
            sb2.append(")");
            sb2.append('\n');
        }
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    @NotNull
    public String toString() {
        return "SlotWriter(current = " + this.currentGroup + " end=" + this.currentGroupEnd + " size = " + getSize$runtime_release() + " gap=" + this.f14765g + '-' + (this.f14765g + this.f14766h) + RootService.CLOSE_BRACKET;
    }

    public final void trimTailSlots(int count) {
        ComposerKt.runtimeCheck(count > 0);
        int i10 = this.parent;
        int iP = p(f(i10), this.f14760b);
        int iA = a(f(i10 + 1), this.f14760b) - count;
        ComposerKt.runtimeCheck(iA >= iP);
        o(iA, count, i10);
        int i11 = this.f14767i;
        if (i11 >= iP) {
            this.f14767i = i11 - count;
        }
    }

    @Nullable
    public final Anchor tryAnchor$runtime_release(int group) {
        if (group < 0 || group >= getSize$runtime_release()) {
            return null;
        }
        return SlotTableKt.access$find(this.f14762d, group, getSize$runtime_release());
    }

    @Nullable
    public final Object update(@Nullable Object value) {
        Object objSkip = skip();
        set(value);
        return objSkip;
    }

    public final void updateAux(@Nullable Object value) {
        int iF = f(this.currentGroup);
        if (!SlotTableKt.access$hasAux(this.f14760b, iF)) {
            ComposerKt.composeImmediateRuntimeError("Updating the data of a group that was not created with a data slot");
        }
        Object[] objArr = this.f14761c;
        int[] iArr = this.f14760b;
        objArr[b(SlotTableKt.a(SlotTableKt.access$groupInfo(iArr, iF) >> 29) + a(iF, iArr))] = value;
    }

    public final void updateNode(@Nullable Object value) {
        t(this.currentGroup, value);
    }

    public final void updateParentNode(@Nullable Object value) {
        t(this.parent, value);
    }

    public final void updateToTableMaps() {
        SlotTable slotTable = this.table;
        this.f14763e = slotTable.getSourceInformationMap$runtime_release();
        this.f14764f = slotTable.getCalledByMap$runtime_release();
    }

    public final void verifyDataAnchors$runtime_release() {
        int i10 = this.m;
        int length = this.f14761c.length - this.f14770l;
        int size$runtime_release = getSize$runtime_release();
        int i11 = 0;
        int i12 = 0;
        boolean z10 = false;
        while (i11 < size$runtime_release) {
            int iF = f(i11);
            int iAccess$dataAnchor = SlotTableKt.access$dataAnchor(this.f14760b, iF);
            int iA = a(iF, this.f14760b);
            if (!(iA >= i12)) {
                StringBuilder sbE = h.e("Data index out of order at ", i11, ", previous = ", i12, ", current = ");
                sbE.append(iA);
                PreconditionsKt.throwIllegalStateException(sbE.toString());
            }
            if (!(iA <= length)) {
                PreconditionsKt.throwIllegalStateException("Data index, " + iA + ", out of bound at " + i11);
            }
            if (iAccess$dataAnchor < 0 && !z10) {
                if (!(i10 == i11)) {
                    PreconditionsKt.throwIllegalStateException("Expected the slot gap owner to be " + i10 + " found gap at " + i11);
                }
                z10 = true;
            }
            i11++;
            i12 = iA;
        }
    }

    public final void verifyParentAnchors$runtime_release() {
        int i10 = this.f14765g;
        int i11 = this.f14766h;
        int iE = e();
        int i12 = 0;
        while (true) {
            if (i12 >= i10) {
                break;
            }
            if (!(SlotTableKt.access$parentAnchor(this.f14760b, i12) > -2)) {
                PreconditionsKt.throwIllegalStateException("Expected a start relative anchor at " + i12);
            }
            i12++;
        }
        for (int i13 = i11 + i10; i13 < iE; i13++) {
            int iAccess$parentAnchor = SlotTableKt.access$parentAnchor(this.f14760b, i13);
            if (l(iAccess$parentAnchor) < i10) {
                if (!(iAccess$parentAnchor > -2)) {
                    PreconditionsKt.throwIllegalStateException("Expected a start relative anchor at " + i13);
                }
            } else if (!(iAccess$parentAnchor <= -2)) {
                PreconditionsKt.throwIllegalStateException("Expected an end relative anchor at " + i13);
            }
        }
    }

    public static final int access$dataIndex(SlotWriter slotWriter, int i10) {
        return slotWriter.a(slotWriter.f(i10), slotWriter.f14760b);
    }

    public final boolean isNode(int index) {
        return SlotTableKt.access$isNode(this.f14760b, f(index));
    }

    @Nullable
    public final Object slot(int groupIndex, int index) {
        int iP = p(f(groupIndex), this.f14760b);
        int iA = a(f(groupIndex + 1), this.f14760b);
        int i10 = index + iP;
        if (iP > i10 || i10 >= iA) {
            return Composer.INSTANCE.getEmpty();
        }
        return this.f14761c[b(i10)];
    }

    public final void startData(int key, @Nullable Object aux) {
        r(key, Composer.INSTANCE.getEmpty(), false, aux);
    }

    public final void startNode(int key, @Nullable Object objectKey, @Nullable Object node) {
        r(key, objectKey, true, node);
    }

    public final void updateNode(@NotNull Anchor anchor, @Nullable Object value) {
        t(anchor.toIndexFor(this), value);
    }

    public final int parent(@NotNull Anchor anchor) {
        if (anchor.getValid()) {
            return l(SlotTableKt.access$parentAnchor(this.f14760b, f(anchorIndex(anchor))));
        }
        return -1;
    }

    @Nullable
    public final Object set(int index, @Nullable Object value) {
        return set(this.currentGroup, index, value);
    }

    public final void startGroup(int key) {
        Composer.Companion companion = Composer.INSTANCE;
        r(key, companion.getEmpty(), false, companion.getEmpty());
    }

    @Nullable
    public final Object set(int group, int index, @Nullable Object value) {
        int iB = b(slotIndexOfGroupSlotIndex(group, index));
        Object[] objArr = this.f14761c;
        Object obj = objArr[iB];
        objArr[iB] = value;
        return obj;
    }

    public final void startGroup(int key, @Nullable Object dataKey) {
        r(key, dataKey, false, Composer.INSTANCE.getEmpty());
    }

    @Nullable
    public final Object node(@NotNull Anchor anchor) {
        return node(anchor.toIndexFor(this));
    }

    public final void ensureStarted(@NotNull Anchor anchor) {
        ensureStarted(anchor.toIndexFor(this));
    }
}
