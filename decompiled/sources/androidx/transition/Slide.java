package androidx.transition;

import android.animation.Animator;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.core.content.res.TypedArrayUtils;
import h3.k;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: loaded from: classes2.dex */
public class Slide extends Visibility {

    /* JADX INFO: renamed from: n1, reason: collision with root package name */
    public static final DecelerateInterpolator f23645n1 = new DecelerateInterpolator();

    /* JADX INFO: renamed from: o1, reason: collision with root package name */
    public static final AccelerateInterpolator f23646o1 = new AccelerateInterpolator();

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    public static final a f23647p1 = new a();

    /* JADX INFO: renamed from: q1, reason: collision with root package name */
    public static final b f23648q1 = new b();
    public static final c r1 = new c();

    /* JADX INFO: renamed from: s1, reason: collision with root package name */
    public static final d f23649s1 = new d();

    /* JADX INFO: renamed from: t1, reason: collision with root package name */
    public static final e f23650t1 = new e();

    /* JADX INFO: renamed from: u1, reason: collision with root package name */
    public static final f f23651u1 = new f();

    /* JADX INFO: renamed from: l1, reason: collision with root package name */
    public g f23652l1;

    /* JADX INFO: renamed from: m1, reason: collision with root package name */
    public int f23653m1;

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public @interface GravityFlag {
    }

    public class a extends h {
        @Override // androidx.transition.Slide.g
        public final float b(ViewGroup viewGroup, View view) {
            return view.getTranslationX() - viewGroup.getWidth();
        }
    }

    public class b extends h {
        @Override // androidx.transition.Slide.g
        public final float b(ViewGroup viewGroup, View view) {
            return viewGroup.getLayoutDirection() == 1 ? view.getTranslationX() + viewGroup.getWidth() : view.getTranslationX() - viewGroup.getWidth();
        }
    }

    public class c extends i {
        @Override // androidx.transition.Slide.g
        public final float a(ViewGroup viewGroup, View view) {
            return view.getTranslationY() - viewGroup.getHeight();
        }
    }

    public class d extends h {
        @Override // androidx.transition.Slide.g
        public final float b(ViewGroup viewGroup, View view) {
            return view.getTranslationX() + viewGroup.getWidth();
        }
    }

    public class e extends h {
        @Override // androidx.transition.Slide.g
        public final float b(ViewGroup viewGroup, View view) {
            return viewGroup.getLayoutDirection() == 1 ? view.getTranslationX() - viewGroup.getWidth() : view.getTranslationX() + viewGroup.getWidth();
        }
    }

    public class f extends i {
        @Override // androidx.transition.Slide.g
        public final float a(ViewGroup viewGroup, View view) {
            return view.getTranslationY() + viewGroup.getHeight();
        }
    }

    public interface g {
        float a(ViewGroup viewGroup, View view);

        float b(ViewGroup viewGroup, View view);
    }

    public static abstract class h implements g {
        @Override // androidx.transition.Slide.g
        public final float a(ViewGroup viewGroup, View view) {
            return view.getTranslationY();
        }
    }

    public static abstract class i implements g {
        @Override // androidx.transition.Slide.g
        public final float b(ViewGroup viewGroup, View view) {
            return view.getTranslationX();
        }
    }

    public Slide() {
        this.f23652l1 = f23651u1;
        this.f23653m1 = 80;
        setSlideEdge(80);
    }

    @Override // androidx.transition.Visibility, androidx.transition.Transition
    public void captureEndValues(@NonNull TransitionValues transitionValues) {
        super.captureEndValues(transitionValues);
        int[] iArr = new int[2];
        transitionValues.view.getLocationOnScreen(iArr);
        transitionValues.values.put("android:slide:screenPosition", iArr);
    }

    @Override // androidx.transition.Visibility, androidx.transition.Transition
    public void captureStartValues(@NonNull TransitionValues transitionValues) {
        super.captureStartValues(transitionValues);
        int[] iArr = new int[2];
        transitionValues.view.getLocationOnScreen(iArr);
        transitionValues.values.put("android:slide:screenPosition", iArr);
    }

    public int getSlideEdge() {
        return this.f23653m1;
    }

    @Override // androidx.transition.Transition
    public boolean isSeekingSupported() {
        return true;
    }

    @Override // androidx.transition.Visibility
    @Nullable
    public Animator onAppear(@NonNull ViewGroup viewGroup, @NonNull View view, @Nullable TransitionValues transitionValues, @Nullable TransitionValues transitionValues2) {
        if (transitionValues2 == null) {
            return null;
        }
        int[] iArr = (int[]) transitionValues2.values.get("android:slide:screenPosition");
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        return androidx.transition.d.a(view, transitionValues2, iArr[0], iArr[1], this.f23652l1.b(viewGroup, view), this.f23652l1.a(viewGroup, view), translationX, translationY, f23645n1, this);
    }

    @Override // androidx.transition.Visibility
    @Nullable
    public Animator onDisappear(@NonNull ViewGroup viewGroup, @NonNull View view, @Nullable TransitionValues transitionValues, @Nullable TransitionValues transitionValues2) {
        if (transitionValues == null) {
            return null;
        }
        int[] iArr = (int[]) transitionValues.values.get("android:slide:screenPosition");
        return androidx.transition.d.a(view, transitionValues, iArr[0], iArr[1], view.getTranslationX(), view.getTranslationY(), this.f23652l1.b(viewGroup, view), this.f23652l1.a(viewGroup, view), f23646o1, this);
    }

    public void setSlideEdge(int i10) {
        if (i10 == 3) {
            this.f23652l1 = f23647p1;
        } else if (i10 == 5) {
            this.f23652l1 = f23649s1;
        } else if (i10 == 48) {
            this.f23652l1 = r1;
        } else if (i10 == 80) {
            this.f23652l1 = f23651u1;
        } else if (i10 == 8388611) {
            this.f23652l1 = f23648q1;
        } else {
            if (i10 != 8388613) {
                throw new IllegalArgumentException("Invalid slide direction");
            }
            this.f23652l1 = f23650t1;
        }
        this.f23653m1 = i10;
        SidePropagation sidePropagation = new SidePropagation();
        sidePropagation.setSide(i10);
        setPropagation(sidePropagation);
    }

    public Slide(int i10) {
        this.f23652l1 = f23651u1;
        this.f23653m1 = 80;
        setSlideEdge(i10);
    }

    public Slide(@NonNull Context context, @NonNull AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f23652l1 = f23651u1;
        this.f23653m1 = 80;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, k.f69322h);
        int namedInt = TypedArrayUtils.getNamedInt(typedArrayObtainStyledAttributes, (XmlPullParser) attributeSet, "slideEdge", 0, 80);
        typedArrayObtainStyledAttributes.recycle();
        setSlideEdge(namedInt);
    }
}
