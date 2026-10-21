package kotlin.reflect.jvm.internal.impl.descriptors.annotations;

import bk.d;
import bk.q;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.TuplesKt;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.simpleframework.xml.strategy.Name;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r4v34 kotlin.reflect.jvm.internal.impl.descriptors.annotations.KotlinTarget[], still in use, count: 1, list:
  (r4v34 kotlin.reflect.jvm.internal.impl.descriptors.annotations.KotlinTarget[]) from 0x030f: INVOKE (r4v34 kotlin.reflect.jvm.internal.impl.descriptors.annotations.KotlinTarget[]) STATIC call: kotlin.enums.EnumEntriesKt.enumEntries(java.lang.Enum[]):kotlin.enums.EnumEntries A[MD:<E extends java.lang.Enum<E>>:(E extends java.lang.Enum<E>[]):kotlin.enums.EnumEntries<E extends java.lang.Enum<E>> (m), WRAPPED] (LINE:784)
	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:257)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:187)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: compiled from: KotlinTarget.kt */
/* JADX INFO: loaded from: classes12.dex */
@SourceDebugExtension({"SMAP\nKotlinTarget.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KotlinTarget.kt\norg/jetbrains/kotlin/descriptors/annotations/KotlinTarget\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,140:1\n3792#2:141\n4307#2,2:142\n*S KotlinDebug\n*F\n+ 1 KotlinTarget.kt\norg/jetbrains/kotlin/descriptors/annotations/KotlinTarget\n*L\n81#1:141\n81#1:142,2\n*E\n"})
public final class KotlinTarget {
    CLASS(Name.LABEL, true),
    ANNOTATION_CLASS("annotation class", true),
    TYPE_PARAMETER("type parameter", false),
    PROPERTY("property", true),
    FIELD("field", true),
    LOCAL_VARIABLE("local variable", true),
    VALUE_PARAMETER("value parameter", true),
    CONSTRUCTOR("constructor", true),
    FUNCTION("function", true),
    PROPERTY_GETTER("getter", true),
    PROPERTY_SETTER("setter", true),
    TYPE("type usage", false),
    EXPRESSION("expression", false),
    FILE("file", false),
    TYPEALIAS("typealias", false),
    TYPE_PROJECTION("type projection", false),
    STAR_PROJECTION("star projection", false),
    PROPERTY_PARAMETER("property constructor parameter", false),
    CLASS_ONLY(Name.LABEL, false),
    OBJECT("object", false),
    STANDALONE_OBJECT("standalone object", false),
    COMPANION_OBJECT("companion object", false),
    INTERFACE("interface", false),
    ENUM_CLASS("enum class", false),
    ENUM_ENTRY("enum entry", false),
    LOCAL_CLASS("local class", false),
    LOCAL_FUNCTION("local function", false),
    MEMBER_FUNCTION("member function", false),
    TOP_LEVEL_FUNCTION("top level function", false),
    MEMBER_PROPERTY("member property", false),
    MEMBER_PROPERTY_WITH_BACKING_FIELD("member property with backing field", false),
    MEMBER_PROPERTY_WITH_DELEGATE("member property with delegate", false),
    MEMBER_PROPERTY_WITHOUT_FIELD_OR_DELEGATE("member property without backing field or delegate", false),
    TOP_LEVEL_PROPERTY("top level property", false),
    TOP_LEVEL_PROPERTY_WITH_BACKING_FIELD("top level property with backing field", false),
    TOP_LEVEL_PROPERTY_WITH_DELEGATE("top level property with delegate", false),
    TOP_LEVEL_PROPERTY_WITHOUT_FIELD_OR_DELEGATE("top level property without backing field or delegate", false),
    BACKING_FIELD("backing field", true),
    INITIALIZER("initializer", false),
    DESTRUCTURING_DECLARATION("destructuring declaration", false),
    LAMBDA_EXPRESSION("lambda expression", false),
    ANONYMOUS_FUNCTION("anonymous function", false),
    OBJECT_LITERAL("object literal", false);

    private static final /* synthetic */ EnumEntries $ENTRIES;

    @NotNull
    private static final Set<KotlinTarget> ALL_TARGET_SET;

    @NotNull
    private static final List<KotlinTarget> ANNOTATION_CLASS_LIST;

    @NotNull
    private static final List<KotlinTarget> CLASS_LIST;

    @NotNull
    private static final List<KotlinTarget> COMPANION_OBJECT_LIST;

    @NotNull
    private static final Set<KotlinTarget> DEFAULT_TARGET_SET;

    @NotNull
    private static final List<KotlinTarget> ENUM_ENTRY_LIST;

    @NotNull
    private static final List<KotlinTarget> ENUM_LIST;

    @NotNull
    private static final List<KotlinTarget> FILE_LIST;

    @NotNull
    private static final List<KotlinTarget> FUNCTION_LIST;

    @NotNull
    private static final List<KotlinTarget> INTERFACE_LIST;

    @NotNull
    private static final List<KotlinTarget> LOCAL_CLASS_LIST;

    @NotNull
    private static final List<KotlinTarget> OBJECT_LIST;

    @NotNull
    private static final List<KotlinTarget> PROPERTY_GETTER_LIST;

    @NotNull
    private static final List<KotlinTarget> PROPERTY_SETTER_LIST;

