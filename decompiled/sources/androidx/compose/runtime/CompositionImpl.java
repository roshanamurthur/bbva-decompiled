package androidx.compose.runtime;

import androidx.collection.MutableIntList;
import androidx.collection.MutableScatterMap;
import androidx.collection.MutableScatterSet;
import androidx.collection.ObjectIntMap;
import androidx.collection.ScatterSet;
import androidx.collection.ScatterSetKt;
import androidx.compose.runtime.changelist.ChangeList;
import androidx.compose.runtime.collection.ScatterSetWrapper;
import androidx.compose.runtime.collection.ScopeMap;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.snapshots.ReaderKind;
import androidx.compose.runtime.snapshots.StateObject;
import androidx.compose.runtime.snapshots.StateObjectImpl;
import androidx.compose.runtime.tooling.CompositionObserver;
import androidx.compose.runtime.tooling.CompositionObserverHandle;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.exifinterface.media.ExifInterface;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.TestOnly;

/* JADX INFO: compiled from: Composition.kt */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000¬\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\"\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0002\u0081\u0001B(\u0012\u0006\u0010|\u001a\u00020{\u0012\n\u0010~\u001a\u0006\u0012\u0002\b\u00030}\u0012\n\b\u0002\u0010t\u001a\u0004\u0018\u00010q¢\u0006\u0005\b\u007f\u0010\u0080\u0001J\"\u0010\t\u001a\u00020\u00062\u0011\u0010\b\u001a\r\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\b\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ\"\u0010\u000b\u001a\u00020\u00062\u0011\u0010\b\u001a\r\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\b\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\nJ\u0017\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u000e\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0012J\"\u0010\u0015\u001a\u00020\u00062\u0011\u0010\b\u001a\r\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\b\u0007H\u0016¢\u0006\u0004\b\u0015\u0010\nJ\b\u0010\u0016\u001a\u00020\u0006H\u0016J\u0016\u0010\u001a\u001a\u00020\u00062\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017H\u0016J\u0016\u0010\u001c\u001a\u00020\u001b2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017H\u0016J\u0016\u0010\u001e\u001a\u00020\u00062\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0016J\u0010\u0010 \u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020\u0018H\u0016J\u0010\u0010!\u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020\u0018H\u0016J\b\u0010\"\u001a\u00020\u001bH\u0016J$\u0010'\u001a\u00020\u00062\u001a\u0010&\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020%\u0012\u0006\u0012\u0004\u0018\u00010%0$0#H\u0016J\u0010\u0010*\u001a\u00020\u00062\u0006\u0010)\u001a\u00020(H\u0016J\b\u0010+\u001a\u00020\u0006H\u0016J\b\u0010,\u001a\u00020\u0006H\u0016J\b\u0010-\u001a\u00020\u0006H\u0016J\b\u0010.\u001a\u00020\u0006H\u0016J\b\u0010/\u001a\u00020\u0006H\u0016J\b\u00100\u001a\u00020\u0006H\u0016J5\u00104\u001a\u00028\u0000\"\u0004\b\u0000\u001012\b\u00102\u001a\u0004\u0018\u00010\u00012\u0006\u00103\u001a\u00020\u00122\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0016¢\u0006\u0004\b4\u00105J\u001a\u0010:\u001a\u0002092\u0006\u00107\u001a\u0002062\b\u00108\u001a\u0004\u0018\u00010\u0018H\u0016J\u0010\u0010;\u001a\u00020\u00062\u0006\u00107\u001a\u000206H\u0016J%\u0010>\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010<2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000=H\u0016¢\u0006\u0004\b>\u0010?J\u001f\u0010B\u001a\u00020\u00062\u0006\u00108\u001a\u00020\u00182\u0006\u00107\u001a\u000206H\u0000¢\u0006\u0004\b@\u0010AJ\u001b\u0010F\u001a\u00020\u00062\n\u0010)\u001a\u0006\u0012\u0002\b\u00030CH\u0000¢\u0006\u0004\bD\u0010EJ\b\u0010G\u001a\u00020\u0006H\u0016J\u000f\u0010J\u001a\u00020\u0012H\u0000¢\u0006\u0004\bH\u0010IR \u0010R\u001a\u00020K8\u0000X\u0080\u0004¢\u0006\u0012\n\u0004\bL\u0010M\u0012\u0004\bP\u0010Q\u001a\u0004\bN\u0010OR(\u0010Z\u001a\u00020\u001b8\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0004\bS\u0010T\u0012\u0004\bY\u0010Q\u001a\u0004\bU\u0010V\"\u0004\bW\u0010XR\u001a\u0010`\u001a\u00020[8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\\\u0010]\u001a\u0004\b^\u0010_R\u0017\u0010b\u001a\u00020\u001b8\u0006¢\u0006\f\n\u0004\ba\u0010T\u001a\u0004\bb\u0010VR-\u0010h\u001a\r\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\b\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bc\u0010d\u001a\u0004\be\u0010f\"\u0004\bg\u0010\nR\u001a\u0010k\u001a\b\u0012\u0004\u0012\u00020\u00180\u00178AX\u0080\u0004¢\u0006\u0006\u001a\u0004\bi\u0010jR\u001a\u0010m\u001a\b\u0012\u0004\u0012\u00020\u00180\u00178AX\u0080\u0004¢\u0006\u0006\u001a\u0004\bl\u0010jR\u001a\u0010p\u001a\b\u0012\u0004\u0012\u0002060#8AX\u0080\u0004¢\u0006\u0006\u001a\u0004\bn\u0010oR\u0011\u0010t\u001a\u00020q8F¢\u0006\u0006\u001a\u0004\br\u0010sR\u0014\u0010u\u001a\u00020\u001b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bu\u0010VR\u0014\u0010v\u001a\u00020\u001b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bv\u0010VR\u0014\u0010x\u001a\u00020\u001b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bw\u0010VR\u0014\u0010z\u001a\u00020\u001b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\by\u0010V¨\u0006\u0082\u0001"}, d2 = {"Landroidx/compose/runtime/CompositionImpl;", "Landroidx/compose/runtime/ControlledComposition;", "Landroidx/compose/runtime/ReusableComposition;", "Landroidx/compose/runtime/RecomposeScopeOwner;", "Landroidx/compose/runtime/CompositionServices;", "Lkotlin/Function0;", "", "Landroidx/compose/runtime/Composable;", "content", "setContent", "(Lkotlin/jvm/functions/Function2;)V", "setContentWithReuse", "Landroidx/compose/runtime/tooling/CompositionObserver;", "observer", "Landroidx/compose/runtime/tooling/CompositionObserverHandle;", "observe$runtime_release", "(Landroidx/compose/runtime/tooling/CompositionObserver;)Landroidx/compose/runtime/tooling/CompositionObserverHandle;", "observe", "", "key", "invalidateGroupsWithKey", "composeContent", "dispose", "", "", "values", "recordModificationsOf", "", "observesAnyOf", "block", "prepareCompose", "value", "recordReadOf", "recordWriteOf", "recompose", "", "Lkotlin/Pair;", "Landroidx/compose/runtime/MovableContentStateReference;", "references", "insertMovableContent", "Landroidx/compose/runtime/MovableContentState;", "state", "disposeUnusedMovableContent", "applyChanges", "applyLateChanges", "changesApplied", "abandonChanges", "invalidateAll", "verifyConsistent", "R", TypedValues.TransitionType.S_TO, "groupIndex", "delegateInvalidations", "(Landroidx/compose/runtime/ControlledComposition;ILkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "Landroidx/compose/runtime/RecomposeScopeImpl;", "scope", "instance", "Landroidx/compose/runtime/InvalidationResult;", "invalidate", "recomposeScopeReleased", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/compose/runtime/CompositionServiceKey;", "getCompositionService", "(Landroidx/compose/runtime/CompositionServiceKey;)Ljava/lang/Object;", "removeObservation$runtime_release", "(Ljava/lang/Object;Landroidx/compose/runtime/RecomposeScopeImpl;)V", "removeObservation", "Landroidx/compose/runtime/DerivedState;", "removeDerivedStateObservation$runtime_release", "(Landroidx/compose/runtime/DerivedState;)V", "removeDerivedStateObservation", "deactivate", "composerStacksSizes$runtime_release", "()I", "composerStacksSizes", "Landroidx/compose/runtime/SlotTable;", "u0", "Landroidx/compose/runtime/SlotTable;", "getSlotTable$runtime_release", "()Landroidx/compose/runtime/SlotTable;", "getSlotTable$runtime_release$annotations", "()V", "slotTable", "I0", "Z", "getPendingInvalidScopes$runtime_release", "()Z", "setPendingInvalidScopes$runtime_release", "(Z)V", "getPendingInvalidScopes$runtime_release$annotations", "pendingInvalidScopes", "Landroidx/compose/runtime/CompositionObserverHolder;", "L0", "Landroidx/compose/runtime/CompositionObserverHolder;", "getObserverHolder$runtime_release", "()Landroidx/compose/runtime/CompositionObserverHolder;", "observerHolder", "O0", "isRoot", "Q0", "Lkotlin/jvm/functions/Function2;", "getComposable", "()Lkotlin/jvm/functions/Function2;", "setComposable", "composable", "getObservedObjects$runtime_release", "()Ljava/util/Set;", "observedObjects", "getDerivedStateDependencies$runtime_release", "derivedStateDependencies", "getConditionalScopes$runtime_release", "()Ljava/util/List;", "conditionalScopes", "Lkotlin/coroutines/CoroutineContext;", "getRecomposeContext", "()Lkotlin/coroutines/CoroutineContext;", "recomposeContext", "isComposing", "isDisposed", "getHasPendingChanges", "hasPendingChanges", "getHasInvalidations", "hasInvalidations", "Landroidx/compose/runtime/CompositionContext;", "parent", "Landroidx/compose/runtime/Applier;", "applier", "<init>", "(Landroidx/compose/runtime/CompositionContext;Landroidx/compose/runtime/Applier;Lkotlin/coroutines/CoroutineContext;)V", "a", "runtime_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nComposition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Composition.kt\nandroidx/compose/runtime/CompositionImpl\n+ 2 ActualJvm.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt\n+ 3 Preconditions.kt\nandroidx/compose/runtime/PreconditionsKt\n+ 4 ListUtils.kt\nandroidx/compose/runtime/snapshots/ListUtilsKt\n+ 5 SlotTable.kt\nandroidx/compose/runtime/SlotTable\n+ 6 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 7 ScatterSetWrapper.kt\nandroidx/compose/runtime/collection/ScatterSetWrapperKt\n+ 8 ScatterSet.kt\nandroidx/collection/ScatterSet\n+ 9 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n+ 10 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 11 ScopeMap.kt\nandroidx/compose/runtime/collection/ScopeMap\n+ 12 ScatterMap.kt\nandroidx/collection/MutableScatterMap\n+ 13 ScatterMap.kt\nandroidx/collection/ScatterMap\n+ 14 ScatterSet.kt\nandroidx/collection/MutableScatterSet\n+ 15 StateObjectImpl.kt\nandroidx/compose/runtime/snapshots/ReaderKind$Companion\n+ 16 ObjectIntMap.kt\nandroidx/collection/ObjectIntMap\n+ 17 Trace.kt\nandroidx/compose/runtime/TraceKt\n+ 18 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,1504:1\n1055#1,2:1525\n1225#1,3:1527\n1045#1,6:1531\n1228#1,7:1537\n1057#1,4:1544\n1055#1,2:2056\n1225#1,3:2058\n1045#1,6:2061\n1228#1,7:2067\n1057#1,4:2074\n1055#1,2:2087\n1225#1,10:2089\n1057#1,4:2099\n1055#1,2:2196\n1225#1,10:2198\n1057#1,4:2208\n1055#1,2:2213\n1225#1,10:2215\n1057#1,4:2225\n1055#1,2:2230\n1225#1,10:2232\n1057#1,4:2242\n1225#1,10:2246\n89#2:1505\n89#2:1513\n89#2:1514\n89#2:1530\n89#2:1548\n89#2:1565\n89#2:1566\n89#2:2018\n89#2:2055\n89#2:2195\n89#2:2212\n89#2:2229\n89#2:2256\n89#2:2259\n89#2:2260\n89#2:2261\n89#2:2332\n50#3,7:1506\n50#3,7:1549\n50#3,7:2324\n93#4,2:1515\n33#4,4:1517\n95#4,2:1521\n38#4:1523\n97#4:1524\n110#4,2:2078\n33#4,6:2080\n112#4:2086\n33#4,4:2320\n38#4:2331\n174#5,5:1556\n180#5,3:1562\n174#5,5:2103\n180#5,3:2109\n174#5,5:2115\n180#5,3:2121\n174#5,5:2336\n180#5,3:2342\n1#6:1561\n1#6:2108\n1#6:2120\n1#6:2317\n1#6:2341\n48#7,3:1567\n53#7:1597\n55#7:1600\n48#7,3:1637\n53#7:1703\n55#7:1733\n267#8,4:1570\n237#8,7:1574\n248#8,3:1582\n251#8,2:1586\n272#8,2:1588\n254#8,6:1590\n274#8:1596\n267#8,4:1606\n237#8,7:1610\n248#8,3:1618\n251#8,2:1622\n272#8,2:1624\n254#8,6:1626\n274#8:1632\n267#8,4:1640\n237#8,7:1644\n248#8,3:1652\n251#8,2:1656\n272#8:1658\n267#8,4:1664\n237#8,7:1668\n248#8,3:1676\n251#8,2:1680\n272#8,2:1682\n254#8,6:1684\n274#8:1690\n273#8:1695\n254#8,6:1696\n274#8:1702\n267#8,4:1705\n237#8,7:1709\n248#8,3:1717\n251#8,2:1721\n272#8,2:1723\n254#8,6:1725\n274#8:1731\n237#8,7:1757\n248#8,3:1765\n251#8,2:1769\n254#8,6:1775\n237#8,7:1821\n248#8,3:1829\n251#8,2:1833\n254#8,6:1839\n237#8,16:1885\n254#8,6:1905\n237#8,7:1930\n248#8,3:1938\n251#8,2:1942\n254#8,6:1948\n267#8,4:1987\n237#8,7:1991\n248#8,3:1999\n251#8,2:2003\n272#8,2:2005\n254#8,6:2007\n274#8:2013\n267#8,4:2024\n237#8,7:2028\n248#8,3:2036\n251#8,2:2040\n272#8,2:2042\n254#8,6:2044\n274#8:2050\n237#8,16:2151\n254#8,6:2171\n267#8,4:2268\n237#8,7:2272\n248#8,3:2280\n251#8,2:2284\n272#8:2286\n273#8:2289\n254#8,6:2290\n274#8:2296\n1810#9:1581\n1672#9:1585\n1810#9:1617\n1672#9:1621\n1810#9:1651\n1672#9:1655\n1810#9:1675\n1672#9:1679\n1810#9:1716\n1672#9:1720\n1810#9:1742\n1672#9:1746\n1810#9:1764\n1672#9:1768\n1810#9:1806\n1672#9:1810\n1810#9:1828\n1672#9:1832\n1810#9:1870\n1672#9:1874\n1810#9:1937\n1672#9:1941\n1810#9:1965\n1672#9:1969\n1810#9:1998\n1672#9:2002\n1810#9:2035\n1672#9:2039\n1810#9:2136\n1672#9:2140\n1810#9:2279\n1672#9:2283\n1855#10,2:1598\n1855#10:1704\n1856#10:1732\n77#11,5:1601\n85#11,4:1633\n77#11,5:1659\n85#11,4:1691\n138#11:1734\n139#11,5:1750\n144#11,5:1782\n152#11:1797\n138#11:1798\n139#11,5:1814\n144#11,5:1846\n152#11:1861\n138#11:1862\n139#11,5:1878\n144#11,5:1912\n152#11:1927\n77#11,5:1982\n85#11,4:2014\n77#11,5:2019\n85#11,4:2051\n138#11:2128\n139#11,5:2144\n144#11,5:2178\n152#11:2193\n91#11:2262\n77#11,5:2263\n92#11,2:2287\n85#11,10:2297\n1047#12:1735\n1049#12:1749\n1050#12,3:1787\n1053#12:1796\n1047#12:1799\n1049#12:1813\n1050#12,3:1851\n1053#12:1860\n1047#12:1863\n1049#12:1877\n1050#12,3:1917\n1053#12:1926\n1047#12:2129\n1049#12:2143\n1050#12,3:2183\n1053#12:2192\n363#13,6:1736\n373#13,3:1743\n376#13,2:1747\n379#13,6:1790\n363#13,6:1800\n373#13,3:1807\n376#13,2:1811\n379#13,6:1854\n363#13,6:1864\n373#13,3:1871\n376#13,2:1875\n379#13,6:1920\n363#13,6:2130\n373#13,3:2137\n376#13,2:2141\n379#13,6:2186\n842#14,2:1755\n845#14,4:1771\n849#14:1781\n842#14,2:1819\n845#14,4:1835\n849#14:1845\n842#14,2:1883\n845#14,4:1901\n849#14:1911\n842#14,2:1928\n845#14,4:1944\n849#14:1954\n842#14,2:2149\n845#14,4:2167\n849#14:2177\n51#15:1955\n51#15:1973\n415#16,3:1956\n373#16,6:1959\n383#16,3:1966\n386#16,2:1970\n419#16:1972\n420#16:1974\n389#16,6:1975\n421#16:1981\n46#17,3:2112\n50#17:2124\n46#17,3:2125\n50#17:2194\n46#17,3:2333\n50#17:2345\n13579#18,2:2257\n11653#18,9:2307\n13579#18:2316\n13580#18:2318\n11662#18:2319\n*S KotlinDebug\n*F\n+ 1 Composition.kt\nandroidx/compose/runtime/CompositionImpl\n*L\n731#1:1525,2\n731#1:1527,3\n734#1:1531,6\n731#1:1537,7\n731#1:1544,4\n940#1:2056,2\n940#1:2058,3\n941#1:2061,6\n940#1:2067,7\n940#1:2074,4\n961#1:2087,2\n961#1:2089,10\n961#1:2099,4\n1012#1:2196,2\n1012#1:2198,10\n1012#1:2208,4\n1021#1:2213,2\n1021#1:2215,10\n1021#1:2225,4\n1031#1:2230,2\n1031#1:2232,10\n1031#1:2242,4\n1056#1:2246,10\n632#1:1505\n654#1:1513\n671#1:1514\n732#1:1530\n751#1:1548\n797#1:1565\n818#1:1566\n928#1:2018\n938#1:2055\n1011#1:2195\n1020#1:2212\n1030#1:2229\n1073#1:2256\n1079#1:2259\n1114#1:2260\n1141#1:2261\n1253#1:2332\n647#1:1506,7\n752#1:1549,7\n1215#1:2324,7\n678#1:1515,2\n678#1:1517,4\n678#1:1521,2\n678#1:1523\n678#1:1524\n960#1:2078,2\n960#1:2080,6\n960#1:2086\n1213#1:2320,4\n1213#1:2331\n782#1:1556,5\n782#1:1562,3\n969#1:2103,5\n969#1:2109,3\n983#1:2115,5\n983#1:2121,3\n1260#1:2336,5\n1260#1:2342,3\n782#1:1561\n969#1:2108\n983#1:2120\n1212#1:2317\n1260#1:2341\n828#1:1567,3\n828#1:1597\n828#1:1600\n855#1:1637,3\n855#1:1703\n855#1:1733\n828#1:1570,4\n828#1:1574,7\n828#1:1582,3\n828#1:1586,2\n828#1:1588,2\n828#1:1590,6\n828#1:1596\n840#1:1606,4\n840#1:1610,7\n840#1:1618,3\n840#1:1622,2\n840#1:1624,2\n840#1:1626,6\n840#1:1632\n855#1:1640,4\n855#1:1644,7\n855#1:1652,3\n855#1:1656,2\n855#1:1658\n860#1:1664,4\n860#1:1668,7\n860#1:1676,3\n860#1:1680,2\n860#1:1682,2\n860#1:1684,6\n860#1:1690\n855#1:1695\n855#1:1696,6\n855#1:1702\n860#1:1705,4\n860#1:1709,7\n860#1:1717,3\n860#1:1721,2\n860#1:1723,2\n860#1:1725,6\n860#1:1731\n869#1:1757,7\n869#1:1765,3\n869#1:1769,2\n869#1:1775,6\n875#1:1821,7\n875#1:1829,3\n875#1:1833,2\n875#1:1839,6\n882#1:1885,16\n882#1:1905,6\n884#1:1930,7\n884#1:1938,3\n884#1:1942,2\n884#1:1948,6\n920#1:1987,4\n920#1:1991,7\n920#1:1999,3\n920#1:2003,2\n920#1:2005,2\n920#1:2007,6\n920#1:2013\n933#1:2024,4\n933#1:2028,7\n933#1:2036,3\n933#1:2040,2\n933#1:2042,2\n933#1:2044,6\n933#1:2050\n998#1:2151,16\n998#1:2171,6\n1170#1:2268,4\n1170#1:2272,7\n1170#1:2280,3\n1170#1:2284,2\n1170#1:2286\n1170#1:2289\n1170#1:2290,6\n1170#1:2296\n828#1:1581\n828#1:1585\n840#1:1617\n840#1:1621\n855#1:1651\n855#1:1655\n860#1:1675\n860#1:1679\n860#1:1716\n860#1:1720\n869#1:1742\n869#1:1746\n869#1:1764\n869#1:1768\n875#1:1806\n875#1:1810\n875#1:1828\n875#1:1832\n882#1:1870\n882#1:1874\n884#1:1937\n884#1:1941\n905#1:1965\n905#1:1969\n920#1:1998\n920#1:2002\n933#1:2035\n933#1:2039\n998#1:2136\n998#1:2140\n1170#1:2279\n1170#1:2283\n828#1:1598,2\n855#1:1704\n855#1:1732\n840#1:1601,5\n840#1:1633,4\n860#1:1659,5\n860#1:1691,4\n869#1:1734\n869#1:1750,5\n869#1:1782,5\n869#1:1797\n875#1:1798\n875#1:1814,5\n875#1:1846,5\n875#1:1861\n882#1:1862\n882#1:1878,5\n882#1:1912,5\n882#1:1927\n920#1:1982,5\n920#1:2014,4\n933#1:2019,5\n933#1:2051,4\n998#1:2128\n998#1:2144,5\n998#1:2178,5\n998#1:2193\n1170#1:2262\n1170#1:2263,5\n1170#1:2287,2\n1170#1:2297,10\n869#1:1735\n869#1:1749\n869#1:1787,3\n869#1:1796\n875#1:1799\n875#1:1813\n875#1:1851,3\n875#1:1860\n882#1:1863\n882#1:1877\n882#1:1917,3\n882#1:1926\n998#1:2129\n998#1:2143\n998#1:2183,3\n998#1:2192\n869#1:1736,6\n869#1:1743,3\n869#1:1747,2\n869#1:1790,6\n875#1:1800,6\n875#1:1807,3\n875#1:1811,2\n875#1:1854,6\n882#1:1864,6\n882#1:1871,3\n882#1:1875,2\n882#1:1920,6\n998#1:2130,6\n998#1:2137,3\n998#1:2141,2\n998#1:2186,6\n869#1:1755,2\n869#1:1771,4\n869#1:1781\n875#1:1819,2\n875#1:1835,4\n875#1:1845\n882#1:1883,2\n882#1:1901,4\n882#1:1911\n884#1:1928,2\n884#1:1944,4\n884#1:1954\n998#1:2149,2\n998#1:2167,4\n998#1:2177\n896#1:1955\n907#1:1973\n905#1:1956,3\n905#1:1959,6\n905#1:1966,3\n905#1:1970,2\n905#1:1972\n905#1:1974\n905#1:1975,6\n905#1:1981\n979#1:2112,3\n979#1:2124\n996#1:2125,3\n996#1:2194\n1256#1:2333,3\n1256#1:2345\n1074#1:2257,2\n1212#1:2307,9\n1212#1:2316\n1212#1:2318\n1212#1:2319\n*E\n"})
public final class CompositionImpl implements ControlledComposition, ReusableComposition, RecomposeScopeOwner, CompositionServices {
    public static final int $stable = 8;

