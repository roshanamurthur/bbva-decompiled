package androidx.compose.ui.node;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.input.pointer.SuspendPointerInputElement;
import androidx.compose.ui.layout.ModifierInfo;
import androidx.exifinterface.media.ExifInterface;
import com.bbva.networkplugin.command.impl.HeadCommand;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import mx.openpay.library.domain.util.Constant;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: NodeChain.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0000\u0018\u00002\u00020\u0001:\u0002<VB\u000f\u0012\u0006\u0010@\u001a\u00020;¢\u0006\u0004\bT\u0010UJ\u0019\u0010\u0007\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\f\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\u000f\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u0006\u0010\u0010\u001a\u00020\u0004J\u0006\u0010\u0011\u001a\u00020\u0004J\u0006\u0010\u0012\u001a\u00020\u0004J\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013J\u000f\u0010\u0017\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0016\u0010\u000eJ\u000f\u0010\u0019\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0018\u0010\u000eJE\u0010\"\u001a\u0004\u0018\u00018\u0000\"\u0006\b\u0000\u0010\u001a\u0018\u00012\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\u001b2\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u001e0\u001dH\u0080\bø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b \u0010!JC\u0010%\u001a\u00020\u0004\"\u0006\b\u0000\u0010\u001a\u0018\u00012\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\u001b2\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u001dH\u0080\bø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b#\u0010$J/\u0010%\u001a\u00020\u00042\u0006\u0010'\u001a\u00020&2\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020\u00040\u001dH\u0080\bø\u0001\u0000¢\u0006\u0004\b)\u0010$J'\u0010%\u001a\u00020\u00042\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020\u00040\u001dH\u0080\bø\u0001\u0000¢\u0006\u0004\b)\u0010*J'\u0010,\u001a\u00020\u00042\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020\u00040\u001dH\u0080\bø\u0001\u0000¢\u0006\u0004\b+\u0010*JC\u0010.\u001a\u00020\u0004\"\u0006\b\u0000\u0010\u001a\u0018\u00012\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\u001b2\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u001dH\u0080\bø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b-\u0010$J/\u0010.\u001a\u00020\u00042\u0006\u0010'\u001a\u00020&2\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020\u00040\u001dH\u0080\bø\u0001\u0000¢\u0006\u0004\b/\u0010$J'\u0010.\u001a\u00020\u00042\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020\u00040\u001dH\u0080\bø\u0001\u0000¢\u0006\u0004\b/\u0010*J.\u00102\u001a\u0004\u0018\u00018\u0000\"\u0006\b\u0000\u0010\u001a\u0018\u00012\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\u001bH\u0080\bø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b0\u00101J.\u00104\u001a\u0004\u0018\u00018\u0000\"\u0006\b\u0000\u0010\u001a\u0018\u00012\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\u001bH\u0080\bø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b3\u00101J!\u00107\u001a\u00020\u001e2\n\u0010\u001c\u001a\u0006\u0012\u0002\b\u00030\u001bH\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b5\u00106J\u0017\u00107\u001a\u00020\u001e2\u0006\u0010'\u001a\u00020&H\u0000¢\u0006\u0004\b8\u00106J\b\u0010:\u001a\u000209H\u0016R\u0017\u0010@\u001a\u00020;8\u0006¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?R\u001a\u0010F\u001a\u00020A8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\bD\u0010ER$\u0010M\u001a\u00020G2\u0006\u0010H\u001a\u00020G8\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\bI\u0010J\u001a\u0004\bK\u0010LR\u001a\u00102\u001a\u00020(8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bN\u0010O\u001a\u0004\bP\u0010QR$\u00104\u001a\u00020(2\u0006\u0010H\u001a\u00020(8\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\bR\u0010O\u001a\u0004\bS\u0010Q\u0082\u0002\u0012\n\u0005\b\u009920\u0001\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006W"}, d2 = {"Landroidx/compose/ui/node/NodeChain;", "", "Landroidx/compose/ui/node/NodeChain$Logger;", "logger", "", "useLogger$ui_release", "(Landroidx/compose/ui/node/NodeChain$Logger;)V", "useLogger", "Landroidx/compose/ui/Modifier;", "m", "updateFrom$ui_release", "(Landroidx/compose/ui/Modifier;)V", "updateFrom", "resetState$ui_release", "()V", "resetState", "syncCoordinators", "markAsAttached", "runAttachLifecycle", "", "Landroidx/compose/ui/layout/ModifierInfo;", "getModifierInfo", "markAsDetached$ui_release", "markAsDetached", "runDetachLifecycle$ui_release", "runDetachLifecycle", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/compose/ui/node/NodeKind;", "type", "Lkotlin/Function1;", "", "block", "firstFromHead-aLcG6gQ$ui_release", "(ILkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "firstFromHead", "headToTail-aLcG6gQ$ui_release", "(ILkotlin/jvm/functions/Function1;)V", "headToTail", "", "mask", "Landroidx/compose/ui/Modifier$Node;", "headToTail$ui_release", "(Lkotlin/jvm/functions/Function1;)V", "headToTailExclusive$ui_release", "headToTailExclusive", "tailToHead-aLcG6gQ$ui_release", "tailToHead", "tailToHead$ui_release", "tail-H91voCI$ui_release", "(I)Ljava/lang/Object;", "tail", "head-H91voCI$ui_release", HeadCommand.ID, "has-H91voCI$ui_release", "(I)Z", "has", "has$ui_release", "", "toString", "Landroidx/compose/ui/node/LayoutNode;", "a", "Landroidx/compose/ui/node/LayoutNode;", "getLayoutNode", "()Landroidx/compose/ui/node/LayoutNode;", "layoutNode", "Landroidx/compose/ui/node/InnerNodeCoordinator;", "b", "Landroidx/compose/ui/node/InnerNodeCoordinator;", "getInnerCoordinator$ui_release", "()Landroidx/compose/ui/node/InnerNodeCoordinator;", "innerCoordinator", "Landroidx/compose/ui/node/NodeCoordinator;", "<set-?>", "c", "Landroidx/compose/ui/node/NodeCoordinator;", "getOuterCoordinator$ui_release", "()Landroidx/compose/ui/node/NodeCoordinator;", "outerCoordinator", "d", "Landroidx/compose/ui/Modifier$Node;", "getTail$ui_release", "()Landroidx/compose/ui/Modifier$Node;", "e", "getHead$ui_release", "<init>", "(Landroidx/compose/ui/node/LayoutNode;)V", "Logger", "ui_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nNodeChain.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NodeChain.kt\nandroidx/compose/ui/node/NodeChain\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 4 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 5 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 6 Modifier.kt\nandroidx/compose/ui/Modifier$Node\n+ 7 DelegatableNode.kt\nandroidx/compose/ui/node/DelegatableNodeKt\n+ 8 DelegatingNode.kt\nandroidx/compose/ui/node/DelegatingNode\n*L\n1#1,858:1\n754#1,6:869\n723#1,6:886\n723#1,6:892\n731#1,3:899\n734#1,3:905\n754#1,6:908\n754#1,6:914\n700#1,8:922\n723#1,3:930\n708#1,2:933\n701#1:935\n702#1,11:979\n726#1,3:990\n713#1:993\n703#1:994\n706#1,2:995\n723#1,3:997\n708#1,2:1000\n711#1,2:1045\n726#1,3:1047\n713#1:1050\n723#1,6:1051\n745#1,12:1057\n757#1,3:1112\n751#1:1115\n754#1,6:1116\n739#1,18:1122\n757#1,3:1183\n751#1:1186\n742#1:1187\n700#1,8:1188\n723#1,3:1196\n708#1,2:1199\n701#1:1201\n702#1,11:1245\n726#1,3:1256\n713#1:1259\n703#1:1260\n731#1,6:1261\n1#2:859\n1182#3:860\n1161#3,2:861\n1161#3,2:867\n1162#3:898\n1182#3:956\n1161#3,2:957\n1182#3:1022\n1161#3,2:1023\n1182#3:1089\n1161#3,2:1090\n1182#3:1160\n1161#3,2:1161\n1182#3:1222\n1161#3,2:1223\n523#4:863\n523#4:864\n523#4:865\n523#4:866\n476#4,11:875\n523#4:902\n728#4,2:903\n72#5:920\n261#6:921\n261#6:942\n261#6:1008\n261#6:1075\n261#6:1146\n261#6:1208\n383#7,6:936\n393#7,2:943\n395#7,8:948\n403#7,9:959\n412#7,8:971\n383#7,6:1002\n393#7,2:1009\n395#7,8:1014\n403#7,9:1025\n412#7,8:1037\n383#7,6:1069\n393#7,2:1076\n395#7,8:1081\n403#7,9:1092\n412#7,8:1104\n383#7,6:1140\n393#7,2:1147\n395#7,8:1152\n403#7,9:1163\n412#7,8:1175\n383#7,6:1202\n393#7,2:1209\n395#7,8:1214\n403#7,9:1225\n412#7,8:1237\n234#8,3:945\n237#8,3:968\n234#8,3:1011\n237#8,3:1034\n234#8,3:1078\n237#8,3:1101\n234#8,3:1149\n237#8,3:1172\n234#8,3:1211\n237#8,3:1234\n*S KotlinDebug\n*F\n+ 1 NodeChain.kt\nandroidx/compose/ui/node/NodeChain\n*L\n219#1:869,6\n289#1:886,6\n299#1:892,6\n325#1:899,3\n325#1:905,3\n357#1:908,6\n363#1:914,6\n693#1:922,8\n693#1:930,3\n693#1:933,2\n693#1:935\n693#1:979,11\n693#1:990,3\n693#1:993\n693#1:994\n700#1:995,2\n700#1:997,3\n700#1:1000,2\n700#1:1045,2\n700#1:1047,3\n700#1:1050\n707#1:1051,6\n739#1:1057,12\n739#1:1112,3\n739#1:1115\n746#1:1116,6\n762#1:1122,18\n762#1:1183,3\n762#1:1186\n762#1:1187\n769#1:1188,8\n769#1:1196,3\n769#1:1199,2\n769#1:1201\n769#1:1245,11\n769#1:1256,3\n769#1:1259\n769#1:1260\n785#1:1261,6\n114#1:860\n114#1:861,2\n196#1:867,2\n323#1:898\n693#1:956\n693#1:957,2\n701#1:1022\n701#1:1023,2\n740#1:1089\n740#1:1090,2\n762#1:1160\n762#1:1161,2\n769#1:1222\n769#1:1223,2\n125#1:863\n126#1:864\n176#1:865\n188#1:866\n223#1:875,11\n351#1:902\n351#1:903,2\n405#1:920\n405#1:921\n693#1:942\n701#1:1008\n740#1:1075\n762#1:1146\n769#1:1208\n693#1:936,6\n693#1:943,2\n693#1:948,8\n693#1:959,9\n693#1:971,8\n701#1:1002,6\n701#1:1009,2\n701#1:1014,8\n701#1:1025,9\n701#1:1037,8\n740#1:1069,6\n740#1:1076,2\n740#1:1081,8\n740#1:1092,9\n740#1:1104,8\n762#1:1140,6\n762#1:1147,2\n762#1:1152,8\n762#1:1163,9\n762#1:1175,8\n769#1:1202,6\n769#1:1209,2\n769#1:1214,8\n769#1:1225,9\n769#1:1237,8\n693#1:945,3\n693#1:968,3\n701#1:1011,3\n701#1:1034,3\n740#1:1078,3\n740#1:1101,3\n762#1:1149,3\n762#1:1172,3\n769#1:1211,3\n769#1:1234,3\n*E\n"})
public final class NodeChain {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final LayoutNode layoutNode;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final InnerNodeCoordinator innerCoordinator;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public NodeCoordinator outerCoordinator;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final TailModifierNode f16882d;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public Modifier.Node head;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public MutableVector<Modifier.Element> f16884f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public MutableVector<Modifier.Element> f16885g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Nullable
    public a f16886h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public Logger f16887i;

