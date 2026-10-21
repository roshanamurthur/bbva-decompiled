package junit.framework;

import ad.d;
import androidx.camera.core.impl.utils.c;
import mx.openpay.library.domain.util.Constant;

/* JADX INFO: loaded from: classes12.dex */
public class ComparisonCompactor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f79115a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f79116b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f79117c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f79118d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f79119e;

    public ComparisonCompactor(int i10, String str, String str2) {
        this.f79115a = i10;
        this.f79116b = str;
        this.f79117c = str2;
    }

    public final String a(String str) {
        String strF = d.f(new StringBuilder(Constant.BRACKET_OPEN), str.substring(this.f79118d, (str.length() - this.f79119e) + 1), Constant.BRACKET_CLOSE);
        int i10 = this.f79118d;
        String str2 = this.f79116b;
        int i11 = this.f79115a;
        if (i10 > 0) {
            StringBuilder sb2 = new StringBuilder();
            StringBuilder sb3 = new StringBuilder();
            sb3.append(this.f79118d > i11 ? "..." : "");
            sb3.append(str2.substring(Math.max(0, this.f79118d - i11), this.f79118d));
            sb2.append(sb3.toString());
            sb2.append(strF);
            strF = sb2.toString();
        }
        if (this.f79119e <= 0) {
            return strF;
        }
        StringBuilder sbD = c.d(strF);
        int iMin = Math.min((str2.length() - this.f79119e) + 1 + i11, str2.length());
        StringBuilder sb4 = new StringBuilder();
        sb4.append(str2.substring((str2.length() - this.f79119e) + 1, iMin));
        sb4.append((str2.length() - this.f79119e) + 1 < str2.length() - i11 ? "..." : "");
        sbD.append(sb4.toString());
        return sbD.toString();
    }

    public String compact(String str) {
        String str2 = this.f79117c;
        String str3 = this.f79116b;
        if (str3 == null || str2 == null || str3.equals(str2)) {
            return Assert.format(str, str3, str2);
        }
        this.f79118d = 0;
        int iMin = Math.min(str3.length(), str2.length());
        while (true) {
            int i10 = this.f79118d;
            if (i10 >= iMin || str3.charAt(i10) != str2.charAt(this.f79118d)) {
                break;
            }
            this.f79118d++;
        }
        int length = str3.length() - 1;
        int length2 = str2.length() - 1;
        while (true) {
            int i11 = this.f79118d;
            if (length2 < i11 || length < i11 || str3.charAt(length) != str2.charAt(length2)) {
                break;
            }
            length2--;
            length--;
        }
        this.f79119e = str3.length() - length;
        return Assert.format(str, a(str3), a(str2));
    }
}
