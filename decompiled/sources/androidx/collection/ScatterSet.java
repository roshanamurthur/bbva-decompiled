package androidx.collection;

import androidx.annotation.IntRange;
import androidx.collection.internal.ContainerHelpersKt;
import androidx.exifinterface.media.ExifInterface;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.securesharing.plugin.SecureSharingCommandFactory;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.mastercard.sonic.androidsvg.SVGParser;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.CollectionToArray;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.markers.KMappedMarker;
import kotlin.sequences.SequenceScope;
import kotlin.sequences.SequencesKt__SequenceBuilderKt;
import mx.openpay.library.domain.util.Constant;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ScatterSet.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\u0016\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\"\n\u0002\b\r\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\r\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001<B\u0007\b\u0004¢\u0006\u0002\u0010\u0003J:\u0010\u0013\u001a\u00020\u00142!\u0010\u0015\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\u0019\u0012\u0004\u0012\u00020\u00140\u0016H\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001J\u0006\u0010\u001a\u001a\u00020\u0014J:\u0010\u001a\u001a\u00020\u00142!\u0010\u0015\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\u0019\u0012\u0004\u0012\u00020\u00140\u0016H\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001J\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00000\u001cJ\u0016\u0010\u001d\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0002\u0010\u001eJ\b\u0010\u001f\u001a\u00020\u0005H\u0007J:\u0010\u001f\u001a\u00020\u00052!\u0010\u0015\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\u0019\u0012\u0004\u0012\u00020\u00140\u0016H\u0087\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001J\u0013\u0010 \u001a\u00020\u00142\b\u0010!\u001a\u0004\u0018\u00010\u0002H\u0096\u0002J\u0018\u0010\"\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00028\u0000H\u0080\b¢\u0006\u0004\b#\u0010$J\u000e\u0010%\u001a\u00028\u0000H\u0086\b¢\u0006\u0002\u0010&J?\u0010%\u001a\u00028\u00002!\u0010\u0015\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\u0019\u0012\u0004\u0012\u00020\u00140\u0016H\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0002\u0010'JA\u0010(\u001a\u0004\u0018\u00018\u00002!\u0010\u0015\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\u0019\u0012\u0004\u0012\u00020\u00140\u0016H\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0002\u0010'J:\u0010)\u001a\u00020*2!\u0010+\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\u0019\u0012\u0004\u0012\u00020*0\u0016H\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001J:\u0010,\u001a\u00020*2!\u0010+\u001a\u001d\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(-\u0012\u0004\u0012\u00020*0\u0016H\u0081\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001J\b\u0010.\u001a\u00020\u0005H\u0016J\u0006\u0010/\u001a\u00020\u0014J\u0006\u00100\u001a\u00020\u0014JR\u00101\u001a\u0002022\b\b\u0002\u00103\u001a\u0002042\b\b\u0002\u00105\u001a\u0002042\b\b\u0002\u00106\u001a\u0002042\b\b\u0002\u00107\u001a\u00020\u00052\b\b\u0002\u00108\u001a\u0002042\u0016\b\u0002\u00109\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u000204\u0018\u00010\u0016H\u0007J\u0006\u0010:\u001a\u00020\u0014J\b\u0010;\u001a\u000202H\u0016R\u0012\u0010\u0004\u001a\u00020\u00058\u0000@\u0000X\u0081\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0006\u001a\u00020\u00058\u0000@\u0000X\u0081\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0007\u001a\u00020\u00058G¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\"\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u000b8\u0000@\u0000X\u0081\u000e¢\u0006\n\n\u0002\u0010\r\u0012\u0004\b\f\u0010\u0003R\u0018\u0010\u000e\u001a\u00020\u000f8\u0000@\u0000X\u0081\u000e¢\u0006\b\n\u0000\u0012\u0004\b\u0010\u0010\u0003R\u0011\u0010\u0011\u001a\u00020\u00058G¢\u0006\u0006\u001a\u0004\b\u0012\u0010\t\u0082\u0001\u0001=\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006>"}, d2 = {"Landroidx/collection/ScatterSet;", ExifInterface.LONGITUDE_EAST, "", "()V", "_capacity", "", "_size", "capacity", "getCapacity", "()I", "elements", "", "getElements$annotations", "[Ljava/lang/Object;", "metadata", "", "getMetadata$annotations", "size", "getSize", SVGParser.XML_STYLESHEET_ATTR_MEDIA_ALL, "", "predicate", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "element", "any", "asSet", "", SecureSharingCommandFactory.ACTION_CONTAINS_VALUE, "(Ljava/lang/Object;)Z", "count", "equals", "other", "findElementIndex", "findElementIndex$collection", "(Ljava/lang/Object;)I", "first", "()Ljava/lang/Object;", "(Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "firstOrNull", "forEach", "", "block", "forEachIndex", FirebaseAnalytics.Param.INDEX, GenerateActivationFormCommand.HASH_CODE, "isEmpty", "isNotEmpty", "joinToString", "", "separator", "", "prefix", "postfix", "limit", "truncated", "transform", "none", "toString", "SetWrapper", "Landroidx/collection/MutableScatterSet;", "collection"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nScatterSet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScatterSet.kt\nandroidx/collection/ScatterSet\n+ 2 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n*L\n1#1,1084:1\n267#1,4:1085\n237#1,7:1089\n248#1,3:1097\n251#1,2:1101\n272#1,2:1103\n254#1,6:1105\n274#1:1111\n267#1,4:1112\n237#1,7:1116\n248#1,3:1124\n251#1,2:1128\n272#1,2:1130\n254#1,6:1132\n274#1:1138\n267#1,4:1139\n237#1,7:1143\n248#1,3:1151\n251#1,2:1155\n272#1,2:1157\n254#1,6:1159\n274#1:1165\n237#1,7:1168\n248#1,3:1176\n251#1,9:1180\n267#1,4:1189\n237#1,7:1193\n248#1,3:1201\n251#1,2:1205\n272#1,2:1207\n254#1,6:1209\n274#1:1215\n267#1,4:1216\n237#1,7:1220\n248#1,3:1228\n251#1,2:1232\n272#1,2:1234\n254#1,6:1236\n274#1:1242\n267#1,4:1243\n237#1,7:1247\n248#1,3:1255\n251#1,2:1259\n272#1,2:1261\n254#1,6:1263\n274#1:1269\n433#1:1270\n434#1:1274\n436#1,2:1276\n438#1,3:1279\n441#1:1285\n442#1:1289\n443#1:1291\n444#1,4:1294\n450#1:1299\n451#1,8:1301\n267#1,4:1309\n237#1,7:1313\n248#1,3:1321\n251#1,2:1325\n272#1,2:1327\n254#1,6:1329\n274#1:1335\n267#1,4:1336\n237#1,7:1340\n248#1,3:1348\n251#1,2:1352\n272#1,2:1354\n254#1,6:1356\n274#1:1362\n267#1,4:1363\n237#1,7:1367\n248#1,3:1375\n251#1,2:1379\n272#1,2:1381\n254#1,6:1383\n274#1:1389\n1810#2:1096\n1672#2:1100\n1810#2:1123\n1672#2:1127\n1810#2:1150\n1672#2:1154\n1810#2:1166\n1672#2:1167\n1810#2:1175\n1672#2:1179\n1810#2:1200\n1672#2:1204\n1810#2:1227\n1672#2:1231\n1810#2:1254\n1672#2:1258\n1589#2,3:1271\n1603#2:1275\n1599#2:1278\n1779#2,3:1282\n1793#2,3:1286\n1717#2:1290\n1705#2:1292\n1699#2:1293\n1712#2:1298\n1802#2:1300\n1810#2:1320\n1672#2:1324\n1810#2:1347\n1672#2:1351\n1810#2:1374\n1672#2:1378\n1589#2,3:1390\n1603#2:1393\n1599#2:1394\n1779#2,3:1395\n1793#2,3:1398\n1717#2:1401\n1705#2:1402\n1699#2:1403\n1712#2:1404\n1802#2:1405\n*S KotlinDebug\n*F\n+ 1 ScatterSet.kt\nandroidx/collection/ScatterSet\n*L\n201#1:1085,4\n201#1:1089,7\n201#1:1097,3\n201#1:1101,2\n201#1:1103,2\n201#1:1105,6\n201#1:1111\n214#1:1112,4\n214#1:1116,7\n214#1:1124,3\n214#1:1128,2\n214#1:1130,2\n214#1:1132,6\n214#1:1138\n227#1:1139,4\n227#1:1143,7\n227#1:1151,3\n227#1:1155,2\n227#1:1157,2\n227#1:1159,6\n227#1:1165\n270#1:1168,7\n270#1:1176,3\n270#1:1180,9\n284#1:1189,4\n284#1:1193,7\n284#1:1201,3\n284#1:1205,2\n284#1:1207,2\n284#1:1209,6\n284#1:1215\n297#1:1216,4\n297#1:1220,7\n297#1:1228,3\n297#1:1232,2\n297#1:1234,2\n297#1:1236,6\n297#1:1242\n318#1:1243,4\n318#1:1247,7\n318#1:1255,3\n318#1:1259,2\n318#1:1261,2\n318#1:1263,6\n318#1:1269\n329#1:1270\n329#1:1274\n329#1:1276,2\n329#1:1279,3\n329#1:1285\n329#1:1289\n329#1:1291\n329#1:1294,4\n329#1:1299\n329#1:1301,8\n352#1:1309,4\n352#1:1313,7\n352#1:1321,3\n352#1:1325,2\n352#1:1327,2\n352#1:1329,6\n352#1:1335\n378#1:1336,4\n378#1:1340,7\n378#1:1348,3\n378#1:1352,2\n378#1:1354,2\n378#1:1356,6\n378#1:1362\n407#1:1363,4\n407#1:1367,7\n407#1:1375,3\n407#1:1379,2\n407#1:1381,2\n407#1:1383,6\n407#1:1389\n201#1:1096\n201#1:1100\n214#1:1123\n214#1:1127\n227#1:1150\n227#1:1154\n243#1:1166\n250#1:1167\n270#1:1175\n270#1:1179\n284#1:1200\n284#1:1204\n297#1:1227\n297#1:1231\n318#1:1254\n318#1:1258\n329#1:1271,3\n329#1:1275\n329#1:1278\n329#1:1282,3\n329#1:1286,3\n329#1:1290\n329#1:1292\n329#1:1293\n329#1:1298\n329#1:1300\n352#1:1320\n352#1:1324\n378#1:1347\n378#1:1351\n407#1:1374\n407#1:1378\n433#1:1390,3\n434#1:1393\n437#1:1394\n440#1:1395,3\n441#1:1398,3\n442#1:1401\n443#1:1402\n443#1:1403\n447#1:1404\n450#1:1405\n*E\n"})
public abstract class ScatterSet<E> {

