package okhttp3.internal.http;

import androidx.camera.core.impl.utils.c;
import bk.q;
import com.bbva.library.digipassmanager.constants.DigipassManagerConstants;
import java.io.EOFException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.io.encoding.Base64;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.l;
import okhttp3.Challenge;
import okhttp3.Cookie;
import okhttp3.CookieJar;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.Response;
import okhttp3.internal.Util;
import okhttp3.internal.platform.Platform;
import okio.Buffer;
import okio.ByteString;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: HttpHeaders.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u001a\u0018\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001\u001a\u001a\u0010\u000b\u001a\u00020\n*\u00020\u00062\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0000\u001a\n\u0010\u000e\u001a\u00020\r*\u00020\f\u001a\u0010\u0010\u0010\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\fH\u0007¨\u0006\u0011"}, d2 = {"Lokhttp3/Headers;", "", "headerName", "", "Lokhttp3/Challenge;", "parseChallenges", "Lokhttp3/CookieJar;", "Lokhttp3/HttpUrl;", "url", "headers", "", "receiveHeaders", "Lokhttp3/Response;", "", "promisesBody", DigipassManagerConstants.KEY_RESPONSE, "hasBody", "okhttp"}, k = 2, mv = {1, 8, 0})
@JvmName(name = "HttpHeaders")
public final class HttpHeaders {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final ByteString f85871a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final ByteString f85872b;

