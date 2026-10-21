package com.google.android.material.internal;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.util.StateSet;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes10.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class StateListAnimator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList<b> f44879a = new ArrayList<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public b f44880b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public ValueAnimator f44881c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final a f44882d = new a();

    public class a extends AnimatorListenerAdapter {
        public a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            StateListAnimator stateListAnimator = StateListAnimator.this;
            if (stateListAnimator.f44881c == animator) {
                stateListAnimator.f44881c = null;
            }
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int[] f44884a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ValueAnimator f44885b;

        public b(int[] iArr, ValueAnimator valueAnimator) {
            this.f44884a = iArr;
            this.f44885b = valueAnimator;
        }
    }

    public void addState(int[] iArr, ValueAnimator valueAnimator) {
        b bVar = new b(iArr, valueAnimator);
        valueAnimator.addListener(this.f44882d);
        this.f44879a.add(bVar);
    }

    public void jumpToCurrentState() {
        ValueAnimator valueAnimator = this.f44881c;
        if (valueAnimator != null) {
            valueAnimator.end();
            this.f44881c = null;
        }
    }

    public void setState(int[] iArr) {
        b bVar;
        ValueAnimator valueAnimator;
        ArrayList<b> arrayList = this.f44879a;
        int size = arrayList.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                bVar = null;
                break;
            }
            bVar = arrayList.get(i10);
            if (StateSet.stateSetMatches(bVar.f44884a, iArr)) {
                break;
            } else {
                i10++;
            }
        }
        b bVar2 = this.f44880b;
        if (bVar == bVar2) {
            return;
        }
        if (bVar2 != null && (valueAnimator = this.f44881c) != null) {
            valueAnimator.cancel();
            this.f44881c = null;
        }
        this.f44880b = bVar;
        if (bVar != null) {
            ValueAnimator valueAnimator2 = bVar.f44885b;
            this.f44881c = valueAnimator2;
            valueAnimator2.start();
        }
    }
}
