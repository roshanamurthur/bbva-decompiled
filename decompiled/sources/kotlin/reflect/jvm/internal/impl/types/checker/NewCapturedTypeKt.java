package kotlin.reflect.jvm.internal.impl.types.checker;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructorSubstitution;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import kotlin.reflect.jvm.internal.impl.types.UnwrappedType;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.model.CaptureStatus;
import kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: NewCapturedType.kt */
/* JADX INFO: loaded from: classes12.dex */
@SourceDebugExtension({"SMAP\nNewCapturedType.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NewCapturedType.kt\norg/jetbrains/kotlin/types/checker/NewCapturedTypeKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,290:1\n1#2:291\n1#2:310\n1655#3,8:292\n1603#3,9:300\n1855#3:309\n1856#3:311\n1612#3:312\n1726#3,3:313\n1549#3:316\n1620#3,3:317\n1620#3,3:320\n1549#3:323\n1620#3,3:324\n*S KotlinDebug\n*F\n+ 1 NewCapturedType.kt\norg/jetbrains/kotlin/types/checker/NewCapturedTypeKt\n*L\n122#1:310\n117#1:292,8\n122#1:300,9\n122#1:309\n122#1:311\n122#1:312\n154#1:313,3\n156#1:316\n156#1:317,3\n176#1:320,3\n81#1:323\n81#1:324,3\n*E\n"})
public final class NewCapturedTypeKt {
    /* JADX WARN: Code duplicated, block: B:4:0x0021  */
    @Nullable
    public static final SimpleType captureFromArguments(@NotNull SimpleType type, @NotNull CaptureStatus status) {
        ArrayList arrayList;
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(status, "status");
        if (type.getArguments().size() != type.getConstructor().getParameters().size()) {
            arrayList = null;
        } else {
            List<TypeProjection> arguments = type.getArguments();
            List<TypeProjection> list = arguments;
            if ((list instanceof Collection) && list.isEmpty()) {
                arrayList = null;
            } else {
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    if (((TypeProjection) it.next()).getProjectionKind() != Variance.INVARIANT) {
                        List<TypeParameterDescriptor> parameters = type.getConstructor().getParameters();
                        Intrinsics.checkNotNullExpressionValue(parameters, "getParameters(...)");
                        List<Pair> listZip = CollectionsKt___CollectionsKt.zip(list, parameters);
                        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(listZip, 10));
                        for (Pair pair : listZip) {
                            TypeProjection typeProjectionAsTypeProjection = (TypeProjection) pair.component1();
                            TypeParameterDescriptor typeParameterDescriptor = (TypeParameterDescriptor) pair.component2();
                            if (typeProjectionAsTypeProjection.getProjectionKind() != Variance.INVARIANT) {
                                UnwrappedType unwrappedTypeUnwrap = (typeProjectionAsTypeProjection.isStarProjection() || typeProjectionAsTypeProjection.getProjectionKind() != Variance.IN_VARIANCE) ? null : typeProjectionAsTypeProjection.getType().unwrap();
                                Intrinsics.checkNotNull(typeParameterDescriptor);
                                typeProjectionAsTypeProjection = TypeUtilsKt.asTypeProjection(new NewCapturedType(status, unwrappedTypeUnwrap, typeProjectionAsTypeProjection, typeParameterDescriptor));
                            }
                            arrayList2.add(typeProjectionAsTypeProjection);
                        }
                        TypeSubstitutor typeSubstitutorBuildSubstitutor = TypeConstructorSubstitution.Companion.create(type.getConstructor(), arrayList2).buildSubstitutor();
                        int size = arguments.size();
                        for (int i10 = 0; i10 < size; i10++) {
                            TypeProjection typeProjection = arguments.get(i10);
                            TypeProjection typeProjection2 = (TypeProjection) arrayList2.get(i10);
                            if (typeProjection.getProjectionKind() != Variance.INVARIANT) {
                                List<KotlinType> upperBounds = type.getConstructor().getParameters().get(i10).getUpperBounds();
                                Intrinsics.checkNotNullExpressionValue(upperBounds, "getUpperBounds(...)");
                                ArrayList arrayList3 = new ArrayList();
                                Iterator<T> it2 = upperBounds.iterator();
                                while (it2.hasNext()) {
                                    arrayList3.add(KotlinTypePreparator.Default.INSTANCE.prepareType((KotlinTypeMarker) typeSubstitutorBuildSubstitutor.safeSubstitute((KotlinType) it2.next(), Variance.INVARIANT).unwrap()));
                                }
                                if (!typeProjection.isStarProjection() && typeProjection.getProjectionKind() == Variance.OUT_VARIANCE) {
                                    arrayList3.add(KotlinTypePreparator.Default.INSTANCE.prepareType((KotlinTypeMarker) typeProjection.getType().unwrap()));
                                }
                                KotlinType type2 = typeProjection2.getType();
                                Intrinsics.checkNotNull(type2, "null cannot be cast to non-null type org.jetbrains.kotlin.types.checker.NewCapturedType");
                                ((NewCapturedType) type2).getConstructor().initializeSupertypes(arrayList3);
                            }
                        }
                        arrayList = arrayList2;
                    }
                }
                arrayList = null;
            }
        }
        if (arrayList != null) {
            return KotlinTypeFactory.simpleType$default(type.getAttributes(), type.getConstructor(), arrayList, type.isMarkedNullable(), (KotlinTypeRefiner) null, 16, (Object) null);
        }
        return null;
    }
}
