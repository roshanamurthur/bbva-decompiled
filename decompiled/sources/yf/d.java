package yf;

import com.bbva.component.dm.naturalauth.Constants;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: MetaDataStore.java */
/* JADX INFO: loaded from: classes10.dex */
public final class d extends JSONObject {
    public d(String str) throws JSONException {
        put(Constants.backendRequestUserId, str);
    }
}
