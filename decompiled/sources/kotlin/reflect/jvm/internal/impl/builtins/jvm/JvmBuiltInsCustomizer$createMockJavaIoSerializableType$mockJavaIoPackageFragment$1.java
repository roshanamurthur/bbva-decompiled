package kotlin.reflect.jvm.internal.impl.builtins.jvm;

import kotlin.reflect.jvm.internal.impl.descriptors.impl.PackageFragmentDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: JvmBuiltInsCustomizer.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class JvmBuiltInsCustomizer$createMockJavaIoSerializableType$mockJavaIoPackageFragment$1 extends PackageFragmentDescriptorImpl {
    @Override // kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor
    @NotNull
    public MemberScope.Empty getMemberScope() {
        return MemberScope.Empty.INSTANCE;
    }
}