    /* JADX INFO: compiled from: NodeChain.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b`\u0018\u00002\u00020\u0001J(\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\nH&J0\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\nH&J \u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\nH&J0\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\nH&J0\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\nH&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0015À\u0006\u0001"}, d2 = {"Landroidx/compose/ui/node/NodeChain$Logger;", "", "linearDiffAborted", "", FirebaseAnalytics.Param.INDEX, "", "prev", "Landroidx/compose/ui/Modifier$Element;", "next", "node", "Landroidx/compose/ui/Modifier$Node;", "nodeInserted", "atIndex", "newIndex", "element", "child", "inserted", "nodeRemoved", "oldIndex", "nodeReused", "nodeUpdated", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public interface Logger {
        void linearDiffAborted(int index, @NotNull Modifier.Element prev, @NotNull Modifier.Element next, @NotNull Modifier.Node node);

        void nodeInserted(int atIndex, int newIndex, @NotNull Modifier.Element element, @NotNull Modifier.Node child, @NotNull Modifier.Node inserted);

        void nodeRemoved(int oldIndex, @NotNull Modifier.Element element, @NotNull Modifier.Node node);

        void nodeReused(int oldIndex, int newIndex, @NotNull Modifier.Element prev, @NotNull Modifier.Element next, @NotNull Modifier.Node node);

        void nodeUpdated(int oldIndex, int newIndex, @NotNull Modifier.Element prev, @NotNull Modifier.Element next, @NotNull Modifier.Node node);
    }

    /* JADX INFO: compiled from: NodeChain.kt */
    @SourceDebugExtension({"SMAP\nNodeChain.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NodeChain.kt\nandroidx/compose/ui/node/NodeChain$Differ\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 3 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 4 Modifier.kt\nandroidx/compose/ui/Modifier$Node\n*L\n1#1,858:1\n523#2:859\n523#2:860\n523#2:861\n523#2:862\n523#2:863\n523#2:866\n523#2:867\n72#3:864\n261#4:865\n*S KotlinDebug\n*F\n+ 1 NodeChain.kt\nandroidx/compose/ui/node/NodeChain$Differ\n*L\n420#1:859\n421#1:860\n428#1:861\n429#1:862\n454#1:863\n470#1:866\n471#1:867\n455#1:864\n455#1:865\n*E\n"})
    public final class a implements DiffCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public Modifier.Node f16888a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f16889b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public MutableVector<Modifier.Element> f16890c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public MutableVector<Modifier.Element> f16891d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f16892e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ NodeChain f16893f;

