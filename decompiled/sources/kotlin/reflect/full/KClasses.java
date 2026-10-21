package kotlin.reflect.full;

import androidx.exifinterface.media.ExifInterface;
import bk.d;
import bk.q;
import com.bbva.nativesettings.common.Constants;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.TypeCastException;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KCallable;
import kotlin.reflect.KClass;
import kotlin.reflect.KClassifier;
import kotlin.reflect.KDeclarationContainer;
import kotlin.reflect.KFunction;
import kotlin.reflect.KParameter;
import kotlin.reflect.KProperty0;
import kotlin.reflect.KProperty1;
import kotlin.reflect.KProperty2;
import kotlin.reflect.KType;
import kotlin.reflect.jvm.internal.KCallableImpl;
import kotlin.reflect.jvm.internal.KClassImpl;
import kotlin.reflect.jvm.internal.KFunctionImpl;
import kotlin.reflect.jvm.internal.KTypeImpl;
import kotlin.reflect.jvm.internal.KotlinReflectionInternalError;
import kotlin.reflect.jvm.internal.impl.descriptors.ConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.utils.DFS;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: KClasses.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010 \n\u0002\b\u000b\u001a\u001c\u0010\u0003\u001a\u00020\u0002*\u0006\u0012\u0002\b\u00030\u00002\n\u0010\u0001\u001a\u0006\u0012\u0002\b\u00030\u0000H\u0007\u001a\u001c\u0010\u0005\u001a\u00020\u0002*\u0006\u0012\u0002\b\u00030\u00002\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0000H\u0007\u001a-\u0010\t\u001a\u00028\u0000\"\b\b\u0000\u0010\u0007*\u00020\u0006*\b\u0012\u0004\u0012\u00028\u00000\u00002\b\u0010\b\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\b\t\u0010\n\u001a/\u0010\u000b\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0007*\u00020\u0006*\b\u0012\u0004\u0012\u00028\u00000\u00002\b\u0010\b\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\b\u000b\u0010\n\u001a#\u0010\f\u001a\u00028\u0000\"\b\b\u0000\u0010\u0007*\u00020\u0006*\b\u0012\u0004\u0012\u00028\u00000\u0000H\u0007¢\u0006\u0004\b\f\u0010\r\"6\u0010\u0013\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u000e\"\b\b\u0000\u0010\u0007*\u00020\u0006*\b\u0012\u0004\u0012\u00028\u00000\u00008FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000f\u0010\u0010\"(\u0010\u0017\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0000*\u0006\u0012\u0002\b\u00030\u00008FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0016\u0010\u0012\u001a\u0004\b\u0014\u0010\u0015\"$\u0010\u001a\u001a\u0004\u0018\u00010\u0006*\u0006\u0012\u0002\b\u00030\u00008FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0019\u0010\u0012\u001a\u0004\b\u0018\u0010\r\"\"\u0010\u001f\u001a\u00020\u001b*\u0006\u0012\u0002\b\u00030\u00008FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u001e\u0010\u0012\u001a\u0004\b\u001c\u0010\u001d\",\u0010%\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030!0 *\u0006\u0012\u0002\b\u00030\u00008FX\u0087\u0004¢\u0006\f\u0012\u0004\b$\u0010\u0012\u001a\u0004\b\"\u0010#\",\u0010(\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000e0 *\u0006\u0012\u0002\b\u00030\u00008FX\u0087\u0004¢\u0006\f\u0012\u0004\b'\u0010\u0012\u001a\u0004\b&\u0010#\",\u0010+\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000e0 *\u0006\u0012\u0002\b\u00030\u00008FX\u0087\u0004¢\u0006\f\u0012\u0004\b*\u0010\u0012\u001a\u0004\b)\u0010#\",\u0010.\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000e0 *\u0006\u0012\u0002\b\u00030\u00008FX\u0087\u0004¢\u0006\f\u0012\u0004\b-\u0010\u0012\u001a\u0004\b,\u0010#\",\u00101\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000e0 *\u0006\u0012\u0002\b\u00030\u00008FX\u0087\u0004¢\u0006\f\u0012\u0004\b0\u0010\u0012\u001a\u0004\b/\u0010#\",\u00104\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000e0 *\u0006\u0012\u0002\b\u00030\u00008FX\u0087\u0004¢\u0006\f\u0012\u0004\b3\u0010\u0012\u001a\u0004\b2\u0010#\",\u00107\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000e0 *\u0006\u0012\u0002\b\u00030\u00008FX\u0087\u0004¢\u0006\f\u0012\u0004\b6\u0010\u0012\u001a\u0004\b5\u0010#\",\u0010:\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000e0 *\u0006\u0012\u0002\b\u00030\u00008FX\u0087\u0004¢\u0006\f\u0012\u0004\b9\u0010\u0012\u001a\u0004\b8\u0010#\",\u0010>\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030;0 *\u0006\u0012\u0002\b\u00030\u00008FX\u0087\u0004¢\u0006\f\u0012\u0004\b=\u0010\u0012\u001a\u0004\b<\u0010#\">\u0010B\u001a\u0012\u0012\u000e\u0012\f\u0012\u0004\u0012\u00028\u0000\u0012\u0002\b\u00030?0 \"\b\b\u0000\u0010\u0007*\u00020\u0006*\b\u0012\u0004\u0012\u00028\u00000\u00008FX\u0087\u0004¢\u0006\f\u0012\u0004\bA\u0010\u0012\u001a\u0004\b@\u0010#\"B\u0010F\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0002\b\u0003\u0012\u0002\b\u00030C0 \"\b\b\u0000\u0010\u0007*\u00020\u0006*\b\u0012\u0004\u0012\u00028\u00000\u00008FX\u0087\u0004¢\u0006\f\u0012\u0004\bE\u0010\u0012\u001a\u0004\bD\u0010#\">\u0010I\u001a\u0012\u0012\u000e\u0012\f\u0012\u0004\u0012\u00028\u0000\u0012\u0002\b\u00030?0 \"\b\b\u0000\u0010\u0007*\u00020\u0006*\b\u0012\u0004\u0012\u00028\u00000\u00008FX\u0087\u0004¢\u0006\f\u0012\u0004\bH\u0010\u0012\u001a\u0004\bG\u0010#\"B\u0010L\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0002\b\u0003\u0012\u0002\b\u00030C0 \"\b\b\u0000\u0010\u0007*\u00020\u0006*\b\u0012\u0004\u0012\u00028\u00000\u00008FX\u0087\u0004¢\u0006\f\u0012\u0004\bK\u0010\u0012\u001a\u0004\bJ\u0010#\",\u0010Q\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00000M*\u0006\u0012\u0002\b\u00030\u00008FX\u0087\u0004¢\u0006\f\u0012\u0004\bP\u0010\u0012\u001a\u0004\bN\u0010O\"(\u0010T\u001a\b\u0012\u0004\u0012\u00020\u001b0 *\u0006\u0012\u0002\b\u00030\u00008FX\u0087\u0004¢\u0006\f\u0012\u0004\bS\u0010\u0012\u001a\u0004\bR\u0010#\",\u0010W\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00000 *\u0006\u0012\u0002\b\u00030\u00008FX\u0087\u0004¢\u0006\f\u0012\u0004\bV\u0010\u0012\u001a\u0004\bU\u0010#¨\u0006X"}, d2 = {"Lkotlin/reflect/KClass;", "base", "", "isSubclassOf", "derived", "isSuperclassOf", "", ExifInterface.GPS_DIRECTION_TRUE, "value", Constants.CAST, "(Lkotlin/reflect/KClass;Ljava/lang/Object;)Ljava/lang/Object;", "safeCast", "createInstance", "(Lkotlin/reflect/KClass;)Ljava/lang/Object;", "Lkotlin/reflect/KFunction;", "getPrimaryConstructor", "(Lkotlin/reflect/KClass;)Lkotlin/reflect/KFunction;", "getPrimaryConstructor$annotations", "(Lkotlin/reflect/KClass;)V", "primaryConstructor", "getCompanionObject", "(Lkotlin/reflect/KClass;)Lkotlin/reflect/KClass;", "getCompanionObject$annotations", "companionObject", "getCompanionObjectInstance", "getCompanionObjectInstance$annotations", "companionObjectInstance", "Lkotlin/reflect/KType;", "getDefaultType", "(Lkotlin/reflect/KClass;)Lkotlin/reflect/KType;", "getDefaultType$annotations", "defaultType", "", "Lkotlin/reflect/KCallable;", "getDeclaredMembers", "(Lkotlin/reflect/KClass;)Ljava/util/Collection;", "getDeclaredMembers$annotations", "declaredMembers", "getFunctions", "getFunctions$annotations", "functions", "getStaticFunctions", "getStaticFunctions$annotations", "staticFunctions", "getMemberFunctions", "getMemberFunctions$annotations", "memberFunctions", "getMemberExtensionFunctions", "getMemberExtensionFunctions$annotations", "memberExtensionFunctions", "getDeclaredFunctions", "getDeclaredFunctions$annotations", "declaredFunctions", "getDeclaredMemberFunctions", "getDeclaredMemberFunctions$annotations", "declaredMemberFunctions", "getDeclaredMemberExtensionFunctions", "getDeclaredMemberExtensionFunctions$annotations", "declaredMemberExtensionFunctions", "Lkotlin/reflect/KProperty0;", "getStaticProperties", "getStaticProperties$annotations", "staticProperties", "Lkotlin/reflect/KProperty1;", "getMemberProperties", "getMemberProperties$annotations", "memberProperties", "Lkotlin/reflect/KProperty2;", "getMemberExtensionProperties", "getMemberExtensionProperties$annotations", "memberExtensionProperties", "getDeclaredMemberProperties", "getDeclaredMemberProperties$annotations", "declaredMemberProperties", "getDeclaredMemberExtensionProperties", "getDeclaredMemberExtensionProperties$annotations", "declaredMemberExtensionProperties", "", "getSuperclasses", "(Lkotlin/reflect/KClass;)Ljava/util/List;", "getSuperclasses$annotations", "superclasses", "getAllSupertypes", "getAllSupertypes$annotations", "allSupertypes", "getAllSuperclasses", "getAllSuperclasses$annotations", "allSuperclasses", "kotlin-reflection"}, k = 2, mv = {1, 9, 0})
@JvmName(name = "KClasses")
@SourceDebugExtension({"SMAP\nKClasses.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KClasses.kt\nkotlin/reflect/full/KClasses\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,281:1\n288#2,2:282\n288#2,2:284\n800#2,11:286\n800#2,11:297\n766#2:308\n857#2,2:309\n766#2:311\n857#2,2:312\n800#2,11:314\n766#2:325\n857#2,2:326\n766#2:328\n857#2,2:329\n766#2:331\n857#2,2:332\n766#2:334\n857#2,2:335\n766#2:337\n857#2,2:338\n766#2:340\n857#2,2:341\n766#2:343\n857#2,2:344\n1603#2,9:346\n1855#2:355\n1856#2:357\n1612#2:358\n1549#2:359\n1620#2,3:360\n661#2,4:363\n1726#2,3:367\n665#2,7:370\n1549#2:377\n1620#2,3:378\n1#3:356\n*S KotlinDebug\n*F\n+ 1 KClasses.kt\nkotlin/reflect/full/KClasses\n*L\n36#1:282,2\n47#1:284,2\n89#1:286,11\n96#1:297,11\n103#1:308\n103#1:309,2\n110#1:311\n110#1:312,2\n119#1:314,11\n126#1:325\n126#1:326,2\n133#1:328\n133#1:329,2\n141#1:331\n141#1:332,2\n148#1:334\n148#1:335,2\n155#1:337\n155#1:338,2\n162#1:340\n162#1:341,2\n169#1:343\n169#1:344,2\n184#1:346,9\n184#1:355\n184#1:357\n184#1:358\n223#1:359\n223#1:360,3\n276#1:363,4\n276#1:367,3\n276#1:370,7\n200#1:377\n200#1:378,3\n184#1:356\n*E\n"})
public final class KClasses {

