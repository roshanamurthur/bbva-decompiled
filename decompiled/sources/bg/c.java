package bg;

import com.google.firebase.crashlytics.internal.common.CurrentTimeProvider;
import com.google.firebase.crashlytics.internal.settings.Settings;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: SettingsJsonTransform.java */
/* JADX INFO: loaded from: classes10.dex */
public interface c {
    Settings a(CurrentTimeProvider currentTimeProvider, JSONObject jSONObject) throws JSONException;
}
