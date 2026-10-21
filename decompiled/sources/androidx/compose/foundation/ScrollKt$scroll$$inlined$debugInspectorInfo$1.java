package androidx.compose.foundation;

import androidx.compose.foundation.gestures.FlingBehavior;
import androidx.compose.ui.platform.InspectorInfo;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: InspectableValue.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003¨\u0006\u0004"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/platform/InspectorInfo;", "invoke", "androidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1"}, k = 3, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 Scroll.kt\nandroidx/compose/foundation/ScrollKt\n*L\n1#1,170:1\n321#2,7:171\n*E\n"})
public final class ScrollKt$scroll$$inlined$debugInspectorInfo$1 extends Lambda implements Function1<InspectorInfo, Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ ScrollState f3460p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ boolean f3461q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ FlingBehavior f3462r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final /* synthetic */ boolean f3463s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final /* synthetic */ boolean f3464t0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScrollKt$scroll$$inlined$debugInspectorInfo$1(ScrollState scrollState, boolean z10, FlingBehavior flingBehavior, boolean z11, boolean z12) {
        super(1);
        this.f3460p0 = scrollState;
        this.f3461q0 = z10;
        this.f3462r0 = flingBehavior;
        this.f3463s0 = z11;
        this.f3464t0 = z12;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull InspectorInfo inspectorInfo) {
        androidx.activity.a.c(inspectorInfo, "$this$null", "scroll").set("state", this.f3460p0);
        com.google.android.gms.internal.mlkit_vision_barcode_bundled.a.b(this.f3461q0, inspectorInfo.getCom.bbva.glomohybrid.logs.LogKeysKt.PROPERTIES java.lang.String(), "reverseScrolling", inspectorInfo).set("flingBehavior", this.f3462r0);
        com.google.android.gms.internal.mlkit_vision_barcode_bundled.a.b(this.f3463s0, inspectorInfo.getCom.bbva.glomohybrid.logs.LogKeysKt.PROPERTIES java.lang.String(), "isScrollable", inspectorInfo).set("isVertical", Boolean.valueOf(this.f3464t0));
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(InspectorInfo inspectorInfo) {
        invoke2(inspectorInfo);
        return Unit.INSTANCE;
    }
}
