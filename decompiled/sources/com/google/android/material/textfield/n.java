package com.google.android.material.textfield;

import android.content.Context;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.EditText;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import androidx.core.view.accessibility.AccessibilityManagerCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.google.android.material.internal.CheckableImageButton;

/* JADX INFO: compiled from: EndIconDelegate.java */
/* JADX INFO: loaded from: classes10.dex */
public abstract class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextInputLayout f45659a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m f45660b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f45661c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final CheckableImageButton f45662d;

    public n(@NonNull m mVar) {
        this.f45659a = mVar.f45643p0;
        this.f45660b = mVar;
        this.f45661c = mVar.getContext();
        this.f45662d = mVar.v0;
    }

    @StringRes
    public int c() {
        return 0;
    }

    @DrawableRes
    public int d() {
        return 0;
    }

    public View.OnFocusChangeListener e() {
        return null;
    }

    public View.OnClickListener f() {
        return null;
    }

    public View.OnFocusChangeListener g() {
        return null;
    }

    public AccessibilityManagerCompat.TouchExplorationStateChangeListener h() {
        return null;
    }

    public boolean i(int i10) {
        return true;
    }

    public boolean j() {
        return false;
    }

    public boolean k() {
        return this instanceof l;
    }

    public boolean l() {
        return false;
    }

    public final void q() {
        this.f45660b.f(false);
    }

    public void a() {
    }

    public void b() {
    }

    public void r() {
    }

    public void s() {
    }

    public void m(@Nullable EditText editText) {
    }

    public void n(@NonNull AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
    }

    public void o(@NonNull AccessibilityEvent accessibilityEvent) {
    }

    public void p(boolean z10) {
    }
}