        public a(@NotNull NodeChain nodeChain, Modifier.Node node, @NotNull int i10, @NotNull MutableVector<Modifier.Element> before, MutableVector<Modifier.Element> after, boolean z10) {
            Intrinsics.checkNotNullParameter(node, "node");
            Intrinsics.checkNotNullParameter(before, "before");
            Intrinsics.checkNotNullParameter(after, "after");
            this.f16893f = nodeChain;
            this.f16888a = node;
            this.f16889b = i10;
            this.f16890c = before;
            this.f16891d = after;
            this.f16892e = z10;
        }

        @Override // androidx.compose.ui.node.DiffCallback
        public final boolean areItemsTheSame(int i10, int i11) {
            return NodeChainKt.actionForModifiers(this.f16890c.getContent()[this.f16889b + i10], this.f16891d.getContent()[this.f16889b + i11]) != 0;
        }

        @Override // androidx.compose.ui.node.DiffCallback
        public final void insert(int i10) {
            int i11 = this.f16889b + i10;
            Modifier.Node node = this.f16888a;
            Modifier.Element element = this.f16891d.getContent()[i11];
            NodeChain nodeChain = this.f16893f;
            this.f16888a = NodeChain.access$createAndInsertNodeAsChild(nodeChain, element, node);
            Logger logger = nodeChain.f16887i;
            if (logger != null) {
                logger.nodeInserted(i11, i11, this.f16891d.getContent()[i11], node, this.f16888a);
            }
            if (!this.f16892e) {
                this.f16888a.setInsertedNodeAwaitingAttachForInvalidation$ui_release(true);
                return;
            }
            Modifier.Node child = this.f16888a.getChild();
            Intrinsics.checkNotNull(child);
            NodeCoordinator coordinator = child.getCoordinator();
            Intrinsics.checkNotNull(coordinator);
            LayoutModifierNode layoutModifierNodeAsLayoutModifierNode = DelegatableNodeKt.asLayoutModifierNode(this.f16888a);
            if (layoutModifierNodeAsLayoutModifierNode != null) {
                LayoutModifierNodeCoordinator layoutModifierNodeCoordinator = new LayoutModifierNodeCoordinator(nodeChain.getLayoutNode(), layoutModifierNodeAsLayoutModifierNode);
                this.f16888a.updateCoordinator$ui_release(layoutModifierNodeCoordinator);
                NodeChain.access$propagateCoordinator(nodeChain, this.f16888a, layoutModifierNodeCoordinator);
                layoutModifierNodeCoordinator.setWrappedBy$ui_release(coordinator.getWrappedBy());
                layoutModifierNodeCoordinator.setWrapped$ui_release(coordinator);
                coordinator.setWrappedBy$ui_release(layoutModifierNodeCoordinator);
            } else {
                this.f16888a.updateCoordinator$ui_release(coordinator);
            }
            this.f16888a.markAsAttached$ui_release();
            this.f16888a.runAttachLifecycle$ui_release();
            NodeKindKt.autoInvalidateInsertedNode(this.f16888a);
        }

