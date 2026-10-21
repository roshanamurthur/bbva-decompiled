package mg;

import android.util.Log;
import com.google.firebase.FirebaseAppLifecycleListener;
import com.google.firebase.FirebaseOptions;
import com.google.firebase.sessions.SessionsActivityLifecycleCallbacks;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class a implements FirebaseAppLifecycleListener {
    @Override // com.google.firebase.FirebaseAppLifecycleListener
    public final void onDeleted(String str, FirebaseOptions firebaseOptions) {
        Log.w("FirebaseSessions", "FirebaseApp instance deleted. Sessions library will stop collecting data.");
        SessionsActivityLifecycleCallbacks.INSTANCE.setLifecycleClient(null);
    }
}
