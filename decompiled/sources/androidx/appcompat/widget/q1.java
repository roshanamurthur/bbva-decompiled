package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: TintResources.java */
/* JADX INFO: loaded from: classes.dex */
public final class q1 extends i1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final WeakReference<Context> f1659b;

    public q1(@NonNull Context context, @NonNull Resources resources) {
        super(resources);
        this.f1659b = new WeakReference<>(context);
    }

    @Override // androidx.appcompat.widget.i1, android.content.res.Resources
    public final Drawable getDrawable(int i10) throws Resources.NotFoundException {
        ResourceManagerInternal.ResourceManagerHooks resourceManagerHooks;
        Drawable drawableA = a(i10);
        Context context = this.f1659b.get();
        if (drawableA != null && context != null && (resourceManagerHooks = ResourceManagerInternal.get().f1366g) != null) {
            resourceManagerHooks.tintDrawableUsingColorFilter(context, i10, drawableA);
        }
        return drawableA;
    }
}
