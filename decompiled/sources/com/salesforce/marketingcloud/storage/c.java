package com.salesforce.marketingcloud.storage;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Size;
import java.io.UnsupportedEncodingException;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.security.GeneralSecurityException;
import java.util.Locale;

/* JADX INFO: loaded from: classes9.dex */
@SuppressLint({"UnknownNullness"})
public interface c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f64948a = "mcsdk_custprefs_%s";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f64949b = "et_attributes_cache";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f64950c = "et_tags_cache";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f64951d = "et_subscriber_cache";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f64952e = "gcm_reg_id_key";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f64953f = "et_session_id_cache";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f64954g = "et_user_id_cache";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f64955h = "mc_last_sent_registration";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f64956i = "sender_id";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String f64957j = "subscriber_jwt";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String f64958k = "predictive_intelligence_identifier";

    public static class a implements c {

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private final SharedPreferences f64959l;
        private final com.salesforce.marketingcloud.util.c m;

        public a(@NonNull Context context, @NonNull com.salesforce.marketingcloud.util.c cVar, @NonNull String str) {
            this.f64959l = context.getSharedPreferences(a(str), 0);
            this.m = cVar;
            b();
        }

        public static String a(String str) {
            return String.format(Locale.ENGLISH, c.f64948a, str);
        }

        private void b() {
            if (this.f64959l.contains("gcm_sender_id")) {
                this.f64959l.edit().remove("gcm_sender_id").apply();
            }
        }

        @Override // com.salesforce.marketingcloud.storage.c
        @Nullable
        public final String getString(String str, String str2) {
            return a(str, str2);
        }

        @Override // com.salesforce.marketingcloud.storage.c
        public final void putString(String str, @Nullable String str2) {
            try {
                b(str, str2);
            } catch (UnsupportedEncodingException | GeneralSecurityException e5) {
                com.salesforce.marketingcloud.g.e(e.f65076c, String.format(Locale.ENGLISH, "Value for key %s not stored.", str), e5);
            }
        }

        @Override // com.salesforce.marketingcloud.storage.c
        public final void remove(@NonNull @Size(min = 1) String str) {
            this.f64959l.edit().remove(str).apply();
        }

        @Nullable
        private String a(@NonNull @Size(min = 1) String str, String str2) {
            String strB = null;
            String string = this.f64959l.getString(str, null);
            if (string != null) {
                try {
                    strB = this.m.b(string);
                } catch (Exception e5) {
                    com.salesforce.marketingcloud.g.e(e.f65076c, e5, "Failed to encrypt %s", str);
                }
            }
            return strB == null ? str2 : strB;
        }

        private void b(@NonNull @Size(min = 1) String str, @NonNull String str2) throws GeneralSecurityException, UnsupportedEncodingException {
            this.f64959l.edit().putString(str, this.m.a(str2)).apply();
        }

        @Override // com.salesforce.marketingcloud.storage.c
        public final void a() {
            this.f64959l.edit().clear().apply();
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface b {
    }

    void a();

    @Nullable
    String getString(String str, String str2);

    void putString(String str, @Nullable String str2);

    void remove(String str);
}
