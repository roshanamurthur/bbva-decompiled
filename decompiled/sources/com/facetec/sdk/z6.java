package com.facetec.sdk;

import android.animation.Animator;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class z6 implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f43022a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f43023b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Runnable f43024c;

    public /* synthetic */ z6(Object obj, int i10, Runnable runnable) {
        this.f43022a = i10;
        this.f43023b = obj;
        this.f43024c = runnable;
    }

    @Override // com.facetec.sdk.b, android.animation.Animator.AnimatorListener
    public final /* synthetic */ void onAnimationCancel(Animator animator) {
        int i10 = this.f43022a;
        v1.a(this, animator);
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i10 = this.f43022a;
        Runnable runnable = this.f43024c;
        Object obj = this.f43023b;
        switch (i10) {
            case 0:
                ((co) obj).bf_((aq.b) runnable, animator);
                break;
            default:
                ((cs) obj).bq_(runnable, animator);
                break;
        }
    }

    @Override // com.facetec.sdk.b, android.animation.Animator.AnimatorListener
    public final /* synthetic */ void onAnimationRepeat(Animator animator) {
        int i10 = this.f43022a;
        v1.b(this, animator);
    }

    @Override // com.facetec.sdk.b, android.animation.Animator.AnimatorListener
    public final /* synthetic */ void onAnimationStart(Animator animator) {
        int i10 = this.f43022a;
        v1.c(this, animator);
    }
}
