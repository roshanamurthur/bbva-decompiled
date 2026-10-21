package okhttp3.tls.internal.der;

import androidx.camera.core.processing.f;
import androidx.exifinterface.media.ExifInterface;
import com.bbva.ethermobilesdk.deviceinfo.component.Time;
import com.dasnano.vdvideoselfiecapture.config.VDVideoSelfieConfiguration;
import java.io.IOException;
import java.math.BigInteger;
import java.net.ProtocolException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.TimeZone;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.BufferedSink;
import okio.ByteString;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Adapters.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\r\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\b\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\bX\u0010YJ\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u000b\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\f\u0010\u0006J\u0017\u0010\u000f\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u000e\u0010\nJm\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00000\u0019\"\u0004\b\u0000\u0010\u00102\u0006\u0010\u0011\u001a\u00020\u00022\u001a\u0010\u0014\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00130\u0012\"\u0006\u0012\u0002\b\u00030\u00132\u0016\u0010\u0017\u001a\u0012\u0012\u0004\u0012\u00028\u0000\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00160\u00152\u0016\u0010\u0018\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0016\u0012\u0004\u0012\u00028\u00000\u0015¢\u0006\u0004\b\u001a\u0010\u001bJA\u0010\u001e\u001a\u001a\u0012\u0016\u0012\u0014\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0013\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u001d0\u00132\u001a\u0010\u001c\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00130\u0012\"\u0006\u0012\u0002\b\u00030\u0013¢\u0006\u0004\b\u001e\u0010\u001fJ*\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00132\u001a\u0010 \u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u00130\u0015Ji\u0010&\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00132<\b\u0002\u0010\u001c\u001a\u001e\u0012\u001a\b\u0001\u0012\u0016\u0012\b\u0012\u0006\u0012\u0002\b\u00030\"\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00130\u001d0\u0012\"\u0016\u0012\b\u0012\u0006\u0012\u0002\b\u00030\"\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00130\u001d2\b\b\u0002\u0010$\u001a\u00020#2\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b&\u0010'R\u001d\u0010,\u001a\b\u0012\u0004\u0012\u00020#0\u00198\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u001d\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00040\u00198\u0006¢\u0006\f\n\u0004\b-\u0010)\u001a\u0004\b.\u0010+R\u001d\u00103\u001a\b\u0012\u0004\u0012\u0002000\u00198\u0006¢\u0006\f\n\u0004\b1\u0010)\u001a\u0004\b2\u0010+R\u001d\u00107\u001a\b\u0012\u0004\u0012\u0002040\u00198\u0006¢\u0006\f\n\u0004\b5\u0010)\u001a\u0004\b6\u0010+R\u001d\u0010;\u001a\b\u0012\u0004\u0012\u0002080\u00198\u0006¢\u0006\f\n\u0004\b9\u0010)\u001a\u0004\b:\u0010+R\u001f\u0010?\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010<0\u00198\u0006¢\u0006\f\n\u0004\b=\u0010)\u001a\u0004\b>\u0010+R\u001d\u0010B\u001a\b\u0012\u0004\u0012\u00020\u00020\u00198\u0006¢\u0006\f\n\u0004\b@\u0010)\u001a\u0004\bA\u0010+R\u001d\u0010E\u001a\b\u0012\u0004\u0012\u00020\u00020\u00198\u0006¢\u0006\f\n\u0004\bC\u0010)\u001a\u0004\bD\u0010+R\u001d\u0010H\u001a\b\u0012\u0004\u0012\u00020\u00020\u00198\u0006¢\u0006\f\n\u0004\bF\u0010)\u001a\u0004\bG\u0010+R\u001d\u0010K\u001a\b\u0012\u0004\u0012\u00020\u00020\u00198\u0006¢\u0006\f\n\u0004\bI\u0010)\u001a\u0004\bJ\u0010+R\u001d\u0010N\u001a\b\u0012\u0004\u0012\u00020\u00040\u00198\u0006¢\u0006\f\n\u0004\bL\u0010)\u001a\u0004\bM\u0010+R\u001d\u0010Q\u001a\b\u0012\u0004\u0012\u00020\u00040\u00198\u0006¢\u0006\f\n\u0004\bO\u0010)\u001a\u0004\bP\u0010+R\u001d\u0010W\u001a\b\u0012\u0004\u0012\u00020R0\u00138\u0006¢\u0006\f\n\u0004\bS\u0010T\u001a\u0004\bU\u0010V¨\u0006Z"}, d2 = {"Lokhttp3/tls/internal/der/Adapters;", "", "", "string", "", "parseUtcTime$okhttp_tls", "(Ljava/lang/String;)J", "parseUtcTime", "date", "formatUtcTime$okhttp_tls", "(J)Ljava/lang/String;", "formatUtcTime", "parseGeneralizedTime$okhttp_tls", "parseGeneralizedTime", "formatGeneralizedTime$okhttp_tls", "formatGeneralizedTime", ExifInterface.GPS_DIRECTION_TRUE, "name", "", "Lokhttp3/tls/internal/der/DerAdapter;", "members", "Lkotlin/Function1;", "", "decompose", "construct", "Lokhttp3/tls/internal/der/BasicDerAdapter;", "sequence", "(Ljava/lang/String;[Lokhttp3/tls/internal/der/DerAdapter;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Lokhttp3/tls/internal/der/BasicDerAdapter;", "choices", "Lkotlin/Pair;", "choice", "([Lokhttp3/tls/internal/der/DerAdapter;)Lokhttp3/tls/internal/der/DerAdapter;", "chooser", "usingTypeHint", "Lkotlin/reflect/KClass;", "", "isOptional", "optionalValue", "any", "([Lkotlin/Pair;ZLjava/lang/Object;)Lokhttp3/tls/internal/der/DerAdapter;", "a", "Lokhttp3/tls/internal/der/BasicDerAdapter;", "getBOOLEAN", "()Lokhttp3/tls/internal/der/BasicDerAdapter;", "BOOLEAN", "b", "getINTEGER_AS_LONG", "INTEGER_AS_LONG", "Ljava/math/BigInteger;", "c", "getINTEGER_AS_BIG_INTEGER", "INTEGER_AS_BIG_INTEGER", "Lokhttp3/tls/internal/der/BitString;", "d", "getBIT_STRING", "BIT_STRING", "Lokio/ByteString;", "e", "getOCTET_STRING", "OCTET_STRING", "", "f", "getNULL", VDVideoSelfieConfiguration.NULL, "g", "getOBJECT_IDENTIFIER", "OBJECT_IDENTIFIER", "h", "getUTF8_STRING", "UTF8_STRING", "i", "getPRINTABLE_STRING", "PRINTABLE_STRING", "j", "getIA5_STRING", "IA5_STRING", "k", "getUTC_TIME", "UTC_TIME", "l", "getGENERALIZED_TIME", "GENERALIZED_TIME", "Lokhttp3/tls/internal/der/AnyValue;", "m", "Lokhttp3/tls/internal/der/DerAdapter;", "getANY_VALUE", "()Lokhttp3/tls/internal/der/DerAdapter;", "ANY_VALUE", "<init>", "()V", "okhttp-tls"}, k = 1, mv = {1, 4, 0})
public final class Adapters {
    public static final Adapters INSTANCE = new Adapters();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final BasicDerAdapter<Boolean> BOOLEAN;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final BasicDerAdapter<Long> INTEGER_AS_LONG;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final BasicDerAdapter<BigInteger> INTEGER_AS_BIG_INTEGER;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final BasicDerAdapter<BitString> BIT_STRING;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final BasicDerAdapter<ByteString> OCTET_STRING;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final BasicDerAdapter<Unit> NULL;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final BasicDerAdapter<String> OBJECT_IDENTIFIER;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final BasicDerAdapter<String> UTF8_STRING;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final BasicDerAdapter<String> PRINTABLE_STRING;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final BasicDerAdapter<String> IA5_STRING;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final BasicDerAdapter<Long> UTC_TIME;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final BasicDerAdapter<Long> GENERALIZED_TIME;

