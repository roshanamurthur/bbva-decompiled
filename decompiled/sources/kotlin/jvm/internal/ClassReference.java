package kotlin.jvm.internal;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import bk.p;
import bk.q;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.mastercard.sonic.androidsvg.SvgConstantsKt;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.SinceKotlin;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.KotlinReflectionNotSupportedError;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function10;
import kotlin.jvm.functions.Function11;
import kotlin.jvm.functions.Function12;
import kotlin.jvm.functions.Function13;
import kotlin.jvm.functions.Function14;
import kotlin.jvm.functions.Function15;
import kotlin.jvm.functions.Function16;
import kotlin.jvm.functions.Function17;
import kotlin.jvm.functions.Function18;
import kotlin.jvm.functions.Function19;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function20;
import kotlin.jvm.functions.Function21;
import kotlin.jvm.functions.Function22;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.functions.Function6;
import kotlin.jvm.functions.Function7;
import kotlin.jvm.functions.Function8;
import kotlin.jvm.functions.Function9;
import kotlin.reflect.KCallable;
import kotlin.reflect.KClass;
import kotlin.reflect.KFunction;
import kotlin.reflect.KType;
import kotlin.reflect.KTypeParameter;
import kotlin.reflect.KVisibility;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.serialization.internal.CollectionDescriptorsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ClassReference.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0010\u001b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u001b\u0018\u0000 P2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001PB\u0013\u0012\n\u0010\u0012\u001a\u0006\u0012\u0002\b\u00030\r¢\u0006\u0004\bN\u0010OJ\u0012\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002H\u0017J\u0013\u0010\b\u001a\u00020\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002H\u0096\u0002J\b\u0010\n\u001a\u00020\tH\u0016J\b\u0010\f\u001a\u00020\u000bH\u0016R\u001e\u0010\u0012\u001a\u0006\u0012\u0002\b\u00030\r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0015\u001a\u0004\u0018\u00010\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0017\u001a\u0004\u0018\u00010\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0014R\u001e\u0010\u001c\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00190\u00188VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR \u0010\u001f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u001d0\u00188VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001bR\u001e\u0010!\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00010\u00188VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b \u0010\u001bR\u001a\u0010&\u001a\b\u0012\u0004\u0012\u00020#0\"8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b$\u0010%R\u0016\u0010)\u001a\u0004\u0018\u00010\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b'\u0010(R \u0010.\u001a\b\u0012\u0004\u0012\u00020*0\"8VX\u0097\u0004¢\u0006\f\u0012\u0004\b,\u0010-\u001a\u0004\b+\u0010%R \u00102\u001a\b\u0012\u0004\u0012\u00020/0\"8VX\u0097\u0004¢\u0006\f\u0012\u0004\b1\u0010-\u001a\u0004\b0\u0010%R(\u00105\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u00010\"8VX\u0097\u0004¢\u0006\f\u0012\u0004\b4\u0010-\u001a\u0004\b3\u0010%R\u001c\u0010:\u001a\u0004\u0018\u0001068VX\u0097\u0004¢\u0006\f\u0012\u0004\b9\u0010-\u001a\u0004\b7\u00108R\u001a\u0010;\u001a\u00020\u00058VX\u0097\u0004¢\u0006\f\u0012\u0004\b=\u0010-\u001a\u0004\b;\u0010<R\u001a\u0010>\u001a\u00020\u00058VX\u0097\u0004¢\u0006\f\u0012\u0004\b?\u0010-\u001a\u0004\b>\u0010<R\u001a\u0010@\u001a\u00020\u00058VX\u0097\u0004¢\u0006\f\u0012\u0004\bA\u0010-\u001a\u0004\b@\u0010<R\u001a\u0010B\u001a\u00020\u00058VX\u0097\u0004¢\u0006\f\u0012\u0004\bC\u0010-\u001a\u0004\bB\u0010<R\u001a\u0010D\u001a\u00020\u00058VX\u0097\u0004¢\u0006\f\u0012\u0004\bE\u0010-\u001a\u0004\bD\u0010<R\u001a\u0010F\u001a\u00020\u00058VX\u0097\u0004¢\u0006\f\u0012\u0004\bG\u0010-\u001a\u0004\bF\u0010<R\u001a\u0010H\u001a\u00020\u00058VX\u0097\u0004¢\u0006\f\u0012\u0004\bI\u0010-\u001a\u0004\bH\u0010<R\u001a\u0010J\u001a\u00020\u00058VX\u0097\u0004¢\u0006\f\u0012\u0004\bK\u0010-\u001a\u0004\bJ\u0010<R\u001a\u0010L\u001a\u00020\u00058VX\u0097\u0004¢\u0006\f\u0012\u0004\bM\u0010-\u001a\u0004\bL\u0010<¨\u0006Q"}, d2 = {"Lkotlin/jvm/internal/ClassReference;", "Lkotlin/reflect/KClass;", "", "Lkotlin/jvm/internal/ClassBasedDeclarationContainer;", "value", "", "isInstance", "other", "equals", "", GenerateActivationFormCommand.HASH_CODE, "", "toString", "Ljava/lang/Class;", "p0", "Ljava/lang/Class;", "getJClass", "()Ljava/lang/Class;", "jClass", "getSimpleName", "()Ljava/lang/String;", "simpleName", "getQualifiedName", "qualifiedName", "", "Lkotlin/reflect/KCallable;", "getMembers", "()Ljava/util/Collection;", "members", "Lkotlin/reflect/KFunction;", "getConstructors", "constructors", "getNestedClasses", "nestedClasses", "", "", "getAnnotations", "()Ljava/util/List;", "annotations", "getObjectInstance", "()Ljava/lang/Object;", "objectInstance", "Lkotlin/reflect/KTypeParameter;", "getTypeParameters", "getTypeParameters$annotations", "()V", "typeParameters", "Lkotlin/reflect/KType;", "getSupertypes", "getSupertypes$annotations", "supertypes", "getSealedSubclasses", "getSealedSubclasses$annotations", "sealedSubclasses", "Lkotlin/reflect/KVisibility;", "getVisibility", "()Lkotlin/reflect/KVisibility;", "getVisibility$annotations", "visibility", "isFinal", "()Z", "isFinal$annotations", "isOpen", "isOpen$annotations", "isAbstract", "isAbstract$annotations", "isSealed", "isSealed$annotations", "isData", "isData$annotations", "isInner", "isInner$annotations", "isCompanion", "isCompanion$annotations", "isFun", "isFun$annotations", "isValue", "isValue$annotations", "<init>", "(Ljava/lang/Class;)V", "Companion", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nClassReference.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ClassReference.kt\nkotlin/jvm/internal/ClassReference\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,205:1\n1559#2:206\n1590#2,4:207\n1253#2,4:211\n1238#2,4:217\n453#3:215\n403#3:216\n*S KotlinDebug\n*F\n+ 1 ClassReference.kt\nkotlin/jvm/internal/ClassReference\n*L\n107#1:206\n107#1:207,4\n155#1:211,4\n163#1:217,4\n163#1:215\n163#1:216\n*E\n"})
public final class ClassReference implements KClass<Object>, ClassBasedDeclarationContainer {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    @NotNull
    public static final Map<Class<? extends Function<?>>, Integer> f79717q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    @NotNull
    public static final HashMap<String, String> f79718r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    @NotNull
    public static final LinkedHashMap f79719s0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Class<?> jClass;

