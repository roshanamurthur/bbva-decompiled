package okhttp3.internal;

import androidx.camera.camera2.internal.compat.u;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.exifinterface.media.ExifInterface;
import bk.q;
import com.bbva.ethermobilesdk.deviceinfo.component.Time;
import com.bbva.glomohybrid.base.deeplink.extensions.DeepLinkExtensionsKt;
import com.dasnano.vdphotoselfiecapture.fragments.b;
import com.mastercard.sonic.androidsvg.SvgConstantsKt;
import com.noknok.android.client.metrics.Tabulator;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.reflect.Field;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketAddress;
import java.net.SocketTimeoutException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.io.CloseableKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.ArrayIteratorKt;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.ranges.IntRange;
import kotlin.ranges.c;
import kotlin.text.Charsets;
import kotlin.text.Regex;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.l;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import mx.openpay.library.domain.util.Constant;
import okhttp3.EventListener;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.internal.Util;
import okhttp3.internal.http2.Header;
import okhttp3.internal.io.FileSystem;
import okio.Buffer;
import okio.BufferedSink;
import okio.BufferedSource;
import okio.ByteString;
import okio.Options;
import okio.Sink;
import okio.Source;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Util.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000¤\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\f\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0010\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u001a\u001e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0000\u001a\u0016\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b\u001a;\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\f*\b\u0012\u0004\u0012\u00020\u00060\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\f2\u000e\u0010\u000f\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00060\u000e¢\u0006\u0004\b\u0010\u0010\u0011\u001a7\u0010\u0012\u001a\u00020\b*\b\u0012\u0004\u0012\u00020\u00060\f2\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\f2\u000e\u0010\u000f\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00060\u000e¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u0014\u0010\u0016\u001a\u00020\u0006*\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\b\u001a-\u0010\u0019\u001a\u00020\u0018*\b\u0012\u0004\u0012\u00020\u00060\f2\u0006\u0010\u0017\u001a\u00020\u00062\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\u000e¢\u0006\u0004\b\u0019\u0010\u001a\u001a%\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00060\f*\b\u0012\u0004\u0012\u00020\u00060\f2\u0006\u0010\u0017\u001a\u00020\u0006¢\u0006\u0004\b\u001b\u0010\u001c\u001a\u001e\u0010\u001f\u001a\u00020\u0018*\u00020\u00062\b\b\u0002\u0010\u001d\u001a\u00020\u00182\b\b\u0002\u0010\u001e\u001a\u00020\u0018\u001a\u001e\u0010 \u001a\u00020\u0018*\u00020\u00062\b\b\u0002\u0010\u001d\u001a\u00020\u00182\b\b\u0002\u0010\u001e\u001a\u00020\u0018\u001a\u001e\u0010!\u001a\u00020\u0006*\u00020\u00062\b\b\u0002\u0010\u001d\u001a\u00020\u00182\b\b\u0002\u0010\u001e\u001a\u00020\u0018\u001a&\u0010#\u001a\u00020\u0018*\u00020\u00062\u0006\u0010\"\u001a\u00020\u00062\b\b\u0002\u0010\u001d\u001a\u00020\u00182\b\b\u0002\u0010\u001e\u001a\u00020\u0018\u001a&\u0010#\u001a\u00020\u0018*\u00020\u00062\u0006\u0010%\u001a\u00020$2\b\b\u0002\u0010\u001d\u001a\u00020\u00182\b\b\u0002\u0010\u001e\u001a\u00020\u0018\u001a\n\u0010&\u001a\u00020\u0018*\u00020\u0006\u001a\n\u0010'\u001a\u00020\b*\u00020\u0006\u001a\u000e\u0010(\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006\u001a)\u0010)\u001a\u00020\u00062\u0006\u0010)\u001a\u00020\u00062\u0012\u0010+\u001a\n\u0012\u0006\b\u0001\u0012\u00020*0\f\"\u00020*¢\u0006\u0004\b)\u0010,\u001a\u0012\u00100\u001a\u00020.*\u00020-2\u0006\u0010/\u001a\u00020.\u001a \u00104\u001a\u00020\u00182\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u00101\u001a\u00020\u00002\b\u00103\u001a\u0004\u0018\u000102\u001a\n\u00105\u001a\u00020\u0018*\u00020$\u001a\u0010\u00109\u001a\u000208*\b\u0012\u0004\u0012\u00020706\u001a\u0010\u0010:\u001a\b\u0012\u0004\u0012\u00020706*\u000208\u001a\u0012\u0010;\u001a\u00020\b*\u00020\u00142\u0006\u0010\r\u001a\u00020\u0014\u001a\n\u0010>\u001a\u00020=*\u00020<\u001a\u0015\u0010A\u001a\u00020\u0018*\u00020?2\u0006\u0010@\u001a\u00020\u0018H\u0086\u0004\u001a\u0015\u0010A\u001a\u00020\u0018*\u00020B2\u0006\u0010@\u001a\u00020\u0018H\u0086\u0004\u001a\u0015\u0010A\u001a\u00020\u0000*\u00020\u00182\u0006\u0010@\u001a\u00020\u0000H\u0086\u0004\u001a\u0012\u0010E\u001a\u00020\u0004*\u00020C2\u0006\u0010D\u001a\u00020\u0018\u001a\n\u0010F\u001a\u00020\u0018*\u00020-\u001a\u001a\u0010I\u001a\u00020\b*\u00020G2\u0006\u00101\u001a\u00020\u00182\u0006\u0010H\u001a\u000202\u001a\u001a\u0010K\u001a\u00020\b*\u00020G2\u0006\u0010J\u001a\u00020\u00182\u0006\u0010H\u001a\u000202\u001a\n\u0010M\u001a\u00020\u0006*\u00020L\u001a\u0012\u0010O\u001a\u00020\b*\u00020L2\u0006\u0010N\u001a\u00020-\u001a\u001a\u0010R\u001a\u00020\u00042\f\u0010Q\u001a\b\u0012\u0004\u0012\u00020\u00040PH\u0086\bø\u0001\u0000\u001a\"\u0010S\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010Q\u001a\b\u0012\u0004\u0012\u00020\u00040PH\u0086\bø\u0001\u0000\u001a\u0012\u0010I\u001a\u00020\u0018*\u00020T2\u0006\u0010U\u001a\u00020?\u001a\u0014\u0010V\u001a\u00020\u0018*\u00020\u00062\b\b\u0002\u0010\u001d\u001a\u00020\u0018\u001a\n\u0010X\u001a\u00020\u0000*\u00020W\u001a\u0012\u0010Z\u001a\u00020\u0000*\u00020\u00062\u0006\u0010Y\u001a\u00020\u0000\u001a\u0014\u0010[\u001a\u00020\u0018*\u0004\u0018\u00010\u00062\u0006\u0010Y\u001a\u00020\u0018\u001a\u001c\u0010]\u001a\b\u0012\u0004\u0012\u00028\u000006\"\u0004\b\u0000\u0010\\*\b\u0012\u0004\u0012\u00028\u000006\u001a/\u0010_\u001a\b\u0012\u0004\u0012\u00028\u000006\"\u0004\b\u0000\u0010\\2\u0012\u0010^\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\f\"\u00028\u0000H\u0007¢\u0006\u0004\b_\u0010`\u001a.\u0010d\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010c\"\u0004\b\u0000\u0010a\"\u0004\b\u0001\u0010b*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010c\u001a\n\u0010f\u001a\u00020\u0004*\u00020e\u001a\n\u0010f\u001a\u00020\u0004*\u00020L\u001a\n\u0010f\u001a\u00020\u0004*\u00020g\u001a\u0012\u0010k\u001a\u00020\b*\u00020h2\u0006\u0010j\u001a\u00020i\u001a\n\u0010l\u001a\u00020\u0006*\u00020\u0000\u001a\n\u0010l\u001a\u00020\u0006*\u00020\u0018\u001a\r\u0010m\u001a\u00020\u0004*\u00020*H\u0086\b\u001a\r\u0010n\u001a\u00020\u0004*\u00020*H\u0086\b\u001a\r\u0010o\u001a\u00020\u0004*\u00020*H\u0086\b\u001a3\u0010t\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\\2\u0006\u0010p\u001a\u00020*2\f\u0010r\u001a\b\u0012\u0004\u0012\u00028\u00000q2\u0006\u0010s\u001a\u00020\u0006¢\u0006\u0004\bt\u0010u\u001a'\u0010y\u001a\u00020\u0004\"\u0004\b\u0000\u0010v*\b\u0012\u0004\u0012\u00028\u00000w2\u0006\u0010x\u001a\u00028\u0000H\u0000¢\u0006\u0004\by\u0010z\u001a\r\u0010{\u001a\u00020\u0004*\u00020*H\u0080\b\u001a\r\u0010|\u001a\u00020\u0004*\u00020*H\u0080\b\u001a\"\u0010\u0081\u0001\u001a\u00030\u0080\u0001*\u00060}j\u0002`~2\u0010\u0010\u007f\u001a\f\u0012\b\u0012\u00060}j\u0002`~06\u001a@\u0010\u0086\u0001\u001a\b\u0012\u0004\u0012\u00028\u000006\"\u0004\b\u0000\u0010\\*\t\u0012\u0004\u0012\u00028\u00000\u0082\u00012\u001a\u0010\u0085\u0001\u001a\u0015\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\b0\u0083\u0001¢\u0006\u0003\b\u0084\u0001H\u0086\bø\u0001\u0000\"\u0018\u0010\u0088\u0001\u001a\u00030\u0087\u00018\u0006X\u0087\u0004¢\u0006\b\n\u0006\b\u0088\u0001\u0010\u0089\u0001\"\u0017\u0010\u008a\u0001\u001a\u0002088\u0006X\u0087\u0004¢\u0006\b\n\u0006\b\u008a\u0001\u0010\u008b\u0001\"\u0018\u0010\u008d\u0001\u001a\u00030\u008c\u00018\u0006X\u0087\u0004¢\u0006\b\n\u0006\b\u008d\u0001\u0010\u008e\u0001\"\u0018\u0010\u0090\u0001\u001a\u00030\u008f\u00018\u0006X\u0087\u0004¢\u0006\b\n\u0006\b\u0090\u0001\u0010\u0091\u0001\"\u0018\u0010\u0093\u0001\u001a\u00030\u0092\u00018\u0006X\u0087\u0004¢\u0006\b\n\u0006\b\u0093\u0001\u0010\u0094\u0001\"\u0017\u0010\u0095\u0001\u001a\u00020\b8\u0000X\u0081\u0004¢\u0006\b\n\u0006\b\u0095\u0001\u0010\u0096\u0001\"\u0017\u0010\u0097\u0001\u001a\u00020\u00068\u0000X\u0081\u0004¢\u0006\b\n\u0006\b\u0097\u0001\u0010\u0098\u0001\"\u0017\u0010\u0099\u0001\u001a\u00020\u00068\u0006X\u0086T¢\u0006\b\n\u0006\b\u0099\u0001\u0010\u0098\u0001\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u009a\u0001"}, d2 = {"", "arrayLength", TypedValues.CycleType.S_WAVE_OFFSET, "count", "", "checkOffsetAndCount", "", "name", "", "daemon", "Ljava/util/concurrent/ThreadFactory;", "threadFactory", "", "other", "Ljava/util/Comparator;", "comparator", "intersect", "([Ljava/lang/String;[Ljava/lang/String;Ljava/util/Comparator;)[Ljava/lang/String;", "hasIntersection", "([Ljava/lang/String;[Ljava/lang/String;Ljava/util/Comparator;)Z", "Lokhttp3/HttpUrl;", "includeDefaultPort", "toHostHeader", "value", "", "indexOf", "([Ljava/lang/String;Ljava/lang/String;Ljava/util/Comparator;)I", "concat", "([Ljava/lang/String;Ljava/lang/String;)[Ljava/lang/String;", "startIndex", "endIndex", "indexOfFirstNonAsciiWhitespace", "indexOfLastNonAsciiWhitespace", "trimSubstring", "delimiters", "delimiterOffset", "", "delimiter", "indexOfControlOrNonAscii", "canParseAsIpAddress", "isSensitiveHeader", "format", "", "args", "(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;", "Lokio/BufferedSource;", "Ljava/nio/charset/Charset;", "default", "readBomAsCharset", TypedValues.TransitionType.S_DURATION, "Ljava/util/concurrent/TimeUnit;", Tabulator.KEY_UNIT, "checkDuration", "parseHexDigit", "", "Lokhttp3/internal/http2/Header;", "Lokhttp3/Headers;", "toHeaders", "toHeaderList", "canReuseConnectionFor", "Lokhttp3/EventListener;", "Lokhttp3/EventListener$Factory;", "asFactory", "", "mask", "and", "", "Lokio/BufferedSink;", "medium", "writeMedium", "readMedium", "Lokio/Source;", "timeUnit", "skipAll", "timeout", "discard", "Ljava/net/Socket;", "peerName", "source", "isHealthy", "Lkotlin/Function0;", "block", "ignoreIoExceptions", "threadName", "Lokio/Buffer;", "b", "indexOfNonWhitespace", "Lokhttp3/Response;", "headersContentLength", "defaultValue", "toLongOrDefault", "toNonNegativeInt", ExifInterface.GPS_DIRECTION_TRUE, "toImmutableList", "elements", "immutableListOf", "([Ljava/lang/Object;)Ljava/util/List;", "K", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "", "toImmutableMap", "Ljava/io/Closeable;", "closeQuietly", "Ljava/net/ServerSocket;", "Lokhttp3/internal/io/FileSystem;", "Ljava/io/File;", "file", "isCivilized", "toHexString", "wait", "notify", "notifyAll", "instance", "Ljava/lang/Class;", "fieldType", "fieldName", "readFieldOrNull", "(Ljava/lang/Object;Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Object;", ExifInterface.LONGITUDE_EAST, "", "element", "addIfAbsent", "(Ljava/util/List;Ljava/lang/Object;)V", "assertThreadHoldsLock", "assertThreadDoesntHoldLock", "Ljava/lang/Exception;", "Lkotlin/Exception;", "suppressed", "", "withSuppressed", "", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "predicate", "filterList", "", "EMPTY_BYTE_ARRAY", "[B", "EMPTY_HEADERS", "Lokhttp3/Headers;", "Lokhttp3/ResponseBody;", "EMPTY_RESPONSE", "Lokhttp3/ResponseBody;", "Lokhttp3/RequestBody;", "EMPTY_REQUEST", "Lokhttp3/RequestBody;", "Ljava/util/TimeZone;", "UTC", "Ljava/util/TimeZone;", "assertionsEnabled", "Z", "okHttpName", "Ljava/lang/String;", "userAgent", "okhttp"}, k = 2, mv = {1, 8, 0})
@JvmName(name = "Util")
@SourceDebugExtension({"SMAP\nUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Util.kt\nokhttp3/internal/Util\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,636:1\n37#2,2:637\n1627#3,6:639\n1#4:645\n1549#5:646\n1620#5,3:647\n*S KotlinDebug\n*F\n+ 1 Util.kt\nokhttp3/internal/Util\n*L\n127#1:637,2\n167#1:639,6\n300#1:646\n300#1:647,3\n*E\n"})
public final class Util {

