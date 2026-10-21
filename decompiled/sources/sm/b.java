package sm;

import java.math.BigInteger;
import org.bouncycastle.math.field.FiniteField;
import org.bouncycastle.math.field.Polynomial;
import org.bouncycastle.math.field.PolynomialExtensionField;
import org.bouncycastle.util.Integers;

/* JADX INFO: loaded from: classes13.dex */
public final class b implements PolynomialExtensionField {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FiniteField f93234a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Polynomial f93235b;

    public b(c cVar, a aVar) {
        this.f93234a = cVar;
        this.f93235b = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f93234a.equals(bVar.f93234a) && this.f93235b.equals(bVar.f93235b);
    }

    @Override // org.bouncycastle.math.field.FiniteField
    public final BigInteger getCharacteristic() {
        return this.f93234a.getCharacteristic();
    }

    @Override // org.bouncycastle.math.field.ExtensionField
    public final int getDegree() {
        return this.f93235b.getDegree();
    }

    @Override // org.bouncycastle.math.field.FiniteField
    public final int getDimension() {
        return this.f93235b.getDegree() * this.f93234a.getDimension();
    }

    @Override // org.bouncycastle.math.field.PolynomialExtensionField
    public final Polynomial getMinimalPolynomial() {
        return this.f93235b;
    }

    @Override // org.bouncycastle.math.field.ExtensionField
    public final FiniteField getSubfield() {
        return this.f93234a;
    }

    public final int hashCode() {
        return this.f93234a.hashCode() ^ Integers.rotateLeft(this.f93235b.hashCode(), 16);
    }
}
