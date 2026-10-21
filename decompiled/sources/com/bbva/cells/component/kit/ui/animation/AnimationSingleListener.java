package com.bbva.cells.component.kit.ui.animation;

import android.animation.Animator;

/* JADX INFO: loaded from: classes2.dex */
public class AnimationSingleListener implements Animator.AnimatorListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Type f26691a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AnimationExecution f26692b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f26693c;

    public interface AnimationExecution {
        void execute(Animator animator);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Type {
        private static final /* synthetic */ Type[] $VALUES;
        public static final Type CANCEL;
        public static final Type END;
        public static final Type REPEAT;
        public static final Type START;

        static {
            Type type = new Type("START", 0);
            START = type;
            Type type2 = new Type("END", 1);
            END = type2;
            Type type3 = new Type("CANCEL", 2);
            CANCEL = type3;
            Type type4 = new Type("REPEAT", 3);
            REPEAT = type4;
            $VALUES = new Type[]{type, type2, type3, type4};
        }

        public Type() {
            throw null;
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) $VALUES.clone();
        }
    }

    public AnimationSingleListener(Type type, AnimationExecution animationExecution) {
        this.f26692b = animationExecution;
        this.f26691a = type;
    }

    public final void a(Animator animator, Type type) {
        AnimationExecution animationExecution = this.f26692b;
        if (animationExecution == null || this.f26691a != type) {
            return;
        }
        animationExecution.execute(animator);
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        this.f26693c = true;
        a(animator, Type.CANCEL);
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        if (this.f26693c) {
            return;
        }
        a(animator, Type.END);
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(Animator animator) {
        a(animator, Type.REPEAT);
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        this.f26693c = false;
        a(animator, Type.START);
    }
}
