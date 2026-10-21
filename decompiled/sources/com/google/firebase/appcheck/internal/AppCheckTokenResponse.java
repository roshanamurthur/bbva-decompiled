package com.google.firebase.appcheck.internal;

import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Strings;
import com.google.firebase.FirebaseException;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class AppCheckTokenResponse {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f47593a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f47594b;

    @NonNull
    public static AppCheckTokenResponse fromJsonString(@NonNull String str) throws FirebaseException, JSONException {
        JSONObject jSONObject = new JSONObject(str);
        String strEmptyToNull = Strings.emptyToNull(jSONObject.optString("token"));
        String strEmptyToNull2 = Strings.emptyToNull(jSONObject.optString("ttl"));
        if (strEmptyToNull == null || strEmptyToNull2 == null) {
            throw new FirebaseException("Unexpected server response.");
        }
        AppCheckTokenResponse appCheckTokenResponse = new AppCheckTokenResponse();
        Preconditions.checkNotNull(strEmptyToNull);
        Preconditions.checkNotNull(strEmptyToNull2);
        appCheckTokenResponse.f47593a = strEmptyToNull;
        appCheckTokenResponse.f47594b = strEmptyToNull2;
        return appCheckTokenResponse;
    }

    @NonNull
    public String getTimeToLive() {
        return this.f47594b;
    }

    @NonNull
    public String getToken() {
        return this.f47593a;
    }
}
