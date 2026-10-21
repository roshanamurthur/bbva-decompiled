package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.util.Xml;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat;
import androidx.appcompat.resources.Compatibility;
import androidx.appcompat.resources.R;
import androidx.collection.LongSparseArray;
import androidx.collection.LruCache;
import androidx.collection.SimpleArrayMap;
import androidx.collection.SparseArrayCompat;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat;
import androidx.vectordrawable.graphics.drawable.VectorDrawableCompat;
import com.bbva.androidtoolkit.utils.PluginUtils;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public final class ResourceManagerInternal {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static ResourceManagerInternal f1358i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public WeakHashMap<Context, SparseArrayCompat<ColorStateList>> f1360a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public SimpleArrayMap<String, e> f1361b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public SparseArrayCompat<String> f1362c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final WeakHashMap<Context, LongSparseArray<WeakReference<Drawable.ConstantState>>> f1363d = new WeakHashMap<>(0);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public TypedValue f1364e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f1365f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ResourceManagerHooks f1366g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final PorterDuff.Mode f1357h = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final c f1359j = new c(6);

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public interface ResourceManagerHooks {
        @Nullable
        Drawable createDrawableFor(@NonNull ResourceManagerInternal resourceManagerInternal, @NonNull Context context, @DrawableRes int i10);

        @Nullable
        ColorStateList getTintListForDrawableRes(@NonNull Context context, @DrawableRes int i10);

        @Nullable
        PorterDuff.Mode getTintModeForDrawableRes(int i10);

        boolean tintDrawable(@NonNull Context context, @DrawableRes int i10, @NonNull Drawable drawable);

        boolean tintDrawableUsingColorFilter(@NonNull Context context, @DrawableRes int i10, @NonNull Drawable drawable);
    }

    public static class a implements e {
        @Override // androidx.appcompat.widget.ResourceManagerInternal.e
        public final Drawable a(@NonNull Context context, @NonNull XmlResourceParser xmlResourceParser, @NonNull AttributeSet attributeSet, @Nullable Resources.Theme theme) {
            try {
                return AnimatedStateListDrawableCompat.createFromXmlInner(context, context.getResources(), xmlResourceParser, attributeSet, theme);
            } catch (Exception unused) {
                return null;
            }
        }
    }

    public static class b implements e {
        @Override // androidx.appcompat.widget.ResourceManagerInternal.e
        public final Drawable a(@NonNull Context context, @NonNull XmlResourceParser xmlResourceParser, @NonNull AttributeSet attributeSet, @Nullable Resources.Theme theme) {
            try {
                return AnimatedVectorDrawableCompat.createFromXmlInner(context, context.getResources(), xmlResourceParser, attributeSet, theme);
            } catch (Exception unused) {
                return null;
            }
        }
    }

    public static class c extends LruCache<Integer, PorterDuffColorFilter> {
    }

    public static class d implements e {
        @Override // androidx.appcompat.widget.ResourceManagerInternal.e
        public final Drawable a(@NonNull Context context, @NonNull XmlResourceParser xmlResourceParser, @NonNull AttributeSet attributeSet, @Nullable Resources.Theme theme) {
            String classAttribute = attributeSet.getClassAttribute();
            if (classAttribute != null) {
                try {
                    Drawable drawable = (Drawable) d.class.getClassLoader().loadClass(classAttribute).asSubclass(Drawable.class).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                    Compatibility.Api21Impl.inflate(drawable, context.getResources(), xmlResourceParser, attributeSet, theme);
                    return drawable;
                } catch (Exception unused) {
                }
            }
            return null;
        }
    }

    public interface e {
        Drawable a(@NonNull Context context, @NonNull XmlResourceParser xmlResourceParser, @NonNull AttributeSet attributeSet, @Nullable Resources.Theme theme);
    }

    public static class f implements e {
        @Override // androidx.appcompat.widget.ResourceManagerInternal.e
        public final Drawable a(@NonNull Context context, @NonNull XmlResourceParser xmlResourceParser, @NonNull AttributeSet attributeSet, @Nullable Resources.Theme theme) {
            try {
                return VectorDrawableCompat.createFromXmlInner(context.getResources(), (XmlPullParser) xmlResourceParser, attributeSet, theme);
            } catch (Exception unused) {
                return null;
            }
        }
    }

    public static void f(@NonNull ResourceManagerInternal resourceManagerInternal) {
        if (Build.VERSION.SDK_INT < 24) {
            resourceManagerInternal.a("vector", new f());
            resourceManagerInternal.a("animated-vector", new b());
            resourceManagerInternal.a("animated-selector", new a());
            resourceManagerInternal.a(PluginUtils.IDENTIFIER_DRAWABLE, new d());
        }
    }

    public static synchronized ResourceManagerInternal get() {
        try {
            if (f1358i == null) {
                ResourceManagerInternal resourceManagerInternal = new ResourceManagerInternal();
                f1358i = resourceManagerInternal;
                f(resourceManagerInternal);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f1358i;
    }

    public static synchronized PorterDuffColorFilter getPorterDuffColorFilter(int i10, PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilter;
        c cVar = f1359j;
        cVar.getClass();
        int i11 = (31 + i10) * 31;
        porterDuffColorFilter = cVar.get(Integer.valueOf(mode.hashCode() + i11));
        if (porterDuffColorFilter == null) {
            porterDuffColorFilter = new PorterDuffColorFilter(i10, mode);
            cVar.put(Integer.valueOf(mode.hashCode() + i11), porterDuffColorFilter);
        }
        return porterDuffColorFilter;
    }

    public final void a(@NonNull String str, @NonNull e eVar) {
        if (this.f1361b == null) {
            this.f1361b = new SimpleArrayMap<>();
        }
        this.f1361b.put(str, eVar);
    }

    public final synchronized void b(@NonNull Context context, long j10, @NonNull Drawable drawable) {
        try {
            Drawable.ConstantState constantState = drawable.getConstantState();
            if (constantState != null) {
                LongSparseArray<WeakReference<Drawable.ConstantState>> longSparseArray = this.f1363d.get(context);
                if (longSparseArray == null) {
                    longSparseArray = new LongSparseArray<>();
                    this.f1363d.put(context, longSparseArray);
                }
                longSparseArray.put(j10, new WeakReference<>(constantState));
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized Drawable c(@NonNull Context context, long j10) {
        LongSparseArray<WeakReference<Drawable.ConstantState>> longSparseArray = this.f1363d.get(context);
        if (longSparseArray == null) {
            return null;
        }
        WeakReference<Drawable.ConstantState> weakReference = longSparseArray.get(j10);
        if (weakReference != null) {
            Drawable.ConstantState constantState = weakReference.get();
            if (constantState != null) {
                return constantState.newDrawable(context.getResources());
            }
            longSparseArray.remove(j10);
        }
        return null;
    }

    public final synchronized Drawable d(@NonNull Context context, @DrawableRes int i10, boolean z10) {
        Drawable drawableG;
        try {
            if (!this.f1365f) {
                this.f1365f = true;
                Drawable drawable = getDrawable(context, R.drawable.abc_vector_test);
                if (drawable == null || (!(drawable instanceof VectorDrawableCompat) && !"android.graphics.drawable.VectorDrawable".equals(drawable.getClass().getName()))) {
                    this.f1365f = false;
                    throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
                }
            }
            drawableG = g(context, i10);
            if (drawableG == null) {
                if (this.f1364e == null) {
                    this.f1364e = new TypedValue();
                }
                TypedValue typedValue = this.f1364e;
                context.getResources().getValue(i10, typedValue, true);
                long j10 = (((long) typedValue.assetCookie) << 32) | ((long) typedValue.data);
                Drawable drawableC = c(context, j10);
                if (drawableC == null) {
                    ResourceManagerHooks resourceManagerHooks = this.f1366g;
                    drawableC = resourceManagerHooks == null ? null : resourceManagerHooks.createDrawableFor(this, context, i10);
                    if (drawableC != null) {
                        drawableC.setChangingConfigurations(typedValue.changingConfigurations);
                        b(context, j10, drawableC);
                    }
                }
                drawableG = drawableC;
            }
            if (drawableG == null) {
                drawableG = ContextCompat.getDrawable(context, i10);
            }
            if (drawableG != null) {
                drawableG = h(context, i10, z10, drawableG);
            }
            if (drawableG != null) {
                DrawableUtils.a(drawableG);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return drawableG;
    }

    public final synchronized ColorStateList e(@NonNull Context context, @DrawableRes int i10) {
        ColorStateList colorStateList;
        SparseArrayCompat<ColorStateList> sparseArrayCompat;
        WeakHashMap<Context, SparseArrayCompat<ColorStateList>> weakHashMap = this.f1360a;
        ColorStateList tintListForDrawableRes = null;
        colorStateList = (weakHashMap == null || (sparseArrayCompat = weakHashMap.get(context)) == null) ? null : sparseArrayCompat.get(i10);
        if (colorStateList == null) {
            ResourceManagerHooks resourceManagerHooks = this.f1366g;
            if (resourceManagerHooks != null) {
                tintListForDrawableRes = resourceManagerHooks.getTintListForDrawableRes(context, i10);
            }
            if (tintListForDrawableRes != null) {
                if (this.f1360a == null) {
                    this.f1360a = new WeakHashMap<>();
                }
                SparseArrayCompat<ColorStateList> sparseArrayCompat2 = this.f1360a.get(context);
                if (sparseArrayCompat2 == null) {
                    sparseArrayCompat2 = new SparseArrayCompat<>();
                    this.f1360a.put(context, sparseArrayCompat2);
                }
                sparseArrayCompat2.append(i10, tintListForDrawableRes);
            }
            colorStateList = tintListForDrawableRes;
        }
        return colorStateList;
    }

    public final Drawable g(@NonNull Context context, @DrawableRes int i10) {
        int next;
        SimpleArrayMap<String, e> simpleArrayMap = this.f1361b;
        if (simpleArrayMap == null || simpleArrayMap.isEmpty()) {
            return null;
        }
        SparseArrayCompat<String> sparseArrayCompat = this.f1362c;
        if (sparseArrayCompat != null) {
            String str = sparseArrayCompat.get(i10);
            if ("appcompat_skip_skip".equals(str) || (str != null && this.f1361b.get(str) == null)) {
                return null;
            }
        } else {
            this.f1362c = new SparseArrayCompat<>();
        }
        if (this.f1364e == null) {
            this.f1364e = new TypedValue();
        }
        TypedValue typedValue = this.f1364e;
        Resources resources = context.getResources();
        resources.getValue(i10, typedValue, true);
        long j10 = (((long) typedValue.assetCookie) << 32) | ((long) typedValue.data);
        Drawable drawableC = c(context, j10);
        if (drawableC != null) {
            return drawableC;
        }
        CharSequence charSequence = typedValue.string;
        if (charSequence != null && charSequence.toString().endsWith(".xml")) {
            try {
                XmlResourceParser xml = resources.getXml(i10);
                AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
                do {
                    next = xml.next();
                    if (next == 2) {
                        break;
                    }
                } while (next != 1);
                if (next != 2) {
                    throw new XmlPullParserException("No start tag found");
                }
                String name = xml.getName();
                this.f1362c.append(i10, name);
                e eVar = this.f1361b.get(name);
                if (eVar != null) {
                    drawableC = eVar.a(context, xml, attributeSetAsAttributeSet, context.getTheme());
                }
                if (drawableC != null) {
                    drawableC.setChangingConfigurations(typedValue.changingConfigurations);
                    b(context, j10, drawableC);
                }
            } catch (Exception unused) {
            }
        }
        if (drawableC == null) {
            this.f1362c.append(i10, "appcompat_skip_skip");
        }
        return drawableC;
    }

    public synchronized Drawable getDrawable(@NonNull Context context, @DrawableRes int i10) {
        return d(context, i10, false);
    }

    public final Drawable h(@NonNull Context context, @DrawableRes int i10, boolean z10, @NonNull Drawable drawable) {
        ColorStateList colorStateListE = e(context, i10);
        if (colorStateListE != null) {
            Drawable drawableWrap = DrawableCompat.wrap(drawable.mutate());
            DrawableCompat.setTintList(drawableWrap, colorStateListE);
            ResourceManagerHooks resourceManagerHooks = this.f1366g;
            PorterDuff.Mode tintModeForDrawableRes = resourceManagerHooks != null ? resourceManagerHooks.getTintModeForDrawableRes(i10) : null;
            if (tintModeForDrawableRes == null) {
                return drawableWrap;
            }
            DrawableCompat.setTintMode(drawableWrap, tintModeForDrawableRes);
            return drawableWrap;
        }
        ResourceManagerHooks resourceManagerHooks2 = this.f1366g;
        if (resourceManagerHooks2 != null && resourceManagerHooks2.tintDrawable(context, i10, drawable)) {
            return drawable;
        }
        ResourceManagerHooks resourceManagerHooks3 = this.f1366g;
        if ((resourceManagerHooks3 == null || !resourceManagerHooks3.tintDrawableUsingColorFilter(context, i10, drawable)) && z10) {
            return null;
        }
        return drawable;
    }

    public synchronized void onConfigurationChanged(@NonNull Context context) {
        LongSparseArray<WeakReference<Drawable.ConstantState>> longSparseArray = this.f1363d.get(context);
        if (longSparseArray != null) {
            longSparseArray.clear();
        }
    }

    public synchronized void setHooks(ResourceManagerHooks resourceManagerHooks) {
        this.f1366g = resourceManagerHooks;
    }
}
