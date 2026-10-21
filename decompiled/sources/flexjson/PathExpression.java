package flexjson;

import androidx.webkit.ProxyConfig;
import java.util.Arrays;
import mx.openpay.library.domain.util.Constant;

/* JADX INFO: loaded from: classes7.dex */
public class PathExpression {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String[] f68503a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f68504b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f68505c;

    public PathExpression(String str, boolean z10) {
        this.f68504b = false;
        this.f68505c = true;
        this.f68503a = str.split("\\.");
        this.f68504b = str.indexOf(42) >= 0;
        this.f68505c = z10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && Arrays.equals(this.f68503a, ((PathExpression) obj).f68503a);
    }

    public int hashCode() {
        String[] strArr = this.f68503a;
        if (strArr != null) {
            return Arrays.hashCode(strArr);
        }
        return 0;
    }

    public boolean isIncluded() {
        return this.f68505c;
    }

    public boolean isWildcard() {
        return this.f68504b;
    }

    public boolean matches(Path path) {
        int i10 = 0;
        int i11 = 0;
        while (true) {
            int length = path.length();
            String[] strArr = this.f68503a;
            if (i10 >= length) {
                if (i11 <= 0 || !strArr[i11 - 1].equals(ProxyConfig.MATCH_ALL_SCHEMES)) {
                    return i10 >= path.length() && path.length() > 0;
                }
                return i10 >= path.length() && i11 >= strArr.length;
            }
            String str = path.getPath().get(i10);
            if (i11 >= strArr.length || !strArr[i11].equals(ProxyConfig.MATCH_ALL_SCHEMES)) {
                if (i11 >= strArr.length || !strArr[i11].equals(str)) {
                    int i12 = i11 - 1;
                    if (i12 < 0 || !strArr[i12].equals(ProxyConfig.MATCH_ALL_SCHEMES)) {
                        return false;
                    }
                    i10++;
                } else {
                    i10++;
                }
            }
            i11++;
        }
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(Constant.BRACKET_OPEN);
        int i10 = 0;
        while (true) {
            String[] strArr = this.f68503a;
            if (i10 >= strArr.length) {
                sb2.append(Constant.BRACKET_CLOSE);
                return sb2.toString();
            }
            sb2.append(strArr[i10]);
            if (i10 < strArr.length - 1) {
                sb2.append(",");
            }
            i10++;
        }
    }
}
