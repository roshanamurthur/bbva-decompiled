package com.google.firebase.storage.internal;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.webkit.ProxyConfig;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.FirebaseApp;
import com.google.firebase.appcheck.AppCheckTokenResult;
import com.google.firebase.appcheck.interop.InteropAppCheckTokenProvider;
import com.google.firebase.auth.GetTokenResult;
import com.google.firebase.auth.internal.InternalAuthProvider;
import com.google.firebase.storage.network.NetworkRequest;
import java.io.UnsupportedEncodingException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes10.dex */
public class Util {
    public static final String ISO_8601_FORMAT = "yyyy-MM-dd'T'HH:mm:ss.SSSZ";
    public static final int NETWORK_UNAVAILABLE = -2;

    public static boolean equals(@Nullable Object obj, @Nullable Object obj2) {
        return Objects.equal(obj, obj2);
    }

    @Nullable
    public static String getCurrentAppCheckToken(@Nullable InteropAppCheckTokenProvider interopAppCheckTokenProvider) {
        if (interopAppCheckTokenProvider == null) {
            return null;
        }
        try {
            AppCheckTokenResult appCheckTokenResult = (AppCheckTokenResult) Tasks.await(interopAppCheckTokenProvider.getToken(false), 30000L, TimeUnit.MILLISECONDS);
            if (appCheckTokenResult.getError() != null) {
                Log.w("StorageUtil", "Error getting App Check token; using placeholder token instead. Error: " + appCheckTokenResult.getError());
            }
            return appCheckTokenResult.getToken();
        } catch (InterruptedException e5) {
            e = e5;
            e.toString();
            return null;
        } catch (ExecutionException e7) {
            e = e7;
            e.toString();
            return null;
        } catch (TimeoutException e10) {
            e = e10;
            e.toString();
            return null;
        }
    }

    @Nullable
    public static String getCurrentAuthToken(@Nullable InternalAuthProvider internalAuthProvider) {
        String token;
        if (internalAuthProvider != null) {
            try {
                token = ((GetTokenResult) Tasks.await(internalAuthProvider.getAccessToken(false), 30000L, TimeUnit.MILLISECONDS)).getToken();
            } catch (InterruptedException e5) {
                e = e5;
                e.toString();
            } catch (ExecutionException e7) {
                e = e7;
                e.toString();
            } catch (TimeoutException e10) {
                e = e10;
                e.toString();
            }
        } else {
            token = null;
        }
        if (!TextUtils.isEmpty(token)) {
            return token;
        }
        Log.w("StorageUtil", "no auth token for request");
        return null;
    }

    @Nullable
    public static Uri normalize(@NonNull FirebaseApp firebaseApp, @Nullable String str) throws UnsupportedEncodingException {
        String strSubstring;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        Uri uri = NetworkRequest.PROD_BASE_URL;
        if (str.toLowerCase().startsWith("gs://")) {
            return Uri.parse("gs://" + Slashes.preserveSlashEncode(Slashes.normalizeSlashes(str.substring(5))));
        }
        Uri uri2 = Uri.parse(str);
        String scheme = uri2.getScheme();
        if (scheme == null || !(equals(scheme.toLowerCase(), ProxyConfig.MATCH_HTTP) || equals(scheme.toLowerCase(), ProxyConfig.MATCH_HTTPS))) {
            Log.w("StorageUtil", "FirebaseStorage is unable to support the scheme:" + scheme);
            throw new IllegalArgumentException("Uri scheme");
        }
        int iIndexOf = uri2.getAuthority().toLowerCase().indexOf(uri.getAuthority());
        String strSlashize = Slashes.slashize(uri2.getEncodedPath());
        if (iIndexOf == 0 && strSlashize.startsWith("/")) {
            int iIndexOf2 = strSlashize.indexOf("/b/", 0);
            int i10 = iIndexOf2 + 3;
            int iIndexOf3 = strSlashize.indexOf("/", i10);
            int iIndexOf4 = strSlashize.indexOf("/o/", 0);
            if (iIndexOf2 == -1 || iIndexOf3 == -1) {
                Log.w("StorageUtil", "Firebase Storage URLs must point to an object in your Storage Bucket. Please obtain a URL using the Firebase Console or getDownloadUrl().");
                throw new IllegalArgumentException("Firebase Storage URLs must point to an object in your Storage Bucket. Please obtain a URL using the Firebase Console or getDownloadUrl().");
            }
            strSubstring = strSlashize.substring(i10, iIndexOf3);
            strSlashize = iIndexOf4 != -1 ? strSlashize.substring(iIndexOf4 + 3) : "";
        } else {
            if (iIndexOf <= 1) {
                Log.w("StorageUtil", "Firebase Storage URLs must point to an object in your Storage Bucket. Please obtain a URL using the Firebase Console or getDownloadUrl().");
                throw new IllegalArgumentException("Firebase Storage URLs must point to an object in your Storage Bucket. Please obtain a URL using the Firebase Console or getDownloadUrl().");
            }
            strSubstring = uri2.getAuthority().substring(0, iIndexOf - 1);
        }
        Preconditions.checkNotEmpty(strSubstring, "No bucket specified");
        return new Uri.Builder().scheme("gs").authority(strSubstring).encodedPath(strSlashize).build();
    }

    public static long parseDateTime(@Nullable String str) {
        if (str == null) {
            return 0L;
        }
        String strReplaceAll = str.replaceAll("Z$", "-0000");
        try {
            return new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ", Locale.getDefault()).parse(strReplaceAll).getTime();
        } catch (ParseException e5) {
            Log.w("StorageUtil", "unable to parse datetime:" + strReplaceAll, e5);
            return 0L;
        }
    }
}