    @NotNull
    public final ChangeList E0;

    @NotNull
    public final ChangeList F0;

    @NotNull
    public final ScopeMap<Object, RecomposeScopeImpl> G0;

    @NotNull
    public ScopeMap<RecomposeScopeImpl, Object> H0;

    /* JADX INFO: renamed from: I0, reason: from kotlin metadata */
    public boolean pendingInvalidScopes;

    @Nullable
    public CompositionImpl J0;
    public int K0;

    /* JADX INFO: renamed from: L0, reason: from kotlin metadata */
    @NotNull
    public final CompositionObserverHolder observerHolder;

    @NotNull
    public final ComposerImpl M0;

    @Nullable
    public final CoroutineContext N0;

    /* JADX INFO: renamed from: O0, reason: from kotlin metadata */
    public final boolean isRoot;
    public boolean P0;

    /* JADX INFO: renamed from: Q0, reason: from kotlin metadata */
    @NotNull
    public Function2<? super Composer, ? super Integer, Unit> composable;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    public final CompositionContext f14502p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    @NotNull
    public final Applier<?> f14503q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    @NotNull
    public final AtomicReference<Object> f14504r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    @NotNull
    public final Object f14505s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    @NotNull
    public final Set<RememberObserver> f14506t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final SlotTable slotTable;

    @NotNull
    public final ScopeMap<Object, RecomposeScopeImpl> v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    @NotNull
    public final MutableScatterSet<RecomposeScopeImpl> f14508w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    @NotNull
    public final MutableScatterSet<RecomposeScopeImpl> f14509x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    @NotNull
    public final ScopeMap<Object, DerivedState<?>> f14510y0;

    /* JADX INFO: compiled from: Composition.kt */
    @SourceDebugExtension({"SMAP\nComposition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Composition.kt\nandroidx/compose/runtime/CompositionImpl$RememberEventDispatcher\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Trace.kt\nandroidx/compose/runtime/TraceKt\n+ 4 ListUtils.kt\nandroidx/compose/runtime/snapshots/ListUtilsKt\n*L\n1#1,1504:1\n1#2:1505\n46#3,5:1506\n46#3,3:1511\n50#3:1520\n46#3,3:1521\n50#3:1530\n46#3,5:1531\n33#4,6:1514\n33#4,6:1524\n*S KotlinDebug\n*F\n+ 1 Composition.kt\nandroidx/compose/runtime/CompositionImpl$RememberEventDispatcher\n*L\n1339#1:1506,5\n1361#1:1511,3\n1361#1:1520\n1372#1:1521,3\n1372#1:1530\n1383#1:1531,5\n1362#1:1514,6\n1373#1:1524,6\n*E\n"})
    public static final class a implements RememberManager {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final Set<RememberObserver> f14511a;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @Nullable
        public MutableScatterSet<ComposeNodeLifecycleCallback> f14515e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @NotNull
        public final MutableIntList f14517g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        @NotNull
        public final MutableIntList f14518h;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final ArrayList f14512b = new ArrayList();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final ArrayList f14513c = new ArrayList();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public final ArrayList f14514d = new ArrayList();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @NotNull
        public final ArrayList f14516f = new ArrayList();

        public a(@NotNull Set<RememberObserver> set) {
            this.f14511a = set;
            int i10 = 0;
            int i11 = 1;
            DefaultConstructorMarker defaultConstructorMarker = null;
            this.f14517g = new MutableIntList(i10, i11, defaultConstructorMarker);
            this.f14518h = new MutableIntList(i10, i11, defaultConstructorMarker);
        }

