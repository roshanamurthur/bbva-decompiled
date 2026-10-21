package androidx.emoji2.text;

import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.util.SparseArray;
import androidx.annotation.AnyThread;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.core.os.TraceCompat;
import androidx.core.util.Preconditions;
import androidx.emoji2.text.flatbuffer.MetadataList;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import v2.h;

/* JADX INFO: loaded from: classes2.dex */
@AnyThread
@RequiresApi(19)
public final class MetadataRepo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final MetadataList f21295a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final char[] f21296b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final a f21297c = new a(1024);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final Typeface f21298d;

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final SparseArray<a> f21299a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public TypefaceEmojiRasterizer f21300b;

        public a() {
            this(1);
        }

        public final void a(@NonNull TypefaceEmojiRasterizer typefaceEmojiRasterizer, int i10, int i11) {
            int codepointAt = typefaceEmojiRasterizer.getCodepointAt(i10);
            SparseArray<a> sparseArray = this.f21299a;
            a aVar = sparseArray == null ? null : sparseArray.get(codepointAt);
            if (aVar == null) {
                aVar = new a();
                sparseArray.put(typefaceEmojiRasterizer.getCodepointAt(i10), aVar);
            }
            if (i11 > i10) {
                aVar.a(typefaceEmojiRasterizer, i10 + 1, i11);
            } else {
                aVar.f21300b = typefaceEmojiRasterizer;
            }
        }

        public a(int i10) {
            this.f21299a = new SparseArray<>(i10);
        }
    }

    public MetadataRepo(@NonNull Typeface typeface, @NonNull MetadataList metadataList) {
        this.f21298d = typeface;
        this.f21295a = metadataList;
        this.f21296b = new char[metadataList.listLength() * 2];
        int iListLength = metadataList.listLength();
        for (int i10 = 0; i10 < iListLength; i10++) {
            TypefaceEmojiRasterizer typefaceEmojiRasterizer = new TypefaceEmojiRasterizer(this, i10);
            Character.toChars(typefaceEmojiRasterizer.getId(), this.f21296b, i10 * 2);
            Preconditions.checkNotNull(typefaceEmojiRasterizer, "emoji metadata cannot be null");
            Preconditions.checkArgument(typefaceEmojiRasterizer.getCodepointsLength() > 0, "invalid metadata codepoint length");
            this.f21297c.a(typefaceEmojiRasterizer, 0, typefaceEmojiRasterizer.getCodepointsLength() - 1);
        }
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    @VisibleForTesting
    public static MetadataRepo create(@NonNull Typeface typeface) {
        try {
            TraceCompat.beginSection("EmojiCompat.MetadataRepo.create");
            return new MetadataRepo(typeface, new MetadataList());
        } finally {
            TraceCompat.endSection();
        }
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public char[] getEmojiCharArray() {
        return this.f21296b;
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public MetadataList getMetadataList() {
        return this.f21295a;
    }

    @NonNull
    public static MetadataRepo create(@NonNull Typeface typeface, @NonNull InputStream inputStream) throws IOException {
        try {
            TraceCompat.beginSection("EmojiCompat.MetadataRepo.create");
            return new MetadataRepo(typeface, h.b(inputStream));
        } finally {
            TraceCompat.endSection();
        }
    }

    @NonNull
    public static MetadataRepo create(@NonNull Typeface typeface, @NonNull ByteBuffer byteBuffer) throws IOException {
        try {
            TraceCompat.beginSection("EmojiCompat.MetadataRepo.create");
            ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
            byteBufferDuplicate.position((int) h.a(new h.a(byteBufferDuplicate)).f93964a);
            return new MetadataRepo(typeface, MetadataList.getRootAsMetadataList(byteBufferDuplicate));
        } finally {
            TraceCompat.endSection();
        }
    }

    @NonNull
    public static MetadataRepo create(@NonNull AssetManager assetManager, @NonNull String str) throws IOException {
        try {
            TraceCompat.beginSection("EmojiCompat.MetadataRepo.create");
            Typeface typefaceCreateFromAsset = Typeface.createFromAsset(assetManager, str);
            InputStream inputStreamOpen = assetManager.open(str);
            try {
                MetadataList metadataListB = h.b(inputStreamOpen);
                inputStreamOpen.close();
                MetadataRepo metadataRepo = new MetadataRepo(typefaceCreateFromAsset, metadataListB);
                TraceCompat.endSection();
                return metadataRepo;
            } catch (Throwable th2) {
                if (inputStreamOpen != null) {
                    try {
                        inputStreamOpen.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                }
                throw th2;
            }
        } catch (Throwable th4) {
            TraceCompat.endSection();
            throw th4;
        }
    }
}
