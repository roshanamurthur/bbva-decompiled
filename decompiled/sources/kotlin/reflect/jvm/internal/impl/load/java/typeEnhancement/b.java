package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeArgumentMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeConstructorMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeParameterMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: AbstractSignatureParts.kt */
/* JADX INFO: loaded from: classes12.dex */
@SourceDebugExtension({"SMAP\nAbstractSignatureParts.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AbstractSignatureParts.kt\norg/jetbrains/kotlin/load/java/typeEnhancement/AbstractSignatureParts$toIndexed$1$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,228:1\n3433#2,7:229\n*S KotlinDebug\n*F\n+ 1 AbstractSignatureParts.kt\norg/jetbrains/kotlin/load/java/typeEnhancement/AbstractSignatureParts$toIndexed$1$1\n*L\n209#1:229,7\n*E\n"})
public final class b extends Lambda implements Function1<AbstractSignatureParts.a, Iterable<? extends AbstractSignatureParts.a>> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ AbstractSignatureParts<Object> f80845p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ TypeSystemContext f80846q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(AbstractSignatureParts<Object> abstractSignatureParts, TypeSystemContext typeSystemContext) {
        super(1);
        this.f80845p0 = abstractSignatureParts;
        this.f80846q0 = typeSystemContext;
    }

    @Override // kotlin.jvm.functions.Function1
    @Nullable
    public final Iterable<AbstractSignatureParts.a> invoke(@NotNull AbstractSignatureParts.a it) {
        KotlinTypeMarker type;
        TypeConstructorMarker typeConstructorMarkerTypeConstructor;
        List<TypeParameterMarker> parameters;
        AbstractSignatureParts.a aVar;
        KotlinTypeMarker type2;
        Intrinsics.checkNotNullParameter(it, "it");
        AbstractSignatureParts<Object> abstractSignatureParts = this.f80845p0;
        boolean skipRawTypeArguments = abstractSignatureParts.getSkipRawTypeArguments();
        TypeSystemContext typeSystemContext = this.f80846q0;
        if ((skipRawTypeArguments && (type2 = it.getType()) != null && typeSystemContext.isRawType(type2)) || (type = it.getType()) == null || (typeConstructorMarkerTypeConstructor = typeSystemContext.typeConstructor(type)) == null || (parameters = typeSystemContext.getParameters(typeConstructorMarkerTypeConstructor)) == null) {
            return null;
        }
        List<TypeParameterMarker> list = parameters;
        List<TypeArgumentMarker> arguments = typeSystemContext.getArguments(it.getType());
        Iterator<T> it2 = list.iterator();
        Iterator<T> it3 = arguments.iterator();
        ArrayList arrayList = new ArrayList(Math.min(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10), CollectionsKt__IterablesKt.collectionSizeOrDefault(arguments, 10)));
        while (it2.hasNext() && it3.hasNext()) {
            Object next = it2.next();
            TypeArgumentMarker typeArgumentMarker = (TypeArgumentMarker) it3.next();
            TypeParameterMarker typeParameterMarker = (TypeParameterMarker) next;
            if (typeSystemContext.isStarProjection(typeArgumentMarker)) {
                aVar = new AbstractSignatureParts.a(null, it.getDefaultQualifiers(), typeParameterMarker);
            } else {
                KotlinTypeMarker type3 = typeSystemContext.getType(typeArgumentMarker);
                aVar = new AbstractSignatureParts.a(type3, abstractSignatureParts.getAnnotationTypeQualifierResolver().extractAndMergeDefaultQualifiers(it.getDefaultQualifiers(), abstractSignatureParts.getAnnotations(type3)), typeParameterMarker);
            }
            arrayList.add(aVar);
        }
        return arrayList;
    }
}
