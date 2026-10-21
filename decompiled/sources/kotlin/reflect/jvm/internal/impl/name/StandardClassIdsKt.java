package kotlin.reflect.jvm.internal.impl.name;

import androidx.camera.core.processing.f;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: StandardClassIds.kt */
/* JADX INFO: loaded from: classes12.dex */
@SourceDebugExtension({"SMAP\nStandardClassIds.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StandardClassIds.kt\norg/jetbrains/kotlin/name/StandardClassIdsKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,287:1\n1179#2,2:288\n1253#2,4:290\n*S KotlinDebug\n*F\n+ 1 StandardClassIds.kt\norg/jetbrains/kotlin/name/StandardClassIdsKt\n*L\n286#1:288,2\n286#1:290,4\n*E\n"})
public final class StandardClassIdsKt {
    static {
        Intrinsics.checkNotNullExpressionValue(new FqName("java.lang").child(Name.identifier("annotation")), "child(...)");
    }

    public static final ClassId access$annotationId(String str) {
        return new ClassId(StandardClassIds.INSTANCE.getBASE_ANNOTATION_PACKAGE(), Name.identifier(str));
    }

    public static final ClassId access$baseId(String str) {
        return new ClassId(StandardClassIds.INSTANCE.getBASE_KOTLIN_PACKAGE(), Name.identifier(str));
    }

    public static final ClassId access$collectionsId(String str) {
        return new ClassId(StandardClassIds.INSTANCE.getBASE_COLLECTIONS_PACKAGE(), Name.identifier(str));
    }

    public static final ClassId access$coroutinesId(String str) {
        return new ClassId(StandardClassIds.INSTANCE.getBASE_COROUTINES_PACKAGE(), Name.identifier(str));
    }

    public static final ClassId access$enumsId(String str) {
        return new ClassId(StandardClassIds.INSTANCE.getBASE_ENUMS_PACKAGE(), Name.identifier(str));
    }

    public static final Map access$inverseMap(Map map) {
        Set<Map.Entry> setEntrySet = map.entrySet();
        LinkedHashMap linkedHashMap = new LinkedHashMap(f.a(setEntrySet, 10, 16));
        for (Map.Entry entry : setEntrySet) {
            Pair pair = TuplesKt.to(entry.getValue(), entry.getKey());
            linkedHashMap.put(pair.getFirst(), pair.getSecond());
        }
        return linkedHashMap;
    }

    public static final ClassId access$primitiveArrayId(Name name) {
        StandardClassIds standardClassIds = StandardClassIds.INSTANCE;
        return new ClassId(standardClassIds.getArray().getPackageFqName(), Name.identifier(name.getIdentifier() + standardClassIds.getArray().getShortClassName().getIdentifier()));
    }

    public static final ClassId access$rangesId(String str) {
        return new ClassId(StandardClassIds.INSTANCE.getBASE_RANGES_PACKAGE(), Name.identifier(str));
    }

    public static final ClassId access$reflectId(String str) {
        return new ClassId(StandardClassIds.INSTANCE.getBASE_REFLECT_PACKAGE(), Name.identifier(str));
    }

    public static final ClassId access$unsignedId(ClassId classId) {
        return new ClassId(StandardClassIds.INSTANCE.getBASE_KOTLIN_PACKAGE(), Name.identifier("U" + classId.getShortClassName().getIdentifier()));
    }
}
