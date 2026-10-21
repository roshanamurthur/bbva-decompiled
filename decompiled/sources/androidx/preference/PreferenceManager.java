package androidx.preference;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.core.content.ContextCompat;

/* JADX INFO: loaded from: classes2.dex */
public class PreferenceManager {
    public static final String KEY_HAS_SET_DEFAULT_VALUES = "_has_set_default_values";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f22394a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public SharedPreferences f22396c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public PreferenceDataStore f22397d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public SharedPreferences.Editor f22398e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f22399f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f22400g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f22401h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public PreferenceScreen f22403j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public PreferenceComparisonCallback f22404k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public OnPreferenceTreeClickListener f22405l;
    public OnDisplayPreferenceDialogListener m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public OnNavigateToScreenListener f22406n;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f22395b = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f22402i = 0;

    public interface OnDisplayPreferenceDialogListener {
        void onDisplayPreferenceDialog(@NonNull Preference preference);
    }

    public interface OnNavigateToScreenListener {
        void onNavigateToScreen(@NonNull PreferenceScreen preferenceScreen);
    }

    public interface OnPreferenceTreeClickListener {
        boolean onPreferenceTreeClick(@NonNull Preference preference);
    }

    public static abstract class PreferenceComparisonCallback {
        public abstract boolean arePreferenceContentsTheSame(@NonNull Preference preference, @NonNull Preference preference2);

        public abstract boolean arePreferenceItemsTheSame(@NonNull Preference preference, @NonNull Preference preference2);
    }

    public static class SimplePreferenceComparisonCallback extends PreferenceComparisonCallback {
        @Override // androidx.preference.PreferenceManager.PreferenceComparisonCallback
        public boolean arePreferenceContentsTheSame(@NonNull Preference preference, @NonNull Preference preference2) {
            if (preference.getClass() != preference2.getClass()) {
                return false;
            }
            if ((preference == preference2 && preference.f22300g1) || !TextUtils.equals(preference.getTitle(), preference2.getTitle()) || !TextUtils.equals(preference.getSummary(), preference2.getSummary())) {
                return false;
            }
            Drawable icon = preference.getIcon();
            Drawable icon2 = preference2.getIcon();
            if ((icon != icon2 && (icon == null || !icon.equals(icon2))) || preference.isEnabled() != preference2.isEnabled() || preference.isSelectable() != preference2.isSelectable()) {
                return false;
            }
            if (!(preference instanceof TwoStatePreference) || ((TwoStatePreference) preference).isChecked() == ((TwoStatePreference) preference2).isChecked()) {
                return !(preference instanceof DropDownPreference) || preference == preference2;
            }
            return false;
        }

