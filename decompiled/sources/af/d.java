package af;

import com.google.android.play.core.splitinstall.internal.f;
import com.google.android.play.core.splitinstall.internal.zzan;
import com.google.android.play.core.splitinstall.internal.zzax;
import com.google.android.play.core.splitinstall.internal.zzbh;
import com.google.android.play.core.splitinstall.internal.zzbj;
import com.google.android.play.core.splitinstall.internal.zzbk;
import com.google.android.play.core.splitinstall.zzn;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.digests.SHA1Digest;
import org.bouncycastle.crypto.digests.SHA224Digest;
import org.bouncycastle.crypto.digests.SHA256Digest;
import org.bouncycastle.crypto.digests.SHA384Digest;
import org.bouncycastle.crypto.digests.SHA512Digest;
import org.bouncycastle.pqc.jcajce.spec.McElieceCCA2KeyGenParameterSpec;

/* JADX INFO: compiled from: com.google.mlkit:barcode-scanning@@17.0.2 */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class d implements zzan {
    public static Digest a(String str) {
        if (str.equals(McElieceCCA2KeyGenParameterSpec.SHA1)) {
            return new SHA1Digest();
        }
        if (str.equals(McElieceCCA2KeyGenParameterSpec.SHA224)) {
            return new SHA224Digest();
        }
        if (str.equals("SHA-256")) {
            return new SHA256Digest();
        }
        if (str.equals(McElieceCCA2KeyGenParameterSpec.SHA384)) {
            return new SHA384Digest();
        }
        if (str.equals("SHA-512")) {
            return new SHA512Digest();
        }
        throw new IllegalArgumentException("unrecognised digest algorithm: ".concat(str));
    }

    public static void b(ClassLoader classLoader, Set set, zzax zzaxVar) {
        if (set.isEmpty()) {
            return;
        }
        HashSet hashSet = new HashSet();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            hashSet.add(((File) it.next()).getParentFile());
        }
        Object objZzc = zzbk.zzb(classLoader, "pathList", Object.class).zzc();
        zzbj zzbjVarZzb = zzbk.zzb(objZzc, "nativeLibraryDirectories", List.class);
        synchronized (zzn.class) {
            ArrayList arrayList = new ArrayList((Collection) zzbjVarZzb.zzc());
            hashSet.removeAll(arrayList);
            arrayList.addAll(hashSet);
            zzbjVarZzb.zze(arrayList);
        }
        ArrayList arrayList2 = new ArrayList();
        Object[] objArrZza = zzaxVar.zza(objZzc, new ArrayList(hashSet), null, arrayList2);
        if (arrayList2.isEmpty()) {
            synchronized (zzn.class) {
                zzbk.zza(objZzc, "nativeLibraryPathElements", Object.class).zzb(Arrays.asList(objArrZza));
            }
            return;
        }
        zzbh zzbhVar = new zzbh("Error in makePathElements");
        int size = arrayList2.size();
        for (int i10 = 0; i10 < size; i10++) {
            try {
                Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(zzbhVar, (IOException) arrayList2.get(i10));
            } catch (Exception unused) {
            }
        }
        throw zzbhVar;
    }

    @Override // com.google.android.play.core.splitinstall.internal.zzan
    public void zza(ClassLoader classLoader, Set set) {
        b(classLoader, set, new c());
    }

    @Override // com.google.android.play.core.splitinstall.internal.zzan
    public boolean zzb(ClassLoader classLoader, File file, File file2, boolean z10) {
        return f.a(classLoader, file, file2, z10, new b(), "zip", new a());
    }
}
