package org.junit.internal;

import java.util.ArrayList;
import java.util.Iterator;
import mx.openpay.library.domain.util.Constant;

/* JADX INFO: loaded from: classes13.dex */
public class ArrayComparisonFailure extends AssertionError {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final ArrayList f91839p0 = new ArrayList();

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final String f91840q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final AssertionError f91841r0;

    public ArrayComparisonFailure(String str, AssertionError assertionError, int i10) {
        this.f91840q0 = str;
        this.f91841r0 = assertionError;
        initCause(assertionError);
        addDimension(i10);
    }

    public void addDimension(int i10) {
        this.f91839p0.add(0, Integer.valueOf(i10));
    }

    @Override // java.lang.Throwable
    public synchronized Throwable getCause() {
        try {
        } catch (Throwable th2) {
            throw th2;
        }
        return super.getCause() == null ? this.f91841r0 : super.getCause();
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        StringBuilder sb2 = new StringBuilder();
        String str = this.f91840q0;
        if (str != null) {
            sb2.append(str);
        }
        sb2.append("arrays first differed at element ");
        Iterator it = this.f91839p0.iterator();
        while (it.hasNext()) {
            int iIntValue = ((Integer) it.next()).intValue();
            sb2.append(Constant.BRACKET_OPEN);
            sb2.append(iIntValue);
            sb2.append(Constant.BRACKET_CLOSE);
        }
        sb2.append("; ");
        sb2.append(getCause().getMessage());
        return sb2.toString();
    }

    @Override // java.lang.Throwable
    public String toString() {
        return getMessage();
    }
}
