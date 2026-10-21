package androidx.compose.runtime.changelist;

import androidx.camera.core.impl.utils.c;
import androidx.compose.runtime.Anchor;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposeNodeLifecycleCallback;
import androidx.compose.runtime.Composition;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.runtime.ControlledComposition;
import androidx.compose.runtime.MovableContentState;
import androidx.compose.runtime.MovableContentStateReference;
import androidx.compose.runtime.RememberManager;
import androidx.compose.runtime.RememberObserver;
import androidx.compose.runtime.SlotTable;
import androidx.compose.runtime.SlotWriter;
import androidx.compose.runtime.internal.IntRef;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.graphics.b;
import androidx.exifinterface.media.ExifInterface;
import com.bbva.plugin.localstorage.command.ClearCommand;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.a;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.TypeIntrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ChangeList.kt */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000°\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b`\u0010aJ\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0004\u001a\u00020\u0002J\u0006\u0010\u0006\u001a\u00020\u0005J\"\u0010\r\u001a\u00020\u00052\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bJ\u000e\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u000eJ\u0018\u0010\u0014\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0013\u001a\u00020\u0012J \u0010\u0017\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\u0012J\u0018\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u00152\b\u0010\u000f\u001a\u0004\u0018\u00010\u0011J\u000e\u0010\u001a\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u0012J\u0006\u0010\u001b\u001a\u00020\u0005J\u0006\u0010\u001c\u001a\u00020\u0005J\u0010\u0010\u001e\u001a\u00020\u00052\b\u0010\u001d\u001a\u0004\u0018\u00010\u0011J\u0006\u0010\u001f\u001a\u00020\u0005J\u000e\u0010 \u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u0015J\u0006\u0010!\u001a\u00020\u0005J\u0006\u0010\"\u001a\u00020\u0005J\u0006\u0010#\u001a\u00020\u0005J\u0016\u0010&\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010%\u001a\u00020$J\u001e\u0010&\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010%\u001a\u00020$2\u0006\u0010(\u001a\u00020'J\u000e\u0010*\u001a\u00020\u00052\u0006\u0010)\u001a\u00020\u0012J\"\u0010/\u001a\u00020\u00052\u0012\u0010-\u001a\u000e\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020\u00050+2\u0006\u0010.\u001a\u00020,J\u0010\u00101\u001a\u00020\u00052\b\u00100\u001a\u0004\u0018\u00010\u0011J@\u00107\u001a\u00020\u0005\"\u0004\b\u0000\u00102\"\u0004\b\u0001\u001032\u0006\u0010\u000f\u001a\u00028\u00012\u001d\u00106\u001a\u0019\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u000504¢\u0006\u0002\b5¢\u0006\u0004\b7\u00108J\u0016\u0010;\u001a\u00020\u00052\u0006\u00109\u001a\u00020\u00122\u0006\u0010:\u001a\u00020\u0012J\u001e\u0010=\u001a\u00020\u00052\u0006\u0010<\u001a\u00020\u00122\u0006\u0010%\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u0012J\u000e\u0010?\u001a\u00020\u00052\u0006\u0010>\u001a\u00020\u0012J\u000e\u0010@\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u0012J\u001d\u0010C\u001a\u00020\u00052\u000e\u0010B\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110A¢\u0006\u0004\bC\u0010DJ\u0014\u0010G\u001a\u00020\u00052\f\u0010F\u001a\b\u0012\u0004\u0012\u00020\u00050EJ\u0016\u0010J\u001a\u00020\u00052\u0006\u0010I\u001a\u00020H2\u0006\u0010\u0016\u001a\u00020\u0015J\u001e\u0010M\u001a\u00020\u00052\u000e\u0010B\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110K2\u0006\u0010L\u001a\u00020HJ(\u0010S\u001a\u00020\u00052\b\u0010O\u001a\u0004\u0018\u00010N2\u0006\u0010Q\u001a\u00020P2\u0006\u0010%\u001a\u00020R2\u0006\u0010<\u001a\u00020RJ\u001e\u0010V\u001a\u00020\u00052\u0006\u0010.\u001a\u00020T2\u0006\u0010Q\u001a\u00020P2\u0006\u0010U\u001a\u00020RJ\u0006\u0010W\u001a\u00020\u0005J\u001a\u0010Y\u001a\u00020\u00052\u0006\u0010X\u001a\u00020\u00002\n\b\u0002\u0010L\u001a\u0004\u0018\u00010HJ\u0010\u0010\\\u001a\u00020Z2\u0006\u0010[\u001a\u00020ZH\u0016R\u0011\u0010_\u001a\u00020\u00128F¢\u0006\u0006\u001a\u0004\b]\u0010^¨\u0006b"}, d2 = {"Landroidx/compose/runtime/changelist/ChangeList;", "Landroidx/compose/runtime/changelist/OperationsDebugStringFormattable;", "", "isEmpty", "isNotEmpty", "", ClearCommand.ID, "Landroidx/compose/runtime/Applier;", "applier", "Landroidx/compose/runtime/SlotWriter;", "slots", "Landroidx/compose/runtime/RememberManager;", "rememberManager", "executeAndFlushAllPendingChanges", "Landroidx/compose/runtime/RememberObserver;", "value", "pushRemember", "", "", "groupSlotIndex", "pushUpdateValue", "Landroidx/compose/runtime/Anchor;", "anchor", "pushUpdateAnchoredValue", "pushAppendValue", "count", "pushTrimValues", "pushResetSlots", "pushDeactivateCurrentGroup", "data", "pushUpdateAuxData", "pushEnsureRootStarted", "pushEnsureGroupStarted", "pushEndCurrentGroup", "pushSkipToEndOfCurrentGroup", "pushRemoveCurrentGroup", "Landroidx/compose/runtime/SlotTable;", "from", "pushInsertSlots", "Landroidx/compose/runtime/changelist/FixupList;", "fixups", TypedValues.CycleType.S_WAVE_OFFSET, "pushMoveCurrentGroup", "Lkotlin/Function1;", "Landroidx/compose/runtime/Composition;", "action", "composition", "pushEndCompositionScope", "node", "pushUseNode", ExifInterface.GPS_DIRECTION_TRUE, ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "Lkotlin/Function2;", "Lkotlin/ExtensionFunctionType;", "block", "pushUpdateNode", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V", "removeFrom", "moveCount", "pushRemoveNode", TypedValues.TransitionType.S_TO, "pushMoveNode", "distance", "pushAdvanceSlotsBy", "pushUps", "", "nodes", "pushDowns", "([Ljava/lang/Object;)V", "Lkotlin/Function0;", "effect", "pushSideEffect", "Landroidx/compose/runtime/internal/IntRef;", "effectiveNodeIndexOut", "pushDetermineMovableContentNodeIndex", "", "effectiveNodeIndex", "pushCopyNodesToNewAnchorLocation", "Landroidx/compose/runtime/MovableContentState;", "resolvedState", "Landroidx/compose/runtime/CompositionContext;", "parentContext", "Landroidx/compose/runtime/MovableContentStateReference;", "pushCopySlotTableToAnchorLocation", "Landroidx/compose/runtime/ControlledComposition;", "reference", "pushReleaseMovableGroupAtCurrent", "pushEndMovableContentPlacement", "changeList", "pushExecuteOperationsIn", "", "linePrefix", "toDebugString", "getSize", "()I", "size", "<init>", "()V", "runtime_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nChangeList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ChangeList.kt\nandroidx/compose/runtime/changelist/ChangeList\n+ 2 Operations.kt\nandroidx/compose/runtime/changelist/Operations\n+ 3 Operation.kt\nandroidx/compose/runtime/changelist/Operation$Remember\n+ 4 Preconditions.kt\nandroidx/compose/runtime/PreconditionsKt\n+ 5 Operation.kt\nandroidx/compose/runtime/changelist/Operation$UpdateValue\n+ 6 Operation.kt\nandroidx/compose/runtime/changelist/Operation$UpdateAnchoredValue\n+ 7 Operation.kt\nandroidx/compose/runtime/changelist/Operation$AppendValue\n+ 8 Operation.kt\nandroidx/compose/runtime/changelist/Operation$TrimParentValues\n+ 9 Operation.kt\nandroidx/compose/runtime/changelist/Operation$UpdateAuxData\n+ 10 Operation.kt\nandroidx/compose/runtime/changelist/Operation$EnsureGroupStarted\n+ 11 Operation.kt\nandroidx/compose/runtime/changelist/Operation$InsertSlots\n+ 12 Operation.kt\nandroidx/compose/runtime/changelist/Operation$InsertSlotsWithFixups\n+ 13 Operation.kt\nandroidx/compose/runtime/changelist/Operation$MoveCurrentGroup\n+ 14 Operation.kt\nandroidx/compose/runtime/changelist/Operation$EndCompositionScope\n+ 15 Operation.kt\nandroidx/compose/runtime/changelist/Operation$UpdateNode\n+ 16 Operation.kt\nandroidx/compose/runtime/changelist/Operation$RemoveNode\n+ 17 Operation.kt\nandroidx/compose/runtime/changelist/Operation$MoveNode\n+ 18 Operation.kt\nandroidx/compose/runtime/changelist/Operation$AdvanceSlotsBy\n+ 19 Operation.kt\nandroidx/compose/runtime/changelist/Operation$Ups\n+ 20 Operation.kt\nandroidx/compose/runtime/changelist/Operation$Downs\n+ 21 Operation.kt\nandroidx/compose/runtime/changelist/Operation$SideEffect\n+ 22 Operation.kt\nandroidx/compose/runtime/changelist/Operation$DetermineMovableContentNodeIndex\n+ 23 Operation.kt\nandroidx/compose/runtime/changelist/Operation$CopyNodesToNewAnchorLocation\n+ 24 Operation.kt\nandroidx/compose/runtime/changelist/Operation$CopySlotTableToAnchorLocation\n+ 25 Operation.kt\nandroidx/compose/runtime/changelist/Operation$ReleaseMovableGroupAtCurrent\n+ 26 Operation.kt\nandroidx/compose/runtime/changelist/Operation$ApplyChangeList\n*L\n1#1,326:1\n167#2,5:327\n175#2,2:333\n174#2:335\n178#2,25:341\n204#2:367\n167#2,5:368\n175#2,2:375\n174#2:377\n178#2,25:383\n204#2:409\n167#2,5:410\n175#2,2:418\n174#2:420\n178#2,25:426\n204#2:452\n167#2,5:453\n175#2,2:460\n174#2:462\n178#2,25:468\n204#2:494\n167#2,5:495\n175#2,2:501\n174#2:503\n178#2,25:509\n204#2:535\n167#2,5:536\n175#2,2:542\n174#2:544\n178#2,25:550\n204#2:576\n167#2,5:577\n175#2,2:583\n174#2:585\n178#2,25:591\n204#2:617\n167#2,5:618\n175#2,2:625\n174#2:627\n178#2,25:633\n204#2:659\n167#2,5:660\n175#2,2:668\n174#2:670\n178#2,25:676\n204#2:702\n167#2,5:703\n175#2,2:709\n174#2:711\n178#2,25:717\n204#2:743\n167#2,5:744\n175#2,2:751\n174#2:753\n178#2,25:759\n204#2:785\n167#2,5:786\n175#2,2:793\n174#2:795\n178#2,25:801\n204#2:827\n167#2,5:828\n175#2,2:835\n174#2:837\n178#2,25:843\n204#2:869\n167#2,5:870\n175#2,2:878\n174#2:880\n178#2,25:886\n204#2:912\n167#2,5:913\n175#2,2:919\n174#2:921\n178#2,25:927\n204#2:953\n167#2,5:954\n175#2,2:960\n174#2:962\n178#2,25:968\n204#2:994\n167#2,5:995\n175#2,2:1001\n174#2:1003\n178#2,25:1009\n204#2:1035\n167#2,5:1036\n175#2,2:1042\n174#2:1044\n178#2,25:1050\n204#2:1076\n167#2,5:1077\n175#2,2:1084\n174#2:1086\n178#2,25:1092\n204#2:1118\n167#2,5:1119\n175#2,2:1126\n174#2:1128\n178#2,25:1134\n204#2:1160\n167#2,5:1161\n175#2,2:1170\n174#2:1172\n178#2,25:1178\n204#2:1204\n167#2,5:1205\n175#2,2:1213\n174#2:1215\n178#2,25:1221\n204#2:1247\n167#2,5:1248\n175#2,2:1255\n174#2:1257\n178#2,25:1263\n204#2:1289\n154#3:332\n50#4,5:336\n56#4:366\n50#4,5:378\n56#4:408\n50#4,5:421\n56#4:451\n50#4,5:463\n56#4:493\n50#4,5:504\n56#4:534\n50#4,5:545\n56#4:575\n50#4,5:586\n56#4:616\n50#4,5:628\n56#4:658\n50#4,5:671\n56#4:701\n50#4,5:712\n56#4:742\n50#4,5:754\n56#4:784\n50#4,5:796\n56#4:826\n50#4,5:838\n56#4:868\n50#4,5:881\n56#4:911\n50#4,5:922\n56#4:952\n50#4,5:963\n56#4:993\n50#4,5:1004\n56#4:1034\n50#4,5:1045\n56#4:1075\n50#4,5:1087\n56#4:1117\n50#4,5:1129\n56#4:1159\n50#4,5:1173\n56#4:1203\n50#4,5:1216\n56#4:1246\n50#4,5:1258\n56#4:1288\n225#5:373\n226#5:374\n264#6:415\n265#6:416\n266#6:417\n171#7:458\n172#7:459\n195#8:500\n312#9:541\n339#10:582\n503#11:623\n504#11:624\n531#12:665\n532#12:666\n533#12:667\n366#13:708\n403#14:749\n404#14:750\n435#15:791\n436#15:792\n456#16:833\n457#16:834\n479#17:875\n478#17:876\n480#17:877\n118#18:918\n79#19:959\n96#20:1000\n137#21:1041\n648#22:1082\n649#22:1083\n677#23:1124\n676#23:1125\n703#24:1166\n704#24:1167\n706#24:1168\n705#24:1169\n764#25:1210\n765#25:1211\n766#25:1212\n790#26:1253\n791#26:1254\n*S KotlinDebug\n*F\n+ 1 ChangeList.kt\nandroidx/compose/runtime/changelist/ChangeList\n*L\n84#1:327,5\n84#1:333,2\n84#1:335\n84#1:341,25\n84#1:367\n90#1:368,5\n90#1:375,2\n90#1:377\n90#1:383,25\n90#1:409\n97#1:410,5\n97#1:418,2\n97#1:420\n97#1:426,25\n97#1:452\n105#1:453,5\n105#1:460,2\n105#1:462\n105#1:468,25\n105#1:494\n112#1:495,5\n112#1:501,2\n112#1:503\n112#1:509,25\n112#1:535\n126#1:536,5\n126#1:542,2\n126#1:544\n126#1:550,25\n126#1:576\n136#1:577,5\n136#1:583,2\n136#1:585\n136#1:591,25\n136#1:617\n157#1:618,5\n157#1:625,2\n157#1:627\n157#1:633,25\n157#1:659\n168#1:660,5\n168#1:668,2\n168#1:670\n168#1:676,25\n168#1:702\n178#1:703,5\n178#1:709,2\n178#1:711\n178#1:717,25\n178#1:743\n187#1:744,5\n187#1:751,2\n187#1:753\n187#1:759,25\n187#1:785\n200#1:786,5\n200#1:793,2\n200#1:795\n200#1:801,25\n200#1:827\n208#1:828,5\n208#1:835,2\n208#1:837\n208#1:843,25\n208#1:869\n215#1:870,5\n215#1:878,2\n215#1:880\n215#1:886,25\n215#1:912\n223#1:913,5\n223#1:919,2\n223#1:921\n223#1:927,25\n223#1:953\n229#1:954,5\n229#1:960,2\n229#1:962\n229#1:968,25\n229#1:994\n236#1:995,5\n236#1:1001,2\n236#1:1003\n236#1:1009,25\n236#1:1035\n243#1:1036,5\n243#1:1042,2\n243#1:1044\n243#1:1050,25\n243#1:1076\n252#1:1077,5\n252#1:1084,2\n252#1:1086\n252#1:1092,25\n252#1:1118\n263#1:1119,5\n263#1:1126,2\n263#1:1128\n263#1:1134,25\n263#1:1160\n277#1:1161,5\n277#1:1170,2\n277#1:1172\n277#1:1178,25\n277#1:1204\n291#1:1205,5\n291#1:1213,2\n291#1:1215\n291#1:1221,25\n291#1:1247\n307#1:1248,5\n307#1:1255,2\n307#1:1257\n307#1:1263,25\n307#1:1289\n85#1:332\n84#1:336,5\n84#1:366\n90#1:378,5\n90#1:408\n97#1:421,5\n97#1:451\n105#1:463,5\n105#1:493\n112#1:504,5\n112#1:534\n126#1:545,5\n126#1:575\n136#1:586,5\n136#1:616\n157#1:628,5\n157#1:658\n168#1:671,5\n168#1:701\n178#1:712,5\n178#1:742\n187#1:754,5\n187#1:784\n200#1:796,5\n200#1:826\n208#1:838,5\n208#1:868\n215#1:881,5\n215#1:911\n223#1:922,5\n223#1:952\n229#1:963,5\n229#1:993\n236#1:1004,5\n236#1:1034\n243#1:1045,5\n243#1:1075\n252#1:1087,5\n252#1:1117\n263#1:1129,5\n263#1:1159\n277#1:1173,5\n277#1:1203\n291#1:1216,5\n291#1:1246\n307#1:1258,5\n307#1:1288\n91#1:373\n92#1:374\n98#1:415\n99#1:416\n100#1:417\n106#1:458\n107#1:459\n113#1:500\n127#1:541\n137#1:582\n158#1:623\n159#1:624\n169#1:665\n170#1:666\n171#1:667\n179#1:708\n188#1:749\n189#1:750\n201#1:791\n203#1:792\n209#1:833\n210#1:834\n216#1:875\n217#1:876\n218#1:877\n224#1:918\n230#1:959\n237#1:1000\n244#1:1041\n253#1:1082\n254#1:1083\n264#1:1124\n265#1:1125\n278#1:1166\n279#1:1167\n280#1:1168\n281#1:1169\n292#1:1210\n293#1:1211\n294#1:1212\n308#1:1253\n309#1:1254\n*E\n"})
public final class ChangeList extends OperationsDebugStringFormattable {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Operations f14824a = new Operations();

    public static /* synthetic */ void pushExecuteOperationsIn$default(ChangeList changeList, ChangeList changeList2, IntRef intRef, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            intRef = null;
        }
        changeList.pushExecuteOperationsIn(changeList2, intRef);
    }

    public final void clear() {
        this.f14824a.clear();
    }

    public final void executeAndFlushAllPendingChanges(@NotNull Applier<?> applier, @NotNull SlotWriter slots, @NotNull RememberManager rememberManager) {
        this.f14824a.executeAndFlushAllPendingOperations(applier, slots, rememberManager);
    }

    public final int getSize() {
        return this.f14824a.getF14850b();
    }

    public final boolean isEmpty() {
        return this.f14824a.isEmpty();
    }

    public final boolean isNotEmpty() {
        return this.f14824a.isNotEmpty();
    }

    public final void pushAdvanceSlotsBy(int distance) {
        Operation.AdvanceSlotsBy advanceSlotsBy = Operation.AdvanceSlotsBy.INSTANCE;
        Operations operations = this.f14824a;
        operations.pushOp(advanceSlotsBy);
        Operations.WriteScope.m2160setIntA6tL2VI(Operations.WriteScope.m2155constructorimpl(operations), Operation.IntParameter.m2114constructorimpl(0), distance);
        if (operations.f14855g == Operations.access$createExpectedArgMask(operations, advanceSlotsBy.getInts()) && operations.f14856h == Operations.access$createExpectedArgMask(operations, advanceSlotsBy.getObjects())) {
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        int ints = advanceSlotsBy.getInts();
        int i10 = 0;
        for (int i11 = 0; i11 < ints; i11++) {
            if (((1 << i11) & operations.f14855g) != 0) {
                if (i10 > 0) {
                    sb2.append(", ");
                }
                sb2.append(advanceSlotsBy.mo2086intParamNamew8GmfQM(Operation.IntParameter.m2114constructorimpl(i11)));
                i10++;
            }
        }
        String string = sb2.toString();
        StringBuilder sbC = a.c(string, "StringBuilder().apply(builderAction).toString()");
        int objects = advanceSlotsBy.getObjects();
        int i12 = 0;
        for (int i13 = 0; i13 < objects; i13++) {
            if (((1 << i13) & operations.f14856h) != 0) {
                if (i10 > 0) {
                    sbC.append(", ");
                }
                sbC.append(advanceSlotsBy.mo2087objectParamName31yXWZQ(Operation.ObjectParameter.m2125constructorimpl(i13)));
                i12++;
            }
        }
        String string2 = sbC.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "StringBuilder().apply(builderAction).toString()");
        StringBuilder sb3 = new StringBuilder("Error while pushing ");
        sb3.append(advanceSlotsBy);
        sb3.append(". Not all arguments were provided. Missing ");
        androidx.room.a.f(sb3, i10, " int arguments (", string, ") and ");
        b.g(sb3, i12, " object arguments (", string2, ").");
    }

    public final void pushAppendValue(@NotNull Anchor anchor, @Nullable Object value) {
        Operation.AppendValue appendValue = Operation.AppendValue.INSTANCE;
        Operations operations = this.f14824a;
        operations.pushOp(appendValue);
        Operations operationsM2155constructorimpl = Operations.WriteScope.m2155constructorimpl(operations);
        Operations.WriteScope.m2161setObjectDKhxnng(operationsM2155constructorimpl, Operation.ObjectParameter.m2125constructorimpl(0), anchor);
        Operations.WriteScope.m2161setObjectDKhxnng(operationsM2155constructorimpl, Operation.ObjectParameter.m2125constructorimpl(1), value);
        if (operations.f14855g == Operations.access$createExpectedArgMask(operations, appendValue.getInts()) && operations.f14856h == Operations.access$createExpectedArgMask(operations, appendValue.getObjects())) {
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        int ints = appendValue.getInts();
        int i10 = 0;
        for (int i11 = 0; i11 < ints; i11++) {
            if (((1 << i11) & operations.f14855g) != 0) {
                if (i10 > 0) {
                    sb2.append(", ");
                }
                sb2.append(appendValue.mo2086intParamNamew8GmfQM(Operation.IntParameter.m2114constructorimpl(i11)));
                i10++;
            }
        }
        String string = sb2.toString();
        StringBuilder sbC = a.c(string, "StringBuilder().apply(builderAction).toString()");
        int objects = appendValue.getObjects();
        int i12 = 0;
        for (int i13 = 0; i13 < objects; i13++) {
            if (((1 << i13) & operations.f14856h) != 0) {
                if (i10 > 0) {
                    sbC.append(", ");
                }
                sbC.append(appendValue.mo2087objectParamName31yXWZQ(Operation.ObjectParameter.m2125constructorimpl(i13)));
                i12++;
            }
        }
        String string2 = sbC.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "StringBuilder().apply(builderAction).toString()");
        StringBuilder sb3 = new StringBuilder("Error while pushing ");
        sb3.append(appendValue);
        sb3.append(". Not all arguments were provided. Missing ");
        androidx.room.a.f(sb3, i10, " int arguments (", string, ") and ");
        b.g(sb3, i12, " object arguments (", string2, ").");
    }

    public final void pushCopyNodesToNewAnchorLocation(@NotNull List<? extends Object> nodes, @NotNull IntRef effectiveNodeIndex) {
        if (!nodes.isEmpty()) {
            Operation.CopyNodesToNewAnchorLocation copyNodesToNewAnchorLocation = Operation.CopyNodesToNewAnchorLocation.INSTANCE;
            Operations operations = this.f14824a;
            operations.pushOp(copyNodesToNewAnchorLocation);
            Operations operationsM2155constructorimpl = Operations.WriteScope.m2155constructorimpl(operations);
            Operations.WriteScope.m2161setObjectDKhxnng(operationsM2155constructorimpl, Operation.ObjectParameter.m2125constructorimpl(1), nodes);
            Operations.WriteScope.m2161setObjectDKhxnng(operationsM2155constructorimpl, Operation.ObjectParameter.m2125constructorimpl(0), effectiveNodeIndex);
            if (operations.f14855g == Operations.access$createExpectedArgMask(operations, copyNodesToNewAnchorLocation.getInts()) && operations.f14856h == Operations.access$createExpectedArgMask(operations, copyNodesToNewAnchorLocation.getObjects())) {
                return;
            }
            StringBuilder sb2 = new StringBuilder();
            int ints = copyNodesToNewAnchorLocation.getInts();
            int i10 = 0;
            for (int i11 = 0; i11 < ints; i11++) {
                if (((1 << i11) & operations.f14855g) != 0) {
                    if (i10 > 0) {
                        sb2.append(", ");
                    }
                    sb2.append(copyNodesToNewAnchorLocation.mo2086intParamNamew8GmfQM(Operation.IntParameter.m2114constructorimpl(i11)));
                    i10++;
                }
            }
            String string = sb2.toString();
            StringBuilder sbC = a.c(string, "StringBuilder().apply(builderAction).toString()");
            int objects = copyNodesToNewAnchorLocation.getObjects();
            int i12 = 0;
            for (int i13 = 0; i13 < objects; i13++) {
                if (((1 << i13) & operations.f14856h) != 0) {
                    if (i10 > 0) {
                        sbC.append(", ");
                    }
                    sbC.append(copyNodesToNewAnchorLocation.mo2087objectParamName31yXWZQ(Operation.ObjectParameter.m2125constructorimpl(i13)));
                    i12++;
                }
            }
            String string2 = sbC.toString();
            Intrinsics.checkNotNullExpressionValue(string2, "StringBuilder().apply(builderAction).toString()");
            StringBuilder sb3 = new StringBuilder("Error while pushing ");
            sb3.append(copyNodesToNewAnchorLocation);
            sb3.append(". Not all arguments were provided. Missing ");
            androidx.room.a.f(sb3, i10, " int arguments (", string, ") and ");
            b.g(sb3, i12, " object arguments (", string2, ").");
        }
    }

    public final void pushCopySlotTableToAnchorLocation(@Nullable MovableContentState resolvedState, @NotNull CompositionContext parentContext, @NotNull MovableContentStateReference from, @NotNull MovableContentStateReference to) {
        Operation.CopySlotTableToAnchorLocation copySlotTableToAnchorLocation = Operation.CopySlotTableToAnchorLocation.INSTANCE;
        Operations operations = this.f14824a;
        operations.pushOp(copySlotTableToAnchorLocation);
        Operations operationsM2155constructorimpl = Operations.WriteScope.m2155constructorimpl(operations);
        Operations.WriteScope.m2161setObjectDKhxnng(operationsM2155constructorimpl, Operation.ObjectParameter.m2125constructorimpl(0), resolvedState);
        Operations.WriteScope.m2161setObjectDKhxnng(operationsM2155constructorimpl, Operation.ObjectParameter.m2125constructorimpl(1), parentContext);
        Operations.WriteScope.m2161setObjectDKhxnng(operationsM2155constructorimpl, Operation.ObjectParameter.m2125constructorimpl(3), to);
        Operations.WriteScope.m2161setObjectDKhxnng(operationsM2155constructorimpl, Operation.ObjectParameter.m2125constructorimpl(2), from);
        if (operations.f14855g == Operations.access$createExpectedArgMask(operations, copySlotTableToAnchorLocation.getInts()) && operations.f14856h == Operations.access$createExpectedArgMask(operations, copySlotTableToAnchorLocation.getObjects())) {
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        int ints = copySlotTableToAnchorLocation.getInts();
        int i10 = 0;
        for (int i11 = 0; i11 < ints; i11++) {
            if (((1 << i11) & operations.f14855g) != 0) {
                if (i10 > 0) {
                    sb2.append(", ");
                }
                sb2.append(copySlotTableToAnchorLocation.mo2086intParamNamew8GmfQM(Operation.IntParameter.m2114constructorimpl(i11)));
                i10++;
            }
        }
        String string = sb2.toString();
        StringBuilder sbC = a.c(string, "StringBuilder().apply(builderAction).toString()");
        int objects = copySlotTableToAnchorLocation.getObjects();
        int i12 = 0;
        for (int i13 = 0; i13 < objects; i13++) {
            if (((1 << i13) & operations.f14856h) != 0) {
                if (i10 > 0) {
                    sbC.append(", ");
                }
                sbC.append(copySlotTableToAnchorLocation.mo2087objectParamName31yXWZQ(Operation.ObjectParameter.m2125constructorimpl(i13)));
                i12++;
            }
        }
        String string2 = sbC.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "StringBuilder().apply(builderAction).toString()");
        StringBuilder sb3 = new StringBuilder("Error while pushing ");
        sb3.append(copySlotTableToAnchorLocation);
        sb3.append(". Not all arguments were provided. Missing ");
        androidx.room.a.f(sb3, i10, " int arguments (", string, ") and ");
        b.g(sb3, i12, " object arguments (", string2, ").");
    }

    public final void pushDeactivateCurrentGroup() {
        this.f14824a.push(Operation.DeactivateCurrentGroup.INSTANCE);
    }

    public final void pushDetermineMovableContentNodeIndex(@NotNull IntRef effectiveNodeIndexOut, @NotNull Anchor anchor) {
        Operation.DetermineMovableContentNodeIndex determineMovableContentNodeIndex = Operation.DetermineMovableContentNodeIndex.INSTANCE;
        Operations operations = this.f14824a;
        operations.pushOp(determineMovableContentNodeIndex);
        Operations operationsM2155constructorimpl = Operations.WriteScope.m2155constructorimpl(operations);
        Operations.WriteScope.m2161setObjectDKhxnng(operationsM2155constructorimpl, Operation.ObjectParameter.m2125constructorimpl(0), effectiveNodeIndexOut);
        Operations.WriteScope.m2161setObjectDKhxnng(operationsM2155constructorimpl, Operation.ObjectParameter.m2125constructorimpl(1), anchor);
        if (operations.f14855g == Operations.access$createExpectedArgMask(operations, determineMovableContentNodeIndex.getInts()) && operations.f14856h == Operations.access$createExpectedArgMask(operations, determineMovableContentNodeIndex.getObjects())) {
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        int ints = determineMovableContentNodeIndex.getInts();
        int i10 = 0;
        for (int i11 = 0; i11 < ints; i11++) {
            if (((1 << i11) & operations.f14855g) != 0) {
                if (i10 > 0) {
                    sb2.append(", ");
                }
                sb2.append(determineMovableContentNodeIndex.mo2086intParamNamew8GmfQM(Operation.IntParameter.m2114constructorimpl(i11)));
                i10++;
            }
        }
        String string = sb2.toString();
        StringBuilder sbC = a.c(string, "StringBuilder().apply(builderAction).toString()");
        int objects = determineMovableContentNodeIndex.getObjects();
        int i12 = 0;
        for (int i13 = 0; i13 < objects; i13++) {
            if (((1 << i13) & operations.f14856h) != 0) {
                if (i10 > 0) {
                    sbC.append(", ");
                }
                sbC.append(determineMovableContentNodeIndex.mo2087objectParamName31yXWZQ(Operation.ObjectParameter.m2125constructorimpl(i13)));
                i12++;
            }
        }
        String string2 = sbC.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "StringBuilder().apply(builderAction).toString()");
        StringBuilder sb3 = new StringBuilder("Error while pushing ");
        sb3.append(determineMovableContentNodeIndex);
        sb3.append(". Not all arguments were provided. Missing ");
        androidx.room.a.f(sb3, i10, " int arguments (", string, ") and ");
        b.g(sb3, i12, " object arguments (", string2, ").");
    }

    public final void pushDowns(@NotNull Object[] nodes) {
        if (!(nodes.length == 0)) {
            Operation.Downs downs = Operation.Downs.INSTANCE;
            Operations operations = this.f14824a;
            operations.pushOp(downs);
            Operations.WriteScope.m2161setObjectDKhxnng(Operations.WriteScope.m2155constructorimpl(operations), Operation.ObjectParameter.m2125constructorimpl(0), nodes);
            if (operations.f14855g == Operations.access$createExpectedArgMask(operations, downs.getInts()) && operations.f14856h == Operations.access$createExpectedArgMask(operations, downs.getObjects())) {
                return;
            }
            StringBuilder sb2 = new StringBuilder();
            int ints = downs.getInts();
            int i10 = 0;
            for (int i11 = 0; i11 < ints; i11++) {
                if (((1 << i11) & operations.f14855g) != 0) {
                    if (i10 > 0) {
                        sb2.append(", ");
                    }
                    sb2.append(downs.mo2086intParamNamew8GmfQM(Operation.IntParameter.m2114constructorimpl(i11)));
                    i10++;
                }
            }
            String string = sb2.toString();
            StringBuilder sbC = a.c(string, "StringBuilder().apply(builderAction).toString()");
            int objects = downs.getObjects();
            int i12 = 0;
            for (int i13 = 0; i13 < objects; i13++) {
                if (((1 << i13) & operations.f14856h) != 0) {
                    if (i10 > 0) {
                        sbC.append(", ");
                    }
                    sbC.append(downs.mo2087objectParamName31yXWZQ(Operation.ObjectParameter.m2125constructorimpl(i13)));
                    i12++;
                }
            }
            String string2 = sbC.toString();
            Intrinsics.checkNotNullExpressionValue(string2, "StringBuilder().apply(builderAction).toString()");
            StringBuilder sb3 = new StringBuilder("Error while pushing ");
            sb3.append(downs);
            sb3.append(". Not all arguments were provided. Missing ");
            androidx.room.a.f(sb3, i10, " int arguments (", string, ") and ");
            b.g(sb3, i12, " object arguments (", string2, ").");
        }
    }

    public final void pushEndCompositionScope(@NotNull Function1<? super Composition, Unit> action, @NotNull Composition composition) {
        Operation.EndCompositionScope endCompositionScope = Operation.EndCompositionScope.INSTANCE;
        Operations operations = this.f14824a;
        operations.pushOp(endCompositionScope);
        Operations operationsM2155constructorimpl = Operations.WriteScope.m2155constructorimpl(operations);
        Operations.WriteScope.m2161setObjectDKhxnng(operationsM2155constructorimpl, Operation.ObjectParameter.m2125constructorimpl(0), action);
        Operations.WriteScope.m2161setObjectDKhxnng(operationsM2155constructorimpl, Operation.ObjectParameter.m2125constructorimpl(1), composition);
        if (operations.f14855g == Operations.access$createExpectedArgMask(operations, endCompositionScope.getInts()) && operations.f14856h == Operations.access$createExpectedArgMask(operations, endCompositionScope.getObjects())) {
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        int ints = endCompositionScope.getInts();
        int i10 = 0;
        for (int i11 = 0; i11 < ints; i11++) {
            if (((1 << i11) & operations.f14855g) != 0) {
                if (i10 > 0) {
                    sb2.append(", ");
                }
                sb2.append(endCompositionScope.mo2086intParamNamew8GmfQM(Operation.IntParameter.m2114constructorimpl(i11)));
                i10++;
            }
        }
        String string = sb2.toString();
        StringBuilder sbC = a.c(string, "StringBuilder().apply(builderAction).toString()");
        int objects = endCompositionScope.getObjects();
        int i12 = 0;
        for (int i13 = 0; i13 < objects; i13++) {
            if (((1 << i13) & operations.f14856h) != 0) {
                if (i10 > 0) {
                    sbC.append(", ");
                }
                sbC.append(endCompositionScope.mo2087objectParamName31yXWZQ(Operation.ObjectParameter.m2125constructorimpl(i13)));
                i12++;
            }
        }
        String string2 = sbC.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "StringBuilder().apply(builderAction).toString()");
        StringBuilder sb3 = new StringBuilder("Error while pushing ");
        sb3.append(endCompositionScope);
        sb3.append(". Not all arguments were provided. Missing ");
        androidx.room.a.f(sb3, i10, " int arguments (", string, ") and ");
        b.g(sb3, i12, " object arguments (", string2, ").");
    }

    public final void pushEndCurrentGroup() {
        this.f14824a.push(Operation.EndCurrentGroup.INSTANCE);
    }

    public final void pushEndMovableContentPlacement() {
        this.f14824a.push(Operation.EndMovableContentPlacement.INSTANCE);
    }

    public final void pushEnsureGroupStarted(@NotNull Anchor anchor) {
        Operation.EnsureGroupStarted ensureGroupStarted = Operation.EnsureGroupStarted.INSTANCE;
        Operations operations = this.f14824a;
        operations.pushOp(ensureGroupStarted);
        Operations.WriteScope.m2161setObjectDKhxnng(Operations.WriteScope.m2155constructorimpl(operations), Operation.ObjectParameter.m2125constructorimpl(0), anchor);
        if (operations.f14855g == Operations.access$createExpectedArgMask(operations, ensureGroupStarted.getInts()) && operations.f14856h == Operations.access$createExpectedArgMask(operations, ensureGroupStarted.getObjects())) {
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        int ints = ensureGroupStarted.getInts();
        int i10 = 0;
        for (int i11 = 0; i11 < ints; i11++) {
            if (((1 << i11) & operations.f14855g) != 0) {
                if (i10 > 0) {
                    sb2.append(", ");
                }
                sb2.append(ensureGroupStarted.mo2086intParamNamew8GmfQM(Operation.IntParameter.m2114constructorimpl(i11)));
                i10++;
            }
        }
        String string = sb2.toString();
        StringBuilder sbC = a.c(string, "StringBuilder().apply(builderAction).toString()");
        int objects = ensureGroupStarted.getObjects();
        int i12 = 0;
        for (int i13 = 0; i13 < objects; i13++) {
            if (((1 << i13) & operations.f14856h) != 0) {
                if (i10 > 0) {
                    sbC.append(", ");
                }
                sbC.append(ensureGroupStarted.mo2087objectParamName31yXWZQ(Operation.ObjectParameter.m2125constructorimpl(i13)));
                i12++;
            }
        }
        String string2 = sbC.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "StringBuilder().apply(builderAction).toString()");
        StringBuilder sb3 = new StringBuilder("Error while pushing ");
        sb3.append(ensureGroupStarted);
        sb3.append(". Not all arguments were provided. Missing ");
        androidx.room.a.f(sb3, i10, " int arguments (", string, ") and ");
        b.g(sb3, i12, " object arguments (", string2, ").");
    }

    public final void pushEnsureRootStarted() {
        this.f14824a.push(Operation.EnsureRootGroupStarted.INSTANCE);
    }

    public final void pushExecuteOperationsIn(@NotNull ChangeList changeList, @Nullable IntRef effectiveNodeIndex) {
        if (changeList.isNotEmpty()) {
            Operation.ApplyChangeList applyChangeList = Operation.ApplyChangeList.INSTANCE;
            Operations operations = this.f14824a;
            operations.pushOp(applyChangeList);
            Operations operationsM2155constructorimpl = Operations.WriteScope.m2155constructorimpl(operations);
            Operations.WriteScope.m2161setObjectDKhxnng(operationsM2155constructorimpl, Operation.ObjectParameter.m2125constructorimpl(0), changeList);
            Operations.WriteScope.m2161setObjectDKhxnng(operationsM2155constructorimpl, Operation.ObjectParameter.m2125constructorimpl(1), effectiveNodeIndex);
            if (operations.f14855g == Operations.access$createExpectedArgMask(operations, applyChangeList.getInts()) && operations.f14856h == Operations.access$createExpectedArgMask(operations, applyChangeList.getObjects())) {
                return;
            }
            StringBuilder sb2 = new StringBuilder();
            int ints = applyChangeList.getInts();
            int i10 = 0;
            for (int i11 = 0; i11 < ints; i11++) {
                if (((1 << i11) & operations.f14855g) != 0) {
                    if (i10 > 0) {
                        sb2.append(", ");
                    }
                    sb2.append(applyChangeList.mo2086intParamNamew8GmfQM(Operation.IntParameter.m2114constructorimpl(i11)));
                    i10++;
                }
            }
            String string = sb2.toString();
            StringBuilder sbC = a.c(string, "StringBuilder().apply(builderAction).toString()");
            int objects = applyChangeList.getObjects();
            int i12 = 0;
            for (int i13 = 0; i13 < objects; i13++) {
                if (((1 << i13) & operations.f14856h) != 0) {
                    if (i10 > 0) {
                        sbC.append(", ");
                    }
                    sbC.append(applyChangeList.mo2087objectParamName31yXWZQ(Operation.ObjectParameter.m2125constructorimpl(i13)));
                    i12++;
                }
            }
            String string2 = sbC.toString();
            Intrinsics.checkNotNullExpressionValue(string2, "StringBuilder().apply(builderAction).toString()");
            StringBuilder sb3 = new StringBuilder("Error while pushing ");
            sb3.append(applyChangeList);
            sb3.append(". Not all arguments were provided. Missing ");
            androidx.room.a.f(sb3, i10, " int arguments (", string, ") and ");
            b.g(sb3, i12, " object arguments (", string2, ").");
        }
    }

    public final void pushInsertSlots(@NotNull Anchor anchor, @NotNull SlotTable from) {
        Operation.InsertSlots insertSlots = Operation.InsertSlots.INSTANCE;
        Operations operations = this.f14824a;
        operations.pushOp(insertSlots);
        Operations operationsM2155constructorimpl = Operations.WriteScope.m2155constructorimpl(operations);
        Operations.WriteScope.m2161setObjectDKhxnng(operationsM2155constructorimpl, Operation.ObjectParameter.m2125constructorimpl(0), anchor);
        Operations.WriteScope.m2161setObjectDKhxnng(operationsM2155constructorimpl, Operation.ObjectParameter.m2125constructorimpl(1), from);
        if (operations.f14855g == Operations.access$createExpectedArgMask(operations, insertSlots.getInts()) && operations.f14856h == Operations.access$createExpectedArgMask(operations, insertSlots.getObjects())) {
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        int ints = insertSlots.getInts();
        int i10 = 0;
        for (int i11 = 0; i11 < ints; i11++) {
            if (((1 << i11) & operations.f14855g) != 0) {
                if (i10 > 0) {
                    sb2.append(", ");
                }
                sb2.append(insertSlots.mo2086intParamNamew8GmfQM(Operation.IntParameter.m2114constructorimpl(i11)));
                i10++;
            }
        }
        String string = sb2.toString();
        StringBuilder sbC = a.c(string, "StringBuilder().apply(builderAction).toString()");
        int objects = insertSlots.getObjects();
        int i12 = 0;
        for (int i13 = 0; i13 < objects; i13++) {
            if (((1 << i13) & operations.f14856h) != 0) {
                if (i10 > 0) {
                    sbC.append(", ");
                }
                sbC.append(insertSlots.mo2087objectParamName31yXWZQ(Operation.ObjectParameter.m2125constructorimpl(i13)));
                i12++;
            }
        }
        String string2 = sbC.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "StringBuilder().apply(builderAction).toString()");
        StringBuilder sb3 = new StringBuilder("Error while pushing ");
        sb3.append(insertSlots);
        sb3.append(". Not all arguments were provided. Missing ");
        androidx.room.a.f(sb3, i10, " int arguments (", string, ") and ");
        b.g(sb3, i12, " object arguments (", string2, ").");
    }

    public final void pushMoveCurrentGroup(int offset) {
        Operation.MoveCurrentGroup moveCurrentGroup = Operation.MoveCurrentGroup.INSTANCE;
        Operations operations = this.f14824a;
        operations.pushOp(moveCurrentGroup);
        Operations.WriteScope.m2160setIntA6tL2VI(Operations.WriteScope.m2155constructorimpl(operations), Operation.IntParameter.m2114constructorimpl(0), offset);
        if (operations.f14855g == Operations.access$createExpectedArgMask(operations, moveCurrentGroup.getInts()) && operations.f14856h == Operations.access$createExpectedArgMask(operations, moveCurrentGroup.getObjects())) {
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        int ints = moveCurrentGroup.getInts();
        int i10 = 0;
        for (int i11 = 0; i11 < ints; i11++) {
            if (((1 << i11) & operations.f14855g) != 0) {
                if (i10 > 0) {
                    sb2.append(", ");
                }
                sb2.append(moveCurrentGroup.mo2086intParamNamew8GmfQM(Operation.IntParameter.m2114constructorimpl(i11)));
                i10++;
            }
        }
        String string = sb2.toString();
        StringBuilder sbC = a.c(string, "StringBuilder().apply(builderAction).toString()");
        int objects = moveCurrentGroup.getObjects();
        int i12 = 0;
        for (int i13 = 0; i13 < objects; i13++) {
            if (((1 << i13) & operations.f14856h) != 0) {
                if (i10 > 0) {
                    sbC.append(", ");
                }
                sbC.append(moveCurrentGroup.mo2087objectParamName31yXWZQ(Operation.ObjectParameter.m2125constructorimpl(i13)));
                i12++;
            }
        }
        String string2 = sbC.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "StringBuilder().apply(builderAction).toString()");
        StringBuilder sb3 = new StringBuilder("Error while pushing ");
        sb3.append(moveCurrentGroup);
        sb3.append(". Not all arguments were provided. Missing ");
        androidx.room.a.f(sb3, i10, " int arguments (", string, ") and ");
        b.g(sb3, i12, " object arguments (", string2, ").");
    }

    public final void pushMoveNode(int to, int from, int count) {
        Operation.MoveNode moveNode = Operation.MoveNode.INSTANCE;
        Operations operations = this.f14824a;
        operations.pushOp(moveNode);
        Operations operationsM2155constructorimpl = Operations.WriteScope.m2155constructorimpl(operations);
        Operations.WriteScope.m2160setIntA6tL2VI(operationsM2155constructorimpl, Operation.IntParameter.m2114constructorimpl(1), to);
        Operations.WriteScope.m2160setIntA6tL2VI(operationsM2155constructorimpl, Operation.IntParameter.m2114constructorimpl(0), from);
        Operations.WriteScope.m2160setIntA6tL2VI(operationsM2155constructorimpl, Operation.IntParameter.m2114constructorimpl(2), count);
        if (operations.f14855g == Operations.access$createExpectedArgMask(operations, moveNode.getInts()) && operations.f14856h == Operations.access$createExpectedArgMask(operations, moveNode.getObjects())) {
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        int ints = moveNode.getInts();
        int i10 = 0;
        for (int i11 = 0; i11 < ints; i11++) {
            if (((1 << i11) & operations.f14855g) != 0) {
                if (i10 > 0) {
                    sb2.append(", ");
                }
                sb2.append(moveNode.mo2086intParamNamew8GmfQM(Operation.IntParameter.m2114constructorimpl(i11)));
                i10++;
            }
        }
        String string = sb2.toString();
        StringBuilder sbC = a.c(string, "StringBuilder().apply(builderAction).toString()");
        int objects = moveNode.getObjects();
        int i12 = 0;
        for (int i13 = 0; i13 < objects; i13++) {
            if (((1 << i13) & operations.f14856h) != 0) {
                if (i10 > 0) {
                    sbC.append(", ");
                }
                sbC.append(moveNode.mo2087objectParamName31yXWZQ(Operation.ObjectParameter.m2125constructorimpl(i13)));
                i12++;
            }
        }
        String string2 = sbC.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "StringBuilder().apply(builderAction).toString()");
        StringBuilder sb3 = new StringBuilder("Error while pushing ");
        sb3.append(moveNode);
        sb3.append(". Not all arguments were provided. Missing ");
        androidx.room.a.f(sb3, i10, " int arguments (", string, ") and ");
        b.g(sb3, i12, " object arguments (", string2, ").");
    }

    public final void pushReleaseMovableGroupAtCurrent(@NotNull ControlledComposition composition, @NotNull CompositionContext parentContext, @NotNull MovableContentStateReference reference) {
        Operation.ReleaseMovableGroupAtCurrent releaseMovableGroupAtCurrent = Operation.ReleaseMovableGroupAtCurrent.INSTANCE;
        Operations operations = this.f14824a;
        operations.pushOp(releaseMovableGroupAtCurrent);
        Operations operationsM2155constructorimpl = Operations.WriteScope.m2155constructorimpl(operations);
        Operations.WriteScope.m2161setObjectDKhxnng(operationsM2155constructorimpl, Operation.ObjectParameter.m2125constructorimpl(0), composition);
        Operations.WriteScope.m2161setObjectDKhxnng(operationsM2155constructorimpl, Operation.ObjectParameter.m2125constructorimpl(1), parentContext);
        Operations.WriteScope.m2161setObjectDKhxnng(operationsM2155constructorimpl, Operation.ObjectParameter.m2125constructorimpl(2), reference);
        if (operations.f14855g == Operations.access$createExpectedArgMask(operations, releaseMovableGroupAtCurrent.getInts()) && operations.f14856h == Operations.access$createExpectedArgMask(operations, releaseMovableGroupAtCurrent.getObjects())) {
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        int ints = releaseMovableGroupAtCurrent.getInts();
        int i10 = 0;
        for (int i11 = 0; i11 < ints; i11++) {
            if (((1 << i11) & operations.f14855g) != 0) {
                if (i10 > 0) {
                    sb2.append(", ");
                }
                sb2.append(releaseMovableGroupAtCurrent.mo2086intParamNamew8GmfQM(Operation.IntParameter.m2114constructorimpl(i11)));
                i10++;
            }
        }
        String string = sb2.toString();
        StringBuilder sbC = a.c(string, "StringBuilder().apply(builderAction).toString()");
        int objects = releaseMovableGroupAtCurrent.getObjects();
        int i12 = 0;
        for (int i13 = 0; i13 < objects; i13++) {
            if (((1 << i13) & operations.f14856h) != 0) {
                if (i10 > 0) {
                    sbC.append(", ");
                }
                sbC.append(releaseMovableGroupAtCurrent.mo2087objectParamName31yXWZQ(Operation.ObjectParameter.m2125constructorimpl(i13)));
                i12++;
            }
        }
        String string2 = sbC.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "StringBuilder().apply(builderAction).toString()");
        StringBuilder sb3 = new StringBuilder("Error while pushing ");
        sb3.append(releaseMovableGroupAtCurrent);
        sb3.append(". Not all arguments were provided. Missing ");
        androidx.room.a.f(sb3, i10, " int arguments (", string, ") and ");
        b.g(sb3, i12, " object arguments (", string2, ").");
    }

    public final void pushRemember(@NotNull RememberObserver value) {
        Operation.Remember remember = Operation.Remember.INSTANCE;
        Operations operations = this.f14824a;
        operations.pushOp(remember);
        Operations.WriteScope.m2161setObjectDKhxnng(Operations.WriteScope.m2155constructorimpl(operations), Operation.ObjectParameter.m2125constructorimpl(0), value);
        if (operations.f14855g == Operations.access$createExpectedArgMask(operations, remember.getInts()) && operations.f14856h == Operations.access$createExpectedArgMask(operations, remember.getObjects())) {
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        int ints = remember.getInts();
        int i10 = 0;
        for (int i11 = 0; i11 < ints; i11++) {
            if (((1 << i11) & operations.f14855g) != 0) {
                if (i10 > 0) {
                    sb2.append(", ");
                }
                sb2.append(remember.mo2086intParamNamew8GmfQM(Operation.IntParameter.m2114constructorimpl(i11)));
                i10++;
            }
        }
        String string = sb2.toString();
        StringBuilder sbC = a.c(string, "StringBuilder().apply(builderAction).toString()");
        int objects = remember.getObjects();
        int i12 = 0;
        for (int i13 = 0; i13 < objects; i13++) {
            if (((1 << i13) & operations.f14856h) != 0) {
                if (i10 > 0) {
                    sbC.append(", ");
                }
                sbC.append(remember.mo2087objectParamName31yXWZQ(Operation.ObjectParameter.m2125constructorimpl(i13)));
                i12++;
            }
        }
        String string2 = sbC.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "StringBuilder().apply(builderAction).toString()");
        StringBuilder sb3 = new StringBuilder("Error while pushing ");
        sb3.append(remember);
        sb3.append(". Not all arguments were provided. Missing ");
        androidx.room.a.f(sb3, i10, " int arguments (", string, ") and ");
        b.g(sb3, i12, " object arguments (", string2, ").");
    }

    public final void pushRemoveCurrentGroup() {
        this.f14824a.push(Operation.RemoveCurrentGroup.INSTANCE);
    }

    public final void pushRemoveNode(int removeFrom, int moveCount) {
        Operation.RemoveNode removeNode = Operation.RemoveNode.INSTANCE;
        Operations operations = this.f14824a;
        operations.pushOp(removeNode);
        Operations operationsM2155constructorimpl = Operations.WriteScope.m2155constructorimpl(operations);
        Operations.WriteScope.m2160setIntA6tL2VI(operationsM2155constructorimpl, Operation.IntParameter.m2114constructorimpl(0), removeFrom);
        Operations.WriteScope.m2160setIntA6tL2VI(operationsM2155constructorimpl, Operation.IntParameter.m2114constructorimpl(1), moveCount);
        if (operations.f14855g == Operations.access$createExpectedArgMask(operations, removeNode.getInts()) && operations.f14856h == Operations.access$createExpectedArgMask(operations, removeNode.getObjects())) {
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        int ints = removeNode.getInts();
        int i10 = 0;
        for (int i11 = 0; i11 < ints; i11++) {
            if (((1 << i11) & operations.f14855g) != 0) {
                if (i10 > 0) {
                    sb2.append(", ");
                }
                sb2.append(removeNode.mo2086intParamNamew8GmfQM(Operation.IntParameter.m2114constructorimpl(i11)));
                i10++;
            }
        }
        String string = sb2.toString();
        StringBuilder sbC = a.c(string, "StringBuilder().apply(builderAction).toString()");
        int objects = removeNode.getObjects();
        int i12 = 0;
        for (int i13 = 0; i13 < objects; i13++) {
            if (((1 << i13) & operations.f14856h) != 0) {
                if (i10 > 0) {
                    sbC.append(", ");
                }
                sbC.append(removeNode.mo2087objectParamName31yXWZQ(Operation.ObjectParameter.m2125constructorimpl(i13)));
                i12++;
            }
        }
        String string2 = sbC.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "StringBuilder().apply(builderAction).toString()");
        StringBuilder sb3 = new StringBuilder("Error while pushing ");
        sb3.append(removeNode);
        sb3.append(". Not all arguments were provided. Missing ");
        androidx.room.a.f(sb3, i10, " int arguments (", string, ") and ");
        b.g(sb3, i12, " object arguments (", string2, ").");
    }

    public final void pushResetSlots() {
        this.f14824a.push(Operation.ResetSlots.INSTANCE);
    }

    public final void pushSideEffect(@NotNull Function0<Unit> effect) {
        Operation.SideEffect sideEffect = Operation.SideEffect.INSTANCE;
        Operations operations = this.f14824a;
        operations.pushOp(sideEffect);
        Operations.WriteScope.m2161setObjectDKhxnng(Operations.WriteScope.m2155constructorimpl(operations), Operation.ObjectParameter.m2125constructorimpl(0), effect);
        if (operations.f14855g == Operations.access$createExpectedArgMask(operations, sideEffect.getInts()) && operations.f14856h == Operations.access$createExpectedArgMask(operations, sideEffect.getObjects())) {
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        int ints = sideEffect.getInts();
        int i10 = 0;
        for (int i11 = 0; i11 < ints; i11++) {
            if (((1 << i11) & operations.f14855g) != 0) {
                if (i10 > 0) {
                    sb2.append(", ");
                }
                sb2.append(sideEffect.mo2086intParamNamew8GmfQM(Operation.IntParameter.m2114constructorimpl(i11)));
                i10++;
            }
        }
        String string = sb2.toString();
        StringBuilder sbC = a.c(string, "StringBuilder().apply(builderAction).toString()");
        int objects = sideEffect.getObjects();
        int i12 = 0;
        for (int i13 = 0; i13 < objects; i13++) {
            if (((1 << i13) & operations.f14856h) != 0) {
                if (i10 > 0) {
                    sbC.append(", ");
                }
                sbC.append(sideEffect.mo2087objectParamName31yXWZQ(Operation.ObjectParameter.m2125constructorimpl(i13)));
                i12++;
            }
        }
        String string2 = sbC.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "StringBuilder().apply(builderAction).toString()");
        StringBuilder sb3 = new StringBuilder("Error while pushing ");
        sb3.append(sideEffect);
        sb3.append(". Not all arguments were provided. Missing ");
        androidx.room.a.f(sb3, i10, " int arguments (", string, ") and ");
        b.g(sb3, i12, " object arguments (", string2, ").");
    }

    public final void pushSkipToEndOfCurrentGroup() {
        this.f14824a.push(Operation.SkipToEndOfCurrentGroup.INSTANCE);
    }

    public final void pushTrimValues(int count) {
        Operation.TrimParentValues trimParentValues = Operation.TrimParentValues.INSTANCE;
        Operations operations = this.f14824a;
        operations.pushOp(trimParentValues);
        Operations.WriteScope.m2160setIntA6tL2VI(Operations.WriteScope.m2155constructorimpl(operations), Operation.IntParameter.m2114constructorimpl(0), count);
        if (operations.f14855g == Operations.access$createExpectedArgMask(operations, trimParentValues.getInts()) && operations.f14856h == Operations.access$createExpectedArgMask(operations, trimParentValues.getObjects())) {
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        int ints = trimParentValues.getInts();
        int i10 = 0;
        for (int i11 = 0; i11 < ints; i11++) {
            if (((1 << i11) & operations.f14855g) != 0) {
                if (i10 > 0) {
                    sb2.append(", ");
                }
                sb2.append(trimParentValues.mo2086intParamNamew8GmfQM(Operation.IntParameter.m2114constructorimpl(i11)));
                i10++;
            }
        }
        String string = sb2.toString();
        StringBuilder sbC = a.c(string, "StringBuilder().apply(builderAction).toString()");
        int objects = trimParentValues.getObjects();
        int i12 = 0;
        for (int i13 = 0; i13 < objects; i13++) {
            if (((1 << i13) & operations.f14856h) != 0) {
                if (i10 > 0) {
                    sbC.append(", ");
                }
                sbC.append(trimParentValues.mo2087objectParamName31yXWZQ(Operation.ObjectParameter.m2125constructorimpl(i13)));
                i12++;
            }
        }
        String string2 = sbC.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "StringBuilder().apply(builderAction).toString()");
        StringBuilder sb3 = new StringBuilder("Error while pushing ");
        sb3.append(trimParentValues);
        sb3.append(". Not all arguments were provided. Missing ");
        androidx.room.a.f(sb3, i10, " int arguments (", string, ") and ");
        b.g(sb3, i12, " object arguments (", string2, ").");
    }

    public final void pushUpdateAnchoredValue(@Nullable Object value, @NotNull Anchor anchor, int groupSlotIndex) {
        Operation.UpdateAnchoredValue updateAnchoredValue = Operation.UpdateAnchoredValue.INSTANCE;
        Operations operations = this.f14824a;
        operations.pushOp(updateAnchoredValue);
        Operations operationsM2155constructorimpl = Operations.WriteScope.m2155constructorimpl(operations);
        Operations.WriteScope.m2161setObjectDKhxnng(operationsM2155constructorimpl, Operation.ObjectParameter.m2125constructorimpl(0), value);
        Operations.WriteScope.m2161setObjectDKhxnng(operationsM2155constructorimpl, Operation.ObjectParameter.m2125constructorimpl(1), anchor);
        Operations.WriteScope.m2160setIntA6tL2VI(operationsM2155constructorimpl, Operation.IntParameter.m2114constructorimpl(0), groupSlotIndex);
        if (operations.f14855g == Operations.access$createExpectedArgMask(operations, updateAnchoredValue.getInts()) && operations.f14856h == Operations.access$createExpectedArgMask(operations, updateAnchoredValue.getObjects())) {
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        int ints = updateAnchoredValue.getInts();
        int i10 = 0;
        for (int i11 = 0; i11 < ints; i11++) {
            if (((1 << i11) & operations.f14855g) != 0) {
                if (i10 > 0) {
                    sb2.append(", ");
                }
                sb2.append(updateAnchoredValue.mo2086intParamNamew8GmfQM(Operation.IntParameter.m2114constructorimpl(i11)));
                i10++;
            }
        }
        String string = sb2.toString();
        StringBuilder sbC = a.c(string, "StringBuilder().apply(builderAction).toString()");
        int objects = updateAnchoredValue.getObjects();
        int i12 = 0;
        for (int i13 = 0; i13 < objects; i13++) {
            if (((1 << i13) & operations.f14856h) != 0) {
                if (i10 > 0) {
                    sbC.append(", ");
                }
                sbC.append(updateAnchoredValue.mo2087objectParamName31yXWZQ(Operation.ObjectParameter.m2125constructorimpl(i13)));
                i12++;
            }
        }
        String string2 = sbC.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "StringBuilder().apply(builderAction).toString()");
        StringBuilder sb3 = new StringBuilder("Error while pushing ");
        sb3.append(updateAnchoredValue);
        sb3.append(". Not all arguments were provided. Missing ");
        androidx.room.a.f(sb3, i10, " int arguments (", string, ") and ");
        b.g(sb3, i12, " object arguments (", string2, ").");
    }

    public final void pushUpdateAuxData(@Nullable Object data) {
        Operation.UpdateAuxData updateAuxData = Operation.UpdateAuxData.INSTANCE;
        Operations operations = this.f14824a;
        operations.pushOp(updateAuxData);
        Operations.WriteScope.m2161setObjectDKhxnng(Operations.WriteScope.m2155constructorimpl(operations), Operation.ObjectParameter.m2125constructorimpl(0), data);
        if (operations.f14855g == Operations.access$createExpectedArgMask(operations, updateAuxData.getInts()) && operations.f14856h == Operations.access$createExpectedArgMask(operations, updateAuxData.getObjects())) {
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        int ints = updateAuxData.getInts();
        int i10 = 0;
        for (int i11 = 0; i11 < ints; i11++) {
            if (((1 << i11) & operations.f14855g) != 0) {
                if (i10 > 0) {
                    sb2.append(", ");
                }
                sb2.append(updateAuxData.mo2086intParamNamew8GmfQM(Operation.IntParameter.m2114constructorimpl(i11)));
                i10++;
            }
        }
        String string = sb2.toString();
        StringBuilder sbC = a.c(string, "StringBuilder().apply(builderAction).toString()");
        int objects = updateAuxData.getObjects();
        int i12 = 0;
        for (int i13 = 0; i13 < objects; i13++) {
            if (((1 << i13) & operations.f14856h) != 0) {
                if (i10 > 0) {
                    sbC.append(", ");
                }
                sbC.append(updateAuxData.mo2087objectParamName31yXWZQ(Operation.ObjectParameter.m2125constructorimpl(i13)));
                i12++;
            }
        }
        String string2 = sbC.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "StringBuilder().apply(builderAction).toString()");
        StringBuilder sb3 = new StringBuilder("Error while pushing ");
        sb3.append(updateAuxData);
        sb3.append(". Not all arguments were provided. Missing ");
        androidx.room.a.f(sb3, i10, " int arguments (", string, ") and ");
        b.g(sb3, i12, " object arguments (", string2, ").");
    }

    public final <T, V> void pushUpdateNode(V value, @NotNull Function2<? super T, ? super V, Unit> block) {
        Operation.UpdateNode updateNode = Operation.UpdateNode.INSTANCE;
        Operations operations = this.f14824a;
        operations.pushOp(updateNode);
        Operations operationsM2155constructorimpl = Operations.WriteScope.m2155constructorimpl(operations);
        Operations.WriteScope.m2161setObjectDKhxnng(operationsM2155constructorimpl, Operation.ObjectParameter.m2125constructorimpl(0), value);
        int iM2125constructorimpl = Operation.ObjectParameter.m2125constructorimpl(1);
        Intrinsics.checkNotNull(block, "null cannot be cast to non-null type @[ExtensionFunctionType] kotlin.Function2<kotlin.Any?, kotlin.Any?, kotlin.Unit>");
        Operations.WriteScope.m2161setObjectDKhxnng(operationsM2155constructorimpl, iM2125constructorimpl, (Function2) TypeIntrinsics.beforeCheckcastToFunctionOfArity(block, 2));
        if (operations.f14855g == Operations.access$createExpectedArgMask(operations, updateNode.getInts()) && operations.f14856h == Operations.access$createExpectedArgMask(operations, updateNode.getObjects())) {
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        int ints = updateNode.getInts();
        int i10 = 0;
        for (int i11 = 0; i11 < ints; i11++) {
            if (((1 << i11) & operations.f14855g) != 0) {
                if (i10 > 0) {
                    sb2.append(", ");
                }
                sb2.append(updateNode.mo2086intParamNamew8GmfQM(Operation.IntParameter.m2114constructorimpl(i11)));
                i10++;
            }
        }
        String string = sb2.toString();
        StringBuilder sbC = a.c(string, "StringBuilder().apply(builderAction).toString()");
        int objects = updateNode.getObjects();
        int i12 = 0;
        for (int i13 = 0; i13 < objects; i13++) {
            if (((1 << i13) & operations.f14856h) != 0) {
                if (i10 > 0) {
                    sbC.append(", ");
                }
                sbC.append(updateNode.mo2087objectParamName31yXWZQ(Operation.ObjectParameter.m2125constructorimpl(i13)));
                i12++;
            }
        }
        String string2 = sbC.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "StringBuilder().apply(builderAction).toString()");
        StringBuilder sb3 = new StringBuilder("Error while pushing ");
        sb3.append(updateNode);
        sb3.append(". Not all arguments were provided. Missing ");
        androidx.room.a.f(sb3, i10, " int arguments (", string, ") and ");
        b.g(sb3, i12, " object arguments (", string2, ").");
    }

    public final void pushUpdateValue(@Nullable Object value, int groupSlotIndex) {
        Operation.UpdateValue updateValue = Operation.UpdateValue.INSTANCE;
        Operations operations = this.f14824a;
        operations.pushOp(updateValue);
        Operations operationsM2155constructorimpl = Operations.WriteScope.m2155constructorimpl(operations);
        Operations.WriteScope.m2161setObjectDKhxnng(operationsM2155constructorimpl, Operation.ObjectParameter.m2125constructorimpl(0), value);
        Operations.WriteScope.m2160setIntA6tL2VI(operationsM2155constructorimpl, Operation.IntParameter.m2114constructorimpl(0), groupSlotIndex);
        if (operations.f14855g == Operations.access$createExpectedArgMask(operations, updateValue.getInts()) && operations.f14856h == Operations.access$createExpectedArgMask(operations, updateValue.getObjects())) {
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        int ints = updateValue.getInts();
        int i10 = 0;
        for (int i11 = 0; i11 < ints; i11++) {
            if (((1 << i11) & operations.f14855g) != 0) {
                if (i10 > 0) {
                    sb2.append(", ");
                }
                sb2.append(updateValue.mo2086intParamNamew8GmfQM(Operation.IntParameter.m2114constructorimpl(i11)));
                i10++;
            }
        }
        String string = sb2.toString();
        StringBuilder sbC = a.c(string, "StringBuilder().apply(builderAction).toString()");
        int objects = updateValue.getObjects();
        int i12 = 0;
        for (int i13 = 0; i13 < objects; i13++) {
            if (((1 << i13) & operations.f14856h) != 0) {
                if (i10 > 0) {
                    sbC.append(", ");
                }
                sbC.append(updateValue.mo2087objectParamName31yXWZQ(Operation.ObjectParameter.m2125constructorimpl(i13)));
                i12++;
            }
        }
        String string2 = sbC.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "StringBuilder().apply(builderAction).toString()");
        StringBuilder sb3 = new StringBuilder("Error while pushing ");
        sb3.append(updateValue);
        sb3.append(". Not all arguments were provided. Missing ");
        androidx.room.a.f(sb3, i10, " int arguments (", string, ") and ");
        b.g(sb3, i12, " object arguments (", string2, ").");
    }

    public final void pushUps(int count) {
        Operation.Ups ups = Operation.Ups.INSTANCE;
        Operations operations = this.f14824a;
        operations.pushOp(ups);
        Operations.WriteScope.m2160setIntA6tL2VI(Operations.WriteScope.m2155constructorimpl(operations), Operation.IntParameter.m2114constructorimpl(0), count);
        if (operations.f14855g == Operations.access$createExpectedArgMask(operations, ups.getInts()) && operations.f14856h == Operations.access$createExpectedArgMask(operations, ups.getObjects())) {
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        int ints = ups.getInts();
        int i10 = 0;
        for (int i11 = 0; i11 < ints; i11++) {
            if (((1 << i11) & operations.f14855g) != 0) {
                if (i10 > 0) {
                    sb2.append(", ");
                }
                sb2.append(ups.mo2086intParamNamew8GmfQM(Operation.IntParameter.m2114constructorimpl(i11)));
                i10++;
            }
        }
        String string = sb2.toString();
        StringBuilder sbC = a.c(string, "StringBuilder().apply(builderAction).toString()");
        int objects = ups.getObjects();
        int i12 = 0;
        for (int i13 = 0; i13 < objects; i13++) {
            if (((1 << i13) & operations.f14856h) != 0) {
                if (i10 > 0) {
                    sbC.append(", ");
                }
                sbC.append(ups.mo2087objectParamName31yXWZQ(Operation.ObjectParameter.m2125constructorimpl(i13)));
                i12++;
            }
        }
        String string2 = sbC.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "StringBuilder().apply(builderAction).toString()");
        StringBuilder sb3 = new StringBuilder("Error while pushing ");
        sb3.append(ups);
        sb3.append(". Not all arguments were provided. Missing ");
        androidx.room.a.f(sb3, i10, " int arguments (", string, ") and ");
        b.g(sb3, i12, " object arguments (", string2, ").");
    }

    public final void pushUseNode(@Nullable Object node) {
        if (node instanceof ComposeNodeLifecycleCallback) {
            this.f14824a.push(Operation.UseCurrentNode.INSTANCE);
        }
    }

    @Override // androidx.compose.runtime.changelist.OperationsDebugStringFormattable
    @NotNull
    public String toDebugString(@NotNull String linePrefix) {
        StringBuilder sbD = c.d("ChangeList instance containing ");
        sbD.append(getSize());
        sbD.append(" operations");
        if (sbD.length() > 0) {
            sbD.append(":\n");
            sbD.append(this.f14824a.toDebugString(linePrefix));
        }
        String string = sbD.toString();
        Intrinsics.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    public final void pushInsertSlots(@NotNull Anchor anchor, @NotNull SlotTable from, @NotNull FixupList fixups) {
        Operation.InsertSlotsWithFixups insertSlotsWithFixups = Operation.InsertSlotsWithFixups.INSTANCE;
        Operations operations = this.f14824a;
        operations.pushOp(insertSlotsWithFixups);
        Operations operationsM2155constructorimpl = Operations.WriteScope.m2155constructorimpl(operations);
        Operations.WriteScope.m2161setObjectDKhxnng(operationsM2155constructorimpl, Operation.ObjectParameter.m2125constructorimpl(0), anchor);
        Operations.WriteScope.m2161setObjectDKhxnng(operationsM2155constructorimpl, Operation.ObjectParameter.m2125constructorimpl(1), from);
        Operations.WriteScope.m2161setObjectDKhxnng(operationsM2155constructorimpl, Operation.ObjectParameter.m2125constructorimpl(2), fixups);
        if (operations.f14855g == Operations.access$createExpectedArgMask(operations, insertSlotsWithFixups.getInts()) && operations.f14856h == Operations.access$createExpectedArgMask(operations, insertSlotsWithFixups.getObjects())) {
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        int ints = insertSlotsWithFixups.getInts();
        int i10 = 0;
        for (int i11 = 0; i11 < ints; i11++) {
            if (((1 << i11) & operations.f14855g) != 0) {
                if (i10 > 0) {
                    sb2.append(", ");
                }
                sb2.append(insertSlotsWithFixups.mo2086intParamNamew8GmfQM(Operation.IntParameter.m2114constructorimpl(i11)));
                i10++;
            }
        }
        String string = sb2.toString();
        StringBuilder sbC = a.c(string, "StringBuilder().apply(builderAction).toString()");
        int objects = insertSlotsWithFixups.getObjects();
        int i12 = 0;
        for (int i13 = 0; i13 < objects; i13++) {
            if (((1 << i13) & operations.f14856h) != 0) {
                if (i10 > 0) {
                    sbC.append(", ");
                }
                sbC.append(insertSlotsWithFixups.mo2087objectParamName31yXWZQ(Operation.ObjectParameter.m2125constructorimpl(i13)));
                i12++;
            }
        }
        String string2 = sbC.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "StringBuilder().apply(builderAction).toString()");
        StringBuilder sb3 = new StringBuilder("Error while pushing ");
        sb3.append(insertSlotsWithFixups);
        sb3.append(". Not all arguments were provided. Missing ");
        androidx.room.a.f(sb3, i10, " int arguments (", string, ") and ");
        b.g(sb3, i12, " object arguments (", string2, ").");
    }
}
