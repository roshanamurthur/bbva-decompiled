package androidx.compose.ui.node;

import androidx.compose.ui.Modifier;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: NodeCoordinator.kt */
/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nNodeCoordinator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NodeCoordinator.kt\nandroidx/compose/ui/node/NodeCoordinator$hitNear$1\n+ 2 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n*L\n1#1,1351:1\n72#2:1352\n*S KotlinDebug\n*F\n+ 1 NodeCoordinator.kt\nandroidx/compose/ui/node/NodeCoordinator$hitNear$1\n*L\n623#1:1352\n*E\n"})
public final class g extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ NodeCoordinator f16954p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ Modifier.Node f16955q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ NodeCoordinator.HitTestSource f16956r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final /* synthetic */ long f16957s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final /* synthetic */ HitTestResult f16958t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final /* synthetic */ boolean f16959u0;
    public final /* synthetic */ boolean v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public final /* synthetic */ float f16960w0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(NodeCoordinator nodeCoordinator, Modifier.Node node, NodeCoordinator.HitTestSource hitTestSource, long j10, HitTestResult hitTestResult, boolean z10, boolean z11, float f6) {
        super(0);
        this.f16954p0 = nodeCoordinator;
        this.f16955q0 = node;
        this.f16956r0 = hitTestSource;
        this.f16957s0 = j10;
        this.f16958t0 = hitTestResult;
        this.f16959u0 = z10;
        this.v0 = z11;
        this.f16960w0 = f6;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        NodeCoordinator.m3704access$hitNearJHbHoSQ(this.f16954p0, NodeCoordinatorKt.m3723access$nextUntilhw7D004(this.f16955q0, this.f16956r0.mo3722entityTypeOLwlOKw(), NodeKind.m3725constructorimpl(2)), this.f16956r0, this.f16957s0, this.f16958t0, this.f16959u0, this.v0, this.f16960w0);
        return Unit.INSTANCE;
    }
}
