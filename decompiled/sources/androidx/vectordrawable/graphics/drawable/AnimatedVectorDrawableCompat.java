package androidx.vectordrawable.graphics.drawable;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Xml;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.collection.ArrayMap;
import androidx.core.content.res.ResourcesCompat;
import androidx.core.content.res.TypedArrayUtils;
import androidx.core.graphics.drawable.DrawableCompat;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes2.dex */
public class AnimatedVectorDrawableCompat extends androidx.vectordrawable.graphics.drawable.b implements Animatable2Compat {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final c f23754q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final Context f23755r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public b f23756s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public ArrayList<Animatable2Compat.AnimationCallback> f23757t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final a f23758u0;

    public class a implements Drawable.Callback {
        public a() {
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public final void invalidateDrawable(Drawable drawable) {
            AnimatedVectorDrawableCompat.this.invalidateSelf();
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
            AnimatedVectorDrawableCompat.this.scheduleSelf(runnable, j10);
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
            AnimatedVectorDrawableCompat.this.unscheduleSelf(runnable);
        }
    }

    public class b extends AnimatorListenerAdapter {
        public b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            AnimatedVectorDrawableCompat animatedVectorDrawableCompat = AnimatedVectorDrawableCompat.this;
            ArrayList arrayList = new ArrayList(animatedVectorDrawableCompat.f23757t0);
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((Animatable2Compat.AnimationCallback) arrayList.get(i10)).onAnimationEnd(animatedVectorDrawableCompat);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
            AnimatedVectorDrawableCompat animatedVectorDrawableCompat = AnimatedVectorDrawableCompat.this;
            ArrayList arrayList = new ArrayList(animatedVectorDrawableCompat.f23757t0);
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((Animatable2Compat.AnimationCallback) arrayList.get(i10)).onAnimationStart(animatedVectorDrawableCompat);
            }
        }
    }

    public static class c extends Drawable.ConstantState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public VectorDrawableCompat f23761a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public AnimatorSet f23762b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public ArrayList<Animator> f23763c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public ArrayMap<Animator, String> f23764d;

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable() {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable(Resources resources) {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }
    }

    public AnimatedVectorDrawableCompat() {
        this(null);
    }

    @Nullable
    public static AnimatedVectorDrawableCompat create(@NonNull Context context, @DrawableRes int i10) {
        int next;
        if (Build.VERSION.SDK_INT >= 24) {
            AnimatedVectorDrawableCompat animatedVectorDrawableCompat = new AnimatedVectorDrawableCompat(context);
            Drawable drawable = ResourcesCompat.getDrawable(context.getResources(), i10, context.getTheme());
            animatedVectorDrawableCompat.f23844p0 = drawable;
            drawable.setCallback(animatedVectorDrawableCompat.f23758u0);
            new d(animatedVectorDrawableCompat.f23844p0.getConstantState());
            return animatedVectorDrawableCompat;
        }
        try {
            XmlResourceParser xml = context.getResources().getXml(i10);
            AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
            do {
                next = xml.next();
                if (next == 2) {
                    break;
                }
            } while (next != 1);
            if (next == 2) {
                return createFromXmlInner(context, context.getResources(), xml, attributeSetAsAttributeSet, context.getTheme());
            }
            throw new XmlPullParserException("No start tag found");
        } catch (IOException | XmlPullParserException unused) {
            return null;
        }
    }

    public static AnimatedVectorDrawableCompat createFromXmlInner(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        AnimatedVectorDrawableCompat animatedVectorDrawableCompat = new AnimatedVectorDrawableCompat(context);
        animatedVectorDrawableCompat.inflate(resources, xmlPullParser, attributeSet, theme);
        return animatedVectorDrawableCompat;
    }

    @Override // androidx.vectordrawable.graphics.drawable.b, android.graphics.drawable.Drawable
    public void applyTheme(Resources.Theme theme) {
        Drawable drawable = this.f23844p0;
        if (drawable != null) {
            DrawableCompat.applyTheme(drawable, theme);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean canApplyTheme() {
        Drawable drawable = this.f23844p0;
        if (drawable != null) {
            return DrawableCompat.canApplyTheme(drawable);
        }
        return false;
    }

    @Override // androidx.vectordrawable.graphics.drawable.Animatable2Compat
    public void clearAnimationCallbacks() {
        Drawable drawable = this.f23844p0;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).clearAnimationCallbacks();
            return;
        }
        b bVar = this.f23756s0;
        if (bVar != null) {
            this.f23754q0.f23762b.removeListener(bVar);
            this.f23756s0 = null;
        }
        ArrayList<Animatable2Compat.AnimationCallback> arrayList = this.f23757t0;
        if (arrayList == null) {
            return;
        }
        arrayList.clear();
    }

    @Override // androidx.vectordrawable.graphics.drawable.b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void clearColorFilter() {
        super.clearColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Drawable drawable = this.f23844p0;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        c cVar = this.f23754q0;
        cVar.f23761a.draw(canvas);
        if (cVar.f23762b.isStarted()) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        Drawable drawable = this.f23844p0;
        return drawable != null ? DrawableCompat.getAlpha(drawable) : this.f23754q0.f23761a.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        Drawable drawable = this.f23844p0;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        int changingConfigurations = super.getChangingConfigurations();
        this.f23754q0.getClass();
        return changingConfigurations | 0;
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        Drawable drawable = this.f23844p0;
        return drawable != null ? DrawableCompat.getColorFilter(drawable) : this.f23754q0.f23761a.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        if (this.f23844p0 == null || Build.VERSION.SDK_INT < 24) {
            return null;
        }
        return new d(this.f23844p0.getConstantState());
    }

    @Override // androidx.vectordrawable.graphics.drawable.b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ Drawable getCurrent() {
        return super.getCurrent();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        Drawable drawable = this.f23844p0;
        return drawable != null ? drawable.getIntrinsicHeight() : this.f23754q0.f23761a.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        Drawable drawable = this.f23844p0;
        return drawable != null ? drawable.getIntrinsicWidth() : this.f23754q0.f23761a.getIntrinsicWidth();
    }

    @Override // androidx.vectordrawable.graphics.drawable.b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumHeight() {
        return super.getMinimumHeight();
    }

    @Override // androidx.vectordrawable.graphics.drawable.b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumWidth() {
        return super.getMinimumWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        Drawable drawable = this.f23844p0;
        return drawable != null ? drawable.getOpacity() : this.f23754q0.f23761a.getOpacity();
    }

    @Override // androidx.vectordrawable.graphics.drawable.b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean getPadding(Rect rect) {
        return super.getPadding(rect);
    }

    @Override // androidx.vectordrawable.graphics.drawable.b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int[] getState() {
        return super.getState();
    }

    @Override // androidx.vectordrawable.graphics.drawable.b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ Region getTransparentRegion() {
        return super.getTransparentRegion();
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        c cVar;
        Drawable drawable = this.f23844p0;
        if (drawable != null) {
            DrawableCompat.inflate(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        while (true) {
            cVar = this.f23754q0;
            if (eventType == 1 || (xmlPullParser.getDepth() < depth && eventType == 3)) {
                break;
            }
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if ("animated-vector".equals(name)) {
                    TypedArray typedArrayObtainAttributes = TypedArrayUtils.obtainAttributes(resources, theme, attributeSet, androidx.vectordrawable.graphics.drawable.a.f23836e);
                    int resourceId = typedArrayObtainAttributes.getResourceId(0, 0);
                    if (resourceId != 0) {
                        VectorDrawableCompat vectorDrawableCompatCreate = VectorDrawableCompat.create(resources, resourceId, theme);
                        vectorDrawableCompatCreate.f23775u0 = false;
                        vectorDrawableCompatCreate.setCallback(this.f23758u0);
                        VectorDrawableCompat vectorDrawableCompat = cVar.f23761a;
                        if (vectorDrawableCompat != null) {
                            vectorDrawableCompat.setCallback(null);
                        }
                        cVar.f23761a = vectorDrawableCompatCreate;
                    }
                    typedArrayObtainAttributes.recycle();
                } else if ("target".equals(name)) {
                    TypedArray typedArrayObtainAttributes2 = resources.obtainAttributes(attributeSet, androidx.vectordrawable.graphics.drawable.a.f23837f);
                    String string = typedArrayObtainAttributes2.getString(0);
                    int resourceId2 = typedArrayObtainAttributes2.getResourceId(1, 0);
                    if (resourceId2 != 0) {
                        Context context = this.f23755r0;
                        if (context == null) {
                            typedArrayObtainAttributes2.recycle();
                            throw new IllegalStateException("Context can't be null when inflating animators");
                        }
                        Animator animatorLoadAnimator = AnimatorInflaterCompat.loadAnimator(context, resourceId2);
                        animatorLoadAnimator.setTarget(cVar.f23761a.f23771q0.f23820b.f23818o.get(string));
                        if (cVar.f23763c == null) {
                            cVar.f23763c = new ArrayList<>();
                            cVar.f23764d = new ArrayMap<>();
                        }
                        cVar.f23763c.add(animatorLoadAnimator);
                        cVar.f23764d.put(animatorLoadAnimator, string);
                    }
                    typedArrayObtainAttributes2.recycle();
                } else {
                    continue;
                }
            }
            eventType = xmlPullParser.next();
        }
        if (cVar.f23762b == null) {
            cVar.f23762b = new AnimatorSet();
        }
        cVar.f23762b.playTogether(cVar.f23763c);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        Drawable drawable = this.f23844p0;
        return drawable != null ? DrawableCompat.isAutoMirrored(drawable) : this.f23754q0.f23761a.isAutoMirrored();
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        Drawable drawable = this.f23844p0;
        return drawable != null ? ((AnimatedVectorDrawable) drawable).isRunning() : this.f23754q0.f23762b.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        Drawable drawable = this.f23844p0;
        return drawable != null ? drawable.isStateful() : this.f23754q0.f23761a.isStateful();
    }

    @Override // androidx.vectordrawable.graphics.drawable.b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void jumpToCurrentState() {
        super.jumpToCurrentState();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        Drawable drawable = this.f23844p0;
        if (drawable != null) {
            drawable.mutate();
        }
        return this;
    }

    @Override // androidx.vectordrawable.graphics.drawable.b, android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.f23844p0;
        if (drawable != null) {
            drawable.setBounds(rect);
        } else {
            this.f23754q0.f23761a.setBounds(rect);
        }
    }

    @Override // androidx.vectordrawable.graphics.drawable.b, android.graphics.drawable.Drawable
    public boolean onLevelChange(int i10) {
        Drawable drawable = this.f23844p0;
        return drawable != null ? drawable.setLevel(i10) : this.f23754q0.f23761a.setLevel(i10);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f23844p0;
        return drawable != null ? drawable.setState(iArr) : this.f23754q0.f23761a.setState(iArr);
    }

    @Override // androidx.vectordrawable.graphics.drawable.Animatable2Compat
    public void registerAnimationCallback(@NonNull Animatable2Compat.AnimationCallback animationCallback) {
        Drawable drawable = this.f23844p0;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).registerAnimationCallback(animationCallback.getPlatformCallback());
            return;
        }
        if (animationCallback == null) {
            return;
        }
        if (this.f23757t0 == null) {
            this.f23757t0 = new ArrayList<>();
        }
        if (this.f23757t0.contains(animationCallback)) {
            return;
        }
        this.f23757t0.add(animationCallback);
        if (this.f23756s0 == null) {
            this.f23756s0 = new b();
        }
        this.f23754q0.f23762b.addListener(this.f23756s0);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        Drawable drawable = this.f23844p0;
        if (drawable != null) {
            drawable.setAlpha(i10);
        } else {
            this.f23754q0.f23761a.setAlpha(i10);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z10) {
        Drawable drawable = this.f23844p0;
        if (drawable != null) {
            DrawableCompat.setAutoMirrored(drawable, z10);
        } else {
            this.f23754q0.f23761a.setAutoMirrored(z10);
        }
    }

    @Override // androidx.vectordrawable.graphics.drawable.b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setChangingConfigurations(int i10) {
        super.setChangingConfigurations(i10);
    }

    @Override // androidx.vectordrawable.graphics.drawable.b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setColorFilter(int i10, PorterDuff.Mode mode) {
        super.setColorFilter(i10, mode);
    }

    @Override // androidx.vectordrawable.graphics.drawable.b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setFilterBitmap(boolean z10) {
        super.setFilterBitmap(z10);
    }

    @Override // androidx.vectordrawable.graphics.drawable.b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspot(float f6, float f10) {
        super.setHotspot(f6, f10);
    }

    @Override // androidx.vectordrawable.graphics.drawable.b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspotBounds(int i10, int i11, int i12, int i13) {
        super.setHotspotBounds(i10, i11, i12, i13);
    }

    @Override // androidx.vectordrawable.graphics.drawable.b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean setState(int[] iArr) {
        return super.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.TintAwareDrawable
    public void setTint(int i10) {
        Drawable drawable = this.f23844p0;
        if (drawable != null) {
            DrawableCompat.setTint(drawable, i10);
        } else {
            this.f23754q0.f23761a.setTint(i10);
        }
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.TintAwareDrawable
    public void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f23844p0;
        if (drawable != null) {
            DrawableCompat.setTintList(drawable, colorStateList);
        } else {
            this.f23754q0.f23761a.setTintList(colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.TintAwareDrawable
    public void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f23844p0;
        if (drawable != null) {
            DrawableCompat.setTintMode(drawable, mode);
        } else {
            this.f23754q0.f23761a.setTintMode(mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z10, boolean z11) {
        Drawable drawable = this.f23844p0;
        if (drawable != null) {
            return drawable.setVisible(z10, z11);
        }
        this.f23754q0.f23761a.setVisible(z10, z11);
        return super.setVisible(z10, z11);
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        Drawable drawable = this.f23844p0;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).start();
            return;
        }
        c cVar = this.f23754q0;
        if (cVar.f23762b.isStarted()) {
            return;
        }
        cVar.f23762b.start();
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        Drawable drawable = this.f23844p0;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).stop();
        } else {
            this.f23754q0.f23762b.end();
        }
    }

    @Override // androidx.vectordrawable.graphics.drawable.Animatable2Compat
    public boolean unregisterAnimationCallback(@NonNull Animatable2Compat.AnimationCallback animationCallback) {
        b bVar;
        Drawable drawable = this.f23844p0;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).unregisterAnimationCallback(animationCallback.getPlatformCallback());
        }
        ArrayList<Animatable2Compat.AnimationCallback> arrayList = this.f23757t0;
        if (arrayList == null || animationCallback == null) {
            return false;
        }
        boolean zRemove = arrayList.remove(animationCallback);
        if (this.f23757t0.size() == 0 && (bVar = this.f23756s0) != null) {
            this.f23754q0.f23762b.removeListener(bVar);
            this.f23756s0 = null;
        }
        return zRemove;
    }

    public AnimatedVectorDrawableCompat(@Nullable Context context) {
        this.f23756s0 = null;
        this.f23757t0 = null;
        this.f23758u0 = new a();
        this.f23755r0 = context;
        this.f23754q0 = new c();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f23844p0;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f23754q0.f23761a.setColorFilter(colorFilter);
        }
    }

    @RequiresApi(24)
    public static class d extends Drawable.ConstantState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Drawable.ConstantState f23765a;

        public d(Drawable.ConstantState constantState) {
            this.f23765a = constantState;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final boolean canApplyTheme() {
            return this.f23765a.canApplyTheme();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final int getChangingConfigurations() {
            return this.f23765a.getChangingConfigurations();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable() {
            AnimatedVectorDrawableCompat animatedVectorDrawableCompat = new AnimatedVectorDrawableCompat();
            Drawable drawableNewDrawable = this.f23765a.newDrawable();
            animatedVectorDrawableCompat.f23844p0 = drawableNewDrawable;
            drawableNewDrawable.setCallback(animatedVectorDrawableCompat.f23758u0);
            return animatedVectorDrawableCompat;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable(Resources resources) {
            AnimatedVectorDrawableCompat animatedVectorDrawableCompat = new AnimatedVectorDrawableCompat();
            Drawable drawableNewDrawable = this.f23765a.newDrawable(resources);
            animatedVectorDrawableCompat.f23844p0 = drawableNewDrawable;
            drawableNewDrawable.setCallback(animatedVectorDrawableCompat.f23758u0);
            return animatedVectorDrawableCompat;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable(Resources resources, Resources.Theme theme) {
            AnimatedVectorDrawableCompat animatedVectorDrawableCompat = new AnimatedVectorDrawableCompat();
            Drawable drawableNewDrawable = this.f23765a.newDrawable(resources, theme);
            animatedVectorDrawableCompat.f23844p0 = drawableNewDrawable;
            drawableNewDrawable.setCallback(animatedVectorDrawableCompat.f23758u0);
            return animatedVectorDrawableCompat;
        }
    }

    public static void clearAnimationCallbacks(Drawable drawable) {
        if (drawable instanceof Animatable) {
            if (Build.VERSION.SDK_INT >= 24) {
                ((AnimatedVectorDrawable) drawable).clearAnimationCallbacks();
            } else {
                ((AnimatedVectorDrawableCompat) drawable).clearAnimationCallbacks();
            }
        }
    }

    public static boolean unregisterAnimationCallback(Drawable drawable, Animatable2Compat.AnimationCallback animationCallback) {
        if (drawable == null || animationCallback == null || !(drawable instanceof Animatable)) {
            return false;
        }
        if (Build.VERSION.SDK_INT >= 24) {
            return ((AnimatedVectorDrawable) drawable).unregisterAnimationCallback(animationCallback.getPlatformCallback());
        }
        return ((AnimatedVectorDrawableCompat) drawable).unregisterAnimationCallback(animationCallback);
    }

    public static void registerAnimationCallback(Drawable drawable, Animatable2Compat.AnimationCallback animationCallback) {
        if (drawable == null || animationCallback == null || !(drawable instanceof Animatable)) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 24) {
            ((AnimatedVectorDrawable) drawable).registerAnimationCallback(animationCallback.getPlatformCallback());
        } else {
            ((AnimatedVectorDrawableCompat) drawable).registerAnimationCallback(animationCallback);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        inflate(resources, xmlPullParser, attributeSet, null);
    }
}
