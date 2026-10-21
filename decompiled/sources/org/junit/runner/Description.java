package org.junit.runner;

import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes13.dex */
public class Description implements Serializable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final ConcurrentLinkedQueue f91966p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final String f91967q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final Serializable f91968r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final Annotation[] f91969s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public volatile Class<?> f91970t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public static final Pattern f91965u0 = Pattern.compile("([\\s\\S]*)\\((.*)\\)");
    public static final Description EMPTY = new Description(null, "No Tests", "No Tests", new Annotation[0]);
    public static final Description TEST_MECHANISM = new Description(null, "Test mechanism", "Test mechanism", new Annotation[0]);

    public Description() {
        throw null;
    }

    public Description(Class<?> cls, String str, Serializable serializable, Annotation... annotationArr) {
        this.f91966p0 = new ConcurrentLinkedQueue();
        if (str == null || str.length() == 0) {
            throw new IllegalArgumentException("The display name must not be empty.");
        }
        if (serializable == null) {
            throw new IllegalArgumentException("The unique id must not be null.");
        }
        this.f91970t0 = cls;
        this.f91967q0 = str;
        this.f91968r0 = serializable;
        this.f91969s0 = annotationArr;
    }

    public static String a(String str, String str2) {
        return String.format("%s(%s)", str, str2);
    }

    public static Description createSuiteDescription(String str, Annotation... annotationArr) {
        return new Description(null, str, str, annotationArr);
    }

    public static Description createTestDescription(String str, String str2, Annotation... annotationArr) {
        String strA = a(str2, str);
        return new Description(null, strA, strA, annotationArr);
    }

    public void addChild(Description description) {
        this.f91966p0.add(description);
    }

    public Description childlessCopy() {
        Class<?> cls = this.f91970t0;
        String str = this.f91967q0;
        return new Description(cls, str, str, this.f91969s0);
    }

    public boolean equals(Object obj) {
        if (obj instanceof Description) {
            return this.f91968r0.equals(((Description) obj).f91968r0);
        }
        return false;
    }

    public <T extends Annotation> T getAnnotation(Class<T> cls) {
        for (Annotation annotation : this.f91969s0) {
            if (annotation.annotationType().equals(cls)) {
                return cls.cast(annotation);
            }
        }
        return null;
    }

    public Collection<Annotation> getAnnotations() {
        return Arrays.asList(this.f91969s0);
    }

    public ArrayList<Description> getChildren() {
        return new ArrayList<>(this.f91966p0);
    }

    public String getClassName() {
        if (this.f91970t0 != null) {
            return this.f91970t0.getName();
        }
        String string = toString();
        Matcher matcher = f91965u0.matcher(toString());
        return matcher.matches() ? matcher.group(2) : string;
    }

    public String getDisplayName() {
        return this.f91967q0;
    }

    public String getMethodName() {
        Matcher matcher = f91965u0.matcher(toString());
        if (matcher.matches()) {
            return matcher.group(1);
        }
        return null;
    }

    public Class<?> getTestClass() {
        if (this.f91970t0 != null) {
            return this.f91970t0;
        }
        String className = getClassName();
        if (className == null) {
            return null;
        }
        try {
            this.f91970t0 = Class.forName(className, false, getClass().getClassLoader());
            return this.f91970t0;
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    public int hashCode() {
        return this.f91968r0.hashCode();
    }

    public boolean isEmpty() {
        return equals(EMPTY);
    }

    public boolean isSuite() {
        return !isTest();
    }

    public boolean isTest() {
        return this.f91966p0.isEmpty();
    }

    public int testCount() {
        if (isTest()) {
            return 1;
        }
        Iterator it = this.f91966p0.iterator();
        int iTestCount = 0;
        while (it.hasNext()) {
            iTestCount += ((Description) it.next()).testCount();
        }
        return iTestCount;
    }

    public String toString() {
        return getDisplayName();
    }

    public static Description createSuiteDescription(String str, Serializable serializable, Annotation... annotationArr) {
        return new Description(null, str, serializable, annotationArr);
    }

    public static Description createTestDescription(Class<?> cls, String str, Annotation... annotationArr) {
        String strA = a(str, cls.getName());
        return new Description(cls, strA, strA, annotationArr);
    }

    public static Description createSuiteDescription(Class<?> cls) {
        String name = cls.getName();
        return new Description(cls, name, name, cls.getAnnotations());
    }

    public static Description createTestDescription(Class<?> cls, String str) {
        String strA = a(str, cls.getName());
        return new Description(cls, strA, strA, new Annotation[0]);
    }

    public static Description createSuiteDescription(Class<?> cls, Annotation... annotationArr) {
        String name = cls.getName();
        return new Description(cls, name, name, annotationArr);
    }

    public static Description createTestDescription(String str, String str2, Serializable serializable) {
        return new Description(null, a(str2, str), serializable, new Annotation[0]);
    }
}