    static {
        ByteString.Companion companion = ByteString.INSTANCE;
        f85871a = companion.encodeUtf8("\"\\");
        f85872b = companion.encodeUtf8("\t ,=");
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0084  */
    /* JADX WARN: Code duplicated, block: B:52:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:76:0x010c A[EDGE_INSN: B:76:0x010c->B:64:0x010c BREAK  A[LOOP:2: B:22:0x0071->B:63:0x0109], SYNTHETIC] */
    public static final void a(Buffer buffer, ArrayList arrayList) throws EOFException {
        String strB;
        while (true) {
            String strB2 = null;
            while (true) {
                if (strB2 == null) {
                    c(buffer);
                    strB2 = b(buffer);
                    if (strB2 == null) {
                        return;
                    }
                }
                boolean zC = c(buffer);
                String strB3 = b(buffer);
                if (strB3 == null) {
                    if (buffer.exhausted()) {
                        arrayList.add(new Challenge(strB2, (Map<String, String>) q.emptyMap()));
                        return;
                    }
                    return;
                }
                int iSkipAll = Util.skipAll(buffer, Base64.padSymbol);
                boolean zC2 = c(buffer);
                if (zC || !(zC2 || buffer.exhausted())) {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    int iSkipAll2 = Util.skipAll(buffer, Base64.padSymbol) + iSkipAll;
                    while (true) {
                        if (strB3 != null) {
                            if (iSkipAll2 != 0) {
                                break;
                                break;
                            }
                            if (iSkipAll2 <= 1) {
                                return;
                            }
                            if (buffer.exhausted()) {
                                strB = b(buffer);
                            } else {
                                strB = b(buffer);
                            }
                            if (strB != null) {
                                return;
                            }
                            if (c(buffer)) {
                            }
                            strB3 = null;
                        } else {
                            strB3 = b(buffer);
                            if (!c(buffer)) {
                                iSkipAll2 = Util.skipAll(buffer, Base64.padSymbol);
                                if (iSkipAll2 != 0) {
                                    break;
                                }
                                if (iSkipAll2 <= 1 || c(buffer)) {
                                    return;
                                }
                                if (buffer.exhausted() || buffer.getByte(0L) != 34) {
                                    strB = b(buffer);
                                } else {
                                    if (buffer.readByte() != 34) {
                                        throw new IllegalArgumentException("Failed requirement.".toString());
                                    }
                                    Buffer buffer2 = new Buffer();
                                    while (true) {
                                        long jIndexOfElement = buffer.indexOfElement(f85871a);
                                        if (jIndexOfElement != -1) {
                                            if (buffer.getByte(jIndexOfElement) == 34) {
                                                buffer2.write(buffer, jIndexOfElement);
                                                buffer.readByte();
                                                strB = buffer2.readUtf8();
                                                break;
                                            } else if (buffer.size() != jIndexOfElement + 1) {
                                                buffer2.write(buffer, jIndexOfElement);
                                                buffer.readByte();
                                                buffer2.write(buffer, 1L);
                                            }
                                        }
                                        strB = null;
                                        break;
                                    }
                                }
                                if (strB != null || ((String) linkedHashMap.put(strB3, strB)) != null) {
                                    return;
                                }
                                if (c(buffer) && !buffer.exhausted()) {
                                    return;
                                } else {
                                    strB3 = null;
                                }
                            } else {
                                break;
                            }
                        }
                    }
                    arrayList.add(new Challenge(strB2, linkedHashMap));
                    strB2 = strB3;
                } else {
                    StringBuilder sbD = c.d(strB3);
                    sbD.append(l.repeat("=", iSkipAll));
                    Map mapSingletonMap = Collections.singletonMap(null, sbD.toString());
                    Intrinsics.checkNotNullExpressionValue(mapSingletonMap, "singletonMap<String, Str…ek + \"=\".repeat(eqCount))");
                    arrayList.add(new Challenge(strB2, (Map<String, String>) mapSingletonMap));
                }
            }
        }
    }

    public static final String b(Buffer buffer) {
        long jIndexOfElement = buffer.indexOfElement(f85872b);
        if (jIndexOfElement == -1) {
            jIndexOfElement = buffer.size();
        }
        if (jIndexOfElement != 0) {
            return buffer.readUtf8(jIndexOfElement);
        }
        return null;
    }

    public static final boolean c(Buffer buffer) throws EOFException {
        boolean z10 = false;
        while (!buffer.exhausted()) {
            byte b10 = buffer.getByte(0L);
            if (b10 == 44) {
                buffer.readByte();
                z10 = true;
            } else {
                if (b10 != 32 && b10 != 9) {
                    break;
                }
                buffer.readByte();
            }
        }
        return z10;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "No longer supported", replaceWith = @ReplaceWith(expression = "response.promisesBody()", imports = {}))
    public static final boolean hasBody(@NotNull Response response) {
        Intrinsics.checkNotNullParameter(response, "response");
        return promisesBody(response);
    }

    @NotNull
    public static final List<Challenge> parseChallenges(@NotNull Headers headers, @NotNull String headerName) {
        Intrinsics.checkNotNullParameter(headers, "<this>");
        Intrinsics.checkNotNullParameter(headerName, "headerName");
        ArrayList arrayList = new ArrayList();
        int size = headers.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (l.equals(headerName, headers.name(i10), true)) {
                try {
                    a(new Buffer().writeUtf8(headers.value(i10)), arrayList);
                } catch (EOFException e5) {
                    Platform.INSTANCE.get().log("Unable to parse challenge", 5, e5);
                }
            }
        }
        return arrayList;
    }

    public static final boolean promisesBody(@NotNull Response response) {
        Intrinsics.checkNotNullParameter(response, "<this>");
        if (Intrinsics.areEqual(response.request().method(), "HEAD")) {
            return false;
        }
        int iCode = response.code();
        return (((iCode >= 100 && iCode < 200) || iCode == 204 || iCode == 304) && Util.headersContentLength(response) == -1 && !l.equals("chunked", Response.header$default(response, "Transfer-Encoding", null, 2, null), true)) ? false : true;
    }

    public static final void receiveHeaders(@NotNull CookieJar cookieJar, @NotNull HttpUrl url, @NotNull Headers headers) {
        Intrinsics.checkNotNullParameter(cookieJar, "<this>");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(headers, "headers");
        if (cookieJar == CookieJar.NO_COOKIES) {
            return;
        }
        List<Cookie> all = Cookie.INSTANCE.parseAll(url, headers);
        if (all.isEmpty()) {
            return;
        }
        cookieJar.saveFromResponse(url, all);
    }
}
