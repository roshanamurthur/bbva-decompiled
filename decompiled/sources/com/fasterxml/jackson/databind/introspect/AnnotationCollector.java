package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.databind.util.Annotations;
import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public abstract class AnnotationCollector {
    protected static final Annotations NO_ANNOTATIONS = new NoAnnotations();
    protected final Object _data;

    public static class NoAnnotations implements Annotations, Serializable {
        @Override // com.fasterxml.jackson.databind.util.Annotations
        public <A extends Annotation> A get(Class<A> cls) {
            return null;
        }

        @Override // com.fasterxml.jackson.databind.util.Annotations
        public boolean has(Class<?> cls) {
            return false;
        }

        @Override // com.fasterxml.jackson.databind.util.Annotations
        public boolean hasOneOf(Class<? extends Annotation>[] clsArr) {
            return false;
        }

        @Override // com.fasterxml.jackson.databind.util.Annotations
        public int size() {
            return 0;
        }
    }

    public static class OneAnnotation implements Annotations, Serializable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Class<?> f43336p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final Annotation f43337q0;

        public OneAnnotation(Class<?> cls, Annotation annotation) {
            this.f43336p0 = cls;
            this.f43337q0 = annotation;
        }

        @Override // com.fasterxml.jackson.databind.util.Annotations
        public <A extends Annotation> A get(Class<A> cls) {
            if (this.f43336p0 == cls) {
                return (A) this.f43337q0;
            }
            return null;
        }

        @Override // com.fasterxml.jackson.databind.util.Annotations
        public boolean has(Class<?> cls) {
            return this.f43336p0 == cls;
        }

        @Override // com.fasterxml.jackson.databind.util.Annotations
        public boolean hasOneOf(Class<? extends Annotation>[] clsArr) {
            for (Class<? extends Annotation> cls : clsArr) {
                if (cls == this.f43336p0) {
                    return true;
                }
            }
            return false;
        }

        @Override // com.fasterxml.jackson.databind.util.Annotations
        public int size() {
            return 1;
        }
    }

    public static class TwoAnnotations implements Annotations, Serializable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Class<?> f43338p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final Class<?> f43339q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final Annotation f43340r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final Annotation f43341s0;

        public TwoAnnotations(Class<?> cls, Annotation annotation, Class<?> cls2, Annotation annotation2) {
            this.f43338p0 = cls;
            this.f43340r0 = annotation;
            this.f43339q0 = cls2;
            this.f43341s0 = annotation2;
        }

        @Override // com.fasterxml.jackson.databind.util.Annotations
        public <A extends Annotation> A get(Class<A> cls) {
            if (this.f43338p0 == cls) {
                return (A) this.f43340r0;
            }
            if (this.f43339q0 == cls) {
                return (A) this.f43341s0;
            }
            return null;
        }

        @Override // com.fasterxml.jackson.databind.util.Annotations
        public boolean has(Class<?> cls) {
            return this.f43338p0 == cls || this.f43339q0 == cls;
        }

        @Override // com.fasterxml.jackson.databind.util.Annotations
        public boolean hasOneOf(Class<? extends Annotation>[] clsArr) {
            for (Class<? extends Annotation> cls : clsArr) {
                if (cls == this.f43338p0 || cls == this.f43339q0) {
                    return true;
                }
            }
            return false;
        }

        @Override // com.fasterxml.jackson.databind.util.Annotations
        public int size() {
            return 2;
        }
    }

    public static class a extends AnnotationCollector {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f43342a = new a(null);

        @Override // com.fasterxml.jackson.databind.introspect.AnnotationCollector
        public final AnnotationCollector addOrOverride(Annotation annotation) {
            Object obj = this._data;
            Class<? extends Annotation> clsAnnotationType = annotation.annotationType();
            c cVar = new c(obj);
            cVar.f43344a = clsAnnotationType;
            cVar.f43345b = annotation;
            return cVar;
        }

        @Override // com.fasterxml.jackson.databind.introspect.AnnotationCollector
        public final AnnotationMap asAnnotationMap() {
            return new AnnotationMap();
        }

        @Override // com.fasterxml.jackson.databind.introspect.AnnotationCollector
        public final Annotations asAnnotations() {
            return AnnotationCollector.NO_ANNOTATIONS;
        }

        @Override // com.fasterxml.jackson.databind.introspect.AnnotationCollector
        public final boolean isPresent(Annotation annotation) {
            return false;
        }
    }

    public static class b extends AnnotationCollector {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final HashMap<Class<?>, Annotation> f43343a;

        public b(Object obj, Class<?> cls, Annotation annotation, Class<?> cls2, Annotation annotation2) {
            super(obj);
            HashMap<Class<?>, Annotation> map = new HashMap<>();
            this.f43343a = map;
            map.put(cls, annotation);
            map.put(cls2, annotation2);
        }

        @Override // com.fasterxml.jackson.databind.introspect.AnnotationCollector
        public final AnnotationCollector addOrOverride(Annotation annotation) {
            this.f43343a.put(annotation.annotationType(), annotation);
            return this;
        }

        @Override // com.fasterxml.jackson.databind.introspect.AnnotationCollector
        public final AnnotationMap asAnnotationMap() {
            AnnotationMap annotationMap = new AnnotationMap();
            Iterator<Annotation> it = this.f43343a.values().iterator();
            while (it.hasNext()) {
                annotationMap.add(it.next());
            }
            return annotationMap;
        }

        @Override // com.fasterxml.jackson.databind.introspect.AnnotationCollector
        public final Annotations asAnnotations() {
            HashMap<Class<?>, Annotation> map = this.f43343a;
            if (map.size() != 2) {
                return new AnnotationMap(map);
            }
            Iterator<Map.Entry<Class<?>, Annotation>> it = map.entrySet().iterator();
            Map.Entry<Class<?>, Annotation> next = it.next();
            Map.Entry<Class<?>, Annotation> next2 = it.next();
            return new TwoAnnotations(next.getKey(), next.getValue(), next2.getKey(), next2.getValue());
        }

        @Override // com.fasterxml.jackson.databind.introspect.AnnotationCollector
        public final boolean isPresent(Annotation annotation) {
            return this.f43343a.containsKey(annotation.annotationType());
        }
    }

    public static class c extends AnnotationCollector {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Class<?> f43344a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Annotation f43345b;

        @Override // com.fasterxml.jackson.databind.introspect.AnnotationCollector
        public final AnnotationCollector addOrOverride(Annotation annotation) {
            Class<? extends Annotation> clsAnnotationType = annotation.annotationType();
            Class<?> cls = this.f43344a;
            if (cls != clsAnnotationType) {
                return new b(this._data, cls, this.f43345b, clsAnnotationType, annotation);
            }
            this.f43345b = annotation;
            return this;
        }

        @Override // com.fasterxml.jackson.databind.introspect.AnnotationCollector
        public final AnnotationMap asAnnotationMap() {
            return AnnotationMap.of(this.f43344a, this.f43345b);
        }

        @Override // com.fasterxml.jackson.databind.introspect.AnnotationCollector
        public final Annotations asAnnotations() {
            return new OneAnnotation(this.f43344a, this.f43345b);
        }

        @Override // com.fasterxml.jackson.databind.introspect.AnnotationCollector
        public final boolean isPresent(Annotation annotation) {
            return annotation.annotationType() == this.f43344a;
        }
    }

    public AnnotationCollector(Object obj) {
        this._data = obj;
    }

    public static Annotations emptyAnnotations() {
        return NO_ANNOTATIONS;
    }

    public static AnnotationCollector emptyCollector() {
        return a.f43342a;
    }

    public abstract AnnotationCollector addOrOverride(Annotation annotation);

    public abstract AnnotationMap asAnnotationMap();

    public abstract Annotations asAnnotations();

    public Object getData() {
        return this._data;
    }

    public abstract boolean isPresent(Annotation annotation);

    public static AnnotationCollector emptyCollector(Object obj) {
        return new a(obj);
    }
}