        @Override // androidx.preference.PreferenceManager.PreferenceComparisonCallback
        public boolean arePreferenceItemsTheSame(@NonNull Preference preference, @NonNull Preference preference2) {
            return preference.a() == preference2.a();
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public PreferenceManager(@NonNull Context context) {
        this.f22394a = context;
        setSharedPreferencesName(a(context));
    }

    public static String a(Context context) {
        return context.getPackageName() + "_preferences";
    }

    public static SharedPreferences getDefaultSharedPreferences(@NonNull Context context) {
        return context.getSharedPreferences(a(context), 0);
    }

    public static void setDefaultValues(@NonNull Context context, int i10, boolean z10) {
        setDefaultValues(context, a(context), 0, i10, z10);
    }

    @Nullable
    public final SharedPreferences.Editor b() {
        if (this.f22397d != null) {
            return null;
        }
        if (!this.f22399f) {
            return getSharedPreferences().edit();
        }
        if (this.f22398e == null) {
            this.f22398e = getSharedPreferences().edit();
        }
        return this.f22398e;
    }

    public final long c() {
        long j10;
        synchronized (this) {
            j10 = this.f22395b;
            this.f22395b = 1 + j10;
        }
        return j10;
    }

    @NonNull
    public PreferenceScreen createPreferenceScreen(@NonNull Context context) {
        PreferenceScreen preferenceScreen = new PreferenceScreen(context, null);
        preferenceScreen.onAttachedToHierarchy(this);
        return preferenceScreen;
    }

    @Nullable
    public <T extends Preference> T findPreference(@NonNull CharSequence charSequence) {
        PreferenceScreen preferenceScreen = this.f22403j;
        if (preferenceScreen == null) {
            return null;
        }
        return (T) preferenceScreen.findPreference(charSequence);
    }

    @NonNull
    public Context getContext() {
        return this.f22394a;
    }

    @Nullable
    public OnDisplayPreferenceDialogListener getOnDisplayPreferenceDialogListener() {
        return this.m;
    }

    @Nullable
    public OnNavigateToScreenListener getOnNavigateToScreenListener() {
        return this.f22406n;
    }

    @Nullable
    public OnPreferenceTreeClickListener getOnPreferenceTreeClickListener() {
        return this.f22405l;
    }

    @Nullable
    public PreferenceComparisonCallback getPreferenceComparisonCallback() {
        return this.f22404k;
    }

    @Nullable
    public PreferenceDataStore getPreferenceDataStore() {
        return this.f22397d;
    }

    public PreferenceScreen getPreferenceScreen() {
        return this.f22403j;
    }

    @Nullable
    public SharedPreferences getSharedPreferences() {
        if (getPreferenceDataStore() != null) {
            return null;
        }
        if (this.f22396c == null) {
            int i10 = this.f22402i;
            Context contextCreateDeviceProtectedStorageContext = this.f22394a;
            if (i10 == 1) {
                contextCreateDeviceProtectedStorageContext = ContextCompat.createDeviceProtectedStorageContext(contextCreateDeviceProtectedStorageContext);
            }
            this.f22396c = contextCreateDeviceProtectedStorageContext.getSharedPreferences(this.f22400g, this.f22401h);
        }
        return this.f22396c;
    }

    public int getSharedPreferencesMode() {
        return this.f22401h;
    }

    public String getSharedPreferencesName() {
        return this.f22400g;
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public PreferenceScreen inflateFromResource(@NonNull Context context, int i10, @Nullable PreferenceScreen preferenceScreen) {
        this.f22399f = true;
        g gVar = new g(context, this);
        XmlResourceParser xml = context.getResources().getXml(i10);
        try {
            PreferenceGroup preferenceGroupC = gVar.c(xml, preferenceScreen);
            xml.close();
            PreferenceScreen preferenceScreen2 = (PreferenceScreen) preferenceGroupC;
            preferenceScreen2.onAttachedToHierarchy(this);
            SharedPreferences.Editor editor = this.f22398e;
            if (editor != null) {
                editor.apply();
            }
            this.f22399f = false;
            return preferenceScreen2;
        } catch (Throwable th2) {
            xml.close();
            throw th2;
        }
    }

    public boolean isStorageDefault() {
        return Build.VERSION.SDK_INT < 24 || this.f22402i == 0;
    }

    public boolean isStorageDeviceProtected() {
        return Build.VERSION.SDK_INT >= 24 && this.f22402i == 1;
    }

    public void setOnDisplayPreferenceDialogListener(@Nullable OnDisplayPreferenceDialogListener onDisplayPreferenceDialogListener) {
        this.m = onDisplayPreferenceDialogListener;
    }

    public void setOnNavigateToScreenListener(@Nullable OnNavigateToScreenListener onNavigateToScreenListener) {
        this.f22406n = onNavigateToScreenListener;
    }

    public void setOnPreferenceTreeClickListener(@Nullable OnPreferenceTreeClickListener onPreferenceTreeClickListener) {
        this.f22405l = onPreferenceTreeClickListener;
    }

    public void setPreferenceComparisonCallback(@Nullable PreferenceComparisonCallback preferenceComparisonCallback) {
        this.f22404k = preferenceComparisonCallback;
    }

    public void setPreferenceDataStore(@Nullable PreferenceDataStore preferenceDataStore) {
        this.f22397d = preferenceDataStore;
    }

    public boolean setPreferences(PreferenceScreen preferenceScreen) {
        PreferenceScreen preferenceScreen2 = this.f22403j;
        if (preferenceScreen == preferenceScreen2) {
            return false;
        }
        if (preferenceScreen2 != null) {
            preferenceScreen2.onDetached();
        }
        this.f22403j = preferenceScreen;
        return true;
    }

    public void setSharedPreferencesMode(int i10) {
        this.f22401h = i10;
        this.f22396c = null;
    }

    public void setSharedPreferencesName(String str) {
        this.f22400g = str;
        this.f22396c = null;
    }

    public void setStorageDefault() {
        if (Build.VERSION.SDK_INT >= 24) {
            this.f22402i = 0;
            this.f22396c = null;
        }
    }

    public void setStorageDeviceProtected() {
        if (Build.VERSION.SDK_INT >= 24) {
            this.f22402i = 1;
            this.f22396c = null;
        }
    }

    public void showDialog(@NonNull Preference preference) {
        OnDisplayPreferenceDialogListener onDisplayPreferenceDialogListener = this.m;
        if (onDisplayPreferenceDialogListener != null) {
            onDisplayPreferenceDialogListener.onDisplayPreferenceDialog(preference);
        }
    }

    public static void setDefaultValues(@NonNull Context context, String str, int i10, int i11, boolean z10) {
        SharedPreferences sharedPreferences = context.getSharedPreferences(KEY_HAS_SET_DEFAULT_VALUES, 0);
        if (z10 || !sharedPreferences.getBoolean(KEY_HAS_SET_DEFAULT_VALUES, false)) {
            PreferenceManager preferenceManager = new PreferenceManager(context);
            preferenceManager.setSharedPreferencesName(str);
            preferenceManager.setSharedPreferencesMode(i10);
            preferenceManager.inflateFromResource(context, i11, null);
            sharedPreferences.edit().putBoolean(KEY_HAS_SET_DEFAULT_VALUES, true).apply();
        }
    }
}
