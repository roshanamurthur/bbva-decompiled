package il;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: utils.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final KotlinType f69721a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final a f69722b;

    public a(@NotNull KotlinType type, @Nullable a aVar) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.f69721a = type;
        this.f69722b = aVar;
    }

    @Nullable
    public final a getPrevious() {
        return this.f69722b;
    }

    @NotNull
    public final KotlinType getType() {
        return this.f69721a;
    }
}
