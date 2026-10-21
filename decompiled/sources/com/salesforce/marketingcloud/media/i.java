package com.salesforce.marketingcloud.media;

import android.content.Context;
import android.graphics.drawable.Drawable;
import androidx.core.content.ContextCompat;
import java.io.IOException;

/* JADX INFO: loaded from: classes11.dex */
class i extends u {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f64486c = "drawable";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f64487a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f64488b;

    public i(Context context) {
        this.f64487a = context;
    }

    @Override // com.salesforce.marketingcloud.media.u
    public void a(o oVar, s sVar, u.a aVar) throws IOException {
        Drawable drawable = ContextCompat.getDrawable(this.f64487a, this.f64488b);
        if (drawable == null) {
            aVar.onError(new IllegalStateException("Invalid res id for drawable"));
        } else {
            aVar.a(new u.b(drawable, o.b.MEMORY));
        }
    }

    @Override // com.salesforce.marketingcloud.media.u
    public boolean a(s sVar) {
        if ("drawable".equalsIgnoreCase(sVar.f64537a.getScheme())) {
            this.f64488b = this.f64487a.getResources().getIdentifier(sVar.f64537a.getHost(), "drawable", this.f64487a.getPackageName());
        }
        return this.f64488b > 0;
    }
}
