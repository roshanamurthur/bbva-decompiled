package kotlin.reflect.jvm.internal.impl.descriptors.annotations;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt___SequencesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Annotations.kt */
/* JADX INFO: loaded from: classes12.dex */
@SourceDebugExtension({"SMAP\nAnnotations.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Annotations.kt\norg/jetbrains/kotlin/descriptors/annotations/CompositeAnnotations\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n*L\n1#1,123:1\n1726#2,3:124\n1360#2:129\n1446#2,5:130\n1247#3,2:127\n*S KotlinDebug\n*F\n+ 1 Annotations.kt\norg/jetbrains/kotlin/descriptors/annotations/CompositeAnnotations\n*L\n105#1:124,3\n112#1:129\n112#1:130,5\n107#1:127,2\n*E\n"})
public final class CompositeAnnotations implements Annotations {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    public final List<Annotations> f80257p0;

    /* JADX INFO: compiled from: Annotations.kt */
    public static final class a extends Lambda implements Function1<Annotations, AnnotationDescriptor> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ FqName f80258p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(FqName fqName) {
            super(1);
            this.f80258p0 = fqName;
        }

        @Override // kotlin.jvm.functions.Function1
        @Nullable
        public final AnnotationDescriptor invoke(@NotNull Annotations it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return it.mo5773findAnnotation(this.f80258p0);
        }
    }

    /* JADX INFO: compiled from: Annotations.kt */
    public static final class b extends Lambda implements Function1<Annotations, Sequence<? extends AnnotationDescriptor>> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final b f80259p0 = new b(1);

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        public final Sequence<AnnotationDescriptor> invoke(@NotNull Annotations it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return CollectionsKt___CollectionsKt.asSequence(it);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CompositeAnnotations(@NotNull List<? extends Annotations> delegates) {
        Intrinsics.checkNotNullParameter(delegates, "delegates");
        this.f80257p0 = delegates;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations
    @Nullable
    /* JADX INFO: renamed from: findAnnotation */
    public AnnotationDescriptor mo5773findAnnotation(@NotNull FqName fqName) {
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        return (AnnotationDescriptor) SequencesKt___SequencesKt.firstOrNull(SequencesKt___SequencesKt.mapNotNull(CollectionsKt___CollectionsKt.asSequence(this.f80257p0), new a(fqName)));
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations
    public boolean hasAnnotation(@NotNull FqName fqName) {
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        Iterator it = CollectionsKt___CollectionsKt.asSequence(this.f80257p0).iterator();
        while (it.hasNext()) {
            if (((Annotations) it.next()).hasAnnotation(fqName)) {
                return true;
            }
        }
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations
    public boolean isEmpty() {
        List<Annotations> list = this.f80257p0;
        if ((list instanceof Collection) && list.isEmpty()) {
            return true;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            if (!((Annotations) it.next()).isEmpty()) {
                return false;
            }
        }
        return true;
    }

    @Override // java.lang.Iterable
    @NotNull
    public Iterator<AnnotationDescriptor> iterator() {
        return SequencesKt___SequencesKt.flatMap(CollectionsKt___CollectionsKt.asSequence(this.f80257p0), b.f80259p0).iterator();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CompositeAnnotations(@NotNull Annotations... delegates) {
        this((List<? extends Annotations>) ArraysKt___ArraysKt.toList(delegates));
        Intrinsics.checkNotNullParameter(delegates, "delegates");
    }
}
