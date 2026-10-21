package kotlin.reflect.jvm.internal.impl.resolve;

import dl.a;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleCapability;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: StdlibClassFinder.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class StdlibClassFinderKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final ModuleCapability<StdlibClassFinder> f81530a = new ModuleCapability<>("StdlibClassFinder");

    @NotNull
    public static final StdlibClassFinder getStdlibClassFinder(@NotNull ModuleDescriptor moduleDescriptor) {
        Intrinsics.checkNotNullParameter(moduleDescriptor, "<this>");
        StdlibClassFinder stdlibClassFinder = (StdlibClassFinder) moduleDescriptor.getCapability(f81530a);
        return stdlibClassFinder == null ? a.f68195a : stdlibClassFinder;
    }
}
