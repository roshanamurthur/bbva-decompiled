package dl;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.OverridingStrategy;

/* JADX INFO: compiled from: OverridingUtil.java */
/* JADX INFO: loaded from: classes12.dex */
public final class e implements Function1<CallableMemberDescriptor, Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ OverridingStrategy f68200p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ CallableMemberDescriptor f68201q0;

    public e(OverridingStrategy overridingStrategy, CallableMemberDescriptor callableMemberDescriptor) {
        this.f68200p0 = overridingStrategy;
        this.f68201q0 = callableMemberDescriptor;
    }

    @Override // kotlin.jvm.functions.Function1
    public Unit invoke(CallableMemberDescriptor callableMemberDescriptor) {
        this.f68200p0.inheritanceConflict(this.f68201q0, callableMemberDescriptor);
        return Unit.INSTANCE;
    }
}
