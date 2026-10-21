package androidx.compose.ui.input.pointer;

import androidx.compose.runtime.Immutable;
import androidx.compose.ui.ExperimentalComposeUiApi;
import androidx.compose.ui.geometry.Offset;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import java.util.List;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: PointerEvent.kt */
/* JADX INFO: loaded from: classes.dex */
@Immutable
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b4\b\u0007\u0018\u00002\u00020\u0001Bf\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010.\u001a\u00020\u0006\u0012\u0006\u00101\u001a\u00020\b\u0012\u0006\u00106\u001a\u00020\n\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\u0006\u0010=\u001a\u00020\u0006\u0012\u0006\u0010\r\u001a\u00020\b\u0012\u0006\u0010\u000e\u001a\u00020\n\u0012\u0006\u0010T\u001a\u00020\n\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0016\u001a\u00020\bø\u0001\u0001¢\u0006\u0004\bU\u0010VB`\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010.\u001a\u00020\u0006\u0012\u0006\u00101\u001a\u00020\b\u0012\u0006\u00106\u001a\u00020\n\u0012\u0006\u0010=\u001a\u00020\u0006\u0012\u0006\u0010\r\u001a\u00020\b\u0012\u0006\u0010\u000e\u001a\u00020\n\u0012\u0006\u0010T\u001a\u00020\n\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0016\u001a\u00020\bø\u0001\u0001¢\u0006\u0004\bU\u0010WBV\b\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010.\u001a\u00020\u0006\u0012\u0006\u00101\u001a\u00020\b\u0012\u0006\u00106\u001a\u00020\n\u0012\u0006\u0010=\u001a\u00020\u0006\u0012\u0006\u0010\r\u001a\u00020\b\u0012\u0006\u0010\u000e\u001a\u00020\n\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011ø\u0001\u0001¢\u0006\u0004\bU\u0010XBr\b\u0010\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010.\u001a\u00020\u0006\u0012\u0006\u00101\u001a\u00020\b\u0012\u0006\u00106\u001a\u00020\n\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\u0006\u0010=\u001a\u00020\u0006\u0012\u0006\u0010\r\u001a\u00020\b\u0012\u0006\u0010\u000e\u001a\u00020\n\u0012\u0006\u0010T\u001a\u00020\n\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\f\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u001f\u0012\u0006\u0010\u0016\u001a\u00020\bø\u0001\u0001¢\u0006\u0004\bU\u0010YJ\u0006\u0010\u0003\u001a\u00020\u0002Jo\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\u00062\b\b\u0002\u0010\r\u001a\u00020\b2\b\b\u0002\u0010\u000e\u001a\u00020\n2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u0011H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0013\u0010\u0014Jm\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\u00062\b\b\u0002\u0010\r\u001a\u00020\b2\b\b\u0002\u0010\u000e\u001a\u00020\n2\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0016\u001a\u00020\bø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0017\u0010\u0018Jw\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\u00062\b\b\u0002\u0010\r\u001a\u00020\b2\b\b\u0002\u0010\u000e\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0016\u001a\u00020\bH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0019\u0010\u001aJw\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\u001c\u001a\u00020\u001b2\b\b\u0002\u0010\f\u001a\u00020\u00062\b\b\u0002\u0010\r\u001a\u00020\b2\b\b\u0002\u0010\u000e\u001a\u00020\n2\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0016\u001a\u00020\bø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ}\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\u00062\b\b\u0002\u0010\r\u001a\u00020\b2\b\b\u0002\u0010\u000e\u001a\u00020\n2\b\b\u0002\u0010\u0012\u001a\u00020\u00112\f\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u001f2\b\b\u0002\u0010\u0016\u001a\u00020\bH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\"\u0010#J\u0089\u0001\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\u001c\u001a\u00020\u001b2\b\b\u0002\u0010\f\u001a\u00020\u00062\b\b\u0002\u0010\r\u001a\u00020\b2\b\b\u0002\u0010\u000e\u001a\u00020\n2\b\b\u0002\u0010\u0012\u001a\u00020\u00112\u000e\b\u0002\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u001f2\b\b\u0002\u0010\u0016\u001a\u00020\bH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b$\u0010%J\b\u0010'\u001a\u00020&H\u0016R \u0010\u0005\u001a\u00020\u00048\u0006ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u0017\u0010.\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b,\u0010)\u001a\u0004\b-\u0010+R \u00101\u001a\u00020\b8\u0006ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\f\n\u0004\b/\u0010)\u001a\u0004\b0\u0010+R\u0017\u00106\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R\u0017\u0010\u001c\u001a\u00020\u001b8\u0006¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010:R\u0017\u0010=\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b;\u0010)\u001a\u0004\b<\u0010+R \u0010\r\u001a\u00020\b8\u0006ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\f\n\u0004\b>\u0010)\u001a\u0004\b?\u0010+R\u0017\u0010\u000e\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b@\u00103\u001a\u0004\bA\u00105R \u0010\u0012\u001a\u00020\u00118\u0006ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\bD\u0010ER \u0010\u0016\u001a\u00020\b8\u0006ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\f\n\u0004\bF\u0010)\u001a\u0004\bG\u0010+R*\u0010\u0010\u001a\u00020\u000f2\u0006\u0010H\u001a\u00020\u000f8\u0006@BX\u0087\u000e¢\u0006\u0012\n\u0004\bI\u0010J\u0012\u0004\bM\u0010N\u001a\u0004\bK\u0010LR \u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u001f8GX\u0087\u0004¢\u0006\f\u0012\u0004\bQ\u0010N\u001a\u0004\bO\u0010PR\u0017\u0010R\u001a\u00020\n8F¢\u0006\f\u0012\u0004\bS\u0010N\u001a\u0004\bR\u00105\u0082\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u0006Z"}, d2 = {"Landroidx/compose/ui/input/pointer/PointerInputChange;", "", "", "consume", "Landroidx/compose/ui/input/pointer/PointerId;", "id", "", "currentTime", "Landroidx/compose/ui/geometry/Offset;", "currentPosition", "", "currentPressed", "previousTime", "previousPosition", "previousPressed", "Landroidx/compose/ui/input/pointer/ConsumedData;", "consumed", "Landroidx/compose/ui/input/pointer/PointerType;", "type", "copy-Ezr-O64", "(JJJZJJZLandroidx/compose/ui/input/pointer/ConsumedData;I)Landroidx/compose/ui/input/pointer/PointerInputChange;", "copy", "scrollDelta", "copy-JKmWfYY", "(JJJZJJZIJ)Landroidx/compose/ui/input/pointer/PointerInputChange;", "copy-0GkPj7c", "(JJJZJJZLandroidx/compose/ui/input/pointer/ConsumedData;IJ)Landroidx/compose/ui/input/pointer/PointerInputChange;", "", "pressure", "copy-Tn9QgHE", "(JJJZFJJZIJ)Landroidx/compose/ui/input/pointer/PointerInputChange;", "", "Landroidx/compose/ui/input/pointer/HistoricalChange;", "historical", "copy-OHpmEuE", "(JJJZJJZILjava/util/List;J)Landroidx/compose/ui/input/pointer/PointerInputChange;", "copy-wbzehF4", "(JJJZFJJZILjava/util/List;J)Landroidx/compose/ui/input/pointer/PointerInputChange;", "", "toString", "a", "J", "getId-J3iCeTQ", "()J", "b", "getUptimeMillis", "uptimeMillis", "c", "getPosition-F1C5BW0", "position", "d", "Z", "getPressed", "()Z", "pressed", "e", "F", "getPressure", "()F", "f", "getPreviousUptimeMillis", "previousUptimeMillis", "g", "getPreviousPosition-F1C5BW0", "h", "getPreviousPressed", "i", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getType-T8wyACA", "()I", "j", "getScrollDelta-F1C5BW0", "<set-?>", "l", "Landroidx/compose/ui/input/pointer/ConsumedData;", "getConsumed", "()Landroidx/compose/ui/input/pointer/ConsumedData;", "getConsumed$annotations", "()V", "getHistorical", "()Ljava/util/List;", "getHistorical$annotations", "isConsumed", "isConsumed$annotations", "isInitiallyConsumed", "<init>", "(JJJZFJJZZIJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "(JJJZJJZZIJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "(JJJZJJZLandroidx/compose/ui/input/pointer/ConsumedData;ILkotlin/jvm/internal/DefaultConstructorMarker;)V", "(JJJZFJJZZILjava/util/List;JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "ui_release"}, k = 1, mv = {1, 8, 0})
public final class PointerInputChange {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final long id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final long uptimeMillis;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final long position;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public final boolean pressed;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public final float pressure;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    public final long previousUptimeMillis;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    public final long previousPosition;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    public final boolean previousPressed;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    public final int type;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    public final long scrollDelta;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    public final List<HistoricalChange> f16413k;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public ConsumedData consumed;

    public PointerInputChange() {
        throw null;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PointerInputChange(long j10, long j11, long j12, boolean z10, float f6, long j13, long j14, boolean z11, boolean z12, int i10, List historical, long j15, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, j11, j12, z10, f6, j13, j14, z11, z12, i10, j15, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(historical, "historical");
        this.f16413k = historical;
    }

    public final void consume() {
        this.consumed.setDownChange(true);
        this.consumed.setPositionChange(true);
    }

    @Deprecated(message = "Partial consumption has been deprecated. Use copy() instead without `consumed` parameter to create a shallow copy or a constructor to create a new PointerInputChange", replaceWith = @ReplaceWith(expression = "copy(id, currentTime, currentPosition, currentPressed, previousTime, previousPosition, previousPressed, type, scrollDelta)", imports = {}))
    @NotNull
    /* JADX INFO: renamed from: copy-0GkPj7c, reason: not valid java name */
    public final PointerInputChange m3471copy0GkPj7c(long id, long currentTime, long currentPosition, boolean currentPressed, long previousTime, long previousPosition, boolean previousPressed, @NotNull ConsumedData consumed, int type, long scrollDelta) {
        Intrinsics.checkNotNullParameter(consumed, "consumed");
        PointerInputChange pointerInputChange = new PointerInputChange(id, currentTime, currentPosition, currentPressed, this.pressure, previousTime, previousPosition, previousPressed, consumed.getDownChange() || consumed.getPositionChange(), type, getHistorical(), scrollDelta, (DefaultConstructorMarker) null);
        this.consumed = consumed;
        return pointerInputChange;
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Use another copy() method with scrollDelta parameter instead", replaceWith = @ReplaceWith(expression = "copy(id,currentTime, currentPosition, currentPressed, previousTime,previousPosition, previousPressed, consumed, type, this.scrollDelta)", imports = {}))
    /* JADX INFO: renamed from: copy-Ezr-O64, reason: not valid java name */
    public final /* synthetic */ PointerInputChange m3472copyEzrO64(long id, long currentTime, long currentPosition, boolean currentPressed, long previousTime, long previousPosition, boolean previousPressed, ConsumedData consumed, int type) {
        Intrinsics.checkNotNullParameter(consumed, "consumed");
        PointerInputChange pointerInputChange = new PointerInputChange(id, currentTime, currentPosition, currentPressed, this.pressure, previousTime, previousPosition, previousPressed, consumed.getDownChange() || consumed.getPositionChange(), type, getHistorical(), this.scrollDelta, (DefaultConstructorMarker) null);
        this.consumed = consumed;
        return pointerInputChange;
    }

    @NotNull
    /* JADX INFO: renamed from: copy-JKmWfYY, reason: not valid java name */
    public final PointerInputChange m3473copyJKmWfYY(long id, long currentTime, long currentPosition, boolean currentPressed, long previousTime, long previousPosition, boolean previousPressed, int type, long scrollDelta) {
        return m3476copywbzehF4(id, currentTime, currentPosition, currentPressed, this.pressure, previousTime, previousPosition, previousPressed, type, getHistorical(), scrollDelta);
    }

    @ExperimentalComposeUiApi
    @NotNull
    /* JADX INFO: renamed from: copy-OHpmEuE, reason: not valid java name */
    public final PointerInputChange m3474copyOHpmEuE(long id, long currentTime, long currentPosition, boolean currentPressed, long previousTime, long previousPosition, boolean previousPressed, int type, @NotNull List<HistoricalChange> historical, long scrollDelta) {
        Intrinsics.checkNotNullParameter(historical, "historical");
        return m3476copywbzehF4(id, currentTime, currentPosition, currentPressed, this.pressure, previousTime, previousPosition, previousPressed, type, historical, scrollDelta);
    }

    @NotNull
    /* JADX INFO: renamed from: copy-Tn9QgHE, reason: not valid java name */
    public final PointerInputChange m3475copyTn9QgHE(long id, long currentTime, long currentPosition, boolean currentPressed, float pressure, long previousTime, long previousPosition, boolean previousPressed, int type, long scrollDelta) {
        PointerInputChange pointerInputChange = new PointerInputChange(id, currentTime, currentPosition, currentPressed, pressure, previousTime, previousPosition, previousPressed, false, type, (List) getHistorical(), scrollDelta, (DefaultConstructorMarker) null);
        pointerInputChange.consumed = this.consumed;
        return pointerInputChange;
    }

    @ExperimentalComposeUiApi
    @NotNull
    /* JADX INFO: renamed from: copy-wbzehF4, reason: not valid java name */
    public final PointerInputChange m3476copywbzehF4(long id, long currentTime, long currentPosition, boolean currentPressed, float pressure, long previousTime, long previousPosition, boolean previousPressed, int type, @NotNull List<HistoricalChange> historical, long scrollDelta) {
        Intrinsics.checkNotNullParameter(historical, "historical");
        PointerInputChange pointerInputChange = new PointerInputChange(id, currentTime, currentPosition, currentPressed, pressure, previousTime, previousPosition, previousPressed, false, type, (List) historical, scrollDelta, (DefaultConstructorMarker) null);
        pointerInputChange.consumed = this.consumed;
        return pointerInputChange;
    }

    @NotNull
    public final ConsumedData getConsumed() {
        return this.consumed;
    }

    @ExperimentalComposeUiApi
    @NotNull
    public final List<HistoricalChange> getHistorical() {
        List<HistoricalChange> list = this.f16413k;
        return list == null ? CollectionsKt__CollectionsKt.emptyList() : list;
    }

    /* JADX INFO: renamed from: getId-J3iCeTQ, reason: not valid java name and from getter */
    public final long getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: getPosition-F1C5BW0, reason: not valid java name and from getter */
    public final long getPosition() {
        return this.position;
    }

    public final boolean getPressed() {
        return this.pressed;
    }

    public final float getPressure() {
        return this.pressure;
    }

    /* JADX INFO: renamed from: getPreviousPosition-F1C5BW0, reason: not valid java name and from getter */
    public final long getPreviousPosition() {
        return this.previousPosition;
    }

    public final boolean getPreviousPressed() {
        return this.previousPressed;
    }

    public final long getPreviousUptimeMillis() {
        return this.previousUptimeMillis;
    }

    /* JADX INFO: renamed from: getScrollDelta-F1C5BW0, reason: not valid java name and from getter */
    public final long getScrollDelta() {
        return this.scrollDelta;
    }

    /* JADX INFO: renamed from: getType-T8wyACA, reason: not valid java name and from getter */
    public final int getType() {
        return this.type;
    }

    public final long getUptimeMillis() {
        return this.uptimeMillis;
    }

    public final boolean isConsumed() {
        return this.consumed.getDownChange() || this.consumed.getPositionChange();
    }

    @NotNull
    public String toString() {
        return "PointerInputChange(id=" + ((Object) PointerId.m3463toStringimpl(this.id)) + ", uptimeMillis=" + this.uptimeMillis + ", position=" + ((Object) Offset.m2283toStringimpl(this.position)) + ", pressed=" + this.pressed + ", pressure=" + this.pressure + ", previousUptimeMillis=" + this.previousUptimeMillis + ", previousPosition=" + ((Object) Offset.m2283toStringimpl(this.previousPosition)) + ", previousPressed=" + this.previousPressed + ", isConsumed=" + isConsumed() + ", type=" + ((Object) PointerType.m3534toStringimpl(this.type)) + ", historical=" + getHistorical() + ",scrollDelta=" + ((Object) Offset.m2283toStringimpl(this.scrollDelta)) + RootService.CLOSE_BRACKET;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Use another constructor with `scrollDelta` and without `ConsumedData` instead", replaceWith = @ReplaceWith(expression = "this(id, uptimeMillis, position, pressed, previousUptimeMillis, previousPosition, previousPressed, consumed.downChange || consumed.positionChange, type, Offset.Zero)", imports = {}))
    public PointerInputChange(long j10, long j11, long j12, boolean z10, long j13, long j14, boolean z11, ConsumedData consumed, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, j11, j12, z10, 1.0f, j13, j14, z11, consumed.getDownChange() || consumed.getPositionChange(), i10, Offset.INSTANCE.m2291getZeroF1C5BW0(), (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(consumed, "consumed");
    }

    public PointerInputChange(long j10, long j11, long j12, boolean z10, float f6, long j13, long j14, boolean z11, boolean z12, int i10, long j15, DefaultConstructorMarker defaultConstructorMarker) {
        this.id = j10;
        this.uptimeMillis = j11;
        this.position = j12;
        this.pressed = z10;
        this.pressure = f6;
        this.previousUptimeMillis = j13;
        this.previousPosition = j14;
        this.previousPressed = z11;
        this.type = i10;
        this.scrollDelta = j15;
        this.consumed = new ConsumedData(z12, z12);
    }

    @Deprecated(message = "use isConsumed and consume() pair of methods instead")
    public static /* synthetic */ void getConsumed$annotations() {
    }

    @ExperimentalComposeUiApi
    public static /* synthetic */ void getHistorical$annotations() {
    }

    public static /* synthetic */ void isConsumed$annotations() {
    }

    public /* synthetic */ PointerInputChange(long j10, long j11, long j12, boolean z10, float f6, long j13, long j14, boolean z11, boolean z12, int i10, long j15, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, j11, j12, z10, f6, j13, j14, z11, z12, (i11 & 512) != 0 ? PointerType.INSTANCE.m3539getTouchT8wyACA() : i10, (i11 & 1024) != 0 ? Offset.INSTANCE.m2291getZeroF1C5BW0() : j15, (DefaultConstructorMarker) null);
    }

    public /* synthetic */ PointerInputChange(long j10, long j11, long j12, boolean z10, long j13, long j14, boolean z11, boolean z12, int i10, long j15, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, j11, j12, z10, j13, j14, z11, z12, (i11 & 256) != 0 ? PointerType.INSTANCE.m3539getTouchT8wyACA() : i10, (i11 & 512) != 0 ? Offset.INSTANCE.m2291getZeroF1C5BW0() : j15, (DefaultConstructorMarker) null);
    }

    public PointerInputChange(long j10, long j11, long j12, boolean z10, long j13, long j14, boolean z11, boolean z12, int i10, long j15, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, j11, j12, z10, 1.0f, j13, j14, z11, z12, i10, j15, (DefaultConstructorMarker) null);
    }

    public /* synthetic */ PointerInputChange(long j10, long j11, long j12, boolean z10, long j13, long j14, boolean z11, ConsumedData consumedData, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, j11, j12, z10, j13, j14, z11, consumedData, (i11 & 256) != 0 ? PointerType.INSTANCE.m3539getTouchT8wyACA() : i10, null);
    }
}
