package com.fasterxml.jackson.databind.introspect;

import androidx.datastore.preferences.protobuf.e;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.type.TypeBindings;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.util.Annotations;
import com.fasterxml.jackson.databind.util.ClassUtil;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import mx.openpay.library.domain.util.Constant;

/* JADX INFO: loaded from: classes9.dex */
public final class AnnotatedClass extends Annotated implements TypeResolutionContext {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final Creators f43313p0 = new Creators(null, Collections.emptyList(), Collections.emptyList());
    protected final AnnotationIntrospector _annotationIntrospector;
    protected final TypeBindings _bindings;
    protected final Class<?> _class;
    protected final Annotations _classAnnotations;
    protected Creators _creators;
    protected List<AnnotatedField> _fields;
    protected AnnotatedMethodMap _memberMethods;
    protected final ClassIntrospector.MixInResolver _mixInResolver;
    protected transient Boolean _nonStaticInnerClass;
    protected final Class<?> _primaryMixIn;
    protected final List<JavaType> _superTypes;
    protected final JavaType _type;
    protected final TypeFactory _typeFactory;

    public static final class Creators {
        public final List<AnnotatedConstructor> constructors;
        public final List<AnnotatedMethod> creatorMethods;
        public final AnnotatedConstructor defaultConstructor;

        public Creators(AnnotatedConstructor annotatedConstructor, List<AnnotatedConstructor> list, List<AnnotatedMethod> list2) {
            this.defaultConstructor = annotatedConstructor;
            this.constructors = list;
            this.creatorMethods = list2;
        }
    }

    public AnnotatedClass(JavaType javaType, Class<?> cls, List<JavaType> list, Class<?> cls2, Annotations annotations, TypeBindings typeBindings, AnnotationIntrospector annotationIntrospector, ClassIntrospector.MixInResolver mixInResolver, TypeFactory typeFactory) {
        this._type = javaType;
        this._class = cls;
        this._superTypes = list;
        this._primaryMixIn = cls2;
        this._classAnnotations = annotations;
        this._bindings = typeBindings;
        this._annotationIntrospector = annotationIntrospector;
        this._mixInResolver = mixInResolver;
        this._typeFactory = typeFactory;
    }

    @Deprecated
    public static AnnotatedClass construct(JavaType javaType, MapperConfig<?> mapperConfig) {
        return construct(javaType, mapperConfig, mapperConfig);
    }

    @Deprecated
    public static AnnotatedClass constructWithoutSuperTypes(Class<?> cls, MapperConfig<?> mapperConfig) {
        return constructWithoutSuperTypes(cls, mapperConfig, mapperConfig);
    }