    @NotNull
    public static final Adapters$ANY_VALUE$1 m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final List<Pair<KClass<? extends Object>, DerAdapter<? extends Object>>> f86201n;

    /* JADX WARN: Type inference failed for: r10v3, types: [java.lang.Object, okhttp3.tls.internal.der.Adapters$ANY_VALUE$1] */
    static {
        BasicDerAdapter<Boolean> basicDerAdapter = new BasicDerAdapter<>("BOOLEAN", 0, 1L, new BasicDerAdapter.Codec<Boolean>() { // from class: okhttp3.tls.internal.der.Adapters$BOOLEAN$1
            @Override // okhttp3.tls.internal.der.BasicDerAdapter.Codec
            public /* bridge */ /* synthetic */ void encode(DerWriter derWriter, Boolean bool) throws IOException {
                encode(derWriter, bool.booleanValue());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // okhttp3.tls.internal.der.BasicDerAdapter.Codec
            @NotNull
            public Boolean decode(@NotNull DerReader reader) {
                Intrinsics.checkNotNullParameter(reader, "reader");
                return Boolean.valueOf(reader.readBoolean());
            }

            public void encode(@NotNull DerWriter writer, boolean value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                writer.writeBoolean(value);
            }
        }, false, null, false, 112, null);
        BOOLEAN = basicDerAdapter;
        INTEGER_AS_LONG = new BasicDerAdapter<>("INTEGER", 0, 2L, new BasicDerAdapter.Codec<Long>() { // from class: okhttp3.tls.internal.der.Adapters$INTEGER_AS_LONG$1
            @Override // okhttp3.tls.internal.der.BasicDerAdapter.Codec
            public /* bridge */ /* synthetic */ void encode(DerWriter derWriter, Long l6) throws IOException {
                encode(derWriter, l6.longValue());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // okhttp3.tls.internal.der.BasicDerAdapter.Codec
            @NotNull
            public Long decode(@NotNull DerReader reader) {
                Intrinsics.checkNotNullParameter(reader, "reader");
                return Long.valueOf(reader.readLong());
            }

            public void encode(@NotNull DerWriter writer, long value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                writer.writeLong(value);
            }
        }, false, null, false, 112, null);
        BasicDerAdapter<BigInteger> basicDerAdapter2 = new BasicDerAdapter<>("INTEGER", 0, 2L, new BasicDerAdapter.Codec<BigInteger>() { // from class: okhttp3.tls.internal.der.Adapters$INTEGER_AS_BIG_INTEGER$1
            @Override // okhttp3.tls.internal.der.BasicDerAdapter.Codec
            @NotNull
            public BigInteger decode(@NotNull DerReader reader) {
                Intrinsics.checkNotNullParameter(reader, "reader");
                return reader.readBigInteger();
            }

            @Override // okhttp3.tls.internal.der.BasicDerAdapter.Codec
            public void encode(@NotNull DerWriter writer, @NotNull BigInteger value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBigInteger(value);
            }
        }, false, null, false, 112, null);
        INTEGER_AS_BIG_INTEGER = basicDerAdapter2;
        BasicDerAdapter<BitString> basicDerAdapter3 = new BasicDerAdapter<>("BIT STRING", 0, 3L, new BasicDerAdapter.Codec<BitString>() { // from class: okhttp3.tls.internal.der.Adapters$BIT_STRING$1
            @Override // okhttp3.tls.internal.der.BasicDerAdapter.Codec
            @NotNull
            public BitString decode(@NotNull DerReader reader) {
                Intrinsics.checkNotNullParameter(reader, "reader");
                return reader.readBitString();
            }

            @Override // okhttp3.tls.internal.der.BasicDerAdapter.Codec
            public void encode(@NotNull DerWriter writer, @NotNull BitString value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBitString(value);
            }
        }, false, null, false, 112, null);
        BIT_STRING = basicDerAdapter3;
        BasicDerAdapter<ByteString> basicDerAdapter4 = new BasicDerAdapter<>("OCTET STRING", 0, 4L, new BasicDerAdapter.Codec<ByteString>() { // from class: okhttp3.tls.internal.der.Adapters$OCTET_STRING$1
            @Override // okhttp3.tls.internal.der.BasicDerAdapter.Codec
            @NotNull
            public ByteString decode(@NotNull DerReader reader) {
                Intrinsics.checkNotNullParameter(reader, "reader");
                return reader.readOctetString();
            }

            @Override // okhttp3.tls.internal.der.BasicDerAdapter.Codec
            public void encode(@NotNull DerWriter writer, @NotNull ByteString value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeOctetString(value);
            }
        }, false, null, false, 112, null);
        OCTET_STRING = basicDerAdapter4;
        BasicDerAdapter<Unit> basicDerAdapter5 = new BasicDerAdapter<>(VDVideoSelfieConfiguration.NULL, 0, 5L, new BasicDerAdapter.Codec<Unit>() { // from class: okhttp3.tls.internal.der.Adapters$NULL$1
            @Override // okhttp3.tls.internal.der.BasicDerAdapter.Codec
            @Nullable
            public Unit decode(@NotNull DerReader reader) {
                Intrinsics.checkNotNullParameter(reader, "reader");
                return null;
            }

            @Override // okhttp3.tls.internal.der.BasicDerAdapter.Codec
            public void encode(@NotNull DerWriter writer, @Nullable Unit value) {
                Intrinsics.checkNotNullParameter(writer, "writer");
            }
        }, false, null, false, 112, null);
        NULL = basicDerAdapter5;
        BasicDerAdapter<String> basicDerAdapter6 = new BasicDerAdapter<>("OBJECT IDENTIFIER", 0, 6L, new BasicDerAdapter.Codec<String>() { // from class: okhttp3.tls.internal.der.Adapters$OBJECT_IDENTIFIER$1
            @Override // okhttp3.tls.internal.der.BasicDerAdapter.Codec
            @NotNull
            public String decode(@NotNull DerReader reader) {
                Intrinsics.checkNotNullParameter(reader, "reader");
                return reader.readObjectIdentifier();
            }

            @Override // okhttp3.tls.internal.der.BasicDerAdapter.Codec
            public void encode(@NotNull DerWriter writer, @NotNull String value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeObjectIdentifier(value);
            }
        }, false, null, false, 112, null);
        OBJECT_IDENTIFIER = basicDerAdapter6;
        BasicDerAdapter<String> basicDerAdapter7 = new BasicDerAdapter<>("UTF8", 0, 12L, new BasicDerAdapter.Codec<String>() { // from class: okhttp3.tls.internal.der.Adapters$UTF8_STRING$1
            @Override // okhttp3.tls.internal.der.BasicDerAdapter.Codec
            @NotNull
            public String decode(@NotNull DerReader reader) {
                Intrinsics.checkNotNullParameter(reader, "reader");
                return reader.readUtf8String();
            }

            @Override // okhttp3.tls.internal.der.BasicDerAdapter.Codec
            public void encode(@NotNull DerWriter writer, @NotNull String value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeUtf8(value);
            }
        }, false, null, false, 112, null);
        UTF8_STRING = basicDerAdapter7;
        BasicDerAdapter<String> basicDerAdapter8 = new BasicDerAdapter<>("PRINTABLE STRING", 0, 19L, new BasicDerAdapter.Codec<String>() { // from class: okhttp3.tls.internal.der.Adapters$PRINTABLE_STRING$1
            @Override // okhttp3.tls.internal.der.BasicDerAdapter.Codec
            @NotNull
            public String decode(@NotNull DerReader reader) {
                Intrinsics.checkNotNullParameter(reader, "reader");
                return reader.readUtf8String();
            }

            @Override // okhttp3.tls.internal.der.BasicDerAdapter.Codec
            public void encode(@NotNull DerWriter writer, @NotNull String value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeUtf8(value);
            }
        }, false, null, false, 112, null);
        PRINTABLE_STRING = basicDerAdapter8;
        BasicDerAdapter<String> basicDerAdapter9 = new BasicDerAdapter<>("IA5 STRING", 0, 22L, new BasicDerAdapter.Codec<String>() { // from class: okhttp3.tls.internal.der.Adapters$IA5_STRING$1
            @Override // okhttp3.tls.internal.der.BasicDerAdapter.Codec
            @NotNull
            public String decode(@NotNull DerReader reader) {
                Intrinsics.checkNotNullParameter(reader, "reader");
                return reader.readUtf8String();
            }

            @Override // okhttp3.tls.internal.der.BasicDerAdapter.Codec
            public void encode(@NotNull DerWriter writer, @NotNull String value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeUtf8(value);
            }
        }, false, null, false, 112, null);
        IA5_STRING = basicDerAdapter9;
        BasicDerAdapter<Long> basicDerAdapter10 = new BasicDerAdapter<>("UTC TIME", 0, 23L, new BasicDerAdapter.Codec<Long>() { // from class: okhttp3.tls.internal.der.Adapters$UTC_TIME$1
            @Override // okhttp3.tls.internal.der.BasicDerAdapter.Codec
            public /* bridge */ /* synthetic */ void encode(DerWriter derWriter, Long l6) throws IOException {
                encode(derWriter, l6.longValue());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // okhttp3.tls.internal.der.BasicDerAdapter.Codec
            @NotNull
            public Long decode(@NotNull DerReader reader) throws ProtocolException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                return Long.valueOf(Adapters.INSTANCE.parseUtcTime$okhttp_tls(reader.readUtf8String()));
            }

            public void encode(@NotNull DerWriter writer, long value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                writer.writeUtf8(Adapters.INSTANCE.formatUtcTime$okhttp_tls(value));
            }
        }, false, null, false, 112, null);
        UTC_TIME = basicDerAdapter10;
        BasicDerAdapter<Long> basicDerAdapter11 = new BasicDerAdapter<>("GENERALIZED TIME", 0, 24L, new BasicDerAdapter.Codec<Long>() { // from class: okhttp3.tls.internal.der.Adapters$GENERALIZED_TIME$1
            @Override // okhttp3.tls.internal.der.BasicDerAdapter.Codec
            public /* bridge */ /* synthetic */ void encode(DerWriter derWriter, Long l6) throws IOException {
                encode(derWriter, l6.longValue());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // okhttp3.tls.internal.der.BasicDerAdapter.Codec
            @NotNull
            public Long decode(@NotNull DerReader reader) throws ProtocolException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                return Long.valueOf(Adapters.INSTANCE.parseGeneralizedTime$okhttp_tls(reader.readUtf8String()));
            }

            public void encode(@NotNull DerWriter writer, long value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                writer.writeUtf8(Adapters.INSTANCE.formatGeneralizedTime$okhttp_tls(value));
            }
        }, false, null, false, 112, null);
        GENERALIZED_TIME = basicDerAdapter11;
        ?? r10 = new DerAdapter<AnyValue>() { // from class: okhttp3.tls.internal.der.Adapters$ANY_VALUE$1

            /* JADX INFO: compiled from: Adapters.kt */
            public static final class a extends Lambda implements Function1<BufferedSink, Unit> {

                /* JADX INFO: renamed from: p0, reason: collision with root package name */
                public final /* synthetic */ DerWriter f86202p0;

                /* JADX INFO: renamed from: q0, reason: collision with root package name */
                public final /* synthetic */ AnyValue f86203q0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public a(DerWriter derWriter, AnyValue anyValue) {
                    super(1);
                    this.f86202p0 = derWriter;
                    this.f86203q0 = anyValue;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Unit invoke(BufferedSink bufferedSink) throws IOException {
                    BufferedSink it = bufferedSink;
                    Intrinsics.checkNotNullParameter(it, "it");
                    AnyValue anyValue = this.f86203q0;
                    ByteString bytes = anyValue.getBytes();
                    DerWriter derWriter = this.f86202p0;
                    derWriter.writeOctetString(bytes);
                    derWriter.setConstructed(anyValue.getConstructed());
                    return Unit.INSTANCE;
                }
            }

            @Override // okhttp3.tls.internal.der.DerAdapter
            @NotNull
            public BasicDerAdapter<List<AnyValue>> asSequenceOf(@NotNull String name, int i10, long j10) {
                Intrinsics.checkNotNullParameter(name, "name");
                return DerAdapter.DefaultImpls.asSequenceOf(this, name, i10, j10);
            }

            @Override // okhttp3.tls.internal.der.DerAdapter
            @NotNull
            public BasicDerAdapter<List<AnyValue>> asSetOf() {
                return DerAdapter.DefaultImpls.asSetOf(this);
            }

            @Override // okhttp3.tls.internal.der.DerAdapter
            public boolean matches(@NotNull DerHeader header) {
                Intrinsics.checkNotNullParameter(header, "header");
                return true;
            }

            @Override // okhttp3.tls.internal.der.DerAdapter
            @NotNull
            public BasicDerAdapter<AnyValue> withExplicitBox(int i10, long j10, @Nullable Boolean bool) {
                return DerAdapter.DefaultImpls.withExplicitBox(this, i10, j10, bool);
            }

            @Override // okhttp3.tls.internal.der.DerAdapter
            @NotNull
            public ByteString toDer(@NotNull AnyValue value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return DerAdapter.DefaultImpls.toDer(this, value);
            }

            @Override // okhttp3.tls.internal.der.DerAdapter
            @NotNull
            public AnyValue fromDer(@NotNull ByteString byteString) {
                Intrinsics.checkNotNullParameter(byteString, "byteString");
                return (AnyValue) DerAdapter.DefaultImpls.fromDer(this, byteString);
            }

            @Override // okhttp3.tls.internal.der.DerAdapter
            @NotNull
            public AnyValue fromDer(@NotNull DerReader reader) throws ProtocolException {
                long length;
                Intrinsics.checkNotNullParameter(reader, "reader");
                if (reader.hasNext()) {
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
                    if (j10 == -1 || length <= j10) {
                        reader.f86287c = length;
                        reader.f86290f = derHeader.getConstructed();
                        reader.f86289e.add("ANY");
                        try {
                            return new AnyValue(derHeader.getTagClass(), derHeader.getTag(), derHeader.getConstructed(), derHeader.getLength(), reader.readUnknown());
                        } finally {
                            reader.f86291g = null;
                            reader.f86287c = j10;
                            reader.f86290f = z10;
                            reader.f86289e.remove(reader.f86289e.size() - 1);
                        }
                    }
                    throw new ProtocolException("enclosed object too large");
                }
                throw new ProtocolException("expected a value");
            }

            @Override // okhttp3.tls.internal.der.DerAdapter
            public void toDer(@NotNull DerWriter writer, @NotNull AnyValue value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.write("ANY", value.getTagClass(), value.getTag(), new a(writer, value));
            }
        };
        m = r10;
        f86201n = CollectionsKt__CollectionsKt.listOf((Object[]) new Pair[]{TuplesKt.to(Reflection.getOrCreateKotlinClass(Boolean.TYPE), basicDerAdapter), TuplesKt.to(Reflection.getOrCreateKotlinClass(BigInteger.class), basicDerAdapter2), TuplesKt.to(Reflection.getOrCreateKotlinClass(BitString.class), basicDerAdapter3), TuplesKt.to(Reflection.getOrCreateKotlinClass(ByteString.class), basicDerAdapter4), TuplesKt.to(Reflection.getOrCreateKotlinClass(Unit.class), basicDerAdapter5), TuplesKt.to(Reflection.getOrCreateKotlinClass(Void.class), basicDerAdapter6), TuplesKt.to(Reflection.getOrCreateKotlinClass(Void.class), basicDerAdapter7), TuplesKt.to(Reflection.getOrCreateKotlinClass(String.class), basicDerAdapter8), TuplesKt.to(Reflection.getOrCreateKotlinClass(Void.class), basicDerAdapter9), TuplesKt.to(Reflection.getOrCreateKotlinClass(Void.class), basicDerAdapter10), TuplesKt.to(Reflection.getOrCreateKotlinClass(Long.TYPE), basicDerAdapter11), TuplesKt.to(Reflection.getOrCreateKotlinClass(AnyValue.class), r10)});
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DerAdapter any$default(Adapters adapters, Pair[] pairArr, boolean z10, Object obj, int i10, Object obj2) {
        if ((i10 & 1) != 0) {
            Object[] array = f86201n.toArray(new Pair[0]);
            if (array == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
            }
            pairArr = (Pair[]) array;
        }
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        if ((i10 & 4) != 0) {
            obj = null;
        }
        return adapters.any(pairArr, z10, obj);
    }

    @NotNull
    public final DerAdapter<Object> any(@NotNull final Pair<? extends KClass<?>, ? extends DerAdapter<?>>[] choices, final boolean isOptional, @Nullable final Object optionalValue) {
        Intrinsics.checkNotNullParameter(choices, "choices");
        return new DerAdapter<Object>() { // from class: okhttp3.tls.internal.der.Adapters.any.1
            @Override // okhttp3.tls.internal.der.DerAdapter
            @NotNull
            public BasicDerAdapter<List<Object>> asSequenceOf(@NotNull String name, int i10, long j10) {
                Intrinsics.checkNotNullParameter(name, "name");
                return DerAdapter.DefaultImpls.asSequenceOf(this, name, i10, j10);
            }

            @Override // okhttp3.tls.internal.der.DerAdapter
            @NotNull
            public BasicDerAdapter<List<Object>> asSetOf() {
                return DerAdapter.DefaultImpls.asSetOf(this);
            }

            @Override // okhttp3.tls.internal.der.DerAdapter
            @Nullable
            public Object fromDer(@NotNull ByteString byteString) {
                Intrinsics.checkNotNullParameter(byteString, "byteString");
                return DerAdapter.DefaultImpls.fromDer(this, byteString);
            }

            @Override // okhttp3.tls.internal.der.DerAdapter
            public boolean matches(@NotNull DerHeader header) {
                Intrinsics.checkNotNullParameter(header, "header");
                return true;
            }

            @Override // okhttp3.tls.internal.der.DerAdapter
            @NotNull
            public ByteString toDer(@Nullable Object obj) {
                return DerAdapter.DefaultImpls.toDer(this, obj);
            }

            @Override // okhttp3.tls.internal.der.DerAdapter
            @NotNull
            public BasicDerAdapter<Object> withExplicitBox(int i10, long j10, @Nullable Boolean bool) {
                return DerAdapter.DefaultImpls.withExplicitBox(this, i10, j10, bool);
            }

            @Override // okhttp3.tls.internal.der.DerAdapter
            @Nullable
            public Object fromDer(@NotNull DerReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                if (isOptional && !reader.hasNext()) {
                    return optionalValue;
                }
                DerHeader derHeaderPeekHeader = reader.peekHeader();
                if (derHeaderPeekHeader == null) {
                    throw new ProtocolException("expected a value at " + reader);
                }
                for (Pair pair : choices) {
                    DerAdapter derAdapter = (DerAdapter) pair.component2();
                    if (derAdapter.matches(derHeaderPeekHeader)) {
                        return derAdapter.fromDer(reader);
                    }
                }
                throw new ProtocolException("expected any but was " + derHeaderPeekHeader + " at " + reader);
            }

            @Override // okhttp3.tls.internal.der.DerAdapter
            public void toDer(@NotNull DerWriter writer, @Nullable Object value) {
                Intrinsics.checkNotNullParameter(writer, "writer");
                if (isOptional && Intrinsics.areEqual(value, optionalValue)) {
                    return;
                }
                for (Pair pair : choices) {
                    KClass kClass = (KClass) pair.component1();
                    DerAdapter derAdapter = (DerAdapter) pair.component2();
                    if (kClass.isInstance(value) || (value == null && Intrinsics.areEqual(kClass, Reflection.getOrCreateKotlinClass(Unit.class)))) {
                        if (derAdapter == null) {
                            throw new NullPointerException("null cannot be cast to non-null type okhttp3.tls.internal.der.DerAdapter<kotlin.Any?>");
                        }
                        derAdapter.toDer(writer, value);
                        return;
                    }
                }
            }
        };
    }

    @NotNull
    public final DerAdapter<Pair<DerAdapter<?>, Object>> choice(@NotNull final DerAdapter<?>... choices) {
        Intrinsics.checkNotNullParameter(choices, "choices");
        return new DerAdapter<Pair<? extends DerAdapter<?>, ? extends Object>>() { // from class: okhttp3.tls.internal.der.Adapters.choice.1
            @Override // okhttp3.tls.internal.der.DerAdapter
            @NotNull
            public BasicDerAdapter<List<Pair<? extends DerAdapter<?>, ? extends Object>>> asSequenceOf(@NotNull String name, int i10, long j10) {
                Intrinsics.checkNotNullParameter(name, "name");
                return DerAdapter.DefaultImpls.asSequenceOf(this, name, i10, j10);
            }

            @Override // okhttp3.tls.internal.der.DerAdapter
            @NotNull
            public BasicDerAdapter<List<Pair<? extends DerAdapter<?>, ? extends Object>>> asSetOf() {
                return DerAdapter.DefaultImpls.asSetOf(this);
            }

            @Override // okhttp3.tls.internal.der.DerAdapter
            public boolean matches(@NotNull DerHeader header) {
                Intrinsics.checkNotNullParameter(header, "header");
                return true;
            }

            @NotNull
            public String toString() {
                return ArraysKt___ArraysKt.joinToString$default(choices, " OR ", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 62, (Object) null);
            }

            @Override // okhttp3.tls.internal.der.DerAdapter
            @NotNull
            public BasicDerAdapter<Pair<? extends DerAdapter<?>, ? extends Object>> withExplicitBox(int i10, long j10, @Nullable Boolean bool) {
                return DerAdapter.DefaultImpls.withExplicitBox(this, i10, j10, bool);
            }

            @Override // okhttp3.tls.internal.der.DerAdapter
            @NotNull
            public ByteString toDer(@NotNull Pair<? extends DerAdapter<?>, ? extends Object> value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return DerAdapter.DefaultImpls.toDer(this, value);
            }

            @Override // okhttp3.tls.internal.der.DerAdapter
            @NotNull
            public Pair<? extends DerAdapter<?>, ? extends Object> fromDer(@NotNull ByteString byteString) {
                Intrinsics.checkNotNullParameter(byteString, "byteString");
                return (Pair) DerAdapter.DefaultImpls.fromDer(this, byteString);
            }

            @Override // okhttp3.tls.internal.der.DerAdapter
            @NotNull
            public Pair<? extends DerAdapter<?>, ? extends Object> fromDer(@NotNull DerReader reader) throws IOException {
                DerAdapter derAdapter;
                Intrinsics.checkNotNullParameter(reader, "reader");
                DerHeader derHeaderPeekHeader = reader.peekHeader();
                if (derHeaderPeekHeader != null) {
                    DerAdapter[] derAdapterArr = choices;
                    int length = derAdapterArr.length;
                    int i10 = 0;
                    while (true) {
                        if (i10 >= length) {
                            derAdapter = null;
                            break;
                        }
                        derAdapter = derAdapterArr[i10];
                        if (derAdapter.matches(derHeaderPeekHeader)) {
                            break;
                        }
                        i10++;
                    }
                    if (derAdapter != null) {
                        return TuplesKt.to(derAdapter, derAdapter.fromDer(reader));
                    }
                    throw new ProtocolException("expected a matching choice but was " + derHeaderPeekHeader + " at " + reader);
                }
                throw new ProtocolException("expected a value at " + reader);
            }

            @Override // okhttp3.tls.internal.der.DerAdapter
            public void toDer(@NotNull DerWriter writer, @NotNull Pair<? extends DerAdapter<?>, ? extends Object> value) {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                DerAdapter<?> derAdapterComponent1 = value.component1();
                Object objComponent2 = value.component2();
                if (derAdapterComponent1 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type okhttp3.tls.internal.der.DerAdapter<kotlin.Any?>");
                }
                derAdapterComponent1.toDer(writer, objComponent2);
            }
        };
    }

    @NotNull
    public final String formatGeneralizedTime$okhttp_tls(long date) {
        TimeZone timeZone = TimeZone.getTimeZone(Time.GMT);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmss'Z'");
        simpleDateFormat.setTimeZone(timeZone);
        String str = simpleDateFormat.format(Long.valueOf(date));
        Intrinsics.checkNotNullExpressionValue(str, "dateFormat.format(date)");
        return str;
    }

    @NotNull
    public final String formatUtcTime$okhttp_tls(long date) {
        TimeZone timeZone = TimeZone.getTimeZone(Time.GMT);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyMMddHHmmss'Z'");
        simpleDateFormat.setTimeZone(timeZone);
        simpleDateFormat.set2DigitYearStart(new Date(-631152000000L));
        String str = simpleDateFormat.format(Long.valueOf(date));
        Intrinsics.checkNotNullExpressionValue(str, "dateFormat.format(date)");
        return str;
    }

    @NotNull
    public final DerAdapter<AnyValue> getANY_VALUE() {
        return m;
    }

    @NotNull
    public final BasicDerAdapter<BitString> getBIT_STRING() {
        return BIT_STRING;
    }

    @NotNull
    public final BasicDerAdapter<Boolean> getBOOLEAN() {
        return BOOLEAN;
    }

    @NotNull
    public final BasicDerAdapter<Long> getGENERALIZED_TIME() {
        return GENERALIZED_TIME;
    }

    @NotNull
    public final BasicDerAdapter<String> getIA5_STRING() {
        return IA5_STRING;
    }

    @NotNull
    public final BasicDerAdapter<BigInteger> getINTEGER_AS_BIG_INTEGER() {
        return INTEGER_AS_BIG_INTEGER;
    }

    @NotNull
    public final BasicDerAdapter<Long> getINTEGER_AS_LONG() {
        return INTEGER_AS_LONG;
    }

    @NotNull
    public final BasicDerAdapter<Unit> getNULL() {
        return NULL;
    }

    @NotNull
    public final BasicDerAdapter<String> getOBJECT_IDENTIFIER() {
        return OBJECT_IDENTIFIER;
    }

    @NotNull
    public final BasicDerAdapter<ByteString> getOCTET_STRING() {
        return OCTET_STRING;
    }

    @NotNull
    public final BasicDerAdapter<String> getPRINTABLE_STRING() {
        return PRINTABLE_STRING;
    }

    @NotNull
    public final BasicDerAdapter<Long> getUTC_TIME() {
        return UTC_TIME;
    }

    @NotNull
    public final BasicDerAdapter<String> getUTF8_STRING() {
        return UTF8_STRING;
    }

    public final long parseGeneralizedTime$okhttp_tls(@NotNull String string) throws ProtocolException {
        Intrinsics.checkNotNullParameter(string, "string");
        TimeZone timeZone = TimeZone.getTimeZone(Time.GMT);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmss'Z'");
        simpleDateFormat.setTimeZone(timeZone);
        try {
            Date parsed = simpleDateFormat.parse(string);
            Intrinsics.checkNotNullExpressionValue(parsed, "parsed");
            return parsed.getTime();
        } catch (ParseException unused) {
            throw new ProtocolException(f.d("Failed to parse GeneralizedTime ", string));
        }
    }

    public final long parseUtcTime$okhttp_tls(@NotNull String string) throws ProtocolException {
        Intrinsics.checkNotNullParameter(string, "string");
        TimeZone timeZone = TimeZone.getTimeZone(Time.GMT);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyMMddHHmmss'Z'");
        simpleDateFormat.setTimeZone(timeZone);
        simpleDateFormat.set2DigitYearStart(new Date(-631152000000L));
        try {
            Date parsed = simpleDateFormat.parse(string);
            Intrinsics.checkNotNullExpressionValue(parsed, "parsed");
            return parsed.getTime();
        } catch (ParseException unused) {
            throw new ProtocolException(f.d("Failed to parse UTCTime ", string));
        }
    }

    @NotNull
    public final <T> BasicDerAdapter<T> sequence(@NotNull String name, @NotNull final DerAdapter<?>[] members, @NotNull final Function1<? super T, ? extends List<?>> decompose, @NotNull final Function1<? super List<?>, ? extends T> construct) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(members, "members");
        Intrinsics.checkNotNullParameter(decompose, "decompose");
        Intrinsics.checkNotNullParameter(construct, "construct");
        return new BasicDerAdapter<>(name, 0, 16L, new BasicDerAdapter.Codec<T>() { // from class: okhttp3.tls.internal.der.Adapters$sequence$codec$1

            /* JADX INFO: compiled from: Adapters.kt */
            public static final class a extends Lambda implements Function0<T> {

                /* JADX INFO: renamed from: q0, reason: collision with root package name */
                public final /* synthetic */ DerReader f86212q0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public a(DerReader derReader) {
                    super(0);
                    this.f86212q0 = derReader;
                }

                @Override // kotlin.jvm.functions.Function0
                public final T invoke() throws ProtocolException {
                    Adapters$sequence$codec$1 adapters$sequence$codec$1;
                    DerReader derReader;
                    ArrayList arrayList = new ArrayList();
                    while (true) {
                        int size = arrayList.size();
                        adapters$sequence$codec$1 = Adapters$sequence$codec$1.this;
                        DerAdapter[] derAdapterArr = members;
                        int length = derAdapterArr.length;
                        derReader = this.f86212q0;
                        if (size >= length) {
                            break;
                        }
                        arrayList.add(derAdapterArr[arrayList.size()].fromDer(derReader));
                    }
                    if (!derReader.hasNext()) {
                        return (T) construct.invoke(arrayList);
                    }
                    throw new ProtocolException("unexpected " + derReader.peekHeader() + " at " + derReader);
                }
            }

            /* JADX INFO: compiled from: Adapters.kt */
            public static final class b extends Lambda implements Function0<Unit> {

                /* JADX INFO: renamed from: q0, reason: collision with root package name */
                public final /* synthetic */ List f86214q0;

                /* JADX INFO: renamed from: r0, reason: collision with root package name */
                public final /* synthetic */ DerWriter f86215r0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public b(List list, DerWriter derWriter) {
                    super(0);
                    this.f86214q0 = list;
                    this.f86215r0 = derWriter;
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // kotlin.jvm.functions.Function0
                public final Unit invoke() {
                    List list = this.f86214q0;
                    int size = list.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        CertificateAdapters$time$1 certificateAdapters$time$1 = members[i10];
                        if (certificateAdapters$time$1 == 0) {
                            throw new NullPointerException("null cannot be cast to non-null type okhttp3.tls.internal.der.DerAdapter<kotlin.Any?>");
                        }
                        certificateAdapters$time$1.toDer(this.f86215r0, list.get(i10));
                    }
                    return Unit.INSTANCE;
                }
            }

            @Override // okhttp3.tls.internal.der.BasicDerAdapter.Codec
            public T decode(@NotNull DerReader reader) {
                Intrinsics.checkNotNullParameter(reader, "reader");
                return (T) reader.withTypeHint(new a(reader));
            }

            @Override // okhttp3.tls.internal.der.BasicDerAdapter.Codec
            public void encode(@NotNull DerWriter writer, T value) {
                Intrinsics.checkNotNullParameter(writer, "writer");
                writer.withTypeHint(new b((List) decompose.invoke(value), writer));
            }
        }, false, null, false, 112, null);
    }

    @NotNull
    public final DerAdapter<Object> usingTypeHint(@NotNull final Function1<Object, ? extends DerAdapter<?>> chooser) {
        Intrinsics.checkNotNullParameter(chooser, "chooser");
        return new DerAdapter<Object>() { // from class: okhttp3.tls.internal.der.Adapters.usingTypeHint.1
            @Override // okhttp3.tls.internal.der.DerAdapter
            @NotNull
            public BasicDerAdapter<List<Object>> asSequenceOf(@NotNull String name, int i10, long j10) {
                Intrinsics.checkNotNullParameter(name, "name");
                return DerAdapter.DefaultImpls.asSequenceOf(this, name, i10, j10);
            }

            @Override // okhttp3.tls.internal.der.DerAdapter
            @NotNull
            public BasicDerAdapter<List<Object>> asSetOf() {
                return DerAdapter.DefaultImpls.asSetOf(this);
            }

            @Override // okhttp3.tls.internal.der.DerAdapter
            @Nullable
            public Object fromDer(@NotNull ByteString byteString) {
                Intrinsics.checkNotNullParameter(byteString, "byteString");
                return DerAdapter.DefaultImpls.fromDer(this, byteString);
            }

            @Override // okhttp3.tls.internal.der.DerAdapter
            public boolean matches(@NotNull DerHeader header) {
                Intrinsics.checkNotNullParameter(header, "header");
                return true;
            }

            @Override // okhttp3.tls.internal.der.DerAdapter
            @NotNull
            public ByteString toDer(@Nullable Object obj) {
                return DerAdapter.DefaultImpls.toDer(this, obj);
            }

            @Override // okhttp3.tls.internal.der.DerAdapter
            @NotNull
            public BasicDerAdapter<Object> withExplicitBox(int i10, long j10, @Nullable Boolean bool) {
                return DerAdapter.DefaultImpls.withExplicitBox(this, i10, j10, bool);
            }

            @Override // okhttp3.tls.internal.der.DerAdapter
            @Nullable
            public Object fromDer(@NotNull DerReader reader) {
                Intrinsics.checkNotNullParameter(reader, "reader");
                DerAdapter derAdapter = (DerAdapter) chooser.invoke(reader.getTypeHint());
                return derAdapter != null ? derAdapter.fromDer(reader) : reader.readUnknown();
            }

            @Override // okhttp3.tls.internal.der.DerAdapter
            public void toDer(@NotNull DerWriter writer, @Nullable Object value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                DerAdapter derAdapter = (DerAdapter) chooser.invoke(writer.getTypeHint());
                if (derAdapter != null) {
                    derAdapter.toDer(writer, value);
                } else {
                    if (value == null) {
                        throw new NullPointerException("null cannot be cast to non-null type okio.ByteString");
                    }
                    writer.writeOctetString((ByteString) value);
                }
            }
        };
    }
}
