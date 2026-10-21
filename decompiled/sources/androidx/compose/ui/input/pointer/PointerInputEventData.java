package androidx.compose.ui.input.pointer;

import androidx.compose.ui.geometry.Offset;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import com.mypinpad.tsdk.isolation.z1;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: InternalPointerInput.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\"\b\u0080\b\u0018\u00002\u00020\u0001Bf\u0012\u0006\u0010\u001b\u001a\u00020\u0002\u0012\u0006\u0010\u001c\u001a\u00020\u0006\u0012\u0006\u0010\u001d\u001a\u00020\b\u0012\u0006\u0010\u001e\u001a\u00020\b\u0012\u0006\u0010\u001f\u001a\u00020\r\u0012\u0006\u0010 \u001a\u00020\u000f\u0012\u0006\u0010!\u001a\u00020\u0011\u0012\b\b\u0002\u0010\"\u001a\u00020\r\u0012\u000e\b\u0002\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016\u0012\b\b\u0002\u0010$\u001a\u00020\bø\u0001\u0002¢\u0006\u0004\bJ\u0010KJ\u0019\u0010\u0005\u001a\u00020\u0002HÆ\u0003ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0006HÆ\u0003J\u0019\u0010\n\u001a\u00020\bHÆ\u0003ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\t\u0010\u0004J\u0019\u0010\f\u001a\u00020\bHÆ\u0003ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u000b\u0010\u0004J\t\u0010\u000e\u001a\u00020\rHÆ\u0003J\t\u0010\u0010\u001a\u00020\u000fHÆ\u0003J\u0019\u0010\u0014\u001a\u00020\u0011HÆ\u0003ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\t\u0010\u0015\u001a\u00020\rHÆ\u0003J\u000f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016HÆ\u0003J\u0019\u0010\u001a\u001a\u00020\bHÆ\u0003ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0019\u0010\u0004J\u0080\u0001\u0010'\u001a\u00020\u00002\b\b\u0002\u0010\u001b\u001a\u00020\u00022\b\b\u0002\u0010\u001c\u001a\u00020\u00062\b\b\u0002\u0010\u001d\u001a\u00020\b2\b\b\u0002\u0010\u001e\u001a\u00020\b2\b\b\u0002\u0010\u001f\u001a\u00020\r2\b\b\u0002\u0010 \u001a\u00020\u000f2\b\b\u0002\u0010!\u001a\u00020\u00112\b\b\u0002\u0010\"\u001a\u00020\r2\u000e\b\u0002\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00170\u00162\b\b\u0002\u0010$\u001a\u00020\bHÆ\u0001ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b%\u0010&J\t\u0010)\u001a\u00020(HÖ\u0001J\t\u0010+\u001a\u00020*HÖ\u0001J\u0013\u0010-\u001a\u00020\r2\b\u0010,\u001a\u0004\u0018\u00010\u0001HÖ\u0003R \u0010\u001b\u001a\u00020\u00028\u0006ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u0010\u0004R\u0017\u0010\u001c\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b1\u0010/\u001a\u0004\b2\u0010\u0004R \u0010\u001d\u001a\u00020\b8\u0006ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b3\u0010/\u001a\u0004\b4\u0010\u0004R \u0010\u001e\u001a\u00020\b8\u0006ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b5\u0010/\u001a\u0004\b6\u0010\u0004R\u0017\u0010\u001f\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010:R\u0017\u0010 \u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>R \u0010!\u001a\u00020\u00118\u0006ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\bA\u0010\u0013R\u0017\u0010\"\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\bB\u00108\u001a\u0004\bC\u0010:R\u001d\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00170\u00168\u0006¢\u0006\f\n\u0004\bD\u0010E\u001a\u0004\bF\u0010GR \u0010$\u001a\u00020\b8\u0006ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\bH\u0010/\u001a\u0004\bI\u0010\u0004\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006L"}, d2 = {"Landroidx/compose/ui/input/pointer/PointerInputEventData;", "", "Landroidx/compose/ui/input/pointer/PointerId;", "component1-J3iCeTQ", "()J", "component1", "", "component2", "Landroidx/compose/ui/geometry/Offset;", "component3-F1C5BW0", "component3", "component4-F1C5BW0", "component4", "", "component5", "", "component6", "Landroidx/compose/ui/input/pointer/PointerType;", "component7-T8wyACA", "()I", "component7", "component8", "", "Landroidx/compose/ui/input/pointer/HistoricalChange;", "component9", "component10-F1C5BW0", "component10", "id", "uptime", "positionOnScreen", "position", "down", "pressure", "type", "issuesEnterExit", "historical", "scrollDelta", "copy-gYeeOSc", "(JJJJZFIZLjava/util/List;J)Landroidx/compose/ui/input/pointer/PointerInputEventData;", "copy", "", "toString", "", GenerateActivationFormCommand.HASH_CODE, "other", "equals", "a", "J", "getId-J3iCeTQ", "b", "getUptime", "c", "getPositionOnScreen-F1C5BW0", "d", "getPosition-F1C5BW0", "e", "Z", "getDown", "()Z", "f", "F", "getPressure", "()F", "g", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getType-T8wyACA", "h", "getIssuesEnterExit", "i", "Ljava/util/List;", "getHistorical", "()Ljava/util/List;", "j", "getScrollDelta-F1C5BW0", "<init>", "(JJJJZFIZLjava/util/List;JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "ui_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class PointerInputEventData {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final long id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final long uptime;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final long positionOnScreen;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public final long position;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public final boolean down;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    public final float pressure;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    public final int type;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    public final boolean issuesEnterExit;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final List<HistoricalChange> historical;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    public final long scrollDelta;

    public PointerInputEventData() {
        throw null;
    }

    public PointerInputEventData(long j10, long j11, long j12, long j13, boolean z10, float f6, int i10, boolean z11, List historical, long j14, DefaultConstructorMarker defaultConstructorMarker) {
        Intrinsics.checkNotNullParameter(historical, "historical");
        this.id = j10;
        this.uptime = j11;
        this.positionOnScreen = j12;
        this.position = j13;
        this.down = z10;
        this.pressure = f6;
        this.type = i10;
        this.issuesEnterExit = z11;
        this.historical = historical;
        this.scrollDelta = j14;
    }

    /* JADX INFO: renamed from: component1-J3iCeTQ, reason: not valid java name and from getter */
    public final long getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component10-F1C5BW0, reason: not valid java name and from getter */
    public final long getScrollDelta() {
        return this.scrollDelta;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getUptime() {
        return this.uptime;
    }

    /* JADX INFO: renamed from: component3-F1C5BW0, reason: not valid java name and from getter */
    public final long getPositionOnScreen() {
        return this.positionOnScreen;
    }

    /* JADX INFO: renamed from: component4-F1C5BW0, reason: not valid java name and from getter */
    public final long getPosition() {
        return this.position;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final boolean getDown() {
        return this.down;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final float getPressure() {
        return this.pressure;
    }

    /* JADX INFO: renamed from: component7-T8wyACA, reason: not valid java name and from getter */
    public final int getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final boolean getIssuesEnterExit() {
        return this.issuesEnterExit;
    }

    @NotNull
    public final List<HistoricalChange> component9() {
        return this.historical;
    }

    @NotNull
    /* JADX INFO: renamed from: copy-gYeeOSc, reason: not valid java name */
    public final PointerInputEventData m3488copygYeeOSc(long id, long uptime, long positionOnScreen, long position, boolean down, float pressure, int type, boolean issuesEnterExit, @NotNull List<HistoricalChange> historical, long scrollDelta) {
        Intrinsics.checkNotNullParameter(historical, "historical");
        return new PointerInputEventData(id, uptime, positionOnScreen, position, down, pressure, type, issuesEnterExit, historical, scrollDelta, null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PointerInputEventData)) {
            return false;
        }
        PointerInputEventData pointerInputEventData = (PointerInputEventData) other;
        return PointerId.m3461equalsimpl0(this.id, pointerInputEventData.id) && this.uptime == pointerInputEventData.uptime && Offset.m2272equalsimpl0(this.positionOnScreen, pointerInputEventData.positionOnScreen) && Offset.m2272equalsimpl0(this.position, pointerInputEventData.position) && this.down == pointerInputEventData.down && Float.compare(this.pressure, pointerInputEventData.pressure) == 0 && PointerType.m3532equalsimpl0(this.type, pointerInputEventData.type) && this.issuesEnterExit == pointerInputEventData.issuesEnterExit && Intrinsics.areEqual(this.historical, pointerInputEventData.historical) && Offset.m2272equalsimpl0(this.scrollDelta, pointerInputEventData.scrollDelta);
    }

    public final boolean getDown() {
        return this.down;
    }

    @NotNull
    public final List<HistoricalChange> getHistorical() {
        return this.historical;
    }

    /* JADX INFO: renamed from: getId-J3iCeTQ, reason: not valid java name */
    public final long m3489getIdJ3iCeTQ() {
        return this.id;
    }

    public final boolean getIssuesEnterExit() {
        return this.issuesEnterExit;
    }

    /* JADX INFO: renamed from: getPosition-F1C5BW0, reason: not valid java name */
    public final long m3490getPositionF1C5BW0() {
        return this.position;
    }

    /* JADX INFO: renamed from: getPositionOnScreen-F1C5BW0, reason: not valid java name */
    public final long m3491getPositionOnScreenF1C5BW0() {
        return this.positionOnScreen;
    }

    public final float getPressure() {
        return this.pressure;
    }

    /* JADX INFO: renamed from: getScrollDelta-F1C5BW0, reason: not valid java name */
    public final long m3492getScrollDeltaF1C5BW0() {
        return this.scrollDelta;
    }

    /* JADX INFO: renamed from: getType-T8wyACA, reason: not valid java name */
    public final int m3493getTypeT8wyACA() {
        return this.type;
    }

    public final long getUptime() {
        return this.uptime;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v8, types: [int] */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8, types: [int] */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v3, types: [int] */
    /* JADX WARN: Type inference failed for: r3v9, types: [int] */
    public int hashCode() {
        int iM3462hashCodeimpl = PointerId.m3462hashCodeimpl(this.id) * 31;
        long j10 = this.uptime;
        int iM2277hashCodeimpl = (Offset.m2277hashCodeimpl(this.position) + ((Offset.m2277hashCodeimpl(this.positionOnScreen) + ((iM3462hashCodeimpl + ((int) (j10 ^ (j10 >>> 32)))) * 31)) * 31)) * 31;
        boolean z10 = this.down;
        ?? r3 = z10;
        if (z10) {
            r3 = 1;
        }
        int iM3533hashCodeimpl = (PointerType.m3533hashCodeimpl(this.type) + z1.a(this.pressure, (iM2277hashCodeimpl + r3) * 31, 31)) * 31;
        boolean z11 = this.issuesEnterExit;
        return Offset.m2277hashCodeimpl(this.scrollDelta) + com.google.android.gms.measurement.internal.a.a(this.historical, (iM3533hashCodeimpl + (z11 ? 1 : z11)) * 31, 31);
    }

    @NotNull
    public String toString() {
        return "PointerInputEventData(id=" + ((Object) PointerId.m3463toStringimpl(this.id)) + ", uptime=" + this.uptime + ", positionOnScreen=" + ((Object) Offset.m2283toStringimpl(this.positionOnScreen)) + ", position=" + ((Object) Offset.m2283toStringimpl(this.position)) + ", down=" + this.down + ", pressure=" + this.pressure + ", type=" + ((Object) PointerType.m3534toStringimpl(this.type)) + ", issuesEnterExit=" + this.issuesEnterExit + ", historical=" + this.historical + ", scrollDelta=" + ((Object) Offset.m2283toStringimpl(this.scrollDelta)) + RootService.CLOSE_BRACKET;
    }

    public /* synthetic */ PointerInputEventData(long j10, long j11, long j12, long j13, boolean z10, float f6, int i10, boolean z11, List list, long j14, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, j11, j12, j13, z10, f6, i10, (i11 & 128) != 0 ? false : z11, (i11 & 256) != 0 ? new ArrayList() : list, (i11 & 512) != 0 ? Offset.INSTANCE.m2291getZeroF1C5BW0() : j14, null);
    }
}
