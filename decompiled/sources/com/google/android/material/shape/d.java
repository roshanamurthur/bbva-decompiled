package com.google.android.material.shape;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;

/* JADX INFO: compiled from: ShapeableDelegateV33.java */
/* JADX INFO: loaded from: classes10.dex */
@RequiresApi(33)
public final class d extends ShapeableDelegate {

    /* JADX INFO: compiled from: ShapeableDelegateV33.java */
    public class a extends ViewOutlineProvider {
        public a() {
        }

        @Override // android.view.ViewOutlineProvider
        public final void getOutline(View view, Outline outline) {
            d dVar = d.this;
            if (dVar.f45333e.isEmpty()) {
                return;
            }
            outline.setPath(dVar.f45333e);
        }
    }

    public d(@NonNull View view) {
        d(view);
    }

    @DoNotInline
    private void d(View view) {
        view.setOutlineProvider(new a());
    }

    @Override // com.google.android.material.shape.ShapeableDelegate
    public final void a(@NonNull View view) {
        view.setClipToOutline(!this.f45329a);
        if (this.f45329a) {
            view.invalidate();
        } else {
            view.invalidateOutline();
        }
    }

    @Override // com.google.android.material.shape.ShapeableDelegate
    public final boolean b() {
        return this.f45329a;
    }
}