    @JvmField
    @NotNull
    public static final byte[] EMPTY_BYTE_ARRAY;

    @JvmField
    @NotNull
    public static final Headers EMPTY_HEADERS = Headers.INSTANCE.of(new String[0]);

    @JvmField
    @NotNull
    public static final RequestBody EMPTY_REQUEST;

    @JvmField
    @NotNull
    public static final ResponseBody EMPTY_RESPONSE;

    @JvmField
    @NotNull
    public static final TimeZone UTC;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final Options f85684a;

    @JvmField
    public static final boolean assertionsEnabled;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final Regex f85685b;

    @JvmField
    @NotNull
    public static final String okHttpName;

    @NotNull
    public static final String userAgent = "okhttp/4.12.0";

    static {
        byte[] bArr = new byte[0];
        EMPTY_BYTE_ARRAY = bArr;
        EMPTY_RESPONSE = ResponseBody.Companion.create$default(ResponseBody.INSTANCE, bArr, (MediaType) null, 1, (Object) null);
        EMPTY_REQUEST = RequestBody.Companion.create$default(RequestBody.INSTANCE, bArr, (MediaType) null, 0, 0, 7, (Object) null);
        Options.Companion companion = Options.INSTANCE;
        ByteString.Companion companion2 = ByteString.INSTANCE;
        f85684a = companion.of(companion2.decodeHex("efbbbf"), companion2.decodeHex("feff"), companion2.decodeHex("fffe"), companion2.decodeHex("0000ffff"), companion2.decodeHex("ffff0000"));
        TimeZone timeZone = TimeZone.getTimeZone(Time.GMT);
        Intrinsics.checkNotNull(timeZone);
        UTC = timeZone;
        f85685b = new Regex("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");
        assertionsEnabled = false;
        String name = OkHttpClient.class.getName();
        Intrinsics.checkNotNullExpressionValue(name, "OkHttpClient::class.java.name");
        okHttpName = StringsKt__StringsKt.removeSuffix(StringsKt__StringsKt.removePrefix(name, (CharSequence) "okhttp3."), (CharSequence) "Client");
    }

