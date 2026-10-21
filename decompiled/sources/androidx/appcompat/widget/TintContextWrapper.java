package androidx.appcompat.widget;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Resources;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class TintContextWrapper extends ContextWrapper {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f1496c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static ArrayList<WeakReference<TintContextWrapper>> f1497d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i1 f1498a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Resources.Theme f1499b;

    public TintContextWrapper(@NonNull Context context) {
        super(context);
        if (!VectorEnabledTintResources.shouldBeUsed()) {
            this.f1498a = new q1(this, context.getResources());
            this.f1499b = null;
            return;
        }
        VectorEnabledTintResources vectorEnabledTintResources = new VectorEnabledTintResources(this, context.getResources());
        this.f1498a = vectorEnabledTintResources;
        Resources.Theme themeNewTheme = vectorEnabledTintResources.newTheme();
        this.f1499b = themeNewTheme;
        themeNewTheme.setTo(context.getTheme());
    }

    public static Context wrap(@NonNull Context context) {
        if ((context instanceof TintContextWrapper) || (context.getResources() instanceof q1) || (context.getResources() instanceof VectorEnabledTintResources) || !VectorEnabledTintResources.shouldBeUsed()) {
            return context;
        }
        synchronized (f1496c) {
            try {
                ArrayList<WeakReference<TintContextWrapper>> arrayList = f1497d;
                if (arrayList == null) {
                    f1497d = new ArrayList<>();
                } else {
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        WeakReference<TintContextWrapper> weakReference = f1497d.get(size);
                        if (weakReference == null || weakReference.get() == null) {
                            f1497d.remove(size);
                        }
                    }
                    for (int size2 = f1497d.size() - 1; size2 >= 0; size2--) {
                        WeakReference<TintContextWrapper> weakReference2 = f1497d.get(size2);
                        TintContextWrapper tintContextWrapper = weakReference2 != null ? weakReference2.get() : null;
                        if (tintContextWrapper != null && tintContextWrapper.getBaseContext() == context) {
                            return tintContextWrapper;
                        }
                    }
                }
                TintContextWrapper tintContextWrapper2 = new TintContextWrapper(context);
                f1497d.add(new WeakReference<>(tintContextWrapper2));
                return tintContextWrapper2;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public AssetManager getAssets() {
        return this.f1498a.getAssets();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        return this.f1498a;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources.Theme getTheme() {
        Resources.Theme theme = this.f1499b;
        return theme == null ? super.getTheme() : theme;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public void setTheme(int i10) {
        Resources.Theme theme = this.f1499b;
        if (theme == null) {
            super.setTheme(i10);
        } else {
            theme.applyStyle(i10, true);
        }
    }
}
