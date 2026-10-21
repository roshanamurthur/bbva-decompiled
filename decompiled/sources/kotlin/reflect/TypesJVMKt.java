package kotlin.reflect;

import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.ExperimentalStdlibApi;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.SinceKotlin;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.internal.LowPriorityInOverloadResolution;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.KTypeBase;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt__SequencesKt;
import kotlin.sequences.SequencesKt___SequencesKt;
import kotlin.text.l;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;
import pk.a;
import pk.b;
import pk.c;
import pk.d;

/* JADX INFO: compiled from: TypesJVM.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\"\u001e\u0010\u0006\u001a\u00020\u0001*\u00020\u00008FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u0007"}, d2 = {"Lkotlin/reflect/KType;", "Ljava/lang/reflect/Type;", "getJavaType", "(Lkotlin/reflect/KType;)Ljava/lang/reflect/Type;", "getJavaType$annotations", "(Lkotlin/reflect/KType;)V", "javaType", "kotlin-stdlib"}, k = 2, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nTypesJVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TypesJVM.kt\nkotlin/reflect/TypesJVMKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,230:1\n1#2:231\n1549#3:232\n1620#3,3:233\n1549#3:236\n1620#3,3:237\n1549#3:240\n1620#3,3:241\n*S KotlinDebug\n*F\n+ 1 TypesJVM.kt\nkotlin/reflect/TypesJVMKt\n*L\n69#1:232\n69#1:233,3\n71#1:236\n71#1:237,3\n77#1:240\n77#1:241,3\n*E\n"})
public final class TypesJVMKt {

    /* JADX INFO: compiled from: TypesJVM.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[KVariance.values().length];
            try {
                iArr[KVariance.IN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[KVariance.INVARIANT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[KVariance.OUT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @ExperimentalStdlibApi
    public static final Type a(KType kType, boolean z10) {
        KClassifier classifier = kType.getClassifier();
        if (classifier instanceof KTypeParameter) {
            return new c((KTypeParameter) classifier);
        }
        if (!(classifier instanceof KClass)) {
            throw new UnsupportedOperationException("Unsupported type classifier: " + kType);
        }
        KClass kClass = (KClass) classifier;
        Class javaObjectType = z10 ? JvmClassMappingKt.getJavaObjectType(kClass) : JvmClassMappingKt.getJavaClass(kClass);
        List<KTypeProjection> arguments = kType.getArguments();
        if (arguments.isEmpty()) {
            return javaObjectType;
        }
        if (!javaObjectType.isArray()) {
            return b(javaObjectType, arguments);
        }
        if (javaObjectType.getComponentType().isPrimitive()) {
            return javaObjectType;
        }
        KTypeProjection kTypeProjection = (KTypeProjection) CollectionsKt___CollectionsKt.singleOrNull((List) arguments);
        if (kTypeProjection == null) {
            throw new IllegalArgumentException("kotlin.Array must have exactly one type argument: " + kType);
        }
        KVariance variance = kTypeProjection.getVariance();
        KType type = kTypeProjection.getType();
        int i10 = variance == null ? -1 : WhenMappings.$EnumSwitchMapping$0[variance.ordinal()];
        if (i10 == -1 || i10 == 1) {
            return javaObjectType;
        }
        if (i10 != 2 && i10 != 3) {
            throw new NoWhenBranchMatchedException();
        }
        Intrinsics.checkNotNull(type);
        Type typeA = a(type, false);
        return typeA instanceof Class ? javaObjectType : new a(typeA);
    }

    public static final String access$typeToString(Type type) {
        String name;
        if (!(type instanceof Class)) {
            return type.toString();
        }
        Class cls = (Class) type;
        if (cls.isArray()) {
            Sequence sequenceGenerateSequence = SequencesKt__SequencesKt.generateSequence(type, d.f92697p0);
            name = ((Class) SequencesKt___SequencesKt.last(sequenceGenerateSequence)).getName() + l.repeat(HttpUrl.PATH_SEGMENT_ENCODE_SET_URI, SequencesKt___SequencesKt.count(sequenceGenerateSequence));
        } else {
            name = cls.getName();
        }
        Intrinsics.checkNotNull(name);
        return name;
    }

    @ExperimentalStdlibApi
    public static final b b(Class cls, List list) {
        Class<?> declaringClass = cls.getDeclaringClass();
        if (declaringClass == null) {
            List list2 = list;
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(c((KTypeProjection) it.next()));
            }
            return new b(cls, null, arrayList);
        }
        if (Modifier.isStatic(cls.getModifiers())) {
            List list3 = list;
            ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list3, 10));
            Iterator it2 = list3.iterator();
            while (it2.hasNext()) {
                arrayList2.add(c((KTypeProjection) it2.next()));
            }
            return new b(cls, declaringClass, arrayList2);
        }
        int length = cls.getTypeParameters().length;
        b bVarB = b(declaringClass, list.subList(length, list.size()));
        List listSubList = list.subList(0, length);
        ArrayList arrayList3 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(listSubList, 10));
        Iterator it3 = listSubList.iterator();
        while (it3.hasNext()) {
            arrayList3.add(c((KTypeProjection) it3.next()));
        }
        return new b(cls, bVarB, arrayList3);
    }

    public static final Type c(KTypeProjection kTypeProjection) {
        KVariance variance = kTypeProjection.getVariance();
        if (variance == null) {
            return WildcardTypeImpl.f79826r0.getSTAR();
        }
        KType type = kTypeProjection.getType();
        Intrinsics.checkNotNull(type);
        int i10 = WhenMappings.$EnumSwitchMapping$0[variance.ordinal()];
        if (i10 == 1) {
            return new WildcardTypeImpl(null, a(type, true));
        }
        if (i10 == 2) {
            return a(type, true);
        }
        if (i10 == 3) {
            return new WildcardTypeImpl(a(type, true), null);
        }
        throw new NoWhenBranchMatchedException();
    }

    @NotNull
    public static final Type getJavaType(@NotNull KType kType) {
        Type javaType;
        Intrinsics.checkNotNullParameter(kType, "<this>");
        return (!(kType instanceof KTypeBase) || (javaType = ((KTypeBase) kType).getJavaType()) == null) ? a(kType, false) : javaType;
    }

    @LowPriorityInOverloadResolution
    @SinceKotlin(version = "1.4")
    @ExperimentalStdlibApi
    public static /* synthetic */ void getJavaType$annotations(KType kType) {
    }
}
