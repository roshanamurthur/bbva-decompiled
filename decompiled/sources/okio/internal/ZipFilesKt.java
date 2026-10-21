package okio.internal;

import androidx.appcompat.widget.g0;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import bk.q;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import com.mastercard.sonic.androidsvg.SvgConstantsKt;
import com.veridas.resource.zip.CentralDirectoryFileHeader;
import com.veridas.resource.zip.LocalFileHeader;
import dk.e;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.GregorianCalendar;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.UShort;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.io.CloseableKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.CharsKt;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.l;
import okhttp3.internal.ws.WebSocketProtocol;
import okio.BufferedSource;
import okio.FileHandle;
import okio.FileMetadata;
import okio.FileSystem;
import okio.Okio;
import okio.Path;
import okio.ZipFileSystem;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: ZipFiles.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\u001a.\u0010\t\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0000\u001a\f\u0010\u000b\u001a\u00020\u0005*\u00020\nH\u0000\u001a\f\u0010\r\u001a\u00020\f*\u00020\nH\u0000\u001a\u0014\u0010\u0010\u001a\u00020\u000e*\u00020\n2\u0006\u0010\u000f\u001a\u00020\u000eH\u0000\"\u0014\u0010\u0012\u001a\u00020\u00118\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\"\u0014\u0010\u0014\u001a\u00020\u00118\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0013¨\u0006\u0015"}, d2 = {"Lokio/Path;", "zipPath", "Lokio/FileSystem;", "fileSystem", "Lkotlin/Function1;", "Lokio/internal/ZipEntry;", "", "predicate", "Lokio/ZipFileSystem;", "openZip", "Lokio/BufferedSource;", "readEntry", "", "skipLocalHeader", "Lokio/FileMetadata;", "basicMetadata", "readLocalHeader", "", "COMPRESSION_METHOD_DEFLATED", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "COMPRESSION_METHOD_STORED", "okio"}, k = 2, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nZipFiles.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ZipFiles.kt\nokio/internal/ZipFilesKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,459:1\n1045#2:460\n*S KotlinDebug\n*F\n+ 1 ZipFiles.kt\nokio/internal/ZipFilesKt\n*L\n156#1:460\n*E\n"})
public final class ZipFilesKt {
    public static final int COMPRESSION_METHOD_DEFLATED = 8;
    public static final int COMPRESSION_METHOD_STORED = 0;

