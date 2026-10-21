package androidx.appcompat.view;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.view.LayoutInflater;
import androidx.annotation.StyleRes;
import androidx.appcompat.R;

/* JADX INFO: loaded from: classes.dex */
public class ContextThemeWrapper extends ContextWrapper {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static Configuration f805f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f806a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Resources.Theme f807b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public LayoutInflater f808c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Configuration f809d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Resources f810e;

    public ContextThemeWrapper() {
        super(null);
    }

    public final void a() {
        boolean z10 = this.f807b == null;
        if (z10) {
            this.f807b = getResources().newTheme();
            Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.f807b.setTo(theme);
            }
        }
        onApplyThemeResource(this.f807b, this.f806a, z10);
    }

    public void applyOverrideConfiguration(Configuration configuration) {
        if (this.f810e != null) {
            throw new IllegalStateException("getResources() or getAssets() has already been called");
        }
        if (this.f809d != null) {
            throw new IllegalStateException("Override configuration has already been set");
        }
        this.f809d = new Configuration(configuration);
    }

    @Override // android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public AssetManager getAssets() {
        return getResources().getAssets();
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0032  */
    @Override // android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        if (this.f810e == null) {
            Configuration configuration = this.f809d;
            if (configuration == null) {
                this.f810e = super.getResources();
            } else {
                if (Build.VERSION.SDK_INT >= 26) {
                    if (f805f == null) {
                        Configuration configuration2 = new Configuration();
                        configuration2.fontScale = 0.0f;
                        f805f = configuration2;
                    }
                    if (configuration.equals(f805f)) {
                        this.f810e = super.getResources();
                    }
                }
                this.f810e = createConfigurationContext(this.f809d).getResources();
            }
        }
        return this.f810e;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Object getSystemService(String str) {
        if (!"layout_inflater".equals(str)) {
            return getBaseContext().getSystemService(str);
        }
        if (this.f808c == null) {
            this.f808c = LayoutInflater.from(getBaseContext()).cloneInContext(this);
        }
        return this.f808c;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources.Theme getTheme() {
        Resources.Theme theme = this.f807b;
        if (theme != null) {
            return theme;
        }
        if (this.f806a == 0) {
            this.f806a = R.style.Theme_AppCompat_Light;
        }
        a();
        return this.f807b;
    }

    public int getThemeResId() {
        return this.f806a;
    }

    public void onApplyThemeResource(Resources.Theme theme, int i10, boolean z10) {
        theme.applyStyle(i10, true);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public void setTheme(int i10) {
        if (this.f806a != i10) {
            this.f806a = i10;
            a();
        }
    }

    public ContextThemeWrapper(Context context, @StyleRes int i10) {
        super(context);
        this.f806a = i10;
    }

    public ContextThemeWrapper(Context context, Resources.Theme theme) {
        super(context);
        this.f807b = theme;
    }
}
