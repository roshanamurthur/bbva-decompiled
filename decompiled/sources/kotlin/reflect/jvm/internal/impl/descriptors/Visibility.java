package kotlin.reflect.jvm.internal.impl.descriptors;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Visibility.kt */
/* JADX INFO: loaded from: classes12.dex */
public abstract class Visibility {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f80237a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f80238b;

    public Visibility(@NotNull String name, boolean z10) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.f80237a = name;
        this.f80238b = z10;
    }

    @Nullable
    public Integer compareTo(@NotNull Visibility visibility) {
        Intrinsics.checkNotNullParameter(visibility, "visibility");
        return Visibilities.INSTANCE.compareLocal$compiler_common(this, visibility);
    }

    @NotNull
    public String getInternalDisplayName() {
        return this.f80237a;
    }

    public final boolean isPublicAPI() {
        return this.f80238b;
    }

    @NotNull
    public final String toString() {
        return getInternalDisplayName();
    }

    @NotNull
    public Visibility normalize() {
        return this;
    }
}