    /* JADX WARN: Code duplicated, block: B:107:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:113:0x01e3  */
    /* JADX WARN: Code duplicated, block: B:136:0x0122 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:137:0x01db A[EDGE_INSN: B:137:0x01db->B:110:0x01db BREAK  A[LOOP:6: B:105:0x01c5->B:139:0x01c5], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:138:0x01d7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:140:0x01c5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:142:0x01f5 A[EDGE_INSN: B:142:0x01f5->B:116:0x01f5 BREAK  A[LOOP:7: B:111:0x01df->B:144:0x01df], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:143:0x01f1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:145:0x01df A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:151:0x0190 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:153:0x017f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:156:0x01ac A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:61:0x010b  */
    /* JADX WARN: Code duplicated, block: B:64:0x0118 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:65:0x011a  */
    /* JADX WARN: Code duplicated, block: B:69:0x0127  */
    /* JADX WARN: Code duplicated, block: B:70:0x012d  */
    /* JADX WARN: Code duplicated, block: B:72:0x0139 A[LOOP:8: B:71:0x0137->B:72:0x0139, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:74:0x0142  */
    /* JADX WARN: Code duplicated, block: B:76:0x014b  */
    /* JADX WARN: Code duplicated, block: B:79:0x0158 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:80:0x015a  */
    /* JADX WARN: Code duplicated, block: B:82:0x015f A[LOOP:10: B:81:0x015d->B:82:0x015f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:85:0x0177  */
    /* JADX WARN: Code duplicated, block: B:88:0x018d A[LOOP:11: B:84:0x0175->B:88:0x018d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:92:0x0196  */
    /* JADX WARN: Code duplicated, block: B:94:0x019e  */
    /* JADX WARN: Code duplicated, block: B:99:0x01b4  */
    /* JADX WARN: Instruction removed from duplicated block: B:74:0x0142, please report this as an issue */
    public final Creators a() {
        ClassUtil.Ctor ctor;
        ArrayList arrayList;
        int i10;
        List listEmptyList;
        ArrayList arrayList2;
        int i11;
        int size;
        ArrayList arrayList3;
        int i12;
        int i13;
        List listEmptyList2;
        MemberKey[] memberKeyArr;
        int i14;
        MemberKey memberKey;
        int i15;
        int i16;
        AnnotationIntrospector annotationIntrospector;
        AnnotatedConstructor annotatedConstructor;
        int size2;
        int size3;
        Creators creators = this._creators;
        if (creators == null) {
            JavaType javaType = this._type;
            if (javaType == null) {
                creators = f43313p0;
            } else {
                AnnotationIntrospector annotationIntrospector2 = this._annotationIntrospector;
                Class<?> cls = this._primaryMixIn;
                a aVar = new a(annotationIntrospector2, this);
                ClassUtil.Ctor ctor2 = null;
                if (javaType.isEnumType()) {
                    ctor = null;
                    arrayList = null;
                } else {
                    ctor = null;
                    arrayList = null;
                    for (ClassUtil.Ctor ctor3 : ClassUtil.getConstructors(javaType.getRawClass())) {
                        if (!ctor3.getConstructor().isSynthetic()) {
                            if (ctor3.getParamCount() == 0) {
                                ctor = ctor3;
                            } else {
                                if (arrayList == null) {
                                    arrayList = new ArrayList();
                                }
                                arrayList.add(ctor3);
                            }
                        }
                    }
                }
                if (arrayList == null) {
                    listEmptyList = Collections.emptyList();
                    if (ctor != null) {
                        i10 = 0;
                    }
                    arrayList2 = null;
                    for (Method method : ClassUtil.getClassMethods(javaType.getRawClass())) {
                        if (Modifier.isStatic(method.getModifiers())) {
                            if (arrayList2 == null) {
                                arrayList2 = new ArrayList();
                            }
                            arrayList2.add(method);
                        }
                    }
                    if (arrayList2 == null) {
                        listEmptyList2 = Collections.emptyList();
                    } else {
                        size = arrayList2.size();
                        arrayList3 = new ArrayList(size);
                        for (i12 = 0; i12 < size; i12++) {
                            arrayList3.add(null);
                        }
                        if (cls != null) {
                            memberKeyArr = null;
                            for (Method method2 : ClassUtil.getDeclaredMethods(cls)) {
                                if (Modifier.isStatic(method2.getModifiers())) {
                                    if (memberKeyArr == null) {
                                        memberKeyArr = new MemberKey[size];
                                        for (i16 = 0; i16 < size; i16++) {
                                            memberKeyArr[i16] = new MemberKey((Method) arrayList2.get(i16));
                                        }
                                    }
                                    memberKey = new MemberKey(method2);
                                    for (i15 = 0; i15 < size; i15++) {
                                        if (memberKey.equals(memberKeyArr[i15])) {
                                            arrayList3.set(i15, aVar.d((Method) arrayList2.get(i15), method2));
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                        for (i13 = 0; i13 < size; i13++) {
                            if (((AnnotatedMethod) arrayList3.get(i13)) == null) {
                                arrayList3.set(i13, aVar.d((Method) arrayList2.get(i13), null));
                            }
                        }
                        listEmptyList2 = arrayList3;
                    }
                    annotationIntrospector = aVar._intr;
                    if (annotationIntrospector != null) {
                        annotatedConstructor = aVar.f43371b;
                        if (annotatedConstructor != null && annotationIntrospector.hasIgnoreMarker(annotatedConstructor)) {
                            aVar.f43371b = null;
                        }
                        size2 = listEmptyList.size();
                        while (true) {
                            size2--;
                            if (size2 >= 0) {
                                break;
                            }
                            if (aVar._intr.hasIgnoreMarker((AnnotatedMember) listEmptyList.get(size2))) {
                                listEmptyList.remove(size2);
                            }
                        }
                        size3 = listEmptyList2.size();
                        while (true) {
                            size3--;
                            if (size3 >= 0) {
                                break;
                            }
                            if (aVar._intr.hasIgnoreMarker((AnnotatedMember) listEmptyList2.get(size3))) {
                                listEmptyList2.remove(size3);
                            }
                        }
                    }
                    creators = new Creators(aVar.f43371b, listEmptyList, listEmptyList2);
                } else {
                    int size4 = arrayList.size();
                    ArrayList arrayList4 = new ArrayList(size4);
                    for (int i17 = 0; i17 < size4; i17++) {
                        arrayList4.add(null);
                    }
                    i10 = size4;
                    listEmptyList = arrayList4;
                }
                if (cls != null) {
                    ClassUtil.Ctor[] constructors = ClassUtil.getConstructors(cls);
                    int length = constructors.length;
                    MemberKey[] memberKeyArr2 = null;
                    int i18 = 0;
                    while (i18 < length) {
                        ClassUtil.Ctor ctor4 = constructors[i18];
                        if (ctor4.getParamCount() == 0) {
                            if (ctor != null) {
                                aVar.f43371b = aVar.c(ctor, ctor4);
                                ctor = ctor2;
                            }
                        } else if (arrayList != null) {
                            if (memberKeyArr2 == null) {
                                memberKeyArr2 = new MemberKey[i10];
                                for (int i19 = 0; i19 < i10; i19++) {
                                    memberKeyArr2[i19] = new MemberKey(((ClassUtil.Ctor) arrayList.get(i19)).getConstructor());
                                }
                            }
                            MemberKey memberKey2 = new MemberKey(ctor4.getConstructor());
                            for (int i20 = 0; i20 < i10; i20++) {
                                if (memberKey2.equals(memberKeyArr2[i20])) {
                                    listEmptyList.set(i20, aVar.e((ClassUtil.Ctor) arrayList.get(i20), ctor4));
                                    break;
                                }
                            }
                        }
                        i18++;
                        ctor2 = null;
                    }
                }
                ClassUtil.Ctor ctor5 = null;
                if (ctor != null) {
                    aVar.f43371b = aVar.c(ctor, null);
                }
                int i21 = 0;
                while (i21 < i10) {
                    if (((AnnotatedConstructor) listEmptyList.get(i21)) == null) {
                        listEmptyList.set(i21, aVar.e((ClassUtil.Ctor) arrayList.get(i21), ctor5));
                    }
                    i21++;
                    ctor5 = null;
                }
                arrayList2 = null;
                while (i11 < r5) {
                    if (Modifier.isStatic(method.getModifiers())) {
                        if (arrayList2 == null) {
                            arrayList2 = new ArrayList();
                        }
                        arrayList2.add(method);
                    }
                }
                if (arrayList2 == null) {
                    listEmptyList2 = Collections.emptyList();
                } else {
                    size = arrayList2.size();
                    arrayList3 = new ArrayList(size);
                    while (i12 < size) {
                        arrayList3.add(null);
                    }
                    if (cls != null) {
                        memberKeyArr = null;
                        while (i14 < r7) {
                            if (Modifier.isStatic(method2.getModifiers())) {
                                if (memberKeyArr == null) {
                                    memberKeyArr = new MemberKey[size];
                                    while (i16 < size) {
                                        memberKeyArr[i16] = new MemberKey((Method) arrayList2.get(i16));
                                    }
                                }
                                memberKey = new MemberKey(method2);
                                while (i15 < size) {
                                    if (memberKey.equals(memberKeyArr[i15])) {
                                        arrayList3.set(i15, aVar.d((Method) arrayList2.get(i15), method2));
                                        break;
                                        break;
                                    }
                                }
                            }
                        }
                    }
                    while (i13 < size) {
                        if (((AnnotatedMethod) arrayList3.get(i13)) == null) {
                            arrayList3.set(i13, aVar.d((Method) arrayList2.get(i13), null));
                        }
                    }
                    listEmptyList2 = arrayList3;
                }
                annotationIntrospector = aVar._intr;
                if (annotationIntrospector != null) {
                    annotatedConstructor = aVar.f43371b;
                    if (annotatedConstructor != null) {
                        aVar.f43371b = null;
                    }
                    size2 = listEmptyList.size();
                    while (true) {
                        size2--;
                        if (size2 >= 0) {
                            break;
                            break;
                        }
                        if (aVar._intr.hasIgnoreMarker((AnnotatedMember) listEmptyList.get(size2))) {
                            listEmptyList.remove(size2);
                        }
                    }
                    size3 = listEmptyList2.size();
                    while (true) {
                        size3--;
                        if (size3 >= 0) {
                            break;
                            break;
                        }
                        if (aVar._intr.hasIgnoreMarker((AnnotatedMember) listEmptyList2.get(size3))) {
                            listEmptyList2.remove(size3);
                        }
                    }
                }
                creators = new Creators(aVar.f43371b, listEmptyList, listEmptyList2);
            }
            this._creators = creators;
        }
        return creators;
    }

    @Override // com.fasterxml.jackson.databind.introspect.Annotated
    @Deprecated
    public Iterable<Annotation> annotations() {
        Annotations annotations = this._classAnnotations;
        if (annotations instanceof AnnotationMap) {
            return ((AnnotationMap) annotations).annotations();
        }
        if ((annotations instanceof AnnotationCollector.OneAnnotation) || (annotations instanceof AnnotationCollector.TwoAnnotations)) {
            throw new UnsupportedOperationException("please use getAnnotations/ hasAnnotation to check for Annotations");
        }
        return Collections.emptyList();
    }

    public final AnnotatedMethodMap b() {
        AnnotatedMethodMap annotatedMethodMap = this._memberMethods;
        if (annotatedMethodMap == null) {
            JavaType javaType = this._type;
            annotatedMethodMap = javaType == null ? new AnnotatedMethodMap() : AnnotatedMethodCollector.collectMethods(this._annotationIntrospector, this, this._mixInResolver, this._typeFactory, javaType, this._superTypes, this._primaryMixIn);
            this._memberMethods = annotatedMethodMap;
        }
        return annotatedMethodMap;
    }

    @Override // com.fasterxml.jackson.databind.introspect.Annotated
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return ClassUtil.hasClass(obj, AnnotatedClass.class) && ((AnnotatedClass) obj)._class == this._class;
    }

    public Iterable<AnnotatedField> fields() {
        List<AnnotatedField> listEmptyList = this._fields;
        if (listEmptyList == null) {
            JavaType javaType = this._type;
            listEmptyList = javaType == null ? Collections.emptyList() : AnnotatedFieldCollector.collectFields(this._annotationIntrospector, this, this._mixInResolver, this._typeFactory, javaType);
            this._fields = listEmptyList;
        }
        return listEmptyList;
    }

    public AnnotatedMethod findMethod(String str, Class<?>[] clsArr) {
        return b().find(str, clsArr);
    }

    @Override // com.fasterxml.jackson.databind.introspect.Annotated
    public <A extends Annotation> A getAnnotation(Class<A> cls) {
        return (A) this._classAnnotations.get(cls);
    }

    public Annotations getAnnotations() {
        return this._classAnnotations;
    }

    public List<AnnotatedConstructor> getConstructors() {
        return a().constructors;
    }

    public AnnotatedConstructor getDefaultConstructor() {
        return a().defaultConstructor;
    }

    public List<AnnotatedMethod> getFactoryMethods() {
        return a().creatorMethods;
    }

    public int getFieldCount() {
        List<AnnotatedField> listEmptyList = this._fields;
        if (listEmptyList == null) {
            JavaType javaType = this._type;
            listEmptyList = javaType == null ? Collections.emptyList() : AnnotatedFieldCollector.collectFields(this._annotationIntrospector, this, this._mixInResolver, this._typeFactory, javaType);
            this._fields = listEmptyList;
        }
        return listEmptyList.size();
    }

    public int getMemberMethodCount() {
        return b().size();
    }

    @Override // com.fasterxml.jackson.databind.introspect.Annotated
    public int getModifiers() {
        return this._class.getModifiers();
    }

    @Override // com.fasterxml.jackson.databind.introspect.Annotated
    public String getName() {
        return this._class.getName();
    }

    @Override // com.fasterxml.jackson.databind.introspect.Annotated
    public Class<?> getRawType() {
        return this._class;
    }

    @Deprecated
    public List<AnnotatedMethod> getStaticMethods() {
        return getFactoryMethods();
    }

    @Override // com.fasterxml.jackson.databind.introspect.Annotated
    public JavaType getType() {
        return this._type;
    }

    @Override // com.fasterxml.jackson.databind.introspect.Annotated
    public boolean hasAnnotation(Class<?> cls) {
        return this._classAnnotations.has(cls);
    }

    public boolean hasAnnotations() {
        return this._classAnnotations.size() > 0;
    }

    @Override // com.fasterxml.jackson.databind.introspect.Annotated
    public boolean hasOneOf(Class<? extends Annotation>[] clsArr) {
        return this._classAnnotations.hasOneOf(clsArr);
    }

    @Override // com.fasterxml.jackson.databind.introspect.Annotated
    public int hashCode() {
        return this._class.getName().hashCode();
    }

    public boolean isNonStaticInnerClass() {
        Boolean boolValueOf = this._nonStaticInnerClass;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(ClassUtil.isNonStaticInnerClass(this._class));
            this._nonStaticInnerClass = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    public Iterable<AnnotatedMethod> memberMethods() {
        return b();
    }

    @Override // com.fasterxml.jackson.databind.introspect.TypeResolutionContext
    public JavaType resolveType(Type type) {
        return this._typeFactory.constructType(type, this._bindings);
    }

    @Override // com.fasterxml.jackson.databind.introspect.Annotated
    public String toString() {
        return e.e(this._class, new StringBuilder("[AnnotedClass "), Constant.BRACKET_CLOSE);
    }

    @Deprecated
    public static AnnotatedClass construct(JavaType javaType, MapperConfig<?> mapperConfig, ClassIntrospector.MixInResolver mixInResolver) {
        return AnnotatedClassResolver.resolve(mapperConfig, javaType, mixInResolver);
    }

    @Deprecated
    public static AnnotatedClass constructWithoutSuperTypes(Class<?> cls, MapperConfig<?> mapperConfig, ClassIntrospector.MixInResolver mixInResolver) {
        return AnnotatedClassResolver.resolveWithoutSuperTypes(mapperConfig, cls, mixInResolver);
    }

    @Override // com.fasterxml.jackson.databind.introspect.Annotated
    public Class<?> getAnnotated() {
        return this._class;
    }

    public AnnotatedClass(Class<?> cls) {
        this._type = null;
        this._class = cls;
        this._superTypes = Collections.emptyList();
        this._primaryMixIn = null;
        this._classAnnotations = AnnotationCollector.emptyAnnotations();
        this._bindings = TypeBindings.emptyBindings();
        this._annotationIntrospector = null;
        this._mixInResolver = null;
        this._typeFactory = null;
    }
}
