package al;

import java.util.Iterator;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: typeEnhancement.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class b implements Annotations {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    public final FqName f261p0;

    public b(@NotNull FqName fqNameToMatch) {
        Intrinsics.checkNotNullParameter(fqNameToMatch, "fqNameToMatch");
        this.f261p0 = fqNameToMatch;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations
    public boolean hasAnnotation(@NotNull FqName fqName) {
        return Annotations.DefaultImpls.hasAnnotation(this, fqName);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations
    public boolean isEmpty() {
        return false;
    }

    @Override // java.lang.Iterable
    @NotNull
    public Iterator<AnnotationDescriptor> iterator() {
        return CollectionsKt__CollectionsKt.emptyList().iterator();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations
    @Nullable
    /* JADX INFO: renamed from: findAnnotation */
    public a mo5773findAnnotation(@NotNull FqName fqName) {
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        if (Intrinsics.areEqual(fqName, this.f261p0)) {
            return a.f260a;
        }
        return null;
    }
}
