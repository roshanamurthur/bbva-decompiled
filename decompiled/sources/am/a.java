package am;

import java.io.IOException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import okhttp3.internal.Util;
import okhttp3.internal.cache.DiskLruCache;

/* JADX INFO: compiled from: DiskLruCache.kt */
/* JADX INFO: loaded from: classes12.dex */
@SourceDebugExtension({"SMAP\nDiskLruCache.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DiskLruCache.kt\nokhttp3/internal/cache/DiskLruCache$newJournalWriter$faultHidingSink$1\n+ 2 Util.kt\nokhttp3/internal/Util\n*L\n1#1,1065:1\n608#2,4:1066\n*S KotlinDebug\n*F\n+ 1 DiskLruCache.kt\nokhttp3/internal/cache/DiskLruCache$newJournalWriter$faultHidingSink$1\n*L\n304#1:1066,4\n*E\n"})
public final class a extends Lambda implements Function1<IOException, Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ DiskLruCache f271p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(DiskLruCache diskLruCache) {
        super(1);
        this.f271p0 = diskLruCache;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(IOException iOException) {
        IOException it = iOException;
        Intrinsics.checkNotNullParameter(it, "it");
        boolean z10 = Util.assertionsEnabled;
        DiskLruCache diskLruCache = this.f271p0;
        if (!z10 || Thread.holdsLock(diskLruCache)) {
            diskLruCache.G0 = true;
            return Unit.INSTANCE;
        }
        throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + diskLruCache);
    }
}
