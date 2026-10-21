package kotlin.reflect.jvm.internal.impl.load.java;

import androidx.camera.camera2.internal.n1;
import bk.p;
import bk.q;
import bk.w;
import bk.x;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.bbva.plugin.localstorage.command.RemoveCommand;
import com.bbva.securesharing.plugin.SecureSharingCommandFactory;
import com.dasnano.vdvideoselfiecapture.config.VDVideoSelfieConfiguration;
import com.mypinpad.tsdk.isolation.y2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.c;
import kotlin.reflect.jvm.internal.impl.load.kotlin.SignatureBuildingComponents;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: SpecialGenericSignatures.kt */
/* JADX INFO: loaded from: classes12.dex */
@SourceDebugExtension({"SMAP\nSpecialGenericSignatures.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SpecialGenericSignatures.kt\norg/jetbrains/kotlin/load/java/SpecialGenericSignatures\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 SignatureBuildingComponents.kt\norg/jetbrains/kotlin/load/kotlin/SignatureBuildingComponentsKt\n+ 4 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 5 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,155:1\n1549#2:156\n1620#2,3:157\n1549#2:160\n1620#2,3:161\n1549#2:164\n1620#2,3:165\n1238#2,4:171\n1549#2:175\n1620#2,3:176\n1549#2:179\n1620#2,3:180\n1238#2,4:186\n1549#2:193\n1620#2,3:194\n1549#2:197\n1620#2,3:198\n1208#2,2:201\n1238#2,4:203\n13#3:168\n13#3:183\n468#4:169\n414#4:170\n468#4:184\n414#4:185\n152#5,3:190\n*S KotlinDebug\n*F\n+ 1 SpecialGenericSignatures.kt\norg/jetbrains/kotlin/load/java/SpecialGenericSignatures\n*L\n57#1:156\n57#1:157,3\n59#1:160\n59#1:161,3\n60#1:164\n60#1:165,3\n98#1:171,4\n104#1:175\n104#1:176,3\n105#1:179\n105#1:180,3\n129#1:186,4\n137#1:193\n137#1:194,3\n141#1:197\n141#1:198,3\n142#1:201,2\n142#1:203,4\n63#1:168\n114#1:183\n98#1:169\n98#1:170\n129#1:184\n129#1:185\n133#1:190,3\n*E\n"})
public class SpecialGenericSignatures {

    @NotNull
    public static final Companion Companion = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final ArrayList f80550a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final ArrayList f80551b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final Map<Companion.NameAndSignature, TypeSafeBarrierDescription> f80552c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final LinkedHashMap f80553d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final Set<Name> f80554e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public static final Set<String> f80555f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public static final Companion.NameAndSignature f80556g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public static final Map<Companion.NameAndSignature, Name> f80557h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public static final LinkedHashMap f80558i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public static final ArrayList f80559j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public static final LinkedHashMap f80560k;

    /* JADX INFO: compiled from: SpecialGenericSignatures.kt */
    public static final class Companion {

        /* JADX INFO: compiled from: SpecialGenericSignatures.kt */
        public static final class NameAndSignature {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public final String f80561a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            @NotNull
            public final Name f80562b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            @NotNull
            public final String f80563c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            @NotNull
            public final String f80564d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            @NotNull
            public final String f80565e;

            public NameAndSignature(@NotNull String classInternalName, @NotNull Name name, @NotNull String parameters, @NotNull String returnType) {
                Intrinsics.checkNotNullParameter(classInternalName, "classInternalName");
                Intrinsics.checkNotNullParameter(name, "name");
                Intrinsics.checkNotNullParameter(parameters, "parameters");
                Intrinsics.checkNotNullParameter(returnType, "returnType");
                this.f80561a = classInternalName;
                this.f80562b = name;
                this.f80563c = parameters;
                this.f80564d = returnType;
                this.f80565e = SignatureBuildingComponents.INSTANCE.signature(classInternalName, name + RootService.OPEN_BRACKET + parameters + RootService.CLOSE_BRACKET + returnType);
            }

            public static /* synthetic */ NameAndSignature copy$default(NameAndSignature nameAndSignature, String str, Name name, String str2, String str3, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = nameAndSignature.f80561a;
                }
                if ((i10 & 2) != 0) {
                    name = nameAndSignature.f80562b;
                }
                if ((i10 & 4) != 0) {
                    str2 = nameAndSignature.f80563c;
                }
                if ((i10 & 8) != 0) {
                    str3 = nameAndSignature.f80564d;
                }
                return nameAndSignature.copy(str, name, str2, str3);
            }

