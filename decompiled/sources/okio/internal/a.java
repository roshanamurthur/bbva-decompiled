package okio.internal;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: ResourceFileSystem.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class a extends Lambda implements Function1<ZipEntry, Boolean> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final a f86500p0 = new a(1);

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(ZipEntry zipEntry) {
        ZipEntry entry = zipEntry;
        Intrinsics.checkNotNullParameter(entry, "entry");
        return Boolean.valueOf(ResourceFileSystem.a.a(ResourceFileSystem.f86473d, entry.getCanonicalPath()));
    }
}
