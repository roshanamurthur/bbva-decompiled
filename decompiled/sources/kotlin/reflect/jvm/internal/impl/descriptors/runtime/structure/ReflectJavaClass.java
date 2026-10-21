package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import com.bbva.appsflyer.DeepLinkListenerAdapter;
import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReference;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.SpreadBuilder;
import kotlin.reflect.KDeclarationContainer;
import kotlin.reflect.jvm.internal.impl.descriptors.Visibilities;
import kotlin.reflect.jvm.internal.impl.descriptors.Visibility;
import kotlin.reflect.jvm.internal.impl.descriptors.java.JavaVisibilities;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotation;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClassifierType;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaRecordComponent;
import kotlin.reflect.jvm.internal.impl.load.java.structure.LightClassOriginKind;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.sequences.SequencesKt___SequencesKt;
import kotlin.text.StringsKt__StringsKt;
import mx.openpay.library.domain.util.Constant;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ReflectJavaClass.kt */
/* JADX INFO: loaded from: classes12.dex */
@SourceDebugExtension({"SMAP\nReflectJavaClass.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReflectJavaClass.kt\norg/jetbrains/kotlin/descriptors/runtime/structure/ReflectJavaClass\n+ 2 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 6 ArrayIntrinsics.kt\nkotlin/ArrayIntrinsicsKt\n*L\n1#1,208:1\n179#2,2:209\n1#3:211\n1549#4:212\n1620#4,3:213\n11065#5:216\n11400#5,3:217\n11065#5:221\n11400#5,3:222\n11065#5:225\n11400#5,3:226\n26#6:220\n*S KotlinDebug\n*F\n+ 1 ReflectJavaClass.kt\norg/jetbrains/kotlin/descriptors/runtime/structure/ReflectJavaClass\n*L\n51#1:209,2\n64#1:212\n64#1:213,3\n118#1:216\n118#1:217,3\n131#1:221\n131#1:222,3\n138#1:225\n138#1:226,3\n131#1:220\n*E\n"})
public final class ReflectJavaClass extends ReflectJavaElement implements ReflectJavaAnnotationOwner, ReflectJavaModifierListOwner, JavaClass {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Class<?> f80443a;

    /* JADX INFO: compiled from: ReflectJavaClass.kt */
    public /* synthetic */ class a extends FunctionReference implements Function1<Member, Boolean> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final a f80444p0 = new a(1);

        @Override // kotlin.jvm.internal.CallableReference, kotlin.reflect.KCallable
        @NotNull
        public final String getName() {
            return "isSynthetic";
        }

        @Override // kotlin.jvm.internal.CallableReference
        @NotNull
        public final KDeclarationContainer getOwner() {
            return Reflection.getOrCreateKotlinClass(Member.class);
        }

        @Override // kotlin.jvm.internal.CallableReference
        @NotNull
        public final String getSignature() {
            return "isSynthetic()Z";
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        public final Boolean invoke(@NotNull Member p4) {
            Intrinsics.checkNotNullParameter(p4, "p0");
            return Boolean.valueOf(p4.isSynthetic());
        }
    }

    /* JADX INFO: compiled from: ReflectJavaClass.kt */
    public /* synthetic */ class b extends FunctionReference implements Function1<Constructor<?>, ReflectJavaConstructor> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final b f80445p0 = new b(1);

        @Override // kotlin.jvm.internal.CallableReference, kotlin.reflect.KCallable
        @NotNull
        public final String getName() {
            return "<init>";
        }

        @Override // kotlin.jvm.internal.CallableReference
        @NotNull
        public final KDeclarationContainer getOwner() {
            return Reflection.getOrCreateKotlinClass(ReflectJavaConstructor.class);
        }

        @Override // kotlin.jvm.internal.CallableReference
        @NotNull
        public final String getSignature() {
            return "<init>(Ljava/lang/reflect/Constructor;)V";
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        public final ReflectJavaConstructor invoke(@NotNull Constructor<?> p4) {
            Intrinsics.checkNotNullParameter(p4, "p0");
            return new ReflectJavaConstructor(p4);
        }
    }

