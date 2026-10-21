package ae;

import android.app.job.JobInfo;
import android.net.Uri;
import io.reactivex.rxjava3.core.SingleObserver;
import java.util.concurrent.CompletionStage;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class c {
    public static /* synthetic */ JobInfo.TriggerContentUri a(Uri uri, int i10) {
        return new JobInfo.TriggerContentUri(uri, i10);
    }

    public static /* bridge */ /* synthetic */ CompletionStage e(SingleObserver singleObserver) {
        return (CompletionStage) singleObserver;
    }
}
