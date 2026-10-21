package re;

import android.media.Image;
import androidx.annotation.RequiresApi;

/* JADX INFO: compiled from: com.google.android.odml:image@@1.0.0-beta1 */
/* JADX INFO: loaded from: classes10.dex */
@RequiresApi(19)
public final class g implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Image f93001a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f93002b;

    public g(Image image) {
        this.f93001a = image;
        a aVar = new a();
        aVar.f92993q0 = 3;
        int format = image.getFormat();
        aVar.f92992p0 = Integer.valueOf(format == 42 ? 1 : format == 41 ? 2 : format != 35 ? format != 256 ? 0 : 9 : 7);
        this.f93002b = aVar.a();
    }

    @Override // re.f
    public final b zzb() {
        return this.f93002b;
    }

    @Override // re.f
    public final void zzc() {
        this.f93001a.close();
    }
}