    /* JADX INFO: compiled from: ZipFiles.kt */
    public static final class a extends Lambda implements Function1<ZipEntry, Boolean> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final a f86489p0 = new a(1);

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(ZipEntry zipEntry) {
            ZipEntry it = zipEntry;
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.TRUE;
        }
    }

    /* JADX INFO: compiled from: ZipFiles.kt */
    public static final class b extends Lambda implements Function2<Integer, Long, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Ref.BooleanRef f86490p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ long f86491q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ Ref.LongRef f86492r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ BufferedSource f86493s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ Ref.LongRef f86494t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final /* synthetic */ Ref.LongRef f86495u0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Ref.BooleanRef booleanRef, long j10, Ref.LongRef longRef, BufferedSource bufferedSource, Ref.LongRef longRef2, Ref.LongRef longRef3) {
            super(2);
            this.f86490p0 = booleanRef;
            this.f86491q0 = j10;
            this.f86492r0 = longRef;
            this.f86493s0 = bufferedSource;
            this.f86494t0 = longRef2;
            this.f86495u0 = longRef3;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Integer num, Long l6) throws IOException {
            int iIntValue = num.intValue();
            long jLongValue = l6.longValue();
            if (iIntValue == 1) {
                Ref.BooleanRef booleanRef = this.f86490p0;
                if (booleanRef.element) {
                    throw new IOException("bad zip: zip64 extra repeated");
                }
                booleanRef.element = true;
                if (jLongValue < this.f86491q0) {
                    throw new IOException("bad zip: zip64 extra too short");
                }
                Ref.LongRef longRef = this.f86492r0;
                long longLe = longRef.element;
                BufferedSource bufferedSource = this.f86493s0;
                if (longLe == 4294967295L) {
                    longLe = bufferedSource.readLongLe();
                }
                longRef.element = longLe;
                Ref.LongRef longRef2 = this.f86494t0;
                longRef2.element = longRef2.element == 4294967295L ? bufferedSource.readLongLe() : 0L;
                Ref.LongRef longRef3 = this.f86495u0;
                longRef3.element = longRef3.element == 4294967295L ? bufferedSource.readLongLe() : 0L;
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: ZipFiles.kt */
    public static final class c extends Lambda implements Function2<Integer, Long, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ BufferedSource f86496p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Ref.ObjectRef<Long> f86497q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ Ref.ObjectRef<Long> f86498r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ Ref.ObjectRef<Long> f86499s0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(BufferedSource bufferedSource, Ref.ObjectRef<Long> objectRef, Ref.ObjectRef<Long> objectRef2, Ref.ObjectRef<Long> objectRef3) {
            super(2);
            this.f86496p0 = bufferedSource;
            this.f86497q0 = objectRef;
            this.f86498r0 = objectRef2;
            this.f86499s0 = objectRef3;
        }

        /* JADX WARN: Type inference failed for: r0v11, types: [T, java.lang.Long] */
        /* JADX WARN: Type inference failed for: r0v7, types: [T, java.lang.Long] */
        /* JADX WARN: Type inference failed for: r12v12, types: [T, java.lang.Long] */
        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Integer num, Long l6) throws IOException {
            int iIntValue = num.intValue();
            long jLongValue = l6.longValue();
            if (iIntValue == 21589) {
                if (jLongValue < 1) {
                    throw new IOException("bad zip: extended timestamp extra too short");
                }
                BufferedSource bufferedSource = this.f86496p0;
                byte b10 = bufferedSource.readByte();
                boolean z10 = (b10 & 1) == 1;
                boolean z11 = (b10 & 2) == 2;
                boolean z12 = (b10 & 4) == 4;
                long j10 = z10 ? 5L : 1L;
                if (z11) {
                    j10 += 4;
                }
                if (z12) {
                    j10 += 4;
                }
                if (jLongValue < j10) {
                    throw new IOException("bad zip: extended timestamp extra too short");
                }
                if (z10) {
                    this.f86497q0.element = Long.valueOf(((long) bufferedSource.readIntLe()) * 1000);
                }
                if (z11) {
                    this.f86498r0.element = Long.valueOf(((long) bufferedSource.readIntLe()) * 1000);
                }
                if (z12) {
                    this.f86499s0.element = Long.valueOf(((long) bufferedSource.readIntLe()) * 1000);
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final Map a(ArrayList arrayList) {
        Path path = Path.Companion.get$default(Path.INSTANCE, "/", false, 1, (Object) null);
        Map mapMutableMapOf = q.mutableMapOf(TuplesKt.to(path, new ZipEntry(path, true, null, 0L, 0L, 0L, 0, null, 0L, TypedValues.PositionType.TYPE_CURVE_FIT, null)));
        for (ZipEntry zipEntry : CollectionsKt___CollectionsKt.sortedWith(arrayList, new Comparator() { // from class: okio.internal.ZipFilesKt$buildIndex$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t10, T t11) {
                return e.compareValues(((ZipEntry) t10).getCanonicalPath(), ((ZipEntry) t11).getCanonicalPath());
            }
        })) {
            if (((ZipEntry) mapMutableMapOf.put(zipEntry.getCanonicalPath(), zipEntry)) == null) {
                while (true) {
                    Path pathParent = zipEntry.getCanonicalPath().parent();
                    if (pathParent == null) {
                        break;
                    }
                    ZipEntry zipEntry2 = (ZipEntry) mapMutableMapOf.get(pathParent);
                    if (zipEntry2 != null) {
                        zipEntry2.getChildren().add(zipEntry.getCanonicalPath());
                        break;
                    }
                    ZipEntry zipEntry3 = new ZipEntry(pathParent, true, null, 0L, 0L, 0L, 0, null, 0L, TypedValues.PositionType.TYPE_CURVE_FIT, null);
                    mapMutableMapOf.put(pathParent, zipEntry3);
                    zipEntry3.getChildren().add(zipEntry.getCanonicalPath());
                    zipEntry = zipEntry3;
                }
            }
        }
        return mapMutableMapOf;
    }

    public static final String b(int i10) {
        StringBuilder sb2 = new StringBuilder("0x");
        String string = Integer.toString(i10, CharsKt.checkRadix(16));
        Intrinsics.checkNotNullExpressionValue(string, "toString(this, checkRadix(radix))");
        sb2.append(string);
        return sb2.toString();
    }

    public static final void c(BufferedSource bufferedSource, int i10, Function2<? super Integer, ? super Long, Unit> function2) throws IOException {
        long j10 = i10;
        while (j10 != 0) {
            if (j10 < 4) {
                throw new IOException("bad zip: truncated header in extra field");
            }
            int shortLe = bufferedSource.readShortLe() & UShort.MAX_VALUE;
            long shortLe2 = ((long) bufferedSource.readShortLe()) & WebSocketProtocol.PAYLOAD_SHORT_MAX;
            long j11 = j10 - ((long) 4);
            if (j11 < shortLe2) {
                throw new IOException("bad zip: truncated value in extra field");
            }
            bufferedSource.require(shortLe2);
            long size = bufferedSource.getBuffer().size();
            function2.invoke(Integer.valueOf(shortLe), Long.valueOf(shortLe2));
            long size2 = (bufferedSource.getBuffer().size() + shortLe2) - size;
            if (size2 < 0) {
                throw new IOException(g0.c("unsupported zip: too many bytes processed for ", shortLe));
            }
            if (size2 > 0) {
                bufferedSource.getBuffer().skip(size2);
            }
            j10 = j11 - shortLe2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final FileMetadata d(BufferedSource bufferedSource, FileMetadata fileMetadata) throws IOException {
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = fileMetadata != null ? fileMetadata.getLastModifiedAtMillis() : 0;
        Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
        Ref.ObjectRef objectRef3 = new Ref.ObjectRef();
        int intLe = bufferedSource.readIntLe();
        if (intLe != 67324752) {
            throw new IOException("bad zip: expected " + b(LocalFileHeader.LFH_SIGNATURE) + " but was " + b(intLe));
        }
        bufferedSource.skip(2L);
        short shortLe = bufferedSource.readShortLe();
        int i10 = shortLe & UShort.MAX_VALUE;
        if ((shortLe & 1) != 0) {
            throw new IOException("unsupported zip: general purpose bit flag=" + b(i10));
        }
        bufferedSource.skip(18L);
        long shortLe2 = ((long) bufferedSource.readShortLe()) & WebSocketProtocol.PAYLOAD_SHORT_MAX;
        int shortLe3 = bufferedSource.readShortLe() & UShort.MAX_VALUE;
        bufferedSource.skip(shortLe2);
        if (fileMetadata == null) {
            bufferedSource.skip(shortLe3);
            return null;
        }
        c(bufferedSource, shortLe3, new c(bufferedSource, objectRef, objectRef2, objectRef3));
        return new FileMetadata(fileMetadata.getIsRegularFile(), fileMetadata.getIsDirectory(), null, fileMetadata.getSize(), (Long) objectRef3.element, (Long) objectRef.element, (Long) objectRef2.element, null, 128, null);
    }

    @NotNull
    public static final ZipFileSystem openZip(@NotNull Path zipPath, @NotNull FileSystem fileSystem, @NotNull Function1<? super ZipEntry, Boolean> predicate) throws IOException {
        Intrinsics.checkNotNullParameter(zipPath, "zipPath");
        Intrinsics.checkNotNullParameter(fileSystem, "fileSystem");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        FileHandle fileHandleOpenReadOnly = fileSystem.openReadOnly(zipPath);
        try {
            long size = fileHandleOpenReadOnly.size() - ((long) 22);
            if (size < 0) {
                throw new IOException("not a zip: size=" + fileHandleOpenReadOnly.size());
            }
            long jMax = Math.max(size - SvgConstantsKt.SPECIFIED_FONT_STYLE, 0L);
            do {
                BufferedSource bufferedSourceBuffer = Okio.buffer(fileHandleOpenReadOnly.source(size));
                try {
                    if (bufferedSourceBuffer.readIntLe() == 101010256) {
                        int shortLe = bufferedSourceBuffer.readShortLe() & UShort.MAX_VALUE;
                        int shortLe2 = bufferedSourceBuffer.readShortLe() & UShort.MAX_VALUE;
                        long shortLe3 = bufferedSourceBuffer.readShortLe() & UShort.MAX_VALUE;
                        if (shortLe3 != (bufferedSourceBuffer.readShortLe() & UShort.MAX_VALUE) || shortLe != 0 || shortLe2 != 0) {
                            throw new IOException("unsupported zip: spanned");
                        }
                        bufferedSourceBuffer.skip(4L);
                        long intLe = ((long) bufferedSourceBuffer.readIntLe()) & 4294967295L;
                        int shortLe4 = bufferedSourceBuffer.readShortLe() & UShort.MAX_VALUE;
                        em.a aVar = new em.a(shortLe4, shortLe3, intLe);
                        String utf8 = bufferedSourceBuffer.readUtf8(shortLe4);
                        bufferedSourceBuffer.close();
                        long j10 = size - ((long) 20);
                        if (j10 > 0) {
                            BufferedSource bufferedSourceBuffer2 = Okio.buffer(fileHandleOpenReadOnly.source(j10));
                            try {
                                if (bufferedSourceBuffer2.readIntLe() == 117853008) {
                                    int intLe2 = bufferedSourceBuffer2.readIntLe();
                                    long longLe = bufferedSourceBuffer2.readLongLe();
                                    if (bufferedSourceBuffer2.readIntLe() != 1 || intLe2 != 0) {
                                        throw new IOException("unsupported zip: spanned");
                                    }
                                    BufferedSource bufferedSourceBuffer3 = Okio.buffer(fileHandleOpenReadOnly.source(longLe));
                                    try {
                                        int intLe3 = bufferedSourceBuffer3.readIntLe();
                                        if (intLe3 != 101075792) {
                                            throw new IOException("bad zip: expected " + b(101075792) + " but was " + b(intLe3));
                                        }
                                        bufferedSourceBuffer3.skip(12L);
                                        int intLe4 = bufferedSourceBuffer3.readIntLe();
                                        int intLe5 = bufferedSourceBuffer3.readIntLe();
                                        long longLe2 = bufferedSourceBuffer3.readLongLe();
                                        if (longLe2 != bufferedSourceBuffer3.readLongLe() || intLe4 != 0 || intLe5 != 0) {
                                            throw new IOException("unsupported zip: spanned");
                                        }
                                        bufferedSourceBuffer3.skip(8L);
                                        aVar = new em.a(shortLe4, longLe2, bufferedSourceBuffer3.readLongLe());
                                        Unit unit = Unit.INSTANCE;
                                        CloseableKt.closeFinally(bufferedSourceBuffer3, null);
                                    } catch (Throwable th2) {
                                        try {
                                            throw th2;
                                        } catch (Throwable th3) {
                                            CloseableKt.closeFinally(bufferedSourceBuffer3, th2);
                                            throw th3;
                                        }
                                    }
                                    try {
                                        throw th;
                                    } catch (Throwable th4) {
                                        CloseableKt.closeFinally(fileHandleOpenReadOnly, th);
                                        throw th4;
                                    }
                                }
                                Unit unit2 = Unit.INSTANCE;
                                CloseableKt.closeFinally(bufferedSourceBuffer2, null);
                            } catch (Throwable th5) {
                                try {
                                    throw th5;
                                } catch (Throwable th6) {
                                    CloseableKt.closeFinally(bufferedSourceBuffer2, th5);
                                    throw th6;
                                }
                            }
                        }
                        long j11 = aVar.f68367b;
                        ArrayList arrayList = new ArrayList();
                        BufferedSource bufferedSourceBuffer4 = Okio.buffer(fileHandleOpenReadOnly.source(j11));
                        try {
                            long j12 = aVar.f68366a;
                            for (long j13 = 0; j13 < j12; j13++) {
                                ZipEntry entry = readEntry(bufferedSourceBuffer4);
                                if (entry.getAndroidx.constraintlayout.core.motion.utils.TypedValues.CycleType.S_WAVE_OFFSET java.lang.String() >= j11) {
                                    throw new IOException("bad zip: local file header offset >= central directory offset");
                                }
                                if (predicate.invoke(entry).booleanValue()) {
                                    arrayList.add(entry);
                                }
                            }
                            Unit unit3 = Unit.INSTANCE;
                            CloseableKt.closeFinally(bufferedSourceBuffer4, null);
                            ZipFileSystem zipFileSystem = new ZipFileSystem(zipPath, fileSystem, a(arrayList), utf8);
                            CloseableKt.closeFinally(fileHandleOpenReadOnly, null);
                            return zipFileSystem;
                        } catch (Throwable th7) {
                            try {
                                throw th7;
                            } catch (Throwable th8) {
                                CloseableKt.closeFinally(bufferedSourceBuffer4, th7);
                                throw th8;
                            }
                        }
                    }
                    bufferedSourceBuffer.close();
                    size--;
                } catch (Throwable th9) {
                    bufferedSourceBuffer.close();
                    throw th9;
                }
            } while (size >= jMax);
            throw new IOException("not a zip: end of central directory signature not found");
        } catch (Throwable th10) {
            throw th10;
        }
    }

    public static /* synthetic */ ZipFileSystem openZip$default(Path path, FileSystem fileSystem, Function1 function1, int i10, Object obj) throws IOException {
        if ((i10 & 4) != 0) {
            function1 = a.f86489p0;
        }
        return openZip(path, fileSystem, function1);
    }

    @NotNull
    public static final ZipEntry readEntry(@NotNull BufferedSource bufferedSource) throws IOException {
        Long lValueOf;
        Intrinsics.checkNotNullParameter(bufferedSource, "<this>");
        int intLe = bufferedSource.readIntLe();
        if (intLe != 33639248) {
            throw new IOException("bad zip: expected " + b(CentralDirectoryFileHeader.CDFH_SIGNATURE) + " but was " + b(intLe));
        }
        bufferedSource.skip(4L);
        short shortLe = bufferedSource.readShortLe();
        int i10 = shortLe & UShort.MAX_VALUE;
        if ((shortLe & 1) != 0) {
            throw new IOException("unsupported zip: general purpose bit flag=" + b(i10));
        }
        int shortLe2 = bufferedSource.readShortLe() & UShort.MAX_VALUE;
        short shortLe3 = bufferedSource.readShortLe();
        int i11 = shortLe3 & UShort.MAX_VALUE;
        short shortLe4 = bufferedSource.readShortLe();
        int i12 = shortLe4 & UShort.MAX_VALUE;
        if (i11 == -1) {
            lValueOf = null;
        } else {
            GregorianCalendar gregorianCalendar = new GregorianCalendar();
            gregorianCalendar.set(14, 0);
            gregorianCalendar.set(((i12 >> 9) & 127) + 1980, ((i12 >> 5) & 15) - 1, shortLe4 & 31, (i11 >> 11) & 31, (i11 >> 5) & 63, (shortLe3 & 31) << 1);
            lValueOf = Long.valueOf(gregorianCalendar.getTime().getTime());
        }
        long intLe2 = ((long) bufferedSource.readIntLe()) & 4294967295L;
        Ref.LongRef longRef = new Ref.LongRef();
        longRef.element = ((long) bufferedSource.readIntLe()) & 4294967295L;
        Ref.LongRef longRef2 = new Ref.LongRef();
        longRef2.element = ((long) bufferedSource.readIntLe()) & 4294967295L;
        int shortLe5 = bufferedSource.readShortLe() & UShort.MAX_VALUE;
        int shortLe6 = bufferedSource.readShortLe() & UShort.MAX_VALUE;
        int shortLe7 = bufferedSource.readShortLe() & UShort.MAX_VALUE;
        bufferedSource.skip(8L);
        Ref.LongRef longRef3 = new Ref.LongRef();
        longRef3.element = ((long) bufferedSource.readIntLe()) & 4294967295L;
        String utf8 = bufferedSource.readUtf8(shortLe5);
        if (StringsKt__StringsKt.contains$default((CharSequence) utf8, (char) 0, false, 2, (Object) null)) {
            throw new IOException("bad zip: filename contains 0x00");
        }
        long j10 = longRef2.element == 4294967295L ? 8 : 0L;
        if (longRef.element == 4294967295L) {
            j10 += (long) 8;
        }
        if (longRef3.element == 4294967295L) {
            j10 += (long) 8;
        }
        Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        c(bufferedSource, shortLe6, new b(booleanRef, j10, longRef2, bufferedSource, longRef, longRef3));
        if (j10 <= 0 || booleanRef.element) {
            return new ZipEntry(Path.Companion.get$default(Path.INSTANCE, "/", false, 1, (Object) null).resolve(utf8), l.endsWith$default(utf8, "/", false, 2, null), bufferedSource.readUtf8(shortLe7), intLe2, longRef.element, longRef2.element, shortLe2, lValueOf, longRef3.element);
        }
        throw new IOException("bad zip: zip64 extra required but absent");
    }

    @NotNull
    public static final FileMetadata readLocalHeader(@NotNull BufferedSource bufferedSource, @NotNull FileMetadata basicMetadata) throws IOException {
        Intrinsics.checkNotNullParameter(bufferedSource, "<this>");
        Intrinsics.checkNotNullParameter(basicMetadata, "basicMetadata");
        FileMetadata fileMetadataD = d(bufferedSource, basicMetadata);
        Intrinsics.checkNotNull(fileMetadataD);
        return fileMetadataD;
    }

    public static final void skipLocalHeader(@NotNull BufferedSource bufferedSource) throws IOException {
        Intrinsics.checkNotNullParameter(bufferedSource, "<this>");
        d(bufferedSource, null);
    }
}
