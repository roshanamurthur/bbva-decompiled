package com.visa.internal;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Animatable2;
import android.os.Build;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.camera.core.impl.q;
import androidx.camera.core.u1;
import androidx.core.view.animation.PathInterpolatorCompat;
import androidx.vectordrawable.graphics.drawable.Animatable2Compat;
import com.visa.R;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/visa/internal/LogoElement;", "Landroid/widget/FrameLayout;", "Lcom/visa/internal/tsam7;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "visa-sensory-branding_release"}, k = 1, mv = {1, 8, 0})
public final class LogoElement extends FrameLayout implements tsam7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ImageView f68016a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ImageView f68017b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ImageView f68018c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ImageView f68019d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ImageView f68020e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ImageView f68021f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ImageView f68022g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LogoElement(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.logo_layer, (ViewGroup) this, true);
        View viewFindViewById = viewInflate.findViewById(R.id.v_left_mask);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "rootView.findViewById(R.id.v_left_mask)");
        this.f68016a = (ImageView) viewFindViewById;
        View viewFindViewById2 = viewInflate.findViewById(R.id.v_left);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "rootView.findViewById(R.id.v_left)");
        this.f68017b = (ImageView) viewFindViewById2;
        View viewFindViewById3 = viewInflate.findViewById(R.id.v_right_mask);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "rootView.findViewById(R.id.v_right_mask)");
        this.f68018c = (ImageView) viewFindViewById3;
        View viewFindViewById4 = viewInflate.findViewById(R.id.v_right);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "rootView.findViewById(R.id.v_right)");
        this.f68019d = (ImageView) viewFindViewById4;
        View viewFindViewById5 = viewInflate.findViewById(R.id.f67991i);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "rootView.findViewById(R.id.i)");
        this.f68020e = (ImageView) viewFindViewById5;
        View viewFindViewById6 = viewInflate.findViewById(R.id.f67992s);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById6, "rootView.findViewById(R.id.s)");
        this.f68021f = (ImageView) viewFindViewById6;
        View viewFindViewById7 = viewInflate.findViewById(R.id.f67990a);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById7, "rootView.findViewById(R.id.a)");
        this.f68022g = (ImageView) viewFindViewById7;
    }

    public static void a(LogoElement logoElement, ImageView imageView) {
        Animatable animatable;
        logoElement.getClass();
        if (Build.VERSION.SDK_INT > 23) {
            Object drawable = imageView.getDrawable();
            Intrinsics.checkNotNull(drawable, "null cannot be cast to non-null type android.graphics.drawable.Animatable2");
            Animatable2 animatable2 = (Animatable2) drawable;
            animatable2.registerAnimationCallback(new s1v3(null));
            animatable = animatable2;
        } else {
            Object drawable2 = imageView.getDrawable();
            Intrinsics.checkNotNull(drawable2, "null cannot be cast to non-null type androidx.vectordrawable.graphics.drawable.Animatable2Compat");
            Animatable2Compat animatable2Compat = (Animatable2Compat) drawable2;
            animatable2Compat.registerAnimationCallback(new bsv4(null));
            animatable = animatable2Compat;
        }
        animatable.start();
    }

    public final void a(Function0 function0) {
        Interpolator interpolatorCreate = PathInterpolatorCompat.create(0.9f, 0.0f, 0.1f, 1.0f);
        Intrinsics.checkNotNullExpressionValue(interpolatorCreate, "create(0.9f, 0f, 0.1f, 1f)");
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, "translationX", getWidth() * 0.333f, 0.0f);
        Intrinsics.checkNotNullExpressionValue(objectAnimatorOfFloat, "ofFloat(this, \"translationX\", width * 0.333f, 0f)");
        objectAnimatorOfFloat.setInterpolator(interpolatorCreate);
        objectAnimatorOfFloat.setDuration(1250L);
        objectAnimatorOfFloat.addListener(new mam5(this, function0));
        post(new u1(objectAnimatorOfFloat, 5));
    }

    public static final void a(ObjectAnimator translationX) {
        Intrinsics.checkNotNullParameter(translationX, "$translationX");
        translationX.start();
    }

    @Override // com.visa.internal.tsam7
    public final void a(irts6 config) {
        Intrinsics.checkNotNullParameter(config, "config");
        ColorStateList colorStateListValueOf = ColorStateList.valueOf(config.f68030a);
        Intrinsics.checkNotNullExpressionValue(colorStateListValueOf, "valueOf(config.backdropColor)");
        this.f68016a.setImageTintList(colorStateListValueOf);
        this.f68018c.setImageTintList(colorStateListValueOf);
        ColorStateList colorStateListValueOf2 = ColorStateList.valueOf(config.f68031b);
        Intrinsics.checkNotNullExpressionValue(colorStateListValueOf2, "valueOf(config.foregroundColor)");
        this.f68017b.setImageTintList(colorStateListValueOf2);
        this.f68019d.setImageTintList(colorStateListValueOf2);
        this.f68020e.setImageTintList(colorStateListValueOf2);
        this.f68021f.setImageTintList(colorStateListValueOf2);
        this.f68022g.setImageTintList(colorStateListValueOf2);
    }

    public final void a(Context context, Function0 function0) {
        Intrinsics.checkNotNullParameter(context, "context");
        setVisibility(0);
        post(new q(this, function0, 5));
    }

    public static final void a(LogoElement this$0, Function0 function0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        a(this$0, this$0.f68016a);
        a(this$0, this$0.f68018c);
        a(this$0, this$0.f68020e);
        a(this$0, this$0.f68021f);
        a(this$0, this$0.f68022g);
        this$0.a(function0);
    }

    @Override // com.visa.internal.tsam7
    public final void a() {
        setVisibility(8);
    }
}