    public static final <E> void addIfAbsent(@NotNull List<E> list, E e5) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        if (list.contains(e5)) {
            return;
        }
        list.add(e5);
    }

    public static final int and(byte b10, int i10) {
        return b10 & i10;
    }

    @NotNull
    public static final EventListener.Factory asFactory(@NotNull EventListener eventListener) {
        Intrinsics.checkNotNullParameter(eventListener, "<this>");
        return new b(eventListener);
    }

    public static final void assertThreadDoesntHoldLock(@NotNull Object obj) {
        Intrinsics.checkNotNullParameter(obj, "<this>");
        if (assertionsEnabled && Thread.holdsLock(obj)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + obj);
        }
    }

    public static final void assertThreadHoldsLock(@NotNull Object obj) {
        Intrinsics.checkNotNullParameter(obj, "<this>");
        if (!assertionsEnabled || Thread.holdsLock(obj)) {
            return;
        }
        throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + obj);
    }

    public static final boolean canParseAsIpAddress(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return f85685b.matches(str);
    }

    public static final boolean canReuseConnectionFor(@NotNull HttpUrl httpUrl, @NotNull HttpUrl other) {
        Intrinsics.checkNotNullParameter(httpUrl, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        return Intrinsics.areEqual(httpUrl.host(), other.host()) && httpUrl.port() == other.port() && Intrinsics.areEqual(httpUrl.scheme(), other.scheme());
    }

    public static final int checkDuration(@NotNull String name, long j10, @Nullable TimeUnit timeUnit) {
        Intrinsics.checkNotNullParameter(name, "name");
        if (j10 < 0) {
            throw new IllegalStateException(u.f(name, " < 0").toString());
        }
        if (timeUnit == null) {
            throw new IllegalStateException("unit == null".toString());
        }
        long millis = timeUnit.toMillis(j10);
        if (millis > 2147483647L) {
            throw new IllegalArgumentException(u.f(name, " too large.").toString());
        }
        if (millis != 0 || j10 <= 0) {
            return (int) millis;
        }
        throw new IllegalArgumentException(u.f(name, " too small.").toString());
    }

    public static final void checkOffsetAndCount(long j10, long j11, long j12) {
        if ((j11 | j12) < 0 || j11 > j10 || j10 - j11 < j12) {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    public static final void closeQuietly(@NotNull Closeable closeable) {
        Intrinsics.checkNotNullParameter(closeable, "<this>");
        try {
            closeable.close();
        } catch (RuntimeException e5) {
            throw e5;
        } catch (Exception unused) {
        }
    }

    @NotNull
    public static final String[] concat(@NotNull String[] strArr, @NotNull String value) {
        Intrinsics.checkNotNullParameter(strArr, "<this>");
        Intrinsics.checkNotNullParameter(value, "value");
        Object[] objArrCopyOf = Arrays.copyOf(strArr, strArr.length + 1);
        Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(this, newSize)");
        String[] strArr2 = (String[]) objArrCopyOf;
        strArr2[ArraysKt___ArraysKt.getLastIndex(strArr2)] = value;
        return strArr2;
    }

    public static final int delimiterOffset(@NotNull String str, @NotNull String delimiters, int i10, int i11) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(delimiters, "delimiters");
        while (i10 < i11) {
            if (StringsKt__StringsKt.contains$default((CharSequence) delimiters, str.charAt(i10), false, 2, (Object) null)) {
                return i10;
            }
            i10++;
        }
        return i11;
    }

    public static /* synthetic */ int delimiterOffset$default(String str, String str2, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = str.length();
        }
        return delimiterOffset(str, str2, i10, i11);
    }

    public static final boolean discard(@NotNull Source source, int i10, @NotNull TimeUnit timeUnit) {
        Intrinsics.checkNotNullParameter(source, "<this>");
        Intrinsics.checkNotNullParameter(timeUnit, "timeUnit");
        try {
            return skipAll(source, i10, timeUnit);
        } catch (IOException unused) {
            return false;
        }
    }

    @NotNull
    public static final <T> List<T> filterList(@NotNull Iterable<? extends T> iterable, @NotNull Function1<? super T, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        List<T> listEmptyList = CollectionsKt__CollectionsKt.emptyList();
        for (T t10 : iterable) {
            if (predicate.invoke(t10).booleanValue()) {
                if (listEmptyList.isEmpty()) {
                    listEmptyList = new ArrayList<>();
                }
                Intrinsics.checkNotNull(listEmptyList, "null cannot be cast to non-null type kotlin.collections.MutableList<T of okhttp3.internal.Util.filterList>");
                TypeIntrinsics.asMutableList(listEmptyList).add(t10);
            }
        }
        return listEmptyList;
    }

    @NotNull
    public static final String format(@NotNull String format, @NotNull Object... args) {
        Intrinsics.checkNotNullParameter(format, "format");
        Intrinsics.checkNotNullParameter(args, "args");
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        Locale locale = Locale.US;
        Object[] objArrCopyOf = Arrays.copyOf(args, args.length);
        String str = String.format(locale, format, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
        Intrinsics.checkNotNullExpressionValue(str, "format(locale, format, *args)");
        return str;
    }

    public static final boolean hasIntersection(@NotNull String[] strArr, @Nullable String[] strArr2, @NotNull Comparator<? super String> comparator) {
        Intrinsics.checkNotNullParameter(strArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (strArr.length != 0 && strArr2 != null && strArr2.length != 0) {
            for (String str : strArr) {
                Iterator it = ArrayIteratorKt.iterator(strArr2);
                while (it.hasNext()) {
                    if (comparator.compare(str, (String) it.next()) == 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static final long headersContentLength(@NotNull Response response) {
        Intrinsics.checkNotNullParameter(response, "<this>");
        String str = response.headers().get("Content-Length");
        if (str != null) {
            return toLongOrDefault(str, -1L);
        }
        return -1L;
    }

    public static final void ignoreIoExceptions(@NotNull Function0<Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        try {
            block.invoke();
        } catch (IOException unused) {
        }
    }

    @SafeVarargs
    @NotNull
    public static final <T> List<T> immutableListOf(@NotNull T... elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        Object[] objArr = (Object[]) elements.clone();
        List<T> listUnmodifiableList = Collections.unmodifiableList(CollectionsKt__CollectionsKt.listOf(Arrays.copyOf(objArr, objArr.length)));
        Intrinsics.checkNotNullExpressionValue(listUnmodifiableList, "unmodifiableList(listOf(*elements.clone()))");
        return listUnmodifiableList;
    }

    public static final int indexOf(@NotNull String[] strArr, @NotNull String value, @NotNull Comparator<String> comparator) {
        Intrinsics.checkNotNullParameter(strArr, "<this>");
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        int length = strArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (comparator.compare(strArr[i10], value) == 0) {
                return i10;
            }
        }
        return -1;
    }

    public static final int indexOfControlOrNonAscii(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        int length = str.length();
        for (int i10 = 0; i10 < length; i10++) {
            char cCharAt = str.charAt(i10);
            if (Intrinsics.compare((int) cCharAt, 31) <= 0 || Intrinsics.compare((int) cCharAt, 127) >= 0) {
                return i10;
            }
        }
        return -1;
    }

    public static final int indexOfFirstNonAsciiWhitespace(@NotNull String str, int i10, int i11) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        while (i10 < i11) {
            char cCharAt = str.charAt(i10);
            if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\f' && cCharAt != '\r' && cCharAt != ' ') {
                return i10;
            }
            i10++;
        }
        return i11;
    }

    public static /* synthetic */ int indexOfFirstNonAsciiWhitespace$default(String str, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = str.length();
        }
        return indexOfFirstNonAsciiWhitespace(str, i10, i11);
    }

    public static final int indexOfLastNonAsciiWhitespace(@NotNull String str, int i10, int i11) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        int i12 = i11 - 1;
        if (i10 <= i12) {
            while (true) {
                char cCharAt = str.charAt(i12);
                if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\f' && cCharAt != '\r' && cCharAt != ' ') {
                    return i12 + 1;
                }
                if (i12 != i10) {
                    i12--;
                }
            }
        }
        return i10;
    }

    public static /* synthetic */ int indexOfLastNonAsciiWhitespace$default(String str, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = str.length();
        }
        return indexOfLastNonAsciiWhitespace(str, i10, i11);
    }

    public static final int indexOfNonWhitespace(@NotNull String str, int i10) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        int length = str.length();
        while (i10 < length) {
            char cCharAt = str.charAt(i10);
            if (cCharAt != ' ' && cCharAt != '\t') {
                return i10;
            }
            i10++;
        }
        return str.length();
    }

    public static /* synthetic */ int indexOfNonWhitespace$default(String str, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = 0;
        }
        return indexOfNonWhitespace(str, i10);
    }

    @NotNull
    public static final String[] intersect(@NotNull String[] strArr, @NotNull String[] other, @NotNull Comparator<? super String> comparator) {
        Intrinsics.checkNotNullParameter(strArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            for (String str2 : other) {
                if (comparator.compare(str, str2) == 0) {
                    arrayList.add(str);
                    break;
                }
            }
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    public static final boolean isCivilized(@NotNull FileSystem fileSystem, @NotNull File file) throws IOException {
        Intrinsics.checkNotNullParameter(fileSystem, "<this>");
        Intrinsics.checkNotNullParameter(file, "file");
        Sink sink = fileSystem.sink(file);
        try {
            try {
                fileSystem.delete(file);
                CloseableKt.closeFinally(sink, null);
                return true;
            } catch (IOException unused) {
                Unit unit = Unit.INSTANCE;
                CloseableKt.closeFinally(sink, null);
                fileSystem.delete(file);
                return false;
            }
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                CloseableKt.closeFinally(sink, th2);
                throw th3;
            }
        }
    }

    public static final boolean isHealthy(@NotNull Socket socket, @NotNull BufferedSource source) {
        Intrinsics.checkNotNullParameter(socket, "<this>");
        Intrinsics.checkNotNullParameter(source, "source");
        try {
            int soTimeout = socket.getSoTimeout();
            try {
                socket.setSoTimeout(1);
                return !source.exhausted();
            } finally {
                socket.setSoTimeout(soTimeout);
            }
        } catch (SocketTimeoutException unused) {
            return true;
        } catch (IOException unused2) {
            return false;
        }
    }

    public static final boolean isSensitiveHeader(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return l.equals(name, "Authorization", true) || l.equals(name, "Cookie", true) || l.equals(name, "Proxy-Authorization", true) || l.equals(name, "Set-Cookie", true);
    }

    public static final void notify(@NotNull Object obj) {
        Intrinsics.checkNotNullParameter(obj, "<this>");
        obj.notify();
    }

    public static final void notifyAll(@NotNull Object obj) {
        Intrinsics.checkNotNullParameter(obj, "<this>");
        obj.notifyAll();
    }

    public static final int parseHexDigit(char c10) {
        if ('0' <= c10 && c10 < ':') {
            return c10 - '0';
        }
        if ('a' <= c10 && c10 < 'g') {
            return c10 - 'W';
        }
        if ('A' > c10 || c10 >= 'G') {
            return -1;
        }
        return c10 - '7';
    }

    @NotNull
    public static final String peerName(@NotNull Socket socket) {
        Intrinsics.checkNotNullParameter(socket, "<this>");
        SocketAddress remoteSocketAddress = socket.getRemoteSocketAddress();
        if (!(remoteSocketAddress instanceof InetSocketAddress)) {
            return remoteSocketAddress.toString();
        }
        String hostName = ((InetSocketAddress) remoteSocketAddress).getHostName();
        Intrinsics.checkNotNullExpressionValue(hostName, "address.hostName");
        return hostName;
    }

    @NotNull
    public static final Charset readBomAsCharset(@NotNull BufferedSource bufferedSource, @NotNull Charset charset) throws IOException {
        Intrinsics.checkNotNullParameter(bufferedSource, "<this>");
        Intrinsics.checkNotNullParameter(charset, "default");
        int iSelect = bufferedSource.select(f85684a);
        if (iSelect == -1) {
            return charset;
        }
        if (iSelect == 0) {
            Charset UTF_8 = StandardCharsets.UTF_8;
            Intrinsics.checkNotNullExpressionValue(UTF_8, "UTF_8");
            return UTF_8;
        }
        if (iSelect == 1) {
            Charset UTF_16BE = StandardCharsets.UTF_16BE;
            Intrinsics.checkNotNullExpressionValue(UTF_16BE, "UTF_16BE");
            return UTF_16BE;
        }
        if (iSelect == 2) {
            Charset UTF_16LE = StandardCharsets.UTF_16LE;
            Intrinsics.checkNotNullExpressionValue(UTF_16LE, "UTF_16LE");
            return UTF_16LE;
        }
        if (iSelect == 3) {
            return Charsets.INSTANCE.UTF32_BE();
        }
        if (iSelect == 4) {
            return Charsets.INSTANCE.UTF32_LE();
        }
        throw new AssertionError();
    }

    @Nullable
    public static final <T> T readFieldOrNull(@NotNull Object instance, @NotNull Class<T> fieldType, @NotNull String fieldName) throws IllegalAccessException {
        Object fieldOrNull;
        Intrinsics.checkNotNullParameter(instance, "instance");
        Intrinsics.checkNotNullParameter(fieldType, "fieldType");
        Intrinsics.checkNotNullParameter(fieldName, "fieldName");
        Class<?> superclass = instance.getClass();
        while (true) {
            T tCast = null;
            if (Intrinsics.areEqual(superclass, Object.class)) {
                if (Intrinsics.areEqual(fieldName, "delegate") || (fieldOrNull = readFieldOrNull(instance, Object.class, "delegate")) == null) {
                    return null;
                }
                return (T) readFieldOrNull(fieldOrNull, fieldType, fieldName);
            }
            try {
                Field declaredField = superclass.getDeclaredField(fieldName);
                declaredField.setAccessible(true);
                Object obj = declaredField.get(instance);
                if (fieldType.isInstance(obj)) {
                    tCast = fieldType.cast(obj);
                }
                return tCast;
            } catch (NoSuchFieldException unused) {
                superclass = superclass.getSuperclass();
                Intrinsics.checkNotNullExpressionValue(superclass, "c.superclass");
            }
        }
    }

    public static final int readMedium(@NotNull BufferedSource bufferedSource) throws IOException {
        Intrinsics.checkNotNullParameter(bufferedSource, "<this>");
        return and(bufferedSource.readByte(), 255) | (and(bufferedSource.readByte(), 255) << 16) | (and(bufferedSource.readByte(), 255) << 8);
    }

    public static final boolean skipAll(@NotNull Source source, int i10, @NotNull TimeUnit timeUnit) throws IOException {
        Intrinsics.checkNotNullParameter(source, "<this>");
        Intrinsics.checkNotNullParameter(timeUnit, "timeUnit");
        long jNanoTime = System.nanoTime();
        long jDeadlineNanoTime = source.getF86333p0().getF86438a() ? source.getF86333p0().deadlineNanoTime() - jNanoTime : Long.MAX_VALUE;
        source.getF86333p0().deadlineNanoTime(Math.min(jDeadlineNanoTime, timeUnit.toNanos(i10)) + jNanoTime);
        try {
            Buffer buffer = new Buffer();
            while (source.read(buffer, SvgConstantsKt.SPECIFIED_FONT_FAMILY) != -1) {
                buffer.clear();
            }
            if (jDeadlineNanoTime == Long.MAX_VALUE) {
                source.getF86333p0().clearDeadline();
            } else {
                source.getF86333p0().deadlineNanoTime(jNanoTime + jDeadlineNanoTime);
            }
            return true;
        } catch (InterruptedIOException unused) {
            if (jDeadlineNanoTime == Long.MAX_VALUE) {
                source.getF86333p0().clearDeadline();
            } else {
                source.getF86333p0().deadlineNanoTime(jNanoTime + jDeadlineNanoTime);
            }
            return false;
        } catch (Throwable th2) {
            if (jDeadlineNanoTime == Long.MAX_VALUE) {
                source.getF86333p0().clearDeadline();
            } else {
                source.getF86333p0().deadlineNanoTime(jNanoTime + jDeadlineNanoTime);
            }
            throw th2;
        }
    }

    @NotNull
    public static final ThreadFactory threadFactory(@NotNull final String name, final boolean z10) {
        Intrinsics.checkNotNullParameter(name, "name");
        return new ThreadFactory() { // from class: zl.a
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                byte[] bArr = Util.EMPTY_BYTE_ARRAY;
                String name2 = name;
                Intrinsics.checkNotNullParameter(name2, "$name");
                Thread thread = new Thread(runnable, name2);
                thread.setDaemon(z10);
                return thread;
            }
        };
    }

    public static final void threadName(@NotNull String name, @NotNull Function0<Unit> block) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(block, "block");
        Thread threadCurrentThread = Thread.currentThread();
        String name2 = threadCurrentThread.getName();
        threadCurrentThread.setName(name);
        try {
            block.invoke();
        } finally {
            InlineMarker.finallyStart(1);
            threadCurrentThread.setName(name2);
            InlineMarker.finallyEnd(1);
        }
    }

    @NotNull
    public static final List<Header> toHeaderList(@NotNull Headers headers) {
        Intrinsics.checkNotNullParameter(headers, "<this>");
        IntRange intRangeUntil = c.until(0, headers.size());
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(intRangeUntil, 10));
        Iterator<Integer> it = intRangeUntil.iterator();
        while (it.hasNext()) {
            int iNextInt = ((IntIterator) it).nextInt();
            arrayList.add(new Header(headers.name(iNextInt), headers.value(iNextInt)));
        }
        return arrayList;
    }

    @NotNull
    public static final Headers toHeaders(@NotNull List<Header> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Headers.Builder builder = new Headers.Builder();
        for (Header header : list) {
            builder.addLenient$okhttp(header.getName().utf8(), header.getValue().utf8());
        }
        return builder.build();
    }

    @NotNull
    public static final String toHexString(long j10) {
        String hexString = Long.toHexString(j10);
        Intrinsics.checkNotNullExpressionValue(hexString, "toHexString(this)");
        return hexString;
    }

    @NotNull
    public static final String toHostHeader(@NotNull HttpUrl httpUrl, boolean z10) {
        String strHost;
        Intrinsics.checkNotNullParameter(httpUrl, "<this>");
        if (StringsKt__StringsKt.contains$default((CharSequence) httpUrl.host(), (CharSequence) DeepLinkExtensionsKt.DYNAMIC_LINK_DELIMITER, false, 2, (Object) null)) {
            strHost = Constant.BRACKET_OPEN + httpUrl.host() + AbstractJsonLexerKt.END_LIST;
        } else {
            strHost = httpUrl.host();
        }
        if (!z10 && httpUrl.port() == HttpUrl.INSTANCE.defaultPort(httpUrl.scheme())) {
            return strHost;
        }
        return strHost + AbstractJsonLexerKt.COLON + httpUrl.port();
    }

    public static /* synthetic */ String toHostHeader$default(HttpUrl httpUrl, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        return toHostHeader(httpUrl, z10);
    }

    @NotNull
    public static final <T> List<T> toImmutableList(@NotNull List<? extends T> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        List<T> listUnmodifiableList = Collections.unmodifiableList(CollectionsKt___CollectionsKt.toMutableList((Collection) list));
        Intrinsics.checkNotNullExpressionValue(listUnmodifiableList, "unmodifiableList(toMutableList())");
        return listUnmodifiableList;
    }

    @NotNull
    public static final <K, V> Map<K, V> toImmutableMap(@NotNull Map<K, ? extends V> map) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        if (map.isEmpty()) {
            return q.emptyMap();
        }
        Map<K, V> mapUnmodifiableMap = Collections.unmodifiableMap(new LinkedHashMap(map));
        Intrinsics.checkNotNullExpressionValue(mapUnmodifiableMap, "{\n    Collections.unmodi…(LinkedHashMap(this))\n  }");
        return mapUnmodifiableMap;
    }

    public static final long toLongOrDefault(@NotNull String str, long j10) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return j10;
        }
    }

    public static final int toNonNegativeInt(@Nullable String str, int i10) {
        if (str != null) {
            try {
                long j10 = Long.parseLong(str);
                if (j10 > 2147483647L) {
                    return Integer.MAX_VALUE;
                }
                if (j10 < 0) {
                    return 0;
                }
                return (int) j10;
            } catch (NumberFormatException unused) {
            }
        }
        return i10;
    }

    @NotNull
    public static final String trimSubstring(@NotNull String str, int i10, int i11) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        int iIndexOfFirstNonAsciiWhitespace = indexOfFirstNonAsciiWhitespace(str, i10, i11);
        String strSubstring = str.substring(iIndexOfFirstNonAsciiWhitespace, indexOfLastNonAsciiWhitespace(str, iIndexOfFirstNonAsciiWhitespace, i11));
        Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    public static /* synthetic */ String trimSubstring$default(String str, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = str.length();
        }
        return trimSubstring(str, i10, i11);
    }

    public static final void wait(@NotNull Object obj) throws InterruptedException {
        Intrinsics.checkNotNullParameter(obj, "<this>");
        obj.wait();
    }

    @NotNull
    public static final Throwable withSuppressed(@NotNull Exception exc, @NotNull List<? extends Exception> suppressed) {
        Intrinsics.checkNotNullParameter(exc, "<this>");
        Intrinsics.checkNotNullParameter(suppressed, "suppressed");
        Iterator<? extends Exception> it = suppressed.iterator();
        while (it.hasNext()) {
            ak.b.addSuppressed(exc, it.next());
        }
        return exc;
    }

    public static final void writeMedium(@NotNull BufferedSink bufferedSink, int i10) throws IOException {
        Intrinsics.checkNotNullParameter(bufferedSink, "<this>");
        bufferedSink.writeByte((i10 >>> 16) & 255);
        bufferedSink.writeByte((i10 >>> 8) & 255);
        bufferedSink.writeByte(i10 & 255);
    }

    public static final int and(short s4, int i10) {
        return s4 & i10;
    }

    public static final int delimiterOffset(@NotNull String str, char c10, int i10, int i11) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        while (i10 < i11) {
            if (str.charAt(i10) == c10) {
                return i10;
            }
            i10++;
        }
        return i11;
    }

    public static /* synthetic */ int delimiterOffset$default(String str, char c10, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = str.length();
        }
        return delimiterOffset(str, c10, i10, i11);
    }

    @NotNull
    public static final String toHexString(int i10) {
        String hexString = Integer.toHexString(i10);
        Intrinsics.checkNotNullExpressionValue(hexString, "toHexString(this)");
        return hexString;
    }

    public static final long and(int i10, long j10) {
        return ((long) i10) & j10;
    }

    public static final void closeQuietly(@NotNull Socket socket) {
        Intrinsics.checkNotNullParameter(socket, "<this>");
        try {
            socket.close();
        } catch (AssertionError e5) {
            throw e5;
        } catch (RuntimeException e7) {
            if (!Intrinsics.areEqual(e7.getMessage(), "bio == null")) {
                throw e7;
            }
        } catch (Exception unused) {
        }
    }

    public static final void closeQuietly(@NotNull ServerSocket serverSocket) {
        Intrinsics.checkNotNullParameter(serverSocket, "<this>");
        try {
            serverSocket.close();
        } catch (RuntimeException e5) {
            throw e5;
        } catch (Exception unused) {
        }
    }

    public static final int skipAll(@NotNull Buffer buffer, byte b10) throws EOFException {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        int i10 = 0;
        while (!buffer.exhausted() && buffer.getByte(0L) == b10) {
            i10++;
            buffer.readByte();
        }
        return i10;
    }
}
