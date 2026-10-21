package tc;

import androidx.annotation.NonNull;
import com.bumptech.glide.load.Encoder;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.engine.cache.DiskCache;
import java.io.File;

/* JADX INFO: compiled from: DataCacheWriter.java */
/* JADX INFO: loaded from: classes9.dex */
public final class d<DataType> implements DiskCache.Writer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Encoder<DataType> f93505a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final DataType f93506b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Options f93507c;

    public d(Encoder<DataType> encoder, DataType datatype, Options options) {
        this.f93505a = encoder;
        this.f93506b = datatype;
        this.f93507c = options;
    }

    @Override // com.bumptech.glide.load.engine.cache.DiskCache.Writer
    public final boolean write(@NonNull File file) {
        return this.f93505a.encode(this.f93506b, file, this.f93507c);
    }
}
