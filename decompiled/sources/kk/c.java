package kk;

import androidx.core.content.pm.o0;
import com.esotericsoftware.kryo.serializers.i0;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: PathRecursiveFunctions.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f79338a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f79339b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final ArrayList f79340c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public Path f79341d;

    public c() {
        this(0, 1, null);
    }

    public final void collect(@NotNull Exception exception) {
        Intrinsics.checkNotNullParameter(exception, "exception");
        this.f79339b++;
        ArrayList arrayList = this.f79340c;
        if (arrayList.size() < this.f79338a) {
            if (this.f79341d != null) {
                o0.h();
                Throwable thInitCause = i0.c(String.valueOf(this.f79341d)).initCause(exception);
                Intrinsics.checkNotNull(thInitCause, "null cannot be cast to non-null type java.nio.file.FileSystemException");
                exception = androidx.core.util.d.e(thInitCause);
            }
            arrayList.add(exception);
        }
    }

    public final void enterEntry(@NotNull Path name) {
        Intrinsics.checkNotNullParameter(name, "name");
        Path path = this.f79341d;
        this.f79341d = path != null ? path.resolve(name) : null;
    }

    public final void exitEntry(@NotNull Path name) {
        Intrinsics.checkNotNullParameter(name, "name");
        Path path = this.f79341d;
        if (!Intrinsics.areEqual(name, path != null ? path.getFileName() : null)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        Path path2 = this.f79341d;
        this.f79341d = path2 != null ? path2.getParent() : null;
    }

    @NotNull
    public final List<Exception> getCollectedExceptions() {
        return this.f79340c;
    }

    public final int getTotalExceptions() {
        return this.f79339b;
    }

    public final void setPath(@Nullable Path path) {
        this.f79341d = path;
    }

    public c(int i10) {
        this.f79338a = i10;
        this.f79340c = new ArrayList();
    }

    public /* synthetic */ c(int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 64 : i10);
    }
}
