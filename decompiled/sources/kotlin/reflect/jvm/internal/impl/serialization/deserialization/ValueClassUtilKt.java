package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.descriptors.InlineClassRepresentation;
import kotlin.reflect.jvm.internal.impl.descriptors.MultiFieldValueClassRepresentation;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueClassRepresentation;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.ProtoTypeTableUtilKt;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ValueClassUtil.kt */
/* JADX INFO: loaded from: classes12.dex */
@SourceDebugExtension({"SMAP\nValueClassUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ValueClassUtil.kt\norg/jetbrains/kotlin/serialization/deserialization/ValueClassUtilKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,46:1\n1549#2:47\n1620#2,3:48\n1549#2:51\n1620#2,3:52\n1549#2:55\n1620#2,3:56\n*S KotlinDebug\n*F\n+ 1 ValueClassUtil.kt\norg/jetbrains/kotlin/serialization/deserialization/ValueClassUtilKt\n*L\n25#1:47\n25#1:48,3\n29#1:51\n29#1:52,3\n32#1:55\n32#1:56,3\n*E\n"})
public final class ValueClassUtilKt {
    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    public static final <T extends SimpleTypeMarker> ValueClassRepresentation<T> loadValueClassRepresentation(@NotNull ProtoBuf.Class r10, @NotNull NameResolver nameResolver, @NotNull TypeTable typeTable, @NotNull Function1<? super ProtoBuf.Type, ? extends T> typeDeserializer, @NotNull Function1<? super Name, ? extends T> typeOfPublicProperty) {
        T tInvoke;
        List<ProtoBuf.Type> multiFieldValueClassUnderlyingTypeList;
        Intrinsics.checkNotNullParameter(r10, "<this>");
        Intrinsics.checkNotNullParameter(nameResolver, "nameResolver");
        Intrinsics.checkNotNullParameter(typeTable, "typeTable");
        Intrinsics.checkNotNullParameter(typeDeserializer, "typeDeserializer");
        Intrinsics.checkNotNullParameter(typeOfPublicProperty, "typeOfPublicProperty");
        if (r10.getMultiFieldValueClassUnderlyingNameCount() <= 0) {
            if (!r10.hasInlineClassUnderlyingPropertyName()) {
                return null;
            }
            Name name = NameResolverUtilKt.getName(nameResolver, r10.getInlineClassUnderlyingPropertyName());
            ProtoBuf.Type typeInlineClassUnderlyingType = ProtoTypeTableUtilKt.inlineClassUnderlyingType(r10, typeTable);
            if ((typeInlineClassUnderlyingType != null && (tInvoke = typeDeserializer.invoke(typeInlineClassUnderlyingType)) != null) || (tInvoke = typeOfPublicProperty.invoke(name)) != null) {
                return new InlineClassRepresentation(name, tInvoke);
            }
            throw new IllegalStateException(("cannot determine underlying type for value class " + NameResolverUtilKt.getName(nameResolver, r10.getFqName()) + " with property " + name).toString());
        }
        List<Integer> multiFieldValueClassUnderlyingNameList = r10.getMultiFieldValueClassUnderlyingNameList();
        Intrinsics.checkNotNullExpressionValue(multiFieldValueClassUnderlyingNameList, "getMultiFieldValueClassUnderlyingNameList(...)");
        List<Integer> list = multiFieldValueClassUnderlyingNameList;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        for (Integer num : list) {
            Intrinsics.checkNotNull(num);
            arrayList.add(NameResolverUtilKt.getName(nameResolver, num.intValue()));
        }
        Pair pair = TuplesKt.to(Integer.valueOf(r10.getMultiFieldValueClassUnderlyingTypeIdCount()), Integer.valueOf(r10.getMultiFieldValueClassUnderlyingTypeCount()));
        if (Intrinsics.areEqual(pair, TuplesKt.to(Integer.valueOf(arrayList.size()), 0))) {
            List<Integer> multiFieldValueClassUnderlyingTypeIdList = r10.getMultiFieldValueClassUnderlyingTypeIdList();
            Intrinsics.checkNotNullExpressionValue(multiFieldValueClassUnderlyingTypeIdList, "getMultiFieldValueClassUnderlyingTypeIdList(...)");
            List<Integer> list2 = multiFieldValueClassUnderlyingTypeIdList;
            multiFieldValueClassUnderlyingTypeList = new ArrayList<>(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
            for (Integer num2 : list2) {
                Intrinsics.checkNotNull(num2);
                multiFieldValueClassUnderlyingTypeList.add(typeTable.get(num2.intValue()));
            }
        } else {
            if (!Intrinsics.areEqual(pair, TuplesKt.to(0, Integer.valueOf(arrayList.size())))) {
                throw new IllegalStateException(("class " + NameResolverUtilKt.getName(nameResolver, r10.getFqName()) + " has illegal multi-field value class representation").toString());
            }
            multiFieldValueClassUnderlyingTypeList = r10.getMultiFieldValueClassUnderlyingTypeList();
        }
        Intrinsics.checkNotNull(multiFieldValueClassUnderlyingTypeList);
        List<ProtoBuf.Type> list3 = multiFieldValueClassUnderlyingTypeList;
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list3, 10));
        Iterator<T> it = list3.iterator();
        while (it.hasNext()) {
            arrayList2.add(typeDeserializer.invoke(it.next()));
        }
        return new MultiFieldValueClassRepresentation(CollectionsKt___CollectionsKt.zip(arrayList, arrayList2));
    }
}
