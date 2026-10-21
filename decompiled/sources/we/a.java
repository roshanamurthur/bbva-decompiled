package we;

import androidx.annotation.NonNull;
import java.io.File;

/* JADX INFO: compiled from: com.google.android.play:feature-delivery@@2.1.0 */
/* JADX INFO: loaded from: classes10.dex */
public final class a extends l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final File f94221a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f94222b;

    public a(File file, String str) {
        this.f94221a = file;
        if (str == null) {
            throw new NullPointerException("Null splitId");
        }
        this.f94222b = str;
    }

    @Override // we.l
    @NonNull
    public final File a() {
        return this.f94221a;
    }

    @Override // we.l
    @NonNull
    public final String b() {
        return this.f94222b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof l) {
            l lVar = (l) obj;
            if (this.f94221a.equals(lVar.a()) && this.f94222b.equals(lVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f94221a.hashCode() ^ 1000003) * 1000003) ^ this.f94222b.hashCode();
    }

    public final String toString() {
        return ad.d.f(ci.a.d("SplitFileInfo{splitFile=", this.f94221a.toString(), ", splitId="), this.f94222b, "}");
    }
}
