package androidx.appcompat.graphics.drawable;

import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.StateSet;
import android.util.Xml;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.resources.Compatibility;
import androidx.appcompat.resources.R;
import androidx.appcompat.widget.ResourceManagerInternal;
import androidx.collection.LongSparseArray;
import androidx.collection.SparseArrayCompat;
import androidx.core.content.res.TypedArrayUtils;
import androidx.core.graphics.drawable.TintAwareDrawable;
import androidx.core.util.ObjectsCompat;
import androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat;
import androidx.vectordrawable.graphics.drawable.VectorDrawableCompat;
import com.bbva.component.dm.analytics.constants.AnalyticsConstants;
import com.bbva.ethermobilesdk.geolocation.utils.ConstantsKt;
import com.mastercard.sonic.androidsvg.SvgConstantsKt;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public class AnimatedStateListDrawableCompat extends StateListDrawableCompat implements TintAwareDrawable {
    public b J0;
    public f K0;
    public int L0;
    public int M0;
    public boolean N0;

    public static class a extends f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Animatable f745a;

        public a(Animatable animatable) {
            this.f745a = animatable;
        }

        @Override // androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat.f
        public final void c() {
            this.f745a.start();
        }

        @Override // androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat.f
        public final void d() {
            this.f745a.stop();
        }
    }

    public static class b extends StateListDrawableCompat.a {
        public LongSparseArray<Long> J;
        public SparseArrayCompat<Integer> K;

        public b(@Nullable b bVar, @NonNull AnimatedStateListDrawableCompat animatedStateListDrawableCompat, @Nullable Resources resources) {
            super(bVar, animatedStateListDrawableCompat, resources);
            if (bVar != null) {
                this.J = bVar.J;
                this.K = bVar.K;
            } else {
                this.J = new LongSparseArray<>();
                this.K = new SparseArrayCompat<>();
            }
        }

        @Override // androidx.appcompat.graphics.drawable.StateListDrawableCompat.a, androidx.appcompat.graphics.drawable.DrawableContainerCompat.c
        public final void e() {
            this.J = this.J.m25clone();
            this.K = this.K.m26clone();
        }

        public final int g(int i10, int i11, @NonNull Drawable drawable, boolean z10) {
            int iA = a(drawable);
            long j10 = i10;
            long j11 = i11;
            long j12 = (j10 << 32) | j11;
            long j13 = z10 ? SvgConstantsKt.SPECIFIED_VIEWPORT_FILL : 0L;
            long j14 = iA;
            this.J.append(j12, Long.valueOf(j14 | j13));
            if (z10) {
                this.J.append(j10 | (j11 << 32), Long.valueOf(SvgConstantsKt.SPECIFIED_SOLID_OPACITY | j14 | j13));
            }
            return iA;
        }

        @Override // androidx.appcompat.graphics.drawable.StateListDrawableCompat.a, android.graphics.drawable.Drawable.ConstantState
        @NonNull
        public final Drawable newDrawable() {
            return new AnimatedStateListDrawableCompat(this, null);
        }

        @Override // androidx.appcompat.graphics.drawable.StateListDrawableCompat.a, android.graphics.drawable.Drawable.ConstantState
        @NonNull
        public final Drawable newDrawable(Resources resources) {
            return new AnimatedStateListDrawableCompat(this, resources);
        }
    }

    public static class c extends f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AnimatedVectorDrawableCompat f746a;

        public c(AnimatedVectorDrawableCompat animatedVectorDrawableCompat) {
            this.f746a = animatedVectorDrawableCompat;
        }

        @Override // androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat.f
        public final void c() {
            this.f746a.start();
        }

        @Override // androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat.f
        public final void d() {
            this.f746a.stop();
        }
    }

    public static class d extends f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ObjectAnimator f747a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f748b;

        public d(AnimationDrawable animationDrawable, boolean z10, boolean z11) {
            int numberOfFrames = animationDrawable.getNumberOfFrames();
            int i10 = z10 ? numberOfFrames - 1 : 0;
            int i11 = z10 ? 0 : numberOfFrames - 1;
            e eVar = new e();
            int numberOfFrames2 = animationDrawable.getNumberOfFrames();
            eVar.f750b = numberOfFrames2;
            int[] iArr = eVar.f749a;
            if (iArr == null || iArr.length < numberOfFrames2) {
                eVar.f749a = new int[numberOfFrames2];
            }
            int[] iArr2 = eVar.f749a;
            int i12 = 0;
            for (int i13 = 0; i13 < numberOfFrames2; i13++) {
                int duration = animationDrawable.getDuration(z10 ? (numberOfFrames2 - i13) - 1 : i13);
                iArr2[i13] = duration;
                i12 += duration;
            }
            eVar.f751c = i12;
            ObjectAnimator objectAnimatorOfInt = ObjectAnimator.ofInt(animationDrawable, "currentIndex", i10, i11);
            objectAnimatorOfInt.setAutoCancel(true);
            objectAnimatorOfInt.setDuration(eVar.f751c);
            objectAnimatorOfInt.setInterpolator(eVar);
            this.f748b = z11;
            this.f747a = objectAnimatorOfInt;
        }

        @Override // androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat.f
        public final boolean a() {
            return this.f748b;
        }

        @Override // androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat.f
        public final void b() {
            this.f747a.reverse();
        }

        @Override // androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat.f
        public final void c() {
            this.f747a.start();
        }

        @Override // androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat.f
        public final void d() {
            this.f747a.cancel();
        }
    }

    public static class e implements TimeInterpolator {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int[] f749a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f750b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f751c;

        @Override // android.animation.TimeInterpolator
        public final float getInterpolation(float f6) {
            int i10 = (int) ((f6 * this.f751c) + 0.5f);
            int i11 = this.f750b;
            int[] iArr = this.f749a;
            int i12 = 0;
            while (i12 < i11) {
                int i13 = iArr[i12];
                if (i10 < i13) {
                    break;
                }
                i10 -= i13;
                i12++;
            }
            return (i12 / i11) + (i12 < i11 ? i10 / this.f751c : 0.0f);
        }
    }

    public AnimatedStateListDrawableCompat() {
        this(null, null);
    }

    @Nullable
    public static AnimatedStateListDrawableCompat create(@NonNull Context context, @DrawableRes int i10, @Nullable Resources.Theme theme) {
        int next;
        try {
            Resources resources = context.getResources();
            XmlResourceParser xml = resources.getXml(i10);
            AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
            do {
                next = xml.next();
                if (next == 2) {
                    break;
                }
            } while (next != 1);
            if (next == 2) {
                return createFromXmlInner(context, resources, xml, attributeSetAsAttributeSet, theme);
            }
            throw new XmlPullParserException("No start tag found");
        } catch (IOException | XmlPullParserException unused) {
            return null;
        }
    }

    @NonNull
    public static AnimatedStateListDrawableCompat createFromXmlInner(@NonNull Context context, @NonNull Resources resources, @NonNull XmlPullParser xmlPullParser, @NonNull AttributeSet attributeSet, @Nullable Resources.Theme theme) throws XmlPullParserException, IOException {
        String name = xmlPullParser.getName();
        if (name.equals("animated-selector")) {
            AnimatedStateListDrawableCompat animatedStateListDrawableCompat = new AnimatedStateListDrawableCompat();
            animatedStateListDrawableCompat.inflate(context, resources, xmlPullParser, attributeSet, theme);
            return animatedStateListDrawableCompat;
        }
        throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": invalid animated-selector tag " + name);
    }

    public void addState(@NonNull int[] iArr, @NonNull Drawable drawable, int i10) {
        ObjectsCompat.requireNonNull(drawable);
        b bVar = this.J0;
        int iA = bVar.a(drawable);
        bVar.I[iA] = iArr;
        bVar.K.put(iA, Integer.valueOf(i10));
        onStateChange(getState());
    }

    public <T extends Drawable & Animatable> void addTransition(int i10, int i11, @NonNull T t10, boolean z10) {
        ObjectsCompat.requireNonNull(t10);
        this.J0.g(i10, i11, t10, z10);
    }

    @Override // androidx.appcompat.graphics.drawable.StateListDrawableCompat, androidx.appcompat.graphics.drawable.DrawableContainerCompat
    public final DrawableContainerCompat.c b() {
        return new b(this.J0, this, null);
    }

    @Override // androidx.appcompat.graphics.drawable.StateListDrawableCompat, androidx.appcompat.graphics.drawable.DrawableContainerCompat
    public final void e(@NonNull DrawableContainerCompat.c cVar) {
        super.e(cVar);
        if (cVar instanceof b) {
            this.J0 = (b) cVar;
        }
    }

    @Override // androidx.appcompat.graphics.drawable.StateListDrawableCompat
    /* JADX INFO: renamed from: f */
    public final StateListDrawableCompat.a b() {
        return new b(this.J0, this, null);
    }

    @Override // androidx.appcompat.graphics.drawable.StateListDrawableCompat
    public void inflate(@NonNull Context context, @NonNull Resources resources, @NonNull XmlPullParser xmlPullParser, @NonNull AttributeSet attributeSet, @Nullable Resources.Theme theme) throws XmlPullParserException, IOException {
        int depth;
        Drawable drawable;
        int next;
        int next2;
        TypedArray typedArrayObtainAttributes = TypedArrayUtils.obtainAttributes(resources, theme, attributeSet, R.styleable.AnimatedStateListDrawableCompat);
        setVisible(typedArrayObtainAttributes.getBoolean(R.styleable.AnimatedStateListDrawableCompat_android_visible, true), true);
        b bVar = this.J0;
        bVar.f766d |= Compatibility.Api21Impl.getChangingConfigurations(typedArrayObtainAttributes);
        bVar.f771i = typedArrayObtainAttributes.getBoolean(R.styleable.AnimatedStateListDrawableCompat_android_variablePadding, bVar.f771i);
        bVar.f774l = typedArrayObtainAttributes.getBoolean(R.styleable.AnimatedStateListDrawableCompat_android_constantSize, bVar.f774l);
        bVar.f787z = typedArrayObtainAttributes.getInt(R.styleable.AnimatedStateListDrawableCompat_android_enterFadeDuration, bVar.f787z);
        bVar.A = typedArrayObtainAttributes.getInt(R.styleable.AnimatedStateListDrawableCompat_android_exitFadeDuration, bVar.A);
        setDither(typedArrayObtainAttributes.getBoolean(R.styleable.AnimatedStateListDrawableCompat_android_dither, bVar.f785x));
        DrawableContainerCompat.c cVar = this.f752p0;
        if (resources != null) {
            cVar.f764b = resources;
            int i10 = resources.getDisplayMetrics().densityDpi;
            if (i10 == 0) {
                i10 = 160;
            }
            int i11 = cVar.f765c;
            cVar.f765c = i10;
            if (i11 != i10) {
                cVar.m = false;
                cVar.f772j = false;
            }
        } else {
            cVar.getClass();
        }
        typedArrayObtainAttributes.recycle();
        int depth2 = xmlPullParser.getDepth() + 1;
        while (true) {
            int next3 = xmlPullParser.next();
            if (next3 == 1 || ((depth = xmlPullParser.getDepth()) < depth2 && next3 == 3)) {
                break;
            }
            if (next3 == 2 && depth <= depth2) {
                if (xmlPullParser.getName().equals(AnalyticsConstants.Key.ITEM)) {
                    TypedArray typedArrayObtainAttributes2 = TypedArrayUtils.obtainAttributes(resources, theme, attributeSet, R.styleable.AnimatedStateListDrawableItem);
                    int resourceId = typedArrayObtainAttributes2.getResourceId(R.styleable.AnimatedStateListDrawableItem_android_id, 0);
                    int resourceId2 = typedArrayObtainAttributes2.getResourceId(R.styleable.AnimatedStateListDrawableItem_android_drawable, -1);
                    drawable = resourceId2 > 0 ? ResourceManagerInternal.get().getDrawable(context, resourceId2) : null;
                    typedArrayObtainAttributes2.recycle();
                    int[] iArrG = StateListDrawableCompat.g(attributeSet);
                    if (drawable == null) {
                        do {
                            next = xmlPullParser.next();
                        } while (next == 4);
                        if (next != 2) {
                            throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <item> tag requires a 'drawable' attribute or child tag defining a drawable");
                        }
                        drawable = xmlPullParser.getName().equals("vector") ? VectorDrawableCompat.createFromXmlInner(resources, xmlPullParser, attributeSet, theme) : Compatibility.Api21Impl.createFromXmlInner(resources, xmlPullParser, attributeSet, theme);
                    }
                    if (drawable == null) {
                        throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <item> tag requires a 'drawable' attribute or child tag defining a drawable");
                    }
                    b bVar2 = this.J0;
                    int iA = bVar2.a(drawable);
                    bVar2.I[iA] = iArrG;
                    bVar2.K.put(iA, Integer.valueOf(resourceId));
                } else if (xmlPullParser.getName().equals(ConstantsKt.TRANSITION_EXTRA_ID)) {
                    TypedArray typedArrayObtainAttributes3 = TypedArrayUtils.obtainAttributes(resources, theme, attributeSet, R.styleable.AnimatedStateListDrawableTransition);
                    int resourceId3 = typedArrayObtainAttributes3.getResourceId(R.styleable.AnimatedStateListDrawableTransition_android_fromId, -1);
                    int resourceId4 = typedArrayObtainAttributes3.getResourceId(R.styleable.AnimatedStateListDrawableTransition_android_toId, -1);
                    int resourceId5 = typedArrayObtainAttributes3.getResourceId(R.styleable.AnimatedStateListDrawableTransition_android_drawable, -1);
                    drawable = resourceId5 > 0 ? ResourceManagerInternal.get().getDrawable(context, resourceId5) : null;
                    boolean z10 = typedArrayObtainAttributes3.getBoolean(R.styleable.AnimatedStateListDrawableTransition_android_reversible, false);
                    typedArrayObtainAttributes3.recycle();
                    if (drawable == null) {
                        do {
                            next2 = xmlPullParser.next();
                        } while (next2 == 4);
                        if (next2 != 2) {
                            throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <transition> tag requires a 'drawable' attribute or child tag defining a drawable");
                        }
                        drawable = xmlPullParser.getName().equals("animated-vector") ? AnimatedVectorDrawableCompat.createFromXmlInner(context, resources, xmlPullParser, attributeSet, theme) : Compatibility.Api21Impl.createFromXmlInner(resources, xmlPullParser, attributeSet, theme);
                    }
                    if (drawable == null) {
                        throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <transition> tag requires a 'drawable' attribute or child tag defining a drawable");
                    }
                    if (resourceId3 == -1 || resourceId4 == -1) {
                        throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <transition> tag requires 'fromId' & 'toId' attributes");
                    }
                    this.J0.g(resourceId3, resourceId4, drawable, z10);
                } else {
                    continue;
                }
            }
        }
        onStateChange(getState());
    }

    @Override // androidx.appcompat.graphics.drawable.StateListDrawableCompat, androidx.appcompat.graphics.drawable.DrawableContainerCompat, android.graphics.drawable.Drawable
    public boolean isStateful() {
        return true;
    }

    @Override // androidx.appcompat.graphics.drawable.DrawableContainerCompat, android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        super.jumpToCurrentState();
        f fVar = this.K0;
        if (fVar != null) {
            fVar.d();
            this.K0 = null;
            d(this.L0);
            this.L0 = -1;
            this.M0 = -1;
        }
    }

    @Override // androidx.appcompat.graphics.drawable.StateListDrawableCompat, androidx.appcompat.graphics.drawable.DrawableContainerCompat, android.graphics.drawable.Drawable
    @NonNull
    public Drawable mutate() {
        if (!this.N0 && super.mutate() == this) {
            this.J0.e();
            this.N0 = true;
        }
        return this;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0045  */
    /* JADX WARN: Code duplicated, block: B:22:0x004a  */
    /* JADX WARN: Code duplicated, block: B:24:0x005c  */
    /* JADX WARN: Code duplicated, block: B:25:0x005e  */
    /* JADX WARN: Code duplicated, block: B:49:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:51:0x0105  */
    @Override // androidx.appcompat.graphics.drawable.StateListDrawableCompat, androidx.appcompat.graphics.drawable.DrawableContainerCompat, android.graphics.drawable.Drawable
    public boolean onStateChange(@NonNull int[] iArr) {
        b bVar;
        int iIntValue;
        int iIntValue2;
        f aVar;
        b bVar2 = this.J0;
        int iF = bVar2.f(iArr);
        if (iF < 0) {
            iF = bVar2.f(StateSet.WILD_CARD);
        }
        int i10 = this.v0;
        boolean z10 = false;
        if (iF != i10) {
            f fVar = this.K0;
            if (fVar == null) {
                this.K0 = null;
                this.M0 = -1;
                this.L0 = -1;
                bVar = this.J0;
                if (i10 < 0) {
                    bVar.getClass();
                    iIntValue = 0;
                } else {
                    iIntValue = bVar.K.get(i10, 0).intValue();
                }
                if (iF < 0) {
                    iIntValue2 = 0;
                } else {
                    iIntValue2 = bVar.K.get(iF, 0).intValue();
                }
                if (iIntValue2 == 0 && iIntValue != 0) {
                    long j10 = ((long) iIntValue2) | (((long) iIntValue) << 32);
                    int iLongValue = (int) bVar.J.get(j10, -1L).longValue();
                    if (iLongValue >= 0) {
                        boolean z11 = (bVar.J.get(j10, -1L).longValue() & SvgConstantsKt.SPECIFIED_VIEWPORT_FILL) != 0;
                        d(iLongValue);
                        Object current = getCurrent();
                        if (current instanceof AnimationDrawable) {
                            aVar = new d((AnimationDrawable) current, (bVar.J.get(j10, -1L).longValue() & SvgConstantsKt.SPECIFIED_SOLID_OPACITY) != 0, z11);
                        } else if (current instanceof AnimatedVectorDrawableCompat) {
                            aVar = new c((AnimatedVectorDrawableCompat) current);
                        } else if (current instanceof Animatable) {
                            aVar = new a((Animatable) current);
                        } else if (d(iF)) {
                            z10 = true;
                        }
                        aVar.c();
                        this.K0 = aVar;
                        this.M0 = i10;
                        this.L0 = iF;
                        z10 = true;
                    } else if (d(iF)) {
                        z10 = true;
                    }
                } else if (d(iF)) {
                    z10 = true;
                }
            } else {
                if (iF != this.L0) {
                    if (iF == this.M0 && fVar.a()) {
                        fVar.b();
                        this.L0 = this.M0;
                        this.M0 = iF;
                    } else {
                        i10 = this.L0;
                        fVar.d();
                        this.K0 = null;
                        this.M0 = -1;
                        this.L0 = -1;
                        bVar = this.J0;
                        if (i10 < 0) {
                            bVar.getClass();
                            iIntValue = 0;
                        } else {
                            iIntValue = bVar.K.get(i10, 0).intValue();
                        }
                        if (iF < 0) {
                            iIntValue2 = 0;
                        } else {
                            iIntValue2 = bVar.K.get(iF, 0).intValue();
                        }
                        if (iIntValue2 == 0) {
                            if (d(iF)) {
                            }
                        } else if (d(iF)) {
                        }
                    }
                }
                z10 = true;
            }
        }
        Drawable current2 = getCurrent();
        return current2 != null ? z10 | current2.setState(iArr) : z10;
    }

    @Override // androidx.appcompat.graphics.drawable.DrawableContainerCompat, android.graphics.drawable.Drawable
    public boolean setVisible(boolean z10, boolean z11) {
        boolean visible = super.setVisible(z10, z11);
        f fVar = this.K0;
        if (fVar != null && (visible || z11)) {
            if (z10) {
                fVar.c();
            } else {
                jumpToCurrentState();
            }
        }
        return visible;
    }

    public AnimatedStateListDrawableCompat(@Nullable b bVar, @Nullable Resources resources) {
        this.L0 = -1;
        this.M0 = -1;
        e(new b(bVar, this, resources));
        onStateChange(getState());
        jumpToCurrentState();
    }

    public static abstract class f {
        public boolean a() {
            return false;
        }

        public abstract void c();

        public abstract void d();

        public void b() {
        }
    }
}