        @Override // androidx.compose.ui.node.DiffCallback
        public final void remove(int i10, int i11) {
            Modifier.Node child = this.f16888a.getChild();
            Intrinsics.checkNotNull(child);
            NodeChain nodeChain = this.f16893f;
            Logger logger = nodeChain.f16887i;
            if (logger != null) {
                MutableVector<Modifier.Element> mutableVector = this.f16890c;
                logger.nodeRemoved(i11, mutableVector.getContent()[this.f16889b + i11], child);
            }
            if ((NodeKind.m3725constructorimpl(2) & child.getKindSet()) != 0) {
                NodeCoordinator coordinator = child.getCoordinator();
                Intrinsics.checkNotNull(coordinator);
                NodeCoordinator wrappedBy = coordinator.getWrappedBy();
                NodeCoordinator wrapped = coordinator.getWrapped();
                Intrinsics.checkNotNull(wrapped);
                if (wrappedBy != null) {
                    wrappedBy.setWrapped$ui_release(wrapped);
                }
                wrapped.setWrappedBy$ui_release(wrappedBy);
                NodeChain.access$propagateCoordinator(nodeChain, this.f16888a, wrapped);
            }
            this.f16888a = NodeChain.access$detachAndRemoveNode(nodeChain, child);
        }

        @Override // androidx.compose.ui.node.DiffCallback
        public final void same(int i10, int i11) {
            Modifier.Node child = this.f16888a.getChild();
            Intrinsics.checkNotNull(child);
            this.f16888a = child;
            MutableVector<Modifier.Element> mutableVector = this.f16890c;
            Modifier.Element element = mutableVector.getContent()[this.f16889b + i10];
            MutableVector<Modifier.Element> mutableVector2 = this.f16891d;
            Modifier.Element element2 = mutableVector2.getContent()[this.f16889b + i11];
            boolean zAreEqual = Intrinsics.areEqual(element, element2);
            NodeChain nodeChain = this.f16893f;
            if (zAreEqual) {
                Logger logger = nodeChain.f16887i;
                if (logger != null) {
                    int i12 = this.f16889b;
                    logger.nodeReused(i12 + i10, i12 + i11, element, element2, this.f16888a);
                    return;
                }
                return;
            }
            NodeChain.access$updateNode(nodeChain, element, element2, this.f16888a);
            Logger logger2 = nodeChain.f16887i;
            if (logger2 != null) {
                int i13 = this.f16889b;
                logger2.nodeUpdated(i13 + i10, i13 + i11, element, element2, this.f16888a);
            }
        }
    }

    public NodeChain(@NotNull LayoutNode layoutNode) {
        Intrinsics.checkNotNullParameter(layoutNode, "layoutNode");
        this.layoutNode = layoutNode;
        InnerNodeCoordinator innerNodeCoordinator = new InnerNodeCoordinator(layoutNode);
        this.innerCoordinator = innerNodeCoordinator;
        this.outerCoordinator = innerNodeCoordinator;
        TailModifierNode tail = innerNodeCoordinator.getTail();
        this.f16882d = tail;
        this.head = tail;
    }

    public static Modifier.Node a(Modifier.Element element, Modifier.Node node) {
        Modifier.Node backwardsCompatNode;
        if (element instanceof ModifierNodeElement) {
            backwardsCompatNode = ((ModifierNodeElement) element).create();
            backwardsCompatNode.setKindSet$ui_release(NodeKindKt.calculateNodeKindSetFromIncludingDelegates(backwardsCompatNode));
        } else {
            backwardsCompatNode = new BackwardsCompatNode(element);
        }
        if (!(!backwardsCompatNode.getIsAttached())) {
            throw new IllegalStateException("A ModifierNodeElement cannot return an already attached node from create() ".toString());
        }
        backwardsCompatNode.setInsertedNodeAwaitingAttachForInvalidation$ui_release(true);
        Modifier.Node child = node.getChild();
        if (child != null) {
            child.setParent$ui_release(backwardsCompatNode);
            backwardsCompatNode.setChild$ui_release(child);
        }
        node.setChild$ui_release(backwardsCompatNode);
        backwardsCompatNode.setParent$ui_release(node);
        return backwardsCompatNode;
    }

    public static final /* synthetic */ Modifier.Node access$createAndInsertNodeAsChild(NodeChain nodeChain, Modifier.Element element, Modifier.Node node) {
        nodeChain.getClass();
        return a(element, node);
    }

    public static final /* synthetic */ Modifier.Node access$detachAndRemoveNode(NodeChain nodeChain, Modifier.Node node) {
        nodeChain.getClass();
        return b(node);
    }

    public static final int access$getAggregateChildKindSet(NodeChain nodeChain) {
        return nodeChain.head.getAggregateChildKindSet();
    }

    public static final void access$propagateCoordinator(NodeChain nodeChain, Modifier.Node node, NodeCoordinator nodeCoordinator) {
        nodeChain.getClass();
        for (Modifier.Node parent = node.getParent(); parent != null; parent = parent.getParent()) {
            if (parent == NodeChainKt.f16894a) {
                LayoutNode parent$ui_release = nodeChain.layoutNode.getParent$ui_release();
                nodeCoordinator.setWrappedBy$ui_release(parent$ui_release != null ? parent$ui_release.getInnerCoordinator$ui_release() : null);
                nodeChain.outerCoordinator = nodeCoordinator;
                return;
            } else {
                if ((NodeKind.m3725constructorimpl(2) & parent.getKindSet()) != 0) {
                    return;
                }
                parent.updateCoordinator$ui_release(nodeCoordinator);
            }
        }
    }

    public static final /* synthetic */ void access$updateNode(NodeChain nodeChain, Modifier.Element element, Modifier.Element element2, Modifier.Node node) {
        nodeChain.getClass();
        d(element, element2, node);
    }

    public static Modifier.Node b(Modifier.Node node) {
        if (node.getIsAttached()) {
            NodeKindKt.autoInvalidateRemovedNode(node);
            node.runDetachLifecycle$ui_release();
            node.markAsDetached$ui_release();
        }
        Modifier.Node child = node.getChild();
        Modifier.Node parent = node.getParent();
        if (child != null) {
            child.setParent$ui_release(parent);
            node.setChild$ui_release(null);
        }
        if (parent != null) {
            parent.setChild$ui_release(child);
            node.setParent$ui_release(null);
        }
        Intrinsics.checkNotNull(parent);
        return parent;
    }

    public static void d(Modifier.Element element, Modifier.Element element2, Modifier.Node node) {
        if ((element instanceof ModifierNodeElement) && (element2 instanceof ModifierNodeElement)) {
            NodeChainKt.access$updateUnsafe((ModifierNodeElement) element2, node);
            if (node.getIsAttached()) {
                NodeKindKt.autoInvalidateUpdatedNode(node);
                return;
            } else {
                node.setUpdatedNodeAwaitingAttachForInvalidation$ui_release(true);
                return;
            }
        }
        if (!(node instanceof BackwardsCompatNode)) {
            throw new IllegalStateException("Unknown Modifier.Node type".toString());
        }
        ((BackwardsCompatNode) node).setElement(element2);
        if (node.getIsAttached()) {
            NodeKindKt.autoInvalidateUpdatedNode(node);
        } else {
            node.setUpdatedNodeAwaitingAttachForInvalidation$ui_release(true);
        }
    }

    public final void c(int i10, MutableVector<Modifier.Element> mutableVector, MutableVector<Modifier.Element> mutableVector2, Modifier.Node node, boolean z10) {
        a aVar = this.f16886h;
        if (aVar == null) {
            aVar = new a(this, node, i10, mutableVector, mutableVector2, z10);
            this.f16886h = aVar;
        } else {
            Intrinsics.checkNotNullParameter(node, "<set-?>");
            aVar.f16888a = node;
            aVar.f16889b = i10;
            Intrinsics.checkNotNullParameter(mutableVector, "<set-?>");
            aVar.f16890c = mutableVector;
            Intrinsics.checkNotNullParameter(mutableVector2, "<set-?>");
            aVar.f16891d = mutableVector2;
            aVar.f16892e = z10;
        }
        MyersDiffKt.executeDiff(mutableVector.getSize() - i10, mutableVector2.getSize() - i10, aVar);
        int kindSet = 0;
        for (Modifier.Node parent = this.f16882d.getParent(); parent != null && parent != NodeChainKt.f16894a; parent = parent.getParent()) {
            kindSet |= parent.getKindSet();
            parent.setAggregateChildKindSet$ui_release(kindSet);
        }
    }

    /* JADX INFO: renamed from: firstFromHead-aLcG6gQ$ui_release, reason: not valid java name */
    public final /* synthetic */ <T> T m3697firstFromHeadaLcG6gQ$ui_release(int type, Function1<? super T, Boolean> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        if ((access$getAggregateChildKindSet(this) & type) != 0) {
            for (Modifier.Node head = getHead(); head != null; head = head.getChild()) {
                if ((head.getKindSet() & type) != 0) {
                    for (Modifier.Node nodeAccess$pop = head; nodeAccess$pop != null; nodeAccess$pop = DelegatableNodeKt.access$pop(null)) {
                        Intrinsics.reifiedOperationMarker(3, ExifInterface.GPS_DIRECTION_TRUE);
                        if (block.invoke(nodeAccess$pop).booleanValue()) {
                            return nodeAccess$pop;
                        }
                    }
                }
                if ((head.getAggregateChildKindSet() & type) == 0) {
                    break;
                }
            }
        }
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: getHead$ui_release, reason: from getter */
    public final Modifier.Node getHead() {
        return this.head;
    }

    @NotNull
    /* JADX INFO: renamed from: getInnerCoordinator$ui_release, reason: from getter */
    public final InnerNodeCoordinator getInnerCoordinator() {
        return this.innerCoordinator;
    }

    @NotNull
    public final LayoutNode getLayoutNode() {
        return this.layoutNode;
    }

    @NotNull
    public final List<ModifierInfo> getModifierInfo() {
        MutableVector<Modifier.Element> mutableVector = this.f16884f;
        if (mutableVector == null) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        int i10 = 0;
        MutableVector mutableVector2 = new MutableVector(new ModifierInfo[mutableVector.getSize()], 0);
        Modifier.Node head = getHead();
        while (head != null && head != getTail$ui_release()) {
            NodeCoordinator coordinator = head.getCoordinator();
            if (coordinator == null) {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
            OwnedLayer layer = coordinator.getLayer();
            OwnedLayer layer2 = this.innerCoordinator.getLayer();
            Modifier.Node child = head.getChild();
            if (child != this.f16882d || head.getCoordinator() == child.getCoordinator()) {
                layer2 = null;
            }
            if (layer == null) {
                layer = layer2;
            }
            mutableVector2.add(new ModifierInfo(mutableVector.getContent()[i10], coordinator, layer));
            head = head.getChild();
            i10++;
        }
        return mutableVector2.asMutableList();
    }

    @NotNull
    /* JADX INFO: renamed from: getOuterCoordinator$ui_release, reason: from getter */
    public final NodeCoordinator getOuterCoordinator() {
        return this.outerCoordinator;
    }

    @NotNull
    public final Modifier.Node getTail$ui_release() {
        return this.f16882d;
    }

    public final boolean has$ui_release(int mask) {
        return (mask & this.head.getAggregateChildKindSet()) != 0;
    }

    /* JADX INFO: renamed from: has-H91voCI$ui_release, reason: not valid java name */
    public final boolean m3698hasH91voCI$ui_release(int type) {
        return (type & this.head.getAggregateChildKindSet()) != 0;
    }

    /* JADX INFO: renamed from: head-H91voCI$ui_release, reason: not valid java name */
    public final /* synthetic */ <T> T m3699headH91voCI$ui_release(int type) {
        if ((access$getAggregateChildKindSet(this) & type) == 0) {
            return null;
        }
        for (Object obj = (T) getHead(); obj != null; obj = (T) ((Modifier.Node) obj).getChild()) {
            if ((((Modifier.Node) obj).getKindSet() & type) != 0) {
                Intrinsics.reifiedOperationMarker(3, ExifInterface.GPS_DIRECTION_TRUE);
                return (T) obj;
            }
            if ((((Modifier.Node) obj).getAggregateChildKindSet() & type) == 0) {
                return null;
            }
        }
        return null;
    }

    public final void headToTail$ui_release(int mask, @NotNull Function1<? super Modifier.Node, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        if ((access$getAggregateChildKindSet(this) & mask) == 0) {
            return;
        }
        for (Modifier.Node head = getHead(); head != null; head = head.getChild()) {
            if ((head.getKindSet() & mask) != 0) {
                block.invoke(head);
            }
            if ((head.getAggregateChildKindSet() & mask) == 0) {
                return;
            }
        }
    }

    /* JADX INFO: renamed from: headToTail-aLcG6gQ$ui_release, reason: not valid java name */
    public final /* synthetic */ <T> void m3700headToTailaLcG6gQ$ui_release(int type, Function1<? super T, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        if ((access$getAggregateChildKindSet(this) & type) != 0) {
            for (Modifier.Node head = getHead(); head != null; head = head.getChild()) {
                if ((head.getKindSet() & type) != 0) {
                    for (Modifier.Node nodeAccess$pop = head; nodeAccess$pop != null; nodeAccess$pop = DelegatableNodeKt.access$pop(null)) {
                        Intrinsics.reifiedOperationMarker(3, ExifInterface.GPS_DIRECTION_TRUE);
                        block.invoke(nodeAccess$pop);
                    }
                }
                if ((head.getAggregateChildKindSet() & type) == 0) {
                    return;
                }
            }
        }
    }

    public final void headToTailExclusive$ui_release(@NotNull Function1<? super Modifier.Node, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        for (Modifier.Node head = getHead(); head != null && head != getTail$ui_release(); head = head.getChild()) {
            block.invoke(head);
        }
    }

    public final void markAsAttached() {
        for (Modifier.Node head = getHead(); head != null; head = head.getChild()) {
            head.markAsAttached$ui_release();
        }
    }

    public final void markAsDetached$ui_release() {
        for (Modifier.Node tail$ui_release = getTail$ui_release(); tail$ui_release != null; tail$ui_release = tail$ui_release.getParent()) {
            if (tail$ui_release.getIsAttached()) {
                tail$ui_release.markAsDetached$ui_release();
            }
        }
    }

    public final void resetState$ui_release() {
        int size;
        for (Modifier.Node tail$ui_release = getTail$ui_release(); tail$ui_release != null; tail$ui_release = tail$ui_release.getParent()) {
            if (tail$ui_release.getIsAttached()) {
                tail$ui_release.reset$ui_release();
            }
        }
        MutableVector<Modifier.Element> mutableVector = this.f16884f;
        if (mutableVector != null && (size = mutableVector.getSize()) > 0) {
            Modifier.Element[] content = mutableVector.getContent();
            int i10 = 0;
            do {
                Modifier.Element element = content[i10];
                if (element instanceof SuspendPointerInputElement) {
                    mutableVector.set(i10, new ForceUpdateElement((ModifierNodeElement) element));
                }
                i10++;
            } while (i10 < size);
        }
        runDetachLifecycle$ui_release();
        markAsDetached$ui_release();
    }

    public final void runAttachLifecycle() {
        for (Modifier.Node head = getHead(); head != null; head = head.getChild()) {
            head.runAttachLifecycle$ui_release();
            if (head.getInsertedNodeAwaitingAttachForInvalidation()) {
                NodeKindKt.autoInvalidateInsertedNode(head);
            }
            if (head.getUpdatedNodeAwaitingAttachForInvalidation()) {
                NodeKindKt.autoInvalidateUpdatedNode(head);
            }
            head.setInsertedNodeAwaitingAttachForInvalidation$ui_release(false);
            head.setUpdatedNodeAwaitingAttachForInvalidation$ui_release(false);
        }
    }

    public final void runDetachLifecycle$ui_release() {
        for (Modifier.Node tail$ui_release = getTail$ui_release(); tail$ui_release != null; tail$ui_release = tail$ui_release.getParent()) {
            if (tail$ui_release.getIsAttached()) {
                tail$ui_release.runDetachLifecycle$ui_release();
            }
        }
    }

    public final void syncCoordinators() {
        LayoutNode layoutNode;
        NodeCoordinator nodeCoordinator;
        Modifier.Node parent = this.f16882d.getParent();
        NodeCoordinator nodeCoordinator2 = this.innerCoordinator;
        while (true) {
            layoutNode = this.layoutNode;
            if (parent == null) {
                break;
            }
            LayoutModifierNode layoutModifierNodeAsLayoutModifierNode = DelegatableNodeKt.asLayoutModifierNode(parent);
            if (layoutModifierNodeAsLayoutModifierNode != null) {
                if (parent.getCoordinator() != null) {
                    NodeCoordinator coordinator = parent.getCoordinator();
                    Intrinsics.checkNotNull(coordinator, "null cannot be cast to non-null type androidx.compose.ui.node.LayoutModifierNodeCoordinator");
                    nodeCoordinator = (LayoutModifierNodeCoordinator) coordinator;
                    LayoutModifierNode layoutModifierNode = nodeCoordinator.getLayoutModifierNode();
                    nodeCoordinator.setLayoutModifierNode$ui_release(layoutModifierNodeAsLayoutModifierNode);
                    if (layoutModifierNode != parent) {
                        nodeCoordinator.onLayoutModifierNodeChanged();
                    }
                } else {
                    LayoutModifierNodeCoordinator layoutModifierNodeCoordinator = new LayoutModifierNodeCoordinator(layoutNode, layoutModifierNodeAsLayoutModifierNode);
                    parent.updateCoordinator$ui_release(layoutModifierNodeCoordinator);
                    nodeCoordinator = layoutModifierNodeCoordinator;
                }
                nodeCoordinator2.setWrappedBy$ui_release(nodeCoordinator);
                nodeCoordinator.setWrapped$ui_release(nodeCoordinator2);
                nodeCoordinator2 = nodeCoordinator;
            } else {
                parent.updateCoordinator$ui_release(nodeCoordinator2);
            }
            parent = parent.getParent();
        }
        LayoutNode parent$ui_release = layoutNode.getParent$ui_release();
        nodeCoordinator2.setWrappedBy$ui_release(parent$ui_release != null ? parent$ui_release.getInnerCoordinator$ui_release() : null);
        this.outerCoordinator = nodeCoordinator2;
    }

    /* JADX INFO: renamed from: tail-H91voCI$ui_release, reason: not valid java name */
    public final /* synthetic */ <T> T m3701tailH91voCI$ui_release(int type) {
        if ((access$getAggregateChildKindSet(this) & type) == 0) {
            return null;
        }
        for (Object obj = (T) getTail$ui_release(); obj != null; obj = (T) ((Modifier.Node) obj).getParent()) {
            if ((((Modifier.Node) obj).getKindSet() & type) != 0) {
                Intrinsics.reifiedOperationMarker(3, ExifInterface.GPS_DIRECTION_TRUE);
                return (T) obj;
            }
        }
        return null;
    }

    public final void tailToHead$ui_release(int mask, @NotNull Function1<? super Modifier.Node, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        if ((access$getAggregateChildKindSet(this) & mask) == 0) {
            return;
        }
        for (Modifier.Node tail$ui_release = getTail$ui_release(); tail$ui_release != null; tail$ui_release = tail$ui_release.getParent()) {
            if ((tail$ui_release.getKindSet() & mask) != 0) {
                block.invoke(tail$ui_release);
            }
        }
    }

    /* JADX INFO: renamed from: tailToHead-aLcG6gQ$ui_release, reason: not valid java name */
    public final /* synthetic */ <T> void m3702tailToHeadaLcG6gQ$ui_release(int type, Function1<? super T, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        if ((access$getAggregateChildKindSet(this) & type) != 0) {
            for (Modifier.Node tail$ui_release = getTail$ui_release(); tail$ui_release != null; tail$ui_release = tail$ui_release.getParent()) {
                if ((tail$ui_release.getKindSet() & type) != 0) {
                    for (Modifier.Node nodeAccess$pop = tail$ui_release; nodeAccess$pop != null; nodeAccess$pop = DelegatableNodeKt.access$pop(null)) {
                        Intrinsics.reifiedOperationMarker(3, ExifInterface.GPS_DIRECTION_TRUE);
                        block.invoke(nodeAccess$pop);
                    }
                }
            }
        }
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder(Constant.BRACKET_OPEN);
        Modifier.Node node = this.head;
        TailModifierNode tailModifierNode = this.f16882d;
        if (node == tailModifierNode) {
            sb2.append(Constant.BRACKET_CLOSE);
        } else {
            for (Modifier.Node head = getHead(); head != null && head != getTail$ui_release(); head = head.getChild()) {
                sb2.append(String.valueOf(head));
                if (head.getChild() == tailModifierNode) {
                    sb2.append(Constant.BRACKET_CLOSE);
                    break;
                }
                sb2.append(",");
            }
        }
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    public final void updateFrom$ui_release(@NotNull Modifier m) {
        Logger logger;
        Intrinsics.checkNotNullParameter(m, "m");
        if (this.head == NodeChainKt.f16894a) {
            throw new IllegalStateException("padChain called on already padded chain".toString());
        }
        Modifier.Node node = this.head;
        node.setParent$ui_release(NodeChainKt.f16894a);
        NodeChainKt.f16894a.setChild$ui_release(node);
        NodeChainKt$SentinelHead$1 nodeChainKt$SentinelHead$1 = NodeChainKt.f16894a;
        MutableVector<Modifier.Element> mutableVector = this.f16884f;
        int kindSet = 0;
        int size = mutableVector != null ? mutableVector.getSize() : 0;
        MutableVector<Modifier.Element> mutableVector2 = this.f16885g;
        if (mutableVector2 == null) {
            mutableVector2 = new MutableVector<>(new Modifier.Element[16], 0);
        }
        MutableVector<Modifier.Element> mutableVectorAccess$fillVector = NodeChainKt.access$fillVector(m, mutableVector2);
        int size2 = mutableVectorAccess$fillVector.getSize();
        Modifier.Node node2 = this.f16882d;
        int i10 = 1;
        LayoutNode layoutNode = this.layoutNode;
        if (size2 == size) {
            Modifier.Node child = nodeChainKt$SentinelHead$1.getChild();
            int i11 = 0;
            while (child != null && i11 < size) {
                if (mutableVector == null) {
                    throw new IllegalStateException("expected prior modifier list to be non-empty".toString());
                }
                Modifier.Element element = mutableVector.getContent()[i11];
                Modifier.Element element2 = mutableVectorAccess$fillVector.getContent()[i11];
                int iActionForModifiers = NodeChainKt.actionForModifiers(element, element2);
                if (iActionForModifiers == 0) {
                    Logger logger2 = this.f16887i;
                    if (logger2 != null) {
                        logger2.linearDiffAborted(i11, element, element2, child);
                    }
                    child = child.getParent();
                    break;
                }
                if (iActionForModifiers == i10) {
                    d(element, element2, child);
                    Logger logger3 = this.f16887i;
                    if (logger3 != null) {
                        logger3.nodeUpdated(i11, i11, element, element2, child);
                    }
                } else if (iActionForModifiers == 2 && (logger = this.f16887i) != null) {
                    logger.nodeReused(i11, i11, element, element2, child);
                }
                child = child.getChild();
                i11++;
                i10 = 1;
            }
            Modifier.Node node3 = child;
            if (i11 < size) {
                if (mutableVector == null) {
                    throw new IllegalStateException("expected prior modifier list to be non-empty".toString());
                }
                if (node3 == null) {
                    throw new IllegalStateException("structuralUpdate requires a non-null tail".toString());
                }
                c(i11, mutableVector, mutableVectorAccess$fillVector, node3, layoutNode.isAttached());
                kindSet = 1;
            }
        } else {
            if (!layoutNode.isAttached() && size == 0) {
                int i12 = 0;
                Modifier.Node node4 = nodeChainKt$SentinelHead$1;
                while (i12 < mutableVectorAccess$fillVector.getSize()) {
                    Modifier.Element element3 = mutableVectorAccess$fillVector.getContent()[i12];
                    Modifier.Node nodeA = a(element3, node4);
                    Logger logger4 = this.f16887i;
                    if (logger4 != null) {
                        logger4.nodeInserted(0, i12, element3, node4, nodeA);
                    }
                    i12++;
                    node4 = nodeA;
                }
                for (Modifier.Node parent = node2.getParent(); parent != null && parent != NodeChainKt.f16894a; parent = parent.getParent()) {
                    kindSet |= parent.getKindSet();
                    parent.setAggregateChildKindSet$ui_release(kindSet);
                }
            } else if (mutableVectorAccess$fillVector.getSize() != 0) {
                if (mutableVector == null) {
                    mutableVector = new MutableVector<>(new Modifier.Element[16], 0);
                }
                c(0, mutableVector, mutableVectorAccess$fillVector, nodeChainKt$SentinelHead$1, layoutNode.isAttached());
            } else {
                if (mutableVector == null) {
                    throw new IllegalStateException("expected prior modifier list to be non-empty".toString());
                }
                Modifier.Node child2 = nodeChainKt$SentinelHead$1.getChild();
                for (int i13 = 0; child2 != null && i13 < mutableVector.getSize(); i13++) {
                    Logger logger5 = this.f16887i;
                    if (logger5 != null) {
                        logger5.nodeRemoved(i13, mutableVector.getContent()[i13], child2);
                    }
                    child2 = b(child2).getChild();
                }
                LayoutNode parent$ui_release = layoutNode.getParent$ui_release();
                NodeCoordinator innerCoordinator$ui_release = parent$ui_release != null ? parent$ui_release.getInnerCoordinator$ui_release() : null;
                InnerNodeCoordinator innerNodeCoordinator = this.innerCoordinator;
                innerNodeCoordinator.setWrappedBy$ui_release(innerCoordinator$ui_release);
                this.outerCoordinator = innerNodeCoordinator;
            }
            kindSet = 1;
        }
        this.f16884f = mutableVectorAccess$fillVector;
        if (mutableVector != null) {
            mutableVector.clear();
        } else {
            mutableVector = null;
        }
        this.f16885g = mutableVector;
        if (nodeChainKt$SentinelHead$1 != NodeChainKt.f16894a) {
            throw new IllegalStateException("trimChain called on already trimmed chain".toString());
        }
        Modifier.Node child3 = NodeChainKt.f16894a.getChild();
        if (child3 != null) {
            node2 = child3;
        }
        node2.setParent$ui_release(null);
        NodeChainKt.f16894a.setChild$ui_release(null);
        NodeChainKt.f16894a.setAggregateChildKindSet$ui_release(-1);
        NodeChainKt.f16894a.updateCoordinator$ui_release(null);
        if (node2 == NodeChainKt.f16894a) {
            throw new IllegalStateException("trimChain did not update the head".toString());
        }
        this.head = node2;
        if (kindSet != 0) {
            syncCoordinators();
        }
    }

    public final void useLogger$ui_release(@Nullable Logger logger) {
        this.f16887i = logger;
    }

    public final void tailToHead$ui_release(@NotNull Function1<? super Modifier.Node, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        for (Modifier.Node tail$ui_release = getTail$ui_release(); tail$ui_release != null; tail$ui_release = tail$ui_release.getParent()) {
            block.invoke(tail$ui_release);
        }
    }

    public final void headToTail$ui_release(@NotNull Function1<? super Modifier.Node, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        for (Modifier.Node head = getHead(); head != null; head = head.getChild()) {
            block.invoke(head);
        }
    }
}