    /* JADX INFO: compiled from: KClasses.kt */
    public static final class a extends Lambda implements Function0<Type> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ KClass<?> f79842p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(KClass<?> kClass) {
            super(0);
            this.f79842p0 = kClass;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final Type invoke() {
            return ((KClassImpl) this.f79842p0).getJClass();
        }
    }

    /* JADX INFO: compiled from: KClasses.kt */
    public /* synthetic */ class b extends PropertyReference1 {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final b f79843p0 = new b();

        @Override // kotlin.reflect.KProperty1
        @Nullable
        public Object get(@Nullable Object obj) {
            return KClasses.getSuperclasses((KClass) obj);
        }

        @Override // kotlin.jvm.internal.CallableReference, kotlin.reflect.KCallable
        @NotNull
        public String getName() {
            return "superclasses";
        }

        @Override // kotlin.jvm.internal.CallableReference
        @NotNull
        public KDeclarationContainer getOwner() {
            return Reflection.getOrCreateKotlinPackage(KClasses.class, "kotlin-reflection");
        }

        @Override // kotlin.jvm.internal.CallableReference
        @NotNull
        public String getSignature() {
            return "getSuperclasses(Lkotlin/reflect/KClass;)Ljava/util/List;";
        }
    }

    /* JADX INFO: compiled from: KClasses.kt */
    public static final class c extends Lambda implements Function1<KClass<?>, Boolean> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ KClass<?> f79844p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(KClass<?> kClass) {
            super(1);
            this.f79844p0 = kClass;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(KClass<?> kClass) {
            return Boolean.valueOf(Intrinsics.areEqual(kClass, this.f79844p0));
        }
    }

