package kk;

import java.nio.file.Path;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: PathTreeWalk.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Path f79346a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final Object f79347b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final e f79348c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public Iterator<e> f79349d;

    public e(@NotNull Path path, @Nullable Object obj, @Nullable e eVar) {
        Intrinsics.checkNotNullParameter(path, "path");
        this.f79346a = path;
        this.f79347b = obj;
        this.f79348c = eVar;
    }

    @Nullable
    public final Iterator<e> getContentIterator() {
        return this.f79349d;
    }

    @Nullable
    public final Object getKey() {
        return this.f79347b;
    }

    @Nullable
    public final e getParent() {
        return this.f79348c;
    }

    @NotNull
    public final Path getPath() {
        return this.f79346a;
    }

    public final void setContentIterator(@Nullable Iterator<e> it) {
        this.f79349d = it;
    }
}
