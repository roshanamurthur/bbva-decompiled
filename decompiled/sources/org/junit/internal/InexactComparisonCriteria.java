package org.junit.internal;

import org.junit.Assert;

/* JADX INFO: loaded from: classes13.dex */
public class InexactComparisonCriteria extends ComparisonCriteria {
    public Object fDelta;

    public InexactComparisonCriteria(double d2) {
        this.fDelta = Double.valueOf(d2);
    }

    @Override // org.junit.internal.ComparisonCriteria
    public void assertElementsEqual(Object obj, Object obj2) {
        if (obj instanceof Double) {
            Assert.assertEquals(((Double) obj).doubleValue(), ((Double) obj2).doubleValue(), ((Double) this.fDelta).doubleValue());
        } else {
            Assert.assertEquals(((Float) obj).floatValue(), ((Float) obj2).floatValue(), ((Float) this.fDelta).floatValue());
        }
    }

    public InexactComparisonCriteria(float f6) {
        this.fDelta = Float.valueOf(f6);
    }
}
