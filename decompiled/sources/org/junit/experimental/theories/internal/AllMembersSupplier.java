package org.junit.experimental.theories.internal;

import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import mx.openpay.library.domain.util.Constant;
import org.junit.Assume;
import org.junit.experimental.theories.DataPoint;
import org.junit.experimental.theories.DataPoints;
import org.junit.experimental.theories.ParameterSignature;
import org.junit.experimental.theories.ParameterSupplier;
import org.junit.experimental.theories.PotentialAssignment;
import org.junit.runners.model.FrameworkField;
import org.junit.runners.model.FrameworkMethod;
import org.junit.runners.model.TestClass;

/* JADX INFO: loaded from: classes13.dex */
public class AllMembersSupplier extends ParameterSupplier {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TestClass f91833a;

    public static class a extends PotentialAssignment {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final FrameworkMethod f91834a;

        public a(FrameworkMethod frameworkMethod) {
            this.f91834a = frameworkMethod;
        }

        @Override // org.junit.experimental.theories.PotentialAssignment
        public final String getDescription() throws PotentialAssignment.CouldNotGenerateValueException {
            return this.f91834a.getName();
        }

        @Override // org.junit.experimental.theories.PotentialAssignment
        public final Object getValue() throws PotentialAssignment.CouldNotGenerateValueException {
            FrameworkMethod frameworkMethod = this.f91834a;
            boolean z10 = false;
            try {
                return frameworkMethod.invokeExplosively(null, new Object[0]);
            } catch (IllegalAccessException unused) {
                throw new RuntimeException("unexpected: getMethods returned an inaccessible method");
            } catch (IllegalArgumentException unused2) {
                throw new RuntimeException("unexpected: argument length is checked");
            } catch (Throwable th2) {
                DataPoint dataPoint = (DataPoint) frameworkMethod.getAnnotation(DataPoint.class);
                if (dataPoint != null) {
                    for (Class<? extends Throwable> cls : dataPoint.ignoredExceptions()) {
                        if (!cls.isAssignableFrom(th2.getClass())) {
                        }
                    }
                    z10 = true;
                } else {
                    z10 = true;
                }
                Assume.assumeTrue(z10);
                throw new PotentialAssignment.CouldNotGenerateValueException(th2);
            }
        }
    }

    public AllMembersSupplier(TestClass testClass) {
        this.f91833a = testClass;
    }

    public static void a(Class cls, ParameterSignature parameterSignature, String str, ArrayList arrayList, Object obj) {
        int i10 = 0;
        if (cls.isArray()) {
            while (i10 < Array.getLength(obj)) {
                Object obj2 = Array.get(obj, i10);
                if (parameterSignature.canAcceptValue(obj2)) {
                    arrayList.add(PotentialAssignment.forValue(str + Constant.BRACKET_OPEN + i10 + Constant.BRACKET_CLOSE, obj2));
                }
                i10++;
            }
            return;
        }
        if (Iterable.class.isAssignableFrom(cls)) {
            for (Object obj3 : (Iterable) obj) {
                if (parameterSignature.canAcceptValue(obj3)) {
                    arrayList.add(PotentialAssignment.forValue(str + Constant.BRACKET_OPEN + i10 + Constant.BRACKET_CLOSE, obj3));
                }
                i10++;
            }
        }
    }

    public Collection<Field> getDataPointsFields(ParameterSignature parameterSignature) {
        List<FrameworkField> annotatedFields = this.f91833a.getAnnotatedFields(DataPoints.class);
        ArrayList arrayList = new ArrayList();
        Iterator<FrameworkField> it = annotatedFields.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getField());
        }
        return arrayList;
    }

    public Collection<FrameworkMethod> getDataPointsMethods(ParameterSignature parameterSignature) {
        return this.f91833a.getAnnotatedMethods(DataPoints.class);
    }

    public Collection<Field> getSingleDataPointFields(ParameterSignature parameterSignature) {
        List<FrameworkField> annotatedFields = this.f91833a.getAnnotatedFields(DataPoint.class);
        ArrayList arrayList = new ArrayList();
        Iterator<FrameworkField> it = annotatedFields.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getField());
        }
        return arrayList;
    }

    public Collection<FrameworkMethod> getSingleDataPointMethods(ParameterSignature parameterSignature) {
        return this.f91833a.getAnnotatedMethods(DataPoint.class);
    }

    @Override // org.junit.experimental.theories.ParameterSupplier
    public List<PotentialAssignment> getValueSources(ParameterSignature parameterSignature) throws Throwable {
        ArrayList arrayList = new ArrayList();
        for (Field field : getSingleDataPointFields(parameterSignature)) {
            try {
                Object obj = field.get(null);
                if (parameterSignature.canAcceptValue(obj)) {
                    arrayList.add(PotentialAssignment.forValue(field.getName(), obj));
                }
            } catch (IllegalAccessException unused) {
                throw new RuntimeException("unexpected: getFields returned an inaccessible field");
            } catch (IllegalArgumentException unused2) {
                throw new RuntimeException("unexpected: field from getClass doesn't exist on object");
            }
        }
        for (Field field2 : getDataPointsFields(parameterSignature)) {
            try {
                a(field2.getType(), parameterSignature, field2.getName(), arrayList, field2.get(null));
            } catch (IllegalAccessException unused3) {
                throw new RuntimeException("unexpected: getFields returned an inaccessible field");
            } catch (IllegalArgumentException unused4) {
                throw new RuntimeException("unexpected: field from getClass doesn't exist on object");
            }
        }
        for (FrameworkMethod frameworkMethod : getSingleDataPointMethods(parameterSignature)) {
            if (parameterSignature.canAcceptType(frameworkMethod.getType())) {
                arrayList.add(new a(frameworkMethod));
            }
        }
        for (FrameworkMethod frameworkMethod2 : getDataPointsMethods(parameterSignature)) {
            Class<?> returnType = frameworkMethod2.getReturnType();
            if ((returnType.isArray() && parameterSignature.canPotentiallyAcceptType(returnType.getComponentType())) || Iterable.class.isAssignableFrom(returnType)) {
                try {
                    a(returnType, parameterSignature, frameworkMethod2.getName(), arrayList, frameworkMethod2.invokeExplosively(null, new Object[0]));
                } catch (Throwable th2) {
                    DataPoints dataPoints = (DataPoints) frameworkMethod2.getAnnotation(DataPoints.class);
                    if (dataPoints != null) {
                        for (Class<? extends Throwable> cls : dataPoints.ignoredExceptions()) {
                            if (!cls.isAssignableFrom(th2.getClass())) {
                            }
                        }
                    }
                    throw th2;
                }
            }
        }
        return arrayList;
    }
}
