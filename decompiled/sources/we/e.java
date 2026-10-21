package we;

import com.google.android.play.core.splitcompat.zzn;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;
import java.util.zip.ZipFile;

/* JADX INFO: compiled from: com.google.android.play:feature-delivery@@2.1.0 */
/* JADX INFO: loaded from: classes10.dex */
public final class e implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Set f94228a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f94229b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ zzn f94230c;

    public e(zzn zznVar, HashSet hashSet, l lVar) {
        this.f94230c = zznVar;
        this.f94228a = hashSet;
        this.f94229b = lVar;
    }

    @Override // we.g
    public final void a(ZipFile zipFile, HashSet hashSet) throws IOException {
        Pattern pattern = zzn.f46253b;
        HashSet hashSet2 = new HashSet();
        l lVar = this.f94229b;
        this.f94230c.c(lVar, hashSet, new f(hashSet2, lVar, zipFile));
        this.f94228a.addAll(hashSet2);
    }
}
