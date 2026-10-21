package e1;

import androidx.compose.ui.input.pointer.InternalPointerEvent;
import androidx.compose.ui.input.pointer.PointerId;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.PointerInputEvent;
import androidx.compose.ui.input.pointer.PointerInputEventData;
import androidx.compose.ui.input.pointer.PositionCalculator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: PointerInputEventProcessor.kt */
/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nPointerInputEventProcessor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PointerInputEventProcessor.kt\nandroidx/compose/ui/input/pointer/PointerInputChangeEventProducer\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,235:1\n33#2,6:236\n*S KotlinDebug\n*F\n+ 1 PointerInputEventProcessor.kt\nandroidx/compose/ui/input/pointer/PointerInputChangeEventProducer\n*L\n145#1:236,6\n*E\n"})
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final LinkedHashMap f68269a = new LinkedHashMap();

    /* JADX INFO: compiled from: PointerInputEventProcessor.kt */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f68270a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f68271b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f68272c;

        public a(long j10, long j11, boolean z10) {
            this.f68270a = j10;
            this.f68271b = j11;
            this.f68272c = z10;
        }
    }

    @NotNull
    public final InternalPointerEvent a(@NotNull PointerInputEvent pointerInputEvent, @NotNull PositionCalculator positionCalculator) {
        boolean z10;
        long jM3490getPositionF1C5BW0;
        long uptime;
        Intrinsics.checkNotNullParameter(pointerInputEvent, "pointerInputEvent");
        Intrinsics.checkNotNullParameter(positionCalculator, "positionCalculator");
        LinkedHashMap linkedHashMap = new LinkedHashMap(pointerInputEvent.getPointers().size());
        List<PointerInputEventData> pointers = pointerInputEvent.getPointers();
        int size = pointers.size();
        for (int i10 = 0; i10 < size; i10++) {
            PointerInputEventData pointerInputEventData = pointers.get(i10);
            LinkedHashMap linkedHashMap2 = this.f68269a;
            a aVar = (a) linkedHashMap2.get(PointerId.m3458boximpl(pointerInputEventData.m3489getIdJ3iCeTQ()));
            if (aVar == null) {
                z10 = false;
                uptime = pointerInputEventData.getUptime();
                jM3490getPositionF1C5BW0 = pointerInputEventData.m3490getPositionF1C5BW0();
            } else {
                long jMo3542screenToLocalMKHz9U = positionCalculator.mo3542screenToLocalMKHz9U(aVar.f68271b);
                long j10 = aVar.f68270a;
                z10 = aVar.f68272c;
                jM3490getPositionF1C5BW0 = jMo3542screenToLocalMKHz9U;
                uptime = j10;
            }
            linkedHashMap.put(PointerId.m3458boximpl(pointerInputEventData.m3489getIdJ3iCeTQ()), new PointerInputChange(pointerInputEventData.m3489getIdJ3iCeTQ(), pointerInputEventData.getUptime(), pointerInputEventData.m3490getPositionF1C5BW0(), pointerInputEventData.getDown(), pointerInputEventData.getPressure(), uptime, jM3490getPositionF1C5BW0, z10, false, pointerInputEventData.m3493getTypeT8wyACA(), (List) pointerInputEventData.getHistorical(), pointerInputEventData.m3492getScrollDeltaF1C5BW0(), (DefaultConstructorMarker) null));
            if (pointerInputEventData.getDown()) {
                PointerId pointerIdM3458boximpl = PointerId.m3458boximpl(pointerInputEventData.m3489getIdJ3iCeTQ());
                long uptime2 = pointerInputEventData.getUptime();
                long jM3491getPositionOnScreenF1C5BW0 = pointerInputEventData.m3491getPositionOnScreenF1C5BW0();
                boolean down = pointerInputEventData.getDown();
                pointerInputEventData.m3493getTypeT8wyACA();
                linkedHashMap2.put(pointerIdM3458boximpl, new a(uptime2, jM3491getPositionOnScreenF1C5BW0, down));
            } else {
                linkedHashMap2.remove(PointerId.m3458boximpl(pointerInputEventData.m3489getIdJ3iCeTQ()));
            }
        }
        return new InternalPointerEvent(linkedHashMap, pointerInputEvent);
    }
}
