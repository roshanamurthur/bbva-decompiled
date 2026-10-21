package gh;

import com.google.zxing.oned.rss.DataCharacter;
import com.google.zxing.oned.rss.FinderPattern;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: compiled from: ExpandedPair.java */
/* JADX INFO: loaded from: classes10.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DataCharacter f68612a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final DataCharacter f68613b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final FinderPattern f68614c;

    public a(DataCharacter dataCharacter, DataCharacter dataCharacter2, FinderPattern finderPattern) {
        this.f68612a = dataCharacter;
        this.f68613b = dataCharacter2;
        this.f68614c = finderPattern;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        DataCharacter dataCharacter = aVar.f68612a;
        DataCharacter dataCharacter2 = this.f68612a;
        if (dataCharacter2 != null ? dataCharacter2.equals(dataCharacter) : dataCharacter == null) {
            DataCharacter dataCharacter3 = this.f68613b;
            DataCharacter dataCharacter4 = aVar.f68613b;
            if (dataCharacter3 != null ? dataCharacter3.equals(dataCharacter4) : dataCharacter4 == null) {
                FinderPattern finderPattern = this.f68614c;
                FinderPattern finderPattern2 = aVar.f68614c;
                if (finderPattern == null) {
                    if (finderPattern2 == null) {
                        return true;
                    }
                } else if (finderPattern.equals(finderPattern2)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        DataCharacter dataCharacter = this.f68612a;
        int iHashCode = dataCharacter == null ? 0 : dataCharacter.hashCode();
        DataCharacter dataCharacter2 = this.f68613b;
        int iHashCode2 = iHashCode ^ (dataCharacter2 == null ? 0 : dataCharacter2.hashCode());
        FinderPattern finderPattern = this.f68614c;
        return (finderPattern != null ? finderPattern.hashCode() : 0) ^ iHashCode2;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("[ ");
        sb2.append(this.f68612a);
        sb2.append(" , ");
        sb2.append(this.f68613b);
        sb2.append(" : ");
        FinderPattern finderPattern = this.f68614c;
        return androidx.camera.core.impl.a.e(sb2, finderPattern == null ? AbstractJsonLexerKt.NULL : Integer.valueOf(finderPattern.getValue()), " ]");
    }
}
