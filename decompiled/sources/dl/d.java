package dl;

import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;

/* JADX INFO: compiled from: OverridingUtil.java */
/* JADX INFO: loaded from: classes12.dex */
public final class d implements Function1<CallableMemberDescriptor, CallableDescriptor> {
    @Override // kotlin.jvm.functions.Function1
    public CallableDescriptor invoke(CallableMemberDescriptor callableMemberDescriptor) {
        return callableMemberDescriptor;
    }
}
