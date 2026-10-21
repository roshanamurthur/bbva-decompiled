package qk;

import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlin.reflect.KClassifier;
import kotlin.reflect.KType;
import kotlin.reflect.jvm.internal.KTypeImpl;
import kotlin.reflect.jvm.internal.KotlinReflectionInternalError;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.utils.DFS;

/* JADX INFO: loaded from: classes12.dex */
public final class a implements DFS.Neighbors {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f92875a = new a();

    @Override // kotlin.reflect.jvm.internal.impl.utils.DFS.Neighbors
    public Iterable getNeighbors(Object obj) {
        KType kType = (KType) obj;
        KClassifier classifier = kType.getClassifier();
        KClass kClass = classifier instanceof KClass ? (KClass) classifier : null;
        if (kClass == null) {
            throw new KotlinReflectionInternalError("Supertype not a class: " + kType);
        }
        List<KType> supertypes = kClass.getSupertypes();
        if (kType.getArguments().isEmpty()) {
            return supertypes;
        }
        Intrinsics.checkNotNull(kType, "null cannot be cast to non-null type kotlin.reflect.jvm.internal.KTypeImpl");
        TypeSubstitutor typeSubstitutorCreate = TypeSubstitutor.create(((KTypeImpl) kType).getF80013p0());
        List<KType> list = supertypes;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        for (KType kType2 : list) {
            Intrinsics.checkNotNull(kType2, "null cannot be cast to non-null type kotlin.reflect.jvm.internal.KTypeImpl");
            KotlinType kotlinTypeSubstitute = typeSubstitutorCreate.substitute(((KTypeImpl) kType2).getF80013p0(), Variance.INVARIANT);
            if (kotlinTypeSubstitute == null) {
                throw new KotlinReflectionInternalError("Type substitution failed: " + kType2 + " (" + kType + RootService.CLOSE_BRACKET);
            }
            Intrinsics.checkNotNull(kotlinTypeSubstitute);
            arrayList.add(new KTypeImpl(kotlinTypeSubstitute, null, 2, null));
        }
        return arrayList;
    }
}
