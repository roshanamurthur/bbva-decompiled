package com.google.firebase.appcheck.internal;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.common.internal.Preconditions;
import com.google.firebase.appcheck.AppCheckToken;
import com.google.firebase.appcheck.internal.StorageHelper;
import com.google.firebase.appcheck.internal.util.Logger;
import com.google.firebase.components.Lazy;
import com.google.firebase.inject.Provider;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class StorageHelper {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Logger f47628b = new Logger("StorageHelper");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Lazy<SharedPreferences> f47629a;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f47630a;

        static {
            int[] iArr = new int[b.values().length];
            f47630a = iArr;
            try {
                iArr[b.DEFAULT_APP_CHECK_TOKEN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f47630a[b.UNKNOWN_APP_CHECK_TOKEN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @VisibleForTesting
    public static final class b {
        private static final /* synthetic */ b[] $VALUES;
        public static final b DEFAULT_APP_CHECK_TOKEN;
        public static final b UNKNOWN_APP_CHECK_TOKEN;

        static {
            b bVar = new b("DEFAULT_APP_CHECK_TOKEN", 0);
            DEFAULT_APP_CHECK_TOKEN = bVar;
            b bVar2 = new b("UNKNOWN_APP_CHECK_TOKEN", 1);
            UNKNOWN_APP_CHECK_TOKEN = bVar2;
            $VALUES = new b[]{bVar, bVar2};
        }

        public b() {
            throw null;
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) $VALUES.clone();
        }
    }

    public StorageHelper(@NonNull final Context context, @NonNull String str) {
        Preconditions.checkNotNull(context);
        Preconditions.checkNotEmpty(str);
        final String str2 = String.format("com.google.firebase.appcheck.store.%s", str);
        this.f47629a = new Lazy<>(new Provider() { // from class: sf.c
            @Override // com.google.firebase.inject.Provider
            public final Object get() {
                Logger logger = StorageHelper.f47628b;
                return context.getSharedPreferences(str2, 0);
            }
        });
    }

    @Nullable
    public AppCheckToken retrieveAppCheckToken() {
        Logger logger = f47628b;
        Lazy<SharedPreferences> lazy = this.f47629a;
        String string = lazy.get().getString("com.google.firebase.appcheck.TOKEN_TYPE", null);
        String string2 = lazy.get().getString("com.google.firebase.appcheck.APP_CHECK_TOKEN", null);
        if (string != null && string2 != null) {
            try {
                int i10 = a.f47630a[b.valueOf(string).ordinal()];
                if (i10 != 1) {
                    if (i10 == 2) {
                        return DefaultAppCheckToken.constructFromRawToken(string2);
                    }
                    logger.e("Reached unreachable section in #retrieveAppCheckToken()");
                    return null;
                }
                try {
                    JSONObject jSONObject = new JSONObject(string2);
                    return new DefaultAppCheckToken(jSONObject.getString("token"), jSONObject.getLong("expiresIn"), jSONObject.getLong("receivedAt"));
                } catch (JSONException e5) {
                    e5.getMessage();
                    return null;
                }
            } catch (IllegalArgumentException e7) {
                StringBuilder sbD = ci.a.d("Failed to parse TokenType of stored token  with type [", string, "] with exception: ");
                sbD.append(e7.getMessage());
                logger.e(sbD.toString());
                this.f47629a.get().edit().remove("com.google.firebase.appcheck.APP_CHECK_TOKEN").remove("com.google.firebase.appcheck.TOKEN_TYPE").apply();
            }
        }
        return null;
    }

    public void saveAppCheckToken(@NonNull AppCheckToken appCheckToken) {
        String string;
        boolean z10 = appCheckToken instanceof DefaultAppCheckToken;
        Lazy<SharedPreferences> lazy = this.f47629a;
        if (!z10) {
            lazy.get().edit().putString("com.google.firebase.appcheck.APP_CHECK_TOKEN", appCheckToken.getToken()).putString("com.google.firebase.appcheck.TOKEN_TYPE", b.UNKNOWN_APP_CHECK_TOKEN.name()).apply();
            return;
        }
        SharedPreferences.Editor editorEdit = lazy.get().edit();
        DefaultAppCheckToken defaultAppCheckToken = (DefaultAppCheckToken) appCheckToken;
        defaultAppCheckToken.getClass();
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("token", defaultAppCheckToken.f47595a);
            jSONObject.put("receivedAt", defaultAppCheckToken.f47596b);
            jSONObject.put("expiresIn", defaultAppCheckToken.f47597c);
            string = jSONObject.toString();
        } catch (JSONException e5) {
            e5.getMessage();
            string = null;
        }
        editorEdit.putString("com.google.firebase.appcheck.APP_CHECK_TOKEN", string).putString("com.google.firebase.appcheck.TOKEN_TYPE", b.DEFAULT_APP_CHECK_TOKEN.name()).apply();
    }
}
