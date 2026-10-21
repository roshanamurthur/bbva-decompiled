package yk;

import java.util.Collection;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaStaticClassScope;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.utils.DFS;
import kotlin.sequences.SequencesKt___SequencesKt;

/* JADX INFO: loaded from: classes12.dex */
public final class c implements DFS.Neighbors {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f94870a = new c();

    @Override // kotlin.reflect.jvm.internal.impl.utils.DFS.Neighbors
    public Iterable getNeighbors(Object obj) {
        int i10 = LazyJavaStaticClassScope.f80744o;
        Collection<KotlinType> supertypes = ((ClassDescriptor) obj).getTypeConstructor().getSupertypes();
        Intrinsics.checkNotNullExpressionValue(supertypes, "getSupertypes(...)");
        return SequencesKt___SequencesKt.asIterable(SequencesKt___SequencesKt.mapNotNull(CollectionsKt___CollectionsKt.asSequence(supertypes), d.f94871p0));
    }
}