    @JvmField
    public int _capacity;

    @JvmField
    public int _size;

    @JvmField
    @NotNull
    public Object[] elements;

    @JvmField
    @NotNull
    public long[] metadata;

    /* JADX INFO: compiled from: ScatterSet.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0010(\n\u0000\b\u0090\u0004\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0002\u0010\nJ\u0016\u0010\u000b\u001a\u00020\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\rH\u0016J\b\u0010\u000e\u001a\u00020\bH\u0016J\u000f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0010H\u0096\u0002R\u0014\u0010\u0003\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Landroidx/collection/ScatterSet$SetWrapper;", "", "(Landroidx/collection/ScatterSet;)V", "size", "", "getSize", "()I", SecureSharingCommandFactory.ACTION_CONTAINS_VALUE, "", "element", "(Ljava/lang/Object;)Z", "containsAll", "elements", "", "isEmpty", "iterator", "", "collection"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nScatterSet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScatterSet.kt\nandroidx/collection/ScatterSet$SetWrapper\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1084:1\n1855#2,2:1085\n*S KotlinDebug\n*F\n+ 1 ScatterSet.kt\nandroidx/collection/ScatterSet$SetWrapper\n*L\n478#1:1085,2\n*E\n"})
    public class SetWrapper implements Set<E>, KMappedMarker {

        /* JADX INFO: compiled from: ScatterSet.kt */
        @DebugMetadata(c = "androidx.collection.ScatterSet$SetWrapper$iterator$1", f = "ScatterSet.kt", i = {0, 0, 0, 0, 0, 0, 0, 0}, l = {495}, m = "invokeSuspend", n = {"$this$iterator", "k$iv", "m$iv$iv", "lastIndex$iv$iv", "i$iv$iv", "slot$iv$iv", "bitCount$iv$iv", "j$iv$iv"}, s = {"L$0", "L$1", "L$2", "I$0", "I$1", "J$0", "I$2", "I$3"})
        @SourceDebugExtension({"SMAP\nScatterSet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScatterSet.kt\nandroidx/collection/ScatterSet$SetWrapper$iterator$1\n+ 2 ScatterSet.kt\nandroidx/collection/ScatterSet\n+ 3 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n*L\n1#1,1084:1\n267#2,4:1085\n237#2,7:1089\n248#2,3:1097\n251#2,2:1101\n272#2,2:1103\n254#2,6:1105\n274#2:1111\n1810#3:1096\n1672#3:1100\n*S KotlinDebug\n*F\n+ 1 ScatterSet.kt\nandroidx/collection/ScatterSet$SetWrapper$iterator$1\n*L\n494#1:1085,4\n494#1:1089,7\n494#1:1097,3\n494#1:1101,2\n494#1:1103,2\n494#1:1105,6\n494#1:1111\n494#1:1096\n494#1:1100\n*E\n"})
        public static final class a extends RestrictedSuspendLambda implements Function2<SequenceScope<? super E>, Continuation<? super Unit>, Object> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public Object[] f2517p0;

