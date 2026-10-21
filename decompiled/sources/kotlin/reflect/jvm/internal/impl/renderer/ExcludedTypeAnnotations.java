package kotlin.reflect.jvm.internal.impl.renderer;

import bk.w;
import java.util.Set;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: DescriptorRenderer.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class ExcludedTypeAnnotations {

    @NotNull
    public static final ExcludedTypeAnnotations INSTANCE = new ExcludedTypeAnnotations();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final Set<FqName> f81504a = w.setOf((Object[]) new FqName[]{new FqName("kotlin.internal.NoInfer"), new FqName("kotlin.internal.Exact")});

    @NotNull
    public final Set<FqName> getInternalAnnotationsForResolve() {
        return f81504a;
    }
}
