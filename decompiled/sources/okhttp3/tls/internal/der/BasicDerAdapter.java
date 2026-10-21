package okhttp3.tls.internal.der;

import androidx.exifinterface.media.ExifInterface;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.glomohybrid.logs.LogKeysKt;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import com.fasterxml.jackson.core.JsonPointer;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import okio.BufferedSink;
import okio.ByteString;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: BasicDerAdapter.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0014\b\u0080\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002:\u0001<BM\u0012\u0006\u0010\"\u001a\u00020\u001b\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\f\u0010$\u001a\b\u0012\u0004\u0012\u00028\u00000#\u0012\b\b\u0002\u0010%\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00018\u0000\u0012\b\b\u0002\u0010&\u001a\u00020\u0005¢\u0006\u0004\b:\u0010;J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u0017\u0010\t\u001a\u00028\u00002\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001e\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013J\u001f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u0017\u0010\u0018J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000J\b\u0010\u001a\u001a\u00020\u0011H\u0016J\b\u0010\u001c\u001a\u00020\u001bH\u0016J\t\u0010\u001d\u001a\u00020\u0011HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0013HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0005HÆ\u0003J\u0012\u0010 \u001a\u0004\u0018\u00018\u0000HÆ\u0003¢\u0006\u0004\b \u0010!Jd\u0010'\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010\"\u001a\u00020\u001b2\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u00132\u000e\b\u0002\u0010$\u001a\b\u0012\u0004\u0012\u00028\u00000#2\b\b\u0002\u0010%\u001a\u00020\u00052\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00018\u00002\b\b\u0002\u0010&\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b'\u0010(J\u0013\u0010+\u001a\u00020\u00052\b\u0010*\u001a\u0004\u0018\u00010)HÖ\u0003R\u0017\u0010\u0012\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R\u0017\u0010%\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b%\u00106R\u0019\u0010\u0016\u001a\u0004\u0018\u00018\u00008\u0006¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010!¨\u0006="}, d2 = {"Lokhttp3/tls/internal/der/BasicDerAdapter;", ExifInterface.GPS_DIRECTION_TRUE, "Lokhttp3/tls/internal/der/DerAdapter;", "Lokhttp3/tls/internal/der/DerHeader;", "header", "", "matches", "Lokhttp3/tls/internal/der/DerReader;", "reader", "fromDer", "(Lokhttp3/tls/internal/der/DerReader;)Ljava/lang/Object;", "Lokhttp3/tls/internal/der/DerWriter;", "writer", "value", "", "toDer", "(Lokhttp3/tls/internal/der/DerWriter;Ljava/lang/Object;)V", "", "tagClass", "", LogKeysKt.TAG, "withTag", "defaultValue", "optional", "(Ljava/lang/Object;)Lokhttp3/tls/internal/der/BasicDerAdapter;", "asTypeHint", GenerateActivationFormCommand.HASH_CODE, "", "toString", "component2", "component3", "component5", "component6", "()Ljava/lang/Object;", "name", "Lokhttp3/tls/internal/der/BasicDerAdapter$Codec;", "codec", "isOptional", "typeHint", "copy", "(Ljava/lang/String;IJLokhttp3/tls/internal/der/BasicDerAdapter$Codec;ZLjava/lang/Object;Z)Lokhttp3/tls/internal/der/BasicDerAdapter;", "", "other", "equals", "b", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getTagClass", "()I", "c", "J", "getTag", "()J", "e", "Z", "()Z", "f", "Ljava/lang/Object;", "getDefaultValue", "<init>", "(Ljava/lang/String;IJLokhttp3/tls/internal/der/BasicDerAdapter$Codec;ZLjava/lang/Object;Z)V", "Codec", "okhttp-tls"}, k = 1, mv = {1, 4, 0})
public final /* data */ class BasicDerAdapter<T> implements DerAdapter<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f86228a;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final int tagClass;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final long tag;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Codec<T> f86231d;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public final boolean isOptional;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final T defaultValue;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f86234g;

    /* JADX INFO: compiled from: BasicDerAdapter.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u0000*\u0004\b\u0001\u0010\u00012\u00020\u0002J\u0015\u0010\u0003\u001a\u00028\u00012\u0006\u0010\u0004\u001a\u00020\u0005H&¢\u0006\u0002\u0010\u0006J\u001d\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00028\u0001H&¢\u0006\u0002\u0010\f¨\u0006\r"}, d2 = {"Lokhttp3/tls/internal/der/BasicDerAdapter$Codec;", ExifInterface.GPS_DIRECTION_TRUE, "", "decode", "reader", "Lokhttp3/tls/internal/der/DerReader;", "(Lokhttp3/tls/internal/der/DerReader;)Ljava/lang/Object;", "encode", "", "writer", "Lokhttp3/tls/internal/der/DerWriter;", "value", "(Lokhttp3/tls/internal/der/DerWriter;Ljava/lang/Object;)V", "okhttp-tls"}, k = 1, mv = {1, 4, 0})
    public interface Codec<T> {
        T decode(@NotNull DerReader reader);

        void encode(@NotNull DerWriter writer, T value);
    }

    /* JADX INFO: compiled from: BasicDerAdapter.kt */
    public static final class a extends Lambda implements Function1<BufferedSink, Unit> {

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ DerWriter f86236q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ Object f86237r0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(DerWriter derWriter, Object obj) {
            super(1);
            this.f86236q0 = derWriter;
            this.f86237r0 = obj;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(BufferedSink bufferedSink) {
            BufferedSink it = bufferedSink;
            Intrinsics.checkNotNullParameter(it, "it");
            BasicDerAdapter.this.f86231d.encode(this.f86236q0, this.f86237r0);
            return Unit.INSTANCE;
        }
    }

    public BasicDerAdapter(@NotNull String name, int i10, long j10, @NotNull Codec<T> codec, boolean z10, @Nullable T t10, boolean z11) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(codec, "codec");
        this.f86228a = name;
        this.tagClass = i10;
        this.tag = j10;
        this.f86231d = codec;
        this.isOptional = z10;
        this.defaultValue = t10;
        this.f86234g = z11;
        if (!(i10 >= 0)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (!(j10 >= 0)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BasicDerAdapter copy$default(BasicDerAdapter basicDerAdapter, String str, int i10, long j10, Codec codec, boolean z10, Object obj, boolean z11, int i11, Object obj2) {
        return basicDerAdapter.copy((i11 & 1) != 0 ? basicDerAdapter.f86228a : str, (i11 & 2) != 0 ? basicDerAdapter.tagClass : i10, (i11 & 4) != 0 ? basicDerAdapter.tag : j10, (i11 & 8) != 0 ? basicDerAdapter.f86231d : codec, (i11 & 16) != 0 ? basicDerAdapter.isOptional : z10, (i11 & 32) != 0 ? basicDerAdapter.defaultValue : obj, (i11 & 64) != 0 ? basicDerAdapter.f86234g : z11);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BasicDerAdapter optional$default(BasicDerAdapter basicDerAdapter, Object obj, int i10, Object obj2) {
        if ((i10 & 1) != 0) {
            obj = null;
        }
        return basicDerAdapter.optional(obj);
    }

    public static /* synthetic */ BasicDerAdapter withTag$default(BasicDerAdapter basicDerAdapter, int i10, long j10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = 128;
        }
        return basicDerAdapter.withTag(i10, j10);
    }

    @Override // okhttp3.tls.internal.der.DerAdapter
    @NotNull
    public BasicDerAdapter<List<T>> asSequenceOf(@NotNull String name, int i10, long j10) {
        Intrinsics.checkNotNullParameter(name, "name");
        return DerAdapter.DefaultImpls.asSequenceOf(this, name, i10, j10);
    }

    @Override // okhttp3.tls.internal.der.DerAdapter
    @NotNull
    public BasicDerAdapter<List<T>> asSetOf() {
        return DerAdapter.DefaultImpls.asSetOf(this);
    }

    @NotNull
    public final BasicDerAdapter<T> asTypeHint() {
        return copy$default(this, null, 0, 0L, null, false, null, true, 63, null);
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getTagClass() {
        return this.tagClass;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final long getTag() {
        return this.tag;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final boolean getIsOptional() {
        return this.isOptional;
    }

    @Nullable
    public final T component6() {
        return this.defaultValue;
    }

    @NotNull
    public final BasicDerAdapter<T> copy(@NotNull String name, int tagClass, long tag, @NotNull Codec<T> codec, boolean isOptional, @Nullable T defaultValue, boolean typeHint) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(codec, "codec");
        return new BasicDerAdapter<>(name, tagClass, tag, codec, isOptional, defaultValue, typeHint);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BasicDerAdapter)) {
            return false;
        }
        BasicDerAdapter basicDerAdapter = (BasicDerAdapter) other;
        return Intrinsics.areEqual(this.f86228a, basicDerAdapter.f86228a) && this.tagClass == basicDerAdapter.tagClass && this.tag == basicDerAdapter.tag && Intrinsics.areEqual(this.f86231d, basicDerAdapter.f86231d) && this.isOptional == basicDerAdapter.isOptional && Intrinsics.areEqual(this.defaultValue, basicDerAdapter.defaultValue) && this.f86234g == basicDerAdapter.f86234g;
    }

    @Override // okhttp3.tls.internal.der.DerAdapter
    public T fromDer(@NotNull ByteString byteString) {
        Intrinsics.checkNotNullParameter(byteString, "byteString");
        return (T) DerAdapter.DefaultImpls.fromDer(this, byteString);
    }

    @Nullable
    public final T getDefaultValue() {
        return this.defaultValue;
    }

    public final long getTag() {
        return this.tag;
    }

    public final int getTagClass() {
        return this.tagClass;
    }

    public int hashCode() {
        int iHashCode = (((this.f86231d.hashCode() + (((((this.f86228a.hashCode() * 31) + this.tagClass) * 31) + ((int) this.tag)) * 31)) * 31) + (this.isOptional ? 1 : 0)) * 31;
        T t10 = this.defaultValue;
        return ((iHashCode + (t10 != null ? t10.hashCode() : 0)) * 31) + (this.f86234g ? 1 : 0);
    }

    public final boolean isOptional() {
        return this.isOptional;
    }

    @Override // okhttp3.tls.internal.der.DerAdapter
    public boolean matches(@NotNull DerHeader header) {
        Intrinsics.checkNotNullParameter(header, "header");
        return header.getTagClass() == this.tagClass && header.getTag() == this.tag;
    }

    @NotNull
    public final BasicDerAdapter<T> optional(@Nullable T defaultValue) {
        return copy$default(this, null, 0, 0L, null, true, defaultValue, false, 79, null);
    }

    @Override // okhttp3.tls.internal.der.DerAdapter
    @NotNull
    public ByteString toDer(T t10) {
        return DerAdapter.DefaultImpls.toDer(this, t10);
    }

    @NotNull
    public String toString() {
        return this.f86228a + " [" + this.tagClass + JsonPointer.SEPARATOR + this.tag + AbstractJsonLexerKt.END_LIST;
    }

    @Override // okhttp3.tls.internal.der.DerAdapter
    @NotNull
    public BasicDerAdapter<T> withExplicitBox(int i10, long j10, @Nullable Boolean bool) {
        return DerAdapter.DefaultImpls.withExplicitBox(this, i10, j10, bool);
    }

    @NotNull
    public final BasicDerAdapter<T> withTag(int tagClass, long tag) {
        return copy$default(this, null, tagClass, tag, null, false, null, false, 121, null);
    }

    @Override // okhttp3.tls.internal.der.DerAdapter
    public T fromDer(@NotNull DerReader reader) throws IOException {
        long length;
        Intrinsics.checkNotNullParameter(reader, "reader");
        DerHeader derHeaderPeekHeader = reader.peekHeader();
        if (derHeaderPeekHeader == null || derHeaderPeekHeader.getTagClass() != this.tagClass || derHeaderPeekHeader.getTag() != this.tag) {
            if (this.isOptional) {
                return this.defaultValue;
            }
            throw new ProtocolException("expected " + this + " but was " + derHeaderPeekHeader + " at " + reader);
        }
        if (!reader.hasNext()) {
            throw new ProtocolException("expected a value");
        }
        DerHeader derHeader = reader.f86291g;
        Intrinsics.checkNotNull(derHeader);
        reader.f86291g = null;
        long j10 = reader.f86287c;
        boolean z10 = reader.f86290f;
        if (derHeader.getLength() != -1) {
            length = derHeader.getLength() + reader.a();
        } else {
            length = -1;
        }
        if (j10 != -1 && length > j10) {
            throw new ProtocolException("enclosed object too large");
        }
        reader.f86287c = length;
        reader.f86290f = derHeader.getConstructed();
        String str = this.f86228a;
        if (str != null) {
            reader.f86289e.add(str);
        }
        try {
            T tDecode = this.f86231d.decode(reader);
            if (length != -1 && reader.a() > length) {
                throw new ProtocolException("unexpected byte count at " + reader);
            }
            reader.f86291g = null;
            reader.f86287c = j10;
            reader.f86290f = z10;
            if (str != null) {
                reader.f86289e.remove(reader.f86289e.size() - 1);
            }
            if (this.f86234g) {
                reader.setTypeHint(tDecode);
            }
            return tDecode;
        } catch (Throwable th2) {
            reader.f86291g = null;
            reader.f86287c = j10;
            reader.f86290f = z10;
            if (str != null) {
                reader.f86289e.remove(reader.f86289e.size() - 1);
            }
            throw th2;
        }
    }

    @Override // okhttp3.tls.internal.der.DerAdapter
    public void toDer(@NotNull DerWriter writer, T value) throws IOException {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (this.f86234g) {
            writer.setTypeHint(value);
        }
        if (this.isOptional && Intrinsics.areEqual(value, this.defaultValue)) {
            return;
        }
        writer.write(this.f86228a, this.tagClass, this.tag, new a(writer, value));
    }

    public /* synthetic */ BasicDerAdapter(String str, int i10, long j10, Codec codec, boolean z10, Object obj, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i10, j10, codec, (i11 & 16) != 0 ? false : z10, (i11 & 32) != 0 ? null : obj, (i11 & 64) != 0 ? false : z11);
    }
}