    public static final boolean a(KCallableImpl<?> kCallableImpl) {
        return kCallableImpl.getDescriptor().getExtensionReceiverParameter() != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @SinceKotlin(version = "1.1")
    @NotNull
    public static final <T> T cast(@NotNull KClass<T> kClass, @Nullable Object obj) {
        Intrinsics.checkNotNullParameter(kClass, "<this>");
        if (kClass.isInstance(obj)) {
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type T of kotlin.reflect.full.KClasses.cast");
            return obj;
        }
        throw new TypeCastException("Value cannot be cast to " + kClass.getQualifiedName());
    }

    @SinceKotlin(version = "1.1")
    @NotNull
    public static final <T> T createInstance(@NotNull KClass<T> kClass) {
        Intrinsics.checkNotNullParameter(kClass, "<this>");
        Iterator<T> it = kClass.getConstructors().iterator();
        T t10 = null;
        boolean z10 = false;
        T t11 = null;
        while (true) {
            if (!it.hasNext()) {
                if (!z10) {
                    break;
                }
                t10 = t11;
                break;
            }
            T next = it.next();
            List<KParameter> parameters = ((KFunction) next).getParameters();
            if (!(parameters instanceof Collection) || !parameters.isEmpty()) {
                Iterator<T> it2 = parameters.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        if (!((KParameter) it2.next()).isOptional()) {
                        }
                    }
                }
            }
            if (z10) {
                break;
            }
            z10 = true;
            t11 = next;
        }
        KFunction kFunction = (KFunction) t10;
        if (kFunction != null) {
            return (T) kFunction.callBy(q.emptyMap());
        }
        throw new IllegalArgumentException("Class should have a single no-arg constructor: " + kClass);
    }

    @NotNull
    public static final Collection<KClass<?>> getAllSuperclasses(@NotNull KClass<?> kClass) {
        Intrinsics.checkNotNullParameter(kClass, "<this>");
        Collection<KType> allSupertypes = getAllSupertypes(kClass);
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(allSupertypes, 10));
        for (KType kType : allSupertypes) {
            KClassifier classifier = kType.getClassifier();
            KClass kClass2 = classifier instanceof KClass ? (KClass) classifier : null;
            if (kClass2 == null) {
                throw new KotlinReflectionInternalError("Supertype not a class: " + kType);
            }
            arrayList.add(kClass2);
        }
        return arrayList;
    }

    @NotNull
    public static final Collection<KType> getAllSupertypes(@NotNull KClass<?> kClass) {
        Intrinsics.checkNotNullParameter(kClass, "<this>");
        Object objDfs = DFS.dfs(kClass.getSupertypes(), qk.a.f92875a, new DFS.VisitedWithSet(), new DFS.NodeHandlerWithListResult<KType, KType>() { // from class: kotlin.reflect.full.KClasses$allSupertypes$2
            @Override // kotlin.reflect.jvm.internal.impl.utils.DFS.AbstractNodeHandler, kotlin.reflect.jvm.internal.impl.utils.DFS.NodeHandler
            public boolean beforeChildren(@NotNull KType current) {
                Intrinsics.checkNotNullParameter(current, "current");
                ((LinkedList) this.result).add(current);
                return true;
            }
        });
        Intrinsics.checkNotNullExpressionValue(objDfs, "dfs(...)");
        return (Collection) objDfs;
    }

    @Nullable
    public static final KClass<?> getCompanionObject(@NotNull KClass<?> kClass) {
        Object next;
        Intrinsics.checkNotNullParameter(kClass, "<this>");
        Iterator<T> it = kClass.getNestedClasses().iterator();
        while (it.hasNext()) {
            next = it.next();
            KClass kClass2 = (KClass) next;
            Intrinsics.checkNotNull(kClass2, "null cannot be cast to non-null type kotlin.reflect.jvm.internal.KClassImpl<*>");
            if (((KClassImpl) kClass2).getF80025p0().isCompanionObject()) {
                return (KClass) next;
            }
        }
        next = null;
        return (KClass) next;
    }

    @Nullable
    public static final Object getCompanionObjectInstance(@NotNull KClass<?> kClass) {
        Intrinsics.checkNotNullParameter(kClass, "<this>");
        KClass<?> companionObject = getCompanionObject(kClass);
        if (companionObject != null) {
            return companionObject.getObjectInstance();
        }
        return null;
    }

    @NotNull
    public static final Collection<KFunction<?>> getDeclaredFunctions(@NotNull KClass<?> kClass) {
        Intrinsics.checkNotNullParameter(kClass, "<this>");
        Collection<KCallableImpl<?>> declaredMembers = ((KClassImpl.Data) ((KClassImpl) kClass).getData().getValue()).getDeclaredMembers();
        ArrayList arrayList = new ArrayList();
        for (Object obj : declaredMembers) {
            if (obj instanceof KFunction) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    @NotNull
    public static final Collection<KFunction<?>> getDeclaredMemberExtensionFunctions(@NotNull KClass<?> kClass) {
        Intrinsics.checkNotNullParameter(kClass, "<this>");
        Collection<KCallableImpl<?>> declaredNonStaticMembers = ((KClassImpl.Data) ((KClassImpl) kClass).getData().getValue()).getDeclaredNonStaticMembers();
        ArrayList arrayList = new ArrayList();
        for (Object obj : declaredNonStaticMembers) {
            KCallableImpl kCallableImpl = (KCallableImpl) obj;
            if (a(kCallableImpl) && (kCallableImpl instanceof KFunction)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    @NotNull
    public static final <T> Collection<KProperty2<T, ?, ?>> getDeclaredMemberExtensionProperties(@NotNull KClass<T> kClass) {
        Intrinsics.checkNotNullParameter(kClass, "<this>");
        Collection<KCallableImpl<?>> declaredNonStaticMembers = ((KClassImpl) kClass).getData().getValue().getDeclaredNonStaticMembers();
        ArrayList arrayList = new ArrayList();
        for (T t10 : declaredNonStaticMembers) {
            KCallableImpl kCallableImpl = (KCallableImpl) t10;
            if (a(kCallableImpl) && (kCallableImpl instanceof KProperty2)) {
                arrayList.add(t10);
            }
        }
        return arrayList;
    }

    @NotNull
    public static final Collection<KFunction<?>> getDeclaredMemberFunctions(@NotNull KClass<?> kClass) {
        Intrinsics.checkNotNullParameter(kClass, "<this>");
        Collection<KCallableImpl<?>> declaredNonStaticMembers = ((KClassImpl.Data) ((KClassImpl) kClass).getData().getValue()).getDeclaredNonStaticMembers();
        ArrayList arrayList = new ArrayList();
        for (Object obj : declaredNonStaticMembers) {
            KCallableImpl kCallableImpl = (KCallableImpl) obj;
            if ((!a(kCallableImpl)) && (kCallableImpl instanceof KFunction)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    @NotNull
    public static final <T> Collection<KProperty1<T, ?>> getDeclaredMemberProperties(@NotNull KClass<T> kClass) {
        Intrinsics.checkNotNullParameter(kClass, "<this>");
        Collection<KCallableImpl<?>> declaredNonStaticMembers = ((KClassImpl) kClass).getData().getValue().getDeclaredNonStaticMembers();
        ArrayList arrayList = new ArrayList();
        for (T t10 : declaredNonStaticMembers) {
            KCallableImpl kCallableImpl = (KCallableImpl) t10;
            if ((!a(kCallableImpl)) && (kCallableImpl instanceof KProperty1)) {
                arrayList.add(t10);
            }
        }
        return arrayList;
    }

    @NotNull
    public static final Collection<KCallable<?>> getDeclaredMembers(@NotNull KClass<?> kClass) {
        Intrinsics.checkNotNullParameter(kClass, "<this>");
        return ((KClassImpl.Data) ((KClassImpl) kClass).getData().getValue()).getDeclaredMembers();
    }

    @NotNull
    public static final KType getDefaultType(@NotNull KClass<?> kClass) {
        Intrinsics.checkNotNullParameter(kClass, "<this>");
        SimpleType defaultType = ((KClassImpl) kClass).getF80025p0().getDefaultType();
        Intrinsics.checkNotNullExpressionValue(defaultType, "getDefaultType(...)");
        return new KTypeImpl(defaultType, new a(kClass));
    }

    @NotNull
    public static final Collection<KFunction<?>> getFunctions(@NotNull KClass<?> kClass) {
        Intrinsics.checkNotNullParameter(kClass, "<this>");
        Collection<KCallable<?>> members = kClass.getMembers();
        ArrayList arrayList = new ArrayList();
        for (Object obj : members) {
            if (obj instanceof KFunction) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    @NotNull
    public static final Collection<KFunction<?>> getMemberExtensionFunctions(@NotNull KClass<?> kClass) {
        Intrinsics.checkNotNullParameter(kClass, "<this>");
        Collection<KCallableImpl<?>> allNonStaticMembers = ((KClassImpl.Data) ((KClassImpl) kClass).getData().getValue()).getAllNonStaticMembers();
        ArrayList arrayList = new ArrayList();
        for (Object obj : allNonStaticMembers) {
            KCallableImpl kCallableImpl = (KCallableImpl) obj;
            if (a(kCallableImpl) && (kCallableImpl instanceof KFunction)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    @NotNull
    public static final <T> Collection<KProperty2<T, ?, ?>> getMemberExtensionProperties(@NotNull KClass<T> kClass) {
        Intrinsics.checkNotNullParameter(kClass, "<this>");
        Collection<KCallableImpl<?>> allNonStaticMembers = ((KClassImpl) kClass).getData().getValue().getAllNonStaticMembers();
        ArrayList arrayList = new ArrayList();
        for (T t10 : allNonStaticMembers) {
            KCallableImpl kCallableImpl = (KCallableImpl) t10;
            if (a(kCallableImpl) && (kCallableImpl instanceof KProperty2)) {
                arrayList.add(t10);
            }
        }
        return arrayList;
    }

    @NotNull
    public static final Collection<KFunction<?>> getMemberFunctions(@NotNull KClass<?> kClass) {
        Intrinsics.checkNotNullParameter(kClass, "<this>");
        Collection<KCallableImpl<?>> allNonStaticMembers = ((KClassImpl.Data) ((KClassImpl) kClass).getData().getValue()).getAllNonStaticMembers();
        ArrayList arrayList = new ArrayList();
        for (Object obj : allNonStaticMembers) {
            KCallableImpl kCallableImpl = (KCallableImpl) obj;
            if ((!a(kCallableImpl)) && (kCallableImpl instanceof KFunction)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    @NotNull
    public static final <T> Collection<KProperty1<T, ?>> getMemberProperties(@NotNull KClass<T> kClass) {
        Intrinsics.checkNotNullParameter(kClass, "<this>");
        Collection<KCallableImpl<?>> allNonStaticMembers = ((KClassImpl) kClass).getData().getValue().getAllNonStaticMembers();
        ArrayList arrayList = new ArrayList();
        for (T t10 : allNonStaticMembers) {
            KCallableImpl kCallableImpl = (KCallableImpl) t10;
            if ((!a(kCallableImpl)) && (kCallableImpl instanceof KProperty1)) {
                arrayList.add(t10);
            }
        }
        return arrayList;
    }

    @Nullable
    public static final <T> KFunction<T> getPrimaryConstructor(@NotNull KClass<T> kClass) {
        T next;
        Intrinsics.checkNotNullParameter(kClass, "<this>");
        Iterator<T> it = ((KClassImpl) kClass).getConstructors().iterator();
        while (it.hasNext()) {
            next = it.next();
            KFunction kFunction = (KFunction) next;
            Intrinsics.checkNotNull(kFunction, "null cannot be cast to non-null type kotlin.reflect.jvm.internal.KFunctionImpl");
            FunctionDescriptor descriptor = ((KFunctionImpl) kFunction).getDescriptor();
            Intrinsics.checkNotNull(descriptor, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ConstructorDescriptor");
            if (((ConstructorDescriptor) descriptor).isPrimary()) {
                return (KFunction) next;
            }
        }
        next = null;
        return (KFunction) next;
    }

    @NotNull
    public static final Collection<KFunction<?>> getStaticFunctions(@NotNull KClass<?> kClass) {
        Intrinsics.checkNotNullParameter(kClass, "<this>");
        Collection<KCallableImpl<?>> allStaticMembers = ((KClassImpl.Data) ((KClassImpl) kClass).getData().getValue()).getAllStaticMembers();
        ArrayList arrayList = new ArrayList();
        for (Object obj : allStaticMembers) {
            if (obj instanceof KFunction) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    @NotNull
    public static final Collection<KProperty0<?>> getStaticProperties(@NotNull KClass<?> kClass) {
        Intrinsics.checkNotNullParameter(kClass, "<this>");
        Collection<KCallableImpl<?>> allStaticMembers = ((KClassImpl.Data) ((KClassImpl) kClass).getData().getValue()).getAllStaticMembers();
        ArrayList arrayList = new ArrayList();
        for (Object obj : allStaticMembers) {
            KCallableImpl kCallableImpl = (KCallableImpl) obj;
            if ((!a(kCallableImpl)) && (kCallableImpl instanceof KProperty0)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    @NotNull
    public static final List<KClass<?>> getSuperclasses(@NotNull KClass<?> kClass) {
        Intrinsics.checkNotNullParameter(kClass, "<this>");
        List<KType> supertypes = kClass.getSupertypes();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = supertypes.iterator();
        while (it.hasNext()) {
            KClassifier classifier = ((KType) it.next()).getClassifier();
            KClass kClass2 = classifier instanceof KClass ? (KClass) classifier : null;
            if (kClass2 != null) {
                arrayList.add(kClass2);
            }
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.1")
    public static final boolean isSubclassOf(@NotNull KClass<?> kClass, @NotNull KClass<?> base) {
        Intrinsics.checkNotNullParameter(kClass, "<this>");
        Intrinsics.checkNotNullParameter(base, "base");
        if (!Intrinsics.areEqual(kClass, base)) {
            Boolean boolIfAny = DFS.ifAny(d.listOf(kClass), new qk.b(b.f79843p0), new c(base));
            Intrinsics.checkNotNullExpressionValue(boolIfAny, "ifAny(...)");
            if (!boolIfAny.booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @SinceKotlin(version = "1.1")
    public static final boolean isSuperclassOf(@NotNull KClass<?> kClass, @NotNull KClass<?> derived) {
        Intrinsics.checkNotNullParameter(kClass, "<this>");
        Intrinsics.checkNotNullParameter(derived, "derived");
        return isSubclassOf(derived, kClass);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @SinceKotlin(version = "1.1")
    @Nullable
    public static final <T> T safeCast(@NotNull KClass<T> kClass, @Nullable Object obj) {
        Intrinsics.checkNotNullParameter(kClass, "<this>");
        if (!kClass.isInstance(obj)) {
            return null;
        }
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type T of kotlin.reflect.full.KClasses.safeCast");
        return obj;
    }

    @SinceKotlin(version = "1.1")
    public static /* synthetic */ void getAllSuperclasses$annotations(KClass kClass) {
    }

    @SinceKotlin(version = "1.1")
    public static /* synthetic */ void getAllSupertypes$annotations(KClass kClass) {
    }

    @SinceKotlin(version = "1.1")
    public static /* synthetic */ void getCompanionObject$annotations(KClass kClass) {
    }

    @SinceKotlin(version = "1.1")
    public static /* synthetic */ void getCompanionObjectInstance$annotations(KClass kClass) {
    }

    @SinceKotlin(version = "1.1")
    public static /* synthetic */ void getDeclaredFunctions$annotations(KClass kClass) {
    }

    @SinceKotlin(version = "1.1")
    public static /* synthetic */ void getDeclaredMemberExtensionFunctions$annotations(KClass kClass) {
    }

    @SinceKotlin(version = "1.1")
    public static /* synthetic */ void getDeclaredMemberExtensionProperties$annotations(KClass kClass) {
    }

    @SinceKotlin(version = "1.1")
    public static /* synthetic */ void getDeclaredMemberFunctions$annotations(KClass kClass) {
    }

    @SinceKotlin(version = "1.1")
    public static /* synthetic */ void getDeclaredMemberProperties$annotations(KClass kClass) {
    }

    @SinceKotlin(version = "1.1")
    public static /* synthetic */ void getDeclaredMembers$annotations(KClass kClass) {
    }

    @Deprecated(message = "This function creates a type which rarely makes sense for generic classes. For example, such type can only be used in signatures of members of that class. Use starProjectedType or createType() for clearer semantics.")
    @SinceKotlin(version = "1.1")
    public static /* synthetic */ void getDefaultType$annotations(KClass kClass) {
    }

    @SinceKotlin(version = "1.1")
    public static /* synthetic */ void getFunctions$annotations(KClass kClass) {
    }

    @SinceKotlin(version = "1.1")
    public static /* synthetic */ void getMemberExtensionFunctions$annotations(KClass kClass) {
    }

    @SinceKotlin(version = "1.1")
    public static /* synthetic */ void getMemberExtensionProperties$annotations(KClass kClass) {
    }

    @SinceKotlin(version = "1.1")
    public static /* synthetic */ void getMemberFunctions$annotations(KClass kClass) {
    }

    @SinceKotlin(version = "1.1")
    public static /* synthetic */ void getMemberProperties$annotations(KClass kClass) {
    }

    @SinceKotlin(version = "1.1")
    public static /* synthetic */ void getPrimaryConstructor$annotations(KClass kClass) {
    }

    @SinceKotlin(version = "1.1")
    public static /* synthetic */ void getStaticFunctions$annotations(KClass kClass) {
    }

    @SinceKotlin(version = "1.1")
    public static /* synthetic */ void getStaticProperties$annotations(KClass kClass) {
    }

    @SinceKotlin(version = "1.1")
    public static /* synthetic */ void getSuperclasses$annotations(KClass kClass) {
    }
}
