package com.fasterxml.jackson.databind.introspect;

import com.bbva.plugin.localstorage.command.SetCommand;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.PropertyMetadata;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.cfg.ConfigOverride;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.util.ClassUtil;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;
import mx.openpay.library.domain.util.Constant;

/* JADX INFO: loaded from: classes9.dex */
public class POJOPropertyBuilder extends BeanPropertyDefinition implements Comparable<POJOPropertyBuilder> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final AnnotationIntrospector.ReferenceProperty f43355p0 = AnnotationIntrospector.ReferenceProperty.managed("");
    protected final AnnotationIntrospector _annotationIntrospector;
    protected final MapperConfig<?> _config;
    protected Linked<AnnotatedParameter> _ctorParameters;
    protected Linked<AnnotatedField> _fields;
    protected final boolean _forSerialization;
    protected Linked<AnnotatedMethod> _getters;
    protected final PropertyName _internalName;
    protected transient PropertyMetadata _metadata;
    protected final PropertyName _name;
    protected transient AnnotationIntrospector.ReferenceProperty _referenceInfo;
    protected Linked<AnnotatedMethod> _setters;

    public static final class Linked<T> {
        public final boolean isMarkedIgnored;
        public final boolean isNameExplicit;
        public final boolean isVisible;
        public final PropertyName name;
        public final Linked<T> next;
        public final T value;

        public Linked(T t10, Linked<T> linked, PropertyName propertyName, boolean z10, boolean z11, boolean z12) {
            this.value = t10;
            this.next = linked;
            PropertyName propertyName2 = (propertyName == null || propertyName.isEmpty()) ? null : propertyName;
            this.name = propertyName2;
            if (z10) {
                if (propertyName2 == null) {
                    throw new IllegalArgumentException("Cannot pass true for 'explName' if name is null/empty");
                }
                if (!propertyName.hasSimpleName()) {
                    z10 = false;
                }
            }
            this.isNameExplicit = z10;
            this.isVisible = z11;
            this.isMarkedIgnored = z12;
        }

        public Linked<T> append(Linked<T> linked) {
            Linked<T> linked2 = this.next;
            return linked2 == null ? withNext(linked) : withNext(linked2.append(linked));
        }

        public String toString() {
            String str = String.format("%s[visible=%b,ignore=%b,explicitName=%b]", this.value.toString(), Boolean.valueOf(this.isVisible), Boolean.valueOf(this.isMarkedIgnored), Boolean.valueOf(this.isNameExplicit));
            if (this.next == null) {
                return str;
            }
            StringBuilder sbE = androidx.camera.core.processing.f.e(str, ", ");
            sbE.append(this.next.toString());
            return sbE.toString();
        }

        public Linked<T> trimByVisibility() {
            Linked<T> linked = this.next;
            if (linked == null) {
                return this;
            }
            Linked<T> linkedTrimByVisibility = linked.trimByVisibility();
            if (this.name != null) {
                return linkedTrimByVisibility.name == null ? withNext(null) : withNext(linkedTrimByVisibility);
            }
            if (linkedTrimByVisibility.name != null) {
                return linkedTrimByVisibility;
            }
            boolean z10 = this.isVisible;
            if (z10 == linkedTrimByVisibility.isVisible) {
                return withNext(linkedTrimByVisibility);
            }
            return z10 ? withNext(null) : linkedTrimByVisibility;
        }

        public Linked<T> withNext(Linked<T> linked) {
            return linked == this.next ? this : new Linked<>(this.value, linked, this.name, this.isNameExplicit, this.isVisible, this.isMarkedIgnored);
        }

        public Linked<T> withValue(T t10) {
            return t10 == this.value ? this : new Linked<>(t10, this.next, this.name, this.isNameExplicit, this.isVisible, this.isMarkedIgnored);
        }

        public Linked<T> withoutIgnored() {
            Linked<T> linkedWithoutIgnored;
            if (!this.isMarkedIgnored) {
                Linked<T> linked = this.next;
                return (linked == null || (linkedWithoutIgnored = linked.withoutIgnored()) == this.next) ? this : withNext(linkedWithoutIgnored);
            }
            Linked<T> linked2 = this.next;
            if (linked2 == null) {
                return null;
            }
            return linked2.withoutIgnored();
        }

        public Linked<T> withoutNext() {
            return this.next == null ? this : new Linked<>(this.value, null, this.name, this.isNameExplicit, this.isVisible, this.isMarkedIgnored);
        }

        public Linked<T> withoutNonVisible() {
            Linked<T> linked = this.next;
            Linked<T> linkedWithoutNonVisible = linked == null ? null : linked.withoutNonVisible();
            return this.isVisible ? withNext(linkedWithoutNonVisible) : linkedWithoutNonVisible;
        }
    }

    public static class MemberIterator<T extends AnnotatedMember> implements Iterator<T> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public Linked<T> f43356p0;

        public MemberIterator(Linked<T> linked) {
            this.f43356p0 = linked;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f43356p0 != null;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Iterator
        public T next() {
            Linked<T> linked = this.f43356p0;
            if (linked == null) {
                throw new NoSuchElementException();
            }
            T t10 = linked.value;
            this.f43356p0 = linked.next;
            return t10;
        }
    }

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f43357a;

        static {
            int[] iArr = new int[JsonProperty.Access.values().length];
            f43357a = iArr;
            try {
                iArr[JsonProperty.Access.READ_ONLY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f43357a[JsonProperty.Access.READ_WRITE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f43357a[JsonProperty.Access.WRITE_ONLY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f43357a[JsonProperty.Access.AUTO.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public class b implements k<Class<?>[]> {
        public b() {
        }

        @Override // com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder.k
        public final Class<?>[] withMember(AnnotatedMember annotatedMember) {
            return POJOPropertyBuilder.this._annotationIntrospector.findViews(annotatedMember);
        }
    }

    public class c implements k<AnnotationIntrospector.ReferenceProperty> {
        public c() {
        }

        @Override // com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder.k
        public final AnnotationIntrospector.ReferenceProperty withMember(AnnotatedMember annotatedMember) {
            return POJOPropertyBuilder.this._annotationIntrospector.findReferenceType(annotatedMember);
        }
    }

    public class d implements k<Boolean> {
        public d() {
        }

        @Override // com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder.k
        public final Boolean withMember(AnnotatedMember annotatedMember) {
            return POJOPropertyBuilder.this._annotationIntrospector.isTypeId(annotatedMember);
        }
    }

    public class e implements k<Boolean> {
        public e() {
        }

        @Override // com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder.k
        public final Boolean withMember(AnnotatedMember annotatedMember) {
            return POJOPropertyBuilder.this._annotationIntrospector.hasRequiredMarker(annotatedMember);
        }
    }

    public class f implements k<String> {
        public f() {
        }

        @Override // com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder.k
        public final String withMember(AnnotatedMember annotatedMember) {
            return POJOPropertyBuilder.this._annotationIntrospector.findPropertyDescription(annotatedMember);
        }
    }

    public class g implements k<Integer> {
        public g() {
        }

        @Override // com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder.k
        public final Integer withMember(AnnotatedMember annotatedMember) {
            return POJOPropertyBuilder.this._annotationIntrospector.findPropertyIndex(annotatedMember);
        }
    }

    public class h implements k<String> {
        public h() {
        }

        @Override // com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder.k
        public final String withMember(AnnotatedMember annotatedMember) {
            return POJOPropertyBuilder.this._annotationIntrospector.findPropertyDefaultValue(annotatedMember);
        }
    }

    public class i implements k<ObjectIdInfo> {
        public i() {
        }

        @Override // com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder.k
        public final ObjectIdInfo withMember(AnnotatedMember annotatedMember) {
            POJOPropertyBuilder pOJOPropertyBuilder = POJOPropertyBuilder.this;
            ObjectIdInfo objectIdInfoFindObjectIdInfo = pOJOPropertyBuilder._annotationIntrospector.findObjectIdInfo(annotatedMember);
            return objectIdInfoFindObjectIdInfo != null ? pOJOPropertyBuilder._annotationIntrospector.findObjectReferenceInfo(annotatedMember, objectIdInfoFindObjectIdInfo) : objectIdInfoFindObjectIdInfo;
        }
    }

    public class j implements k<JsonProperty.Access> {
        public j() {
        }

        @Override // com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder.k
        public final JsonProperty.Access withMember(AnnotatedMember annotatedMember) {
            return POJOPropertyBuilder.this._annotationIntrospector.findPropertyAccess(annotatedMember);
        }
    }

    public interface k<T> {
        T withMember(AnnotatedMember annotatedMember);
    }

    public POJOPropertyBuilder(MapperConfig<?> mapperConfig, AnnotationIntrospector annotationIntrospector, boolean z10, PropertyName propertyName) {
        this(mapperConfig, annotationIntrospector, z10, propertyName, propertyName);
    }

    public static boolean a(Linked linked) {
        while (linked != null) {
            if (linked.name != null && linked.isNameExplicit) {
                return true;
            }
            linked = linked.next;
        }
        return false;
    }

    public static boolean b(Linked linked) {
        while (linked != null) {
            PropertyName propertyName = linked.name;
            if (propertyName != null && propertyName.hasSimpleName()) {
                return true;
            }
            linked = linked.next;
        }
        return false;
    }

    public static boolean c(Linked linked) {
        while (linked != null) {
            if (linked.isMarkedIgnored) {
                return true;
            }
            linked = linked.next;
        }
        return false;
    }

    public static boolean d(Linked linked) {
        while (linked != null) {
            if (linked.isVisible) {
                return true;
            }
            linked = linked.next;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Linked e(Linked linked, AnnotationMap annotationMap) {
        AnnotatedMember annotatedMember = (AnnotatedMember) ((AnnotatedMember) linked.value).withAnnotations(annotationMap);
        Linked<T> linked2 = linked.next;
        if (linked2 != 0) {
            linked = linked.withNext(e(linked2, annotationMap));
        }
        return linked.withValue(annotatedMember);
    }

    public static Set g(Linked linked, Set set) {
        while (linked != null) {
            if (linked.isNameExplicit && linked.name != null) {
                if (set == null) {
                    set = new HashSet();
                }
                set.add(linked.name);
            }
            linked = linked.next;
        }
        return set;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static AnnotationMap h(Linked linked) {
        AnnotationMap allAnnotations = ((AnnotatedMember) linked.value).getAllAnnotations();
        Linked<T> linked2 = linked.next;
        return linked2 != 0 ? AnnotationMap.merge(allAnnotations, h(linked2)) : allAnnotations;
    }

    public static AnnotationMap i(int i10, Linked... linkedArr) {
        AnnotationMap annotationMapH = h(linkedArr[i10]);
        do {
            i10++;
            if (i10 >= linkedArr.length) {
                return annotationMapH;
            }
        } while (linkedArr[i10] == null);
        return AnnotationMap.merge(annotationMapH, i(i10, linkedArr));
    }

    public String _findDefaultValue() {
        return (String) fromMemberAnnotations(new h());
    }

    public String _findDescription() {
        return (String) fromMemberAnnotations(new f());
    }

    public Integer _findIndex() {
        return (Integer) fromMemberAnnotations(new g());
    }

    public Boolean _findRequired() {
        return (Boolean) fromMemberAnnotations(new e());
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0039 A[PHI: r2 r8
      0x0039: PHI (r2v5 boolean) = (r2v0 boolean), (r2v10 boolean) binds: [B:5:0x000f, B:14:0x002e] A[DONT_GENERATE, DONT_INLINE]
      0x0039: PHI (r8v5 com.fasterxml.jackson.databind.PropertyMetadata) = (r8v0 com.fasterxml.jackson.databind.PropertyMetadata), (r8v9 com.fasterxml.jackson.databind.PropertyMetadata) binds: [B:5:0x000f, B:14:0x002e] A[DONT_GENERATE, DONT_INLINE]] */
    public PropertyMetadata _getSetterInfo(PropertyMetadata propertyMetadata) {
        Nulls nullsNonDefaultContentNulls;
        Boolean mergeable;
        Boolean boolFindMergeInfo;
        AnnotatedMember primaryMember = getPrimaryMember();
        AnnotatedMember accessor = getAccessor();
        boolean z10 = true;
        Nulls nullsNonDefaultValueNulls = null;
        if (primaryMember != null) {
            AnnotationIntrospector annotationIntrospector = this._annotationIntrospector;
            if (annotationIntrospector == null) {
                nullsNonDefaultContentNulls = null;
            } else {
                if (accessor != null && (boolFindMergeInfo = annotationIntrospector.findMergeInfo(primaryMember)) != null) {
                    if (boolFindMergeInfo.booleanValue()) {
                        propertyMetadata = propertyMetadata.withMergeInfo(PropertyMetadata.MergeInfo.createForPropertyOverride(accessor));
                    }
                    z10 = false;
                }
                JsonSetter.Value valueFindSetterInfo = this._annotationIntrospector.findSetterInfo(primaryMember);
                if (valueFindSetterInfo != null) {
                    nullsNonDefaultValueNulls = valueFindSetterInfo.nonDefaultValueNulls();
                    nullsNonDefaultContentNulls = valueFindSetterInfo.nonDefaultContentNulls();
                } else {
                    nullsNonDefaultContentNulls = null;
                }
            }
            if (z10 || nullsNonDefaultValueNulls == null || nullsNonDefaultContentNulls == null) {
                ConfigOverride configOverride = this._config.getConfigOverride(getRawPrimaryType());
                JsonSetter.Value setterInfo = configOverride.getSetterInfo();
                if (setterInfo != null) {
                    if (nullsNonDefaultValueNulls == null) {
                        nullsNonDefaultValueNulls = setterInfo.nonDefaultValueNulls();
                    }
                    if (nullsNonDefaultContentNulls == null) {
                        nullsNonDefaultContentNulls = setterInfo.nonDefaultContentNulls();
                    }
                }
                if (z10 && accessor != null && (mergeable = configOverride.getMergeable()) != null) {
                    if (mergeable.booleanValue()) {
                        propertyMetadata = propertyMetadata.withMergeInfo(PropertyMetadata.MergeInfo.createForTypeOverride(accessor));
                    }
                    z10 = false;
                }
            }
        } else {
            nullsNonDefaultContentNulls = null;
        }
        if (z10 || nullsNonDefaultValueNulls == null || nullsNonDefaultContentNulls == null) {
            JsonSetter.Value defaultSetterInfo = this._config.getDefaultSetterInfo();
            if (nullsNonDefaultValueNulls == null) {
                nullsNonDefaultValueNulls = defaultSetterInfo.nonDefaultValueNulls();
            }
            if (nullsNonDefaultContentNulls == null) {
                nullsNonDefaultContentNulls = defaultSetterInfo.nonDefaultContentNulls();
            }
            if (z10) {
                if (Boolean.TRUE.equals(this._config.getDefaultMergeable()) && accessor != null) {
                    propertyMetadata = propertyMetadata.withMergeInfo(PropertyMetadata.MergeInfo.createForDefaults(accessor));
                }
            }
        }
        return (nullsNonDefaultValueNulls == null && nullsNonDefaultContentNulls == null) ? propertyMetadata : propertyMetadata.withNulls(nullsNonDefaultValueNulls, nullsNonDefaultContentNulls);
    }

    public int _getterPriority(AnnotatedMethod annotatedMethod) {
        String name = annotatedMethod.getName();
        if (!name.startsWith("get") || name.length() <= 3) {
            return (!name.startsWith("is") || name.length() <= 2) ? 3 : 2;
        }
        return 1;
    }

    public int _setterPriority(AnnotatedMethod annotatedMethod) {
        String name = annotatedMethod.getName();
        return (!name.startsWith(SetCommand.ID) || name.length() <= 3) ? 2 : 1;
    }

    public void addAll(POJOPropertyBuilder pOJOPropertyBuilder) {
        Linked<AnnotatedField> linkedAppend = this._fields;
        Linked<AnnotatedField> linked = pOJOPropertyBuilder._fields;
        if (linkedAppend == null) {
            linkedAppend = linked;
        } else if (linked != null) {
            linkedAppend = linkedAppend.append(linked);
        }
        this._fields = linkedAppend;
        Linked<AnnotatedParameter> linkedAppend2 = this._ctorParameters;
        Linked<AnnotatedParameter> linked2 = pOJOPropertyBuilder._ctorParameters;
        if (linkedAppend2 == null) {
            linkedAppend2 = linked2;
        } else if (linked2 != null) {
            linkedAppend2 = linkedAppend2.append(linked2);
        }
        this._ctorParameters = linkedAppend2;
        Linked<AnnotatedMethod> linkedAppend3 = this._getters;
        Linked<AnnotatedMethod> linked3 = pOJOPropertyBuilder._getters;
        if (linkedAppend3 == null) {
            linkedAppend3 = linked3;
        } else if (linked3 != null) {
            linkedAppend3 = linkedAppend3.append(linked3);
        }
        this._getters = linkedAppend3;
        Linked<AnnotatedMethod> linkedAppend4 = this._setters;
        Linked<AnnotatedMethod> linked4 = pOJOPropertyBuilder._setters;
        if (linkedAppend4 == null) {
            linkedAppend4 = linked4;
        } else if (linked4 != null) {
            linkedAppend4 = linkedAppend4.append(linked4);
        }
        this._setters = linkedAppend4;
    }

    public void addCtor(AnnotatedParameter annotatedParameter, PropertyName propertyName, boolean z10, boolean z11, boolean z12) {
        this._ctorParameters = new Linked<>(annotatedParameter, this._ctorParameters, propertyName, z10, z11, z12);
    }

    public void addField(AnnotatedField annotatedField, PropertyName propertyName, boolean z10, boolean z11, boolean z12) {
        this._fields = new Linked<>(annotatedField, this._fields, propertyName, z10, z11, z12);
    }

    public void addGetter(AnnotatedMethod annotatedMethod, PropertyName propertyName, boolean z10, boolean z11, boolean z12) {
        this._getters = new Linked<>(annotatedMethod, this._getters, propertyName, z10, z11, z12);
    }

    public void addSetter(AnnotatedMethod annotatedMethod, PropertyName propertyName, boolean z10, boolean z11, boolean z12) {
        this._setters = new Linked<>(annotatedMethod, this._setters, propertyName, z10, z11, z12);
    }

    public boolean anyIgnorals() {
        return c(this._fields) || c(this._getters) || c(this._setters) || c(this._ctorParameters);
    }

    public boolean anyVisible() {
        return d(this._fields) || d(this._getters) || d(this._setters) || d(this._ctorParameters);
    }

    @Override // com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition
    public boolean couldDeserialize() {
        return (this._ctorParameters == null && this._setters == null && this._fields == null) ? false : true;
    }

    @Override // com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition
    public boolean couldSerialize() {
        return (this._getters == null && this._fields == null) ? false : true;
    }

    public Collection<POJOPropertyBuilder> explode(Collection<PropertyName> collection) {
        HashMap map = new HashMap();
        f(collection, map, this._fields);
        f(collection, map, this._getters);
        f(collection, map, this._setters);
        f(collection, map, this._ctorParameters);
        return map.values();
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r8v0 ??, still in use, count: 1, list:
          (r8v0 ?? I:java.lang.Object) from 0x0023: INVOKE (r11v0 ?? I:java.util.HashMap), (r7v0 ?? I:java.lang.Object), (r8v0 ?? I:java.lang.Object) VIRTUAL call: java.util.HashMap.put(java.lang.Object, java.lang.Object):java.lang.Object A[MD:(K, V):V (c)] (LINE:36)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:75)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:59)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:42)
        */
    public final void f(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r8v0 ??, still in use, count: 1, list:
          (r8v0 ?? I:java.lang.Object) from 0x0023: INVOKE (r11v0 ?? I:java.util.HashMap), (r7v0 ?? I:java.lang.Object), (r8v0 ?? I:java.lang.Object) VIRTUAL call: java.util.HashMap.put(java.lang.Object, java.lang.Object):java.lang.Object A[MD:(K, V):V (c)] (LINE:36)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:75)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:59)
        */
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r10v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:215)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:150)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:415)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:299)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
        */

    public JsonProperty.Access findAccess() {
        return (JsonProperty.Access) fromMemberAnnotationsExcept(new j(), JsonProperty.Access.AUTO);
    }

    public Set<PropertyName> findExplicitNames() {
        Set<PropertyName> setG = g(this._ctorParameters, g(this._setters, g(this._getters, g(this._fields, null))));
        return setG == null ? Collections.emptySet() : setG;
    }

    @Override // com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition
    public JsonInclude.Value findInclusion() {
        AnnotatedMember accessor = getAccessor();
        AnnotationIntrospector annotationIntrospector = this._annotationIntrospector;
        JsonInclude.Value valueFindPropertyInclusion = annotationIntrospector == null ? null : annotationIntrospector.findPropertyInclusion(accessor);
        return valueFindPropertyInclusion == null ? JsonInclude.Value.empty() : valueFindPropertyInclusion;
    }

    @Override // com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition
    public ObjectIdInfo findObjectIdInfo() {
        return (ObjectIdInfo) fromMemberAnnotations(new i());
    }

    @Override // com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition
    public AnnotationIntrospector.ReferenceProperty findReferenceType() {
        AnnotationIntrospector.ReferenceProperty referenceProperty = this._referenceInfo;
        AnnotationIntrospector.ReferenceProperty referenceProperty2 = f43355p0;
        if (referenceProperty != null) {
            if (referenceProperty == referenceProperty2) {
                return null;
            }
            return referenceProperty;
        }
        AnnotationIntrospector.ReferenceProperty referenceProperty3 = (AnnotationIntrospector.ReferenceProperty) fromMemberAnnotations(new c());
        if (referenceProperty3 != null) {
            referenceProperty2 = referenceProperty3;
        }
        this._referenceInfo = referenceProperty2;
        return referenceProperty3;
    }

    @Override // com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition
    public Class<?>[] findViews() {
        return (Class[]) fromMemberAnnotations(new b());
    }

    public <T> T fromMemberAnnotations(k<T> kVar) {
        Linked<AnnotatedMethod> linked;
        Linked<AnnotatedField> linked2;
        T tWithMember = null;
        if (this._annotationIntrospector == null) {
            return null;
        }
        if (this._forSerialization) {
            Linked<AnnotatedMethod> linked3 = this._getters;
            if (linked3 != null) {
                tWithMember = kVar.withMember(linked3.value);
            }
        } else {
            Linked<AnnotatedParameter> linked4 = this._ctorParameters;
            tWithMember = linked4 != null ? kVar.withMember(linked4.value) : null;
            if (tWithMember == null && (linked = this._setters) != null) {
                tWithMember = kVar.withMember(linked.value);
            }
        }
        return (tWithMember != null || (linked2 = this._fields) == null) ? tWithMember : kVar.withMember(linked2.value);
    }

    public <T> T fromMemberAnnotationsExcept(k<T> kVar, T t10) {
        T tWithMember;
        T tWithMember2;
        T tWithMember3;
        T tWithMember4;
        T tWithMember5;
        T tWithMember6;
        T tWithMember7;
        T tWithMember8;
        if (this._annotationIntrospector == null) {
            return null;
        }
        if (this._forSerialization) {
            Linked<AnnotatedMethod> linked = this._getters;
            if (linked != null && (tWithMember8 = kVar.withMember(linked.value)) != null && tWithMember8 != t10) {
                return tWithMember8;
            }
            Linked<AnnotatedField> linked2 = this._fields;
            if (linked2 != null && (tWithMember7 = kVar.withMember(linked2.value)) != null && tWithMember7 != t10) {
                return tWithMember7;
            }
            Linked<AnnotatedParameter> linked3 = this._ctorParameters;
            if (linked3 != null && (tWithMember6 = kVar.withMember(linked3.value)) != null && tWithMember6 != t10) {
                return tWithMember6;
            }
            Linked<AnnotatedMethod> linked4 = this._setters;
            if (linked4 == null || (tWithMember5 = kVar.withMember(linked4.value)) == null || tWithMember5 == t10) {
                return null;
            }
            return tWithMember5;
        }
        Linked<AnnotatedParameter> linked5 = this._ctorParameters;
        if (linked5 != null && (tWithMember4 = kVar.withMember(linked5.value)) != null && tWithMember4 != t10) {
            return tWithMember4;
        }
        Linked<AnnotatedMethod> linked6 = this._setters;
        if (linked6 != null && (tWithMember3 = kVar.withMember(linked6.value)) != null && tWithMember3 != t10) {
            return tWithMember3;
        }
        Linked<AnnotatedField> linked7 = this._fields;
        if (linked7 != null && (tWithMember2 = kVar.withMember(linked7.value)) != null && tWithMember2 != t10) {
            return tWithMember2;
        }
        Linked<AnnotatedMethod> linked8 = this._getters;
        if (linked8 == null || (tWithMember = kVar.withMember(linked8.value)) == null || tWithMember == t10) {
            return null;
        }
        return tWithMember;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition
    public AnnotatedParameter getConstructorParameter() {
        Linked linked = this._ctorParameters;
        if (linked == null) {
            return null;
        }
        while (!(((AnnotatedParameter) linked.value).getOwner() instanceof AnnotatedConstructor)) {
            linked = linked.next;
            if (linked == null) {
                return this._ctorParameters.value;
            }
        }
        return (AnnotatedParameter) linked.value;
    }

    @Override // com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition
    public Iterator<AnnotatedParameter> getConstructorParameters() {
        Linked<AnnotatedParameter> linked = this._ctorParameters;
        return linked == null ? ClassUtil.emptyIterator() : new MemberIterator(linked);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition
    public AnnotatedField getField() {
        Linked<AnnotatedField> linked = this._fields;
        if (linked == null) {
            return null;
        }
        AnnotatedField annotatedField = linked.value;
        for (Linked linked2 = linked.next; linked2 != null; linked2 = linked2.next) {
            AnnotatedField annotatedField2 = (AnnotatedField) linked2.value;
            Class<?> declaringClass = annotatedField.getDeclaringClass();
            Class<?> declaringClass2 = annotatedField2.getDeclaringClass();
            if (declaringClass != declaringClass2) {
                if (declaringClass.isAssignableFrom(declaringClass2)) {
                    annotatedField = annotatedField2;
                } else if (declaringClass2.isAssignableFrom(declaringClass)) {
                }
            }
            throw new IllegalArgumentException("Multiple fields representing property \"" + getName() + "\": " + annotatedField.getFullName() + " vs " + annotatedField2.getFullName());
        }
        return annotatedField;
    }

    @Override // com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition
    public PropertyName getFullName() {
        return this._name;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0031  */
    /* JADX WARN: Code duplicated, block: B:21:0x0043 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:22:0x0045  */
    /* JADX WARN: Code duplicated, block: B:28:0x0049 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:31:0x0046 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition
    public AnnotatedMethod getGetter() {
        int i_getterPriority;
        int i_getterPriority2;
        Linked linked = this._getters;
        if (linked == null) {
            return null;
        }
        Linked linked2 = linked.next;
        if (linked2 == null) {
            return (AnnotatedMethod) linked.value;
        }
        while (linked2 != null) {
            Class<?> declaringClass = ((AnnotatedMethod) linked.value).getDeclaringClass();
            Class<?> declaringClass2 = ((AnnotatedMethod) linked2.value).getDeclaringClass();
            if (declaringClass == declaringClass2) {
                i_getterPriority = _getterPriority((AnnotatedMethod) linked2.value);
                i_getterPriority2 = _getterPriority((AnnotatedMethod) linked.value);
                if (i_getterPriority != i_getterPriority2) {
                    throw new IllegalArgumentException("Conflicting getter definitions for property \"" + getName() + "\": " + ((AnnotatedMethod) linked.value).getFullName() + " vs " + ((AnnotatedMethod) linked2.value).getFullName());
                }
                if (i_getterPriority < i_getterPriority2) {
                    linked = linked2;
                }
            } else if (declaringClass.isAssignableFrom(declaringClass2)) {
                linked = linked2;
            } else if (declaringClass2.isAssignableFrom(declaringClass)) {
                continue;
            } else {
                i_getterPriority = _getterPriority((AnnotatedMethod) linked2.value);
                i_getterPriority2 = _getterPriority((AnnotatedMethod) linked.value);
                if (i_getterPriority != i_getterPriority2) {
                    throw new IllegalArgumentException("Conflicting getter definitions for property \"" + getName() + "\": " + ((AnnotatedMethod) linked.value).getFullName() + " vs " + ((AnnotatedMethod) linked2.value).getFullName());
                }
                if (i_getterPriority < i_getterPriority2) {
                    linked = linked2;
                }
            }
            linked2 = linked2.next;
        }
        this._getters = linked.withoutNext();
        return (AnnotatedMethod) linked.value;
    }

    @Override // com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition
    public String getInternalName() {
        return this._internalName.getSimpleName();
    }

    @Override // com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition
    public PropertyMetadata getMetadata() {
        if (this._metadata == null) {
            Boolean bool_findRequired = _findRequired();
            String str_findDescription = _findDescription();
            Integer num_findIndex = _findIndex();
            String str_findDefaultValue = _findDefaultValue();
            if (bool_findRequired == null && num_findIndex == null && str_findDefaultValue == null) {
                PropertyMetadata propertyMetadataWithDescription = PropertyMetadata.STD_REQUIRED_OR_OPTIONAL;
                if (str_findDescription != null) {
                    propertyMetadataWithDescription = propertyMetadataWithDescription.withDescription(str_findDescription);
                }
                this._metadata = propertyMetadataWithDescription;
            } else {
                this._metadata = PropertyMetadata.construct(bool_findRequired, str_findDescription, num_findIndex, str_findDefaultValue);
            }
            if (!this._forSerialization) {
                this._metadata = _getSetterInfo(this._metadata);
            }
        }
        return this._metadata;
    }

    @Override // com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition, com.fasterxml.jackson.databind.util.Named
    public String getName() {
        PropertyName propertyName = this._name;
        if (propertyName == null) {
            return null;
        }
        return propertyName.getSimpleName();
    }

    @Override // com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition
    public AnnotatedMember getPrimaryMember() {
        if (this._forSerialization) {
            return getAccessor();
        }
        AnnotatedMember mutator = getMutator();
        return mutator == null ? getAccessor() : mutator;
    }

    @Override // com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition
    public JavaType getPrimaryType() {
        if (this._forSerialization) {
            AnnotatedMethod getter = getGetter();
            if (getter != null) {
                return getter.getType();
            }
            AnnotatedField field = getField();
            return field == null ? TypeFactory.unknownType() : field.getType();
        }
        Annotated constructorParameter = getConstructorParameter();
        if (constructorParameter == null) {
            AnnotatedMethod setter = getSetter();
            if (setter != null) {
                return setter.getParameterType(0);
            }
            constructorParameter = getField();
        }
        return (constructorParameter == null && (constructorParameter = getGetter()) == null) ? TypeFactory.unknownType() : constructorParameter.getType();
    }

    @Override // com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition
    public Class<?> getRawPrimaryType() {
        return getPrimaryType().getRawClass();
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0031  */
    /* JADX WARN: Code duplicated, block: B:21:0x0043 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:23:0x0046  */
    /* JADX WARN: Code duplicated, block: B:25:0x004a  */
    /* JADX WARN: Code duplicated, block: B:28:0x0053 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:29:0x0055  */
    /* JADX WARN: Code duplicated, block: B:36:0x0059 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:37:0x0059 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:39:0x0056 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:41:0x0056 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition
    public AnnotatedMethod getSetter() {
        AnnotatedMethod annotatedMethod;
        AnnotatedMethod annotatedMethod2;
        int i_setterPriority;
        int i_setterPriority2;
        AnnotationIntrospector annotationIntrospector;
        AnnotatedMethod annotatedMethodResolveSetterConflict;
        Linked linked = this._setters;
        if (linked == null) {
            return null;
        }
        Linked linked2 = linked.next;
        if (linked2 == null) {
            return (AnnotatedMethod) linked.value;
        }
        while (linked2 != null) {
            Class<?> declaringClass = ((AnnotatedMethod) linked.value).getDeclaringClass();
            Class<?> declaringClass2 = ((AnnotatedMethod) linked2.value).getDeclaringClass();
            if (declaringClass == declaringClass2) {
                annotatedMethod = (AnnotatedMethod) linked2.value;
                annotatedMethod2 = (AnnotatedMethod) linked.value;
                i_setterPriority = _setterPriority(annotatedMethod);
                i_setterPriority2 = _setterPriority(annotatedMethod2);
                if (i_setterPriority != i_setterPriority2) {
                    annotationIntrospector = this._annotationIntrospector;
                    if (annotationIntrospector == null) {
                        annotatedMethodResolveSetterConflict = annotationIntrospector.resolveSetterConflict(this._config, annotatedMethod2, annotatedMethod);
                        if (annotatedMethodResolveSetterConflict != annotatedMethod2) {
                            if (annotatedMethodResolveSetterConflict != annotatedMethod) {
                            }
                            linked = linked2;
                        } else {
                            continue;
                        }
                    }
                    throw new IllegalArgumentException(String.format("Conflicting setter definitions for property \"%s\": %s vs %s", getName(), ((AnnotatedMethod) linked.value).getFullName(), ((AnnotatedMethod) linked2.value).getFullName()));
                }
                if (i_setterPriority < i_setterPriority2) {
                    linked = linked2;
                }
            } else if (declaringClass.isAssignableFrom(declaringClass2)) {
                linked = linked2;
            } else if (declaringClass2.isAssignableFrom(declaringClass)) {
                continue;
            } else {
                annotatedMethod = (AnnotatedMethod) linked2.value;
                annotatedMethod2 = (AnnotatedMethod) linked.value;
                i_setterPriority = _setterPriority(annotatedMethod);
                i_setterPriority2 = _setterPriority(annotatedMethod2);
                if (i_setterPriority != i_setterPriority2) {
                    annotationIntrospector = this._annotationIntrospector;
                    if (annotationIntrospector == null) {
                        annotatedMethodResolveSetterConflict = annotationIntrospector.resolveSetterConflict(this._config, annotatedMethod2, annotatedMethod);
                        if (annotatedMethodResolveSetterConflict != annotatedMethod2) {
                            if (annotatedMethodResolveSetterConflict != annotatedMethod) {
                            }
                            linked = linked2;
                        } else {
                            continue;
                        }
                    }
                    throw new IllegalArgumentException(String.format("Conflicting setter definitions for property \"%s\": %s vs %s", getName(), ((AnnotatedMethod) linked.value).getFullName(), ((AnnotatedMethod) linked2.value).getFullName()));
                }
                if (i_setterPriority < i_setterPriority2) {
                    linked = linked2;
                }
            }
            linked2 = linked2.next;
        }
        this._setters = linked.withoutNext();
        return (AnnotatedMethod) linked.value;
    }

    @Override // com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition
    public PropertyName getWrapperName() {
        AnnotationIntrospector annotationIntrospector;
        AnnotatedMember primaryMember = getPrimaryMember();
        if (primaryMember == null || (annotationIntrospector = this._annotationIntrospector) == null) {
            return null;
        }
        return annotationIntrospector.findWrapperName(primaryMember);
    }

    @Override // com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition
    public boolean hasConstructorParameter() {
        return this._ctorParameters != null;
    }

    @Override // com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition
    public boolean hasField() {
        return this._fields != null;
    }

    @Override // com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition
    public boolean hasGetter() {
        return this._getters != null;
    }

    @Override // com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition
    public boolean hasName(PropertyName propertyName) {
        return this._name.equals(propertyName);
    }

    @Override // com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition
    public boolean hasSetter() {
        return this._setters != null;
    }

    @Override // com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition
    public boolean isExplicitlyIncluded() {
        return b(this._fields) || b(this._getters) || b(this._setters) || a(this._ctorParameters);
    }

    @Override // com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition
    public boolean isExplicitlyNamed() {
        return a(this._fields) || a(this._getters) || a(this._setters) || a(this._ctorParameters);
    }

    @Override // com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition
    public boolean isTypeId() {
        Boolean bool = (Boolean) fromMemberAnnotations(new d());
        return bool != null && bool.booleanValue();
    }

    public void mergeAnnotations(boolean z10) {
        if (z10) {
            Linked<AnnotatedMethod> linked = this._getters;
            if (linked != null) {
                this._getters = e(this._getters, i(0, linked, this._fields, this._ctorParameters, this._setters));
                return;
            }
            Linked<AnnotatedField> linked2 = this._fields;
            if (linked2 != null) {
                this._fields = e(this._fields, i(0, linked2, this._ctorParameters, this._setters));
                return;
            }
            return;
        }
        Linked<AnnotatedParameter> linked3 = this._ctorParameters;
        if (linked3 != null) {
            this._ctorParameters = e(this._ctorParameters, i(0, linked3, this._setters, this._fields, this._getters));
            return;
        }
        Linked<AnnotatedMethod> linked4 = this._setters;
        if (linked4 != null) {
            this._setters = e(this._setters, i(0, linked4, this._fields, this._getters));
            return;
        }
        Linked<AnnotatedField> linked5 = this._fields;
        if (linked5 != null) {
            this._fields = e(this._fields, i(0, linked5, this._getters));
        }
    }

    public void removeConstructors() {
        this._ctorParameters = null;
    }

    public void removeIgnored() {
        Linked<AnnotatedField> linkedWithoutIgnored = this._fields;
        if (linkedWithoutIgnored != null) {
            linkedWithoutIgnored = linkedWithoutIgnored.withoutIgnored();
        }
        this._fields = linkedWithoutIgnored;
        Linked<AnnotatedMethod> linkedWithoutIgnored2 = this._getters;
        if (linkedWithoutIgnored2 != null) {
            linkedWithoutIgnored2 = linkedWithoutIgnored2.withoutIgnored();
        }
        this._getters = linkedWithoutIgnored2;
        Linked<AnnotatedMethod> linkedWithoutIgnored3 = this._setters;
        if (linkedWithoutIgnored3 != null) {
            linkedWithoutIgnored3 = linkedWithoutIgnored3.withoutIgnored();
        }
        this._setters = linkedWithoutIgnored3;
        Linked<AnnotatedParameter> linkedWithoutIgnored4 = this._ctorParameters;
        if (linkedWithoutIgnored4 != null) {
            linkedWithoutIgnored4 = linkedWithoutIgnored4.withoutIgnored();
        }
        this._ctorParameters = linkedWithoutIgnored4;
    }

    public JsonProperty.Access removeNonVisible(boolean z10) {
        JsonProperty.Access accessFindAccess = findAccess();
        if (accessFindAccess == null) {
            accessFindAccess = JsonProperty.Access.AUTO;
        }
        int i10 = a.f43357a[accessFindAccess.ordinal()];
        if (i10 == 1) {
            this._setters = null;
            this._ctorParameters = null;
            if (!this._forSerialization) {
                this._fields = null;
            }
        } else if (i10 != 2) {
            if (i10 != 3) {
                Linked<AnnotatedMethod> linkedWithoutNonVisible = this._getters;
                if (linkedWithoutNonVisible != null) {
                    linkedWithoutNonVisible = linkedWithoutNonVisible.withoutNonVisible();
                }
                this._getters = linkedWithoutNonVisible;
                Linked<AnnotatedParameter> linkedWithoutNonVisible2 = this._ctorParameters;
                if (linkedWithoutNonVisible2 != null) {
                    linkedWithoutNonVisible2 = linkedWithoutNonVisible2.withoutNonVisible();
                }
                this._ctorParameters = linkedWithoutNonVisible2;
                if (!z10 || this._getters == null) {
                    Linked<AnnotatedField> linkedWithoutNonVisible3 = this._fields;
                    if (linkedWithoutNonVisible3 != null) {
                        linkedWithoutNonVisible3 = linkedWithoutNonVisible3.withoutNonVisible();
                    }
                    this._fields = linkedWithoutNonVisible3;
                    Linked<AnnotatedMethod> linkedWithoutNonVisible4 = this._setters;
                    if (linkedWithoutNonVisible4 != null) {
                        linkedWithoutNonVisible4 = linkedWithoutNonVisible4.withoutNonVisible();
                    }
                    this._setters = linkedWithoutNonVisible4;
                }
            } else {
                this._getters = null;
                if (this._forSerialization) {
                    this._fields = null;
                }
            }
        }
        return accessFindAccess;
    }

    public String toString() {
        return "[Property '" + this._name + "'; ctors: " + this._ctorParameters + ", field(s): " + this._fields + ", getter(s): " + this._getters + ", setter(s): " + this._setters + Constant.BRACKET_CLOSE;
    }

    public void trimByVisibility() {
        Linked<AnnotatedField> linkedTrimByVisibility = this._fields;
        if (linkedTrimByVisibility != null) {
            linkedTrimByVisibility = linkedTrimByVisibility.trimByVisibility();
        }
        this._fields = linkedTrimByVisibility;
        Linked<AnnotatedMethod> linkedTrimByVisibility2 = this._getters;
        if (linkedTrimByVisibility2 != null) {
            linkedTrimByVisibility2 = linkedTrimByVisibility2.trimByVisibility();
        }
        this._getters = linkedTrimByVisibility2;
        Linked<AnnotatedMethod> linkedTrimByVisibility3 = this._setters;
        if (linkedTrimByVisibility3 != null) {
            linkedTrimByVisibility3 = linkedTrimByVisibility3.trimByVisibility();
        }
        this._setters = linkedTrimByVisibility3;
        Linked<AnnotatedParameter> linkedTrimByVisibility4 = this._ctorParameters;
        if (linkedTrimByVisibility4 != null) {
            linkedTrimByVisibility4 = linkedTrimByVisibility4.trimByVisibility();
        }
        this._ctorParameters = linkedTrimByVisibility4;
    }

    public POJOPropertyBuilder(MapperConfig<?> mapperConfig, AnnotationIntrospector annotationIntrospector, boolean z10, PropertyName propertyName, PropertyName propertyName2) {
        this._config = mapperConfig;
        this._annotationIntrospector = annotationIntrospector;
        this._internalName = propertyName;
        this._name = propertyName2;
        this._forSerialization = z10;
    }

    @Override // java.lang.Comparable
    public int compareTo(POJOPropertyBuilder pOJOPropertyBuilder) {
        if (this._ctorParameters != null) {
            if (pOJOPropertyBuilder._ctorParameters == null) {
                return -1;
            }
        } else if (pOJOPropertyBuilder._ctorParameters != null) {
            return 1;
        }
        return getName().compareTo(pOJOPropertyBuilder.getName());
    }

    @Override // com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition
    public POJOPropertyBuilder withName(PropertyName propertyName) {
        return new POJOPropertyBuilder(this, propertyName);
    }

    @Override // com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition
    public POJOPropertyBuilder withSimpleName(String str) {
        PropertyName propertyNameWithSimpleName = this._name.withSimpleName(str);
        return propertyNameWithSimpleName == this._name ? this : new POJOPropertyBuilder(this, propertyNameWithSimpleName);
    }

    public POJOPropertyBuilder(POJOPropertyBuilder pOJOPropertyBuilder, PropertyName propertyName) {
        this._config = pOJOPropertyBuilder._config;
        this._annotationIntrospector = pOJOPropertyBuilder._annotationIntrospector;
        this._internalName = pOJOPropertyBuilder._internalName;
        this._name = propertyName;
        this._fields = pOJOPropertyBuilder._fields;
        this._ctorParameters = pOJOPropertyBuilder._ctorParameters;
        this._getters = pOJOPropertyBuilder._getters;
        this._setters = pOJOPropertyBuilder._setters;
        this._forSerialization = pOJOPropertyBuilder._forSerialization;
    }
}