    /* JADX INFO: compiled from: ReflectJavaClass.kt */
    public /* synthetic */ class c extends FunctionReference implements Function1<Member, Boolean> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final c f80446p0 = new c(1);

        @Override // kotlin.jvm.internal.CallableReference, kotlin.reflect.KCallable
        @NotNull
        public final String getName() {
            return "isSynthetic";
        }

        @Override // kotlin.jvm.internal.CallableReference
        @NotNull
        public final KDeclarationContainer getOwner() {
            return Reflection.getOrCreateKotlinClass(Member.class);
        }

        @Override // kotlin.jvm.internal.CallableReference
        @NotNull
        public final String getSignature() {
            return "isSynthetic()Z";
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        public final Boolean invoke(@NotNull Member p4) {
            Intrinsics.checkNotNullParameter(p4, "p0");
            return Boolean.valueOf(p4.isSynthetic());
        }
    }

    /* JADX INFO: compiled from: ReflectJavaClass.kt */
    public /* synthetic */ class d extends FunctionReference implements Function1<Field, ReflectJavaField> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final d f80447p0 = new d(1);

        @Override // kotlin.jvm.internal.CallableReference, kotlin.reflect.KCallable
        @NotNull
        public final String getName() {
            return "<init>";
        }

        @Override // kotlin.jvm.internal.CallableReference
        @NotNull
        public final KDeclarationContainer getOwner() {
            return Reflection.getOrCreateKotlinClass(ReflectJavaField.class);
        }

        @Override // kotlin.jvm.internal.CallableReference
        @NotNull
        public final String getSignature() {
            return "<init>(Ljava/lang/reflect/Field;)V";
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        public final ReflectJavaField invoke(@NotNull Field p4) {
            Intrinsics.checkNotNullParameter(p4, "p0");
            return new ReflectJavaField(p4);
        }
    }

