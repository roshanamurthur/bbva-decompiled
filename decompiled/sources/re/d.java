package re;

import android.graphics.Bitmap;

/* JADX INFO: compiled from: com.google.android.odml:image@@1.0.0-beta1 */
/* JADX INFO: loaded from: classes10.dex */
public final class d implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Bitmap f92997a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f92998b;

    public d(Bitmap bitmap) {
        this.f92997a = bitmap;
        a aVar = new a();
        int i10 = c.f92996a[bitmap.getConfig().ordinal()];
        aVar.f92992p0 = Integer.valueOf(i10 != 1 ? i10 != 2 ? 0 : 1 : 8);
        aVar.f92993q0 = 1;
        this.f92998b = aVar.a();
    }

    @Override // re.f
    public final b zzb() {
        return this.f92998b;
    }

    @Override // re.f
    public final void zzc() {
        this.f92997a.recycle();
    }
}
