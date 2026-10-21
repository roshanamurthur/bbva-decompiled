package kotlin.reflect.jvm.internal.impl.metadata.deserialization;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: TypeTable.kt */
/* JADX INFO: loaded from: classes12.dex */
@SourceDebugExtension({"SMAP\nTypeTable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TypeTable.kt\norg/jetbrains/kotlin/metadata/deserialization/TypeTable\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,36:1\n1559#2:37\n1590#2,4:38\n*S KotlinDebug\n*F\n+ 1 TypeTable.kt\norg/jetbrains/kotlin/metadata/deserialization/TypeTable\n*L\n26#1:37\n26#1:38,4\n*E\n"})
public final class TypeTable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final List<ProtoBuf.Type> f81249a;

    public TypeTable(@NotNull ProtoBuf.TypeTable typeTable) {
        Intrinsics.checkNotNullParameter(typeTable, "typeTable");
        List<ProtoBuf.Type> typeList = typeTable.getTypeList();
        if (typeTable.hasFirstNullable()) {
            int firstNullable = typeTable.getFirstNullable();
            List<ProtoBuf.Type> typeList2 = typeTable.getTypeList();
            Intrinsics.checkNotNullExpressionValue(typeList2, "getTypeList(...)");
            List<ProtoBuf.Type> list = typeList2;
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
            int i10 = 0;
            for (Object obj : list) {
                int i11 = i10 + 1;
                if (i10 < 0) {
                    CollectionsKt__CollectionsKt.throwIndexOverflow();
                }
                ProtoBuf.Type typeBuild = (ProtoBuf.Type) obj;
                if (i10 >= firstNullable) {
                    typeBuild = typeBuild.toBuilder().setNullable(true).build();
                }
                arrayList.add(typeBuild);
                i10 = i11;
            }
            typeList = arrayList;
        }
        Intrinsics.checkNotNullExpressionValue(typeList, "run(...)");
        this.f81249a = typeList;
    }

    @NotNull
    public final ProtoBuf.Type get(int i10) {
        return this.f81249a.get(i10);
    }
}
