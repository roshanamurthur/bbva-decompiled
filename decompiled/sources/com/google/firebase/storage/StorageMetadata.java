package com.google.firebase.storage;

import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.firebase.storage.internal.Slashes;
import com.google.firebase.storage.internal.Util;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class StorageMetadata {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f49007a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final FirebaseStorage f49008b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public StorageReference f49009c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f49010d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f49011e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public a<String> f49012f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f49013g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f49014h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f49015i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f49016j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f49017k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public a<String> f49018l;
    public a<String> m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public a<String> f49019n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public a<String> f49020o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public a<Map<String, String>> f49021p;

    public static class a<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f49024a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        public final T f49025b;

        public a(@Nullable T t10, boolean z10) {
            this.f49024a = z10;
            this.f49025b = t10;
        }

        public static <T> a<T> a(T t10) {
            return new a<>(t10, false);
        }

        public static <T> a<T> b(@Nullable T t10) {
            return new a<>(t10, true);
        }
    }

    public StorageMetadata() {
        this.f49007a = null;
        this.f49008b = null;
        this.f49009c = null;
        this.f49010d = null;
        this.f49011e = null;
        this.f49012f = a.a("");
        this.f49013g = null;
        this.f49014h = null;
        this.f49015i = null;
        this.f49017k = null;
        this.f49018l = a.a("");
        this.m = a.a("");
        this.f49019n = a.a("");
        this.f49020o = a.a("");
        this.f49021p = a.a(Collections.emptyMap());
    }

    @NonNull
    public final JSONObject a() {
        HashMap map = new HashMap();
        if (this.f49012f.f49024a) {
            map.put("contentType", getContentType());
        }
        if (this.f49021p.f49024a) {
            map.put("metadata", new JSONObject(this.f49021p.f49025b));
        }
        if (this.f49018l.f49024a) {
            map.put("cacheControl", getCacheControl());
        }
        if (this.m.f49024a) {
            map.put("contentDisposition", getContentDisposition());
        }
        if (this.f49019n.f49024a) {
            map.put("contentEncoding", getContentEncoding());
        }
        if (this.f49020o.f49024a) {
            map.put("contentLanguage", getContentLanguage());
        }
        return new JSONObject(map);
    }

    @Nullable
    public String getBucket() {
        return this.f49010d;
    }

    @Nullable
    public String getCacheControl() {
        return this.f49018l.f49025b;
    }

    @Nullable
    public String getContentDisposition() {
        return this.m.f49025b;
    }

    @Nullable
    public String getContentEncoding() {
        return this.f49019n.f49025b;
    }

    @Nullable
    public String getContentLanguage() {
        return this.f49020o.f49025b;
    }

    @Nullable
    public String getContentType() {
        return this.f49012f.f49025b;
    }

    public long getCreationTimeMillis() {
        return Util.parseDateTime(this.f49014h);
    }

    @Nullable
    public String getCustomMetadata(@NonNull String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return this.f49021p.f49025b.get(str);
    }

    @NonNull
    public Set<String> getCustomMetadataKeys() {
        return this.f49021p.f49025b.keySet();
    }

    @Nullable
    public String getGeneration() {
        return this.f49011e;
    }

    @Nullable
    public String getMd5Hash() {
        return this.f49017k;
    }

    @Nullable
    public String getMetadataGeneration() {
        return this.f49013g;
    }

    @Nullable
    public String getName() {
        String path = getPath();
        if (TextUtils.isEmpty(path)) {
            return null;
        }
        int iLastIndexOf = path.lastIndexOf(47);
        return iLastIndexOf != -1 ? path.substring(iLastIndexOf + 1) : path;
    }

    @NonNull
    public String getPath() {
        String str = this.f49007a;
        return str != null ? str : "";
    }

    @Nullable
    public StorageReference getReference() {
        FirebaseStorage firebaseStorage;
        StorageReference storageReference = this.f49009c;
        if (storageReference != null || (firebaseStorage = this.f49008b) == null) {
            return storageReference;
        }
        String bucket = getBucket();
        String path = getPath();
        if (TextUtils.isEmpty(bucket) || TextUtils.isEmpty(path)) {
            return null;
        }
        return new StorageReference(new Uri.Builder().scheme("gs").authority(bucket).encodedPath(Slashes.preserveSlashEncode(path)).build(), firebaseStorage);
    }

    public long getSizeBytes() {
        return this.f49016j;
    }

    public long getUpdatedTimeMillis() {
        return Util.parseDateTime(this.f49015i);
    }

    public static class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final StorageMetadata f49022a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f49023b;

        public Builder() {
            this.f49022a = new StorageMetadata();
        }

        @Nullable
        public static String a(JSONObject jSONObject, String str) throws JSONException {
            if (!jSONObject.has(str) || jSONObject.isNull(str)) {
                return null;
            }
            return jSONObject.getString(str);
        }

        @NonNull
        public StorageMetadata build() {
            return new StorageMetadata(this.f49022a, this.f49023b);
        }

        @Nullable
        public String getCacheControl() {
            return this.f49022a.f49018l.f49025b;
        }

        @Nullable
        public String getContentDisposition() {
            return this.f49022a.m.f49025b;
        }

        @Nullable
        public String getContentEncoding() {
            return this.f49022a.f49019n.f49025b;
        }

        @Nullable
        public String getContentLanguage() {
            return this.f49022a.f49020o.f49025b;
        }

        @Nullable
        public String getContentType() {
            return this.f49022a.f49012f.f49025b;
        }

        @NonNull
        public Builder setCacheControl(@Nullable String str) {
            this.f49022a.f49018l = a.b(str);
            return this;
        }

        @NonNull
        public Builder setContentDisposition(@Nullable String str) {
            this.f49022a.m = a.b(str);
            return this;
        }

        @NonNull
        public Builder setContentEncoding(@Nullable String str) {
            this.f49022a.f49019n = a.b(str);
            return this;
        }

        @NonNull
        public Builder setContentLanguage(@Nullable String str) {
            this.f49022a.f49020o = a.b(str);
            return this;
        }

        @NonNull
        public Builder setContentType(@Nullable String str) {
            this.f49022a.f49012f = a.b(str);
            return this;
        }

        @NonNull
        public Builder setCustomMetadata(@NonNull String str, @Nullable String str2) {
            StorageMetadata storageMetadata = this.f49022a;
            if (!storageMetadata.f49021p.f49024a) {
                storageMetadata.f49021p = a.b(new HashMap());
            }
            storageMetadata.f49021p.f49025b.put(str, str2);
            return this;
        }

        public Builder(@NonNull StorageMetadata storageMetadata) {
            this.f49022a = new StorageMetadata(storageMetadata, false);
        }

        public Builder(JSONObject jSONObject, StorageReference storageReference) throws JSONException {
            StorageMetadata storageMetadata = new StorageMetadata();
            this.f49022a = storageMetadata;
            if (jSONObject != null) {
                storageMetadata.f49011e = jSONObject.optString("generation");
                storageMetadata.f49007a = jSONObject.optString("name");
                storageMetadata.f49010d = jSONObject.optString("bucket");
                storageMetadata.f49013g = jSONObject.optString("metageneration");
                storageMetadata.f49014h = jSONObject.optString("timeCreated");
                storageMetadata.f49015i = jSONObject.optString("updated");
                storageMetadata.f49016j = jSONObject.optLong("size");
                storageMetadata.f49017k = jSONObject.optString("md5Hash");
                if (jSONObject.has("metadata") && !jSONObject.isNull("metadata")) {
                    JSONObject jSONObject2 = jSONObject.getJSONObject("metadata");
                    Iterator<String> itKeys = jSONObject2.keys();
                    while (itKeys.hasNext()) {
                        String next = itKeys.next();
                        setCustomMetadata(next, jSONObject2.getString(next));
                    }
                }
                String strA = a(jSONObject, "contentType");
                if (strA != null) {
                    setContentType(strA);
                }
                String strA2 = a(jSONObject, "cacheControl");
                if (strA2 != null) {
                    setCacheControl(strA2);
                }
                String strA3 = a(jSONObject, "contentDisposition");
                if (strA3 != null) {
                    setContentDisposition(strA3);
                }
                String strA4 = a(jSONObject, "contentEncoding");
                if (strA4 != null) {
                    setContentEncoding(strA4);
                }
                String strA5 = a(jSONObject, "contentLanguage");
                if (strA5 != null) {
                    setContentLanguage(strA5);
                }
                this.f49023b = true;
            }
            this.f49022a.f49009c = storageReference;
        }
    }

    public StorageMetadata(StorageMetadata storageMetadata, boolean z10) {
        this.f49007a = null;
        this.f49008b = null;
        this.f49009c = null;
        this.f49010d = null;
        this.f49011e = null;
        this.f49012f = a.a("");
        this.f49013g = null;
        this.f49014h = null;
        this.f49015i = null;
        this.f49017k = null;
        this.f49018l = a.a("");
        this.m = a.a("");
        this.f49019n = a.a("");
        this.f49020o = a.a("");
        this.f49021p = a.a(Collections.emptyMap());
        Preconditions.checkNotNull(storageMetadata);
        this.f49007a = storageMetadata.f49007a;
        this.f49008b = storageMetadata.f49008b;
        this.f49009c = storageMetadata.f49009c;
        this.f49010d = storageMetadata.f49010d;
        this.f49012f = storageMetadata.f49012f;
        this.f49018l = storageMetadata.f49018l;
        this.m = storageMetadata.m;
        this.f49019n = storageMetadata.f49019n;
        this.f49020o = storageMetadata.f49020o;
        this.f49021p = storageMetadata.f49021p;
        if (z10) {
            this.f49017k = storageMetadata.f49017k;
            this.f49016j = storageMetadata.f49016j;
            this.f49015i = storageMetadata.f49015i;
            this.f49014h = storageMetadata.f49014h;
            this.f49013g = storageMetadata.f49013g;
            this.f49011e = storageMetadata.f49011e;
        }
    }
}
