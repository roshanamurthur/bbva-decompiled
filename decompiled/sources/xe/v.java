package xe;

import com.google.android.play.core.splitinstall.SplitInstallManager;
import com.google.android.play.core.splitinstall.internal.zzbz;
import com.google.android.play.core.splitinstall.internal.zzcb;
import com.google.android.play.core.splitinstall.zzab;
import com.google.android.play.core.splitinstall.zzac;
import com.google.android.play.core.splitinstall.zzad;
import com.google.android.play.core.splitinstall.zzae;
import com.google.android.play.core.splitinstall.zzaf;
import com.google.android.play.core.splitinstall.zzag;
import com.google.android.play.core.splitinstall.zzah;
import com.google.android.play.core.splitinstall.zzbd;
import com.google.android.play.core.splitinstall.zzbf;
import com.google.android.play.core.splitinstall.zzm;
import com.google.android.play.core.splitinstall.zzp;
import com.google.android.play.core.splitinstall.zzt;
import java.io.File;

/* JADX INFO: compiled from: com.google.android.play:feature-delivery@@2.1.0 */
/* JADX INFO: loaded from: classes10.dex */
public final class v implements zzp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zzcb f94581a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zzcb f94582b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final zzcb f94583c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final zzcb f94584d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final zzcb f94585e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final zzcb f94586f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final zzcb f94587g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final zzcb f94588h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final zzcb f94589i;

    public /* synthetic */ v(zzac zzacVar) {
        zzad zzadVar = new zzad(zzacVar);
        zzcb zzcbVarZzc = zzbz.zzc(new zzbd(zzadVar));
        this.f94581a = zzcbVarZzc;
        zzcb zzcbVarZzc2 = zzbz.zzc(new zzag(zzacVar));
        this.f94582b = zzcbVarZzc2;
        zzcb zzcbVarZzc3 = zzbz.zzc(new zzt(zzadVar));
        this.f94583c = zzcbVarZzc3;
        zzcb zzcbVarZzc4 = zzbz.zzc(new zzbf(zzadVar));
        this.f94584d = zzcbVarZzc4;
        zzcb zzcbVarZzc5 = zzbz.zzc(new zzab(zzcbVarZzc, zzcbVarZzc2, zzcbVarZzc3, zzcbVarZzc4));
        this.f94585e = zzcbVarZzc5;
        zzcb zzcbVarZzc6 = zzbz.zzc(new zzaf(zzadVar));
        this.f94586f = zzcbVarZzc6;
        zzcb zzcbVarZzc7 = zzbz.zzc(new com.google.android.play.core.splitinstall.testing.zzt(zzadVar, zzcbVarZzc6, zzcbVarZzc3, new zzae(zzcbVarZzc6)));
        this.f94587g = zzcbVarZzc7;
        zzcb zzcbVarZzc8 = zzbz.zzc(new zzm(zzcbVarZzc5, zzcbVarZzc7, zzcbVarZzc6));
        this.f94588h = zzcbVarZzc8;
        this.f94589i = zzbz.zzc(new zzah(zzacVar, zzcbVarZzc8));
    }

    @Override // com.google.android.play.core.splitinstall.zzp
    public final SplitInstallManager zza() {
        return (SplitInstallManager) this.f94589i.zza();
    }

    @Override // com.google.android.play.core.splitinstall.zzp
    public final File zzb() {
        return (File) this.f94586f.zza();
    }
}
