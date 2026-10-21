package okhttp3;

import androidx.appcompat.view.menu.b;
import androidx.appcompat.widget.g0;
import androidx.autofill.HintConstants;
import androidx.camera.core.processing.f;
import androidx.webkit.ProxyConfig;
import bk.w;
import com.bbva.cellswidgets.MaskTextWatcher;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.sl.ar.core.libmcrypt.exception.ErrorCodes;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import com.esotericsoftware.asm.Opcodes;
import com.fasterxml.jackson.core.JsonPointer;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import com.google.android.gms.actions.SearchIntents;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.dynamiclinks.DynamicLink;
import java.io.EOFException;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.internal.ProgressionUtilKt;
import kotlin.jvm.JvmName;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntProgression;
import kotlin.ranges.c;
import kotlin.text.Regex;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.StringsKt___StringsKt;
import kotlin.text.Typography;
import kotlin.text.l;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import mx.openpay.library.domain.util.Constant;
import okhttp3.internal.HostnamesKt;
import okhttp3.internal.Util;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;
import okio.Buffer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: HttpUrl.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b%\n\u0002\u0010\"\n\u0002\b\u001b\u0018\u0000 X2\u00020\u0001:\u0002YXBc\b\u0000\u0012\u0006\u0010\"\u001a\u00020\n\u0012\u0006\u0010&\u001a\u00020\n\u0012\u0006\u0010*\u001a\u00020\n\u0012\u0006\u0010,\u001a\u00020\n\u0012\u0006\u0010/\u001a\u00020\u000f\u0012\f\u00108\u001a\b\u0012\u0004\u0012\u00020\n0\r\u0012\u0010\u0010U\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\n\u0018\u00010\r\u0012\b\u0010F\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\u0003\u001a\u00020\n¢\u0006\u0004\bV\u0010WJ\u000f\u0010\u0005\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\t\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\f\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\nJ\u0016\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\r2\u0006\u0010\u000b\u001a\u00020\nJ\u000e\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000fJ\u0010\u0010\u0012\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0010\u001a\u00020\u000fJ\u0006\u0010\u0013\u001a\u00020\nJ\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0014\u001a\u00020\nJ\u0006\u0010\u0017\u001a\u00020\u0016J\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0014\u001a\u00020\nJ\u0013\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u001b\u001a\u00020\u000fH\u0016J\b\u0010\u001c\u001a\u00020\nH\u0016J\b\u0010\u001d\u001a\u0004\u0018\u00010\nJ\u000f\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u001e\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u001f\u0010\bJ\u000f\u0010\"\u001a\u00020\nH\u0007¢\u0006\u0004\b \u0010!J\u000f\u0010$\u001a\u00020\nH\u0007¢\u0006\u0004\b#\u0010!J\u000f\u0010&\u001a\u00020\nH\u0007¢\u0006\u0004\b%\u0010!J\u000f\u0010(\u001a\u00020\nH\u0007¢\u0006\u0004\b'\u0010!J\u000f\u0010*\u001a\u00020\nH\u0007¢\u0006\u0004\b)\u0010!J\u000f\u0010,\u001a\u00020\nH\u0007¢\u0006\u0004\b+\u0010!J\u000f\u0010/\u001a\u00020\u000fH\u0007¢\u0006\u0004\b-\u0010.J\u000f\u00101\u001a\u00020\u000fH\u0007¢\u0006\u0004\b0\u0010.J\u000f\u00103\u001a\u00020\nH\u0007¢\u0006\u0004\b2\u0010!J\u0015\u00106\u001a\b\u0012\u0004\u0012\u00020\n0\rH\u0007¢\u0006\u0004\b4\u00105J\u0015\u00108\u001a\b\u0012\u0004\u0012\u00020\n0\rH\u0007¢\u0006\u0004\b7\u00105J\u0011\u0010:\u001a\u0004\u0018\u00010\nH\u0007¢\u0006\u0004\b9\u0010!J\u0011\u0010<\u001a\u0004\u0018\u00010\nH\u0007¢\u0006\u0004\b;\u0010!J\u000f\u0010>\u001a\u00020\u000fH\u0007¢\u0006\u0004\b=\u0010.J\u0015\u0010B\u001a\b\u0012\u0004\u0012\u00020\n0?H\u0007¢\u0006\u0004\b@\u0010AJ\u0011\u0010D\u001a\u0004\u0018\u00010\nH\u0007¢\u0006\u0004\bC\u0010!J\u0011\u0010F\u001a\u0004\u0018\u00010\nH\u0007¢\u0006\u0004\bE\u0010!R\u0017\u0010\"\u001a\u00020\n8\u0007¢\u0006\f\n\u0004\bG\u0010H\u001a\u0004\b\"\u0010!R\u0017\u0010&\u001a\u00020\n8\u0007¢\u0006\f\n\u0004\bI\u0010H\u001a\u0004\b&\u0010!R\u0017\u0010*\u001a\u00020\n8\u0007¢\u0006\f\n\u0004\bJ\u0010H\u001a\u0004\b*\u0010!R\u0017\u0010,\u001a\u00020\n8\u0007¢\u0006\f\n\u0004\bK\u0010H\u001a\u0004\b,\u0010!R\u0017\u0010/\u001a\u00020\u000f8\u0007¢\u0006\f\n\u0004\bL\u0010M\u001a\u0004\b/\u0010.R\u001d\u00108\u001a\b\u0012\u0004\u0012\u00020\n0\r8\u0007¢\u0006\f\n\u0004\bN\u0010O\u001a\u0004\b8\u00105R\u0019\u0010F\u001a\u0004\u0018\u00010\n8\u0007¢\u0006\f\n\u0004\bP\u0010H\u001a\u0004\bF\u0010!R\u0017\u0010S\u001a\u00020\u00198\u0006¢\u0006\f\n\u0004\bQ\u0010R\u001a\u0004\bS\u0010TR\u0011\u0010$\u001a\u00020\n8G¢\u0006\u0006\u001a\u0004\b$\u0010!R\u0011\u0010(\u001a\u00020\n8G¢\u0006\u0006\u001a\u0004\b(\u0010!R\u0011\u00101\u001a\u00020\u000f8G¢\u0006\u0006\u001a\u0004\b1\u0010.R\u0011\u00103\u001a\u00020\n8G¢\u0006\u0006\u001a\u0004\b3\u0010!R\u0017\u00106\u001a\b\u0012\u0004\u0012\u00020\n0\r8G¢\u0006\u0006\u001a\u0004\b6\u00105R\u0013\u0010:\u001a\u0004\u0018\u00010\n8G¢\u0006\u0006\u001a\u0004\b:\u0010!R\u0013\u0010<\u001a\u0004\u0018\u00010\n8G¢\u0006\u0006\u001a\u0004\b<\u0010!R\u0011\u0010>\u001a\u00020\u000f8G¢\u0006\u0006\u001a\u0004\b>\u0010.R\u0017\u0010B\u001a\b\u0012\u0004\u0012\u00020\n0?8G¢\u0006\u0006\u001a\u0004\bB\u0010AR\u0013\u0010D\u001a\u0004\u0018\u00010\n8G¢\u0006\u0006\u001a\u0004\bD\u0010!¨\u0006Z"}, d2 = {"Lokhttp3/HttpUrl;", "", "Ljava/net/URL;", "url", "()Ljava/net/URL;", "toUrl", "Ljava/net/URI;", "uri", "()Ljava/net/URI;", "toUri", "", "name", "queryParameter", "", "queryParameterValues", "", FirebaseAnalytics.Param.INDEX, "queryParameterName", "queryParameterValue", "redact", DynamicLink.Builder.KEY_LINK, "resolve", "Lokhttp3/HttpUrl$Builder;", "newBuilder", "other", "", "equals", GenerateActivationFormCommand.HASH_CODE, "toString", "topPrivateDomain", "-deprecated_url", "-deprecated_uri", "-deprecated_scheme", "()Ljava/lang/String;", "scheme", "-deprecated_encodedUsername", "encodedUsername", "-deprecated_username", HintConstants.AUTOFILL_HINT_USERNAME, "-deprecated_encodedPassword", "encodedPassword", "-deprecated_password", "password", "-deprecated_host", "host", "-deprecated_port", "()I", "port", "-deprecated_pathSize", "pathSize", "-deprecated_encodedPath", "encodedPath", "-deprecated_encodedPathSegments", "()Ljava/util/List;", "encodedPathSegments", "-deprecated_pathSegments", "pathSegments", "-deprecated_encodedQuery", "encodedQuery", "-deprecated_query", SearchIntents.EXTRA_QUERY, "-deprecated_querySize", "querySize", "", "-deprecated_queryParameterNames", "()Ljava/util/Set;", "queryParameterNames", "-deprecated_encodedFragment", "encodedFragment", "-deprecated_fragment", "fragment", "a", "Ljava/lang/String;", "b", "c", "d", "e", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "f", "Ljava/util/List;", "h", "j", "Z", "isHttps", "()Z", "queryNamesAndValues", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V", "Companion", "Builder", "okhttp"}, k = 1, mv = {1, 8, 0})
public final class HttpUrl {

    @NotNull
    public static final String FORM_ENCODE_SET = " \"':;<=>@[]^`{}|/\\?#&!$(),~";

    @NotNull
    public static final String FRAGMENT_ENCODE_SET = "";

    @NotNull
    public static final String FRAGMENT_ENCODE_SET_URI = " \"#<>\\^`{|}";

    @NotNull
    public static final String PASSWORD_ENCODE_SET = " \"':;<=>@[]^`{}|/\\?#";

    @NotNull
    public static final String PATH_SEGMENT_ENCODE_SET = " \"<>^`{}|/\\?#";

    @NotNull
    public static final String PATH_SEGMENT_ENCODE_SET_URI = "[]";

    @NotNull
    public static final String QUERY_COMPONENT_ENCODE_SET = " !\"#$&'(),/:;<=>?@[]\\^`{|}~";

    @NotNull
    public static final String QUERY_COMPONENT_ENCODE_SET_URI = "\\^`{|}";

    @NotNull
    public static final String QUERY_COMPONENT_REENCODE_SET = " \"'<>#&=";

    @NotNull
    public static final String QUERY_ENCODE_SET = " \"'<>#";

    @NotNull
    public static final String USERNAME_ENCODE_SET = " \"':;<=>@[]^`{}|/\\?#";

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String scheme;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String username;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String password;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String host;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public final int port;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final List<String> pathSegments;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public final List<String> f85560g;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final String fragment;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final String f85562i;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    public final boolean isHttps;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public static final char[] f85553k = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* JADX INFO: compiled from: HttpUrl.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u001f\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0010!\n\u0002\b\u0010\u0018\u0000 U2\u00020\u0001:\u0001UB\u0007¢\u0006\u0004\bS\u0010TJ\u000e\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0002J\u000e\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0002J\u000e\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0002J\u000e\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0002J\u000e\u0010\b\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0002J\u000e\u0010\n\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\tJ\u000e\u0010\f\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u0002J\u000e\u0010\u000e\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u0002J\u000e\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u0002J\u000e\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0002J\u0016\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0002J\u0016\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u0002J\u000e\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\tJ\u000e\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u0002J\u0010\u0010\u0018\u001a\u00020\u00002\b\u0010\u0018\u001a\u0004\u0018\u00010\u0002J\u0010\u0010\u0019\u001a\u00020\u00002\b\u0010\u0019\u001a\u0004\u0018\u00010\u0002J\u0018\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u00022\b\u0010\u001b\u001a\u0004\u0018\u00010\u0002J\u0018\u0010\u001f\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u00022\b\u0010\u001e\u001a\u0004\u0018\u00010\u0002J\u0018\u0010 \u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u00022\b\u0010\u001b\u001a\u0004\u0018\u00010\u0002J\u0018\u0010!\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u00022\b\u0010\u001e\u001a\u0004\u0018\u00010\u0002J\u000e\u0010\"\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u0002J\u000e\u0010#\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u0002J\u0010\u0010$\u001a\u00020\u00002\b\u0010$\u001a\u0004\u0018\u00010\u0002J\u0010\u0010%\u001a\u00020\u00002\b\u0010%\u001a\u0004\u0018\u00010\u0002J\u000f\u0010(\u001a\u00020\u0000H\u0000¢\u0006\u0004\b&\u0010'J\u0006\u0010*\u001a\u00020)J\b\u0010+\u001a\u00020\u0002H\u0016J!\u00100\u001a\u00020\u00002\b\u0010,\u001a\u0004\u0018\u00010)2\u0006\u0010-\u001a\u00020\u0002H\u0000¢\u0006\u0004\b.\u0010/R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b1\u00102\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\"\u0010\u0005\u001a\u00020\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b7\u00102\u001a\u0004\b8\u00104\"\u0004\b9\u00106R\"\u0010\u0007\u001a\u00020\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b:\u00102\u001a\u0004\b;\u00104\"\u0004\b<\u00106R$\u0010\b\u001a\u0004\u0018\u00010\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b=\u00102\u001a\u0004\b>\u00104\"\u0004\b?\u00106R\"\u0010\n\u001a\u00020\t8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b@\u0010A\u001a\u0004\bB\u0010C\"\u0004\bD\u0010ER \u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00020F8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bG\u0010H\u001a\u0004\bI\u0010JR,\u0010O\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010F8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bK\u0010H\u001a\u0004\bL\u0010J\"\u0004\bM\u0010NR$\u0010%\u001a\u0004\u0018\u00010\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bP\u00102\u001a\u0004\bQ\u00104\"\u0004\bR\u00106¨\u0006V"}, d2 = {"Lokhttp3/HttpUrl$Builder;", "", "", "scheme", HintConstants.AUTOFILL_HINT_USERNAME, "encodedUsername", "password", "encodedPassword", "host", "", "port", "pathSegment", "addPathSegment", "pathSegments", "addPathSegments", "encodedPathSegment", "addEncodedPathSegment", "encodedPathSegments", "addEncodedPathSegments", FirebaseAnalytics.Param.INDEX, "setPathSegment", "setEncodedPathSegment", "removePathSegment", "encodedPath", SearchIntents.EXTRA_QUERY, "encodedQuery", "name", "value", "addQueryParameter", "encodedName", "encodedValue", "addEncodedQueryParameter", "setQueryParameter", "setEncodedQueryParameter", "removeAllQueryParameters", "removeAllEncodedQueryParameters", "fragment", "encodedFragment", "reencodeForUri$okhttp", "()Lokhttp3/HttpUrl$Builder;", "reencodeForUri", "Lokhttp3/HttpUrl;", JsonPOJOBuilder.DEFAULT_BUILD_METHOD, "toString", "base", "input", "parse$okhttp", "(Lokhttp3/HttpUrl;Ljava/lang/String;)Lokhttp3/HttpUrl$Builder;", "parse", "a", "Ljava/lang/String;", "getScheme$okhttp", "()Ljava/lang/String;", "setScheme$okhttp", "(Ljava/lang/String;)V", "b", "getEncodedUsername$okhttp", "setEncodedUsername$okhttp", "c", "getEncodedPassword$okhttp", "setEncodedPassword$okhttp", "d", "getHost$okhttp", "setHost$okhttp", "e", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getPort$okhttp", "()I", "setPort$okhttp", "(I)V", "", "f", "Ljava/util/List;", "getEncodedPathSegments$okhttp", "()Ljava/util/List;", "g", "getEncodedQueryNamesAndValues$okhttp", "setEncodedQueryNamesAndValues$okhttp", "(Ljava/util/List;)V", "encodedQueryNamesAndValues", "h", "getEncodedFragment$okhttp", "setEncodedFragment$okhttp", "<init>", "()V", "Companion", "okhttp"}, k = 1, mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nHttpUrl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HttpUrl.kt\nokhttp3/HttpUrl$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1869:1\n1#2:1870\n1549#3:1871\n1620#3,3:1872\n1549#3:1875\n1620#3,3:1876\n*S KotlinDebug\n*F\n+ 1 HttpUrl.kt\nokhttp3/HttpUrl$Builder\n*L\n1180#1:1871\n1180#1:1872,3\n1181#1:1875\n1181#1:1876,3\n*E\n"})
    public static final class Builder {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        @NotNull
        public static final String INVALID_HOST = "Invalid URL host";

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public String scheme;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public String host;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @NotNull
        public final ArrayList f85569f;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public List<String> encodedQueryNamesAndValues;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public String encodedFragment;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public String encodedUsername = "";

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public String encodedPassword = "";

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        public int port = -1;

        /* JADX INFO: compiled from: HttpUrl.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lokhttp3/HttpUrl$Builder$Companion;", "", "", "INVALID_HOST", "Ljava/lang/String;", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 8, 0})
        public static final class Companion {
            public Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public static final int access$parsePort(Companion companion, String str, int i10, int i11) {
                companion.getClass();
                try {
                    int i12 = Integer.parseInt(Companion.canonicalize$okhttp$default(HttpUrl.INSTANCE, str, i10, i11, "", false, false, false, false, null, 248, null));
                    if (1 > i12 || i12 >= 65536) {
                        return -1;
                    }
                    return i12;
                } catch (NumberFormatException unused) {
                    return -1;
                }
            }

            public static final int access$portColonOffset(Companion companion, String str, int i10, int i11) {
                companion.getClass();
                while (i10 < i11) {
                    char cCharAt = str.charAt(i10);
                    if (cCharAt == '[') {
                        do {
                            i10++;
                            if (i10 >= i11) {
                                break;
                            }
                        } while (str.charAt(i10) != ']');
                    } else if (cCharAt == ':') {
                        return i10;
                    }
                    i10++;
                }
                return i11;
            }

            public static final int access$schemeDelimiterOffset(Companion companion, String str, int i10, int i11) {
                companion.getClass();
                if (i11 - i10 < 2) {
                    return -1;
                }
                char cCharAt = str.charAt(i10);
                if ((Intrinsics.compare((int) cCharAt, 97) < 0 || Intrinsics.compare((int) cCharAt, 122) > 0) && (Intrinsics.compare((int) cCharAt, 65) < 0 || Intrinsics.compare((int) cCharAt, 90) > 0)) {
                    return -1;
                }
                while (true) {
                    i10++;
                    if (i10 >= i11) {
                        return -1;
                    }
                    char cCharAt2 = str.charAt(i10);
                    if ('a' > cCharAt2 || cCharAt2 >= '{') {
                        if ('A' > cCharAt2 || cCharAt2 >= '[') {
                            if ('0' > cCharAt2 || cCharAt2 >= ':') {
                                if (cCharAt2 != '+' && cCharAt2 != '-' && cCharAt2 != '.') {
                                    if (cCharAt2 == ':') {
                                        return i10;
                                    }
                                    return -1;
                                }
                            }
                        }
                    }
                }
            }

            public static final int access$slashCount(Companion companion, String str, int i10, int i11) {
                companion.getClass();
                int i12 = 0;
                while (i10 < i11) {
                    char cCharAt = str.charAt(i10);
                    if (cCharAt != '\\' && cCharAt != '/') {
                        break;
                    }
                    i12++;
                    i10++;
                }
                return i12;
            }
        }

        public Builder() {
            ArrayList arrayList = new ArrayList();
            this.f85569f = arrayList;
            arrayList.add("");
        }

        public static boolean b(String str) {
            return Intrinsics.areEqual(str, Constant.DOT_STRING) || l.equals(str, "%2e", true);
        }

        public static boolean c(String str) {
            return Intrinsics.areEqual(str, "..") || l.equals(str, "%2e.", true) || l.equals(str, ".%2e", true) || l.equals(str, "%2e%2e", true);
        }

        public final void a(String str, boolean z10) {
            int i10 = 0;
            do {
                int iDelimiterOffset = Util.delimiterOffset(str, "/\\", i10, str.length());
                d(str, i10, iDelimiterOffset, iDelimiterOffset < str.length(), z10);
                i10 = iDelimiterOffset + 1;
            } while (i10 <= str.length());
        }

        @NotNull
        public final Builder addEncodedPathSegment(@NotNull String encodedPathSegment) {
            Intrinsics.checkNotNullParameter(encodedPathSegment, "encodedPathSegment");
            d(encodedPathSegment, 0, encodedPathSegment.length(), false, true);
            return this;
        }

        @NotNull
        public final Builder addEncodedPathSegments(@NotNull String encodedPathSegments) {
            Intrinsics.checkNotNullParameter(encodedPathSegments, "encodedPathSegments");
            a(encodedPathSegments, true);
            return this;
        }

        @NotNull
        public final Builder addEncodedQueryParameter(@NotNull String encodedName, @Nullable String encodedValue) {
            Intrinsics.checkNotNullParameter(encodedName, "encodedName");
            if (this.encodedQueryNamesAndValues == null) {
                this.encodedQueryNamesAndValues = new ArrayList();
            }
            List<String> list = this.encodedQueryNamesAndValues;
            Intrinsics.checkNotNull(list);
            Companion companion = HttpUrl.INSTANCE;
            list.add(Companion.canonicalize$okhttp$default(companion, encodedName, 0, 0, HttpUrl.QUERY_COMPONENT_REENCODE_SET, true, false, true, false, null, 211, null));
            List<String> list2 = this.encodedQueryNamesAndValues;
            Intrinsics.checkNotNull(list2);
            list2.add(encodedValue != null ? Companion.canonicalize$okhttp$default(companion, encodedValue, 0, 0, HttpUrl.QUERY_COMPONENT_REENCODE_SET, true, false, true, false, null, 211, null) : null);
            return this;
        }

        @NotNull
        public final Builder addPathSegment(@NotNull String pathSegment) {
            Intrinsics.checkNotNullParameter(pathSegment, "pathSegment");
            d(pathSegment, 0, pathSegment.length(), false, false);
            return this;
        }

        @NotNull
        public final Builder addPathSegments(@NotNull String pathSegments) {
            Intrinsics.checkNotNullParameter(pathSegments, "pathSegments");
            a(pathSegments, false);
            return this;
        }

        @NotNull
        public final Builder addQueryParameter(@NotNull String name, @Nullable String value) {
            Intrinsics.checkNotNullParameter(name, "name");
            if (this.encodedQueryNamesAndValues == null) {
                this.encodedQueryNamesAndValues = new ArrayList();
            }
            List<String> list = this.encodedQueryNamesAndValues;
            Intrinsics.checkNotNull(list);
            Companion companion = HttpUrl.INSTANCE;
            list.add(Companion.canonicalize$okhttp$default(companion, name, 0, 0, HttpUrl.QUERY_COMPONENT_ENCODE_SET, false, false, true, false, null, 219, null));
            List<String> list2 = this.encodedQueryNamesAndValues;
            Intrinsics.checkNotNull(list2);
            list2.add(value != null ? Companion.canonicalize$okhttp$default(companion, value, 0, 0, HttpUrl.QUERY_COMPONENT_ENCODE_SET, false, false, true, false, null, 219, null) : null);
            return this;
        }

        @NotNull
        public final HttpUrl build() {
            int iDefaultPort;
            ArrayList arrayList;
            String str = this.scheme;
            if (str == null) {
                throw new IllegalStateException("scheme == null");
            }
            Companion companion = HttpUrl.INSTANCE;
            String strPercentDecode$okhttp$default = Companion.percentDecode$okhttp$default(companion, this.encodedUsername, 0, 0, false, 7, null);
            String strPercentDecode$okhttp$default2 = Companion.percentDecode$okhttp$default(companion, this.encodedPassword, 0, 0, false, 7, null);
            String str2 = this.host;
            if (str2 == null) {
                throw new IllegalStateException("host == null");
            }
            int i10 = this.port;
            if (i10 != -1) {
                iDefaultPort = i10;
            } else {
                String str3 = this.scheme;
                Intrinsics.checkNotNull(str3);
                iDefaultPort = companion.defaultPort(str3);
            }
            ArrayList arrayList2 = this.f85569f;
            ArrayList arrayList3 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList2, 10));
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                arrayList3.add(Companion.percentDecode$okhttp$default(HttpUrl.INSTANCE, (String) it.next(), 0, 0, false, 7, null));
            }
            List<String> list = this.encodedQueryNamesAndValues;
            if (list != null) {
                List<String> list2 = list;
                arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
                for (String str4 : list2) {
                    arrayList.add(str4 != null ? Companion.percentDecode$okhttp$default(HttpUrl.INSTANCE, str4, 0, 0, true, 3, null) : null);
                }
            } else {
                arrayList = null;
            }
            String str5 = this.encodedFragment;
            return new HttpUrl(str, strPercentDecode$okhttp$default, strPercentDecode$okhttp$default2, str2, iDefaultPort, arrayList3, arrayList, str5 != null ? Companion.percentDecode$okhttp$default(HttpUrl.INSTANCE, str5, 0, 0, false, 7, null) : null, toString());
        }

        public final void d(String str, int i10, int i11, boolean z10, boolean z11) {
            String strCanonicalize$okhttp$default = Companion.canonicalize$okhttp$default(HttpUrl.INSTANCE, str, i10, i11, HttpUrl.PATH_SEGMENT_ENCODE_SET, z11, false, false, false, null, 240, null);
            if (b(strCanonicalize$okhttp$default)) {
                return;
            }
            boolean zC = c(strCanonicalize$okhttp$default);
            ArrayList arrayList = this.f85569f;
            if (zC) {
                if (((String) arrayList.remove(arrayList.size() - 1)).length() == 0 && (!arrayList.isEmpty())) {
                    arrayList.set(arrayList.size() - 1, "");
                    return;
                } else {
                    arrayList.add("");
                    return;
                }
            }
            if (((CharSequence) b.b(arrayList, 1)).length() == 0) {
                arrayList.set(arrayList.size() - 1, strCanonicalize$okhttp$default);
            } else {
                arrayList.add(strCanonicalize$okhttp$default);
            }
            if (z10) {
                arrayList.add("");
            }
        }

        public final void e(String str) {
            List<String> list = this.encodedQueryNamesAndValues;
            Intrinsics.checkNotNull(list);
            int size = list.size() - 2;
            int progressionLastElement = ProgressionUtilKt.getProgressionLastElement(size, 0, -2);
            if (progressionLastElement > size) {
                return;
            }
            while (true) {
                List<String> list2 = this.encodedQueryNamesAndValues;
                Intrinsics.checkNotNull(list2);
                if (Intrinsics.areEqual(str, list2.get(size))) {
                    List<String> list3 = this.encodedQueryNamesAndValues;
                    Intrinsics.checkNotNull(list3);
                    list3.remove(size + 1);
                    List<String> list4 = this.encodedQueryNamesAndValues;
                    Intrinsics.checkNotNull(list4);
                    list4.remove(size);
                    List<String> list5 = this.encodedQueryNamesAndValues;
                    Intrinsics.checkNotNull(list5);
                    if (list5.isEmpty()) {
                        this.encodedQueryNamesAndValues = null;
                        return;
                    }
                }
                if (size == progressionLastElement) {
                    return;
                } else {
                    size -= 2;
                }
            }
        }

        @NotNull
        public final Builder encodedFragment(@Nullable String encodedFragment) {
            this.encodedFragment = encodedFragment != null ? Companion.canonicalize$okhttp$default(HttpUrl.INSTANCE, encodedFragment, 0, 0, "", true, false, false, true, null, 179, null) : null;
            return this;
        }

        @NotNull
        public final Builder encodedPassword(@NotNull String encodedPassword) {
            Intrinsics.checkNotNullParameter(encodedPassword, "encodedPassword");
            this.encodedPassword = Companion.canonicalize$okhttp$default(HttpUrl.INSTANCE, encodedPassword, 0, 0, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, null, 243, null);
            return this;
        }

        @NotNull
        public final Builder encodedPath(@NotNull String encodedPath) {
            Intrinsics.checkNotNullParameter(encodedPath, "encodedPath");
            if (!l.startsWith$default(encodedPath, "/", false, 2, null)) {
                throw new IllegalArgumentException(f.d("unexpected encodedPath: ", encodedPath).toString());
            }
            f(0, encodedPath.length(), encodedPath);
            return this;
        }

        /* JADX WARN: Code duplicated, block: B:6:0x001d  */
        @NotNull
        public final Builder encodedQuery(@Nullable String encodedQuery) {
            List<String> queryNamesAndValues$okhttp;
            if (encodedQuery != null) {
                Companion companion = HttpUrl.INSTANCE;
                String strCanonicalize$okhttp$default = Companion.canonicalize$okhttp$default(companion, encodedQuery, 0, 0, HttpUrl.QUERY_ENCODE_SET, true, false, true, false, null, 211, null);
                if (strCanonicalize$okhttp$default != null) {
                    queryNamesAndValues$okhttp = companion.toQueryNamesAndValues$okhttp(strCanonicalize$okhttp$default);
                } else {
                    queryNamesAndValues$okhttp = null;
                }
            } else {
                queryNamesAndValues$okhttp = null;
            }
            this.encodedQueryNamesAndValues = queryNamesAndValues$okhttp;
            return this;
        }

        @NotNull
        public final Builder encodedUsername(@NotNull String encodedUsername) {
            Intrinsics.checkNotNullParameter(encodedUsername, "encodedUsername");
            this.encodedUsername = Companion.canonicalize$okhttp$default(HttpUrl.INSTANCE, encodedUsername, 0, 0, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, null, 243, null);
            return this;
        }

        public final void f(int i10, int i11, String str) {
            if (i10 == i11) {
                return;
            }
            char cCharAt = str.charAt(i10);
            ArrayList arrayList = this.f85569f;
            if (cCharAt == '/' || cCharAt == '\\') {
                arrayList.clear();
                arrayList.add("");
                i10++;
            } else {
                arrayList.set(arrayList.size() - 1, "");
            }
            while (true) {
                int i12 = i10;
                while (i12 < i11) {
                    i10 = Util.delimiterOffset(str, "/\\", i12, i11);
                    boolean z10 = i10 < i11;
                    d(str, i12, i10, z10, true);
                    if (z10) {
                        i12 = i10 + 1;
                    }
                }
                return;
            }
        }

        @NotNull
        public final Builder fragment(@Nullable String fragment) {
            this.encodedFragment = fragment != null ? Companion.canonicalize$okhttp$default(HttpUrl.INSTANCE, fragment, 0, 0, "", false, false, false, true, null, 187, null) : null;
            return this;
        }

        @Nullable
        /* JADX INFO: renamed from: getEncodedFragment$okhttp, reason: from getter */
        public final String getEncodedFragment() {
            return this.encodedFragment;
        }

        @NotNull
        /* JADX INFO: renamed from: getEncodedPassword$okhttp, reason: from getter */
        public final String getEncodedPassword() {
            return this.encodedPassword;
        }

        @NotNull
        public final List<String> getEncodedPathSegments$okhttp() {
            return this.f85569f;
        }

        @Nullable
        public final List<String> getEncodedQueryNamesAndValues$okhttp() {
            return this.encodedQueryNamesAndValues;
        }

        @NotNull
        /* JADX INFO: renamed from: getEncodedUsername$okhttp, reason: from getter */
        public final String getEncodedUsername() {
            return this.encodedUsername;
        }

        @Nullable
        /* JADX INFO: renamed from: getHost$okhttp, reason: from getter */
        public final String getHost() {
            return this.host;
        }

        /* JADX INFO: renamed from: getPort$okhttp, reason: from getter */
        public final int getPort() {
            return this.port;
        }

        @Nullable
        /* JADX INFO: renamed from: getScheme$okhttp, reason: from getter */
        public final String getScheme() {
            return this.scheme;
        }

        @NotNull
        public final Builder host(@NotNull String host) {
            Intrinsics.checkNotNullParameter(host, "host");
            String canonicalHost = HostnamesKt.toCanonicalHost(Companion.percentDecode$okhttp$default(HttpUrl.INSTANCE, host, 0, 0, false, 7, null));
            if (canonicalHost == null) {
                throw new IllegalArgumentException(f.d("unexpected host: ", host));
            }
            this.host = canonicalHost;
            return this;
        }

        @NotNull
        public final Builder parse$okhttp(@Nullable HttpUrl base, @NotNull String input) {
            int iDelimiterOffset;
            int i10;
            int i11;
            boolean z10;
            boolean z11;
            String input2 = input;
            Intrinsics.checkNotNullParameter(input2, "input");
            int iIndexOfFirstNonAsciiWhitespace$default = Util.indexOfFirstNonAsciiWhitespace$default(input2, 0, 0, 3, null);
            int iIndexOfLastNonAsciiWhitespace$default = Util.indexOfLastNonAsciiWhitespace$default(input2, iIndexOfFirstNonAsciiWhitespace$default, 0, 2, null);
            Companion companion = INSTANCE;
            int iAccess$schemeDelimiterOffset = Companion.access$schemeDelimiterOffset(companion, input2, iIndexOfFirstNonAsciiWhitespace$default, iIndexOfLastNonAsciiWhitespace$default);
            boolean z12 = true;
            byte b10 = -1;
            if (iAccess$schemeDelimiterOffset != -1) {
                if (l.startsWith(input2, "https:", iIndexOfFirstNonAsciiWhitespace$default, true)) {
                    this.scheme = ProxyConfig.MATCH_HTTPS;
                    iIndexOfFirstNonAsciiWhitespace$default += 6;
                } else {
                    if (!l.startsWith(input2, "http:", iIndexOfFirstNonAsciiWhitespace$default, true)) {
                        StringBuilder sb2 = new StringBuilder("Expected URL scheme 'http' or 'https' but was '");
                        String strSubstring = input2.substring(0, iAccess$schemeDelimiterOffset);
                        Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                        sb2.append(strSubstring);
                        sb2.append('\'');
                        throw new IllegalArgumentException(sb2.toString());
                    }
                    this.scheme = ProxyConfig.MATCH_HTTP;
                    iIndexOfFirstNonAsciiWhitespace$default += 5;
                }
            } else {
                if (base == null) {
                    if (input.length() > 6) {
                        input2 = StringsKt___StringsKt.take(input2, 6) + "...";
                    }
                    throw new IllegalArgumentException(f.d("Expected URL scheme 'http' or 'https' but no scheme was found for ", input2));
                }
                this.scheme = base.scheme();
            }
            int iAccess$slashCount = Companion.access$slashCount(companion, input2, iIndexOfFirstNonAsciiWhitespace$default, iIndexOfLastNonAsciiWhitespace$default);
            byte b11 = 63;
            byte b12 = 35;
            if (iAccess$slashCount >= 2 || base == null || !Intrinsics.areEqual(base.scheme(), this.scheme)) {
                boolean z13 = false;
                boolean z14 = false;
                int i12 = iIndexOfFirstNonAsciiWhitespace$default + iAccess$slashCount;
                while (true) {
                    iDelimiterOffset = Util.delimiterOffset(input2, "@/\\?#", i12, iIndexOfLastNonAsciiWhitespace$default);
                    byte bCharAt = iDelimiterOffset != iIndexOfLastNonAsciiWhitespace$default ? input2.charAt(iDelimiterOffset) : b10;
                    if (bCharAt == b10 || bCharAt == b12 || bCharAt == 47 || bCharAt == 92 || bCharAt == b11) {
                        break;
                    }
                    if (bCharAt == 64) {
                        if (z13) {
                            i11 = iDelimiterOffset;
                            z10 = z12;
                            this.encodedPassword += "%40" + Companion.canonicalize$okhttp$default(HttpUrl.INSTANCE, input, i12, i11, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, null, 240, null);
                        } else {
                            int iDelimiterOffset2 = Util.delimiterOffset(input2, AbstractJsonLexerKt.COLON, i12, iDelimiterOffset);
                            Companion companion2 = HttpUrl.INSTANCE;
                            z10 = z12;
                            String strCanonicalize$okhttp$default = Companion.canonicalize$okhttp$default(companion2, input, i12, iDelimiterOffset2, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, null, 240, null);
                            if (z14) {
                                strCanonicalize$okhttp$default = androidx.collection.f.c(new StringBuilder(), this.encodedUsername, "%40", strCanonicalize$okhttp$default);
                            }
                            this.encodedUsername = strCanonicalize$okhttp$default;
                            i11 = iDelimiterOffset;
                            if (iDelimiterOffset2 != i11) {
                                this.encodedPassword = Companion.canonicalize$okhttp$default(companion2, input, iDelimiterOffset2 + 1, i11, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, null, 240, null);
                                z11 = z10;
                            } else {
                                z11 = z13;
                            }
                            z13 = z11;
                            z14 = z10;
                        }
                        i12 = i11 + 1;
                        iIndexOfLastNonAsciiWhitespace$default = iIndexOfLastNonAsciiWhitespace$default;
                        z12 = z10;
                        b12 = 35;
                        b11 = 63;
                        b10 = -1;
                    }
                }
                i10 = iIndexOfLastNonAsciiWhitespace$default;
                Companion companion3 = INSTANCE;
                int iAccess$portColonOffset = Companion.access$portColonOffset(companion3, input2, i12, iDelimiterOffset);
                int i13 = iAccess$portColonOffset + 1;
                if (i13 < iDelimiterOffset) {
                    this.host = HostnamesKt.toCanonicalHost(Companion.percentDecode$okhttp$default(HttpUrl.INSTANCE, input, i12, iAccess$portColonOffset, false, 4, null));
                    int iAccess$parsePort = Companion.access$parsePort(companion3, input2, i13, iDelimiterOffset);
                    this.port = iAccess$parsePort;
                    if (iAccess$parsePort == -1) {
                        StringBuilder sb3 = new StringBuilder("Invalid URL port: \"");
                        String strSubstring2 = input2.substring(i13, iDelimiterOffset);
                        Intrinsics.checkNotNullExpressionValue(strSubstring2, "this as java.lang.String…ing(startIndex, endIndex)");
                        sb3.append(strSubstring2);
                        sb3.append('\"');
                        throw new IllegalArgumentException(sb3.toString().toString());
                    }
                } else {
                    Companion companion4 = HttpUrl.INSTANCE;
                    this.host = HostnamesKt.toCanonicalHost(Companion.percentDecode$okhttp$default(companion4, input, i12, iAccess$portColonOffset, false, 4, null));
                    String str = this.scheme;
                    Intrinsics.checkNotNull(str);
                    this.port = companion4.defaultPort(str);
                }
                if (this.host == null) {
                    StringBuilder sb4 = new StringBuilder("Invalid URL host: \"");
                    String strSubstring3 = input2.substring(i12, iAccess$portColonOffset);
                    Intrinsics.checkNotNullExpressionValue(strSubstring3, "this as java.lang.String…ing(startIndex, endIndex)");
                    sb4.append(strSubstring3);
                    sb4.append('\"');
                    throw new IllegalArgumentException(sb4.toString().toString());
                }
                iIndexOfFirstNonAsciiWhitespace$default = iDelimiterOffset;
            } else {
                this.encodedUsername = base.encodedUsername();
                this.encodedPassword = base.encodedPassword();
                this.host = base.host();
                this.port = base.port();
                ArrayList arrayList = this.f85569f;
                arrayList.clear();
                arrayList.addAll(base.encodedPathSegments());
                if (iIndexOfFirstNonAsciiWhitespace$default == iIndexOfLastNonAsciiWhitespace$default || input2.charAt(iIndexOfFirstNonAsciiWhitespace$default) == '#') {
                    encodedQuery(base.encodedQuery());
                }
                i10 = iIndexOfLastNonAsciiWhitespace$default;
            }
            int i14 = i10;
            int iDelimiterOffset3 = Util.delimiterOffset(input2, "?#", iIndexOfFirstNonAsciiWhitespace$default, i14);
            f(iIndexOfFirstNonAsciiWhitespace$default, iDelimiterOffset3, input2);
            if (iDelimiterOffset3 < i14 && input2.charAt(iDelimiterOffset3) == '?') {
                int iDelimiterOffset4 = Util.delimiterOffset(input2, MaskTextWatcher.WILDCARD, iDelimiterOffset3, i14);
                Companion companion5 = HttpUrl.INSTANCE;
                this.encodedQueryNamesAndValues = companion5.toQueryNamesAndValues$okhttp(Companion.canonicalize$okhttp$default(companion5, input, iDelimiterOffset3 + 1, iDelimiterOffset4, HttpUrl.QUERY_ENCODE_SET, true, false, true, false, null, ErrorCodes.ERR_CRY_BAD_REC_RSA_PUBKEY, null));
                iDelimiterOffset3 = iDelimiterOffset4;
            }
            if (iDelimiterOffset3 < i14 && input2.charAt(iDelimiterOffset3) == '#') {
                this.encodedFragment = Companion.canonicalize$okhttp$default(HttpUrl.INSTANCE, input, iDelimiterOffset3 + 1, i14, "", true, false, false, true, null, 176, null);
            }
            return this;
        }

        @NotNull
        public final Builder password(@NotNull String password) {
            Intrinsics.checkNotNullParameter(password, "password");
            this.encodedPassword = Companion.canonicalize$okhttp$default(HttpUrl.INSTANCE, password, 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, null, 251, null);
            return this;
        }

        @NotNull
        public final Builder port(int port) {
            if (1 > port || port >= 65536) {
                throw new IllegalArgumentException(g0.c("unexpected port: ", port).toString());
            }
            this.port = port;
            return this;
        }

        /* JADX WARN: Code duplicated, block: B:6:0x001d  */
        @NotNull
        public final Builder query(@Nullable String query) {
            List<String> queryNamesAndValues$okhttp;
            if (query != null) {
                Companion companion = HttpUrl.INSTANCE;
                String strCanonicalize$okhttp$default = Companion.canonicalize$okhttp$default(companion, query, 0, 0, HttpUrl.QUERY_ENCODE_SET, false, false, true, false, null, 219, null);
                if (strCanonicalize$okhttp$default != null) {
                    queryNamesAndValues$okhttp = companion.toQueryNamesAndValues$okhttp(strCanonicalize$okhttp$default);
                } else {
                    queryNamesAndValues$okhttp = null;
                }
            } else {
                queryNamesAndValues$okhttp = null;
            }
            this.encodedQueryNamesAndValues = queryNamesAndValues$okhttp;
            return this;
        }

        @NotNull
        public final Builder reencodeForUri$okhttp() {
            String str = this.host;
            this.host = str != null ? new Regex("[\"<>^`{|}]").replace(str, "") : null;
            ArrayList arrayList = this.f85569f;
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                arrayList.set(i10, Companion.canonicalize$okhttp$default(HttpUrl.INSTANCE, (String) arrayList.get(i10), 0, 0, HttpUrl.PATH_SEGMENT_ENCODE_SET_URI, true, true, false, false, null, 227, null));
            }
            List<String> list = this.encodedQueryNamesAndValues;
            if (list != null) {
                int size2 = list.size();
                for (int i11 = 0; i11 < size2; i11++) {
                    String str2 = list.get(i11);
                    list.set(i11, str2 != null ? Companion.canonicalize$okhttp$default(HttpUrl.INSTANCE, str2, 0, 0, HttpUrl.QUERY_COMPONENT_ENCODE_SET_URI, true, true, true, false, null, Opcodes.MONITOREXIT, null) : null);
                }
            }
            String str3 = this.encodedFragment;
            this.encodedFragment = str3 != null ? Companion.canonicalize$okhttp$default(HttpUrl.INSTANCE, str3, 0, 0, HttpUrl.FRAGMENT_ENCODE_SET_URI, true, true, false, true, null, 163, null) : null;
            return this;
        }

        @NotNull
        public final Builder removeAllEncodedQueryParameters(@NotNull String encodedName) {
            Intrinsics.checkNotNullParameter(encodedName, "encodedName");
            if (this.encodedQueryNamesAndValues == null) {
                return this;
            }
            e(Companion.canonicalize$okhttp$default(HttpUrl.INSTANCE, encodedName, 0, 0, HttpUrl.QUERY_COMPONENT_REENCODE_SET, true, false, true, false, null, 211, null));
            return this;
        }

        @NotNull
        public final Builder removeAllQueryParameters(@NotNull String name) {
            Intrinsics.checkNotNullParameter(name, "name");
            if (this.encodedQueryNamesAndValues == null) {
                return this;
            }
            e(Companion.canonicalize$okhttp$default(HttpUrl.INSTANCE, name, 0, 0, HttpUrl.QUERY_COMPONENT_ENCODE_SET, false, false, true, false, null, 219, null));
            return this;
        }

        @NotNull
        public final Builder removePathSegment(int index) {
            ArrayList arrayList = this.f85569f;
            arrayList.remove(index);
            if (arrayList.isEmpty()) {
                arrayList.add("");
            }
            return this;
        }

        @NotNull
        public final Builder scheme(@NotNull String scheme) {
            Intrinsics.checkNotNullParameter(scheme, "scheme");
            if (l.equals(scheme, ProxyConfig.MATCH_HTTP, true)) {
                this.scheme = ProxyConfig.MATCH_HTTP;
            } else {
                if (!l.equals(scheme, ProxyConfig.MATCH_HTTPS, true)) {
                    throw new IllegalArgumentException(f.d("unexpected scheme: ", scheme));
                }
                this.scheme = ProxyConfig.MATCH_HTTPS;
            }
            return this;
        }

        public final void setEncodedFragment$okhttp(@Nullable String str) {
            this.encodedFragment = str;
        }

        public final void setEncodedPassword$okhttp(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.encodedPassword = str;
        }

        @NotNull
        public final Builder setEncodedPathSegment(int index, @NotNull String encodedPathSegment) {
            Intrinsics.checkNotNullParameter(encodedPathSegment, "encodedPathSegment");
            String strCanonicalize$okhttp$default = Companion.canonicalize$okhttp$default(HttpUrl.INSTANCE, encodedPathSegment, 0, 0, HttpUrl.PATH_SEGMENT_ENCODE_SET, true, false, false, false, null, 243, null);
            this.f85569f.set(index, strCanonicalize$okhttp$default);
            if (b(strCanonicalize$okhttp$default) || c(strCanonicalize$okhttp$default)) {
                throw new IllegalArgumentException(f.d("unexpected path segment: ", encodedPathSegment).toString());
            }
            return this;
        }

        public final void setEncodedQueryNamesAndValues$okhttp(@Nullable List<String> list) {
            this.encodedQueryNamesAndValues = list;
        }

        @NotNull
        public final Builder setEncodedQueryParameter(@NotNull String encodedName, @Nullable String encodedValue) {
            Intrinsics.checkNotNullParameter(encodedName, "encodedName");
            removeAllEncodedQueryParameters(encodedName);
            addEncodedQueryParameter(encodedName, encodedValue);
            return this;
        }

        public final void setEncodedUsername$okhttp(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.encodedUsername = str;
        }

        public final void setHost$okhttp(@Nullable String str) {
            this.host = str;
        }

        @NotNull
        public final Builder setPathSegment(int index, @NotNull String pathSegment) {
            Intrinsics.checkNotNullParameter(pathSegment, "pathSegment");
            String strCanonicalize$okhttp$default = Companion.canonicalize$okhttp$default(HttpUrl.INSTANCE, pathSegment, 0, 0, HttpUrl.PATH_SEGMENT_ENCODE_SET, false, false, false, false, null, 251, null);
            if (b(strCanonicalize$okhttp$default) || c(strCanonicalize$okhttp$default)) {
                throw new IllegalArgumentException(f.d("unexpected path segment: ", pathSegment).toString());
            }
            this.f85569f.set(index, strCanonicalize$okhttp$default);
            return this;
        }

        public final void setPort$okhttp(int i10) {
            this.port = i10;
        }

        @NotNull
        public final Builder setQueryParameter(@NotNull String name, @Nullable String value) {
            Intrinsics.checkNotNullParameter(name, "name");
            removeAllQueryParameters(name);
            addQueryParameter(name, value);
            return this;
        }

        public final void setScheme$okhttp(@Nullable String str) {
            this.scheme = str;
        }

        /* JADX WARN: Code duplicated, block: B:32:0x008f  */
        @NotNull
        public String toString() {
            StringBuilder sb2 = new StringBuilder();
            String str = this.scheme;
            if (str != null) {
                sb2.append(str);
                sb2.append("://");
            } else {
                sb2.append("//");
            }
            if (this.encodedUsername.length() > 0 || this.encodedPassword.length() > 0) {
                sb2.append(this.encodedUsername);
                if (this.encodedPassword.length() > 0) {
                    sb2.append(AbstractJsonLexerKt.COLON);
                    sb2.append(this.encodedPassword);
                }
                sb2.append('@');
            }
            String str2 = this.host;
            if (str2 != null) {
                Intrinsics.checkNotNull(str2);
                if (StringsKt__StringsKt.contains$default((CharSequence) str2, AbstractJsonLexerKt.COLON, false, 2, (Object) null)) {
                    sb2.append(AbstractJsonLexerKt.BEGIN_LIST);
                    sb2.append(this.host);
                    sb2.append(AbstractJsonLexerKt.END_LIST);
                } else {
                    sb2.append(this.host);
                }
            }
            int iDefaultPort = this.port;
            if (iDefaultPort != -1 || this.scheme != null) {
                if (iDefaultPort == -1) {
                    Companion companion = HttpUrl.INSTANCE;
                    String str3 = this.scheme;
                    Intrinsics.checkNotNull(str3);
                    iDefaultPort = companion.defaultPort(str3);
                }
                String str4 = this.scheme;
                if (str4 != null) {
                    Companion companion2 = HttpUrl.INSTANCE;
                    Intrinsics.checkNotNull(str4);
                    if (iDefaultPort != companion2.defaultPort(str4)) {
                        sb2.append(AbstractJsonLexerKt.COLON);
                        sb2.append(iDefaultPort);
                    }
                } else {
                    sb2.append(AbstractJsonLexerKt.COLON);
                    sb2.append(iDefaultPort);
                }
            }
            Companion companion3 = HttpUrl.INSTANCE;
            companion3.toPathString$okhttp(this.f85569f, sb2);
            if (this.encodedQueryNamesAndValues != null) {
                sb2.append('?');
                List<String> list = this.encodedQueryNamesAndValues;
                Intrinsics.checkNotNull(list);
                companion3.toQueryString$okhttp(list, sb2);
            }
            if (this.encodedFragment != null) {
                sb2.append(MaskTextWatcher.WILDCARD);
                sb2.append(this.encodedFragment);
            }
            String string = sb2.toString();
            Intrinsics.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
            return string;
        }

        @NotNull
        public final Builder username(@NotNull String username) {
            Intrinsics.checkNotNullParameter(username, "username");
            this.encodedUsername = Companion.canonicalize$okhttp$default(HttpUrl.INSTANCE, username, 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, null, 251, null);
            return this;
        }
    }

    /* JADX INFO: compiled from: HttpUrl.kt */
    @Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0019\n\u0002\b\r\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\bA\u0010BJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J%\u0010\r\u001a\u00020\n*\b\u0012\u0004\u0012\u00020\u00020\u00062\n\u0010\t\u001a\u00060\u0007j\u0002`\bH\u0000¢\u0006\u0004\b\u000b\u0010\fJ'\u0010\u000f\u001a\u00020\n*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00062\n\u0010\t\u001a\u00060\u0007j\u0002`\bH\u0000¢\u0006\u0004\b\u000e\u0010\fJ\u001b\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0010*\u00020\u0002H\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\u0013\u0010\u0017\u001a\u00020\u0014*\u00020\u0002H\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0019\u001a\u0004\u0018\u00010\u0014*\u00020\u0002H\u0007¢\u0006\u0004\b\u0018\u0010\u0016J\u0015\u0010\u0019\u001a\u0004\u0018\u00010\u0014*\u00020\u001aH\u0007¢\u0006\u0004\b\u0015\u0010\u001bJ\u0015\u0010\u0019\u001a\u0004\u0018\u00010\u0014*\u00020\u001cH\u0007¢\u0006\u0004\b\u0015\u0010\u001dJ\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u001e\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u001f\u0010\u0016J\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u001e\u001a\u00020\u0002H\u0007¢\u0006\u0004\b \u0010\u0016J\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u001e\u001a\u00020\u001aH\u0007¢\u0006\u0004\b\u001f\u0010\u001bJ\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010!\u001a\u00020\u001cH\u0007¢\u0006\u0004\b\u001f\u0010\u001dJ1\u0010(\u001a\u00020\u0002*\u00020\u00022\b\b\u0002\u0010\"\u001a\u00020\u00042\b\b\u0002\u0010#\u001a\u00020\u00042\b\b\u0002\u0010%\u001a\u00020$H\u0000¢\u0006\u0004\b&\u0010'Jc\u00101\u001a\u00020\u0002*\u00020\u00022\b\b\u0002\u0010\"\u001a\u00020\u00042\b\b\u0002\u0010#\u001a\u00020\u00042\u0006\u0010)\u001a\u00020\u00022\b\b\u0002\u0010*\u001a\u00020$2\b\b\u0002\u0010+\u001a\u00020$2\b\b\u0002\u0010%\u001a\u00020$2\b\b\u0002\u0010,\u001a\u00020$2\n\b\u0002\u0010.\u001a\u0004\u0018\u00010-H\u0000¢\u0006\u0004\b/\u00100R\u0014\u00102\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b2\u00103R\u0014\u00104\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b4\u00103R\u0014\u00105\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b5\u00103R\u0014\u00107\u001a\u0002068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u00109\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b9\u00103R\u0014\u0010:\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b:\u00103R\u0014\u0010;\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b;\u00103R\u0014\u0010<\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b<\u00103R\u0014\u0010=\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b=\u00103R\u0014\u0010>\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b>\u00103R\u0014\u0010?\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b?\u00103R\u0014\u0010@\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b@\u00103¨\u0006C"}, d2 = {"Lokhttp3/HttpUrl$Companion;", "", "", "scheme", "", "defaultPort", "", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "out", "", "toPathString$okhttp", "(Ljava/util/List;Ljava/lang/StringBuilder;)V", "toPathString", "toQueryString$okhttp", "toQueryString", "", "toQueryNamesAndValues$okhttp", "(Ljava/lang/String;)Ljava/util/List;", "toQueryNamesAndValues", "Lokhttp3/HttpUrl;", "get", "(Ljava/lang/String;)Lokhttp3/HttpUrl;", "toHttpUrl", "parse", "toHttpUrlOrNull", "Ljava/net/URL;", "(Ljava/net/URL;)Lokhttp3/HttpUrl;", "Ljava/net/URI;", "(Ljava/net/URI;)Lokhttp3/HttpUrl;", "url", "-deprecated_get", "-deprecated_parse", "uri", "pos", "limit", "", "plusIsSpace", "percentDecode$okhttp", "(Ljava/lang/String;IIZ)Ljava/lang/String;", "percentDecode", "encodeSet", "alreadyEncoded", "strict", "unicodeAllowed", "Ljava/nio/charset/Charset;", "charset", "canonicalize$okhttp", "(Ljava/lang/String;IILjava/lang/String;ZZZZLjava/nio/charset/Charset;)Ljava/lang/String;", "canonicalize", "FORM_ENCODE_SET", "Ljava/lang/String;", "FRAGMENT_ENCODE_SET", "FRAGMENT_ENCODE_SET_URI", "", "HEX_DIGITS", "[C", "PASSWORD_ENCODE_SET", "PATH_SEGMENT_ENCODE_SET", "PATH_SEGMENT_ENCODE_SET_URI", "QUERY_COMPONENT_ENCODE_SET", "QUERY_COMPONENT_ENCODE_SET_URI", "QUERY_COMPONENT_REENCODE_SET", "QUERY_ENCODE_SET", "USERNAME_ENCODE_SET", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static boolean a(int i10, int i11, String str) {
            int i12 = i10 + 2;
            return i12 < i11 && str.charAt(i10) == '%' && Util.parseHexDigit(str.charAt(i10 + 1)) != -1 && Util.parseHexDigit(str.charAt(i12)) != -1;
        }

        public static /* synthetic */ String canonicalize$okhttp$default(Companion companion, String str, int i10, int i11, String str2, boolean z10, boolean z11, boolean z12, boolean z13, Charset charset, int i12, Object obj) {
            return companion.canonicalize$okhttp(str, (i12 & 1) != 0 ? 0 : i10, (i12 & 2) != 0 ? str.length() : i11, str2, (i12 & 8) != 0 ? false : z10, (i12 & 16) != 0 ? false : z11, (i12 & 32) != 0 ? false : z12, (i12 & 64) != 0 ? false : z13, (i12 & 128) != 0 ? null : charset);
        }

        public static /* synthetic */ String percentDecode$okhttp$default(Companion companion, String str, int i10, int i11, boolean z10, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                i10 = 0;
            }
            if ((i12 & 2) != 0) {
                i11 = str.length();
            }
            if ((i12 & 4) != 0) {
                z10 = false;
            }
            return companion.percentDecode$okhttp(str, i10, i11, z10);
        }

        @Deprecated(level = DeprecationLevel.ERROR, message = "moved to extension function", replaceWith = @ReplaceWith(expression = "url.toHttpUrl()", imports = {"okhttp3.HttpUrl.Companion.toHttpUrl"}))
        @JvmName(name = "-deprecated_get")
        @NotNull
        /* JADX INFO: renamed from: -deprecated_get, reason: not valid java name */
        public final HttpUrl m6132deprecated_get(@NotNull String url) {
            Intrinsics.checkNotNullParameter(url, "url");
            return get(url);
        }

        @Deprecated(level = DeprecationLevel.ERROR, message = "moved to extension function", replaceWith = @ReplaceWith(expression = "url.toHttpUrlOrNull()", imports = {"okhttp3.HttpUrl.Companion.toHttpUrlOrNull"}))
        @JvmName(name = "-deprecated_parse")
        @Nullable
        /* JADX INFO: renamed from: -deprecated_parse, reason: not valid java name */
        public final HttpUrl m6135deprecated_parse(@NotNull String url) {
            Intrinsics.checkNotNullParameter(url, "url");
            return parse(url);
        }

        @NotNull
        public final String canonicalize$okhttp(@NotNull String str, int i10, int i11, @NotNull String encodeSet, boolean z10, boolean z11, boolean z12, boolean z13, @Nullable Charset charset) throws EOFException {
            Intrinsics.checkNotNullParameter(str, "<this>");
            Intrinsics.checkNotNullParameter(encodeSet, "encodeSet");
            int iCharCount = i10;
            while (iCharCount < i11) {
                int iCodePointAt = str.codePointAt(iCharCount);
                int i12 = 43;
                Object obj = null;
                if (iCodePointAt < 32 || iCodePointAt == 127 || ((iCodePointAt >= 128 && !z13) || StringsKt__StringsKt.contains$default((CharSequence) encodeSet, (char) iCodePointAt, false, 2, (Object) null) || ((iCodePointAt == 37 && (!z10 || (z11 && !a(iCharCount, i11, str)))) || (iCodePointAt == 43 && z12)))) {
                    Buffer buffer = new Buffer();
                    buffer.writeUtf8(str, i10, iCharCount);
                    Buffer buffer2 = null;
                    while (iCharCount < i11) {
                        int iCodePointAt2 = str.codePointAt(iCharCount);
                        if (!z10 || (iCodePointAt2 != 9 && iCodePointAt2 != 10 && iCodePointAt2 != 12 && iCodePointAt2 != 13)) {
                            if (iCodePointAt2 == i12 && z12) {
                                buffer.writeUtf8(z10 ? "+" : "%2B");
                            } else if (iCodePointAt2 < 32 || iCodePointAt2 == 127 || ((iCodePointAt2 >= 128 && !z13) || StringsKt__StringsKt.contains$default((CharSequence) encodeSet, (char) iCodePointAt2, false, 2, obj) || (iCodePointAt2 == 37 && (!z10 || (z11 && !a(iCharCount, i11, str)))))) {
                                if (buffer2 == null) {
                                    buffer2 = new Buffer();
                                }
                                if (charset == null || Intrinsics.areEqual(charset, StandardCharsets.UTF_8)) {
                                    buffer2.writeUtf8CodePoint(iCodePointAt2);
                                } else {
                                    buffer2.writeString(str, iCharCount, Character.charCount(iCodePointAt2) + iCharCount, charset);
                                }
                                while (!buffer2.exhausted()) {
                                    byte b10 = buffer2.readByte();
                                    buffer.writeByte(37);
                                    buffer.writeByte((int) HttpUrl.f85553k[((b10 & 255) >> 4) & 15]);
                                    buffer.writeByte((int) HttpUrl.f85553k[b10 & 15]);
                                }
                            } else {
                                buffer.writeUtf8CodePoint(iCodePointAt2);
                            }
                        }
                        iCharCount += Character.charCount(iCodePointAt2);
                        i12 = 43;
                        obj = null;
                    }
                    return buffer.readUtf8();
                }
                iCharCount += Character.charCount(iCodePointAt);
            }
            String strSubstring = str.substring(i10, i11);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            return strSubstring;
        }

        @JvmStatic
        public final int defaultPort(@NotNull String scheme) {
            Intrinsics.checkNotNullParameter(scheme, "scheme");
            if (Intrinsics.areEqual(scheme, ProxyConfig.MATCH_HTTP)) {
                return 80;
            }
            return Intrinsics.areEqual(scheme, ProxyConfig.MATCH_HTTPS) ? 443 : -1;
        }

        @JvmStatic
        @JvmName(name = "get")
        @NotNull
        public final HttpUrl get(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<this>");
            return new Builder().parse$okhttp(null, str).build();
        }

        @JvmStatic
        @JvmName(name = "parse")
        @Nullable
        public final HttpUrl parse(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<this>");
            try {
                return get(str);
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }

        @NotNull
        public final String percentDecode$okhttp(@NotNull String str, int i10, int i11, boolean z10) {
            int i12;
            Intrinsics.checkNotNullParameter(str, "<this>");
            int iCharCount = i10;
            while (iCharCount < i11) {
                char cCharAt = str.charAt(iCharCount);
                if (cCharAt == '%' || (cCharAt == '+' && z10)) {
                    Buffer buffer = new Buffer();
                    buffer.writeUtf8(str, i10, iCharCount);
                    while (iCharCount < i11) {
                        int iCodePointAt = str.codePointAt(iCharCount);
                        if (iCodePointAt == 37 && (i12 = iCharCount + 2) < i11) {
                            int hexDigit = Util.parseHexDigit(str.charAt(iCharCount + 1));
                            int hexDigit2 = Util.parseHexDigit(str.charAt(i12));
                            if (hexDigit == -1 || hexDigit2 == -1) {
                                buffer.writeUtf8CodePoint(iCodePointAt);
                                iCharCount += Character.charCount(iCodePointAt);
                            } else {
                                buffer.writeByte((hexDigit << 4) + hexDigit2);
                                iCharCount = Character.charCount(iCodePointAt) + i12;
                            }
                        } else if (iCodePointAt == 43 && z10) {
                            buffer.writeByte(32);
                            iCharCount++;
                        } else {
                            buffer.writeUtf8CodePoint(iCodePointAt);
                            iCharCount += Character.charCount(iCodePointAt);
                        }
                    }
                    return buffer.readUtf8();
                }
                iCharCount++;
            }
            String strSubstring = str.substring(i10, i11);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            return strSubstring;
        }

        public final void toPathString$okhttp(@NotNull List<String> list, @NotNull StringBuilder out) {
            Intrinsics.checkNotNullParameter(list, "<this>");
            Intrinsics.checkNotNullParameter(out, "out");
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                out.append(JsonPointer.SEPARATOR);
                out.append(list.get(i10));
            }
        }

        @NotNull
        public final List<String> toQueryNamesAndValues$okhttp(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<this>");
            ArrayList arrayList = new ArrayList();
            int i10 = 0;
            while (i10 <= str.length()) {
                int iIndexOf$default = StringsKt__StringsKt.indexOf$default((CharSequence) str, Typography.amp, i10, false, 4, (Object) null);
                if (iIndexOf$default == -1) {
                    iIndexOf$default = str.length();
                }
                int i11 = iIndexOf$default;
                int iIndexOf$default2 = StringsKt__StringsKt.indexOf$default((CharSequence) str, '=', i10, false, 4, (Object) null);
                if (iIndexOf$default2 == -1 || iIndexOf$default2 > i11) {
                    String strSubstring = str.substring(i10, i11);
                    Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                    arrayList.add(strSubstring);
                    arrayList.add(null);
                } else {
                    String strSubstring2 = str.substring(i10, iIndexOf$default2);
                    Intrinsics.checkNotNullExpressionValue(strSubstring2, "this as java.lang.String…ing(startIndex, endIndex)");
                    arrayList.add(strSubstring2);
                    String strSubstring3 = str.substring(iIndexOf$default2 + 1, i11);
                    Intrinsics.checkNotNullExpressionValue(strSubstring3, "this as java.lang.String…ing(startIndex, endIndex)");
                    arrayList.add(strSubstring3);
                }
                i10 = i11 + 1;
            }
            return arrayList;
        }

        public final void toQueryString$okhttp(@NotNull List<String> list, @NotNull StringBuilder out) {
            Intrinsics.checkNotNullParameter(list, "<this>");
            Intrinsics.checkNotNullParameter(out, "out");
            IntProgression intProgressionStep = c.step(c.until(0, list.size()), 2);
            int first = intProgressionStep.getFirst();
            int last = intProgressionStep.getLast();
            int step = intProgressionStep.getStep();
            if ((step <= 0 || first > last) && (step >= 0 || last > first)) {
                return;
            }
            while (true) {
                String str = list.get(first);
                String str2 = list.get(first + 1);
                if (first > 0) {
                    out.append(Typography.amp);
                }
                out.append(str);
                if (str2 != null) {
                    out.append('=');
                    out.append(str2);
                }
                if (first == last) {
                    return;
                } else {
                    first += step;
                }
            }
        }

        @Deprecated(level = DeprecationLevel.ERROR, message = "moved to extension function", replaceWith = @ReplaceWith(expression = "url.toHttpUrlOrNull()", imports = {"okhttp3.HttpUrl.Companion.toHttpUrlOrNull"}))
        @JvmName(name = "-deprecated_get")
        @Nullable
        /* JADX INFO: renamed from: -deprecated_get, reason: not valid java name */
        public final HttpUrl m6134deprecated_get(@NotNull URL url) {
            Intrinsics.checkNotNullParameter(url, "url");
            return get(url);
        }

        @JvmStatic
        @JvmName(name = "get")
        @Nullable
        public final HttpUrl get(@NotNull URL url) {
            Intrinsics.checkNotNullParameter(url, "<this>");
            String string = url.toString();
            Intrinsics.checkNotNullExpressionValue(string, "toString()");
            return parse(string);
        }

        @Deprecated(level = DeprecationLevel.ERROR, message = "moved to extension function", replaceWith = @ReplaceWith(expression = "uri.toHttpUrlOrNull()", imports = {"okhttp3.HttpUrl.Companion.toHttpUrlOrNull"}))
        @JvmName(name = "-deprecated_get")
        @Nullable
        /* JADX INFO: renamed from: -deprecated_get, reason: not valid java name */
        public final HttpUrl m6133deprecated_get(@NotNull URI uri) {
            Intrinsics.checkNotNullParameter(uri, "uri");
            return get(uri);
        }

        @JvmStatic
        @JvmName(name = "get")
        @Nullable
        public final HttpUrl get(@NotNull URI uri) {
            Intrinsics.checkNotNullParameter(uri, "<this>");
            String string = uri.toString();
            Intrinsics.checkNotNullExpressionValue(string, "toString()");
            return parse(string);
        }
    }

    public HttpUrl(@NotNull String scheme, @NotNull String username, @NotNull String password, @NotNull String host, int i10, @NotNull List<String> pathSegments, @Nullable List<String> list, @Nullable String str, @NotNull String url) {
        Intrinsics.checkNotNullParameter(scheme, "scheme");
        Intrinsics.checkNotNullParameter(username, "username");
        Intrinsics.checkNotNullParameter(password, "password");
        Intrinsics.checkNotNullParameter(host, "host");
        Intrinsics.checkNotNullParameter(pathSegments, "pathSegments");
        Intrinsics.checkNotNullParameter(url, "url");
        this.scheme = scheme;
        this.username = username;
        this.password = password;
        this.host = host;
        this.port = i10;
        this.pathSegments = pathSegments;
        this.f85560g = list;
        this.fragment = str;
        this.f85562i = url;
        this.isHttps = Intrinsics.areEqual(scheme, ProxyConfig.MATCH_HTTPS);
    }

    @JvmStatic
    public static final int defaultPort(@NotNull String str) {
        return INSTANCE.defaultPort(str);
    }

    @JvmStatic
    @JvmName(name = "get")
    @NotNull
    public static final HttpUrl get(@NotNull String str) {
        return INSTANCE.get(str);
    }

    @JvmStatic
    @JvmName(name = "parse")
    @Nullable
    public static final HttpUrl parse(@NotNull String str) {
        return INSTANCE.parse(str);
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "encodedFragment", imports = {}))
    @JvmName(name = "-deprecated_encodedFragment")
    @Nullable
    /* JADX INFO: renamed from: -deprecated_encodedFragment, reason: not valid java name */
    public final String m6113deprecated_encodedFragment() {
        return encodedFragment();
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "encodedPassword", imports = {}))
    @JvmName(name = "-deprecated_encodedPassword")
    @NotNull
    /* JADX INFO: renamed from: -deprecated_encodedPassword, reason: not valid java name */
    public final String m6114deprecated_encodedPassword() {
        return encodedPassword();
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "encodedPath", imports = {}))
    @JvmName(name = "-deprecated_encodedPath")
    @NotNull
    /* JADX INFO: renamed from: -deprecated_encodedPath, reason: not valid java name */
    public final String m6115deprecated_encodedPath() {
        return encodedPath();
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "encodedPathSegments", imports = {}))
    @JvmName(name = "-deprecated_encodedPathSegments")
    @NotNull
    /* JADX INFO: renamed from: -deprecated_encodedPathSegments, reason: not valid java name */
    public final List<String> m6116deprecated_encodedPathSegments() {
        return encodedPathSegments();
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "encodedQuery", imports = {}))
    @JvmName(name = "-deprecated_encodedQuery")
    @Nullable
    /* JADX INFO: renamed from: -deprecated_encodedQuery, reason: not valid java name */
    public final String m6117deprecated_encodedQuery() {
        return encodedQuery();
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "encodedUsername", imports = {}))
    @JvmName(name = "-deprecated_encodedUsername")
    @NotNull
    /* JADX INFO: renamed from: -deprecated_encodedUsername, reason: not valid java name */
    public final String m6118deprecated_encodedUsername() {
        return encodedUsername();
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "fragment", imports = {}))
    @JvmName(name = "-deprecated_fragment")
    @Nullable
    /* JADX INFO: renamed from: -deprecated_fragment, reason: not valid java name and from getter */
    public final String getFragment() {
        return this.fragment;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "host", imports = {}))
    @JvmName(name = "-deprecated_host")
    @NotNull
    /* JADX INFO: renamed from: -deprecated_host, reason: not valid java name and from getter */
    public final String getHost() {
        return this.host;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "password", imports = {}))
    @JvmName(name = "-deprecated_password")
    @NotNull
    /* JADX INFO: renamed from: -deprecated_password, reason: not valid java name and from getter */
    public final String getPassword() {
        return this.password;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "pathSegments", imports = {}))
    @JvmName(name = "-deprecated_pathSegments")
    @NotNull
    /* JADX INFO: renamed from: -deprecated_pathSegments, reason: not valid java name */
    public final List<String> m6122deprecated_pathSegments() {
        return this.pathSegments;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "pathSize", imports = {}))
    @JvmName(name = "-deprecated_pathSize")
    /* JADX INFO: renamed from: -deprecated_pathSize, reason: not valid java name */
    public final int m6123deprecated_pathSize() {
        return pathSize();
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "port", imports = {}))
    @JvmName(name = "-deprecated_port")
    /* JADX INFO: renamed from: -deprecated_port, reason: not valid java name and from getter */
    public final int getPort() {
        return this.port;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = SearchIntents.EXTRA_QUERY, imports = {}))
    @JvmName(name = "-deprecated_query")
    @Nullable
    /* JADX INFO: renamed from: -deprecated_query, reason: not valid java name */
    public final String m6125deprecated_query() {
        return query();
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "queryParameterNames", imports = {}))
    @JvmName(name = "-deprecated_queryParameterNames")
    @NotNull
    /* JADX INFO: renamed from: -deprecated_queryParameterNames, reason: not valid java name */
    public final Set<String> m6126deprecated_queryParameterNames() {
        return queryParameterNames();
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "querySize", imports = {}))
    @JvmName(name = "-deprecated_querySize")
    /* JADX INFO: renamed from: -deprecated_querySize, reason: not valid java name */
    public final int m6127deprecated_querySize() {
        return querySize();
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "scheme", imports = {}))
    @JvmName(name = "-deprecated_scheme")
    @NotNull
    /* JADX INFO: renamed from: -deprecated_scheme, reason: not valid java name and from getter */
    public final String getScheme() {
        return this.scheme;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to toUri()", replaceWith = @ReplaceWith(expression = "toUri()", imports = {}))
    @JvmName(name = "-deprecated_uri")
    @NotNull
    /* JADX INFO: renamed from: -deprecated_uri, reason: not valid java name */
    public final URI m6129deprecated_uri() {
        return uri();
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to toUrl()", replaceWith = @ReplaceWith(expression = "toUrl()", imports = {}))
    @JvmName(name = "-deprecated_url")
    @NotNull
    /* JADX INFO: renamed from: -deprecated_url, reason: not valid java name */
    public final URL m6130deprecated_url() {
        return url();
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = HintConstants.AUTOFILL_HINT_USERNAME, imports = {}))
    @JvmName(name = "-deprecated_username")
    @NotNull
    /* JADX INFO: renamed from: -deprecated_username, reason: not valid java name and from getter */
    public final String getUsername() {
        return this.username;
    }

    @JvmName(name = "encodedFragment")
    @Nullable
    public final String encodedFragment() {
        if (this.fragment == null) {
            return null;
        }
        String strSubstring = this.f85562i.substring(StringsKt__StringsKt.indexOf$default((CharSequence) this.f85562i, MaskTextWatcher.WILDCARD, 0, false, 6, (Object) null) + 1);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String).substring(startIndex)");
        return strSubstring;
    }

    @JvmName(name = "encodedPassword")
    @NotNull
    public final String encodedPassword() {
        if (this.password.length() == 0) {
            return "";
        }
        String strSubstring = this.f85562i.substring(StringsKt__StringsKt.indexOf$default((CharSequence) this.f85562i, AbstractJsonLexerKt.COLON, this.scheme.length() + 3, false, 4, (Object) null) + 1, StringsKt__StringsKt.indexOf$default((CharSequence) this.f85562i, '@', 0, false, 6, (Object) null));
        Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    @JvmName(name = "encodedPath")
    @NotNull
    public final String encodedPath() {
        int iIndexOf$default = StringsKt__StringsKt.indexOf$default((CharSequence) this.f85562i, JsonPointer.SEPARATOR, this.scheme.length() + 3, false, 4, (Object) null);
        String str = this.f85562i;
        String strSubstring = str.substring(iIndexOf$default, Util.delimiterOffset(str, "?#", iIndexOf$default, str.length()));
        Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    @JvmName(name = "encodedPathSegments")
    @NotNull
    public final List<String> encodedPathSegments() {
        int iIndexOf$default = StringsKt__StringsKt.indexOf$default((CharSequence) this.f85562i, JsonPointer.SEPARATOR, this.scheme.length() + 3, false, 4, (Object) null);
        String str = this.f85562i;
        int iDelimiterOffset = Util.delimiterOffset(str, "?#", iIndexOf$default, str.length());
        ArrayList arrayList = new ArrayList();
        while (iIndexOf$default < iDelimiterOffset) {
            int i10 = iIndexOf$default + 1;
            int iDelimiterOffset2 = Util.delimiterOffset(str, JsonPointer.SEPARATOR, i10, iDelimiterOffset);
            String strSubstring = str.substring(i10, iDelimiterOffset2);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            arrayList.add(strSubstring);
            iIndexOf$default = iDelimiterOffset2;
        }
        return arrayList;
    }

    @JvmName(name = "encodedQuery")
    @Nullable
    public final String encodedQuery() {
        if (this.f85560g == null) {
            return null;
        }
        int iIndexOf$default = StringsKt__StringsKt.indexOf$default((CharSequence) this.f85562i, '?', 0, false, 6, (Object) null) + 1;
        String str = this.f85562i;
        String strSubstring = str.substring(iIndexOf$default, Util.delimiterOffset(str, MaskTextWatcher.WILDCARD, iIndexOf$default, str.length()));
        Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    @JvmName(name = "encodedUsername")
    @NotNull
    public final String encodedUsername() {
        if (this.username.length() == 0) {
            return "";
        }
        int length = this.scheme.length() + 3;
        String str = this.f85562i;
        String strSubstring = str.substring(length, Util.delimiterOffset(str, ":@", length, str.length()));
        Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    public boolean equals(@Nullable Object other) {
        return (other instanceof HttpUrl) && Intrinsics.areEqual(((HttpUrl) other).f85562i, this.f85562i);
    }

    @JvmName(name = "fragment")
    @Nullable
    public final String fragment() {
        return this.fragment;
    }

    public int hashCode() {
        return this.f85562i.hashCode();
    }

    @JvmName(name = "host")
    @NotNull
    public final String host() {
        return this.host;
    }

    /* JADX INFO: renamed from: isHttps, reason: from getter */
    public final boolean getIsHttps() {
        return this.isHttps;
    }

    @NotNull
    public final Builder newBuilder() {
        Builder builder = new Builder();
        String str = this.scheme;
        builder.setScheme$okhttp(str);
        builder.setEncodedUsername$okhttp(encodedUsername());
        builder.setEncodedPassword$okhttp(encodedPassword());
        builder.setHost$okhttp(this.host);
        int iDefaultPort = INSTANCE.defaultPort(str);
        int i10 = this.port;
        if (i10 == iDefaultPort) {
            i10 = -1;
        }
        builder.setPort$okhttp(i10);
        builder.getEncodedPathSegments$okhttp().clear();
        builder.getEncodedPathSegments$okhttp().addAll(encodedPathSegments());
        builder.encodedQuery(encodedQuery());
        builder.setEncodedFragment$okhttp(encodedFragment());
        return builder;
    }

    @JvmName(name = "password")
    @NotNull
    public final String password() {
        return this.password;
    }

    @JvmName(name = "pathSegments")
    @NotNull
    public final List<String> pathSegments() {
        return this.pathSegments;
    }

    @JvmName(name = "pathSize")
    public final int pathSize() {
        return this.pathSegments.size();
    }

    @JvmName(name = "port")
    public final int port() {
        return this.port;
    }

    @JvmName(name = SearchIntents.EXTRA_QUERY)
    @Nullable
    public final String query() {
        List<String> list = this.f85560g;
        if (list == null) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        INSTANCE.toQueryString$okhttp(list, sb2);
        return sb2.toString();
    }

    @Nullable
    public final String queryParameter(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        List<String> list = this.f85560g;
        if (list == null) {
            return null;
        }
        IntProgression intProgressionStep = c.step(c.until(0, list.size()), 2);
        int first = intProgressionStep.getFirst();
        int last = intProgressionStep.getLast();
        int step = intProgressionStep.getStep();
        if ((step > 0 && first <= last) || (step < 0 && last <= first)) {
            while (!Intrinsics.areEqual(name, list.get(first))) {
                if (first != last) {
                    first += step;
                }
            }
            return list.get(first + 1);
        }
        return null;
    }

    @NotNull
    public final String queryParameterName(int index) {
        List<String> list = this.f85560g;
        if (list == null) {
            throw new IndexOutOfBoundsException();
        }
        String str = list.get(index * 2);
        Intrinsics.checkNotNull(str);
        return str;
    }

    @JvmName(name = "queryParameterNames")
    @NotNull
    public final Set<String> queryParameterNames() {
        List<String> list = this.f85560g;
        if (list == null) {
            return w.emptySet();
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        IntProgression intProgressionStep = c.step(c.until(0, list.size()), 2);
        int first = intProgressionStep.getFirst();
        int last = intProgressionStep.getLast();
        int step = intProgressionStep.getStep();
        if ((step > 0 && first <= last) || (step < 0 && last <= first)) {
            while (true) {
                String str = list.get(first);
                Intrinsics.checkNotNull(str);
                linkedHashSet.add(str);
                if (first == last) {
                    break;
                }
                first += step;
            }
        }
        Set<String> setUnmodifiableSet = Collections.unmodifiableSet(linkedHashSet);
        Intrinsics.checkNotNullExpressionValue(setUnmodifiableSet, "unmodifiableSet(result)");
        return setUnmodifiableSet;
    }

    @Nullable
    public final String queryParameterValue(int index) {
        List<String> list = this.f85560g;
        if (list != null) {
            return list.get((index * 2) + 1);
        }
        throw new IndexOutOfBoundsException();
    }

    @NotNull
    public final List<String> queryParameterValues(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        List<String> list = this.f85560g;
        if (list == null) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        IntProgression intProgressionStep = c.step(c.until(0, list.size()), 2);
        int first = intProgressionStep.getFirst();
        int last = intProgressionStep.getLast();
        int step = intProgressionStep.getStep();
        if ((step > 0 && first <= last) || (step < 0 && last <= first)) {
            while (true) {
                if (Intrinsics.areEqual(name, list.get(first))) {
                    arrayList.add(list.get(first + 1));
                }
                if (first == last) {
                    break;
                }
                first += step;
            }
        }
        List<String> listUnmodifiableList = Collections.unmodifiableList(arrayList);
        Intrinsics.checkNotNullExpressionValue(listUnmodifiableList, "unmodifiableList(result)");
        return listUnmodifiableList;
    }

    @JvmName(name = "querySize")
    public final int querySize() {
        List<String> list = this.f85560g;
        if (list != null) {
            return list.size() / 2;
        }
        return 0;
    }

    @NotNull
    public final String redact() {
        Builder builderNewBuilder = newBuilder("/...");
        Intrinsics.checkNotNull(builderNewBuilder);
        return builderNewBuilder.username("").password("").build().getF85562i();
    }

    @Nullable
    public final HttpUrl resolve(@NotNull String link) {
        Intrinsics.checkNotNullParameter(link, "link");
        Builder builderNewBuilder = newBuilder(link);
        if (builderNewBuilder != null) {
            return builderNewBuilder.build();
        }
        return null;
    }

    @JvmName(name = "scheme")
    @NotNull
    public final String scheme() {
        return this.scheme;
    }

    @NotNull
    /* JADX INFO: renamed from: toString, reason: from getter */
    public String getF85562i() {
        return this.f85562i;
    }

    @Nullable
    public final String topPrivateDomain() {
        String str = this.host;
        if (Util.canParseAsIpAddress(str)) {
            return null;
        }
        return PublicSuffixDatabase.INSTANCE.get().getEffectiveTldPlusOne(str);
    }

    @JvmName(name = "uri")
    @NotNull
    public final URI uri() {
        String string = newBuilder().reencodeForUri$okhttp().toString();
        try {
            return new URI(string);
        } catch (URISyntaxException e5) {
            try {
                URI uriCreate = URI.create(new Regex("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]").replace(string, ""));
                Intrinsics.checkNotNullExpressionValue(uriCreate, "{\n      // Unlikely edge…Unexpected!\n      }\n    }");
                return uriCreate;
            } catch (Exception unused) {
                throw new RuntimeException(e5);
            }
        }
    }

    @JvmName(name = "url")
    @NotNull
    public final URL url() {
        try {
            return new URL(this.f85562i);
        } catch (MalformedURLException e5) {
            throw new RuntimeException(e5);
        }
    }

    @JvmName(name = HintConstants.AUTOFILL_HINT_USERNAME)
    @NotNull
    public final String username() {
        return this.username;
    }

    @JvmStatic
    @JvmName(name = "get")
    @Nullable
    public static final HttpUrl get(@NotNull URI uri) {
        return INSTANCE.get(uri);
    }

    @JvmStatic
    @JvmName(name = "get")
    @Nullable
    public static final HttpUrl get(@NotNull URL url) {
        return INSTANCE.get(url);
    }

    @Nullable
    public final Builder newBuilder(@NotNull String link) {
        Intrinsics.checkNotNullParameter(link, "link");
        try {
            return new Builder().parse$okhttp(this, link);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }
}
