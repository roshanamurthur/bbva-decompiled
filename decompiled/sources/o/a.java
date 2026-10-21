package o;

import androidx.annotation.Nullable;
import java.util.Arrays;

/* JADX INFO: compiled from: BiometricErrorData.java */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f85226a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final CharSequence f85227b;

    public a(int i10, @Nullable CharSequence charSequence) {
        this.f85226a = i10;
        this.f85227b = charSequence;
    }

    public final boolean equals(@Nullable Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (this.f85226a != aVar.f85226a) {
            return false;
        }
        CharSequence charSequence = this.f85227b;
        String string = charSequence != null ? charSequence.toString() : null;
        CharSequence charSequence2 = aVar.f85227b;
        String string2 = charSequence2 != null ? charSequence2.toString() : null;
        return (string == null && string2 == null) || (string != null && string.equals(string2));
    }

    public final int hashCode() {
        Object[] objArr = new Object[2];
        objArr[0] = Integer.valueOf(this.f85226a);
        CharSequence charSequence = this.f85227b;
        objArr[1] = charSequence != null ? charSequence.toString() : null;
        return Arrays.hashCode(objArr);
    }
}
