package androidx.compose.runtime.snapshots;

import androidx.compose.runtime.PreconditionsKt;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.exifinterface.media.ExifInterface;
import com.adobe.marketing.mobile.EventDataKeys;
import com.bbva.plugin.localstorage.command.ClearCommand;
import com.bbva.plugin.localstorage.command.RemoveCommand;
import com.bbva.plugin.localstorage.command.SetCommand;
import com.bbva.plugin.naturalauthentication.NaturalAuthenticationCommandFactory;
import com.bbva.securesharing.plugin.SecureSharingCommandFactory;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.CollectionToArray;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.markers.KMutableList;
import org.jetbrains.annotations.NotNull;
import s0.h;
import s0.m;

/* JADX INFO: compiled from: SnapshotStateList.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010)\n\u0002\b\u0002\n\u0002\u0010+\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u00022\b\u0012\u0004\u0012\u00028\u00000\u00032\u00060\u0004j\u0002`\u0005:\u0001JB\u0007¢\u0006\u0004\bI\u0010AJ\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\nJ\u0018\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0016\u0010\u0012\u001a\u00020\r2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u0010H\u0016J\u0018\u0010\u0015\u001a\u00028\u00002\u0006\u0010\u0014\u001a\u00020\u0013H\u0096\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0017\u001a\u00020\u00132\u0006\u0010\f\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\b\u0010\u0019\u001a\u00020\rH\u0016J\u000f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00000\u001aH\u0096\u0002J\u0017\u0010\u001c\u001a\u00020\u00132\u0006\u0010\f\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u001c\u0010\u0018J\u000e\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\u001dH\u0016J\u0016\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\u001d2\u0006\u0010\u0014\u001a\u00020\u0013H\u0016J\u001e\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\u001f\u001a\u00020\u00132\u0006\u0010 \u001a\u00020\u0013H\u0016J\b\u0010#\u001a\u00020\"H\u0016J\u0017\u0010$\u001a\u00020\r2\u0006\u0010\f\u001a\u00028\u0000H\u0016¢\u0006\u0004\b$\u0010\u000fJ\u001f\u0010$\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\f\u001a\u00028\u0000H\u0016¢\u0006\u0004\b$\u0010%J\u001e\u0010&\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u00132\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u0010H\u0016J\u0016\u0010&\u001a\u00020\r2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u0010H\u0016J\b\u0010'\u001a\u00020\bH\u0016J\u0017\u0010(\u001a\u00020\r2\u0006\u0010\f\u001a\u00028\u0000H\u0016¢\u0006\u0004\b(\u0010\u000fJ\u0016\u0010)\u001a\u00020\r2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u0010H\u0016J\u0017\u0010*\u001a\u00028\u00002\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b*\u0010\u0016J\u0016\u0010+\u001a\u00020\r2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u0010H\u0016J \u0010,\u001a\u00028\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\f\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b,\u0010-J\u0016\u0010.\u001a\u00020\b2\u0006\u0010\u001f\u001a\u00020\u00132\u0006\u0010 \u001a\u00020\u0013J-\u00103\u001a\u00020\u00132\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u00102\u0006\u0010/\u001a\u00020\u00132\u0006\u00100\u001a\u00020\u0013H\u0000¢\u0006\u0004\b1\u00102R$\u00109\u001a\u00020\u00062\u0006\u00104\u001a\u00020\u00068\u0016@RX\u0096\u000e¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108R\u0014\u0010<\u001a\u00020\u00138@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b:\u0010;R \u0010B\u001a\b\u0012\u0004\u0012\u00028\u00000=8@X\u0080\u0004¢\u0006\f\u0012\u0004\b@\u0010A\u001a\u0004\b>\u0010?R\u0014\u0010D\u001a\u00020\u00138VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bC\u0010;R \u0010H\u001a\b\u0012\u0004\u0012\u00028\u00000\n8AX\u0080\u0004¢\u0006\f\u0012\u0004\bG\u0010A\u001a\u0004\bE\u0010F¨\u0006K"}, d2 = {"Landroidx/compose/runtime/snapshots/SnapshotStateList;", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/compose/runtime/snapshots/StateObject;", "", "Ljava/util/RandomAccess;", "Lkotlin/collections/RandomAccess;", "Landroidx/compose/runtime/snapshots/StateRecord;", "value", "", "prependStateRecord", "", "toList", "element", "", SecureSharingCommandFactory.ACTION_CONTAINS_VALUE, "(Ljava/lang/Object;)Z", "", "elements", "containsAll", "", FirebaseAnalytics.Param.INDEX, "get", "(I)Ljava/lang/Object;", "indexOf", "(Ljava/lang/Object;)I", "isEmpty", "", "iterator", "lastIndexOf", "", "listIterator", "fromIndex", "toIndex", "subList", "", "toString", "add", "(ILjava/lang/Object;)V", "addAll", ClearCommand.ID, RemoveCommand.ID, "removeAll", "removeAt", "retainAll", SetCommand.ID, "(ILjava/lang/Object;)Ljava/lang/Object;", "removeRange", EventDataKeys.Lifecycle.LIFECYCLE_START, "end", "retainAllInRange$runtime_release", "(Ljava/util/Collection;II)I", "retainAllInRange", "<set-?>", "p0", "Landroidx/compose/runtime/snapshots/StateRecord;", "getFirstStateRecord", "()Landroidx/compose/runtime/snapshots/StateRecord;", "firstStateRecord", "getStructure$runtime_release", "()I", "structure", "Landroidx/compose/runtime/snapshots/SnapshotStateList$StateListStateRecord;", "getReadable$runtime_release", "()Landroidx/compose/runtime/snapshots/SnapshotStateList$StateListStateRecord;", "getReadable$runtime_release$annotations", "()V", "readable", "getSize", "size", "getDebuggerDisplayValue", "()Ljava/util/List;", "getDebuggerDisplayValue$annotations", "debuggerDisplayValue", "<init>", "StateListStateRecord", "runtime_release"}, k = 1, mv = {1, 8, 0})
@Stable
@SourceDebugExtension({"SMAP\nSnapshotStateList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapshotStateList.kt\nandroidx/compose/runtime/snapshots/SnapshotStateList\n+ 2 Snapshot.kt\nandroidx/compose/runtime/snapshots/SnapshotKt\n+ 3 Preconditions.kt\nandroidx/compose/runtime/PreconditionsKt\n+ 4 ActualJvm.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,497:1\n171#1:498\n210#1,10:508\n220#1:519\n171#1:520\n221#1,9:522\n167#1:531\n230#1,7:537\n240#1,6:547\n203#1,17:553\n220#1:571\n171#1:572\n221#1,9:574\n167#1:583\n230#1,7:589\n240#1,6:599\n208#1:605\n210#1,10:606\n220#1:617\n171#1:618\n221#1,9:620\n167#1:629\n230#1,7:635\n240#1,6:645\n167#1:651\n210#1,10:662\n220#1:673\n171#1:674\n221#1,9:676\n167#1:685\n230#1,7:691\n240#1,6:701\n210#1,10:707\n220#1:718\n171#1:719\n221#1,9:721\n167#1:730\n230#1,7:736\n240#1,6:746\n203#1,17:753\n220#1:771\n171#1:772\n221#1,9:774\n167#1:783\n230#1,7:789\n240#1,6:799\n208#1:805\n207#1,13:806\n220#1:820\n171#1:821\n221#1,9:823\n167#1:832\n230#1,7:838\n240#1,6:848\n208#1:854\n176#1,5:855\n181#1:861\n171#1:862\n182#1,7:864\n167#1:871\n189#1,7:877\n198#1,3:887\n176#1,5:890\n181#1:896\n171#1:897\n182#1,7:899\n167#1:906\n189#1,7:912\n198#1,3:922\n171#1:925\n176#1,5:937\n181#1:943\n171#1:944\n182#1,7:946\n167#1:953\n189#1,7:959\n198#1,3:969\n171#1:973\n167#1:975\n214#1,6:986\n220#1:993\n171#1:994\n221#1,9:996\n167#1:1005\n230#1,7:1011\n240#1,6:1021\n214#1,7:1027\n171#1:1034\n221#1,9:1036\n167#1:1045\n230#1,7:1051\n240#1,6:1061\n171#1:1068\n167#1:1070\n171#1:1082\n167#1:1084\n2420#2:499\n2420#2:507\n2420#2:521\n2313#2,2:532\n1843#2:534\n2315#2,2:535\n2317#2,3:544\n2420#2:573\n2313#2,2:584\n1843#2:586\n2315#2,2:587\n2317#2,3:596\n2420#2:619\n2313#2,2:630\n1843#2:632\n2315#2,2:633\n2317#2,3:642\n2313#2,2:652\n1843#2:654\n2315#2,2:656\n2317#2,3:659\n2420#2:675\n2313#2,2:686\n1843#2:688\n2315#2,2:689\n2317#2,3:698\n2420#2:720\n2313#2,2:731\n1843#2:733\n2315#2,2:734\n2317#2,3:743\n2420#2:773\n2313#2,2:784\n1843#2:786\n2315#2,2:787\n2317#2,3:796\n2420#2:822\n2313#2,2:833\n1843#2:835\n2315#2,2:836\n2317#2,3:845\n2420#2:863\n2313#2,2:872\n1843#2:874\n2315#2,2:875\n2317#2,3:884\n2420#2:898\n2313#2,2:907\n1843#2:909\n2315#2,2:910\n2317#2,3:919\n2420#2:926\n2313#2,2:927\n1843#2:929\n2315#2,5:931\n2420#2:936\n2420#2:945\n2313#2,2:954\n1843#2:956\n2315#2,2:957\n2317#2,3:966\n2420#2:974\n2313#2,2:976\n1843#2:978\n2315#2,2:980\n2317#2,3:983\n2420#2:995\n2313#2,2:1006\n1843#2:1008\n2315#2,2:1009\n2317#2,3:1018\n2420#2:1035\n2313#2,2:1046\n1843#2:1048\n2315#2,2:1049\n2317#2,3:1058\n2420#2:1069\n2313#2,2:1071\n1843#2:1073\n2315#2,2:1075\n2317#2,3:1078\n2420#2:1083\n2313#2,2:1085\n1843#2:1087\n2315#2,2:1089\n2317#2,3:1092\n33#3,7:500\n89#4:518\n89#4:570\n89#4:616\n89#4:655\n89#4:658\n89#4:672\n89#4:717\n89#4:770\n89#4:819\n89#4:860\n89#4:895\n89#4:930\n89#4:942\n89#4:972\n89#4:979\n89#4:982\n89#4:992\n89#4:1067\n89#4:1074\n89#4:1077\n89#4:1081\n89#4:1088\n89#4:1091\n1#5:752\n*S KotlinDebug\n*F\n+ 1 SnapshotStateList.kt\nandroidx/compose/runtime/snapshots/SnapshotStateList\n*L\n71#1:498\n118#1:508,10\n118#1:519\n118#1:520\n118#1:522,9\n118#1:531\n118#1:537,7\n118#1:547,6\n119#1:553,17\n119#1:571\n119#1:572\n119#1:574,9\n119#1:583\n119#1:589,7\n119#1:599,6\n119#1:605\n124#1:606,10\n124#1:617\n124#1:618\n124#1:620,9\n124#1:629\n124#1:635,7\n124#1:645,6\n126#1:651\n134#1:662,10\n134#1:673\n134#1:674\n134#1:676,9\n134#1:685\n134#1:691,7\n134#1:701,6\n135#1:707,10\n135#1:718\n135#1:719\n135#1:721,9\n135#1:730\n135#1:736,7\n135#1:746,6\n136#1:753,17\n136#1:771\n136#1:772\n136#1:774,9\n136#1:783\n136#1:789,7\n136#1:799,6\n136#1:805\n139#1:806,13\n139#1:820\n139#1:821\n139#1:823,9\n139#1:832\n139#1:838,7\n139#1:848,6\n139#1:854\n143#1:855,5\n143#1:861\n143#1:862\n143#1:864,7\n143#1:871\n143#1:877,7\n143#1:887,3\n150#1:890,5\n150#1:896\n150#1:897\n150#1:899,7\n150#1:906\n150#1:912,7\n150#1:922,3\n163#1:925\n173#1:937,5\n173#1:943\n173#1:944\n173#1:946,7\n173#1:953\n173#1:959,7\n173#1:969,3\n181#1:973\n188#1:975\n207#1:986,6\n207#1:993\n207#1:994\n207#1:996,9\n207#1:1005\n207#1:1011,7\n207#1:1021,6\n207#1:1027,7\n207#1:1034\n207#1:1036,9\n207#1:1045\n207#1:1051,7\n207#1:1061,6\n220#1:1068\n229#1:1070\n220#1:1082\n229#1:1084\n71#1:499\n114#1:507\n118#1:521\n118#1:532,2\n118#1:534\n118#1:535,2\n118#1:544,3\n119#1:573\n119#1:584,2\n119#1:586\n119#1:587,2\n119#1:596,3\n124#1:619\n124#1:630,2\n124#1:632\n124#1:633,2\n124#1:642,3\n126#1:652,2\n126#1:654\n126#1:656,2\n126#1:659,3\n134#1:675\n134#1:686,2\n134#1:688\n134#1:689,2\n134#1:698,3\n135#1:720\n135#1:731,2\n135#1:733\n135#1:734,2\n135#1:743,3\n136#1:773\n136#1:784,2\n136#1:786\n136#1:787,2\n136#1:796,3\n139#1:822\n139#1:833,2\n139#1:835\n139#1:836,2\n139#1:845,3\n143#1:863\n143#1:872,2\n143#1:874\n143#1:875,2\n143#1:884,3\n150#1:898\n150#1:907,2\n150#1:909\n150#1:910,2\n150#1:919,3\n163#1:926\n167#1:927,2\n167#1:929\n167#1:931,5\n171#1:936\n173#1:945\n173#1:954,2\n173#1:956\n173#1:957,2\n173#1:966,3\n181#1:974\n188#1:976,2\n188#1:978\n188#1:980,2\n188#1:983,3\n207#1:995\n207#1:1006,2\n207#1:1008\n207#1:1009,2\n207#1:1018,3\n207#1:1035\n207#1:1046,2\n207#1:1048\n207#1:1049,2\n207#1:1058,3\n220#1:1069\n229#1:1071,2\n229#1:1073\n229#1:1075,2\n229#1:1078,3\n220#1:1083\n229#1:1085,2\n229#1:1087\n229#1:1089,2\n229#1:1092,3\n108#1:500,7\n118#1:518\n119#1:570\n124#1:616\n126#1:655\n127#1:658\n134#1:672\n135#1:717\n136#1:770\n139#1:819\n143#1:860\n150#1:895\n167#1:930\n173#1:942\n180#1:972\n188#1:979\n189#1:982\n207#1:992\n219#1:1067\n229#1:1074\n230#1:1077\n219#1:1081\n229#1:1088\n230#1:1091\n*E\n"})
public final class SnapshotStateList<T> implements StateObject, List<T>, RandomAccess, KMutableList {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    public StateListStateRecord f15302p0;

    /* JADX INFO: compiled from: SnapshotStateList.kt */
    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\r\b\u0000\u0018\u0000*\u0004\b\u0001\u0010\u00012\u00020\u0002B\u0017\b\u0000\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00010\u0007¢\u0006\u0004\b\u001b\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0002H\u0016R(\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00010\u00078\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\"\u0010\u0016\u001a\u00020\u000f8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\"\u0010\u001a\u001a\u00020\u000f8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0011\u001a\u0004\b\u0018\u0010\u0013\"\u0004\b\u0019\u0010\u0015¨\u0006\u001c"}, d2 = {"Landroidx/compose/runtime/snapshots/SnapshotStateList$StateListStateRecord;", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/compose/runtime/snapshots/StateRecord;", "value", "", "assign", "create", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;", "c", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;", "getList$runtime_release", "()Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;", "setList$runtime_release", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;)V", NaturalAuthenticationCommandFactory.ACTION_LIST_AUTHENTICATORS, "", "d", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getModification$runtime_release", "()I", "setModification$runtime_release", "(I)V", "modification", "e", "getStructuralChange$runtime_release", "setStructuralChange$runtime_release", "structuralChange", "<init>", "runtime_release"}, k = 1, mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nSnapshotStateList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapshotStateList.kt\nandroidx/compose/runtime/snapshots/SnapshotStateList$StateListStateRecord\n+ 2 ActualJvm.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt\n*L\n1#1,497:1\n89#2:498\n*S KotlinDebug\n*F\n+ 1 SnapshotStateList.kt\nandroidx/compose/runtime/snapshots/SnapshotStateList$StateListStateRecord\n*L\n86#1:498\n*E\n"})
    public static final class StateListStateRecord<T> extends StateRecord {
        public static final int $stable = 8;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public PersistentList<? extends T> list;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        public int modification;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        public int structuralChange;

        public StateListStateRecord(@NotNull PersistentList<? extends T> persistentList) {
            this.list = persistentList;
        }

        @Override // androidx.compose.runtime.snapshots.StateRecord
        public void assign(@NotNull StateRecord value) {
            synchronized (SnapshotStateListKt.f15309a) {
                Intrinsics.checkNotNull(value, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord.assign$lambda$0>");
                this.list = ((StateListStateRecord) value).list;
                this.modification = ((StateListStateRecord) value).modification;
                this.structuralChange = ((StateListStateRecord) value).structuralChange;
                Unit unit = Unit.INSTANCE;
            }
        }

        @Override // androidx.compose.runtime.snapshots.StateRecord
        @NotNull
        public StateRecord create() {
            return new StateListStateRecord(this.list);
        }

        @NotNull
        public final PersistentList<T> getList$runtime_release() {
            return this.list;
        }

        /* JADX INFO: renamed from: getModification$runtime_release, reason: from getter */
        public final int getModification() {
            return this.modification;
        }

        /* JADX INFO: renamed from: getStructuralChange$runtime_release, reason: from getter */
        public final int getStructuralChange() {
            return this.structuralChange;
        }

        public final void setList$runtime_release(@NotNull PersistentList<? extends T> persistentList) {
            this.list = persistentList;
        }

        public final void setModification$runtime_release(int i10) {
            this.modification = i10;
        }

        public final void setStructuralChange$runtime_release(int i10) {
            this.structuralChange = i10;
        }
    }

    /* JADX INFO: compiled from: SnapshotStateList.kt */
    public static final class a extends Lambda implements Function1<List<T>, Boolean> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ int f15306p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Collection<T> f15307q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(int i10, Collection<? extends T> collection) {
            super(1);
            this.f15306p0 = i10;
            this.f15307q0 = collection;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(((List) obj).addAll(this.f15306p0, this.f15307q0));
        }
    }

    /* JADX INFO: compiled from: SnapshotStateList.kt */
    public static final class b extends Lambda implements Function1<List<T>, Boolean> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Collection<T> f15308p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(Collection<? extends T> collection) {
            super(1);
            this.f15308p0 = collection;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(((List) obj).retainAll(this.f15308p0));
        }
    }

    public SnapshotStateList() {
        PersistentList persistentListPersistentListOf = ExtensionsKt.persistentListOf();
        StateListStateRecord stateListStateRecord = new StateListStateRecord(persistentListPersistentListOf);
        if (Snapshot.INSTANCE.isInSnapshot()) {
            StateListStateRecord stateListStateRecord2 = new StateListStateRecord(persistentListPersistentListOf);
            stateListStateRecord2.setSnapshotId$runtime_release(1);
            stateListStateRecord.setNext$runtime_release(stateListStateRecord2);
        }
        this.f15302p0 = stateListStateRecord;
    }

    public final boolean a(Function1<? super List<T>, Boolean> function1) {
        int modification;
        PersistentList<T> list$runtime_release;
        Boolean boolInvoke;
        Snapshot current;
        boolean z10;
        do {
            synchronized (SnapshotStateListKt.f15309a) {
                StateRecord firstStateRecord = getFirstStateRecord();
                Intrinsics.checkNotNull(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                StateListStateRecord stateListStateRecord = (StateListStateRecord) SnapshotKt.current((StateListStateRecord) firstStateRecord);
                modification = stateListStateRecord.getModification();
                list$runtime_release = stateListStateRecord.getList$runtime_release();
                Unit unit = Unit.INSTANCE;
            }
            Intrinsics.checkNotNull(list$runtime_release);
            PersistentList.Builder<T> builder = list$runtime_release.builder();
            boolInvoke = function1.invoke(builder);
            PersistentList<T> persistentListBuild = builder.build();
            if (Intrinsics.areEqual(persistentListBuild, list$runtime_release)) {
                break;
            }
            StateRecord firstStateRecord2 = getFirstStateRecord();
            Intrinsics.checkNotNull(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            StateListStateRecord stateListStateRecord2 = (StateListStateRecord) firstStateRecord2;
            SnapshotKt.getSnapshotInitializer();
            synchronized (SnapshotKt.getLock()) {
                current = Snapshot.INSTANCE.getCurrent();
                StateListStateRecord stateListStateRecord3 = (StateListStateRecord) SnapshotKt.writableRecord(stateListStateRecord2, this, current);
                synchronized (SnapshotStateListKt.f15309a) {
                    if (stateListStateRecord3.getModification() == modification) {
                        stateListStateRecord3.setList$runtime_release(persistentListBuild);
                        z10 = true;
                        stateListStateRecord3.setModification$runtime_release(stateListStateRecord3.getModification() + 1);
                        stateListStateRecord3.setStructuralChange$runtime_release(stateListStateRecord3.getStructuralChange() + 1);
                    } else {
                        z10 = false;
                    }
                }
            }
            SnapshotKt.notifyWrite(current, this);
        } while (!z10);
        return boolInvoke.booleanValue();
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x007b */
    @Override // java.util.List, java.util.Collection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean add(T r10) {
        /*
            r9 = this;
        L0:
            java.lang.Object r0 = androidx.compose.runtime.snapshots.SnapshotStateListKt.access$getSync$p()
            monitor-enter(r0)
            androidx.compose.runtime.snapshots.StateRecord r1 = r9.getFirstStateRecord()     // Catch: java.lang.Throwable -> L81
            java.lang.String r2 = "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1, r2)     // Catch: java.lang.Throwable -> L81
            androidx.compose.runtime.snapshots.SnapshotStateList$StateListStateRecord r1 = (androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord) r1     // Catch: java.lang.Throwable -> L81
            androidx.compose.runtime.snapshots.StateRecord r1 = androidx.compose.runtime.snapshots.SnapshotKt.current(r1)     // Catch: java.lang.Throwable -> L81
            androidx.compose.runtime.snapshots.SnapshotStateList$StateListStateRecord r1 = (androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord) r1     // Catch: java.lang.Throwable -> L81
            int r2 = r1.getModification()     // Catch: java.lang.Throwable -> L81
            androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList r1 = r1.getList$runtime_release()     // Catch: java.lang.Throwable -> L81
            kotlin.Unit r3 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L81
            monitor-exit(r0)
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1)
            androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList r0 = r1.add(r10)
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            r3 = 0
            if (r1 == 0) goto L30
            goto L7a
        L30:
            androidx.compose.runtime.snapshots.StateRecord r1 = r9.getFirstStateRecord()
            java.lang.String r4 = "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1, r4)
            androidx.compose.runtime.snapshots.SnapshotStateList$StateListStateRecord r1 = (androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord) r1
            androidx.compose.runtime.snapshots.SnapshotKt.getSnapshotInitializer()
            java.lang.Object r4 = androidx.compose.runtime.snapshots.SnapshotKt.getLock()
            monitor-enter(r4)
            androidx.compose.runtime.snapshots.Snapshot$Companion r5 = androidx.compose.runtime.snapshots.Snapshot.INSTANCE     // Catch: java.lang.Throwable -> L7b
            androidx.compose.runtime.snapshots.Snapshot r5 = r5.getCurrent()     // Catch: java.lang.Throwable -> L7b
            androidx.compose.runtime.snapshots.StateRecord r1 = androidx.compose.runtime.snapshots.SnapshotKt.writableRecord(r1, r9, r5)     // Catch: java.lang.Throwable -> L7b
            androidx.compose.runtime.snapshots.SnapshotStateList$StateListStateRecord r1 = (androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord) r1     // Catch: java.lang.Throwable -> L7b
            java.lang.Object r6 = androidx.compose.runtime.snapshots.SnapshotStateListKt.access$getSync$p()     // Catch: java.lang.Throwable -> L7b
            monitor-enter(r6)     // Catch: java.lang.Throwable -> L7b
            int r7 = r1.getModification()     // Catch: java.lang.Throwable -> L70
            r8 = 1
            if (r7 != r2) goto L72
            r1.setList$runtime_release(r0)     // Catch: java.lang.Throwable -> L70
            int r0 = r1.getStructuralChange()     // Catch: java.lang.Throwable -> L70
            int r0 = r0 + r8
            r1.setStructuralChange$runtime_release(r0)     // Catch: java.lang.Throwable -> L70
            int r0 = r1.getModification()     // Catch: java.lang.Throwable -> L70
            int r0 = r0 + r8
            r1.setModification$runtime_release(r0)     // Catch: java.lang.Throwable -> L70
            r3 = r8
            goto L72
        L70:
            r10 = move-exception
            goto L7d
        L72:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L7b
            monitor-exit(r4)
            androidx.compose.runtime.snapshots.SnapshotKt.notifyWrite(r5, r9)
            if (r3 == 0) goto L0
            r3 = r8
        L7a:
            return r3
        L7b:
            r10 = move-exception
            goto L7f
        L7d:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L7b
            throw r10     // Catch: java.lang.Throwable -> L7b
        L7f:
            monitor-exit(r4)
            throw r10
        L81:
            r10 = move-exception
            monitor-exit(r0)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.snapshots.SnapshotStateList.add(java.lang.Object):boolean");
    }

    @Override // java.util.List
    public boolean addAll(int index, @NotNull Collection<? extends T> elements) {
        return a(new a(index, elements));
    }

    @Override // java.util.List, java.util.Collection
    public void clear() {
        Snapshot current;
        StateRecord firstStateRecord = getFirstStateRecord();
        Intrinsics.checkNotNull(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
        StateListStateRecord stateListStateRecord = (StateListStateRecord) firstStateRecord;
        SnapshotKt.getSnapshotInitializer();
        synchronized (SnapshotKt.getLock()) {
            current = Snapshot.INSTANCE.getCurrent();
            StateListStateRecord stateListStateRecord2 = (StateListStateRecord) SnapshotKt.writableRecord(stateListStateRecord, this, current);
            synchronized (SnapshotStateListKt.f15309a) {
                stateListStateRecord2.setList$runtime_release(ExtensionsKt.persistentListOf());
                stateListStateRecord2.setModification$runtime_release(stateListStateRecord2.getModification() + 1);
                stateListStateRecord2.setStructuralChange$runtime_release(stateListStateRecord2.getStructuralChange() + 1);
            }
        }
        SnapshotKt.notifyWrite(current, this);
    }

    @Override // java.util.List, java.util.Collection
    public boolean contains(Object element) {
        return getReadable$runtime_release().getList$runtime_release().contains(element);
    }

    @Override // java.util.List, java.util.Collection
    public boolean containsAll(@NotNull Collection<? extends Object> elements) {
        return getReadable$runtime_release().getList$runtime_release().containsAll(elements);
    }

    @Override // java.util.List
    public T get(int index) {
        return getReadable$runtime_release().getList$runtime_release().get(index);
    }

    @JvmName(name = "getDebuggerDisplayValue")
    @NotNull
    public final List<T> getDebuggerDisplayValue() {
        StateRecord firstStateRecord = getFirstStateRecord();
        Intrinsics.checkNotNull(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
        return ((StateListStateRecord) SnapshotKt.current((StateListStateRecord) firstStateRecord)).getList$runtime_release();
    }

    @Override // androidx.compose.runtime.snapshots.StateObject
    @NotNull
    public StateRecord getFirstStateRecord() {
        return this.f15302p0;
    }

    @NotNull
    public final StateListStateRecord<T> getReadable$runtime_release() {
        StateRecord firstStateRecord = getFirstStateRecord();
        Intrinsics.checkNotNull(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
        return (StateListStateRecord) SnapshotKt.readable((StateListStateRecord) firstStateRecord, this);
    }

    public int getSize() {
        return getReadable$runtime_release().getList$runtime_release().size();
    }

    public final int getStructure$runtime_release() {
        StateRecord firstStateRecord = getFirstStateRecord();
        Intrinsics.checkNotNull(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
        return ((StateListStateRecord) SnapshotKt.current((StateListStateRecord) firstStateRecord)).getStructuralChange();
    }

    @Override // java.util.List
    public int indexOf(Object element) {
        return getReadable$runtime_release().getList$runtime_release().indexOf(element);
    }

    @Override // java.util.List, java.util.Collection
    public boolean isEmpty() {
        return getReadable$runtime_release().getList$runtime_release().isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    @NotNull
    public Iterator<T> iterator() {
        return listIterator();
    }

    @Override // java.util.List
    public int lastIndexOf(Object element) {
        return getReadable$runtime_release().getList$runtime_release().lastIndexOf(element);
    }

    @Override // java.util.List
    @NotNull
    public ListIterator<T> listIterator() {
        return new h(this, 0);
    }

    @Override // androidx.compose.runtime.snapshots.StateObject
    public final /* synthetic */ StateRecord mergeRecords(StateRecord stateRecord, StateRecord stateRecord2, StateRecord stateRecord3) {
        return m.a(this, stateRecord, stateRecord2, stateRecord3);
    }

    @Override // androidx.compose.runtime.snapshots.StateObject
    public void prependStateRecord(@NotNull StateRecord value) {
        value.setNext$runtime_release(getFirstStateRecord());
        Intrinsics.checkNotNull(value, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
        this.f15302p0 = (StateListStateRecord) value;
    }

    @Override // java.util.List
    public final /* bridge */ T remove(int i10) {
        return removeAt(i10);
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x007b */
    @Override // java.util.List, java.util.Collection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean removeAll(@org.jetbrains.annotations.NotNull java.util.Collection<? extends java.lang.Object> r10) {
        /*
            r9 = this;
        L0:
            java.lang.Object r0 = androidx.compose.runtime.snapshots.SnapshotStateListKt.access$getSync$p()
            monitor-enter(r0)
            androidx.compose.runtime.snapshots.StateRecord r1 = r9.getFirstStateRecord()     // Catch: java.lang.Throwable -> L81
            java.lang.String r2 = "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1, r2)     // Catch: java.lang.Throwable -> L81
            androidx.compose.runtime.snapshots.SnapshotStateList$StateListStateRecord r1 = (androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord) r1     // Catch: java.lang.Throwable -> L81
            androidx.compose.runtime.snapshots.StateRecord r1 = androidx.compose.runtime.snapshots.SnapshotKt.current(r1)     // Catch: java.lang.Throwable -> L81
            androidx.compose.runtime.snapshots.SnapshotStateList$StateListStateRecord r1 = (androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord) r1     // Catch: java.lang.Throwable -> L81
            int r2 = r1.getModification()     // Catch: java.lang.Throwable -> L81
            androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList r1 = r1.getList$runtime_release()     // Catch: java.lang.Throwable -> L81
            kotlin.Unit r3 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L81
            monitor-exit(r0)
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1)
            androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList r0 = r1.removeAll(r10)
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            r3 = 0
            if (r1 == 0) goto L30
            goto L7a
        L30:
            androidx.compose.runtime.snapshots.StateRecord r1 = r9.getFirstStateRecord()
            java.lang.String r4 = "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1, r4)
            androidx.compose.runtime.snapshots.SnapshotStateList$StateListStateRecord r1 = (androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord) r1
            androidx.compose.runtime.snapshots.SnapshotKt.getSnapshotInitializer()
            java.lang.Object r4 = androidx.compose.runtime.snapshots.SnapshotKt.getLock()
            monitor-enter(r4)
            androidx.compose.runtime.snapshots.Snapshot$Companion r5 = androidx.compose.runtime.snapshots.Snapshot.INSTANCE     // Catch: java.lang.Throwable -> L7b
            androidx.compose.runtime.snapshots.Snapshot r5 = r5.getCurrent()     // Catch: java.lang.Throwable -> L7b
            androidx.compose.runtime.snapshots.StateRecord r1 = androidx.compose.runtime.snapshots.SnapshotKt.writableRecord(r1, r9, r5)     // Catch: java.lang.Throwable -> L7b
            androidx.compose.runtime.snapshots.SnapshotStateList$StateListStateRecord r1 = (androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord) r1     // Catch: java.lang.Throwable -> L7b
            java.lang.Object r6 = androidx.compose.runtime.snapshots.SnapshotStateListKt.access$getSync$p()     // Catch: java.lang.Throwable -> L7b
            monitor-enter(r6)     // Catch: java.lang.Throwable -> L7b
            int r7 = r1.getModification()     // Catch: java.lang.Throwable -> L70
            r8 = 1
            if (r7 != r2) goto L72
            r1.setList$runtime_release(r0)     // Catch: java.lang.Throwable -> L70
            int r0 = r1.getStructuralChange()     // Catch: java.lang.Throwable -> L70
            int r0 = r0 + r8
            r1.setStructuralChange$runtime_release(r0)     // Catch: java.lang.Throwable -> L70
            int r0 = r1.getModification()     // Catch: java.lang.Throwable -> L70
            int r0 = r0 + r8
            r1.setModification$runtime_release(r0)     // Catch: java.lang.Throwable -> L70
            r3 = r8
            goto L72
        L70:
            r10 = move-exception
            goto L7d
        L72:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L7b
            monitor-exit(r4)
            androidx.compose.runtime.snapshots.SnapshotKt.notifyWrite(r5, r9)
            if (r3 == 0) goto L0
            r3 = r8
        L7a:
            return r3
        L7b:
            r10 = move-exception
            goto L7f
        L7d:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L7b
            throw r10     // Catch: java.lang.Throwable -> L7b
        L7f:
            monitor-exit(r4)
            throw r10
        L81:
            r10 = move-exception
            monitor-exit(r0)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.snapshots.SnapshotStateList.removeAll(java.util.Collection):boolean");
    }

    public T removeAt(int index) {
        int modification;
        PersistentList<T> list$runtime_release;
        Snapshot current;
        boolean z10;
        T t10 = get(index);
        do {
            synchronized (SnapshotStateListKt.f15309a) {
                StateRecord firstStateRecord = getFirstStateRecord();
                Intrinsics.checkNotNull(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                StateListStateRecord stateListStateRecord = (StateListStateRecord) SnapshotKt.current((StateListStateRecord) firstStateRecord);
                modification = stateListStateRecord.getModification();
                list$runtime_release = stateListStateRecord.getList$runtime_release();
                Unit unit = Unit.INSTANCE;
            }
            Intrinsics.checkNotNull(list$runtime_release);
            PersistentList<T> persistentListRemoveAt = list$runtime_release.removeAt(index);
            if (Intrinsics.areEqual(persistentListRemoveAt, list$runtime_release)) {
                break;
            }
            StateRecord firstStateRecord2 = getFirstStateRecord();
            Intrinsics.checkNotNull(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            StateListStateRecord stateListStateRecord2 = (StateListStateRecord) firstStateRecord2;
            SnapshotKt.getSnapshotInitializer();
            synchronized (SnapshotKt.getLock()) {
                current = Snapshot.INSTANCE.getCurrent();
                StateListStateRecord stateListStateRecord3 = (StateListStateRecord) SnapshotKt.writableRecord(stateListStateRecord2, this, current);
                synchronized (SnapshotStateListKt.f15309a) {
                    if (stateListStateRecord3.getModification() == modification) {
                        stateListStateRecord3.setList$runtime_release(persistentListRemoveAt);
                        z10 = true;
                        stateListStateRecord3.setStructuralChange$runtime_release(stateListStateRecord3.getStructuralChange() + 1);
                        stateListStateRecord3.setModification$runtime_release(stateListStateRecord3.getModification() + 1);
                    } else {
                        z10 = false;
                    }
                }
            }
            SnapshotKt.notifyWrite(current, this);
        } while (!z10);
        return t10;
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x0083 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void removeRange(int r8, int r9) {
        /*
            r7 = this;
        L0:
            java.lang.Object r0 = androidx.compose.runtime.snapshots.SnapshotStateListKt.access$getSync$p()
            monitor-enter(r0)
            androidx.compose.runtime.snapshots.StateRecord r1 = r7.getFirstStateRecord()     // Catch: java.lang.Throwable -> L8a
            java.lang.String r2 = "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1, r2)     // Catch: java.lang.Throwable -> L8a
            androidx.compose.runtime.snapshots.SnapshotStateList$StateListStateRecord r1 = (androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord) r1     // Catch: java.lang.Throwable -> L8a
            androidx.compose.runtime.snapshots.StateRecord r1 = androidx.compose.runtime.snapshots.SnapshotKt.current(r1)     // Catch: java.lang.Throwable -> L8a
            androidx.compose.runtime.snapshots.SnapshotStateList$StateListStateRecord r1 = (androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord) r1     // Catch: java.lang.Throwable -> L8a
            int r2 = r1.getModification()     // Catch: java.lang.Throwable -> L8a
            androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList r1 = r1.getList$runtime_release()     // Catch: java.lang.Throwable -> L8a
            kotlin.Unit r3 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L8a
            monitor-exit(r0)
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1)
            androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList$Builder r0 = r1.builder()
            java.util.List r3 = r0.subList(r8, r9)
            r3.clear()
            androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList r0 = r0.build()
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r1 != 0) goto L89
            androidx.compose.runtime.snapshots.StateRecord r1 = r7.getFirstStateRecord()
            java.lang.String r3 = "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1, r3)
            androidx.compose.runtime.snapshots.SnapshotStateList$StateListStateRecord r1 = (androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord) r1
            androidx.compose.runtime.snapshots.SnapshotKt.getSnapshotInitializer()
            java.lang.Object r3 = androidx.compose.runtime.snapshots.SnapshotKt.getLock()
            monitor-enter(r3)
            androidx.compose.runtime.snapshots.Snapshot$Companion r4 = androidx.compose.runtime.snapshots.Snapshot.INSTANCE     // Catch: java.lang.Throwable -> L83
            androidx.compose.runtime.snapshots.Snapshot r4 = r4.getCurrent()     // Catch: java.lang.Throwable -> L83
            androidx.compose.runtime.snapshots.StateRecord r1 = androidx.compose.runtime.snapshots.SnapshotKt.writableRecord(r1, r7, r4)     // Catch: java.lang.Throwable -> L83
            androidx.compose.runtime.snapshots.SnapshotStateList$StateListStateRecord r1 = (androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord) r1     // Catch: java.lang.Throwable -> L83
            java.lang.Object r5 = androidx.compose.runtime.snapshots.SnapshotStateListKt.access$getSync$p()     // Catch: java.lang.Throwable -> L83
            monitor-enter(r5)     // Catch: java.lang.Throwable -> L83
            int r6 = r1.getModification()     // Catch: java.lang.Throwable -> L78
            if (r6 != r2) goto L7a
            r1.setList$runtime_release(r0)     // Catch: java.lang.Throwable -> L78
            int r0 = r1.getModification()     // Catch: java.lang.Throwable -> L78
            r2 = 1
            int r0 = r0 + r2
            r1.setModification$runtime_release(r0)     // Catch: java.lang.Throwable -> L78
            int r0 = r1.getStructuralChange()     // Catch: java.lang.Throwable -> L78
            int r0 = r0 + r2
            r1.setStructuralChange$runtime_release(r0)     // Catch: java.lang.Throwable -> L78
            goto L7b
        L78:
            r8 = move-exception
            goto L85
        L7a:
            r2 = 0
        L7b:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L83
            monitor-exit(r3)
            androidx.compose.runtime.snapshots.SnapshotKt.notifyWrite(r4, r7)
            if (r2 == 0) goto L0
            goto L89
        L83:
            r8 = move-exception
            goto L87
        L85:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L83
            throw r8     // Catch: java.lang.Throwable -> L83
        L87:
            monitor-exit(r3)
            throw r8
        L89:
            return
        L8a:
            r8 = move-exception
            monitor-exit(r0)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.snapshots.SnapshotStateList.removeRange(int, int):void");
    }

    @Override // java.util.List, java.util.Collection
    public boolean retainAll(@NotNull Collection<? extends Object> elements) {
        return a(new b(elements));
    }

    public final int retainAllInRange$runtime_release(@NotNull Collection<? extends T> elements, int start, int end) {
        int modification;
        PersistentList<T> list$runtime_release;
        Snapshot current;
        boolean z10;
        int size = size();
        do {
            synchronized (SnapshotStateListKt.f15309a) {
                StateRecord firstStateRecord = getFirstStateRecord();
                Intrinsics.checkNotNull(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                StateListStateRecord stateListStateRecord = (StateListStateRecord) SnapshotKt.current((StateListStateRecord) firstStateRecord);
                modification = stateListStateRecord.getModification();
                list$runtime_release = stateListStateRecord.getList$runtime_release();
                Unit unit = Unit.INSTANCE;
            }
            Intrinsics.checkNotNull(list$runtime_release);
            PersistentList.Builder<T> builder = list$runtime_release.builder();
            builder.subList(start, end).retainAll(elements);
            PersistentList<T> persistentListBuild = builder.build();
            if (Intrinsics.areEqual(persistentListBuild, list$runtime_release)) {
                break;
            }
            StateRecord firstStateRecord2 = getFirstStateRecord();
            Intrinsics.checkNotNull(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            StateListStateRecord stateListStateRecord2 = (StateListStateRecord) firstStateRecord2;
            SnapshotKt.getSnapshotInitializer();
            synchronized (SnapshotKt.getLock()) {
                current = Snapshot.INSTANCE.getCurrent();
                StateListStateRecord stateListStateRecord3 = (StateListStateRecord) SnapshotKt.writableRecord(stateListStateRecord2, this, current);
                synchronized (SnapshotStateListKt.f15309a) {
                    if (stateListStateRecord3.getModification() == modification) {
                        stateListStateRecord3.setList$runtime_release(persistentListBuild);
                        z10 = true;
                        stateListStateRecord3.setModification$runtime_release(stateListStateRecord3.getModification() + 1);
                        stateListStateRecord3.setStructuralChange$runtime_release(stateListStateRecord3.getStructuralChange() + 1);
                    } else {
                        z10 = false;
                    }
                }
            }
            SnapshotKt.notifyWrite(current, this);
        } while (!z10);
        return size - size();
    }

    @Override // java.util.List
    public T set(int index, T element) {
        int modification;
        PersistentList<T> list$runtime_release;
        Snapshot current;
        boolean z10;
        T t10 = get(index);
        do {
            synchronized (SnapshotStateListKt.f15309a) {
                StateRecord firstStateRecord = getFirstStateRecord();
                Intrinsics.checkNotNull(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                StateListStateRecord stateListStateRecord = (StateListStateRecord) SnapshotKt.current((StateListStateRecord) firstStateRecord);
                modification = stateListStateRecord.getModification();
                list$runtime_release = stateListStateRecord.getList$runtime_release();
                Unit unit = Unit.INSTANCE;
            }
            Intrinsics.checkNotNull(list$runtime_release);
            PersistentList<T> persistentList = list$runtime_release.set(index, element);
            if (Intrinsics.areEqual(persistentList, list$runtime_release)) {
                break;
            }
            StateRecord firstStateRecord2 = getFirstStateRecord();
            Intrinsics.checkNotNull(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            StateListStateRecord stateListStateRecord2 = (StateListStateRecord) firstStateRecord2;
            SnapshotKt.getSnapshotInitializer();
            synchronized (SnapshotKt.getLock()) {
                current = Snapshot.INSTANCE.getCurrent();
                StateListStateRecord stateListStateRecord3 = (StateListStateRecord) SnapshotKt.writableRecord(stateListStateRecord2, this, current);
                synchronized (SnapshotStateListKt.f15309a) {
                    if (stateListStateRecord3.getModification() == modification) {
                        stateListStateRecord3.setList$runtime_release(persistentList);
                        z10 = true;
                        stateListStateRecord3.setModification$runtime_release(stateListStateRecord3.getModification() + 1);
                    } else {
                        z10 = false;
                    }
                }
            }
            SnapshotKt.notifyWrite(current, this);
        } while (!z10);
        return t10;
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ int size() {
        return getSize();
    }

    @Override // java.util.List
    @NotNull
    public List<T> subList(int fromIndex, int toIndex) {
        if (!(fromIndex >= 0 && fromIndex <= toIndex && toIndex <= size())) {
            PreconditionsKt.throwIllegalArgumentException("fromIndex or toIndex are out of bounds");
        }
        return new SubList(this, fromIndex, toIndex);
    }

    @Override // java.util.List, java.util.Collection
    public Object[] toArray() {
        return CollectionToArray.toArray(this);
    }

    @NotNull
    public final List<T> toList() {
        return getReadable$runtime_release().getList$runtime_release();
    }

    @NotNull
    public String toString() {
        StateRecord firstStateRecord = getFirstStateRecord();
        Intrinsics.checkNotNull(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
        return "SnapshotStateList(value=" + ((StateListStateRecord) SnapshotKt.current((StateListStateRecord) firstStateRecord)).getList$runtime_release() + ")@" + hashCode();
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x007b */
    @Override // java.util.List, java.util.Collection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean addAll(@org.jetbrains.annotations.NotNull java.util.Collection<? extends T> r10) {
        /*
            r9 = this;
        L0:
            java.lang.Object r0 = androidx.compose.runtime.snapshots.SnapshotStateListKt.access$getSync$p()
            monitor-enter(r0)
            androidx.compose.runtime.snapshots.StateRecord r1 = r9.getFirstStateRecord()     // Catch: java.lang.Throwable -> L81
            java.lang.String r2 = "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1, r2)     // Catch: java.lang.Throwable -> L81
            androidx.compose.runtime.snapshots.SnapshotStateList$StateListStateRecord r1 = (androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord) r1     // Catch: java.lang.Throwable -> L81
            androidx.compose.runtime.snapshots.StateRecord r1 = androidx.compose.runtime.snapshots.SnapshotKt.current(r1)     // Catch: java.lang.Throwable -> L81
            androidx.compose.runtime.snapshots.SnapshotStateList$StateListStateRecord r1 = (androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord) r1     // Catch: java.lang.Throwable -> L81
            int r2 = r1.getModification()     // Catch: java.lang.Throwable -> L81
            androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList r1 = r1.getList$runtime_release()     // Catch: java.lang.Throwable -> L81
            kotlin.Unit r3 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L81
            monitor-exit(r0)
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1)
            androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList r0 = r1.addAll(r10)
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            r3 = 0
            if (r1 == 0) goto L30
            goto L7a
        L30:
            androidx.compose.runtime.snapshots.StateRecord r1 = r9.getFirstStateRecord()
            java.lang.String r4 = "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1, r4)
            androidx.compose.runtime.snapshots.SnapshotStateList$StateListStateRecord r1 = (androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord) r1
            androidx.compose.runtime.snapshots.SnapshotKt.getSnapshotInitializer()
            java.lang.Object r4 = androidx.compose.runtime.snapshots.SnapshotKt.getLock()
            monitor-enter(r4)
            androidx.compose.runtime.snapshots.Snapshot$Companion r5 = androidx.compose.runtime.snapshots.Snapshot.INSTANCE     // Catch: java.lang.Throwable -> L7b
            androidx.compose.runtime.snapshots.Snapshot r5 = r5.getCurrent()     // Catch: java.lang.Throwable -> L7b
            androidx.compose.runtime.snapshots.StateRecord r1 = androidx.compose.runtime.snapshots.SnapshotKt.writableRecord(r1, r9, r5)     // Catch: java.lang.Throwable -> L7b
            androidx.compose.runtime.snapshots.SnapshotStateList$StateListStateRecord r1 = (androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord) r1     // Catch: java.lang.Throwable -> L7b
            java.lang.Object r6 = androidx.compose.runtime.snapshots.SnapshotStateListKt.access$getSync$p()     // Catch: java.lang.Throwable -> L7b
            monitor-enter(r6)     // Catch: java.lang.Throwable -> L7b
            int r7 = r1.getModification()     // Catch: java.lang.Throwable -> L70
            r8 = 1
            if (r7 != r2) goto L72
            r1.setList$runtime_release(r0)     // Catch: java.lang.Throwable -> L70
            int r0 = r1.getStructuralChange()     // Catch: java.lang.Throwable -> L70
            int r0 = r0 + r8
            r1.setStructuralChange$runtime_release(r0)     // Catch: java.lang.Throwable -> L70
            int r0 = r1.getModification()     // Catch: java.lang.Throwable -> L70
            int r0 = r0 + r8
            r1.setModification$runtime_release(r0)     // Catch: java.lang.Throwable -> L70
            r3 = r8
            goto L72
        L70:
            r10 = move-exception
            goto L7d
        L72:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L7b
            monitor-exit(r4)
            androidx.compose.runtime.snapshots.SnapshotKt.notifyWrite(r5, r9)
            if (r3 == 0) goto L0
            r3 = r8
        L7a:
            return r3
        L7b:
            r10 = move-exception
            goto L7f
        L7d:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L7b
            throw r10     // Catch: java.lang.Throwable -> L7b
        L7f:
            monitor-exit(r4)
            throw r10
        L81:
            r10 = move-exception
            monitor-exit(r0)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.snapshots.SnapshotStateList.addAll(java.util.Collection):boolean");
    }

    @Override // java.util.List
    @NotNull
    public ListIterator<T> listIterator(int index) {
        return new h(this, index);
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x007b */
    @Override // java.util.List, java.util.Collection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean remove(java.lang.Object r10) {
        /*
            r9 = this;
        L0:
            java.lang.Object r0 = androidx.compose.runtime.snapshots.SnapshotStateListKt.access$getSync$p()
            monitor-enter(r0)
            androidx.compose.runtime.snapshots.StateRecord r1 = r9.getFirstStateRecord()     // Catch: java.lang.Throwable -> L81
            java.lang.String r2 = "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1, r2)     // Catch: java.lang.Throwable -> L81
            androidx.compose.runtime.snapshots.SnapshotStateList$StateListStateRecord r1 = (androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord) r1     // Catch: java.lang.Throwable -> L81
            androidx.compose.runtime.snapshots.StateRecord r1 = androidx.compose.runtime.snapshots.SnapshotKt.current(r1)     // Catch: java.lang.Throwable -> L81
            androidx.compose.runtime.snapshots.SnapshotStateList$StateListStateRecord r1 = (androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord) r1     // Catch: java.lang.Throwable -> L81
            int r2 = r1.getModification()     // Catch: java.lang.Throwable -> L81
            androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList r1 = r1.getList$runtime_release()     // Catch: java.lang.Throwable -> L81
            kotlin.Unit r3 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L81
            monitor-exit(r0)
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1)
            androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList r0 = r1.remove(r10)
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            r3 = 0
            if (r1 == 0) goto L30
            goto L7a
        L30:
            androidx.compose.runtime.snapshots.StateRecord r1 = r9.getFirstStateRecord()
            java.lang.String r4 = "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1, r4)
            androidx.compose.runtime.snapshots.SnapshotStateList$StateListStateRecord r1 = (androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord) r1
            androidx.compose.runtime.snapshots.SnapshotKt.getSnapshotInitializer()
            java.lang.Object r4 = androidx.compose.runtime.snapshots.SnapshotKt.getLock()
            monitor-enter(r4)
            androidx.compose.runtime.snapshots.Snapshot$Companion r5 = androidx.compose.runtime.snapshots.Snapshot.INSTANCE     // Catch: java.lang.Throwable -> L7b
            androidx.compose.runtime.snapshots.Snapshot r5 = r5.getCurrent()     // Catch: java.lang.Throwable -> L7b
            androidx.compose.runtime.snapshots.StateRecord r1 = androidx.compose.runtime.snapshots.SnapshotKt.writableRecord(r1, r9, r5)     // Catch: java.lang.Throwable -> L7b
            androidx.compose.runtime.snapshots.SnapshotStateList$StateListStateRecord r1 = (androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord) r1     // Catch: java.lang.Throwable -> L7b
            java.lang.Object r6 = androidx.compose.runtime.snapshots.SnapshotStateListKt.access$getSync$p()     // Catch: java.lang.Throwable -> L7b
            monitor-enter(r6)     // Catch: java.lang.Throwable -> L7b
            int r7 = r1.getModification()     // Catch: java.lang.Throwable -> L70
            r8 = 1
            if (r7 != r2) goto L72
            r1.setList$runtime_release(r0)     // Catch: java.lang.Throwable -> L70
            int r0 = r1.getStructuralChange()     // Catch: java.lang.Throwable -> L70
            int r0 = r0 + r8
            r1.setStructuralChange$runtime_release(r0)     // Catch: java.lang.Throwable -> L70
            int r0 = r1.getModification()     // Catch: java.lang.Throwable -> L70
            int r0 = r0 + r8
            r1.setModification$runtime_release(r0)     // Catch: java.lang.Throwable -> L70
            r3 = r8
            goto L72
        L70:
            r10 = move-exception
            goto L7d
        L72:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L7b
            monitor-exit(r4)
            androidx.compose.runtime.snapshots.SnapshotKt.notifyWrite(r5, r9)
            if (r3 == 0) goto L0
            r3 = r8
        L7a:
            return r3
        L7b:
            r10 = move-exception
            goto L7f
        L7d:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L7b
            throw r10     // Catch: java.lang.Throwable -> L7b
        L7f:
            monitor-exit(r4)
            throw r10
        L81:
            r10 = move-exception
            monitor-exit(r0)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.snapshots.SnapshotStateList.remove(java.lang.Object):boolean");
    }

    @Override // java.util.List, java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        return (T[]) CollectionToArray.toArray(this, tArr);
    }

    public static /* synthetic */ void getDebuggerDisplayValue$annotations() {
    }

    public static /* synthetic */ void getReadable$runtime_release$annotations() {
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x0079 */
    @Override // java.util.List
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void add(int r8, T r9) {
        /*
            r7 = this;
        L0:
            java.lang.Object r0 = androidx.compose.runtime.snapshots.SnapshotStateListKt.access$getSync$p()
            monitor-enter(r0)
            androidx.compose.runtime.snapshots.StateRecord r1 = r7.getFirstStateRecord()     // Catch: java.lang.Throwable -> L7f
            java.lang.String r2 = "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1, r2)     // Catch: java.lang.Throwable -> L7f
            androidx.compose.runtime.snapshots.SnapshotStateList$StateListStateRecord r1 = (androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord) r1     // Catch: java.lang.Throwable -> L7f
            androidx.compose.runtime.snapshots.StateRecord r1 = androidx.compose.runtime.snapshots.SnapshotKt.current(r1)     // Catch: java.lang.Throwable -> L7f
            androidx.compose.runtime.snapshots.SnapshotStateList$StateListStateRecord r1 = (androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord) r1     // Catch: java.lang.Throwable -> L7f
            int r2 = r1.getModification()     // Catch: java.lang.Throwable -> L7f
            androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList r1 = r1.getList$runtime_release()     // Catch: java.lang.Throwable -> L7f
            kotlin.Unit r3 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L7f
            monitor-exit(r0)
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1)
            androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList r0 = r1.add(r8, r9)
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r1 == 0) goto L2f
            goto L78
        L2f:
            androidx.compose.runtime.snapshots.StateRecord r1 = r7.getFirstStateRecord()
            java.lang.String r3 = "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1, r3)
            androidx.compose.runtime.snapshots.SnapshotStateList$StateListStateRecord r1 = (androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord) r1
            androidx.compose.runtime.snapshots.SnapshotKt.getSnapshotInitializer()
            java.lang.Object r3 = androidx.compose.runtime.snapshots.SnapshotKt.getLock()
            monitor-enter(r3)
            androidx.compose.runtime.snapshots.Snapshot$Companion r4 = androidx.compose.runtime.snapshots.Snapshot.INSTANCE     // Catch: java.lang.Throwable -> L79
            androidx.compose.runtime.snapshots.Snapshot r4 = r4.getCurrent()     // Catch: java.lang.Throwable -> L79
            androidx.compose.runtime.snapshots.StateRecord r1 = androidx.compose.runtime.snapshots.SnapshotKt.writableRecord(r1, r7, r4)     // Catch: java.lang.Throwable -> L79
            androidx.compose.runtime.snapshots.SnapshotStateList$StateListStateRecord r1 = (androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord) r1     // Catch: java.lang.Throwable -> L79
            java.lang.Object r5 = androidx.compose.runtime.snapshots.SnapshotStateListKt.access$getSync$p()     // Catch: java.lang.Throwable -> L79
            monitor-enter(r5)     // Catch: java.lang.Throwable -> L79
            int r6 = r1.getModification()     // Catch: java.lang.Throwable -> L6e
            if (r6 != r2) goto L70
            r1.setList$runtime_release(r0)     // Catch: java.lang.Throwable -> L6e
            int r0 = r1.getStructuralChange()     // Catch: java.lang.Throwable -> L6e
            r2 = 1
            int r0 = r0 + r2
            r1.setStructuralChange$runtime_release(r0)     // Catch: java.lang.Throwable -> L6e
            int r0 = r1.getModification()     // Catch: java.lang.Throwable -> L6e
            int r0 = r0 + r2
            r1.setModification$runtime_release(r0)     // Catch: java.lang.Throwable -> L6e
            goto L71
        L6e:
            r8 = move-exception
            goto L7b
        L70:
            r2 = 0
        L71:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L79
            monitor-exit(r3)
            androidx.compose.runtime.snapshots.SnapshotKt.notifyWrite(r4, r7)
            if (r2 == 0) goto L0
        L78:
            return
        L79:
            r8 = move-exception
            goto L7d
        L7b:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L79
            throw r8     // Catch: java.lang.Throwable -> L79
        L7d:
            monitor-exit(r3)
            throw r8
        L7f:
            r8 = move-exception
            monitor-exit(r0)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.snapshots.SnapshotStateList.add(int, java.lang.Object):void");
    }
}
