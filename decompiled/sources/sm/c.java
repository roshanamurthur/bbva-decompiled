package sm;

import java.math.BigInteger;
import org.bouncycastle.math.field.FiniteField;

/* JADX INFO: loaded from: classes13.dex */
public final class c implements FiniteField {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BigInteger f93236a;

    public c(BigInteger bigInteger) {
        this.f93236a = bigInteger;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof c) {
            return this.f93236a.equals(((c) obj).f93236a);
        }
        return false;
    }

    @Override // org.bouncycastle.math.field.FiniteField
    public final BigInteger getCharacteristic() {
        return this.f93236a;
    }

    @Override // org.bouncycastle.math.field.FiniteField
    public final int getDimension() {
        return 1;
    }

    public final int hashCode() {
        return this.f93236a.hashCode();
    }
}