            /* JADX INFO: renamed from: q0, reason: collision with root package name */
            public long[] f2518q0;

            /* JADX INFO: renamed from: r0, reason: collision with root package name */
            public int f2519r0;

            /* JADX INFO: renamed from: s0, reason: collision with root package name */
            public int f2520s0;

            /* JADX INFO: renamed from: t0, reason: collision with root package name */
            public int f2521t0;

            /* JADX INFO: renamed from: u0, reason: collision with root package name */
            public int f2522u0;
            public long v0;

            /* JADX INFO: renamed from: w0, reason: collision with root package name */
            public int f2523w0;

            /* JADX INFO: renamed from: x0, reason: collision with root package name */
            public /* synthetic */ Object f2524x0;

            /* JADX INFO: renamed from: y0, reason: collision with root package name */
            public final /* synthetic */ ScatterSet<E> f2525y0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(ScatterSet<E> scatterSet, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f2525y0 = scatterSet;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                a aVar = new a(this.f2525y0, continuation);
                aVar.f2524x0 = obj;
                return aVar;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Continuation<? super Unit> continuation) {
                return ((a) create((SequenceScope) obj, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Code duplicated, block: B:13:0x0056  */
            /* JADX WARN: Code duplicated, block: B:23:0x009e A[DONT_INVERT] */
            /* JADX WARN: Code duplicated, block: B:24:0x00a0  */
            /* JADX WARN: Code duplicated, block: B:26:0x00a7  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0054 -> B:25:0x00a5). Please report as a decompilation issue!!! */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0056 -> B:14:0x0068). Please report as a decompilation issue!!! */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0071 -> B:22:0x009b). Please report as a decompilation issue!!! */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0091 -> B:21:0x0096). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @org.jetbrains.annotations.Nullable
            public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r22) {
                /*
                    r21 = this;
                    r0 = r21
                    java.lang.Object r1 = ek.a.getCOROUTINE_SUSPENDED()
                    int r2 = r0.f2523w0
                    r3 = 1
                    r4 = 0
                    r5 = 8
                    if (r2 == 0) goto L32
                    if (r2 != r3) goto L2a
                    int r2 = r0.f2522u0
                    int r6 = r0.f2521t0
                    long r7 = r0.v0
                    int r9 = r0.f2520s0
                    int r10 = r0.f2519r0
                    long[] r11 = r0.f2518q0
                    java.lang.Object[] r12 = r0.f2517p0
                    java.lang.Object r13 = r0.f2524x0
                    kotlin.sequences.SequenceScope r13 = (kotlin.sequences.SequenceScope) r13
                    kotlin.ResultKt.throwOnFailure(r22)
                    r14 = r13
                    r13 = r12
                    r12 = r0
                    goto L96
                L2a:
                    java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                    java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                    r1.<init>(r2)
                    throw r1
                L32:
                    kotlin.ResultKt.throwOnFailure(r22)
                    java.lang.Object r2 = r0.f2524x0
                    kotlin.sequences.SequenceScope r2 = (kotlin.sequences.SequenceScope) r2
                    androidx.collection.ScatterSet<E> r6 = r0.f2525y0
                    java.lang.Object[] r7 = r6.elements
                    long[] r6 = r6.metadata
                    int r8 = r6.length
                    int r8 = r8 + (-2)
                    if (r8 < 0) goto Laa
                    r10 = r0
                    r9 = r4
                L46:
                    r11 = r6[r9]
                    long r13 = ~r11
                    r15 = 7
                    long r13 = r13 << r15
                    long r13 = r13 & r11
                    r15 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
                    long r13 = r13 & r15
                    int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
                    if (r13 == 0) goto La5
                    int r13 = r9 - r8
                    int r13 = ~r13
                    int r13 = r13 >>> 31
                    int r13 = 8 - r13
                    r14 = r2
                    r2 = r4
                    r19 = r11
                    r12 = r6
                    r11 = r10
                    r6 = r13
                    r13 = r7
                    r10 = r8
                    r7 = r19
                L68:
                    if (r2 >= r6) goto L9e
                    r15 = 255(0xff, double:1.26E-321)
                    long r15 = r15 & r7
                    r17 = 128(0x80, double:6.3E-322)
                    int r15 = (r15 > r17 ? 1 : (r15 == r17 ? 0 : -1))
                    if (r15 >= 0) goto L9b
                    int r15 = r9 << 3
                    int r15 = r15 + r2
                    r15 = r13[r15]
                    r11.f2524x0 = r14
                    r11.f2517p0 = r13
                    r11.f2518q0 = r12
                    r11.f2519r0 = r10
                    r11.f2520s0 = r9
                    r11.v0 = r7
                    r11.f2521t0 = r6
                    r11.f2522u0 = r2
                    r11.f2523w0 = r3
                    java.lang.Object r15 = r14.yield(r15, r11)
                    if (r15 != r1) goto L91
                    return r1
                L91:
                    r19 = r12
                    r12 = r11
                    r11 = r19
                L96:
                    r19 = r12
                    r12 = r11
                    r11 = r19
                L9b:
                    long r7 = r7 >> r5
                    int r2 = r2 + r3
                    goto L68
                L9e:
                    if (r6 != r5) goto Laa
                    r8 = r10
                    r10 = r11
                    r6 = r12
                    r7 = r13
                    r2 = r14
                La5:
                    if (r9 == r8) goto Laa
                    int r9 = r9 + 1
                    goto L46
                Laa:
                    kotlin.Unit r1 = kotlin.Unit.INSTANCE
                    return r1
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.collection.ScatterSet.SetWrapper.a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        public SetWrapper() {
        }

        @Override // java.util.Set, java.util.Collection
        public boolean add(E e5) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.Set, java.util.Collection
        public boolean addAll(Collection<? extends E> collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.Set, java.util.Collection
        public void clear() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.Set, java.util.Collection
        public boolean contains(Object element) {
            return ScatterSet.this.contains(element);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean containsAll(@NotNull Collection<? extends Object> elements) {
            Intrinsics.checkNotNullParameter(elements, "elements");
            Iterator<T> it = elements.iterator();
            while (it.hasNext()) {
                if (!ScatterSet.this.contains((E) it.next())) {
                    return false;
                }
            }
            return true;
        }

        public int getSize() {
            return ScatterSet.this._size;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean isEmpty() {
            return ScatterSet.this.isEmpty();
        }

        @Override // java.util.Set, java.util.Collection, java.lang.Iterable
        @NotNull
        public Iterator<E> iterator() {
            return SequencesKt__SequenceBuilderKt.iterator(new a(ScatterSet.this, null));
        }

        @Override // java.util.Set, java.util.Collection
        public boolean remove(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.Set, java.util.Collection
        public boolean removeAll(Collection<? extends Object> collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.Set, java.util.Collection
        public boolean retainAll(Collection<? extends Object> collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.Set, java.util.Collection
        public final /* bridge */ int size() {
            return getSize();
        }

        @Override // java.util.Set, java.util.Collection
        public Object[] toArray() {
            return CollectionToArray.toArray(this);
        }

        @Override // java.util.Set, java.util.Collection
        public <T> T[] toArray(T[] array) {
            Intrinsics.checkNotNullParameter(array, "array");
            return (T[]) CollectionToArray.toArray(this, array);
        }
    }

    /* JADX INFO: compiled from: ScatterSet.kt */
    public static final class a extends Lambda implements Function1<E, CharSequence> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ ScatterSet<E> f2526p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ScatterSet<E> scatterSet) {
            super(1);
            this.f2526p0 = scatterSet;
        }

        @Override // kotlin.jvm.functions.Function1
        public final CharSequence invoke(Object obj) {
            return obj == this.f2526p0 ? "(this)" : String.valueOf(obj);
        }
    }

    public /* synthetic */ ScatterSet(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ String joinToString$default(ScatterSet scatterSet, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, Function1 function1, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: joinToString");
        }
        if ((i11 & 1) != 0) {
            charSequence = ", ";
        }
        CharSequence charSequence5 = (i11 & 2) != 0 ? "" : charSequence2;
        CharSequence charSequence6 = (i11 & 4) == 0 ? charSequence3 : "";
        if ((i11 & 8) != 0) {
            i10 = -1;
        }
        int i12 = i10;
        if ((i11 & 16) != 0) {
            charSequence4 = "...";
        }
        CharSequence charSequence7 = charSequence4;
        if ((i11 & 32) != 0) {
            function1 = null;
        }
        return scatterSet.joinToString(charSequence, charSequence5, charSequence6, i12, charSequence7, function1);
    }

    public final boolean all(@NotNull Function1<? super E, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        Object[] objArr = this.elements;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i10 = 0;
        while (true) {
            long j10 = jArr[i10];
            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i11 = 8 - ((~(i10 - length)) >>> 31);
                for (int i12 = 0; i12 < i11; i12++) {
                    if ((255 & j10) < 128 && !predicate.invoke(objArr[(i10 << 3) + i12]).booleanValue()) {
                        return false;
                    }
                    j10 >>= 8;
                }
                if (i11 != 8) {
                    return true;
                }
            }
            if (i10 == length) {
                return true;
            }
            i10++;
        }
    }

    public final boolean any() {
        return this._size != 0;
    }

    @NotNull
    public final Set<E> asSet() {
        return new SetWrapper();
    }

    public final boolean contains(E element) {
        int iHashCode = (element != null ? element.hashCode() : 0) * ScatterMapKt.MurmurHashC1;
        int i10 = iHashCode ^ (iHashCode << 16);
        int i11 = i10 & 127;
        int i12 = this._capacity;
        int i13 = (i10 >>> 7) & i12;
        int i14 = 0;
        while (true) {
            long[] jArr = this.metadata;
            int i15 = i13 >> 3;
            int i16 = (i13 & 7) << 3;
            long j10 = ((jArr[i15 + 1] << (64 - i16)) & ((-i16) >> 63)) | (jArr[i15] >>> i16);
            long j11 = (((long) i11) * ScatterMapKt.BitmaskLsb) ^ j10;
            for (long j12 = (~j11) & (j11 - ScatterMapKt.BitmaskLsb) & (-9187201950435737472L); j12 != 0; j12 &= j12 - 1) {
                int iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j12) >> 3) + i13) & i12;
                if (Intrinsics.areEqual(this.elements[iNumberOfTrailingZeros], element)) {
                    return iNumberOfTrailingZeros >= 0;
                }
            }
            if ((j10 & ((~j10) << 6) & (-9187201950435737472L)) != 0) {
                return false;
            }
            i14 += 8;
            i13 = (i13 + i14) & i12;
        }
    }

    @IntRange(from = 0)
    public final int count() {
        return get_size();
    }

    /* JADX WARN: Code duplicated, block: B:25:0x005c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:26:0x005e A[LOOP:0: B:14:0x0025->B:26:0x005e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:30:0x0061 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    public boolean equals(@Nullable Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof ScatterSet)) {
            return false;
        }
        ScatterSet scatterSet = (ScatterSet) other;
        if (scatterSet.get_size() != get_size()) {
            return false;
        }
        Object[] objArr = this.elements;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i10 = 0;
            while (true) {
                long j10 = jArr[i10];
                if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i11 = 8 - ((~(i10 - length)) >>> 31);
                    for (int i12 = 0; i12 < i11; i12++) {
                        if ((255 & j10) < 128 && !scatterSet.contains(objArr[(i10 << 3) + i12])) {
                            return false;
                        }
                        j10 >>= 8;
                    }
                    if (i11 == 8) {
                        if (i10 != length) {
                            i10++;
                        }
                    }
                } else if (i10 != length) {
                    i10++;
                }
            }
        }
        return true;
    }

    public final int findElementIndex$collection(E element) {
        int i10 = 0;
        int iHashCode = (element != null ? element.hashCode() : 0) * ScatterMapKt.MurmurHashC1;
        int i11 = iHashCode ^ (iHashCode << 16);
        int i12 = i11 & 127;
        int i13 = this._capacity;
        int i14 = i11 >>> 7;
        while (true) {
            int i15 = i14 & i13;
            long[] jArr = this.metadata;
            int i16 = i15 >> 3;
            int i17 = (i15 & 7) << 3;
            long j10 = ((jArr[i16 + 1] << (64 - i17)) & ((-i17) >> 63)) | (jArr[i16] >>> i17);
            long j11 = (((long) i12) * ScatterMapKt.BitmaskLsb) ^ j10;
            for (long j12 = (~j11) & (j11 - ScatterMapKt.BitmaskLsb) & (-9187201950435737472L); j12 != 0; j12 &= j12 - 1) {
                int iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j12) >> 3) + i15) & i13;
                if (Intrinsics.areEqual(this.elements[iNumberOfTrailingZeros], element)) {
                    return iNumberOfTrailingZeros;
                }
            }
            if ((j10 & ((~j10) << 6) & (-9187201950435737472L)) != 0) {
                return -1;
            }
            i10 += 8;
            i14 = i15 + i10;
        }
    }

    /* JADX WARN: Code duplicated, block: B:15:0x003c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:16:0x003e A[LOOP:0: B:5:0x000b->B:16:0x003e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:21:0x0041 A[SYNTHETIC] */
    public final E first() {
        Object[] objArr = this.elements;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i10 = 0;
            while (true) {
                long j10 = jArr[i10];
                if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i11 = 8 - ((~(i10 - length)) >>> 31);
                    for (int i12 = 0; i12 < i11; i12++) {
                        if ((255 & j10) < 128) {
                            return (E) objArr[(i10 << 3) + i12];
                        }
                        j10 >>= 8;
                    }
                    if (i11 == 8) {
                        if (i10 != length) {
                            i10++;
                        }
                    }
                } else if (i10 != length) {
                    i10++;
                }
            }
        }
        throw new NoSuchElementException("The ScatterSet is empty");
    }

    /* JADX WARN: Type inference failed for: r10v5, types: [E, java.lang.Object] */
    @Nullable
    public final E firstOrNull(@NotNull Function1<? super E, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        Object[] objArr = this.elements;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return null;
        }
        int i10 = 0;
        while (true) {
            long j10 = jArr[i10];
            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i11 = 8 - ((~(i10 - length)) >>> 31);
                for (int i12 = 0; i12 < i11; i12++) {
                    if ((255 & j10) < 128) {
                        ?? r10 = (Object) objArr[(i10 << 3) + i12];
                        if (predicate.invoke(r10).booleanValue()) {
                            return r10;
                        }
                    }
                    j10 >>= 8;
                }
                if (i11 != 8) {
                    return null;
                }
            }
            if (i10 == length) {
                return null;
            }
            i10++;
        }
    }

    public final void forEach(@NotNull Function1<? super E, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        Object[] objArr = this.elements;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i10 = 0;
        while (true) {
            long j10 = jArr[i10];
            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i11 = 8 - ((~(i10 - length)) >>> 31);
                for (int i12 = 0; i12 < i11; i12++) {
                    if ((255 & j10) < 128) {
                        block.invoke(objArr[(i10 << 3) + i12]);
                    }
                    j10 >>= 8;
                }
                if (i11 != 8) {
                    return;
                }
            }
            if (i10 == length) {
                return;
            } else {
                i10++;
            }
        }
    }

    @PublishedApi
    public final void forEachIndex(@NotNull Function1<? super Integer, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i10 = 0;
        while (true) {
            long j10 = jArr[i10];
            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i11 = 8 - ((~(i10 - length)) >>> 31);
                for (int i12 = 0; i12 < i11; i12++) {
                    if ((255 & j10) < 128) {
                        c.a(i10 << 3, i12, block);
                    }
                    j10 >>= 8;
                }
                if (i11 != 8) {
                    return;
                }
            }
            if (i10 == length) {
                return;
            } else {
                i10++;
            }
        }
    }

    @IntRange(from = 0)
    /* JADX INFO: renamed from: getCapacity, reason: from getter */
    public final int get_capacity() {
        return this._capacity;
    }

    @IntRange(from = 0)
    /* JADX INFO: renamed from: getSize, reason: from getter */
    public final int get_size() {
        return this._size;
    }

    public int hashCode() {
        Object[] objArr = this.elements;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        int i10 = 0;
        if (length >= 0) {
            int i11 = 0;
            int iHashCode = 0;
            while (true) {
                long j10 = jArr[i11];
                if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i12 = 8 - ((~(i11 - length)) >>> 31);
                    for (int i13 = 0; i13 < i12; i13++) {
                        if ((255 & j10) < 128) {
                            Object obj = objArr[(i11 << 3) + i13];
                            iHashCode += obj != null ? obj.hashCode() : 0;
                        }
                        j10 >>= 8;
                    }
                    if (i12 != 8) {
                        return iHashCode;
                    }
                }
                if (i11 != length) {
                    i11++;
                } else {
                    i10 = iHashCode;
                }
            }
        }
        return i10;
    }

    public final boolean isEmpty() {
        return this._size == 0;
    }

    public final boolean isNotEmpty() {
        return this._size != 0;
    }

    @JvmOverloads
    @NotNull
    public final String joinToString() {
        return joinToString$default(this, null, null, null, 0, null, null, 63, null);
    }

    public final boolean none() {
        return this._size == 0;
    }

    @NotNull
    public String toString() {
        return joinToString$default(this, null, Constant.BRACKET_OPEN, Constant.BRACKET_CLOSE, 0, null, new a(this), 25, null);
    }

    public ScatterSet() {
        this.metadata = ScatterMapKt.EmptyGroup;
        this.elements = ContainerHelpersKt.EMPTY_OBJECTS;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x004e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:18:0x0050 A[LOOP:0: B:5:0x0010->B:18:0x0050, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:21:0x0053 A[SYNTHETIC] */
    public final boolean any(@NotNull Function1<? super E, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        Object[] objArr = this.elements;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i10 = 0;
            while (true) {
                long j10 = jArr[i10];
                if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i11 = 8 - ((~(i10 - length)) >>> 31);
                    for (int i12 = 0; i12 < i11; i12++) {
                        if ((255 & j10) < 128 && predicate.invoke(objArr[(i10 << 3) + i12]).booleanValue()) {
                            return true;
                        }
                        j10 >>= 8;
                    }
                    if (i11 == 8) {
                        if (i10 != length) {
                            i10++;
                        }
                    }
                } else if (i10 != length) {
                    i10++;
                }
            }
        }
        return false;
    }

    @IntRange(from = 0)
    public final int count(@NotNull Function1<? super E, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        Object[] objArr = this.elements;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        int i10 = 0;
        if (length >= 0) {
            int i11 = 0;
            int i12 = 0;
            while (true) {
                long j10 = jArr[i11];
                if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i13 = 8 - ((~(i11 - length)) >>> 31);
                    for (int i14 = 0; i14 < i13; i14++) {
                        if ((255 & j10) < 128 && predicate.invoke(objArr[(i11 << 3) + i14]).booleanValue()) {
                            i12++;
                        }
                        j10 >>= 8;
                    }
                    if (i13 != 8) {
                        return i12;
                    }
                }
                if (i11 != length) {
                    i11++;
                } else {
                    i10 = i12;
                }
            }
        }
        return i10;
    }

    @JvmOverloads
    @NotNull
    public final String joinToString(@NotNull CharSequence separator) {
        Intrinsics.checkNotNullParameter(separator, "separator");
        return joinToString$default(this, separator, null, null, 0, null, null, 62, null);
    }

    @JvmOverloads
    @NotNull
    public final String joinToString(@NotNull CharSequence separator, @NotNull CharSequence prefix) {
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        return joinToString$default(this, separator, prefix, null, 0, null, null, 60, null);
    }

    @JvmOverloads
    @NotNull
    public final String joinToString(@NotNull CharSequence separator, @NotNull CharSequence prefix, @NotNull CharSequence postfix) {
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        return joinToString$default(this, separator, prefix, postfix, 0, null, null, 56, null);
    }

    @JvmOverloads
    @NotNull
    public final String joinToString(@NotNull CharSequence separator, @NotNull CharSequence prefix, @NotNull CharSequence postfix, int i10) {
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        return joinToString$default(this, separator, prefix, postfix, i10, null, null, 48, null);
    }

    @JvmOverloads
    @NotNull
    public final String joinToString(@NotNull CharSequence separator, @NotNull CharSequence prefix, @NotNull CharSequence postfix, int i10, @NotNull CharSequence truncated) {
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        Intrinsics.checkNotNullParameter(truncated, "truncated");
        return joinToString$default(this, separator, prefix, postfix, i10, truncated, null, 32, null);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x004d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:17:0x004f A[LOOP:0: B:5:0x0010->B:17:0x004f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:20:0x0052 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r10v5, types: [E, java.lang.Object] */
    public final E first(@NotNull Function1<? super E, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        Object[] objArr = this.elements;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i10 = 0;
            while (true) {
                long j10 = jArr[i10];
                if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i11 = 8 - ((~(i10 - length)) >>> 31);
                    for (int i12 = 0; i12 < i11; i12++) {
                        if ((255 & j10) < 128) {
                            ?? r10 = (Object) objArr[(i10 << 3) + i12];
                            if (predicate.invoke(r10).booleanValue()) {
                                return r10;
                            }
                        }
                        j10 >>= 8;
                    }
                    if (i11 == 8) {
                        if (i10 != length) {
                            i10++;
                        }
                    }
                } else if (i10 != length) {
                    i10++;
                }
            }
        }
        throw new NoSuchElementException("Could not find a match");
    }

    @JvmOverloads
    @NotNull
    public final String joinToString(@NotNull CharSequence separator, @NotNull CharSequence prefix, @NotNull CharSequence postfix, int limit, @NotNull CharSequence truncated, @Nullable Function1<? super E, ? extends CharSequence> transform) {
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        StringBuilder sbD = androidx.camera.core.impl.utils.b.d(postfix, "postfix", truncated, "truncated", prefix);
        Object[] objArr = this.elements;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            sbD.append(postfix);
            break;
        }
        int i10 = 0;
        int i11 = 0;
        loop0: while (true) {
            long j10 = jArr[i10];
            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i12 = 8;
                int i13 = 8 - ((~(i10 - length)) >>> 31);
                for (int i14 = 0; i14 < i13; i14++) {
                    if ((j10 & 255) < 128) {
                        Object obj = objArr[(i10 << 3) + i14];
                        if (i11 == limit) {
                            sbD.append(truncated);
                            break loop0;
                        }
                        if (i11 != 0) {
                            sbD.append(separator);
                        }
                        if (transform == null) {
                            sbD.append(obj);
                        } else {
                            sbD.append(transform.invoke(obj));
                        }
                        i11++;
                        i12 = 8;
                    }
                    j10 >>= i12;
                }
                if (i13 == i12) {
                }
                sbD.append(postfix);
                break;
            }
            if (i10 == length) {
                sbD.append(postfix);
                break;
            }
            i10++;
        }
        String string = sbD.toString();
        Intrinsics.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    @PublishedApi
    public static /* synthetic */ void getElements$annotations() {
    }

    @PublishedApi
    public static /* synthetic */ void getMetadata$annotations() {
    }
}