        public final void a() {
            Set<RememberObserver> set = this.f14511a;
            if (!set.isEmpty()) {
                Object objBeginSection = Trace.INSTANCE.beginSection("Compose:abandons");
                try {
                    Iterator<RememberObserver> it = set.iterator();
                    while (it.hasNext()) {
                        RememberObserver next = it.next();
                        it.remove();
                        next.onAbandoned();
                    }
                    Unit unit = Unit.INSTANCE;
                } finally {
                    Trace.INSTANCE.endSection(objBeginSection);
                }
            }
        }

        public final void b() {
            d(Integer.MIN_VALUE);
            ArrayList arrayList = this.f14513c;
            boolean z10 = !arrayList.isEmpty();
            Set<RememberObserver> set = this.f14511a;
            if (z10) {
                Object objBeginSection = Trace.INSTANCE.beginSection("Compose:onForgotten");
                try {
                    MutableScatterSet<ComposeNodeLifecycleCallback> mutableScatterSet = this.f14515e;
                    for (int size = arrayList.size() - 1; -1 < size; size--) {
                        Object obj = arrayList.get(size);
                        if (obj instanceof RememberObserver) {
                            set.remove(obj);
                            ((RememberObserver) obj).onForgotten();
                        }
                        if (obj instanceof ComposeNodeLifecycleCallback) {
                            if (mutableScatterSet == null || !mutableScatterSet.contains((ComposeNodeLifecycleCallback) obj)) {
                                ((ComposeNodeLifecycleCallback) obj).onDeactivate();
                            } else {
                                ((ComposeNodeLifecycleCallback) obj).onRelease();
                            }
                        }
                    }
                    Unit unit = Unit.INSTANCE;
                    Trace.INSTANCE.endSection(objBeginSection);
                } catch (Throwable th2) {
                    Trace.INSTANCE.endSection(objBeginSection);
                    throw th2;
                }
            }
            ArrayList arrayList2 = this.f14512b;
            if (!arrayList2.isEmpty()) {
                Object objBeginSection2 = Trace.INSTANCE.beginSection("Compose:onRemembered");
                try {
                    int size2 = arrayList2.size();
                    for (int i10 = 0; i10 < size2; i10++) {
                        RememberObserver rememberObserver = (RememberObserver) arrayList2.get(i10);
                        set.remove(rememberObserver);
                        rememberObserver.onRemembered();
                    }
                    Unit unit2 = Unit.INSTANCE;
                } finally {
                    Trace.INSTANCE.endSection(objBeginSection2);
                }
            }
        }

        public final void c() {
            ArrayList arrayList = this.f14514d;
            if (!arrayList.isEmpty()) {
                Object objBeginSection = Trace.INSTANCE.beginSection("Compose:sideeffects");
                try {
                    int size = arrayList.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        ((Function0) arrayList.get(i10)).invoke();
                    }
                    arrayList.clear();
                    Unit unit = Unit.INSTANCE;
                } finally {
                    Trace.INSTANCE.endSection(objBeginSection);
                }
            }
        }

        public final void d(int i10) {
            ArrayList arrayList = this.f14516f;
            int i11 = 1;
            if (!arrayList.isEmpty()) {
                DefaultConstructorMarker defaultConstructorMarker = null;
                int i12 = 0;
                List listMutableListOf = null;
                MutableIntList mutableIntList = null;
                MutableIntList mutableIntList2 = null;
                int i13 = 0;
                while (true) {
                    MutableIntList mutableIntList3 = this.f14518h;
                    if (i13 >= mutableIntList3.getSize()) {
                        break;
                    }
                    if (i10 <= mutableIntList3.get(i13)) {
                        Object objRemove = arrayList.remove(i13);
                        int iRemoveAt = mutableIntList3.removeAt(i13);
                        int iRemoveAt2 = this.f14517g.removeAt(i13);
                        if (listMutableListOf == null) {
                            listMutableListOf = CollectionsKt__CollectionsKt.mutableListOf(objRemove);
                            mutableIntList2 = new MutableIntList(i12, i11, defaultConstructorMarker);
                            mutableIntList2.add(iRemoveAt);
                            mutableIntList = new MutableIntList(i12, i11, defaultConstructorMarker);
                            mutableIntList.add(iRemoveAt2);
                        } else {
                            Intrinsics.checkNotNull(mutableIntList, "null cannot be cast to non-null type androidx.collection.MutableIntList");
                            Intrinsics.checkNotNull(mutableIntList2, "null cannot be cast to non-null type androidx.collection.MutableIntList");
                            listMutableListOf.add(objRemove);
                            mutableIntList2.add(iRemoveAt);
                            mutableIntList.add(iRemoveAt2);
                        }
                    } else {
                        i13++;
                    }
                }
                if (listMutableListOf != null) {
                    Intrinsics.checkNotNull(mutableIntList, "null cannot be cast to non-null type androidx.collection.MutableIntList");
                    Intrinsics.checkNotNull(mutableIntList2, "null cannot be cast to non-null type androidx.collection.MutableIntList");
                    int size = listMutableListOf.size() - 1;
                    while (i12 < size) {
                        int i14 = i12 + 1;
                        int size2 = listMutableListOf.size();
                        for (int i15 = i14; i15 < size2; i15++) {
                            int i16 = mutableIntList2.get(i12);
                            int i17 = mutableIntList2.get(i15);
                            if (i16 < i17 || (i17 == i16 && mutableIntList.get(i12) < mutableIntList.get(i15))) {
                                CompositionKt.access$swap(listMutableListOf, i12, i15);
                                CompositionKt.access$swap(mutableIntList, i12, i15);
                                CompositionKt.access$swap(mutableIntList2, i12, i15);
                            }
                        }
                        i12 = i14;
                    }
                    this.f14513c.addAll(listMutableListOf);
                }
            }
        }

        @Override // androidx.compose.runtime.RememberManager
        public final void deactivating(@NotNull ComposeNodeLifecycleCallback composeNodeLifecycleCallback, int i10, int i11, int i12) {
            e(i10, i11, i12, composeNodeLifecycleCallback);
        }

        public final void e(int i10, int i11, int i12, Object obj) {
            d(i10);
            if (i12 < 0 || i12 >= i10) {
                this.f14513c.add(obj);
                return;
            }
            this.f14516f.add(obj);
            this.f14517g.add(i11);
            this.f14518h.add(i12);
        }

        @Override // androidx.compose.runtime.RememberManager
        public final void forgetting(@NotNull RememberObserver rememberObserver, int i10, int i11, int i12) {
            e(i10, i11, i12, rememberObserver);
        }

        @Override // androidx.compose.runtime.RememberManager
        public final void releasing(@NotNull ComposeNodeLifecycleCallback composeNodeLifecycleCallback, int i10, int i11, int i12) {
            MutableScatterSet<ComposeNodeLifecycleCallback> mutableScatterSetMutableScatterSetOf = this.f14515e;
            if (mutableScatterSetMutableScatterSetOf == null) {
                mutableScatterSetMutableScatterSetOf = ScatterSetKt.mutableScatterSetOf();
                this.f14515e = mutableScatterSetMutableScatterSetOf;
            }
            mutableScatterSetMutableScatterSetOf.plusAssign(composeNodeLifecycleCallback);
            e(i10, i11, i12, composeNodeLifecycleCallback);
        }

        @Override // androidx.compose.runtime.RememberManager
        public final void remembering(@NotNull RememberObserver rememberObserver) {
            this.f14512b.add(rememberObserver);
        }

