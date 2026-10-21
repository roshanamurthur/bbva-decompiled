package com.bumptech.glide.load.model;

import ad.d;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.datastore.preferences.protobuf.e;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes9.dex */
public final class LazyHeaders implements Headers {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map<String, List<LazyHeaderFactory>> f38439a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile Map<String, String> f38440b;

    public static final class Builder {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final Map<String, List<LazyHeaderFactory>> f38441d;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f38442a = true;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Map<String, List<LazyHeaderFactory>> f38443b = f38441d;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f38444c = true;

        static {
            String property = System.getProperty("http.agent");
            if (!TextUtils.isEmpty(property)) {
                int length = property.length();
                StringBuilder sb2 = new StringBuilder(property.length());
                for (int i10 = 0; i10 < length; i10++) {
                    char cCharAt = property.charAt(i10);
                    if ((cCharAt > 31 || cCharAt == '\t') && cCharAt < 127) {
                        sb2.append(cCharAt);
                    } else {
                        sb2.append('?');
                    }
                }
                property = sb2.toString();
            }
            HashMap map = new HashMap(2);
            if (!TextUtils.isEmpty(property)) {
                map.put("User-Agent", Collections.singletonList(new a(property)));
            }
            f38441d = Collections.unmodifiableMap(map);
        }

        public final void a() {
            if (this.f38442a) {
                this.f38442a = false;
                HashMap map = new HashMap(this.f38443b.size());
                for (Map.Entry<String, List<LazyHeaderFactory>> entry : this.f38443b.entrySet()) {
                    map.put(entry.getKey(), new ArrayList(entry.getValue()));
                }
                this.f38443b = map;
            }
        }

        public Builder addHeader(@NonNull String str, @NonNull String str2) {
            return addHeader(str, new a(str2));
        }

        public LazyHeaders build() {
            this.f38442a = true;
            return new LazyHeaders(this.f38443b);
        }

        public Builder setHeader(@NonNull String str, @Nullable String str2) {
            return setHeader(str, str2 == null ? null : new a(str2));
        }

        public Builder addHeader(@NonNull String str, @NonNull LazyHeaderFactory lazyHeaderFactory) {
            if (this.f38444c && "User-Agent".equalsIgnoreCase(str)) {
                return setHeader(str, lazyHeaderFactory);
            }
            a();
            List<LazyHeaderFactory> arrayList = this.f38443b.get(str);
            if (arrayList == null) {
                arrayList = new ArrayList<>();
                this.f38443b.put(str, arrayList);
            }
            arrayList.add(lazyHeaderFactory);
            return this;
        }

        public Builder setHeader(@NonNull String str, @Nullable LazyHeaderFactory lazyHeaderFactory) {
            a();
            if (lazyHeaderFactory == null) {
                this.f38443b.remove(str);
            } else {
                List<LazyHeaderFactory> arrayList = this.f38443b.get(str);
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                    this.f38443b.put(str, arrayList);
                }
                arrayList.clear();
                arrayList.add(lazyHeaderFactory);
            }
            if (this.f38444c && "User-Agent".equalsIgnoreCase(str)) {
                this.f38444c = false;
            }
            return this;
        }
    }

    public static final class a implements LazyHeaderFactory {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NonNull
        public final String f38445a;

        public a(@NonNull String str) {
            this.f38445a = str;
        }

        @Override // com.bumptech.glide.load.model.LazyHeaderFactory
        public final String buildHeader() {
            return this.f38445a;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof a) {
                return this.f38445a.equals(((a) obj).f38445a);
            }
            return false;
        }

        public final int hashCode() {
            return this.f38445a.hashCode();
        }

        public final String toString() {
            return d.f(new StringBuilder("StringHeaderFactory{value='"), this.f38445a, "'}");
        }
    }

    public LazyHeaders(Map<String, List<LazyHeaderFactory>> map) {
        this.f38439a = Collections.unmodifiableMap(map);
    }

    public final HashMap a() {
        HashMap map = new HashMap();
        for (Map.Entry<String, List<LazyHeaderFactory>> entry : this.f38439a.entrySet()) {
            List<LazyHeaderFactory> value = entry.getValue();
            StringBuilder sb2 = new StringBuilder();
            int size = value.size();
            for (int i10 = 0; i10 < size; i10++) {
                String strBuildHeader = value.get(i10).buildHeader();
                if (!TextUtils.isEmpty(strBuildHeader)) {
                    sb2.append(strBuildHeader);
                    if (i10 != value.size() - 1) {
                        sb2.append(AbstractJsonLexerKt.COMMA);
                    }
                }
            }
            String string = sb2.toString();
            if (!TextUtils.isEmpty(string)) {
                map.put(entry.getKey(), string);
            }
        }
        return map;
    }

    public boolean equals(Object obj) {
        if (obj instanceof LazyHeaders) {
            return this.f38439a.equals(((LazyHeaders) obj).f38439a);
        }
        return false;
    }

    @Override // com.bumptech.glide.load.model.Headers
    public Map<String, String> getHeaders() {
        if (this.f38440b == null) {
            synchronized (this) {
                try {
                    if (this.f38440b == null) {
                        this.f38440b = Collections.unmodifiableMap(a());
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return this.f38440b;
    }

    public int hashCode() {
        return this.f38439a.hashCode();
    }

    public String toString() {
        return e.g(new StringBuilder("LazyHeaders{headers="), this.f38439a, AbstractJsonLexerKt.END_OBJ);
    }
}
