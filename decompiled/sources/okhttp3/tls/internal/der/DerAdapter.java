package okhttp3.tls.internal.der;

import androidx.exifinterface.media.ExifInterface;
import com.bbva.glomohybrid.logs.LogKeysKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okio.Buffer;
import okio.ByteString;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: DerAdapter.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b`\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J2\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00050\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000bH\u0016J\u0014\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00050\u0004H\u0016J\u0015\u0010\r\u001a\u00028\u00002\u0006\u0010\u000e\u001a\u00020\u000fH&¢\u0006\u0002\u0010\u0010J\u0015\u0010\r\u001a\u00028\u00002\u0006\u0010\u0011\u001a\u00020\u0012H\u0016¢\u0006\u0002\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H&J\u0015\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u001aJ\u001d\u0010\u0018\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u0019\u001a\u00028\u0000H&¢\u0006\u0002\u0010\u001eJ1\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\b\b\u0002\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u0015H\u0016¢\u0006\u0002\u0010!¨\u0006\""}, d2 = {"Lokhttp3/tls/internal/der/DerAdapter;", ExifInterface.GPS_DIRECTION_TRUE, "", "asSequenceOf", "Lokhttp3/tls/internal/der/BasicDerAdapter;", "", "name", "", "tagClass", "", LogKeysKt.TAG, "", "asSetOf", "fromDer", "reader", "Lokhttp3/tls/internal/der/DerReader;", "(Lokhttp3/tls/internal/der/DerReader;)Ljava/lang/Object;", "byteString", "Lokio/ByteString;", "(Lokio/ByteString;)Ljava/lang/Object;", "matches", "", "header", "Lokhttp3/tls/internal/der/DerHeader;", "toDer", "value", "(Ljava/lang/Object;)Lokio/ByteString;", "", "writer", "Lokhttp3/tls/internal/der/DerWriter;", "(Lokhttp3/tls/internal/der/DerWriter;Ljava/lang/Object;)V", "withExplicitBox", "forceConstructed", "(IJLjava/lang/Boolean;)Lokhttp3/tls/internal/der/BasicDerAdapter;", "okhttp-tls"}, k = 1, mv = {1, 4, 0})
public interface DerAdapter<T> {

    /* JADX INFO: compiled from: DerAdapter.kt */
    @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 4, 0})
    public static final class DefaultImpls {
        @NotNull
        public static <T> BasicDerAdapter<List<T>> asSequenceOf(@NotNull final DerAdapter<T> derAdapter, @NotNull String name, int i10, long j10) {
            Intrinsics.checkNotNullParameter(name, "name");
            return new BasicDerAdapter<>(name, i10, j10, new BasicDerAdapter.Codec<List<? extends T>>() { // from class: okhttp3.tls.internal.der.DerAdapter$asSequenceOf$codec$1
                @Override // okhttp3.tls.internal.der.BasicDerAdapter.Codec
                @NotNull
                public List<T> decode(@NotNull DerReader reader) {
                    Intrinsics.checkNotNullParameter(reader, "reader");
                    ArrayList arrayList = new ArrayList();
                    while (reader.hasNext()) {
                        arrayList.add(derAdapter.fromDer(reader));
                    }
                    return arrayList;
                }

                @Override // okhttp3.tls.internal.der.BasicDerAdapter.Codec
                public void encode(@NotNull DerWriter writer, @NotNull List<? extends T> value) {
                    Intrinsics.checkNotNullParameter(writer, "writer");
                    Intrinsics.checkNotNullParameter(value, "value");
                    Iterator<? extends T> it = value.iterator();
                    while (it.hasNext()) {
                        derAdapter.toDer(writer, it.next());
                    }
                }
            }, false, null, false, 112, null);
        }

        public static /* synthetic */ BasicDerAdapter asSequenceOf$default(DerAdapter derAdapter, String str, int i10, long j10, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: asSequenceOf");
            }
            if ((i11 & 1) != 0) {
                str = "SEQUENCE OF";
            }
            if ((i11 & 2) != 0) {
                i10 = 0;
            }
            if ((i11 & 4) != 0) {
                j10 = 16;
            }
            return derAdapter.asSequenceOf(str, i10, j10);
        }

        @NotNull
        public static <T> BasicDerAdapter<List<T>> asSetOf(@NotNull DerAdapter<T> derAdapter) {
            return derAdapter.asSequenceOf("SET OF", 0, 17L);
        }

        public static <T> T fromDer(@NotNull DerAdapter<T> derAdapter, @NotNull ByteString byteString) {
            Intrinsics.checkNotNullParameter(byteString, "byteString");
            return derAdapter.fromDer(new DerReader(new Buffer().write(byteString)));
        }

        @NotNull
        public static <T> ByteString toDer(@NotNull DerAdapter<T> derAdapter, T t10) {
            Buffer buffer = new Buffer();
            derAdapter.toDer(new DerWriter(buffer), t10);
            return buffer.readByteString();
        }

        @NotNull
        public static <T> BasicDerAdapter<T> withExplicitBox(@NotNull final DerAdapter<T> derAdapter, int i10, long j10, @Nullable final Boolean bool) {
            return new BasicDerAdapter<>("EXPLICIT", i10, j10, new BasicDerAdapter.Codec<T>() { // from class: okhttp3.tls.internal.der.DerAdapter$withExplicitBox$codec$1
                @Override // okhttp3.tls.internal.der.BasicDerAdapter.Codec
                public T decode(@NotNull DerReader reader) {
                    Intrinsics.checkNotNullParameter(reader, "reader");
                    return (T) derAdapter.fromDer(reader);
                }

                @Override // okhttp3.tls.internal.der.BasicDerAdapter.Codec
                public void encode(@NotNull DerWriter writer, T value) {
                    Intrinsics.checkNotNullParameter(writer, "writer");
                    derAdapter.toDer(writer, value);
                    Boolean bool2 = bool;
                    if (bool2 != null) {
                        writer.setConstructed(bool2.booleanValue());
                    }
                }
            }, false, null, false, 112, null);
        }

        public static /* synthetic */ BasicDerAdapter withExplicitBox$default(DerAdapter derAdapter, int i10, long j10, Boolean bool, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: withExplicitBox");
            }
            if ((i11 & 1) != 0) {
                i10 = 128;
            }
            if ((i11 & 4) != 0) {
                bool = null;
            }
            return derAdapter.withExplicitBox(i10, j10, bool);
        }
    }

    @NotNull
    BasicDerAdapter<List<T>> asSequenceOf(@NotNull String name, int tagClass, long tag);

    @NotNull
    BasicDerAdapter<List<T>> asSetOf();

    T fromDer(@NotNull DerReader reader);

    T fromDer(@NotNull ByteString byteString);

    boolean matches(@NotNull DerHeader header);

    @NotNull
    ByteString toDer(T value);

    void toDer(@NotNull DerWriter writer, T value);

    @NotNull
    BasicDerAdapter<T> withExplicitBox(int tagClass, long tag, @Nullable Boolean forceConstructed);
}
