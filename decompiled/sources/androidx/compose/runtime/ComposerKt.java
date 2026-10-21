package androidx.compose.runtime;

import androidx.camera.camera2.internal.h0;
import androidx.collection.MutableScatterMap;
import androidx.collection.MutableScatterSet;
import androidx.collection.ScatterSetKt;
import androidx.exifinterface.media.ExifInterface;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import m0.d;
import m0.l;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Composer.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\\\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0001\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b(\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a5\u0010\u0007\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0011\u0010\u0006\u001a\r\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0002\b\u0005H\u0087\b¢\u0006\u0004\b\u0007\u0010\b\u001a\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\nH\u0007\u001a \u0010\u000f\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\u00012\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\nH\u0007\u001a\b\u0010\u0010\u001a\u00020\u0002H\u0007\u001a\u0018\u0010\u0012\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\nH\u0007\u001a(\u0010\u0012\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\nH\u0007\u001a\b\u0010\u0015\u001a\u00020\fH\u0007\u001a\u0010\u0010\u0016\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\u0001H\u0007\u001a\u0014\u0010\u001a\u001a\u00020\f*\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u0018H\u0000\u001a7\u0010 \u001a\u00020\f\"\u0004\b\u0000\u0010\u001b*\u00020\u00172\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\u0018\u0010\u001f\u001a\u0014\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00028\u00000\u001eH\u0080\b\u001a\u0014\u0010!\u001a\u00020\f*\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u0018H\u0000\u001a*\u0010$\u001a\u00020\f2\u0006\u0010\"\u001a\u00020\u00022\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\n0\u0004H\u0080\b\u0082\u0002\b\n\u0006\b\u0000\u001a\u0002\u0010\u0001\u001a\u0010\u0010$\u001a\u00020\f2\u0006\u0010\"\u001a\u00020\u0002H\u0000\u001a\u0010\u0010'\u001a\u00020&2\u0006\u0010%\u001a\u00020\nH\u0000\u001a\u0010\u0010(\u001a\u00020\f2\u0006\u0010%\u001a\u00020\nH\u0000\"\u001a\u0010)\u001a\u00020\r8\u0000X\u0081T¢\u0006\f\n\u0004\b)\u0010*\u0012\u0004\b+\u0010,\" \u00103\u001a\u00020-8\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b.\u0010/\u0012\u0004\b2\u0010,\u001a\u0004\b0\u00101\"\u001a\u00104\u001a\u00020\r8\u0000X\u0081T¢\u0006\f\n\u0004\b4\u0010*\u0012\u0004\b5\u0010,\" \u00109\u001a\u00020-8\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b6\u0010/\u0012\u0004\b8\u0010,\u001a\u0004\b7\u00101\"\u001a\u0010:\u001a\u00020\r8\u0000X\u0081T¢\u0006\f\n\u0004\b:\u0010*\u0012\u0004\b;\u0010,\" \u0010?\u001a\u00020-8\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b<\u0010/\u0012\u0004\b>\u0010,\u001a\u0004\b=\u00101\"\u001a\u0010@\u001a\u00020\r8\u0000X\u0081T¢\u0006\f\n\u0004\b@\u0010*\u0012\u0004\bA\u0010,\" \u0010E\u001a\u00020-8\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\bB\u0010/\u0012\u0004\bD\u0010,\u001a\u0004\bC\u00101\"\u001a\u0010F\u001a\u00020\r8\u0000X\u0081T¢\u0006\f\n\u0004\bF\u0010*\u0012\u0004\bG\u0010,\" \u0010K\u001a\u00020-8\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\bH\u0010/\u0012\u0004\bJ\u0010,\u001a\u0004\bI\u00101\"\u001a\u0010L\u001a\u00020\r8\u0000X\u0081T¢\u0006\f\n\u0004\bL\u0010*\u0012\u0004\bM\u0010,\" \u0010Q\u001a\u00020-8\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\bN\u0010/\u0012\u0004\bP\u0010,\u001a\u0004\bO\u00101\"\u001a\u0010R\u001a\u00020\r8\u0000X\u0081T¢\u0006\f\n\u0004\bR\u0010*\u0012\u0004\bS\u0010,\"\u0018\u0010T\u001a\u00020\u0002*\u00020\u00178@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bT\u0010U\"\u0018\u0010T\u001a\u00020\u0002*\u00020V8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bT\u0010W¨\u0006X"}, d2 = {ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/compose/runtime/Composer;", "", "invalid", "Lkotlin/Function0;", "Landroidx/compose/runtime/DisallowComposableCalls;", "block", "cache", "(Landroidx/compose/runtime/Composer;ZLkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "composer", "", "sourceInformation", "", "", "key", "sourceInformationMarkerStart", "isTraceInProgress", "info", "traceEventStart", "dirty1", "dirty2", "traceEventEnd", "sourceInformationMarkerEnd", "Landroidx/compose/runtime/SlotWriter;", "Landroidx/compose/runtime/RememberManager;", "rememberManager", "removeCurrentGroup", "R", "Landroidx/compose/runtime/Anchor;", "anchor", "Lkotlin/Function2;", "cb", "withAfterAnchorInfo", "deactivateCurrentGroup", "value", "lazyMessage", "runtimeCheck", "message", "", "composeRuntimeError", "composeImmediateRuntimeError", "invocationKey", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getInvocationKey$annotations", "()V", "", "b", "Ljava/lang/Object;", "getInvocation", "()Ljava/lang/Object;", "getInvocation$annotations", "invocation", "providerKey", "getProviderKey$annotations", "c", "getProvider", "getProvider$annotations", "provider", "compositionLocalMapKey", "getCompositionLocalMapKey$annotations", "d", "getCompositionLocalMap", "getCompositionLocalMap$annotations", "compositionLocalMap", "providerValuesKey", "getProviderValuesKey$annotations", "e", "getProviderValues", "getProviderValues$annotations", "providerValues", "providerMapsKey", "getProviderMapsKey$annotations", "f", "getProviderMaps", "getProviderMaps$annotations", "providerMaps", "referenceKey", "getReferenceKey$annotations", "g", "getReference", "getReference$annotations", "reference", "reuseKey", "getReuseKey$annotations", "isAfterFirstChild", "(Landroidx/compose/runtime/SlotWriter;)Z", "Landroidx/compose/runtime/SlotReader;", "(Landroidx/compose/runtime/SlotReader;)Z", "runtime_release"}, k = 2, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nComposer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 SlotTable.kt\nandroidx/compose/runtime/SlotWriter\n+ 4 SlotTable.kt\nandroidx/compose/runtime/SlotTable\n*L\n1#1,4584:1\n4186#1,8:4593\n4186#1,8:4608\n4553#1,7:4617\n4553#1,7:4632\n1#2:4585\n2272#3,7:4586\n2280#3:4601\n2262#3,6:4602\n2269#3:4616\n158#4,8:4624\n*S KotlinDebug\n*F\n+ 1 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n4168#1:4593,8\n4223#1:4608,8\n4243#1:4617,7\n4561#1:4632,7\n4159#1:4586,7\n4159#1:4601\n4214#1:4602,6\n4214#1:4616\n4406#1:4624,8\n*E\n"})
public final class ComposerKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public static CompositionTracer f14493a = null;
    public static final int compositionLocalMapKey = 202;
    public static final int invocationKey = 200;
    public static final int providerKey = 201;
    public static final int providerMapsKey = 204;
    public static final int providerValuesKey = 203;
    public static final int referenceKey = 206;
    public static final int reuseKey = 207;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final OpaqueKey f14494b = new OpaqueKey("provider");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final OpaqueKey f14495c = new OpaqueKey("provider");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final OpaqueKey f14496d = new OpaqueKey("compositionLocalMap");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final OpaqueKey f14497e = new OpaqueKey("providerValues");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public static final OpaqueKey f14498f = new OpaqueKey("providers");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public static final OpaqueKey f14499g = new OpaqueKey("reference");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public static final d f14500h = new d();

    public static final void a(SlotReader slotReader, ArrayList arrayList, int i10) {
        if (slotReader.isNode(i10)) {
            arrayList.add(slotReader.node(i10));
            return;
        }
        int iGroupSize = i10 + 1;
        int iGroupSize2 = slotReader.groupSize(i10) + i10;
        while (iGroupSize < iGroupSize2) {
            a(slotReader, arrayList, iGroupSize);
            iGroupSize += slotReader.groupSize(iGroupSize);
        }
    }

    public static final boolean access$asBool(int i10) {
        return i10 != 0;
    }

    public static final List access$collectNodesFrom(SlotTable slotTable, Anchor anchor) {
        ArrayList arrayList = new ArrayList();
        SlotReader slotReaderOpenReader = slotTable.openReader();
        try {
            a(slotReaderOpenReader, arrayList, slotTable.anchorIndex(anchor));
            Unit unit = Unit.INSTANCE;
            return arrayList;
        } finally {
            slotReaderOpenReader.close();
        }
    }

    public static final List access$filterToRange(List list, int i10, int i11) {
        ArrayList arrayList = new ArrayList();
        int iB = b(i10, list);
        if (iB < 0) {
            iB = -(iB + 1);
        }
        while (iB < list.size()) {
            l lVar = (l) list.get(iB);
            if (lVar.f83273b >= i11) {
                break;
            }
            arrayList.add(lVar);
            iB++;
        }
        return arrayList;
    }

    public static final l access$firstInRange(List list, int i10, int i11) {
        int iB = b(i10, list);
        if (iB < 0) {
            iB = -(iB + 1);
        }
        if (iB < list.size()) {
            l lVar = (l) list.get(iB);
            if (lVar.f83273b < i11) {
                return lVar;
            }
        }
        return null;
    }

    public static final Object access$getJoinedKey(KeyInfo keyInfo) {
        return keyInfo.getObjectKey() != null ? new JoinedKey(Integer.valueOf(keyInfo.getKey()), keyInfo.getObjectKey()) : Integer.valueOf(keyInfo.getKey());
    }

    public static final void access$insertIfMissing(List list, int i10, RecomposeScopeImpl recomposeScopeImpl, Object obj) {
        int iB = b(i10, list);
        if (iB < 0) {
            int i11 = -(iB + 1);
            if (!(obj instanceof DerivedState)) {
                obj = null;
            }
            list.add(i11, new l(recomposeScopeImpl, i10, obj));
            return;
        }
        l lVar = (l) list.get(iB);
        if (!(obj instanceof DerivedState)) {
            lVar.f83274c = null;
            return;
        }
        Object obj2 = lVar.f83274c;
        if (obj2 == null) {
            lVar.f83274c = obj;
        } else if (obj2 instanceof MutableScatterSet) {
            ((MutableScatterSet) obj2).add(obj);
        } else {
            lVar.f83274c = ScatterSetKt.mutableScatterSetOf(obj2, obj);
        }
    }

    public static final MutableScatterMap access$multiMap(int i10) {
        return new MutableScatterMap(i10);
    }

    public static final int access$nearestCommonRootOf(SlotReader slotReader, int i10, int i11, int i12) {
        if (i10 == i11) {
            return i10;
        }
        if (i10 == i12 || i11 == i12) {
            return i12;
        }
        if (slotReader.parent(i10) == i11) {
            return i11;
        }
        if (slotReader.parent(i11) == i10) {
            return i10;
        }
        if (slotReader.parent(i10) == slotReader.parent(i11)) {
            return slotReader.parent(i10);
        }
        int iParent = i10;
        int i13 = 0;
        while (iParent > 0 && iParent != i12) {
            iParent = slotReader.parent(iParent);
            i13++;
        }
        int iParent2 = i11;
        int i14 = 0;
        while (iParent2 > 0 && iParent2 != i12) {
            iParent2 = slotReader.parent(iParent2);
            i14++;
        }
        int i15 = i13 - i14;
        for (int i16 = 0; i16 < i15; i16++) {
            i10 = slotReader.parent(i10);
        }
        int i17 = i14 - i13;
        for (int i18 = 0; i18 < i17; i18++) {
            i11 = slotReader.parent(i11);
        }
        while (i10 != i11) {
            i10 = slotReader.parent(i10);
            i11 = slotReader.parent(i11);
        }
        return i10;
    }

    public static final l access$removeLocation(List list, int i10) {
        int iB = b(i10, list);
        if (iB >= 0) {
            return (l) list.remove(iB);
        }
        return null;
    }

    public static final void access$removeRange(List list, int i10, int i11) {
        int iB = b(i10, list);
        if (iB < 0) {
            iB = -(iB + 1);
        }
        while (iB < list.size() && ((l) list.get(iB)).f83273b < i11) {
            list.remove(iB);
        }
    }

    public static final int b(int i10, List list) {
        int size = list.size() - 1;
        int i11 = 0;
        while (i11 <= size) {
            int i12 = (i11 + size) >>> 1;
            int iCompare = Intrinsics.compare(((l) list.get(i12)).f83273b, i10);
            if (iCompare < 0) {
                i11 = i12 + 1;
            } else {
                if (iCompare <= 0) {
                    return i12;
                }
                size = i12 - 1;
            }
        }
        return -(i11 + 1);
    }

    public static final Object c(Object obj, Object obj2, Object obj3) {
        JoinedKey joinedKey = obj instanceof JoinedKey ? (JoinedKey) obj : null;
        if (joinedKey == null) {
            return null;
        }
        if ((!Intrinsics.areEqual(joinedKey.getLeft(), obj2) || !Intrinsics.areEqual(joinedKey.getRight(), obj3)) && (obj = c(joinedKey.getLeft(), obj2, obj3)) == null) {
            obj = c(joinedKey.getRight(), obj2, obj3);
        }
        return obj;
    }

    @ComposeCompilerApi
    public static final <T> T cache(@NotNull Composer composer, boolean z10, @NotNull Function0<? extends T> function0) {
        T t10 = (T) composer.rememberedValue();
        if (!z10 && t10 != Composer.INSTANCE.getEmpty()) {
            return t10;
        }
        T tInvoke = function0.invoke();
        composer.updateRememberedValue(tInvoke);
        return tInvoke;
    }

    public static final void composeImmediateRuntimeError(@NotNull String str) {
        throw new ComposeRuntimeError(h0.b("Compose Runtime internal error. Unexpected or incorrect use of the Compose internal runtime API (", str, "). Please report to Google or use https://goo.gle/compose-feedback"));
    }

    @NotNull
    public static final Void composeRuntimeError(@NotNull String str) {
        throw new ComposeRuntimeError(h0.b("Compose Runtime internal error. Unexpected or incorrect use of the Compose internal runtime API (", str, "). Please report to Google or use https://goo.gle/compose-feedback"));
    }

    public static final void deactivateCurrentGroup(@NotNull SlotWriter slotWriter, @NotNull RememberManager rememberManager) {
        int iAnchorIndex;
        int slotsSize;
        int currentGroup = slotWriter.getCurrentGroup();
        int currentGroupEnd = slotWriter.getCurrentGroupEnd();
        while (currentGroup < currentGroupEnd) {
            Object objNode = slotWriter.node(currentGroup);
            if (objNode instanceof ComposeNodeLifecycleCallback) {
                rememberManager.deactivating((ComposeNodeLifecycleCallback) objNode, slotWriter.getSlotsSize() - slotWriter.slotsStartIndex$runtime_release(currentGroup), -1, -1);
            }
            int iAccess$slotIndex = SlotWriter.access$slotIndex(slotWriter, slotWriter.f14760b, slotWriter.f(currentGroup));
            int i10 = currentGroup + 1;
            int iAccess$dataIndex = SlotWriter.access$dataIndex(slotWriter, slotWriter.f14760b, slotWriter.f(i10));
            for (int i11 = iAccess$slotIndex; i11 < iAccess$dataIndex; i11++) {
                int i12 = i11 - iAccess$slotIndex;
                Object obj = slotWriter.f14761c[slotWriter.b(i11)];
                if (obj instanceof RememberObserverHolder) {
                    RememberObserverHolder rememberObserverHolder = (RememberObserverHolder) obj;
                    RememberObserver wrapped = rememberObserverHolder.getWrapped();
                    if (!(wrapped instanceof ReusableRememberObserver)) {
                        if (obj != slotWriter.set(currentGroup, i12, Composer.INSTANCE.getEmpty())) {
                            composeImmediateRuntimeError("Slot table is out of sync");
                        }
                        int slotsSize2 = slotWriter.getSlotsSize() - i12;
                        Anchor after = rememberObserverHolder.getAfter();
                        if (after == null || !after.getValid()) {
                            iAnchorIndex = -1;
                            slotsSize = -1;
                        } else {
                            iAnchorIndex = slotWriter.anchorIndex(after);
                            slotsSize = slotWriter.getSlotsSize() - slotWriter.slotsEndAllIndex$runtime_release(iAnchorIndex);
                        }
                        rememberManager.forgetting(wrapped, slotsSize2, iAnchorIndex, slotsSize);
                    }
                } else if (obj instanceof RecomposeScopeImpl) {
                    if (obj != slotWriter.set(currentGroup, i12, Composer.INSTANCE.getEmpty())) {
                        composeImmediateRuntimeError("Slot table is out of sync");
                    }
                    ((RecomposeScopeImpl) obj).release();
                }
            }
            currentGroup = i10;
        }
    }

    @NotNull
    public static final Object getCompositionLocalMap() {
        return f14496d;
    }

    @NotNull
    public static final Object getInvocation() {
        return f14494b;
    }

    @NotNull
    public static final Object getProvider() {
        return f14495c;
    }

    @NotNull
    public static final Object getProviderMaps() {
        return f14498f;
    }

    @NotNull
    public static final Object getProviderValues() {
        return f14497e;
    }

    @NotNull
    public static final Object getReference() {
        return f14499g;
    }

    public static final boolean isAfterFirstChild(@NotNull SlotWriter slotWriter) {
        return slotWriter.getCurrentGroup() > slotWriter.getParent() + 1;
    }

    @ComposeCompilerApi
    public static final boolean isTraceInProgress() {
        CompositionTracer compositionTracer = f14493a;
        return compositionTracer != null && compositionTracer.isTraceInProgress();
    }

    public static final void removeCurrentGroup(@NotNull SlotWriter slotWriter, @NotNull RememberManager rememberManager) {
        int slotsSize;
        int iAccess$dataIndex = SlotWriter.access$dataIndex(slotWriter, slotWriter.f14760b, slotWriter.f(slotWriter.groupSize(slotWriter.getCurrentGroup()) + slotWriter.getCurrentGroup()));
        for (int iAccess$dataIndex2 = SlotWriter.access$dataIndex(slotWriter, slotWriter.f14760b, slotWriter.f(slotWriter.getCurrentGroup())); iAccess$dataIndex2 < iAccess$dataIndex; iAccess$dataIndex2++) {
            Object obj = slotWriter.f14761c[slotWriter.b(iAccess$dataIndex2)];
            int iAnchorIndex = -1;
            if (obj instanceof ComposeNodeLifecycleCallback) {
                rememberManager.releasing((ComposeNodeLifecycleCallback) obj, slotWriter.getSlotsSize() - iAccess$dataIndex2, -1, -1);
            }
            if (obj instanceof RememberObserverHolder) {
                int slotsSize2 = slotWriter.getSlotsSize() - iAccess$dataIndex2;
                RememberObserverHolder rememberObserverHolder = (RememberObserverHolder) obj;
                Anchor after = rememberObserverHolder.getAfter();
                if (after == null || !after.getValid()) {
                    slotsSize = -1;
                } else {
                    iAnchorIndex = slotWriter.anchorIndex(after);
                    slotsSize = slotWriter.getSlotsSize() - slotWriter.slotsEndAllIndex$runtime_release(iAnchorIndex);
                }
                rememberManager.forgetting(rememberObserverHolder.getWrapped(), slotsSize2, iAnchorIndex, slotsSize);
            }
            if (obj instanceof RecomposeScopeImpl) {
                ((RecomposeScopeImpl) obj).release();
            }
        }
        slotWriter.removeGroup();
    }

    public static final void runtimeCheck(boolean z10, @NotNull Function0<String> function0) {
        if (z10) {
            return;
        }
        composeImmediateRuntimeError(function0.invoke());
    }

    @ComposeCompilerApi
    public static final void sourceInformation(@NotNull Composer composer, @NotNull String str) {
        composer.sourceInformation(str);
    }

    @ComposeCompilerApi
    public static final void sourceInformationMarkerEnd(@NotNull Composer composer) {
        composer.sourceInformationMarkerEnd();
    }

    @ComposeCompilerApi
    public static final void sourceInformationMarkerStart(@NotNull Composer composer, int i10, @NotNull String str) {
        composer.sourceInformationMarkerStart(i10, str);
    }

    @ComposeCompilerApi
    public static final void traceEventEnd() {
        CompositionTracer compositionTracer = f14493a;
        if (compositionTracer != null) {
            compositionTracer.traceEventEnd();
        }
    }

    public static final <R> void withAfterAnchorInfo(@NotNull SlotWriter slotWriter, @Nullable Anchor anchor, @NotNull Function2<? super Integer, ? super Integer, ? extends R> function2) {
        int iAnchorIndex;
        int slotsSize;
        if (anchor == null || !anchor.getValid()) {
            iAnchorIndex = -1;
            slotsSize = -1;
        } else {
            iAnchorIndex = slotWriter.anchorIndex(anchor);
            slotsSize = slotWriter.getSlotsSize() - slotWriter.slotsEndAllIndex$runtime_release(iAnchorIndex);
        }
        function2.invoke(Integer.valueOf(iAnchorIndex), Integer.valueOf(slotsSize));
    }

    public static final boolean isAfterFirstChild(@NotNull SlotReader slotReader) {
        return slotReader.getCurrentGroup() > slotReader.getParent() + 1;
    }

    public static final void runtimeCheck(boolean z10) {
        if (z10) {
            return;
        }
        composeImmediateRuntimeError("Check failed");
    }

    @ComposeCompilerApi
    public static final void traceEventStart(int i10, int i11, int i12, @NotNull String str) {
        CompositionTracer compositionTracer = f14493a;
        if (compositionTracer != null) {
            compositionTracer.traceEventStart(i10, i11, i12, str);
        }
    }

    @PublishedApi
    public static /* synthetic */ void getCompositionLocalMap$annotations() {
    }

    @PublishedApi
    public static /* synthetic */ void getCompositionLocalMapKey$annotations() {
    }

    @PublishedApi
    public static /* synthetic */ void getInvocation$annotations() {
    }

    @PublishedApi
    public static /* synthetic */ void getInvocationKey$annotations() {
    }

    @PublishedApi
    public static /* synthetic */ void getProvider$annotations() {
    }

    @PublishedApi
    public static /* synthetic */ void getProviderKey$annotations() {
    }

    @PublishedApi
    public static /* synthetic */ void getProviderMaps$annotations() {
    }

    @PublishedApi
    public static /* synthetic */ void getProviderMapsKey$annotations() {
    }

    @PublishedApi
    public static /* synthetic */ void getProviderValues$annotations() {
    }

    @PublishedApi
    public static /* synthetic */ void getProviderValuesKey$annotations() {
    }

    @PublishedApi
    public static /* synthetic */ void getReference$annotations() {
    }

    @PublishedApi
    public static /* synthetic */ void getReferenceKey$annotations() {
    }

    @PublishedApi
    public static /* synthetic */ void getReuseKey$annotations() {
    }

    public static final int access$asInt(boolean z10) {
        return z10 ? 1 : 0;
    }
}
