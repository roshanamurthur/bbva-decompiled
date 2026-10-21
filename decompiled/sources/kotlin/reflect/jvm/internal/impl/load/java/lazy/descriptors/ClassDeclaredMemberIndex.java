package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import bk.p;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.c;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaField;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaLoadingKt;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaMember;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaMethod;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaRecordComponent;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt___SequencesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: DeclaredMemberIndex.kt */
/* JADX INFO: loaded from: classes12.dex */
@SourceDebugExtension({"SMAP\nDeclaredMemberIndex.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeclaredMemberIndex.kt\norg/jetbrains/kotlin/load/java/lazy/descriptors/ClassDeclaredMemberIndex\n+ 2 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n+ 3 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,66:1\n988#2:67\n1017#2,3:68\n1020#2,3:78\n674#2:81\n704#2,4:82\n1155#2,3:95\n1155#2,3:98\n372#3,7:71\n766#4:86\n857#4,2:87\n1194#4,2:89\n1222#4,4:91\n*S KotlinDebug\n*F\n+ 1 DeclaredMemberIndex.kt\norg/jetbrains/kotlin/load/java/lazy/descriptors/ClassDeclaredMemberIndex\n*L\n52#1:67\n52#1:68,3\n52#1:78,3\n53#1:81\n53#1:82,4\n57#1:95,3\n60#1:98,3\n52#1:71,7\n54#1:86\n54#1:87,2\n54#1:89,2\n54#1:91,4\n*E\n"})
public class ClassDeclaredMemberIndex implements DeclaredMemberIndex {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final JavaClass f80644a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Function1<JavaMember, Boolean> f80645b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final a f80646c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final LinkedHashMap f80647d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final LinkedHashMap f80648e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final LinkedHashMap f80649f;

    /* JADX INFO: compiled from: DeclaredMemberIndex.kt */
    public static final class a extends Lambda implements Function1<JavaMethod, Boolean> {
        public a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        public final Boolean invoke(@NotNull JavaMethod m) {
            Intrinsics.checkNotNullParameter(m, "m");
            return Boolean.valueOf(((Boolean) ClassDeclaredMemberIndex.this.f80645b.invoke(m)).booleanValue() && !JavaLoadingKt.isObjectMethodInInterface(m));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ClassDeclaredMemberIndex(@NotNull JavaClass jClass, @NotNull Function1<? super JavaMember, Boolean> memberFilter) {
        Intrinsics.checkNotNullParameter(jClass, "jClass");
        Intrinsics.checkNotNullParameter(memberFilter, "memberFilter");
        this.f80644a = jClass;
        this.f80645b = memberFilter;
        a aVar = new a();
        this.f80646c = aVar;
        Sequence sequenceFilter = SequencesKt___SequencesKt.filter(CollectionsKt___CollectionsKt.asSequence(jClass.getMethods()), aVar);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : sequenceFilter) {
            Name name = ((JavaMethod) obj).getName();
            Object arrayList = linkedHashMap.get(name);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(name, arrayList);
            }
            ((List) arrayList).add(obj);
        }
        this.f80647d = linkedHashMap;
        Sequence sequenceFilter2 = SequencesKt___SequencesKt.filter(CollectionsKt___CollectionsKt.asSequence(this.f80644a.getFields()), this.f80645b);
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Object obj2 : sequenceFilter2) {
            linkedHashMap2.put(((JavaField) obj2).getName(), obj2);
        }
        this.f80648e = linkedHashMap2;
        Collection<JavaRecordComponent> recordComponents = this.f80644a.getRecordComponents();
        Function1<JavaMember, Boolean> function1 = this.f80645b;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj3 : recordComponents) {
            if (function1.invoke((JavaMember) obj3).booleanValue()) {
                arrayList2.add(obj3);
            }
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(c.coerceAtLeast(p.mapCapacity(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList2, 10)), 16));
        for (Object obj4 : arrayList2) {
            linkedHashMap3.put(((JavaRecordComponent) obj4).getName(), obj4);
        }
        this.f80649f = linkedHashMap3;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.DeclaredMemberIndex
    @Nullable
    public JavaField findFieldByName(@NotNull Name name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return (JavaField) this.f80648e.get(name);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.DeclaredMemberIndex
    @NotNull
    public Collection<JavaMethod> findMethodsByName(@NotNull Name name) {
        Intrinsics.checkNotNullParameter(name, "name");
        List listEmptyList = (List) this.f80647d.get(name);
        if (listEmptyList == null) {
            listEmptyList = CollectionsKt__CollectionsKt.emptyList();
        }
        return listEmptyList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.DeclaredMemberIndex
    @Nullable
    public JavaRecordComponent findRecordComponentByName(@NotNull Name name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return (JavaRecordComponent) this.f80649f.get(name);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.DeclaredMemberIndex
    @NotNull
    public Set<Name> getFieldNames() {
        Sequence sequenceFilter = SequencesKt___SequencesKt.filter(CollectionsKt___CollectionsKt.asSequence(this.f80644a.getFields()), this.f80645b);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = sequenceFilter.iterator();
        while (it.hasNext()) {
            linkedHashSet.add(((JavaField) it.next()).getName());
        }
        return linkedHashSet;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.DeclaredMemberIndex
    @NotNull
    public Set<Name> getMethodNames() {
        Sequence sequenceFilter = SequencesKt___SequencesKt.filter(CollectionsKt___CollectionsKt.asSequence(this.f80644a.getMethods()), this.f80646c);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = sequenceFilter.iterator();
        while (it.hasNext()) {
            linkedHashSet.add(((JavaMethod) it.next()).getName());
        }
        return linkedHashSet;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.DeclaredMemberIndex
    @NotNull
    public Set<Name> getRecordComponentNames() {
        return this.f80649f.keySet();
    }
}
