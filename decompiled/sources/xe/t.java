package xe;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.android.play.core.splitinstall.SplitInstallException;
import com.google.android.play.core.splitinstall.internal.zzaf;
import com.google.android.play.core.splitinstall.internal.zzbr;
import com.google.android.play.core.splitinstall.internal.zzbu;
import com.google.android.play.core.splitinstall.internal.zzu;
import com.google.android.play.core.splitinstall.zzak;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: compiled from: com.google.android.play:feature-delivery@@2.1.0 */
/* JADX INFO: loaded from: classes10.dex */
public final class t {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final zzu f94577c = new zzu("SplitInstallService");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Intent f94578d = new Intent("com.google.android.play.core.splitinstall.BIND_SPLIT_INSTALL_SERVICE").setPackage("com.android.vending");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f94579a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    @VisibleForTesting
    public final zzaf f94580b;

    public t(Context context, String str) {
        this.f94579a = str;
        if (zzbu.zza(context)) {
            this.f94580b = new zzaf(zzbr.zza(context), f94577c, "SplitInstallService", f94578d, zzak.zza, null);
        }
    }

    public static /* bridge */ /* synthetic */ ArrayList a(Collection collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            Bundle bundle = new Bundle();
            bundle.putString("language", str);
            arrayList.add(bundle);
        }
        return arrayList;
    }

    public static /* bridge */ /* synthetic */ ArrayList b(Collection collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            Bundle bundle = new Bundle();
            bundle.putString("module_name", str);
            arrayList.add(bundle);
        }
        return arrayList;
    }

    public static Bundle c() {
        Bundle bundle = new Bundle();
        bundle.putInt("playcore_version_code", 11004);
        return bundle;
    }

    public static Task d() {
        f94577c.zzb("onError(%d)", -14);
        return Tasks.forException(new SplitInstallException(-14));
    }
}
