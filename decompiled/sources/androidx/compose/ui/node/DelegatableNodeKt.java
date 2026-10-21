package androidx.compose.ui.node;

import androidx.collection.k;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.exifinterface.media.ExifInterface;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: DelegatableNode.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a6\u0010\t\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005H\u0080\bø\u0001\u0000\u001a\u0016\u0010\n\u001a\u0004\u0018\u00010\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000\u001a,\u0010\u000b\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005H\u0080\bø\u0001\u0000\u001a,\u0010\f\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005H\u0080\bø\u0001\u0000\u001a,\u0010\r\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030\u0005H\u0080\bø\u0001\u0000\u001a,\u0010\u000e\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005H\u0080\bø\u0001\u0000\u001a,\u0010\u000f\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005H\u0080\bø\u0001\u0000\u001aG\u0010\u000e\u001a\u00020\u0007\"\u0006\b\u0000\u0010\u0010\u0018\u0001*\u00020\u00002\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u00112\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00070\u0005H\u0080\bø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0013\u0010\u0014\u001aG\u0010\u000f\u001a\u00020\u0007\"\u0006\b\u0000\u0010\u0010\u0018\u0001*\u00020\u00002\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u00112\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00070\u0005H\u0080\bø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0015\u0010\u0014\u001aQ\u0010\t\u001a\u00020\u0007\"\u0006\b\u0000\u0010\u0010\u0018\u0001*\u00020\u00002\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u00112\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00070\u0005H\u0080\bø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0016\u0010\u0017\u001aS\u0010\u001b\u001a\u00020\u0007\"\u0006\b\u0000\u0010\u0010\u0018\u0001*\u00020\u00002\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u00112\n\u0010\u0018\u001a\u0006\u0012\u0002\b\u00030\u00112\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00070\u0005H\u0080\bø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0019\u0010\u001a\u001a8\u0010\u001f\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u001c\"\u0006\b\u0000\u0010\u0010\u0018\u0001*\u00020\u00002\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011H\u0080\bø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u001d\u0010\u001e\u001a6\u0010\n\u001a\u0004\u0018\u00018\u0000\"\n\b\u0000\u0010\u0010\u0018\u0001*\u00020 *\u00020\u00002\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011H\u0080\bø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b!\u0010\"\u001aG\u0010\u000b\u001a\u00020\u0007\"\u0006\b\u0000\u0010\u0010\u0018\u0001*\u00020\u00002\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u00112\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00070\u0005H\u0080\bø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b#\u0010\u0014\u001aG\u0010\f\u001a\u00020\u0007\"\u0006\b\u0000\u0010\u0010\u0018\u0001*\u00020\u00002\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u00112\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00070\u0005H\u0080\bø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b$\u0010\u0014\u001aG\u0010&\u001a\u00020\u0007\"\u0006\b\u0000\u0010\u0010\u0018\u0001*\u00020\u00002\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u00112\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00070\u0005H\u0080\bø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b%\u0010\u0014\u001aG\u0010\r\u001a\u00020\u0007\"\u0006\b\u0000\u0010\u0010\u0018\u0001*\u00020\u00002\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u00112\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00030\u0005H\u0080\bø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b'\u0010\u0014\u001a%\u0010*\u001a\u00020\u0003*\u00020\u00002\n\u0010\u0012\u001a\u0006\u0012\u0002\b\u00030\u0011H\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b(\u0010)\u001a%\u0010/\u001a\u00020,*\u00020\u00002\n\u0010+\u001a\u0006\u0012\u0002\b\u00030\u0011H\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b-\u0010.\u001a\f\u00101\u001a\u000200*\u00020\u0000H\u0000\u001a\f\u00103\u001a\u000202*\u00020\u0000H\u0000\u001a\n\u00105\u001a\u000204*\u00020\u0000\u001a\n\u00107\u001a\u000206*\u00020\u0000\u001a\n\u00108\u001a\u00020\u0007*\u00020\u0000\u001a\u000e\u0010:\u001a\u0004\u0018\u000109*\u00020\u0006H\u0000\u001aG\u0010=\u001a\u00020\u0007\"\u0006\b\u0000\u0010\u0010\u0018\u0001*\u00020\u00062\f\u0010+\u001a\b\u0012\u0004\u0012\u00028\u00000\u00112\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00070\u0005H\u0080\bø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b;\u0010<\"\u0018\u0010>\u001a\u00020\u0003*\u00020\u00008@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b>\u0010?\u0082\u0002\u0012\n\u0005\b\u009920\u0001\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006@"}, d2 = {"Landroidx/compose/ui/node/DelegatableNode;", "", "mask", "", "includeSelf", "Lkotlin/Function1;", "Landroidx/compose/ui/Modifier$Node;", "", "block", "visitAncestors", "nearestAncestor", "visitSubtree", "visitChildren", "visitSubtreeIf", "visitLocalDescendants", "visitLocalAncestors", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/compose/ui/node/NodeKind;", "type", "visitLocalDescendants-6rFNWt0", "(Landroidx/compose/ui/node/DelegatableNode;ILkotlin/jvm/functions/Function1;)V", "visitLocalAncestors-6rFNWt0", "visitAncestors-Y-YKmho", "(Landroidx/compose/ui/node/DelegatableNode;IZLkotlin/jvm/functions/Function1;)V", "untilType", "visitSelfAndAncestors-5BbP62I", "(Landroidx/compose/ui/node/DelegatableNode;IILkotlin/jvm/functions/Function1;)V", "visitSelfAndAncestors", "", "ancestors-64DMado", "(Landroidx/compose/ui/node/DelegatableNode;I)Ljava/util/List;", "ancestors", "", "nearestAncestor-64DMado", "(Landroidx/compose/ui/node/DelegatableNode;I)Ljava/lang/Object;", "visitSubtree-6rFNWt0", "visitChildren-6rFNWt0", "visitSelfAndChildren-6rFNWt0", "visitSelfAndChildren", "visitSubtreeIf-6rFNWt0", "has-64DMado", "(Landroidx/compose/ui/node/DelegatableNode;I)Z", "has", "kind", "Landroidx/compose/ui/node/NodeCoordinator;", "requireCoordinator-64DMado", "(Landroidx/compose/ui/node/DelegatableNode;I)Landroidx/compose/ui/node/NodeCoordinator;", "requireCoordinator", "Landroidx/compose/ui/node/LayoutNode;", "requireLayoutNode", "Landroidx/compose/ui/node/Owner;", "requireOwner", "Landroidx/compose/ui/unit/Density;", "requireDensity", "Landroidx/compose/ui/unit/LayoutDirection;", "requireLayoutDirection", "invalidateSubtree", "Landroidx/compose/ui/node/LayoutModifierNode;", "asLayoutModifierNode", "dispatchForKind-6rFNWt0", "(Landroidx/compose/ui/Modifier$Node;ILkotlin/jvm/functions/Function1;)V", "dispatchForKind", "isDelegationRoot", "(Landroidx/compose/ui/node/DelegatableNode;)Z", "ui_release"}, k = 2, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nDelegatableNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DelegatableNode.kt\nandroidx/compose/ui/node/DelegatableNodeKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 4 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 5 Modifier.kt\nandroidx/compose/ui/Modifier$Node\n+ 6 DelegatingNode.kt\nandroidx/compose/ui/node/DelegatingNode\n+ 7 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n*L\n1#1,424:1\n190#1:444\n191#1,6:446\n383#1,6:452\n393#1,2:459\n395#1,8:464\n403#1,9:475\n412#1,8:487\n198#1,3:495\n206#1:498\n207#1,4:500\n383#1,6:504\n393#1,2:511\n395#1,8:516\n403#1,9:527\n412#1,8:539\n212#1,3:547\n58#1:550\n59#1,8:552\n383#1,6:560\n393#1,2:567\n395#1,8:572\n403#1,9:583\n412#1,8:595\n68#1,7:603\n58#1,9:610\n383#1,12:619\n395#1,8:634\n403#1,9:645\n412#1,8:657\n68#1,7:665\n58#1:672\n59#1,8:674\n383#1,6:684\n393#1,2:691\n395#1,8:696\n403#1,9:707\n412#1,8:719\n68#1,7:727\n230#1,5:734\n58#1:739\n59#1,8:741\n383#1,6:749\n393#1,2:756\n395#1,8:761\n403#1,9:772\n412#1,8:784\n68#1,7:792\n230#1,5:799\n58#1:804\n59#1,8:806\n383#1,6:814\n393#1,2:821\n395#1,8:826\n403#1,9:837\n412#1,8:849\n68#1,7:857\n100#1:864\n101#1,15:866\n383#1,6:881\n393#1,2:888\n395#1,8:893\n403#1,9:904\n412#1,8:916\n117#1,8:924\n133#1:932\n134#1:934\n135#1,7:938\n142#1,9:946\n383#1,6:955\n393#1,2:962\n395#1,17:967\n412#1,8:987\n151#1,6:995\n383#1,6:1001\n393#1,2:1008\n395#1,8:1013\n403#1,9:1024\n412#1,8:1036\n133#1:1044\n134#1:1046\n135#1,7:1050\n142#1,9:1058\n383#1,6:1067\n393#1,2:1074\n395#1,8:1079\n403#1,9:1090\n412#1,8:1102\n151#1,6:1110\n163#1:1116\n164#1:1118\n165#1,12:1122\n383#1,6:1134\n393#1,2:1141\n395#1,8:1146\n403#1,9:1157\n412#1,8:1169\n177#1,8:1177\n1#2:425\n1#2:445\n1#2:499\n1#2:551\n1#2:673\n1#2:740\n1#2:805\n1#2:865\n1#2:933\n1#2:1045\n1#2:1117\n492#3,11:426\n48#3:440\n48#3:945\n48#3:1057\n1182#4:437\n1161#4,2:438\n1182#4:441\n1161#4,2:442\n1182#4:472\n1161#4,2:473\n1182#4:524\n1161#4,2:525\n1182#4:580\n1161#4,2:581\n1182#4:642\n1161#4,2:643\n1182#4:704\n1161#4,2:705\n1182#4:769\n1161#4,2:770\n1182#4:834\n1161#4,2:835\n1182#4:901\n1161#4,2:902\n1182#4:935\n1161#4,2:936\n1182#4:1021\n1161#4,2:1022\n1182#4:1047\n1161#4,2:1048\n1182#4:1087\n1161#4,2:1088\n1182#4:1119\n1161#4,2:1120\n1182#4:1154\n1161#4,2:1155\n1182#4:1194\n1161#4,2:1195\n261#5:458\n261#5:510\n261#5:566\n261#5:682\n261#5:683\n261#5:690\n261#5:755\n261#5:820\n261#5:887\n261#5:961\n261#5:1007\n261#5:1073\n261#5:1140\n261#5:1186\n261#5:1188\n261#5:1189\n261#5:1193\n234#6,3:461\n237#6,3:484\n234#6,3:513\n237#6,3:536\n234#6,3:569\n237#6,3:592\n234#6,3:631\n237#6,3:654\n234#6,3:693\n237#6,3:716\n234#6,3:758\n237#6,3:781\n234#6,3:823\n237#6,3:846\n234#6,3:890\n237#6,3:913\n234#6,3:964\n237#6,3:984\n234#6,3:1010\n237#6,3:1033\n234#6,3:1076\n237#6,3:1099\n234#6,3:1143\n237#6,3:1166\n234#6,3:1190\n237#6,3:1197\n72#7:1185\n72#7:1187\n*S KotlinDebug\n*F\n+ 1 DelegatableNode.kt\nandroidx/compose/ui/node/DelegatableNodeKt\n*L\n219#1:444\n219#1:446,6\n220#1:452,6\n220#1:459,2\n220#1:464,8\n220#1:475,9\n220#1:487,8\n219#1:495,3\n226#1:498\n226#1:500,4\n227#1:504,6\n227#1:511,2\n227#1:516,8\n227#1:527,9\n227#1:539,8\n226#1:547,3\n234#1:550\n234#1:552,8\n234#1:560,6\n234#1:567,2\n234#1:572,8\n234#1:583,9\n234#1:595,8\n234#1:603,7\n234#1:610,9\n234#1:619,12\n234#1:634,8\n234#1:645,9\n234#1:657,8\n234#1:665,7\n242#1:672\n242#1:674,8\n245#1:684,6\n245#1:691,2\n245#1:696,8\n245#1:707,9\n245#1:719,8\n242#1:727,7\n254#1:734,5\n254#1:739\n254#1:741,8\n254#1:749,6\n254#1:756,2\n254#1:761,8\n254#1:772,9\n254#1:784,8\n254#1:792,7\n262#1:799,5\n262#1:804\n262#1:806,8\n262#1:814,6\n262#1:821,2\n262#1:826,8\n262#1:837,9\n262#1:849,8\n262#1:857,7\n271#1:864\n271#1:866,15\n271#1:881,6\n271#1:888,2\n271#1:893,8\n271#1:904,9\n271#1:916,8\n271#1:924,8\n276#1:932\n276#1:934\n276#1:938,7\n276#1:946,9\n276#1:955,6\n276#1:962,2\n276#1:967,17\n276#1:987,8\n276#1:995,6\n282#1:1001,6\n282#1:1008,2\n282#1:1013,8\n282#1:1024,9\n282#1:1036,8\n283#1:1044\n283#1:1046\n283#1:1050,7\n283#1:1058,9\n283#1:1067,6\n283#1:1074,2\n283#1:1079,8\n283#1:1090,9\n283#1:1102,8\n283#1:1110,6\n289#1:1116\n289#1:1118\n289#1:1122,12\n290#1:1134,6\n290#1:1141,2\n290#1:1146,8\n290#1:1157,9\n290#1:1169,8\n289#1:1177,8\n219#1:445\n226#1:499\n234#1:551\n242#1:673\n254#1:740\n262#1:805\n271#1:865\n276#1:933\n283#1:1045\n289#1:1117\n127#1:426,11\n141#1:440\n276#1:945\n283#1:1057\n134#1:437\n134#1:438,2\n164#1:441\n164#1:442,2\n220#1:472\n220#1:473,2\n227#1:524\n227#1:525,2\n234#1:580\n234#1:581,2\n234#1:642\n234#1:643,2\n245#1:704\n245#1:705,2\n254#1:769\n254#1:770,2\n262#1:834\n262#1:835,2\n271#1:901\n271#1:902,2\n276#1:935\n276#1:936,2\n282#1:1021\n282#1:1022,2\n283#1:1047\n283#1:1048,2\n283#1:1087\n283#1:1088,2\n289#1:1119\n289#1:1120,2\n290#1:1154\n290#1:1155,2\n402#1:1194\n402#1:1195,2\n220#1:458\n227#1:510\n234#1:566\n243#1:682\n244#1:683\n245#1:690\n254#1:755\n262#1:820\n271#1:887\n276#1:961\n282#1:1007\n283#1:1073\n290#1:1140\n345#1:1186\n351#1:1188\n388#1:1189\n395#1:1193\n220#1:461,3\n220#1:484,3\n227#1:513,3\n227#1:536,3\n234#1:569,3\n234#1:592,3\n234#1:631,3\n234#1:654,3\n245#1:693,3\n245#1:716,3\n254#1:758,3\n254#1:781,3\n262#1:823,3\n262#1:846,3\n271#1:890,3\n271#1:913,3\n276#1:964,3\n276#1:984,3\n282#1:1010,3\n282#1:1033,3\n283#1:1076,3\n283#1:1099,3\n290#1:1143,3\n290#1:1166,3\n394#1:1190,3\n394#1:1197,3\n345#1:1185\n351#1:1187\n*E\n"})
public final class DelegatableNodeKt {
    public static final void access$addLayoutNodeChildren(MutableVector mutableVector, Modifier.Node node) {
        MutableVector<LayoutNode> mutableVector2 = requireLayoutNode(node).get_children$ui_release();
        int size = mutableVector2.getSize();
        if (size > 0) {
            int i10 = size - 1;
            LayoutNode[] content = mutableVector2.getContent();
            do {
                mutableVector.add(content[i10].getNodes().getHead());
                i10--;
            } while (i10 >= 0);
        }
    }

