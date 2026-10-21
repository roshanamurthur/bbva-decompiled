package kotlin.reflect.jvm.internal.impl.descriptors.annotations;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Annotations.kt */
/* JADX INFO: loaded from: classes12.dex */
@SourceDebugExtension({"SMAP\nAnnotations.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Annotations.kt\norg/jetbrains/kotlin/descriptors/annotations/FilteredAnnotations\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,123:1\n766#2:124\n857#2,2:125\n1747#2,3:127\n*S KotlinDebug\n*F\n+ 1 Annotations.kt\norg/jetbrains/kotlin/descriptors/annotations/FilteredAnnotations\n*L\n69#1:124\n69#1:125,2\n72#1:127,3\n*E\n"})
public final class FilteredAnnotations implements Annotations {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    public final Annotations f80260p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final boolean f80261q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    @NotNull
    public final Function1<FqName, Boolean> f80262r0;

    /* JADX WARN: Multi-variable type inference failed */
    public FilteredAnnotations(@NotNull Annotations delegate, boolean z10, @NotNull Function1<? super FqName, Boolean> fqNameFilter) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        Intrinsics.checkNotNullParameter(fqNameFilter, "fqNameFilter");
        this.f80260p0 = delegate;
        this.f80261q0 = z10;
        this.f80262r0 = fqNameFilter;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations
    @Nullable
    /* JADX INFO: renamed from: findAnnotation */
    public AnnotationDescriptor mo5773findAnnotation(@NotNull FqName fqName) {
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        if (this.f80262r0.invoke(fqName).booleanValue()) {
            return this.f80260p0.mo5773findAnnotation(fqName);
        }
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations
    public boolean hasAnnotation(@NotNull FqName fqName) {
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        if (this.f80262r0.invoke(fqName).booleanValue()) {
            return this.f80260p0.hasAnnotation(fqName);
        }
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations
    public boolean isEmpty() {
        boolean z10;
        Annotations annotations = this.f80260p0;
        if (!(annotations instanceof Collection) || !((Collection) annotations).isEmpty()) {
            Iterator<AnnotationDescriptor> it = annotations.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z10 = false;
                    break;
                }
                FqName fqName = it.next().getFqName();
                if (fqName != null && this.f80262r0.invoke(fqName).booleanValue()) {
                    z10 = true;
                    break;
                }
            }
        } else {
            z10 = false;
            break;
        }
        if (this.f80261q0) {
            return !z10;
        }
        return z10;
    }

    @Override // java.lang.Iterable
    @NotNull
    public Iterator<AnnotationDescriptor> iterator() {
        ArrayList arrayList = new ArrayList();
        for (AnnotationDescriptor annotationDescriptor : this.f80260p0) {
            FqName fqName = annotationDescriptor.getFqName();
            if (fqName != null && this.f80262r0.invoke(fqName).booleanValue()) {
                arrayList.add(annotationDescriptor);
            }
        }
        return arrayList.iterator();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FilteredAnnotations(@NotNull Annotations delegate, @NotNull Function1<? super FqName, Boolean> fqNameFilter) {
        this(delegate, false, fqNameFilter);
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        Intrinsics.checkNotNullParameter(fqNameFilter, "fqNameFilter");
    }
}
