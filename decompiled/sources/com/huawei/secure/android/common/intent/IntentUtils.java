package com.huawei.secure.android.common.intent;

import ad.e;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.datastore.preferences.protobuf.q;
import com.huawei.secure.android.common.activity.a;
import java.io.Serializable;
import java.net.URISyntaxException;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes10.dex */
public class IntentUtils {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f50636a = "IntentUtils";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f50637b = 750000;

    @SuppressLint({"NewApi"})
    public static void filterIntent(Intent intent) {
        if (intent == null) {
            return;
        }
        intent.addCategory("android.intent.category.BROWSABLE").setComponent(null).setSelector(null);
    }

    public static <T extends Parcelable> ArrayList<T> getParcelableArrayListExtra(Intent intent, String str) {
        try {
            return intent.getParcelableArrayListExtra(str);
        } catch (Throwable th2) {
            e.g(th2, new StringBuilder("getParcelableArrayListExtra failed on intent "), f50636a, true);
            return null;
        }
    }

    public static int getParceledIntentSize(Intent intent) {
        Parcel parcelObtain = Parcel.obtain();
        intent.writeToParcel(parcelObtain, 0);
        int iDataSize = parcelObtain.dataSize();
        parcelObtain.recycle();
        return iDataSize;
    }

    @SuppressLint({"NewApi"})
    public static Uri getReferrer(Activity activity) {
        try {
            return activity.getReferrer();
        } catch (Exception e5) {
            q.f(e5, new StringBuilder("getReferrer: "), f50636a, true);
            return null;
        }
    }

    public static boolean hasIntentBomb(Intent intent) {
        boolean zHasIntentBomb = true;
        if (intent == null) {
            a.a(f50636a, "intent is null");
        } else if (intent instanceof SafeIntent) {
            a.b(f50636a, "safe intent");
            zHasIntentBomb = ((SafeIntent) intent).hasIntentBomb();
        } else {
            try {
                intent.getStringExtra("ANYTHING");
                zHasIntentBomb = false;
            } catch (Throwable unused) {
            }
        }
        if (zHasIntentBomb) {
            a.a(f50636a, "hasIntentBomb");
        }
        return zHasIntentBomb;
    }

    public static boolean isIntentTooLarge(Intent intent) {
        return getParceledIntentSize(intent) > f50637b;
    }

    public static boolean safeGetBoolean(Bundle bundle, String str) {
        return safeGetBoolean(bundle, str, false);
    }

    public static boolean safeGetBooleanExtra(Intent intent, String str, boolean z10) {
        try {
            return intent.getBooleanExtra(str, z10);
        } catch (Throwable th2) {
            e.g(th2, new StringBuilder("getBooleanExtra failed on intent "), f50636a, true);
            return z10;
        }
    }

    public static Bundle safeGetBundle(Bundle bundle, String str) {
        try {
            return bundle.getBundle(str);
        } catch (Throwable th2) {
            a.a(f50636a, "getBundle failed on bundle " + th2.getMessage(), true);
            return new Bundle();
        }
    }

    public static Bundle safeGetBundleExtra(Intent intent, String str) {
        try {
            return intent.getBundleExtra(str);
        } catch (Throwable th2) {
            a.a(f50636a, "getBundleExtra failed on intent " + th2.getMessage(), true);
            return new Bundle();
        }
    }

    public static byte[] safeGetByteArrayExtra(Intent intent, String str) {
        try {
            return intent.getByteArrayExtra(str);
        } catch (Throwable th2) {
            e.g(th2, new StringBuilder("getByteArrayExtra failed on intent "), f50636a, true);
            return new byte[0];
        }
    }

    public static int safeGetInt(Bundle bundle, String str, int i10) {
        try {
            return bundle.getInt(str, i10);
        } catch (Throwable th2) {
            e.g(th2, new StringBuilder("getInt failed on bundle "), f50636a, true);
            return i10;
        }
    }

    public static int[] safeGetIntArray(Bundle bundle, String str) {
        try {
            return bundle.getIntArray(str);
        } catch (Throwable th2) {
            e.g(th2, new StringBuilder("getIntArray failed on bundle "), f50636a, true);
            return new int[0];
        }
    }

    public static int[] safeGetIntArrayExtra(Intent intent, String str) {
        try {
            return intent.getIntArrayExtra(str);
        } catch (Throwable th2) {
            e.g(th2, new StringBuilder("getIntArrayExtra failed on intent "), f50636a, true);
            return new int[0];
        }
    }

