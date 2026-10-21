package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: predefinedEnhancementInfo.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class TypeEnhancementInfo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Map<Integer, JavaTypeQualifiers> f80840a;

    public TypeEnhancementInfo(@NotNull Map<Integer, JavaTypeQualifiers> map) {
        Intrinsics.checkNotNullParameter(map, "map");
        this.f80840a = map;
    }

    @NotNull
    public final Map<Integer, JavaTypeQualifiers> getMap() {
        return this.f80840a;
    }
}
