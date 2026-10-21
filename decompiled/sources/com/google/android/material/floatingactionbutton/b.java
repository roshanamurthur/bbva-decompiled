package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.util.Property;
import android.view.View;
import androidx.annotation.CallSuper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.util.Preconditions;
import com.bbva.cells.component.kit.ui.property.impl.image.ImageScaleTypeHandler;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.animation.AnimatorSetCompat;
import com.google.android.material.animation.MotionSpec;
import java.util.ArrayList;

/* JADX INFO: compiled from: BaseMotionStrategy.java */
/* JADX INFO: loaded from: classes10.dex */
public abstract class b implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f44678a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final ExtendedFloatingActionButton f44679b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList<Animator.AnimatorListener> f44680c = new ArrayList<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final com.google.android.material.floatingactionbutton.a f44681d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public MotionSpec f44682e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public MotionSpec f44683f;

    /* JADX INFO: compiled from: BaseMotionStrategy.java */
    public class a extends Property<ExtendedFloatingActionButton, Float> {
        public a() {
            super(Float.class, "LABEL_OPACITY_PROPERTY");
        }

        @Override // android.util.Property
        public final Float get(ExtendedFloatingActionButton extendedFloatingActionButton) {
            ExtendedFloatingActionButton extendedFloatingActionButton2 = extendedFloatingActionButton;
            return Float.valueOf(AnimationUtils.lerp(0.0f, 1.0f, (Color.alpha(extendedFloatingActionButton2.getCurrentTextColor()) / 255.0f) / Color.alpha(extendedFloatingActionButton2.originalTextCsl.getColorForState(extendedFloatingActionButton2.getDrawableState(), b.this.f44679b.originalTextCsl.getDefaultColor()))));
        }

        @Override // android.util.Property
        public final void set(ExtendedFloatingActionButton extendedFloatingActionButton, Float f6) {
            ExtendedFloatingActionButton extendedFloatingActionButton2 = extendedFloatingActionButton;
            Float f10 = f6;
            int colorForState = extendedFloatingActionButton2.originalTextCsl.getColorForState(extendedFloatingActionButton2.getDrawableState(), b.this.f44679b.originalTextCsl.getDefaultColor());
            ColorStateList colorStateListValueOf = ColorStateList.valueOf(Color.argb((int) (AnimationUtils.lerp(0.0f, Color.alpha(colorForState) / 255.0f, f10.floatValue()) * 255.0f), Color.red(colorForState), Color.green(colorForState), Color.blue(colorForState)));
            if (f10.floatValue() == 1.0f) {
                extendedFloatingActionButton2.silentlyUpdateTextColor(extendedFloatingActionButton2.originalTextCsl);
            } else {
                extendedFloatingActionButton2.silentlyUpdateTextColor(colorStateListValueOf);
            }
        }
    }

    public b(@NonNull ExtendedFloatingActionButton extendedFloatingActionButton, com.google.android.material.floatingactionbutton.a aVar) {
        this.f44679b = extendedFloatingActionButton;
        this.f44678a = extendedFloatingActionButton.getContext();
        this.f44681d = aVar;
    }

    @Override // com.google.android.material.floatingactionbutton.o
    @CallSuper
    public void c() {
        this.f44681d.f44677a = null;
    }

    @Override // com.google.android.material.floatingactionbutton.o
    public AnimatorSet e() {
        MotionSpec motionSpec = this.f44683f;
        if (motionSpec == null) {
            if (this.f44682e == null) {
                this.f44682e = MotionSpec.createFromResource(this.f44678a, d());
            }
            motionSpec = (MotionSpec) Preconditions.checkNotNull(this.f44682e);
        }
        return g(motionSpec);
    }

    @NonNull
    public final AnimatorSet g(@NonNull MotionSpec motionSpec) {
        ArrayList arrayList = new ArrayList();
        boolean zHasPropertyValues = motionSpec.hasPropertyValues("opacity");
        ExtendedFloatingActionButton extendedFloatingActionButton = this.f44679b;
        if (zHasPropertyValues) {
            arrayList.add(motionSpec.getAnimator("opacity", extendedFloatingActionButton, View.ALPHA));
        }
        if (motionSpec.hasPropertyValues(ImageScaleTypeHandler.ID)) {
            arrayList.add(motionSpec.getAnimator(ImageScaleTypeHandler.ID, extendedFloatingActionButton, View.SCALE_Y));
            arrayList.add(motionSpec.getAnimator(ImageScaleTypeHandler.ID, extendedFloatingActionButton, View.SCALE_X));
        }
        if (motionSpec.hasPropertyValues("width")) {
            arrayList.add(motionSpec.getAnimator("width", extendedFloatingActionButton, ExtendedFloatingActionButton.f44646a1));
        }
        if (motionSpec.hasPropertyValues("height")) {
            arrayList.add(motionSpec.getAnimator("height", extendedFloatingActionButton, ExtendedFloatingActionButton.f44647b1));
        }
        if (motionSpec.hasPropertyValues("paddingStart")) {
            arrayList.add(motionSpec.getAnimator("paddingStart", extendedFloatingActionButton, ExtendedFloatingActionButton.f44648c1));
        }
        if (motionSpec.hasPropertyValues("paddingEnd")) {
            arrayList.add(motionSpec.getAnimator("paddingEnd", extendedFloatingActionButton, ExtendedFloatingActionButton.f44649d1));
        }
        if (motionSpec.hasPropertyValues("labelOpacity")) {
            arrayList.add(motionSpec.getAnimator("labelOpacity", extendedFloatingActionButton, new a()));
        }
        AnimatorSet animatorSet = new AnimatorSet();
        AnimatorSetCompat.playTogether(animatorSet, arrayList);
        return animatorSet;
    }
}
