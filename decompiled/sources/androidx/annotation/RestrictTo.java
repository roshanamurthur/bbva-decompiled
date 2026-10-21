package androidx.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.annotation.AnnotationRetention;
import kotlin.annotation.AnnotationTarget;
import kotlin.annotation.MustBeDocumented;

/* JADX INFO: compiled from: RestrictTo.jvm.kt */
/* JADX INFO: loaded from: classes.dex */
@Target({ElementType.ANNOTATION_TYPE, ElementType.TYPE, ElementType.METHOD, ElementType.CONSTRUCTOR, ElementType.FIELD, ElementType.PACKAGE})
@kotlin.annotation.Target(allowedTargets = {AnnotationTarget.ANNOTATION_CLASS, AnnotationTarget.CLASS, AnnotationTarget.FUNCTION, AnnotationTarget.PROPERTY_GETTER, AnnotationTarget.PROPERTY_SETTER, AnnotationTarget.CONSTRUCTOR, AnnotationTarget.FIELD, AnnotationTarget.FILE})
@Retention(RetentionPolicy.CLASS)
@kotlin.annotation.Retention(AnnotationRetention.BINARY)
@MustBeDocumented
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\u0002\u0018\u00002\u00020\u0001:\u0001\u0006B\u0014\u0012\u0012\u0010\u0002\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u0003\"\u00020\u0004R\u0017\u0010\u0002\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u0003¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0005¨\u0006\u0007"}, d2 = {"Landroidx/annotation/RestrictTo;", "", "value", "", "Landroidx/annotation/RestrictTo$Scope;", "()[Landroidx/annotation/RestrictTo$Scope;", "Scope", "annotation"}, k = 1, mv = {1, 7, 0}, xi = 48)
@Documented
public @interface RestrictTo {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: RestrictTo.jvm.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Landroidx/annotation/RestrictTo$Scope;", "", "LIBRARY", "LIBRARY_GROUP", "LIBRARY_GROUP_PREFIX", "GROUP_ID", "TESTS", "SUBCLASSES", "annotation"}, k = 1, mv = {1, 7, 0})
    public static final class Scope {
        private static final /* synthetic */ Scope[] $VALUES;

        @Deprecated(message = "Use LIBRARY_GROUP_PREFIX instead.")
        public static final Scope GROUP_ID;
        public static final Scope LIBRARY;
        public static final Scope LIBRARY_GROUP;
        public static final Scope LIBRARY_GROUP_PREFIX;
        public static final Scope SUBCLASSES;
        public static final Scope TESTS;

        static {
            Scope scope = new Scope("LIBRARY", 0);
            LIBRARY = scope;
            Scope scope2 = new Scope("LIBRARY_GROUP", 1);
            LIBRARY_GROUP = scope2;
            Scope scope3 = new Scope("LIBRARY_GROUP_PREFIX", 2);
            LIBRARY_GROUP_PREFIX = scope3;
            Scope scope4 = new Scope("GROUP_ID", 3);
            GROUP_ID = scope4;
            Scope scope5 = new Scope("TESTS", 4);
            TESTS = scope5;
            Scope scope6 = new Scope("SUBCLASSES", 5);
            SUBCLASSES = scope6;
            $VALUES = new Scope[]{scope, scope2, scope3, scope4, scope5, scope6};
        }

        public Scope() {
            throw null;
        }

        public static Scope valueOf(String str) {
            return (Scope) Enum.valueOf(Scope.class, str);
        }

        public static Scope[] values() {
            return (Scope[]) $VALUES.clone();
        }
    }

    Scope[] value();
}