    /* JADX INFO: compiled from: ClassReference.kt */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0014\u0010\u000f\u001a\u0004\u0018\u00010\n2\n\u0010\u0010\u001a\u0006\u0012\u0002\b\u00030\u0005J\u0014\u0010\u0011\u001a\u0004\u0018\u00010\n2\n\u0010\u0010\u001a\u0006\u0012\u0002\b\u00030\u0005J\u001c\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u00012\n\u0010\u0010\u001a\u0006\u0012\u0002\b\u00030\u0005R&\u0010\u0003\u001a\u001a\u0012\u0010\u0012\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R*\u0010\b\u001a\u001e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\tj\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n`\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R*\u0010\f\u001a\u001e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\tj\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n`\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R*\u0010\r\u001a\u001e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\tj\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n`\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lkotlin/jvm/internal/ClassReference$Companion;", "", "()V", "FUNCTION_CLASSES", "", "Ljava/lang/Class;", "Lkotlin/Function;", "", "classFqNames", "Ljava/util/HashMap;", "", "Lkotlin/collections/HashMap;", "primitiveFqNames", "primitiveWrapperFqNames", "simpleNames", "getClassQualifiedName", "jClass", "getClassSimpleName", "isInstance", "", "value", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nClassReference.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ClassReference.kt\nkotlin/jvm/internal/ClassReference$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,205:1\n1#2:206\n*E\n"})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Nullable
        public final String getClassQualifiedName(@NotNull Class<?> jClass) {
            String str;
            Intrinsics.checkNotNullParameter(jClass, "jClass");
            String strConcat = null;
            if (jClass.isAnonymousClass() || jClass.isLocalClass()) {
                return null;
            }
            if (!jClass.isArray()) {
                String str2 = (String) ClassReference.f79718r0.get(jClass.getName());
                return str2 == null ? jClass.getCanonicalName() : str2;
            }
            Class<?> componentType = jClass.getComponentType();
            if (componentType.isPrimitive() && (str = (String) ClassReference.f79718r0.get(componentType.getName())) != null) {
                strConcat = str.concat("Array");
            }
            return strConcat == null ? CollectionDescriptorsKt.ARRAY_NAME : strConcat;
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x003b, code lost:
        
            if (r2 == null) goto L13;
         */
        @org.jetbrains.annotations.Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.String getClassSimpleName(@org.jetbrains.annotations.NotNull java.lang.Class<?> r7) {
            /*
                r6 = this;
                java.lang.String r0 = "jClass"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
                boolean r0 = r7.isAnonymousClass()
                r1 = 0
                if (r0 == 0) goto Le
                goto La7
            Le:
                boolean r0 = r7.isLocalClass()
                if (r0 == 0) goto L69
                java.lang.String r0 = r7.getSimpleName()
                java.lang.reflect.Method r2 = r7.getEnclosingMethod()
                r3 = 2
                r4 = 36
                if (r2 == 0) goto L40
                kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                java.lang.String r2 = r2.getName()
                r5.append(r2)
                r5.append(r4)
                java.lang.String r2 = r5.toString()
                java.lang.String r2 = kotlin.text.StringsKt__StringsKt.substringAfter$default(r0, r2, r1, r3, r1)
                if (r2 != 0) goto L3e
                goto L40
            L3e:
                r1 = r2
                goto La7
            L40:
                java.lang.reflect.Constructor r7 = r7.getEnclosingConstructor()
                if (r7 == 0) goto L61
                kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r7 = r7.getName()
                r2.append(r7)
                r2.append(r4)
                java.lang.String r7 = r2.toString()
                java.lang.String r1 = kotlin.text.StringsKt__StringsKt.substringAfter$default(r0, r7, r1, r3, r1)
                goto La7
            L61:
                kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
                java.lang.String r1 = kotlin.text.StringsKt__StringsKt.substringAfter$default(r0, r4, r1, r3, r1)
                goto La7
            L69:
                boolean r0 = r7.isArray()
                if (r0 == 0) goto L92
                java.lang.Class r7 = r7.getComponentType()
                boolean r0 = r7.isPrimitive()
                java.lang.String r2 = "Array"
                if (r0 == 0) goto L8f
                java.util.Map r0 = kotlin.jvm.internal.ClassReference.access$getSimpleNames$cp()
                java.lang.String r7 = r7.getName()
                java.lang.Object r7 = r0.get(r7)
                java.lang.String r7 = (java.lang.String) r7
                if (r7 == 0) goto L8f
                java.lang.String r1 = r7.concat(r2)
            L8f:
                if (r1 != 0) goto La7
                goto L3e
            L92:
                java.util.Map r0 = kotlin.jvm.internal.ClassReference.access$getSimpleNames$cp()
                java.lang.String r1 = r7.getName()
                java.lang.Object r0 = r0.get(r1)
                r1 = r0
                java.lang.String r1 = (java.lang.String) r1
                if (r1 != 0) goto La7
                java.lang.String r1 = r7.getSimpleName()
            La7:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.ClassReference.Companion.getClassSimpleName(java.lang.Class):java.lang.String");
        }

        public final boolean isInstance(@Nullable Object value, @NotNull Class<?> jClass) {
            Intrinsics.checkNotNullParameter(jClass, "jClass");
            Map map = ClassReference.f79717q0;
            Intrinsics.checkNotNull(map, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.get, V of kotlin.collections.MapsKt__MapsKt.get>");
            Integer num = (Integer) map.get(jClass);
            if (num != null) {
                return TypeIntrinsics.isFunctionOfArity(value, num.intValue());
            }
            if (jClass.isPrimitive()) {
                jClass = JvmClassMappingKt.getJavaObjectType(JvmClassMappingKt.getKotlinClass(jClass));
            }
            return jClass.isInstance(value);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        int i10 = 0;
        List listListOf = CollectionsKt__CollectionsKt.listOf((Object[]) new Class[]{Function0.class, Function1.class, Function2.class, Function3.class, Function4.class, Function5.class, Function6.class, Function7.class, Function8.class, Function9.class, Function10.class, Function11.class, Function12.class, Function13.class, Function14.class, Function15.class, Function16.class, Function17.class, Function18.class, Function19.class, Function20.class, Function21.class, Function22.class});
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(listListOf, 10));
        for (Object obj : listListOf) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            arrayList.add(TuplesKt.to((Class) obj, Integer.valueOf(i10)));
            i10 = i11;
        }
        f79717q0 = q.toMap(arrayList);
        HashMap map = new HashMap();
        map.put(TypedValues.Custom.S_BOOLEAN, "kotlin.Boolean");
        map.put("char", "kotlin.Char");
        map.put("byte", "kotlin.Byte");
        map.put("short", "kotlin.Short");
        map.put("int", "kotlin.Int");
        map.put(TypedValues.Custom.S_FLOAT, "kotlin.Float");
        map.put("long", "kotlin.Long");
        map.put("double", "kotlin.Double");
        HashMap map2 = new HashMap();
        map2.put("java.lang.Boolean", "kotlin.Boolean");
        map2.put("java.lang.Character", "kotlin.Char");
        map2.put("java.lang.Byte", "kotlin.Byte");
        map2.put("java.lang.Short", "kotlin.Short");
        map2.put("java.lang.Integer", "kotlin.Int");
        map2.put("java.lang.Float", "kotlin.Float");
        map2.put("java.lang.Long", "kotlin.Long");
        map2.put("java.lang.Double", "kotlin.Double");
        HashMap<String, String> map3 = new HashMap<>();
        map3.put("java.lang.Object", "kotlin.Any");
        map3.put("java.lang.String", "kotlin.String");
        map3.put("java.lang.CharSequence", "kotlin.CharSequence");
        map3.put("java.lang.Throwable", "kotlin.Throwable");
        map3.put("java.lang.Cloneable", "kotlin.Cloneable");
        map3.put("java.lang.Number", "kotlin.Number");
        map3.put("java.lang.Comparable", "kotlin.Comparable");
        map3.put("java.lang.Enum", "kotlin.Enum");
        map3.put("java.lang.annotation.Annotation", "kotlin.Annotation");
        map3.put("java.lang.Iterable", "kotlin.collections.Iterable");
        map3.put("java.util.Iterator", "kotlin.collections.Iterator");
        map3.put("java.util.Collection", "kotlin.collections.Collection");
        map3.put("java.util.List", "kotlin.collections.List");
        map3.put("java.util.Set", "kotlin.collections.Set");
        map3.put("java.util.ListIterator", "kotlin.collections.ListIterator");
        map3.put("java.util.Map", "kotlin.collections.Map");
        map3.put("java.util.Map$Entry", "kotlin.collections.Map.Entry");
        map3.put("kotlin.jvm.internal.StringCompanionObject", "kotlin.String.Companion");
        map3.put("kotlin.jvm.internal.EnumCompanionObject", "kotlin.Enum.Companion");
        map3.putAll(map);
        map3.putAll(map2);
        Collection<String> collectionValues = map.values();
        Intrinsics.checkNotNullExpressionValue(collectionValues, "<get-values>(...)");
        for (String str : collectionValues) {
            StringBuilder sb2 = new StringBuilder("kotlin.jvm.internal.");
            Intrinsics.checkNotNull(str);
            Pair pair = TuplesKt.to(ad.d.f(sb2, StringsKt__StringsKt.substringAfterLast$default(str, '.', (String) null, 2, (Object) null), "CompanionObject"), str + ".Companion");
            map3.put(pair.getFirst(), pair.getSecond());
        }
        for (Map.Entry<Class<? extends Function<?>>, Integer> entry : f79717q0.entrySet()) {
            map3.put(entry.getKey().getName(), "kotlin.Function" + entry.getValue().intValue());
        }
        f79718r0 = map3;
        LinkedHashMap linkedHashMap = new LinkedHashMap(p.mapCapacity(map3.size()));
        for (Map.Entry entry2 : map3.entrySet()) {
            linkedHashMap.put(entry2.getKey(), StringsKt__StringsKt.substringAfterLast$default((String) entry2.getValue(), '.', (String) null, 2, (Object) null));
        }
        f79719s0 = linkedHashMap;
    }

    public ClassReference(@NotNull Class<?> jClass) {
        Intrinsics.checkNotNullParameter(jClass, "jClass");
        this.jClass = jClass;
    }

    public static void a() {
        throw new KotlinReflectionNotSupportedError();
    }

    @Override // kotlin.reflect.KClass
    public boolean equals(@Nullable Object other) {
        return (other instanceof ClassReference) && Intrinsics.areEqual(JvmClassMappingKt.getJavaObjectType(this), JvmClassMappingKt.getJavaObjectType((KClass) other));
    }

    @Override // kotlin.reflect.KAnnotatedElement
    @NotNull
    public List<Annotation> getAnnotations() {
        a();
        throw null;
    }

    @Override // kotlin.reflect.KClass
    @NotNull
    public Collection<KFunction<Object>> getConstructors() {
        a();
        throw null;
    }

    @Override // kotlin.jvm.internal.ClassBasedDeclarationContainer
    @NotNull
    public Class<?> getJClass() {
        return this.jClass;
    }

    @Override // kotlin.reflect.KClass, kotlin.reflect.KDeclarationContainer
    @NotNull
    public Collection<KCallable<?>> getMembers() {
        a();
        throw null;
    }

    @Override // kotlin.reflect.KClass
    @NotNull
    public Collection<KClass<?>> getNestedClasses() {
        a();
        throw null;
    }

    @Override // kotlin.reflect.KClass
    @Nullable
    public Object getObjectInstance() {
        a();
        throw null;
    }

    @Override // kotlin.reflect.KClass
    @Nullable
    public String getQualifiedName() {
        return INSTANCE.getClassQualifiedName(getJClass());
    }

    @Override // kotlin.reflect.KClass
    @NotNull
    public List<KClass<? extends Object>> getSealedSubclasses() {
        a();
        throw null;
    }

    @Override // kotlin.reflect.KClass
    @Nullable
    public String getSimpleName() {
        return INSTANCE.getClassSimpleName(getJClass());
    }

    @Override // kotlin.reflect.KClass
    @NotNull
    public List<KType> getSupertypes() {
        a();
        throw null;
    }

    @Override // kotlin.reflect.KClass
    @NotNull
    public List<KTypeParameter> getTypeParameters() {
        a();
        throw null;
    }

    @Override // kotlin.reflect.KClass
    @Nullable
    public KVisibility getVisibility() {
        a();
        throw null;
    }

    @Override // kotlin.reflect.KClass
    public int hashCode() {
        return JvmClassMappingKt.getJavaObjectType(this).hashCode();
    }

    @Override // kotlin.reflect.KClass
    public boolean isAbstract() {
        a();
        throw null;
    }

    @Override // kotlin.reflect.KClass
    public boolean isCompanion() {
        a();
        throw null;
    }

    @Override // kotlin.reflect.KClass
    public boolean isData() {
        a();
        throw null;
    }

    @Override // kotlin.reflect.KClass
    public boolean isFinal() {
        a();
        throw null;
    }

    @Override // kotlin.reflect.KClass
    public boolean isFun() {
        a();
        throw null;
    }

    @Override // kotlin.reflect.KClass
    public boolean isInner() {
        a();
        throw null;
    }

    @Override // kotlin.reflect.KClass
    @SinceKotlin(version = "1.1")
    public boolean isInstance(@Nullable Object value) {
        return INSTANCE.isInstance(value, getJClass());
    }

    @Override // kotlin.reflect.KClass
    public boolean isOpen() {
        a();
        throw null;
    }

    @Override // kotlin.reflect.KClass
    public boolean isSealed() {
        a();
        throw null;
    }

    @Override // kotlin.reflect.KClass
    public boolean isValue() {
        a();
        throw null;
    }

    @NotNull
    public String toString() {
        return getJClass().toString() + " (Kotlin reflection is not available)";
    }

    @SinceKotlin(version = "1.3")
    public static /* synthetic */ void getSealedSubclasses$annotations() {
    }

    @SinceKotlin(version = "1.1")
    public static /* synthetic */ void getSupertypes$annotations() {
    }

    @SinceKotlin(version = "1.1")
    public static /* synthetic */ void getTypeParameters$annotations() {
    }

    @SinceKotlin(version = "1.1")
    public static /* synthetic */ void getVisibility$annotations() {
    }

    @SinceKotlin(version = "1.1")
    public static /* synthetic */ void isAbstract$annotations() {
    }

    @SinceKotlin(version = "1.1")
    public static /* synthetic */ void isCompanion$annotations() {
    }

    @SinceKotlin(version = "1.1")
    public static /* synthetic */ void isData$annotations() {
    }

    @SinceKotlin(version = "1.1")
    public static /* synthetic */ void isFinal$annotations() {
    }

    @SinceKotlin(version = "1.4")
    public static /* synthetic */ void isFun$annotations() {
    }

    @SinceKotlin(version = "1.1")
    public static /* synthetic */ void isInner$annotations() {
    }

    @SinceKotlin(version = "1.1")
    public static /* synthetic */ void isOpen$annotations() {
    }

    @SinceKotlin(version = "1.1")
    public static /* synthetic */ void isSealed$annotations() {
    }

    @SinceKotlin(version = SvgConstantsKt.VERSION)
    public static /* synthetic */ void isValue$annotations() {
    }
}