    @NotNull
    private static final Map<AnnotationUseSiteTarget, KotlinTarget> USE_SITE_MAPPING;

    @NotNull
    private final String description;
    private final boolean isDefault;

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    private static final HashMap<String, KotlinTarget> map = new HashMap<>();

    /* JADX INFO: compiled from: KotlinTarget.kt */
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        $ENTRIES = EnumEntriesKt.enumEntries(new KotlinTarget[]{r0, r1, r5, r6, r7, r10, r12, r13, r11, r9, r8, r2, r4, r2, r4, r2, r4, r2, r4, r3, r4, r3, r4, r3, r4, r3, r4, r3, r4, r3, r4, r3, r4, r3, r4, r3, r4, r3, r4, r8, r14, r4, r8});
        for (KotlinTarget kotlinTarget : values()) {
            map.put(kotlinTarget.name(), kotlinTarget);
        }
        KotlinTarget[] kotlinTargetArrValues = values();
        ArrayList arrayList = new ArrayList();
        for (KotlinTarget kotlinTarget2 : kotlinTargetArrValues) {
            if (kotlinTarget2.isDefault) {
                arrayList.add(kotlinTarget2);
            }
        }
        DEFAULT_TARGET_SET = CollectionsKt___CollectionsKt.toSet(arrayList);
        ALL_TARGET_SET = ArraysKt___ArraysKt.toSet(values());
        KotlinTarget kotlinTarget3 = CLASS;
        ANNOTATION_CLASS_LIST = CollectionsKt__CollectionsKt.listOf((Object[]) new KotlinTarget[]{ANNOTATION_CLASS, kotlinTarget3});
        LOCAL_CLASS_LIST = CollectionsKt__CollectionsKt.listOf((Object[]) new KotlinTarget[]{LOCAL_CLASS, kotlinTarget3});
        CLASS_LIST = CollectionsKt__CollectionsKt.listOf((Object[]) new KotlinTarget[]{CLASS_ONLY, kotlinTarget3});
        KotlinTarget kotlinTarget4 = OBJECT;
        COMPANION_OBJECT_LIST = CollectionsKt__CollectionsKt.listOf((Object[]) new KotlinTarget[]{COMPANION_OBJECT, kotlinTarget4, kotlinTarget3});
        OBJECT_LIST = CollectionsKt__CollectionsKt.listOf((Object[]) new KotlinTarget[]{STANDALONE_OBJECT, kotlinTarget4, kotlinTarget3});
        INTERFACE_LIST = CollectionsKt__CollectionsKt.listOf((Object[]) new KotlinTarget[]{INTERFACE, kotlinTarget3});
        ENUM_LIST = CollectionsKt__CollectionsKt.listOf((Object[]) new KotlinTarget[]{ENUM_CLASS, kotlinTarget3});
        KotlinTarget kotlinTarget5 = PROPERTY;
        KotlinTarget kotlinTarget6 = FIELD;
        ENUM_ENTRY_LIST = CollectionsKt__CollectionsKt.listOf((Object[]) new KotlinTarget[]{ENUM_ENTRY, kotlinTarget5, kotlinTarget6});
        KotlinTarget kotlinTarget7 = PROPERTY_SETTER;
        PROPERTY_SETTER_LIST = d.listOf(kotlinTarget7);
        KotlinTarget kotlinTarget8 = PROPERTY_GETTER;
        PROPERTY_GETTER_LIST = d.listOf(kotlinTarget8);
        FUNCTION_LIST = d.listOf(FUNCTION);
        KotlinTarget kotlinTarget9 = FILE;
        FILE_LIST = d.listOf(kotlinTarget9);
        AnnotationUseSiteTarget annotationUseSiteTarget = AnnotationUseSiteTarget.CONSTRUCTOR_PARAMETER;
        KotlinTarget kotlinTarget10 = VALUE_PARAMETER;
        USE_SITE_MAPPING = q.mapOf(TuplesKt.to(annotationUseSiteTarget, kotlinTarget10), TuplesKt.to(AnnotationUseSiteTarget.FIELD, kotlinTarget6), TuplesKt.to(AnnotationUseSiteTarget.PROPERTY, kotlinTarget5), TuplesKt.to(AnnotationUseSiteTarget.FILE, kotlinTarget9), TuplesKt.to(AnnotationUseSiteTarget.PROPERTY_GETTER, kotlinTarget8), TuplesKt.to(AnnotationUseSiteTarget.PROPERTY_SETTER, kotlinTarget7), TuplesKt.to(AnnotationUseSiteTarget.RECEIVER, kotlinTarget10), TuplesKt.to(AnnotationUseSiteTarget.SETTER_PARAMETER, kotlinTarget10), TuplesKt.to(AnnotationUseSiteTarget.PROPERTY_DELEGATE_FIELD, kotlinTarget6));
    }

    public KotlinTarget(String str, boolean z10) {
        super(str, i);
        this.description = str;
        this.isDefault = z10;
    }

    public static KotlinTarget valueOf(String str) {
        return (KotlinTarget) Enum.valueOf(KotlinTarget.class, str);
    }

    public static KotlinTarget[] values() {
        return (KotlinTarget[]) $VALUES.clone();
    }
}
