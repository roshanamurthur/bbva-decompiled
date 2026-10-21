package com.bumptech.glide.load.model;

import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.load.Key;
import com.bumptech.glide.util.Preconditions;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.MessageDigest;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public class GlideUrl implements Key {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Headers f38432a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final URL f38433b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final String f38434c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public String f38435d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public URL f38436e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public volatile byte[] f38437f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f38438g;

    public GlideUrl(URL url) {
        this(url, Headers.DEFAULT);
    }

    public final String a() {
        if (TextUtils.isEmpty(this.f38435d)) {
            String string = this.f38434c;
            if (TextUtils.isEmpty(string)) {
                string = ((URL) Preconditions.checkNotNull(this.f38433b)).toString();
            }
            this.f38435d = Uri.encode(string, "@#&=*+-_.,:!?()/~'%;$");
        }
        return this.f38435d;
    }

    @Override // com.bumptech.glide.load.Key
    public boolean equals(Object obj) {
        if (!(obj instanceof GlideUrl)) {
            return false;
        }
        GlideUrl glideUrl = (GlideUrl) obj;
        return getCacheKey().equals(glideUrl.getCacheKey()) && this.f38432a.equals(glideUrl.f38432a);
    }

    public String getCacheKey() {
        String str = this.f38434c;
        return str != null ? str : ((URL) Preconditions.checkNotNull(this.f38433b)).toString();
    }

    public Map<String, String> getHeaders() {
        return this.f38432a.getHeaders();
    }

    @Override // com.bumptech.glide.load.Key
    public int hashCode() {
        if (this.f38438g == 0) {
            int iHashCode = getCacheKey().hashCode();
            this.f38438g = iHashCode;
            this.f38438g = this.f38432a.hashCode() + (iHashCode * 31);
        }
        return this.f38438g;
    }

    public String toString() {
        return getCacheKey();
    }

    public String toStringUrl() {
        return a();
    }

    public URL toURL() throws MalformedURLException {
        if (this.f38436e == null) {
            this.f38436e = new URL(a());
        }
        return this.f38436e;
    }

    @Override // com.bumptech.glide.load.Key
    public void updateDiskCacheKey(@NonNull MessageDigest messageDigest) {
        if (this.f38437f == null) {
            this.f38437f = getCacheKey().getBytes(Key.CHARSET);
        }
        messageDigest.update(this.f38437f);
    }

    public GlideUrl(String str) {
        this(str, Headers.DEFAULT);
    }

    public GlideUrl(URL url, Headers headers) {
        this.f38433b = (URL) Preconditions.checkNotNull(url);
        this.f38434c = null;
        this.f38432a = (Headers) Preconditions.checkNotNull(headers);
    }

    public GlideUrl(String str, Headers headers) {
        this.f38433b = null;
        this.f38434c = Preconditions.checkNotEmpty(str);
        this.f38432a = (Headers) Preconditions.checkNotNull(headers);
    }
}