    public static final Modifier.Node access$pop(MutableVector mutableVector) {
        if (mutableVector == null || mutableVector.isEmpty()) {
            return null;
        }
        return (Modifier.Node) androidx.constraintlayout.core.parser.a.a(mutableVector, 1);
    }

    /* JADX INFO: renamed from: ancestors-64DMado, reason: not valid java name */
    public static final /* synthetic */ <T> List<T> m3649ancestors64DMado(DelegatableNode ancestors, int i10) {
        NodeChain nodes;
        Intrinsics.checkNotNullParameter(ancestors, "$this$ancestors");
        if (!ancestors.getNode().getIsAttached()) {
            throw new IllegalStateException("visitAncestors called on an unattached node".toString());
        }
        Modifier.Node parent = ancestors.getNode().getParent();
        LayoutNode layoutNodeRequireLayoutNode = requireLayoutNode(ancestors);
        ArrayList arrayList = null;
        while (layoutNodeRequireLayoutNode != null) {
            if ((k.a(layoutNodeRequireLayoutNode) & i10) != 0) {
                while (parent != null) {
                    if ((parent.getKindSet() & i10) != 0) {
                        for (Modifier.Node nodeAccess$pop = parent; nodeAccess$pop != null; nodeAccess$pop = access$pop(null)) {
                            Intrinsics.reifiedOperationMarker(3, ExifInterface.GPS_DIRECTION_TRUE);
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                            }
                            arrayList.add(nodeAccess$pop);
                        }
                    }
                    parent = parent.getParent();
                }
            }
            layoutNodeRequireLayoutNode = layoutNodeRequireLayoutNode.getParent$ui_release();
            parent = (layoutNodeRequireLayoutNode == null || (nodes = layoutNodeRequireLayoutNode.getNodes()) == null) ? null : nodes.getTail$ui_release();
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    public static final LayoutModifierNode asLayoutModifierNode(@NotNull Modifier.Node node) {
        Intrinsics.checkNotNullParameter(node, "<this>");
        if ((NodeKind.m3725constructorimpl(2) & node.getKindSet()) != 0) {
            if (node instanceof LayoutModifierNode) {
                return (LayoutModifierNode) node;
            }
            if (node instanceof DelegatingNode) {
                Modifier.Node delegate$ui_release = ((DelegatingNode) node).getDelegate();
                while (delegate$ui_release != 0) {
                    if (delegate$ui_release instanceof LayoutModifierNode) {
                        return (LayoutModifierNode) delegate$ui_release;
                    }
                    delegate$ui_release = (!(delegate$ui_release instanceof DelegatingNode) || (NodeKind.m3725constructorimpl(2) & delegate$ui_release.getKindSet()) == 0) ? delegate$ui_release.getChild() : ((DelegatingNode) delegate$ui_release).getDelegate();
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: dispatchForKind-6rFNWt0, reason: not valid java name */
    public static final /* synthetic */ <T> void m3650dispatchForKind6rFNWt0(Modifier.Node dispatchForKind, int i10, Function1<? super T, Unit> block) {
        Intrinsics.checkNotNullParameter(dispatchForKind, "$this$dispatchForKind");
        Intrinsics.checkNotNullParameter(block, "block");
        while (dispatchForKind != null) {
            Intrinsics.reifiedOperationMarker(3, ExifInterface.GPS_DIRECTION_TRUE);
            block.invoke(dispatchForKind);
            dispatchForKind = access$pop(null);
        }
    }

    /* JADX INFO: renamed from: has-64DMado, reason: not valid java name */
    public static final boolean m3651has64DMado(@NotNull DelegatableNode has, int i10) {
        Intrinsics.checkNotNullParameter(has, "$this$has");
        return (has.getNode().getAggregateChildKindSet() & i10) != 0;
    }

    public static final void invalidateSubtree(@NotNull DelegatableNode delegatableNode) {
        Intrinsics.checkNotNullParameter(delegatableNode, "<this>");
        if (delegatableNode.getNode().getIsAttached()) {
            LayoutNode.invalidateSubtree$default(requireLayoutNode(delegatableNode), false, 1, null);
        }
    }

    public static final boolean isDelegationRoot(@NotNull DelegatableNode delegatableNode) {
        Intrinsics.checkNotNullParameter(delegatableNode, "<this>");
        return delegatableNode.getNode() == delegatableNode;
    }

    @Nullable
    public static final Modifier.Node nearestAncestor(@NotNull DelegatableNode delegatableNode, int i10) {
        NodeChain nodes;
        Intrinsics.checkNotNullParameter(delegatableNode, "<this>");
        if (!delegatableNode.getNode().getIsAttached()) {
            throw new IllegalStateException("nearestAncestor called on an unattached node".toString());
        }
        Modifier.Node parent = delegatableNode.getNode().getParent();
        LayoutNode layoutNodeRequireLayoutNode = requireLayoutNode(delegatableNode);
        while (layoutNodeRequireLayoutNode != null) {
            if ((k.a(layoutNodeRequireLayoutNode) & i10) != 0) {
                while (parent != null) {
                    if ((parent.getKindSet() & i10) != 0) {
                        return parent;
                    }
                    parent = parent.getParent();
                }
            }
            layoutNodeRequireLayoutNode = layoutNodeRequireLayoutNode.getParent$ui_release();
            parent = (layoutNodeRequireLayoutNode == null || (nodes = layoutNodeRequireLayoutNode.getNodes()) == null) ? null : nodes.getTail$ui_release();
        }
        return null;
    }

    /* JADX INFO: renamed from: nearestAncestor-64DMado, reason: not valid java name */
    public static final /* synthetic */ <T> T m3652nearestAncestor64DMado(DelegatableNode nearestAncestor, int i10) {
        NodeChain nodes;
        Intrinsics.checkNotNullParameter(nearestAncestor, "$this$nearestAncestor");
        if (!nearestAncestor.getNode().getIsAttached()) {
            throw new IllegalStateException("visitAncestors called on an unattached node".toString());
        }
        Object parent = nearestAncestor.getNode().getParent();
        LayoutNode layoutNodeRequireLayoutNode = requireLayoutNode(nearestAncestor);
        while (layoutNodeRequireLayoutNode != null) {
            if ((k.a(layoutNodeRequireLayoutNode) & i10) != 0) {
                while (parent != null) {
                    if ((((Modifier.Node) parent).getKindSet() & i10) != 0) {
                        Intrinsics.reifiedOperationMarker(3, ExifInterface.GPS_DIRECTION_TRUE);
                        return (T) parent;
                    }
                    parent = (T) ((Modifier.Node) parent).getParent();
                }
            }
            layoutNodeRequireLayoutNode = layoutNodeRequireLayoutNode.getParent$ui_release();
            parent = (layoutNodeRequireLayoutNode == null || (nodes = layoutNodeRequireLayoutNode.getNodes()) == null) ? (T) null : (T) nodes.getTail$ui_release();
        }
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: requireCoordinator-64DMado, reason: not valid java name */
    public static final NodeCoordinator m3653requireCoordinator64DMado(@NotNull DelegatableNode requireCoordinator, int i10) {
        Intrinsics.checkNotNullParameter(requireCoordinator, "$this$requireCoordinator");
        NodeCoordinator coordinator = requireCoordinator.getNode().getCoordinator();
        Intrinsics.checkNotNull(coordinator);
        if (coordinator.getTail() != requireCoordinator || !NodeKindKt.m3734getIncludeSelfInTraversalH91voCI(i10)) {
            return coordinator;
        }
        NodeCoordinator wrapped = coordinator.getWrapped();
        Intrinsics.checkNotNull(wrapped);
        return wrapped;
    }

    @NotNull
    public static final Density requireDensity(@NotNull DelegatableNode delegatableNode) {
        Intrinsics.checkNotNullParameter(delegatableNode, "<this>");
        return requireLayoutNode(delegatableNode).getDensity();
    }

    @NotNull
    public static final LayoutDirection requireLayoutDirection(@NotNull DelegatableNode delegatableNode) {
        Intrinsics.checkNotNullParameter(delegatableNode, "<this>");
        return requireLayoutNode(delegatableNode).getLayoutDirection();
    }

    @NotNull
    public static final LayoutNode requireLayoutNode(@NotNull DelegatableNode delegatableNode) {
        Intrinsics.checkNotNullParameter(delegatableNode, "<this>");
        NodeCoordinator coordinator = delegatableNode.getNode().getCoordinator();
        if (coordinator != null) {
            return coordinator.getLayoutNode();
        }
        throw new IllegalStateException("Cannot obtain node coordinator. Is the Modifier.Node attached?".toString());
    }

    @NotNull
    public static final Owner requireOwner(@NotNull DelegatableNode delegatableNode) {
        Intrinsics.checkNotNullParameter(delegatableNode, "<this>");
        Owner owner = requireLayoutNode(delegatableNode).getOwner();
        if (owner != null) {
            return owner;
        }
        throw new IllegalStateException("Required value was null.".toString());
    }

    public static final void visitAncestors(@NotNull DelegatableNode delegatableNode, int i10, boolean z10, @NotNull Function1<? super Modifier.Node, Unit> block) {
        NodeChain nodes;
        Intrinsics.checkNotNullParameter(delegatableNode, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        if (!delegatableNode.getNode().getIsAttached()) {
            throw new IllegalStateException("visitAncestors called on an unattached node".toString());
        }
        Modifier.Node node = z10 ? delegatableNode.getNode() : delegatableNode.getNode().getParent();
        LayoutNode layoutNodeRequireLayoutNode = requireLayoutNode(delegatableNode);
        while (layoutNodeRequireLayoutNode != null) {
            if ((k.a(layoutNodeRequireLayoutNode) & i10) != 0) {
                while (node != null) {
                    if ((node.getKindSet() & i10) != 0) {
                        block.invoke(node);
                    }
                    node = node.getParent();
                }
            }
            layoutNodeRequireLayoutNode = layoutNodeRequireLayoutNode.getParent$ui_release();
            node = (layoutNodeRequireLayoutNode == null || (nodes = layoutNodeRequireLayoutNode.getNodes()) == null) ? null : nodes.getTail$ui_release();
        }
    }

    public static /* synthetic */ void visitAncestors$default(DelegatableNode delegatableNode, int i10, boolean z10, Function1 block, int i11, Object obj) {
        NodeChain nodes;
        if ((i11 & 2) != 0) {
            z10 = false;
        }
        Intrinsics.checkNotNullParameter(delegatableNode, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        if (!delegatableNode.getNode().getIsAttached()) {
            throw new IllegalStateException("visitAncestors called on an unattached node".toString());
        }
        Modifier.Node node = z10 ? delegatableNode.getNode() : delegatableNode.getNode().getParent();
        LayoutNode layoutNodeRequireLayoutNode = requireLayoutNode(delegatableNode);
        while (layoutNodeRequireLayoutNode != null) {
            if ((k.a(layoutNodeRequireLayoutNode) & i10) != 0) {
                while (node != null) {
                    if ((node.getKindSet() & i10) != 0) {
                        block.invoke(node);
                    }
                    node = node.getParent();
                }
            }
            layoutNodeRequireLayoutNode = layoutNodeRequireLayoutNode.getParent$ui_release();
            node = (layoutNodeRequireLayoutNode == null || (nodes = layoutNodeRequireLayoutNode.getNodes()) == null) ? null : nodes.getTail$ui_release();
        }
    }

    /* JADX INFO: renamed from: visitAncestors-Y-YKmho, reason: not valid java name */
    public static final /* synthetic */ <T> void m3654visitAncestorsYYKmho(DelegatableNode visitAncestors, int i10, boolean z10, Function1<? super T, Unit> block) {
        NodeChain nodes;
        Intrinsics.checkNotNullParameter(visitAncestors, "$this$visitAncestors");
        Intrinsics.checkNotNullParameter(block, "block");
        if (!visitAncestors.getNode().getIsAttached()) {
            throw new IllegalStateException("visitAncestors called on an unattached node".toString());
        }
        Modifier.Node node = z10 ? visitAncestors.getNode() : visitAncestors.getNode().getParent();
        LayoutNode layoutNodeRequireLayoutNode = requireLayoutNode(visitAncestors);
        while (layoutNodeRequireLayoutNode != null) {
            if ((k.a(layoutNodeRequireLayoutNode) & i10) != 0) {
                while (node != null) {
                    if ((node.getKindSet() & i10) != 0) {
                        for (Modifier.Node nodeAccess$pop = node; nodeAccess$pop != null; nodeAccess$pop = access$pop(null)) {
                            Intrinsics.reifiedOperationMarker(3, ExifInterface.GPS_DIRECTION_TRUE);
                            block.invoke(nodeAccess$pop);
                        }
                    }
                    node = node.getParent();
                }
            }
            layoutNodeRequireLayoutNode = layoutNodeRequireLayoutNode.getParent$ui_release();
            node = (layoutNodeRequireLayoutNode == null || (nodes = layoutNodeRequireLayoutNode.getNodes()) == null) ? null : nodes.getTail$ui_release();
        }
    }

    /* JADX INFO: renamed from: visitAncestors-Y-YKmho$default, reason: not valid java name */
    public static /* synthetic */ void m3655visitAncestorsYYKmho$default(DelegatableNode visitAncestors, int i10, boolean z10, Function1 block, int i11, Object obj) {
        NodeChain nodes;
        if ((i11 & 2) != 0) {
            z10 = false;
        }
        Intrinsics.checkNotNullParameter(visitAncestors, "$this$visitAncestors");
        Intrinsics.checkNotNullParameter(block, "block");
        if (!visitAncestors.getNode().getIsAttached()) {
            throw new IllegalStateException("visitAncestors called on an unattached node".toString());
        }
        Modifier.Node node = z10 ? visitAncestors.getNode() : visitAncestors.getNode().getParent();
        LayoutNode layoutNodeRequireLayoutNode = requireLayoutNode(visitAncestors);
        while (layoutNodeRequireLayoutNode != null) {
            if ((k.a(layoutNodeRequireLayoutNode) & i10) != 0) {
                while (node != null) {
                    if ((node.getKindSet() & i10) != 0) {
                        for (Modifier.Node nodeAccess$pop = node; nodeAccess$pop != null; nodeAccess$pop = access$pop(null)) {
                            Intrinsics.reifiedOperationMarker(3, ExifInterface.GPS_DIRECTION_TRUE);
                            block.invoke(nodeAccess$pop);
                        }
                    }
                    node = node.getParent();
                }
            }
            layoutNodeRequireLayoutNode = layoutNodeRequireLayoutNode.getParent$ui_release();
            node = (layoutNodeRequireLayoutNode == null || (nodes = layoutNodeRequireLayoutNode.getNodes()) == null) ? null : nodes.getTail$ui_release();
        }
    }

    public static final void visitChildren(@NotNull DelegatableNode delegatableNode, int i10, @NotNull Function1<? super Modifier.Node, Unit> block) {
        Intrinsics.checkNotNullParameter(delegatableNode, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        if (!delegatableNode.getNode().getIsAttached()) {
            throw new IllegalStateException("visitChildren called on an unattached node".toString());
        }
        MutableVector mutableVector = new MutableVector(new Modifier.Node[16], 0);
        Modifier.Node child = delegatableNode.getNode().getChild();
        if (child == null) {
            access$addLayoutNodeChildren(mutableVector, delegatableNode.getNode());
        } else {
            mutableVector.add(child);
        }
        while (mutableVector.isNotEmpty()) {
            Modifier.Node child2 = (Modifier.Node) androidx.constraintlayout.core.parser.a.a(mutableVector, 1);
            if ((child2.getAggregateChildKindSet() & i10) == 0) {
                access$addLayoutNodeChildren(mutableVector, child2);
            } else {
                while (child2 != null) {
                    if ((child2.getKindSet() & i10) != 0) {
                        block.invoke(child2);
                        break;
                    }
                    child2 = child2.getChild();
                }
            }
        }
    }

    /* JADX INFO: renamed from: visitChildren-6rFNWt0, reason: not valid java name */
    public static final /* synthetic */ <T> void m3656visitChildren6rFNWt0(DelegatableNode visitChildren, int i10, Function1<? super T, Unit> block) {
        Intrinsics.checkNotNullParameter(visitChildren, "$this$visitChildren");
        Intrinsics.checkNotNullParameter(block, "block");
        if (!visitChildren.getNode().getIsAttached()) {
            throw new IllegalStateException("visitChildren called on an unattached node".toString());
        }
        MutableVector mutableVector = new MutableVector(new Modifier.Node[16], 0);
        Modifier.Node child = visitChildren.getNode().getChild();
        if (child == null) {
            access$addLayoutNodeChildren(mutableVector, visitChildren.getNode());
        } else {
            mutableVector.add(child);
        }
        while (mutableVector.isNotEmpty()) {
            Modifier.Node nodeAccess$pop = (Modifier.Node) androidx.constraintlayout.core.parser.a.a(mutableVector, 1);
            if ((nodeAccess$pop.getAggregateChildKindSet() & i10) == 0) {
                access$addLayoutNodeChildren(mutableVector, nodeAccess$pop);
            } else {
                while (nodeAccess$pop != null) {
                    if ((nodeAccess$pop.getKindSet() & i10) != 0) {
                        while (nodeAccess$pop != null) {
                            Intrinsics.reifiedOperationMarker(3, ExifInterface.GPS_DIRECTION_TRUE);
                            block.invoke(nodeAccess$pop);
                            nodeAccess$pop = access$pop(null);
                        }
                        break;
                    }
                    nodeAccess$pop = nodeAccess$pop.getChild();
                }
            }
        }
    }

    public static final void visitLocalAncestors(@NotNull DelegatableNode delegatableNode, int i10, @NotNull Function1<? super Modifier.Node, Unit> block) {
        Intrinsics.checkNotNullParameter(delegatableNode, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        if (!delegatableNode.getNode().getIsAttached()) {
            throw new IllegalStateException("visitLocalAncestors called on an unattached node".toString());
        }
        for (Modifier.Node parent = delegatableNode.getNode().getParent(); parent != null; parent = parent.getParent()) {
            if ((parent.getKindSet() & i10) != 0) {
                block.invoke(parent);
            }
        }
    }

    /* JADX INFO: renamed from: visitLocalAncestors-6rFNWt0, reason: not valid java name */
    public static final /* synthetic */ <T> void m3657visitLocalAncestors6rFNWt0(DelegatableNode visitLocalAncestors, int i10, Function1<? super T, Unit> block) {
        Intrinsics.checkNotNullParameter(visitLocalAncestors, "$this$visitLocalAncestors");
        Intrinsics.checkNotNullParameter(block, "block");
        if (!visitLocalAncestors.getNode().getIsAttached()) {
            throw new IllegalStateException("visitLocalAncestors called on an unattached node".toString());
        }
        for (Modifier.Node parent = visitLocalAncestors.getNode().getParent(); parent != null; parent = parent.getParent()) {
            if ((parent.getKindSet() & i10) != 0) {
                for (Modifier.Node nodeAccess$pop = parent; nodeAccess$pop != null; nodeAccess$pop = access$pop(null)) {
                    Intrinsics.reifiedOperationMarker(3, ExifInterface.GPS_DIRECTION_TRUE);
                    block.invoke(nodeAccess$pop);
                }
            }
        }
    }

    public static final void visitLocalDescendants(@NotNull DelegatableNode delegatableNode, int i10, @NotNull Function1<? super Modifier.Node, Unit> block) {
        Intrinsics.checkNotNullParameter(delegatableNode, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        if (!delegatableNode.getNode().getIsAttached()) {
            throw new IllegalStateException("visitLocalDescendants called on an unattached node".toString());
        }
        Modifier.Node node = delegatableNode.getNode();
        if ((node.getAggregateChildKindSet() & i10) == 0) {
            return;
        }
        for (Modifier.Node child = node.getChild(); child != null; child = child.getChild()) {
            if ((child.getKindSet() & i10) != 0) {
                block.invoke(child);
            }
        }
    }

    /* JADX INFO: renamed from: visitLocalDescendants-6rFNWt0, reason: not valid java name */
    public static final /* synthetic */ <T> void m3658visitLocalDescendants6rFNWt0(DelegatableNode visitLocalDescendants, int i10, Function1<? super T, Unit> block) {
        Intrinsics.checkNotNullParameter(visitLocalDescendants, "$this$visitLocalDescendants");
        Intrinsics.checkNotNullParameter(block, "block");
        if (!visitLocalDescendants.getNode().getIsAttached()) {
            throw new IllegalStateException("visitLocalDescendants called on an unattached node".toString());
        }
        Modifier.Node node = visitLocalDescendants.getNode();
        if ((node.getAggregateChildKindSet() & i10) != 0) {
            for (Modifier.Node child = node.getChild(); child != null; child = child.getChild()) {
                if ((child.getKindSet() & i10) != 0) {
                    for (Modifier.Node nodeAccess$pop = child; nodeAccess$pop != null; nodeAccess$pop = access$pop(null)) {
                        Intrinsics.reifiedOperationMarker(3, ExifInterface.GPS_DIRECTION_TRUE);
                        block.invoke(nodeAccess$pop);
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: visitSelfAndAncestors-5BbP62I, reason: not valid java name */
    public static final /* synthetic */ <T> void m3659visitSelfAndAncestors5BbP62I(DelegatableNode visitSelfAndAncestors, int i10, int i11, Function1<? super T, Unit> block) {
        NodeChain nodes;
        Intrinsics.checkNotNullParameter(visitSelfAndAncestors, "$this$visitSelfAndAncestors");
        Intrinsics.checkNotNullParameter(block, "block");
        Modifier.Node node = visitSelfAndAncestors.getNode();
        int i12 = i10 | i11;
        if (!visitSelfAndAncestors.getNode().getIsAttached()) {
            throw new IllegalStateException("visitAncestors called on an unattached node".toString());
        }
        Modifier.Node node2 = visitSelfAndAncestors.getNode();
        LayoutNode layoutNodeRequireLayoutNode = requireLayoutNode(visitSelfAndAncestors);
        while (layoutNodeRequireLayoutNode != null) {
            if ((k.a(layoutNodeRequireLayoutNode) & i12) != 0) {
                while (node2 != null) {
                    if ((node2.getKindSet() & i12) != 0) {
                        if (node2 != node && (node2.getKindSet() & i11) != 0) {
                            return;
                        }
                        if ((node2.getKindSet() & i10) != 0) {
                            for (Modifier.Node nodeAccess$pop = node2; nodeAccess$pop != null; nodeAccess$pop = access$pop(null)) {
                                Intrinsics.reifiedOperationMarker(3, ExifInterface.GPS_DIRECTION_TRUE);
                                block.invoke(nodeAccess$pop);
                            }
                        }
                    }
                    node2 = node2.getParent();
                }
            }
            layoutNodeRequireLayoutNode = layoutNodeRequireLayoutNode.getParent$ui_release();
            node2 = (layoutNodeRequireLayoutNode == null || (nodes = layoutNodeRequireLayoutNode.getNodes()) == null) ? null : nodes.getTail$ui_release();
        }
    }

    /* JADX INFO: renamed from: visitSelfAndChildren-6rFNWt0, reason: not valid java name */
    public static final /* synthetic */ <T> void m3660visitSelfAndChildren6rFNWt0(DelegatableNode visitSelfAndChildren, int i10, Function1<? super T, Unit> block) {
        Intrinsics.checkNotNullParameter(visitSelfAndChildren, "$this$visitSelfAndChildren");
        Intrinsics.checkNotNullParameter(block, "block");
        for (Modifier.Node node = visitSelfAndChildren.getNode(); node != null; node = access$pop(null)) {
            Intrinsics.reifiedOperationMarker(3, ExifInterface.GPS_DIRECTION_TRUE);
            block.invoke(node);
        }
        if (!visitSelfAndChildren.getNode().getIsAttached()) {
            throw new IllegalStateException("visitChildren called on an unattached node".toString());
        }
        MutableVector mutableVector = new MutableVector(new Modifier.Node[16], 0);
        Modifier.Node child = visitSelfAndChildren.getNode().getChild();
        if (child == null) {
            access$addLayoutNodeChildren(mutableVector, visitSelfAndChildren.getNode());
        } else {
            mutableVector.add(child);
        }
        while (mutableVector.isNotEmpty()) {
            Modifier.Node nodeAccess$pop = (Modifier.Node) androidx.constraintlayout.core.parser.a.a(mutableVector, 1);
            if ((nodeAccess$pop.getAggregateChildKindSet() & i10) == 0) {
                access$addLayoutNodeChildren(mutableVector, nodeAccess$pop);
            } else {
                while (nodeAccess$pop != null) {
                    if ((nodeAccess$pop.getKindSet() & i10) != 0) {
                        while (nodeAccess$pop != null) {
                            Intrinsics.reifiedOperationMarker(3, ExifInterface.GPS_DIRECTION_TRUE);
                            block.invoke(nodeAccess$pop);
                            nodeAccess$pop = access$pop(null);
                        }
                        break;
                    }
                    nodeAccess$pop = nodeAccess$pop.getChild();
                }
            }
        }
    }

    public static final void visitSubtree(@NotNull DelegatableNode delegatableNode, int i10, @NotNull Function1<? super Modifier.Node, Unit> block) {
        Intrinsics.checkNotNullParameter(delegatableNode, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        if (!delegatableNode.getNode().getIsAttached()) {
            throw new IllegalStateException("visitSubtree called on an unattached node".toString());
        }
        Modifier.Node child = delegatableNode.getNode().getChild();
        LayoutNode layoutNodeRequireLayoutNode = requireLayoutNode(delegatableNode);
        NestedVectorStack nestedVectorStack = new NestedVectorStack();
        while (layoutNodeRequireLayoutNode != null) {
            if (child == null) {
                child = layoutNodeRequireLayoutNode.getNodes().getHead();
            }
            if ((child.getAggregateChildKindSet() & i10) != 0) {
                while (child != null) {
                    if ((child.getKindSet() & i10) != 0) {
                        block.invoke(child);
                    }
                    child = child.getChild();
                }
            }
            nestedVectorStack.push(layoutNodeRequireLayoutNode.get_children$ui_release());
            child = null;
            layoutNodeRequireLayoutNode = nestedVectorStack.isNotEmpty() ? (LayoutNode) nestedVectorStack.pop() : null;
        }
    }

    /* JADX INFO: renamed from: visitSubtree-6rFNWt0, reason: not valid java name */
    public static final /* synthetic */ <T> void m3661visitSubtree6rFNWt0(DelegatableNode visitSubtree, int i10, Function1<? super T, Unit> block) {
        Intrinsics.checkNotNullParameter(visitSubtree, "$this$visitSubtree");
        Intrinsics.checkNotNullParameter(block, "block");
        if (!visitSubtree.getNode().getIsAttached()) {
            throw new IllegalStateException("visitSubtree called on an unattached node".toString());
        }
        Modifier.Node child = visitSubtree.getNode().getChild();
        LayoutNode layoutNodeRequireLayoutNode = requireLayoutNode(visitSubtree);
        NestedVectorStack nestedVectorStack = new NestedVectorStack();
        while (layoutNodeRequireLayoutNode != null) {
            if (child == null) {
                child = layoutNodeRequireLayoutNode.getNodes().getHead();
            }
            if ((child.getAggregateChildKindSet() & i10) != 0) {
                while (child != null) {
                    if ((child.getKindSet() & i10) != 0) {
                        for (Modifier.Node nodeAccess$pop = child; nodeAccess$pop != null; nodeAccess$pop = access$pop(null)) {
                            Intrinsics.reifiedOperationMarker(3, ExifInterface.GPS_DIRECTION_TRUE);
                            block.invoke(nodeAccess$pop);
                        }
                    }
                    child = child.getChild();
                }
            }
            nestedVectorStack.push(layoutNodeRequireLayoutNode.get_children$ui_release());
            layoutNodeRequireLayoutNode = nestedVectorStack.isNotEmpty() ? (LayoutNode) nestedVectorStack.pop() : null;
            child = null;
        }
    }

    public static final void visitSubtreeIf(@NotNull DelegatableNode delegatableNode, int i10, @NotNull Function1<? super Modifier.Node, Boolean> block) {
        Intrinsics.checkNotNullParameter(delegatableNode, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        if (!delegatableNode.getNode().getIsAttached()) {
            throw new IllegalStateException("visitSubtreeIf called on an unattached node".toString());
        }
        MutableVector mutableVector = new MutableVector(new Modifier.Node[16], 0);
        Modifier.Node child = delegatableNode.getNode().getChild();
        if (child == null) {
            access$addLayoutNodeChildren(mutableVector, delegatableNode.getNode());
        } else {
            mutableVector.add(child);
        }
        while (mutableVector.isNotEmpty()) {
            Modifier.Node node = (Modifier.Node) androidx.constraintlayout.core.parser.a.a(mutableVector, 1);
            if ((node.getAggregateChildKindSet() & i10) != 0) {
                Modifier.Node child2 = node;
                while (true) {
                    if (child2 != null) {
                        if ((child2.getKindSet() & i10) != 0 && !block.invoke(child2).booleanValue()) {
                            break;
                        } else {
                            child2 = child2.getChild();
                        }
                    }
                }
            }
            access$addLayoutNodeChildren(mutableVector, node);
        }
    }

    /* JADX INFO: renamed from: visitSubtreeIf-6rFNWt0, reason: not valid java name */
    public static final /* synthetic */ <T> void m3662visitSubtreeIf6rFNWt0(DelegatableNode visitSubtreeIf, int i10, Function1<? super T, Boolean> block) {
        Intrinsics.checkNotNullParameter(visitSubtreeIf, "$this$visitSubtreeIf");
        Intrinsics.checkNotNullParameter(block, "block");
        if (!visitSubtreeIf.getNode().getIsAttached()) {
            throw new IllegalStateException("visitSubtreeIf called on an unattached node".toString());
        }
        MutableVector mutableVector = new MutableVector(new Modifier.Node[16], 0);
        Modifier.Node child = visitSubtreeIf.getNode().getChild();
        if (child == null) {
            access$addLayoutNodeChildren(mutableVector, visitSubtreeIf.getNode());
        } else {
            mutableVector.add(child);
        }
        while (mutableVector.isNotEmpty()) {
            Modifier.Node node = (Modifier.Node) androidx.constraintlayout.core.parser.a.a(mutableVector, 1);
            if ((node.getAggregateChildKindSet() & i10) != 0) {
                Modifier.Node child2 = node;
                while (true) {
                    if (child2 != null) {
                        if ((child2.getKindSet() & i10) != 0) {
                            for (Modifier.Node nodeAccess$pop = child2; nodeAccess$pop != null; nodeAccess$pop = access$pop(null)) {
                                Intrinsics.reifiedOperationMarker(3, ExifInterface.GPS_DIRECTION_TRUE);
                                if (!block.invoke(nodeAccess$pop).booleanValue()) {
                                    break;
                                }
                            }
                        }
                        child2 = child2.getChild();
                    }
                }
            }
            access$addLayoutNodeChildren(mutableVector, node);
        }
    }
}
