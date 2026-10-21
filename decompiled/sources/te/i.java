package te;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.play.core.integrity.q;
import com.google.android.play.integrity.internal.k;
import com.google.android.play.integrity.internal.v;
import com.google.android.play.integrity.internal.y;
import com.noknok.android.client.appsdk_plus.IAppSDKPlus;
import java.util.ArrayList;

/* JADX INFO: compiled from: com.google.android.play:integrity@@1.1.0 */
/* JADX INFO: loaded from: classes10.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f93557a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f93558b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    @VisibleForTesting
    public final v f93559c;

    public i(Context context, k kVar) {
        this.f93558b = context.getPackageName();
        this.f93557a = kVar;
        if (y.a(context)) {
            this.f93559c = new v(context, kVar, "IntegrityService", j.f93560a, q.f46134a, null, null);
        } else {
            kVar.b("Phonesky is not installed.", new Object[0]);
            this.f93559c = null;
        }
    }

    public static /* bridge */ /* synthetic */ Bundle a(i iVar, byte[] bArr, Long l6) {
        Bundle bundle = new Bundle();
        bundle.putString("package.name", iVar.f93558b);
        bundle.putByteArray(IAppSDKPlus.EXTRA_KEY_NONCE, bArr);
        bundle.putInt("playcore.integrity.version.major", 1);
        bundle.putInt("playcore.integrity.version.minor", 1);
        bundle.putInt("playcore.integrity.version.patch", 0);
        if (l6 != null) {
            bundle.putLong("cloud.prj", l6.longValue());
        }
        ArrayList<com.google.android.play.integrity.internal.e> arrayList = new ArrayList();
        arrayList.add(com.google.android.play.integrity.internal.e.c(3, System.currentTimeMillis()));
        ArrayList arrayList2 = new ArrayList();
        for (com.google.android.play.integrity.internal.e eVar : arrayList) {
            Bundle bundle2 = new Bundle();
            bundle2.putInt("event_type", 3);
            bundle2.putLong("event_timestamp", eVar.b());
            arrayList2.add(bundle2);
        }
        bundle.putParcelableArrayList("event_timestamps", new ArrayList<>(arrayList2));
        return bundle;
    }
}
