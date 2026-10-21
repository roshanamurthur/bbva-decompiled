package com.google.firebase.storage;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public final class ListResult {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<StorageReference> f48994a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<StorageReference> f48995b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final String f48996c;

    public ListResult(@Nullable String str, List list, List list2) {
        this.f48994a = list;
        this.f48995b = list2;
        this.f48996c = str;
    }

    public static ListResult a(FirebaseStorage firebaseStorage, JSONObject jSONObject) throws JSONException {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if (jSONObject.has("prefixes")) {
            JSONArray jSONArray = jSONObject.getJSONArray("prefixes");
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                String string = jSONArray.getString(i10);
                if (string.endsWith("/")) {
                    string = androidx.databinding.e.c(string, 1, 0);
                }
                arrayList.add(firebaseStorage.getReference(string));
            }
        }
        if (jSONObject.has(FirebaseAnalytics.Param.ITEMS)) {
            JSONArray jSONArray2 = jSONObject.getJSONArray(FirebaseAnalytics.Param.ITEMS);
            for (int i11 = 0; i11 < jSONArray2.length(); i11++) {
                arrayList2.add(firebaseStorage.getReference(jSONArray2.getJSONObject(i11).getString("name")));
            }
        }
        return new ListResult(jSONObject.optString("nextPageToken", null), arrayList, arrayList2);
    }

    @NonNull
    public List<StorageReference> getItems() {
        return this.f48995b;
    }

    @Nullable
    public String getPageToken() {
        return this.f48996c;
    }

    @NonNull
    public List<StorageReference> getPrefixes() {
        return this.f48994a;
    }
}
