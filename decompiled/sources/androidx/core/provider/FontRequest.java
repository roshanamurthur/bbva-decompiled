package androidx.core.provider;

import android.util.Base64;
import androidx.annotation.ArrayRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.camera.camera2.internal.compat.u;
import androidx.core.util.Preconditions;
import java.util.List;
import mx.openpay.library.domain.util.Constant;

/* JADX INFO: loaded from: classes2.dex */
public final class FontRequest {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f20014a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f20015b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f20016c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List<List<byte[]>> f20017d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f20018e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f20019f;

    public FontRequest(@NonNull String str, @NonNull String str2, @NonNull String str3, @NonNull List<List<byte[]>> list) {
        this.f20014a = (String) Preconditions.checkNotNull(str);
        this.f20015b = (String) Preconditions.checkNotNull(str2);
        this.f20016c = (String) Preconditions.checkNotNull(str3);
        this.f20017d = (List) Preconditions.checkNotNull(list);
        this.f20018e = 0;
        this.f20019f = u.g(str, Constant.DASH_STRING, str2, Constant.DASH_STRING, str3);
    }

    @Nullable
    public List<List<byte[]>> getCertificates() {
        return this.f20017d;
    }

    @ArrayRes
    public int getCertificatesArrayResId() {
        return this.f20018e;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @Deprecated
    public String getIdentifier() {
        return this.f20019f;
    }

    @NonNull
    public String getProviderAuthority() {
        return this.f20014a;
    }

    @NonNull
    public String getProviderPackage() {
        return this.f20015b;
    }

    @NonNull
    public String getQuery() {
        return this.f20016c;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("FontRequest {mProviderAuthority: " + this.f20014a + ", mProviderPackage: " + this.f20015b + ", mQuery: " + this.f20016c + ", mCertificates:");
        int i10 = 0;
        while (true) {
            List<List<byte[]>> list = this.f20017d;
            if (i10 >= list.size()) {
                sb2.append("}");
                sb2.append("mCertificatesArray: " + this.f20018e);
                return sb2.toString();
            }
            sb2.append(" [");
            List<byte[]> list2 = list.get(i10);
            for (int i11 = 0; i11 < list2.size(); i11++) {
                sb2.append(" \"");
                sb2.append(Base64.encodeToString(list2.get(i11), 0));
                sb2.append("\"");
            }
            sb2.append(" ]");
            i10++;
        }
    }

    public FontRequest(@NonNull String str, @NonNull String str2, @NonNull String str3, @ArrayRes int i10) {
        this.f20014a = (String) Preconditions.checkNotNull(str);
        this.f20015b = (String) Preconditions.checkNotNull(str2);
        this.f20016c = (String) Preconditions.checkNotNull(str3);
        this.f20017d = null;
        Preconditions.checkArgument(i10 != 0);
        this.f20018e = i10;
        this.f20019f = u.g(str, Constant.DASH_STRING, str2, Constant.DASH_STRING, str3);
    }
}
