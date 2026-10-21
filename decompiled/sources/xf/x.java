package xf;

import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import java.util.Comparator;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class x implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return ((CrashlyticsReport.CustomAttribute) obj).getKey().compareTo(((CrashlyticsReport.CustomAttribute) obj2).getKey());
    }
}
