package androidx.compose.ui.node;

import androidx.compose.ui.Modifier;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: NodeCoordinator.kt */
/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nNodeCoordinator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NodeCoordinator.kt\nandroidx/compose/ui/node/NodeCoordinator$hit$1\n+ 2 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n*L\n1#1,1351:1\n72#2:1352\n*S KotlinDebug\n*F\n+ 1 NodeCoordinator.kt\nandroidx/compose/ui/node/NodeCoordinator$hit$1\n*L\n596#1:1352\n*E\n"})
public final class f extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ NodeCoordinator f16948p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ Modifier.Node f16949q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ NodeCoordinator.HitTestSource f16950r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final /* synthetic */ long f16951s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final /* synthetic */ HitTestResult f16952t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final /* synthetic */ boolean f16953u0;
    public final /* synthetic */ boolean v0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(NodeCoordinator nodeCoordinator, Modifier.Node node, NodeCoordinator.HitTestSource hitTestSource, long j10, HitTestResult hitTestResult, boolean z10, boolean z11) {
        super(0);
        this.f16948p0 = nodeCoordinator;
        this.f16949q0 = node;
        this.f16950r0 = hitTestSource;
        this.f16951s0 = j10;
        this.f16952t0 = hitTestResult;
        this.f16953u0 = z10;
        this.v0 = z11;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        NodeCoordinator.m3703access$hit1hIXUjU(this.f16948p0, NodeCoordinatorKt.m3723access$nextUntilhw7D004(this.f16949q0, this.f16950r0.mo3722entityTypeOLwlOKw(), NodeKind.m3725constructorimpl(2)), this.f16950r0, this.f16951s0, this.f16952t0, this.f16953u0, this.v0);
        return Unit.INSTANCE;
    }
}
