package sc;

import android.content.ContentResolver;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool;
import java.util.List;

/* JADX INFO: compiled from: ThumbnailStreamOpener.java */
/* JADX INFO: loaded from: classes9.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f93158a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayPool f93159b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ContentResolver f93160c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List<ImageHeaderParser> f93161d;

    public b(List<ImageHeaderParser> list, a aVar, ArrayPool arrayPool, ContentResolver contentResolver) {
        this.f93158a = aVar;
        this.f93159b = arrayPool;
        this.f93160c = contentResolver;
        this.f93161d = list;
    }
}
