package org.junit.experimental.theories.internal;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.junit.experimental.theories.ParameterSignature;
import org.junit.experimental.theories.ParameterSupplier;
import org.junit.experimental.theories.ParametersSuppliedBy;
import org.junit.experimental.theories.PotentialAssignment;
import org.junit.runners.model.TestClass;

/* JADX INFO: loaded from: classes13.dex */
public class Assignments {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<PotentialAssignment> f91835a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<ParameterSignature> f91836b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TestClass f91837c;

    public Assignments(ArrayList arrayList, List list, TestClass testClass) {
        this.f91836b = list;
        this.f91835a = arrayList;
        this.f91837c = testClass;
    }

    public static Assignments allUnassigned(Method method, TestClass testClass) {
        List<ParameterSignature> listSignatures = ParameterSignature.signatures(testClass.getOnlyConstructor());
        listSignatures.addAll(ParameterSignature.signatures(method));
        return new Assignments(new ArrayList(), listSignatures, testClass);
    }

    public Assignments assignNext(PotentialAssignment potentialAssignment) {
        ArrayList arrayList = new ArrayList(this.f91835a);
        arrayList.add(potentialAssignment);
        List<ParameterSignature> list = this.f91836b;
        return new Assignments(arrayList, list.subList(1, list.size()), this.f91837c);
    }

    public Object[] getActualValues(int i10, int i11) throws PotentialAssignment.CouldNotGenerateValueException {
        Object[] objArr = new Object[i11 - i10];
        for (int i12 = i10; i12 < i11; i12++) {
            objArr[i12 - i10] = this.f91835a.get(i12).getValue();
        }
        return objArr;
    }

    public Object[] getAllArguments() throws PotentialAssignment.CouldNotGenerateValueException {
        return getActualValues(0, this.f91835a.size());
    }

    public Object[] getArgumentStrings(boolean z10) throws PotentialAssignment.CouldNotGenerateValueException {
        List<PotentialAssignment> list = this.f91835a;
        int size = list.size();
        Object[] objArr = new Object[size];
        for (int i10 = 0; i10 < size; i10++) {
            objArr[i10] = list.get(i10).getDescription();
        }
        return objArr;
    }

    public Object[] getConstructorArguments() throws PotentialAssignment.CouldNotGenerateValueException {
        return getActualValues(0, ParameterSignature.signatures(this.f91837c.getOnlyConstructor()).size());
    }

    public Object[] getMethodArguments() throws PotentialAssignment.CouldNotGenerateValueException {
        return getActualValues(ParameterSignature.signatures(this.f91837c.getOnlyConstructor()).size(), this.f91835a.size());
    }

    public boolean isComplete() {
        return this.f91836b.isEmpty();
    }

    public ParameterSignature nextUnassigned() {
        return this.f91836b.get(0);
    }

    public List<PotentialAssignment> potentialsForNextUnassigned() throws Throwable {
        ParameterSupplier allMembersSupplier;
        List<PotentialAssignment> valueSources;
        ParameterSignature parameterSignatureNextUnassigned = nextUnassigned();
        ParametersSuppliedBy parametersSuppliedBy = (ParametersSuppliedBy) parameterSignatureNextUnassigned.findDeepAnnotation(ParametersSuppliedBy.class);
        TestClass testClass = this.f91837c;
        if (parametersSuppliedBy != null) {
            Class<? extends ParameterSupplier> clsValue = parametersSuppliedBy.value();
            Constructor<?>[] constructors = clsValue.getConstructors();
            int length = constructors.length;
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    allMembersSupplier = clsValue.newInstance();
                    break;
                }
                Constructor<?> constructor = constructors[i10];
                Class<?>[] parameterTypes = constructor.getParameterTypes();
                if (parameterTypes.length == 1 && parameterTypes[0].equals(TestClass.class)) {
                    allMembersSupplier = (ParameterSupplier) constructor.newInstance(testClass);
                    break;
                }
                i10++;
            }
        } else {
            allMembersSupplier = new AllMembersSupplier(testClass);
        }
        List<PotentialAssignment> valueSources2 = allMembersSupplier.getValueSources(parameterSignatureNextUnassigned);
        if (!valueSources2.isEmpty()) {
            return valueSources2;
        }
        Class<?> type = parameterSignatureNextUnassigned.getType();
        if (type.isEnum()) {
            valueSources = new EnumSupplier(type).getValueSources(parameterSignatureNextUnassigned);
        } else {
            valueSources = (type.equals(Boolean.class) || type.equals(Boolean.TYPE)) ? new BooleanSupplier().getValueSources(parameterSignatureNextUnassigned) : Collections.emptyList();
        }
        return valueSources;
    }
}
