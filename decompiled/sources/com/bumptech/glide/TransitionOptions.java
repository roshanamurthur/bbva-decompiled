package com.bumptech.glide;

import androidx.annotation.NonNull;
import com.bumptech.glide.TransitionOptions;
import com.bumptech.glide.request.transition.NoTransition;
import com.bumptech.glide.request.transition.TransitionFactory;
import com.bumptech.glide.request.transition.ViewAnimationFactory;
import com.bumptech.glide.request.transition.ViewPropertyAnimationFactory;
import com.bumptech.glide.request.transition.ViewPropertyTransition;
import com.bumptech.glide.util.Preconditions;
import com.bumptech.glide.util.Util;

/* JADX INFO: loaded from: classes9.dex */
public abstract class TransitionOptions<CHILD extends TransitionOptions<CHILD, TranscodeType>, TranscodeType> implements Cloneable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public TransitionFactory<? super TranscodeType> f38061p0 = NoTransition.getFactory();

    @NonNull
    public final CHILD dontTransition() {
        return (CHILD) transition(NoTransition.getFactory());
    }

    public boolean equals(Object obj) {
        if (obj instanceof TransitionOptions) {
            return Util.bothNullOrEqual(this.f38061p0, ((TransitionOptions) obj).f38061p0);
        }
        return false;
    }

    public int hashCode() {
        TransitionFactory<? super TranscodeType> transitionFactory = this.f38061p0;
        if (transitionFactory != null) {
            return transitionFactory.hashCode();
        }
        return 0;
    }

    @NonNull
    public final CHILD transition(int i10) {
        return (CHILD) transition(new ViewAnimationFactory(i10));
    }

    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public final CHILD m5276clone() {
        try {
            return (CHILD) super.clone();
        } catch (CloneNotSupportedException e5) {
            throw new RuntimeException(e5);
        }
    }

    @NonNull
    public final CHILD transition(@NonNull ViewPropertyTransition.Animator animator) {
        return (CHILD) transition(new ViewPropertyAnimationFactory(animator));
    }

    @NonNull
    public final CHILD transition(@NonNull TransitionFactory<? super TranscodeType> transitionFactory) {
        this.f38061p0 = (TransitionFactory) Preconditions.checkNotNull(transitionFactory);
        return this;
    }
}
