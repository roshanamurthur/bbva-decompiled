package org.junit.experimental.theories.internal;

import java.util.ArrayList;
import java.util.List;
import org.junit.experimental.theories.ParameterSignature;
import org.junit.experimental.theories.ParameterSupplier;
import org.junit.experimental.theories.PotentialAssignment;

/* JADX INFO: loaded from: classes13.dex */
public class EnumSupplier extends ParameterSupplier {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class<?> f91838a;

    public EnumSupplier(Class<?> cls) {
        this.f91838a = cls;
    }

    @Override // org.junit.experimental.theories.ParameterSupplier
    public List<PotentialAssignment> getValueSources(ParameterSignature parameterSignature) {
        Object[] enumConstants = this.f91838a.getEnumConstants();
        ArrayList arrayList = new ArrayList();
        for (Object obj : enumConstants) {
            arrayList.add(PotentialAssignment.forValue(obj.toString(), obj));
        }
        return arrayList;
    }
}
