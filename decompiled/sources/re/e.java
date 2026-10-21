package re;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: com.google.android.odml:image@@1.0.0-beta1 */
/* JADX INFO: loaded from: classes10.dex */
public final class e implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ByteBuffer f92999a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f93000b;

    public e(ByteBuffer byteBuffer, int i10) {
        this.f92999a = byteBuffer;
        a aVar = new a();
        aVar.f92993q0 = 2;
        aVar.f92992p0 = Integer.valueOf(i10);
        this.f93000b = aVar.a();
    }

    @Override // re.f
    public final b zzb() {
        return this.f93000b;
    }

    @Override // re.f
    public final void zzc() {
    }
}