    public static int safeGetIntExtra(Intent intent, String str, int i10) {
        try {
            return intent.getIntExtra(str, i10);
        } catch (Throwable th2) {
            e.g(th2, new StringBuilder("getIntExtra failed on intent "), f50636a, true);
            return i10;
        }
    }

    public static long safeGetLongExtra(Intent intent, String str, long j10) {
        try {
            return intent.getLongExtra(str, j10);
        } catch (Throwable th2) {
            e.g(th2, new StringBuilder("getLongExtra failed on intent "), f50636a, true);
            return j10;
        }
    }

    @Deprecated
    public static <T extends Parcelable> T safeGetParcelable(Bundle bundle, String str) {
        try {
            return (T) bundle.getParcelable(str);
        } catch (Throwable th2) {
            e.g(th2, new StringBuilder("getParcelable failed on bundle "), f50636a, true);
            return null;
        }
    }

    public static Parcelable[] safeGetParcelableArrayExtra(Intent intent, String str) {
        try {
            return intent.getParcelableArrayExtra(str);
        } catch (Throwable th2) {
            e.g(th2, new StringBuilder("getParcelableArrayExtra failed on intent "), f50636a, true);
            return new Parcelable[0];
        }
    }

    @Deprecated
    public static <T extends Parcelable> T safeGetParcelableExtra(Intent intent, String str) {
        try {
            return (T) intent.getParcelableExtra(str);
        } catch (Throwable th2) {
            e.g(th2, new StringBuilder("getParcelableExtra failed on intent "), f50636a, true);
            return null;
        }
    }

    public static <T extends Serializable> T safeGetSerializable(Bundle bundle, String str, Class<T> cls) {
        try {
            Serializable serializable = bundle.getSerializable(str);
            if (cls.isInstance(serializable)) {
                return cls.cast(serializable);
            }
            return null;
        } catch (Exception e5) {
            q.f(e5, new StringBuilder("getSerializable exception: "), f50636a, true);
            return null;
        }
    }

    @Deprecated
    public static <T extends Serializable> T safeGetSerializableExtra(Intent intent, String str) {
        try {
            return (T) intent.getSerializableExtra(str);
        } catch (ClassCastException e5) {
            a.a(f50636a, "Invalide class for Serializable: " + e5.getMessage(), true);
            return null;
        } catch (Throwable th2) {
            e.g(th2, new StringBuilder("getSerializableExtra failed on intent "), f50636a, true);
            return null;
        }
    }

    public static String safeGetString(Bundle bundle, String str) {
        try {
            return bundle.getString(str);
        } catch (Throwable th2) {
            e.g(th2, new StringBuilder("getString failed on bundle "), f50636a, true);
            return "";
        }
    }

    public static ArrayList<String> safeGetStringArrayListExtra(Intent intent, String str) {
        try {
            return intent.getStringArrayListExtra(str);
        } catch (Throwable th2) {
            a.a(f50636a, "getStringArrayListExtra failed on intent " + th2.getMessage(), true);
            return new ArrayList<>();
        }
    }

