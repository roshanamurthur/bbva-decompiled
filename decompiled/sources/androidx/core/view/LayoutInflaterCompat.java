package androidx.core.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes2.dex */
public final class LayoutInflaterCompat {

    public static class a implements LayoutInflater.Factory2 {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final LayoutInflaterFactory f20205p0;

        public a(LayoutInflaterFactory layoutInflaterFactory) {
            this.f20205p0 = layoutInflaterFactory;
        }

        @Override // android.view.LayoutInflater.Factory
        public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
            return this.f20205p0.onCreateView(null, str, context, attributeSet);
        }

        @NonNull
        public final String toString() {
            StringBuilder sb2 = new StringBuilder();
            androidx.core.graphics.b.f(a.class, sb2, "{");
            sb2.append(this.f20205p0);
            sb2.append("}");
            return sb2.toString();
        }

        @Override // android.view.LayoutInflater.Factory2
        public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
            return this.f20205p0.onCreateView(view, str, context, attributeSet);
        }
    }

    @Deprecated
    public static LayoutInflaterFactory getFactory(LayoutInflater layoutInflater) {
        LayoutInflater.Factory factory = layoutInflater.getFactory();
        if (factory instanceof a) {
            return ((a) factory).f20205p0;
        }
        return null;
    }

    @Deprecated
    public static void setFactory(@NonNull LayoutInflater layoutInflater, @NonNull LayoutInflaterFactory layoutInflaterFactory) {
        layoutInflater.setFactory2(new a(layoutInflaterFactory));
    }

    public static void setFactory2(@NonNull LayoutInflater layoutInflater, @NonNull LayoutInflater.Factory2 factory2) {
        layoutInflater.setFactory2(factory2);
    }
}