            @NotNull
            public final NameAndSignature copy(@NotNull String classInternalName, @NotNull Name name, @NotNull String parameters, @NotNull String returnType) {
                Intrinsics.checkNotNullParameter(classInternalName, "classInternalName");
                Intrinsics.checkNotNullParameter(name, "name");
                Intrinsics.checkNotNullParameter(parameters, "parameters");
                Intrinsics.checkNotNullParameter(returnType, "returnType");
                return new NameAndSignature(classInternalName, name, parameters, returnType);
            }

            public boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof NameAndSignature)) {
                    return false;
                }
                NameAndSignature nameAndSignature = (NameAndSignature) obj;
                return Intrinsics.areEqual(this.f80561a, nameAndSignature.f80561a) && Intrinsics.areEqual(this.f80562b, nameAndSignature.f80562b) && Intrinsics.areEqual(this.f80563c, nameAndSignature.f80563c) && Intrinsics.areEqual(this.f80564d, nameAndSignature.f80564d);
            }

            @NotNull
            public final Name getName() {
                return this.f80562b;
            }

            @NotNull
            public final String getSignature() {
                return this.f80565e;
            }

            public int hashCode() {
                return this.f80564d.hashCode() + n1.c(this.f80563c, (this.f80562b.hashCode() + (this.f80561a.hashCode() * 31)) * 31, 31);
            }

            @NotNull
            public String toString() {
                StringBuilder sb2 = new StringBuilder("NameAndSignature(classInternalName=");
                sb2.append(this.f80561a);
                sb2.append(", name=");
                sb2.append(this.f80562b);
                sb2.append(", parameters=");
                sb2.append(this.f80563c);
                sb2.append(", returnType=");
                return y2.b(sb2, this.f80564d, RootService.CLOSE_BRACKET);
            }
        }

        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static final NameAndSignature access$method(Companion companion, String str, String str2, String str3, String str4) {
            companion.getClass();
            Name nameIdentifier = Name.identifier(str2);
            Intrinsics.checkNotNullExpressionValue(nameIdentifier, "identifier(...)");
            return new NameAndSignature(str, nameIdentifier, str3, str4);
        }

        @Nullable
        public final Name getBuiltinFunctionNamesByJvmName(@NotNull Name name) {
            Intrinsics.checkNotNullParameter(name, "name");
            return getJVM_SHORT_NAME_TO_BUILTIN_SHORT_NAMES_MAP().get(name);
        }

        @NotNull
        public final List<String> getERASED_COLLECTION_PARAMETER_SIGNATURES() {
            return SpecialGenericSignatures.f80551b;
        }

        @NotNull
        public final Set<Name> getERASED_VALUE_PARAMETERS_SHORT_NAMES() {
            return SpecialGenericSignatures.f80554e;
        }

        @NotNull
        public final Set<String> getERASED_VALUE_PARAMETERS_SIGNATURES() {
            return SpecialGenericSignatures.f80555f;
        }

        @NotNull
        public final Map<Name, Name> getJVM_SHORT_NAME_TO_BUILTIN_SHORT_NAMES_MAP() {
            return SpecialGenericSignatures.f80560k;
        }

        @NotNull
        public final List<Name> getORIGINAL_SHORT_NAMES() {
            return SpecialGenericSignatures.f80559j;
        }

        @NotNull
        public final NameAndSignature getREMOVE_AT_NAME_AND_SIGNATURE() {
            return SpecialGenericSignatures.f80556g;
        }

        @NotNull
        public final Map<String, TypeSafeBarrierDescription> getSIGNATURE_TO_DEFAULT_VALUES_MAP() {
            return SpecialGenericSignatures.f80553d;
        }

        @NotNull
        public final Map<String, Name> getSIGNATURE_TO_JVM_REPRESENTATION_NAME() {
            return SpecialGenericSignatures.f80558i;
        }

        public final boolean getSameAsRenamedInJvmBuiltin(@NotNull Name name) {
            Intrinsics.checkNotNullParameter(name, "<this>");
            return getORIGINAL_SHORT_NAMES().contains(name);
        }

        @NotNull
        public final SpecialSignatureInfo getSpecialSignatureInfo(@NotNull String builtinSignature) {
            Intrinsics.checkNotNullParameter(builtinSignature, "builtinSignature");
            if (getERASED_COLLECTION_PARAMETER_SIGNATURES().contains(builtinSignature)) {
                return SpecialSignatureInfo.ONE_COLLECTION_PARAMETER;
            }
            return ((TypeSafeBarrierDescription) q.getValue(getSIGNATURE_TO_DEFAULT_VALUES_MAP(), builtinSignature)) == TypeSafeBarrierDescription.NULL ? SpecialSignatureInfo.OBJECT_PARAMETER_GENERIC : SpecialSignatureInfo.OBJECT_PARAMETER_NON_GENERIC;
        }
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r4v3 kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures$SpecialSignatureInfo[], still in use, count: 1, list:
      (r4v3 kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures$SpecialSignatureInfo[]) from 0x002e: INVOKE (r4v3 kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures$SpecialSignatureInfo[]) STATIC call: kotlin.enums.EnumEntriesKt.enumEntries(java.lang.Enum[]):kotlin.enums.EnumEntries A[MD:<E extends java.lang.Enum<E>>:(E extends java.lang.Enum<E>[]):kotlin.enums.EnumEntries<E extends java.lang.Enum<E>> (m), WRAPPED] (LINE:47)
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
    /* JADX INFO: compiled from: SpecialGenericSignatures.kt */
    public static final class SpecialSignatureInfo {
        ONE_COLLECTION_PARAMETER("Ljava/util/Collection<+Ljava/lang/Object;>;", false),
        OBJECT_PARAMETER_NON_GENERIC(null, true),
        OBJECT_PARAMETER_GENERIC("Ljava/lang/Object;", true);

        private static final /* synthetic */ EnumEntries $ENTRIES;
        private final boolean isObjectReplacedWithTypeParameter;

        @Nullable
        private final String valueParametersSignature;

        static {
            $ENTRIES = EnumEntriesKt.enumEntries(specialSignatureInfoArr);
        }

        public SpecialSignatureInfo(String str, boolean z10) {
            super(str, i);
            this.valueParametersSignature = str;
            this.isObjectReplacedWithTypeParameter = z10;
        }

        public static SpecialSignatureInfo valueOf(String str) {
            return (SpecialSignatureInfo) Enum.valueOf(SpecialSignatureInfo.class, str);
        }

        public static SpecialSignatureInfo[] values() {
            return (SpecialSignatureInfo[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: SpecialGenericSignatures.kt */
    public static final class TypeSafeBarrierDescription {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ TypeSafeBarrierDescription[] $VALUES;
        public static final TypeSafeBarrierDescription FALSE;
        public static final TypeSafeBarrierDescription INDEX;
        public static final TypeSafeBarrierDescription MAP_GET_OR_DEFAULT;
        public static final TypeSafeBarrierDescription NULL;

        @Nullable
        private final Object defaultValue;

        /* JADX INFO: compiled from: SpecialGenericSignatures.kt */
        public static final class a extends TypeSafeBarrierDescription {
        }

        static {
            DefaultConstructorMarker defaultConstructorMarker = null;
            TypeSafeBarrierDescription typeSafeBarrierDescription = new TypeSafeBarrierDescription(VDVideoSelfieConfiguration.NULL, 0, null);
            NULL = typeSafeBarrierDescription;
            TypeSafeBarrierDescription typeSafeBarrierDescription2 = new TypeSafeBarrierDescription("INDEX", 1, -1);
            INDEX = typeSafeBarrierDescription2;
            TypeSafeBarrierDescription typeSafeBarrierDescription3 = new TypeSafeBarrierDescription("FALSE", 2, Boolean.FALSE);
            FALSE = typeSafeBarrierDescription3;
            a aVar = new a("MAP_GET_OR_DEFAULT", 3, defaultConstructorMarker, defaultConstructorMarker);
            MAP_GET_OR_DEFAULT = aVar;
            TypeSafeBarrierDescription[] typeSafeBarrierDescriptionArr = {typeSafeBarrierDescription, typeSafeBarrierDescription2, typeSafeBarrierDescription3, aVar};
            $VALUES = typeSafeBarrierDescriptionArr;
            $ENTRIES = EnumEntriesKt.enumEntries(typeSafeBarrierDescriptionArr);
        }

        public /* synthetic */ TypeSafeBarrierDescription(String str, int i10, Object obj, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i10, obj);
        }

        public static TypeSafeBarrierDescription valueOf(String str) {
            return (TypeSafeBarrierDescription) Enum.valueOf(TypeSafeBarrierDescription.class, str);
        }

        public static TypeSafeBarrierDescription[] values() {
            return (TypeSafeBarrierDescription[]) $VALUES.clone();
        }

        public TypeSafeBarrierDescription(String str, int i10, Object obj) {
            super(str, i10);
            this.defaultValue = obj;
        }
    }

    static {
        Set<String> of2 = w.setOf((Object[]) new String[]{"containsAll", "removeAll", "retainAll"});
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(of2, 10));
        for (String str : of2) {
            Companion companion = Companion;
            String desc = JvmPrimitiveType.BOOLEAN.getDesc();
            Intrinsics.checkNotNullExpressionValue(desc, "getDesc(...)");
            arrayList.add(Companion.access$method(companion, "java/util/Collection", str, "Ljava/util/Collection;", desc));
        }
        f80550a = arrayList;
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((Companion.NameAndSignature) it.next()).getSignature());
        }
        f80551b = arrayList2;
        ArrayList arrayList3 = f80550a;
        ArrayList arrayList4 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList3, 10));
        Iterator it2 = arrayList3.iterator();
        while (it2.hasNext()) {
            arrayList4.add(((Companion.NameAndSignature) it2.next()).getName().asString());
        }
        SignatureBuildingComponents signatureBuildingComponents = SignatureBuildingComponents.INSTANCE;
        Companion companion2 = Companion;
        String strJavaUtil = signatureBuildingComponents.javaUtil("Collection");
        JvmPrimitiveType jvmPrimitiveType = JvmPrimitiveType.BOOLEAN;
        String desc2 = jvmPrimitiveType.getDesc();
        Intrinsics.checkNotNullExpressionValue(desc2, "getDesc(...)");
        Companion.NameAndSignature nameAndSignatureAccess$method = Companion.access$method(companion2, strJavaUtil, SecureSharingCommandFactory.ACTION_CONTAINS_VALUE, "Ljava/lang/Object;", desc2);
        TypeSafeBarrierDescription typeSafeBarrierDescription = TypeSafeBarrierDescription.FALSE;
        String strJavaUtil2 = signatureBuildingComponents.javaUtil("Collection");
        String desc3 = jvmPrimitiveType.getDesc();
        Intrinsics.checkNotNullExpressionValue(desc3, "getDesc(...)");
        String strJavaUtil3 = signatureBuildingComponents.javaUtil("Map");
        String desc4 = jvmPrimitiveType.getDesc();
        Intrinsics.checkNotNullExpressionValue(desc4, "getDesc(...)");
        String strJavaUtil4 = signatureBuildingComponents.javaUtil("Map");
        String desc5 = jvmPrimitiveType.getDesc();
        Intrinsics.checkNotNullExpressionValue(desc5, "getDesc(...)");
        String strJavaUtil5 = signatureBuildingComponents.javaUtil("Map");
        String desc6 = jvmPrimitiveType.getDesc();
        Intrinsics.checkNotNullExpressionValue(desc6, "getDesc(...)");
        Companion.NameAndSignature nameAndSignatureAccess$method2 = Companion.access$method(companion2, signatureBuildingComponents.javaUtil("Map"), "get", "Ljava/lang/Object;", "Ljava/lang/Object;");
        TypeSafeBarrierDescription typeSafeBarrierDescription2 = TypeSafeBarrierDescription.NULL;
        String strJavaUtil6 = signatureBuildingComponents.javaUtil("List");
        JvmPrimitiveType jvmPrimitiveType2 = JvmPrimitiveType.INT;
        String desc7 = jvmPrimitiveType2.getDesc();
        Intrinsics.checkNotNullExpressionValue(desc7, "getDesc(...)");
        Companion.NameAndSignature nameAndSignatureAccess$method3 = Companion.access$method(companion2, strJavaUtil6, "indexOf", "Ljava/lang/Object;", desc7);
        TypeSafeBarrierDescription typeSafeBarrierDescription3 = TypeSafeBarrierDescription.INDEX;
        String strJavaUtil7 = signatureBuildingComponents.javaUtil("List");
        String desc8 = jvmPrimitiveType2.getDesc();
        Intrinsics.checkNotNullExpressionValue(desc8, "getDesc(...)");
        Map<Companion.NameAndSignature, TypeSafeBarrierDescription> mapMapOf = q.mapOf(TuplesKt.to(nameAndSignatureAccess$method, typeSafeBarrierDescription), TuplesKt.to(Companion.access$method(companion2, strJavaUtil2, RemoveCommand.ID, "Ljava/lang/Object;", desc3), typeSafeBarrierDescription), TuplesKt.to(Companion.access$method(companion2, strJavaUtil3, "containsKey", "Ljava/lang/Object;", desc4), typeSafeBarrierDescription), TuplesKt.to(Companion.access$method(companion2, strJavaUtil4, "containsValue", "Ljava/lang/Object;", desc5), typeSafeBarrierDescription), TuplesKt.to(Companion.access$method(companion2, strJavaUtil5, RemoveCommand.ID, "Ljava/lang/Object;Ljava/lang/Object;", desc6), typeSafeBarrierDescription), TuplesKt.to(Companion.access$method(companion2, signatureBuildingComponents.javaUtil("Map"), "getOrDefault", "Ljava/lang/Object;Ljava/lang/Object;", "Ljava/lang/Object;"), TypeSafeBarrierDescription.MAP_GET_OR_DEFAULT), TuplesKt.to(nameAndSignatureAccess$method2, typeSafeBarrierDescription2), TuplesKt.to(Companion.access$method(companion2, signatureBuildingComponents.javaUtil("Map"), RemoveCommand.ID, "Ljava/lang/Object;", "Ljava/lang/Object;"), typeSafeBarrierDescription2), TuplesKt.to(nameAndSignatureAccess$method3, typeSafeBarrierDescription3), TuplesKt.to(Companion.access$method(companion2, strJavaUtil7, "lastIndexOf", "Ljava/lang/Object;", desc8), typeSafeBarrierDescription3));
        f80552c = mapMapOf;
        LinkedHashMap linkedHashMap = new LinkedHashMap(p.mapCapacity(mapMapOf.size()));
        Iterator<T> it3 = mapMapOf.entrySet().iterator();
        while (it3.hasNext()) {
            Map.Entry entry = (Map.Entry) it3.next();
            linkedHashMap.put(((Companion.NameAndSignature) entry.getKey()).getSignature(), entry.getValue());
        }
        f80553d = linkedHashMap;
        Set setPlus = x.plus((Set) f80552c.keySet(), (Iterable) f80550a);
        ArrayList arrayList5 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(setPlus, 10));
        Iterator it4 = setPlus.iterator();
        while (it4.hasNext()) {
            arrayList5.add(((Companion.NameAndSignature) it4.next()).getName());
        }
        f80554e = CollectionsKt___CollectionsKt.toSet(arrayList5);
        ArrayList arrayList6 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(setPlus, 10));
        Iterator it5 = setPlus.iterator();
        while (it5.hasNext()) {
            arrayList6.add(((Companion.NameAndSignature) it5.next()).getSignature());
        }
        f80555f = CollectionsKt___CollectionsKt.toSet(arrayList6);
        Companion companion3 = Companion;
        JvmPrimitiveType jvmPrimitiveType3 = JvmPrimitiveType.INT;
        String desc9 = jvmPrimitiveType3.getDesc();
        Intrinsics.checkNotNullExpressionValue(desc9, "getDesc(...)");
        Companion.NameAndSignature nameAndSignatureAccess$method4 = Companion.access$method(companion3, "java/util/List", "removeAt", desc9, "Ljava/lang/Object;");
        f80556g = nameAndSignatureAccess$method4;
        SignatureBuildingComponents signatureBuildingComponents2 = SignatureBuildingComponents.INSTANCE;
        String strJavaLang = signatureBuildingComponents2.javaLang("Number");
        String desc10 = JvmPrimitiveType.BYTE.getDesc();
        Intrinsics.checkNotNullExpressionValue(desc10, "getDesc(...)");
        String strJavaLang2 = signatureBuildingComponents2.javaLang("Number");
        String desc11 = JvmPrimitiveType.SHORT.getDesc();
        Intrinsics.checkNotNullExpressionValue(desc11, "getDesc(...)");
        String strJavaLang3 = signatureBuildingComponents2.javaLang("Number");
        String desc12 = jvmPrimitiveType3.getDesc();
        Intrinsics.checkNotNullExpressionValue(desc12, "getDesc(...)");
        String strJavaLang4 = signatureBuildingComponents2.javaLang("Number");
        String desc13 = JvmPrimitiveType.LONG.getDesc();
        Intrinsics.checkNotNullExpressionValue(desc13, "getDesc(...)");
        String strJavaLang5 = signatureBuildingComponents2.javaLang("Number");
        String desc14 = JvmPrimitiveType.FLOAT.getDesc();
        Intrinsics.checkNotNullExpressionValue(desc14, "getDesc(...)");
        String strJavaLang6 = signatureBuildingComponents2.javaLang("Number");
        String desc15 = JvmPrimitiveType.DOUBLE.getDesc();
        Intrinsics.checkNotNullExpressionValue(desc15, "getDesc(...)");
        String strJavaLang7 = signatureBuildingComponents2.javaLang("CharSequence");
        String desc16 = jvmPrimitiveType3.getDesc();
        Intrinsics.checkNotNullExpressionValue(desc16, "getDesc(...)");
        String desc17 = JvmPrimitiveType.CHAR.getDesc();
        Intrinsics.checkNotNullExpressionValue(desc17, "getDesc(...)");
        Map<Companion.NameAndSignature, Name> mapMapOf2 = q.mapOf(TuplesKt.to(Companion.access$method(companion3, strJavaLang, "toByte", "", desc10), Name.identifier("byteValue")), TuplesKt.to(Companion.access$method(companion3, strJavaLang2, "toShort", "", desc11), Name.identifier("shortValue")), TuplesKt.to(Companion.access$method(companion3, strJavaLang3, "toInt", "", desc12), Name.identifier("intValue")), TuplesKt.to(Companion.access$method(companion3, strJavaLang4, "toLong", "", desc13), Name.identifier("longValue")), TuplesKt.to(Companion.access$method(companion3, strJavaLang5, "toFloat", "", desc14), Name.identifier("floatValue")), TuplesKt.to(Companion.access$method(companion3, strJavaLang6, "toDouble", "", desc15), Name.identifier("doubleValue")), TuplesKt.to(nameAndSignatureAccess$method4, Name.identifier(RemoveCommand.ID)), TuplesKt.to(Companion.access$method(companion3, strJavaLang7, "get", desc16, desc17), Name.identifier("charAt")));
        f80557h = mapMapOf2;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(p.mapCapacity(mapMapOf2.size()));
        Iterator<T> it6 = mapMapOf2.entrySet().iterator();
        while (it6.hasNext()) {
            Map.Entry entry2 = (Map.Entry) it6.next();
            linkedHashMap2.put(((Companion.NameAndSignature) entry2.getKey()).getSignature(), entry2.getValue());
        }
        f80558i = linkedHashMap2;
        Map<Companion.NameAndSignature, Name> map = f80557h;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Map.Entry<Companion.NameAndSignature, Name> entry3 : map.entrySet()) {
            linkedHashSet.add(Companion.NameAndSignature.copy$default(entry3.getKey(), null, entry3.getValue(), null, null, 13, null).getSignature());
        }
        Set<Companion.NameAndSignature> setKeySet = f80557h.keySet();
        ArrayList arrayList7 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(setKeySet, 10));
        Iterator<T> it7 = setKeySet.iterator();
        while (it7.hasNext()) {
            arrayList7.add(((Companion.NameAndSignature) it7.next()).getName());
        }
        f80559j = arrayList7;
        Set<Map.Entry<Companion.NameAndSignature, Name>> setEntrySet = f80557h.entrySet();
        ArrayList<Pair> arrayList8 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(setEntrySet, 10));
        Iterator<T> it8 = setEntrySet.iterator();
        while (it8.hasNext()) {
            Map.Entry entry4 = (Map.Entry) it8.next();
            arrayList8.add(new Pair(((Companion.NameAndSignature) entry4.getKey()).getName(), entry4.getValue()));
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(c.coerceAtLeast(p.mapCapacity(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList8, 10)), 16));
        for (Pair pair : arrayList8) {
            linkedHashMap3.put((Name) pair.getSecond(), (Name) pair.getFirst());
        }
        f80560k = linkedHashMap3;
    }
}