    public static String safeGetStringExtra(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Throwable th2) {
            e.g(th2, new StringBuilder("getStringExtra failed on intent "), f50636a, true);
            return "";
        }
    }

    public static boolean safeHasExtra(Intent intent, String str) {
        try {
            return intent.hasExtra(str);
        } catch (Throwable unused) {
            return false;
        }
    }

    public static Intent safeParseUri(String str, int i10) throws URISyntaxException {
        if (str == null) {
            return null;
        }
        Intent uri = Intent.parseUri(str, i10);
        filterIntent(uri);
        return uri;
    }

    public static void safeRemoveExtra(Intent intent, String str) {
        try {
            intent.removeExtra(str);
        } catch (Throwable th2) {
            e.g(th2, new StringBuilder("removeExtra failed on intent "), f50636a, true);
        }
    }

    public static boolean safeStartActivity(Context context, Intent intent) {
        return safeStartActivity(context, intent, null);
    }

    public static boolean safeStartActivityForResultStatic(Activity activity, Intent intent, int i10) {
        try {
            activity.startActivityForResult(intent, i10);
            return true;
        } catch (ActivityNotFoundException e5) {
            a.a(f50636a, "safeStartActivityForResult: ActivityNotFoundException ", e5);
            return false;
        } catch (Exception e7) {
            a.a(f50636a, "safeStartActivityForResult: Exception ", e7);
            return false;
        } catch (Throwable th2) {
            a.a(f50636a, "safeStartActivityForResult: throwable ", th2);
            return false;
        }
    }

    @Deprecated
    public boolean safeStartActivityForResult(Activity activity, Intent intent, int i10) {
        try {
            activity.startActivityForResult(intent, i10);
            return true;
        } catch (ActivityNotFoundException e5) {
            a.a(f50636a, "safeStartActivityForResult: ActivityNotFoundException ", e5);
            return false;
        } catch (Exception e7) {
            a.a(f50636a, "safeStartActivityForResult: Exception ", e7);
            return false;
        } catch (Throwable th2) {
            a.a(f50636a, "safeStartActivityForResult: throwable ", th2);
            return false;
        }
    }

    public static boolean safeGetBoolean(Bundle bundle, String str, boolean z10) {
        try {
            return bundle.getBoolean(str, z10);
        } catch (Throwable th2) {
            a.a(f50636a, "getBoolean failed with throwable: " + th2.getMessage());
            return z10;
        }
    }

    @SuppressLint({"NewApi"})
    public static boolean safeStartActivity(Context context, Intent intent, Bundle bundle) {
        try {
            context.startActivity(intent, bundle);
            return true;
        } catch (ActivityNotFoundException e5) {
            a.a(f50636a, "safeStartActivity: ActivityNotFoundException ", e5);
            return false;
        } catch (Exception unused) {
            a.a(f50636a, "safeStartActivityForResult: Exception");
            return false;
        } catch (Throwable unused2) {
            a.a(f50636a, "safeStartActivityForResult: throwable");
            return false;
        }
    }

    @SuppressLint({"NewApi"})
    public static boolean safeStartActivityForResultStatic(Activity activity, Intent intent, int i10, Bundle bundle) {
        try {
            activity.startActivityForResult(intent, i10, bundle);
            return true;
        } catch (ActivityNotFoundException e5) {
            a.a(f50636a, "safeStartActivityForResult: ActivityNotFoundException ", e5);
            return false;
        } catch (Exception unused) {
            a.a(f50636a, "safeStartActivityForResult: Exception");
            return false;
        } catch (Throwable unused2) {
            a.a(f50636a, "safeStartActivityForResult: throwable");
            return false;
        }
    }

    @SuppressLint({"NewApi"})
    @Deprecated
    public boolean safeStartActivityForResult(Activity activity, Intent intent, int i10, Bundle bundle) {
        try {
            activity.startActivityForResult(intent, i10, bundle);
            return true;
        } catch (ActivityNotFoundException e5) {
            a.a(f50636a, "safeStartActivityForResult: ActivityNotFoundException ", e5);
            return false;
        } catch (Exception unused) {
            a.a(f50636a, "safeStartActivityForResult: Exception");
            return false;
        } catch (Throwable unused2) {
            a.a(f50636a, "safeStartActivityForResult: throwable");
            return false;
        }
    }

    public static <T extends Parcelable> T safeGetParcelable(Bundle bundle, String str, Class<T> cls) {
        try {
            Parcelable parcelable = bundle.getParcelable(str);
            if (cls.isInstance(parcelable)) {
                return cls.cast(parcelable);
            }
            return null;
        } catch (Exception e5) {
            q.f(e5, new StringBuilder("getParcelable exception: "), f50636a, true);
            return null;
        }
    }

    public static <T extends Parcelable> T safeGetParcelableExtra(Intent intent, String str, Class<T> cls) {
        try {
            Parcelable parcelableExtra = intent.getParcelableExtra(str);
            if (cls.isInstance(parcelableExtra)) {
                return cls.cast(parcelableExtra);
            }
            return null;
        } catch (Exception e5) {
            q.f(e5, new StringBuilder("getParcelable exception: "), f50636a, true);
            return null;
        }
    }

    public static <T extends Serializable> T safeGetSerializableExtra(Intent intent, String str, Class<T> cls) {
        try {
            Serializable serializableExtra = intent.getSerializableExtra(str);
            if (cls.isInstance(serializableExtra)) {
                return cls.cast(serializableExtra);
            }
            return null;
        } catch (Exception e5) {
            q.f(e5, new StringBuilder("getSerializable exception: "), f50636a, true);
            return null;
        }
    }
}