    /* JADX INFO: compiled from: ReflectJavaClass.kt */
    public static final class e extends Lambda implements Function1<Class<?>, Boolean> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final e f80448p0 = new e(1);

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        public final Boolean invoke(Class<?> cls) {
            String simpleName = cls.getSimpleName();
            Intrinsics.checkNotNullExpressionValue(simpleName, "getSimpleName(...)");
            return Boolean.valueOf(simpleName.length() == 0);
        }
    }

    /* JADX INFO: compiled from: ReflectJavaClass.kt */
    @SourceDebugExtension({"SMAP\nReflectJavaClass.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReflectJavaClass.kt\norg/jetbrains/kotlin/descriptors/runtime/structure/ReflectJavaClass$innerClassNames$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,208:1\n1#2:209\n*E\n"})
    public static final class f extends Lambda implements Function1<Class<?>, Name> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final f f80449p0 = new f(1);

        @Override // kotlin.jvm.functions.Function1
        @Nullable
        public final Name invoke(Class<?> cls) {
            String simpleName = cls.getSimpleName();
            if (!Name.isValidIdentifier(simpleName)) {
                simpleName = null;
            }
            if (simpleName != null) {
                return Name.identifier(simpleName);
            }
            return null;
        }
    }

    /* JADX INFO: compiled from: ReflectJavaClass.kt */
    public static final class g extends Lambda implements Function1<Method, Boolean> {
        public g() {
            super(1);
        }

        /* JADX WARN: Code duplicated, block: B:9:0x001a  */
        @Override // kotlin.jvm.functions.Function1
        @NotNull
        public final Boolean invoke(Method method) {
            boolean z10 = false;
            if (!method.isSynthetic()) {
                ReflectJavaClass reflectJavaClass = ReflectJavaClass.this;
                if (reflectJavaClass.isEnum()) {
                    Intrinsics.checkNotNull(method);
                    if (!ReflectJavaClass.access$isEnumValuesOrValueOf(reflectJavaClass, method)) {
                        z10 = true;
                    }
                } else {
                    z10 = true;
                }
            }
            return Boolean.valueOf(z10);
        }
    }

    /* JADX INFO: compiled from: ReflectJavaClass.kt */
    public /* synthetic */ class h extends FunctionReference implements Function1<Method, ReflectJavaMethod> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final h f80451p0 = new h(1);

        @Override // kotlin.jvm.internal.CallableReference, kotlin.reflect.KCallable
        @NotNull
        public final String getName() {
            return "<init>";
        }

        @Override // kotlin.jvm.internal.CallableReference
        @NotNull
        public final KDeclarationContainer getOwner() {
            return Reflection.getOrCreateKotlinClass(ReflectJavaMethod.class);
        }

        @Override // kotlin.jvm.internal.CallableReference
        @NotNull
        public final String getSignature() {
            return "<init>(Ljava/lang/reflect/Method;)V";
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        public final ReflectJavaMethod invoke(@NotNull Method p4) {
            Intrinsics.checkNotNullParameter(p4, "p0");
            return new ReflectJavaMethod(p4);
        }
    }

    public ReflectJavaClass(@NotNull Class<?> klass) {
        Intrinsics.checkNotNullParameter(klass, "klass");
        this.f80443a = klass;
    }

    public static final boolean access$isEnumValuesOrValueOf(ReflectJavaClass reflectJavaClass, Method method) {
        reflectJavaClass.getClass();
        String name = method.getName();
        if (Intrinsics.areEqual(name, "values")) {
            Class<?>[] parameterTypes = method.getParameterTypes();
            Intrinsics.checkNotNullExpressionValue(parameterTypes, "getParameterTypes(...)");
            if (parameterTypes.length == 0) {
                return true;
            }
        } else if (Intrinsics.areEqual(name, DeepLinkListenerAdapter.Constants.STATUS_VALUE_OF)) {
            return Arrays.equals(method.getParameterTypes(), new Class[]{String.class});
        }
        return false;
    }

    public boolean equals(@Nullable Object obj) {
        if (obj instanceof ReflectJavaClass) {
            if (Intrinsics.areEqual(this.f80443a, ((ReflectJavaClass) obj).f80443a)) {
                return true;
            }
        }
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationOwner
    public /* bridge */ /* synthetic */ JavaAnnotation findAnnotation(FqName fqName) {
        return findAnnotation(fqName);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationOwner
    public /* bridge */ /* synthetic */ Collection getAnnotations() {
        return getAnnotations();
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass
    @NotNull
    public FqName getFqName() {
        FqName fqNameAsSingleFqName = ReflectClassUtilKt.getClassId(this.f80443a).asSingleFqName();
        Intrinsics.checkNotNullExpressionValue(fqNameAsSingleFqName, "asSingleFqName(...)");
        return fqNameAsSingleFqName;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass
    @Nullable
    public LightClassOriginKind getLightClassOriginKind() {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaModifierListOwner
    public int getModifiers() {
        return this.f80443a.getModifiers();
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaNamedElement
    @NotNull
    public Name getName() {
        Class<?> cls = this.f80443a;
        if (!cls.isAnonymousClass()) {
            Name nameIdentifier = Name.identifier(cls.getSimpleName());
            Intrinsics.checkNotNull(nameIdentifier);
            return nameIdentifier;
        }
        String name = cls.getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        Name nameIdentifier2 = Name.identifier(StringsKt__StringsKt.substringAfterLast$default(name, Constant.DOT_STRING, (String) null, 2, (Object) null));
        Intrinsics.checkNotNull(nameIdentifier2);
        return nameIdentifier2;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass
    @NotNull
    public Collection<JavaClassifierType> getPermittedTypes() throws IllegalAccessException, InvocationTargetException {
        Class<?>[] clsArrLoadGetPermittedSubclasses = Java16SealedRecordLoader.f80420a.loadGetPermittedSubclasses(this.f80443a);
        if (clsArrLoadGetPermittedSubclasses == null) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList(clsArrLoadGetPermittedSubclasses.length);
        for (Class<?> cls : clsArrLoadGetPermittedSubclasses) {
            arrayList.add(new ReflectJavaClassifierType(cls));
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass
    @NotNull
    public Collection<JavaRecordComponent> getRecordComponents() {
        Object[] objArrLoadGetRecordComponents = Java16SealedRecordLoader.f80420a.loadGetRecordComponents(this.f80443a);
        if (objArrLoadGetRecordComponents == null) {
            objArrLoadGetRecordComponents = new Object[0];
        }
        ArrayList arrayList = new ArrayList(objArrLoadGetRecordComponents.length);
        for (Object obj : objArrLoadGetRecordComponents) {
            arrayList.add(new ReflectJavaRecordComponent(obj));
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass
    @NotNull
    public Collection<JavaClassifierType> getSupertypes() {
        Class<?> cls = this.f80443a;
        if (Intrinsics.areEqual(cls, Object.class)) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        SpreadBuilder spreadBuilder = new SpreadBuilder(2);
        Type genericSuperclass = cls.getGenericSuperclass();
        spreadBuilder.add(genericSuperclass != null ? genericSuperclass : Object.class);
        Type[] genericInterfaces = cls.getGenericInterfaces();
        Intrinsics.checkNotNullExpressionValue(genericInterfaces, "getGenericInterfaces(...)");
        spreadBuilder.addSpread(genericInterfaces);
        List listListOf = CollectionsKt__CollectionsKt.listOf(spreadBuilder.toArray(new Type[spreadBuilder.size()]));
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(listListOf, 10));
        Iterator it = listListOf.iterator();
        while (it.hasNext()) {
            arrayList.add(new ReflectJavaClassifierType((Type) it.next()));
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaTypeParameterListOwner
    @NotNull
    public List<ReflectJavaTypeParameter> getTypeParameters() {
        TypeVariable<Class<?>>[] typeParameters = this.f80443a.getTypeParameters();
        Intrinsics.checkNotNullExpressionValue(typeParameters, "getTypeParameters(...)");
        ArrayList arrayList = new ArrayList(typeParameters.length);
        for (TypeVariable<Class<?>> typeVariable : typeParameters) {
            arrayList.add(new ReflectJavaTypeParameter(typeVariable));
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaModifierListOwner
    @NotNull
    public Visibility getVisibility() {
        int modifiers = getModifiers();
        if (Modifier.isPublic(modifiers)) {
            return Visibilities.Public.INSTANCE;
        }
        if (Modifier.isPrivate(modifiers)) {
            return Visibilities.Private.INSTANCE;
        }
        if (Modifier.isProtected(modifiers)) {
            return Modifier.isStatic(modifiers) ? JavaVisibilities.ProtectedStaticVisibility.INSTANCE : JavaVisibilities.ProtectedAndPackage.INSTANCE;
        }
        return JavaVisibilities.PackageVisibility.INSTANCE;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass
    public boolean hasDefaultConstructor() {
        return false;
    }

    public int hashCode() {
        return this.f80443a.hashCode();
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaModifierListOwner
    public boolean isAbstract() {
        return Modifier.isAbstract(getModifiers());
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass
    public boolean isAnnotationType() {
        return this.f80443a.isAnnotation();
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationOwner
    public boolean isDeprecatedInJavaDoc() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass
    public boolean isEnum() {
        return this.f80443a.isEnum();
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaModifierListOwner
    public boolean isFinal() {
        return Modifier.isFinal(getModifiers());
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass
    public boolean isInterface() {
        return this.f80443a.isInterface();
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass
    public boolean isRecord() throws IllegalAccessException, InvocationTargetException {
        Boolean boolLoadIsRecord = Java16SealedRecordLoader.f80420a.loadIsRecord(this.f80443a);
        if (boolLoadIsRecord != null) {
            return boolLoadIsRecord.booleanValue();
        }
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass
    public boolean isSealed() throws IllegalAccessException, InvocationTargetException {
        Boolean boolLoadIsSealed = Java16SealedRecordLoader.f80420a.loadIsSealed(this.f80443a);
        if (boolLoadIsSealed != null) {
            return boolLoadIsSealed.booleanValue();
        }
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaModifierListOwner
    public boolean isStatic() {
        return Modifier.isStatic(getModifiers());
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        androidx.core.graphics.b.f(ReflectJavaClass.class, sb2, ": ");
        sb2.append(this.f80443a);
        return sb2.toString();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaAnnotationOwner, kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationOwner
    @Nullable
    public ReflectJavaAnnotation findAnnotation(FqName fqName) {
        Annotation[] declaredAnnotations;
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        AnnotatedElement element = getElement();
        if (element == null || (declaredAnnotations = element.getDeclaredAnnotations()) == null) {
            return null;
        }
        return ReflectJavaAnnotationOwnerKt.findAnnotation(declaredAnnotations, fqName);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaAnnotationOwner, kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationOwner
    @NotNull
    public List<ReflectJavaAnnotation> getAnnotations() {
        Annotation[] declaredAnnotations;
        List<ReflectJavaAnnotation> annotations;
        AnnotatedElement element = getElement();
        return (element == null || (declaredAnnotations = element.getDeclaredAnnotations()) == null || (annotations = ReflectJavaAnnotationOwnerKt.getAnnotations(declaredAnnotations)) == null) ? CollectionsKt__CollectionsKt.emptyList() : annotations;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass
    @NotNull
    public List<ReflectJavaConstructor> getConstructors() {
        Constructor<?>[] declaredConstructors = this.f80443a.getDeclaredConstructors();
        Intrinsics.checkNotNullExpressionValue(declaredConstructors, "getDeclaredConstructors(...)");
        return SequencesKt___SequencesKt.toList(SequencesKt___SequencesKt.map(SequencesKt___SequencesKt.filterNot(ArraysKt___ArraysKt.asSequence(declaredConstructors), a.f80444p0), b.f80445p0));
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaAnnotationOwner
    @NotNull
    public Class<?> getElement() {
        return this.f80443a;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass
    @NotNull
    public List<ReflectJavaField> getFields() {
        Field[] declaredFields = this.f80443a.getDeclaredFields();
        Intrinsics.checkNotNullExpressionValue(declaredFields, "getDeclaredFields(...)");
        return SequencesKt___SequencesKt.toList(SequencesKt___SequencesKt.map(SequencesKt___SequencesKt.filterNot(ArraysKt___ArraysKt.asSequence(declaredFields), c.f80446p0), d.f80447p0));
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass
    @NotNull
    public List<Name> getInnerClassNames() {
        Class<?>[] declaredClasses = this.f80443a.getDeclaredClasses();
        Intrinsics.checkNotNullExpressionValue(declaredClasses, "getDeclaredClasses(...)");
        return SequencesKt___SequencesKt.toList(SequencesKt___SequencesKt.mapNotNull(SequencesKt___SequencesKt.filterNot(ArraysKt___ArraysKt.asSequence(declaredClasses), e.f80448p0), f.f80449p0));
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass
    @NotNull
    public List<ReflectJavaMethod> getMethods() {
        Method[] declaredMethods = this.f80443a.getDeclaredMethods();
        Intrinsics.checkNotNullExpressionValue(declaredMethods, "getDeclaredMethods(...)");
        return SequencesKt___SequencesKt.toList(SequencesKt___SequencesKt.map(SequencesKt___SequencesKt.filter(ArraysKt___ArraysKt.asSequence(declaredMethods), new g()), h.f80451p0));
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass
    @Nullable
    public ReflectJavaClass getOuterClass() {
        Class<?> declaringClass = this.f80443a.getDeclaringClass();
        if (declaringClass != null) {
            return new ReflectJavaClass(declaringClass);
        }
        return null;
    }
}
