package sm;

import org.bouncycastle.math.field.Polynomial;
import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes13.dex */
public final class a implements Polynomial {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int[] f93233a;

    public a(int[] iArr) {
        this.f93233a = Arrays.clone(iArr);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a) {
            return Arrays.areEqual(this.f93233a, ((a) obj).f93233a);
        }
        return false;
    }

    @Override // org.bouncycastle.math.field.Polynomial
    public final int getDegree() {
        int[] iArr = this.f93233a;
        return iArr[iArr.length - 1];
    }

    @Override // org.bouncycastle.math.field.Polynomial
    public final int[] getExponentsPresent() {
        return Arrays.clone(this.f93233a);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f93233a);
    }
}
