package kotlin.reflect.jvm.internal.impl.builtins;

import androidx.appcompat.widget.g0;
import bk.w;
import com.bbva.appsflyer.DeepLinkListenerAdapter;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionTypeKind;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.utils.CollectionsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: StandardNames.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class StandardNames {

    @JvmField
    @NotNull
    public static final FqName ANNOTATION_PACKAGE_FQ_NAME;

    @JvmField
    @NotNull
    public static final Name BACKING_FIELD;

    @JvmField
    @NotNull
    public static final FqName BUILT_INS_PACKAGE_FQ_NAME;

    @JvmField
    @NotNull
    public static final Set<FqName> BUILT_INS_PACKAGE_FQ_NAMES;

    @JvmField
    @NotNull
    public static final Name BUILT_INS_PACKAGE_NAME;

    @JvmField
    @NotNull
    public static final Name CHAR_CODE;

    @JvmField
    @NotNull
    public static final FqName COLLECTIONS_PACKAGE_FQ_NAME;

    @JvmField
    @NotNull
    public static final Name CONTEXT_FUNCTION_TYPE_PARAMETER_COUNT_NAME;

    @JvmField
    @NotNull
    public static final FqName CONTINUATION_INTERFACE_FQ_NAME;

    @JvmField
    @NotNull
    public static final FqName COROUTINES_INTRINSICS_PACKAGE_FQ_NAME;

    @JvmField
    @NotNull
    public static final FqName COROUTINES_JVM_INTERNAL_PACKAGE_FQ_NAME;

    @JvmField
    @NotNull
    public static final FqName COROUTINES_PACKAGE_FQ_NAME;

    @JvmField
    @NotNull
    public static final String DATA_CLASS_COMPONENT_PREFIX;

    @JvmField
    @NotNull
    public static final Name DATA_CLASS_COPY;

    @JvmField
    @NotNull
    public static final Name DEFAULT_VALUE_PARAMETER;

    @JvmField
    @NotNull
    public static final FqName DYNAMIC_FQ_NAME;

    @JvmField
    @NotNull
    public static final Name ENUM_ENTRIES;

    @JvmField
    @NotNull
    public static final Name ENUM_VALUES;

    @JvmField
    @NotNull
    public static final Name ENUM_VALUE_OF;

    @JvmField
    @NotNull
    public static final Name HASHCODE_NAME;

    @JvmField
    @NotNull
    public static final Name IMPLICIT_LAMBDA_PARAMETER_NAME;

    @NotNull
    public static final StandardNames INSTANCE = new StandardNames();

    @JvmField
    @NotNull
    public static final FqName KOTLIN_INTERNAL_FQ_NAME;

    @JvmField
    @NotNull
    public static final FqName KOTLIN_REFLECT_FQ_NAME;

    @JvmField
    @NotNull
    public static final Name MAIN;

    @JvmField
    @NotNull
    public static final Name NAME;

    @JvmField
    @NotNull
    public static final Name NEXT_CHAR;

    @JvmField
    @NotNull
    public static final List<String> PREFIXES;

    @JvmField
    @NotNull
    public static final FqName RANGES_PACKAGE_FQ_NAME;

    @JvmField
    @NotNull
    public static final FqName RESULT_FQ_NAME;

    @JvmField
    @NotNull
    public static final FqName TEXT_PACKAGE_FQ_NAME;

    /* JADX INFO: compiled from: StandardNames.kt */
    @SourceDebugExtension({"SMAP\nStandardNames.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StandardNames.kt\norg/jetbrains/kotlin/builtins/StandardNames$FqNames\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,302:1\n11400#2,3:303\n11400#2,3:306\n*S KotlinDebug\n*F\n+ 1 StandardNames.kt\norg/jetbrains/kotlin/builtins/StandardNames$FqNames\n*L\n198#1:303,3\n202#1:306,3\n*E\n"})
    public static final class FqNames {

        @JvmField
        @NotNull
        public static final FqName accessibleLateinitPropertyLiteral;

        @JvmField
        @NotNull
        public static final FqName annotation;

        @JvmField
        @NotNull
        public static final FqName annotationRetention;

        @JvmField
        @NotNull
        public static final FqName annotationTarget;

        @JvmField
        @NotNull
        public static final Map<FqNameUnsafe, PrimitiveType> arrayClassFqNameToPrimitiveType;

        @JvmField
        @NotNull
        public static final FqName collection;

        @JvmField
        @NotNull
        public static final FqName contextFunctionTypeParams;

        @JvmField
        @NotNull
        public static final FqName deprecated;

        @JvmField
        @NotNull
        public static final FqName deprecatedSinceKotlin;

        @JvmField
        @NotNull
        public static final FqName deprecationLevel;

        @JvmField
        @NotNull
        public static final FqName extensionFunctionType;

        @JvmField
        @NotNull
        public static final Map<FqNameUnsafe, PrimitiveType> fqNameToPrimitiveType;

        @JvmField
        @NotNull
        public static final FqNameUnsafe intRange;

        @JvmField
        @NotNull
        public static final FqName iterable;

        @JvmField
        @NotNull
        public static final FqName iterator;

        @JvmField
        @NotNull
        public static final FqNameUnsafe kCallable;

        @JvmField
        @NotNull
        public static final FqNameUnsafe kClass;

        @JvmField
        @NotNull
        public static final FqNameUnsafe kDeclarationContainer;

        @JvmField
        @NotNull
        public static final FqNameUnsafe kMutableProperty0;

        @JvmField
        @NotNull
        public static final FqNameUnsafe kMutableProperty1;

        @JvmField
        @NotNull
        public static final FqNameUnsafe kMutableProperty2;

        @JvmField
        @NotNull
        public static final FqNameUnsafe kMutablePropertyFqName;

        @JvmField
        @NotNull
        public static final ClassId kProperty;

        @JvmField
        @NotNull
        public static final FqNameUnsafe kProperty0;

        @JvmField
        @NotNull
        public static final FqNameUnsafe kProperty1;

        @JvmField
        @NotNull
        public static final FqNameUnsafe kProperty2;

        @JvmField
        @NotNull
        public static final FqNameUnsafe kPropertyFqName;

        @JvmField
        @NotNull
        public static final FqNameUnsafe kType;

        @JvmField
        @NotNull
        public static final FqName list;

        @JvmField
        @NotNull
        public static final FqName listIterator;

        @JvmField
        @NotNull
        public static final FqNameUnsafe longRange;

        @JvmField
        @NotNull
        public static final FqName map;

        @JvmField
        @NotNull
        public static final FqName mapEntry;

        @JvmField
        @NotNull
        public static final FqName mustBeDocumented;

        @JvmField
        @NotNull
        public static final FqName mutableCollection;

        @JvmField
        @NotNull
        public static final FqName mutableIterable;

        @JvmField
        @NotNull
        public static final FqName mutableIterator;

        @JvmField
        @NotNull
        public static final FqName mutableList;

        @JvmField
        @NotNull
        public static final FqName mutableListIterator;

        @JvmField
        @NotNull
        public static final FqName mutableMap;

        @JvmField
        @NotNull
        public static final FqName mutableMapEntry;

        @JvmField
        @NotNull
        public static final FqName mutableSet;

        @JvmField
        @NotNull
        public static final FqName parameterName;

        @JvmField
        @NotNull
        public static final ClassId parameterNameClassId;

        @JvmField
        @NotNull
        public static final Set<Name> primitiveArrayTypeShortNames;

        @JvmField
        @NotNull
        public static final Set<Name> primitiveTypeShortNames;

        @JvmField
        @NotNull
        public static final FqName publishedApi;

        @JvmField
        @NotNull
        public static final FqName repeatable;

        @JvmField
        @NotNull
        public static final ClassId repeatableClassId;

        @JvmField
        @NotNull
        public static final FqName replaceWith;

        @JvmField
        @NotNull
        public static final FqName retention;

        @JvmField
        @NotNull
        public static final ClassId retentionClassId;

        @JvmField
        @NotNull
        public static final FqName set;

        @JvmField
        @NotNull
        public static final FqName target;

        @JvmField
        @NotNull
        public static final ClassId targetClassId;

        @JvmField
        @NotNull
        public static final ClassId uByte;

        @JvmField
        @NotNull
        public static final FqName uByteArrayFqName;

        @JvmField
        @NotNull
        public static final FqName uByteFqName;

        @JvmField
        @NotNull
        public static final ClassId uInt;

        @JvmField
        @NotNull
        public static final FqName uIntArrayFqName;

        @JvmField
        @NotNull
        public static final FqName uIntFqName;

        @JvmField
        @NotNull
        public static final ClassId uLong;

        @JvmField
        @NotNull
        public static final FqName uLongArrayFqName;

        @JvmField
        @NotNull
        public static final FqName uLongFqName;

        @JvmField
        @NotNull
        public static final ClassId uShort;

        @JvmField
        @NotNull
        public static final FqName uShortArrayFqName;

        @JvmField
        @NotNull
        public static final FqName uShortFqName;

        @JvmField
        @NotNull
        public static final FqName unsafeVariance;

        @NotNull
        public static final FqNames INSTANCE = new FqNames();

        @JvmField
        @NotNull
        public static final FqNameUnsafe any = d("Any");

        @JvmField
        @NotNull
        public static final FqNameUnsafe nothing = d("Nothing");

        @JvmField
        @NotNull
        public static final FqNameUnsafe cloneable = d("Cloneable");

        @JvmField
        @NotNull
        public static final FqName suppress = c("Suppress");

        @JvmField
        @NotNull
        public static final FqNameUnsafe unit = d("Unit");

        @JvmField
        @NotNull
        public static final FqNameUnsafe charSequence = d("CharSequence");

        @JvmField
        @NotNull
        public static final FqNameUnsafe string = d("String");

        @JvmField
        @NotNull
        public static final FqNameUnsafe array = d("Array");

        @JvmField
        @NotNull
        public static final FqNameUnsafe _boolean = d("Boolean");

        @JvmField
        @NotNull
        public static final FqNameUnsafe _char = d("Char");

        @JvmField
        @NotNull
        public static final FqNameUnsafe _byte = d("Byte");

        @JvmField
        @NotNull
        public static final FqNameUnsafe _short = d("Short");

        @JvmField
        @NotNull
        public static final FqNameUnsafe _int = d("Int");

        @JvmField
        @NotNull
        public static final FqNameUnsafe _long = d("Long");

        @JvmField
        @NotNull
        public static final FqNameUnsafe _float = d("Float");

        @JvmField
        @NotNull
        public static final FqNameUnsafe _double = d("Double");

        @JvmField
        @NotNull
        public static final FqNameUnsafe number = d("Number");

        @JvmField
        @NotNull
        public static final FqNameUnsafe _enum = d("Enum");

        @JvmField
        @NotNull
        public static final FqNameUnsafe functionSupertype = d("Function");

        @JvmField
        @NotNull
        public static final FqName throwable = c("Throwable");

        @JvmField
        @NotNull
        public static final FqName comparable = c("Comparable");

        static {
            FqName fqName = StandardNames.RANGES_PACKAGE_FQ_NAME;
            FqNameUnsafe unsafe = fqName.child(Name.identifier("IntRange")).toUnsafe();
            Intrinsics.checkNotNullExpressionValue(unsafe, "toUnsafe(...)");
            intRange = unsafe;
            FqNameUnsafe unsafe2 = fqName.child(Name.identifier("LongRange")).toUnsafe();
            Intrinsics.checkNotNullExpressionValue(unsafe2, "toUnsafe(...)");
            longRange = unsafe2;
            deprecated = c("Deprecated");
            deprecatedSinceKotlin = c("DeprecatedSinceKotlin");
            deprecationLevel = c("DeprecationLevel");
            replaceWith = c("ReplaceWith");
            extensionFunctionType = c("ExtensionFunctionType");
            contextFunctionTypeParams = c("ContextFunctionTypeParams");
            FqName fqNameC = c("ParameterName");
            parameterName = fqNameC;
            ClassId classId = ClassId.topLevel(fqNameC);
            Intrinsics.checkNotNullExpressionValue(classId, "topLevel(...)");
            parameterNameClassId = classId;
            annotation = c("Annotation");
            FqName fqNameA = a("Target");
            target = fqNameA;
            ClassId classId2 = ClassId.topLevel(fqNameA);
            Intrinsics.checkNotNullExpressionValue(classId2, "topLevel(...)");
            targetClassId = classId2;
            annotationTarget = a("AnnotationTarget");
            annotationRetention = a("AnnotationRetention");
            FqName fqNameA2 = a("Retention");
            retention = fqNameA2;
            ClassId classId3 = ClassId.topLevel(fqNameA2);
            Intrinsics.checkNotNullExpressionValue(classId3, "topLevel(...)");
            retentionClassId = classId3;
            FqName fqNameA3 = a("Repeatable");
            repeatable = fqNameA3;
            ClassId classId4 = ClassId.topLevel(fqNameA3);
            Intrinsics.checkNotNullExpressionValue(classId4, "topLevel(...)");
            repeatableClassId = classId4;
            mustBeDocumented = a("MustBeDocumented");
            unsafeVariance = c("UnsafeVariance");
            publishedApi = c("PublishedApi");
            FqName fqNameChild = StandardNames.KOTLIN_INTERNAL_FQ_NAME.child(Name.identifier("AccessibleLateinitPropertyLiteral"));
            Intrinsics.checkNotNullExpressionValue(fqNameChild, "child(...)");
            accessibleLateinitPropertyLiteral = fqNameChild;
            iterator = b("Iterator");
            iterable = b("Iterable");
            collection = b("Collection");
            list = b("List");
            listIterator = b("ListIterator");
            set = b("Set");
            FqName fqNameB = b("Map");
            map = fqNameB;
            FqName fqNameChild2 = fqNameB.child(Name.identifier("Entry"));
            Intrinsics.checkNotNullExpressionValue(fqNameChild2, "child(...)");
            mapEntry = fqNameChild2;
            mutableIterator = b("MutableIterator");
            mutableIterable = b("MutableIterable");
            mutableCollection = b("MutableCollection");
            mutableList = b("MutableList");
            mutableListIterator = b("MutableListIterator");
            mutableSet = b("MutableSet");
            FqName fqNameB2 = b("MutableMap");
            mutableMap = fqNameB2;
            FqName fqNameChild3 = fqNameB2.child(Name.identifier("MutableEntry"));
            Intrinsics.checkNotNullExpressionValue(fqNameChild3, "child(...)");
            mutableMapEntry = fqNameChild3;
            kClass = reflect("KClass");
            kType = reflect("KType");
            kCallable = reflect("KCallable");
            kProperty0 = reflect("KProperty0");
            kProperty1 = reflect("KProperty1");
            kProperty2 = reflect("KProperty2");
            kMutableProperty0 = reflect("KMutableProperty0");
            kMutableProperty1 = reflect("KMutableProperty1");
            kMutableProperty2 = reflect("KMutableProperty2");
            FqNameUnsafe fqNameUnsafeReflect = reflect("KProperty");
            kPropertyFqName = fqNameUnsafeReflect;
            kMutablePropertyFqName = reflect("KMutableProperty");
            ClassId classId5 = ClassId.topLevel(fqNameUnsafeReflect.toSafe());
            Intrinsics.checkNotNullExpressionValue(classId5, "topLevel(...)");
            kProperty = classId5;
            kDeclarationContainer = reflect("KDeclarationContainer");
            FqName fqNameC2 = c("UByte");
            uByteFqName = fqNameC2;
            FqName fqNameC3 = c("UShort");
            uShortFqName = fqNameC3;
            FqName fqNameC4 = c("UInt");
            uIntFqName = fqNameC4;
            FqName fqNameC5 = c("ULong");
            uLongFqName = fqNameC5;
            ClassId classId6 = ClassId.topLevel(fqNameC2);
            Intrinsics.checkNotNullExpressionValue(classId6, "topLevel(...)");
            uByte = classId6;
            ClassId classId7 = ClassId.topLevel(fqNameC3);
            Intrinsics.checkNotNullExpressionValue(classId7, "topLevel(...)");
            uShort = classId7;
            ClassId classId8 = ClassId.topLevel(fqNameC4);
            Intrinsics.checkNotNullExpressionValue(classId8, "topLevel(...)");
            uInt = classId8;
            ClassId classId9 = ClassId.topLevel(fqNameC5);
            Intrinsics.checkNotNullExpressionValue(classId9, "topLevel(...)");
            uLong = classId9;
            uByteArrayFqName = c("UByteArray");
            uShortArrayFqName = c("UShortArray");
            uIntArrayFqName = c("UIntArray");
            uLongArrayFqName = c("ULongArray");
            HashSet hashSetNewHashSetWithExpectedSize = CollectionsKt.newHashSetWithExpectedSize(PrimitiveType.values().length);
            for (PrimitiveType primitiveType : PrimitiveType.values()) {
                hashSetNewHashSetWithExpectedSize.add(primitiveType.getTypeName());
            }
            primitiveTypeShortNames = hashSetNewHashSetWithExpectedSize;
            HashSet hashSetNewHashSetWithExpectedSize2 = CollectionsKt.newHashSetWithExpectedSize(PrimitiveType.values().length);
            for (PrimitiveType primitiveType2 : PrimitiveType.values()) {
                hashSetNewHashSetWithExpectedSize2.add(primitiveType2.getArrayTypeName());
            }
            primitiveArrayTypeShortNames = hashSetNewHashSetWithExpectedSize2;
            HashMap mapNewHashMapWithExpectedSize = CollectionsKt.newHashMapWithExpectedSize(PrimitiveType.values().length);
            for (PrimitiveType primitiveType3 : PrimitiveType.values()) {
                FqNames fqNames = INSTANCE;
                String strAsString = primitiveType3.getTypeName().asString();
                Intrinsics.checkNotNullExpressionValue(strAsString, "asString(...)");
                fqNames.getClass();
                mapNewHashMapWithExpectedSize.put(d(strAsString), primitiveType3);
            }
            fqNameToPrimitiveType = mapNewHashMapWithExpectedSize;
            HashMap mapNewHashMapWithExpectedSize2 = CollectionsKt.newHashMapWithExpectedSize(PrimitiveType.values().length);
            for (PrimitiveType primitiveType4 : PrimitiveType.values()) {
                FqNames fqNames2 = INSTANCE;
                String strAsString2 = primitiveType4.getArrayTypeName().asString();
                Intrinsics.checkNotNullExpressionValue(strAsString2, "asString(...)");
                fqNames2.getClass();
                mapNewHashMapWithExpectedSize2.put(d(strAsString2), primitiveType4);
            }
            arrayClassFqNameToPrimitiveType = mapNewHashMapWithExpectedSize2;
        }

        public static FqName a(String str) {
            FqName fqNameChild = StandardNames.ANNOTATION_PACKAGE_FQ_NAME.child(Name.identifier(str));
            Intrinsics.checkNotNullExpressionValue(fqNameChild, "child(...)");
            return fqNameChild;
        }

        public static FqName b(String str) {
            FqName fqNameChild = StandardNames.COLLECTIONS_PACKAGE_FQ_NAME.child(Name.identifier(str));
            Intrinsics.checkNotNullExpressionValue(fqNameChild, "child(...)");
            return fqNameChild;
        }

        public static FqName c(String str) {
            FqName fqNameChild = StandardNames.BUILT_INS_PACKAGE_FQ_NAME.child(Name.identifier(str));
            Intrinsics.checkNotNullExpressionValue(fqNameChild, "child(...)");
            return fqNameChild;
        }

        public static FqNameUnsafe d(String str) {
            FqNameUnsafe unsafe = c(str).toUnsafe();
            Intrinsics.checkNotNullExpressionValue(unsafe, "toUnsafe(...)");
            return unsafe;
        }

        @JvmStatic
        @NotNull
        public static final FqNameUnsafe reflect(@NotNull String simpleName) {
            Intrinsics.checkNotNullParameter(simpleName, "simpleName");
            FqNameUnsafe unsafe = StandardNames.KOTLIN_REFLECT_FQ_NAME.child(Name.identifier(simpleName)).toUnsafe();
            Intrinsics.checkNotNullExpressionValue(unsafe, "toUnsafe(...)");
            return unsafe;
        }
    }

    static {
        Name nameIdentifier = Name.identifier("field");
        Intrinsics.checkNotNullExpressionValue(nameIdentifier, "identifier(...)");
        BACKING_FIELD = nameIdentifier;
        Name nameIdentifier2 = Name.identifier("value");
        Intrinsics.checkNotNullExpressionValue(nameIdentifier2, "identifier(...)");
        DEFAULT_VALUE_PARAMETER = nameIdentifier2;
        Name nameIdentifier3 = Name.identifier("values");
        Intrinsics.checkNotNullExpressionValue(nameIdentifier3, "identifier(...)");
        ENUM_VALUES = nameIdentifier3;
        Name nameIdentifier4 = Name.identifier("entries");
        Intrinsics.checkNotNullExpressionValue(nameIdentifier4, "identifier(...)");
        ENUM_ENTRIES = nameIdentifier4;
        Name nameIdentifier5 = Name.identifier(DeepLinkListenerAdapter.Constants.STATUS_VALUE_OF);
        Intrinsics.checkNotNullExpressionValue(nameIdentifier5, "identifier(...)");
        ENUM_VALUE_OF = nameIdentifier5;
        Name nameIdentifier6 = Name.identifier("copy");
        Intrinsics.checkNotNullExpressionValue(nameIdentifier6, "identifier(...)");
        DATA_CLASS_COPY = nameIdentifier6;
        DATA_CLASS_COMPONENT_PREFIX = "component";
        Name nameIdentifier7 = Name.identifier(GenerateActivationFormCommand.HASH_CODE);
        Intrinsics.checkNotNullExpressionValue(nameIdentifier7, "identifier(...)");
        HASHCODE_NAME = nameIdentifier7;
        Name nameIdentifier8 = Name.identifier("code");
        Intrinsics.checkNotNullExpressionValue(nameIdentifier8, "identifier(...)");
        CHAR_CODE = nameIdentifier8;
        Name nameIdentifier9 = Name.identifier("name");
        Intrinsics.checkNotNullExpressionValue(nameIdentifier9, "identifier(...)");
        NAME = nameIdentifier9;
        Name nameIdentifier10 = Name.identifier("main");
        Intrinsics.checkNotNullExpressionValue(nameIdentifier10, "identifier(...)");
        MAIN = nameIdentifier10;
        Name nameIdentifier11 = Name.identifier("nextChar");
        Intrinsics.checkNotNullExpressionValue(nameIdentifier11, "identifier(...)");
        NEXT_CHAR = nameIdentifier11;
        Name nameIdentifier12 = Name.identifier("it");
        Intrinsics.checkNotNullExpressionValue(nameIdentifier12, "identifier(...)");
        IMPLICIT_LAMBDA_PARAMETER_NAME = nameIdentifier12;
        Name nameIdentifier13 = Name.identifier("count");
        Intrinsics.checkNotNullExpressionValue(nameIdentifier13, "identifier(...)");
        CONTEXT_FUNCTION_TYPE_PARAMETER_COUNT_NAME = nameIdentifier13;
        DYNAMIC_FQ_NAME = new FqName("<dynamic>");
        FqName fqName = new FqName("kotlin.coroutines");
        COROUTINES_PACKAGE_FQ_NAME = fqName;
        COROUTINES_JVM_INTERNAL_PACKAGE_FQ_NAME = new FqName("kotlin.coroutines.jvm.internal");
        COROUTINES_INTRINSICS_PACKAGE_FQ_NAME = new FqName("kotlin.coroutines.intrinsics");
        FqName fqNameChild = fqName.child(Name.identifier("Continuation"));
        Intrinsics.checkNotNullExpressionValue(fqNameChild, "child(...)");
        CONTINUATION_INTERFACE_FQ_NAME = fqNameChild;
        RESULT_FQ_NAME = new FqName("kotlin.Result");
        FqName fqName2 = new FqName("kotlin.reflect");
        KOTLIN_REFLECT_FQ_NAME = fqName2;
        PREFIXES = CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{"KProperty", "KMutableProperty", "KFunction", "KSuspendFunction"});
        Name nameIdentifier14 = Name.identifier("kotlin");
        Intrinsics.checkNotNullExpressionValue(nameIdentifier14, "identifier(...)");
        BUILT_INS_PACKAGE_NAME = nameIdentifier14;
        FqName fqName3 = FqName.topLevel(nameIdentifier14);
        Intrinsics.checkNotNullExpressionValue(fqName3, "topLevel(...)");
        BUILT_INS_PACKAGE_FQ_NAME = fqName3;
        FqName fqNameChild2 = fqName3.child(Name.identifier("annotation"));
        Intrinsics.checkNotNullExpressionValue(fqNameChild2, "child(...)");
        ANNOTATION_PACKAGE_FQ_NAME = fqNameChild2;
        FqName fqNameChild3 = fqName3.child(Name.identifier("collections"));
        Intrinsics.checkNotNullExpressionValue(fqNameChild3, "child(...)");
        COLLECTIONS_PACKAGE_FQ_NAME = fqNameChild3;
        FqName fqNameChild4 = fqName3.child(Name.identifier("ranges"));
        Intrinsics.checkNotNullExpressionValue(fqNameChild4, "child(...)");
        RANGES_PACKAGE_FQ_NAME = fqNameChild4;
        FqName fqNameChild5 = fqName3.child(Name.identifier("text"));
        Intrinsics.checkNotNullExpressionValue(fqNameChild5, "child(...)");
        TEXT_PACKAGE_FQ_NAME = fqNameChild5;
        FqName fqNameChild6 = fqName3.child(Name.identifier("internal"));
        Intrinsics.checkNotNullExpressionValue(fqNameChild6, "child(...)");
        KOTLIN_INTERNAL_FQ_NAME = fqNameChild6;
        new FqName("error.NonExistentClass");
        BUILT_INS_PACKAGE_FQ_NAMES = w.setOf((Object[]) new FqName[]{fqName3, fqNameChild3, fqNameChild4, fqNameChild2, fqName2, fqNameChild6, fqName});
    }

    @JvmStatic
    @NotNull
    public static final ClassId getFunctionClassId(int i10) {
        return new ClassId(BUILT_INS_PACKAGE_FQ_NAME, Name.identifier(getFunctionName(i10)));
    }

    @JvmStatic
    @NotNull
    public static final String getFunctionName(int i10) {
        return g0.c("Function", i10);
    }

    @JvmStatic
    @NotNull
    public static final FqName getPrimitiveFqName(@NotNull PrimitiveType primitiveType) {
        Intrinsics.checkNotNullParameter(primitiveType, "primitiveType");
        FqName fqNameChild = BUILT_INS_PACKAGE_FQ_NAME.child(primitiveType.getTypeName());
        Intrinsics.checkNotNullExpressionValue(fqNameChild, "child(...)");
        return fqNameChild;
    }

    @JvmStatic
    @NotNull
    public static final String getSuspendFunctionName(int i10) {
        return FunctionTypeKind.SuspendFunction.INSTANCE.getClassNamePrefix() + i10;
    }

    @JvmStatic
    public static final boolean isPrimitiveArray(@NotNull FqNameUnsafe arrayFqName) {
        Intrinsics.checkNotNullParameter(arrayFqName, "arrayFqName");
        return FqNames.arrayClassFqNameToPrimitiveType.get(arrayFqName) != null;
    }
}
