package xe;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.play.core.splitinstall.SplitInstallSessionState;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.play:feature-delivery@@2.1.0 */
/* JADX INFO: loaded from: classes10.dex */
public final class q extends s {
    @Override // xe.s, com.google.android.play.core.splitinstall.internal.zzbq
    public final void zzh(List list) throws RemoteException {
        super.zzh(list);
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(SplitInstallSessionState.zzd((Bundle) it.next()));
        }
        this.f94575e.trySetResult(arrayList);
    }
}
