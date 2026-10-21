package kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.List;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: PackageViewDescriptor.kt */
/* JADX INFO: loaded from: classes12.dex */
public interface PackageViewDescriptor extends DeclarationDescriptor {
    @NotNull
    FqName getFqName();

    @NotNull
    List<PackageFragmentDescriptor> getFragments();

    @NotNull
    MemberScope getMemberScope();

    @NotNull
    ModuleDescriptor getModule();

    boolean isEmpty();
}
