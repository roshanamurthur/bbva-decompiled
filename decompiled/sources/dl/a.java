package dl;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.FindClassInModuleKt;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.name.StandardClassIds;
import kotlin.reflect.jvm.internal.impl.resolve.StdlibClassFinder;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: StdlibClassFinder.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class a implements StdlibClassFinder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f68195a = new a();

    @Override // kotlin.reflect.jvm.internal.impl.resolve.StdlibClassFinder
    @Nullable
    public ClassDescriptor findEnumEntriesClass(@NotNull ModuleDescriptor moduleDescriptor) {
        Intrinsics.checkNotNullParameter(moduleDescriptor, "moduleDescriptor");
        return FindClassInModuleKt.findClassAcrossModuleDependencies(moduleDescriptor, StandardClassIds.INSTANCE.getEnumEntries());
    }
}
