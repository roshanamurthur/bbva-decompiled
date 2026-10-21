package m0;

import androidx.collection.MutableScatterSet;
import androidx.compose.runtime.ControlledComposition;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Recomposer.kt */
/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nRecomposer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Recomposer.kt\nandroidx/compose/runtime/Recomposer$performRecompose$1$1\n+ 2 ScatterSet.kt\nandroidx/collection/ScatterSet\n+ 3 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n*L\n1#1,1646:1\n267#2,4:1647\n237#2,7:1651\n248#2,3:1659\n251#2,2:1663\n272#2,2:1665\n254#2,6:1667\n274#2:1673\n1810#3:1658\n1672#3:1662\n*S KotlinDebug\n*F\n+ 1 Recomposer.kt\nandroidx/compose/runtime/Recomposer$performRecompose$1$1\n*L\n1203#1:1647,4\n1203#1:1651,7\n1203#1:1659,3\n1203#1:1663,2\n1203#1:1665,2\n1203#1:1667,6\n1203#1:1673\n1203#1:1658\n1203#1:1662\n*E\n"})
public final class z extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ MutableScatterSet<Object> f83342p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ ControlledComposition f83343q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(MutableScatterSet<Object> mutableScatterSet, ControlledComposition controlledComposition) {
        super(0);
        this.f83342p0 = mutableScatterSet;
        this.f83343q0 = controlledComposition;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0042 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:15:0x0044 A[LOOP:0: B:5:0x000d->B:15:0x0044, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:19:0x0047 A[EDGE_INSN: B:19:0x0047->B:16:0x0047 BREAK  A[LOOP:0: B:5:0x000d->B:15:0x0044], SYNTHETIC] */
    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        MutableScatterSet<Object> mutableScatterSet = this.f83342p0;
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
                            this.f83343q0.recordWriteOf(objArr[(i10 << 3) + i12]);
                        }
                        j10 >>= 8;
                    }
                    if (i11 != 8) {
                        break;
                    }
                    if (i10 != length) {
                        break;
                    }
                    i10++;
                }
            }
        }
        return Unit.INSTANCE;
    }
}
