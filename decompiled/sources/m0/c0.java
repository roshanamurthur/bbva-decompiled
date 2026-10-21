package m0;

import androidx.collection.MutableScatterSet;
import androidx.compose.runtime.ControlledComposition;
import androidx.compose.runtime.PreconditionsKt;
import androidx.compose.runtime.Recomposer;
import androidx.compose.runtime.RecomposerKt;
import androidx.compose.runtime.Trace;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.snapshots.Snapshot;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CancellableContinuation;

/* JADX INFO: compiled from: Recomposer.kt */
/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nRecomposer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Recomposer.kt\nandroidx/compose/runtime/Recomposer$runFrameLoop$2\n+ 2 Trace.kt\nandroidx/compose/runtime/TraceKt\n+ 3 ActualJvm.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt\n+ 4 ListUtils.kt\nandroidx/compose/runtime/snapshots/ListUtilsKt\n+ 5 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,1646:1\n46#2,5:1647\n46#2,3:1652\n50#2:1686\n89#3:1655\n89#3:1685\n33#4,6:1656\n33#4,6:1673\n33#4,6:1679\n460#5,11:1662\n*S KotlinDebug\n*F\n+ 1 Recomposer.kt\nandroidx/compose/runtime/Recomposer$runFrameLoop$2\n*L\n932#1:1647,5\n942#1:1652,3\n942#1:1686\n947#1:1655\n980#1:1685\n948#1:1656,6\n958#1:1673,6\n973#1:1679,6\n950#1:1662,11\n*E\n"})
public final class c0 extends Lambda implements Function1<Long, CancellableContinuation<? super Unit>> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ Recomposer f83238p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ List<ControlledComposition> f83239q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ List<ControlledComposition> f83240r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final /* synthetic */ x f83241s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(Recomposer recomposer, List<ControlledComposition> list, List<ControlledComposition> list2, x xVar) {
        super(1);
        this.f83238p0 = recomposer;
        this.f83239q0 = list;
        this.f83240r0 = list2;
        this.f83241s0 = xVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final CancellableContinuation<? super Unit> invoke(Long l6) {
        int i10;
        CancellableContinuation<? super Unit> cancellableContinuationB;
        long jLongValue = l6.longValue();
        if (Recomposer.access$getHasBroadcastFrameClockAwaiters(this.f83238p0)) {
            Recomposer recomposer = this.f83238p0;
            Trace trace = Trace.INSTANCE;
            Object objBeginSection = trace.beginSection("Recomposer:animation");
            try {
                recomposer.f14656b.sendFrame(jLongValue);
                Snapshot.INSTANCE.sendApplyNotifications();
                Unit unit = Unit.INSTANCE;
                trace.endSection(objBeginSection);
            } catch (Throwable th2) {
                Trace.INSTANCE.endSection(objBeginSection);
                throw th2;
            }
        }
        Recomposer recomposer2 = this.f83238p0;
        List<ControlledComposition> list = this.f83239q0;
        List<ControlledComposition> list2 = this.f83240r0;
        x xVar = this.f83241s0;
        Object objBeginSection2 = Trace.INSTANCE.beginSection("Recomposer:recompose");
        try {
            Recomposer.access$recordComposerModifications(recomposer2);
            synchronized (recomposer2.f14657c) {
                try {
                    List list3 = recomposer2.f14664j;
                    int size = list3.size();
                    for (int i11 = 0; i11 < size; i11++) {
                        list2.add((ControlledComposition) list3.get(i11));
                    }
                    recomposer2.f14664j.clear();
                    MutableVector mutableVector = recomposer2.f14663i;
                    int size2 = mutableVector.getSize();
                    if (size2 > 0) {
                        Object[] content = mutableVector.getContent();
                        int i12 = 0;
                        do {
                            list.add((ControlledComposition) content[i12]);
                            i12++;
                        } while (i12 < size2);
                    }
                    recomposer2.f14663i.clear();
                    if (xVar.f83335a != RecomposerKt.f14728b) {
                        PreconditionsKt.throwIllegalStateException("frame not pending");
                    }
                    xVar.f83335a = null;
                    Unit unit2 = Unit.INSTANCE;
                } catch (Throwable th3) {
                    throw th3;
                }
            }
            MutableScatterSet mutableScatterSet = new MutableScatterSet(0, 1, null);
            try {
                int size3 = list.size();
                for (int i13 = 0; i13 < size3; i13++) {
                    ControlledComposition controlledCompositionAccess$performRecompose = Recomposer.access$performRecompose(recomposer2, list.get(i13), mutableScatterSet);
                    if (controlledCompositionAccess$performRecompose != null) {
                        list2.add(controlledCompositionAccess$performRecompose);
                    }
                }
                list.clear();
                if (!list2.isEmpty()) {
                    recomposer2.changeCount = recomposer2.getChangeCount() + 1;
                }
                try {
                    int size4 = list2.size();
                    for (i10 = 0; i10 < size4; i10++) {
                        list2.get(i10).applyChanges();
                    }
                    list2.clear();
                    synchronized (recomposer2.f14657c) {
                        cancellableContinuationB = recomposer2.b();
                    }
                    Trace.INSTANCE.endSection(objBeginSection2);
                    return cancellableContinuationB;
                } catch (Throwable th4) {
                    list2.clear();
                    throw th4;
                }
            } catch (Throwable th5) {
                list.clear();
                throw th5;
            }
        } catch (Throwable th6) {
            Trace.INSTANCE.endSection(objBeginSection2);
            throw th6;
        }
    }
}
