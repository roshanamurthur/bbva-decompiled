package we;

import com.google.android.play.core.splitcompat.zzn;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Pattern;
import java.util.zip.ZipFile;

/* JADX INFO: compiled from: com.google.android.play:feature-delivery@@2.1.0 */
/* JADX INFO: loaded from: classes10.dex */
public final class d implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ l f94224a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Set f94225b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AtomicBoolean f94226c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zzn f94227d;

    public d(zzn zznVar, l lVar, HashSet hashSet, AtomicBoolean atomicBoolean) {
        this.f94227d = zznVar;
        this.f94224a = lVar;
        this.f94225b = hashSet;
        this.f94226c = atomicBoolean;
    }

    @Override // we.g
    public final void a(ZipFile zipFile, HashSet hashSet) throws IOException {
        c cVar = new c(this);
        Pattern pattern = zzn.f46253b;
        this.f94227d.c(this.f94224a, hashSet, cVar);
    }
}
