package dl;

import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;

/* JADX INFO: compiled from: OverridingUtil.java */
/* JADX INFO: loaded from: classes12.dex */
public final class c implements Function1<CallableMemberDescriptor, Boolean> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ DeclarationDescriptor f68199p0;

    public c(DeclarationDescriptor declarationDescriptor) {
        this.f68199p0 = declarationDescriptor;
    }

    @Override // kotlin.jvm.functions.Function1
    public Boolean invoke(CallableMemberDescriptor callableMemberDescriptor) {
        return Boolean.valueOf(callableMemberDescriptor.getContainingDeclaration() == this.f68199p0);
    }
}
