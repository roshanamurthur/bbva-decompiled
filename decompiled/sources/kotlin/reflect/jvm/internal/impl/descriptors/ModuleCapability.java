package kotlin.reflect.jvm.internal.impl.descriptors;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: ModuleCapability.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class ModuleCapability<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f80207a;

    public ModuleCapability(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.f80207a = name;
    }

    @NotNull
    public String toString() {
        return this.f80207a;
    }
}
