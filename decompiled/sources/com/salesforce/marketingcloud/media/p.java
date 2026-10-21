package com.salesforce.marketingcloud.media;

import android.annotation.SuppressLint;
import android.widget.ImageView;
import java.lang.ref.Reference;

/* JADX INFO: loaded from: classes11.dex */
@SuppressLint({"UnknownNullness"})
public class p extends a<ImageView> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    f f64530f;

    public p(o oVar, v<ImageView> vVar, s sVar, f fVar) {
        super(oVar, vVar, sVar);
        this.f64530f = fVar;
    }

    @Override // com.salesforce.marketingcloud.media.a
    public void a() {
        super.a();
        this.f64530f = null;
    }

    @Override // com.salesforce.marketingcloud.media.a
    public void a(u.b bVar) {
        Reference reference = this.f64445b;
        ImageView imageView = reference != null ? (ImageView) reference.get() : null;
        if (imageView == null) {
            return;
        }
        l.a(imageView, b().f64514a, bVar);
        f fVar = this.f64530f;
        if (fVar != null) {
            fVar.a();
        }
    }

    @Override // com.salesforce.marketingcloud.media.a
    public void a(Exception exc) {
        f fVar = this.f64530f;
        if (fVar != null) {
            fVar.a(exc);
        }
    }
}
