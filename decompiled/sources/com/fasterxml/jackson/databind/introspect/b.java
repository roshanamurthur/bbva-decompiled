package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.util.ClassUtil;
import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

/* JADX INFO: compiled from: CollectorBase.java */
/* JADX INFO: loaded from: classes9.dex */
public class b {
    protected final AnnotationIntrospector _intr;
    protected static final AnnotationMap[] NO_ANNOTATION_MAPS = new AnnotationMap[0];
    protected static final Annotation[] NO_ANNOTATIONS = new Annotation[0];

    public b(AnnotationIntrospector annotationIntrospector) {
        this._intr = annotationIntrospector;
    }

    public static final boolean _ignorableAnnotation(Annotation annotation) {
        return (annotation instanceof Target) || (annotation instanceof Retention);
    }

    public final AnnotationCollector collectAnnotations(Annotation[] annotationArr) {
        AnnotationCollector annotationCollectorEmptyCollector = AnnotationCollector.emptyCollector();
        for (Annotation annotation : annotationArr) {
            annotationCollectorEmptyCollector = annotationCollectorEmptyCollector.addOrOverride(annotation);
            if (this._intr.isAnnotationBundle(annotation)) {
                annotationCollectorEmptyCollector = collectFromBundle(annotationCollectorEmptyCollector, annotation);
            }
        }
        return annotationCollectorEmptyCollector;
    }

    public final AnnotationCollector collectDefaultAnnotations(AnnotationCollector annotationCollector, Annotation[] annotationArr) {
        for (Annotation annotation : annotationArr) {
            if (!annotationCollector.isPresent(annotation)) {
                annotationCollector = annotationCollector.addOrOverride(annotation);
                if (this._intr.isAnnotationBundle(annotation)) {
                    annotationCollector = collectDefaultFromBundle(annotationCollector, annotation);
                }
            }
        }
        return annotationCollector;
    }

    public final AnnotationCollector collectDefaultFromBundle(AnnotationCollector annotationCollector, Annotation annotation) {
        for (Annotation annotation2 : ClassUtil.findClassAnnotations(annotation.annotationType())) {
            if (!_ignorableAnnotation(annotation2) && !annotationCollector.isPresent(annotation2)) {
                annotationCollector = annotationCollector.addOrOverride(annotation2);
                if (this._intr.isAnnotationBundle(annotation2)) {
                    annotationCollector = collectFromBundle(annotationCollector, annotation2);
                }
            }
        }
        return annotationCollector;
    }

    public final AnnotationCollector collectFromBundle(AnnotationCollector annotationCollector, Annotation annotation) {
        for (Annotation annotation2 : ClassUtil.findClassAnnotations(annotation.annotationType())) {
            if (!_ignorableAnnotation(annotation2)) {
                if (!this._intr.isAnnotationBundle(annotation2)) {
                    annotationCollector = annotationCollector.addOrOverride(annotation2);
                } else if (!annotationCollector.isPresent(annotation2)) {
                    annotationCollector = collectFromBundle(annotationCollector.addOrOverride(annotation2), annotation2);
                }
            }
        }
        return annotationCollector;
    }

    public final AnnotationCollector collectAnnotations(AnnotationCollector annotationCollector, Annotation[] annotationArr) {
        for (Annotation annotation : annotationArr) {
            annotationCollector = annotationCollector.addOrOverride(annotation);
            if (this._intr.isAnnotationBundle(annotation)) {
                annotationCollector = collectFromBundle(annotationCollector, annotation);
            }
        }
        return annotationCollector;
    }
}