        @Override // androidx.compose.runtime.RememberManager
        public final void sideEffect(@NotNull Function0<Unit> function0) {
            this.f14514d.add(function0);
        }
    }

    public CompositionImpl(@NotNull CompositionContext compositionContext, @NotNull Applier<?> applier, @Nullable CoroutineContext coroutineContext) {
        this.f14502p0 = compositionContext;
        this.f14503q0 = applier;
        DefaultConstructorMarker defaultConstructorMarker = null;
        this.f14504r0 = new AtomicReference<>(null);
        this.f14505s0 = new Object();
        int i10 = 0;
        int i11 = 1;
        Set<RememberObserver> setAsMutableSet = new MutableScatterSet(i10, i11, defaultConstructorMarker).asMutableSet();
        this.f14506t0 = setAsMutableSet;
        SlotTable slotTable = new SlotTable();
        if (compositionContext.getCollectingCallByInformation$runtime_release()) {
            slotTable.collectCalledByInformation();
        }
        if (compositionContext.getCollectingSourceInformation$runtime_release()) {
            slotTable.collectSourceInformation();
        }
        this.slotTable = slotTable;
        this.v0 = new ScopeMap<>();
        this.f14508w0 = new MutableScatterSet<>(i10, i11, defaultConstructorMarker);
        this.f14509x0 = new MutableScatterSet<>(i10, i11, defaultConstructorMarker);
        this.f14510y0 = new ScopeMap<>();
        ChangeList changeList = new ChangeList();
        this.E0 = changeList;
        ChangeList changeList2 = new ChangeList();
        this.F0 = changeList2;
        this.G0 = new ScopeMap<>();
        this.H0 = new ScopeMap<>();
        this.observerHolder = new CompositionObserverHolder(null, false, 3, null);
        ComposerImpl composerImpl = new ComposerImpl(applier, compositionContext, slotTable, setAsMutableSet, changeList, changeList2, this);
        compositionContext.registerComposer$runtime_release(composerImpl);
        this.M0 = composerImpl;
        this.N0 = coroutineContext;
        this.isRoot = compositionContext instanceof Recomposer;
        this.composable = ComposableSingletons$CompositionKt.INSTANCE.m2059getLambda1$runtime_release();
    }

    public static void j(SlotTable slotTable) {
        Object[] slots = slotTable.getSlots();
        ArrayList arrayList = new ArrayList();
        for (Object obj : slots) {
            RecomposeScopeImpl recomposeScopeImpl = obj instanceof RecomposeScopeImpl ? (RecomposeScopeImpl) obj : null;
            if (recomposeScopeImpl != null) {
                arrayList.add(recomposeScopeImpl);
            }
        }
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            RecomposeScopeImpl recomposeScopeImpl2 = (RecomposeScopeImpl) arrayList.get(i10);
            Anchor anchor = recomposeScopeImpl2.getAnchor();
            if (anchor != null && !slotTable.slotsOf$runtime_release(anchor.toIndexFor(slotTable)).contains(recomposeScopeImpl2)) {
                PreconditionsKt.throwIllegalStateException("Misaligned anchor " + anchor + " in scope " + recomposeScopeImpl2 + " encountered, scope found at " + ArraysKt___ArraysKt.indexOf((RecomposeScopeImpl[]) slotTable.getSlots(), recomposeScopeImpl2));
            }
        }
    }

    public final void a(Object obj, boolean z10) {
        int i10;
        Object obj2 = this.v0.getMap().get(obj);
        if (obj2 == null) {
            return;
        }
        boolean z11 = obj2 instanceof MutableScatterSet;
        MutableScatterSet<RecomposeScopeImpl> mutableScatterSet = this.f14508w0;
        MutableScatterSet<RecomposeScopeImpl> mutableScatterSet2 = this.f14509x0;
        ScopeMap<Object, RecomposeScopeImpl> scopeMap = this.G0;
        if (!z11) {
            RecomposeScopeImpl recomposeScopeImpl = (RecomposeScopeImpl) obj2;
            if (scopeMap.remove(obj, recomposeScopeImpl) || recomposeScopeImpl.invalidateForResult(obj) == InvalidationResult.IGNORED) {
                return;
            }
            if (!recomposeScopeImpl.isConditional() || z10) {
                mutableScatterSet.add(recomposeScopeImpl);
                return;
            } else {
                mutableScatterSet2.add(recomposeScopeImpl);
                return;
            }
        }
        MutableScatterSet mutableScatterSet3 = (MutableScatterSet) obj2;
        Object[] objArr = mutableScatterSet3.elements;
        long[] jArr = mutableScatterSet3.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i11 = 0;
        while (true) {
            long j10 = jArr[i11];
            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i12 = 8;
                int i13 = 8 - ((~(i11 - length)) >>> 31);
                int i14 = 0;
                while (i14 < i13) {
                    if ((255 & j10) < 128) {
                        RecomposeScopeImpl recomposeScopeImpl2 = (RecomposeScopeImpl) objArr[(i11 << 3) + i14];
                        if (!scopeMap.remove(obj, recomposeScopeImpl2) && recomposeScopeImpl2.invalidateForResult(obj) != InvalidationResult.IGNORED) {
                            if (!recomposeScopeImpl2.isConditional() || z10) {
                                mutableScatterSet.add(recomposeScopeImpl2);
                            } else {
                                mutableScatterSet2.add(recomposeScopeImpl2);
                            }
                        }
                        i10 = 8;
                    } else {
                        i10 = i12;
                    }
                    j10 >>= i10;
                    i14++;
                    i12 = i10;
                }
                if (i13 != i12) {
                    return;
                }
            }
            if (i11 == length) {
                return;
            } else {
                i11++;
            }
        }
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public void abandonChanges() {
        DefaultConstructorMarker defaultConstructorMarker = null;
        this.f14504r0.set(null);
        this.E0.clear();
        this.F0.clear();
        Set<RememberObserver> set = this.f14506t0;
        int i10 = 1;
        if (!set.isEmpty()) {
            new ArrayList();
            new ArrayList();
            new ArrayList();
            new ArrayList();
            int i11 = 0;
            new MutableIntList(i11, i10, defaultConstructorMarker);
            new MutableIntList(i11, i10, defaultConstructorMarker);
            if (!set.isEmpty()) {
                Object objBeginSection = Trace.INSTANCE.beginSection("Compose:abandons");
                try {
                    Iterator<RememberObserver> it = set.iterator();
                    while (it.hasNext()) {
                        RememberObserver next = it.next();
                        it.remove();
                        next.onAbandoned();
                    }
                    Unit unit = Unit.INSTANCE;
                } finally {
                    Trace.INSTANCE.endSection(objBeginSection);
                }
            }
        }
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public void applyChanges() {
        synchronized (this.f14505s0) {
            try {
                c(this.E0);
                f();
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th2) {
                try {
                    try {
                        int i10 = 1;
                        if (!this.f14506t0.isEmpty()) {
                            Set<RememberObserver> set = this.f14506t0;
                            new ArrayList();
                            new ArrayList();
                            new ArrayList();
                            new ArrayList();
                            int i11 = 0;
                            DefaultConstructorMarker defaultConstructorMarker = null;
                            new MutableIntList(i11, i10, defaultConstructorMarker);
                            new MutableIntList(i11, i10, defaultConstructorMarker);
                            if (true ^ set.isEmpty()) {
                                Object objBeginSection = Trace.INSTANCE.beginSection("Compose:abandons");
                                try {
                                    Iterator<RememberObserver> it = set.iterator();
                                    while (it.hasNext()) {
                                        RememberObserver next = it.next();
                                        it.remove();
                                        next.onAbandoned();
                                    }
                                    Unit unit2 = Unit.INSTANCE;
                                } finally {
                                    Trace.INSTANCE.endSection(objBeginSection);
                                }
                            }
                        }
                        throw th2;
                    } catch (Exception e5) {
                        abandonChanges();
                        throw e5;
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public void applyLateChanges() {
        synchronized (this.f14505s0) {
            try {
                if (this.F0.isNotEmpty()) {
                    c(this.F0);
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th2) {
                try {
                    try {
                        int i10 = 1;
                        if (!this.f14506t0.isEmpty()) {
                            Set<RememberObserver> set = this.f14506t0;
                            new ArrayList();
                            new ArrayList();
                            new ArrayList();
                            new ArrayList();
                            int i11 = 0;
                            DefaultConstructorMarker defaultConstructorMarker = null;
                            new MutableIntList(i11, i10, defaultConstructorMarker);
                            new MutableIntList(i11, i10, defaultConstructorMarker);
                            if (true ^ set.isEmpty()) {
                                Object objBeginSection = Trace.INSTANCE.beginSection("Compose:abandons");
                                try {
                                    Iterator<RememberObserver> it = set.iterator();
                                    while (it.hasNext()) {
                                        RememberObserver next = it.next();
                                        it.remove();
                                        next.onAbandoned();
                                    }
                                    Unit unit2 = Unit.INSTANCE;
                                } finally {
                                    Trace.INSTANCE.endSection(objBeginSection);
                                }
                            }
                        }
                        throw th2;
                    } catch (Exception e5) {
                        abandonChanges();
                        throw e5;
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:118:0x0291 A[PHI: r16 r24 r25 r32 r33
      0x0291: PHI (r16v14 long[]) = (r16v13 long[]), (r16v13 long[]), (r16v15 long[]) binds: [B:115:0x0289, B:117:0x028f, B:112:0x0273] A[DONT_GENERATE, DONT_INLINE]
      0x0291: PHI (r24v13 int) = (r24v12 int), (r24v12 int), (r24v14 int) binds: [B:115:0x0289, B:117:0x028f, B:112:0x0273] A[DONT_GENERATE, DONT_INLINE]
      0x0291: PHI (r25v5 long) = (r25v4 long), (r25v4 long), (r25v7 long) binds: [B:115:0x0289, B:117:0x028f, B:112:0x0273] A[DONT_GENERATE, DONT_INLINE]
      0x0291: PHI (r32v18 java.lang.String) = (r32v17 java.lang.String), (r32v17 java.lang.String), (r32v19 java.lang.String) binds: [B:115:0x0289, B:117:0x028f, B:112:0x0273] A[DONT_GENERATE, DONT_INLINE]
      0x0291: PHI (r33v11 int) = (r33v10 int), (r33v10 int), (r33v12 int) binds: [B:115:0x0289, B:117:0x028f, B:112:0x0273] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:185:0x00d6 A[EDGE_INSN: B:185:0x00d6->B:37:0x00d6 BREAK  A[LOOP:2: B:24:0x007d->B:35:0x00c1], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:213:0x011b A[EDGE_INSN: B:213:0x011b->B:208:0x011b BREAK  A[LOOP:13: B:59:0x014e->B:70:0x018a], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:34:0x00bf A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x00c1 A[LOOP:2: B:24:0x007d->B:35:0x00c1, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:69:0x0188 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:70:0x018a A[LOOP:13: B:59:0x014e->B:70:0x018a, LOOP_END] */
    public final void b(Set<? extends Object> set, boolean z10) {
        String str;
        long[] jArr;
        String str2;
        int i10;
        boolean zContains;
        Object[] objArr;
        String str3;
        Object[] objArr2;
        String str4;
        long[] jArr2;
        int i11;
        String str5;
        long[] jArr3;
        int i12;
        int i13;
        long j10;
        long[] jArr4;
        Object[] objArr3;
        long[] jArr5;
        Object[] objArr4;
        Object[] objArr5;
        ScopeMap<Object, DerivedState<?>> scopeMap;
        Object[] objArr6;
        ScopeMap<Object, DerivedState<?>> scopeMap2;
        int i14;
        int i15;
        int i16;
        boolean z11 = set instanceof ScatterSetWrapper;
        ScopeMap<Object, DerivedState<?>> scopeMap3 = this.f14510y0;
        char c10 = 7;
        long j11 = -9187201950435737472L;
        int i17 = 8;
        if (z11) {
            ScatterSet set$runtime_release = ((ScatterSetWrapper) set).getSet$runtime_release();
            Object[] objArr7 = set$runtime_release.elements;
            long[] jArr6 = set$runtime_release.metadata;
            int length = jArr6.length - 2;
            if (length >= 0) {
                int i18 = 0;
                while (true) {
                    long j12 = jArr6[i18];
                    if ((((~j12) << c10) & j12 & j11) != j11) {
                        int i19 = 8 - ((~(i18 - length)) >>> 31);
                        int i20 = 0;
                        while (i20 < i19) {
                            if ((j12 & 255) < 128) {
                                Object obj = objArr7[(i18 << 3) + i20];
                                if (obj instanceof RecomposeScopeImpl) {
                                    ((RecomposeScopeImpl) obj).invalidateForResult(null);
                                } else {
                                    a(obj, z10);
                                    Object obj2 = scopeMap3.getMap().get(obj);
                                    if (obj2 != null) {
                                        if (obj2 instanceof MutableScatterSet) {
                                            MutableScatterSet mutableScatterSet = (MutableScatterSet) obj2;
                                            Object[] objArr8 = mutableScatterSet.elements;
                                            long[] jArr7 = mutableScatterSet.metadata;
                                            int length2 = jArr7.length - 2;
                                            if (length2 >= 0) {
                                                objArr6 = objArr7;
                                                scopeMap2 = scopeMap3;
                                                int i21 = 0;
                                                while (true) {
                                                    long j13 = jArr7[i21];
                                                    i14 = i19;
                                                    i15 = i20;
                                                    if ((((~j13) << c10) & j13 & (-9187201950435737472L)) == -9187201950435737472L) {
                                                        if (i21 != length2) {
                                                            break;
                                                            break;
                                                        }
                                                        i21++;
                                                        i19 = i14;
                                                        i20 = i15;
                                                        c10 = 7;
                                                    } else {
                                                        int i22 = 8 - ((~(i21 - length2)) >>> 31);
                                                        for (int i23 = 0; i23 < i22; i23++) {
                                                            if ((j13 & 255) < 128) {
                                                                a((DerivedState) objArr8[(i21 << 3) + i23], z10);
                                                            }
                                                            j13 >>= 8;
                                                        }
                                                        if (i22 != 8) {
                                                            break;
                                                        }
                                                        if (i21 != length2) {
                                                            break;
                                                        }
                                                        i21++;
                                                        i19 = i14;
                                                        i20 = i15;
                                                        c10 = 7;
                                                    }
                                                }
                                            }
                                        } else {
                                            objArr6 = objArr7;
                                            scopeMap2 = scopeMap3;
                                            i14 = i19;
                                            i15 = i20;
                                            a((DerivedState) obj2, z10);
                                        }
                                    }
                                    i16 = 8;
                                }
                                objArr6 = objArr7;
                                scopeMap2 = scopeMap3;
                                i14 = i19;
                                i15 = i20;
                                i16 = 8;
                            } else {
                                objArr6 = objArr7;
                                scopeMap2 = scopeMap3;
                                i14 = i19;
                                i15 = i20;
                                i16 = i17;
                            }
                            j12 >>= i16;
                            i20 = i15 + 1;
                            i17 = i16;
                            scopeMap3 = scopeMap2;
                            i19 = i14;
                            c10 = 7;
                            objArr7 = objArr6;
                        }
                        objArr5 = objArr7;
                        scopeMap = scopeMap3;
                        if (i19 != i17) {
                            break;
                        }
                    } else {
                        objArr5 = objArr7;
                        scopeMap = scopeMap3;
                    }
                    if (i18 == length) {
                        break;
                    }
                    i18++;
                    objArr7 = objArr5;
                    scopeMap3 = scopeMap;
                    c10 = 7;
                    j11 = -9187201950435737472L;
                    i17 = 8;
                }
            }
        } else {
            for (Object obj3 : set) {
                if (obj3 instanceof RecomposeScopeImpl) {
                    ((RecomposeScopeImpl) obj3).invalidateForResult(null);
                } else {
                    a(obj3, z10);
                    Object obj4 = scopeMap3.getMap().get(obj3);
                    if (obj4 != null) {
                        if (obj4 instanceof MutableScatterSet) {
                            MutableScatterSet mutableScatterSet2 = (MutableScatterSet) obj4;
                            Object[] objArr9 = mutableScatterSet2.elements;
                            long[] jArr8 = mutableScatterSet2.metadata;
                            int length3 = jArr8.length - 2;
                            if (length3 >= 0) {
                                int i24 = 0;
                                while (true) {
                                    long j14 = jArr8[i24];
                                    if ((((~j14) << 7) & j14 & (-9187201950435737472L)) == -9187201950435737472L) {
                                        if (i24 != length3) {
                                            break;
                                            break;
                                        }
                                        i24++;
                                    } else {
                                        int i25 = 8 - ((~(i24 - length3)) >>> 31);
                                        for (int i26 = 0; i26 < i25; i26++) {
                                            if ((j14 & 255) < 128) {
                                                a((DerivedState) objArr9[(i24 << 3) + i26], z10);
                                            }
                                            j14 >>= 8;
                                        }
                                        if (i25 != 8) {
                                            break;
                                        } else if (i24 != length3) {
                                            break;
                                        } else {
                                            i24++;
                                        }
                                    }
                                }
                            }
                        } else {
                            a((DerivedState) obj4, z10);
                        }
                    }
                }
            }
        }
        String str6 = "null cannot be cast to non-null type androidx.collection.MutableScatterSet<Scope of androidx.compose.runtime.collection.ScopeMap.removeScopeIf$lambda$2>";
        ScopeMap<Object, RecomposeScopeImpl> scopeMap4 = this.v0;
        MutableScatterSet<RecomposeScopeImpl> mutableScatterSet3 = this.f14508w0;
        if (z10) {
            MutableScatterSet<RecomposeScopeImpl> mutableScatterSet4 = this.f14509x0;
            if (mutableScatterSet4.isNotEmpty()) {
                MutableScatterMap<Object, Object> map = scopeMap4.getMap();
                long[] jArr9 = map.metadata;
                int length4 = jArr9.length - 2;
                if (length4 >= 0) {
                    int i27 = 0;
                    while (true) {
                        long j15 = jArr9[i27];
                        if ((((~j15) << 7) & j15 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i28 = 8 - ((~(i27 - length4)) >>> 31);
                            int i29 = 0;
                            while (i29 < i28) {
                                if ((j15 & 255) < 128) {
                                    int i30 = (i27 << 3) + i29;
                                    Object obj5 = map.keys[i30];
                                    Object obj6 = map.values[i30];
                                    if (obj6 instanceof MutableScatterSet) {
                                        Intrinsics.checkNotNull(obj6, str6);
                                        MutableScatterSet mutableScatterSet5 = (MutableScatterSet) obj6;
                                        Object[] objArr10 = mutableScatterSet5.elements;
                                        long[] jArr10 = mutableScatterSet5.metadata;
                                        jArr3 = jArr9;
                                        int length5 = jArr10.length - 2;
                                        str5 = str6;
                                        i12 = length4;
                                        i13 = i27;
                                        if (length5 >= 0) {
                                            int i31 = 0;
                                            while (true) {
                                                long j16 = jArr10[i31];
                                                j10 = j15;
                                                if ((((~j16) << 7) & j16 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                    int i32 = 8 - ((~(i31 - length5)) >>> 31);
                                                    int i33 = 0;
                                                    while (i33 < i32) {
                                                        if ((j16 & 255) < 128) {
                                                            jArr5 = jArr10;
                                                            int i34 = (i31 << 3) + i33;
                                                            objArr4 = objArr10;
                                                            RecomposeScopeImpl recomposeScopeImpl = (RecomposeScopeImpl) objArr10[i34];
                                                            if (mutableScatterSet4.contains(recomposeScopeImpl) || mutableScatterSet3.contains(recomposeScopeImpl)) {
                                                                mutableScatterSet5.removeElementAt(i34);
                                                            }
                                                        } else {
                                                            jArr5 = jArr10;
                                                            objArr4 = objArr10;
                                                        }
                                                        j16 >>= 8;
                                                        i33++;
                                                        jArr10 = jArr5;
                                                        objArr10 = objArr4;
                                                    }
                                                    jArr4 = jArr10;
                                                    objArr3 = objArr10;
                                                    if (i32 != 8) {
                                                        break;
                                                    }
                                                } else {
                                                    jArr4 = jArr10;
                                                    objArr3 = objArr10;
                                                }
                                                if (i31 == length5) {
                                                    break;
                                                }
                                                i31++;
                                                j15 = j10;
                                                jArr10 = jArr4;
                                                objArr10 = objArr3;
                                            }
                                        } else {
                                            j10 = j15;
                                        }
                                        if (mutableScatterSet5.isEmpty()) {
                                            map.removeValueAt(i30);
                                        }
                                    } else {
                                        str5 = str6;
                                        jArr3 = jArr9;
                                        i12 = length4;
                                        i13 = i27;
                                        j10 = j15;
                                        Intrinsics.checkNotNull(obj6, "null cannot be cast to non-null type Scope of androidx.compose.runtime.collection.ScopeMap.removeScopeIf$lambda$2");
                                        RecomposeScopeImpl recomposeScopeImpl2 = (RecomposeScopeImpl) obj6;
                                        if (mutableScatterSet4.contains(recomposeScopeImpl2) || mutableScatterSet3.contains(recomposeScopeImpl2)) {
                                            map.removeValueAt(i30);
                                        }
                                    }
                                } else {
                                    str5 = str6;
                                    jArr3 = jArr9;
                                    i12 = length4;
                                    i13 = i27;
                                    j10 = j15;
                                }
                                j15 = j10 >> 8;
                                i29++;
                                str6 = str5;
                                length4 = i12;
                                jArr9 = jArr3;
                                i27 = i13;
                            }
                            str4 = str6;
                            jArr2 = jArr9;
                            int i35 = length4;
                            int i36 = i27;
                            if (i28 != 8) {
                                break;
                            }
                            length4 = i35;
                            i11 = i36;
                        } else {
                            str4 = str6;
                            jArr2 = jArr9;
                            i11 = i27;
                        }
                        if (i11 == length4) {
                            break;
                        }
                        i27 = i11 + 1;
                        str6 = str4;
                        jArr9 = jArr2;
                    }
                }
                mutableScatterSet4.clear();
                d();
                return;
            }
        }
        String str7 = "null cannot be cast to non-null type androidx.collection.MutableScatterSet<Scope of androidx.compose.runtime.collection.ScopeMap.removeScopeIf$lambda$2>";
        if (mutableScatterSet3.isNotEmpty()) {
            MutableScatterMap<Object, Object> map2 = scopeMap4.getMap();
            long[] jArr11 = map2.metadata;
            int length6 = jArr11.length - 2;
            if (length6 >= 0) {
                int i37 = 0;
                while (true) {
                    long j17 = jArr11[i37];
                    if ((((~j17) << 7) & j17 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i38 = 8 - ((~(i37 - length6)) >>> 31);
                        int i39 = 0;
                        while (i39 < i38) {
                            if ((j17 & 255) < 128) {
                                int i40 = (i37 << 3) + i39;
                                Object obj7 = map2.keys[i40];
                                Object obj8 = map2.values[i40];
                                if (obj8 instanceof MutableScatterSet) {
                                    String str8 = str7;
                                    Intrinsics.checkNotNull(obj8, str8);
                                    MutableScatterSet mutableScatterSet6 = (MutableScatterSet) obj8;
                                    Object[] objArr11 = mutableScatterSet6.elements;
                                    long[] jArr12 = mutableScatterSet6.metadata;
                                    int length7 = jArr12.length - 2;
                                    if (length7 >= 0) {
                                        int i41 = 0;
                                        while (true) {
                                            long j18 = jArr12[i41];
                                            long[] jArr13 = jArr12;
                                            i10 = i38;
                                            if ((((~j18) << 7) & j18 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                int i42 = 8 - ((~(i41 - length7)) >>> 31);
                                                int i43 = 0;
                                                while (i43 < i42) {
                                                    if ((j18 & 255) < 128) {
                                                        str3 = str8;
                                                        int i44 = (i41 << 3) + i43;
                                                        objArr2 = objArr11;
                                                        if (mutableScatterSet3.contains((RecomposeScopeImpl) objArr11[i44])) {
                                                            mutableScatterSet6.removeElementAt(i44);
                                                        }
                                                    } else {
                                                        str3 = str8;
                                                        objArr2 = objArr11;
                                                    }
                                                    j18 >>= 8;
                                                    i43++;
                                                    str8 = str3;
                                                    objArr11 = objArr2;
                                                }
                                                str2 = str8;
                                                objArr = objArr11;
                                                if (i42 != 8) {
                                                    break;
                                                }
                                            } else {
                                                str2 = str8;
                                                objArr = objArr11;
                                            }
                                            if (i41 == length7) {
                                                break;
                                            }
                                            i41++;
                                            i38 = i10;
                                            jArr12 = jArr13;
                                            str8 = str2;
                                            objArr11 = objArr;
                                        }
                                    } else {
                                        str2 = str8;
                                        i10 = i38;
                                    }
                                    zContains = mutableScatterSet6.isEmpty();
                                } else {
                                    str2 = str7;
                                    i10 = i38;
                                    Intrinsics.checkNotNull(obj8, "null cannot be cast to non-null type Scope of androidx.compose.runtime.collection.ScopeMap.removeScopeIf$lambda$2");
                                    zContains = mutableScatterSet3.contains((RecomposeScopeImpl) obj8);
                                }
                                if (zContains) {
                                    map2.removeValueAt(i40);
                                }
                            } else {
                                str2 = str7;
                                jArr11 = jArr11;
                                length6 = length6;
                                i37 = i37;
                                i10 = i38;
                            }
                            j17 >>= 8;
                            i39++;
                            length6 = length6;
                            i37 = i37;
                            jArr11 = jArr11;
                            i38 = i10;
                            str7 = str2;
                        }
                        str = str7;
                        jArr = jArr11;
                        int i45 = length6;
                        int i46 = i37;
                        if (i38 != 8) {
                            break;
                        }
                        length6 = i45;
                        i37 = i46;
                    } else {
                        str = str7;
                        jArr = jArr11;
                    }
                    if (i37 == length6) {
                        break;
                    }
                    i37++;
                    jArr11 = jArr;
                    str7 = str;
                }
            }
            d();
            mutableScatterSet3.clear();
        }
    }

    public final void c(ChangeList changeList) throws Throwable {
        ChangeList changeList2;
        a aVar;
        long[] jArr;
        boolean z10;
        ChangeList changeList3;
        a aVar2;
        long[] jArr2;
        int i10;
        int i11;
        boolean z11;
        long j10;
        char c10;
        int i12;
        long[] jArr3;
        long[] jArr4;
        Applier<?> applier = this.f14503q0;
        ChangeList changeList4 = this.F0;
        a aVar3 = new a(this.f14506t0);
        try {
            if (changeList.isEmpty()) {
                if (changeList4.isEmpty()) {
                    aVar3.a();
                    return;
                }
                return;
            }
            try {
                Trace trace = Trace.INSTANCE;
                Object objBeginSection = trace.beginSection("Compose:applyChanges");
                try {
                    applier.onBeginChanges();
                    SlotWriter slotWriterOpenWriter = this.slotTable.openWriter();
                    int i13 = 0;
                    try {
                        changeList.executeAndFlushAllPendingChanges(applier, slotWriterOpenWriter, aVar3);
                        Unit unit = Unit.INSTANCE;
                        boolean z12 = true;
                        slotWriterOpenWriter.close(true);
                        applier.onEndChanges();
                        trace.endSection(objBeginSection);
                        aVar3.b();
                        aVar3.c();
                        if (this.pendingInvalidScopes) {
                            Object objBeginSection2 = trace.beginSection("Compose:unobserve");
                            try {
                                this.pendingInvalidScopes = false;
                                MutableScatterMap<Object, Object> map = this.v0.getMap();
                                long[] jArr5 = map.metadata;
                                int length = jArr5.length - 2;
                                if (length >= 0) {
                                    int i14 = 0;
                                    while (true) {
                                        long j11 = jArr5[i14];
                                        char c11 = 7;
                                        long j12 = -9187201950435737472L;
                                        if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                                            int i15 = 8;
                                            int i16 = 8 - ((~(i14 - length)) >>> 31);
                                            while (i13 < i16) {
                                                if ((j11 & 255) < 128) {
                                                    int i17 = (i14 << 3) + i13;
                                                    Object obj = map.keys[i17];
                                                    Object obj2 = map.values[i17];
                                                    if (obj2 instanceof MutableScatterSet) {
                                                        Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type androidx.collection.MutableScatterSet<Scope of androidx.compose.runtime.collection.ScopeMap.removeScopeIf$lambda$2>");
                                                        MutableScatterSet mutableScatterSet = (MutableScatterSet) obj2;
                                                        Object[] objArr = mutableScatterSet.elements;
                                                        long[] jArr6 = mutableScatterSet.metadata;
                                                        int length2 = jArr6.length - 2;
                                                        changeList3 = changeList4;
                                                        aVar2 = aVar3;
                                                        jArr2 = jArr5;
                                                        if (length2 >= 0) {
                                                            int i18 = 0;
                                                            while (true) {
                                                                try {
                                                                    long j13 = jArr6[i18];
                                                                    i10 = length;
                                                                    i11 = i13;
                                                                    c10 = 7;
                                                                    j10 = -9187201950435737472L;
                                                                    if ((((~j13) << 7) & j13 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                                        int i19 = 8 - ((~(i18 - length2)) >>> 31);
                                                                        int i20 = 0;
                                                                        while (i20 < i19) {
                                                                            if ((j13 & 255) < 128) {
                                                                                jArr4 = jArr6;
                                                                                int i21 = (i18 << 3) + i20;
                                                                                if (!((RecomposeScopeImpl) objArr[i21]).getValid()) {
                                                                                    mutableScatterSet.removeElementAt(i21);
                                                                                }
                                                                            } else {
                                                                                jArr4 = jArr6;
                                                                            }
                                                                            j13 >>= 8;
                                                                            i20++;
                                                                            jArr6 = jArr4;
                                                                        }
                                                                        jArr3 = jArr6;
                                                                        z11 = true;
                                                                        if (i19 != 8) {
                                                                            break;
                                                                        }
                                                                    } else {
                                                                        jArr3 = jArr6;
                                                                        z11 = true;
                                                                    }
                                                                    if (i18 == length2) {
                                                                        break;
                                                                    }
                                                                    i18++;
                                                                    length = i10;
                                                                    i13 = i11;
                                                                    jArr6 = jArr3;
                                                                } catch (Throwable th2) {
                                                                    th = th2;
                                                                    Trace.INSTANCE.endSection(objBeginSection2);
                                                                    throw th;
                                                                }
                                                            }
                                                        } else {
                                                            i10 = length;
                                                            i11 = i13;
                                                            c10 = 7;
                                                            j10 = -9187201950435737472L;
                                                            z11 = true;
                                                        }
                                                        if (mutableScatterSet.isEmpty()) {
                                                            map.removeValueAt(i17);
                                                        }
                                                    } else {
                                                        changeList3 = changeList4;
                                                        aVar2 = aVar3;
                                                        jArr2 = jArr5;
                                                        i10 = length;
                                                        i11 = i13;
                                                        c10 = c11;
                                                        j10 = -9187201950435737472L;
                                                        z11 = true;
                                                        Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type Scope of androidx.compose.runtime.collection.ScopeMap.removeScopeIf$lambda$2");
                                                        if (!((RecomposeScopeImpl) obj2).getValid()) {
                                                            map.removeValueAt(i17);
                                                        }
                                                    }
                                                    i12 = 8;
                                                } else {
                                                    changeList3 = changeList4;
                                                    aVar2 = aVar3;
                                                    jArr2 = jArr5;
                                                    i10 = length;
                                                    i11 = i13;
                                                    z11 = z12;
                                                    j10 = j12;
                                                    c10 = c11;
                                                    i12 = i15;
                                                }
                                                j11 >>= i12;
                                                i13 = i11 + 1;
                                                i15 = i12;
                                                c11 = c10;
                                                jArr5 = jArr2;
                                                j12 = j10;
                                                aVar3 = aVar2;
                                                changeList4 = changeList3;
                                                length = i10;
                                                z12 = z11;
                                            }
                                            changeList2 = changeList4;
                                            aVar = aVar3;
                                            jArr = jArr5;
                                            int i22 = length;
                                            z10 = z12;
                                            if (i16 != i15) {
                                                break;
                                            } else {
                                                length = i22;
                                            }
                                        } else {
                                            changeList2 = changeList4;
                                            aVar = aVar3;
                                            jArr = jArr5;
                                            z10 = z12;
                                        }
                                        if (i14 == length) {
                                            break;
                                        }
                                        i14++;
                                        jArr5 = jArr;
                                        aVar3 = aVar;
                                        changeList4 = changeList2;
                                        z12 = z10;
                                        i13 = 0;
                                    }
                                } else {
                                    changeList2 = changeList4;
                                    aVar = aVar3;
                                }
                                d();
                                Unit unit2 = Unit.INSTANCE;
                                Trace.INSTANCE.endSection(objBeginSection2);
                            } catch (Throwable th3) {
                                th = th3;
                            }
                        } else {
                            changeList2 = changeList4;
                            aVar = aVar3;
                        }
                        if (changeList2.isEmpty()) {
                            aVar.a();
                            return;
                        }
                        return;
                    } catch (Throwable th4) {
                        try {
                            slotWriterOpenWriter.close(false);
                            throw th4;
                        } catch (Throwable th5) {
                            th = th5;
                            Trace.INSTANCE.endSection(objBeginSection);
                            throw th;
                        }
                    }
                } catch (Throwable th6) {
                    th = th6;
                }
            } catch (Throwable th7) {
                th = th7;
            }
        } catch (Throwable th8) {
            th = th8;
        }
        if (changeList4.isEmpty()) {
            aVar3.a();
        }
        throw th;
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public void changesApplied() {
        synchronized (this.f14505s0) {
            DefaultConstructorMarker defaultConstructorMarker = null;
            int i10 = 0;
            int i11 = 1;
            try {
                this.M0.changesApplied$runtime_release();
                if (!this.f14506t0.isEmpty()) {
                    Set<RememberObserver> set = this.f14506t0;
                    new ArrayList();
                    new ArrayList();
                    new ArrayList();
                    new ArrayList();
                    new MutableIntList(i10, i11, defaultConstructorMarker);
                    new MutableIntList(i10, i11, defaultConstructorMarker);
                    if (!set.isEmpty()) {
                        Object objBeginSection = Trace.INSTANCE.beginSection("Compose:abandons");
                        try {
                            Iterator<RememberObserver> it = set.iterator();
                            while (it.hasNext()) {
                                RememberObserver next = it.next();
                                it.remove();
                                next.onAbandoned();
                            }
                            Unit unit = Unit.INSTANCE;
                            Trace.INSTANCE.endSection(objBeginSection);
                        } catch (Throwable th2) {
                            Trace.INSTANCE.endSection(objBeginSection);
                            throw th2;
                        }
                    }
                }
                Unit unit2 = Unit.INSTANCE;
            } catch (Throwable th3) {
                try {
                    try {
                        if (!this.f14506t0.isEmpty()) {
                            Set<RememberObserver> set2 = this.f14506t0;
                            new ArrayList();
                            new ArrayList();
                            new ArrayList();
                            new ArrayList();
                            new MutableIntList(i10, i11, defaultConstructorMarker);
                            new MutableIntList(i10, i11, defaultConstructorMarker);
                            if (!set2.isEmpty()) {
                                Object objBeginSection2 = Trace.INSTANCE.beginSection("Compose:abandons");
                                try {
                                    Iterator<RememberObserver> it2 = set2.iterator();
                                    while (it2.hasNext()) {
                                        RememberObserver next2 = it2.next();
                                        it2.remove();
                                        next2.onAbandoned();
                                    }
                                    Unit unit3 = Unit.INSTANCE;
                                } finally {
                                    Trace.INSTANCE.endSection(objBeginSection2);
                                }
                            }
                        }
                        throw th3;
                    } catch (Exception e5) {
                        abandonChanges();
                        throw e5;
                    }
                } catch (Throwable th4) {
                    throw th4;
                }
            }
        }
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public void composeContent(@NotNull Function2<? super Composer, ? super Integer, Unit> content) throws Exception {
        try {
            synchronized (this.f14505s0) {
                try {
                    e();
                    ScopeMap<RecomposeScopeImpl, Object> scopeMap = this.H0;
                    this.H0 = new ScopeMap<>();
                    try {
                        CompositionObserver compositionObserverI = i();
                        if (compositionObserverI != null) {
                            Map<RecomposeScopeImpl, Set<Object>> mapAsMap = scopeMap.asMap();
                            Intrinsics.checkNotNull(mapAsMap, "null cannot be cast to non-null type kotlin.collections.Map<androidx.compose.runtime.RecomposeScope, kotlin.collections.Set<kotlin.Any>?>");
                            compositionObserverI.onBeginComposition(this, mapAsMap);
                        }
                        this.M0.composeContent$runtime_release(scopeMap, content);
                        if (compositionObserverI != null) {
                            compositionObserverI.onEndComposition(this);
                            Unit unit = Unit.INSTANCE;
                        }
                    } catch (Exception e5) {
                        this.H0 = scopeMap;
                        throw e5;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            try {
                int i10 = 1;
                if (!this.f14506t0.isEmpty()) {
                    Set<RememberObserver> set = this.f14506t0;
                    new ArrayList();
                    new ArrayList();
                    new ArrayList();
                    new ArrayList();
                    int i11 = 0;
                    DefaultConstructorMarker defaultConstructorMarker = null;
                    new MutableIntList(i11, i10, defaultConstructorMarker);
                    new MutableIntList(i11, i10, defaultConstructorMarker);
                    if (true ^ set.isEmpty()) {
                        Object objBeginSection = Trace.INSTANCE.beginSection("Compose:abandons");
                        try {
                            Iterator<RememberObserver> it = set.iterator();
                            while (it.hasNext()) {
                                RememberObserver next = it.next();
                                it.remove();
                                next.onAbandoned();
                            }
                            Unit unit2 = Unit.INSTANCE;
                        } finally {
                            Trace.INSTANCE.endSection(objBeginSection);
                        }
                    }
                }
                throw th3;
            } catch (Exception e7) {
                abandonChanges();
                throw e7;
            }
        }
    }

    public final int composerStacksSizes$runtime_release() {
        return this.M0.stacksSize$runtime_release();
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00f2 A[PHI: r24 r25 r26 r27
      0x00f2: PHI (r24v6 long[]) = (r24v5 long[]), (r24v8 long[]) binds: [B:39:0x00f0, B:36:0x00d6] A[DONT_GENERATE, DONT_INLINE]
      0x00f2: PHI (r25v4 int) = (r25v3 int), (r25v6 int) binds: [B:39:0x00f0, B:36:0x00d6] A[DONT_GENERATE, DONT_INLINE]
      0x00f2: PHI (r26v3 int) = (r26v2 int), (r26v6 int) binds: [B:39:0x00f0, B:36:0x00d6] A[DONT_GENERATE, DONT_INLINE]
      0x00f2: PHI (r27v3 int) = (r27v2 int), (r27v6 int) binds: [B:39:0x00f0, B:36:0x00d6] A[DONT_GENERATE, DONT_INLINE]] */
    public final void d() {
        long[] jArr;
        long[] jArr2;
        int i10;
        int i11;
        int i12;
        int i13;
        Object[] objArr;
        long[] jArr3;
        Object[] objArr2;
        long[] jArr4;
        MutableScatterMap<Object, Object> map = this.f14510y0.getMap();
        long[] jArr5 = map.metadata;
        int length = jArr5.length - 2;
        long j10 = 255;
        char c10 = 7;
        long j11 = -9187201950435737472L;
        int i14 = 8;
        if (length >= 0) {
            int i15 = 0;
            while (true) {
                long j12 = jArr5[i15];
                if ((((~j12) << c10) & j12 & j11) != j11) {
                    int i16 = 8 - ((~(i15 - length)) >>> 31);
                    int i17 = 0;
                    while (i17 < i16) {
                        if ((j12 & j10) < 128) {
                            int i18 = (i15 << 3) + i17;
                            Object obj = map.keys[i18];
                            Object obj2 = map.values[i18];
                            if (obj2 instanceof MutableScatterSet) {
                                Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type androidx.collection.MutableScatterSet<Scope of androidx.compose.runtime.collection.ScopeMap.removeScopeIf$lambda$2>");
                                MutableScatterSet mutableScatterSet = (MutableScatterSet) obj2;
                                Object[] objArr3 = mutableScatterSet.elements;
                                long[] jArr6 = mutableScatterSet.metadata;
                                int length2 = jArr6.length - 2;
                                jArr2 = jArr5;
                                i10 = length;
                                if (length2 >= 0) {
                                    int i19 = 0;
                                    while (true) {
                                        long j13 = jArr6[i19];
                                        i11 = i16;
                                        i12 = i17;
                                        if ((((~j13) << c10) & j13 & (-9187201950435737472L)) != -9187201950435737472L) {
                                            int i20 = 8 - ((~(i19 - length2)) >>> 31);
                                            int i21 = 0;
                                            while (i21 < i20) {
                                                if ((j13 & 255) < 128) {
                                                    int i22 = (i19 << 3) + i21;
                                                    objArr2 = objArr3;
                                                    jArr4 = jArr6;
                                                    if (!this.v0.contains((DerivedState) objArr3[i22])) {
                                                        mutableScatterSet.removeElementAt(i22);
                                                    }
                                                } else {
                                                    objArr2 = objArr3;
                                                    jArr4 = jArr6;
                                                }
                                                j13 >>= 8;
                                                i21++;
                                                jArr6 = jArr4;
                                                objArr3 = objArr2;
                                            }
                                            objArr = objArr3;
                                            jArr3 = jArr6;
                                            if (i20 != 8) {
                                                break;
                                            }
                                        } else {
                                            objArr = objArr3;
                                            jArr3 = jArr6;
                                        }
                                        if (i19 == length2) {
                                            break;
                                        }
                                        i19++;
                                        i16 = i11;
                                        i17 = i12;
                                        jArr6 = jArr3;
                                        objArr3 = objArr;
                                        c10 = 7;
                                    }
                                } else {
                                    i11 = i16;
                                    i12 = i17;
                                }
                                if (mutableScatterSet.isEmpty()) {
                                    map.removeValueAt(i18);
                                }
                            } else {
                                jArr2 = jArr5;
                                i10 = length;
                                i11 = i16;
                                i12 = i17;
                                Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type Scope of androidx.compose.runtime.collection.ScopeMap.removeScopeIf$lambda$2");
                                if (!this.v0.contains((DerivedState) obj2)) {
                                    map.removeValueAt(i18);
                                }
                            }
                            i13 = 8;
                        } else {
                            jArr2 = jArr5;
                            i10 = length;
                            i11 = i16;
                            i12 = i17;
                            i13 = i14;
                        }
                        j12 >>= i13;
                        i17 = i12 + 1;
                        i14 = i13;
                        jArr5 = jArr2;
                        length = i10;
                        i16 = i11;
                        j10 = 255;
                        c10 = 7;
                    }
                    jArr = jArr5;
                    int i23 = length;
                    if (i16 != i14) {
                        break;
                    } else {
                        length = i23;
                    }
                } else {
                    jArr = jArr5;
                }
                if (i15 == length) {
                    break;
                }
                i15++;
                jArr5 = jArr;
                j10 = 255;
                c10 = 7;
                j11 = -9187201950435737472L;
                i14 = 8;
            }
        }
        MutableScatterSet<RecomposeScopeImpl> mutableScatterSet2 = this.f14509x0;
        if (!mutableScatterSet2.isNotEmpty()) {
            return;
        }
        Object[] objArr4 = mutableScatterSet2.elements;
        long[] jArr7 = mutableScatterSet2.metadata;
        int length3 = jArr7.length - 2;
        if (length3 < 0) {
            return;
        }
        int i24 = 0;
        while (true) {
            long j14 = jArr7[i24];
            if ((((~j14) << 7) & j14 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i25 = 8 - ((~(i24 - length3)) >>> 31);
                for (int i26 = 0; i26 < i25; i26++) {
                    if ((j14 & 255) < 128) {
                        int i27 = (i24 << 3) + i26;
                        if (!((RecomposeScopeImpl) objArr4[i27]).isConditional()) {
                            mutableScatterSet2.removeElementAt(i27);
                        }
                    }
                    j14 >>= 8;
                }
                if (i25 != 8) {
                    return;
                }
            }
            if (i24 == length3) {
                return;
            } else {
                i24++;
            }
        }
    }

    @Override // androidx.compose.runtime.ReusableComposition
    public void deactivate() {
        synchronized (this.f14505s0) {
            try {
                boolean z10 = this.slotTable.getGroupsSize() > 0;
                if (z10 || (!this.f14506t0.isEmpty())) {
                    Trace trace = Trace.INSTANCE;
                    Object objBeginSection = trace.beginSection("Compose:deactivate");
                    try {
                        a aVar = new a(this.f14506t0);
                        if (z10) {
                            this.f14503q0.onBeginChanges();
                            SlotWriter slotWriterOpenWriter = this.slotTable.openWriter();
                            try {
                                ComposerKt.deactivateCurrentGroup(slotWriterOpenWriter, aVar);
                                Unit unit = Unit.INSTANCE;
                                slotWriterOpenWriter.close(true);
                                this.f14503q0.onEndChanges();
                                aVar.b();
                            } catch (Throwable th2) {
                                slotWriterOpenWriter.close(false);
                                throw th2;
                            }
                        }
                        aVar.a();
                        Unit unit2 = Unit.INSTANCE;
                        trace.endSection(objBeginSection);
                    } catch (Throwable th3) {
                        Trace.INSTANCE.endSection(objBeginSection);
                        throw th3;
                    }
                }
                this.v0.clear();
                this.f14510y0.clear();
                this.H0.clear();
                this.E0.clear();
                this.F0.clear();
                this.M0.deactivate$runtime_release();
                Unit unit3 = Unit.INSTANCE;
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public <R> R delegateInvalidations(@Nullable ControlledComposition to, int groupIndex, @NotNull Function0<? extends R> block) {
        if (to == null || Intrinsics.areEqual(to, this) || groupIndex < 0) {
            return block.invoke();
        }
        this.J0 = (CompositionImpl) to;
        this.K0 = groupIndex;
        try {
            return block.invoke();
        } finally {
            this.J0 = null;
            this.K0 = 0;
        }
    }

    @Override // androidx.compose.runtime.Composition
    public void dispose() {
        synchronized (this.f14505s0) {
            try {
                if (!(!this.M0.getIsComposing())) {
                    PreconditionsKt.throwIllegalStateException("Composition is disposed while composing. If dispose is triggered by a call in @Composable function, consider wrapping it with SideEffect block.");
                }
                if (!this.P0) {
                    this.P0 = true;
                    this.composable = ComposableSingletons$CompositionKt.INSTANCE.m2060getLambda2$runtime_release();
                    ChangeList deferredChanges$runtime_release = this.M0.getDeferredChanges();
                    if (deferredChanges$runtime_release != null) {
                        c(deferredChanges$runtime_release);
                    }
                    boolean z10 = this.slotTable.getGroupsSize() > 0;
                    if (z10 || (!this.f14506t0.isEmpty())) {
                        a aVar = new a(this.f14506t0);
                        if (z10) {
                            this.f14503q0.onBeginChanges();
                            SlotWriter slotWriterOpenWriter = this.slotTable.openWriter();
                            try {
                                ComposerKt.removeCurrentGroup(slotWriterOpenWriter, aVar);
                                Unit unit = Unit.INSTANCE;
                                slotWriterOpenWriter.close(true);
                                this.f14503q0.clear();
                                this.f14503q0.onEndChanges();
                                aVar.b();
                            } catch (Throwable th2) {
                                slotWriterOpenWriter.close(false);
                                throw th2;
                            }
                        }
                        aVar.a();
                    }
                    this.M0.dispose$runtime_release();
                }
                Unit unit2 = Unit.INSTANCE;
            } catch (Throwable th3) {
                throw th3;
            }
        }
        this.f14502p0.unregisterComposition$runtime_release(this);
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public void disposeUnusedMovableContent(@NotNull MovableContentState state) {
        a aVar = new a(this.f14506t0);
        SlotWriter slotWriterOpenWriter = state.getSlotTable().openWriter();
        try {
            ComposerKt.removeCurrentGroup(slotWriterOpenWriter, aVar);
            Unit unit = Unit.INSTANCE;
            slotWriterOpenWriter.close(true);
            aVar.b();
        } catch (Throwable th2) {
            slotWriterOpenWriter.close(false);
            throw th2;
        }
    }

    public final void e() {
        AtomicReference<Object> atomicReference = this.f14504r0;
        Object andSet = atomicReference.getAndSet(CompositionKt.f14521a);
        if (andSet != null) {
            if (Intrinsics.areEqual(andSet, CompositionKt.f14521a)) {
                ComposerKt.composeRuntimeError("pending composition has not been applied");
                throw new KotlinNothingValueException();
            }
            if (andSet instanceof Set) {
                b((Set) andSet, true);
                return;
            }
            if (!(andSet instanceof Object[])) {
                ComposerKt.composeRuntimeError("corrupt pendingModifications drain: " + atomicReference);
                throw new KotlinNothingValueException();
            }
            for (Set<? extends Object> set : (Set[]) andSet) {
                b(set, true);
            }
        }
    }

    public final void f() {
        AtomicReference<Object> atomicReference = this.f14504r0;
        Object andSet = atomicReference.getAndSet(null);
        if (Intrinsics.areEqual(andSet, CompositionKt.f14521a)) {
            return;
        }
        if (andSet instanceof Set) {
            b((Set) andSet, false);
            return;
        }
        if (andSet instanceof Object[]) {
            for (Set<? extends Object> set : (Set[]) andSet) {
                b(set, false);
            }
            return;
        }
        if (andSet == null) {
            ComposerKt.composeRuntimeError("calling recordModificationsOf and applyChanges concurrently is not supported");
            throw new KotlinNothingValueException();
        }
        ComposerKt.composeRuntimeError("corrupt pendingModifications drain: " + atomicReference);
        throw new KotlinNothingValueException();
    }

    /* JADX WARN: Code duplicated, block: B:49:0x00ac A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:50:0x00ae A[Catch: all -> 0x001e, LOOP:0: B:35:0x006f->B:50:0x00ae, LOOP_END, TryCatch #0 {all -> 0x001e, blocks: (B:4:0x000b, B:6:0x0010, B:14:0x0023, B:16:0x0029, B:18:0x0031, B:21:0x0035, B:23:0x003b, B:25:0x0046, B:27:0x004a, B:28:0x0053, B:30:0x005f, B:32:0x0063, B:35:0x006f, B:37:0x007f, B:39:0x008b, B:41:0x0095, B:46:0x00a4, B:50:0x00ae, B:51:0x00b1, B:54:0x00b6), top: B:66:0x000b }] */
    /* JADX WARN: Code duplicated, block: B:54:0x00b6 A[Catch: all -> 0x001e, EDGE_INSN: B:54:0x00b6->B:55:0x00bb BREAK  A[LOOP:0: B:35:0x006f->B:50:0x00ae], TRY_LEAVE, TryCatch #0 {all -> 0x001e, blocks: (B:4:0x000b, B:6:0x0010, B:14:0x0023, B:16:0x0029, B:18:0x0031, B:21:0x0035, B:23:0x003b, B:25:0x0046, B:27:0x004a, B:28:0x0053, B:30:0x005f, B:32:0x0063, B:35:0x006f, B:37:0x007f, B:39:0x008b, B:41:0x0095, B:46:0x00a4, B:50:0x00ae, B:51:0x00b1, B:54:0x00b6), top: B:66:0x000b }] */
    /* JADX WARN: Code duplicated, block: B:69:0x00b6 A[SYNTHETIC] */
    public final InvalidationResult g(RecomposeScopeImpl recomposeScopeImpl, Anchor anchor, Object obj) {
        int i10;
        synchronized (this.f14505s0) {
            try {
                CompositionImpl compositionImpl = this.J0;
                CompositionImpl compositionImpl2 = null;
                if (compositionImpl != null) {
                    if (!this.slotTable.groupContainsAnchor(this.K0, anchor)) {
                        compositionImpl = null;
                    }
                    compositionImpl2 = compositionImpl;
                }
                if (compositionImpl2 == null) {
                    if (isComposing() && this.M0.tryImminentInvalidation$runtime_release(recomposeScopeImpl, obj)) {
                        return InvalidationResult.IMMINENT;
                    }
                    CompositionObserver compositionObserverI = i();
                    if (obj == null) {
                        this.H0.set(recomposeScopeImpl, ScopeInvalidated.INSTANCE);
                    } else if (compositionObserverI != null || (obj instanceof DerivedState)) {
                        Object obj2 = this.H0.getMap().get(recomposeScopeImpl);
                        if (obj2 != null) {
                            if (!(obj2 instanceof MutableScatterSet)) {
                                if (obj2 != ScopeInvalidated.INSTANCE) {
                                    this.H0.add(recomposeScopeImpl, obj);
                                    break;
                                }
                            } else {
                                MutableScatterSet mutableScatterSet = (MutableScatterSet) obj2;
                                Object[] objArr = mutableScatterSet.elements;
                                long[] jArr = mutableScatterSet.metadata;
                                int length = jArr.length - 2;
                                if (length < 0) {
                                    this.H0.add(recomposeScopeImpl, obj);
                                    break;
                                }
                                int i11 = 0;
                                loop0: while (true) {
                                    long j10 = jArr[i11];
                                    if ((((~j10) << 7) & j10 & (-9187201950435737472L)) == -9187201950435737472L) {
                                        if (i11 == length) {
                                            this.H0.add(recomposeScopeImpl, obj);
                                            break;
                                        }
                                        i11++;
                                    } else {
                                        int i12 = 8;
                                        int i13 = 8 - ((~(i11 - length)) >>> 31);
                                        int i14 = 0;
                                        while (i14 < i13) {
                                            if ((j10 & 255) >= 128) {
                                                i10 = i12;
                                            } else {
                                                if (objArr[(i11 << 3) + i14] == ScopeInvalidated.INSTANCE) {
                                                    break loop0;
                                                }
                                                i10 = 8;
                                            }
                                            j10 >>= i10;
                                            i14++;
                                            i12 = i10;
                                        }
                                        if (i13 == i12) {
                                            if (i11 == length) {
                                                i11++;
                                            }
                                        }
                                        this.H0.add(recomposeScopeImpl, obj);
                                        break;
                                    }
                                }
                            }
                        } else {
                            this.H0.add(recomposeScopeImpl, obj);
                            break;
                        }
                    } else {
                        this.H0.set(recomposeScopeImpl, ScopeInvalidated.INSTANCE);
                    }
                }
                if (compositionImpl2 != null) {
                    return compositionImpl2.g(recomposeScopeImpl, anchor, obj);
                }
                this.f14502p0.invalidate$runtime_release(this);
                return isComposing() ? InvalidationResult.DEFERRED : InvalidationResult.SCHEDULED;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @NotNull
    public final Function2<Composer, Integer, Unit> getComposable() {
        return this.composable;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.runtime.CompositionServices
    @Nullable
    public <T> T getCompositionService(@NotNull CompositionServiceKey<T> key) {
        if (Intrinsics.areEqual(key, CompositionKt.getCompositionImplServiceKey())) {
            return this;
        }
        return null;
    }

    @TestOnly
    @NotNull
    public final List<RecomposeScopeImpl> getConditionalScopes$runtime_release() {
        return CollectionsKt___CollectionsKt.toList(this.f14509x0.asSet());
    }

    @TestOnly
    @NotNull
    public final Set<Object> getDerivedStateDependencies$runtime_release() {
        return this.f14510y0.getMap().asMap().keySet();
    }

    @Override // androidx.compose.runtime.Composition
    public boolean getHasInvalidations() {
        boolean z10;
        synchronized (this.f14505s0) {
            z10 = this.H0.getSize() > 0;
        }
        return z10;
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public boolean getHasPendingChanges() {
        boolean hasPendingChanges$runtime_release;
        synchronized (this.f14505s0) {
            hasPendingChanges$runtime_release = this.M0.getHasPendingChanges$runtime_release();
        }
        return hasPendingChanges$runtime_release;
    }

    @TestOnly
    @NotNull
    public final Set<Object> getObservedObjects$runtime_release() {
        return this.v0.getMap().asMap().keySet();
    }

    @NotNull
    /* JADX INFO: renamed from: getObserverHolder$runtime_release, reason: from getter */
    public final CompositionObserverHolder getObserverHolder() {
        return this.observerHolder;
    }

    /* JADX INFO: renamed from: getPendingInvalidScopes$runtime_release, reason: from getter */
    public final boolean getPendingInvalidScopes() {
        return this.pendingInvalidScopes;
    }

    @NotNull
    public final CoroutineContext getRecomposeContext() {
        CoroutineContext coroutineContext = this.N0;
        return coroutineContext == null ? this.f14502p0.getRecomposeCoroutineContext$runtime_release() : coroutineContext;
    }

    @NotNull
    /* JADX INFO: renamed from: getSlotTable$runtime_release, reason: from getter */
    public final SlotTable getSlotTable() {
        return this.slotTable;
    }

    public final void h(Object obj) {
        Object obj2 = this.v0.getMap().get(obj);
        if (obj2 == null) {
            return;
        }
        boolean z10 = obj2 instanceof MutableScatterSet;
        ScopeMap<Object, RecomposeScopeImpl> scopeMap = this.G0;
        if (!z10) {
            RecomposeScopeImpl recomposeScopeImpl = (RecomposeScopeImpl) obj2;
            if (recomposeScopeImpl.invalidateForResult(obj) == InvalidationResult.IMMINENT) {
                scopeMap.add(obj, recomposeScopeImpl);
                return;
            }
            return;
        }
        MutableScatterSet mutableScatterSet = (MutableScatterSet) obj2;
        Object[] objArr = mutableScatterSet.elements;
        long[] jArr = mutableScatterSet.metadata;
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
                        RecomposeScopeImpl recomposeScopeImpl2 = (RecomposeScopeImpl) objArr[(i10 << 3) + i12];
                        if (recomposeScopeImpl2.invalidateForResult(obj) == InvalidationResult.IMMINENT) {
                            scopeMap.add(obj, recomposeScopeImpl2);
                        }
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

    public final CompositionObserver i() {
        CompositionObserverHolder compositionObserverHolder = this.observerHolder;
        if (compositionObserverHolder.getRoot()) {
            return compositionObserverHolder.getObserver();
        }
        CompositionObserverHolder observerHolder$runtime_release = this.f14502p0.getObserverHolder$runtime_release();
        CompositionObserver observer = observerHolder$runtime_release != null ? observerHolder$runtime_release.getObserver() : null;
        if (!Intrinsics.areEqual(observer, compositionObserverHolder.getObserver())) {
            compositionObserverHolder.setObserver(observer);
        }
        return observer;
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public void insertMovableContent(@NotNull List<Pair<MovableContentStateReference, MovableContentStateReference>> references) throws Exception {
        int i10;
        boolean z10;
        Set<RememberObserver> set = this.f14506t0;
        int size = references.size();
        int i11 = 0;
        int i12 = 0;
        while (true) {
            i10 = 1;
            if (i12 >= size) {
                z10 = true;
                break;
            } else {
                if (!Intrinsics.areEqual(references.get(i12).getFirst().getComposition(), this)) {
                    z10 = false;
                    break;
                }
                i12++;
            }
        }
        ComposerKt.runtimeCheck(z10);
        try {
            this.M0.insertMovableContentReferences(references);
            Unit unit = Unit.INSTANCE;
        } catch (Throwable th2) {
            try {
                if (!set.isEmpty()) {
                    new ArrayList();
                    new ArrayList();
                    new ArrayList();
                    new ArrayList();
                    DefaultConstructorMarker defaultConstructorMarker = null;
                    new MutableIntList(i11, i10, defaultConstructorMarker);
                    new MutableIntList(i11, i10, defaultConstructorMarker);
                    if (!set.isEmpty()) {
                        Object objBeginSection = Trace.INSTANCE.beginSection("Compose:abandons");
                        try {
                            Iterator<RememberObserver> it = set.iterator();
                            while (it.hasNext()) {
                                RememberObserver next = it.next();
                                it.remove();
                                next.onAbandoned();
                            }
                            Unit unit2 = Unit.INSTANCE;
                        } finally {
                            Trace.INSTANCE.endSection(objBeginSection);
                        }
                    }
                }
                throw th2;
            } catch (Exception e5) {
                abandonChanges();
                throw e5;
            }
        }
    }

    @Override // androidx.compose.runtime.RecomposeScopeOwner
    @NotNull
    public InvalidationResult invalidate(@NotNull RecomposeScopeImpl scope, @Nullable Object instance) {
        CompositionImpl compositionImpl;
        if (scope.getDefaultsInScope()) {
            scope.setDefaultsInvalid(true);
        }
        Anchor anchor = scope.getAnchor();
        if (anchor == null || !anchor.getValid()) {
            return InvalidationResult.IGNORED;
        }
        if (this.slotTable.ownsAnchor(anchor)) {
            return !scope.getCanRecompose() ? InvalidationResult.IGNORED : g(scope, anchor, instance);
        }
        synchronized (this.f14505s0) {
            compositionImpl = this.J0;
        }
        return (compositionImpl != null && compositionImpl.isComposing() && compositionImpl.M0.tryImminentInvalidation$runtime_release(scope, instance)) ? InvalidationResult.IMMINENT : InvalidationResult.IGNORED;
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public void invalidateAll() {
        synchronized (this.f14505s0) {
            try {
                for (Object obj : this.slotTable.getSlots()) {
                    RecomposeScopeImpl recomposeScopeImpl = obj instanceof RecomposeScopeImpl ? (RecomposeScopeImpl) obj : null;
                    if (recomposeScopeImpl != null) {
                        recomposeScopeImpl.invalidate();
                    }
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void invalidateGroupsWithKey(int key) {
        List<RecomposeScopeImpl> listInvalidateGroupsWithKey$runtime_release;
        synchronized (this.f14505s0) {
            listInvalidateGroupsWithKey$runtime_release = this.slotTable.invalidateGroupsWithKey$runtime_release(key);
        }
        if (listInvalidateGroupsWithKey$runtime_release != null) {
            int size = listInvalidateGroupsWithKey$runtime_release.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (listInvalidateGroupsWithKey$runtime_release.get(i10).invalidateForResult(null) != InvalidationResult.IGNORED) {
                }
            }
            return;
        }
        if (this.M0.forceRecomposeScopes$runtime_release()) {
            this.f14502p0.invalidate$runtime_release(this);
        }
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public boolean isComposing() {
        return this.M0.getIsComposing();
    }

    @Override // androidx.compose.runtime.Composition
    /* JADX INFO: renamed from: isDisposed, reason: from getter */
    public boolean getP0() {
        return this.P0;
    }

    /* JADX INFO: renamed from: isRoot, reason: from getter */
    public final boolean getIsRoot() {
        return this.isRoot;
    }

    @NotNull
    public final CompositionObserverHandle observe$runtime_release(@NotNull final CompositionObserver observer) {
        synchronized (this.f14505s0) {
            this.observerHolder.setObserver(observer);
            this.observerHolder.setRoot(true);
            Unit unit = Unit.INSTANCE;
        }
        return new CompositionObserverHandle() { // from class: androidx.compose.runtime.CompositionImpl$observe$2
            @Override // androidx.compose.runtime.tooling.CompositionObserverHandle
            public void dispose() {
                Object obj = this.f14519a.f14505s0;
                CompositionImpl compositionImpl = this.f14519a;
                CompositionObserver compositionObserver = observer;
                synchronized (obj) {
                    try {
                        if (Intrinsics.areEqual(compositionImpl.getObserverHolder().getObserver(), compositionObserver)) {
                            compositionImpl.getObserverHolder().setObserver(null);
                            compositionImpl.getObserverHolder().setRoot(false);
                        }
                        Unit unit2 = Unit.INSTANCE;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
        };
    }

    /* JADX WARN: Code duplicated, block: B:20:0x005b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:21:0x005d A[LOOP:0: B:7:0x001e->B:21:0x005d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:34:0x007d A[SYNTHETIC] */
    @Override // androidx.compose.runtime.ControlledComposition
    public boolean observesAnyOf(@NotNull Set<? extends Object> values) {
        boolean z10 = values instanceof ScatterSetWrapper;
        ScopeMap<Object, DerivedState<?>> scopeMap = this.f14510y0;
        ScopeMap<Object, RecomposeScopeImpl> scopeMap2 = this.v0;
        if (z10) {
            ScatterSet set$runtime_release = ((ScatterSetWrapper) values).getSet$runtime_release();
            Object[] objArr = set$runtime_release.elements;
            long[] jArr = set$runtime_release.metadata;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i10 = 0;
                loop0: while (true) {
                    long j10 = jArr[i10];
                    if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i11 = 8 - ((~(i10 - length)) >>> 31);
                        for (int i12 = 0; i12 < i11; i12++) {
                            if ((255 & j10) < 128) {
                                Object obj = objArr[(i10 << 3) + i12];
                                if (scopeMap2.contains(obj) || scopeMap.contains(obj)) {
                                    break loop0;
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
                return true;
            }
        } else {
            for (Object obj2 : values) {
                if (scopeMap2.contains(obj2) || scopeMap.contains(obj2)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public void prepareCompose(@NotNull Function0<Unit> block) {
        this.M0.prepareCompose$runtime_release(block);
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public boolean recompose() {
        boolean zRecompose$runtime_release;
        synchronized (this.f14505s0) {
            try {
                e();
                try {
                    ScopeMap<RecomposeScopeImpl, Object> scopeMap = this.H0;
                    this.H0 = new ScopeMap<>();
                    try {
                        CompositionObserver compositionObserverI = i();
                        if (compositionObserverI != null) {
                            Map<RecomposeScopeImpl, Set<Object>> mapAsMap = scopeMap.asMap();
                            Intrinsics.checkNotNull(mapAsMap, "null cannot be cast to non-null type kotlin.collections.Map<androidx.compose.runtime.RecomposeScope, kotlin.collections.Set<kotlin.Any>?>");
                            compositionObserverI.onBeginComposition(this, mapAsMap);
                        }
                        zRecompose$runtime_release = this.M0.recompose$runtime_release(scopeMap);
                        if (!zRecompose$runtime_release) {
                            f();
                        }
                        if (compositionObserverI != null) {
                            compositionObserverI.onEndComposition(this);
                        }
                    } catch (Exception e5) {
                        this.H0 = scopeMap;
                        throw e5;
                    }
                } catch (Throwable th2) {
                    try {
                        int i10 = 1;
                        if (!this.f14506t0.isEmpty()) {
                            Set<RememberObserver> set = this.f14506t0;
                            new ArrayList();
                            new ArrayList();
                            new ArrayList();
                            new ArrayList();
                            int i11 = 0;
                            DefaultConstructorMarker defaultConstructorMarker = null;
                            new MutableIntList(i11, i10, defaultConstructorMarker);
                            new MutableIntList(i11, i10, defaultConstructorMarker);
                            if (true ^ set.isEmpty()) {
                                Object objBeginSection = Trace.INSTANCE.beginSection("Compose:abandons");
                                try {
                                    Iterator<RememberObserver> it = set.iterator();
                                    while (it.hasNext()) {
                                        RememberObserver next = it.next();
                                        it.remove();
                                        next.onAbandoned();
                                    }
                                    Unit unit = Unit.INSTANCE;
                                } finally {
                                    Trace.INSTANCE.endSection(objBeginSection);
                                }
                            }
                        }
                        throw th2;
                    } catch (Exception e7) {
                        abandonChanges();
                        throw e7;
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return zRecompose$runtime_release;
    }

    @Override // androidx.compose.runtime.RecomposeScopeOwner
    public void recomposeScopeReleased(@NotNull RecomposeScopeImpl scope) {
        this.pendingInvalidScopes = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.runtime.ControlledComposition
    public void recordModificationsOf(@NotNull Set<? extends Object> values) {
        Object objPlus;
        while (true) {
            Object obj = this.f14504r0.get();
            if (obj == null || Intrinsics.areEqual(obj, CompositionKt.f14521a)) {
                objPlus = values;
            } else if (obj instanceof Set) {
                objPlus = new Set[]{obj, values};
            } else {
                if (!(obj instanceof Object[])) {
                    throw new IllegalStateException(("corrupt pendingModifications: " + this.f14504r0).toString());
                }
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.collections.Set<kotlin.Any>>");
                objPlus = ArraysKt___ArraysJvmKt.plus((Set<? extends Object>[]) obj, values);
            }
            AtomicReference<Object> atomicReference = this.f14504r0;
            do {
                if (atomicReference.compareAndSet(obj, objPlus)) {
                    if (obj == null) {
                        synchronized (this.f14505s0) {
                            f();
                            Unit unit = Unit.INSTANCE;
                        }
                        return;
                    }
                    return;
                }
            } while (atomicReference.get() == obj);
        }
    }

    @Override // androidx.compose.runtime.ControlledComposition, androidx.compose.runtime.RecomposeScopeOwner
    public void recordReadOf(@NotNull Object value) {
        RecomposeScopeImpl currentRecomposeScope$runtime_release;
        boolean z10;
        boolean z11;
        int i10;
        ComposerImpl composerImpl = this.M0;
        if (composerImpl.getAreChildrenComposing$runtime_release() || (currentRecomposeScope$runtime_release = composerImpl.getCurrentRecomposeScope$runtime_release()) == null) {
            return;
        }
        boolean z12 = true;
        currentRecomposeScope$runtime_release.setUsed(true);
        if (currentRecomposeScope$runtime_release.recordRead(value)) {
            return;
        }
        if (value instanceof StateObjectImpl) {
            ((StateObjectImpl) value).m2183recordReadInh_f27i8$runtime_release(ReaderKind.m2170constructorimpl(1));
        }
        this.v0.add(value, currentRecomposeScope$runtime_release);
        if (value instanceof DerivedState) {
            DerivedState<?> derivedState = (DerivedState) value;
            DerivedState.Record<?> currentRecord = derivedState.getCurrentRecord();
            ScopeMap<Object, DerivedState<?>> scopeMap = this.f14510y0;
            scopeMap.removeScope(value);
            ObjectIntMap<StateObject> dependencies = currentRecord.getDependencies();
            Object[] objArr = dependencies.keys;
            long[] jArr = dependencies.metadata;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i11 = 0;
                while (true) {
                    long j10 = jArr[i11];
                    if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i12 = 8;
                        int i13 = 8 - ((~(i11 - length)) >>> 31);
                        int i14 = 0;
                        while (i14 < i13) {
                            if ((j10 & 255) < 128) {
                                StateObject stateObject = (StateObject) objArr[(i11 << 3) + i14];
                                if (stateObject instanceof StateObjectImpl) {
                                    z11 = true;
                                    ((StateObjectImpl) stateObject).m2183recordReadInh_f27i8$runtime_release(ReaderKind.m2170constructorimpl(1));
                                } else {
                                    z11 = true;
                                }
                                scopeMap.add(stateObject, value);
                                i10 = 8;
                            } else {
                                z11 = z12;
                                i10 = i12;
                            }
                            j10 >>= i10;
                            i14++;
                            i12 = i10;
                            z12 = z11;
                        }
                        z10 = z12;
                        if (i13 != i12) {
                            break;
                        }
                    } else {
                        z10 = z12;
                    }
                    if (i11 == length) {
                        break;
                    }
                    i11++;
                    z12 = z10;
                }
            }
            currentRecomposeScope$runtime_release.recordDerivedStateValue(derivedState, currentRecord.getCurrentValue());
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x005b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:23:0x005d A[Catch: all -> 0x0053, LOOP:0: B:11:0x0023->B:23:0x005d, LOOP_END, TryCatch #0 {all -> 0x0053, blocks: (B:4:0x0003, B:6:0x0012, B:8:0x0016, B:11:0x0023, B:13:0x0033, B:15:0x003f, B:17:0x0048, B:20:0x0055, B:23:0x005d, B:24:0x0060, B:25:0x0065), top: B:30:0x0003 }] */
    /* JADX WARN: Code duplicated, block: B:33:0x0065 A[EDGE_INSN: B:33:0x0065->B:25:0x0065 BREAK  A[LOOP:0: B:11:0x0023->B:23:0x005d], SYNTHETIC] */
    @Override // androidx.compose.runtime.ControlledComposition
    public void recordWriteOf(@NotNull Object value) {
        synchronized (this.f14505s0) {
            try {
                h(value);
                Object obj = this.f14510y0.getMap().get(value);
                if (obj != null) {
                    if (obj instanceof MutableScatterSet) {
                        MutableScatterSet mutableScatterSet = (MutableScatterSet) obj;
                        Object[] objArr = mutableScatterSet.elements;
                        long[] jArr = mutableScatterSet.metadata;
                        int length = jArr.length - 2;
                        if (length >= 0) {
                            int i10 = 0;
                            while (true) {
                                long j10 = jArr[i10];
                                if ((((~j10) << 7) & j10 & (-9187201950435737472L)) == -9187201950435737472L) {
                                    if (i10 != length) {
                                        break;
                                        break;
                                    }
                                    i10++;
                                } else {
                                    int i11 = 8 - ((~(i10 - length)) >>> 31);
                                    for (int i12 = 0; i12 < i11; i12++) {
                                        if ((255 & j10) < 128) {
                                            h((DerivedState) objArr[(i10 << 3) + i12]);
                                        }
                                        j10 >>= 8;
                                    }
                                    if (i11 != 8) {
                                        break;
                                    } else if (i10 != length) {
                                        break;
                                    } else {
                                        i10++;
                                    }
                                }
                            }
                        }
                    } else {
                        h((DerivedState) obj);
                    }
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void removeDerivedStateObservation$runtime_release(@NotNull DerivedState<?> state) {
        if (this.v0.contains(state)) {
            return;
        }
        this.f14510y0.removeScope(state);
    }

    public final void removeObservation$runtime_release(@NotNull Object instance, @NotNull RecomposeScopeImpl scope) {
        this.v0.remove(instance, scope);
    }

    public final void setComposable(@NotNull Function2<? super Composer, ? super Integer, Unit> function2) {
        this.composable = function2;
    }

    @Override // androidx.compose.runtime.Composition
    public void setContent(@NotNull Function2<? super Composer, ? super Integer, Unit> content) {
        if (!(!this.P0)) {
            PreconditionsKt.throwIllegalStateException("The composition is disposed");
        }
        this.composable = content;
        this.f14502p0.composeInitial$runtime_release(this, content);
    }

    @Override // androidx.compose.runtime.ReusableComposition
    public void setContentWithReuse(@NotNull Function2<? super Composer, ? super Integer, Unit> content) {
        ComposerImpl composerImpl = this.M0;
        composerImpl.startReuseFromRoot();
        if (!(!this.P0)) {
            PreconditionsKt.throwIllegalStateException("The composition is disposed");
        }
        this.composable = content;
        this.f14502p0.composeInitial$runtime_release(this, content);
        composerImpl.endReuseFromRoot();
    }

    public final void setPendingInvalidScopes$runtime_release(boolean z10) {
        this.pendingInvalidScopes = z10;
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public void verifyConsistent() {
        synchronized (this.f14505s0) {
            try {
                if (!isComposing()) {
                    this.M0.verifyConsistent$runtime_release();
                    this.slotTable.verifyWellFormed();
                    j(this.slotTable);
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static /* synthetic */ void getPendingInvalidScopes$runtime_release$annotations() {
    }

    public static /* synthetic */ void getSlotTable$runtime_release$annotations() {
    }

    public /* synthetic */ CompositionImpl(CompositionContext compositionContext, Applier applier, CoroutineContext coroutineContext, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(compositionContext, applier, (i10 & 4) != 0 ? null : coroutineContext);
    }
}
