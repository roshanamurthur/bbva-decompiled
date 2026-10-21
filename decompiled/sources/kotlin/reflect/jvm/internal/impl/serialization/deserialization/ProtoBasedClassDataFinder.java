package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import androidx.camera.core.processing.f;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.BinaryVersion;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ProtoBasedClassDataFinder.kt */
/* JADX INFO: loaded from: classes12.dex */
@SourceDebugExtension({"SMAP\nProtoBasedClassDataFinder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ProtoBasedClassDataFinder.kt\norg/jetbrains/kotlin/serialization/deserialization/ProtoBasedClassDataFinder\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,43:1\n1194#2,2:44\n1222#2,4:46\n*S KotlinDebug\n*F\n+ 1 ProtoBasedClassDataFinder.kt\norg/jetbrains/kotlin/serialization/deserialization/ProtoBasedClassDataFinder\n*L\n32#1:44,2\n32#1:46,4\n*E\n"})
public final class ProtoBasedClassDataFinder implements ClassDataFinder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final NameResolver f81729a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final BinaryVersion f81730b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Function1<ClassId, SourceElement> f81731c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final LinkedHashMap f81732d;

    /* JADX WARN: Multi-variable type inference failed */
    public ProtoBasedClassDataFinder(@NotNull ProtoBuf.PackageFragment proto, @NotNull NameResolver nameResolver, @NotNull BinaryVersion metadataVersion, @NotNull Function1<? super ClassId, ? extends SourceElement> classSource) {
        Intrinsics.checkNotNullParameter(proto, "proto");
        Intrinsics.checkNotNullParameter(nameResolver, "nameResolver");
        Intrinsics.checkNotNullParameter(metadataVersion, "metadataVersion");
        Intrinsics.checkNotNullParameter(classSource, "classSource");
        this.f81729a = nameResolver;
        this.f81730b = metadataVersion;
        this.f81731c = classSource;
        List<ProtoBuf.Class> class_List = proto.getClass_List();
        Intrinsics.checkNotNullExpressionValue(class_List, "getClass_List(...)");
        List<ProtoBuf.Class> list = class_List;
        LinkedHashMap linkedHashMap = new LinkedHashMap(f.a(list, 10, 16));
        for (Object obj : list) {
            linkedHashMap.put(NameResolverUtilKt.getClassId(this.f81729a, ((ProtoBuf.Class) obj).getFqName()), obj);
        }
        this.f81732d = linkedHashMap;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.ClassDataFinder
    @Nullable
    public ClassData findClassData(@NotNull ClassId classId) {
        Intrinsics.checkNotNullParameter(classId, "classId");
        ProtoBuf.Class r1 = (ProtoBuf.Class) this.f81732d.get(classId);
        if (r1 == null) {
            return null;
        }
        return new ClassData(this.f81729a, r1, this.f81730b, this.f81731c.invoke(classId));
    }

    @NotNull
    public final Collection<ClassId> getAllClassIds() {
        return this.f81732d.keySet();
    }
}
