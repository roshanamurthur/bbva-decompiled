package com.mypinpad.tsdk.isolation;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.webkit.ProxyConfig;
import com.bbva.cellswidgets.MaskTextWatcher;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.sdkcatalog.openpay.plugin.data.error.ErrorCodes;
import com.bbva.sl.ar.android.libkeymanagement.exception.ReturnCode;
import com.bbva.sl.ar.core.libmcrypt.impl.LibMCryptConstants;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import com.fasterxml.jackson.core.JsonPointer;
import java.io.EOFException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.JvmName;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntProgression;
import kotlin.ranges.c;
import kotlin.text.Regex;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.Typography;
import kotlin.text.l;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import mx.openpay.library.domain.util.Constant;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010 \n\u0002\b\u0015\u0018\u0000 \u001e2\u00020\u0001:\u0002\u0016\u001eBc\b\u0000\u0012\u0006\u0010\u000b\u001a\u00020\b\u0012\u0006\u0010,\u001a\u00020\b\u0012\u0006\u0010-\u001a\u00020\b\u0012\u0006\u0010.\u001a\u00020\b\u0012\u0006\u0010/\u001a\u00020\u0010\u0012\f\u00100\u001a\b\u0012\u0004\u0012\u00020\b0 \u0012\u0010\u00101\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010 \u0012\b\u00102\u001a\u0004\u0018\u00010\b\u0012\u0006\u00103\u001a\u00020\b¢\u0006\u0004\b4\u00105J\u000f\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u000b\u001a\u00020\bH\u0007¢\u0006\u0004\b\u0003\u0010\fJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\bH\u0017¢\u0006\u0004\b\u0013\u0010\nR\u001a\u0010\u0017\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\nR\u0011\u0010\u0018\u001a\u00020\bX\u0007¢\u0006\u0006\n\u0004\b\u0003\u0010\u0015R\u0011\u0010\u0006\u001a\u00020\bX\u0007¢\u0006\u0006\n\u0004\b\u0016\u0010\u0015R\u001a\u0010\u001b\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u0015\u001a\u0004\b\u001a\u0010\nR\u001a\u0010\u001f\u001a\u00020\u00108\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u0012R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0 X\u0007¢\u0006\u0006\n\u0004\b!\u0010\"R\u0013\u0010#\u001a\u0004\u0018\u00010\bX\u0007¢\u0006\u0006\n\u0004\b\u001a\u0010\u0015R\u001a\u0010'\u001a\u00020\r8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b!\u0010&R\u0011\u0010(\u001a\u00020\b8G¢\u0006\u0006\u001a\u0004\b\u001b\u0010\nR\u0011\u0010!\u001a\u00020\b8G¢\u0006\u0006\u001a\u0004\b(\u0010\nR\u0011\u0010\u001e\u001a\u00020\b8G¢\u0006\u0006\u001a\u0004\b'\u0010\nR\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\b0 8G¢\u0006\u0006\u001a\u0004\b#\u0010)R\u0013\u0010\u001a\u001a\u0004\u0018\u00010\b8G¢\u0006\u0006\u001a\u0004\b*\u0010\nR\u0013\u0010+\u001a\u0004\u0018\u00010\b8G¢\u0006\u0006\u001a\u0004\b\u0017\u0010\n"}, d2 = {"Lcom/mypinpad/tsdk/i/yg;", "", "Ljava/net/URL;", "setY", "()Ljava/net/URL;", "Ljava/net/URI;", "setLayoutAnimation", "()Ljava/net/URI;", "", "setIncludeFontPadding", "()Ljava/lang/String;", "p0", "(Ljava/lang/String;)Lcom/mypinpad/tsdk/i/yg;", "", "equals", "(Ljava/lang/Object;)Z", "", GenerateActivationFormCommand.HASH_CODE, "()I", "toString", "a", "Ljava/lang/String;", "setDividerPadding", "setTextAlignment", "getAmountFieldTextColor", "b", "setX", "setOnLongClickListener", "c", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "setCompoundDrawableTintBlendMode", "setAlwaysDrawnWithCacheEnabled", "", "setOnFocusChangeListener", "Ljava/util/List;", "setNavigationOnClickListener", "f", "Z", "()Z", "getNavBarTitleString", "setOnDragListener", "()Ljava/util/List;", "setZ", "UiMessageCallbackKtWhenMappings", "p1", "p2", "p3", "p4", "p5", "p6", "p7", "p8", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V"}, k = 1, mv = {1, 6, 0})
public final class yg {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static int f62064h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static int f62065i = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String setTextAlignment;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String setOnLongClickListener;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final int setAlwaysDrawnWithCacheEnabled;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public final List<String> f62069d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final String f62070e;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    public final boolean getNavBarTitleString;

    /* JADX INFO: renamed from: setDividerPadding, reason: from kotlin metadata */
    @NotNull
    public String setLayoutAnimation;

    /* JADX INFO: renamed from: setOnFocusChangeListener, reason: from kotlin metadata */
    @NotNull
    public List<String> setIncludeFontPadding;

    /* JADX INFO: renamed from: setX, reason: from kotlin metadata */
    @Nullable
    public String setNavigationOnClickListener;

    /* JADX INFO: renamed from: setY, reason: from kotlin metadata */
    @NotNull
    public String getAmountFieldTextColor;

    /* JADX INFO: renamed from: setCompoundDrawableTintBlendMode, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public static final char[] f62063g = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* JADX INFO: renamed from: com.mypinpad.tsdk.i.yg$setCompoundDrawableTintBlendMode, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0019\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0004H\u0007J\u0017\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0007¢\u0006\u0002\b\u0018J\u0017\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0019\u001a\u00020\u001aH\u0007¢\u0006\u0002\b\u0018J\u0015\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u0004H\u0007¢\u0006\u0002\b\u0018J\u0017\u0010\u001b\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0019\u001a\u00020\u0004H\u0007¢\u0006\u0002\b\u001cJa\u0010\u001d\u001a\u00020\u0004*\u00020\u00042\b\b\u0002\u0010\u001e\u001a\u00020\u00122\b\b\u0002\u0010\u001f\u001a\u00020\u00122\u0006\u0010 \u001a\u00020\u00042\b\b\u0002\u0010!\u001a\u00020\"2\b\b\u0002\u0010#\u001a\u00020\"2\b\b\u0002\u0010$\u001a\u00020\"2\b\b\u0002\u0010%\u001a\u00020\"2\n\b\u0002\u0010&\u001a\u0004\u0018\u00010'H\u0000¢\u0006\u0002\b(J\u001c\u0010)\u001a\u00020\"*\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u00122\u0006\u0010\u001f\u001a\u00020\u0012H\u0002J/\u0010*\u001a\u00020\u0004*\u00020\u00042\b\b\u0002\u0010\u001e\u001a\u00020\u00122\b\b\u0002\u0010\u001f\u001a\u00020\u00122\b\b\u0002\u0010$\u001a\u00020\"H\u0000¢\u0006\u0002\b+J\u0011\u0010,\u001a\u00020\u0015*\u00020\u0004H\u0007¢\u0006\u0002\b\u0014J\u0013\u0010-\u001a\u0004\u0018\u00010\u0015*\u00020\u0017H\u0007¢\u0006\u0002\b\u0014J\u0013\u0010-\u001a\u0004\u0018\u00010\u0015*\u00020\u001aH\u0007¢\u0006\u0002\b\u0014J\u0013\u0010-\u001a\u0004\u0018\u00010\u0015*\u00020\u0004H\u0007¢\u0006\u0002\b\u001bJ#\u0010.\u001a\u00020/*\b\u0012\u0004\u0012\u00020\u0004002\n\u00101\u001a\u000602j\u0002`3H\u0000¢\u0006\u0002\b4J\u0019\u00105\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000406*\u00020\u0004H\u0000¢\u0006\u0002\b7J%\u00108\u001a\u00020/*\n\u0012\u0006\u0012\u0004\u0018\u00010\u0004002\n\u00101\u001a\u000602j\u0002`3H\u0000¢\u0006\u0002\b9JV\u0010:\u001a\u00020/*\u00020;2\u0006\u0010<\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u00122\u0006\u0010\u001f\u001a\u00020\u00122\u0006\u0010 \u001a\u00020\u00042\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\"2\u0006\u0010%\u001a\u00020\"2\b\u0010&\u001a\u0004\u0018\u00010'H\u0002J,\u0010=\u001a\u00020/*\u00020;2\u0006\u0010>\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u00122\u0006\u0010\u001f\u001a\u00020\u00122\u0006\u0010$\u001a\u00020\"H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000¨\u0006?"}, d2 = {"Lokhttp3/HttpUrl$Companion;", "", "()V", "FORM_ENCODE_SET", "", "FRAGMENT_ENCODE_SET", "FRAGMENT_ENCODE_SET_URI", "HEX_DIGITS", "", "PASSWORD_ENCODE_SET", "PATH_SEGMENT_ENCODE_SET", "PATH_SEGMENT_ENCODE_SET_URI", "QUERY_COMPONENT_ENCODE_SET", "QUERY_COMPONENT_ENCODE_SET_URI", "QUERY_COMPONENT_REENCODE_SET", "QUERY_ENCODE_SET", "USERNAME_ENCODE_SET", "defaultPort", "", "scheme", "get", "Lokhttp3/HttpUrl;", "uri", "Ljava/net/URI;", "-deprecated_get", "url", "Ljava/net/URL;", "parse", "-deprecated_parse", "canonicalize", "pos", "limit", "encodeSet", "alreadyEncoded", "", "strict", "plusIsSpace", "unicodeAllowed", "charset", "Ljava/nio/charset/Charset;", "canonicalize$okhttp", "isPercentEncoded", "percentDecode", "percentDecode$okhttp", "toHttpUrl", "toHttpUrlOrNull", "toPathString", "", "", "out", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "toPathString$okhttp", "toQueryNamesAndValues", "", "toQueryNamesAndValues$okhttp", "toQueryString", "toQueryString$okhttp", "writeCanonicalized", "Lokio/Buffer;", "input", "writePercentDecoded", "encoded", "okhttp"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static int f62072a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static int f62073b = 1;

        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ String a(Object[] objArr) {
            String str = (String) objArr[1];
            int iIntValue = ((Number) objArr[2]).intValue();
            int iIntValue2 = ((Number) objArr[3]).intValue();
            boolean zBooleanValue = ((Boolean) objArr[4]).booleanValue();
            int iIntValue3 = ((Number) objArr[5]).intValue();
            int i10 = f62072a;
            int i11 = ((i10 | 51) << 1) - (i10 ^ 51);
            int i12 = i11 % 128;
            f62073b = i12;
            int i13 = i11 % 2;
            if ((iIntValue3 & 1) != 0) {
                int i14 = (i12 & 94) + (i12 | 94);
                int i15 = (i14 ^ (-1)) + (i14 << 1);
                int i16 = i15 % 128;
                f62072a = i16;
                int i17 = i15 % 2;
                int i18 = (i16 ^ 121) + ((i16 & 121) << 1);
                f62073b = i18 % 128;
                int i19 = i18 % 2;
                iIntValue = 0;
            }
            if ((iIntValue3 & 2) != 0) {
                int i20 = f62072a;
                int i21 = i20 & 9;
                int i22 = (i21 - (~(-(-((i20 ^ 9) | i21))))) - 1;
                f62073b = i22 % 128;
                int i23 = i22 % 2;
                iIntValue2 = str.length();
                int i24 = (-2) - ((f62073b + 54) ^ (-1));
                f62072a = i24 % 128;
                int i25 = i24 % 2;
            }
            if ((iIntValue3 & 4) != 0) {
                int i26 = f62072a;
                int i27 = ((i26 | 105) << 1) - (i26 ^ 105);
                f62073b = i27 % 128;
                int i28 = i27 % 2;
                int i29 = i26 + 123;
                f62073b = i29 % 128;
                int i30 = i29 % 2;
                zBooleanValue = false;
            }
            String str2 = (String) setDividerPadding(new Object[]{str, Integer.valueOf(iIntValue), Integer.valueOf(iIntValue2), Boolean.valueOf(zBooleanValue)}, 1275710359, -1275710349, iIntValue);
            int i31 = f62073b;
            int i32 = i31 & 73;
            int i33 = i32 + ((i31 ^ 73) | i32);
            f62072a = i33 % 128;
            if (i33 % 2 == 0) {
                return str2;
            }
            throw null;
        }

        /* JADX WARN: Code duplicated, block: B:13:0x00a3  */
        /* JADX WARN: Code duplicated, block: B:15:0x00a7  */
        /* JADX WARN: Code duplicated, block: B:18:0x00c0  */
        /* JADX WARN: Code duplicated, block: B:20:0x00c8  */
        /* JADX WARN: Code duplicated, block: B:22:0x00da  */
        /* JADX WARN: Code duplicated, block: B:25:0x00df  */
        /* JADX WARN: Code duplicated, block: B:38:0x013b  */
        /* JADX WARN: Code duplicated, block: B:40:0x013f  */
        /* JADX WARN: Code duplicated, block: B:42:0x0152 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:58:0x017c A[EDGE_INSN: B:58:0x017c->B:47:0x017c BREAK  A[LOOP:0: B:3:0x0073->B:46:0x0157], SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:59:0x017c A[EDGE_INSN: B:59:0x017c->B:47:0x017c BREAK  A[LOOP:0: B:3:0x0073->B:46:0x0157], SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:63:0x0155 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:64:0x017c A[EDGE_INSN: B:64:0x017c->B:47:0x017c BREAK  A[LOOP:0: B:3:0x0073->B:46:0x0157], SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:65:0x0157 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:66:0x0157 A[SYNTHETIC] */
        public static /* synthetic */ String b(Object[] objArr) throws NoSuchAlgorithmException, EOFException {
            int i10;
            int i11;
            String str = (String) objArr[1];
            int iIntValue = ((Number) objArr[2]).intValue();
            int i12 = 3;
            int iIntValue2 = ((Number) objArr[3]).intValue();
            String str2 = (String) objArr[4];
            boolean zBooleanValue = ((Boolean) objArr[5]).booleanValue();
            boolean zBooleanValue2 = ((Boolean) objArr[6]).booleanValue();
            boolean zBooleanValue3 = ((Boolean) objArr[7]).booleanValue();
            boolean zBooleanValue4 = ((Boolean) objArr[8]).booleanValue();
            Charset charset = (Charset) objArr[9];
            int i13 = f62072a;
            int i14 = i13 ^ 71;
            int i15 = -(-((i13 & 71) << 1));
            int i16 = (i14 & i15) + (i14 | i15);
            f62073b = i16 % 128;
            int i17 = i16 % 2;
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            int i18 = f62072a + 59;
            f62073b = i18 % 128;
            int i19 = i18 % 2;
            int i20 = iIntValue;
            while (true) {
                if (i20 >= iIntValue2) {
                    String strSubstring = str.substring(iIntValue, iIntValue2);
                    Intrinsics.checkNotNullExpressionValue(strSubstring, "");
                    int i21 = f62072a;
                    int i22 = ((i21 & (-8)) | ((~i21) & 7)) + ((i21 & 7) << 1);
                    f62073b = i22 % 128;
                    int i23 = i22 % 2;
                    return strSubstring;
                }
                int i24 = f62073b + 113;
                f62072a = i24 % 128;
                int i25 = i24 % 2;
                int iCodePointAt = str.codePointAt(i20);
                if (iCodePointAt < 32) {
                    break;
                }
                int i26 = f62073b;
                int i27 = ((i26 & 3) - (~(-(-(i26 | i12))))) - 1;
                int i28 = i27 % 128;
                f62072a = i28;
                if (i27 % 2 == 0) {
                    if (iCodePointAt == 127) {
                        break;
                    }
                    if (iCodePointAt >= 128) {
                        if (!StringsKt__StringsKt.contains$default((CharSequence) str2, (char) iCodePointAt, false, 2, (Object) null)) {
                            break;
                            break;
                        }
                        int i29 = f62073b;
                        int i30 = i29 & 1;
                        i10 = (i30 - (~(-(-((i29 ^ 1) | i30))))) - 1;
                        int i31 = i10 % 128;
                        f62072a = i31;
                        if (i10 % 2 != 0) {
                        }
                        if (iCodePointAt == 43) {
                            int i32 = f62072a;
                            int i33 = i32 & 125;
                            int i34 = (i32 ^ 125) | i33;
                            i11 = ((i33 | i34) << 1) - (i34 ^ i33);
                            f62073b = i11 % 128;
                            if (i11 % 2 != 0) {
                                throw null;
                            }
                            if (zBooleanValue3) {
                                break;
                                break;
                            }
                        }
                        int i35 = -(-Character.charCount(iCodePointAt));
                        i20 = ((i20 & i35) - (~(-(-(i35 | i20))))) - 1;
                        int i36 = f62073b;
                        int i37 = i36 & 115;
                        int i38 = (i36 ^ 115) | i37;
                        int i39 = ((i37 | i38) << 1) - (i38 ^ i37);
                        f62072a = i39 % 128;
                        int i40 = i39 % 2;
                        i12 = 3;
                    } else {
                        int i41 = (((i28 | 87) << 1) - (~(-((i28 & (-88)) | (87 & (~i28)))))) - 1;
                        f62073b = i41 % 128;
                        int i42 = i41 % 2;
                        if (!zBooleanValue4) {
                            if (!StringsKt__StringsKt.contains$default((CharSequence) str2, (char) iCodePointAt, false, 2, (Object) null)) {
                                break;
                                break;
                            }
                            int i210 = f62073b;
                            int i310 = i210 & 1;
                            i10 = (i310 - (~(-(-((i210 ^ 1) | i310))))) - 1;
                            int i311 = i10 % 128;
                            f62072a = i311;
                            if (i10 % 2 != 0) {
                            }
                            if (iCodePointAt == 43) {
                                int i312 = f62072a;
                                int i313 = i312 & 125;
                                int i314 = (i312 ^ 125) | i313;
                                i11 = ((i313 | i314) << 1) - (i314 ^ i313);
                                f62073b = i11 % 128;
                                if (i11 % 2 != 0) {
                                    throw null;
                                }
                                if (zBooleanValue3) {
                                    break;
                                    break;
                                }
                            }
                            int i315 = -(-Character.charCount(iCodePointAt));
                            i20 = ((i20 & i315) - (~(-(-(i315 | i20))))) - 1;
                            int i316 = f62073b;
                            int i317 = i316 & 115;
                            int i318 = (i316 ^ 115) | i317;
                            int i319 = ((i317 | i318) << 1) - (i318 ^ i317);
                            f62072a = i319 % 128;
                            int i43 = i319 % 2;
                            i12 = 3;
                        } else {
                            break;
                            break;
                        }
                    }
                } else {
                    if (iCodePointAt == 40) {
                        break;
                    }
                    if (iCodePointAt >= 128) {
                        if (!StringsKt__StringsKt.contains$default((CharSequence) str2, (char) iCodePointAt, false, 2, (Object) null)) {
                            break;
                            break;
                        }
                        int i211 = f62073b;
                        int i3110 = i211 & 1;
                        i10 = (i3110 - (~(-(-((i211 ^ 1) | i3110))))) - 1;
                        int i3111 = i10 % 128;
                        f62072a = i3111;
                        if (i10 % 2 != 0) {
                        }
                        if (iCodePointAt == 43) {
                            int i3112 = f62072a;
                            int i3113 = i3112 & 125;
                            int i3114 = (i3112 ^ 125) | i3113;
                            i11 = ((i3113 | i3114) << 1) - (i3114 ^ i3113);
                            f62073b = i11 % 128;
                            if (i11 % 2 != 0) {
                                throw null;
                            }
                            if (zBooleanValue3) {
                                break;
                                break;
                            }
                        }
                        int i3115 = -(-Character.charCount(iCodePointAt));
                        i20 = ((i20 & i3115) - (~(-(-(i3115 | i20))))) - 1;
                        int i3116 = f62073b;
                        int i3117 = i3116 & 115;
                        int i3118 = (i3116 ^ 115) | i3117;
                        int i3119 = ((i3117 | i3118) << 1) - (i3118 ^ i3117);
                        f62072a = i3119 % 128;
                        int i44 = i3119 % 2;
                        i12 = 3;
                    } else {
                        int i45 = (((i28 | 87) << 1) - (~(-((i28 & (-88)) | (87 & (~i28)))))) - 1;
                        f62073b = i45 % 128;
                        int i46 = i45 % 2;
                        if (!zBooleanValue4) {
                            if (!StringsKt__StringsKt.contains$default((CharSequence) str2, (char) iCodePointAt, false, 2, (Object) null)) {
                                break;
                            }
                            int i212 = f62073b;
                            int i31110 = i212 & 1;
                            i10 = (i31110 - (~(-(-((i212 ^ 1) | i31110))))) - 1;
                            int i31111 = i10 % 128;
                            f62072a = i31111;
                            if (i10 % 2 != 0 ? iCodePointAt == 37 : iCodePointAt == 92) {
                                int i47 = i31111 & 89;
                                int i48 = i31111 | 89;
                                int i49 = ((i47 | i48) << 1) - (i47 ^ i48);
                                f62073b = i49 % 128;
                                int i50 = i49 % 2;
                                if (!zBooleanValue) {
                                    break;
                                }
                                int i51 = (i31111 | 59) << 1;
                                int i52 = -(i31111 ^ 59);
                                int i53 = ((i51 | i52) << 1) - (i51 ^ i52);
                                f62073b = i53 % 128;
                                if (i53 % 2 == 0) {
                                    throw null;
                                }
                                if (zBooleanValue2) {
                                    int i54 = i31111 + 39;
                                    f62073b = i54 % 128;
                                    int i55 = i54 % 2;
                                    if (!((Boolean) setDividerPadding(new Object[]{str, Integer.valueOf(i20), Integer.valueOf(iIntValue2)}, 1623322823, -1623322812, i20)).booleanValue()) {
                                        break;
                                    }
                                    if (iCodePointAt == 43) {
                                        int i31112 = f62072a;
                                        int i31113 = i31112 & 125;
                                        int i31114 = (i31112 ^ 125) | i31113;
                                        i11 = ((i31113 | i31114) << 1) - (i31114 ^ i31113);
                                        f62073b = i11 % 128;
                                        if (i11 % 2 != 0) {
                                            throw null;
                                        }
                                        if (zBooleanValue3) {
                                            break;
                                            break;
                                        }
                                    }
                                    int i31115 = -(-Character.charCount(iCodePointAt));
                                    i20 = ((i20 & i31115) - (~(-(-(i31115 | i20))))) - 1;
                                    int i31116 = f62073b;
                                    int i31117 = i31116 & 115;
                                    int i31118 = (i31116 ^ 115) | i31117;
                                    int i31119 = ((i31117 | i31118) << 1) - (i31118 ^ i31117);
                                    f62072a = i31119 % 128;
                                    int i410 = i31119 % 2;
                                    i12 = 3;
                                } else {
                                    if (iCodePointAt == 43) {
                                        int i311110 = f62072a;
                                        int i311111 = i311110 & 125;
                                        int i311112 = (i311110 ^ 125) | i311111;
                                        i11 = ((i311111 | i311112) << 1) - (i311112 ^ i311111);
                                        f62073b = i11 % 128;
                                        if (i11 % 2 != 0) {
                                            throw null;
                                        }
                                        if (zBooleanValue3) {
                                            break;
                                            break;
                                        }
                                    }
                                    int i311113 = -(-Character.charCount(iCodePointAt));
                                    i20 = ((i20 & i311113) - (~(-(-(i311113 | i20))))) - 1;
                                    int i311114 = f62073b;
                                    int i311115 = i311114 & 115;
                                    int i311116 = (i311114 ^ 115) | i311115;
                                    int i311117 = ((i311115 | i311116) << 1) - (i311116 ^ i311115);
                                    f62072a = i311117 % 128;
                                    int i411 = i311117 % 2;
                                    i12 = 3;
                                }
                            } else {
                                if (iCodePointAt == 43) {
                                    int i311118 = f62072a;
                                    int i311119 = i311118 & 125;
                                    int i3111110 = (i311118 ^ 125) | i311119;
                                    i11 = ((i311119 | i3111110) << 1) - (i3111110 ^ i311119);
                                    f62073b = i11 % 128;
                                    if (i11 % 2 != 0) {
                                        throw null;
                                    }
                                    if (zBooleanValue3) {
                                        break;
                                    }
                                }
                                int i3111111 = -(-Character.charCount(iCodePointAt));
                                i20 = ((i20 & i3111111) - (~(-(-(i3111111 | i20))))) - 1;
                                int i3111112 = f62073b;
                                int i3111113 = i3111112 & 115;
                                int i3111114 = (i3111112 ^ 115) | i3111113;
                                int i3111115 = ((i3111113 | i3111114) << 1) - (i3111114 ^ i3111113);
                                f62072a = i3111115 % 128;
                                int i412 = i3111115 % 2;
                                i12 = 3;
                            }
                        } else {
                            break;
                        }
                    }
                }
            }
            abx abxVar = new abx();
            abxVar.setY(str, iIntValue, i20);
            setDividerPadding(new Object[]{abxVar, str, Integer.valueOf(i20), Integer.valueOf(iIntValue2), str2, Boolean.valueOf(zBooleanValue), Boolean.valueOf(zBooleanValue2), Boolean.valueOf(zBooleanValue3), Boolean.valueOf(zBooleanValue4), charset}, -1169498439, 1169498443, i20);
            String textAlignment = abxVar.setTextAlignment();
            int i56 = f62072a;
            int i57 = i56 & 49;
            int i58 = -(-((i56 ^ 49) | i57));
            int i59 = ((i57 | i58) << 1) - (i58 ^ i57);
            f62073b = i59 % 128;
            if (i59 % 2 != 0) {
                return textAlignment;
            }
            throw null;
        }

        /* JADX WARN: Code duplicated, block: B:19:0x00d0  */
        /* JADX WARN: Code duplicated, block: B:21:0x00d4  */
        /* JADX WARN: Code duplicated, block: B:23:0x00df A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:24:0x00e1  */
        /* JADX WARN: Code duplicated, block: B:26:0x00fb  */
        /* JADX WARN: Code duplicated, block: B:27:0x0116  */
        /* JADX WARN: Code duplicated, block: B:33:0x0152  */
        /* JADX WARN: Code duplicated, block: B:35:0x0174  */
        /* JADX WARN: Code duplicated, block: B:46:0x01a6  */
        /* JADX WARN: Code duplicated, block: B:49:0x01bb  */
        /* JADX WARN: Code duplicated, block: B:51:0x01d3  */
        /* JADX WARN: Code duplicated, block: B:56:0x01e6  */
        /* JADX WARN: Code duplicated, block: B:67:0x02fd  */
        /* JADX WARN: Code duplicated, block: B:73:0x0362  */
        /* JADX WARN: Code duplicated, block: B:74:0x0372  */
        /* JADX WARN: Code duplicated, block: B:76:0x0375  */
        /* JADX WARN: Code duplicated, block: B:78:0x0388  */
        /* JADX WARN: Code duplicated, block: B:79:0x038f  */
        /* JADX WARN: Code duplicated, block: B:80:0x043f  */
        /* JADX WARN: Code duplicated, block: B:84:0x048c A[LOOP:1: B:82:0x0471->B:84:0x048c, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:91:0x014c A[SYNTHETIC] */
        public static /* synthetic */ void c(Object[] objArr) {
            Charset charset;
            String str;
            boolean z10;
            boolean z11;
            boolean z12;
            int i10;
            int i11;
            Charset charset2;
            int i12;
            Object[] objArr2;
            int i13;
            int i14;
            int i15;
            int i16;
            int i17;
            int i18;
            int i19;
            int i20;
            String str2;
            abx abxVar = (abx) objArr[0];
            int i21 = 1;
            String str3 = (String) objArr[1];
            int i22 = 2;
            int iIntValue = ((Number) objArr[2]).intValue();
            int iIntValue2 = ((Number) objArr[3]).intValue();
            String str4 = (String) objArr[4];
            boolean zBooleanValue = ((Boolean) objArr[5]).booleanValue();
            boolean zBooleanValue2 = ((Boolean) objArr[6]).booleanValue();
            boolean zBooleanValue3 = ((Boolean) objArr[7]).booleanValue();
            boolean zBooleanValue4 = ((Boolean) objArr[8]).booleanValue();
            int i23 = 9;
            Charset charset3 = (Charset) objArr[9];
            int i24 = f62073b;
            int i25 = i24 & 23;
            int i26 = (i24 ^ 23) | i25;
            int i27 = (i25 & i26) + (i25 | i26);
            int i28 = i27 % 128;
            f62072a = i28;
            int i29 = i27 % 2;
            int i30 = i28 + 123;
            f62073b = i30 % 128;
            int i31 = i30 % 2;
            int i32 = iIntValue;
            abx abxVar2 = null;
            while (i32 < iIntValue2) {
                int i33 = f62072a;
                int i34 = (i33 ^ 85) + ((i33 & 85) << 1);
                f62073b = i34 % 128;
                int i35 = i34 % i22;
                int iCodePointAt = str3.codePointAt(i32);
                if (zBooleanValue) {
                    int i36 = f62073b;
                    int i37 = i36 ^ 57;
                    int i38 = (i36 & 57) << i21;
                    int i39 = (i37 ^ i38) + ((i37 & i38) << i21);
                    int i40 = i39 % 128;
                    f62072a = i40;
                    if (i39 % i22 == 0 ? iCodePointAt != i23 : iCodePointAt != 98) {
                        if (iCodePointAt != 10) {
                            int i41 = i40 ^ 3;
                            int i42 = ((((i40 & 3) | i41) << 1) - (~(-i41))) - 1;
                            int i43 = i42 % 128;
                            f62073b = i43;
                            int i44 = i42 % i22;
                            if (iCodePointAt != 12) {
                                int i45 = i43 + 71;
                                f62072a = i45 % 128;
                                int i46 = i45 % i22;
                                if (iCodePointAt != 13) {
                                    if (iCodePointAt == 43) {
                                        i18 = f62072a;
                                        i19 = i18 + 99;
                                        f62073b = i19 % 128;
                                        if (i19 % i22 != 0) {
                                            throw null;
                                        }
                                        if (zBooleanValue3) {
                                            int i47 = (i18 & (-32)) | ((~i18) & 31);
                                            int i48 = (i18 & 31) << 1;
                                            int i49 = ((i47 | i48) << 1) - (i47 ^ i48);
                                            i20 = i49 % 128;
                                            f62073b = i20;
                                            int i50 = i49 % i22;
                                            if (zBooleanValue) {
                                                int i51 = ((i18 | 43) << 1) - (i18 ^ 43);
                                                f62073b = i51 % 128;
                                                int i52 = i51 % i22;
                                                int i53 = (i18 ^ 49) + ((i18 & 49) << 1);
                                                f62073b = i53 % 128;
                                                int i54 = i53 % i22;
                                                str2 = "+";
                                            } else {
                                                int i55 = i20 & 97;
                                                int i56 = i55 + ((i20 ^ 97) | i55);
                                                f62072a = i56 % 128;
                                                int i57 = i56 % i22;
                                                str2 = "%2B";
                                            }
                                            Object[] objArr3 = new Object[i22];
                                            objArr3[0] = abxVar;
                                            objArr3[1] = str2;
                                            int i58 = f62073b;
                                            int i59 = (i58 ^ 101) + ((i58 & 101) << 1);
                                            f62072a = i59 % 128;
                                            int i60 = i59 % 2;
                                        }
                                    }
                                    if (iCodePointAt >= 32) {
                                        i13 = f62073b;
                                        int i61 = (i13 & (-4)) | (3 & (~i13));
                                        int i62 = -(-((i13 & 3) << 1));
                                        int i63 = (i61 & i62) + (i61 | i62);
                                        f62072a = i63 % 128;
                                        int i64 = i63 % 2;
                                        if (iCodePointAt != 127) {
                                            i14 = (-2) - ((((i13 | 16) << 1) - (i13 ^ 16)) ^ (-1));
                                            int i65 = i14 % 128;
                                            f62072a = i65;
                                            if (i14 % 2 != 0 ? iCodePointAt < 128 : iCodePointAt < 11033) {
                                                i15 = 2;
                                            } else {
                                                int i66 = (i65 ^ 94) + ((i65 & 94) << 1);
                                                int i67 = (i66 ^ (-1)) + (i66 << 1);
                                                f62073b = i67 % 128;
                                                i15 = 2;
                                                int i68 = i67 % 2;
                                                if (!zBooleanValue4) {
                                                    charset = charset3;
                                                    str = str4;
                                                    z10 = zBooleanValue;
                                                    z11 = zBooleanValue3;
                                                    z12 = zBooleanValue4;
                                                }
                                            }
                                            if (StringsKt__StringsKt.contains$default((CharSequence) str4, (char) iCodePointAt, false, i15, (Object) null)) {
                                                charset = charset3;
                                                str = str4;
                                                z10 = zBooleanValue;
                                                z11 = zBooleanValue3;
                                                z12 = zBooleanValue4;
                                            } else {
                                                int i69 = f62072a;
                                                int i70 = i69 & 93;
                                                i16 = (((i69 ^ 93) | i70) << 1) - ((i69 | 93) & (~i70));
                                                int i71 = i16 % 128;
                                                f62073b = i71;
                                                if (i16 % 2 == 0 ? iCodePointAt != 37 : iCodePointAt != 60) {
                                                    charset = charset3;
                                                    str = str4;
                                                    z10 = zBooleanValue;
                                                    z11 = zBooleanValue3;
                                                    z12 = zBooleanValue4;
                                                } else if (!zBooleanValue) {
                                                    charset = charset3;
                                                    str = str4;
                                                    z10 = zBooleanValue;
                                                    z11 = zBooleanValue3;
                                                    z12 = zBooleanValue4;
                                                } else {
                                                    int i72 = ~iIntValue;
                                                    int i73 = ~i72;
                                                    int i74 = i72 & 1019243818;
                                                    int i75 = ((-1019243819) & i73) | i74;
                                                    int i76 = (-1019243819) & i72;
                                                    int i77 = (i75 ^ i76) | (i75 & i76);
                                                    str = str4;
                                                    int i78 = ~i77;
                                                    int i79 = i78 & (i77 | i78);
                                                    z10 = zBooleanValue;
                                                    int i80 = 549472256 & i79;
                                                    z11 = zBooleanValue3;
                                                    int i81 = ((i79 | 549472256) & (~i80)) | i80;
                                                    int i82 = 1543976430 & i72;
                                                    int i83 = (~i82) & (1543976430 | i72);
                                                    int i84 = ~((i83 ^ i82) | (i83 & i82));
                                                    int i85 = i81 & i84;
                                                    z12 = zBooleanValue4;
                                                    int i86 = (i81 | i84) & (~i85);
                                                    int i87 = 2074853922 - (~(((i86 & i85) | (i86 ^ i85)) * (-1136)));
                                                    int i88 = (-1019243819) & iIntValue;
                                                    int i89 = (~i88) & ((-1019243819) | iIntValue);
                                                    int i90 = ~((i88 & i89) | (i89 ^ i88));
                                                    int i91 = i82 | (iIntValue & (-1543976431));
                                                    int i92 = 1543976430 & iIntValue;
                                                    int i93 = ~((i91 ^ i92) | (i91 & i92));
                                                    int i94 = i90 & i93;
                                                    int i95 = ((i90 | i93) & (~i94)) | i94;
                                                    int i96 = i72 ^ 1019243818;
                                                    int i97 = (i96 & i74) | (i96 ^ i74);
                                                    int i98 = i97 & (-1543976431);
                                                    charset = charset3;
                                                    int i99 = (~i98) & (i97 | (-1543976431));
                                                    int i100 = (i99 & i98) | (i99 ^ i98);
                                                    int i101 = ~i100;
                                                    int i102 = (i100 | i101) & i101;
                                                    int i103 = i95 ^ i102;
                                                    int i104 = i102 & i95;
                                                    int i105 = ((i104 & i103) | (i103 ^ i104)) * (-568);
                                                    int i106 = i87 ^ i105;
                                                    int i107 = -(-((i105 & i87) << 1));
                                                    int i108 = ((i106 | i107) << 1) - (i107 ^ i106);
                                                    int i109 = i76 | (1019243818 & i73);
                                                    int i110 = (i109 & i74) | (i109 ^ i74);
                                                    int i111 = ~i110;
                                                    int i112 = (i110 | i111) & i111;
                                                    int i113 = i72 & (-1543976431);
                                                    int i114 = ~((((-1543976431) | i72) & (~i113)) | i113);
                                                    int i115 = (i112 & i114) | (i112 ^ i114);
                                                    int i116 = (-549472257) & iIntValue;
                                                    int i117 = ((-549472257) | iIntValue) & (~i116);
                                                    int i118 = -(~((i115 | (~((i117 & i116) | (i117 ^ i116)))) * 568));
                                                    int i119 = (-2) - (((i108 & i118) + (i118 | i108)) ^ (-1));
                                                    int i120 = ~((i72 ^ 523912186) | (i72 & 523912186));
                                                    int i121 = i120 & (-532301823);
                                                    int i122 = (i120 | (-532301823)) & (~i121);
                                                    int i123 = -(-(((i122 & i121) | (i122 ^ i121)) * (-160)));
                                                    int i124 = ((-669331824) ^ i123) + ((i123 & (-669331824)) << 1);
                                                    int i125 = (-297272887) & i72;
                                                    int i126 = (i72 | (-297272887)) & (~i125);
                                                    if (i119 > (i124 - (~(-(-(((~((i126 & i125) | (i126 ^ i125))) | 523912186) * 160))))) - 1) {
                                                        int i127 = 89 / 0;
                                                        if (zBooleanValue2) {
                                                            int i128 = i71 & 61;
                                                            int i129 = -(-(i71 | 61));
                                                            int i130 = (i128 & i129) + (i129 | i128);
                                                            f62072a = i130 % 128;
                                                            i17 = 2;
                                                            int i131 = i130 % 2;
                                                            if (!((Boolean) setDividerPadding(new Object[]{str3, Integer.valueOf(i32), Integer.valueOf(iIntValue2)}, 1623322823, -1623322812, i32)).booleanValue()) {
                                                            }
                                                        }
                                                        Object[] objArr4 = new Object[i17];
                                                        objArr4[0] = abxVar;
                                                        objArr4[1] = Integer.valueOf(iCodePointAt);
                                                        int i132 = f62072a;
                                                        int i133 = i132 ^ 59;
                                                        int i134 = (((i132 & 59) | i133) << 1) - i133;
                                                        f62073b = i134 % 128;
                                                        int i135 = i134 % 2;
                                                        iIntValue2 = iIntValue2;
                                                        charset2 = charset;
                                                    } else {
                                                        if (zBooleanValue2) {
                                                            int i1210 = i71 & 61;
                                                            int i1211 = -(-(i71 | 61));
                                                            int i136 = (i1210 & i1211) + (i1211 | i1210);
                                                            f62072a = i136 % 128;
                                                            i17 = 2;
                                                            int i137 = i136 % 2;
                                                            if (!((Boolean) setDividerPadding(new Object[]{str3, Integer.valueOf(i32), Integer.valueOf(iIntValue2)}, 1623322823, -1623322812, i32)).booleanValue()) {
                                                            }
                                                        }
                                                        Object[] objArr5 = new Object[i17];
                                                        objArr5[0] = abxVar;
                                                        objArr5[1] = Integer.valueOf(iCodePointAt);
                                                        int i138 = f62072a;
                                                        int i139 = i138 ^ 59;
                                                        int i1310 = (((i138 & 59) | i139) << 1) - i139;
                                                        f62073b = i1310 % 128;
                                                        int i1311 = i1310 % 2;
                                                        iIntValue2 = iIntValue2;
                                                        charset2 = charset;
                                                    }
                                                }
                                                i17 = 2;
                                                Object[] objArr6 = new Object[i17];
                                                objArr6[0] = abxVar;
                                                objArr6[1] = Integer.valueOf(iCodePointAt);
                                                int i1312 = f62072a;
                                                int i1313 = i1312 ^ 59;
                                                int i1314 = (((i1312 & 59) | i1313) << 1) - i1313;
                                                f62073b = i1314 % 128;
                                                int i1315 = i1314 % 2;
                                                iIntValue2 = iIntValue2;
                                                charset2 = charset;
                                            }
                                        } else {
                                            charset = charset3;
                                            str = str4;
                                            z10 = zBooleanValue;
                                            z11 = zBooleanValue3;
                                            z12 = zBooleanValue4;
                                        }
                                    } else {
                                        charset = charset3;
                                        str = str4;
                                        z10 = zBooleanValue;
                                        z11 = zBooleanValue3;
                                        z12 = zBooleanValue4;
                                    }
                                    if (abxVar2 == null) {
                                        abxVar2 = new abx();
                                        int i140 = f62073b + 45;
                                        f62072a = i140 % 128;
                                        i10 = 2;
                                        int i141 = i140 % 2;
                                    } else {
                                        i10 = 2;
                                    }
                                    if (charset != null) {
                                        int i142 = f62072a + 87;
                                        f62073b = i142 % 128;
                                        int i143 = i142 % i10;
                                        charset2 = charset;
                                        if (Intrinsics.areEqual(charset2, StandardCharsets.UTF_8)) {
                                            i11 = 2;
                                        } else {
                                            int iCharCount = Character.charCount(iCodePointAt);
                                            int i144 = iCharCount * (-337);
                                            int i145 = -(-(i32 * 339));
                                            int i146 = ((i144 | i145) << 1) - (i144 ^ i145);
                                            int i147 = ~iCharCount;
                                            int i148 = ~iIntValue;
                                            int i149 = i147 | i148;
                                            int i150 = ~i149;
                                            int i151 = ~i32;
                                            int i152 = i151 & (i151 | i32);
                                            int i153 = i152 & iCharCount;
                                            iIntValue2 = iIntValue2;
                                            int i154 = (~i153) & (i152 | iCharCount);
                                            int i155 = ~((i154 & i153) | (i154 ^ i153));
                                            int i156 = i150 ^ i155;
                                            int i157 = i155 & i150;
                                            int i158 = (i157 & i156) | (i156 ^ i157);
                                            int i159 = iCharCount & iIntValue;
                                            int i160 = (~i159) & (iCharCount | iIntValue);
                                            int i161 = ~((i159 & i160) | (i160 ^ i159));
                                            int i162 = (((i158 & i161) | (i158 ^ i161)) * (-338)) + i146;
                                            int i163 = i147 & i32;
                                            int i164 = i163 | ((~i163) & (i147 | i32));
                                            int i165 = ~i164;
                                            int i166 = -(-(((i164 | i165) & i165) * 338));
                                            int i167 = ((~i166) & i162) | ((~i162) & i166);
                                            int i168 = (i162 & i166) << 1;
                                            int i169 = (i167 ^ i168) + ((i168 & i167) << 1);
                                            int i170 = i147 & i148;
                                            int i171 = (~i170) & i149;
                                            int i172 = ~((i170 & i171) | (i171 ^ i170));
                                            int i173 = iCharCount & i32;
                                            int i174 = ((iCharCount | i32) & (~i173)) | i173;
                                            int i175 = ~((i174 & iIntValue) | (i174 ^ iIntValue));
                                            int i176 = (i169 - (~(-(~(-(-(((i175 & i172) | (i172 ^ i175)) * 338))))))) - 1;
                                            int i177 = f62073b + 79;
                                            f62072a = i177 % 128;
                                            int i178 = i177 % 2;
                                            i12 = 1;
                                        }
                                        while (true) {
                                            objArr2 = new Object[i12];
                                            objArr2[0] = abxVar2;
                                            if (!((Boolean) abx.setOnFocusChangeListener(objArr2, -1474615858, 1474615886, System.identityHashCode(abxVar2))).booleanValue()) {
                                                int i179 = f62073b;
                                                int i180 = i179 & 15;
                                                int i181 = (i180 - (~(-(-((i179 ^ 15) | i180))))) - 1;
                                                f62072a = i181 % 128;
                                                int i182 = i181 % 2;
                                                byte bByteValue = ((Byte) abx.setOnFocusChangeListener(new Object[]{abxVar2}, 33298663, -33298647, System.identityHashCode(abxVar2))).byteValue();
                                                char c10 = ((char[]) yg.setOnFocusChangeListener(new Object[0], -243040182, 243040188, (int) System.currentTimeMillis()))[((bByteValue & 255) >> 4) & 15];
                                                char c11 = ((char[]) yg.setOnFocusChangeListener(new Object[0], -243040182, 243040188, (int) System.currentTimeMillis()))[bByteValue & 15];
                                                int i183 = f62072a;
                                                int i184 = ((i183 | 27) << 1) - (i183 ^ 27);
                                                f62073b = i184 % 128;
                                                int i185 = i184 % 2;
                                                i12 = 1;
                                            }
                                        }
                                    } else {
                                        i11 = i10;
                                        charset2 = charset;
                                    }
                                    Object[] objArr7 = new Object[i11];
                                    objArr7[0] = abxVar2;
                                    objArr7[1] = Integer.valueOf(iCodePointAt);
                                    int i186 = f62072a;
                                    int i187 = i186 & 95;
                                    int i188 = i187 - (~(-(-((i186 ^ 95) | i187))));
                                    i12 = 1;
                                    int i189 = i188 - 1;
                                    f62073b = i189 % 128;
                                    int i190 = i189 % 2;
                                    while (true) {
                                        objArr2 = new Object[i12];
                                        objArr2[0] = abxVar2;
                                        if (!((Boolean) abx.setOnFocusChangeListener(objArr2, -1474615858, 1474615886, System.identityHashCode(abxVar2))).booleanValue()) {
                                            int i1710 = f62073b;
                                            int i1810 = i1710 & 15;
                                            int i1811 = (i1810 - (~(-(-((i1710 ^ 15) | i1810))))) - 1;
                                            f62072a = i1811 % 128;
                                            int i1812 = i1811 % 2;
                                            byte bByteValue2 = ((Byte) abx.setOnFocusChangeListener(new Object[]{abxVar2}, 33298663, -33298647, System.identityHashCode(abxVar2))).byteValue();
                                            char c12 = ((char[]) yg.setOnFocusChangeListener(new Object[0], -243040182, 243040188, (int) System.currentTimeMillis()))[((bByteValue2 & 255) >> 4) & 15];
                                            char c13 = ((char[]) yg.setOnFocusChangeListener(new Object[0], -243040182, 243040188, (int) System.currentTimeMillis()))[bByteValue2 & 15];
                                            int i1813 = f62072a;
                                            int i1814 = ((i1813 | 27) << 1) - (i1813 ^ 27);
                                            f62073b = i1814 % 128;
                                            int i1815 = i1814 % 2;
                                            i12 = 1;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    charset = charset3;
                    str = str4;
                    z10 = zBooleanValue;
                    z11 = zBooleanValue3;
                    z12 = zBooleanValue4;
                    iIntValue2 = iIntValue2;
                    charset2 = charset;
                } else {
                    if (iCodePointAt == 43) {
                        i18 = f62072a;
                        i19 = i18 + 99;
                        f62073b = i19 % 128;
                        if (i19 % i22 != 0) {
                            throw null;
                        }
                        if (zBooleanValue3) {
                            int i410 = (i18 & (-32)) | ((~i18) & 31);
                            int i411 = (i18 & 31) << 1;
                            int i412 = ((i410 | i411) << 1) - (i410 ^ i411);
                            i20 = i412 % 128;
                            f62073b = i20;
                            int i510 = i412 % i22;
                            if (zBooleanValue) {
                                int i511 = ((i18 | 43) << 1) - (i18 ^ 43);
                                f62073b = i511 % 128;
                                int i512 = i511 % i22;
                                int i513 = (i18 ^ 49) + ((i18 & 49) << 1);
                                f62073b = i513 % 128;
                                int i514 = i513 % i22;
                                str2 = "+";
                            } else {
                                int i515 = i20 & 97;
                                int i516 = i515 + ((i20 ^ 97) | i515);
                                f62072a = i516 % 128;
                                int i517 = i516 % i22;
                                str2 = "%2B";
                            }
                            Object[] objArr8 = new Object[i22];
                            objArr8[0] = abxVar;
                            objArr8[1] = str2;
                            int i518 = f62073b;
                            int i519 = (i518 ^ 101) + ((i518 & 101) << 1);
                            f62072a = i519 % 128;
                            int i610 = i519 % 2;
                            charset = charset3;
                            str = str4;
                            z10 = zBooleanValue;
                            z11 = zBooleanValue3;
                            z12 = zBooleanValue4;
                            iIntValue2 = iIntValue2;
                            charset2 = charset;
                        }
                    }
                    if (iCodePointAt >= 32) {
                        i13 = f62073b;
                        int i611 = (i13 & (-4)) | (3 & (~i13));
                        int i612 = -(-((i13 & 3) << 1));
                        int i613 = (i611 & i612) + (i611 | i612);
                        f62072a = i613 % 128;
                        int i614 = i613 % 2;
                        if (iCodePointAt != 127) {
                            i14 = (-2) - ((((i13 | 16) << 1) - (i13 ^ 16)) ^ (-1));
                            int i615 = i14 % 128;
                            f62072a = i615;
                            if (i14 % 2 != 0) {
                                i15 = 2;
                                if (StringsKt__StringsKt.contains$default((CharSequence) str4, (char) iCodePointAt, false, i15, (Object) null)) {
                                    int i616 = f62072a;
                                    int i710 = i616 & 93;
                                    i16 = (((i616 ^ 93) | i710) << 1) - ((i616 | 93) & (~i710));
                                    int i711 = i16 % 128;
                                    f62073b = i711;
                                    if (i16 % 2 == 0) {
                                        charset = charset3;
                                        str = str4;
                                        z10 = zBooleanValue;
                                        z11 = zBooleanValue3;
                                        z12 = zBooleanValue4;
                                        i17 = 2;
                                        Object[] objArr9 = new Object[i17];
                                        objArr9[0] = abxVar;
                                        objArr9[1] = Integer.valueOf(iCodePointAt);
                                        int i1316 = f62072a;
                                        int i1317 = i1316 ^ 59;
                                        int i1318 = (((i1316 & 59) | i1317) << 1) - i1317;
                                        f62073b = i1318 % 128;
                                        int i1319 = i1318 % 2;
                                        iIntValue2 = iIntValue2;
                                        charset2 = charset;
                                    } else {
                                        charset = charset3;
                                        str = str4;
                                        z10 = zBooleanValue;
                                        z11 = zBooleanValue3;
                                        z12 = zBooleanValue4;
                                        i17 = 2;
                                        Object[] objArr10 = new Object[i17];
                                        objArr10[0] = abxVar;
                                        objArr10[1] = Integer.valueOf(iCodePointAt);
                                        int i13110 = f62072a;
                                        int i13111 = i13110 ^ 59;
                                        int i13112 = (((i13110 & 59) | i13111) << 1) - i13111;
                                        f62073b = i13112 % 128;
                                        int i13113 = i13112 % 2;
                                        iIntValue2 = iIntValue2;
                                        charset2 = charset;
                                    }
                                } else {
                                    charset = charset3;
                                    str = str4;
                                    z10 = zBooleanValue;
                                    z11 = zBooleanValue3;
                                    z12 = zBooleanValue4;
                                }
                            } else {
                                i15 = 2;
                                if (StringsKt__StringsKt.contains$default((CharSequence) str4, (char) iCodePointAt, false, i15, (Object) null)) {
                                    int i617 = f62072a;
                                    int i712 = i617 & 93;
                                    i16 = (((i617 ^ 93) | i712) << 1) - ((i617 | 93) & (~i712));
                                    int i713 = i16 % 128;
                                    f62073b = i713;
                                    if (i16 % 2 == 0) {
                                        charset = charset3;
                                        str = str4;
                                        z10 = zBooleanValue;
                                        z11 = zBooleanValue3;
                                        z12 = zBooleanValue4;
                                        i17 = 2;
                                        Object[] objArr11 = new Object[i17];
                                        objArr11[0] = abxVar;
                                        objArr11[1] = Integer.valueOf(iCodePointAt);
                                        int i13114 = f62072a;
                                        int i13115 = i13114 ^ 59;
                                        int i13116 = (((i13114 & 59) | i13115) << 1) - i13115;
                                        f62073b = i13116 % 128;
                                        int i13117 = i13116 % 2;
                                        iIntValue2 = iIntValue2;
                                        charset2 = charset;
                                    } else {
                                        charset = charset3;
                                        str = str4;
                                        z10 = zBooleanValue;
                                        z11 = zBooleanValue3;
                                        z12 = zBooleanValue4;
                                        i17 = 2;
                                        Object[] objArr12 = new Object[i17];
                                        objArr12[0] = abxVar;
                                        objArr12[1] = Integer.valueOf(iCodePointAt);
                                        int i13118 = f62072a;
                                        int i13119 = i13118 ^ 59;
                                        int i131110 = (((i13118 & 59) | i13119) << 1) - i13119;
                                        f62073b = i131110 % 128;
                                        int i131111 = i131110 % 2;
                                        iIntValue2 = iIntValue2;
                                        charset2 = charset;
                                    }
                                } else {
                                    charset = charset3;
                                    str = str4;
                                    z10 = zBooleanValue;
                                    z11 = zBooleanValue3;
                                    z12 = zBooleanValue4;
                                }
                            }
                        } else {
                            charset = charset3;
                            str = str4;
                            z10 = zBooleanValue;
                            z11 = zBooleanValue3;
                            z12 = zBooleanValue4;
                        }
                    } else {
                        charset = charset3;
                        str = str4;
                        z10 = zBooleanValue;
                        z11 = zBooleanValue3;
                        z12 = zBooleanValue4;
                    }
                    if (abxVar2 == null) {
                        abxVar2 = new abx();
                        int i1410 = f62073b + 45;
                        f62072a = i1410 % 128;
                        i10 = 2;
                        int i1411 = i1410 % 2;
                    } else {
                        i10 = 2;
                    }
                    if (charset != null) {
                        int i1412 = f62072a + 87;
                        f62073b = i1412 % 128;
                        int i1413 = i1412 % i10;
                        charset2 = charset;
                        if (Intrinsics.areEqual(charset2, StandardCharsets.UTF_8)) {
                            i11 = 2;
                        } else {
                            int iCharCount2 = Character.charCount(iCodePointAt);
                            int i1414 = iCharCount2 * (-337);
                            int i1415 = -(-(i32 * 339));
                            int i1416 = ((i1414 | i1415) << 1) - (i1414 ^ i1415);
                            int i1417 = ~iCharCount2;
                            int i1418 = ~iIntValue;
                            int i1419 = i1417 | i1418;
                            int i1510 = ~i1419;
                            int i1511 = ~i32;
                            int i1512 = i1511 & (i1511 | i32);
                            int i1513 = i1512 & iCharCount2;
                            iIntValue2 = iIntValue2;
                            int i1514 = (~i1513) & (i1512 | iCharCount2);
                            int i1515 = ~((i1514 & i1513) | (i1514 ^ i1513));
                            int i1516 = i1510 ^ i1515;
                            int i1517 = i1515 & i1510;
                            int i1518 = (i1517 & i1516) | (i1516 ^ i1517);
                            int i1519 = iCharCount2 & iIntValue;
                            int i1610 = (~i1519) & (iCharCount2 | iIntValue);
                            int i1611 = ~((i1519 & i1610) | (i1610 ^ i1519));
                            int i1612 = (((i1518 & i1611) | (i1518 ^ i1611)) * (-338)) + i1416;
                            int i1613 = i1417 & i32;
                            int i1614 = i1613 | ((~i1613) & (i1417 | i32));
                            int i1615 = ~i1614;
                            int i1616 = -(-(((i1614 | i1615) & i1615) * 338));
                            int i1617 = ((~i1616) & i1612) | ((~i1612) & i1616);
                            int i1618 = (i1612 & i1616) << 1;
                            int i1619 = (i1617 ^ i1618) + ((i1618 & i1617) << 1);
                            int i1711 = i1417 & i1418;
                            int i1712 = (~i1711) & i1419;
                            int i1713 = ~((i1711 & i1712) | (i1712 ^ i1711));
                            int i1714 = iCharCount2 & i32;
                            int i1715 = ((iCharCount2 | i32) & (~i1714)) | i1714;
                            int i1716 = ~((i1715 & iIntValue) | (i1715 ^ iIntValue));
                            int i1717 = (i1619 - (~(-(~(-(-(((i1716 & i1713) | (i1713 ^ i1716)) * 338))))))) - 1;
                            int i1718 = f62073b + 79;
                            f62072a = i1718 % 128;
                            int i1719 = i1718 % 2;
                            i12 = 1;
                        }
                        while (true) {
                            objArr2 = new Object[i12];
                            objArr2[0] = abxVar2;
                            if (!((Boolean) abx.setOnFocusChangeListener(objArr2, -1474615858, 1474615886, System.identityHashCode(abxVar2))).booleanValue()) {
                                int i17110 = f62073b;
                                int i1816 = i17110 & 15;
                                int i1817 = (i1816 - (~(-(-((i17110 ^ 15) | i1816))))) - 1;
                                f62072a = i1817 % 128;
                                int i1818 = i1817 % 2;
                                byte bByteValue3 = ((Byte) abx.setOnFocusChangeListener(new Object[]{abxVar2}, 33298663, -33298647, System.identityHashCode(abxVar2))).byteValue();
                                char c14 = ((char[]) yg.setOnFocusChangeListener(new Object[0], -243040182, 243040188, (int) System.currentTimeMillis()))[((bByteValue3 & 255) >> 4) & 15];
                                char c15 = ((char[]) yg.setOnFocusChangeListener(new Object[0], -243040182, 243040188, (int) System.currentTimeMillis()))[bByteValue3 & 15];
                                int i1819 = f62072a;
                                int i18110 = ((i1819 | 27) << 1) - (i1819 ^ 27);
                                f62073b = i18110 % 128;
                                int i18111 = i18110 % 2;
                                i12 = 1;
                            }
                        }
                    } else {
                        i11 = i10;
                        charset2 = charset;
                    }
                    Object[] objArr13 = new Object[i11];
                    objArr13[0] = abxVar2;
                    objArr13[1] = Integer.valueOf(iCodePointAt);
                    int i1820 = f62072a;
                    int i1821 = i1820 & 95;
                    int i1822 = i1821 - (~(-(-((i1820 ^ 95) | i1821))));
                    i12 = 1;
                    int i1823 = i1822 - 1;
                    f62073b = i1823 % 128;
                    int i191 = i1823 % 2;
                    while (true) {
                        objArr2 = new Object[i12];
                        objArr2[0] = abxVar2;
                        if (!((Boolean) abx.setOnFocusChangeListener(objArr2, -1474615858, 1474615886, System.identityHashCode(abxVar2))).booleanValue()) {
                            int i17111 = f62073b;
                            int i18112 = i17111 & 15;
                            int i18113 = (i18112 - (~(-(-((i17111 ^ 15) | i18112))))) - 1;
                            f62072a = i18113 % 128;
                            int i18114 = i18113 % 2;
                            byte bByteValue4 = ((Byte) abx.setOnFocusChangeListener(new Object[]{abxVar2}, 33298663, -33298647, System.identityHashCode(abxVar2))).byteValue();
                            char c16 = ((char[]) yg.setOnFocusChangeListener(new Object[0], -243040182, 243040188, (int) System.currentTimeMillis()))[((bByteValue4 & 255) >> 4) & 15];
                            char c17 = ((char[]) yg.setOnFocusChangeListener(new Object[0], -243040182, 243040188, (int) System.currentTimeMillis()))[bByteValue4 & 15];
                            int i18115 = f62072a;
                            int i18116 = ((i18115 | 27) << 1) - (i18115 ^ 27);
                            f62073b = i18116 % 128;
                            int i18117 = i18116 % 2;
                            i12 = 1;
                        }
                    }
                }
                int iCharCount3 = Character.charCount(iCodePointAt);
                int i192 = iCharCount3 * (-51);
                int i193 = i32 * 53;
                int i194 = i192 & i193;
                int i195 = (((i192 | i193) & (~i194)) - (~(-(-(i194 << 1))))) - 1;
                int i196 = ~iIntValue;
                int i197 = (i196 ^ iCharCount3) | (i196 & iCharCount3);
                int i198 = ~i32;
                int i199 = (i197 & i198) | ((~i197) & i32);
                int i200 = i197 & i32;
                int i201 = (~((i200 & i199) | (i199 ^ i200))) * 52;
                int i202 = i195 | i201;
                int i203 = ((i202 << 1) - (~(-((~(i195 & i201)) & i202)))) - 1;
                int i204 = (i196 | iIntValue) & i196;
                int i205 = i198 & i204;
                int i206 = (~i205) & (i198 | i204);
                int i207 = ~i204;
                int i208 = ~((i205 & i206) | (i206 ^ i205));
                int i209 = (i198 ^ iCharCount3) | (i198 & iCharCount3);
                int i210 = ~i209;
                int i211 = i208 | ((i209 | i210) & i210);
                int i212 = ~iCharCount3;
                int i213 = (i207 & iCharCount3) | (i204 & i212);
                int i214 = iCharCount3 & i204;
                int i215 = ~((i214 & i213) | (i213 ^ i214));
                int i216 = ((i215 & i211) | (i211 ^ i215)) * (-52);
                int i217 = i203 & i216;
                int i218 = -(-(i216 | i203));
                int i219 = ((i217 | i218) << 1) - (i218 ^ i217);
                int i220 = i212 ^ i196;
                int i221 = i212 & i196;
                int i222 = ~((i220 & i221) | (i220 ^ i221));
                int i223 = (i212 & i198) | ((~i212) & i32);
                int i224 = i212 & i32;
                int i225 = ~((i223 & i224) | (i223 ^ i224));
                int i226 = ((~i225) & i222) | ((~i222) & i225);
                int i227 = i222 & i225;
                int i228 = -(-(((i227 & i226) | (i226 ^ i227)) * 52));
                int i229 = i219 & i228;
                int i230 = -(-((i228 ^ i219) | i229));
                i32 = ((i229 | i230) << 1) - (i230 ^ i229);
                int i231 = f62072a;
                int i232 = i231 & 119;
                int i233 = (i231 | 119) & (~i232);
                int i234 = -(-(i232 << 1));
                int i235 = (i233 ^ i234) + ((i233 & i234) << 1);
                f62073b = i235 % 128;
                int i236 = i235 % 2;
                charset3 = charset2;
                i21 = 1;
                iIntValue2 = iIntValue2;
                str4 = str;
                zBooleanValue = z10;
                zBooleanValue3 = z11;
                zBooleanValue4 = z12;
                i22 = 2;
                i23 = 9;
            }
            int i237 = f62073b;
            int i238 = (i237 & 103) + (i237 | 103);
            f62072a = i238 % 128;
            if (i238 % 2 != 0) {
                int i239 = 97 / 0;
            }
        }

        /* JADX WARN: Code duplicated, block: B:16:0x012e  */
        /* JADX WARN: Code duplicated, block: B:18:0x0147  */
        /* JADX WARN: Code duplicated, block: B:19:0x014d  */
        /* JADX WARN: Code duplicated, block: B:23:0x016d  */
        /* JADX WARN: Code duplicated, block: B:25:0x0188  */
        /* JADX WARN: Code duplicated, block: B:27:0x0191  */
        /* JADX WARN: Code duplicated, block: B:28:0x0194  */
        /* JADX WARN: Code duplicated, block: B:31:0x0198 A[LOOP:0: B:14:0x007f->B:31:0x0198, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:36:0x01a2 A[EDGE_INSN: B:36:0x01a2->B:34:0x01a2 BREAK  A[LOOP:0: B:14:0x007f->B:31:0x0198], SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:37:? A[PHI: r0 r5 r6
          PHI (r0v8 int) = (r0v4 int), (r0v47 int) binds: [B:9:0x0062, B:13:0x007d] A[DONT_GENERATE, DONT_INLINE]
          PHI (r5v7 int) = (r5v6 int), (r5v10 int) binds: [B:9:0x0062, B:13:0x007d] A[DONT_GENERATE, DONT_INLINE]
          PHI (r6v3 int) = (r6v2 int), (r6v4 int) binds: [B:9:0x0062, B:13:0x007d] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:9:0x0062 A[DONT_INVERT, PHI: r0 r5 r6
          0x0062: PHI (r0v4 int) = (r0v3 int), (r0v51 int) binds: [B:8:0x0060, B:5:0x003f] A[DONT_GENERATE, DONT_INLINE]
          0x0062: PHI (r5v6 int) = (r5v5 int), (r5v13 int) binds: [B:8:0x0060, B:5:0x003f] A[DONT_GENERATE, DONT_INLINE]
          0x0062: PHI (r6v2 int) = (r6v1 int), (r6v5 int) binds: [B:8:0x0060, B:5:0x003f] A[DONT_GENERATE, DONT_INLINE]] */
        public static /* synthetic */ void d(Object[] objArr) {
            int first;
            int last;
            int step;
            int i10;
            int i11;
            String str;
            int i12;
            int i13;
            char c10;
            int i14;
            List list = (List) objArr[0];
            int i15 = 1;
            StringBuilder sb2 = (StringBuilder) objArr[1];
            int i16 = f62072a;
            int i17 = i16 & 99;
            int i18 = (i17 - (~(-(-((i16 ^ 99) | i17))))) - 1;
            f62073b = i18 % 128;
            if (i18 % 2 == 0) {
                Intrinsics.checkNotNullParameter(list, "");
                Intrinsics.checkNotNullParameter(sb2, "");
                IntProgression intProgressionStep = c.step(c.until(0, list.size()), 4);
                first = intProgressionStep.getFirst();
                last = intProgressionStep.getLast();
                step = intProgressionStep.getStep();
                if (step > 0) {
                    if (first > last) {
                        while (true) {
                            i10 = (first - (~step)) - i15;
                            String str2 = (String) list.get(first);
                            int iCurrentTimeMillis = (int) System.currentTimeMillis();
                            int i19 = -(-(first * (-721)));
                            int i20 = ((-721) & i19) + (i19 | (-721));
                            int i21 = ~iCurrentTimeMillis;
                            int i22 = ~first;
                            int i23 = ~i22;
                            int i24 = i22 & 1;
                            int i25 = (-2) & i22;
                            int i26 = ((-2) & i23) | i24 | i25;
                            int i27 = ~i26;
                            int i28 = i27 & (i26 | i27);
                            int i29 = (i28 & i21) | (i21 ^ i28);
                            int i30 = first & (-2);
                            int i31 = i24 | i30;
                            int i32 = first & 1;
                            int i33 = (i31 ^ i32) | (i31 & i32);
                            int i34 = ~i33;
                            int i35 = (i33 | i34) & i34;
                            i11 = step;
                            int i36 = i29 & i35;
                            int i37 = (i29 | i35) & (~i36);
                            int i38 = -(-(((i36 & i37) | (i37 ^ i36)) * 1444));
                            int i39 = i20 & i38;
                            int i40 = i39 + ((i38 ^ i20) | i39);
                            int i41 = (iCurrentTimeMillis ^ 1) | (iCurrentTimeMillis & 1);
                            int i42 = ~i41;
                            int i43 = (i41 | i42) & i42;
                            int i44 = i34 ^ i43;
                            int i45 = i43 & i34;
                            int i46 = (i45 & i44) | (i44 ^ i45);
                            int i47 = (first & i21) | (iCurrentTimeMillis & i22);
                            int i48 = first & iCurrentTimeMillis;
                            int i49 = ~((i47 & i48) | (i47 ^ i48));
                            int i50 = i46 ^ i49;
                            int i51 = i46 & i49;
                            int i52 = (i40 - (~(((i51 & i50) | (i50 ^ i51)) * (-1444)))) - 1;
                            int i53 = (~i30) & ((-2) | first);
                            int i54 = ~((i53 & i30) | (i53 ^ i30));
                            int i55 = i25 | (i23 & 1) | i24;
                            int i56 = ~i55;
                            int i57 = (i55 | i56) & i56;
                            int i58 = i54 & i57;
                            int i59 = (i57 | i54) & (~i58);
                            int i60 = ((i59 & i58) | (i59 ^ i58)) * ErrorCodes.STORAGE_PERMISSION;
                            int i61 = i52 & i60;
                            int i62 = ((i52 ^ i60) | i61) << 1;
                            int i63 = -((i60 | i52) & (~i61));
                            str = (String) list.get((i62 & i63) + (i63 | i62));
                            if (first > 0) {
                                int i64 = f62072a;
                                int i65 = (i64 & (-74)) | ((~i64) & 73);
                                int i66 = (i64 & 73) << 1;
                                i14 = ((i65 | i66) << 1) - (i66 ^ i65);
                                f62073b = i14 % 128;
                                if (i14 % 2 == 0) {
                                    sb2.append(Typography.dollar);
                                } else {
                                    sb2.append(Typography.amp);
                                }
                                int i67 = f62073b;
                                int i68 = i67 & 67;
                                int i69 = (i67 | 67) & (~i68);
                                int i70 = -(-(i68 << 1));
                                int i71 = (i69 & i70) + (i69 | i70);
                                f62072a = i71 % 128;
                                int i72 = i71 % 2;
                            }
                            sb2.append(str2);
                            if (str != null) {
                                int i73 = f62073b;
                                int i74 = i73 & 37;
                                i12 = 1;
                                int i75 = ((i73 ^ 37) | i74) << 1;
                                int i76 = -((i73 | 37) & (~i74));
                                i13 = ((i75 | i76) << 1) - (i76 ^ i75);
                                f62072a = i13 % 128;
                                if (i13 % 2 != 0) {
                                    c10 = AbstractJsonLexerKt.COMMA;
                                } else {
                                    c10 = '=';
                                }
                                sb2.append(c10);
                                sb2.append(str);
                            } else {
                                i12 = 1;
                            }
                            if (first == last) {
                                break;
                            }
                            i15 = i12;
                            step = i11;
                            first = i10;
                        }
                    }
                }
                int i77 = f62073b + 101;
                f62072a = i77 % 128;
                int i78 = i77 % 2;
            }
            Intrinsics.checkNotNullParameter(list, "");
            Intrinsics.checkNotNullParameter(sb2, "");
            IntProgression intProgressionStep2 = c.step(c.until(0, list.size()), 2);
            first = intProgressionStep2.getFirst();
            last = intProgressionStep2.getLast();
            step = intProgressionStep2.getStep();
            if (step > 0) {
                if (first > last) {
                    while (true) {
                        i10 = (first - (~step)) - i15;
                        String str3 = (String) list.get(first);
                        int iCurrentTimeMillis2 = (int) System.currentTimeMillis();
                        int i110 = -(-(first * (-721)));
                        int i210 = ((-721) & i110) + (i110 | (-721));
                        int i211 = ~iCurrentTimeMillis2;
                        int i212 = ~first;
                        int i213 = ~i212;
                        int i214 = i212 & 1;
                        int i215 = (-2) & i212;
                        int i216 = ((-2) & i213) | i214 | i215;
                        int i217 = ~i216;
                        int i218 = i217 & (i216 | i217);
                        int i219 = (i218 & i211) | (i211 ^ i218);
                        int i310 = first & (-2);
                        int i311 = i214 | i310;
                        int i312 = first & 1;
                        int i313 = (i311 ^ i312) | (i311 & i312);
                        int i314 = ~i313;
                        int i315 = (i313 | i314) & i314;
                        i11 = step;
                        int i316 = i219 & i315;
                        int i317 = (i219 | i315) & (~i316);
                        int i318 = -(-(((i316 & i317) | (i317 ^ i316)) * 1444));
                        int i319 = i210 & i318;
                        int i410 = i319 + ((i318 ^ i210) | i319);
                        int i411 = (iCurrentTimeMillis2 ^ 1) | (iCurrentTimeMillis2 & 1);
                        int i412 = ~i411;
                        int i413 = (i411 | i412) & i412;
                        int i414 = i314 ^ i413;
                        int i415 = i413 & i314;
                        int i416 = (i415 & i414) | (i414 ^ i415);
                        int i417 = (first & i211) | (iCurrentTimeMillis2 & i212);
                        int i418 = first & iCurrentTimeMillis2;
                        int i419 = ~((i417 & i418) | (i417 ^ i418));
                        int i510 = i416 ^ i419;
                        int i511 = i416 & i419;
                        int i512 = (i410 - (~(((i511 & i510) | (i510 ^ i511)) * (-1444)))) - 1;
                        int i513 = (~i310) & ((-2) | first);
                        int i514 = ~((i513 & i310) | (i513 ^ i310));
                        int i515 = i215 | (i213 & 1) | i214;
                        int i516 = ~i515;
                        int i517 = (i515 | i516) & i516;
                        int i518 = i514 & i517;
                        int i519 = (i517 | i514) & (~i518);
                        int i610 = ((i519 & i518) | (i519 ^ i518)) * ErrorCodes.STORAGE_PERMISSION;
                        int i611 = i512 & i610;
                        int i612 = ((i512 ^ i610) | i611) << 1;
                        int i613 = -((i610 | i512) & (~i611));
                        str = (String) list.get((i612 & i613) + (i613 | i612));
                        if (first > 0) {
                            int i614 = f62072a;
                            int i615 = (i614 & (-74)) | ((~i614) & 73);
                            int i616 = (i614 & 73) << 1;
                            i14 = ((i615 | i616) << 1) - (i616 ^ i615);
                            f62073b = i14 % 128;
                            if (i14 % 2 == 0) {
                                sb2.append(Typography.dollar);
                            } else {
                                sb2.append(Typography.amp);
                            }
                            int i617 = f62073b;
                            int i618 = i617 & 67;
                            int i619 = (i617 | 67) & (~i618);
                            int i79 = -(-(i618 << 1));
                            int i710 = (i619 & i79) + (i619 | i79);
                            f62072a = i710 % 128;
                            int i711 = i710 % 2;
                        }
                        sb2.append(str3);
                        if (str != null) {
                            int i712 = f62073b;
                            int i713 = i712 & 37;
                            i12 = 1;
                            int i714 = ((i712 ^ 37) | i713) << 1;
                            int i715 = -((i712 | 37) & (~i713));
                            i13 = ((i714 | i715) << 1) - (i715 ^ i714);
                            f62072a = i13 % 128;
                            if (i13 % 2 != 0) {
                                c10 = AbstractJsonLexerKt.COMMA;
                            } else {
                                c10 = '=';
                            }
                            sb2.append(c10);
                            sb2.append(str);
                        } else {
                            i12 = 1;
                        }
                        if (first == last) {
                            break;
                            break;
                        } else {
                            i15 = i12;
                            step = i11;
                            first = i10;
                        }
                    }
                }
            }
            int i716 = f62073b + 101;
            f62072a = i716 % 128;
            int i717 = i716 % 2;
            if (step < 0) {
                int i80 = f62072a;
                int i81 = i80 & 59;
                int i82 = (i80 | 59) & (~i81);
                int i83 = -(-(i81 << 1));
                int i84 = ((i82 | i83) << 1) - (i82 ^ i83);
                f62073b = i84 % 128;
                if (i84 % 2 == 0) {
                    throw null;
                }
                if (last <= first) {
                    while (true) {
                        i10 = (first - (~step)) - i15;
                        String str4 = (String) list.get(first);
                        int iCurrentTimeMillis3 = (int) System.currentTimeMillis();
                        int i111 = -(-(first * (-721)));
                        int i2110 = ((-721) & i111) + (i111 | (-721));
                        int i2111 = ~iCurrentTimeMillis3;
                        int i2112 = ~first;
                        int i2113 = ~i2112;
                        int i2114 = i2112 & 1;
                        int i2115 = (-2) & i2112;
                        int i2116 = ((-2) & i2113) | i2114 | i2115;
                        int i2117 = ~i2116;
                        int i2118 = i2117 & (i2116 | i2117);
                        int i2119 = (i2118 & i2111) | (i2111 ^ i2118);
                        int i3110 = first & (-2);
                        int i3111 = i2114 | i3110;
                        int i3112 = first & 1;
                        int i3113 = (i3111 ^ i3112) | (i3111 & i3112);
                        int i3114 = ~i3113;
                        int i3115 = (i3113 | i3114) & i3114;
                        i11 = step;
                        int i3116 = i2119 & i3115;
                        int i3117 = (i2119 | i3115) & (~i3116);
                        int i3118 = -(-(((i3116 & i3117) | (i3117 ^ i3116)) * 1444));
                        int i3119 = i2110 & i3118;
                        int i4110 = i3119 + ((i3118 ^ i2110) | i3119);
                        int i4111 = (iCurrentTimeMillis3 ^ 1) | (iCurrentTimeMillis3 & 1);
                        int i4112 = ~i4111;
                        int i4113 = (i4111 | i4112) & i4112;
                        int i4114 = i3114 ^ i4113;
                        int i4115 = i4113 & i3114;
                        int i4116 = (i4115 & i4114) | (i4114 ^ i4115);
                        int i4117 = (first & i2111) | (iCurrentTimeMillis3 & i2112);
                        int i4118 = first & iCurrentTimeMillis3;
                        int i4119 = ~((i4117 & i4118) | (i4117 ^ i4118));
                        int i5110 = i4116 ^ i4119;
                        int i5111 = i4116 & i4119;
                        int i5112 = (i4110 - (~(((i5111 & i5110) | (i5110 ^ i5111)) * (-1444)))) - 1;
                        int i5113 = (~i3110) & ((-2) | first);
                        int i5114 = ~((i5113 & i3110) | (i5113 ^ i3110));
                        int i5115 = i2115 | (i2113 & 1) | i2114;
                        int i5116 = ~i5115;
                        int i5117 = (i5115 | i5116) & i5116;
                        int i5118 = i5114 & i5117;
                        int i5119 = (i5117 | i5114) & (~i5118);
                        int i6110 = ((i5119 & i5118) | (i5119 ^ i5118)) * ErrorCodes.STORAGE_PERMISSION;
                        int i6111 = i5112 & i6110;
                        int i6112 = ((i5112 ^ i6110) | i6111) << 1;
                        int i6113 = -((i6110 | i5112) & (~i6111));
                        str = (String) list.get((i6112 & i6113) + (i6113 | i6112));
                        if (first > 0) {
                            int i6114 = f62072a;
                            int i6115 = (i6114 & (-74)) | ((~i6114) & 73);
                            int i6116 = (i6114 & 73) << 1;
                            i14 = ((i6115 | i6116) << 1) - (i6116 ^ i6115);
                            f62073b = i14 % 128;
                            if (i14 % 2 == 0) {
                                sb2.append(Typography.dollar);
                            } else {
                                sb2.append(Typography.amp);
                            }
                            int i6117 = f62073b;
                            int i6118 = i6117 & 67;
                            int i6119 = (i6117 | 67) & (~i6118);
                            int i718 = -(-(i6118 << 1));
                            int i719 = (i6119 & i718) + (i6119 | i718);
                            f62072a = i719 % 128;
                            int i7110 = i719 % 2;
                        }
                        sb2.append(str4);
                        if (str != null) {
                            int i7111 = f62073b;
                            int i7112 = i7111 & 37;
                            i12 = 1;
                            int i7113 = ((i7111 ^ 37) | i7112) << 1;
                            int i7114 = -((i7111 | 37) & (~i7112));
                            i13 = ((i7113 | i7114) << 1) - (i7114 ^ i7113);
                            f62072a = i13 % 128;
                            if (i13 % 2 != 0) {
                                c10 = AbstractJsonLexerKt.COMMA;
                            } else {
                                c10 = '=';
                            }
                            sb2.append(c10);
                            sb2.append(str);
                        } else {
                            i12 = 1;
                        }
                        if (first == last) {
                            break;
                            break;
                        } else {
                            i15 = i12;
                            step = i11;
                            first = i10;
                        }
                    }
                }
            }
            int i7115 = f62073b + 101;
            f62072a = i7115 % 128;
            int i7116 = i7115 % 2;
        }

        public static /* synthetic */ String e(Object[] objArr) {
            Companion companion = (Companion) objArr[0];
            String str = (String) objArr[1];
            int iIntValue = ((Number) objArr[2]).intValue();
            int iIntValue2 = ((Number) objArr[3]).intValue();
            String str2 = (String) objArr[4];
            boolean zBooleanValue = ((Boolean) objArr[5]).booleanValue();
            boolean zBooleanValue2 = ((Boolean) objArr[6]).booleanValue();
            boolean zBooleanValue3 = ((Boolean) objArr[7]).booleanValue();
            boolean zBooleanValue4 = ((Boolean) objArr[8]).booleanValue();
            Charset charset = (Charset) objArr[9];
            int iIntValue3 = ((Number) objArr[10]).intValue();
            int i10 = f62072a;
            int i11 = (i10 & 18) + (i10 | 18);
            int i12 = (i11 ^ (-1)) + (i11 << 1);
            int i13 = i12 % 128;
            f62073b = i13;
            if (i12 % 2 != 0 ? (iIntValue3 & 1) != 0 : (iIntValue3 & 1) != 0) {
                int i14 = (i13 ^ 39) + ((i13 & 39) << 1);
                f62072a = i14 % 128;
                int i15 = i14 % 2;
                iIntValue = 0;
            }
            if ((iIntValue3 & 2) != 0) {
                int i16 = f62072a;
                int i17 = ((i16 ^ 105) - (~((i16 & 105) << 1))) - 1;
                f62073b = i17 % 128;
                int i18 = i17 % 2;
                iIntValue2 = str.length();
                int i19 = f62072a;
                int i20 = i19 & 41;
                int i21 = i20 + ((i19 ^ 41) | i20);
                f62073b = i21 % 128;
                int i22 = i21 % 2;
            }
            if ((iIntValue3 & 8) != 0) {
                int i23 = f62072a;
                int i24 = i23 & 45;
                int i25 = ((i23 ^ 45) | i24) << 1;
                int i26 = -((~i24) & (i23 | 45));
                int i27 = (i25 ^ i26) + ((i25 & i26) << 1);
                f62073b = i27 % 128;
                int i28 = i27 % 2;
                int i29 = i23 + 74;
                int i30 = (i29 ^ (-1)) + (i29 << 1);
                f62073b = i30 % 128;
                int i31 = i30 % 2;
                zBooleanValue = false;
            }
            if ((iIntValue3 & 16) != 0) {
                int i32 = f62073b;
                int i33 = ((i32 & 114) + (i32 | 114)) - 1;
                f62072a = i33 % 128;
                int i34 = i33 % 2;
                int i35 = (((i32 & (-76)) | ((~i32) & 75)) - (~(-(-((i32 & 75) << 1))))) - 1;
                f62072a = i35 % 128;
                int i36 = i35 % 2;
                zBooleanValue2 = false;
            }
            if ((iIntValue3 & 32) != 0) {
                int i37 = f62073b;
                int i38 = (i37 ^ 31) + ((i37 & 31) << 1);
                int i39 = i38 % 128;
                f62072a = i39;
                int i40 = i38 % 2;
                int i41 = (((i39 & (-48)) | (47 & (~i39))) - (~(-(-((i39 & 47) << 1))))) - 1;
                f62073b = i41 % 128;
                int i42 = i41 % 2;
                zBooleanValue3 = false;
            }
            if ((iIntValue3 & 64) != 0) {
                int i43 = f62073b;
                int i44 = ((i43 ^ 75) | (i43 & 75)) << 1;
                int i45 = -((i43 & (-76)) | (75 & (~i43)));
                int i46 = (i44 & i45) + (i44 | i45);
                f62072a = i46 % 128;
                int i47 = i46 % 2;
                int i48 = (i43 & 7) + (i43 | 7);
                f62072a = i48 % 128;
                int i49 = i48 % 2;
                zBooleanValue4 = false;
            }
            if ((iIntValue3 & 128) != 0) {
                int i50 = f62072a;
                int i51 = i50 & 121;
                int i52 = i51 + ((i50 ^ 121) | i51);
                f62073b = i52 % 128;
                charset = null;
                if (i52 % 2 == 0) {
                    throw null;
                }
                int i53 = (i50 ^ 107) + ((i50 & 107) << 1);
                f62073b = i53 % 128;
                int i54 = i53 % 2;
            }
            String str3 = (String) setDividerPadding(new Object[]{companion, str, Integer.valueOf(iIntValue), Integer.valueOf(iIntValue2), str2, Boolean.valueOf(zBooleanValue), Boolean.valueOf(zBooleanValue2), Boolean.valueOf(zBooleanValue3), Boolean.valueOf(zBooleanValue4), charset}, -1104282979, 1104282982, iIntValue);
            int i55 = f62073b;
            int i56 = ((i55 & 98) + (i55 | 98)) - 1;
            f62072a = i56 % 128;
            int i57 = i56 % 2;
            return str3;
        }

        public static /* synthetic */ String f(Object[] objArr) throws NoSuchAlgorithmException, EOFException {
            String str = (String) objArr[0];
            int iIntValue = ((Number) objArr[1]).intValue();
            int iIntValue2 = ((Number) objArr[2]).intValue();
            boolean zBooleanValue = ((Boolean) objArr[3]).booleanValue();
            int i10 = f62072a;
            int i11 = i10 & 103;
            int i12 = i11 + ((i10 ^ 103) | i11);
            f62073b = i12 % 128;
            if (i12 % 2 == 0) {
                Intrinsics.checkNotNullParameter(str, "");
                throw null;
            }
            Intrinsics.checkNotNullParameter(str, "");
            int i13 = f62073b;
            int i14 = i13 & 55;
            int i15 = (i13 ^ 55) | i14;
            int i16 = ((i14 | i15) << 1) - (i15 ^ i14);
            f62072a = i16 % 128;
            int i17 = i16 % 2;
            int i18 = iIntValue;
            while (true) {
                if (i18 >= iIntValue2) {
                    String strSubstring = str.substring(iIntValue, iIntValue2);
                    Intrinsics.checkNotNullExpressionValue(strSubstring, "");
                    int i19 = f62072a;
                    int i20 = i19 & 117;
                    int i21 = (i19 ^ 117) | i20;
                    int i22 = ((i20 | i21) << 1) - (i21 ^ i20);
                    f62073b = i22 % 128;
                    if (i22 % 2 != 0) {
                        return strSubstring;
                    }
                    throw null;
                }
                int i23 = f62072a;
                int i24 = i23 & 67;
                int i25 = (i23 ^ 67) | i24;
                int i26 = ((i24 | i25) << 1) - (i25 ^ i24);
                f62073b = i26 % 128;
                int i27 = i26 % 2;
                int i28 = (i18 & (-15)) + (i18 | (-15));
                int i29 = (i28 ^ (-1)) + (i28 << 1);
                int i30 = ((i29 ^ 18) + ((i29 & 18) << 1)) - 1;
                char cCharAt = str.charAt(i18);
                if (cCharAt == '%') {
                    break;
                }
                int i31 = f62072a;
                int i32 = (((i31 & (-78)) | (77 & (~i31))) - (~(-(-((i31 & 77) << 1))))) - 1;
                f62073b = i32 % 128;
                int i33 = i32 % 2;
                if (cCharAt == '+') {
                    int i34 = i31 & 73;
                    int i35 = i34 + ((i31 ^ 73) | i34);
                    f62073b = i35 % 128;
                    int i36 = i35 % 2;
                    if (zBooleanValue) {
                        break;
                    }
                }
                i18 = i30;
            }
            abx abxVar = new abx();
            abxVar.setY(str, iIntValue, i18);
            setDividerPadding(new Object[]{abxVar, str, Integer.valueOf(i18), Integer.valueOf(iIntValue2), Boolean.valueOf(zBooleanValue)}, 306956325, -306956324, i18);
            String textAlignment = abxVar.setTextAlignment();
            int i37 = f62073b;
            int i38 = i37 & 53;
            int i39 = (i37 ^ 53) | i38;
            int i40 = (i38 ^ i39) + ((i39 & i38) << 1);
            f62072a = i40 % 128;
            if (i40 % 2 == 0) {
                return textAlignment;
            }
            throw null;
        }

        /* JADX WARN: Code duplicated, block: B:24:0x00d9  */
        public static /* synthetic */ ArrayList g(Object[] objArr) {
            int iIndexOf$default;
            int i10;
            int i11 = 0;
            String str = (String) objArr[0];
            Intrinsics.checkNotNullParameter(str, "");
            ArrayList arrayList = new ArrayList();
            int i12 = f62072a;
            int i13 = ((i12 ^ 13) - (~(-(-((i12 & 13) << 1))))) - 1;
            f62073b = i13 % 128;
            int i14 = i13 % 2;
            while (i11 <= str.length()) {
                int i15 = f62072a;
                int i16 = (i15 & 55) + (i15 | 55);
                f62073b = i16 % 128;
                if (i16 % 2 != 0 ? (iIndexOf$default = StringsKt__StringsKt.indexOf$default((CharSequence) str, Typography.amp, i11, false, 4, (Object) null)) == -1 : (iIndexOf$default = StringsKt__StringsKt.indexOf$default((CharSequence) str, ';', i11, true, 4, (Object) null)) == -1) {
                    int i17 = f62072a;
                    int i18 = i17 & 119;
                    int i19 = ((i17 ^ 119) | i18) << 1;
                    int i20 = -((i17 | 119) & (~i18));
                    int i21 = ((i19 | i20) << 1) - (i20 ^ i19);
                    f62073b = i21 % 128;
                    if (i21 % 2 == 0) {
                        throw null;
                    }
                    iIndexOf$default = str.length();
                    int i22 = f62073b;
                    int i23 = (i22 ^ 5) + ((i22 & 5) << 1);
                    f62072a = i23 % 128;
                    int i24 = i23 % 2;
                }
                int i25 = iIndexOf$default;
                int iIndexOf$default2 = StringsKt__StringsKt.indexOf$default((CharSequence) str, '=', i11, false, 4, (Object) null);
                if (iIndexOf$default2 != -1) {
                    int i26 = f62072a;
                    int i27 = ((i26 & 115) - (~(-(-(i26 | 115))))) - 1;
                    f62073b = i27 % 128;
                    int i28 = i27 % 2;
                    if (iIndexOf$default2 > i25) {
                        String strSubstring = str.substring(i11, i25);
                        Intrinsics.checkNotNullExpressionValue(strSubstring, "");
                        arrayList.add(strSubstring);
                        arrayList.add(null);
                        int i29 = f62072a;
                        i10 = (i29 ^ 23) + ((i29 & 23) << 1);
                        f62073b = i10 % 128;
                    } else {
                        String strSubstring2 = str.substring(i11, iIndexOf$default2);
                        Intrinsics.checkNotNullExpressionValue(strSubstring2, "");
                        arrayList.add(strSubstring2);
                        int i30 = iIndexOf$default2 & 1;
                        int i31 = iIndexOf$default2 | 1;
                        String strSubstring3 = str.substring((i30 ^ i31) + ((i30 & i31) << 1), i25);
                        Intrinsics.checkNotNullExpressionValue(strSubstring3, "");
                        arrayList.add(strSubstring3);
                        int i32 = f62073b;
                        i10 = ((i32 & 13) - (~(i32 | 13))) - 1;
                        f62072a = i10 % 128;
                    }
                } else {
                    String strSubstring4 = str.substring(i11, i25);
                    Intrinsics.checkNotNullExpressionValue(strSubstring4, "");
                    arrayList.add(strSubstring4);
                    arrayList.add(null);
                    int i210 = f62072a;
                    i10 = (i210 ^ 23) + ((i210 & 23) << 1);
                    f62073b = i10 % 128;
                }
                int i33 = i10 % 2;
                int i34 = (i25 | 1) << 1;
                int i35 = -((i25 & (-2)) | ((~i25) & 1));
                i11 = ((i34 | i35) << 1) - (i34 ^ i35);
                int i36 = f62073b;
                int i37 = (i36 ^ 14) + ((i36 & 14) << 1);
                int i38 = (i37 ^ (-1)) + (i37 << 1);
                f62072a = i38 % 128;
                int i39 = i38 % 2;
            }
            int i40 = f62073b;
            int i41 = ((i40 & (-74)) | ((~i40) & 73)) + ((i40 & 73) << 1);
            f62072a = i41 % 128;
            if (i41 % 2 == 0) {
                return arrayList;
            }
            throw null;
        }

        public static /* synthetic */ Integer h(Object[] objArr) {
            String str = (String) objArr[0];
            int i10 = f62072a;
            int i11 = i10 ^ 49;
            int i12 = (i10 & 49) << 1;
            int i13 = ((i11 | i12) << 1) - (i12 ^ i11);
            f62073b = i13 % 128;
            if (i13 % 2 == 0) {
                Intrinsics.checkNotNullParameter(str, "");
                Intrinsics.areEqual(str, ProxyConfig.MATCH_HTTP);
                throw null;
            }
            Intrinsics.checkNotNullParameter(str, "");
            if (!(!Intrinsics.areEqual(str, ProxyConfig.MATCH_HTTP))) {
                int i14 = f62073b;
                int i15 = i14 & 55;
                int i16 = (i14 | 55) & (~i15);
                int i17 = -(-(i15 << 1));
                int i18 = ((i16 | i17) << 1) - (i16 ^ i17);
                f62072a = i18 % 128;
                if (i18 % 2 == 0) {
                    return 80;
                }
                throw null;
            }
            if (Intrinsics.areEqual(str, ProxyConfig.MATCH_HTTPS)) {
                int i19 = f62073b;
                int i20 = (i19 & 31) + (i19 | 31);
                f62072a = i20 % 128;
                return Integer.valueOf(i20 % 2 != 0 ? 20182 : 443);
            }
            int i21 = f62072a;
            int i22 = ((i21 | 7) << 1) - (i21 ^ 7);
            f62073b = i22 % 128;
            if (i22 % 2 != 0) {
                return -1;
            }
            int i23 = 66 / 0;
            return -1;
        }

        public static /* synthetic */ void i(Object[] objArr) {
            int size;
            int i10;
            char c10;
            int i11 = 0;
            List list = (List) objArr[0];
            StringBuilder sb2 = (StringBuilder) objArr[1];
            int i12 = f62073b;
            int i13 = i12 & 49;
            int i14 = ((((i12 ^ 49) | i13) << 1) - (~(-((i12 | 49) & (~i13))))) - 1;
            f62072a = i14 % 128;
            if (i14 % 2 != 0) {
                Intrinsics.checkNotNullParameter(list, "");
                Intrinsics.checkNotNullParameter(sb2, "");
                size = list.size();
                i11 = 1;
            } else {
                Intrinsics.checkNotNullParameter(list, "");
                Intrinsics.checkNotNullParameter(sb2, "");
                size = list.size();
            }
            int i15 = f62072a;
            int i16 = (i15 ^ 111) + ((i15 & 111) << 1);
            f62073b = i16 % 128;
            int i17 = i16 % 2;
            while (i11 < size) {
                int i18 = f62072a;
                int i19 = ((i18 & 96) + (i18 | 96)) - 1;
                f62073b = i19 % 128;
                if (i19 % 2 == 0) {
                    i10 = (i11 ^ 59) + ((i11 & 59) << 1);
                    c10 = 30;
                } else {
                    int i20 = i11 & 49;
                    int i21 = -(-((i11 ^ 49) | i20));
                    int i22 = ((i20 | i21) << 1) - (i20 ^ i21);
                    i10 = (((i22 | (-47)) << 1) - (i22 ^ (-47))) - 1;
                    c10 = JsonPointer.SEPARATOR;
                }
                sb2.append(c10);
                sb2.append((String) list.get(i11));
                i11 = i10;
            }
            int i23 = f62073b;
            int i24 = i23 & 87;
            int i25 = (i24 - (~((i23 ^ 87) | i24))) - 1;
            f62072a = i25 % 128;
            if (i25 % 2 != 0) {
                throw null;
            }
        }

        @JvmStatic
        @JvmName(name = "get")
        @NotNull
        public static yg setCompoundDrawableTintBlendMode(@NotNull String str) {
            return (yg) setDividerPadding(new Object[]{str}, -655114145, 655114147, (int) System.currentTimeMillis());
        }

        /* JADX WARN: Code duplicated, block: B:20:0x0228  */
        /* JADX WARN: Code duplicated, block: B:42:0x0337  */
        /* JADX WARN: Code duplicated, block: B:44:0x0496  */
        /* JADX WARN: Code duplicated, block: B:66:0x056a A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:67:0x0565 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:69:0x04ac A[SYNTHETIC] */
        public static /* synthetic */ Object setDividerPadding(Object[] objArr, int i10, int i11, int i12) {
            int i13;
            int i14;
            int i15;
            int i16;
            int iIntValue;
            int iIntValue2;
            int i17;
            Boolean bool;
            int i18 = ~i12;
            int i19 = ~(i18 | i10);
            int i20 = ((i11 | i19) * 764) + (i11 * (-1527)) + (i10 * 765);
            int i21 = ~((~i10) | i11);
            int i22 = 2;
            int i23 = 1;
            switch ((((~(i10 | (~i11))) | i21 | i19) * 764) + (((~(i18 | i11)) | i21) * (-1528)) + i20) {
                case 1:
                    abx abxVar = (abx) objArr[0];
                    String str = (String) objArr[1];
                    int iIntValue3 = ((Number) objArr[2]).intValue();
                    int iIntValue4 = ((Number) objArr[3]).intValue();
                    boolean zBooleanValue = ((Boolean) objArr[4]).booleanValue();
                    int i24 = f62072a;
                    int i25 = ((i24 & 106) + (i24 | 106)) - 1;
                    f62073b = i25 % 128;
                    int i26 = i25 % 2;
                    int i27 = i24 & 111;
                    int i28 = (((i24 | 111) & (~i27)) - (~(-(-(i27 << 1))))) - 1;
                    f62073b = i28 % 128;
                    int i29 = i28 % 2;
                    int i30 = iIntValue3;
                    while (i30 < iIntValue4) {
                        int i31 = f62072a;
                        int i32 = ((i31 & (-20)) | ((~i31) & 19)) + ((i31 & 19) << i23);
                        f62073b = i32 % 128;
                        int i33 = i32 % i22;
                        int iCodePointAt = str.codePointAt(i30);
                        if (iCodePointAt == 37) {
                            int i34 = f62073b;
                            int i35 = (i34 & 125) + (i34 | 125);
                            f62072a = i35 % 128;
                            if (i35 % i22 == 0) {
                                int i36 = i30 & 2;
                                if (((((i30 ^ 2) | i36) << i23) - (~(-((~i36) & (i30 | 2))))) - i23 < iIntValue4) {
                                    int i37 = i30 * TypedValues.MotionType.TYPE_EASING;
                                    int i38 = (302 & i37) + (i37 | 302);
                                    i15 = ~iIntValue3;
                                    int i39 = (-2) & i15;
                                    int i40 = (~i39) & ((-2) | i15);
                                    int i41 = ~((i40 ^ i39) | (i39 & i40));
                                    int i42 = i30 ^ i41;
                                    int i43 = i41 & i30;
                                    int i44 = ((i42 ^ i43) | (i43 & i42)) * (-602);
                                    int i45 = ((i38 | i44) << i23) - (i38 ^ i44);
                                    int i46 = ~i30;
                                    int i47 = (-2) ^ i46;
                                    int i48 = (-2) & i46;
                                    int i49 = (i47 ^ i48) | (i47 & i48);
                                    int i50 = ~i49;
                                    int i51 = (i49 | i50) & i50;
                                    int i52 = (-2) & iIntValue3;
                                    int i53 = (~i52) & ((-2) | iIntValue3);
                                    int i54 = ~((i53 ^ i52) | (i52 & i53));
                                    int i55 = ((~i51) & i54) | ((~i54) & i51);
                                    int i56 = i51 & i54;
                                    int i57 = (i56 & i55) | (i55 ^ i56);
                                    i16 = (i15 | iIntValue3) & i15;
                                    int i58 = (i16 & (-2)) | ((~i16) & i23);
                                    int i59 = i16 & 1;
                                    int i60 = (i58 ^ i59) | (i58 & i59);
                                    int i61 = ~((i60 & i30) | (i60 ^ i30));
                                    int i62 = i57 ^ i61;
                                    int i63 = i57 & i61;
                                    int i64 = -(-(((i63 & i62) | (i62 ^ i63)) * (-301)));
                                    int i65 = i45 ^ i64;
                                    int i66 = ((i64 & i45) | i65) << i23;
                                    int i67 = -i65;
                                    int i68 = (i66 & i67) + (i66 | i67);
                                    int i69 = i15 & i30;
                                    int i70 = (~i69) & (i15 | i30);
                                    int i71 = -(-((~((i69 & i70) | (i70 ^ i69))) * 301));
                                    int i72 = i68 & i71;
                                    char cCharAt = str.charAt(i72 + ((i71 ^ i68) | i72));
                                    Object[] objArr2 = new Object[i23];
                                    objArr2[0] = Character.valueOf(cCharAt);
                                    iIntValue = ((Integer) yt.setY(objArr2, -1275601009, 1275601040, (int) System.currentTimeMillis())).intValue();
                                    int i73 = -(-(i30 * (-301)));
                                    int i74 = (606 | i73) << i23;
                                    int i75 = -((i73 & (-607)) | (606 & (~i73)));
                                    int i76 = ((i74 | i75) << i23) - (i75 ^ i74);
                                    int i77 = (-3) & i16;
                                    int i78 = ((~i77) & ((-3) | i16)) | i77 | i30;
                                    int i79 = ~i78;
                                    int i80 = (i78 | i79) & i79;
                                    int i81 = i30 & 2;
                                    int i82 = (~i81) & (i30 | 2);
                                    int i83 = (i82 ^ i81) | (i82 & i81);
                                    int i84 = i83 ^ iIntValue3;
                                    int i85 = i83 & iIntValue3;
                                    int i86 = (i84 ^ i85) | (i85 & i84);
                                    int i87 = ~i86;
                                    int i88 = (i86 | i87) & i87;
                                    int i89 = i80 & i88;
                                    int i90 = (i80 | i88) & (~i89);
                                    int i91 = -(-(((i90 & i89) | (i90 ^ i89)) * (-302)));
                                    int i92 = ((i76 ^ i91) - (~(-(-((i91 & i76) << 1))))) - 1;
                                    int i93 = ((-3) ^ i30) | ((-3) & i30);
                                    int i94 = (i93 & iIntValue3) | (i93 ^ iIntValue3);
                                    int i95 = ~i94;
                                    int i96 = (i92 - (~(-(~(-(-(((i94 | i95) & i95) * (-604)))))))) - 2;
                                    int i97 = i46 & 2;
                                    int i98 = (i46 | 2) & (~i97);
                                    int i99 = ~((i98 & i97) | (i98 ^ i97));
                                    int i100 = ~(i30 | iIntValue3);
                                    int i101 = i99 & i100;
                                    int i102 = (((i99 | i100) & (~i101)) | i101) * 302;
                                    int i103 = ((~i102) & i96) | ((~i96) & i102);
                                    int i104 = (i102 & i96) << 1;
                                    iIntValue2 = ((Integer) yt.setY(new Object[]{Character.valueOf(str.charAt((i103 ^ i104) + ((i104 & i103) << 1)))}, -1275601009, 1275601040, (int) System.currentTimeMillis())).intValue();
                                    if (iIntValue != -1) {
                                        i17 = f62072a;
                                        int i105 = ((i17 ^ 70) + ((i17 & 70) << 1)) - 1;
                                        f62073b = i105 % 128;
                                        int i106 = i105 % 2;
                                        if (iIntValue2 != -1) {
                                            int i107 = i17 + 35;
                                            f62073b = i107 % 128;
                                            int i108 = i107 % 2;
                                            int i109 = iIntValue << 4;
                                            int i110 = -(-iIntValue2);
                                            int i111 = ((i109 & i110) - (~(-(-(i109 | i110))))) - 1;
                                            int i112 = 126 - (((i30 & (-125)) + (i30 | (-125))) ^ (-1));
                                            int iCharCount = Character.charCount(iCodePointAt);
                                            int i113 = iCharCount * (-494);
                                            int i114 = i112 * (-494);
                                            int i115 = i113 ^ i114;
                                            int i116 = ((((i113 & i114) | i115) << 1) - (~(-i115))) - 1;
                                            int i117 = ~i112;
                                            int i118 = ~iCharCount;
                                            int i119 = (iCharCount & i117) | (i112 & i118);
                                            int i120 = i112 & iCharCount;
                                            int i121 = (i120 & i119) | (i119 ^ i120);
                                            int i122 = ~i121;
                                            int i123 = ((i121 | i122) & i122) * (-495);
                                            int i124 = i116 & i123;
                                            int i125 = -(-(i123 | i116));
                                            int i126 = ((i124 | i125) << 1) - (i125 ^ i124);
                                            int i127 = iCharCount & i16;
                                            int i128 = (i16 | iCharCount) & (~i127);
                                            int i129 = -(-(((i128 & i127) | (i128 ^ i127)) * 495));
                                            int i130 = i126 ^ i129;
                                            int i131 = (((i129 & i126) | i130) << 1) - i130;
                                            int i132 = i118 & i117;
                                            int i133 = (~i132) & (i117 | i118);
                                            int i134 = ~((i132 & i133) | (i133 ^ i132));
                                            int i135 = i15 & iCharCount;
                                            int i136 = ((iCharCount | i15) & (~i135)) | i135;
                                            int i137 = ~i136;
                                            int i138 = (i136 | i137) & i137;
                                            int i139 = ((i134 & i138) | (i134 ^ i138)) * 495;
                                            int i140 = i131 & i139;
                                            i30 = (i140 - (~(-(-((i131 ^ i139) | i140))))) - 1;
                                            int i141 = f62073b;
                                            int i142 = i141 & 95;
                                            int i143 = ((i141 ^ 95) | i142) << 1;
                                            int i144 = -((i141 | 95) & (~i142));
                                            int i145 = (i143 ^ i144) + ((i144 & i143) << 1);
                                            f62072a = i145 % 128;
                                            int i146 = i145 % 2;
                                            i22 = 2;
                                            i23 = 1;
                                        } else {
                                            i14 = 2;
                                        }
                                    } else {
                                        i14 = 2;
                                    }
                                    i13 = 1;
                                    Object[] objArr3 = new Object[i14];
                                    objArr3[0] = abxVar;
                                    objArr3[i13] = Integer.valueOf(iCodePointAt);
                                    int i147 = -(-Character.charCount(iCodePointAt));
                                    int i148 = i30 & i147;
                                    int i149 = -(-((i30 ^ i147) | i148));
                                    i30 = (i149 | i148) + (i148 & i149);
                                    int i150 = f62072a + 47;
                                    f62073b = i150 % 128;
                                    int i151 = i150 % 2;
                                    i23 = i13;
                                    i22 = 2;
                                }
                            } else if ((i30 << 5) < iIntValue4) {
                                int i310 = i30 * TypedValues.MotionType.TYPE_EASING;
                                int i311 = (302 & i310) + (i310 | 302);
                                i15 = ~iIntValue3;
                                int i312 = (-2) & i15;
                                int i410 = (~i312) & ((-2) | i15);
                                int i411 = ~((i410 ^ i312) | (i312 & i410));
                                int i412 = i30 ^ i411;
                                int i413 = i411 & i30;
                                int i414 = ((i412 ^ i413) | (i413 & i412)) * (-602);
                                int i415 = ((i311 | i414) << i23) - (i311 ^ i414);
                                int i416 = ~i30;
                                int i417 = (-2) ^ i416;
                                int i418 = (-2) & i416;
                                int i419 = (i417 ^ i418) | (i417 & i418);
                                int i510 = ~i419;
                                int i511 = (i419 | i510) & i510;
                                int i512 = (-2) & iIntValue3;
                                int i513 = (~i512) & ((-2) | iIntValue3);
                                int i514 = ~((i513 ^ i512) | (i512 & i513));
                                int i515 = ((~i511) & i514) | ((~i514) & i511);
                                int i516 = i511 & i514;
                                int i517 = (i516 & i515) | (i515 ^ i516);
                                i16 = (i15 | iIntValue3) & i15;
                                int i518 = (i16 & (-2)) | ((~i16) & i23);
                                int i519 = i16 & 1;
                                int i610 = (i518 ^ i519) | (i518 & i519);
                                int i611 = ~((i610 & i30) | (i610 ^ i30));
                                int i612 = i517 ^ i611;
                                int i613 = i517 & i611;
                                int i614 = -(-(((i613 & i612) | (i612 ^ i613)) * (-301)));
                                int i615 = i415 ^ i614;
                                int i616 = ((i614 & i415) | i615) << i23;
                                int i617 = -i615;
                                int i618 = (i616 & i617) + (i616 | i617);
                                int i619 = i15 & i30;
                                int i710 = (~i619) & (i15 | i30);
                                int i711 = -(-((~((i619 & i710) | (i710 ^ i619))) * 301));
                                int i712 = i618 & i711;
                                char cCharAt2 = str.charAt(i712 + ((i711 ^ i618) | i712));
                                Object[] objArr4 = new Object[i23];
                                objArr4[0] = Character.valueOf(cCharAt2);
                                iIntValue = ((Integer) yt.setY(objArr4, -1275601009, 1275601040, (int) System.currentTimeMillis())).intValue();
                                int i713 = -(-(i30 * (-301)));
                                int i714 = (606 | i713) << i23;
                                int i715 = -((i713 & (-607)) | (606 & (~i713)));
                                int i716 = ((i714 | i715) << i23) - (i715 ^ i714);
                                int i717 = (-3) & i16;
                                int i718 = ((~i717) & ((-3) | i16)) | i717 | i30;
                                int i719 = ~i718;
                                int i810 = (i718 | i719) & i719;
                                int i811 = i30 & 2;
                                int i812 = (~i811) & (i30 | 2);
                                int i813 = (i812 ^ i811) | (i812 & i811);
                                int i814 = i813 ^ iIntValue3;
                                int i815 = i813 & iIntValue3;
                                int i816 = (i814 ^ i815) | (i815 & i814);
                                int i817 = ~i816;
                                int i818 = (i816 | i817) & i817;
                                int i819 = i810 & i818;
                                int i910 = (i810 | i818) & (~i819);
                                int i911 = -(-(((i910 & i819) | (i910 ^ i819)) * (-302)));
                                int i912 = ((i716 ^ i911) - (~(-(-((i911 & i716) << 1))))) - 1;
                                int i913 = ((-3) ^ i30) | ((-3) & i30);
                                int i914 = (i913 & iIntValue3) | (i913 ^ iIntValue3);
                                int i915 = ~i914;
                                int i916 = (i912 - (~(-(~(-(-(((i914 | i915) & i915) * (-604)))))))) - 2;
                                int i917 = i416 & 2;
                                int i918 = (i416 | 2) & (~i917);
                                int i919 = ~((i918 & i917) | (i918 ^ i917));
                                int i1010 = ~(i30 | iIntValue3);
                                int i1011 = i919 & i1010;
                                int i1012 = (((i919 | i1010) & (~i1011)) | i1011) * 302;
                                int i1013 = ((~i1012) & i916) | ((~i916) & i1012);
                                int i1014 = (i1012 & i916) << 1;
                                iIntValue2 = ((Integer) yt.setY(new Object[]{Character.valueOf(str.charAt((i1013 ^ i1014) + ((i1014 & i1013) << 1)))}, -1275601009, 1275601040, (int) System.currentTimeMillis())).intValue();
                                if (iIntValue != -1) {
                                    i17 = f62072a;
                                    int i1015 = ((i17 ^ 70) + ((i17 & 70) << 1)) - 1;
                                    f62073b = i1015 % 128;
                                    int i1016 = i1015 % 2;
                                    if (iIntValue2 != -1) {
                                        int i1017 = i17 + 35;
                                        f62073b = i1017 % 128;
                                        int i1018 = i1017 % 2;
                                        int i1019 = iIntValue << 4;
                                        int i1110 = -(-iIntValue2);
                                        int i1111 = ((i1019 & i1110) - (~(-(-(i1019 | i1110))))) - 1;
                                        int i1112 = 126 - (((i30 & (-125)) + (i30 | (-125))) ^ (-1));
                                        int iCharCount2 = Character.charCount(iCodePointAt);
                                        int i1113 = iCharCount2 * (-494);
                                        int i1114 = i1112 * (-494);
                                        int i1115 = i1113 ^ i1114;
                                        int i1116 = ((((i1113 & i1114) | i1115) << 1) - (~(-i1115))) - 1;
                                        int i1117 = ~i1112;
                                        int i1118 = ~iCharCount2;
                                        int i1119 = (iCharCount2 & i1117) | (i1112 & i1118);
                                        int i1210 = i1112 & iCharCount2;
                                        int i1211 = (i1210 & i1119) | (i1119 ^ i1210);
                                        int i1212 = ~i1211;
                                        int i1213 = ((i1211 | i1212) & i1212) * (-495);
                                        int i1214 = i1116 & i1213;
                                        int i1215 = -(-(i1213 | i1116));
                                        int i1216 = ((i1214 | i1215) << 1) - (i1215 ^ i1214);
                                        int i1217 = iCharCount2 & i16;
                                        int i1218 = (i16 | iCharCount2) & (~i1217);
                                        int i1219 = -(-(((i1218 & i1217) | (i1218 ^ i1217)) * 495));
                                        int i1310 = i1216 ^ i1219;
                                        int i1311 = (((i1219 & i1216) | i1310) << 1) - i1310;
                                        int i1312 = i1118 & i1117;
                                        int i1313 = (~i1312) & (i1117 | i1118);
                                        int i1314 = ~((i1312 & i1313) | (i1313 ^ i1312));
                                        int i1315 = i15 & iCharCount2;
                                        int i1316 = ((iCharCount2 | i15) & (~i1315)) | i1315;
                                        int i1317 = ~i1316;
                                        int i1318 = (i1316 | i1317) & i1317;
                                        int i1319 = ((i1314 & i1318) | (i1314 ^ i1318)) * 495;
                                        int i1410 = i1311 & i1319;
                                        i30 = (i1410 - (~(-(-((i1311 ^ i1319) | i1410))))) - 1;
                                        int i1411 = f62073b;
                                        int i1412 = i1411 & 95;
                                        int i1413 = ((i1411 ^ 95) | i1412) << 1;
                                        int i1414 = -((i1411 | 95) & (~i1412));
                                        int i1415 = (i1413 ^ i1414) + ((i1414 & i1413) << 1);
                                        f62072a = i1415 % 128;
                                        int i1416 = i1415 % 2;
                                        i22 = 2;
                                        i23 = 1;
                                    } else {
                                        i14 = 2;
                                    }
                                } else {
                                    i14 = 2;
                                }
                                i13 = 1;
                                Object[] objArr5 = new Object[i14];
                                objArr5[0] = abxVar;
                                objArr5[i13] = Integer.valueOf(iCodePointAt);
                                int i1417 = -(-Character.charCount(iCodePointAt));
                                int i1418 = i30 & i1417;
                                int i1419 = -(-((i30 ^ i1417) | i1418));
                                i30 = (i1419 | i1418) + (i1418 & i1419);
                                int i152 = f62072a + 47;
                                f62073b = i152 % 128;
                                int i153 = i152 % 2;
                                i23 = i13;
                                i22 = 2;
                            }
                        }
                        if (iCodePointAt == 43) {
                            int i154 = f62073b;
                            int i155 = (((i154 | 73) << 1) - (~(-(((~i154) & 73) | (i154 & (-74)))))) - 1;
                            int i156 = i155 % 128;
                            f62072a = i156;
                            int i157 = i155 % 2;
                            if (zBooleanValue) {
                                int i158 = i156 & 107;
                                int i159 = (i156 ^ 107) | i158;
                                i13 = 1;
                                int i160 = (i158 ^ i159) + ((i159 & i158) << 1);
                                f62073b = i160 % 128;
                                if (i160 % 2 == 0) {
                                    i30 = 0;
                                } else {
                                    i30 = ((i30 ^ 2) + ((i30 & 2) << 1)) - 1;
                                }
                            }
                            i23 = i13;
                            i22 = 2;
                        }
                        i13 = 1;
                        i14 = 2;
                        Object[] objArr6 = new Object[i14];
                        objArr6[0] = abxVar;
                        objArr6[i13] = Integer.valueOf(iCodePointAt);
                        int i14110 = -(-Character.charCount(iCodePointAt));
                        int i14111 = i30 & i14110;
                        int i14112 = -(-((i30 ^ i14110) | i14111));
                        i30 = (i14112 | i14111) + (i14111 & i14112);
                        int i1510 = f62072a + 47;
                        f62073b = i1510 % 128;
                        int i1511 = i1510 % 2;
                        i23 = i13;
                        i22 = 2;
                    }
                    int i161 = f62072a;
                    int i162 = i161 & 11;
                    int i163 = (i161 ^ 11) | i162;
                    int i164 = (i162 & i163) + (i163 | i162);
                    f62073b = i164 % 128;
                    int i165 = i164 % 2;
                    return null;
                case 2:
                    String str2 = (String) objArr[0];
                    Intrinsics.checkNotNullParameter(str2, "");
                    setDividerPadding setdividerpadding = new setDividerPadding();
                    setDividerPadding setdividerpadding2 = (setDividerPadding) setDividerPadding.setCompoundDrawableTintBlendMode(new Object[]{setdividerpadding, null, str2}, 789124859, -789124844, System.identityHashCode(setdividerpadding));
                    yg ygVar = (yg) setDividerPadding.setCompoundDrawableTintBlendMode(new Object[]{setdividerpadding2}, -761647430, 761647459, System.identityHashCode(setdividerpadding2));
                    int i166 = f62072a;
                    int i167 = (i166 ^ 79) + ((i166 & 79) << 1);
                    f62073b = i167 % 128;
                    int i168 = i167 % 2;
                    return ygVar;
                case 3:
                    return b(objArr);
                case 4:
                    c(objArr);
                    return null;
                case 5:
                    i(objArr);
                    return null;
                case 6:
                    return h(objArr);
                case 7:
                    return a(objArr);
                case 8:
                    d(objArr);
                    return null;
                case 9:
                    return e(objArr);
                case 10:
                    return f(objArr);
                case 11:
                    String str3 = (String) objArr[0];
                    int iIntValue5 = ((Number) objArr[1]).intValue();
                    int iIntValue6 = ((Number) objArr[2]).intValue();
                    int i169 = f62073b;
                    int i170 = (i169 ^ 103) + ((i169 & 103) << 1);
                    f62072a = i170 % 128;
                    int i171 = i170 % 2;
                    int i172 = iIntValue5 * (-279);
                    int i173 = 282 & i172;
                    int i174 = (~i173) & (i172 | 282);
                    int i175 = -(-(i173 << 1));
                    int i176 = (i174 ^ i175) + ((i174 & i175) << 1);
                    int i177 = ~iIntValue5;
                    int i178 = iIntValue5 & i177;
                    int i179 = i178 | i178;
                    int i180 = iIntValue5 & iIntValue5;
                    int i181 = ((i179 ^ i180) | (i179 & i180)) * 140;
                    int i182 = ((i176 | i181) << 1) - (i176 ^ i181);
                    int i183 = (-3) & iIntValue5;
                    int i184 = ~(((~i183) & ((-3) | iIntValue5)) | i183);
                    int i185 = ~i177;
                    int i186 = ~((i177 & i177) | (iIntValue5 & i185) | i178);
                    int i187 = -(-(((i184 ^ i186) | (i186 & i184)) * (-280)));
                    int i188 = i182 & i187;
                    int i189 = ((i182 ^ i187) | i188) << 1;
                    int i190 = -((i182 | i187) & (~i188));
                    int i191 = (i189 & i190) + (i190 | i189);
                    int i192 = i177 ^ 2;
                    int i193 = i177 & 2;
                    int i194 = ~((i192 ^ i193) | (i192 & i193));
                    int i195 = i177 & (-3);
                    int i196 = i195 | (i185 & 2);
                    int i197 = ~((i196 ^ i193) | (i196 & i193));
                    int i198 = (i194 & i197) | ((~i194) & i197) | ((~i197) & i194);
                    int i199 = ((-3) ^ iIntValue5) | i183;
                    int i200 = i199 & iIntValue5;
                    int i201 = (i199 | iIntValue5) & (~i200);
                    int i202 = (i198 | (~((i201 & i200) | (i201 ^ i200)))) * 140;
                    int i203 = i191 & i202;
                    if (i203 + ((i202 ^ i191) | i203) < iIntValue6) {
                        int i204 = i169 & 95;
                        int i205 = ((~i204) & (i169 | 95)) + (i204 << 1);
                        f62072a = i205 % 128;
                        if (i205 % 2 == 0 ? str3.charAt(iIntValue5) != '%' : str3.charAt(iIntValue5) != 'u') {
                            int i206 = f62073b;
                            int i207 = i206 & 77;
                            int i208 = (i207 - (~((i206 ^ 77) | i207))) - 1;
                            f62072a = i208 % 128;
                            int i209 = i208 % 2;
                            bool = Boolean.FALSE;
                        } else {
                            int i210 = iIntValue5 * (-103);
                            int i211 = (-103) & i210;
                            int i212 = (i210 ^ (-103)) | i211;
                            int i213 = (i211 ^ i212) + ((i212 & i211) << 1);
                            int i214 = (-2) & i177;
                            int i215 = ~(((-2) ^ i177) | i214);
                            int i216 = i177 ^ iIntValue5;
                            int i217 = ~((i216 & i178) | (i216 ^ i178));
                            int i218 = i215 & i217;
                            int i219 = (i215 | i217) & (~i218);
                            int i220 = (i213 - (~(-(~(-(-(((i219 & i218) | (i219 ^ i218)) * 104))))))) - 2;
                            int i221 = (i185 & 1) | i214;
                            int i222 = i177 & 1;
                            int i223 = (i221 & i222) | (i221 ^ i222) | iIntValue5;
                            int i224 = ~i223;
                            int i225 = -(-(((i223 | i224) & i224) * (-104)));
                            int i226 = ((((~i225) & i220) | ((~i220) & i225)) - (~(-(-((i225 & i220) << 1))))) - 1;
                            int i227 = -(-(((iIntValue5 ^ 1) | (iIntValue5 & 1)) * 104));
                            int i228 = i226 & i227;
                            if (((Integer) yt.setY(new Object[]{Character.valueOf(str3.charAt(i228 + ((i227 ^ i226) | i228)))}, -1275601009, 1275601040, (int) System.currentTimeMillis())).intValue() != -1) {
                                int i229 = f62072a;
                                int i230 = (((i229 | 58) << 1) - (i229 ^ 58)) - 1;
                                f62073b = i230 % 128;
                                int i231 = i230 % 2;
                                int i232 = -(-(iIntValue5 * 917));
                                int i233 = (-3662) & i232;
                                int i234 = (i232 | (-3662)) & (~i233);
                                int i235 = i233 << 1;
                                int i236 = (i234 & i235) + (i234 | i235);
                                int i237 = iIntValue5 & 2;
                                int i238 = i195 | i237;
                                int i239 = (~((i238 & i183) | (i238 ^ i183))) * 2748;
                                int i240 = i236 & i239;
                                int i241 = (i240 - (~(-(-((i239 ^ i236) | i240))))) - 1;
                                int i242 = (i177 | iIntValue5) & i177;
                                int i243 = (i241 - (~(-(-(((i242 & (-3)) | ((-3) ^ i242)) * (-916)))))) - 1;
                                int i244 = ((-3) ^ i177) | i195;
                                int i245 = ~i244;
                                int i246 = (i244 | i245) & i245;
                                int i247 = iIntValue5 ^ 2;
                                int i248 = (i247 & i237) | (i247 ^ i237);
                                int i249 = ~i248;
                                int i250 = (i248 | i249) & i249;
                                int i251 = i246 & i250;
                                int i252 = (i250 | i246) & (~i251);
                                int i253 = -(-(((i252 & i251) | (i252 ^ i251)) * 916));
                                int i254 = i243 & i253;
                                int i255 = (i253 ^ i243) | i254;
                                if (((Integer) yt.setY(new Object[]{Character.valueOf(str3.charAt((i254 & i255) + (i255 | i254)))}, -1275601009, 1275601040, (int) System.currentTimeMillis())).intValue() != -1) {
                                    int i256 = f62073b;
                                    int i257 = i256 & 121;
                                    int i258 = -(-(i256 | 121));
                                    int i259 = (i257 ^ i258) + ((i258 & i257) << 1);
                                    int i260 = i259 % 128;
                                    f62072a = i260;
                                    int i261 = i259 % 2;
                                    int i262 = i260 & 35;
                                    int i263 = (i260 ^ 35) | i262;
                                    int i264 = (i262 & i263) + (i263 | i262);
                                    f62073b = i264 % 128;
                                    int i265 = i264 % 2;
                                    bool = Boolean.TRUE;
                                } else {
                                    int i2010 = f62073b;
                                    int i2011 = i2010 & 77;
                                    int i2012 = (i2011 - (~((i2010 ^ 77) | i2011))) - 1;
                                    f62072a = i2012 % 128;
                                    int i2013 = i2012 % 2;
                                    bool = Boolean.FALSE;
                                }
                            } else {
                                int i2014 = f62073b;
                                int i2015 = i2014 & 77;
                                int i2016 = (i2015 - (~((i2014 ^ 77) | i2015))) - 1;
                                f62072a = i2016 % 128;
                                int i2017 = i2016 % 2;
                                bool = Boolean.FALSE;
                            }
                        }
                    } else {
                        int i2018 = f62073b;
                        int i2019 = i2018 & 77;
                        int i20110 = (i2019 - (~((i2018 ^ 77) | i2019))) - 1;
                        f62072a = i20110 % 128;
                        int i20111 = i20110 % 2;
                        bool = Boolean.FALSE;
                    }
                    return bool;
                default:
                    return g(objArr);
            }
        }

        public static /* synthetic */ String setOnFocusChangeListener(Companion companion, String str, int i10, int i11, String str2, boolean z10, boolean z11, boolean z12, boolean z13, Charset charset, int i12) {
            return (String) setDividerPadding(new Object[]{companion, str, Integer.valueOf(i10), Integer.valueOf(i11), str2, Boolean.valueOf(z10), Boolean.valueOf(z11), Boolean.valueOf(z12), Boolean.valueOf(z13), charset, Integer.valueOf(i12)}, -700019500, 700019509, i10);
        }

        public static /* synthetic */ String setX(Companion companion, String str, int i10, int i11, boolean z10, int i12) {
            return (String) setDividerPadding(new Object[]{companion, str, Integer.valueOf(i10), Integer.valueOf(i11), Boolean.valueOf(z10), Integer.valueOf(i12)}, 237128219, -237128212, i10);
        }

        public static void setY(@NotNull List<String> list, @NotNull StringBuilder sb2) {
            setDividerPadding(new Object[]{list, sb2}, -313014387, 313014395, (int) System.currentTimeMillis());
        }

        public static void setOnFocusChangeListener(@NotNull List<String> list, @NotNull StringBuilder sb2) {
            setDividerPadding(new Object[]{list, sb2}, 618922324, -618922319, (int) System.currentTimeMillis());
        }

        @NotNull
        public static List<String> setX(@NotNull String str) {
            return (List) setDividerPadding(new Object[]{str}, 983036855, -983036855, (int) System.currentTimeMillis());
        }

        @JvmStatic
        public static int setY(@NotNull String str) {
            return ((Integer) setDividerPadding(new Object[]{str}, -728502532, 728502538, (int) System.currentTimeMillis())).intValue();
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010!\n\u0002\b\u0006\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u0007¢\u0006\u0004\b'\u0010(J\u0017\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0006\u0010\u0005J\u0017\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0007\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\b\u0010\u0005J\u0017\u0010\n\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\tH\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\f\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0007¢\u0006\u0004\b\f\u0010\u0005J\u000f\u0010\r\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\n\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\n\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0011\u0010\u0012J!\u0010\u0014\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0013\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u0014\u0010\u0015R$\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0014\u0010\u0012\"\u0004\b\r\u0010\u0018R\"\u0010\u0014\u001a\u00020\u00028\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u0017\u001a\u0004\b\u001a\u0010\u0012\"\u0004\b\n\u0010\u0018R\"\u0010\u001c\u001a\u00020\u00028\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u0017\u001a\u0004\b\f\u0010\u0012\"\u0004\b\u001c\u0010\u0018R$\u0010\f\u001a\u0004\u0018\u00010\u00028\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u0017\u001a\u0004\b\u0007\u0010\u0012\"\u0004\b\u001a\u0010\u0018R\"\u0010\b\u001a\u00020\t8\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u0004\u0010 \"\u0004\b\u0014\u0010!R \u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\"8\u0001X\u0081\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b\u001c\u0010%R$\u0010\r\u001a\u0004\u0018\u00010\u00028\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\b&\u0010\u0017\u001a\u0004\b\u0006\u0010\u0012\"\u0004\b\u0014\u0010\u0018"}, d2 = {"Lcom/mypinpad/tsdk/i/yg$setDividerPadding;", "", "", "p0", "setLayoutAnimation", "(Ljava/lang/String;)Lcom/mypinpad/tsdk/i/yg$setDividerPadding;", "setNavigationOnClickListener", "setOnLongClickListener", "setOnDragListener", "", "setDividerPadding", "(I)Lcom/mypinpad/tsdk/i/yg$setDividerPadding;", "getNavBarTitleString", "setY", "()Lcom/mypinpad/tsdk/i/yg$setDividerPadding;", "Lcom/mypinpad/tsdk/i/yg;", "()Lcom/mypinpad/tsdk/i/yg;", "toString", "()Ljava/lang/String;", "p1", "setOnFocusChangeListener", "(Lcom/mypinpad/tsdk/i/yg;Ljava/lang/String;)Lcom/mypinpad/tsdk/i/yg$setDividerPadding;", "a", "Ljava/lang/String;", "(Ljava/lang/String;)V", "b", "setX", "c", "setCompoundDrawableTintBlendMode", "d", "e", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "()I", "(I)V", "", "f", "Ljava/util/List;", "()Ljava/util/List;", "h", "<init>", "()V"}, k = 1, mv = {1, 6, 0})
    public static final class setDividerPadding {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static int f62074i = 0;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static int f62075j = 1;

        /* JADX INFO: renamed from: setY, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public String setNavigationOnClickListener;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public String getNavBarTitleString;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @NotNull
        public final ArrayList f62081f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @Nullable
        public List<String> f62082g;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public String setY;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public String setOnFocusChangeListener = "";

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public String setCompoundDrawableTintBlendMode = "";

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        public int setOnDragListener = -1;

        /* JADX INFO: renamed from: com.mypinpad.tsdk.i.yg$setDividerPadding$setY, reason: from kotlin metadata */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/mypinpad/tsdk/i/yg$setDividerPadding$setY;", "", "<init>", "()V"}, k = 1, mv = {1, 6, 0})
        public static final class Companion {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static int f62084a = 0;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static int f62085b = 1;

            public Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* JADX WARN: Code duplicated, block: B:12:0x0062 A[PHI: r5 r8
              0x0062: PHI (r5v8 char) = (r5v7 char), (r5v10 char) binds: [B:11:0x0060, B:7:0x004b] A[DONT_GENERATE, DONT_INLINE]
              0x0062: PHI (r8v5 int) = (r8v4 int), (r8v26 int) binds: [B:11:0x0060, B:7:0x004b] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Code duplicated, block: B:23:0x00f8 A[EDGE_INSN: B:23:0x00f8->B:16:0x00f8 BREAK  A[LOOP:0: B:3:0x0029->B:15:0x0074], SYNTHETIC] */
            public static /* synthetic */ Integer a(Object[] objArr) {
                int i10;
                char cCharAt;
                String str = (String) objArr[0];
                int iIntValue = ((Number) objArr[1]).intValue();
                int iIntValue2 = ((Number) objArr[2]).intValue();
                int i11 = f62085b;
                int i12 = (((i11 | 11) << 1) - (~(-(i11 ^ 11)))) - 1;
                f62084a = i12 % 128;
                int i13 = i12 % 2;
                int i14 = 0;
                int i15 = iIntValue;
                while (i15 < iIntValue2) {
                    int i16 = f62085b;
                    int i17 = (i16 & 13) + (i16 | 13);
                    f62084a = i17 % 128;
                    if (i17 % 2 == 0) {
                        int i18 = i15 & 1;
                        int i19 = i15 | 1;
                        i10 = ((i18 | i19) << 1) - (i18 ^ i19);
                        cCharAt = str.charAt(i15);
                        if (cCharAt != '\\') {
                            int i20 = f62085b;
                            int i21 = i20 & 63;
                            int i22 = i21 + ((i20 ^ 63) | i21);
                            f62084a = i22 % 128;
                            int i23 = i22 % 2;
                            if (cCharAt != '/') {
                                break;
                                break;
                            }
                        }
                    } else {
                        int i24 = (i15 ^ 141) + ((i15 & 141) << 1);
                        i10 = ((i24 | (-71)) << 1) - (i24 ^ (-71));
                        cCharAt = str.charAt(i15);
                        if (cCharAt != 'Y') {
                            int i25 = f62085b;
                            int i26 = i25 & 63;
                            int i27 = i26 + ((i25 ^ 63) | i26);
                            f62084a = i27 % 128;
                            int i28 = i27 % 2;
                            if (cCharAt != '/') {
                                break;
                            }
                        }
                    }
                    i15 = i10;
                    int i29 = i14 * (-282);
                    int i30 = 284 & i29;
                    int i31 = ((284 ^ i29) | i30) << 1;
                    int i32 = -((i29 | 284) & (~i30));
                    int i33 = ((i31 | i32) << 1) - (i32 ^ i31);
                    int i34 = (-2) & i14;
                    int i35 = (~i34) & ((-2) | i14);
                    int i36 = ~i14;
                    int i37 = ~((i34 & i35) | (i35 ^ i34));
                    int i38 = ~(((-2) ^ iIntValue) | ((-2) & iIntValue));
                    int i39 = ((~i38) & i37) | ((~i37) & i38);
                    int i40 = i37 & i38;
                    int i41 = -(-(((i40 & i39) | (i39 ^ i40)) * (-283)));
                    int i42 = i33 | i41;
                    int i43 = ((i42 << 1) - (~(-((~(i33 & i41)) & i42)))) - 1;
                    int i44 = (i14 | i36) & i36;
                    int i45 = -(~(-(-((~((i44 & 1) | (i44 ^ 1))) * 283))));
                    int i46 = ((i43 & i45) + (i45 | i43)) - 1;
                    int i47 = (-2) ^ i36;
                    int i48 = (-2) & i36;
                    int i49 = (i47 & i48) | (i47 ^ i48);
                    int i50 = -(-((~((i49 & iIntValue) | ((~iIntValue) & i49) | ((~i49) & iIntValue))) * 283));
                    int i51 = i46 ^ i50;
                    i14 = (((i50 & i46) | i51) << 1) - i51;
                    int i52 = f62084a;
                    int i53 = (i52 | 29) << 1;
                    int i54 = -(((~i52) & 29) | (i52 & (-30)));
                    int i55 = (i53 ^ i54) + ((i54 & i53) << 1);
                    f62085b = i55 % 128;
                    int i56 = i55 % 2;
                }
                int i57 = f62085b;
                int i58 = i57 & 111;
                int i59 = -(-(i57 | 111));
                int i60 = (i58 & i59) + (i59 | i58);
                f62084a = i60 % 128;
                if (i60 % 2 == 0) {
                    return Integer.valueOf(i14);
                }
                int i61 = 73 / 0;
                return Integer.valueOf(i14);
            }

            /* JADX WARN: Code duplicated, block: B:12:0x00cb  */
            /* JADX WARN: Code duplicated, block: B:13:0x00eb  */
            /* JADX WARN: Code duplicated, block: B:15:0x00f7 A[PHI: r1
              0x00f7: PHI (r1v11 int) = (r1v10 int), (r1v28 int) binds: [B:9:0x00b5, B:5:0x007b] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Code duplicated, block: B:17:0x0103  */
            /* JADX WARN: Code duplicated, block: B:18:0x0117  */
            /* JADX WARN: Code duplicated, block: B:34:0x0126 A[EXC_TOP_SPLITTER, SYNTHETIC] */
            public static /* synthetic */ Integer b(Object[] objArr) {
                int i10;
                int i11;
                int i12;
                boolean z10;
                int i13;
                int i14;
                String str = (String) objArr[0];
                int iIntValue = ((Number) objArr[1]).intValue();
                int iIntValue2 = ((Number) objArr[2]).intValue();
                int i15 = f62085b;
                int i16 = (((i15 & (-34)) | ((~i15) & 33)) - (~(-(-((i15 & 33) << 1))))) - 1;
                f62084a = i16 % 128;
                try {
                    if (i16 % 2 != 0) {
                        Boolean bool = Boolean.FALSE;
                        i12 = Integer.parseInt((String) Companion.setDividerPadding(new Object[]{yg.INSTANCE, str, Integer.valueOf(iIntValue), Integer.valueOf(iIntValue2), "", bool, bool, bool, bool, null, 27353}, -700019500, 700019509, iIntValue));
                        if (i12 > 0) {
                            i14 = f62085b;
                            int i17 = (i14 & 114) + (i14 | 114);
                            int i18 = (i17 ^ (-1)) + (i17 << 1);
                            f62084a = i18 % 128;
                            int i19 = i18 % 2;
                            if (i12 < 65536) {
                                int i20 = (i14 & 29) + (i14 | 29);
                                f62084a = i20 % 128;
                                int i21 = i20 % 2;
                                int i22 = (i14 & (-40)) | ((~i14) & 39);
                                int i23 = -(-((i14 & 39) << 1));
                                int i24 = (i22 & i23) + (i23 | i22);
                                f62084a = i24 % 128;
                                int i25 = i24 % 2;
                                z10 = true;
                            } else {
                                int i26 = (i14 & 115) + (i14 | 115);
                                f62084a = i26 % 128;
                                int i27 = i26 % 2;
                            }
                            if (!z10) {
                                int i28 = f62085b;
                                int i29 = i28 & 57;
                                int i30 = -(-((i28 ^ 57) | i29));
                                int i31 = (i29 & i30) + (i30 | i29);
                                f62084a = i31 % 128;
                                int i32 = i31 % 2;
                                i11 = -1;
                            } else {
                                i10 = -1;
                                i13 = (-2) - ((f62085b + 84) ^ (-1));
                                f62084a = i13 % 128;
                                if (i13 % 2 != 0) {
                                    try {
                                        int i33 = 4 / 0;
                                    } catch (NumberFormatException unused) {
                                        i11 = i10;
                                    }
                                }
                                i11 = i12;
                            }
                            int i34 = f62084a;
                            int i35 = i34 & 69;
                            int i36 = (i34 | 69) & (~i35);
                            int i37 = -(-(i35 << 1));
                            int i38 = (i36 ^ i37) + ((i36 & i37) << 1);
                            f62085b = i38 % 128;
                            int i39 = i38 % 2;
                        } else {
                            int i40 = f62085b + 17;
                            f62084a = i40 % 128;
                            int i41 = i40 % 2;
                        }
                        z10 = false;
                        if (!z10) {
                            int i210 = f62085b;
                            int i211 = i210 & 57;
                            int i310 = -(-((i210 ^ 57) | i211));
                            int i311 = (i211 & i310) + (i310 | i211);
                            f62084a = i311 % 128;
                            int i312 = i311 % 2;
                            i11 = -1;
                        } else {
                            i10 = -1;
                            i13 = (-2) - ((f62085b + 84) ^ (-1));
                            f62084a = i13 % 128;
                            if (i13 % 2 != 0) {
                                int i313 = 4 / 0;
                            }
                            i11 = i12;
                        }
                        int i314 = f62084a;
                        int i315 = i314 & 69;
                        int i316 = (i314 | 69) & (~i315);
                        int i317 = -(-(i315 << 1));
                        int i318 = (i316 ^ i317) + ((i316 & i317) << 1);
                        f62085b = i318 % 128;
                        int i319 = i318 % 2;
                    } else {
                        Boolean bool2 = Boolean.FALSE;
                        i12 = Integer.parseInt((String) Companion.setDividerPadding(new Object[]{yg.INSTANCE, str, Integer.valueOf(iIntValue), Integer.valueOf(iIntValue2), "", bool2, bool2, bool2, bool2, null, 248}, -700019500, 700019509, iIntValue));
                        if (i12 > 0) {
                            i14 = f62085b;
                            int i110 = (i14 & 114) + (i14 | 114);
                            int i111 = (i110 ^ (-1)) + (i110 << 1);
                            f62084a = i111 % 128;
                            int i112 = i111 % 2;
                            if (i12 < 65536) {
                                int i212 = (i14 & 29) + (i14 | 29);
                                f62084a = i212 % 128;
                                int i213 = i212 % 2;
                                int i214 = (i14 & (-40)) | ((~i14) & 39);
                                int i215 = -(-((i14 & 39) << 1));
                                int i216 = (i214 & i215) + (i215 | i214);
                                f62084a = i216 % 128;
                                int i217 = i216 % 2;
                                z10 = true;
                            } else {
                                int i218 = (i14 & 115) + (i14 | 115);
                                f62084a = i218 % 128;
                                int i219 = i218 % 2;
                            }
                            if (!z10) {
                                int i2110 = f62085b;
                                int i2111 = i2110 & 57;
                                int i3110 = -(-((i2110 ^ 57) | i2111));
                                int i3111 = (i2111 & i3110) + (i3110 | i2111);
                                f62084a = i3111 % 128;
                                int i3112 = i3111 % 2;
                                i11 = -1;
                            } else {
                                i10 = -1;
                                i13 = (-2) - ((f62085b + 84) ^ (-1));
                                f62084a = i13 % 128;
                                if (i13 % 2 != 0) {
                                    int i3113 = 4 / 0;
                                }
                                i11 = i12;
                            }
                            int i3114 = f62084a;
                            int i3115 = i3114 & 69;
                            int i3116 = (i3114 | 69) & (~i3115);
                            int i3117 = -(-(i3115 << 1));
                            int i3118 = (i3116 ^ i3117) + ((i3116 & i3117) << 1);
                            f62085b = i3118 % 128;
                            int i3119 = i3118 % 2;
                        } else {
                            int i42 = f62085b + 17;
                            f62084a = i42 % 128;
                            int i43 = i42 % 2;
                        }
                        z10 = false;
                        if (!z10) {
                            int i2112 = f62085b;
                            int i2113 = i2112 & 57;
                            int i31110 = -(-((i2112 ^ 57) | i2113));
                            int i31111 = (i2113 & i31110) + (i31110 | i2113);
                            f62084a = i31111 % 128;
                            int i31112 = i31111 % 2;
                            i11 = -1;
                        } else {
                            i10 = -1;
                            i13 = (-2) - ((f62085b + 84) ^ (-1));
                            f62084a = i13 % 128;
                            if (i13 % 2 != 0) {
                                int i31113 = 4 / 0;
                            }
                            i11 = i12;
                        }
                        int i31114 = f62084a;
                        int i31115 = i31114 & 69;
                        int i31116 = (i31114 | 69) & (~i31115);
                        int i31117 = -(-(i31115 << 1));
                        int i31118 = (i31116 ^ i31117) + ((i31116 & i31117) << 1);
                        f62085b = i31118 % 128;
                        int i31119 = i31118 % 2;
                    }
                } catch (NumberFormatException unused2) {
                    i10 = -1;
                }
                int i44 = f62084a;
                int i45 = i44 & 5;
                int i46 = i44 | 5;
                int i47 = (i45 ^ i46) + ((i46 & i45) << 1);
                f62085b = i47 % 128;
                int i48 = i47 % 2;
                return Integer.valueOf(i11);
            }

            /* JADX WARN: Code duplicated, block: B:101:0x05f6  */
            /* JADX WARN: Code duplicated, block: B:103:0x0601  */
            /* JADX WARN: Code duplicated, block: B:104:0x0603  */
            /* JADX WARN: Code duplicated, block: B:106:0x0616  */
            /* JADX WARN: Code duplicated, block: B:109:0x062a  */
            /* JADX WARN: Code duplicated, block: B:111:0x0640  */
            /* JADX WARN: Code duplicated, block: B:113:0x0644  */
            /* JADX WARN: Code duplicated, block: B:114:0x0648  */
            /* JADX WARN: Code duplicated, block: B:116:0x064c  */
            /* JADX WARN: Code duplicated, block: B:117:0x0668  */
            /* JADX WARN: Code duplicated, block: B:120:0x067b A[LOOP:2: B:59:0x041d->B:120:0x067b, LOOP_END] */
            /* JADX WARN: Code duplicated, block: B:123:0x0693  */
            /* JADX WARN: Code duplicated, block: B:125:0x06b5  */
            /* JADX WARN: Code duplicated, block: B:127:0x06bf  */
            /* JADX WARN: Code duplicated, block: B:131:0x06e2  */
            /* JADX WARN: Code duplicated, block: B:136:0x06fc  */
            /* JADX WARN: Code duplicated, block: B:170:0x067e A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:48:0x037f  */
            /* JADX WARN: Code duplicated, block: B:50:0x0385  */
            /* JADX WARN: Code duplicated, block: B:58:0x03b2  */
            /* JADX WARN: Code duplicated, block: B:60:0x041f  */
            /* JADX WARN: Code duplicated, block: B:62:0x0435  */
            /* JADX WARN: Code duplicated, block: B:65:0x0457  */
            /* JADX WARN: Code duplicated, block: B:67:0x0467 A[PHI: r4 r6 r7
              0x0467: PHI (r4v27 char) = (r4v26 char), (r4v42 char) binds: [B:66:0x0465, B:63:0x0454] A[DONT_GENERATE, DONT_INLINE]
              0x0467: PHI (r6v31 int) = (r6v30 int), (r6v43 int) binds: [B:66:0x0465, B:63:0x0454] A[DONT_GENERATE, DONT_INLINE]
              0x0467: PHI (r7v15 int) = (r7v14 int), (r7v113 int) binds: [B:66:0x0465, B:63:0x0454] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Code duplicated, block: B:69:0x0483  */
            /* JADX WARN: Code duplicated, block: B:72:0x04a1  */
            /* JADX WARN: Code duplicated, block: B:75:0x04a9 A[DONT_INVERT] */
            /* JADX WARN: Code duplicated, block: B:76:0x04ab  */
            /* JADX WARN: Code duplicated, block: B:78:0x04c1  */
            /* JADX WARN: Code duplicated, block: B:79:0x04ec  */
            /* JADX WARN: Code duplicated, block: B:80:0x04f5  */
            /* JADX WARN: Code duplicated, block: B:83:0x04fb  */
            /* JADX WARN: Code duplicated, block: B:85:0x050e  */
            /* JADX WARN: Code duplicated, block: B:86:0x052d  */
            /* JADX WARN: Code duplicated, block: B:87:0x0540  */
            /* JADX WARN: Code duplicated, block: B:90:0x0576  */
            /* JADX WARN: Code duplicated, block: B:91:0x0578  */
            /* JADX WARN: Code duplicated, block: B:94:0x058f  */
            /* JADX WARN: Code duplicated, block: B:95:0x05b0  */
            /* JADX WARN: Code duplicated, block: B:97:0x05b4  */
            /* JADX WARN: Code duplicated, block: B:99:0x05f3  */
            public static /* synthetic */ Object setOnFocusChangeListener(Object[] objArr, int i10, int i11, int i12) {
                int iIntValue;
                int i13;
                int i14;
                int i15;
                int i16;
                int i17;
                int i18;
                int i19;
                char cCharAt;
                int i20;
                int i21;
                boolean z10;
                int i22;
                int i23;
                int i24;
                int i25;
                int i26;
                int i27;
                int i28;
                int i29;
                int i30;
                int i31;
                int i32;
                int i33;
                boolean z11;
                int i34;
                int i35;
                int i36;
                int i37 = ~i10;
                int i38 = ~(i37 | i11);
                int i39 = ~i12;
                int i40 = ((i38 | (~(i39 | i11))) * (-108)) + (i11 * (-107)) + (i10 * 55);
                int i41 = ~(i37 | i12);
                int i42 = ~((~i11) | i10);
                switch (((i42 | i12) * 54) + (((~(i10 | i39)) | i41 | i42) * 54) + i40) {
                    case 1:
                        String str = (String) objArr[0];
                        int iIntValue2 = ((Number) objArr[1]).intValue();
                        int iIntValue3 = ((Number) objArr[2]).intValue();
                        int i43 = f62085b;
                        int i44 = i43 & 7;
                        int i45 = -(-(i43 | 7));
                        int i46 = ((i44 | i45) << 1) - (i45 ^ i44);
                        f62084a = i46 % 128;
                        int i47 = i46 % 2;
                        int iIntValue4 = ((Integer) setOnFocusChangeListener(new Object[]{str, Integer.valueOf(iIntValue2), Integer.valueOf(iIntValue3)}, 893665832, -893665826, iIntValue2)).intValue();
                        int i48 = f62085b;
                        int i49 = (((i48 & (-42)) | ((~i48) & 41)) - (~(-(-((i48 & 41) << 1))))) - 1;
                        f62084a = i49 % 128;
                        if (i49 % 2 != 0) {
                            int i50 = 50 / 0;
                        }
                        return Integer.valueOf(iIntValue4);
                    case 2:
                        return a(objArr);
                    case 3:
                        String str2 = (String) objArr[0];
                        int iIntValue5 = ((Number) objArr[1]).intValue();
                        int iIntValue6 = ((Number) objArr[2]).intValue();
                        int i51 = f62085b + 55;
                        f62084a = i51 % 128;
                        if (i51 % 2 != 0) {
                            iIntValue = ((Integer) setOnFocusChangeListener(new Object[]{str2, Integer.valueOf(iIntValue5), Integer.valueOf(iIntValue6)}, -1873315027, 1873315031, iIntValue5)).intValue();
                            int i52 = 23 / 0;
                        } else {
                            iIntValue = ((Integer) setOnFocusChangeListener(new Object[]{str2, Integer.valueOf(iIntValue5), Integer.valueOf(iIntValue6)}, -1873315027, 1873315031, iIntValue5)).intValue();
                        }
                        return Integer.valueOf(iIntValue);
                    case 4:
                        return b(objArr);
                    case 5:
                        String str3 = (String) objArr[0];
                        int iIntValue7 = ((Number) objArr[1]).intValue();
                        int iIntValue8 = ((Number) objArr[2]).intValue();
                        int i53 = f62084a + 79;
                        int i54 = i53 % 128;
                        f62085b = i54;
                        int i55 = i53 % 2;
                        int i56 = -iIntValue7;
                        int i57 = i56 * 69;
                        int i58 = -(~(-(-(iIntValue8 * (-67)))));
                        int i59 = ((i57 ^ i58) + ((i57 & i58) << 1)) - 1;
                        int i60 = ~i56;
                        int i61 = (i60 | i56) & i60;
                        int i62 = ~iIntValue8;
                        int i63 = (~i62) & i61;
                        int i64 = ~i61;
                        int i65 = i63 | (i62 & i64);
                        int i66 = i61 & i62;
                        int i67 = (i65 ^ i66) | (i65 & i66);
                        int i68 = ~iIntValue7;
                        int i69 = i67 ^ i68;
                        int i70 = ~i68;
                        int i71 = i67 & i68;
                        int i72 = (i69 ^ i71) | (i69 & i71);
                        int i73 = ~i72;
                        int i74 = (i72 | i73) & i73;
                        int i75 = ~((i56 ^ iIntValue8) | (i56 & iIntValue8));
                        int i76 = (i74 & i75) | (i74 ^ i75);
                        int i77 = iIntValue8 & iIntValue7;
                        int i78 = (~i77) & (iIntValue8 | iIntValue7);
                        int i79 = ~((i78 ^ i77) | (i77 & i78));
                        int i80 = (-2) - ((i59 - (~(-(-(((i76 & i79) | (((~i76) & i79) | ((~i79) & i76))) * (-68)))))) ^ (-1));
                        int i81 = (i60 & i70) | ((~i60) & i68);
                        int i82 = i60 & i68;
                        int i83 = (i81 & i82) | (i81 ^ i82);
                        int i84 = i83 & iIntValue8;
                        int i85 = (i83 | iIntValue8) & (~i84);
                        int i86 = (~((i85 & i84) | (i85 ^ i84))) * (-68);
                        int i87 = (i80 ^ i86) + ((i80 & i86) << 1);
                        int i88 = (i68 | iIntValue7) & i68;
                        int i89 = ~((i62 ^ i88) | (i62 & i88));
                        int i90 = (i64 & i89) | ((~i89) & i61);
                        int i91 = i89 & i61;
                        int i92 = -(-(((i90 & i91) | (i90 ^ i91)) * 68));
                        int i93 = ((i87 ^ i92) | (i87 & i92)) << 1;
                        int i94 = -((i92 & (~i87)) | ((~i92) & i87));
                        if (((i93 | i94) << 1) - (i94 ^ i93) < 2) {
                            int i95 = i54 + 19;
                            f62084a = i95 % 128;
                            if (i95 % 2 != 0) {
                                int i96 = 69 / 0;
                            }
                        } else {
                            char cCharAt2 = str3.charAt(iIntValue7);
                            if (Intrinsics.compare((int) cCharAt2, 97) >= 0) {
                                int i97 = f62084a;
                                int i98 = i97 ^ 39;
                                int i99 = ((i97 & 39) | i98) << 1;
                                int i100 = -i98;
                                int i101 = (i99 ^ i100) + ((i99 & i100) << 1);
                                f62085b = i101 % 128;
                                int i102 = i101 % 2;
                                if (Intrinsics.compare((int) cCharAt2, 122) > 0) {
                                    if (Intrinsics.compare((int) cCharAt2, 65) >= 0) {
                                        int i103 = f62084a;
                                        int i104 = i103 & 55;
                                        int i105 = ((i103 ^ 55) | i104) << 1;
                                        int i106 = -((i103 | 55) & (~i104));
                                        i14 = (i105 ^ i106) + ((i106 & i105) << 1);
                                        f62085b = i14 % 128;
                                        if (i14 % 2 == 0 ? Intrinsics.compare((int) cCharAt2, 90) <= 0 : Intrinsics.compare((int) cCharAt2, 39) <= 0) {
                                            int i107 = -(-(iIntValue7 * (-489)));
                                            int i108 = 491 & i107;
                                            int i109 = (i107 ^ 491) | i108;
                                            int i110 = (i108 & i109) + (i109 | i108);
                                            int i111 = ((-2) & i70) | (i68 & 1);
                                            int i112 = (-2) & i68;
                                            int i113 = (i111 & i112) | (i111 ^ i112);
                                            int i114 = -(~(((i113 & i68) | (i70 & i113) | ((~i113) & i68)) * (-490)));
                                            int i115 = ((i110 & i114) + (i114 | i110)) - 1;
                                            int i116 = (i88 & (-2)) | ((~i88) & 1);
                                            int i117 = i88 & 1;
                                            int i118 = ~((i116 & i117) | (i116 ^ i117));
                                            int i119 = i88 & iIntValue7;
                                            int i120 = (iIntValue7 | i88) & (~i119);
                                            int i121 = (i120 & i119) | (i120 ^ i119);
                                            int i122 = ~i121;
                                            int i123 = (i121 | i122) & i122;
                                            int i124 = ((~i123) & i118) | ((~i118) & i123);
                                            int i125 = i118 & i123;
                                            int i126 = -(-(((i125 & i124) | (i124 ^ i125)) * 490));
                                            int i127 = (i115 & i126) + (i126 | i115);
                                            int i128 = f62084a + 64;
                                            int i129 = (i128 ^ (-1)) + (i128 << 1);
                                            f62085b = i129 % 128;
                                            int i130 = i129 % 2;
                                            for (i15 = (-2) - (((i127 & (-979)) + (i127 | (-979))) ^ (-1)); i15 < iIntValue8; i15 = i19) {
                                                int i131 = f62084a;
                                                int i132 = i131 & 73;
                                                i17 = (((i131 ^ 73) | i132) << 1) - ((i131 | 73) & (~i132));
                                                f62085b = i17 % 128;
                                                if (i17 % 2 == 0) {
                                                    int i133 = i15 & 12;
                                                    int i134 = -(-((i15 ^ 12) | i133));
                                                    i18 = 1;
                                                    int i135 = ((i133 | i134) << 1) - (i133 ^ i134);
                                                    int i136 = i135 ^ 73;
                                                    int i137 = ((i135 & 73) | i136) << 1;
                                                    int i138 = -i136;
                                                    i19 = (i137 ^ i138) + ((i138 & i137) << 1);
                                                    cCharAt = str3.charAt(i15);
                                                    if (1 <= cCharAt) {
                                                        int i139 = f62084a;
                                                        int i140 = i139 & 35;
                                                        int i141 = ((i139 ^ 35) | i140) << i18;
                                                        int i142 = -((i139 | 35) & (~i140));
                                                        int i143 = (i141 ^ i142) + ((i142 & i141) << i18);
                                                        i20 = i143 % 128;
                                                        f62085b = i20;
                                                        int i144 = i143 % 2;
                                                        if (cCharAt < '{') {
                                                            int i145 = ((i20 ^ 31) | (i20 & 31)) << 1;
                                                            int i146 = -(((~i20) & 31) | (i20 & (-32)));
                                                            i21 = (i145 ^ i146) + ((i146 & i145) << 1);
                                                            f62084a = i21 % 128;
                                                            if (i21 % 2 != 0) {
                                                                z10 = true;
                                                            }
                                                        }
                                                    }
                                                    if (!z10) {
                                                        if ('A' <= cCharAt) {
                                                            i35 = f62084a;
                                                            int i147 = (-2) - (((i35 ^ 24) + ((i35 & 24) << 1)) ^ (-1));
                                                            i36 = i147 % 128;
                                                            f62085b = i36;
                                                            int i148 = i147 % 2;
                                                            if (cCharAt < '[') {
                                                                int i149 = i36 ^ 91;
                                                                int i150 = ((i36 & 91) | i149) << 1;
                                                                int i151 = -i149;
                                                                int i152 = ((i150 | i151) << 1) - (i151 ^ i150);
                                                                f62084a = i152 % 128;
                                                                int i153 = i152 % 2;
                                                                int i154 = (((i36 & (-100)) | ((~i36) & 99)) - (~(-(-((i36 & 99) << 1))))) - 1;
                                                                f62084a = i154 % 128;
                                                                int i155 = i154 % 2;
                                                            } else {
                                                                int i156 = i35 + 85;
                                                                f62085b = i156 % 128;
                                                                int i157 = i156 % 2;
                                                            }
                                                        }
                                                        if ('0' <= cCharAt) {
                                                            i34 = f62084a;
                                                            int i158 = i34 & 9;
                                                            int i159 = (i34 ^ 9) | i158;
                                                            int i160 = (i158 & i159) + (i158 | i159);
                                                            f62085b = i160 % 128;
                                                            int i161 = i160 % 2;
                                                            if (cCharAt < ':') {
                                                                int i162 = i34 & 107;
                                                                int i163 = (((i34 ^ 107) | i162) << 1) - ((~i162) & (i34 | 107));
                                                                f62085b = i163 % 128;
                                                                int i164 = i163 % 2;
                                                                int i165 = (i34 ^ 57) + ((i34 & 57) << 1);
                                                                f62085b = i165 % 128;
                                                                int i166 = i165 % 2;
                                                                int i167 = f62085b;
                                                                int i168 = i167 & 119;
                                                                int i169 = ((i167 ^ 119) | i168) << 1;
                                                                int i170 = -((~i168) & (i167 | 119));
                                                                int i171 = (i169 & i170) + (i169 | i170);
                                                                f62084a = i171 % 128;
                                                                int i172 = i171 % 2;
                                                                int i173 = i167 + 37;
                                                                f62084a = i173 % 128;
                                                                int i174 = i173 % 2;
                                                                i26 = 2;
                                                                int i175 = f62084a + 89;
                                                                int i176 = i175 % 128;
                                                                f62085b = i176;
                                                                int i177 = i175 % i26;
                                                                int i178 = i176 & 73;
                                                                int i179 = -(-((i176 ^ 73) | i178));
                                                                int i180 = (i178 & i179) + (i178 | i179);
                                                                f62084a = i180 % 128;
                                                                int i181 = i180 % 2;
                                                                i22 = 1;
                                                                i23 = 1;
                                                                if ((i23 ^ 1) != i22) {
                                                                    int i182 = f62085b;
                                                                    int i183 = i182 ^ 7;
                                                                    int i184 = ((i182 & 7) | i183) << i22;
                                                                    int i185 = -i183;
                                                                    i32 = (i184 ^ i185) + ((i184 & i185) << i22);
                                                                    f62084a = i32 % 128;
                                                                    if (i32 % 2 != 0) {
                                                                        i27 = 1;
                                                                        i28 = 0;
                                                                    } else {
                                                                        i27 = 1;
                                                                        i28 = 1;
                                                                    }
                                                                } else if (cCharAt == '.') {
                                                                    int i186 = f62085b;
                                                                    int i187 = (i186 & 119) + (i186 | 119);
                                                                    f62084a = i187 % 128;
                                                                    int i188 = i187 % 2;
                                                                    int i189 = i186 + 56;
                                                                    i27 = 1;
                                                                    int i190 = (i189 ^ (-1)) + (i189 << 1);
                                                                    f62084a = i190 % 128;
                                                                    int i191 = i190 % 2;
                                                                    i28 = 1;
                                                                } else {
                                                                    i27 = 1;
                                                                    int i192 = f62084a;
                                                                    int i193 = ((i192 | 45) << 1) - (i192 ^ 45);
                                                                    f62085b = i193 % 128;
                                                                    int i194 = i193 % 2;
                                                                    i28 = 0;
                                                                }
                                                                if ((i28 ^ 1) != i27) {
                                                                    i29 = f62085b;
                                                                    int i195 = ((i29 & (-28)) | ((~i29) & 27)) + ((i29 & 27) << i27);
                                                                    i30 = i195 % 128;
                                                                    f62084a = i30;
                                                                    int i196 = i195 % 2;
                                                                    if (cCharAt == ':') {
                                                                        int i197 = (-2) - ((-1) ^ (((i29 | 98) << i27) - (i29 ^ 98)));
                                                                        int i198 = i197 % 128;
                                                                        f62084a = i198;
                                                                        int i199 = i197 % 2;
                                                                        int i200 = (i198 | 15) << 1;
                                                                        int i201 = -(i198 ^ 15);
                                                                        i31 = (i200 ^ i201) + ((i201 & i200) << 1);
                                                                        f62085b = i31 % 128;
                                                                        if (i31 % 2 == 0) {
                                                                            int i202 = 83 / 0;
                                                                        }
                                                                        return Integer.valueOf(i15);
                                                                    }
                                                                    int i203 = (-2) - (((i30 & 118) + (i30 | 118)) ^ (-1));
                                                                    f62085b = i203 % 128;
                                                                    int i204 = i203 % 2;
                                                                }
                                                            } else {
                                                                int i205 = i34 & 113;
                                                                int i206 = (((i34 ^ 113) | i205) << 1) - ((i34 | 113) & (~i205));
                                                                f62085b = i206 % 128;
                                                                int i207 = i206 % 2;
                                                            }
                                                        }
                                                        if (cCharAt == '+') {
                                                            int i208 = f62084a;
                                                            int i209 = i208 ^ 97;
                                                            int i210 = (i208 & 97) << 1;
                                                            int i211 = (i209 ^ i210) + ((i209 & i210) << 1);
                                                            f62085b = i211 % 128;
                                                            int i212 = i211 % 2;
                                                            int i213 = ((i208 & 31) - (~(i208 | 31))) - 1;
                                                            f62085b = i213 % 128;
                                                            i26 = 2;
                                                            int i214 = i213 % 2;
                                                            int i1710 = f62084a + 89;
                                                            int i1711 = i1710 % 128;
                                                            f62085b = i1711;
                                                            int i1712 = i1710 % i26;
                                                            int i1713 = i1711 & 73;
                                                            int i1714 = -(-((i1711 ^ 73) | i1713));
                                                            int i1810 = (i1713 & i1714) + (i1713 | i1714);
                                                            f62084a = i1810 % 128;
                                                            int i1811 = i1810 % 2;
                                                            i22 = 1;
                                                            i23 = 1;
                                                        } else if (cCharAt == '-') {
                                                            int i215 = f62085b;
                                                            i24 = i215 + 19;
                                                            f62084a = i24 % 128;
                                                            if (i24 % 2 != 0) {
                                                                i25 = 0;
                                                            } else {
                                                                i25 = 1;
                                                            }
                                                            int i216 = ((i215 & 19) - (~(i215 | 19))) - 1;
                                                            f62084a = i216 % 128;
                                                            int i217 = i216 % 2;
                                                            i23 = i25;
                                                            i22 = 1;
                                                        } else {
                                                            int i218 = f62085b;
                                                            int i219 = (i218 & 89) + (i218 | 89);
                                                            f62084a = i219 % 128;
                                                            int i220 = i219 % 2;
                                                            i22 = 1;
                                                            i23 = 0;
                                                        }
                                                        if ((i23 ^ 1) != i22) {
                                                            int i1812 = f62085b;
                                                            int i1813 = i1812 ^ 7;
                                                            int i1814 = ((i1812 & 7) | i1813) << i22;
                                                            int i1815 = -i1813;
                                                            i32 = (i1814 ^ i1815) + ((i1814 & i1815) << i22);
                                                            f62084a = i32 % 128;
                                                            if (i32 % 2 != 0) {
                                                                i27 = 1;
                                                                i28 = 0;
                                                            } else {
                                                                i27 = 1;
                                                                i28 = 1;
                                                            }
                                                        } else if (cCharAt == '.') {
                                                            int i1816 = f62085b;
                                                            int i1817 = (i1816 & 119) + (i1816 | 119);
                                                            f62084a = i1817 % 128;
                                                            int i1818 = i1817 % 2;
                                                            int i1819 = i1816 + 56;
                                                            i27 = 1;
                                                            int i1910 = (i1819 ^ (-1)) + (i1819 << 1);
                                                            f62084a = i1910 % 128;
                                                            int i1911 = i1910 % 2;
                                                            i28 = 1;
                                                        } else {
                                                            i27 = 1;
                                                            int i1912 = f62084a;
                                                            int i1913 = ((i1912 | 45) << 1) - (i1912 ^ 45);
                                                            f62085b = i1913 % 128;
                                                            int i1914 = i1913 % 2;
                                                            i28 = 0;
                                                        }
                                                        if ((i28 ^ 1) != i27) {
                                                            i29 = f62085b;
                                                            int i1915 = ((i29 & (-28)) | ((~i29) & 27)) + ((i29 & 27) << i27);
                                                            i30 = i1915 % 128;
                                                            f62084a = i30;
                                                            int i1916 = i1915 % 2;
                                                            if (cCharAt == ':') {
                                                                int i1917 = (-2) - ((-1) ^ (((i29 | 98) << i27) - (i29 ^ 98)));
                                                                int i1918 = i1917 % 128;
                                                                f62084a = i1918;
                                                                int i1919 = i1917 % 2;
                                                                int i2010 = (i1918 | 15) << 1;
                                                                int i2011 = -(i1918 ^ 15);
                                                                i31 = (i2010 ^ i2011) + ((i2011 & i2010) << 1);
                                                                f62085b = i31 % 128;
                                                                if (i31 % 2 == 0) {
                                                                    int i2012 = 83 / 0;
                                                                }
                                                                return Integer.valueOf(i15);
                                                            }
                                                            int i2013 = (-2) - (((i30 & 118) + (i30 | 118)) ^ (-1));
                                                            f62085b = i2013 % 128;
                                                            int i2014 = i2013 % 2;
                                                        }
                                                    } else {
                                                        int i221 = f62085b;
                                                        int i222 = i221 & 101;
                                                        int i223 = i221 | 101;
                                                        int i224 = (i222 & i223) + (i223 | i222);
                                                        int i225 = i224 % 128;
                                                        f62084a = i225;
                                                        int i226 = i224 % 2;
                                                        int i227 = i225 & 33;
                                                        int i228 = i227 + ((i225 ^ 33) | i227);
                                                        f62085b = i228 % 128;
                                                        int i229 = i228 % 2;
                                                    }
                                                    int i230 = f62085b;
                                                    int i231 = ~i230;
                                                    i33 = (((i230 | 117) << 1) - (~(-((i230 & (-118)) | (i231 & 117))))) - 1;
                                                    f62084a = i33 % 128;
                                                    if (i33 % 2 != 0) {
                                                        z11 = false;
                                                    } else {
                                                        z11 = true;
                                                    }
                                                    int i232 = (((i231 & 73) | (i230 & (-74))) - (~(-(-((i230 & 73) << 1))))) - 1;
                                                    f62084a = i232 % 128;
                                                    int i233 = i232 % 2;
                                                    if (z11) {
                                                        int i1610 = f62085b;
                                                        int i1611 = i1610 & 119;
                                                        int i1612 = ((i1610 ^ 119) | i1611) << 1;
                                                        int i1715 = -((~i1611) & (i1610 | 119));
                                                        int i1716 = (i1612 & i1715) + (i1612 | i1715);
                                                        f62084a = i1716 % 128;
                                                        int i1717 = i1716 % 2;
                                                        int i1718 = i1610 + 37;
                                                        f62084a = i1718 % 128;
                                                        int i1719 = i1718 % 2;
                                                        i26 = 2;
                                                    } else {
                                                        if (cCharAt == '+') {
                                                            int i2015 = f62084a;
                                                            int i2016 = i2015 ^ 97;
                                                            int i2110 = (i2015 & 97) << 1;
                                                            int i2111 = (i2016 ^ i2110) + ((i2016 & i2110) << 1);
                                                            f62085b = i2111 % 128;
                                                            int i2112 = i2111 % 2;
                                                            int i2113 = ((i2015 & 31) - (~(i2015 | 31))) - 1;
                                                            f62085b = i2113 % 128;
                                                            i26 = 2;
                                                            int i2114 = i2113 % 2;
                                                        } else if (cCharAt == '-') {
                                                            int i2115 = f62085b;
                                                            i24 = i2115 + 19;
                                                            f62084a = i24 % 128;
                                                            if (i24 % 2 != 0) {
                                                                i25 = 0;
                                                            } else {
                                                                i25 = 1;
                                                            }
                                                            int i2116 = ((i2115 & 19) - (~(i2115 | 19))) - 1;
                                                            f62084a = i2116 % 128;
                                                            int i2117 = i2116 % 2;
                                                            i23 = i25;
                                                            i22 = 1;
                                                        } else {
                                                            int i2118 = f62085b;
                                                            int i2119 = (i2118 & 89) + (i2118 | 89);
                                                            f62084a = i2119 % 128;
                                                            int i2210 = i2119 % 2;
                                                            i22 = 1;
                                                            i23 = 0;
                                                        }
                                                        if ((i23 ^ 1) != i22) {
                                                            int i18110 = f62085b;
                                                            int i18111 = i18110 ^ 7;
                                                            int i18112 = ((i18110 & 7) | i18111) << i22;
                                                            int i18113 = -i18111;
                                                            i32 = (i18112 ^ i18113) + ((i18112 & i18113) << i22);
                                                            f62084a = i32 % 128;
                                                            if (i32 % 2 != 0) {
                                                                i27 = 1;
                                                                i28 = 0;
                                                            } else {
                                                                i27 = 1;
                                                                i28 = 1;
                                                            }
                                                        } else if (cCharAt == '.') {
                                                            int i18114 = f62085b;
                                                            int i18115 = (i18114 & 119) + (i18114 | 119);
                                                            f62084a = i18115 % 128;
                                                            int i18116 = i18115 % 2;
                                                            int i18117 = i18114 + 56;
                                                            i27 = 1;
                                                            int i19110 = (i18117 ^ (-1)) + (i18117 << 1);
                                                            f62084a = i19110 % 128;
                                                            int i19111 = i19110 % 2;
                                                            i28 = 1;
                                                        } else {
                                                            i27 = 1;
                                                            int i19112 = f62084a;
                                                            int i19113 = ((i19112 | 45) << 1) - (i19112 ^ 45);
                                                            f62085b = i19113 % 128;
                                                            int i19114 = i19113 % 2;
                                                            i28 = 0;
                                                        }
                                                        if ((i28 ^ 1) != i27) {
                                                            i29 = f62085b;
                                                            int i19115 = ((i29 & (-28)) | ((~i29) & 27)) + ((i29 & 27) << i27);
                                                            i30 = i19115 % 128;
                                                            f62084a = i30;
                                                            int i19116 = i19115 % 2;
                                                            if (cCharAt == ':') {
                                                                int i19117 = (-2) - ((-1) ^ (((i29 | 98) << i27) - (i29 ^ 98)));
                                                                int i19118 = i19117 % 128;
                                                                f62084a = i19118;
                                                                int i19119 = i19117 % 2;
                                                                int i2017 = (i19118 | 15) << 1;
                                                                int i2018 = -(i19118 ^ 15);
                                                                i31 = (i2017 ^ i2018) + ((i2018 & i2017) << 1);
                                                                f62085b = i31 % 128;
                                                                if (i31 % 2 == 0) {
                                                                    int i2019 = 83 / 0;
                                                                }
                                                                return Integer.valueOf(i15);
                                                            }
                                                            int i20110 = (-2) - (((i30 & 118) + (i30 | 118)) ^ (-1));
                                                            f62085b = i20110 % 128;
                                                            int i20111 = i20110 % 2;
                                                        }
                                                    }
                                                    int i17110 = f62084a + 89;
                                                    int i17111 = i17110 % 128;
                                                    f62085b = i17111;
                                                    int i17112 = i17110 % i26;
                                                    int i17113 = i17111 & 73;
                                                    int i17114 = -(-((i17111 ^ 73) | i17113));
                                                    int i18118 = (i17113 & i17114) + (i17113 | i17114);
                                                    f62084a = i18118 % 128;
                                                    int i18119 = i18118 % 2;
                                                    i22 = 1;
                                                    i23 = 1;
                                                    if ((i23 ^ 1) != i22) {
                                                        int i181110 = f62085b;
                                                        int i181111 = i181110 ^ 7;
                                                        int i181112 = ((i181110 & 7) | i181111) << i22;
                                                        int i181113 = -i181111;
                                                        i32 = (i181112 ^ i181113) + ((i181112 & i181113) << i22);
                                                        f62084a = i32 % 128;
                                                        if (i32 % 2 != 0) {
                                                            i27 = 1;
                                                            i28 = 0;
                                                        } else {
                                                            i27 = 1;
                                                            i28 = 1;
                                                        }
                                                    } else if (cCharAt == '.') {
                                                        int i181114 = f62085b;
                                                        int i181115 = (i181114 & 119) + (i181114 | 119);
                                                        f62084a = i181115 % 128;
                                                        int i181116 = i181115 % 2;
                                                        int i181117 = i181114 + 56;
                                                        i27 = 1;
                                                        int i191110 = (i181117 ^ (-1)) + (i181117 << 1);
                                                        f62084a = i191110 % 128;
                                                        int i191111 = i191110 % 2;
                                                        i28 = 1;
                                                    } else {
                                                        i27 = 1;
                                                        int i191112 = f62084a;
                                                        int i191113 = ((i191112 | 45) << 1) - (i191112 ^ 45);
                                                        f62085b = i191113 % 128;
                                                        int i191114 = i191113 % 2;
                                                        i28 = 0;
                                                    }
                                                    if ((i28 ^ 1) != i27) {
                                                        i29 = f62085b;
                                                        int i191115 = ((i29 & (-28)) | ((~i29) & 27)) + ((i29 & 27) << i27);
                                                        i30 = i191115 % 128;
                                                        f62084a = i30;
                                                        int i191116 = i191115 % 2;
                                                        if (cCharAt == ':') {
                                                            int i191117 = (-2) - ((-1) ^ (((i29 | 98) << i27) - (i29 ^ 98)));
                                                            int i191118 = i191117 % 128;
                                                            f62084a = i191118;
                                                            int i191119 = i191117 % 2;
                                                            int i20112 = (i191118 | 15) << 1;
                                                            int i20113 = -(i191118 ^ 15);
                                                            i31 = (i20112 ^ i20113) + ((i20113 & i20112) << 1);
                                                            f62085b = i31 % 128;
                                                            if (i31 % 2 == 0) {
                                                                int i20114 = 83 / 0;
                                                            }
                                                            return Integer.valueOf(i15);
                                                        }
                                                        int i20115 = (-2) - (((i30 & 118) + (i30 | 118)) ^ (-1));
                                                        f62085b = i20115 % 128;
                                                        int i20116 = i20115 % 2;
                                                    }
                                                } else {
                                                    i18 = 1;
                                                    i19 = (i15 ^ 1) + ((i15 & 1) << 1);
                                                    cCharAt = str3.charAt(i15);
                                                    if ('a' <= cCharAt) {
                                                        int i1310 = f62084a;
                                                        int i1410 = i1310 & 35;
                                                        int i1411 = ((i1310 ^ 35) | i1410) << i18;
                                                        int i1412 = -((i1310 | 35) & (~i1410));
                                                        int i1413 = (i1411 ^ i1412) + ((i1412 & i1411) << i18);
                                                        i20 = i1413 % 128;
                                                        f62085b = i20;
                                                        int i1414 = i1413 % 2;
                                                        if (cCharAt < '{') {
                                                            int i1415 = ((i20 ^ 31) | (i20 & 31)) << 1;
                                                            int i1416 = -(((~i20) & 31) | (i20 & (-32)));
                                                            i21 = (i1415 ^ i1416) + ((i1416 & i1415) << 1);
                                                            f62084a = i21 % 128;
                                                            if (i21 % 2 != 0) {
                                                                z10 = true;
                                                            }
                                                        }
                                                    }
                                                    if (!z10) {
                                                        if ('A' <= cCharAt) {
                                                            i35 = f62084a;
                                                            int i1417 = (-2) - (((i35 ^ 24) + ((i35 & 24) << 1)) ^ (-1));
                                                            i36 = i1417 % 128;
                                                            f62085b = i36;
                                                            int i1418 = i1417 % 2;
                                                            if (cCharAt < '[') {
                                                                int i1419 = i36 ^ 91;
                                                                int i1510 = ((i36 & 91) | i1419) << 1;
                                                                int i1511 = -i1419;
                                                                int i1512 = ((i1510 | i1511) << 1) - (i1511 ^ i1510);
                                                                f62084a = i1512 % 128;
                                                                int i1513 = i1512 % 2;
                                                                int i1514 = (((i36 & (-100)) | ((~i36) & 99)) - (~(-(-((i36 & 99) << 1))))) - 1;
                                                                f62084a = i1514 % 128;
                                                                int i1515 = i1514 % 2;
                                                            } else {
                                                                int i1516 = i35 + 85;
                                                                f62085b = i1516 % 128;
                                                                int i1517 = i1516 % 2;
                                                            }
                                                        }
                                                        if ('0' <= cCharAt) {
                                                            i34 = f62084a;
                                                            int i1518 = i34 & 9;
                                                            int i1519 = (i34 ^ 9) | i1518;
                                                            int i1613 = (i1518 & i1519) + (i1518 | i1519);
                                                            f62085b = i1613 % 128;
                                                            int i1614 = i1613 % 2;
                                                            if (cCharAt < ':') {
                                                                int i1615 = i34 & 107;
                                                                int i1616 = (((i34 ^ 107) | i1615) << 1) - ((~i1615) & (i34 | 107));
                                                                f62085b = i1616 % 128;
                                                                int i1617 = i1616 % 2;
                                                                int i1618 = (i34 ^ 57) + ((i34 & 57) << 1);
                                                                f62085b = i1618 % 128;
                                                                int i1619 = i1618 % 2;
                                                                int i16110 = f62085b;
                                                                int i16111 = i16110 & 119;
                                                                int i16112 = ((i16110 ^ 119) | i16111) << 1;
                                                                int i17115 = -((~i16111) & (i16110 | 119));
                                                                int i17116 = (i16112 & i17115) + (i16112 | i17115);
                                                                f62084a = i17116 % 128;
                                                                int i17117 = i17116 % 2;
                                                                int i17118 = i16110 + 37;
                                                                f62084a = i17118 % 128;
                                                                int i17119 = i17118 % 2;
                                                                i26 = 2;
                                                                int i171110 = f62084a + 89;
                                                                int i171111 = i171110 % 128;
                                                                f62085b = i171111;
                                                                int i171112 = i171110 % i26;
                                                                int i171113 = i171111 & 73;
                                                                int i171114 = -(-((i171111 ^ 73) | i171113));
                                                                int i181118 = (i171113 & i171114) + (i171113 | i171114);
                                                                f62084a = i181118 % 128;
                                                                int i181119 = i181118 % 2;
                                                                i22 = 1;
                                                                i23 = 1;
                                                                if ((i23 ^ 1) != i22) {
                                                                    int i1811110 = f62085b;
                                                                    int i1811111 = i1811110 ^ 7;
                                                                    int i1811112 = ((i1811110 & 7) | i1811111) << i22;
                                                                    int i1811113 = -i1811111;
                                                                    i32 = (i1811112 ^ i1811113) + ((i1811112 & i1811113) << i22);
                                                                    f62084a = i32 % 128;
                                                                    if (i32 % 2 != 0) {
                                                                        i27 = 1;
                                                                        i28 = 0;
                                                                    } else {
                                                                        i27 = 1;
                                                                        i28 = 1;
                                                                    }
                                                                } else if (cCharAt == '.') {
                                                                    int i1811114 = f62085b;
                                                                    int i1811115 = (i1811114 & 119) + (i1811114 | 119);
                                                                    f62084a = i1811115 % 128;
                                                                    int i1811116 = i1811115 % 2;
                                                                    int i1811117 = i1811114 + 56;
                                                                    i27 = 1;
                                                                    int i1911110 = (i1811117 ^ (-1)) + (i1811117 << 1);
                                                                    f62084a = i1911110 % 128;
                                                                    int i1911111 = i1911110 % 2;
                                                                    i28 = 1;
                                                                } else {
                                                                    i27 = 1;
                                                                    int i1911112 = f62084a;
                                                                    int i1911113 = ((i1911112 | 45) << 1) - (i1911112 ^ 45);
                                                                    f62085b = i1911113 % 128;
                                                                    int i1911114 = i1911113 % 2;
                                                                    i28 = 0;
                                                                }
                                                                if ((i28 ^ 1) != i27) {
                                                                    i29 = f62085b;
                                                                    int i1911115 = ((i29 & (-28)) | ((~i29) & 27)) + ((i29 & 27) << i27);
                                                                    i30 = i1911115 % 128;
                                                                    f62084a = i30;
                                                                    int i1911116 = i1911115 % 2;
                                                                    if (cCharAt == ':') {
                                                                        int i1911117 = (-2) - ((-1) ^ (((i29 | 98) << i27) - (i29 ^ 98)));
                                                                        int i1911118 = i1911117 % 128;
                                                                        f62084a = i1911118;
                                                                        int i1911119 = i1911117 % 2;
                                                                        int i20117 = (i1911118 | 15) << 1;
                                                                        int i20118 = -(i1911118 ^ 15);
                                                                        i31 = (i20117 ^ i20118) + ((i20118 & i20117) << 1);
                                                                        f62085b = i31 % 128;
                                                                        if (i31 % 2 == 0) {
                                                                            int i20119 = 83 / 0;
                                                                        }
                                                                        return Integer.valueOf(i15);
                                                                    }
                                                                    int i201110 = (-2) - (((i30 & 118) + (i30 | 118)) ^ (-1));
                                                                    f62085b = i201110 % 128;
                                                                    int i201111 = i201110 % 2;
                                                                }
                                                            } else {
                                                                int i2020 = i34 & 113;
                                                                int i2021 = (((i34 ^ 113) | i2020) << 1) - ((i34 | 113) & (~i2020));
                                                                f62085b = i2021 % 128;
                                                                int i2022 = i2021 % 2;
                                                            }
                                                        }
                                                        if (cCharAt == '+') {
                                                            int i20120 = f62084a;
                                                            int i20121 = i20120 ^ 97;
                                                            int i21110 = (i20120 & 97) << 1;
                                                            int i21111 = (i20121 ^ i21110) + ((i20121 & i21110) << 1);
                                                            f62085b = i21111 % 128;
                                                            int i21112 = i21111 % 2;
                                                            int i21113 = ((i20120 & 31) - (~(i20120 | 31))) - 1;
                                                            f62085b = i21113 % 128;
                                                            i26 = 2;
                                                            int i21114 = i21113 % 2;
                                                            int i171115 = f62084a + 89;
                                                            int i171116 = i171115 % 128;
                                                            f62085b = i171116;
                                                            int i171117 = i171115 % i26;
                                                            int i171118 = i171116 & 73;
                                                            int i171119 = -(-((i171116 ^ 73) | i171118));
                                                            int i1811118 = (i171118 & i171119) + (i171118 | i171119);
                                                            f62084a = i1811118 % 128;
                                                            int i1811119 = i1811118 % 2;
                                                            i22 = 1;
                                                            i23 = 1;
                                                        } else if (cCharAt == '-') {
                                                            int i21115 = f62085b;
                                                            i24 = i21115 + 19;
                                                            f62084a = i24 % 128;
                                                            if (i24 % 2 != 0) {
                                                                i25 = 0;
                                                            } else {
                                                                i25 = 1;
                                                            }
                                                            int i21116 = ((i21115 & 19) - (~(i21115 | 19))) - 1;
                                                            f62084a = i21116 % 128;
                                                            int i21117 = i21116 % 2;
                                                            i23 = i25;
                                                            i22 = 1;
                                                        } else {
                                                            int i21118 = f62085b;
                                                            int i21119 = (i21118 & 89) + (i21118 | 89);
                                                            f62084a = i21119 % 128;
                                                            int i2211 = i21119 % 2;
                                                            i22 = 1;
                                                            i23 = 0;
                                                        }
                                                        if ((i23 ^ 1) != i22) {
                                                            int i18111110 = f62085b;
                                                            int i18111111 = i18111110 ^ 7;
                                                            int i18111112 = ((i18111110 & 7) | i18111111) << i22;
                                                            int i18111113 = -i18111111;
                                                            i32 = (i18111112 ^ i18111113) + ((i18111112 & i18111113) << i22);
                                                            f62084a = i32 % 128;
                                                            if (i32 % 2 != 0) {
                                                                i27 = 1;
                                                                i28 = 0;
                                                            } else {
                                                                i27 = 1;
                                                                i28 = 1;
                                                            }
                                                        } else if (cCharAt == '.') {
                                                            int i18111114 = f62085b;
                                                            int i18111115 = (i18111114 & 119) + (i18111114 | 119);
                                                            f62084a = i18111115 % 128;
                                                            int i18111116 = i18111115 % 2;
                                                            int i18111117 = i18111114 + 56;
                                                            i27 = 1;
                                                            int i19111110 = (i18111117 ^ (-1)) + (i18111117 << 1);
                                                            f62084a = i19111110 % 128;
                                                            int i19111111 = i19111110 % 2;
                                                            i28 = 1;
                                                        } else {
                                                            i27 = 1;
                                                            int i19111112 = f62084a;
                                                            int i19111113 = ((i19111112 | 45) << 1) - (i19111112 ^ 45);
                                                            f62085b = i19111113 % 128;
                                                            int i19111114 = i19111113 % 2;
                                                            i28 = 0;
                                                        }
                                                        if ((i28 ^ 1) != i27) {
                                                            i29 = f62085b;
                                                            int i19111115 = ((i29 & (-28)) | ((~i29) & 27)) + ((i29 & 27) << i27);
                                                            i30 = i19111115 % 128;
                                                            f62084a = i30;
                                                            int i19111116 = i19111115 % 2;
                                                            if (cCharAt == ':') {
                                                                int i19111117 = (-2) - ((-1) ^ (((i29 | 98) << i27) - (i29 ^ 98)));
                                                                int i19111118 = i19111117 % 128;
                                                                f62084a = i19111118;
                                                                int i19111119 = i19111117 % 2;
                                                                int i201112 = (i19111118 | 15) << 1;
                                                                int i201113 = -(i19111118 ^ 15);
                                                                i31 = (i201112 ^ i201113) + ((i201113 & i201112) << 1);
                                                                f62085b = i31 % 128;
                                                                if (i31 % 2 == 0) {
                                                                    int i201114 = 83 / 0;
                                                                }
                                                                return Integer.valueOf(i15);
                                                            }
                                                            int i201115 = (-2) - (((i30 & 118) + (i30 | 118)) ^ (-1));
                                                            f62085b = i201115 % 128;
                                                            int i201116 = i201115 % 2;
                                                        }
                                                    } else {
                                                        int i2212 = f62085b;
                                                        int i2213 = i2212 & 101;
                                                        int i2214 = i2212 | 101;
                                                        int i2215 = (i2213 & i2214) + (i2214 | i2213);
                                                        int i2216 = i2215 % 128;
                                                        f62084a = i2216;
                                                        int i2217 = i2215 % 2;
                                                        int i2218 = i2216 & 33;
                                                        int i2219 = i2218 + ((i2216 ^ 33) | i2218);
                                                        f62085b = i2219 % 128;
                                                        int i2220 = i2219 % 2;
                                                    }
                                                    int i234 = f62085b;
                                                    int i235 = ~i234;
                                                    i33 = (((i234 | 117) << 1) - (~(-((i234 & (-118)) | (i235 & 117))))) - 1;
                                                    f62084a = i33 % 128;
                                                    if (i33 % 2 != 0) {
                                                        z11 = false;
                                                    } else {
                                                        z11 = true;
                                                    }
                                                    int i236 = (((i235 & 73) | (i234 & (-74))) - (~(-(-((i234 & 73) << 1))))) - 1;
                                                    f62084a = i236 % 128;
                                                    int i237 = i236 % 2;
                                                    if (z11) {
                                                        int i16113 = f62085b;
                                                        int i16114 = i16113 & 119;
                                                        int i16115 = ((i16113 ^ 119) | i16114) << 1;
                                                        int i171120 = -((~i16114) & (i16113 | 119));
                                                        int i171121 = (i16115 & i171120) + (i16115 | i171120);
                                                        f62084a = i171121 % 128;
                                                        int i171122 = i171121 % 2;
                                                        int i171123 = i16113 + 37;
                                                        f62084a = i171123 % 128;
                                                        int i171124 = i171123 % 2;
                                                        i26 = 2;
                                                    } else {
                                                        if (cCharAt == '+') {
                                                            int i20122 = f62084a;
                                                            int i20123 = i20122 ^ 97;
                                                            int i211110 = (i20122 & 97) << 1;
                                                            int i211111 = (i20123 ^ i211110) + ((i20123 & i211110) << 1);
                                                            f62085b = i211111 % 128;
                                                            int i211112 = i211111 % 2;
                                                            int i211113 = ((i20122 & 31) - (~(i20122 | 31))) - 1;
                                                            f62085b = i211113 % 128;
                                                            i26 = 2;
                                                            int i211114 = i211113 % 2;
                                                        } else if (cCharAt == '-') {
                                                            int i211115 = f62085b;
                                                            i24 = i211115 + 19;
                                                            f62084a = i24 % 128;
                                                            if (i24 % 2 != 0) {
                                                                i25 = 0;
                                                            } else {
                                                                i25 = 1;
                                                            }
                                                            int i211116 = ((i211115 & 19) - (~(i211115 | 19))) - 1;
                                                            f62084a = i211116 % 128;
                                                            int i211117 = i211116 % 2;
                                                            i23 = i25;
                                                            i22 = 1;
                                                        } else {
                                                            int i211118 = f62085b;
                                                            int i211119 = (i211118 & 89) + (i211118 | 89);
                                                            f62084a = i211119 % 128;
                                                            int i22110 = i211119 % 2;
                                                            i22 = 1;
                                                            i23 = 0;
                                                        }
                                                        if ((i23 ^ 1) != i22) {
                                                            int i18111118 = f62085b;
                                                            int i18111119 = i18111118 ^ 7;
                                                            int i181111110 = ((i18111118 & 7) | i18111119) << i22;
                                                            int i181111111 = -i18111119;
                                                            i32 = (i181111110 ^ i181111111) + ((i181111110 & i181111111) << i22);
                                                            f62084a = i32 % 128;
                                                            if (i32 % 2 != 0) {
                                                                i27 = 1;
                                                                i28 = 0;
                                                            } else {
                                                                i27 = 1;
                                                                i28 = 1;
                                                            }
                                                        } else if (cCharAt == '.') {
                                                            int i181111112 = f62085b;
                                                            int i181111113 = (i181111112 & 119) + (i181111112 | 119);
                                                            f62084a = i181111113 % 128;
                                                            int i181111114 = i181111113 % 2;
                                                            int i181111115 = i181111112 + 56;
                                                            i27 = 1;
                                                            int i191111110 = (i181111115 ^ (-1)) + (i181111115 << 1);
                                                            f62084a = i191111110 % 128;
                                                            int i191111111 = i191111110 % 2;
                                                            i28 = 1;
                                                        } else {
                                                            i27 = 1;
                                                            int i191111112 = f62084a;
                                                            int i191111113 = ((i191111112 | 45) << 1) - (i191111112 ^ 45);
                                                            f62085b = i191111113 % 128;
                                                            int i191111114 = i191111113 % 2;
                                                            i28 = 0;
                                                        }
                                                        if ((i28 ^ 1) != i27) {
                                                            i29 = f62085b;
                                                            int i191111115 = ((i29 & (-28)) | ((~i29) & 27)) + ((i29 & 27) << i27);
                                                            i30 = i191111115 % 128;
                                                            f62084a = i30;
                                                            int i191111116 = i191111115 % 2;
                                                            if (cCharAt == ':') {
                                                                int i191111117 = (-2) - ((-1) ^ (((i29 | 98) << i27) - (i29 ^ 98)));
                                                                int i191111118 = i191111117 % 128;
                                                                f62084a = i191111118;
                                                                int i191111119 = i191111117 % 2;
                                                                int i201117 = (i191111118 | 15) << 1;
                                                                int i201118 = -(i191111118 ^ 15);
                                                                i31 = (i201117 ^ i201118) + ((i201118 & i201117) << 1);
                                                                f62085b = i31 % 128;
                                                                if (i31 % 2 == 0) {
                                                                    int i201119 = 83 / 0;
                                                                }
                                                                return Integer.valueOf(i15);
                                                            }
                                                            int i2011110 = (-2) - (((i30 & 118) + (i30 | 118)) ^ (-1));
                                                            f62085b = i2011110 % 128;
                                                            int i2011111 = i2011110 % 2;
                                                        }
                                                    }
                                                    int i1711110 = f62084a + 89;
                                                    int i1711111 = i1711110 % 128;
                                                    f62085b = i1711111;
                                                    int i1711112 = i1711110 % i26;
                                                    int i1711113 = i1711111 & 73;
                                                    int i1711114 = -(-((i1711111 ^ 73) | i1711113));
                                                    int i18111120 = (i1711113 & i1711114) + (i1711113 | i1711114);
                                                    f62084a = i18111120 % 128;
                                                    int i18111121 = i18111120 % 2;
                                                    i22 = 1;
                                                    i23 = 1;
                                                    if ((i23 ^ 1) != i22) {
                                                        int i181111116 = f62085b;
                                                        int i181111117 = i181111116 ^ 7;
                                                        int i181111118 = ((i181111116 & 7) | i181111117) << i22;
                                                        int i181111119 = -i181111117;
                                                        i32 = (i181111118 ^ i181111119) + ((i181111118 & i181111119) << i22);
                                                        f62084a = i32 % 128;
                                                        if (i32 % 2 != 0) {
                                                            i27 = 1;
                                                            i28 = 0;
                                                        } else {
                                                            i27 = 1;
                                                            i28 = 1;
                                                        }
                                                    } else if (cCharAt == '.') {
                                                        int i1811111110 = f62085b;
                                                        int i1811111111 = (i1811111110 & 119) + (i1811111110 | 119);
                                                        f62084a = i1811111111 % 128;
                                                        int i1811111112 = i1811111111 % 2;
                                                        int i1811111113 = i1811111110 + 56;
                                                        i27 = 1;
                                                        int i1911111110 = (i1811111113 ^ (-1)) + (i1811111113 << 1);
                                                        f62084a = i1911111110 % 128;
                                                        int i1911111111 = i1911111110 % 2;
                                                        i28 = 1;
                                                    } else {
                                                        i27 = 1;
                                                        int i1911111112 = f62084a;
                                                        int i1911111113 = ((i1911111112 | 45) << 1) - (i1911111112 ^ 45);
                                                        f62085b = i1911111113 % 128;
                                                        int i1911111114 = i1911111113 % 2;
                                                        i28 = 0;
                                                    }
                                                    if ((i28 ^ 1) != i27) {
                                                        i29 = f62085b;
                                                        int i1911111115 = ((i29 & (-28)) | ((~i29) & 27)) + ((i29 & 27) << i27);
                                                        i30 = i1911111115 % 128;
                                                        f62084a = i30;
                                                        int i1911111116 = i1911111115 % 2;
                                                        if (cCharAt == ':') {
                                                            int i1911111117 = (-2) - ((-1) ^ (((i29 | 98) << i27) - (i29 ^ 98)));
                                                            int i1911111118 = i1911111117 % 128;
                                                            f62084a = i1911111118;
                                                            int i1911111119 = i1911111117 % 2;
                                                            int i2011112 = (i1911111118 | 15) << 1;
                                                            int i2011113 = -(i1911111118 ^ 15);
                                                            i31 = (i2011112 ^ i2011113) + ((i2011113 & i2011112) << 1);
                                                            f62085b = i31 % 128;
                                                            if (i31 % 2 == 0) {
                                                                int i2011114 = 83 / 0;
                                                            }
                                                            return Integer.valueOf(i15);
                                                        }
                                                        int i2011115 = (-2) - (((i30 & 118) + (i30 | 118)) ^ (-1));
                                                        f62085b = i2011115 % 128;
                                                        int i2011116 = i2011115 % 2;
                                                    }
                                                }
                                                z10 = false;
                                                if (!z10) {
                                                    if ('A' <= cCharAt) {
                                                        i35 = f62084a;
                                                        int i14110 = (-2) - (((i35 ^ 24) + ((i35 & 24) << 1)) ^ (-1));
                                                        i36 = i14110 % 128;
                                                        f62085b = i36;
                                                        int i14111 = i14110 % 2;
                                                        if (cCharAt < '[') {
                                                            int i14112 = i36 ^ 91;
                                                            int i15110 = ((i36 & 91) | i14112) << 1;
                                                            int i15111 = -i14112;
                                                            int i15112 = ((i15110 | i15111) << 1) - (i15111 ^ i15110);
                                                            f62084a = i15112 % 128;
                                                            int i15113 = i15112 % 2;
                                                            int i15114 = (((i36 & (-100)) | ((~i36) & 99)) - (~(-(-((i36 & 99) << 1))))) - 1;
                                                            f62084a = i15114 % 128;
                                                            int i15115 = i15114 % 2;
                                                        } else {
                                                            int i15116 = i35 + 85;
                                                            f62085b = i15116 % 128;
                                                            int i15117 = i15116 % 2;
                                                        }
                                                    }
                                                    if ('0' <= cCharAt) {
                                                        i34 = f62084a;
                                                        int i15118 = i34 & 9;
                                                        int i15119 = (i34 ^ 9) | i15118;
                                                        int i16116 = (i15118 & i15119) + (i15118 | i15119);
                                                        f62085b = i16116 % 128;
                                                        int i16117 = i16116 % 2;
                                                        if (cCharAt < ':') {
                                                            int i16118 = i34 & 107;
                                                            int i16119 = (((i34 ^ 107) | i16118) << 1) - ((~i16118) & (i34 | 107));
                                                            f62085b = i16119 % 128;
                                                            int i16120 = i16119 % 2;
                                                            int i16121 = (i34 ^ 57) + ((i34 & 57) << 1);
                                                            f62085b = i16121 % 128;
                                                            int i16122 = i16121 % 2;
                                                            int i161110 = f62085b;
                                                            int i161111 = i161110 & 119;
                                                            int i161112 = ((i161110 ^ 119) | i161111) << 1;
                                                            int i171125 = -((~i161111) & (i161110 | 119));
                                                            int i171126 = (i161112 & i171125) + (i161112 | i171125);
                                                            f62084a = i171126 % 128;
                                                            int i171127 = i171126 % 2;
                                                            int i171128 = i161110 + 37;
                                                            f62084a = i171128 % 128;
                                                            int i171129 = i171128 % 2;
                                                            i26 = 2;
                                                            int i1711115 = f62084a + 89;
                                                            int i1711116 = i1711115 % 128;
                                                            f62085b = i1711116;
                                                            int i1711117 = i1711115 % i26;
                                                            int i1711118 = i1711116 & 73;
                                                            int i1711119 = -(-((i1711116 ^ 73) | i1711118));
                                                            int i18111122 = (i1711118 & i1711119) + (i1711118 | i1711119);
                                                            f62084a = i18111122 % 128;
                                                            int i18111123 = i18111122 % 2;
                                                            i22 = 1;
                                                            i23 = 1;
                                                            if ((i23 ^ 1) != i22) {
                                                                int i1811111114 = f62085b;
                                                                int i1811111115 = i1811111114 ^ 7;
                                                                int i1811111116 = ((i1811111114 & 7) | i1811111115) << i22;
                                                                int i1811111117 = -i1811111115;
                                                                i32 = (i1811111116 ^ i1811111117) + ((i1811111116 & i1811111117) << i22);
                                                                f62084a = i32 % 128;
                                                                if (i32 % 2 != 0) {
                                                                    i27 = 1;
                                                                    i28 = 0;
                                                                } else {
                                                                    i27 = 1;
                                                                    i28 = 1;
                                                                }
                                                            } else if (cCharAt == '.') {
                                                                int i1811111118 = f62085b;
                                                                int i1811111119 = (i1811111118 & 119) + (i1811111118 | 119);
                                                                f62084a = i1811111119 % 128;
                                                                int i18111111110 = i1811111119 % 2;
                                                                int i18111111111 = i1811111118 + 56;
                                                                i27 = 1;
                                                                int i19111111110 = (i18111111111 ^ (-1)) + (i18111111111 << 1);
                                                                f62084a = i19111111110 % 128;
                                                                int i19111111111 = i19111111110 % 2;
                                                                i28 = 1;
                                                            } else {
                                                                i27 = 1;
                                                                int i19111111112 = f62084a;
                                                                int i19111111113 = ((i19111111112 | 45) << 1) - (i19111111112 ^ 45);
                                                                f62085b = i19111111113 % 128;
                                                                int i19111111114 = i19111111113 % 2;
                                                                i28 = 0;
                                                            }
                                                            if ((i28 ^ 1) != i27) {
                                                                i29 = f62085b;
                                                                int i19111111115 = ((i29 & (-28)) | ((~i29) & 27)) + ((i29 & 27) << i27);
                                                                i30 = i19111111115 % 128;
                                                                f62084a = i30;
                                                                int i19111111116 = i19111111115 % 2;
                                                                if (cCharAt == ':') {
                                                                    int i19111111117 = (-2) - ((-1) ^ (((i29 | 98) << i27) - (i29 ^ 98)));
                                                                    int i19111111118 = i19111111117 % 128;
                                                                    f62084a = i19111111118;
                                                                    int i19111111119 = i19111111117 % 2;
                                                                    int i2011117 = (i19111111118 | 15) << 1;
                                                                    int i2011118 = -(i19111111118 ^ 15);
                                                                    i31 = (i2011117 ^ i2011118) + ((i2011118 & i2011117) << 1);
                                                                    f62085b = i31 % 128;
                                                                    if (i31 % 2 == 0) {
                                                                        int i2011119 = 83 / 0;
                                                                    }
                                                                    return Integer.valueOf(i15);
                                                                }
                                                                int i20111110 = (-2) - (((i30 & 118) + (i30 | 118)) ^ (-1));
                                                                f62085b = i20111110 % 128;
                                                                int i20111111 = i20111110 % 2;
                                                            }
                                                        } else {
                                                            int i2023 = i34 & 113;
                                                            int i2024 = (((i34 ^ 113) | i2023) << 1) - ((i34 | 113) & (~i2023));
                                                            f62085b = i2024 % 128;
                                                            int i2025 = i2024 % 2;
                                                        }
                                                    }
                                                    if (cCharAt == '+') {
                                                        int i20124 = f62084a;
                                                        int i20125 = i20124 ^ 97;
                                                        int i2111110 = (i20124 & 97) << 1;
                                                        int i2111111 = (i20125 ^ i2111110) + ((i20125 & i2111110) << 1);
                                                        f62085b = i2111111 % 128;
                                                        int i2111112 = i2111111 % 2;
                                                        int i2111113 = ((i20124 & 31) - (~(i20124 | 31))) - 1;
                                                        f62085b = i2111113 % 128;
                                                        i26 = 2;
                                                        int i2111114 = i2111113 % 2;
                                                        int i17111110 = f62084a + 89;
                                                        int i17111111 = i17111110 % 128;
                                                        f62085b = i17111111;
                                                        int i17111112 = i17111110 % i26;
                                                        int i17111113 = i17111111 & 73;
                                                        int i17111114 = -(-((i17111111 ^ 73) | i17111113));
                                                        int i18111124 = (i17111113 & i17111114) + (i17111113 | i17111114);
                                                        f62084a = i18111124 % 128;
                                                        int i18111125 = i18111124 % 2;
                                                        i22 = 1;
                                                        i23 = 1;
                                                    } else if (cCharAt == '-') {
                                                        int i2111115 = f62085b;
                                                        i24 = i2111115 + 19;
                                                        f62084a = i24 % 128;
                                                        if (i24 % 2 != 0) {
                                                            i25 = 0;
                                                        } else {
                                                            i25 = 1;
                                                        }
                                                        int i2111116 = ((i2111115 & 19) - (~(i2111115 | 19))) - 1;
                                                        f62084a = i2111116 % 128;
                                                        int i2111117 = i2111116 % 2;
                                                        i23 = i25;
                                                        i22 = 1;
                                                    } else {
                                                        int i2111118 = f62085b;
                                                        int i2111119 = (i2111118 & 89) + (i2111118 | 89);
                                                        f62084a = i2111119 % 128;
                                                        int i22111 = i2111119 % 2;
                                                        i22 = 1;
                                                        i23 = 0;
                                                    }
                                                    if ((i23 ^ 1) != i22) {
                                                        int i18111111112 = f62085b;
                                                        int i18111111113 = i18111111112 ^ 7;
                                                        int i18111111114 = ((i18111111112 & 7) | i18111111113) << i22;
                                                        int i18111111115 = -i18111111113;
                                                        i32 = (i18111111114 ^ i18111111115) + ((i18111111114 & i18111111115) << i22);
                                                        f62084a = i32 % 128;
                                                        if (i32 % 2 != 0) {
                                                            i27 = 1;
                                                            i28 = 0;
                                                        } else {
                                                            i27 = 1;
                                                            i28 = 1;
                                                        }
                                                    } else if (cCharAt == '.') {
                                                        int i18111111116 = f62085b;
                                                        int i18111111117 = (i18111111116 & 119) + (i18111111116 | 119);
                                                        f62084a = i18111111117 % 128;
                                                        int i18111111118 = i18111111117 % 2;
                                                        int i18111111119 = i18111111116 + 56;
                                                        i27 = 1;
                                                        int i191111111110 = (i18111111119 ^ (-1)) + (i18111111119 << 1);
                                                        f62084a = i191111111110 % 128;
                                                        int i191111111111 = i191111111110 % 2;
                                                        i28 = 1;
                                                    } else {
                                                        i27 = 1;
                                                        int i191111111112 = f62084a;
                                                        int i191111111113 = ((i191111111112 | 45) << 1) - (i191111111112 ^ 45);
                                                        f62085b = i191111111113 % 128;
                                                        int i191111111114 = i191111111113 % 2;
                                                        i28 = 0;
                                                    }
                                                    if ((i28 ^ 1) != i27) {
                                                        i29 = f62085b;
                                                        int i191111111115 = ((i29 & (-28)) | ((~i29) & 27)) + ((i29 & 27) << i27);
                                                        i30 = i191111111115 % 128;
                                                        f62084a = i30;
                                                        int i191111111116 = i191111111115 % 2;
                                                        if (cCharAt == ':') {
                                                            int i191111111117 = (-2) - ((-1) ^ (((i29 | 98) << i27) - (i29 ^ 98)));
                                                            int i191111111118 = i191111111117 % 128;
                                                            f62084a = i191111111118;
                                                            int i191111111119 = i191111111117 % 2;
                                                            int i20111112 = (i191111111118 | 15) << 1;
                                                            int i20111113 = -(i191111111118 ^ 15);
                                                            i31 = (i20111112 ^ i20111113) + ((i20111113 & i20111112) << 1);
                                                            f62085b = i31 % 128;
                                                            if (i31 % 2 == 0) {
                                                                int i20111114 = 83 / 0;
                                                            }
                                                            return Integer.valueOf(i15);
                                                        }
                                                        int i20111115 = (-2) - (((i30 & 118) + (i30 | 118)) ^ (-1));
                                                        f62085b = i20111115 % 128;
                                                        int i20111116 = i20111115 % 2;
                                                    }
                                                } else {
                                                    int i22112 = f62085b;
                                                    int i22113 = i22112 & 101;
                                                    int i22114 = i22112 | 101;
                                                    int i22115 = (i22113 & i22114) + (i22114 | i22113);
                                                    int i22116 = i22115 % 128;
                                                    f62084a = i22116;
                                                    int i22117 = i22115 % 2;
                                                    int i22118 = i22116 & 33;
                                                    int i22119 = i22118 + ((i22116 ^ 33) | i22118);
                                                    f62085b = i22119 % 128;
                                                    int i2221 = i22119 % 2;
                                                }
                                                int i238 = f62085b;
                                                int i239 = ~i238;
                                                i33 = (((i238 | 117) << 1) - (~(-((i238 & (-118)) | (i239 & 117))))) - 1;
                                                f62084a = i33 % 128;
                                                if (i33 % 2 != 0) {
                                                    z11 = false;
                                                } else {
                                                    z11 = true;
                                                }
                                                int i2310 = (((i239 & 73) | (i238 & (-74))) - (~(-(-((i238 & 73) << 1))))) - 1;
                                                f62084a = i2310 % 128;
                                                int i2311 = i2310 % 2;
                                                if (z11) {
                                                    int i161113 = f62085b;
                                                    int i161114 = i161113 & 119;
                                                    int i161115 = ((i161113 ^ 119) | i161114) << 1;
                                                    int i1711210 = -((~i161114) & (i161113 | 119));
                                                    int i1711211 = (i161115 & i1711210) + (i161115 | i1711210);
                                                    f62084a = i1711211 % 128;
                                                    int i1711212 = i1711211 % 2;
                                                    int i1711213 = i161113 + 37;
                                                    f62084a = i1711213 % 128;
                                                    int i1711214 = i1711213 % 2;
                                                    i26 = 2;
                                                } else {
                                                    if (cCharAt == '+') {
                                                        int i20126 = f62084a;
                                                        int i20127 = i20126 ^ 97;
                                                        int i21111110 = (i20126 & 97) << 1;
                                                        int i21111111 = (i20127 ^ i21111110) + ((i20127 & i21111110) << 1);
                                                        f62085b = i21111111 % 128;
                                                        int i21111112 = i21111111 % 2;
                                                        int i21111113 = ((i20126 & 31) - (~(i20126 | 31))) - 1;
                                                        f62085b = i21111113 % 128;
                                                        i26 = 2;
                                                        int i21111114 = i21111113 % 2;
                                                    } else if (cCharAt == '-') {
                                                        int i21111115 = f62085b;
                                                        i24 = i21111115 + 19;
                                                        f62084a = i24 % 128;
                                                        if (i24 % 2 != 0) {
                                                            i25 = 0;
                                                        } else {
                                                            i25 = 1;
                                                        }
                                                        int i21111116 = ((i21111115 & 19) - (~(i21111115 | 19))) - 1;
                                                        f62084a = i21111116 % 128;
                                                        int i21111117 = i21111116 % 2;
                                                        i23 = i25;
                                                        i22 = 1;
                                                    } else {
                                                        int i21111118 = f62085b;
                                                        int i21111119 = (i21111118 & 89) + (i21111118 | 89);
                                                        f62084a = i21111119 % 128;
                                                        int i221110 = i21111119 % 2;
                                                        i22 = 1;
                                                        i23 = 0;
                                                    }
                                                    if ((i23 ^ 1) != i22) {
                                                        int i181111111110 = f62085b;
                                                        int i181111111111 = i181111111110 ^ 7;
                                                        int i181111111112 = ((i181111111110 & 7) | i181111111111) << i22;
                                                        int i181111111113 = -i181111111111;
                                                        i32 = (i181111111112 ^ i181111111113) + ((i181111111112 & i181111111113) << i22);
                                                        f62084a = i32 % 128;
                                                        if (i32 % 2 != 0) {
                                                            i27 = 1;
                                                            i28 = 0;
                                                        } else {
                                                            i27 = 1;
                                                            i28 = 1;
                                                        }
                                                    } else if (cCharAt == '.') {
                                                        int i181111111114 = f62085b;
                                                        int i181111111115 = (i181111111114 & 119) + (i181111111114 | 119);
                                                        f62084a = i181111111115 % 128;
                                                        int i181111111116 = i181111111115 % 2;
                                                        int i181111111117 = i181111111114 + 56;
                                                        i27 = 1;
                                                        int i1911111111110 = (i181111111117 ^ (-1)) + (i181111111117 << 1);
                                                        f62084a = i1911111111110 % 128;
                                                        int i1911111111111 = i1911111111110 % 2;
                                                        i28 = 1;
                                                    } else {
                                                        i27 = 1;
                                                        int i1911111111112 = f62084a;
                                                        int i1911111111113 = ((i1911111111112 | 45) << 1) - (i1911111111112 ^ 45);
                                                        f62085b = i1911111111113 % 128;
                                                        int i1911111111114 = i1911111111113 % 2;
                                                        i28 = 0;
                                                    }
                                                    if ((i28 ^ 1) != i27) {
                                                        i29 = f62085b;
                                                        int i1911111111115 = ((i29 & (-28)) | ((~i29) & 27)) + ((i29 & 27) << i27);
                                                        i30 = i1911111111115 % 128;
                                                        f62084a = i30;
                                                        int i1911111111116 = i1911111111115 % 2;
                                                        if (cCharAt == ':') {
                                                            int i1911111111117 = (-2) - ((-1) ^ (((i29 | 98) << i27) - (i29 ^ 98)));
                                                            int i1911111111118 = i1911111111117 % 128;
                                                            f62084a = i1911111111118;
                                                            int i1911111111119 = i1911111111117 % 2;
                                                            int i20111117 = (i1911111111118 | 15) << 1;
                                                            int i20111118 = -(i1911111111118 ^ 15);
                                                            i31 = (i20111117 ^ i20111118) + ((i20111118 & i20111117) << 1);
                                                            f62085b = i31 % 128;
                                                            if (i31 % 2 == 0) {
                                                                int i20111119 = 83 / 0;
                                                            }
                                                            return Integer.valueOf(i15);
                                                        }
                                                        int i201111110 = (-2) - (((i30 & 118) + (i30 | 118)) ^ (-1));
                                                        f62085b = i201111110 % 128;
                                                        int i201111111 = i201111110 % 2;
                                                    }
                                                }
                                                int i17111115 = f62084a + 89;
                                                int i17111116 = i17111115 % 128;
                                                f62085b = i17111116;
                                                int i17111117 = i17111115 % i26;
                                                int i17111118 = i17111116 & 73;
                                                int i17111119 = -(-((i17111116 ^ 73) | i17111118));
                                                int i18111126 = (i17111118 & i17111119) + (i17111118 | i17111119);
                                                f62084a = i18111126 % 128;
                                                int i18111127 = i18111126 % 2;
                                                i22 = 1;
                                                i23 = 1;
                                                if ((i23 ^ 1) != i22) {
                                                    int i181111111118 = f62085b;
                                                    int i181111111119 = i181111111118 ^ 7;
                                                    int i1811111111110 = ((i181111111118 & 7) | i181111111119) << i22;
                                                    int i1811111111111 = -i181111111119;
                                                    i32 = (i1811111111110 ^ i1811111111111) + ((i1811111111110 & i1811111111111) << i22);
                                                    f62084a = i32 % 128;
                                                    if (i32 % 2 != 0) {
                                                        i27 = 1;
                                                        i28 = 0;
                                                    } else {
                                                        i27 = 1;
                                                        i28 = 1;
                                                    }
                                                } else if (cCharAt == '.') {
                                                    int i1811111111112 = f62085b;
                                                    int i1811111111113 = (i1811111111112 & 119) + (i1811111111112 | 119);
                                                    f62084a = i1811111111113 % 128;
                                                    int i1811111111114 = i1811111111113 % 2;
                                                    int i1811111111115 = i1811111111112 + 56;
                                                    i27 = 1;
                                                    int i19111111111110 = (i1811111111115 ^ (-1)) + (i1811111111115 << 1);
                                                    f62084a = i19111111111110 % 128;
                                                    int i19111111111111 = i19111111111110 % 2;
                                                    i28 = 1;
                                                } else {
                                                    i27 = 1;
                                                    int i19111111111112 = f62084a;
                                                    int i19111111111113 = ((i19111111111112 | 45) << 1) - (i19111111111112 ^ 45);
                                                    f62085b = i19111111111113 % 128;
                                                    int i19111111111114 = i19111111111113 % 2;
                                                    i28 = 0;
                                                }
                                                if ((i28 ^ 1) != i27) {
                                                    i29 = f62085b;
                                                    int i19111111111115 = ((i29 & (-28)) | ((~i29) & 27)) + ((i29 & 27) << i27);
                                                    i30 = i19111111111115 % 128;
                                                    f62084a = i30;
                                                    int i19111111111116 = i19111111111115 % 2;
                                                    if (cCharAt == ':') {
                                                        int i19111111111117 = (-2) - ((-1) ^ (((i29 | 98) << i27) - (i29 ^ 98)));
                                                        int i19111111111118 = i19111111111117 % 128;
                                                        f62084a = i19111111111118;
                                                        int i19111111111119 = i19111111111117 % 2;
                                                        int i201111112 = (i19111111111118 | 15) << 1;
                                                        int i201111113 = -(i19111111111118 ^ 15);
                                                        i31 = (i201111112 ^ i201111113) + ((i201111113 & i201111112) << 1);
                                                        f62085b = i31 % 128;
                                                        if (i31 % 2 == 0) {
                                                            int i201111114 = 83 / 0;
                                                        }
                                                        return Integer.valueOf(i15);
                                                    }
                                                    int i201111115 = (-2) - (((i30 & 118) + (i30 | 118)) ^ (-1));
                                                    f62085b = i201111115 % 128;
                                                    int i201111116 = i201111115 % 2;
                                                }
                                            }
                                            int i240 = f62084a;
                                            i16 = ((i240 ^ 34) + ((i240 & 34) << 1)) - 1;
                                            f62085b = i16 % 128;
                                            if (i16 % 2 == 0) {
                                                throw null;
                                            }
                                        }
                                    }
                                    int i241 = f62085b;
                                    int i242 = i241 ^ 61;
                                    int i243 = -(-((i241 & 61) << 1));
                                    i13 = (i242 & i243) + (i243 | i242);
                                    f62084a = i13 % 128;
                                    if (i13 % 2 != 0) {
                                        throw null;
                                    }
                                } else {
                                    int i1010 = -(-(iIntValue7 * (-489)));
                                    int i1011 = 491 & i1010;
                                    int i1012 = (i1010 ^ 491) | i1011;
                                    int i1110 = (i1011 & i1012) + (i1012 | i1011);
                                    int i1111 = ((-2) & i70) | (i68 & 1);
                                    int i1112 = (-2) & i68;
                                    int i1113 = (i1111 & i1112) | (i1111 ^ i1112);
                                    int i1114 = -(~(((i1113 & i68) | (i70 & i1113) | ((~i1113) & i68)) * (-490)));
                                    int i1115 = ((i1110 & i1114) + (i1114 | i1110)) - 1;
                                    int i1116 = (i88 & (-2)) | ((~i88) & 1);
                                    int i1117 = i88 & 1;
                                    int i1118 = ~((i1116 & i1117) | (i1116 ^ i1117));
                                    int i1119 = i88 & iIntValue7;
                                    int i1210 = (iIntValue7 | i88) & (~i1119);
                                    int i1211 = (i1210 & i1119) | (i1210 ^ i1119);
                                    int i1212 = ~i1211;
                                    int i1213 = (i1211 | i1212) & i1212;
                                    int i1214 = ((~i1213) & i1118) | ((~i1118) & i1213);
                                    int i1215 = i1118 & i1213;
                                    int i1216 = -(-(((i1215 & i1214) | (i1214 ^ i1215)) * 490));
                                    int i1217 = (i1115 & i1216) + (i1216 | i1115);
                                    int i1218 = f62084a + 64;
                                    int i1219 = (i1218 ^ (-1)) + (i1218 << 1);
                                    f62085b = i1219 % 128;
                                    int i1311 = i1219 % 2;
                                    while (i15 < iIntValue8) {
                                        int i1312 = f62084a;
                                        int i1313 = i1312 & 73;
                                        i17 = (((i1312 ^ 73) | i1313) << 1) - ((i1312 | 73) & (~i1313));
                                        f62085b = i17 % 128;
                                        if (i17 % 2 == 0) {
                                            int i1314 = i15 & 12;
                                            int i1315 = -(-((i15 ^ 12) | i1314));
                                            i18 = 1;
                                            int i1316 = ((i1314 | i1315) << 1) - (i1314 ^ i1315);
                                            int i1317 = i1316 ^ 73;
                                            int i1318 = ((i1316 & 73) | i1317) << 1;
                                            int i1319 = -i1317;
                                            i19 = (i1318 ^ i1319) + ((i1319 & i1318) << 1);
                                            cCharAt = str3.charAt(i15);
                                            if (1 <= cCharAt) {
                                                int i13110 = f62084a;
                                                int i14113 = i13110 & 35;
                                                int i14114 = ((i13110 ^ 35) | i14113) << i18;
                                                int i14115 = -((i13110 | 35) & (~i14113));
                                                int i14116 = (i14114 ^ i14115) + ((i14115 & i14114) << i18);
                                                i20 = i14116 % 128;
                                                f62085b = i20;
                                                int i14117 = i14116 % 2;
                                                if (cCharAt < '{') {
                                                    int i14118 = ((i20 ^ 31) | (i20 & 31)) << 1;
                                                    int i14119 = -(((~i20) & 31) | (i20 & (-32)));
                                                    i21 = (i14118 ^ i14119) + ((i14119 & i14118) << 1);
                                                    f62084a = i21 % 128;
                                                    if (i21 % 2 != 0) {
                                                        z10 = true;
                                                    }
                                                }
                                            }
                                            if (!z10) {
                                                if ('A' <= cCharAt) {
                                                    i35 = f62084a;
                                                    int i141110 = (-2) - (((i35 ^ 24) + ((i35 & 24) << 1)) ^ (-1));
                                                    i36 = i141110 % 128;
                                                    f62085b = i36;
                                                    int i141111 = i141110 % 2;
                                                    if (cCharAt < '[') {
                                                        int i141112 = i36 ^ 91;
                                                        int i151110 = ((i36 & 91) | i141112) << 1;
                                                        int i151111 = -i141112;
                                                        int i151112 = ((i151110 | i151111) << 1) - (i151111 ^ i151110);
                                                        f62084a = i151112 % 128;
                                                        int i151113 = i151112 % 2;
                                                        int i151114 = (((i36 & (-100)) | ((~i36) & 99)) - (~(-(-((i36 & 99) << 1))))) - 1;
                                                        f62084a = i151114 % 128;
                                                        int i151115 = i151114 % 2;
                                                    } else {
                                                        int i151116 = i35 + 85;
                                                        f62085b = i151116 % 128;
                                                        int i151117 = i151116 % 2;
                                                    }
                                                }
                                                if ('0' <= cCharAt) {
                                                    i34 = f62084a;
                                                    int i151118 = i34 & 9;
                                                    int i151119 = (i34 ^ 9) | i151118;
                                                    int i161116 = (i151118 & i151119) + (i151118 | i151119);
                                                    f62085b = i161116 % 128;
                                                    int i161117 = i161116 % 2;
                                                    if (cCharAt < ':') {
                                                        int i161118 = i34 & 107;
                                                        int i161119 = (((i34 ^ 107) | i161118) << 1) - ((~i161118) & (i34 | 107));
                                                        f62085b = i161119 % 128;
                                                        int i16123 = i161119 % 2;
                                                        int i16124 = (i34 ^ 57) + ((i34 & 57) << 1);
                                                        f62085b = i16124 % 128;
                                                        int i16125 = i16124 % 2;
                                                        int i1611110 = f62085b;
                                                        int i1611111 = i1611110 & 119;
                                                        int i1611112 = ((i1611110 ^ 119) | i1611111) << 1;
                                                        int i1711215 = -((~i1611111) & (i1611110 | 119));
                                                        int i1711216 = (i1611112 & i1711215) + (i1611112 | i1711215);
                                                        f62084a = i1711216 % 128;
                                                        int i1711217 = i1711216 % 2;
                                                        int i1711218 = i1611110 + 37;
                                                        f62084a = i1711218 % 128;
                                                        int i1711219 = i1711218 % 2;
                                                        i26 = 2;
                                                        int i171111110 = f62084a + 89;
                                                        int i171111111 = i171111110 % 128;
                                                        f62085b = i171111111;
                                                        int i171111112 = i171111110 % i26;
                                                        int i171111113 = i171111111 & 73;
                                                        int i171111114 = -(-((i171111111 ^ 73) | i171111113));
                                                        int i18111128 = (i171111113 & i171111114) + (i171111113 | i171111114);
                                                        f62084a = i18111128 % 128;
                                                        int i18111129 = i18111128 % 2;
                                                        i22 = 1;
                                                        i23 = 1;
                                                        if ((i23 ^ 1) != i22) {
                                                            int i1811111111116 = f62085b;
                                                            int i1811111111117 = i1811111111116 ^ 7;
                                                            int i1811111111118 = ((i1811111111116 & 7) | i1811111111117) << i22;
                                                            int i1811111111119 = -i1811111111117;
                                                            i32 = (i1811111111118 ^ i1811111111119) + ((i1811111111118 & i1811111111119) << i22);
                                                            f62084a = i32 % 128;
                                                            if (i32 % 2 != 0) {
                                                                i27 = 1;
                                                                i28 = 0;
                                                            } else {
                                                                i27 = 1;
                                                                i28 = 1;
                                                            }
                                                        } else if (cCharAt == '.') {
                                                            int i18111111111110 = f62085b;
                                                            int i18111111111111 = (i18111111111110 & 119) + (i18111111111110 | 119);
                                                            f62084a = i18111111111111 % 128;
                                                            int i18111111111112 = i18111111111111 % 2;
                                                            int i18111111111113 = i18111111111110 + 56;
                                                            i27 = 1;
                                                            int i191111111111110 = (i18111111111113 ^ (-1)) + (i18111111111113 << 1);
                                                            f62084a = i191111111111110 % 128;
                                                            int i191111111111111 = i191111111111110 % 2;
                                                            i28 = 1;
                                                        } else {
                                                            i27 = 1;
                                                            int i191111111111112 = f62084a;
                                                            int i191111111111113 = ((i191111111111112 | 45) << 1) - (i191111111111112 ^ 45);
                                                            f62085b = i191111111111113 % 128;
                                                            int i191111111111114 = i191111111111113 % 2;
                                                            i28 = 0;
                                                        }
                                                        if ((i28 ^ 1) != i27) {
                                                            i29 = f62085b;
                                                            int i191111111111115 = ((i29 & (-28)) | ((~i29) & 27)) + ((i29 & 27) << i27);
                                                            i30 = i191111111111115 % 128;
                                                            f62084a = i30;
                                                            int i191111111111116 = i191111111111115 % 2;
                                                            if (cCharAt == ':') {
                                                                int i191111111111117 = (-2) - ((-1) ^ (((i29 | 98) << i27) - (i29 ^ 98)));
                                                                int i191111111111118 = i191111111111117 % 128;
                                                                f62084a = i191111111111118;
                                                                int i191111111111119 = i191111111111117 % 2;
                                                                int i201111117 = (i191111111111118 | 15) << 1;
                                                                int i201111118 = -(i191111111111118 ^ 15);
                                                                i31 = (i201111117 ^ i201111118) + ((i201111118 & i201111117) << 1);
                                                                f62085b = i31 % 128;
                                                                if (i31 % 2 == 0) {
                                                                    int i201111119 = 83 / 0;
                                                                }
                                                                return Integer.valueOf(i15);
                                                            }
                                                            int i2011111110 = (-2) - (((i30 & 118) + (i30 | 118)) ^ (-1));
                                                            f62085b = i2011111110 % 128;
                                                            int i2011111111 = i2011111110 % 2;
                                                        }
                                                    } else {
                                                        int i2026 = i34 & 113;
                                                        int i2027 = (((i34 ^ 113) | i2026) << 1) - ((i34 | 113) & (~i2026));
                                                        f62085b = i2027 % 128;
                                                        int i2028 = i2027 % 2;
                                                    }
                                                }
                                                if (cCharAt == '+') {
                                                    int i20128 = f62084a;
                                                    int i20129 = i20128 ^ 97;
                                                    int i211111110 = (i20128 & 97) << 1;
                                                    int i211111111 = (i20129 ^ i211111110) + ((i20129 & i211111110) << 1);
                                                    f62085b = i211111111 % 128;
                                                    int i211111112 = i211111111 % 2;
                                                    int i211111113 = ((i20128 & 31) - (~(i20128 | 31))) - 1;
                                                    f62085b = i211111113 % 128;
                                                    i26 = 2;
                                                    int i211111114 = i211111113 % 2;
                                                    int i171111115 = f62084a + 89;
                                                    int i171111116 = i171111115 % 128;
                                                    f62085b = i171111116;
                                                    int i171111117 = i171111115 % i26;
                                                    int i171111118 = i171111116 & 73;
                                                    int i171111119 = -(-((i171111116 ^ 73) | i171111118));
                                                    int i181111210 = (i171111118 & i171111119) + (i171111118 | i171111119);
                                                    f62084a = i181111210 % 128;
                                                    int i181111211 = i181111210 % 2;
                                                    i22 = 1;
                                                    i23 = 1;
                                                } else if (cCharAt == '-') {
                                                    int i211111115 = f62085b;
                                                    i24 = i211111115 + 19;
                                                    f62084a = i24 % 128;
                                                    if (i24 % 2 != 0) {
                                                        i25 = 0;
                                                    } else {
                                                        i25 = 1;
                                                    }
                                                    int i211111116 = ((i211111115 & 19) - (~(i211111115 | 19))) - 1;
                                                    f62084a = i211111116 % 128;
                                                    int i211111117 = i211111116 % 2;
                                                    i23 = i25;
                                                    i22 = 1;
                                                } else {
                                                    int i211111118 = f62085b;
                                                    int i211111119 = (i211111118 & 89) + (i211111118 | 89);
                                                    f62084a = i211111119 % 128;
                                                    int i221111 = i211111119 % 2;
                                                    i22 = 1;
                                                    i23 = 0;
                                                }
                                                if ((i23 ^ 1) != i22) {
                                                    int i18111111111114 = f62085b;
                                                    int i18111111111115 = i18111111111114 ^ 7;
                                                    int i18111111111116 = ((i18111111111114 & 7) | i18111111111115) << i22;
                                                    int i18111111111117 = -i18111111111115;
                                                    i32 = (i18111111111116 ^ i18111111111117) + ((i18111111111116 & i18111111111117) << i22);
                                                    f62084a = i32 % 128;
                                                    if (i32 % 2 != 0) {
                                                        i27 = 1;
                                                        i28 = 0;
                                                    } else {
                                                        i27 = 1;
                                                        i28 = 1;
                                                    }
                                                } else if (cCharAt == '.') {
                                                    int i18111111111118 = f62085b;
                                                    int i18111111111119 = (i18111111111118 & 119) + (i18111111111118 | 119);
                                                    f62084a = i18111111111119 % 128;
                                                    int i181111111111110 = i18111111111119 % 2;
                                                    int i181111111111111 = i18111111111118 + 56;
                                                    i27 = 1;
                                                    int i1911111111111110 = (i181111111111111 ^ (-1)) + (i181111111111111 << 1);
                                                    f62084a = i1911111111111110 % 128;
                                                    int i1911111111111111 = i1911111111111110 % 2;
                                                    i28 = 1;
                                                } else {
                                                    i27 = 1;
                                                    int i1911111111111112 = f62084a;
                                                    int i1911111111111113 = ((i1911111111111112 | 45) << 1) - (i1911111111111112 ^ 45);
                                                    f62085b = i1911111111111113 % 128;
                                                    int i1911111111111114 = i1911111111111113 % 2;
                                                    i28 = 0;
                                                }
                                                if ((i28 ^ 1) != i27) {
                                                    i29 = f62085b;
                                                    int i1911111111111115 = ((i29 & (-28)) | ((~i29) & 27)) + ((i29 & 27) << i27);
                                                    i30 = i1911111111111115 % 128;
                                                    f62084a = i30;
                                                    int i1911111111111116 = i1911111111111115 % 2;
                                                    if (cCharAt == ':') {
                                                        int i1911111111111117 = (-2) - ((-1) ^ (((i29 | 98) << i27) - (i29 ^ 98)));
                                                        int i1911111111111118 = i1911111111111117 % 128;
                                                        f62084a = i1911111111111118;
                                                        int i1911111111111119 = i1911111111111117 % 2;
                                                        int i2011111112 = (i1911111111111118 | 15) << 1;
                                                        int i2011111113 = -(i1911111111111118 ^ 15);
                                                        i31 = (i2011111112 ^ i2011111113) + ((i2011111113 & i2011111112) << 1);
                                                        f62085b = i31 % 128;
                                                        if (i31 % 2 == 0) {
                                                            int i2011111114 = 83 / 0;
                                                        }
                                                        return Integer.valueOf(i15);
                                                    }
                                                    int i2011111115 = (-2) - (((i30 & 118) + (i30 | 118)) ^ (-1));
                                                    f62085b = i2011111115 % 128;
                                                    int i2011111116 = i2011111115 % 2;
                                                }
                                            } else {
                                                int i221112 = f62085b;
                                                int i221113 = i221112 & 101;
                                                int i221114 = i221112 | 101;
                                                int i221115 = (i221113 & i221114) + (i221114 | i221113);
                                                int i221116 = i221115 % 128;
                                                f62084a = i221116;
                                                int i221117 = i221115 % 2;
                                                int i221118 = i221116 & 33;
                                                int i221119 = i221118 + ((i221116 ^ 33) | i221118);
                                                f62085b = i221119 % 128;
                                                int i2222 = i221119 % 2;
                                            }
                                            int i2312 = f62085b;
                                            int i2313 = ~i2312;
                                            i33 = (((i2312 | 117) << 1) - (~(-((i2312 & (-118)) | (i2313 & 117))))) - 1;
                                            f62084a = i33 % 128;
                                            if (i33 % 2 != 0) {
                                                z11 = false;
                                            } else {
                                                z11 = true;
                                            }
                                            int i2314 = (((i2313 & 73) | (i2312 & (-74))) - (~(-(-((i2312 & 73) << 1))))) - 1;
                                            f62084a = i2314 % 128;
                                            int i2315 = i2314 % 2;
                                            if (z11) {
                                                int i1611113 = f62085b;
                                                int i1611114 = i1611113 & 119;
                                                int i1611115 = ((i1611113 ^ 119) | i1611114) << 1;
                                                int i17112110 = -((~i1611114) & (i1611113 | 119));
                                                int i17112111 = (i1611115 & i17112110) + (i1611115 | i17112110);
                                                f62084a = i17112111 % 128;
                                                int i17112112 = i17112111 % 2;
                                                int i17112113 = i1611113 + 37;
                                                f62084a = i17112113 % 128;
                                                int i17112114 = i17112113 % 2;
                                                i26 = 2;
                                            } else {
                                                if (cCharAt == '+') {
                                                    int i201210 = f62084a;
                                                    int i201211 = i201210 ^ 97;
                                                    int i2111111110 = (i201210 & 97) << 1;
                                                    int i2111111111 = (i201211 ^ i2111111110) + ((i201211 & i2111111110) << 1);
                                                    f62085b = i2111111111 % 128;
                                                    int i2111111112 = i2111111111 % 2;
                                                    int i2111111113 = ((i201210 & 31) - (~(i201210 | 31))) - 1;
                                                    f62085b = i2111111113 % 128;
                                                    i26 = 2;
                                                    int i2111111114 = i2111111113 % 2;
                                                } else if (cCharAt == '-') {
                                                    int i2111111115 = f62085b;
                                                    i24 = i2111111115 + 19;
                                                    f62084a = i24 % 128;
                                                    if (i24 % 2 != 0) {
                                                        i25 = 0;
                                                    } else {
                                                        i25 = 1;
                                                    }
                                                    int i2111111116 = ((i2111111115 & 19) - (~(i2111111115 | 19))) - 1;
                                                    f62084a = i2111111116 % 128;
                                                    int i2111111117 = i2111111116 % 2;
                                                    i23 = i25;
                                                    i22 = 1;
                                                } else {
                                                    int i2111111118 = f62085b;
                                                    int i2111111119 = (i2111111118 & 89) + (i2111111118 | 89);
                                                    f62084a = i2111111119 % 128;
                                                    int i2211110 = i2111111119 % 2;
                                                    i22 = 1;
                                                    i23 = 0;
                                                }
                                                if ((i23 ^ 1) != i22) {
                                                    int i181111111111112 = f62085b;
                                                    int i181111111111113 = i181111111111112 ^ 7;
                                                    int i181111111111114 = ((i181111111111112 & 7) | i181111111111113) << i22;
                                                    int i181111111111115 = -i181111111111113;
                                                    i32 = (i181111111111114 ^ i181111111111115) + ((i181111111111114 & i181111111111115) << i22);
                                                    f62084a = i32 % 128;
                                                    if (i32 % 2 != 0) {
                                                        i27 = 1;
                                                        i28 = 0;
                                                    } else {
                                                        i27 = 1;
                                                        i28 = 1;
                                                    }
                                                } else if (cCharAt == '.') {
                                                    int i181111111111116 = f62085b;
                                                    int i181111111111117 = (i181111111111116 & 119) + (i181111111111116 | 119);
                                                    f62084a = i181111111111117 % 128;
                                                    int i181111111111118 = i181111111111117 % 2;
                                                    int i181111111111119 = i181111111111116 + 56;
                                                    i27 = 1;
                                                    int i19111111111111110 = (i181111111111119 ^ (-1)) + (i181111111111119 << 1);
                                                    f62084a = i19111111111111110 % 128;
                                                    int i19111111111111111 = i19111111111111110 % 2;
                                                    i28 = 1;
                                                } else {
                                                    i27 = 1;
                                                    int i19111111111111112 = f62084a;
                                                    int i19111111111111113 = ((i19111111111111112 | 45) << 1) - (i19111111111111112 ^ 45);
                                                    f62085b = i19111111111111113 % 128;
                                                    int i19111111111111114 = i19111111111111113 % 2;
                                                    i28 = 0;
                                                }
                                                if ((i28 ^ 1) != i27) {
                                                    i29 = f62085b;
                                                    int i19111111111111115 = ((i29 & (-28)) | ((~i29) & 27)) + ((i29 & 27) << i27);
                                                    i30 = i19111111111111115 % 128;
                                                    f62084a = i30;
                                                    int i19111111111111116 = i19111111111111115 % 2;
                                                    if (cCharAt == ':') {
                                                        int i19111111111111117 = (-2) - ((-1) ^ (((i29 | 98) << i27) - (i29 ^ 98)));
                                                        int i19111111111111118 = i19111111111111117 % 128;
                                                        f62084a = i19111111111111118;
                                                        int i19111111111111119 = i19111111111111117 % 2;
                                                        int i2011111117 = (i19111111111111118 | 15) << 1;
                                                        int i2011111118 = -(i19111111111111118 ^ 15);
                                                        i31 = (i2011111117 ^ i2011111118) + ((i2011111118 & i2011111117) << 1);
                                                        f62085b = i31 % 128;
                                                        if (i31 % 2 == 0) {
                                                            int i2011111119 = 83 / 0;
                                                        }
                                                        return Integer.valueOf(i15);
                                                    }
                                                    int i20111111110 = (-2) - (((i30 & 118) + (i30 | 118)) ^ (-1));
                                                    f62085b = i20111111110 % 128;
                                                    int i20111111111 = i20111111110 % 2;
                                                }
                                            }
                                            int i1711111110 = f62084a + 89;
                                            int i1711111111 = i1711111110 % 128;
                                            f62085b = i1711111111;
                                            int i1711111112 = i1711111110 % i26;
                                            int i1711111113 = i1711111111 & 73;
                                            int i1711111114 = -(-((i1711111111 ^ 73) | i1711111113));
                                            int i181111212 = (i1711111113 & i1711111114) + (i1711111113 | i1711111114);
                                            f62084a = i181111212 % 128;
                                            int i181111213 = i181111212 % 2;
                                            i22 = 1;
                                            i23 = 1;
                                            if ((i23 ^ 1) != i22) {
                                                int i1811111111111110 = f62085b;
                                                int i1811111111111111 = i1811111111111110 ^ 7;
                                                int i1811111111111112 = ((i1811111111111110 & 7) | i1811111111111111) << i22;
                                                int i1811111111111113 = -i1811111111111111;
                                                i32 = (i1811111111111112 ^ i1811111111111113) + ((i1811111111111112 & i1811111111111113) << i22);
                                                f62084a = i32 % 128;
                                                if (i32 % 2 != 0) {
                                                    i27 = 1;
                                                    i28 = 0;
                                                } else {
                                                    i27 = 1;
                                                    i28 = 1;
                                                }
                                            } else if (cCharAt == '.') {
                                                int i1811111111111114 = f62085b;
                                                int i1811111111111115 = (i1811111111111114 & 119) + (i1811111111111114 | 119);
                                                f62084a = i1811111111111115 % 128;
                                                int i1811111111111116 = i1811111111111115 % 2;
                                                int i1811111111111117 = i1811111111111114 + 56;
                                                i27 = 1;
                                                int i191111111111111110 = (i1811111111111117 ^ (-1)) + (i1811111111111117 << 1);
                                                f62084a = i191111111111111110 % 128;
                                                int i191111111111111111 = i191111111111111110 % 2;
                                                i28 = 1;
                                            } else {
                                                i27 = 1;
                                                int i191111111111111112 = f62084a;
                                                int i191111111111111113 = ((i191111111111111112 | 45) << 1) - (i191111111111111112 ^ 45);
                                                f62085b = i191111111111111113 % 128;
                                                int i191111111111111114 = i191111111111111113 % 2;
                                                i28 = 0;
                                            }
                                            if ((i28 ^ 1) != i27) {
                                                i29 = f62085b;
                                                int i191111111111111115 = ((i29 & (-28)) | ((~i29) & 27)) + ((i29 & 27) << i27);
                                                i30 = i191111111111111115 % 128;
                                                f62084a = i30;
                                                int i191111111111111116 = i191111111111111115 % 2;
                                                if (cCharAt == ':') {
                                                    int i191111111111111117 = (-2) - ((-1) ^ (((i29 | 98) << i27) - (i29 ^ 98)));
                                                    int i191111111111111118 = i191111111111111117 % 128;
                                                    f62084a = i191111111111111118;
                                                    int i191111111111111119 = i191111111111111117 % 2;
                                                    int i20111111112 = (i191111111111111118 | 15) << 1;
                                                    int i20111111113 = -(i191111111111111118 ^ 15);
                                                    i31 = (i20111111112 ^ i20111111113) + ((i20111111113 & i20111111112) << 1);
                                                    f62085b = i31 % 128;
                                                    if (i31 % 2 == 0) {
                                                        int i20111111114 = 83 / 0;
                                                    }
                                                    return Integer.valueOf(i15);
                                                }
                                                int i20111111115 = (-2) - (((i30 & 118) + (i30 | 118)) ^ (-1));
                                                f62085b = i20111111115 % 128;
                                                int i20111111116 = i20111111115 % 2;
                                            }
                                        } else {
                                            i18 = 1;
                                            i19 = (i15 ^ 1) + ((i15 & 1) << 1);
                                            cCharAt = str3.charAt(i15);
                                            if ('a' <= cCharAt) {
                                                int i13111 = f62084a;
                                                int i141113 = i13111 & 35;
                                                int i141114 = ((i13111 ^ 35) | i141113) << i18;
                                                int i141115 = -((i13111 | 35) & (~i141113));
                                                int i141116 = (i141114 ^ i141115) + ((i141115 & i141114) << i18);
                                                i20 = i141116 % 128;
                                                f62085b = i20;
                                                int i141117 = i141116 % 2;
                                                if (cCharAt < '{') {
                                                    int i141118 = ((i20 ^ 31) | (i20 & 31)) << 1;
                                                    int i141119 = -(((~i20) & 31) | (i20 & (-32)));
                                                    i21 = (i141118 ^ i141119) + ((i141119 & i141118) << 1);
                                                    f62084a = i21 % 128;
                                                    if (i21 % 2 != 0) {
                                                        z10 = true;
                                                    }
                                                }
                                            }
                                            if (!z10) {
                                                if ('A' <= cCharAt) {
                                                    i35 = f62084a;
                                                    int i1411110 = (-2) - (((i35 ^ 24) + ((i35 & 24) << 1)) ^ (-1));
                                                    i36 = i1411110 % 128;
                                                    f62085b = i36;
                                                    int i1411111 = i1411110 % 2;
                                                    if (cCharAt < '[') {
                                                        int i1411112 = i36 ^ 91;
                                                        int i1511110 = ((i36 & 91) | i1411112) << 1;
                                                        int i1511111 = -i1411112;
                                                        int i1511112 = ((i1511110 | i1511111) << 1) - (i1511111 ^ i1511110);
                                                        f62084a = i1511112 % 128;
                                                        int i1511113 = i1511112 % 2;
                                                        int i1511114 = (((i36 & (-100)) | ((~i36) & 99)) - (~(-(-((i36 & 99) << 1))))) - 1;
                                                        f62084a = i1511114 % 128;
                                                        int i1511115 = i1511114 % 2;
                                                    } else {
                                                        int i1511116 = i35 + 85;
                                                        f62085b = i1511116 % 128;
                                                        int i1511117 = i1511116 % 2;
                                                    }
                                                }
                                                if ('0' <= cCharAt) {
                                                    i34 = f62084a;
                                                    int i1511118 = i34 & 9;
                                                    int i1511119 = (i34 ^ 9) | i1511118;
                                                    int i1611116 = (i1511118 & i1511119) + (i1511118 | i1511119);
                                                    f62085b = i1611116 % 128;
                                                    int i1611117 = i1611116 % 2;
                                                    if (cCharAt < ':') {
                                                        int i1611118 = i34 & 107;
                                                        int i1611119 = (((i34 ^ 107) | i1611118) << 1) - ((~i1611118) & (i34 | 107));
                                                        f62085b = i1611119 % 128;
                                                        int i16126 = i1611119 % 2;
                                                        int i16127 = (i34 ^ 57) + ((i34 & 57) << 1);
                                                        f62085b = i16127 % 128;
                                                        int i16128 = i16127 % 2;
                                                        int i16111110 = f62085b;
                                                        int i16111111 = i16111110 & 119;
                                                        int i16111112 = ((i16111110 ^ 119) | i16111111) << 1;
                                                        int i17112115 = -((~i16111111) & (i16111110 | 119));
                                                        int i17112116 = (i16111112 & i17112115) + (i16111112 | i17112115);
                                                        f62084a = i17112116 % 128;
                                                        int i17112117 = i17112116 % 2;
                                                        int i17112118 = i16111110 + 37;
                                                        f62084a = i17112118 % 128;
                                                        int i17112119 = i17112118 % 2;
                                                        i26 = 2;
                                                        int i1711111115 = f62084a + 89;
                                                        int i1711111116 = i1711111115 % 128;
                                                        f62085b = i1711111116;
                                                        int i1711111117 = i1711111115 % i26;
                                                        int i1711111118 = i1711111116 & 73;
                                                        int i1711111119 = -(-((i1711111116 ^ 73) | i1711111118));
                                                        int i181111214 = (i1711111118 & i1711111119) + (i1711111118 | i1711111119);
                                                        f62084a = i181111214 % 128;
                                                        int i181111215 = i181111214 % 2;
                                                        i22 = 1;
                                                        i23 = 1;
                                                        if ((i23 ^ 1) != i22) {
                                                            int i1811111111111118 = f62085b;
                                                            int i1811111111111119 = i1811111111111118 ^ 7;
                                                            int i18111111111111110 = ((i1811111111111118 & 7) | i1811111111111119) << i22;
                                                            int i18111111111111111 = -i1811111111111119;
                                                            i32 = (i18111111111111110 ^ i18111111111111111) + ((i18111111111111110 & i18111111111111111) << i22);
                                                            f62084a = i32 % 128;
                                                            if (i32 % 2 != 0) {
                                                                i27 = 1;
                                                                i28 = 0;
                                                            } else {
                                                                i27 = 1;
                                                                i28 = 1;
                                                            }
                                                        } else if (cCharAt == '.') {
                                                            int i18111111111111112 = f62085b;
                                                            int i18111111111111113 = (i18111111111111112 & 119) + (i18111111111111112 | 119);
                                                            f62084a = i18111111111111113 % 128;
                                                            int i18111111111111114 = i18111111111111113 % 2;
                                                            int i18111111111111115 = i18111111111111112 + 56;
                                                            i27 = 1;
                                                            int i1911111111111111110 = (i18111111111111115 ^ (-1)) + (i18111111111111115 << 1);
                                                            f62084a = i1911111111111111110 % 128;
                                                            int i1911111111111111111 = i1911111111111111110 % 2;
                                                            i28 = 1;
                                                        } else {
                                                            i27 = 1;
                                                            int i1911111111111111112 = f62084a;
                                                            int i1911111111111111113 = ((i1911111111111111112 | 45) << 1) - (i1911111111111111112 ^ 45);
                                                            f62085b = i1911111111111111113 % 128;
                                                            int i1911111111111111114 = i1911111111111111113 % 2;
                                                            i28 = 0;
                                                        }
                                                        if ((i28 ^ 1) != i27) {
                                                            i29 = f62085b;
                                                            int i1911111111111111115 = ((i29 & (-28)) | ((~i29) & 27)) + ((i29 & 27) << i27);
                                                            i30 = i1911111111111111115 % 128;
                                                            f62084a = i30;
                                                            int i1911111111111111116 = i1911111111111111115 % 2;
                                                            if (cCharAt == ':') {
                                                                int i1911111111111111117 = (-2) - ((-1) ^ (((i29 | 98) << i27) - (i29 ^ 98)));
                                                                int i1911111111111111118 = i1911111111111111117 % 128;
                                                                f62084a = i1911111111111111118;
                                                                int i1911111111111111119 = i1911111111111111117 % 2;
                                                                int i20111111117 = (i1911111111111111118 | 15) << 1;
                                                                int i20111111118 = -(i1911111111111111118 ^ 15);
                                                                i31 = (i20111111117 ^ i20111111118) + ((i20111111118 & i20111111117) << 1);
                                                                f62085b = i31 % 128;
                                                                if (i31 % 2 == 0) {
                                                                    int i20111111119 = 83 / 0;
                                                                }
                                                                return Integer.valueOf(i15);
                                                            }
                                                            int i201111111110 = (-2) - (((i30 & 118) + (i30 | 118)) ^ (-1));
                                                            f62085b = i201111111110 % 128;
                                                            int i201111111111 = i201111111110 % 2;
                                                        }
                                                    } else {
                                                        int i2029 = i34 & 113;
                                                        int i20210 = (((i34 ^ 113) | i2029) << 1) - ((i34 | 113) & (~i2029));
                                                        f62085b = i20210 % 128;
                                                        int i20211 = i20210 % 2;
                                                    }
                                                }
                                                if (cCharAt == '+') {
                                                    int i201212 = f62084a;
                                                    int i201213 = i201212 ^ 97;
                                                    int i21111111110 = (i201212 & 97) << 1;
                                                    int i21111111111 = (i201213 ^ i21111111110) + ((i201213 & i21111111110) << 1);
                                                    f62085b = i21111111111 % 128;
                                                    int i21111111112 = i21111111111 % 2;
                                                    int i21111111113 = ((i201212 & 31) - (~(i201212 | 31))) - 1;
                                                    f62085b = i21111111113 % 128;
                                                    i26 = 2;
                                                    int i21111111114 = i21111111113 % 2;
                                                    int i17111111110 = f62084a + 89;
                                                    int i17111111111 = i17111111110 % 128;
                                                    f62085b = i17111111111;
                                                    int i17111111112 = i17111111110 % i26;
                                                    int i17111111113 = i17111111111 & 73;
                                                    int i17111111114 = -(-((i17111111111 ^ 73) | i17111111113));
                                                    int i181111216 = (i17111111113 & i17111111114) + (i17111111113 | i17111111114);
                                                    f62084a = i181111216 % 128;
                                                    int i181111217 = i181111216 % 2;
                                                    i22 = 1;
                                                    i23 = 1;
                                                } else if (cCharAt == '-') {
                                                    int i21111111115 = f62085b;
                                                    i24 = i21111111115 + 19;
                                                    f62084a = i24 % 128;
                                                    if (i24 % 2 != 0) {
                                                        i25 = 0;
                                                    } else {
                                                        i25 = 1;
                                                    }
                                                    int i21111111116 = ((i21111111115 & 19) - (~(i21111111115 | 19))) - 1;
                                                    f62084a = i21111111116 % 128;
                                                    int i21111111117 = i21111111116 % 2;
                                                    i23 = i25;
                                                    i22 = 1;
                                                } else {
                                                    int i21111111118 = f62085b;
                                                    int i21111111119 = (i21111111118 & 89) + (i21111111118 | 89);
                                                    f62084a = i21111111119 % 128;
                                                    int i2211111 = i21111111119 % 2;
                                                    i22 = 1;
                                                    i23 = 0;
                                                }
                                                if ((i23 ^ 1) != i22) {
                                                    int i18111111111111116 = f62085b;
                                                    int i18111111111111117 = i18111111111111116 ^ 7;
                                                    int i18111111111111118 = ((i18111111111111116 & 7) | i18111111111111117) << i22;
                                                    int i18111111111111119 = -i18111111111111117;
                                                    i32 = (i18111111111111118 ^ i18111111111111119) + ((i18111111111111118 & i18111111111111119) << i22);
                                                    f62084a = i32 % 128;
                                                    if (i32 % 2 != 0) {
                                                        i27 = 1;
                                                        i28 = 0;
                                                    } else {
                                                        i27 = 1;
                                                        i28 = 1;
                                                    }
                                                } else if (cCharAt == '.') {
                                                    int i181111111111111110 = f62085b;
                                                    int i181111111111111111 = (i181111111111111110 & 119) + (i181111111111111110 | 119);
                                                    f62084a = i181111111111111111 % 128;
                                                    int i181111111111111112 = i181111111111111111 % 2;
                                                    int i181111111111111113 = i181111111111111110 + 56;
                                                    i27 = 1;
                                                    int i19111111111111111110 = (i181111111111111113 ^ (-1)) + (i181111111111111113 << 1);
                                                    f62084a = i19111111111111111110 % 128;
                                                    int i19111111111111111111 = i19111111111111111110 % 2;
                                                    i28 = 1;
                                                } else {
                                                    i27 = 1;
                                                    int i19111111111111111112 = f62084a;
                                                    int i19111111111111111113 = ((i19111111111111111112 | 45) << 1) - (i19111111111111111112 ^ 45);
                                                    f62085b = i19111111111111111113 % 128;
                                                    int i19111111111111111114 = i19111111111111111113 % 2;
                                                    i28 = 0;
                                                }
                                                if ((i28 ^ 1) != i27) {
                                                    i29 = f62085b;
                                                    int i19111111111111111115 = ((i29 & (-28)) | ((~i29) & 27)) + ((i29 & 27) << i27);
                                                    i30 = i19111111111111111115 % 128;
                                                    f62084a = i30;
                                                    int i19111111111111111116 = i19111111111111111115 % 2;
                                                    if (cCharAt == ':') {
                                                        int i19111111111111111117 = (-2) - ((-1) ^ (((i29 | 98) << i27) - (i29 ^ 98)));
                                                        int i19111111111111111118 = i19111111111111111117 % 128;
                                                        f62084a = i19111111111111111118;
                                                        int i19111111111111111119 = i19111111111111111117 % 2;
                                                        int i201111111112 = (i19111111111111111118 | 15) << 1;
                                                        int i201111111113 = -(i19111111111111111118 ^ 15);
                                                        i31 = (i201111111112 ^ i201111111113) + ((i201111111113 & i201111111112) << 1);
                                                        f62085b = i31 % 128;
                                                        if (i31 % 2 == 0) {
                                                            int i201111111114 = 83 / 0;
                                                        }
                                                        return Integer.valueOf(i15);
                                                    }
                                                    int i201111111115 = (-2) - (((i30 & 118) + (i30 | 118)) ^ (-1));
                                                    f62085b = i201111111115 % 128;
                                                    int i201111111116 = i201111111115 % 2;
                                                }
                                            } else {
                                                int i2211112 = f62085b;
                                                int i2211113 = i2211112 & 101;
                                                int i2211114 = i2211112 | 101;
                                                int i2211115 = (i2211113 & i2211114) + (i2211114 | i2211113);
                                                int i2211116 = i2211115 % 128;
                                                f62084a = i2211116;
                                                int i2211117 = i2211115 % 2;
                                                int i2211118 = i2211116 & 33;
                                                int i2211119 = i2211118 + ((i2211116 ^ 33) | i2211118);
                                                f62085b = i2211119 % 128;
                                                int i2223 = i2211119 % 2;
                                            }
                                            int i2316 = f62085b;
                                            int i2317 = ~i2316;
                                            i33 = (((i2316 | 117) << 1) - (~(-((i2316 & (-118)) | (i2317 & 117))))) - 1;
                                            f62084a = i33 % 128;
                                            if (i33 % 2 != 0) {
                                                z11 = false;
                                            } else {
                                                z11 = true;
                                            }
                                            int i2318 = (((i2317 & 73) | (i2316 & (-74))) - (~(-(-((i2316 & 73) << 1))))) - 1;
                                            f62084a = i2318 % 128;
                                            int i2319 = i2318 % 2;
                                            if (z11) {
                                                int i16111113 = f62085b;
                                                int i16111114 = i16111113 & 119;
                                                int i16111115 = ((i16111113 ^ 119) | i16111114) << 1;
                                                int i171121110 = -((~i16111114) & (i16111113 | 119));
                                                int i171121111 = (i16111115 & i171121110) + (i16111115 | i171121110);
                                                f62084a = i171121111 % 128;
                                                int i171121112 = i171121111 % 2;
                                                int i171121113 = i16111113 + 37;
                                                f62084a = i171121113 % 128;
                                                int i171121114 = i171121113 % 2;
                                                i26 = 2;
                                            } else {
                                                if (cCharAt == '+') {
                                                    int i201214 = f62084a;
                                                    int i201215 = i201214 ^ 97;
                                                    int i211111111110 = (i201214 & 97) << 1;
                                                    int i211111111111 = (i201215 ^ i211111111110) + ((i201215 & i211111111110) << 1);
                                                    f62085b = i211111111111 % 128;
                                                    int i211111111112 = i211111111111 % 2;
                                                    int i211111111113 = ((i201214 & 31) - (~(i201214 | 31))) - 1;
                                                    f62085b = i211111111113 % 128;
                                                    i26 = 2;
                                                    int i211111111114 = i211111111113 % 2;
                                                } else if (cCharAt == '-') {
                                                    int i211111111115 = f62085b;
                                                    i24 = i211111111115 + 19;
                                                    f62084a = i24 % 128;
                                                    if (i24 % 2 != 0) {
                                                        i25 = 0;
                                                    } else {
                                                        i25 = 1;
                                                    }
                                                    int i211111111116 = ((i211111111115 & 19) - (~(i211111111115 | 19))) - 1;
                                                    f62084a = i211111111116 % 128;
                                                    int i211111111117 = i211111111116 % 2;
                                                    i23 = i25;
                                                    i22 = 1;
                                                } else {
                                                    int i211111111118 = f62085b;
                                                    int i211111111119 = (i211111111118 & 89) + (i211111111118 | 89);
                                                    f62084a = i211111111119 % 128;
                                                    int i22111110 = i211111111119 % 2;
                                                    i22 = 1;
                                                    i23 = 0;
                                                }
                                                if ((i23 ^ 1) != i22) {
                                                    int i181111111111111114 = f62085b;
                                                    int i181111111111111115 = i181111111111111114 ^ 7;
                                                    int i181111111111111116 = ((i181111111111111114 & 7) | i181111111111111115) << i22;
                                                    int i181111111111111117 = -i181111111111111115;
                                                    i32 = (i181111111111111116 ^ i181111111111111117) + ((i181111111111111116 & i181111111111111117) << i22);
                                                    f62084a = i32 % 128;
                                                    if (i32 % 2 != 0) {
                                                        i27 = 1;
                                                        i28 = 0;
                                                    } else {
                                                        i27 = 1;
                                                        i28 = 1;
                                                    }
                                                } else if (cCharAt == '.') {
                                                    int i181111111111111118 = f62085b;
                                                    int i181111111111111119 = (i181111111111111118 & 119) + (i181111111111111118 | 119);
                                                    f62084a = i181111111111111119 % 128;
                                                    int i1811111111111111110 = i181111111111111119 % 2;
                                                    int i1811111111111111111 = i181111111111111118 + 56;
                                                    i27 = 1;
                                                    int i191111111111111111110 = (i1811111111111111111 ^ (-1)) + (i1811111111111111111 << 1);
                                                    f62084a = i191111111111111111110 % 128;
                                                    int i191111111111111111111 = i191111111111111111110 % 2;
                                                    i28 = 1;
                                                } else {
                                                    i27 = 1;
                                                    int i191111111111111111112 = f62084a;
                                                    int i191111111111111111113 = ((i191111111111111111112 | 45) << 1) - (i191111111111111111112 ^ 45);
                                                    f62085b = i191111111111111111113 % 128;
                                                    int i191111111111111111114 = i191111111111111111113 % 2;
                                                    i28 = 0;
                                                }
                                                if ((i28 ^ 1) != i27) {
                                                    i29 = f62085b;
                                                    int i191111111111111111115 = ((i29 & (-28)) | ((~i29) & 27)) + ((i29 & 27) << i27);
                                                    i30 = i191111111111111111115 % 128;
                                                    f62084a = i30;
                                                    int i191111111111111111116 = i191111111111111111115 % 2;
                                                    if (cCharAt == ':') {
                                                        int i191111111111111111117 = (-2) - ((-1) ^ (((i29 | 98) << i27) - (i29 ^ 98)));
                                                        int i191111111111111111118 = i191111111111111111117 % 128;
                                                        f62084a = i191111111111111111118;
                                                        int i191111111111111111119 = i191111111111111111117 % 2;
                                                        int i201111111117 = (i191111111111111111118 | 15) << 1;
                                                        int i201111111118 = -(i191111111111111111118 ^ 15);
                                                        i31 = (i201111111117 ^ i201111111118) + ((i201111111118 & i201111111117) << 1);
                                                        f62085b = i31 % 128;
                                                        if (i31 % 2 == 0) {
                                                            int i201111111119 = 83 / 0;
                                                        }
                                                        return Integer.valueOf(i15);
                                                    }
                                                    int i2011111111110 = (-2) - (((i30 & 118) + (i30 | 118)) ^ (-1));
                                                    f62085b = i2011111111110 % 128;
                                                    int i2011111111111 = i2011111111110 % 2;
                                                }
                                            }
                                            int i17111111115 = f62084a + 89;
                                            int i17111111116 = i17111111115 % 128;
                                            f62085b = i17111111116;
                                            int i17111111117 = i17111111115 % i26;
                                            int i17111111118 = i17111111116 & 73;
                                            int i17111111119 = -(-((i17111111116 ^ 73) | i17111111118));
                                            int i181111218 = (i17111111118 & i17111111119) + (i17111111118 | i17111111119);
                                            f62084a = i181111218 % 128;
                                            int i181111219 = i181111218 % 2;
                                            i22 = 1;
                                            i23 = 1;
                                            if ((i23 ^ 1) != i22) {
                                                int i1811111111111111112 = f62085b;
                                                int i1811111111111111113 = i1811111111111111112 ^ 7;
                                                int i1811111111111111114 = ((i1811111111111111112 & 7) | i1811111111111111113) << i22;
                                                int i1811111111111111115 = -i1811111111111111113;
                                                i32 = (i1811111111111111114 ^ i1811111111111111115) + ((i1811111111111111114 & i1811111111111111115) << i22);
                                                f62084a = i32 % 128;
                                                if (i32 % 2 != 0) {
                                                    i27 = 1;
                                                    i28 = 0;
                                                } else {
                                                    i27 = 1;
                                                    i28 = 1;
                                                }
                                            } else if (cCharAt == '.') {
                                                int i1811111111111111116 = f62085b;
                                                int i1811111111111111117 = (i1811111111111111116 & 119) + (i1811111111111111116 | 119);
                                                f62084a = i1811111111111111117 % 128;
                                                int i1811111111111111118 = i1811111111111111117 % 2;
                                                int i1811111111111111119 = i1811111111111111116 + 56;
                                                i27 = 1;
                                                int i1911111111111111111110 = (i1811111111111111119 ^ (-1)) + (i1811111111111111119 << 1);
                                                f62084a = i1911111111111111111110 % 128;
                                                int i1911111111111111111111 = i1911111111111111111110 % 2;
                                                i28 = 1;
                                            } else {
                                                i27 = 1;
                                                int i1911111111111111111112 = f62084a;
                                                int i1911111111111111111113 = ((i1911111111111111111112 | 45) << 1) - (i1911111111111111111112 ^ 45);
                                                f62085b = i1911111111111111111113 % 128;
                                                int i1911111111111111111114 = i1911111111111111111113 % 2;
                                                i28 = 0;
                                            }
                                            if ((i28 ^ 1) != i27) {
                                                i29 = f62085b;
                                                int i1911111111111111111115 = ((i29 & (-28)) | ((~i29) & 27)) + ((i29 & 27) << i27);
                                                i30 = i1911111111111111111115 % 128;
                                                f62084a = i30;
                                                int i1911111111111111111116 = i1911111111111111111115 % 2;
                                                if (cCharAt == ':') {
                                                    int i1911111111111111111117 = (-2) - ((-1) ^ (((i29 | 98) << i27) - (i29 ^ 98)));
                                                    int i1911111111111111111118 = i1911111111111111111117 % 128;
                                                    f62084a = i1911111111111111111118;
                                                    int i1911111111111111111119 = i1911111111111111111117 % 2;
                                                    int i2011111111112 = (i1911111111111111111118 | 15) << 1;
                                                    int i2011111111113 = -(i1911111111111111111118 ^ 15);
                                                    i31 = (i2011111111112 ^ i2011111111113) + ((i2011111111113 & i2011111111112) << 1);
                                                    f62085b = i31 % 128;
                                                    if (i31 % 2 == 0) {
                                                        int i2011111111114 = 83 / 0;
                                                    }
                                                    return Integer.valueOf(i15);
                                                }
                                                int i2011111111115 = (-2) - (((i30 & 118) + (i30 | 118)) ^ (-1));
                                                f62085b = i2011111111115 % 128;
                                                int i2011111111116 = i2011111111115 % 2;
                                            }
                                        }
                                        z10 = false;
                                        if (!z10) {
                                            if ('A' <= cCharAt) {
                                                i35 = f62084a;
                                                int i1411113 = (-2) - (((i35 ^ 24) + ((i35 & 24) << 1)) ^ (-1));
                                                i36 = i1411113 % 128;
                                                f62085b = i36;
                                                int i1411114 = i1411113 % 2;
                                                if (cCharAt < '[') {
                                                    int i1411115 = i36 ^ 91;
                                                    int i15111110 = ((i36 & 91) | i1411115) << 1;
                                                    int i15111111 = -i1411115;
                                                    int i15111112 = ((i15111110 | i15111111) << 1) - (i15111111 ^ i15111110);
                                                    f62084a = i15111112 % 128;
                                                    int i15111113 = i15111112 % 2;
                                                    int i15111114 = (((i36 & (-100)) | ((~i36) & 99)) - (~(-(-((i36 & 99) << 1))))) - 1;
                                                    f62084a = i15111114 % 128;
                                                    int i15111115 = i15111114 % 2;
                                                } else {
                                                    int i15111116 = i35 + 85;
                                                    f62085b = i15111116 % 128;
                                                    int i15111117 = i15111116 % 2;
                                                }
                                            }
                                            if ('0' <= cCharAt) {
                                                i34 = f62084a;
                                                int i15111118 = i34 & 9;
                                                int i15111119 = (i34 ^ 9) | i15111118;
                                                int i16111116 = (i15111118 & i15111119) + (i15111118 | i15111119);
                                                f62085b = i16111116 % 128;
                                                int i16111117 = i16111116 % 2;
                                                if (cCharAt < ':') {
                                                    int i16111118 = i34 & 107;
                                                    int i16111119 = (((i34 ^ 107) | i16111118) << 1) - ((~i16111118) & (i34 | 107));
                                                    f62085b = i16111119 % 128;
                                                    int i16129 = i16111119 % 2;
                                                    int i161210 = (i34 ^ 57) + ((i34 & 57) << 1);
                                                    f62085b = i161210 % 128;
                                                    int i161211 = i161210 % 2;
                                                    int i161111110 = f62085b;
                                                    int i161111111 = i161111110 & 119;
                                                    int i161111112 = ((i161111110 ^ 119) | i161111111) << 1;
                                                    int i171121115 = -((~i161111111) & (i161111110 | 119));
                                                    int i171121116 = (i161111112 & i171121115) + (i161111112 | i171121115);
                                                    f62084a = i171121116 % 128;
                                                    int i171121117 = i171121116 % 2;
                                                    int i171121118 = i161111110 + 37;
                                                    f62084a = i171121118 % 128;
                                                    int i171121119 = i171121118 % 2;
                                                    i26 = 2;
                                                    int i171111111110 = f62084a + 89;
                                                    int i171111111111 = i171111111110 % 128;
                                                    f62085b = i171111111111;
                                                    int i171111111112 = i171111111110 % i26;
                                                    int i171111111113 = i171111111111 & 73;
                                                    int i171111111114 = -(-((i171111111111 ^ 73) | i171111111113));
                                                    int i1811112110 = (i171111111113 & i171111111114) + (i171111111113 | i171111111114);
                                                    f62084a = i1811112110 % 128;
                                                    int i1811112111 = i1811112110 % 2;
                                                    i22 = 1;
                                                    i23 = 1;
                                                    if ((i23 ^ 1) != i22) {
                                                        int i18111111111111111110 = f62085b;
                                                        int i18111111111111111111 = i18111111111111111110 ^ 7;
                                                        int i18111111111111111112 = ((i18111111111111111110 & 7) | i18111111111111111111) << i22;
                                                        int i18111111111111111113 = -i18111111111111111111;
                                                        i32 = (i18111111111111111112 ^ i18111111111111111113) + ((i18111111111111111112 & i18111111111111111113) << i22);
                                                        f62084a = i32 % 128;
                                                        if (i32 % 2 != 0) {
                                                            i27 = 1;
                                                            i28 = 0;
                                                        } else {
                                                            i27 = 1;
                                                            i28 = 1;
                                                        }
                                                    } else if (cCharAt == '.') {
                                                        int i18111111111111111114 = f62085b;
                                                        int i18111111111111111115 = (i18111111111111111114 & 119) + (i18111111111111111114 | 119);
                                                        f62084a = i18111111111111111115 % 128;
                                                        int i18111111111111111116 = i18111111111111111115 % 2;
                                                        int i18111111111111111117 = i18111111111111111114 + 56;
                                                        i27 = 1;
                                                        int i19111111111111111111110 = (i18111111111111111117 ^ (-1)) + (i18111111111111111117 << 1);
                                                        f62084a = i19111111111111111111110 % 128;
                                                        int i19111111111111111111111 = i19111111111111111111110 % 2;
                                                        i28 = 1;
                                                    } else {
                                                        i27 = 1;
                                                        int i19111111111111111111112 = f62084a;
                                                        int i19111111111111111111113 = ((i19111111111111111111112 | 45) << 1) - (i19111111111111111111112 ^ 45);
                                                        f62085b = i19111111111111111111113 % 128;
                                                        int i19111111111111111111114 = i19111111111111111111113 % 2;
                                                        i28 = 0;
                                                    }
                                                    if ((i28 ^ 1) != i27) {
                                                        i29 = f62085b;
                                                        int i19111111111111111111115 = ((i29 & (-28)) | ((~i29) & 27)) + ((i29 & 27) << i27);
                                                        i30 = i19111111111111111111115 % 128;
                                                        f62084a = i30;
                                                        int i19111111111111111111116 = i19111111111111111111115 % 2;
                                                        if (cCharAt == ':') {
                                                            int i19111111111111111111117 = (-2) - ((-1) ^ (((i29 | 98) << i27) - (i29 ^ 98)));
                                                            int i19111111111111111111118 = i19111111111111111111117 % 128;
                                                            f62084a = i19111111111111111111118;
                                                            int i19111111111111111111119 = i19111111111111111111117 % 2;
                                                            int i2011111111117 = (i19111111111111111111118 | 15) << 1;
                                                            int i2011111111118 = -(i19111111111111111111118 ^ 15);
                                                            i31 = (i2011111111117 ^ i2011111111118) + ((i2011111111118 & i2011111111117) << 1);
                                                            f62085b = i31 % 128;
                                                            if (i31 % 2 == 0) {
                                                                int i2011111111119 = 83 / 0;
                                                            }
                                                            return Integer.valueOf(i15);
                                                        }
                                                        int i20111111111110 = (-2) - (((i30 & 118) + (i30 | 118)) ^ (-1));
                                                        f62085b = i20111111111110 % 128;
                                                        int i20111111111111 = i20111111111110 % 2;
                                                    }
                                                } else {
                                                    int i20212 = i34 & 113;
                                                    int i20213 = (((i34 ^ 113) | i20212) << 1) - ((i34 | 113) & (~i20212));
                                                    f62085b = i20213 % 128;
                                                    int i20214 = i20213 % 2;
                                                }
                                            }
                                            if (cCharAt == '+') {
                                                int i201216 = f62084a;
                                                int i201217 = i201216 ^ 97;
                                                int i2111111111110 = (i201216 & 97) << 1;
                                                int i2111111111111 = (i201217 ^ i2111111111110) + ((i201217 & i2111111111110) << 1);
                                                f62085b = i2111111111111 % 128;
                                                int i2111111111112 = i2111111111111 % 2;
                                                int i2111111111113 = ((i201216 & 31) - (~(i201216 | 31))) - 1;
                                                f62085b = i2111111111113 % 128;
                                                i26 = 2;
                                                int i2111111111114 = i2111111111113 % 2;
                                                int i171111111115 = f62084a + 89;
                                                int i171111111116 = i171111111115 % 128;
                                                f62085b = i171111111116;
                                                int i171111111117 = i171111111115 % i26;
                                                int i171111111118 = i171111111116 & 73;
                                                int i171111111119 = -(-((i171111111116 ^ 73) | i171111111118));
                                                int i1811112112 = (i171111111118 & i171111111119) + (i171111111118 | i171111111119);
                                                f62084a = i1811112112 % 128;
                                                int i1811112113 = i1811112112 % 2;
                                                i22 = 1;
                                                i23 = 1;
                                            } else if (cCharAt == '-') {
                                                int i2111111111115 = f62085b;
                                                i24 = i2111111111115 + 19;
                                                f62084a = i24 % 128;
                                                if (i24 % 2 != 0) {
                                                    i25 = 0;
                                                } else {
                                                    i25 = 1;
                                                }
                                                int i2111111111116 = ((i2111111111115 & 19) - (~(i2111111111115 | 19))) - 1;
                                                f62084a = i2111111111116 % 128;
                                                int i2111111111117 = i2111111111116 % 2;
                                                i23 = i25;
                                                i22 = 1;
                                            } else {
                                                int i2111111111118 = f62085b;
                                                int i2111111111119 = (i2111111111118 & 89) + (i2111111111118 | 89);
                                                f62084a = i2111111111119 % 128;
                                                int i22111111 = i2111111111119 % 2;
                                                i22 = 1;
                                                i23 = 0;
                                            }
                                            if ((i23 ^ 1) != i22) {
                                                int i18111111111111111118 = f62085b;
                                                int i18111111111111111119 = i18111111111111111118 ^ 7;
                                                int i181111111111111111110 = ((i18111111111111111118 & 7) | i18111111111111111119) << i22;
                                                int i181111111111111111111 = -i18111111111111111119;
                                                i32 = (i181111111111111111110 ^ i181111111111111111111) + ((i181111111111111111110 & i181111111111111111111) << i22);
                                                f62084a = i32 % 128;
                                                if (i32 % 2 != 0) {
                                                    i27 = 1;
                                                    i28 = 0;
                                                } else {
                                                    i27 = 1;
                                                    i28 = 1;
                                                }
                                            } else if (cCharAt == '.') {
                                                int i181111111111111111112 = f62085b;
                                                int i181111111111111111113 = (i181111111111111111112 & 119) + (i181111111111111111112 | 119);
                                                f62084a = i181111111111111111113 % 128;
                                                int i181111111111111111114 = i181111111111111111113 % 2;
                                                int i181111111111111111115 = i181111111111111111112 + 56;
                                                i27 = 1;
                                                int i191111111111111111111110 = (i181111111111111111115 ^ (-1)) + (i181111111111111111115 << 1);
                                                f62084a = i191111111111111111111110 % 128;
                                                int i191111111111111111111111 = i191111111111111111111110 % 2;
                                                i28 = 1;
                                            } else {
                                                i27 = 1;
                                                int i191111111111111111111112 = f62084a;
                                                int i191111111111111111111113 = ((i191111111111111111111112 | 45) << 1) - (i191111111111111111111112 ^ 45);
                                                f62085b = i191111111111111111111113 % 128;
                                                int i191111111111111111111114 = i191111111111111111111113 % 2;
                                                i28 = 0;
                                            }
                                            if ((i28 ^ 1) != i27) {
                                                i29 = f62085b;
                                                int i191111111111111111111115 = ((i29 & (-28)) | ((~i29) & 27)) + ((i29 & 27) << i27);
                                                i30 = i191111111111111111111115 % 128;
                                                f62084a = i30;
                                                int i191111111111111111111116 = i191111111111111111111115 % 2;
                                                if (cCharAt == ':') {
                                                    int i191111111111111111111117 = (-2) - ((-1) ^ (((i29 | 98) << i27) - (i29 ^ 98)));
                                                    int i191111111111111111111118 = i191111111111111111111117 % 128;
                                                    f62084a = i191111111111111111111118;
                                                    int i191111111111111111111119 = i191111111111111111111117 % 2;
                                                    int i20111111111112 = (i191111111111111111111118 | 15) << 1;
                                                    int i20111111111113 = -(i191111111111111111111118 ^ 15);
                                                    i31 = (i20111111111112 ^ i20111111111113) + ((i20111111111113 & i20111111111112) << 1);
                                                    f62085b = i31 % 128;
                                                    if (i31 % 2 == 0) {
                                                        int i20111111111114 = 83 / 0;
                                                    }
                                                    return Integer.valueOf(i15);
                                                }
                                                int i20111111111115 = (-2) - (((i30 & 118) + (i30 | 118)) ^ (-1));
                                                f62085b = i20111111111115 % 128;
                                                int i20111111111116 = i20111111111115 % 2;
                                            }
                                        } else {
                                            int i22111112 = f62085b;
                                            int i22111113 = i22111112 & 101;
                                            int i22111114 = i22111112 | 101;
                                            int i22111115 = (i22111113 & i22111114) + (i22111114 | i22111113);
                                            int i22111116 = i22111115 % 128;
                                            f62084a = i22111116;
                                            int i22111117 = i22111115 % 2;
                                            int i22111118 = i22111116 & 33;
                                            int i22111119 = i22111118 + ((i22111116 ^ 33) | i22111118);
                                            f62085b = i22111119 % 128;
                                            int i2224 = i22111119 % 2;
                                        }
                                        int i23110 = f62085b;
                                        int i23111 = ~i23110;
                                        i33 = (((i23110 | 117) << 1) - (~(-((i23110 & (-118)) | (i23111 & 117))))) - 1;
                                        f62084a = i33 % 128;
                                        if (i33 % 2 != 0) {
                                            z11 = false;
                                        } else {
                                            z11 = true;
                                        }
                                        int i23112 = (((i23111 & 73) | (i23110 & (-74))) - (~(-(-((i23110 & 73) << 1))))) - 1;
                                        f62084a = i23112 % 128;
                                        int i23113 = i23112 % 2;
                                        if (z11) {
                                            int i161111113 = f62085b;
                                            int i161111114 = i161111113 & 119;
                                            int i161111115 = ((i161111113 ^ 119) | i161111114) << 1;
                                            int i1711211110 = -((~i161111114) & (i161111113 | 119));
                                            int i1711211111 = (i161111115 & i1711211110) + (i161111115 | i1711211110);
                                            f62084a = i1711211111 % 128;
                                            int i1711211112 = i1711211111 % 2;
                                            int i1711211113 = i161111113 + 37;
                                            f62084a = i1711211113 % 128;
                                            int i1711211114 = i1711211113 % 2;
                                            i26 = 2;
                                        } else {
                                            if (cCharAt == '+') {
                                                int i201218 = f62084a;
                                                int i201219 = i201218 ^ 97;
                                                int i21111111111110 = (i201218 & 97) << 1;
                                                int i21111111111111 = (i201219 ^ i21111111111110) + ((i201219 & i21111111111110) << 1);
                                                f62085b = i21111111111111 % 128;
                                                int i21111111111112 = i21111111111111 % 2;
                                                int i21111111111113 = ((i201218 & 31) - (~(i201218 | 31))) - 1;
                                                f62085b = i21111111111113 % 128;
                                                i26 = 2;
                                                int i21111111111114 = i21111111111113 % 2;
                                            } else if (cCharAt == '-') {
                                                int i21111111111115 = f62085b;
                                                i24 = i21111111111115 + 19;
                                                f62084a = i24 % 128;
                                                if (i24 % 2 != 0) {
                                                    i25 = 0;
                                                } else {
                                                    i25 = 1;
                                                }
                                                int i21111111111116 = ((i21111111111115 & 19) - (~(i21111111111115 | 19))) - 1;
                                                f62084a = i21111111111116 % 128;
                                                int i21111111111117 = i21111111111116 % 2;
                                                i23 = i25;
                                                i22 = 1;
                                            } else {
                                                int i21111111111118 = f62085b;
                                                int i21111111111119 = (i21111111111118 & 89) + (i21111111111118 | 89);
                                                f62084a = i21111111111119 % 128;
                                                int i221111110 = i21111111111119 % 2;
                                                i22 = 1;
                                                i23 = 0;
                                            }
                                            if ((i23 ^ 1) != i22) {
                                                int i181111111111111111116 = f62085b;
                                                int i181111111111111111117 = i181111111111111111116 ^ 7;
                                                int i181111111111111111118 = ((i181111111111111111116 & 7) | i181111111111111111117) << i22;
                                                int i181111111111111111119 = -i181111111111111111117;
                                                i32 = (i181111111111111111118 ^ i181111111111111111119) + ((i181111111111111111118 & i181111111111111111119) << i22);
                                                f62084a = i32 % 128;
                                                if (i32 % 2 != 0) {
                                                    i27 = 1;
                                                    i28 = 0;
                                                } else {
                                                    i27 = 1;
                                                    i28 = 1;
                                                }
                                            } else if (cCharAt == '.') {
                                                int i1811111111111111111110 = f62085b;
                                                int i1811111111111111111111 = (i1811111111111111111110 & 119) + (i1811111111111111111110 | 119);
                                                f62084a = i1811111111111111111111 % 128;
                                                int i1811111111111111111112 = i1811111111111111111111 % 2;
                                                int i1811111111111111111113 = i1811111111111111111110 + 56;
                                                i27 = 1;
                                                int i1911111111111111111111110 = (i1811111111111111111113 ^ (-1)) + (i1811111111111111111113 << 1);
                                                f62084a = i1911111111111111111111110 % 128;
                                                int i1911111111111111111111111 = i1911111111111111111111110 % 2;
                                                i28 = 1;
                                            } else {
                                                i27 = 1;
                                                int i1911111111111111111111112 = f62084a;
                                                int i1911111111111111111111113 = ((i1911111111111111111111112 | 45) << 1) - (i1911111111111111111111112 ^ 45);
                                                f62085b = i1911111111111111111111113 % 128;
                                                int i1911111111111111111111114 = i1911111111111111111111113 % 2;
                                                i28 = 0;
                                            }
                                            if ((i28 ^ 1) != i27) {
                                                i29 = f62085b;
                                                int i1911111111111111111111115 = ((i29 & (-28)) | ((~i29) & 27)) + ((i29 & 27) << i27);
                                                i30 = i1911111111111111111111115 % 128;
                                                f62084a = i30;
                                                int i1911111111111111111111116 = i1911111111111111111111115 % 2;
                                                if (cCharAt == ':') {
                                                    int i1911111111111111111111117 = (-2) - ((-1) ^ (((i29 | 98) << i27) - (i29 ^ 98)));
                                                    int i1911111111111111111111118 = i1911111111111111111111117 % 128;
                                                    f62084a = i1911111111111111111111118;
                                                    int i1911111111111111111111119 = i1911111111111111111111117 % 2;
                                                    int i20111111111117 = (i1911111111111111111111118 | 15) << 1;
                                                    int i20111111111118 = -(i1911111111111111111111118 ^ 15);
                                                    i31 = (i20111111111117 ^ i20111111111118) + ((i20111111111118 & i20111111111117) << 1);
                                                    f62085b = i31 % 128;
                                                    if (i31 % 2 == 0) {
                                                        int i20111111111119 = 83 / 0;
                                                    }
                                                    return Integer.valueOf(i15);
                                                }
                                                int i201111111111110 = (-2) - (((i30 & 118) + (i30 | 118)) ^ (-1));
                                                f62085b = i201111111111110 % 128;
                                                int i201111111111111 = i201111111111110 % 2;
                                            }
                                        }
                                        int i1711111111110 = f62084a + 89;
                                        int i1711111111111 = i1711111111110 % 128;
                                        f62085b = i1711111111111;
                                        int i1711111111112 = i1711111111110 % i26;
                                        int i1711111111113 = i1711111111111 & 73;
                                        int i1711111111114 = -(-((i1711111111111 ^ 73) | i1711111111113));
                                        int i1811112114 = (i1711111111113 & i1711111111114) + (i1711111111113 | i1711111111114);
                                        f62084a = i1811112114 % 128;
                                        int i1811112115 = i1811112114 % 2;
                                        i22 = 1;
                                        i23 = 1;
                                        if ((i23 ^ 1) != i22) {
                                            int i1811111111111111111114 = f62085b;
                                            int i1811111111111111111115 = i1811111111111111111114 ^ 7;
                                            int i1811111111111111111116 = ((i1811111111111111111114 & 7) | i1811111111111111111115) << i22;
                                            int i1811111111111111111117 = -i1811111111111111111115;
                                            i32 = (i1811111111111111111116 ^ i1811111111111111111117) + ((i1811111111111111111116 & i1811111111111111111117) << i22);
                                            f62084a = i32 % 128;
                                            if (i32 % 2 != 0) {
                                                i27 = 1;
                                                i28 = 0;
                                            } else {
                                                i27 = 1;
                                                i28 = 1;
                                            }
                                        } else if (cCharAt == '.') {
                                            int i1811111111111111111118 = f62085b;
                                            int i1811111111111111111119 = (i1811111111111111111118 & 119) + (i1811111111111111111118 | 119);
                                            f62084a = i1811111111111111111119 % 128;
                                            int i18111111111111111111110 = i1811111111111111111119 % 2;
                                            int i18111111111111111111111 = i1811111111111111111118 + 56;
                                            i27 = 1;
                                            int i19111111111111111111111110 = (i18111111111111111111111 ^ (-1)) + (i18111111111111111111111 << 1);
                                            f62084a = i19111111111111111111111110 % 128;
                                            int i19111111111111111111111111 = i19111111111111111111111110 % 2;
                                            i28 = 1;
                                        } else {
                                            i27 = 1;
                                            int i19111111111111111111111112 = f62084a;
                                            int i19111111111111111111111113 = ((i19111111111111111111111112 | 45) << 1) - (i19111111111111111111111112 ^ 45);
                                            f62085b = i19111111111111111111111113 % 128;
                                            int i19111111111111111111111114 = i19111111111111111111111113 % 2;
                                            i28 = 0;
                                        }
                                        if ((i28 ^ 1) != i27) {
                                            i29 = f62085b;
                                            int i19111111111111111111111115 = ((i29 & (-28)) | ((~i29) & 27)) + ((i29 & 27) << i27);
                                            i30 = i19111111111111111111111115 % 128;
                                            f62084a = i30;
                                            int i19111111111111111111111116 = i19111111111111111111111115 % 2;
                                            if (cCharAt == ':') {
                                                int i19111111111111111111111117 = (-2) - ((-1) ^ (((i29 | 98) << i27) - (i29 ^ 98)));
                                                int i19111111111111111111111118 = i19111111111111111111111117 % 128;
                                                f62084a = i19111111111111111111111118;
                                                int i19111111111111111111111119 = i19111111111111111111111117 % 2;
                                                int i201111111111112 = (i19111111111111111111111118 | 15) << 1;
                                                int i201111111111113 = -(i19111111111111111111111118 ^ 15);
                                                i31 = (i201111111111112 ^ i201111111111113) + ((i201111111111113 & i201111111111112) << 1);
                                                f62085b = i31 % 128;
                                                if (i31 % 2 == 0) {
                                                    int i201111111111114 = 83 / 0;
                                                }
                                                return Integer.valueOf(i15);
                                            }
                                            int i201111111111115 = (-2) - (((i30 & 118) + (i30 | 118)) ^ (-1));
                                            f62085b = i201111111111115 % 128;
                                            int i201111111111116 = i201111111111115 % 2;
                                        }
                                    }
                                    int i244 = f62084a;
                                    i16 = ((i244 ^ 34) + ((i244 & 34) << 1)) - 1;
                                    f62085b = i16 % 128;
                                    if (i16 % 2 == 0) {
                                        throw null;
                                    }
                                }
                            } else {
                                if (Intrinsics.compare((int) cCharAt2, 65) >= 0) {
                                    int i1013 = f62084a;
                                    int i1014 = i1013 & 55;
                                    int i1015 = ((i1013 ^ 55) | i1014) << 1;
                                    int i1016 = -((i1013 | 55) & (~i1014));
                                    i14 = (i1015 ^ i1016) + ((i1016 & i1015) << 1);
                                    f62085b = i14 % 128;
                                    if (i14 % 2 == 0) {
                                        int i1017 = -(-(iIntValue7 * (-489)));
                                        int i1018 = 491 & i1017;
                                        int i1019 = (i1017 ^ 491) | i1018;
                                        int i11110 = (i1018 & i1019) + (i1019 | i1018);
                                        int i11111 = ((-2) & i70) | (i68 & 1);
                                        int i11112 = (-2) & i68;
                                        int i11113 = (i11111 & i11112) | (i11111 ^ i11112);
                                        int i11114 = -(~(((i11113 & i68) | (i70 & i11113) | ((~i11113) & i68)) * (-490)));
                                        int i11115 = ((i11110 & i11114) + (i11114 | i11110)) - 1;
                                        int i11116 = (i88 & (-2)) | ((~i88) & 1);
                                        int i11117 = i88 & 1;
                                        int i11118 = ~((i11116 & i11117) | (i11116 ^ i11117));
                                        int i11119 = i88 & iIntValue7;
                                        int i12110 = (iIntValue7 | i88) & (~i11119);
                                        int i12111 = (i12110 & i11119) | (i12110 ^ i11119);
                                        int i12112 = ~i12111;
                                        int i12113 = (i12111 | i12112) & i12112;
                                        int i12114 = ((~i12113) & i11118) | ((~i11118) & i12113);
                                        int i12115 = i11118 & i12113;
                                        int i12116 = -(-(((i12115 & i12114) | (i12114 ^ i12115)) * 490));
                                        int i12117 = (i11115 & i12116) + (i12116 | i11115);
                                        int i12118 = f62084a + 64;
                                        int i12119 = (i12118 ^ (-1)) + (i12118 << 1);
                                        f62085b = i12119 % 128;
                                        int i13112 = i12119 % 2;
                                        while (i15 < iIntValue8) {
                                            int i13113 = f62084a;
                                            int i13114 = i13113 & 73;
                                            i17 = (((i13113 ^ 73) | i13114) << 1) - ((i13113 | 73) & (~i13114));
                                            f62085b = i17 % 128;
                                            if (i17 % 2 == 0) {
                                                int i13115 = i15 & 12;
                                                int i13116 = -(-((i15 ^ 12) | i13115));
                                                i18 = 1;
                                                int i13117 = ((i13115 | i13116) << 1) - (i13115 ^ i13116);
                                                int i13118 = i13117 ^ 73;
                                                int i13119 = ((i13117 & 73) | i13118) << 1;
                                                int i13120 = -i13118;
                                                i19 = (i13119 ^ i13120) + ((i13120 & i13119) << 1);
                                                cCharAt = str3.charAt(i15);
                                                if (1 <= cCharAt) {
                                                    int i131110 = f62084a;
                                                    int i1411116 = i131110 & 35;
                                                    int i1411117 = ((i131110 ^ 35) | i1411116) << i18;
                                                    int i1411118 = -((i131110 | 35) & (~i1411116));
                                                    int i1411119 = (i1411117 ^ i1411118) + ((i1411118 & i1411117) << i18);
                                                    i20 = i1411119 % 128;
                                                    f62085b = i20;
                                                    int i1411120 = i1411119 % 2;
                                                    if (cCharAt < '{') {
                                                        int i1411121 = ((i20 ^ 31) | (i20 & 31)) << 1;
                                                        int i1411122 = -(((~i20) & 31) | (i20 & (-32)));
                                                        i21 = (i1411121 ^ i1411122) + ((i1411122 & i1411121) << 1);
                                                        f62084a = i21 % 128;
                                                        if (i21 % 2 != 0) {
                                                            z10 = true;
                                                        }
                                                    }
                                                }
                                                if (!z10) {
                                                    if ('A' <= cCharAt) {
                                                        i35 = f62084a;
                                                        int i14111110 = (-2) - (((i35 ^ 24) + ((i35 & 24) << 1)) ^ (-1));
                                                        i36 = i14111110 % 128;
                                                        f62085b = i36;
                                                        int i14111111 = i14111110 % 2;
                                                        if (cCharAt < '[') {
                                                            int i14111112 = i36 ^ 91;
                                                            int i151111110 = ((i36 & 91) | i14111112) << 1;
                                                            int i151111111 = -i14111112;
                                                            int i151111112 = ((i151111110 | i151111111) << 1) - (i151111111 ^ i151111110);
                                                            f62084a = i151111112 % 128;
                                                            int i151111113 = i151111112 % 2;
                                                            int i151111114 = (((i36 & (-100)) | ((~i36) & 99)) - (~(-(-((i36 & 99) << 1))))) - 1;
                                                            f62084a = i151111114 % 128;
                                                            int i151111115 = i151111114 % 2;
                                                        } else {
                                                            int i151111116 = i35 + 85;
                                                            f62085b = i151111116 % 128;
                                                            int i151111117 = i151111116 % 2;
                                                        }
                                                    }
                                                    if ('0' <= cCharAt) {
                                                        i34 = f62084a;
                                                        int i151111118 = i34 & 9;
                                                        int i151111119 = (i34 ^ 9) | i151111118;
                                                        int i161111116 = (i151111118 & i151111119) + (i151111118 | i151111119);
                                                        f62085b = i161111116 % 128;
                                                        int i161111117 = i161111116 % 2;
                                                        if (cCharAt < ':') {
                                                            int i161111118 = i34 & 107;
                                                            int i161111119 = (((i34 ^ 107) | i161111118) << 1) - ((~i161111118) & (i34 | 107));
                                                            f62085b = i161111119 % 128;
                                                            int i161212 = i161111119 % 2;
                                                            int i161213 = (i34 ^ 57) + ((i34 & 57) << 1);
                                                            f62085b = i161213 % 128;
                                                            int i161214 = i161213 % 2;
                                                            int i1611111110 = f62085b;
                                                            int i1611111111 = i1611111110 & 119;
                                                            int i1611111112 = ((i1611111110 ^ 119) | i1611111111) << 1;
                                                            int i1711211115 = -((~i1611111111) & (i1611111110 | 119));
                                                            int i1711211116 = (i1611111112 & i1711211115) + (i1611111112 | i1711211115);
                                                            f62084a = i1711211116 % 128;
                                                            int i1711211117 = i1711211116 % 2;
                                                            int i1711211118 = i1611111110 + 37;
                                                            f62084a = i1711211118 % 128;
                                                            int i1711211119 = i1711211118 % 2;
                                                            i26 = 2;
                                                            int i1711111111115 = f62084a + 89;
                                                            int i1711111111116 = i1711111111115 % 128;
                                                            f62085b = i1711111111116;
                                                            int i1711111111117 = i1711111111115 % i26;
                                                            int i1711111111118 = i1711111111116 & 73;
                                                            int i1711111111119 = -(-((i1711111111116 ^ 73) | i1711111111118));
                                                            int i1811112116 = (i1711111111118 & i1711111111119) + (i1711111111118 | i1711111111119);
                                                            f62084a = i1811112116 % 128;
                                                            int i1811112117 = i1811112116 % 2;
                                                            i22 = 1;
                                                            i23 = 1;
                                                            if ((i23 ^ 1) != i22) {
                                                                int i18111111111111111111112 = f62085b;
                                                                int i18111111111111111111113 = i18111111111111111111112 ^ 7;
                                                                int i18111111111111111111114 = ((i18111111111111111111112 & 7) | i18111111111111111111113) << i22;
                                                                int i18111111111111111111115 = -i18111111111111111111113;
                                                                i32 = (i18111111111111111111114 ^ i18111111111111111111115) + ((i18111111111111111111114 & i18111111111111111111115) << i22);
                                                                f62084a = i32 % 128;
                                                                if (i32 % 2 != 0) {
                                                                    i27 = 1;
                                                                    i28 = 0;
                                                                } else {
                                                                    i27 = 1;
                                                                    i28 = 1;
                                                                }
                                                            } else if (cCharAt == '.') {
                                                                int i18111111111111111111116 = f62085b;
                                                                int i18111111111111111111117 = (i18111111111111111111116 & 119) + (i18111111111111111111116 | 119);
                                                                f62084a = i18111111111111111111117 % 128;
                                                                int i18111111111111111111118 = i18111111111111111111117 % 2;
                                                                int i18111111111111111111119 = i18111111111111111111116 + 56;
                                                                i27 = 1;
                                                                int i191111111111111111111111110 = (i18111111111111111111119 ^ (-1)) + (i18111111111111111111119 << 1);
                                                                f62084a = i191111111111111111111111110 % 128;
                                                                int i191111111111111111111111111 = i191111111111111111111111110 % 2;
                                                                i28 = 1;
                                                            } else {
                                                                i27 = 1;
                                                                int i191111111111111111111111112 = f62084a;
                                                                int i191111111111111111111111113 = ((i191111111111111111111111112 | 45) << 1) - (i191111111111111111111111112 ^ 45);
                                                                f62085b = i191111111111111111111111113 % 128;
                                                                int i191111111111111111111111114 = i191111111111111111111111113 % 2;
                                                                i28 = 0;
                                                            }
                                                            if ((i28 ^ 1) != i27) {
                                                                i29 = f62085b;
                                                                int i191111111111111111111111115 = ((i29 & (-28)) | ((~i29) & 27)) + ((i29 & 27) << i27);
                                                                i30 = i191111111111111111111111115 % 128;
                                                                f62084a = i30;
                                                                int i191111111111111111111111116 = i191111111111111111111111115 % 2;
                                                                if (cCharAt == ':') {
                                                                    int i191111111111111111111111117 = (-2) - ((-1) ^ (((i29 | 98) << i27) - (i29 ^ 98)));
                                                                    int i191111111111111111111111118 = i191111111111111111111111117 % 128;
                                                                    f62084a = i191111111111111111111111118;
                                                                    int i191111111111111111111111119 = i191111111111111111111111117 % 2;
                                                                    int i201111111111117 = (i191111111111111111111111118 | 15) << 1;
                                                                    int i201111111111118 = -(i191111111111111111111111118 ^ 15);
                                                                    i31 = (i201111111111117 ^ i201111111111118) + ((i201111111111118 & i201111111111117) << 1);
                                                                    f62085b = i31 % 128;
                                                                    if (i31 % 2 == 0) {
                                                                        int i201111111111119 = 83 / 0;
                                                                    }
                                                                    return Integer.valueOf(i15);
                                                                }
                                                                int i2011111111111110 = (-2) - (((i30 & 118) + (i30 | 118)) ^ (-1));
                                                                f62085b = i2011111111111110 % 128;
                                                                int i2011111111111111 = i2011111111111110 % 2;
                                                            }
                                                        } else {
                                                            int i20215 = i34 & 113;
                                                            int i20216 = (((i34 ^ 113) | i20215) << 1) - ((i34 | 113) & (~i20215));
                                                            f62085b = i20216 % 128;
                                                            int i20217 = i20216 % 2;
                                                        }
                                                    }
                                                    if (cCharAt == '+') {
                                                        int i2012110 = f62084a;
                                                        int i2012111 = i2012110 ^ 97;
                                                        int i211111111111110 = (i2012110 & 97) << 1;
                                                        int i211111111111111 = (i2012111 ^ i211111111111110) + ((i2012111 & i211111111111110) << 1);
                                                        f62085b = i211111111111111 % 128;
                                                        int i211111111111112 = i211111111111111 % 2;
                                                        int i211111111111113 = ((i2012110 & 31) - (~(i2012110 | 31))) - 1;
                                                        f62085b = i211111111111113 % 128;
                                                        i26 = 2;
                                                        int i211111111111114 = i211111111111113 % 2;
                                                        int i17111111111110 = f62084a + 89;
                                                        int i17111111111111 = i17111111111110 % 128;
                                                        f62085b = i17111111111111;
                                                        int i17111111111112 = i17111111111110 % i26;
                                                        int i17111111111113 = i17111111111111 & 73;
                                                        int i17111111111114 = -(-((i17111111111111 ^ 73) | i17111111111113));
                                                        int i1811112118 = (i17111111111113 & i17111111111114) + (i17111111111113 | i17111111111114);
                                                        f62084a = i1811112118 % 128;
                                                        int i1811112119 = i1811112118 % 2;
                                                        i22 = 1;
                                                        i23 = 1;
                                                    } else if (cCharAt == '-') {
                                                        int i211111111111115 = f62085b;
                                                        i24 = i211111111111115 + 19;
                                                        f62084a = i24 % 128;
                                                        if (i24 % 2 != 0) {
                                                            i25 = 0;
                                                        } else {
                                                            i25 = 1;
                                                        }
                                                        int i211111111111116 = ((i211111111111115 & 19) - (~(i211111111111115 | 19))) - 1;
                                                        f62084a = i211111111111116 % 128;
                                                        int i211111111111117 = i211111111111116 % 2;
                                                        i23 = i25;
                                                        i22 = 1;
                                                    } else {
                                                        int i211111111111118 = f62085b;
                                                        int i211111111111119 = (i211111111111118 & 89) + (i211111111111118 | 89);
                                                        f62084a = i211111111111119 % 128;
                                                        int i221111111 = i211111111111119 % 2;
                                                        i22 = 1;
                                                        i23 = 0;
                                                    }
                                                    if ((i23 ^ 1) != i22) {
                                                        int i181111111111111111111110 = f62085b;
                                                        int i181111111111111111111111 = i181111111111111111111110 ^ 7;
                                                        int i181111111111111111111112 = ((i181111111111111111111110 & 7) | i181111111111111111111111) << i22;
                                                        int i181111111111111111111113 = -i181111111111111111111111;
                                                        i32 = (i181111111111111111111112 ^ i181111111111111111111113) + ((i181111111111111111111112 & i181111111111111111111113) << i22);
                                                        f62084a = i32 % 128;
                                                        if (i32 % 2 != 0) {
                                                            i27 = 1;
                                                            i28 = 0;
                                                        } else {
                                                            i27 = 1;
                                                            i28 = 1;
                                                        }
                                                    } else if (cCharAt == '.') {
                                                        int i181111111111111111111114 = f62085b;
                                                        int i181111111111111111111115 = (i181111111111111111111114 & 119) + (i181111111111111111111114 | 119);
                                                        f62084a = i181111111111111111111115 % 128;
                                                        int i181111111111111111111116 = i181111111111111111111115 % 2;
                                                        int i181111111111111111111117 = i181111111111111111111114 + 56;
                                                        i27 = 1;
                                                        int i1911111111111111111111111110 = (i181111111111111111111117 ^ (-1)) + (i181111111111111111111117 << 1);
                                                        f62084a = i1911111111111111111111111110 % 128;
                                                        int i1911111111111111111111111111 = i1911111111111111111111111110 % 2;
                                                        i28 = 1;
                                                    } else {
                                                        i27 = 1;
                                                        int i1911111111111111111111111112 = f62084a;
                                                        int i1911111111111111111111111113 = ((i1911111111111111111111111112 | 45) << 1) - (i1911111111111111111111111112 ^ 45);
                                                        f62085b = i1911111111111111111111111113 % 128;
                                                        int i1911111111111111111111111114 = i1911111111111111111111111113 % 2;
                                                        i28 = 0;
                                                    }
                                                    if ((i28 ^ 1) != i27) {
                                                        i29 = f62085b;
                                                        int i1911111111111111111111111115 = ((i29 & (-28)) | ((~i29) & 27)) + ((i29 & 27) << i27);
                                                        i30 = i1911111111111111111111111115 % 128;
                                                        f62084a = i30;
                                                        int i1911111111111111111111111116 = i1911111111111111111111111115 % 2;
                                                        if (cCharAt == ':') {
                                                            int i1911111111111111111111111117 = (-2) - ((-1) ^ (((i29 | 98) << i27) - (i29 ^ 98)));
                                                            int i1911111111111111111111111118 = i1911111111111111111111111117 % 128;
                                                            f62084a = i1911111111111111111111111118;
                                                            int i1911111111111111111111111119 = i1911111111111111111111111117 % 2;
                                                            int i2011111111111112 = (i1911111111111111111111111118 | 15) << 1;
                                                            int i2011111111111113 = -(i1911111111111111111111111118 ^ 15);
                                                            i31 = (i2011111111111112 ^ i2011111111111113) + ((i2011111111111113 & i2011111111111112) << 1);
                                                            f62085b = i31 % 128;
                                                            if (i31 % 2 == 0) {
                                                                int i2011111111111114 = 83 / 0;
                                                            }
                                                            return Integer.valueOf(i15);
                                                        }
                                                        int i2011111111111115 = (-2) - (((i30 & 118) + (i30 | 118)) ^ (-1));
                                                        f62085b = i2011111111111115 % 128;
                                                        int i2011111111111116 = i2011111111111115 % 2;
                                                    }
                                                } else {
                                                    int i221111112 = f62085b;
                                                    int i221111113 = i221111112 & 101;
                                                    int i221111114 = i221111112 | 101;
                                                    int i221111115 = (i221111113 & i221111114) + (i221111114 | i221111113);
                                                    int i221111116 = i221111115 % 128;
                                                    f62084a = i221111116;
                                                    int i221111117 = i221111115 % 2;
                                                    int i221111118 = i221111116 & 33;
                                                    int i221111119 = i221111118 + ((i221111116 ^ 33) | i221111118);
                                                    f62085b = i221111119 % 128;
                                                    int i2225 = i221111119 % 2;
                                                }
                                                int i23114 = f62085b;
                                                int i23115 = ~i23114;
                                                i33 = (((i23114 | 117) << 1) - (~(-((i23114 & (-118)) | (i23115 & 117))))) - 1;
                                                f62084a = i33 % 128;
                                                if (i33 % 2 != 0) {
                                                    z11 = false;
                                                } else {
                                                    z11 = true;
                                                }
                                                int i23116 = (((i23115 & 73) | (i23114 & (-74))) - (~(-(-((i23114 & 73) << 1))))) - 1;
                                                f62084a = i23116 % 128;
                                                int i23117 = i23116 % 2;
                                                if (z11) {
                                                    int i1611111113 = f62085b;
                                                    int i1611111114 = i1611111113 & 119;
                                                    int i1611111115 = ((i1611111113 ^ 119) | i1611111114) << 1;
                                                    int i17112111110 = -((~i1611111114) & (i1611111113 | 119));
                                                    int i17112111111 = (i1611111115 & i17112111110) + (i1611111115 | i17112111110);
                                                    f62084a = i17112111111 % 128;
                                                    int i17112111112 = i17112111111 % 2;
                                                    int i17112111113 = i1611111113 + 37;
                                                    f62084a = i17112111113 % 128;
                                                    int i17112111114 = i17112111113 % 2;
                                                    i26 = 2;
                                                } else {
                                                    if (cCharAt == '+') {
                                                        int i2012112 = f62084a;
                                                        int i2012113 = i2012112 ^ 97;
                                                        int i2111111111111110 = (i2012112 & 97) << 1;
                                                        int i2111111111111111 = (i2012113 ^ i2111111111111110) + ((i2012113 & i2111111111111110) << 1);
                                                        f62085b = i2111111111111111 % 128;
                                                        int i2111111111111112 = i2111111111111111 % 2;
                                                        int i2111111111111113 = ((i2012112 & 31) - (~(i2012112 | 31))) - 1;
                                                        f62085b = i2111111111111113 % 128;
                                                        i26 = 2;
                                                        int i2111111111111114 = i2111111111111113 % 2;
                                                    } else if (cCharAt == '-') {
                                                        int i2111111111111115 = f62085b;
                                                        i24 = i2111111111111115 + 19;
                                                        f62084a = i24 % 128;
                                                        if (i24 % 2 != 0) {
                                                            i25 = 0;
                                                        } else {
                                                            i25 = 1;
                                                        }
                                                        int i2111111111111116 = ((i2111111111111115 & 19) - (~(i2111111111111115 | 19))) - 1;
                                                        f62084a = i2111111111111116 % 128;
                                                        int i2111111111111117 = i2111111111111116 % 2;
                                                        i23 = i25;
                                                        i22 = 1;
                                                    } else {
                                                        int i2111111111111118 = f62085b;
                                                        int i2111111111111119 = (i2111111111111118 & 89) + (i2111111111111118 | 89);
                                                        f62084a = i2111111111111119 % 128;
                                                        int i2211111110 = i2111111111111119 % 2;
                                                        i22 = 1;
                                                        i23 = 0;
                                                    }
                                                    if ((i23 ^ 1) != i22) {
                                                        int i181111111111111111111118 = f62085b;
                                                        int i181111111111111111111119 = i181111111111111111111118 ^ 7;
                                                        int i1811111111111111111111110 = ((i181111111111111111111118 & 7) | i181111111111111111111119) << i22;
                                                        int i1811111111111111111111111 = -i181111111111111111111119;
                                                        i32 = (i1811111111111111111111110 ^ i1811111111111111111111111) + ((i1811111111111111111111110 & i1811111111111111111111111) << i22);
                                                        f62084a = i32 % 128;
                                                        if (i32 % 2 != 0) {
                                                            i27 = 1;
                                                            i28 = 0;
                                                        } else {
                                                            i27 = 1;
                                                            i28 = 1;
                                                        }
                                                    } else if (cCharAt == '.') {
                                                        int i1811111111111111111111112 = f62085b;
                                                        int i1811111111111111111111113 = (i1811111111111111111111112 & 119) + (i1811111111111111111111112 | 119);
                                                        f62084a = i1811111111111111111111113 % 128;
                                                        int i1811111111111111111111114 = i1811111111111111111111113 % 2;
                                                        int i1811111111111111111111115 = i1811111111111111111111112 + 56;
                                                        i27 = 1;
                                                        int i19111111111111111111111111110 = (i1811111111111111111111115 ^ (-1)) + (i1811111111111111111111115 << 1);
                                                        f62084a = i19111111111111111111111111110 % 128;
                                                        int i19111111111111111111111111111 = i19111111111111111111111111110 % 2;
                                                        i28 = 1;
                                                    } else {
                                                        i27 = 1;
                                                        int i19111111111111111111111111112 = f62084a;
                                                        int i19111111111111111111111111113 = ((i19111111111111111111111111112 | 45) << 1) - (i19111111111111111111111111112 ^ 45);
                                                        f62085b = i19111111111111111111111111113 % 128;
                                                        int i19111111111111111111111111114 = i19111111111111111111111111113 % 2;
                                                        i28 = 0;
                                                    }
                                                    if ((i28 ^ 1) != i27) {
                                                        i29 = f62085b;
                                                        int i19111111111111111111111111115 = ((i29 & (-28)) | ((~i29) & 27)) + ((i29 & 27) << i27);
                                                        i30 = i19111111111111111111111111115 % 128;
                                                        f62084a = i30;
                                                        int i19111111111111111111111111116 = i19111111111111111111111111115 % 2;
                                                        if (cCharAt == ':') {
                                                            int i19111111111111111111111111117 = (-2) - ((-1) ^ (((i29 | 98) << i27) - (i29 ^ 98)));
                                                            int i19111111111111111111111111118 = i19111111111111111111111111117 % 128;
                                                            f62084a = i19111111111111111111111111118;
                                                            int i19111111111111111111111111119 = i19111111111111111111111111117 % 2;
                                                            int i2011111111111117 = (i19111111111111111111111111118 | 15) << 1;
                                                            int i2011111111111118 = -(i19111111111111111111111111118 ^ 15);
                                                            i31 = (i2011111111111117 ^ i2011111111111118) + ((i2011111111111118 & i2011111111111117) << 1);
                                                            f62085b = i31 % 128;
                                                            if (i31 % 2 == 0) {
                                                                int i2011111111111119 = 83 / 0;
                                                            }
                                                            return Integer.valueOf(i15);
                                                        }
                                                        int i20111111111111110 = (-2) - (((i30 & 118) + (i30 | 118)) ^ (-1));
                                                        f62085b = i20111111111111110 % 128;
                                                        int i20111111111111111 = i20111111111111110 % 2;
                                                    }
                                                }
                                                int i17111111111115 = f62084a + 89;
                                                int i17111111111116 = i17111111111115 % 128;
                                                f62085b = i17111111111116;
                                                int i17111111111117 = i17111111111115 % i26;
                                                int i17111111111118 = i17111111111116 & 73;
                                                int i17111111111119 = -(-((i17111111111116 ^ 73) | i17111111111118));
                                                int i18111121110 = (i17111111111118 & i17111111111119) + (i17111111111118 | i17111111111119);
                                                f62084a = i18111121110 % 128;
                                                int i18111121111 = i18111121110 % 2;
                                                i22 = 1;
                                                i23 = 1;
                                                if ((i23 ^ 1) != i22) {
                                                    int i1811111111111111111111116 = f62085b;
                                                    int i1811111111111111111111117 = i1811111111111111111111116 ^ 7;
                                                    int i1811111111111111111111118 = ((i1811111111111111111111116 & 7) | i1811111111111111111111117) << i22;
                                                    int i1811111111111111111111119 = -i1811111111111111111111117;
                                                    i32 = (i1811111111111111111111118 ^ i1811111111111111111111119) + ((i1811111111111111111111118 & i1811111111111111111111119) << i22);
                                                    f62084a = i32 % 128;
                                                    if (i32 % 2 != 0) {
                                                        i27 = 1;
                                                        i28 = 0;
                                                    } else {
                                                        i27 = 1;
                                                        i28 = 1;
                                                    }
                                                } else if (cCharAt == '.') {
                                                    int i18111111111111111111111110 = f62085b;
                                                    int i18111111111111111111111111 = (i18111111111111111111111110 & 119) + (i18111111111111111111111110 | 119);
                                                    f62084a = i18111111111111111111111111 % 128;
                                                    int i18111111111111111111111112 = i18111111111111111111111111 % 2;
                                                    int i18111111111111111111111113 = i18111111111111111111111110 + 56;
                                                    i27 = 1;
                                                    int i191111111111111111111111111110 = (i18111111111111111111111113 ^ (-1)) + (i18111111111111111111111113 << 1);
                                                    f62084a = i191111111111111111111111111110 % 128;
                                                    int i191111111111111111111111111111 = i191111111111111111111111111110 % 2;
                                                    i28 = 1;
                                                } else {
                                                    i27 = 1;
                                                    int i191111111111111111111111111112 = f62084a;
                                                    int i191111111111111111111111111113 = ((i191111111111111111111111111112 | 45) << 1) - (i191111111111111111111111111112 ^ 45);
                                                    f62085b = i191111111111111111111111111113 % 128;
                                                    int i191111111111111111111111111114 = i191111111111111111111111111113 % 2;
                                                    i28 = 0;
                                                }
                                                if ((i28 ^ 1) != i27) {
                                                    i29 = f62085b;
                                                    int i191111111111111111111111111115 = ((i29 & (-28)) | ((~i29) & 27)) + ((i29 & 27) << i27);
                                                    i30 = i191111111111111111111111111115 % 128;
                                                    f62084a = i30;
                                                    int i191111111111111111111111111116 = i191111111111111111111111111115 % 2;
                                                    if (cCharAt == ':') {
                                                        int i191111111111111111111111111117 = (-2) - ((-1) ^ (((i29 | 98) << i27) - (i29 ^ 98)));
                                                        int i191111111111111111111111111118 = i191111111111111111111111111117 % 128;
                                                        f62084a = i191111111111111111111111111118;
                                                        int i191111111111111111111111111119 = i191111111111111111111111111117 % 2;
                                                        int i20111111111111112 = (i191111111111111111111111111118 | 15) << 1;
                                                        int i20111111111111113 = -(i191111111111111111111111111118 ^ 15);
                                                        i31 = (i20111111111111112 ^ i20111111111111113) + ((i20111111111111113 & i20111111111111112) << 1);
                                                        f62085b = i31 % 128;
                                                        if (i31 % 2 == 0) {
                                                            int i20111111111111114 = 83 / 0;
                                                        }
                                                        return Integer.valueOf(i15);
                                                    }
                                                    int i20111111111111115 = (-2) - (((i30 & 118) + (i30 | 118)) ^ (-1));
                                                    f62085b = i20111111111111115 % 128;
                                                    int i20111111111111116 = i20111111111111115 % 2;
                                                }
                                            } else {
                                                i18 = 1;
                                                i19 = (i15 ^ 1) + ((i15 & 1) << 1);
                                                cCharAt = str3.charAt(i15);
                                                if ('a' <= cCharAt) {
                                                    int i131111 = f62084a;
                                                    int i14111113 = i131111 & 35;
                                                    int i14111114 = ((i131111 ^ 35) | i14111113) << i18;
                                                    int i14111115 = -((i131111 | 35) & (~i14111113));
                                                    int i14111116 = (i14111114 ^ i14111115) + ((i14111115 & i14111114) << i18);
                                                    i20 = i14111116 % 128;
                                                    f62085b = i20;
                                                    int i1411123 = i14111116 % 2;
                                                    if (cCharAt < '{') {
                                                        int i1411124 = ((i20 ^ 31) | (i20 & 31)) << 1;
                                                        int i1411125 = -(((~i20) & 31) | (i20 & (-32)));
                                                        i21 = (i1411124 ^ i1411125) + ((i1411125 & i1411124) << 1);
                                                        f62084a = i21 % 128;
                                                        if (i21 % 2 != 0) {
                                                            z10 = true;
                                                        }
                                                    }
                                                }
                                                if (!z10) {
                                                    if ('A' <= cCharAt) {
                                                        i35 = f62084a;
                                                        int i14111117 = (-2) - (((i35 ^ 24) + ((i35 & 24) << 1)) ^ (-1));
                                                        i36 = i14111117 % 128;
                                                        f62085b = i36;
                                                        int i14111118 = i14111117 % 2;
                                                        if (cCharAt < '[') {
                                                            int i14111119 = i36 ^ 91;
                                                            int i1511111110 = ((i36 & 91) | i14111119) << 1;
                                                            int i1511111111 = -i14111119;
                                                            int i1511111112 = ((i1511111110 | i1511111111) << 1) - (i1511111111 ^ i1511111110);
                                                            f62084a = i1511111112 % 128;
                                                            int i1511111113 = i1511111112 % 2;
                                                            int i1511111114 = (((i36 & (-100)) | ((~i36) & 99)) - (~(-(-((i36 & 99) << 1))))) - 1;
                                                            f62084a = i1511111114 % 128;
                                                            int i1511111115 = i1511111114 % 2;
                                                        } else {
                                                            int i1511111116 = i35 + 85;
                                                            f62085b = i1511111116 % 128;
                                                            int i1511111117 = i1511111116 % 2;
                                                        }
                                                    }
                                                    if ('0' <= cCharAt) {
                                                        i34 = f62084a;
                                                        int i1511111118 = i34 & 9;
                                                        int i1511111119 = (i34 ^ 9) | i1511111118;
                                                        int i1611111116 = (i1511111118 & i1511111119) + (i1511111118 | i1511111119);
                                                        f62085b = i1611111116 % 128;
                                                        int i1611111117 = i1611111116 % 2;
                                                        if (cCharAt < ':') {
                                                            int i1611111118 = i34 & 107;
                                                            int i1611111119 = (((i34 ^ 107) | i1611111118) << 1) - ((~i1611111118) & (i34 | 107));
                                                            f62085b = i1611111119 % 128;
                                                            int i161215 = i1611111119 % 2;
                                                            int i161216 = (i34 ^ 57) + ((i34 & 57) << 1);
                                                            f62085b = i161216 % 128;
                                                            int i161217 = i161216 % 2;
                                                            int i16111111110 = f62085b;
                                                            int i16111111111 = i16111111110 & 119;
                                                            int i16111111112 = ((i16111111110 ^ 119) | i16111111111) << 1;
                                                            int i17112111115 = -((~i16111111111) & (i16111111110 | 119));
                                                            int i17112111116 = (i16111111112 & i17112111115) + (i16111111112 | i17112111115);
                                                            f62084a = i17112111116 % 128;
                                                            int i17112111117 = i17112111116 % 2;
                                                            int i17112111118 = i16111111110 + 37;
                                                            f62084a = i17112111118 % 128;
                                                            int i17112111119 = i17112111118 % 2;
                                                            i26 = 2;
                                                            int i171111111111110 = f62084a + 89;
                                                            int i171111111111111 = i171111111111110 % 128;
                                                            f62085b = i171111111111111;
                                                            int i171111111111112 = i171111111111110 % i26;
                                                            int i171111111111113 = i171111111111111 & 73;
                                                            int i171111111111114 = -(-((i171111111111111 ^ 73) | i171111111111113));
                                                            int i18111121112 = (i171111111111113 & i171111111111114) + (i171111111111113 | i171111111111114);
                                                            f62084a = i18111121112 % 128;
                                                            int i18111121113 = i18111121112 % 2;
                                                            i22 = 1;
                                                            i23 = 1;
                                                            if ((i23 ^ 1) != i22) {
                                                                int i18111111111111111111111114 = f62085b;
                                                                int i18111111111111111111111115 = i18111111111111111111111114 ^ 7;
                                                                int i18111111111111111111111116 = ((i18111111111111111111111114 & 7) | i18111111111111111111111115) << i22;
                                                                int i18111111111111111111111117 = -i18111111111111111111111115;
                                                                i32 = (i18111111111111111111111116 ^ i18111111111111111111111117) + ((i18111111111111111111111116 & i18111111111111111111111117) << i22);
                                                                f62084a = i32 % 128;
                                                                if (i32 % 2 != 0) {
                                                                    i27 = 1;
                                                                    i28 = 0;
                                                                } else {
                                                                    i27 = 1;
                                                                    i28 = 1;
                                                                }
                                                            } else if (cCharAt == '.') {
                                                                int i18111111111111111111111118 = f62085b;
                                                                int i18111111111111111111111119 = (i18111111111111111111111118 & 119) + (i18111111111111111111111118 | 119);
                                                                f62084a = i18111111111111111111111119 % 128;
                                                                int i181111111111111111111111110 = i18111111111111111111111119 % 2;
                                                                int i181111111111111111111111111 = i18111111111111111111111118 + 56;
                                                                i27 = 1;
                                                                int i1911111111111111111111111111110 = (i181111111111111111111111111 ^ (-1)) + (i181111111111111111111111111 << 1);
                                                                f62084a = i1911111111111111111111111111110 % 128;
                                                                int i1911111111111111111111111111111 = i1911111111111111111111111111110 % 2;
                                                                i28 = 1;
                                                            } else {
                                                                i27 = 1;
                                                                int i1911111111111111111111111111112 = f62084a;
                                                                int i1911111111111111111111111111113 = ((i1911111111111111111111111111112 | 45) << 1) - (i1911111111111111111111111111112 ^ 45);
                                                                f62085b = i1911111111111111111111111111113 % 128;
                                                                int i1911111111111111111111111111114 = i1911111111111111111111111111113 % 2;
                                                                i28 = 0;
                                                            }
                                                            if ((i28 ^ 1) != i27) {
                                                                i29 = f62085b;
                                                                int i1911111111111111111111111111115 = ((i29 & (-28)) | ((~i29) & 27)) + ((i29 & 27) << i27);
                                                                i30 = i1911111111111111111111111111115 % 128;
                                                                f62084a = i30;
                                                                int i1911111111111111111111111111116 = i1911111111111111111111111111115 % 2;
                                                                if (cCharAt == ':') {
                                                                    int i1911111111111111111111111111117 = (-2) - ((-1) ^ (((i29 | 98) << i27) - (i29 ^ 98)));
                                                                    int i1911111111111111111111111111118 = i1911111111111111111111111111117 % 128;
                                                                    f62084a = i1911111111111111111111111111118;
                                                                    int i1911111111111111111111111111119 = i1911111111111111111111111111117 % 2;
                                                                    int i20111111111111117 = (i1911111111111111111111111111118 | 15) << 1;
                                                                    int i20111111111111118 = -(i1911111111111111111111111111118 ^ 15);
                                                                    i31 = (i20111111111111117 ^ i20111111111111118) + ((i20111111111111118 & i20111111111111117) << 1);
                                                                    f62085b = i31 % 128;
                                                                    if (i31 % 2 == 0) {
                                                                        int i20111111111111119 = 83 / 0;
                                                                    }
                                                                    return Integer.valueOf(i15);
                                                                }
                                                                int i201111111111111110 = (-2) - (((i30 & 118) + (i30 | 118)) ^ (-1));
                                                                f62085b = i201111111111111110 % 128;
                                                                int i201111111111111111 = i201111111111111110 % 2;
                                                            }
                                                        } else {
                                                            int i20218 = i34 & 113;
                                                            int i20219 = (((i34 ^ 113) | i20218) << 1) - ((i34 | 113) & (~i20218));
                                                            f62085b = i20219 % 128;
                                                            int i202110 = i20219 % 2;
                                                        }
                                                    }
                                                    if (cCharAt == '+') {
                                                        int i2012114 = f62084a;
                                                        int i2012115 = i2012114 ^ 97;
                                                        int i21111111111111110 = (i2012114 & 97) << 1;
                                                        int i21111111111111111 = (i2012115 ^ i21111111111111110) + ((i2012115 & i21111111111111110) << 1);
                                                        f62085b = i21111111111111111 % 128;
                                                        int i21111111111111112 = i21111111111111111 % 2;
                                                        int i21111111111111113 = ((i2012114 & 31) - (~(i2012114 | 31))) - 1;
                                                        f62085b = i21111111111111113 % 128;
                                                        i26 = 2;
                                                        int i21111111111111114 = i21111111111111113 % 2;
                                                        int i171111111111115 = f62084a + 89;
                                                        int i171111111111116 = i171111111111115 % 128;
                                                        f62085b = i171111111111116;
                                                        int i171111111111117 = i171111111111115 % i26;
                                                        int i171111111111118 = i171111111111116 & 73;
                                                        int i171111111111119 = -(-((i171111111111116 ^ 73) | i171111111111118));
                                                        int i18111121114 = (i171111111111118 & i171111111111119) + (i171111111111118 | i171111111111119);
                                                        f62084a = i18111121114 % 128;
                                                        int i18111121115 = i18111121114 % 2;
                                                        i22 = 1;
                                                        i23 = 1;
                                                    } else if (cCharAt == '-') {
                                                        int i21111111111111115 = f62085b;
                                                        i24 = i21111111111111115 + 19;
                                                        f62084a = i24 % 128;
                                                        if (i24 % 2 != 0) {
                                                            i25 = 0;
                                                        } else {
                                                            i25 = 1;
                                                        }
                                                        int i21111111111111116 = ((i21111111111111115 & 19) - (~(i21111111111111115 | 19))) - 1;
                                                        f62084a = i21111111111111116 % 128;
                                                        int i21111111111111117 = i21111111111111116 % 2;
                                                        i23 = i25;
                                                        i22 = 1;
                                                    } else {
                                                        int i21111111111111118 = f62085b;
                                                        int i21111111111111119 = (i21111111111111118 & 89) + (i21111111111111118 | 89);
                                                        f62084a = i21111111111111119 % 128;
                                                        int i2211111111 = i21111111111111119 % 2;
                                                        i22 = 1;
                                                        i23 = 0;
                                                    }
                                                    if ((i23 ^ 1) != i22) {
                                                        int i181111111111111111111111112 = f62085b;
                                                        int i181111111111111111111111113 = i181111111111111111111111112 ^ 7;
                                                        int i181111111111111111111111114 = ((i181111111111111111111111112 & 7) | i181111111111111111111111113) << i22;
                                                        int i181111111111111111111111115 = -i181111111111111111111111113;
                                                        i32 = (i181111111111111111111111114 ^ i181111111111111111111111115) + ((i181111111111111111111111114 & i181111111111111111111111115) << i22);
                                                        f62084a = i32 % 128;
                                                        if (i32 % 2 != 0) {
                                                            i27 = 1;
                                                            i28 = 0;
                                                        } else {
                                                            i27 = 1;
                                                            i28 = 1;
                                                        }
                                                    } else if (cCharAt == '.') {
                                                        int i181111111111111111111111116 = f62085b;
                                                        int i181111111111111111111111117 = (i181111111111111111111111116 & 119) + (i181111111111111111111111116 | 119);
                                                        f62084a = i181111111111111111111111117 % 128;
                                                        int i181111111111111111111111118 = i181111111111111111111111117 % 2;
                                                        int i181111111111111111111111119 = i181111111111111111111111116 + 56;
                                                        i27 = 1;
                                                        int i19111111111111111111111111111110 = (i181111111111111111111111119 ^ (-1)) + (i181111111111111111111111119 << 1);
                                                        f62084a = i19111111111111111111111111111110 % 128;
                                                        int i19111111111111111111111111111111 = i19111111111111111111111111111110 % 2;
                                                        i28 = 1;
                                                    } else {
                                                        i27 = 1;
                                                        int i19111111111111111111111111111112 = f62084a;
                                                        int i19111111111111111111111111111113 = ((i19111111111111111111111111111112 | 45) << 1) - (i19111111111111111111111111111112 ^ 45);
                                                        f62085b = i19111111111111111111111111111113 % 128;
                                                        int i19111111111111111111111111111114 = i19111111111111111111111111111113 % 2;
                                                        i28 = 0;
                                                    }
                                                    if ((i28 ^ 1) != i27) {
                                                        i29 = f62085b;
                                                        int i19111111111111111111111111111115 = ((i29 & (-28)) | ((~i29) & 27)) + ((i29 & 27) << i27);
                                                        i30 = i19111111111111111111111111111115 % 128;
                                                        f62084a = i30;
                                                        int i19111111111111111111111111111116 = i19111111111111111111111111111115 % 2;
                                                        if (cCharAt == ':') {
                                                            int i19111111111111111111111111111117 = (-2) - ((-1) ^ (((i29 | 98) << i27) - (i29 ^ 98)));
                                                            int i19111111111111111111111111111118 = i19111111111111111111111111111117 % 128;
                                                            f62084a = i19111111111111111111111111111118;
                                                            int i19111111111111111111111111111119 = i19111111111111111111111111111117 % 2;
                                                            int i201111111111111112 = (i19111111111111111111111111111118 | 15) << 1;
                                                            int i201111111111111113 = -(i19111111111111111111111111111118 ^ 15);
                                                            i31 = (i201111111111111112 ^ i201111111111111113) + ((i201111111111111113 & i201111111111111112) << 1);
                                                            f62085b = i31 % 128;
                                                            if (i31 % 2 == 0) {
                                                                int i201111111111111114 = 83 / 0;
                                                            }
                                                            return Integer.valueOf(i15);
                                                        }
                                                        int i201111111111111115 = (-2) - (((i30 & 118) + (i30 | 118)) ^ (-1));
                                                        f62085b = i201111111111111115 % 128;
                                                        int i201111111111111116 = i201111111111111115 % 2;
                                                    }
                                                } else {
                                                    int i2211111112 = f62085b;
                                                    int i2211111113 = i2211111112 & 101;
                                                    int i2211111114 = i2211111112 | 101;
                                                    int i2211111115 = (i2211111113 & i2211111114) + (i2211111114 | i2211111113);
                                                    int i2211111116 = i2211111115 % 128;
                                                    f62084a = i2211111116;
                                                    int i2211111117 = i2211111115 % 2;
                                                    int i2211111118 = i2211111116 & 33;
                                                    int i2211111119 = i2211111118 + ((i2211111116 ^ 33) | i2211111118);
                                                    f62085b = i2211111119 % 128;
                                                    int i2226 = i2211111119 % 2;
                                                }
                                                int i23118 = f62085b;
                                                int i23119 = ~i23118;
                                                i33 = (((i23118 | 117) << 1) - (~(-((i23118 & (-118)) | (i23119 & 117))))) - 1;
                                                f62084a = i33 % 128;
                                                if (i33 % 2 != 0) {
                                                    z11 = false;
                                                } else {
                                                    z11 = true;
                                                }
                                                int i231110 = (((i23119 & 73) | (i23118 & (-74))) - (~(-(-((i23118 & 73) << 1))))) - 1;
                                                f62084a = i231110 % 128;
                                                int i231111 = i231110 % 2;
                                                if (z11) {
                                                    int i16111111113 = f62085b;
                                                    int i16111111114 = i16111111113 & 119;
                                                    int i16111111115 = ((i16111111113 ^ 119) | i16111111114) << 1;
                                                    int i171121111110 = -((~i16111111114) & (i16111111113 | 119));
                                                    int i171121111111 = (i16111111115 & i171121111110) + (i16111111115 | i171121111110);
                                                    f62084a = i171121111111 % 128;
                                                    int i171121111112 = i171121111111 % 2;
                                                    int i171121111113 = i16111111113 + 37;
                                                    f62084a = i171121111113 % 128;
                                                    int i171121111114 = i171121111113 % 2;
                                                    i26 = 2;
                                                } else {
                                                    if (cCharAt == '+') {
                                                        int i2012116 = f62084a;
                                                        int i2012117 = i2012116 ^ 97;
                                                        int i211111111111111110 = (i2012116 & 97) << 1;
                                                        int i211111111111111111 = (i2012117 ^ i211111111111111110) + ((i2012117 & i211111111111111110) << 1);
                                                        f62085b = i211111111111111111 % 128;
                                                        int i211111111111111112 = i211111111111111111 % 2;
                                                        int i211111111111111113 = ((i2012116 & 31) - (~(i2012116 | 31))) - 1;
                                                        f62085b = i211111111111111113 % 128;
                                                        i26 = 2;
                                                        int i211111111111111114 = i211111111111111113 % 2;
                                                    } else if (cCharAt == '-') {
                                                        int i211111111111111115 = f62085b;
                                                        i24 = i211111111111111115 + 19;
                                                        f62084a = i24 % 128;
                                                        if (i24 % 2 != 0) {
                                                            i25 = 0;
                                                        } else {
                                                            i25 = 1;
                                                        }
                                                        int i211111111111111116 = ((i211111111111111115 & 19) - (~(i211111111111111115 | 19))) - 1;
                                                        f62084a = i211111111111111116 % 128;
                                                        int i211111111111111117 = i211111111111111116 % 2;
                                                        i23 = i25;
                                                        i22 = 1;
                                                    } else {
                                                        int i211111111111111118 = f62085b;
                                                        int i211111111111111119 = (i211111111111111118 & 89) + (i211111111111111118 | 89);
                                                        f62084a = i211111111111111119 % 128;
                                                        int i22111111110 = i211111111111111119 % 2;
                                                        i22 = 1;
                                                        i23 = 0;
                                                    }
                                                    if ((i23 ^ 1) != i22) {
                                                        int i1811111111111111111111111110 = f62085b;
                                                        int i1811111111111111111111111111 = i1811111111111111111111111110 ^ 7;
                                                        int i1811111111111111111111111112 = ((i1811111111111111111111111110 & 7) | i1811111111111111111111111111) << i22;
                                                        int i1811111111111111111111111113 = -i1811111111111111111111111111;
                                                        i32 = (i1811111111111111111111111112 ^ i1811111111111111111111111113) + ((i1811111111111111111111111112 & i1811111111111111111111111113) << i22);
                                                        f62084a = i32 % 128;
                                                        if (i32 % 2 != 0) {
                                                            i27 = 1;
                                                            i28 = 0;
                                                        } else {
                                                            i27 = 1;
                                                            i28 = 1;
                                                        }
                                                    } else if (cCharAt == '.') {
                                                        int i1811111111111111111111111114 = f62085b;
                                                        int i1811111111111111111111111115 = (i1811111111111111111111111114 & 119) + (i1811111111111111111111111114 | 119);
                                                        f62084a = i1811111111111111111111111115 % 128;
                                                        int i1811111111111111111111111116 = i1811111111111111111111111115 % 2;
                                                        int i1811111111111111111111111117 = i1811111111111111111111111114 + 56;
                                                        i27 = 1;
                                                        int i191111111111111111111111111111110 = (i1811111111111111111111111117 ^ (-1)) + (i1811111111111111111111111117 << 1);
                                                        f62084a = i191111111111111111111111111111110 % 128;
                                                        int i191111111111111111111111111111111 = i191111111111111111111111111111110 % 2;
                                                        i28 = 1;
                                                    } else {
                                                        i27 = 1;
                                                        int i191111111111111111111111111111112 = f62084a;
                                                        int i191111111111111111111111111111113 = ((i191111111111111111111111111111112 | 45) << 1) - (i191111111111111111111111111111112 ^ 45);
                                                        f62085b = i191111111111111111111111111111113 % 128;
                                                        int i191111111111111111111111111111114 = i191111111111111111111111111111113 % 2;
                                                        i28 = 0;
                                                    }
                                                    if ((i28 ^ 1) != i27) {
                                                        i29 = f62085b;
                                                        int i191111111111111111111111111111115 = ((i29 & (-28)) | ((~i29) & 27)) + ((i29 & 27) << i27);
                                                        i30 = i191111111111111111111111111111115 % 128;
                                                        f62084a = i30;
                                                        int i191111111111111111111111111111116 = i191111111111111111111111111111115 % 2;
                                                        if (cCharAt == ':') {
                                                            int i191111111111111111111111111111117 = (-2) - ((-1) ^ (((i29 | 98) << i27) - (i29 ^ 98)));
                                                            int i191111111111111111111111111111118 = i191111111111111111111111111111117 % 128;
                                                            f62084a = i191111111111111111111111111111118;
                                                            int i191111111111111111111111111111119 = i191111111111111111111111111111117 % 2;
                                                            int i201111111111111117 = (i191111111111111111111111111111118 | 15) << 1;
                                                            int i201111111111111118 = -(i191111111111111111111111111111118 ^ 15);
                                                            i31 = (i201111111111111117 ^ i201111111111111118) + ((i201111111111111118 & i201111111111111117) << 1);
                                                            f62085b = i31 % 128;
                                                            if (i31 % 2 == 0) {
                                                                int i201111111111111119 = 83 / 0;
                                                            }
                                                            return Integer.valueOf(i15);
                                                        }
                                                        int i2011111111111111110 = (-2) - (((i30 & 118) + (i30 | 118)) ^ (-1));
                                                        f62085b = i2011111111111111110 % 128;
                                                        int i2011111111111111111 = i2011111111111111110 % 2;
                                                    }
                                                }
                                                int i1711111111111110 = f62084a + 89;
                                                int i1711111111111111 = i1711111111111110 % 128;
                                                f62085b = i1711111111111111;
                                                int i1711111111111112 = i1711111111111110 % i26;
                                                int i1711111111111113 = i1711111111111111 & 73;
                                                int i1711111111111114 = -(-((i1711111111111111 ^ 73) | i1711111111111113));
                                                int i18111121116 = (i1711111111111113 & i1711111111111114) + (i1711111111111113 | i1711111111111114);
                                                f62084a = i18111121116 % 128;
                                                int i18111121117 = i18111121116 % 2;
                                                i22 = 1;
                                                i23 = 1;
                                                if ((i23 ^ 1) != i22) {
                                                    int i1811111111111111111111111118 = f62085b;
                                                    int i1811111111111111111111111119 = i1811111111111111111111111118 ^ 7;
                                                    int i18111111111111111111111111110 = ((i1811111111111111111111111118 & 7) | i1811111111111111111111111119) << i22;
                                                    int i18111111111111111111111111111 = -i1811111111111111111111111119;
                                                    i32 = (i18111111111111111111111111110 ^ i18111111111111111111111111111) + ((i18111111111111111111111111110 & i18111111111111111111111111111) << i22);
                                                    f62084a = i32 % 128;
                                                    if (i32 % 2 != 0) {
                                                        i27 = 1;
                                                        i28 = 0;
                                                    } else {
                                                        i27 = 1;
                                                        i28 = 1;
                                                    }
                                                } else if (cCharAt == '.') {
                                                    int i18111111111111111111111111112 = f62085b;
                                                    int i18111111111111111111111111113 = (i18111111111111111111111111112 & 119) + (i18111111111111111111111111112 | 119);
                                                    f62084a = i18111111111111111111111111113 % 128;
                                                    int i18111111111111111111111111114 = i18111111111111111111111111113 % 2;
                                                    int i18111111111111111111111111115 = i18111111111111111111111111112 + 56;
                                                    i27 = 1;
                                                    int i1911111111111111111111111111111110 = (i18111111111111111111111111115 ^ (-1)) + (i18111111111111111111111111115 << 1);
                                                    f62084a = i1911111111111111111111111111111110 % 128;
                                                    int i1911111111111111111111111111111111 = i1911111111111111111111111111111110 % 2;
                                                    i28 = 1;
                                                } else {
                                                    i27 = 1;
                                                    int i1911111111111111111111111111111112 = f62084a;
                                                    int i1911111111111111111111111111111113 = ((i1911111111111111111111111111111112 | 45) << 1) - (i1911111111111111111111111111111112 ^ 45);
                                                    f62085b = i1911111111111111111111111111111113 % 128;
                                                    int i1911111111111111111111111111111114 = i1911111111111111111111111111111113 % 2;
                                                    i28 = 0;
                                                }
                                                if ((i28 ^ 1) != i27) {
                                                    i29 = f62085b;
                                                    int i1911111111111111111111111111111115 = ((i29 & (-28)) | ((~i29) & 27)) + ((i29 & 27) << i27);
                                                    i30 = i1911111111111111111111111111111115 % 128;
                                                    f62084a = i30;
                                                    int i1911111111111111111111111111111116 = i1911111111111111111111111111111115 % 2;
                                                    if (cCharAt == ':') {
                                                        int i1911111111111111111111111111111117 = (-2) - ((-1) ^ (((i29 | 98) << i27) - (i29 ^ 98)));
                                                        int i1911111111111111111111111111111118 = i1911111111111111111111111111111117 % 128;
                                                        f62084a = i1911111111111111111111111111111118;
                                                        int i1911111111111111111111111111111119 = i1911111111111111111111111111111117 % 2;
                                                        int i2011111111111111112 = (i1911111111111111111111111111111118 | 15) << 1;
                                                        int i2011111111111111113 = -(i1911111111111111111111111111111118 ^ 15);
                                                        i31 = (i2011111111111111112 ^ i2011111111111111113) + ((i2011111111111111113 & i2011111111111111112) << 1);
                                                        f62085b = i31 % 128;
                                                        if (i31 % 2 == 0) {
                                                            int i2011111111111111114 = 83 / 0;
                                                        }
                                                        return Integer.valueOf(i15);
                                                    }
                                                    int i2011111111111111115 = (-2) - (((i30 & 118) + (i30 | 118)) ^ (-1));
                                                    f62085b = i2011111111111111115 % 128;
                                                    int i2011111111111111116 = i2011111111111111115 % 2;
                                                }
                                            }
                                            z10 = false;
                                            if (!z10) {
                                                if ('A' <= cCharAt) {
                                                    i35 = f62084a;
                                                    int i141111110 = (-2) - (((i35 ^ 24) + ((i35 & 24) << 1)) ^ (-1));
                                                    i36 = i141111110 % 128;
                                                    f62085b = i36;
                                                    int i141111111 = i141111110 % 2;
                                                    if (cCharAt < '[') {
                                                        int i141111112 = i36 ^ 91;
                                                        int i15111111110 = ((i36 & 91) | i141111112) << 1;
                                                        int i15111111111 = -i141111112;
                                                        int i15111111112 = ((i15111111110 | i15111111111) << 1) - (i15111111111 ^ i15111111110);
                                                        f62084a = i15111111112 % 128;
                                                        int i15111111113 = i15111111112 % 2;
                                                        int i15111111114 = (((i36 & (-100)) | ((~i36) & 99)) - (~(-(-((i36 & 99) << 1))))) - 1;
                                                        f62084a = i15111111114 % 128;
                                                        int i15111111115 = i15111111114 % 2;
                                                    } else {
                                                        int i15111111116 = i35 + 85;
                                                        f62085b = i15111111116 % 128;
                                                        int i15111111117 = i15111111116 % 2;
                                                    }
                                                }
                                                if ('0' <= cCharAt) {
                                                    i34 = f62084a;
                                                    int i15111111118 = i34 & 9;
                                                    int i15111111119 = (i34 ^ 9) | i15111111118;
                                                    int i16111111116 = (i15111111118 & i15111111119) + (i15111111118 | i15111111119);
                                                    f62085b = i16111111116 % 128;
                                                    int i16111111117 = i16111111116 % 2;
                                                    if (cCharAt < ':') {
                                                        int i16111111118 = i34 & 107;
                                                        int i16111111119 = (((i34 ^ 107) | i16111111118) << 1) - ((~i16111111118) & (i34 | 107));
                                                        f62085b = i16111111119 % 128;
                                                        int i161218 = i16111111119 % 2;
                                                        int i161219 = (i34 ^ 57) + ((i34 & 57) << 1);
                                                        f62085b = i161219 % 128;
                                                        int i1612110 = i161219 % 2;
                                                        int i161111111110 = f62085b;
                                                        int i161111111111 = i161111111110 & 119;
                                                        int i161111111112 = ((i161111111110 ^ 119) | i161111111111) << 1;
                                                        int i171121111115 = -((~i161111111111) & (i161111111110 | 119));
                                                        int i171121111116 = (i161111111112 & i171121111115) + (i161111111112 | i171121111115);
                                                        f62084a = i171121111116 % 128;
                                                        int i171121111117 = i171121111116 % 2;
                                                        int i171121111118 = i161111111110 + 37;
                                                        f62084a = i171121111118 % 128;
                                                        int i171121111119 = i171121111118 % 2;
                                                        i26 = 2;
                                                        int i1711111111111115 = f62084a + 89;
                                                        int i1711111111111116 = i1711111111111115 % 128;
                                                        f62085b = i1711111111111116;
                                                        int i1711111111111117 = i1711111111111115 % i26;
                                                        int i1711111111111118 = i1711111111111116 & 73;
                                                        int i1711111111111119 = -(-((i1711111111111116 ^ 73) | i1711111111111118));
                                                        int i18111121118 = (i1711111111111118 & i1711111111111119) + (i1711111111111118 | i1711111111111119);
                                                        f62084a = i18111121118 % 128;
                                                        int i18111121119 = i18111121118 % 2;
                                                        i22 = 1;
                                                        i23 = 1;
                                                        if ((i23 ^ 1) != i22) {
                                                            int i18111111111111111111111111116 = f62085b;
                                                            int i18111111111111111111111111117 = i18111111111111111111111111116 ^ 7;
                                                            int i18111111111111111111111111118 = ((i18111111111111111111111111116 & 7) | i18111111111111111111111111117) << i22;
                                                            int i18111111111111111111111111119 = -i18111111111111111111111111117;
                                                            i32 = (i18111111111111111111111111118 ^ i18111111111111111111111111119) + ((i18111111111111111111111111118 & i18111111111111111111111111119) << i22);
                                                            f62084a = i32 % 128;
                                                            if (i32 % 2 != 0) {
                                                                i27 = 1;
                                                                i28 = 0;
                                                            } else {
                                                                i27 = 1;
                                                                i28 = 1;
                                                            }
                                                        } else if (cCharAt == '.') {
                                                            int i181111111111111111111111111110 = f62085b;
                                                            int i181111111111111111111111111111 = (i181111111111111111111111111110 & 119) + (i181111111111111111111111111110 | 119);
                                                            f62084a = i181111111111111111111111111111 % 128;
                                                            int i181111111111111111111111111112 = i181111111111111111111111111111 % 2;
                                                            int i181111111111111111111111111113 = i181111111111111111111111111110 + 56;
                                                            i27 = 1;
                                                            int i19111111111111111111111111111111110 = (i181111111111111111111111111113 ^ (-1)) + (i181111111111111111111111111113 << 1);
                                                            f62084a = i19111111111111111111111111111111110 % 128;
                                                            int i19111111111111111111111111111111111 = i19111111111111111111111111111111110 % 2;
                                                            i28 = 1;
                                                        } else {
                                                            i27 = 1;
                                                            int i19111111111111111111111111111111112 = f62084a;
                                                            int i19111111111111111111111111111111113 = ((i19111111111111111111111111111111112 | 45) << 1) - (i19111111111111111111111111111111112 ^ 45);
                                                            f62085b = i19111111111111111111111111111111113 % 128;
                                                            int i19111111111111111111111111111111114 = i19111111111111111111111111111111113 % 2;
                                                            i28 = 0;
                                                        }
                                                        if ((i28 ^ 1) != i27) {
                                                            i29 = f62085b;
                                                            int i19111111111111111111111111111111115 = ((i29 & (-28)) | ((~i29) & 27)) + ((i29 & 27) << i27);
                                                            i30 = i19111111111111111111111111111111115 % 128;
                                                            f62084a = i30;
                                                            int i19111111111111111111111111111111116 = i19111111111111111111111111111111115 % 2;
                                                            if (cCharAt == ':') {
                                                                int i19111111111111111111111111111111117 = (-2) - ((-1) ^ (((i29 | 98) << i27) - (i29 ^ 98)));
                                                                int i19111111111111111111111111111111118 = i19111111111111111111111111111111117 % 128;
                                                                f62084a = i19111111111111111111111111111111118;
                                                                int i19111111111111111111111111111111119 = i19111111111111111111111111111111117 % 2;
                                                                int i2011111111111111117 = (i19111111111111111111111111111111118 | 15) << 1;
                                                                int i2011111111111111118 = -(i19111111111111111111111111111111118 ^ 15);
                                                                i31 = (i2011111111111111117 ^ i2011111111111111118) + ((i2011111111111111118 & i2011111111111111117) << 1);
                                                                f62085b = i31 % 128;
                                                                if (i31 % 2 == 0) {
                                                                    int i2011111111111111119 = 83 / 0;
                                                                }
                                                                return Integer.valueOf(i15);
                                                            }
                                                            int i20111111111111111110 = (-2) - (((i30 & 118) + (i30 | 118)) ^ (-1));
                                                            f62085b = i20111111111111111110 % 128;
                                                            int i20111111111111111111 = i20111111111111111110 % 2;
                                                        }
                                                    } else {
                                                        int i202111 = i34 & 113;
                                                        int i202112 = (((i34 ^ 113) | i202111) << 1) - ((i34 | 113) & (~i202111));
                                                        f62085b = i202112 % 128;
                                                        int i202113 = i202112 % 2;
                                                    }
                                                }
                                                if (cCharAt == '+') {
                                                    int i2012118 = f62084a;
                                                    int i2012119 = i2012118 ^ 97;
                                                    int i2111111111111111110 = (i2012118 & 97) << 1;
                                                    int i2111111111111111111 = (i2012119 ^ i2111111111111111110) + ((i2012119 & i2111111111111111110) << 1);
                                                    f62085b = i2111111111111111111 % 128;
                                                    int i2111111111111111112 = i2111111111111111111 % 2;
                                                    int i2111111111111111113 = ((i2012118 & 31) - (~(i2012118 | 31))) - 1;
                                                    f62085b = i2111111111111111113 % 128;
                                                    i26 = 2;
                                                    int i2111111111111111114 = i2111111111111111113 % 2;
                                                    int i17111111111111110 = f62084a + 89;
                                                    int i17111111111111111 = i17111111111111110 % 128;
                                                    f62085b = i17111111111111111;
                                                    int i17111111111111112 = i17111111111111110 % i26;
                                                    int i17111111111111113 = i17111111111111111 & 73;
                                                    int i17111111111111114 = -(-((i17111111111111111 ^ 73) | i17111111111111113));
                                                    int i181111211110 = (i17111111111111113 & i17111111111111114) + (i17111111111111113 | i17111111111111114);
                                                    f62084a = i181111211110 % 128;
                                                    int i181111211111 = i181111211110 % 2;
                                                    i22 = 1;
                                                    i23 = 1;
                                                } else if (cCharAt == '-') {
                                                    int i2111111111111111115 = f62085b;
                                                    i24 = i2111111111111111115 + 19;
                                                    f62084a = i24 % 128;
                                                    if (i24 % 2 != 0) {
                                                        i25 = 0;
                                                    } else {
                                                        i25 = 1;
                                                    }
                                                    int i2111111111111111116 = ((i2111111111111111115 & 19) - (~(i2111111111111111115 | 19))) - 1;
                                                    f62084a = i2111111111111111116 % 128;
                                                    int i2111111111111111117 = i2111111111111111116 % 2;
                                                    i23 = i25;
                                                    i22 = 1;
                                                } else {
                                                    int i2111111111111111118 = f62085b;
                                                    int i2111111111111111119 = (i2111111111111111118 & 89) + (i2111111111111111118 | 89);
                                                    f62084a = i2111111111111111119 % 128;
                                                    int i22111111111 = i2111111111111111119 % 2;
                                                    i22 = 1;
                                                    i23 = 0;
                                                }
                                                if ((i23 ^ 1) != i22) {
                                                    int i181111111111111111111111111114 = f62085b;
                                                    int i181111111111111111111111111115 = i181111111111111111111111111114 ^ 7;
                                                    int i181111111111111111111111111116 = ((i181111111111111111111111111114 & 7) | i181111111111111111111111111115) << i22;
                                                    int i181111111111111111111111111117 = -i181111111111111111111111111115;
                                                    i32 = (i181111111111111111111111111116 ^ i181111111111111111111111111117) + ((i181111111111111111111111111116 & i181111111111111111111111111117) << i22);
                                                    f62084a = i32 % 128;
                                                    if (i32 % 2 != 0) {
                                                        i27 = 1;
                                                        i28 = 0;
                                                    } else {
                                                        i27 = 1;
                                                        i28 = 1;
                                                    }
                                                } else if (cCharAt == '.') {
                                                    int i181111111111111111111111111118 = f62085b;
                                                    int i181111111111111111111111111119 = (i181111111111111111111111111118 & 119) + (i181111111111111111111111111118 | 119);
                                                    f62084a = i181111111111111111111111111119 % 128;
                                                    int i1811111111111111111111111111110 = i181111111111111111111111111119 % 2;
                                                    int i1811111111111111111111111111111 = i181111111111111111111111111118 + 56;
                                                    i27 = 1;
                                                    int i191111111111111111111111111111111110 = (i1811111111111111111111111111111 ^ (-1)) + (i1811111111111111111111111111111 << 1);
                                                    f62084a = i191111111111111111111111111111111110 % 128;
                                                    int i191111111111111111111111111111111111 = i191111111111111111111111111111111110 % 2;
                                                    i28 = 1;
                                                } else {
                                                    i27 = 1;
                                                    int i191111111111111111111111111111111112 = f62084a;
                                                    int i191111111111111111111111111111111113 = ((i191111111111111111111111111111111112 | 45) << 1) - (i191111111111111111111111111111111112 ^ 45);
                                                    f62085b = i191111111111111111111111111111111113 % 128;
                                                    int i191111111111111111111111111111111114 = i191111111111111111111111111111111113 % 2;
                                                    i28 = 0;
                                                }
                                                if ((i28 ^ 1) != i27) {
                                                    i29 = f62085b;
                                                    int i191111111111111111111111111111111115 = ((i29 & (-28)) | ((~i29) & 27)) + ((i29 & 27) << i27);
                                                    i30 = i191111111111111111111111111111111115 % 128;
                                                    f62084a = i30;
                                                    int i191111111111111111111111111111111116 = i191111111111111111111111111111111115 % 2;
                                                    if (cCharAt == ':') {
                                                        int i191111111111111111111111111111111117 = (-2) - ((-1) ^ (((i29 | 98) << i27) - (i29 ^ 98)));
                                                        int i191111111111111111111111111111111118 = i191111111111111111111111111111111117 % 128;
                                                        f62084a = i191111111111111111111111111111111118;
                                                        int i191111111111111111111111111111111119 = i191111111111111111111111111111111117 % 2;
                                                        int i20111111111111111112 = (i191111111111111111111111111111111118 | 15) << 1;
                                                        int i20111111111111111113 = -(i191111111111111111111111111111111118 ^ 15);
                                                        i31 = (i20111111111111111112 ^ i20111111111111111113) + ((i20111111111111111113 & i20111111111111111112) << 1);
                                                        f62085b = i31 % 128;
                                                        if (i31 % 2 == 0) {
                                                            int i20111111111111111114 = 83 / 0;
                                                        }
                                                        return Integer.valueOf(i15);
                                                    }
                                                    int i20111111111111111115 = (-2) - (((i30 & 118) + (i30 | 118)) ^ (-1));
                                                    f62085b = i20111111111111111115 % 128;
                                                    int i20111111111111111116 = i20111111111111111115 % 2;
                                                }
                                            } else {
                                                int i22111111112 = f62085b;
                                                int i22111111113 = i22111111112 & 101;
                                                int i22111111114 = i22111111112 | 101;
                                                int i22111111115 = (i22111111113 & i22111111114) + (i22111111114 | i22111111113);
                                                int i22111111116 = i22111111115 % 128;
                                                f62084a = i22111111116;
                                                int i22111111117 = i22111111115 % 2;
                                                int i22111111118 = i22111111116 & 33;
                                                int i22111111119 = i22111111118 + ((i22111111116 ^ 33) | i22111111118);
                                                f62085b = i22111111119 % 128;
                                                int i2227 = i22111111119 % 2;
                                            }
                                            int i231112 = f62085b;
                                            int i231113 = ~i231112;
                                            i33 = (((i231112 | 117) << 1) - (~(-((i231112 & (-118)) | (i231113 & 117))))) - 1;
                                            f62084a = i33 % 128;
                                            if (i33 % 2 != 0) {
                                                z11 = false;
                                            } else {
                                                z11 = true;
                                            }
                                            int i231114 = (((i231113 & 73) | (i231112 & (-74))) - (~(-(-((i231112 & 73) << 1))))) - 1;
                                            f62084a = i231114 % 128;
                                            int i231115 = i231114 % 2;
                                            if (z11) {
                                                int i161111111113 = f62085b;
                                                int i161111111114 = i161111111113 & 119;
                                                int i161111111115 = ((i161111111113 ^ 119) | i161111111114) << 1;
                                                int i1711211111110 = -((~i161111111114) & (i161111111113 | 119));
                                                int i1711211111111 = (i161111111115 & i1711211111110) + (i161111111115 | i1711211111110);
                                                f62084a = i1711211111111 % 128;
                                                int i1711211111112 = i1711211111111 % 2;
                                                int i1711211111113 = i161111111113 + 37;
                                                f62084a = i1711211111113 % 128;
                                                int i1711211111114 = i1711211111113 % 2;
                                                i26 = 2;
                                            } else {
                                                if (cCharAt == '+') {
                                                    int i20121110 = f62084a;
                                                    int i20121111 = i20121110 ^ 97;
                                                    int i21111111111111111110 = (i20121110 & 97) << 1;
                                                    int i21111111111111111111 = (i20121111 ^ i21111111111111111110) + ((i20121111 & i21111111111111111110) << 1);
                                                    f62085b = i21111111111111111111 % 128;
                                                    int i21111111111111111112 = i21111111111111111111 % 2;
                                                    int i21111111111111111113 = ((i20121110 & 31) - (~(i20121110 | 31))) - 1;
                                                    f62085b = i21111111111111111113 % 128;
                                                    i26 = 2;
                                                    int i21111111111111111114 = i21111111111111111113 % 2;
                                                } else if (cCharAt == '-') {
                                                    int i21111111111111111115 = f62085b;
                                                    i24 = i21111111111111111115 + 19;
                                                    f62084a = i24 % 128;
                                                    if (i24 % 2 != 0) {
                                                        i25 = 0;
                                                    } else {
                                                        i25 = 1;
                                                    }
                                                    int i21111111111111111116 = ((i21111111111111111115 & 19) - (~(i21111111111111111115 | 19))) - 1;
                                                    f62084a = i21111111111111111116 % 128;
                                                    int i21111111111111111117 = i21111111111111111116 % 2;
                                                    i23 = i25;
                                                    i22 = 1;
                                                } else {
                                                    int i21111111111111111118 = f62085b;
                                                    int i21111111111111111119 = (i21111111111111111118 & 89) + (i21111111111111111118 | 89);
                                                    f62084a = i21111111111111111119 % 128;
                                                    int i221111111110 = i21111111111111111119 % 2;
                                                    i22 = 1;
                                                    i23 = 0;
                                                }
                                                if ((i23 ^ 1) != i22) {
                                                    int i1811111111111111111111111111112 = f62085b;
                                                    int i1811111111111111111111111111113 = i1811111111111111111111111111112 ^ 7;
                                                    int i1811111111111111111111111111114 = ((i1811111111111111111111111111112 & 7) | i1811111111111111111111111111113) << i22;
                                                    int i1811111111111111111111111111115 = -i1811111111111111111111111111113;
                                                    i32 = (i1811111111111111111111111111114 ^ i1811111111111111111111111111115) + ((i1811111111111111111111111111114 & i1811111111111111111111111111115) << i22);
                                                    f62084a = i32 % 128;
                                                    if (i32 % 2 != 0) {
                                                        i27 = 1;
                                                        i28 = 0;
                                                    } else {
                                                        i27 = 1;
                                                        i28 = 1;
                                                    }
                                                } else if (cCharAt == '.') {
                                                    int i1811111111111111111111111111116 = f62085b;
                                                    int i1811111111111111111111111111117 = (i1811111111111111111111111111116 & 119) + (i1811111111111111111111111111116 | 119);
                                                    f62084a = i1811111111111111111111111111117 % 128;
                                                    int i1811111111111111111111111111118 = i1811111111111111111111111111117 % 2;
                                                    int i1811111111111111111111111111119 = i1811111111111111111111111111116 + 56;
                                                    i27 = 1;
                                                    int i1911111111111111111111111111111111110 = (i1811111111111111111111111111119 ^ (-1)) + (i1811111111111111111111111111119 << 1);
                                                    f62084a = i1911111111111111111111111111111111110 % 128;
                                                    int i1911111111111111111111111111111111111 = i1911111111111111111111111111111111110 % 2;
                                                    i28 = 1;
                                                } else {
                                                    i27 = 1;
                                                    int i1911111111111111111111111111111111112 = f62084a;
                                                    int i1911111111111111111111111111111111113 = ((i1911111111111111111111111111111111112 | 45) << 1) - (i1911111111111111111111111111111111112 ^ 45);
                                                    f62085b = i1911111111111111111111111111111111113 % 128;
                                                    int i1911111111111111111111111111111111114 = i1911111111111111111111111111111111113 % 2;
                                                    i28 = 0;
                                                }
                                                if ((i28 ^ 1) != i27) {
                                                    i29 = f62085b;
                                                    int i1911111111111111111111111111111111115 = ((i29 & (-28)) | ((~i29) & 27)) + ((i29 & 27) << i27);
                                                    i30 = i1911111111111111111111111111111111115 % 128;
                                                    f62084a = i30;
                                                    int i1911111111111111111111111111111111116 = i1911111111111111111111111111111111115 % 2;
                                                    if (cCharAt == ':') {
                                                        int i1911111111111111111111111111111111117 = (-2) - ((-1) ^ (((i29 | 98) << i27) - (i29 ^ 98)));
                                                        int i1911111111111111111111111111111111118 = i1911111111111111111111111111111111117 % 128;
                                                        f62084a = i1911111111111111111111111111111111118;
                                                        int i1911111111111111111111111111111111119 = i1911111111111111111111111111111111117 % 2;
                                                        int i20111111111111111117 = (i1911111111111111111111111111111111118 | 15) << 1;
                                                        int i20111111111111111118 = -(i1911111111111111111111111111111111118 ^ 15);
                                                        i31 = (i20111111111111111117 ^ i20111111111111111118) + ((i20111111111111111118 & i20111111111111111117) << 1);
                                                        f62085b = i31 % 128;
                                                        if (i31 % 2 == 0) {
                                                            int i20111111111111111119 = 83 / 0;
                                                        }
                                                        return Integer.valueOf(i15);
                                                    }
                                                    int i201111111111111111110 = (-2) - (((i30 & 118) + (i30 | 118)) ^ (-1));
                                                    f62085b = i201111111111111111110 % 128;
                                                    int i201111111111111111111 = i201111111111111111110 % 2;
                                                }
                                            }
                                            int i17111111111111115 = f62084a + 89;
                                            int i17111111111111116 = i17111111111111115 % 128;
                                            f62085b = i17111111111111116;
                                            int i17111111111111117 = i17111111111111115 % i26;
                                            int i17111111111111118 = i17111111111111116 & 73;
                                            int i17111111111111119 = -(-((i17111111111111116 ^ 73) | i17111111111111118));
                                            int i181111211112 = (i17111111111111118 & i17111111111111119) + (i17111111111111118 | i17111111111111119);
                                            f62084a = i181111211112 % 128;
                                            int i181111211113 = i181111211112 % 2;
                                            i22 = 1;
                                            i23 = 1;
                                            if ((i23 ^ 1) != i22) {
                                                int i18111111111111111111111111111110 = f62085b;
                                                int i18111111111111111111111111111111 = i18111111111111111111111111111110 ^ 7;
                                                int i18111111111111111111111111111112 = ((i18111111111111111111111111111110 & 7) | i18111111111111111111111111111111) << i22;
                                                int i18111111111111111111111111111113 = -i18111111111111111111111111111111;
                                                i32 = (i18111111111111111111111111111112 ^ i18111111111111111111111111111113) + ((i18111111111111111111111111111112 & i18111111111111111111111111111113) << i22);
                                                f62084a = i32 % 128;
                                                if (i32 % 2 != 0) {
                                                    i27 = 1;
                                                    i28 = 0;
                                                } else {
                                                    i27 = 1;
                                                    i28 = 1;
                                                }
                                            } else if (cCharAt == '.') {
                                                int i18111111111111111111111111111114 = f62085b;
                                                int i18111111111111111111111111111115 = (i18111111111111111111111111111114 & 119) + (i18111111111111111111111111111114 | 119);
                                                f62084a = i18111111111111111111111111111115 % 128;
                                                int i18111111111111111111111111111116 = i18111111111111111111111111111115 % 2;
                                                int i18111111111111111111111111111117 = i18111111111111111111111111111114 + 56;
                                                i27 = 1;
                                                int i19111111111111111111111111111111111110 = (i18111111111111111111111111111117 ^ (-1)) + (i18111111111111111111111111111117 << 1);
                                                f62084a = i19111111111111111111111111111111111110 % 128;
                                                int i19111111111111111111111111111111111111 = i19111111111111111111111111111111111110 % 2;
                                                i28 = 1;
                                            } else {
                                                i27 = 1;
                                                int i19111111111111111111111111111111111112 = f62084a;
                                                int i19111111111111111111111111111111111113 = ((i19111111111111111111111111111111111112 | 45) << 1) - (i19111111111111111111111111111111111112 ^ 45);
                                                f62085b = i19111111111111111111111111111111111113 % 128;
                                                int i19111111111111111111111111111111111114 = i19111111111111111111111111111111111113 % 2;
                                                i28 = 0;
                                            }
                                            if ((i28 ^ 1) != i27) {
                                                i29 = f62085b;
                                                int i19111111111111111111111111111111111115 = ((i29 & (-28)) | ((~i29) & 27)) + ((i29 & 27) << i27);
                                                i30 = i19111111111111111111111111111111111115 % 128;
                                                f62084a = i30;
                                                int i19111111111111111111111111111111111116 = i19111111111111111111111111111111111115 % 2;
                                                if (cCharAt == ':') {
                                                    int i19111111111111111111111111111111111117 = (-2) - ((-1) ^ (((i29 | 98) << i27) - (i29 ^ 98)));
                                                    int i19111111111111111111111111111111111118 = i19111111111111111111111111111111111117 % 128;
                                                    f62084a = i19111111111111111111111111111111111118;
                                                    int i19111111111111111111111111111111111119 = i19111111111111111111111111111111111117 % 2;
                                                    int i201111111111111111112 = (i19111111111111111111111111111111111118 | 15) << 1;
                                                    int i201111111111111111113 = -(i19111111111111111111111111111111111118 ^ 15);
                                                    i31 = (i201111111111111111112 ^ i201111111111111111113) + ((i201111111111111111113 & i201111111111111111112) << 1);
                                                    f62085b = i31 % 128;
                                                    if (i31 % 2 == 0) {
                                                        int i201111111111111111114 = 83 / 0;
                                                    }
                                                    return Integer.valueOf(i15);
                                                }
                                                int i201111111111111111115 = (-2) - (((i30 & 118) + (i30 | 118)) ^ (-1));
                                                f62085b = i201111111111111111115 % 128;
                                                int i201111111111111111116 = i201111111111111111115 % 2;
                                            }
                                        }
                                        int i245 = f62084a;
                                        i16 = ((i245 ^ 34) + ((i245 & 34) << 1)) - 1;
                                        f62085b = i16 % 128;
                                        if (i16 % 2 == 0) {
                                            throw null;
                                        }
                                    } else {
                                        int i10110 = -(-(iIntValue7 * (-489)));
                                        int i10111 = 491 & i10110;
                                        int i10112 = (i10110 ^ 491) | i10111;
                                        int i111110 = (i10111 & i10112) + (i10112 | i10111);
                                        int i111111 = ((-2) & i70) | (i68 & 1);
                                        int i111112 = (-2) & i68;
                                        int i111113 = (i111111 & i111112) | (i111111 ^ i111112);
                                        int i111114 = -(~(((i111113 & i68) | (i70 & i111113) | ((~i111113) & i68)) * (-490)));
                                        int i111115 = ((i111110 & i111114) + (i111114 | i111110)) - 1;
                                        int i111116 = (i88 & (-2)) | ((~i88) & 1);
                                        int i111117 = i88 & 1;
                                        int i111118 = ~((i111116 & i111117) | (i111116 ^ i111117));
                                        int i111119 = i88 & iIntValue7;
                                        int i121110 = (iIntValue7 | i88) & (~i111119);
                                        int i121111 = (i121110 & i111119) | (i121110 ^ i111119);
                                        int i121112 = ~i121111;
                                        int i121113 = (i121111 | i121112) & i121112;
                                        int i121114 = ((~i121113) & i111118) | ((~i111118) & i121113);
                                        int i121115 = i111118 & i121113;
                                        int i121116 = -(-(((i121115 & i121114) | (i121114 ^ i121115)) * 490));
                                        int i121117 = (i111115 & i121116) + (i121116 | i111115);
                                        int i121118 = f62084a + 64;
                                        int i121119 = (i121118 ^ (-1)) + (i121118 << 1);
                                        f62085b = i121119 % 128;
                                        int i131112 = i121119 % 2;
                                        while (i15 < iIntValue8) {
                                            int i131113 = f62084a;
                                            int i131114 = i131113 & 73;
                                            i17 = (((i131113 ^ 73) | i131114) << 1) - ((i131113 | 73) & (~i131114));
                                            f62085b = i17 % 128;
                                            if (i17 % 2 == 0) {
                                                int i131115 = i15 & 12;
                                                int i131116 = -(-((i15 ^ 12) | i131115));
                                                i18 = 1;
                                                int i131117 = ((i131115 | i131116) << 1) - (i131115 ^ i131116);
                                                int i131118 = i131117 ^ 73;
                                                int i131119 = ((i131117 & 73) | i131118) << 1;
                                                int i13121 = -i131118;
                                                i19 = (i131119 ^ i13121) + ((i13121 & i131119) << 1);
                                                cCharAt = str3.charAt(i15);
                                                if (1 <= cCharAt) {
                                                    int i1311110 = f62084a;
                                                    int i141111113 = i1311110 & 35;
                                                    int i141111114 = ((i1311110 ^ 35) | i141111113) << i18;
                                                    int i141111115 = -((i1311110 | 35) & (~i141111113));
                                                    int i141111116 = (i141111114 ^ i141111115) + ((i141111115 & i141111114) << i18);
                                                    i20 = i141111116 % 128;
                                                    f62085b = i20;
                                                    int i1411126 = i141111116 % 2;
                                                    if (cCharAt < '{') {
                                                        int i1411127 = ((i20 ^ 31) | (i20 & 31)) << 1;
                                                        int i1411128 = -(((~i20) & 31) | (i20 & (-32)));
                                                        i21 = (i1411127 ^ i1411128) + ((i1411128 & i1411127) << 1);
                                                        f62084a = i21 % 128;
                                                        if (i21 % 2 != 0) {
                                                            z10 = true;
                                                        }
                                                    }
                                                }
                                                if (!z10) {
                                                    if ('A' <= cCharAt) {
                                                        i35 = f62084a;
                                                        int i141111117 = (-2) - (((i35 ^ 24) + ((i35 & 24) << 1)) ^ (-1));
                                                        i36 = i141111117 % 128;
                                                        f62085b = i36;
                                                        int i141111118 = i141111117 % 2;
                                                        if (cCharAt < '[') {
                                                            int i141111119 = i36 ^ 91;
                                                            int i151111111110 = ((i36 & 91) | i141111119) << 1;
                                                            int i151111111111 = -i141111119;
                                                            int i151111111112 = ((i151111111110 | i151111111111) << 1) - (i151111111111 ^ i151111111110);
                                                            f62084a = i151111111112 % 128;
                                                            int i151111111113 = i151111111112 % 2;
                                                            int i151111111114 = (((i36 & (-100)) | ((~i36) & 99)) - (~(-(-((i36 & 99) << 1))))) - 1;
                                                            f62084a = i151111111114 % 128;
                                                            int i151111111115 = i151111111114 % 2;
                                                        } else {
                                                            int i151111111116 = i35 + 85;
                                                            f62085b = i151111111116 % 128;
                                                            int i151111111117 = i151111111116 % 2;
                                                        }
                                                    }
                                                    if ('0' <= cCharAt) {
                                                        i34 = f62084a;
                                                        int i151111111118 = i34 & 9;
                                                        int i151111111119 = (i34 ^ 9) | i151111111118;
                                                        int i161111111116 = (i151111111118 & i151111111119) + (i151111111118 | i151111111119);
                                                        f62085b = i161111111116 % 128;
                                                        int i161111111117 = i161111111116 % 2;
                                                        if (cCharAt < ':') {
                                                            int i161111111118 = i34 & 107;
                                                            int i161111111119 = (((i34 ^ 107) | i161111111118) << 1) - ((~i161111111118) & (i34 | 107));
                                                            f62085b = i161111111119 % 128;
                                                            int i1612111 = i161111111119 % 2;
                                                            int i1612112 = (i34 ^ 57) + ((i34 & 57) << 1);
                                                            f62085b = i1612112 % 128;
                                                            int i1612113 = i1612112 % 2;
                                                            int i1611111111110 = f62085b;
                                                            int i1611111111111 = i1611111111110 & 119;
                                                            int i1611111111112 = ((i1611111111110 ^ 119) | i1611111111111) << 1;
                                                            int i1711211111115 = -((~i1611111111111) & (i1611111111110 | 119));
                                                            int i1711211111116 = (i1611111111112 & i1711211111115) + (i1611111111112 | i1711211111115);
                                                            f62084a = i1711211111116 % 128;
                                                            int i1711211111117 = i1711211111116 % 2;
                                                            int i1711211111118 = i1611111111110 + 37;
                                                            f62084a = i1711211111118 % 128;
                                                            int i1711211111119 = i1711211111118 % 2;
                                                            i26 = 2;
                                                            int i171111111111111110 = f62084a + 89;
                                                            int i171111111111111111 = i171111111111111110 % 128;
                                                            f62085b = i171111111111111111;
                                                            int i171111111111111112 = i171111111111111110 % i26;
                                                            int i171111111111111113 = i171111111111111111 & 73;
                                                            int i171111111111111114 = -(-((i171111111111111111 ^ 73) | i171111111111111113));
                                                            int i181111211114 = (i171111111111111113 & i171111111111111114) + (i171111111111111113 | i171111111111111114);
                                                            f62084a = i181111211114 % 128;
                                                            int i181111211115 = i181111211114 % 2;
                                                            i22 = 1;
                                                            i23 = 1;
                                                            if ((i23 ^ 1) != i22) {
                                                                int i18111111111111111111111111111118 = f62085b;
                                                                int i18111111111111111111111111111119 = i18111111111111111111111111111118 ^ 7;
                                                                int i181111111111111111111111111111110 = ((i18111111111111111111111111111118 & 7) | i18111111111111111111111111111119) << i22;
                                                                int i181111111111111111111111111111111 = -i18111111111111111111111111111119;
                                                                i32 = (i181111111111111111111111111111110 ^ i181111111111111111111111111111111) + ((i181111111111111111111111111111110 & i181111111111111111111111111111111) << i22);
                                                                f62084a = i32 % 128;
                                                                if (i32 % 2 != 0) {
                                                                    i27 = 1;
                                                                    i28 = 0;
                                                                } else {
                                                                    i27 = 1;
                                                                    i28 = 1;
                                                                }
                                                            } else if (cCharAt == '.') {
                                                                int i181111111111111111111111111111112 = f62085b;
                                                                int i181111111111111111111111111111113 = (i181111111111111111111111111111112 & 119) + (i181111111111111111111111111111112 | 119);
                                                                f62084a = i181111111111111111111111111111113 % 128;
                                                                int i181111111111111111111111111111114 = i181111111111111111111111111111113 % 2;
                                                                int i181111111111111111111111111111115 = i181111111111111111111111111111112 + 56;
                                                                i27 = 1;
                                                                int i191111111111111111111111111111111111110 = (i181111111111111111111111111111115 ^ (-1)) + (i181111111111111111111111111111115 << 1);
                                                                f62084a = i191111111111111111111111111111111111110 % 128;
                                                                int i191111111111111111111111111111111111111 = i191111111111111111111111111111111111110 % 2;
                                                                i28 = 1;
                                                            } else {
                                                                i27 = 1;
                                                                int i191111111111111111111111111111111111112 = f62084a;
                                                                int i191111111111111111111111111111111111113 = ((i191111111111111111111111111111111111112 | 45) << 1) - (i191111111111111111111111111111111111112 ^ 45);
                                                                f62085b = i191111111111111111111111111111111111113 % 128;
                                                                int i191111111111111111111111111111111111114 = i191111111111111111111111111111111111113 % 2;
                                                                i28 = 0;
                                                            }
                                                            if ((i28 ^ 1) != i27) {
                                                                i29 = f62085b;
                                                                int i191111111111111111111111111111111111115 = ((i29 & (-28)) | ((~i29) & 27)) + ((i29 & 27) << i27);
                                                                i30 = i191111111111111111111111111111111111115 % 128;
                                                                f62084a = i30;
                                                                int i191111111111111111111111111111111111116 = i191111111111111111111111111111111111115 % 2;
                                                                if (cCharAt == ':') {
                                                                    int i191111111111111111111111111111111111117 = (-2) - ((-1) ^ (((i29 | 98) << i27) - (i29 ^ 98)));
                                                                    int i191111111111111111111111111111111111118 = i191111111111111111111111111111111111117 % 128;
                                                                    f62084a = i191111111111111111111111111111111111118;
                                                                    int i191111111111111111111111111111111111119 = i191111111111111111111111111111111111117 % 2;
                                                                    int i201111111111111111117 = (i191111111111111111111111111111111111118 | 15) << 1;
                                                                    int i201111111111111111118 = -(i191111111111111111111111111111111111118 ^ 15);
                                                                    i31 = (i201111111111111111117 ^ i201111111111111111118) + ((i201111111111111111118 & i201111111111111111117) << 1);
                                                                    f62085b = i31 % 128;
                                                                    if (i31 % 2 == 0) {
                                                                        int i201111111111111111119 = 83 / 0;
                                                                    }
                                                                    return Integer.valueOf(i15);
                                                                }
                                                                int i2011111111111111111110 = (-2) - (((i30 & 118) + (i30 | 118)) ^ (-1));
                                                                f62085b = i2011111111111111111110 % 128;
                                                                int i2011111111111111111111 = i2011111111111111111110 % 2;
                                                            }
                                                        } else {
                                                            int i202114 = i34 & 113;
                                                            int i202115 = (((i34 ^ 113) | i202114) << 1) - ((i34 | 113) & (~i202114));
                                                            f62085b = i202115 % 128;
                                                            int i202116 = i202115 % 2;
                                                        }
                                                    }
                                                    if (cCharAt == '+') {
                                                        int i20121112 = f62084a;
                                                        int i20121113 = i20121112 ^ 97;
                                                        int i211111111111111111110 = (i20121112 & 97) << 1;
                                                        int i211111111111111111111 = (i20121113 ^ i211111111111111111110) + ((i20121113 & i211111111111111111110) << 1);
                                                        f62085b = i211111111111111111111 % 128;
                                                        int i211111111111111111112 = i211111111111111111111 % 2;
                                                        int i211111111111111111113 = ((i20121112 & 31) - (~(i20121112 | 31))) - 1;
                                                        f62085b = i211111111111111111113 % 128;
                                                        i26 = 2;
                                                        int i211111111111111111114 = i211111111111111111113 % 2;
                                                        int i171111111111111115 = f62084a + 89;
                                                        int i171111111111111116 = i171111111111111115 % 128;
                                                        f62085b = i171111111111111116;
                                                        int i171111111111111117 = i171111111111111115 % i26;
                                                        int i171111111111111118 = i171111111111111116 & 73;
                                                        int i171111111111111119 = -(-((i171111111111111116 ^ 73) | i171111111111111118));
                                                        int i181111211116 = (i171111111111111118 & i171111111111111119) + (i171111111111111118 | i171111111111111119);
                                                        f62084a = i181111211116 % 128;
                                                        int i181111211117 = i181111211116 % 2;
                                                        i22 = 1;
                                                        i23 = 1;
                                                    } else if (cCharAt == '-') {
                                                        int i211111111111111111115 = f62085b;
                                                        i24 = i211111111111111111115 + 19;
                                                        f62084a = i24 % 128;
                                                        if (i24 % 2 != 0) {
                                                            i25 = 0;
                                                        } else {
                                                            i25 = 1;
                                                        }
                                                        int i211111111111111111116 = ((i211111111111111111115 & 19) - (~(i211111111111111111115 | 19))) - 1;
                                                        f62084a = i211111111111111111116 % 128;
                                                        int i211111111111111111117 = i211111111111111111116 % 2;
                                                        i23 = i25;
                                                        i22 = 1;
                                                    } else {
                                                        int i211111111111111111118 = f62085b;
                                                        int i211111111111111111119 = (i211111111111111111118 & 89) + (i211111111111111111118 | 89);
                                                        f62084a = i211111111111111111119 % 128;
                                                        int i221111111111 = i211111111111111111119 % 2;
                                                        i22 = 1;
                                                        i23 = 0;
                                                    }
                                                    if ((i23 ^ 1) != i22) {
                                                        int i181111111111111111111111111111116 = f62085b;
                                                        int i181111111111111111111111111111117 = i181111111111111111111111111111116 ^ 7;
                                                        int i181111111111111111111111111111118 = ((i181111111111111111111111111111116 & 7) | i181111111111111111111111111111117) << i22;
                                                        int i181111111111111111111111111111119 = -i181111111111111111111111111111117;
                                                        i32 = (i181111111111111111111111111111118 ^ i181111111111111111111111111111119) + ((i181111111111111111111111111111118 & i181111111111111111111111111111119) << i22);
                                                        f62084a = i32 % 128;
                                                        if (i32 % 2 != 0) {
                                                            i27 = 1;
                                                            i28 = 0;
                                                        } else {
                                                            i27 = 1;
                                                            i28 = 1;
                                                        }
                                                    } else if (cCharAt == '.') {
                                                        int i1811111111111111111111111111111110 = f62085b;
                                                        int i1811111111111111111111111111111111 = (i1811111111111111111111111111111110 & 119) + (i1811111111111111111111111111111110 | 119);
                                                        f62084a = i1811111111111111111111111111111111 % 128;
                                                        int i1811111111111111111111111111111112 = i1811111111111111111111111111111111 % 2;
                                                        int i1811111111111111111111111111111113 = i1811111111111111111111111111111110 + 56;
                                                        i27 = 1;
                                                        int i1911111111111111111111111111111111111110 = (i1811111111111111111111111111111113 ^ (-1)) + (i1811111111111111111111111111111113 << 1);
                                                        f62084a = i1911111111111111111111111111111111111110 % 128;
                                                        int i1911111111111111111111111111111111111111 = i1911111111111111111111111111111111111110 % 2;
                                                        i28 = 1;
                                                    } else {
                                                        i27 = 1;
                                                        int i1911111111111111111111111111111111111112 = f62084a;
                                                        int i1911111111111111111111111111111111111113 = ((i1911111111111111111111111111111111111112 | 45) << 1) - (i1911111111111111111111111111111111111112 ^ 45);
                                                        f62085b = i1911111111111111111111111111111111111113 % 128;
                                                        int i1911111111111111111111111111111111111114 = i1911111111111111111111111111111111111113 % 2;
                                                        i28 = 0;
                                                    }
                                                    if ((i28 ^ 1) != i27) {
                                                        i29 = f62085b;
                                                        int i1911111111111111111111111111111111111115 = ((i29 & (-28)) | ((~i29) & 27)) + ((i29 & 27) << i27);
                                                        i30 = i1911111111111111111111111111111111111115 % 128;
                                                        f62084a = i30;
                                                        int i1911111111111111111111111111111111111116 = i1911111111111111111111111111111111111115 % 2;
                                                        if (cCharAt == ':') {
                                                            int i1911111111111111111111111111111111111117 = (-2) - ((-1) ^ (((i29 | 98) << i27) - (i29 ^ 98)));
                                                            int i1911111111111111111111111111111111111118 = i1911111111111111111111111111111111111117 % 128;
                                                            f62084a = i1911111111111111111111111111111111111118;
                                                            int i1911111111111111111111111111111111111119 = i1911111111111111111111111111111111111117 % 2;
                                                            int i2011111111111111111112 = (i1911111111111111111111111111111111111118 | 15) << 1;
                                                            int i2011111111111111111113 = -(i1911111111111111111111111111111111111118 ^ 15);
                                                            i31 = (i2011111111111111111112 ^ i2011111111111111111113) + ((i2011111111111111111113 & i2011111111111111111112) << 1);
                                                            f62085b = i31 % 128;
                                                            if (i31 % 2 == 0) {
                                                                int i2011111111111111111114 = 83 / 0;
                                                            }
                                                            return Integer.valueOf(i15);
                                                        }
                                                        int i2011111111111111111115 = (-2) - (((i30 & 118) + (i30 | 118)) ^ (-1));
                                                        f62085b = i2011111111111111111115 % 128;
                                                        int i2011111111111111111116 = i2011111111111111111115 % 2;
                                                    }
                                                } else {
                                                    int i221111111112 = f62085b;
                                                    int i221111111113 = i221111111112 & 101;
                                                    int i221111111114 = i221111111112 | 101;
                                                    int i221111111115 = (i221111111113 & i221111111114) + (i221111111114 | i221111111113);
                                                    int i221111111116 = i221111111115 % 128;
                                                    f62084a = i221111111116;
                                                    int i221111111117 = i221111111115 % 2;
                                                    int i221111111118 = i221111111116 & 33;
                                                    int i221111111119 = i221111111118 + ((i221111111116 ^ 33) | i221111111118);
                                                    f62085b = i221111111119 % 128;
                                                    int i2228 = i221111111119 % 2;
                                                }
                                                int i231116 = f62085b;
                                                int i231117 = ~i231116;
                                                i33 = (((i231116 | 117) << 1) - (~(-((i231116 & (-118)) | (i231117 & 117))))) - 1;
                                                f62084a = i33 % 128;
                                                if (i33 % 2 != 0) {
                                                    z11 = false;
                                                } else {
                                                    z11 = true;
                                                }
                                                int i231118 = (((i231117 & 73) | (i231116 & (-74))) - (~(-(-((i231116 & 73) << 1))))) - 1;
                                                f62084a = i231118 % 128;
                                                int i231119 = i231118 % 2;
                                                if (z11) {
                                                    int i1611111111113 = f62085b;
                                                    int i1611111111114 = i1611111111113 & 119;
                                                    int i1611111111115 = ((i1611111111113 ^ 119) | i1611111111114) << 1;
                                                    int i17112111111110 = -((~i1611111111114) & (i1611111111113 | 119));
                                                    int i17112111111111 = (i1611111111115 & i17112111111110) + (i1611111111115 | i17112111111110);
                                                    f62084a = i17112111111111 % 128;
                                                    int i17112111111112 = i17112111111111 % 2;
                                                    int i17112111111113 = i1611111111113 + 37;
                                                    f62084a = i17112111111113 % 128;
                                                    int i17112111111114 = i17112111111113 % 2;
                                                    i26 = 2;
                                                } else {
                                                    if (cCharAt == '+') {
                                                        int i20121114 = f62084a;
                                                        int i20121115 = i20121114 ^ 97;
                                                        int i2111111111111111111110 = (i20121114 & 97) << 1;
                                                        int i2111111111111111111111 = (i20121115 ^ i2111111111111111111110) + ((i20121115 & i2111111111111111111110) << 1);
                                                        f62085b = i2111111111111111111111 % 128;
                                                        int i2111111111111111111112 = i2111111111111111111111 % 2;
                                                        int i2111111111111111111113 = ((i20121114 & 31) - (~(i20121114 | 31))) - 1;
                                                        f62085b = i2111111111111111111113 % 128;
                                                        i26 = 2;
                                                        int i2111111111111111111114 = i2111111111111111111113 % 2;
                                                    } else if (cCharAt == '-') {
                                                        int i2111111111111111111115 = f62085b;
                                                        i24 = i2111111111111111111115 + 19;
                                                        f62084a = i24 % 128;
                                                        if (i24 % 2 != 0) {
                                                            i25 = 0;
                                                        } else {
                                                            i25 = 1;
                                                        }
                                                        int i2111111111111111111116 = ((i2111111111111111111115 & 19) - (~(i2111111111111111111115 | 19))) - 1;
                                                        f62084a = i2111111111111111111116 % 128;
                                                        int i2111111111111111111117 = i2111111111111111111116 % 2;
                                                        i23 = i25;
                                                        i22 = 1;
                                                    } else {
                                                        int i2111111111111111111118 = f62085b;
                                                        int i2111111111111111111119 = (i2111111111111111111118 & 89) + (i2111111111111111111118 | 89);
                                                        f62084a = i2111111111111111111119 % 128;
                                                        int i2211111111110 = i2111111111111111111119 % 2;
                                                        i22 = 1;
                                                        i23 = 0;
                                                    }
                                                    if ((i23 ^ 1) != i22) {
                                                        int i1811111111111111111111111111111114 = f62085b;
                                                        int i1811111111111111111111111111111115 = i1811111111111111111111111111111114 ^ 7;
                                                        int i1811111111111111111111111111111116 = ((i1811111111111111111111111111111114 & 7) | i1811111111111111111111111111111115) << i22;
                                                        int i1811111111111111111111111111111117 = -i1811111111111111111111111111111115;
                                                        i32 = (i1811111111111111111111111111111116 ^ i1811111111111111111111111111111117) + ((i1811111111111111111111111111111116 & i1811111111111111111111111111111117) << i22);
                                                        f62084a = i32 % 128;
                                                        if (i32 % 2 != 0) {
                                                            i27 = 1;
                                                            i28 = 0;
                                                        } else {
                                                            i27 = 1;
                                                            i28 = 1;
                                                        }
                                                    } else if (cCharAt == '.') {
                                                        int i1811111111111111111111111111111118 = f62085b;
                                                        int i1811111111111111111111111111111119 = (i1811111111111111111111111111111118 & 119) + (i1811111111111111111111111111111118 | 119);
                                                        f62084a = i1811111111111111111111111111111119 % 128;
                                                        int i18111111111111111111111111111111110 = i1811111111111111111111111111111119 % 2;
                                                        int i18111111111111111111111111111111111 = i1811111111111111111111111111111118 + 56;
                                                        i27 = 1;
                                                        int i19111111111111111111111111111111111111110 = (i18111111111111111111111111111111111 ^ (-1)) + (i18111111111111111111111111111111111 << 1);
                                                        f62084a = i19111111111111111111111111111111111111110 % 128;
                                                        int i19111111111111111111111111111111111111111 = i19111111111111111111111111111111111111110 % 2;
                                                        i28 = 1;
                                                    } else {
                                                        i27 = 1;
                                                        int i19111111111111111111111111111111111111112 = f62084a;
                                                        int i19111111111111111111111111111111111111113 = ((i19111111111111111111111111111111111111112 | 45) << 1) - (i19111111111111111111111111111111111111112 ^ 45);
                                                        f62085b = i19111111111111111111111111111111111111113 % 128;
                                                        int i19111111111111111111111111111111111111114 = i19111111111111111111111111111111111111113 % 2;
                                                        i28 = 0;
                                                    }
                                                    if ((i28 ^ 1) != i27) {
                                                        i29 = f62085b;
                                                        int i19111111111111111111111111111111111111115 = ((i29 & (-28)) | ((~i29) & 27)) + ((i29 & 27) << i27);
                                                        i30 = i19111111111111111111111111111111111111115 % 128;
                                                        f62084a = i30;
                                                        int i19111111111111111111111111111111111111116 = i19111111111111111111111111111111111111115 % 2;
                                                        if (cCharAt == ':') {
                                                            int i19111111111111111111111111111111111111117 = (-2) - ((-1) ^ (((i29 | 98) << i27) - (i29 ^ 98)));
                                                            int i19111111111111111111111111111111111111118 = i19111111111111111111111111111111111111117 % 128;
                                                            f62084a = i19111111111111111111111111111111111111118;
                                                            int i19111111111111111111111111111111111111119 = i19111111111111111111111111111111111111117 % 2;
                                                            int i2011111111111111111117 = (i19111111111111111111111111111111111111118 | 15) << 1;
                                                            int i2011111111111111111118 = -(i19111111111111111111111111111111111111118 ^ 15);
                                                            i31 = (i2011111111111111111117 ^ i2011111111111111111118) + ((i2011111111111111111118 & i2011111111111111111117) << 1);
                                                            f62085b = i31 % 128;
                                                            if (i31 % 2 == 0) {
                                                                int i2011111111111111111119 = 83 / 0;
                                                            }
                                                            return Integer.valueOf(i15);
                                                        }
                                                        int i20111111111111111111110 = (-2) - (((i30 & 118) + (i30 | 118)) ^ (-1));
                                                        f62085b = i20111111111111111111110 % 128;
                                                        int i20111111111111111111111 = i20111111111111111111110 % 2;
                                                    }
                                                }
                                                int i1711111111111111110 = f62084a + 89;
                                                int i1711111111111111111 = i1711111111111111110 % 128;
                                                f62085b = i1711111111111111111;
                                                int i1711111111111111112 = i1711111111111111110 % i26;
                                                int i1711111111111111113 = i1711111111111111111 & 73;
                                                int i1711111111111111114 = -(-((i1711111111111111111 ^ 73) | i1711111111111111113));
                                                int i181111211118 = (i1711111111111111113 & i1711111111111111114) + (i1711111111111111113 | i1711111111111111114);
                                                f62084a = i181111211118 % 128;
                                                int i181111211119 = i181111211118 % 2;
                                                i22 = 1;
                                                i23 = 1;
                                                if ((i23 ^ 1) != i22) {
                                                    int i18111111111111111111111111111111112 = f62085b;
                                                    int i18111111111111111111111111111111113 = i18111111111111111111111111111111112 ^ 7;
                                                    int i18111111111111111111111111111111114 = ((i18111111111111111111111111111111112 & 7) | i18111111111111111111111111111111113) << i22;
                                                    int i18111111111111111111111111111111115 = -i18111111111111111111111111111111113;
                                                    i32 = (i18111111111111111111111111111111114 ^ i18111111111111111111111111111111115) + ((i18111111111111111111111111111111114 & i18111111111111111111111111111111115) << i22);
                                                    f62084a = i32 % 128;
                                                    if (i32 % 2 != 0) {
                                                        i27 = 1;
                                                        i28 = 0;
                                                    } else {
                                                        i27 = 1;
                                                        i28 = 1;
                                                    }
                                                } else if (cCharAt == '.') {
                                                    int i18111111111111111111111111111111116 = f62085b;
                                                    int i18111111111111111111111111111111117 = (i18111111111111111111111111111111116 & 119) + (i18111111111111111111111111111111116 | 119);
                                                    f62084a = i18111111111111111111111111111111117 % 128;
                                                    int i18111111111111111111111111111111118 = i18111111111111111111111111111111117 % 2;
                                                    int i18111111111111111111111111111111119 = i18111111111111111111111111111111116 + 56;
                                                    i27 = 1;
                                                    int i191111111111111111111111111111111111111110 = (i18111111111111111111111111111111119 ^ (-1)) + (i18111111111111111111111111111111119 << 1);
                                                    f62084a = i191111111111111111111111111111111111111110 % 128;
                                                    int i191111111111111111111111111111111111111111 = i191111111111111111111111111111111111111110 % 2;
                                                    i28 = 1;
                                                } else {
                                                    i27 = 1;
                                                    int i191111111111111111111111111111111111111112 = f62084a;
                                                    int i191111111111111111111111111111111111111113 = ((i191111111111111111111111111111111111111112 | 45) << 1) - (i191111111111111111111111111111111111111112 ^ 45);
                                                    f62085b = i191111111111111111111111111111111111111113 % 128;
                                                    int i191111111111111111111111111111111111111114 = i191111111111111111111111111111111111111113 % 2;
                                                    i28 = 0;
                                                }
                                                if ((i28 ^ 1) != i27) {
                                                    i29 = f62085b;
                                                    int i191111111111111111111111111111111111111115 = ((i29 & (-28)) | ((~i29) & 27)) + ((i29 & 27) << i27);
                                                    i30 = i191111111111111111111111111111111111111115 % 128;
                                                    f62084a = i30;
                                                    int i191111111111111111111111111111111111111116 = i191111111111111111111111111111111111111115 % 2;
                                                    if (cCharAt == ':') {
                                                        int i191111111111111111111111111111111111111117 = (-2) - ((-1) ^ (((i29 | 98) << i27) - (i29 ^ 98)));
                                                        int i191111111111111111111111111111111111111118 = i191111111111111111111111111111111111111117 % 128;
                                                        f62084a = i191111111111111111111111111111111111111118;
                                                        int i191111111111111111111111111111111111111119 = i191111111111111111111111111111111111111117 % 2;
                                                        int i20111111111111111111112 = (i191111111111111111111111111111111111111118 | 15) << 1;
                                                        int i20111111111111111111113 = -(i191111111111111111111111111111111111111118 ^ 15);
                                                        i31 = (i20111111111111111111112 ^ i20111111111111111111113) + ((i20111111111111111111113 & i20111111111111111111112) << 1);
                                                        f62085b = i31 % 128;
                                                        if (i31 % 2 == 0) {
                                                            int i20111111111111111111114 = 83 / 0;
                                                        }
                                                        return Integer.valueOf(i15);
                                                    }
                                                    int i20111111111111111111115 = (-2) - (((i30 & 118) + (i30 | 118)) ^ (-1));
                                                    f62085b = i20111111111111111111115 % 128;
                                                    int i20111111111111111111116 = i20111111111111111111115 % 2;
                                                }
                                            } else {
                                                i18 = 1;
                                                i19 = (i15 ^ 1) + ((i15 & 1) << 1);
                                                cCharAt = str3.charAt(i15);
                                                if ('a' <= cCharAt) {
                                                    int i1311111 = f62084a;
                                                    int i1411111110 = i1311111 & 35;
                                                    int i1411111111 = ((i1311111 ^ 35) | i1411111110) << i18;
                                                    int i1411111112 = -((i1311111 | 35) & (~i1411111110));
                                                    int i1411111113 = (i1411111111 ^ i1411111112) + ((i1411111112 & i1411111111) << i18);
                                                    i20 = i1411111113 % 128;
                                                    f62085b = i20;
                                                    int i1411129 = i1411111113 % 2;
                                                    if (cCharAt < '{') {
                                                        int i14111210 = ((i20 ^ 31) | (i20 & 31)) << 1;
                                                        int i14111211 = -(((~i20) & 31) | (i20 & (-32)));
                                                        i21 = (i14111210 ^ i14111211) + ((i14111211 & i14111210) << 1);
                                                        f62084a = i21 % 128;
                                                        if (i21 % 2 != 0) {
                                                            z10 = true;
                                                        }
                                                    }
                                                }
                                                if (!z10) {
                                                    if ('A' <= cCharAt) {
                                                        i35 = f62084a;
                                                        int i1411111114 = (-2) - (((i35 ^ 24) + ((i35 & 24) << 1)) ^ (-1));
                                                        i36 = i1411111114 % 128;
                                                        f62085b = i36;
                                                        int i1411111115 = i1411111114 % 2;
                                                        if (cCharAt < '[') {
                                                            int i1411111116 = i36 ^ 91;
                                                            int i1511111111110 = ((i36 & 91) | i1411111116) << 1;
                                                            int i1511111111111 = -i1411111116;
                                                            int i1511111111112 = ((i1511111111110 | i1511111111111) << 1) - (i1511111111111 ^ i1511111111110);
                                                            f62084a = i1511111111112 % 128;
                                                            int i1511111111113 = i1511111111112 % 2;
                                                            int i1511111111114 = (((i36 & (-100)) | ((~i36) & 99)) - (~(-(-((i36 & 99) << 1))))) - 1;
                                                            f62084a = i1511111111114 % 128;
                                                            int i1511111111115 = i1511111111114 % 2;
                                                        } else {
                                                            int i1511111111116 = i35 + 85;
                                                            f62085b = i1511111111116 % 128;
                                                            int i1511111111117 = i1511111111116 % 2;
                                                        }
                                                    }
                                                    if ('0' <= cCharAt) {
                                                        i34 = f62084a;
                                                        int i1511111111118 = i34 & 9;
                                                        int i1511111111119 = (i34 ^ 9) | i1511111111118;
                                                        int i1611111111116 = (i1511111111118 & i1511111111119) + (i1511111111118 | i1511111111119);
                                                        f62085b = i1611111111116 % 128;
                                                        int i1611111111117 = i1611111111116 % 2;
                                                        if (cCharAt < ':') {
                                                            int i1611111111118 = i34 & 107;
                                                            int i1611111111119 = (((i34 ^ 107) | i1611111111118) << 1) - ((~i1611111111118) & (i34 | 107));
                                                            f62085b = i1611111111119 % 128;
                                                            int i1612114 = i1611111111119 % 2;
                                                            int i1612115 = (i34 ^ 57) + ((i34 & 57) << 1);
                                                            f62085b = i1612115 % 128;
                                                            int i1612116 = i1612115 % 2;
                                                            int i16111111111110 = f62085b;
                                                            int i16111111111111 = i16111111111110 & 119;
                                                            int i16111111111112 = ((i16111111111110 ^ 119) | i16111111111111) << 1;
                                                            int i17112111111115 = -((~i16111111111111) & (i16111111111110 | 119));
                                                            int i17112111111116 = (i16111111111112 & i17112111111115) + (i16111111111112 | i17112111111115);
                                                            f62084a = i17112111111116 % 128;
                                                            int i17112111111117 = i17112111111116 % 2;
                                                            int i17112111111118 = i16111111111110 + 37;
                                                            f62084a = i17112111111118 % 128;
                                                            int i17112111111119 = i17112111111118 % 2;
                                                            i26 = 2;
                                                            int i1711111111111111115 = f62084a + 89;
                                                            int i1711111111111111116 = i1711111111111111115 % 128;
                                                            f62085b = i1711111111111111116;
                                                            int i1711111111111111117 = i1711111111111111115 % i26;
                                                            int i1711111111111111118 = i1711111111111111116 & 73;
                                                            int i1711111111111111119 = -(-((i1711111111111111116 ^ 73) | i1711111111111111118));
                                                            int i1811112111110 = (i1711111111111111118 & i1711111111111111119) + (i1711111111111111118 | i1711111111111111119);
                                                            f62084a = i1811112111110 % 128;
                                                            int i1811112111111 = i1811112111110 % 2;
                                                            i22 = 1;
                                                            i23 = 1;
                                                            if ((i23 ^ 1) != i22) {
                                                                int i181111111111111111111111111111111110 = f62085b;
                                                                int i181111111111111111111111111111111111 = i181111111111111111111111111111111110 ^ 7;
                                                                int i181111111111111111111111111111111112 = ((i181111111111111111111111111111111110 & 7) | i181111111111111111111111111111111111) << i22;
                                                                int i181111111111111111111111111111111113 = -i181111111111111111111111111111111111;
                                                                i32 = (i181111111111111111111111111111111112 ^ i181111111111111111111111111111111113) + ((i181111111111111111111111111111111112 & i181111111111111111111111111111111113) << i22);
                                                                f62084a = i32 % 128;
                                                                if (i32 % 2 != 0) {
                                                                    i27 = 1;
                                                                    i28 = 0;
                                                                } else {
                                                                    i27 = 1;
                                                                    i28 = 1;
                                                                }
                                                            } else if (cCharAt == '.') {
                                                                int i181111111111111111111111111111111114 = f62085b;
                                                                int i181111111111111111111111111111111115 = (i181111111111111111111111111111111114 & 119) + (i181111111111111111111111111111111114 | 119);
                                                                f62084a = i181111111111111111111111111111111115 % 128;
                                                                int i181111111111111111111111111111111116 = i181111111111111111111111111111111115 % 2;
                                                                int i181111111111111111111111111111111117 = i181111111111111111111111111111111114 + 56;
                                                                i27 = 1;
                                                                int i1911111111111111111111111111111111111111110 = (i181111111111111111111111111111111117 ^ (-1)) + (i181111111111111111111111111111111117 << 1);
                                                                f62084a = i1911111111111111111111111111111111111111110 % 128;
                                                                int i1911111111111111111111111111111111111111111 = i1911111111111111111111111111111111111111110 % 2;
                                                                i28 = 1;
                                                            } else {
                                                                i27 = 1;
                                                                int i1911111111111111111111111111111111111111112 = f62084a;
                                                                int i1911111111111111111111111111111111111111113 = ((i1911111111111111111111111111111111111111112 | 45) << 1) - (i1911111111111111111111111111111111111111112 ^ 45);
                                                                f62085b = i1911111111111111111111111111111111111111113 % 128;
                                                                int i1911111111111111111111111111111111111111114 = i1911111111111111111111111111111111111111113 % 2;
                                                                i28 = 0;
                                                            }
                                                            if ((i28 ^ 1) != i27) {
                                                                i29 = f62085b;
                                                                int i1911111111111111111111111111111111111111115 = ((i29 & (-28)) | ((~i29) & 27)) + ((i29 & 27) << i27);
                                                                i30 = i1911111111111111111111111111111111111111115 % 128;
                                                                f62084a = i30;
                                                                int i1911111111111111111111111111111111111111116 = i1911111111111111111111111111111111111111115 % 2;
                                                                if (cCharAt == ':') {
                                                                    int i1911111111111111111111111111111111111111117 = (-2) - ((-1) ^ (((i29 | 98) << i27) - (i29 ^ 98)));
                                                                    int i1911111111111111111111111111111111111111118 = i1911111111111111111111111111111111111111117 % 128;
                                                                    f62084a = i1911111111111111111111111111111111111111118;
                                                                    int i1911111111111111111111111111111111111111119 = i1911111111111111111111111111111111111111117 % 2;
                                                                    int i20111111111111111111117 = (i1911111111111111111111111111111111111111118 | 15) << 1;
                                                                    int i20111111111111111111118 = -(i1911111111111111111111111111111111111111118 ^ 15);
                                                                    i31 = (i20111111111111111111117 ^ i20111111111111111111118) + ((i20111111111111111111118 & i20111111111111111111117) << 1);
                                                                    f62085b = i31 % 128;
                                                                    if (i31 % 2 == 0) {
                                                                        int i20111111111111111111119 = 83 / 0;
                                                                    }
                                                                    return Integer.valueOf(i15);
                                                                }
                                                                int i201111111111111111111110 = (-2) - (((i30 & 118) + (i30 | 118)) ^ (-1));
                                                                f62085b = i201111111111111111111110 % 128;
                                                                int i201111111111111111111111 = i201111111111111111111110 % 2;
                                                            }
                                                        } else {
                                                            int i202117 = i34 & 113;
                                                            int i202118 = (((i34 ^ 113) | i202117) << 1) - ((i34 | 113) & (~i202117));
                                                            f62085b = i202118 % 128;
                                                            int i202119 = i202118 % 2;
                                                        }
                                                    }
                                                    if (cCharAt == '+') {
                                                        int i20121116 = f62084a;
                                                        int i20121117 = i20121116 ^ 97;
                                                        int i21111111111111111111110 = (i20121116 & 97) << 1;
                                                        int i21111111111111111111111 = (i20121117 ^ i21111111111111111111110) + ((i20121117 & i21111111111111111111110) << 1);
                                                        f62085b = i21111111111111111111111 % 128;
                                                        int i21111111111111111111112 = i21111111111111111111111 % 2;
                                                        int i21111111111111111111113 = ((i20121116 & 31) - (~(i20121116 | 31))) - 1;
                                                        f62085b = i21111111111111111111113 % 128;
                                                        i26 = 2;
                                                        int i21111111111111111111114 = i21111111111111111111113 % 2;
                                                        int i17111111111111111110 = f62084a + 89;
                                                        int i17111111111111111111 = i17111111111111111110 % 128;
                                                        f62085b = i17111111111111111111;
                                                        int i17111111111111111112 = i17111111111111111110 % i26;
                                                        int i17111111111111111113 = i17111111111111111111 & 73;
                                                        int i17111111111111111114 = -(-((i17111111111111111111 ^ 73) | i17111111111111111113));
                                                        int i1811112111112 = (i17111111111111111113 & i17111111111111111114) + (i17111111111111111113 | i17111111111111111114);
                                                        f62084a = i1811112111112 % 128;
                                                        int i1811112111113 = i1811112111112 % 2;
                                                        i22 = 1;
                                                        i23 = 1;
                                                    } else if (cCharAt == '-') {
                                                        int i21111111111111111111115 = f62085b;
                                                        i24 = i21111111111111111111115 + 19;
                                                        f62084a = i24 % 128;
                                                        if (i24 % 2 != 0) {
                                                            i25 = 0;
                                                        } else {
                                                            i25 = 1;
                                                        }
                                                        int i21111111111111111111116 = ((i21111111111111111111115 & 19) - (~(i21111111111111111111115 | 19))) - 1;
                                                        f62084a = i21111111111111111111116 % 128;
                                                        int i21111111111111111111117 = i21111111111111111111116 % 2;
                                                        i23 = i25;
                                                        i22 = 1;
                                                    } else {
                                                        int i21111111111111111111118 = f62085b;
                                                        int i21111111111111111111119 = (i21111111111111111111118 & 89) + (i21111111111111111111118 | 89);
                                                        f62084a = i21111111111111111111119 % 128;
                                                        int i2211111111111 = i21111111111111111111119 % 2;
                                                        i22 = 1;
                                                        i23 = 0;
                                                    }
                                                    if ((i23 ^ 1) != i22) {
                                                        int i181111111111111111111111111111111118 = f62085b;
                                                        int i181111111111111111111111111111111119 = i181111111111111111111111111111111118 ^ 7;
                                                        int i1811111111111111111111111111111111110 = ((i181111111111111111111111111111111118 & 7) | i181111111111111111111111111111111119) << i22;
                                                        int i1811111111111111111111111111111111111 = -i181111111111111111111111111111111119;
                                                        i32 = (i1811111111111111111111111111111111110 ^ i1811111111111111111111111111111111111) + ((i1811111111111111111111111111111111110 & i1811111111111111111111111111111111111) << i22);
                                                        f62084a = i32 % 128;
                                                        if (i32 % 2 != 0) {
                                                            i27 = 1;
                                                            i28 = 0;
                                                        } else {
                                                            i27 = 1;
                                                            i28 = 1;
                                                        }
                                                    } else if (cCharAt == '.') {
                                                        int i1811111111111111111111111111111111112 = f62085b;
                                                        int i1811111111111111111111111111111111113 = (i1811111111111111111111111111111111112 & 119) + (i1811111111111111111111111111111111112 | 119);
                                                        f62084a = i1811111111111111111111111111111111113 % 128;
                                                        int i1811111111111111111111111111111111114 = i1811111111111111111111111111111111113 % 2;
                                                        int i1811111111111111111111111111111111115 = i1811111111111111111111111111111111112 + 56;
                                                        i27 = 1;
                                                        int i19111111111111111111111111111111111111111110 = (i1811111111111111111111111111111111115 ^ (-1)) + (i1811111111111111111111111111111111115 << 1);
                                                        f62084a = i19111111111111111111111111111111111111111110 % 128;
                                                        int i19111111111111111111111111111111111111111111 = i19111111111111111111111111111111111111111110 % 2;
                                                        i28 = 1;
                                                    } else {
                                                        i27 = 1;
                                                        int i19111111111111111111111111111111111111111112 = f62084a;
                                                        int i19111111111111111111111111111111111111111113 = ((i19111111111111111111111111111111111111111112 | 45) << 1) - (i19111111111111111111111111111111111111111112 ^ 45);
                                                        f62085b = i19111111111111111111111111111111111111111113 % 128;
                                                        int i19111111111111111111111111111111111111111114 = i19111111111111111111111111111111111111111113 % 2;
                                                        i28 = 0;
                                                    }
                                                    if ((i28 ^ 1) != i27) {
                                                        i29 = f62085b;
                                                        int i19111111111111111111111111111111111111111115 = ((i29 & (-28)) | ((~i29) & 27)) + ((i29 & 27) << i27);
                                                        i30 = i19111111111111111111111111111111111111111115 % 128;
                                                        f62084a = i30;
                                                        int i19111111111111111111111111111111111111111116 = i19111111111111111111111111111111111111111115 % 2;
                                                        if (cCharAt == ':') {
                                                            int i19111111111111111111111111111111111111111117 = (-2) - ((-1) ^ (((i29 | 98) << i27) - (i29 ^ 98)));
                                                            int i19111111111111111111111111111111111111111118 = i19111111111111111111111111111111111111111117 % 128;
                                                            f62084a = i19111111111111111111111111111111111111111118;
                                                            int i19111111111111111111111111111111111111111119 = i19111111111111111111111111111111111111111117 % 2;
                                                            int i201111111111111111111112 = (i19111111111111111111111111111111111111111118 | 15) << 1;
                                                            int i201111111111111111111113 = -(i19111111111111111111111111111111111111111118 ^ 15);
                                                            i31 = (i201111111111111111111112 ^ i201111111111111111111113) + ((i201111111111111111111113 & i201111111111111111111112) << 1);
                                                            f62085b = i31 % 128;
                                                            if (i31 % 2 == 0) {
                                                                int i201111111111111111111114 = 83 / 0;
                                                            }
                                                            return Integer.valueOf(i15);
                                                        }
                                                        int i201111111111111111111115 = (-2) - (((i30 & 118) + (i30 | 118)) ^ (-1));
                                                        f62085b = i201111111111111111111115 % 128;
                                                        int i201111111111111111111116 = i201111111111111111111115 % 2;
                                                    }
                                                } else {
                                                    int i2211111111112 = f62085b;
                                                    int i2211111111113 = i2211111111112 & 101;
                                                    int i2211111111114 = i2211111111112 | 101;
                                                    int i2211111111115 = (i2211111111113 & i2211111111114) + (i2211111111114 | i2211111111113);
                                                    int i2211111111116 = i2211111111115 % 128;
                                                    f62084a = i2211111111116;
                                                    int i2211111111117 = i2211111111115 % 2;
                                                    int i2211111111118 = i2211111111116 & 33;
                                                    int i2211111111119 = i2211111111118 + ((i2211111111116 ^ 33) | i2211111111118);
                                                    f62085b = i2211111111119 % 128;
                                                    int i2229 = i2211111111119 % 2;
                                                }
                                                int i2311110 = f62085b;
                                                int i2311111 = ~i2311110;
                                                i33 = (((i2311110 | 117) << 1) - (~(-((i2311110 & (-118)) | (i2311111 & 117))))) - 1;
                                                f62084a = i33 % 128;
                                                if (i33 % 2 != 0) {
                                                    z11 = false;
                                                } else {
                                                    z11 = true;
                                                }
                                                int i2311112 = (((i2311111 & 73) | (i2311110 & (-74))) - (~(-(-((i2311110 & 73) << 1))))) - 1;
                                                f62084a = i2311112 % 128;
                                                int i2311113 = i2311112 % 2;
                                                if (z11) {
                                                    int i16111111111113 = f62085b;
                                                    int i16111111111114 = i16111111111113 & 119;
                                                    int i16111111111115 = ((i16111111111113 ^ 119) | i16111111111114) << 1;
                                                    int i171121111111110 = -((~i16111111111114) & (i16111111111113 | 119));
                                                    int i171121111111111 = (i16111111111115 & i171121111111110) + (i16111111111115 | i171121111111110);
                                                    f62084a = i171121111111111 % 128;
                                                    int i171121111111112 = i171121111111111 % 2;
                                                    int i171121111111113 = i16111111111113 + 37;
                                                    f62084a = i171121111111113 % 128;
                                                    int i171121111111114 = i171121111111113 % 2;
                                                    i26 = 2;
                                                } else {
                                                    if (cCharAt == '+') {
                                                        int i20121118 = f62084a;
                                                        int i20121119 = i20121118 ^ 97;
                                                        int i211111111111111111111110 = (i20121118 & 97) << 1;
                                                        int i211111111111111111111111 = (i20121119 ^ i211111111111111111111110) + ((i20121119 & i211111111111111111111110) << 1);
                                                        f62085b = i211111111111111111111111 % 128;
                                                        int i211111111111111111111112 = i211111111111111111111111 % 2;
                                                        int i211111111111111111111113 = ((i20121118 & 31) - (~(i20121118 | 31))) - 1;
                                                        f62085b = i211111111111111111111113 % 128;
                                                        i26 = 2;
                                                        int i211111111111111111111114 = i211111111111111111111113 % 2;
                                                    } else if (cCharAt == '-') {
                                                        int i211111111111111111111115 = f62085b;
                                                        i24 = i211111111111111111111115 + 19;
                                                        f62084a = i24 % 128;
                                                        if (i24 % 2 != 0) {
                                                            i25 = 0;
                                                        } else {
                                                            i25 = 1;
                                                        }
                                                        int i211111111111111111111116 = ((i211111111111111111111115 & 19) - (~(i211111111111111111111115 | 19))) - 1;
                                                        f62084a = i211111111111111111111116 % 128;
                                                        int i211111111111111111111117 = i211111111111111111111116 % 2;
                                                        i23 = i25;
                                                        i22 = 1;
                                                    } else {
                                                        int i211111111111111111111118 = f62085b;
                                                        int i211111111111111111111119 = (i211111111111111111111118 & 89) + (i211111111111111111111118 | 89);
                                                        f62084a = i211111111111111111111119 % 128;
                                                        int i22111111111110 = i211111111111111111111119 % 2;
                                                        i22 = 1;
                                                        i23 = 0;
                                                    }
                                                    if ((i23 ^ 1) != i22) {
                                                        int i1811111111111111111111111111111111116 = f62085b;
                                                        int i1811111111111111111111111111111111117 = i1811111111111111111111111111111111116 ^ 7;
                                                        int i1811111111111111111111111111111111118 = ((i1811111111111111111111111111111111116 & 7) | i1811111111111111111111111111111111117) << i22;
                                                        int i1811111111111111111111111111111111119 = -i1811111111111111111111111111111111117;
                                                        i32 = (i1811111111111111111111111111111111118 ^ i1811111111111111111111111111111111119) + ((i1811111111111111111111111111111111118 & i1811111111111111111111111111111111119) << i22);
                                                        f62084a = i32 % 128;
                                                        if (i32 % 2 != 0) {
                                                            i27 = 1;
                                                            i28 = 0;
                                                        } else {
                                                            i27 = 1;
                                                            i28 = 1;
                                                        }
                                                    } else if (cCharAt == '.') {
                                                        int i18111111111111111111111111111111111110 = f62085b;
                                                        int i18111111111111111111111111111111111111 = (i18111111111111111111111111111111111110 & 119) + (i18111111111111111111111111111111111110 | 119);
                                                        f62084a = i18111111111111111111111111111111111111 % 128;
                                                        int i18111111111111111111111111111111111112 = i18111111111111111111111111111111111111 % 2;
                                                        int i18111111111111111111111111111111111113 = i18111111111111111111111111111111111110 + 56;
                                                        i27 = 1;
                                                        int i191111111111111111111111111111111111111111110 = (i18111111111111111111111111111111111113 ^ (-1)) + (i18111111111111111111111111111111111113 << 1);
                                                        f62084a = i191111111111111111111111111111111111111111110 % 128;
                                                        int i191111111111111111111111111111111111111111111 = i191111111111111111111111111111111111111111110 % 2;
                                                        i28 = 1;
                                                    } else {
                                                        i27 = 1;
                                                        int i191111111111111111111111111111111111111111112 = f62084a;
                                                        int i191111111111111111111111111111111111111111113 = ((i191111111111111111111111111111111111111111112 | 45) << 1) - (i191111111111111111111111111111111111111111112 ^ 45);
                                                        f62085b = i191111111111111111111111111111111111111111113 % 128;
                                                        int i191111111111111111111111111111111111111111114 = i191111111111111111111111111111111111111111113 % 2;
                                                        i28 = 0;
                                                    }
                                                    if ((i28 ^ 1) != i27) {
                                                        i29 = f62085b;
                                                        int i191111111111111111111111111111111111111111115 = ((i29 & (-28)) | ((~i29) & 27)) + ((i29 & 27) << i27);
                                                        i30 = i191111111111111111111111111111111111111111115 % 128;
                                                        f62084a = i30;
                                                        int i191111111111111111111111111111111111111111116 = i191111111111111111111111111111111111111111115 % 2;
                                                        if (cCharAt == ':') {
                                                            int i191111111111111111111111111111111111111111117 = (-2) - ((-1) ^ (((i29 | 98) << i27) - (i29 ^ 98)));
                                                            int i191111111111111111111111111111111111111111118 = i191111111111111111111111111111111111111111117 % 128;
                                                            f62084a = i191111111111111111111111111111111111111111118;
                                                            int i191111111111111111111111111111111111111111119 = i191111111111111111111111111111111111111111117 % 2;
                                                            int i201111111111111111111117 = (i191111111111111111111111111111111111111111118 | 15) << 1;
                                                            int i201111111111111111111118 = -(i191111111111111111111111111111111111111111118 ^ 15);
                                                            i31 = (i201111111111111111111117 ^ i201111111111111111111118) + ((i201111111111111111111118 & i201111111111111111111117) << 1);
                                                            f62085b = i31 % 128;
                                                            if (i31 % 2 == 0) {
                                                                int i201111111111111111111119 = 83 / 0;
                                                            }
                                                            return Integer.valueOf(i15);
                                                        }
                                                        int i2011111111111111111111110 = (-2) - (((i30 & 118) + (i30 | 118)) ^ (-1));
                                                        f62085b = i2011111111111111111111110 % 128;
                                                        int i2011111111111111111111111 = i2011111111111111111111110 % 2;
                                                    }
                                                }
                                                int i17111111111111111115 = f62084a + 89;
                                                int i17111111111111111116 = i17111111111111111115 % 128;
                                                f62085b = i17111111111111111116;
                                                int i17111111111111111117 = i17111111111111111115 % i26;
                                                int i17111111111111111118 = i17111111111111111116 & 73;
                                                int i17111111111111111119 = -(-((i17111111111111111116 ^ 73) | i17111111111111111118));
                                                int i1811112111114 = (i17111111111111111118 & i17111111111111111119) + (i17111111111111111118 | i17111111111111111119);
                                                f62084a = i1811112111114 % 128;
                                                int i1811112111115 = i1811112111114 % 2;
                                                i22 = 1;
                                                i23 = 1;
                                                if ((i23 ^ 1) != i22) {
                                                    int i18111111111111111111111111111111111114 = f62085b;
                                                    int i18111111111111111111111111111111111115 = i18111111111111111111111111111111111114 ^ 7;
                                                    int i18111111111111111111111111111111111116 = ((i18111111111111111111111111111111111114 & 7) | i18111111111111111111111111111111111115) << i22;
                                                    int i18111111111111111111111111111111111117 = -i18111111111111111111111111111111111115;
                                                    i32 = (i18111111111111111111111111111111111116 ^ i18111111111111111111111111111111111117) + ((i18111111111111111111111111111111111116 & i18111111111111111111111111111111111117) << i22);
                                                    f62084a = i32 % 128;
                                                    if (i32 % 2 != 0) {
                                                        i27 = 1;
                                                        i28 = 0;
                                                    } else {
                                                        i27 = 1;
                                                        i28 = 1;
                                                    }
                                                } else if (cCharAt == '.') {
                                                    int i18111111111111111111111111111111111118 = f62085b;
                                                    int i18111111111111111111111111111111111119 = (i18111111111111111111111111111111111118 & 119) + (i18111111111111111111111111111111111118 | 119);
                                                    f62084a = i18111111111111111111111111111111111119 % 128;
                                                    int i181111111111111111111111111111111111110 = i18111111111111111111111111111111111119 % 2;
                                                    int i181111111111111111111111111111111111111 = i18111111111111111111111111111111111118 + 56;
                                                    i27 = 1;
                                                    int i1911111111111111111111111111111111111111111110 = (i181111111111111111111111111111111111111 ^ (-1)) + (i181111111111111111111111111111111111111 << 1);
                                                    f62084a = i1911111111111111111111111111111111111111111110 % 128;
                                                    int i1911111111111111111111111111111111111111111111 = i1911111111111111111111111111111111111111111110 % 2;
                                                    i28 = 1;
                                                } else {
                                                    i27 = 1;
                                                    int i1911111111111111111111111111111111111111111112 = f62084a;
                                                    int i1911111111111111111111111111111111111111111113 = ((i1911111111111111111111111111111111111111111112 | 45) << 1) - (i1911111111111111111111111111111111111111111112 ^ 45);
                                                    f62085b = i1911111111111111111111111111111111111111111113 % 128;
                                                    int i1911111111111111111111111111111111111111111114 = i1911111111111111111111111111111111111111111113 % 2;
                                                    i28 = 0;
                                                }
                                                if ((i28 ^ 1) != i27) {
                                                    i29 = f62085b;
                                                    int i1911111111111111111111111111111111111111111115 = ((i29 & (-28)) | ((~i29) & 27)) + ((i29 & 27) << i27);
                                                    i30 = i1911111111111111111111111111111111111111111115 % 128;
                                                    f62084a = i30;
                                                    int i1911111111111111111111111111111111111111111116 = i1911111111111111111111111111111111111111111115 % 2;
                                                    if (cCharAt == ':') {
                                                        int i1911111111111111111111111111111111111111111117 = (-2) - ((-1) ^ (((i29 | 98) << i27) - (i29 ^ 98)));
                                                        int i1911111111111111111111111111111111111111111118 = i1911111111111111111111111111111111111111111117 % 128;
                                                        f62084a = i1911111111111111111111111111111111111111111118;
                                                        int i1911111111111111111111111111111111111111111119 = i1911111111111111111111111111111111111111111117 % 2;
                                                        int i2011111111111111111111112 = (i1911111111111111111111111111111111111111111118 | 15) << 1;
                                                        int i2011111111111111111111113 = -(i1911111111111111111111111111111111111111111118 ^ 15);
                                                        i31 = (i2011111111111111111111112 ^ i2011111111111111111111113) + ((i2011111111111111111111113 & i2011111111111111111111112) << 1);
                                                        f62085b = i31 % 128;
                                                        if (i31 % 2 == 0) {
                                                            int i2011111111111111111111114 = 83 / 0;
                                                        }
                                                        return Integer.valueOf(i15);
                                                    }
                                                    int i2011111111111111111111115 = (-2) - (((i30 & 118) + (i30 | 118)) ^ (-1));
                                                    f62085b = i2011111111111111111111115 % 128;
                                                    int i2011111111111111111111116 = i2011111111111111111111115 % 2;
                                                }
                                            }
                                            z10 = false;
                                            if (!z10) {
                                                if ('A' <= cCharAt) {
                                                    i35 = f62084a;
                                                    int i1411111117 = (-2) - (((i35 ^ 24) + ((i35 & 24) << 1)) ^ (-1));
                                                    i36 = i1411111117 % 128;
                                                    f62085b = i36;
                                                    int i1411111118 = i1411111117 % 2;
                                                    if (cCharAt < '[') {
                                                        int i1411111119 = i36 ^ 91;
                                                        int i15111111111110 = ((i36 & 91) | i1411111119) << 1;
                                                        int i15111111111111 = -i1411111119;
                                                        int i15111111111112 = ((i15111111111110 | i15111111111111) << 1) - (i15111111111111 ^ i15111111111110);
                                                        f62084a = i15111111111112 % 128;
                                                        int i15111111111113 = i15111111111112 % 2;
                                                        int i15111111111114 = (((i36 & (-100)) | ((~i36) & 99)) - (~(-(-((i36 & 99) << 1))))) - 1;
                                                        f62084a = i15111111111114 % 128;
                                                        int i15111111111115 = i15111111111114 % 2;
                                                    } else {
                                                        int i15111111111116 = i35 + 85;
                                                        f62085b = i15111111111116 % 128;
                                                        int i15111111111117 = i15111111111116 % 2;
                                                    }
                                                }
                                                if ('0' <= cCharAt) {
                                                    i34 = f62084a;
                                                    int i15111111111118 = i34 & 9;
                                                    int i15111111111119 = (i34 ^ 9) | i15111111111118;
                                                    int i16111111111116 = (i15111111111118 & i15111111111119) + (i15111111111118 | i15111111111119);
                                                    f62085b = i16111111111116 % 128;
                                                    int i16111111111117 = i16111111111116 % 2;
                                                    if (cCharAt < ':') {
                                                        int i16111111111118 = i34 & 107;
                                                        int i16111111111119 = (((i34 ^ 107) | i16111111111118) << 1) - ((~i16111111111118) & (i34 | 107));
                                                        f62085b = i16111111111119 % 128;
                                                        int i1612117 = i16111111111119 % 2;
                                                        int i1612118 = (i34 ^ 57) + ((i34 & 57) << 1);
                                                        f62085b = i1612118 % 128;
                                                        int i1612119 = i1612118 % 2;
                                                        int i161111111111110 = f62085b;
                                                        int i161111111111111 = i161111111111110 & 119;
                                                        int i161111111111112 = ((i161111111111110 ^ 119) | i161111111111111) << 1;
                                                        int i171121111111115 = -((~i161111111111111) & (i161111111111110 | 119));
                                                        int i171121111111116 = (i161111111111112 & i171121111111115) + (i161111111111112 | i171121111111115);
                                                        f62084a = i171121111111116 % 128;
                                                        int i171121111111117 = i171121111111116 % 2;
                                                        int i171121111111118 = i161111111111110 + 37;
                                                        f62084a = i171121111111118 % 128;
                                                        int i171121111111119 = i171121111111118 % 2;
                                                        i26 = 2;
                                                        int i171111111111111111110 = f62084a + 89;
                                                        int i171111111111111111111 = i171111111111111111110 % 128;
                                                        f62085b = i171111111111111111111;
                                                        int i171111111111111111112 = i171111111111111111110 % i26;
                                                        int i171111111111111111113 = i171111111111111111111 & 73;
                                                        int i171111111111111111114 = -(-((i171111111111111111111 ^ 73) | i171111111111111111113));
                                                        int i1811112111116 = (i171111111111111111113 & i171111111111111111114) + (i171111111111111111113 | i171111111111111111114);
                                                        f62084a = i1811112111116 % 128;
                                                        int i1811112111117 = i1811112111116 % 2;
                                                        i22 = 1;
                                                        i23 = 1;
                                                        if ((i23 ^ 1) != i22) {
                                                            int i181111111111111111111111111111111111112 = f62085b;
                                                            int i181111111111111111111111111111111111113 = i181111111111111111111111111111111111112 ^ 7;
                                                            int i181111111111111111111111111111111111114 = ((i181111111111111111111111111111111111112 & 7) | i181111111111111111111111111111111111113) << i22;
                                                            int i181111111111111111111111111111111111115 = -i181111111111111111111111111111111111113;
                                                            i32 = (i181111111111111111111111111111111111114 ^ i181111111111111111111111111111111111115) + ((i181111111111111111111111111111111111114 & i181111111111111111111111111111111111115) << i22);
                                                            f62084a = i32 % 128;
                                                            if (i32 % 2 != 0) {
                                                                i27 = 1;
                                                                i28 = 0;
                                                            } else {
                                                                i27 = 1;
                                                                i28 = 1;
                                                            }
                                                        } else if (cCharAt == '.') {
                                                            int i181111111111111111111111111111111111116 = f62085b;
                                                            int i181111111111111111111111111111111111117 = (i181111111111111111111111111111111111116 & 119) + (i181111111111111111111111111111111111116 | 119);
                                                            f62084a = i181111111111111111111111111111111111117 % 128;
                                                            int i181111111111111111111111111111111111118 = i181111111111111111111111111111111111117 % 2;
                                                            int i181111111111111111111111111111111111119 = i181111111111111111111111111111111111116 + 56;
                                                            i27 = 1;
                                                            int i19111111111111111111111111111111111111111111110 = (i181111111111111111111111111111111111119 ^ (-1)) + (i181111111111111111111111111111111111119 << 1);
                                                            f62084a = i19111111111111111111111111111111111111111111110 % 128;
                                                            int i19111111111111111111111111111111111111111111111 = i19111111111111111111111111111111111111111111110 % 2;
                                                            i28 = 1;
                                                        } else {
                                                            i27 = 1;
                                                            int i19111111111111111111111111111111111111111111112 = f62084a;
                                                            int i19111111111111111111111111111111111111111111113 = ((i19111111111111111111111111111111111111111111112 | 45) << 1) - (i19111111111111111111111111111111111111111111112 ^ 45);
                                                            f62085b = i19111111111111111111111111111111111111111111113 % 128;
                                                            int i19111111111111111111111111111111111111111111114 = i19111111111111111111111111111111111111111111113 % 2;
                                                            i28 = 0;
                                                        }
                                                        if ((i28 ^ 1) != i27) {
                                                            i29 = f62085b;
                                                            int i19111111111111111111111111111111111111111111115 = ((i29 & (-28)) | ((~i29) & 27)) + ((i29 & 27) << i27);
                                                            i30 = i19111111111111111111111111111111111111111111115 % 128;
                                                            f62084a = i30;
                                                            int i19111111111111111111111111111111111111111111116 = i19111111111111111111111111111111111111111111115 % 2;
                                                            if (cCharAt == ':') {
                                                                int i19111111111111111111111111111111111111111111117 = (-2) - ((-1) ^ (((i29 | 98) << i27) - (i29 ^ 98)));
                                                                int i19111111111111111111111111111111111111111111118 = i19111111111111111111111111111111111111111111117 % 128;
                                                                f62084a = i19111111111111111111111111111111111111111111118;
                                                                int i19111111111111111111111111111111111111111111119 = i19111111111111111111111111111111111111111111117 % 2;
                                                                int i2011111111111111111111117 = (i19111111111111111111111111111111111111111111118 | 15) << 1;
                                                                int i2011111111111111111111118 = -(i19111111111111111111111111111111111111111111118 ^ 15);
                                                                i31 = (i2011111111111111111111117 ^ i2011111111111111111111118) + ((i2011111111111111111111118 & i2011111111111111111111117) << 1);
                                                                f62085b = i31 % 128;
                                                                if (i31 % 2 == 0) {
                                                                    int i2011111111111111111111119 = 83 / 0;
                                                                }
                                                                return Integer.valueOf(i15);
                                                            }
                                                            int i20111111111111111111111110 = (-2) - (((i30 & 118) + (i30 | 118)) ^ (-1));
                                                            f62085b = i20111111111111111111111110 % 128;
                                                            int i20111111111111111111111111 = i20111111111111111111111110 % 2;
                                                        }
                                                    } else {
                                                        int i2021110 = i34 & 113;
                                                        int i2021111 = (((i34 ^ 113) | i2021110) << 1) - ((i34 | 113) & (~i2021110));
                                                        f62085b = i2021111 % 128;
                                                        int i2021112 = i2021111 % 2;
                                                    }
                                                }
                                                if (cCharAt == '+') {
                                                    int i201211110 = f62084a;
                                                    int i201211111 = i201211110 ^ 97;
                                                    int i2111111111111111111111110 = (i201211110 & 97) << 1;
                                                    int i2111111111111111111111111 = (i201211111 ^ i2111111111111111111111110) + ((i201211111 & i2111111111111111111111110) << 1);
                                                    f62085b = i2111111111111111111111111 % 128;
                                                    int i2111111111111111111111112 = i2111111111111111111111111 % 2;
                                                    int i2111111111111111111111113 = ((i201211110 & 31) - (~(i201211110 | 31))) - 1;
                                                    f62085b = i2111111111111111111111113 % 128;
                                                    i26 = 2;
                                                    int i2111111111111111111111114 = i2111111111111111111111113 % 2;
                                                    int i171111111111111111115 = f62084a + 89;
                                                    int i171111111111111111116 = i171111111111111111115 % 128;
                                                    f62085b = i171111111111111111116;
                                                    int i171111111111111111117 = i171111111111111111115 % i26;
                                                    int i171111111111111111118 = i171111111111111111116 & 73;
                                                    int i171111111111111111119 = -(-((i171111111111111111116 ^ 73) | i171111111111111111118));
                                                    int i1811112111118 = (i171111111111111111118 & i171111111111111111119) + (i171111111111111111118 | i171111111111111111119);
                                                    f62084a = i1811112111118 % 128;
                                                    int i1811112111119 = i1811112111118 % 2;
                                                    i22 = 1;
                                                    i23 = 1;
                                                } else if (cCharAt == '-') {
                                                    int i2111111111111111111111115 = f62085b;
                                                    i24 = i2111111111111111111111115 + 19;
                                                    f62084a = i24 % 128;
                                                    if (i24 % 2 != 0) {
                                                        i25 = 0;
                                                    } else {
                                                        i25 = 1;
                                                    }
                                                    int i2111111111111111111111116 = ((i2111111111111111111111115 & 19) - (~(i2111111111111111111111115 | 19))) - 1;
                                                    f62084a = i2111111111111111111111116 % 128;
                                                    int i2111111111111111111111117 = i2111111111111111111111116 % 2;
                                                    i23 = i25;
                                                    i22 = 1;
                                                } else {
                                                    int i2111111111111111111111118 = f62085b;
                                                    int i2111111111111111111111119 = (i2111111111111111111111118 & 89) + (i2111111111111111111111118 | 89);
                                                    f62084a = i2111111111111111111111119 % 128;
                                                    int i22111111111111 = i2111111111111111111111119 % 2;
                                                    i22 = 1;
                                                    i23 = 0;
                                                }
                                                if ((i23 ^ 1) != i22) {
                                                    int i1811111111111111111111111111111111111110 = f62085b;
                                                    int i1811111111111111111111111111111111111111 = i1811111111111111111111111111111111111110 ^ 7;
                                                    int i1811111111111111111111111111111111111112 = ((i1811111111111111111111111111111111111110 & 7) | i1811111111111111111111111111111111111111) << i22;
                                                    int i1811111111111111111111111111111111111113 = -i1811111111111111111111111111111111111111;
                                                    i32 = (i1811111111111111111111111111111111111112 ^ i1811111111111111111111111111111111111113) + ((i1811111111111111111111111111111111111112 & i1811111111111111111111111111111111111113) << i22);
                                                    f62084a = i32 % 128;
                                                    if (i32 % 2 != 0) {
                                                        i27 = 1;
                                                        i28 = 0;
                                                    } else {
                                                        i27 = 1;
                                                        i28 = 1;
                                                    }
                                                } else if (cCharAt == '.') {
                                                    int i1811111111111111111111111111111111111114 = f62085b;
                                                    int i1811111111111111111111111111111111111115 = (i1811111111111111111111111111111111111114 & 119) + (i1811111111111111111111111111111111111114 | 119);
                                                    f62084a = i1811111111111111111111111111111111111115 % 128;
                                                    int i1811111111111111111111111111111111111116 = i1811111111111111111111111111111111111115 % 2;
                                                    int i1811111111111111111111111111111111111117 = i1811111111111111111111111111111111111114 + 56;
                                                    i27 = 1;
                                                    int i191111111111111111111111111111111111111111111110 = (i1811111111111111111111111111111111111117 ^ (-1)) + (i1811111111111111111111111111111111111117 << 1);
                                                    f62084a = i191111111111111111111111111111111111111111111110 % 128;
                                                    int i191111111111111111111111111111111111111111111111 = i191111111111111111111111111111111111111111111110 % 2;
                                                    i28 = 1;
                                                } else {
                                                    i27 = 1;
                                                    int i191111111111111111111111111111111111111111111112 = f62084a;
                                                    int i191111111111111111111111111111111111111111111113 = ((i191111111111111111111111111111111111111111111112 | 45) << 1) - (i191111111111111111111111111111111111111111111112 ^ 45);
                                                    f62085b = i191111111111111111111111111111111111111111111113 % 128;
                                                    int i191111111111111111111111111111111111111111111114 = i191111111111111111111111111111111111111111111113 % 2;
                                                    i28 = 0;
                                                }
                                                if ((i28 ^ 1) != i27) {
                                                    i29 = f62085b;
                                                    int i191111111111111111111111111111111111111111111115 = ((i29 & (-28)) | ((~i29) & 27)) + ((i29 & 27) << i27);
                                                    i30 = i191111111111111111111111111111111111111111111115 % 128;
                                                    f62084a = i30;
                                                    int i191111111111111111111111111111111111111111111116 = i191111111111111111111111111111111111111111111115 % 2;
                                                    if (cCharAt == ':') {
                                                        int i191111111111111111111111111111111111111111111117 = (-2) - ((-1) ^ (((i29 | 98) << i27) - (i29 ^ 98)));
                                                        int i191111111111111111111111111111111111111111111118 = i191111111111111111111111111111111111111111111117 % 128;
                                                        f62084a = i191111111111111111111111111111111111111111111118;
                                                        int i191111111111111111111111111111111111111111111119 = i191111111111111111111111111111111111111111111117 % 2;
                                                        int i20111111111111111111111112 = (i191111111111111111111111111111111111111111111118 | 15) << 1;
                                                        int i20111111111111111111111113 = -(i191111111111111111111111111111111111111111111118 ^ 15);
                                                        i31 = (i20111111111111111111111112 ^ i20111111111111111111111113) + ((i20111111111111111111111113 & i20111111111111111111111112) << 1);
                                                        f62085b = i31 % 128;
                                                        if (i31 % 2 == 0) {
                                                            int i20111111111111111111111114 = 83 / 0;
                                                        }
                                                        return Integer.valueOf(i15);
                                                    }
                                                    int i20111111111111111111111115 = (-2) - (((i30 & 118) + (i30 | 118)) ^ (-1));
                                                    f62085b = i20111111111111111111111115 % 128;
                                                    int i20111111111111111111111116 = i20111111111111111111111115 % 2;
                                                }
                                            } else {
                                                int i22111111111112 = f62085b;
                                                int i22111111111113 = i22111111111112 & 101;
                                                int i22111111111114 = i22111111111112 | 101;
                                                int i22111111111115 = (i22111111111113 & i22111111111114) + (i22111111111114 | i22111111111113);
                                                int i22111111111116 = i22111111111115 % 128;
                                                f62084a = i22111111111116;
                                                int i22111111111117 = i22111111111115 % 2;
                                                int i22111111111118 = i22111111111116 & 33;
                                                int i22111111111119 = i22111111111118 + ((i22111111111116 ^ 33) | i22111111111118);
                                                f62085b = i22111111111119 % 128;
                                                int i22210 = i22111111111119 % 2;
                                            }
                                            int i2311114 = f62085b;
                                            int i2311115 = ~i2311114;
                                            i33 = (((i2311114 | 117) << 1) - (~(-((i2311114 & (-118)) | (i2311115 & 117))))) - 1;
                                            f62084a = i33 % 128;
                                            if (i33 % 2 != 0) {
                                                z11 = false;
                                            } else {
                                                z11 = true;
                                            }
                                            int i2311116 = (((i2311115 & 73) | (i2311114 & (-74))) - (~(-(-((i2311114 & 73) << 1))))) - 1;
                                            f62084a = i2311116 % 128;
                                            int i2311117 = i2311116 % 2;
                                            if (z11) {
                                                int i161111111111113 = f62085b;
                                                int i161111111111114 = i161111111111113 & 119;
                                                int i161111111111115 = ((i161111111111113 ^ 119) | i161111111111114) << 1;
                                                int i1711211111111110 = -((~i161111111111114) & (i161111111111113 | 119));
                                                int i1711211111111111 = (i161111111111115 & i1711211111111110) + (i161111111111115 | i1711211111111110);
                                                f62084a = i1711211111111111 % 128;
                                                int i1711211111111112 = i1711211111111111 % 2;
                                                int i1711211111111113 = i161111111111113 + 37;
                                                f62084a = i1711211111111113 % 128;
                                                int i1711211111111114 = i1711211111111113 % 2;
                                                i26 = 2;
                                            } else {
                                                if (cCharAt == '+') {
                                                    int i201211112 = f62084a;
                                                    int i201211113 = i201211112 ^ 97;
                                                    int i21111111111111111111111110 = (i201211112 & 97) << 1;
                                                    int i21111111111111111111111111 = (i201211113 ^ i21111111111111111111111110) + ((i201211113 & i21111111111111111111111110) << 1);
                                                    f62085b = i21111111111111111111111111 % 128;
                                                    int i21111111111111111111111112 = i21111111111111111111111111 % 2;
                                                    int i21111111111111111111111113 = ((i201211112 & 31) - (~(i201211112 | 31))) - 1;
                                                    f62085b = i21111111111111111111111113 % 128;
                                                    i26 = 2;
                                                    int i21111111111111111111111114 = i21111111111111111111111113 % 2;
                                                } else if (cCharAt == '-') {
                                                    int i21111111111111111111111115 = f62085b;
                                                    i24 = i21111111111111111111111115 + 19;
                                                    f62084a = i24 % 128;
                                                    if (i24 % 2 != 0) {
                                                        i25 = 0;
                                                    } else {
                                                        i25 = 1;
                                                    }
                                                    int i21111111111111111111111116 = ((i21111111111111111111111115 & 19) - (~(i21111111111111111111111115 | 19))) - 1;
                                                    f62084a = i21111111111111111111111116 % 128;
                                                    int i21111111111111111111111117 = i21111111111111111111111116 % 2;
                                                    i23 = i25;
                                                    i22 = 1;
                                                } else {
                                                    int i21111111111111111111111118 = f62085b;
                                                    int i21111111111111111111111119 = (i21111111111111111111111118 & 89) + (i21111111111111111111111118 | 89);
                                                    f62084a = i21111111111111111111111119 % 128;
                                                    int i221111111111110 = i21111111111111111111111119 % 2;
                                                    i22 = 1;
                                                    i23 = 0;
                                                }
                                                if ((i23 ^ 1) != i22) {
                                                    int i1811111111111111111111111111111111111118 = f62085b;
                                                    int i1811111111111111111111111111111111111119 = i1811111111111111111111111111111111111118 ^ 7;
                                                    int i18111111111111111111111111111111111111110 = ((i1811111111111111111111111111111111111118 & 7) | i1811111111111111111111111111111111111119) << i22;
                                                    int i18111111111111111111111111111111111111111 = -i1811111111111111111111111111111111111119;
                                                    i32 = (i18111111111111111111111111111111111111110 ^ i18111111111111111111111111111111111111111) + ((i18111111111111111111111111111111111111110 & i18111111111111111111111111111111111111111) << i22);
                                                    f62084a = i32 % 128;
                                                    if (i32 % 2 != 0) {
                                                        i27 = 1;
                                                        i28 = 0;
                                                    } else {
                                                        i27 = 1;
                                                        i28 = 1;
                                                    }
                                                } else if (cCharAt == '.') {
                                                    int i18111111111111111111111111111111111111112 = f62085b;
                                                    int i18111111111111111111111111111111111111113 = (i18111111111111111111111111111111111111112 & 119) + (i18111111111111111111111111111111111111112 | 119);
                                                    f62084a = i18111111111111111111111111111111111111113 % 128;
                                                    int i18111111111111111111111111111111111111114 = i18111111111111111111111111111111111111113 % 2;
                                                    int i18111111111111111111111111111111111111115 = i18111111111111111111111111111111111111112 + 56;
                                                    i27 = 1;
                                                    int i1911111111111111111111111111111111111111111111110 = (i18111111111111111111111111111111111111115 ^ (-1)) + (i18111111111111111111111111111111111111115 << 1);
                                                    f62084a = i1911111111111111111111111111111111111111111111110 % 128;
                                                    int i1911111111111111111111111111111111111111111111111 = i1911111111111111111111111111111111111111111111110 % 2;
                                                    i28 = 1;
                                                } else {
                                                    i27 = 1;
                                                    int i1911111111111111111111111111111111111111111111112 = f62084a;
                                                    int i1911111111111111111111111111111111111111111111113 = ((i1911111111111111111111111111111111111111111111112 | 45) << 1) - (i1911111111111111111111111111111111111111111111112 ^ 45);
                                                    f62085b = i1911111111111111111111111111111111111111111111113 % 128;
                                                    int i1911111111111111111111111111111111111111111111114 = i1911111111111111111111111111111111111111111111113 % 2;
                                                    i28 = 0;
                                                }
                                                if ((i28 ^ 1) != i27) {
                                                    i29 = f62085b;
                                                    int i1911111111111111111111111111111111111111111111115 = ((i29 & (-28)) | ((~i29) & 27)) + ((i29 & 27) << i27);
                                                    i30 = i1911111111111111111111111111111111111111111111115 % 128;
                                                    f62084a = i30;
                                                    int i1911111111111111111111111111111111111111111111116 = i1911111111111111111111111111111111111111111111115 % 2;
                                                    if (cCharAt == ':') {
                                                        int i1911111111111111111111111111111111111111111111117 = (-2) - ((-1) ^ (((i29 | 98) << i27) - (i29 ^ 98)));
                                                        int i1911111111111111111111111111111111111111111111118 = i1911111111111111111111111111111111111111111111117 % 128;
                                                        f62084a = i1911111111111111111111111111111111111111111111118;
                                                        int i1911111111111111111111111111111111111111111111119 = i1911111111111111111111111111111111111111111111117 % 2;
                                                        int i20111111111111111111111117 = (i1911111111111111111111111111111111111111111111118 | 15) << 1;
                                                        int i20111111111111111111111118 = -(i1911111111111111111111111111111111111111111111118 ^ 15);
                                                        i31 = (i20111111111111111111111117 ^ i20111111111111111111111118) + ((i20111111111111111111111118 & i20111111111111111111111117) << 1);
                                                        f62085b = i31 % 128;
                                                        if (i31 % 2 == 0) {
                                                            int i20111111111111111111111119 = 83 / 0;
                                                        }
                                                        return Integer.valueOf(i15);
                                                    }
                                                    int i201111111111111111111111110 = (-2) - (((i30 & 118) + (i30 | 118)) ^ (-1));
                                                    f62085b = i201111111111111111111111110 % 128;
                                                    int i201111111111111111111111111 = i201111111111111111111111110 % 2;
                                                }
                                            }
                                            int i1711111111111111111110 = f62084a + 89;
                                            int i1711111111111111111111 = i1711111111111111111110 % 128;
                                            f62085b = i1711111111111111111111;
                                            int i1711111111111111111112 = i1711111111111111111110 % i26;
                                            int i1711111111111111111113 = i1711111111111111111111 & 73;
                                            int i1711111111111111111114 = -(-((i1711111111111111111111 ^ 73) | i1711111111111111111113));
                                            int i18111121111110 = (i1711111111111111111113 & i1711111111111111111114) + (i1711111111111111111113 | i1711111111111111111114);
                                            f62084a = i18111121111110 % 128;
                                            int i18111121111111 = i18111121111110 % 2;
                                            i22 = 1;
                                            i23 = 1;
                                            if ((i23 ^ 1) != i22) {
                                                int i18111111111111111111111111111111111111116 = f62085b;
                                                int i18111111111111111111111111111111111111117 = i18111111111111111111111111111111111111116 ^ 7;
                                                int i18111111111111111111111111111111111111118 = ((i18111111111111111111111111111111111111116 & 7) | i18111111111111111111111111111111111111117) << i22;
                                                int i18111111111111111111111111111111111111119 = -i18111111111111111111111111111111111111117;
                                                i32 = (i18111111111111111111111111111111111111118 ^ i18111111111111111111111111111111111111119) + ((i18111111111111111111111111111111111111118 & i18111111111111111111111111111111111111119) << i22);
                                                f62084a = i32 % 128;
                                                if (i32 % 2 != 0) {
                                                    i27 = 1;
                                                    i28 = 0;
                                                } else {
                                                    i27 = 1;
                                                    i28 = 1;
                                                }
                                            } else if (cCharAt == '.') {
                                                int i181111111111111111111111111111111111111110 = f62085b;
                                                int i181111111111111111111111111111111111111111 = (i181111111111111111111111111111111111111110 & 119) + (i181111111111111111111111111111111111111110 | 119);
                                                f62084a = i181111111111111111111111111111111111111111 % 128;
                                                int i181111111111111111111111111111111111111112 = i181111111111111111111111111111111111111111 % 2;
                                                int i181111111111111111111111111111111111111113 = i181111111111111111111111111111111111111110 + 56;
                                                i27 = 1;
                                                int i19111111111111111111111111111111111111111111111110 = (i181111111111111111111111111111111111111113 ^ (-1)) + (i181111111111111111111111111111111111111113 << 1);
                                                f62084a = i19111111111111111111111111111111111111111111111110 % 128;
                                                int i19111111111111111111111111111111111111111111111111 = i19111111111111111111111111111111111111111111111110 % 2;
                                                i28 = 1;
                                            } else {
                                                i27 = 1;
                                                int i19111111111111111111111111111111111111111111111112 = f62084a;
                                                int i19111111111111111111111111111111111111111111111113 = ((i19111111111111111111111111111111111111111111111112 | 45) << 1) - (i19111111111111111111111111111111111111111111111112 ^ 45);
                                                f62085b = i19111111111111111111111111111111111111111111111113 % 128;
                                                int i19111111111111111111111111111111111111111111111114 = i19111111111111111111111111111111111111111111111113 % 2;
                                                i28 = 0;
                                            }
                                            if ((i28 ^ 1) != i27) {
                                                i29 = f62085b;
                                                int i19111111111111111111111111111111111111111111111115 = ((i29 & (-28)) | ((~i29) & 27)) + ((i29 & 27) << i27);
                                                i30 = i19111111111111111111111111111111111111111111111115 % 128;
                                                f62084a = i30;
                                                int i19111111111111111111111111111111111111111111111116 = i19111111111111111111111111111111111111111111111115 % 2;
                                                if (cCharAt == ':') {
                                                    int i19111111111111111111111111111111111111111111111117 = (-2) - ((-1) ^ (((i29 | 98) << i27) - (i29 ^ 98)));
                                                    int i19111111111111111111111111111111111111111111111118 = i19111111111111111111111111111111111111111111111117 % 128;
                                                    f62084a = i19111111111111111111111111111111111111111111111118;
                                                    int i19111111111111111111111111111111111111111111111119 = i19111111111111111111111111111111111111111111111117 % 2;
                                                    int i201111111111111111111111112 = (i19111111111111111111111111111111111111111111111118 | 15) << 1;
                                                    int i201111111111111111111111113 = -(i19111111111111111111111111111111111111111111111118 ^ 15);
                                                    i31 = (i201111111111111111111111112 ^ i201111111111111111111111113) + ((i201111111111111111111111113 & i201111111111111111111111112) << 1);
                                                    f62085b = i31 % 128;
                                                    if (i31 % 2 == 0) {
                                                        int i201111111111111111111111114 = 83 / 0;
                                                    }
                                                    return Integer.valueOf(i15);
                                                }
                                                int i201111111111111111111111115 = (-2) - (((i30 & 118) + (i30 | 118)) ^ (-1));
                                                f62085b = i201111111111111111111111115 % 128;
                                                int i201111111111111111111111116 = i201111111111111111111111115 % 2;
                                            }
                                        }
                                        int i246 = f62084a;
                                        i16 = ((i246 ^ 34) + ((i246 & 34) << 1)) - 1;
                                        f62085b = i16 % 128;
                                        if (i16 % 2 == 0) {
                                            throw null;
                                        }
                                    }
                                }
                                int i247 = f62085b;
                                int i248 = i247 ^ 61;
                                int i249 = -(-((i247 & 61) << 1));
                                i13 = (i248 & i249) + (i249 | i248);
                                f62084a = i13 % 128;
                                if (i13 % 2 != 0) {
                                    throw null;
                                }
                            }
                        }
                        return -1;
                    case 6:
                        String str4 = (String) objArr[0];
                        int iIntValue9 = ((Number) objArr[1]).intValue();
                        int iIntValue10 = ((Number) objArr[2]).intValue();
                        int i250 = f62084a;
                        int i251 = i250 ^ 3;
                        int i252 = ((i250 & 3) | i251) << 1;
                        int i253 = -i251;
                        int i254 = ((i252 | i253) << 1) - (i253 ^ i252);
                        f62085b = i254 % 128;
                        if (i254 % 2 == 0) {
                            int i255 = 82 / 0;
                        }
                        int i256 = i250 ^ 57;
                        int i257 = -(-((i250 & 57) << 1));
                        int i258 = (i256 & i257) + (i257 | i256);
                        f62085b = i258 % 128;
                        int i259 = i258 % 2;
                        int i260 = iIntValue9;
                        while (i260 < iIntValue10) {
                            int i261 = f62085b + 19;
                            f62084a = i261 % 128;
                            int i262 = i261 % 2;
                            char cCharAt3 = str4.charAt(i260);
                            if (cCharAt3 == '[') {
                                while (true) {
                                    i260++;
                                    if (i260 >= iIntValue10) {
                                    }
                                    int i263 = f62084a;
                                    int i264 = i263 & 49;
                                    int i265 = (i263 | 49) & (~i264);
                                    int i266 = -(-(i264 << 1));
                                    int i267 = (i265 ^ i266) + ((i265 & i266) << 1);
                                    f62085b = i267 % 128;
                                    if (i267 % 2 != 0) {
                                        if (str4.charAt(i260) == ']') {
                                            int i268 = f62085b;
                                            int i269 = (i268 ^ 76) + ((i268 & 76) << 1);
                                            int i270 = (i269 ^ (-1)) + (i269 << 1);
                                            f62084a = i270 % 128;
                                            int i271 = i270 % 2;
                                        }
                                    } else {
                                        if (str4.charAt(i260) == 'h') {
                                            int i2610 = f62085b;
                                            int i2611 = (i2610 ^ 76) + ((i2610 & 76) << 1);
                                            int i272 = (i2611 ^ (-1)) + (i2611 << 1);
                                            f62084a = i272 % 128;
                                            int i273 = i272 % 2;
                                        }
                                    }
                                }
                            } else if (cCharAt3 == ':') {
                                int i274 = f62084a;
                                int i275 = (i274 & 25) + (i274 | 25);
                                f62085b = i275 % 128;
                                int i276 = i275 % 2;
                                int i277 = i274 & 89;
                                int i278 = -(-((i274 ^ 89) | i277));
                                int i279 = (i277 ^ i278) + ((i278 & i277) << 1);
                                f62085b = i279 % 128;
                                int i280 = i279 % 2;
                                return Integer.valueOf(i260);
                            }
                            int i281 = -(-(i260 * (-949)));
                            int i282 = (-949) & i281;
                            int i283 = -(-((i281 ^ (-949)) | i282));
                            int i284 = (i282 ^ i283) + ((i283 & i282) << 1);
                            int i285 = ~i260;
                            int i286 = ~iIntValue9;
                            int i287 = i285 & i286;
                            int i288 = (i285 | i286) & (~i287);
                            int i289 = ~((i288 & i287) | (i288 ^ i287));
                            int i290 = iIntValue9 & 1;
                            int i291 = ((-2) & i286) | i290;
                            int i292 = (-2) & iIntValue9;
                            int i293 = (i291 & i292) | (i291 ^ i292);
                            int i294 = ~i293;
                            int i295 = (i293 | i294) & i294;
                            int i296 = i289 & i295;
                            int i297 = (((i289 | i295) & (~i296)) | i296) * ReturnCode.ERR_REPOSITORY;
                            int i298 = ((i284 ^ i297) | (i284 & i297)) << 1;
                            int i299 = -((i297 & (~i284)) | ((~i297) & i284));
                            int i300 = ((i298 | i299) << 1) - (i299 ^ i298);
                            int i301 = i286 & 1;
                            int i302 = (~i301) & (i286 | 1);
                            int i303 = ~((i301 & i302) | (i302 ^ i301));
                            int i304 = i260 & iIntValue9;
                            int i305 = (~i304) & (i260 | iIntValue9);
                            int i306 = (i304 & i305) | (i305 ^ i304);
                            int i307 = ~i306;
                            int i308 = (i306 | i307) & i307;
                            int i309 = ((i303 & i308) | (i303 ^ i308)) * (-950);
                            int i310 = i300 & i309;
                            int i311 = (i309 ^ i300) | i310;
                            int i312 = ((i310 | i311) << 1) - (i311 ^ i310);
                            int i313 = ((~i286) & i260) | i287;
                            int i314 = i260 & i286;
                            int i315 = ~((i314 & i313) | (i313 ^ i314));
                            int i316 = (iIntValue9 ^ 1) | i290;
                            int i317 = ~i316;
                            int i318 = (i316 | i317) & i317;
                            int i319 = i315 & i318;
                            int i320 = (i315 | i318) & (~i319);
                            int i321 = ((i320 & i319) | (i320 ^ i319)) * 950;
                            i260 = (i321 | i312) + (i312 & i321);
                            int i322 = f62084a;
                            int i323 = i322 & 81;
                            int i324 = -(-(i322 | 81));
                            int i325 = (i323 & i324) + (i324 | i323);
                            f62085b = i325 % 128;
                            int i326 = i325 % 2;
                            break;
                        }
                        int i327 = f62085b;
                        int i328 = i327 & 117;
                        int i329 = (i327 ^ 117) | i328;
                        int i330 = (i328 & i329) + (i329 | i328);
                        f62084a = i330 % 128;
                        int i331 = i330 % 2;
                        return Integer.valueOf(iIntValue10);
                    case 7:
                        String str5 = (String) objArr[0];
                        int iIntValue11 = ((Number) objArr[1]).intValue();
                        int iIntValue12 = ((Number) objArr[2]).intValue();
                        int i332 = f62084a;
                        int i333 = ((i332 ^ 97) | (i332 & 97)) << 1;
                        int i334 = -((97 & (~i332)) | (i332 & (-98)));
                        int i335 = (i333 & i334) + (i334 | i333);
                        f62085b = i335 % 128;
                        int i336 = i335 % 2;
                        int iIntValue13 = ((Integer) setOnFocusChangeListener(new Object[]{str5, Integer.valueOf(iIntValue11), Integer.valueOf(iIntValue12)}, -200248626, 200248628, iIntValue11)).intValue();
                        int i337 = f62085b;
                        int i338 = i337 & 117;
                        int i339 = (i337 ^ 117) | i338;
                        int i340 = (i338 ^ i339) + ((i339 & i338) << 1);
                        f62084a = i340 % 128;
                        if (i340 % 2 == 0) {
                            return Integer.valueOf(iIntValue13);
                        }
                        throw null;
                    default:
                        String str6 = (String) objArr[0];
                        int iIntValue14 = ((Number) objArr[1]).intValue();
                        int iIntValue15 = ((Number) objArr[2]).intValue();
                        int i341 = f62085b;
                        int i342 = i341 ^ 81;
                        int i343 = -(-((i341 & 81) << 1));
                        int i344 = (i342 ^ i343) + ((i343 & i342) << 1);
                        f62084a = i344 % 128;
                        if (i344 % 2 != 0) {
                            ((Integer) setOnFocusChangeListener(new Object[]{str6, Integer.valueOf(iIntValue14), Integer.valueOf(iIntValue15)}, 2001247882, -2001247877, iIntValue14)).intValue();
                            throw null;
                        }
                        int iIntValue16 = ((Integer) setOnFocusChangeListener(new Object[]{str6, Integer.valueOf(iIntValue14), Integer.valueOf(iIntValue15)}, 2001247882, -2001247877, iIntValue14)).intValue();
                        int i345 = f62084a;
                        int i346 = (i345 & (-72)) | ((~i345) & 71);
                        int i347 = -(-((i345 & 71) << 1));
                        int i348 = ((i346 | i347) << 1) - (i347 ^ i346);
                        f62085b = i348 % 128;
                        if (i348 % 2 == 0) {
                            int i349 = 28 / 0;
                        }
                        return Integer.valueOf(iIntValue16);
                }
            }
        }

        static {
            int i10 = f62075j;
            int i11 = i10 & 89;
            int i12 = (i10 ^ 89) | i11;
            int i13 = ((i11 | i12) << 1) - (i12 ^ i11);
            f62074i = i13 % 128;
            if (i13 % 2 != 0) {
                int i14 = 46 / 0;
            }
        }

        public setDividerPadding() {
            ArrayList arrayList = new ArrayList();
            this.f62081f = arrayList;
            arrayList.add("");
        }

        public static /* synthetic */ void a(Object[] objArr) {
            setDividerPadding setdividerpadding = (setDividerPadding) objArr[0];
            int iIntValue = ((Number) objArr[1]).intValue();
            int i10 = f62074i + 75;
            int i11 = i10 % 128;
            f62075j = i11;
            int i12 = i10 % 2;
            setdividerpadding.setOnDragListener = iIntValue;
            int i13 = i11 & 17;
            int i14 = ((~i13) & (i11 | 17)) + (i13 << 1);
            f62074i = i14 % 128;
            if (i14 % 2 != 0) {
                throw null;
            }
        }

        public static /* synthetic */ void b(Object[] objArr) {
            setDividerPadding setdividerpadding = (setDividerPadding) objArr[0];
            List<String> list = (List) objArr[1];
            int i10 = (-2) - ((f62075j + 84) ^ (-1));
            int i11 = i10 % 128;
            f62074i = i11;
            int i12 = i10 % 2;
            setdividerpadding.f62082g = list;
            if (i12 != 0) {
                throw null;
            }
            int i13 = i11 ^ 37;
            int i14 = (((i11 & 37) | i13) << 1) - i13;
            f62075j = i14 % 128;
            int i15 = i14 % 2;
        }

        public static /* synthetic */ List c(Object[] objArr) {
            setDividerPadding setdividerpadding = (setDividerPadding) objArr[0];
            int i10 = f62075j;
            int i11 = i10 & 77;
            int i12 = -(-((i10 ^ 77) | i11));
            int i13 = ((i11 | i12) << 1) - (i12 ^ i11);
            int i14 = i13 % 128;
            f62074i = i14;
            int i15 = i13 % 2;
            List<String> list = setdividerpadding.f62082g;
            if (i15 != 0) {
                throw null;
            }
            int i16 = (i14 & 123) + (i14 | 123);
            f62075j = i16 % 128;
            if (i16 % 2 != 0) {
                return list;
            }
            throw null;
        }

        public static /* synthetic */ yg d(Object[] objArr) {
            ArrayList arrayList;
            String str;
            String str2;
            setDividerPadding setdividerpadding = (setDividerPadding) objArr[0];
            int i10 = f62075j + 53;
            f62074i = i10 % 128;
            if (i10 % 2 != 0) {
                String str3 = setdividerpadding.setNavigationOnClickListener;
                throw null;
            }
            String str4 = setdividerpadding.setNavigationOnClickListener;
            if (str4 == null) {
                throw new IllegalStateException("scheme == null");
            }
            Companion companion = yg.INSTANCE;
            String str5 = setdividerpadding.setOnFocusChangeListener;
            int i11 = 6;
            Boolean bool = Boolean.FALSE;
            String str6 = (String) Companion.setDividerPadding(new Object[]{companion, str5, 0, 0, bool, 7}, 237128219, -237128212, 0);
            String str7 = (String) Companion.setDividerPadding(new Object[]{companion, setdividerpadding.setCompoundDrawableTintBlendMode, 0, 0, bool, 7}, 237128219, -237128212, 0);
            String str8 = setdividerpadding.getNavBarTitleString;
            if (str8 == null) {
                throw new IllegalStateException("host == null");
            }
            int iIntValue = ((Integer) setCompoundDrawableTintBlendMode(new Object[]{setdividerpadding}, 678674790, -678674776, System.identityHashCode(setdividerpadding))).intValue();
            ArrayList arrayList2 = setdividerpadding.f62081f;
            ArrayList arrayList3 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList2, 10));
            Iterator it = arrayList2.iterator();
            int i12 = f62075j;
            int i13 = (-2) - ((((i12 | 70) << 1) - (i12 ^ 70)) ^ (-1));
            f62074i = i13 % 128;
            int i14 = i13 % 2;
            while (it.hasNext()) {
                int i15 = f62075j + 27;
                f62074i = i15 % 128;
                int i16 = i15 % 2;
                arrayList3.add((String) Companion.setDividerPadding(new Object[]{yg.INSTANCE, (String) it.next(), 0, 0, Boolean.FALSE, 7}, 237128219, -237128212, 0));
                int i17 = f62074i;
                int i18 = i17 | 113;
                int i19 = ((i18 << 1) - (~(-((~(i17 & 113)) & i18)))) - 1;
                f62075j = i19 % 128;
                int i20 = i19 % 2;
            }
            List<String> list = setdividerpadding.f62082g;
            if (list == null) {
                int i21 = f62074i;
                int i22 = (((i21 & (-46)) | ((~i21) & 45)) - (~(-(-((i21 & 45) << 1))))) - 1;
                f62075j = i22 % 128;
                if (i22 % 2 == 0) {
                    throw null;
                }
                int i23 = i21 & 71;
                int i24 = i23 + ((i21 ^ 71) | i23);
                f62075j = i24 % 128;
                int i25 = i24 % 2;
                arrayList = null;
            } else {
                List<String> list2 = list;
                ArrayList arrayList4 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
                int i26 = f62074i + 7;
                f62075j = i26 % 128;
                int i27 = i26 % 2;
                for (String str9 : list2) {
                    int i28 = f62074i;
                    int i29 = ((i28 ^ 107) - (~(-(-((i28 & 107) << 1))))) - 1;
                    f62075j = i29 % 128;
                    int i30 = i29 % 2;
                    if (str9 == null) {
                        int i31 = f62074i;
                        int i32 = i31 & 113;
                        int i33 = -(-((i31 ^ 113) | i32));
                        int i34 = (i32 & i33) + (i33 | i32);
                        f62075j = i34 % 128;
                        int i35 = i34 % 2;
                        int i36 = ((i31 ^ 100) + ((i31 & 100) << 1)) - 1;
                        f62075j = i36 % 128;
                        int i37 = i36 % 2;
                        str = null;
                    } else {
                        Object[] objArr2 = new Object[i11];
                        objArr2[0] = yg.INSTANCE;
                        objArr2[1] = str9;
                        objArr2[2] = 0;
                        objArr2[3] = 0;
                        objArr2[4] = Boolean.TRUE;
                        objArr2[5] = 3;
                        str = (String) Companion.setDividerPadding(objArr2, 237128219, -237128212, 0);
                        int i38 = f62075j + 37;
                        f62074i = i38 % 128;
                        int i39 = i38 % 2;
                    }
                    arrayList4.add(str);
                    int i40 = f62074i;
                    int i41 = i40 & 67;
                    int i42 = i40 | 67;
                    int i43 = ((i41 | i42) << 1) - (i42 ^ i41);
                    f62075j = i43 % 128;
                    int i44 = i43 % 2;
                    i11 = 6;
                }
                int i45 = f62074i;
                int i46 = i45 & 41;
                int i47 = -(-(i45 | 41));
                int i48 = ((i46 | i47) << 1) - (i47 ^ i46);
                f62075j = i48 % 128;
                int i49 = i48 % 2;
                arrayList = arrayList4;
            }
            String str10 = setdividerpadding.setY;
            if (str10 == null) {
                int i50 = f62075j;
                int i51 = i50 & 7;
                int i52 = (((~i51) & (i50 | 7)) - (~(i51 << 1))) - 1;
                f62074i = i52 % 128;
                if (i52 % 2 != 0) {
                    int i53 = 82 / 0;
                }
                int i54 = ((((i50 ^ 113) | (i50 & 113)) << 1) - (~(-(((~i50) & 113) | (i50 & (-114)))))) - 1;
                f62074i = i54 % 128;
                int i55 = i54 % 2;
                str2 = null;
            } else {
                String str11 = (String) Companion.setDividerPadding(new Object[]{yg.INSTANCE, str10, 0, 0, Boolean.FALSE, 7}, 237128219, -237128212, 0);
                int i56 = f62075j + 55;
                f62074i = i56 % 128;
                int i57 = i56 % 2;
                str2 = str11;
            }
            yg ygVar = new yg(str4, str6, str7, str8, iIntValue, arrayList3, arrayList, str2, setdividerpadding.toString());
            int i58 = f62075j;
            int i59 = i58 ^ 75;
            int i60 = (i58 & 75) << 1;
            int i61 = (i59 & i60) + (i60 | i59);
            f62074i = i61 % 128;
            if (i61 % 2 == 0) {
                return ygVar;
            }
            throw null;
        }

        public static /* synthetic */ setDividerPadding e(Object[] objArr) {
            setDividerPadding setdividerpadding = (setDividerPadding) objArr[0];
            String str = (String) objArr[1];
            int i10 = f62075j;
            int i11 = i10 & 15;
            int i12 = ((((i10 ^ 15) | i11) << 1) - (~(-((i10 | 15) & (~i11))))) - 1;
            f62074i = i12 % 128;
            int i13 = i12 % 2;
            Intrinsics.checkNotNullParameter(str, "");
            Boolean bool = Boolean.FALSE;
            setCompoundDrawableTintBlendMode(new Object[]{setdividerpadding, (String) Companion.setDividerPadding(new Object[]{yg.INSTANCE, str, 0, 0, " \"':;<=>@[]^`{}|/\\?#", bool, bool, bool, bool, null, 251}, -700019500, 700019509, 0)}, -281855663, 281855675, System.identityHashCode(setdividerpadding));
            int i14 = f62074i;
            int i15 = (i14 & 121) + (i14 | 121);
            f62075j = i15 % 128;
            if (i15 % 2 == 0) {
                int i16 = 28 / 0;
            }
            return setdividerpadding;
        }

        public static /* synthetic */ Integer f(Object[] objArr) {
            setDividerPadding setdividerpadding = (setDividerPadding) objArr[0];
            int i10 = f62074i;
            int i11 = i10 + 65;
            f62075j = i11 % 128;
            int i12 = i11 % 2;
            int i13 = setdividerpadding.setOnDragListener;
            int i14 = ((i10 & 85) - (~(-(-(i10 | 85))))) - 1;
            f62075j = i14 % 128;
            if (i14 % 2 != 0) {
                return Integer.valueOf(i13);
            }
            int i15 = 3 / 0;
            return Integer.valueOf(i13);
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x00fe, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x0118, code lost:
        
            if (((java.lang.Boolean) setCompoundDrawableTintBlendMode(new java.lang.Object[]{r3}, 940434155, -940434136, (int) java.lang.System.currentTimeMillis())).booleanValue() == false) goto L19;
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x011a, code lost:
        
            r3 = com.mypinpad.tsdk.i.yg.setDividerPadding.f62075j;
            r6 = r3 & 83;
            r5 = ((r3 ^ 83) | r6) << 1;
            r3 = -((r3 | 83) & (~r6));
            r6 = (r5 ^ r3) + ((r3 & r5) << 1);
            com.mypinpad.tsdk.i.yg.setDividerPadding.f62074i = r6 % 128;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x0137, code lost:
        
            if ((r6 % 2) != 0) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x0139, code lost:
        
            setCompoundDrawableTintBlendMode(new java.lang.Object[]{r1}, -1586734868, 1586734894, java.lang.System.identityHashCode(r1));
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0144, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x0145, code lost:
        
            setCompoundDrawableTintBlendMode(new java.lang.Object[]{r1}, -1586734868, 1586734894, java.lang.System.identityHashCode(r1));
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x0150, code lost:
        
            throw null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x0151, code lost:
        
            r5 = r1.f62081f;
            r6 = r5.size();
            r7 = ((r6 ^ (-1)) | r6) << 1;
            r6 = -(~r6);
            r5 = ((java.lang.CharSequence) r5.get((r7 & r6) + (r6 | r7))).length();
            r1 = r1.f62081f;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x016d, code lost:
        
            if (r5 != 0) goto L22;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x016f, code lost:
        
            r5 = com.mypinpad.tsdk.i.yg.setDividerPadding.f62074i;
            r6 = r5 & 99;
            r5 = -(-(r5 | 99));
            r7 = (r6 ^ r5) + ((r5 & r6) << 1);
            r5 = r7 % 128;
            com.mypinpad.tsdk.i.yg.setDividerPadding.f62075j = r5;
            r7 = r7 % 2;
            r6 = r5 ^ 3;
            r7 = (r5 & 3) << 1;
            r8 = (r6 & r7) + (r6 | r7);
            com.mypinpad.tsdk.i.yg.setDividerPadding.f62074i = r8 % 128;
            r8 = r8 % 2;
            r6 = r5 & 39;
            r5 = r5 | 39;
            r7 = ((r6 | r5) << 1) - (r5 ^ r6);
            com.mypinpad.tsdk.i.yg.setDividerPadding.f62074i = r7 % 128;
            r7 = r7 % 2;
            r1.set(r1.size() - 1, r3);
            r3 = com.mypinpad.tsdk.i.yg.setDividerPadding.f62075j + 80;
            r5 = (r3 ^ (-1)) + (r3 << 1);
            com.mypinpad.tsdk.i.yg.setDividerPadding.f62074i = r5 % 128;
            r5 = r5 % 2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x01b3, code lost:
        
            r5 = com.mypinpad.tsdk.i.yg.setDividerPadding.f62075j;
            r6 = ((r5 | 51) << 1) - (r5 ^ 51);
            com.mypinpad.tsdk.i.yg.setDividerPadding.f62074i = r6 % 128;
            r6 = r6 % 2;
            r1.add(r3);
            r3 = com.mypinpad.tsdk.i.yg.setDividerPadding.f62075j;
            r5 = ((r3 | 66) << 1) - (r3 ^ 66);
            r3 = (r5 ^ (-1)) + (r5 << 1);
            com.mypinpad.tsdk.i.yg.setDividerPadding.f62074i = r3 % 128;
            r3 = r3 % 2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x01d4, code lost:
        
            if (r9 == false) goto L25;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x01d6, code lost:
        
            r3 = com.mypinpad.tsdk.i.yg.setDividerPadding.f62074i + 123;
            com.mypinpad.tsdk.i.yg.setDividerPadding.f62075j = r3 % 128;
            r3 = r3 % 2;
            r1.add("");
            r1 = com.mypinpad.tsdk.i.yg.setDividerPadding.f62075j + 75;
            com.mypinpad.tsdk.i.yg.setDividerPadding.f62074i = r1 % 128;
            r1 = r1 % 2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x01ed, code lost:
        
            r1 = com.mypinpad.tsdk.i.yg.setDividerPadding.f62075j;
            r1 = (-2) - (((r1 ^ 44) + ((r1 & 44) << 1)) ^ (-1));
            com.mypinpad.tsdk.i.yg.setDividerPadding.f62074i = r1 % 128;
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x01fe, code lost:
        
            if ((r1 % 2) == 0) goto L29;
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x0200, code lost:
        
            r1 = 91 / 0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x0203, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:?, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:5:0x009e, code lost:
        
            if (((java.lang.Boolean) setCompoundDrawableTintBlendMode(new java.lang.Object[]{r3}, -1178913025, 1178913032, (int) java.lang.System.currentTimeMillis())).booleanValue() != false) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x00e9, code lost:
        
            if (((java.lang.Boolean) setCompoundDrawableTintBlendMode(new java.lang.Object[]{r3}, -1178913025, 1178913032, (int) java.lang.System.currentTimeMillis())).booleanValue() != false) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x00eb, code lost:
        
            r0 = com.mypinpad.tsdk.i.yg.setDividerPadding.f62074i;
            r1 = r0 ^ 5;
            r0 = ((r0 & 5) | r1) << 1;
            r1 = -r1;
            r2 = ((r0 | r1) << 1) - (r0 ^ r1);
            com.mypinpad.tsdk.i.yg.setDividerPadding.f62075j = r2 % 128;
            r2 = r2 % 2;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static /* synthetic */ void g(java.lang.Object[] r23) {
            /*
                Method dump skipped, instruction units count: 516
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.i.yg.setDividerPadding.g(java.lang.Object[]):void");
        }

        public static /* synthetic */ String h(Object[] objArr) {
            setDividerPadding setdividerpadding = (setDividerPadding) objArr[0];
            int i10 = f62074i;
            int i11 = i10 & 35;
            int i12 = ((i10 | 35) & (~i11)) + (i11 << 1);
            int i13 = i12 % 128;
            f62075j = i13;
            int i14 = i12 % 2;
            String str = setdividerpadding.setOnFocusChangeListener;
            int i15 = ((i13 & 74) + (i13 | 74)) - 1;
            f62074i = i15 % 128;
            if (i15 % 2 == 0) {
                return str;
            }
            throw null;
        }

        public static /* synthetic */ String i(Object[] objArr) {
            setDividerPadding setdividerpadding = (setDividerPadding) objArr[0];
            int i10 = f62074i;
            int i11 = i10 & 17;
            int i12 = (i10 | 17) & (~i11);
            int i13 = -(-(i11 << 1));
            int i14 = (i12 & i13) + (i12 | i13);
            f62075j = i14 % 128;
            int i15 = i14 % 2;
            String str = setdividerpadding.setCompoundDrawableTintBlendMode;
            if (i15 != 0) {
                return str;
            }
            throw null;
        }

        public static /* synthetic */ setDividerPadding j(Object[] objArr) {
            setDividerPadding setdividerpadding = (setDividerPadding) objArr[0];
            int iIntValue = ((Number) objArr[1]).intValue();
            int i10 = f62074i;
            int i11 = ((i10 | 59) << 1) - (i10 ^ 59);
            int i12 = i11 % 128;
            f62075j = i12;
            if (i11 % 2 == 0) {
                throw null;
            }
            if (iIntValue <= 0) {
                int i13 = i12 & 27;
                int i14 = (i12 ^ 27) | i13;
                int i15 = (i13 ^ i14) + ((i13 & i14) << 1);
                f62074i = i15 % 128;
                int i16 = i15 % 2;
            } else {
                if (iIntValue < 65536) {
                    int i17 = i12 & 105;
                    int i18 = -(-((i12 ^ 105) | i17));
                    int i19 = ((i17 | i18) << 1) - (i18 ^ i17);
                    f62074i = i19 % 128;
                    int i20 = i19 % 2;
                    setCompoundDrawableTintBlendMode(new Object[]{setdividerpadding, Integer.valueOf(iIntValue)}, 1630367285, -1630367268, iIntValue);
                    int i21 = f62075j;
                    int i22 = ((i21 | 79) << 1) - (i21 ^ 79);
                    f62074i = i22 % 128;
                    if (i22 % 2 != 0) {
                        int i23 = 89 / 0;
                    }
                    return setdividerpadding;
                }
                int i24 = i12 & 39;
                int i25 = (i24 - (~((i12 ^ 39) | i24))) - 1;
                f62074i = i25 % 128;
                int i26 = i25 % 2;
            }
            throw new IllegalArgumentException(Intrinsics.stringPlus("unexpected port: ", Integer.valueOf(iIntValue)).toString());
        }

        public static /* synthetic */ ArrayList k(Object[] objArr) {
            setDividerPadding setdividerpadding = (setDividerPadding) objArr[0];
            int i10 = f62074i + 49;
            int i11 = i10 % 128;
            f62075j = i11;
            int i12 = i10 % 2;
            ArrayList arrayList = setdividerpadding.f62081f;
            int i13 = i11 + 73;
            f62074i = i13 % 128;
            if (i13 % 2 == 0) {
                return arrayList;
            }
            throw null;
        }

        public static /* synthetic */ Integer l(Object[] objArr) {
            setDividerPadding setdividerpadding = (setDividerPadding) objArr[0];
            int i10 = f62074i;
            int i11 = ~i10;
            int i12 = (i10 & (-114)) | (i11 & 113);
            int i13 = (i10 & 113) << 1;
            int i14 = (i12 & i13) + (i12 | i13);
            f62075j = i14 % 128;
            int i15 = i14 % 2;
            int i16 = setdividerpadding.setOnDragListener;
            if (i16 != -1) {
                int i17 = (i10 & (-120)) | (i11 & 119);
                int i18 = -(-((119 & i10) << 1));
                int i19 = (i17 ^ i18) + ((i17 & i18) << 1);
                f62075j = i19 % 128;
                if (i19 % 2 != 0) {
                    return Integer.valueOf(i16);
                }
                throw null;
            }
            Companion companion = yg.INSTANCE;
            String str = setdividerpadding.setNavigationOnClickListener;
            Intrinsics.checkNotNull(str);
            int iIntValue = ((Integer) Companion.setDividerPadding(new Object[]{str}, -728502532, 728502538, (int) System.currentTimeMillis())).intValue();
            int i20 = f62074i;
            int i21 = i20 ^ 89;
            int i22 = ((i20 & 89) | i21) << 1;
            int i23 = -i21;
            int i24 = (i22 & i23) + (i22 | i23);
            f62075j = i24 % 128;
            int i25 = i24 % 2;
            return Integer.valueOf(iIntValue);
        }

        public static /* synthetic */ Boolean m(Object[] objArr) {
            String str = (String) objArr[0];
            int i10 = f62074i;
            int i11 = (i10 & (-108)) | ((~i10) & 107);
            int i12 = -(-((i10 & 107) << 1));
            int i13 = (i11 ^ i12) + ((i12 & i11) << 1);
            f62075j = i13 % 128;
            int i14 = i13 % 2;
            if (!Intrinsics.areEqual(str, Constant.DOT_STRING)) {
                int i15 = f62074i;
                int i16 = i15 & 23;
                int i17 = (i15 ^ 23) | i16;
                int i18 = (i16 & i17) + (i17 | i16);
                f62075j = i18 % 128;
                if (i18 % 2 != 0 ? !l.equals(str, "%2e", true) : !l.equals(str, "%2e", false)) {
                    int i19 = f62075j;
                    int i20 = i19 & 107;
                    int i21 = (i19 ^ 107) | i20;
                    int i22 = ((i20 | i21) << 1) - (i21 ^ i20);
                    f62074i = i22 % 128;
                    if (i22 % 2 == 0) {
                        return Boolean.FALSE;
                    }
                    throw null;
                }
            }
            int i23 = f62075j + 125;
            f62074i = i23 % 128;
            int i24 = i23 % 2;
            return Boolean.TRUE;
        }

        public static /* synthetic */ void n(Object[] objArr) {
            setDividerPadding setdividerpadding = (setDividerPadding) objArr[0];
            int i10 = f62075j;
            int i11 = ((i10 ^ 52) + ((i10 & 52) << 1)) - 1;
            f62074i = i11 % 128;
            int i12 = i11 % 2;
            ArrayList arrayList = setdividerpadding.f62081f;
            int size = arrayList.size();
            int iIdentityHashCode = System.identityHashCode(setdividerpadding);
            int i13 = size * 971;
            int i14 = 1939 & i13;
            int i15 = (i13 ^ 1939) | i14;
            int i16 = (i14 & i15) + (i15 | i14);
            int i17 = ~size;
            int i18 = (i17 | size) & i17;
            int i19 = ~i18;
            int i20 = ~((i18 & i19) | (i19 ^ i18));
            int i21 = ~iIdentityHashCode;
            int i22 = (iIdentityHashCode | i21) & i21;
            int i23 = i22 & size;
            int i24 = (i22 | size) & (~i23);
            int i25 = ~((i24 & i23) | (i24 ^ i23));
            int i26 = ((i25 & i20) | (i20 ^ i25)) * (-970);
            int i27 = i16 | i26;
            int i28 = ((((i27 << 1) - (~(-((~(i26 & i16)) & i27)))) - 1) - (~(-(-((~size) * 1940))))) - 1;
            int i29 = ~i17;
            int i30 = (i17 & i21) | ((~i21) & size);
            int i31 = size & i21;
            int i32 = ~((i31 & i30) | (i30 ^ i31));
            int i33 = ((~i32) & i29) | ((~i29) & i32);
            int i34 = i32 & i29;
            int i35 = -(~(-(-(((i34 & i33) | (i33 ^ i34)) * 970))));
            int length = ((String) arrayList.remove((((i28 | i35) << 1) - (i35 ^ i28)) - 1)).length();
            ArrayList arrayList2 = setdividerpadding.f62081f;
            if (length == 0) {
                int i36 = f62074i;
                int i37 = i36 ^ 13;
                int i38 = ((i36 & 13) | i37) << 1;
                int i39 = -i37;
                int i40 = (i38 ^ i39) + ((i38 & i39) << 1);
                int i41 = i40 % 128;
                f62075j = i41;
                int i42 = i40 % 2;
                int i43 = i41 + 93;
                int i44 = i43 % 128;
                f62074i = i44;
                int i45 = i43 % 2;
                int i46 = i44 & 87;
                int i47 = (((i44 | 87) & (~i46)) - (~(-(-(i46 << 1))))) - 1;
                f62075j = i47 % 128;
                if (i47 % 2 == 0) {
                    arrayList2.isEmpty();
                    throw null;
                }
                if (arrayList2.isEmpty()) {
                    int i48 = f62075j;
                    int i49 = ((i48 ^ 126) + ((i48 & 126) << 1)) - 1;
                    f62074i = i49 % 128;
                    int i50 = i49 % 2;
                } else {
                    int i51 = f62075j;
                    int i52 = i51 & 31;
                    int i53 = -(-((i51 ^ 31) | i52));
                    int i54 = ((i52 | i53) << 1) - (i53 ^ i52);
                    int i55 = i54 % 128;
                    f62074i = i55;
                    if (i54 % 2 == 0) {
                        int i56 = i55 & 91;
                        int i57 = ((i55 ^ 91) | i56) << 1;
                        int i58 = -((i55 | 91) & (~i56));
                        int i59 = (i57 & i58) + (i58 | i57);
                        f62075j = i59 % 128;
                        arrayList2.set(i59 % 2 == 0 ? arrayList2.size() << 1 : arrayList2.size() - 1, "");
                        return;
                    }
                }
            } else {
                int i60 = f62074i;
                int i61 = (i60 ^ 35) + ((i60 & 35) << 1);
                f62075j = i61 % 128;
                int i62 = i61 % 2;
            }
            arrayList2.add("");
            int i63 = f62075j;
            int i64 = (i63 & 16) + (i63 | 16);
            int i65 = (i64 ^ (-1)) + (i64 << 1);
            f62074i = i65 % 128;
            int i66 = i65 % 2;
        }

        public static /* synthetic */ setDividerPadding o(Object[] objArr) {
            setDividerPadding setdividerpadding = (setDividerPadding) objArr[0];
            String str = (String) objArr[1];
            int i10 = f62075j;
            int i11 = (i10 ^ 15) + ((i10 & 15) << 1);
            f62074i = i11 % 128;
            int i12 = i11 % 2;
            Intrinsics.checkNotNullParameter(str, "");
            if (!(!l.equals(str, ProxyConfig.MATCH_HTTP, true))) {
                int i13 = f62074i + 31;
                f62075j = i13 % 128;
                int i14 = i13 % 2;
                setCompoundDrawableTintBlendMode(new Object[]{setdividerpadding, ProxyConfig.MATCH_HTTP}, -1518800833, 1518800839, System.identityHashCode(setdividerpadding));
                int i15 = f62075j;
                int i16 = i15 & 49;
                int i17 = (i15 ^ 49) | i16;
                int i18 = ((i16 | i17) << 1) - (i17 ^ i16);
                f62074i = i18 % 128;
                int i19 = i18 % 2;
            } else {
                if (!l.equals(str, ProxyConfig.MATCH_HTTPS, true)) {
                    throw new IllegalArgumentException(Intrinsics.stringPlus("unexpected scheme: ", str));
                }
                int i20 = f62074i;
                int i21 = ((i20 & 125) - (~(-(-(i20 | 125))))) - 1;
                f62075j = i21 % 128;
                if (i21 % 2 == 0) {
                    setCompoundDrawableTintBlendMode(new Object[]{setdividerpadding, ProxyConfig.MATCH_HTTPS}, -1518800833, 1518800839, System.identityHashCode(setdividerpadding));
                    throw null;
                }
                setCompoundDrawableTintBlendMode(new Object[]{setdividerpadding, ProxyConfig.MATCH_HTTPS}, -1518800833, 1518800839, System.identityHashCode(setdividerpadding));
                int i22 = f62074i + 27;
                f62075j = i22 % 128;
                int i23 = i22 % 2;
            }
            int i24 = f62075j;
            int i25 = i24 & 89;
            int i26 = ((i24 ^ 89) | i25) << 1;
            int i27 = -((i24 | 89) & (~i25));
            int i28 = ((i26 | i27) << 1) - (i27 ^ i26);
            f62074i = i28 % 128;
            if (i28 % 2 == 0) {
                return setdividerpadding;
            }
            throw null;
        }

        public static /* synthetic */ String p(Object[] objArr) {
            setDividerPadding setdividerpadding = (setDividerPadding) objArr[0];
            int i10 = f62075j;
            int i11 = (i10 & (-116)) | ((~i10) & 115);
            int i12 = (i10 & 115) << 1;
            int i13 = ((i11 | i12) << 1) - (i11 ^ i12);
            f62074i = i13 % 128;
            int i14 = i13 % 2;
            String str = setdividerpadding.setY;
            int i15 = ((i10 ^ 76) + ((i10 & 76) << 1)) - 1;
            f62074i = i15 % 128;
            if (i15 % 2 != 0) {
                int i16 = 88 / 0;
            }
            return str;
        }

        /* JADX WARN: Code duplicated, block: B:20:0x00b1  */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void q(Object[] objArr) {
            int i10;
            boolean z10;
            char c10 = 0;
            setDividerPadding setdividerpadding = (setDividerPadding) objArr[0];
            int i11 = 1;
            String str = (String) objArr[1];
            int i12 = 2;
            int iIntValue = ((Number) objArr[2]).intValue();
            char c11 = 3;
            int iIntValue2 = ((Number) objArr[3]).intValue();
            int i13 = f62074i;
            int i14 = i13 & 17;
            int i15 = (i14 - (~((i13 ^ 17) | i14))) - 1;
            f62075j = i15 % 128;
            if (i15 % 2 == 0) {
                throw null;
            }
            if (iIntValue == iIntValue2) {
                int i16 = i13 + 69;
                f62075j = i16 % 128;
                if (i16 % 2 == 0) {
                    int i17 = 15 / 0;
                    return;
                }
                return;
            }
            char cCharAt = str.charAt(iIntValue);
            if (cCharAt != '/') {
                int i18 = f62075j;
                int i19 = i18 ^ 41;
                int i20 = (i18 & 41) << 1;
                int i21 = (i19 & i20) + (i20 | i19);
                f62074i = i21 % 128;
                if (i21 % 2 == 0 ? cCharAt != '\\' : cCharAt != '!') {
                    ArrayList arrayList = setdividerpadding.f62081f;
                    int size = arrayList.size();
                    int i22 = (-785) - (~(-(-(size * (-782)))));
                    int i23 = ~size;
                    int i24 = -(~((i23 & (i23 | size)) * (-783)));
                    int i25 = (((i22 | i24) << 1) - (i22 ^ i24)) - 1;
                    int i26 = ~iIntValue;
                    int i27 = ((~((i26 ^ size) | (i26 & size))) * (-783)) + i25;
                    int i28 = i26 & (i26 | iIntValue);
                    int i29 = (size & i28) | (i28 ^ size);
                    int i30 = ~i29;
                    int i31 = -(-(((i29 | i30) & i30) * 783));
                    int i32 = i27 & i31;
                    arrayList.set(((i31 | i27) & (~i32)) + (i32 << 1), "");
                    int i33 = f62075j;
                    int i34 = i33 & 75;
                    int i35 = ((i33 | 75) & (~i34)) + (i34 << 1);
                    f62074i = i35 % 128;
                    int i36 = i35 % 2;
                    i10 = iIntValue;
                } else {
                    setdividerpadding.f62081f.clear();
                    setdividerpadding.f62081f.add("");
                    int i37 = iIntValue ^ 1;
                    int i38 = -(-((iIntValue & 1) << 1));
                    i10 = (i37 ^ i38) + ((i37 & i38) << 1);
                    int i39 = f62075j;
                    int i40 = (i39 & 57) + (i39 | 57);
                    f62074i = i40 % 128;
                    int i41 = i40 % 2;
                }
            } else {
                setdividerpadding.f62081f.clear();
                setdividerpadding.f62081f.add("");
                int i310 = iIntValue ^ 1;
                int i311 = -(-((iIntValue & 1) << 1));
                i10 = (i310 ^ i311) + ((i310 & i311) << 1);
                int i312 = f62075j;
                int i42 = (i312 & 57) + (i312 | 57);
                f62074i = i42 % 128;
                int i43 = i42 % 2;
            }
            while (i10 < iIntValue2) {
                int i44 = f62074i;
                int i45 = i44 & 45;
                int i46 = (i45 - (~(-(-((i44 ^ 45) | i45))))) - i11;
                f62075j = i46 % 128;
                if (i46 % i12 == 0) {
                    Object[] objArr2 = new Object[4];
                    objArr2[0] = str;
                    objArr2[1] = "/\\";
                    objArr2[i12] = Integer.valueOf(i10);
                    objArr2[3] = Integer.valueOf(iIntValue2);
                    ((Integer) yt.setY(objArr2, -1077986288, 1077986324, i10)).intValue();
                    throw null;
                }
                Object[] objArr3 = new Object[4];
                objArr3[c10] = str;
                objArr3[i11] = "/\\";
                objArr3[i12] = Integer.valueOf(i10);
                objArr3[c11] = Integer.valueOf(iIntValue2);
                int iIntValue3 = ((Integer) yt.setY(objArr3, -1077986288, 1077986324, i10)).intValue();
                if (iIntValue3 < iIntValue2) {
                    int i47 = f62075j;
                    int i48 = i47 | 73;
                    int i49 = i48 << 1;
                    int i50 = -((~(i47 & 73)) & i48);
                    int i51 = (i49 ^ i50) + ((i50 & i49) << i11);
                    f62074i = i51 % 128;
                    int i52 = i51 % i12;
                    z10 = i11;
                } else {
                    int i53 = f62074i + 17;
                    f62075j = i53 % 128;
                    int i54 = i53 % i12;
                    z10 = c10;
                }
                Object[] objArr4 = new Object[5];
                objArr4[c10] = setdividerpadding;
                objArr4[i11] = str;
                objArr4[i12] = Integer.valueOf(i10);
                objArr4[c11] = Integer.valueOf(iIntValue3);
                objArr4[4] = Boolean.valueOf(z10);
                setCompoundDrawableTintBlendMode(objArr4, -1146297518, 1146297541, i10);
                if (z10 != 0) {
                    int i55 = f62075j + 121;
                    int i56 = i55 % 128;
                    f62074i = i56;
                    int i57 = i55 % i12;
                    int i58 = (-2) - (((-515) - (~(iIntValue3 * 517))) ^ (-1));
                    int i59 = ~iIntValue3;
                    int i60 = (i59 | iIntValue3) & i59;
                    int i61 = i60 & iIntValue;
                    int i62 = (~i61) & (i60 | iIntValue);
                    int i63 = ~iIntValue;
                    int i64 = ~((i62 ^ i61) | (i62 & i61));
                    int i65 = (i63 | iIntValue) & i63;
                    int i66 = ~((i65 & (-2)) | ((~i65) & i11) | (i65 & i11));
                    int i67 = i64 & i66;
                    int i68 = (~i67) & (i66 | i64);
                    int i69 = (i68 & i67) | (i68 ^ i67);
                    int i70 = ~i63;
                    int i71 = i63 & iIntValue3;
                    int i72 = ~((i63 & i59) | (iIntValue3 & i70) | i71);
                    int i73 = i69 ^ i72;
                    int i74 = i69 & i72;
                    int i75 = (((i73 & i74) | (i73 ^ i74)) * (-516)) + i58;
                    int i76 = (-2) & i59;
                    int i77 = (~i76) & ((-2) | i59);
                    int i78 = (i77 ^ i76) | (i77 & i76);
                    int i79 = i78 & iIntValue;
                    int i80 = ~(((~i79) & (i78 | iIntValue)) | i79);
                    int i81 = ((-2) & i70) | (i63 & 1);
                    int i82 = (-2) & i63;
                    int i83 = (i81 & i82) | (i81 ^ i82);
                    int i84 = (i83 & i59) | ((~i83) & iIntValue3);
                    int i85 = i83 & iIntValue3;
                    int i86 = ~((i85 & i84) | (i84 ^ i85));
                    int i87 = i80 & i86;
                    int i88 = (i80 | i86) & (~i87);
                    int i89 = -(-(((i88 & i87) | (i88 ^ i87)) * LibMCryptConstants.IND_HEX_SEGMENTO2));
                    int i90 = ((i75 | i89) << 1) - (i75 ^ i89);
                    int i91 = (iIntValue3 & 1) | i76;
                    int i92 = (-2) & iIntValue3;
                    int i93 = ~((i91 & i92) | (i91 ^ i92));
                    int i94 = (i63 ^ iIntValue3) | i71;
                    int i95 = ~i94;
                    int i96 = (i94 | i95) & i95;
                    int i97 = ((~i96) & i93) | ((~i93) & i96);
                    int i98 = i93 & i96;
                    int i99 = (((i98 & i97) | (i97 ^ i98)) * LibMCryptConstants.IND_HEX_SEGMENTO2) + i90;
                    int i100 = (i56 & 111) + (i56 | 111);
                    f62075j = i100 % 128;
                    i12 = 2;
                    int i101 = i100 % 2;
                    i10 = i99;
                    c10 = 0;
                    i11 = 1;
                    c11 = 3;
                } else {
                    i10 = iIntValue3;
                }
            }
            int i102 = f62074i;
            int i103 = ((i102 & (-100)) | ((~i102) & 99)) + ((i102 & 99) << 1);
            f62075j = i103 % 128;
            int i104 = i103 % 2;
        }

        public static /* synthetic */ String r(Object[] objArr) {
            setDividerPadding setdividerpadding = (setDividerPadding) objArr[0];
            int i10 = f62074i;
            int i11 = i10 & 11;
            int i12 = -(-((i10 ^ 11) | i11));
            int i13 = (i11 & i12) + (i12 | i11);
            int i14 = i13 % 128;
            f62075j = i14;
            int i15 = i13 % 2;
            String str = setdividerpadding.setNavigationOnClickListener;
            if (i15 == 0) {
                throw null;
            }
            int i16 = (i14 & 1) + (i14 | 1);
            f62074i = i16 % 128;
            if (i16 % 2 == 0) {
                return str;
            }
            throw null;
        }

        /* JADX WARN: Code duplicated, block: B:17:0x00f4 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:18:0x00f5  */
        public static /* synthetic */ setDividerPadding s(Object[] objArr) {
            List list;
            int i10;
            setDividerPadding setdividerpadding = (setDividerPadding) objArr[0];
            String str = (String) objArr[1];
            int i11 = f62075j;
            int i12 = i11 & 67;
            int i13 = ((i11 ^ 67) | i12) << 1;
            int i14 = -((i11 | 67) & (~i12));
            int i15 = ((i13 | i14) << 1) - (i14 ^ i13);
            int i16 = i15 % 128;
            f62074i = i16;
            int i17 = i15 % 2;
            if (str != null) {
                Boolean bool = Boolean.TRUE;
                Boolean bool2 = Boolean.FALSE;
                String str2 = (String) Companion.setDividerPadding(new Object[]{yg.INSTANCE, str, 0, 0, HttpUrl.QUERY_ENCODE_SET, bool, bool2, bool, bool2, null, 211}, -700019500, 700019509, 0);
                if (str2 == null) {
                    int i18 = f62075j;
                    int i19 = i18 & 5;
                    int i20 = (((i18 | 5) & (~i19)) - (~(-(-(i19 << 1))))) - 1;
                    f62074i = i20 % 128;
                    if (i20 % 2 != 0) {
                        int i21 = 49 / 0;
                    }
                } else {
                    list = (List) Companion.setDividerPadding(new Object[]{str2}, 983036855, -983036855, (int) System.currentTimeMillis());
                    int i22 = f62075j + 17;
                    f62074i = i22 % 128;
                    int i23 = i22 % 2;
                }
                setCompoundDrawableTintBlendMode(new Object[]{setdividerpadding, list}, -523443401, 523443421, System.identityHashCode(setdividerpadding));
                int i24 = f62075j;
                i10 = (i24 & 65) + (i24 | 65);
                f62074i = i10 % 128;
                if (i10 % 2 == 0) {
                    return setdividerpadding;
                }
                throw null;
            }
            int i25 = ((i16 ^ 93) | (i16 & 93)) << 1;
            int i26 = -((i16 & (-94)) | ((~i16) & 93));
            int i27 = (i25 ^ i26) + ((i25 & i26) << 1);
            int i28 = i27 % 128;
            f62075j = i28;
            if (i27 % 2 == 0) {
                throw null;
            }
            int i29 = (i28 | 37) << 1;
            int i30 = -(((~i28) & 37) | (i28 & (-38)));
            int i31 = (i29 ^ i30) + ((i30 & i29) << 1);
            f62074i = i31 % 128;
            int i32 = i31 % 2;
            list = null;
            setCompoundDrawableTintBlendMode(new Object[]{setdividerpadding, list}, -523443401, 523443421, System.identityHashCode(setdividerpadding));
            int i210 = f62075j;
            i10 = (i210 & 65) + (i210 | 65);
            f62074i = i10 % 128;
            if (i10 % 2 == 0) {
                return setdividerpadding;
            }
            throw null;
        }

        /* JADX WARN: Code duplicated, block: B:41:0x01b3  */
        /* JADX WARN: Code restructure failed: missing block: B:107:?, code lost:
        
            return r19;
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x00c6, code lost:
        
            if (r2 != null) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x00f7, code lost:
        
            if (r2 != null) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x00f9, code lost:
        
            setCompoundDrawableTintBlendMode(new java.lang.Object[]{r19, r2}, -1035438385, 1035438388, java.lang.System.identityHashCode(r19));
            r0 = com.mypinpad.tsdk.i.yg.setDividerPadding.f62075j + 43;
            com.mypinpad.tsdk.i.yg.setDividerPadding.f62074i = r0 % 128;
            r0 = r0 % 2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x011f, code lost:
        
            throw new java.lang.IllegalArgumentException(kotlin.jvm.internal.Intrinsics.stringPlus("unexpected host: ", r0));
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static /* synthetic */ java.lang.Object setCompoundDrawableTintBlendMode(java.lang.Object[] r21, int r22, int r23, int r24) {
            /*
                Method dump skipped, instruction units count: 1502
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.i.yg.setDividerPadding.setCompoundDrawableTintBlendMode(java.lang.Object[], int, int, int):java.lang.Object");
        }

        public static /* synthetic */ void t(Object[] objArr) {
            setDividerPadding setdividerpadding = (setDividerPadding) objArr[0];
            String str = (String) objArr[1];
            int i10 = f62075j + 115;
            int i11 = i10 % 128;
            f62074i = i11;
            int i12 = i10 % 2;
            setdividerpadding.getNavBarTitleString = str;
            if (i12 != 0) {
                throw null;
            }
            int i13 = (-2) - ((i11 + 38) ^ (-1));
            f62075j = i13 % 128;
            if (i13 % 2 == 0) {
                throw null;
            }
        }

        public static /* synthetic */ void u(Object[] objArr) {
            setDividerPadding setdividerpadding = (setDividerPadding) objArr[0];
            String str = (String) objArr[1];
            int i10 = f62074i;
            int i11 = i10 & 63;
            int i12 = ((i10 ^ 63) | i11) << 1;
            int i13 = -((~i11) & (i10 | 63));
            int i14 = (i12 ^ i13) + ((i12 & i13) << 1);
            f62075j = i14 % 128;
            int i15 = i14 % 2;
            setdividerpadding.setNavigationOnClickListener = str;
            if (i15 == 0) {
                throw null;
            }
            int i16 = i10 & 25;
            int i17 = -(-((i10 ^ 25) | i16));
            int i18 = ((i16 | i17) << 1) - (i16 ^ i17);
            f62075j = i18 % 128;
            int i19 = i18 % 2;
        }

        public static /* synthetic */ void v(Object[] objArr) {
            setDividerPadding setdividerpadding = (setDividerPadding) objArr[0];
            String str = (String) objArr[1];
            int i10 = f62074i;
            int i11 = ((i10 ^ 94) + ((i10 & 94) << 1)) - 1;
            f62075j = i11 % 128;
            int i12 = i11 % 2;
            setdividerpadding.setY = str;
            if (i12 == 0) {
                throw null;
            }
        }

        /* JADX WARN: Code duplicated, block: B:24:0x01c2  */
        /* JADX WARN: Code duplicated, block: B:26:0x01ec  */
        /* JADX WARN: Code duplicated, block: B:27:0x0207  */
        /* JADX WARN: Code duplicated, block: B:29:0x0220  */
        /* JADX WARN: Code duplicated, block: B:30:0x023a  */
        /* JADX WARN: Code duplicated, block: B:33:0x0270  */
        /* JADX WARN: Code duplicated, block: B:35:0x0286  */
        /* JADX WARN: Code duplicated, block: B:38:0x0297  */
        /* JADX WARN: Code duplicated, block: B:40:0x02a6  */
        /* JADX WARN: Code duplicated, block: B:42:0x02ce  */
        /* JADX WARN: Code duplicated, block: B:44:0x02df  */
        /* JADX WARN: Code duplicated, block: B:47:0x030b  */
        /* JADX WARN: Code duplicated, block: B:49:0x0333  */
        /* JADX WARN: Code duplicated, block: B:52:0x0388  */
        /* JADX WARN: Code duplicated, block: B:54:0x03aa  */
        /* JADX WARN: Code duplicated, block: B:55:0x03cf  */
        /* JADX WARN: Code duplicated, block: B:58:0x0409  */
        /* JADX WARN: Code duplicated, block: B:60:0x041a  */
        /* JADX WARN: Code duplicated, block: B:62:0x0431  */
        public static /* synthetic */ String w(Object[] objArr) {
            int iIntValue;
            int i10;
            String str;
            String str2;
            int i11;
            Object compoundDrawableTintBlendMode;
            int i12;
            int i13;
            String str3;
            int i14;
            setDividerPadding setdividerpadding = (setDividerPadding) objArr[0];
            StringBuilder sb2 = new StringBuilder();
            if (((String) setCompoundDrawableTintBlendMode(new Object[]{setdividerpadding}, 604301021, -604301011, System.identityHashCode(setdividerpadding))) != null) {
                int i15 = f62074i;
                int i16 = i15 & 9;
                int i17 = i16 + ((i15 ^ 9) | i16);
                f62075j = i17 % 128;
                int i18 = i17 % 2;
                sb2.append((String) setCompoundDrawableTintBlendMode(new Object[]{setdividerpadding}, 604301021, -604301011, System.identityHashCode(setdividerpadding)));
                sb2.append("://");
                int i19 = f62075j;
                int i20 = i19 ^ 47;
                int i21 = ((((i19 & 47) | i20) << 1) - (~(-i20))) - 1;
                f62074i = i21 % 128;
                int i22 = i21 % 2;
            } else {
                sb2.append("//");
                int i23 = f62075j;
                int i24 = i23 & 21;
                int i25 = ((i23 ^ 21) | i24) << 1;
                int i26 = -((i23 | 21) & (~i24));
                int i27 = (i25 & i26) + (i26 | i25);
                f62074i = i27 % 128;
                int i28 = i27 % 2;
            }
            if (((String) setCompoundDrawableTintBlendMode(new Object[]{setdividerpadding}, -1798337688, 1798337689, System.identityHashCode(setdividerpadding))).length() <= 0) {
                int i29 = f62075j;
                int i30 = i29 & 31;
                int i31 = (i30 - (~(-(-((i29 ^ 31) | i30))))) - 1;
                int i32 = i31 % 128;
                f62074i = i32;
                int i33 = i31 % 2;
                int i34 = (i32 ^ 65) + ((i32 & 65) << 1);
                f62075j = i34 % 128;
                if (i34 % 2 == 0) {
                    ((String) setCompoundDrawableTintBlendMode(new Object[]{setdividerpadding}, -1472832141, 1472832171, System.identityHashCode(setdividerpadding))).getClass();
                    throw null;
                }
                if (((String) setCompoundDrawableTintBlendMode(new Object[]{setdividerpadding}, -1472832141, 1472832171, System.identityHashCode(setdividerpadding))).length() > 0) {
                    int i35 = f62075j;
                    int i36 = ((i35 ^ 105) | (i35 & 105)) << 1;
                    int i37 = -((i35 & (-106)) | ((~i35) & 105));
                    int i38 = (i36 ^ i37) + ((i37 & i36) << 1);
                    f62074i = i38 % 128;
                    if (i38 % 2 == 0) {
                    }
                } else {
                    int i39 = f62075j;
                    int i40 = i39 & 125;
                    int i41 = i40 + ((i39 ^ 125) | i40);
                    f62074i = i41 % 128;
                    int i42 = i41 % 2;
                }
                if (((String) setCompoundDrawableTintBlendMode(new Object[]{setdividerpadding}, -304530103, 304530107, System.identityHashCode(setdividerpadding))) != null) {
                    int i43 = f62074i;
                    int i44 = i43 & 107;
                    int i45 = -(-((i43 ^ 107) | i44));
                    int i46 = (i44 ^ i45) + ((i45 & i44) << 1);
                    f62075j = i46 % 128;
                    int i47 = i46 % 2;
                    str3 = (String) setCompoundDrawableTintBlendMode(new Object[]{setdividerpadding}, -304530103, 304530107, System.identityHashCode(setdividerpadding));
                    Intrinsics.checkNotNull(str3);
                    if (!StringsKt__StringsKt.contains$default((CharSequence) str3, AbstractJsonLexerKt.COLON, false, 2, (Object) null)) {
                        sb2.append((String) setCompoundDrawableTintBlendMode(new Object[]{setdividerpadding}, -304530103, 304530107, System.identityHashCode(setdividerpadding)));
                        int i48 = f62074i + 7;
                        f62075j = i48 % 128;
                        int i49 = i48 % 2;
                    } else {
                        int i50 = f62075j;
                        int i51 = i50 & 99;
                        int i52 = ((i50 ^ 99) | i51) << 1;
                        int i53 = -((i50 | 99) & (~i51));
                        i14 = ((i52 | i53) << 1) - (i53 ^ i52);
                        f62074i = i14 % 128;
                        if (i14 % 2 != 0) {
                            sb2.append('N');
                            sb2.append((String) setCompoundDrawableTintBlendMode(new Object[]{setdividerpadding}, -304530103, 304530107, System.identityHashCode(setdividerpadding)));
                            sb2.append((char) 1);
                        } else {
                            sb2.append(AbstractJsonLexerKt.BEGIN_LIST);
                            sb2.append((String) setCompoundDrawableTintBlendMode(new Object[]{setdividerpadding}, -304530103, 304530107, System.identityHashCode(setdividerpadding)));
                            sb2.append(AbstractJsonLexerKt.END_LIST);
                        }
                    }
                }
                if (((Integer) setCompoundDrawableTintBlendMode(new Object[]{setdividerpadding}, -1950527053, 1950527071, System.identityHashCode(setdividerpadding))).intValue() == -1) {
                    int i54 = f62074i;
                    int i55 = i54 & 47;
                    int i56 = (i54 | 47) & (~i55);
                    int i57 = -(-(i55 << 1));
                    i13 = (i56 & i57) + (i56 | i57);
                    f62075j = i13 % 128;
                    if (i13 % 2 != 0) {
                        throw null;
                    }
                    if (((String) setCompoundDrawableTintBlendMode(new Object[]{setdividerpadding}, 604301021, -604301011, System.identityHashCode(setdividerpadding))) != null) {
                        iIntValue = ((Integer) setCompoundDrawableTintBlendMode(new Object[]{setdividerpadding}, 678674790, -678674776, System.identityHashCode(setdividerpadding))).intValue();
                        if (((String) setCompoundDrawableTintBlendMode(new Object[]{setdividerpadding}, 604301021, -604301011, System.identityHashCode(setdividerpadding))) != null) {
                            i10 = f62074i + 21;
                            f62075j = i10 % 128;
                            if (i10 % 2 == 0) {
                                Companion companion = yg.INSTANCE;
                                str2 = (String) setCompoundDrawableTintBlendMode(new Object[]{setdividerpadding}, 604301021, -604301011, System.identityHashCode(setdividerpadding));
                                Intrinsics.checkNotNull(str2);
                                int i58 = 27 / 0;
                                if (iIntValue != ((Integer) Companion.setDividerPadding(new Object[]{str2}, -728502532, 728502538, (int) System.currentTimeMillis())).intValue()) {
                                    sb2.append(AbstractJsonLexerKt.COLON);
                                    sb2.append(iIntValue);
                                    int i59 = f62075j;
                                    int i60 = ((i59 & (-10)) | ((~i59) & 9)) + ((i59 & 9) << 1);
                                    f62074i = i60 % 128;
                                    int i61 = i60 % 2;
                                }
                            } else {
                                Companion companion2 = yg.INSTANCE;
                                str = (String) setCompoundDrawableTintBlendMode(new Object[]{setdividerpadding}, 604301021, -604301011, System.identityHashCode(setdividerpadding));
                                Intrinsics.checkNotNull(str);
                                if (iIntValue != ((Integer) Companion.setDividerPadding(new Object[]{str}, -728502532, 728502538, (int) System.currentTimeMillis())).intValue()) {
                                    sb2.append(AbstractJsonLexerKt.COLON);
                                    sb2.append(iIntValue);
                                    int i510 = f62075j;
                                    int i62 = ((i510 & (-10)) | ((~i510) & 9)) + ((i510 & 9) << 1);
                                    f62074i = i62 % 128;
                                    int i63 = i62 % 2;
                                }
                            }
                        } else {
                            sb2.append(AbstractJsonLexerKt.COLON);
                            sb2.append(iIntValue);
                            int i511 = f62075j;
                            int i64 = ((i511 & (-10)) | ((~i511) & 9)) + ((i511 & 9) << 1);
                            f62074i = i64 % 128;
                            int i65 = i64 % 2;
                        }
                    }
                } else {
                    iIntValue = ((Integer) setCompoundDrawableTintBlendMode(new Object[]{setdividerpadding}, 678674790, -678674776, System.identityHashCode(setdividerpadding))).intValue();
                    if (((String) setCompoundDrawableTintBlendMode(new Object[]{setdividerpadding}, 604301021, -604301011, System.identityHashCode(setdividerpadding))) != null) {
                        i10 = f62074i + 21;
                        f62075j = i10 % 128;
                        if (i10 % 2 == 0) {
                            Companion companion3 = yg.INSTANCE;
                            str2 = (String) setCompoundDrawableTintBlendMode(new Object[]{setdividerpadding}, 604301021, -604301011, System.identityHashCode(setdividerpadding));
                            Intrinsics.checkNotNull(str2);
                            int i512 = 27 / 0;
                            if (iIntValue != ((Integer) Companion.setDividerPadding(new Object[]{str2}, -728502532, 728502538, (int) System.currentTimeMillis())).intValue()) {
                                sb2.append(AbstractJsonLexerKt.COLON);
                                sb2.append(iIntValue);
                                int i513 = f62075j;
                                int i66 = ((i513 & (-10)) | ((~i513) & 9)) + ((i513 & 9) << 1);
                                f62074i = i66 % 128;
                                int i67 = i66 % 2;
                            }
                        } else {
                            Companion companion4 = yg.INSTANCE;
                            str = (String) setCompoundDrawableTintBlendMode(new Object[]{setdividerpadding}, 604301021, -604301011, System.identityHashCode(setdividerpadding));
                            Intrinsics.checkNotNull(str);
                            if (iIntValue != ((Integer) Companion.setDividerPadding(new Object[]{str}, -728502532, 728502538, (int) System.currentTimeMillis())).intValue()) {
                                sb2.append(AbstractJsonLexerKt.COLON);
                                sb2.append(iIntValue);
                                int i514 = f62075j;
                                int i68 = ((i514 & (-10)) | ((~i514) & 9)) + ((i514 & 9) << 1);
                                f62074i = i68 % 128;
                                int i69 = i68 % 2;
                            }
                        }
                    } else {
                        sb2.append(AbstractJsonLexerKt.COLON);
                        sb2.append(iIntValue);
                        int i515 = f62075j;
                        int i610 = ((i515 & (-10)) | ((~i515) & 9)) + ((i515 & 9) << 1);
                        f62074i = i610 % 128;
                        int i611 = i610 % 2;
                    }
                }
                Companion companion5 = yg.INSTANCE;
                Companion.setDividerPadding(new Object[]{(List) setCompoundDrawableTintBlendMode(new Object[]{setdividerpadding}, 1185071282, -1185071254, System.identityHashCode(setdividerpadding)), sb2}, 618922324, -618922319, (int) System.currentTimeMillis());
                if (((List) setCompoundDrawableTintBlendMode(new Object[]{setdividerpadding}, -27388724, 27388735, System.identityHashCode(setdividerpadding))) != null) {
                    int i70 = f62075j;
                    int i71 = ((i70 ^ 121) | (i70 & 121)) << 1;
                    int i72 = -(((~i70) & 121) | (i70 & (-122)));
                    i12 = ((i71 | i72) << 1) - (i72 ^ i71);
                    f62074i = i12 % 128;
                    if (i12 % 2 != 0) {
                        sb2.append('Y');
                        List list = (List) setCompoundDrawableTintBlendMode(new Object[]{setdividerpadding}, -27388724, 27388735, System.identityHashCode(setdividerpadding));
                        Intrinsics.checkNotNull(list);
                        Companion.setDividerPadding(new Object[]{list, sb2}, -313014387, 313014395, (int) System.currentTimeMillis());
                    } else {
                        sb2.append('?');
                        List list2 = (List) setCompoundDrawableTintBlendMode(new Object[]{setdividerpadding}, -27388724, 27388735, System.identityHashCode(setdividerpadding));
                        Intrinsics.checkNotNull(list2);
                        Companion.setDividerPadding(new Object[]{list2, sb2}, -313014387, 313014395, (int) System.currentTimeMillis());
                    }
                }
                if (((String) setCompoundDrawableTintBlendMode(new Object[]{setdividerpadding}, -1324665459, 1324665486, System.identityHashCode(setdividerpadding))) != null) {
                    int i73 = f62074i;
                    int i74 = i73 & 75;
                    i11 = (i74 - (~((i73 ^ 75) | i74))) - 1;
                    f62075j = i11 % 128;
                    if (i11 % 2 == 0) {
                        sb2.append('^');
                        compoundDrawableTintBlendMode = setCompoundDrawableTintBlendMode(new Object[]{setdividerpadding}, -1324665459, 1324665486, System.identityHashCode(setdividerpadding));
                    } else {
                        sb2.append(MaskTextWatcher.WILDCARD);
                        compoundDrawableTintBlendMode = setCompoundDrawableTintBlendMode(new Object[]{setdividerpadding}, -1324665459, 1324665486, System.identityHashCode(setdividerpadding));
                    }
                    sb2.append((String) compoundDrawableTintBlendMode);
                }
                String string = sb2.toString();
                Intrinsics.checkNotNullExpressionValue(string, "");
                int i75 = f62075j;
                int i76 = i75 | 117;
                int i77 = ((i76 << 1) - (~(-((~(i75 & 117)) & i76)))) - 1;
                f62074i = i77 % 128;
                int i78 = i77 % 2;
                return string;
            }
            int i79 = f62074i;
            int i80 = ((i79 ^ 102) + ((i79 & 102) << 1)) - 1;
            int i81 = i80 % 128;
            f62075j = i81;
            int i82 = i80 % 2;
            int i83 = ((i81 ^ 68) + ((i81 & 68) << 1)) - 1;
            f62074i = i83 % 128;
            int i84 = i83 % 2;
            sb2.append((String) setCompoundDrawableTintBlendMode(new Object[]{setdividerpadding}, -1798337688, 1798337689, System.identityHashCode(setdividerpadding)));
            if (((String) setCompoundDrawableTintBlendMode(new Object[]{setdividerpadding}, -1472832141, 1472832171, System.identityHashCode(setdividerpadding))).length() > 0) {
                int i85 = f62074i;
                int i86 = i85 ^ 47;
                int i87 = ((i85 & 47) | i86) << 1;
                int i88 = -i86;
                int i89 = (i87 ^ i88) + ((i88 & i87) << 1);
                f62075j = i89 % 128;
                int i90 = i89 % 2;
                int i91 = i85 & 19;
                int i92 = -(-((i85 ^ 19) | i91));
                int i93 = (i91 ^ i92) + ((i91 & i92) << 1);
                f62075j = i93 % 128;
                int i94 = i93 % 2;
                int i95 = i85 & 25;
                int i96 = (i85 ^ 25) | i95;
                int i97 = (i95 ^ i96) + ((i96 & i95) << 1);
                f62075j = i97 % 128;
                int i98 = i97 % 2;
                sb2.append(AbstractJsonLexerKt.COLON);
                sb2.append((String) setCompoundDrawableTintBlendMode(new Object[]{setdividerpadding}, -1472832141, 1472832171, System.identityHashCode(setdividerpadding)));
                int i99 = f62074i;
                int i100 = (((i99 | 8) << 1) - (i99 ^ 8)) - 1;
                f62075j = i100 % 128;
                int i101 = i100 % 2;
            } else {
                int i102 = f62075j;
                int i103 = (((i102 | 50) << 1) - (i102 ^ 50)) - 1;
                f62074i = i103 % 128;
                int i104 = i103 % 2;
            }
            sb2.append('@');
            int i105 = f62075j;
            int i106 = i105 & 71;
            int i107 = i106 + ((i105 ^ 71) | i106);
            f62074i = i107 % 128;
            int i108 = i107 % 2;
            if (((String) setCompoundDrawableTintBlendMode(new Object[]{setdividerpadding}, -304530103, 304530107, System.identityHashCode(setdividerpadding))) != null) {
                int i410 = f62074i;
                int i411 = i410 & 107;
                int i412 = -(-((i410 ^ 107) | i411));
                int i413 = (i411 ^ i412) + ((i412 & i411) << 1);
                f62075j = i413 % 128;
                int i414 = i413 % 2;
                str3 = (String) setCompoundDrawableTintBlendMode(new Object[]{setdividerpadding}, -304530103, 304530107, System.identityHashCode(setdividerpadding));
                Intrinsics.checkNotNull(str3);
                if (!StringsKt__StringsKt.contains$default((CharSequence) str3, AbstractJsonLexerKt.COLON, false, 2, (Object) null)) {
                    sb2.append((String) setCompoundDrawableTintBlendMode(new Object[]{setdividerpadding}, -304530103, 304530107, System.identityHashCode(setdividerpadding)));
                    int i415 = f62074i + 7;
                    f62075j = i415 % 128;
                    int i416 = i415 % 2;
                } else {
                    int i516 = f62075j;
                    int i517 = i516 & 99;
                    int i518 = ((i516 ^ 99) | i517) << 1;
                    int i519 = -((i516 | 99) & (~i517));
                    i14 = ((i518 | i519) << 1) - (i519 ^ i518);
                    f62074i = i14 % 128;
                    if (i14 % 2 != 0) {
                        sb2.append('N');
                        sb2.append((String) setCompoundDrawableTintBlendMode(new Object[]{setdividerpadding}, -304530103, 304530107, System.identityHashCode(setdividerpadding)));
                        sb2.append((char) 1);
                    } else {
                        sb2.append(AbstractJsonLexerKt.BEGIN_LIST);
                        sb2.append((String) setCompoundDrawableTintBlendMode(new Object[]{setdividerpadding}, -304530103, 304530107, System.identityHashCode(setdividerpadding)));
                        sb2.append(AbstractJsonLexerKt.END_LIST);
                    }
                }
            }
            if (((Integer) setCompoundDrawableTintBlendMode(new Object[]{setdividerpadding}, -1950527053, 1950527071, System.identityHashCode(setdividerpadding))).intValue() == -1) {
                int i520 = f62074i;
                int i521 = i520 & 47;
                int i522 = (i520 | 47) & (~i521);
                int i523 = -(-(i521 << 1));
                i13 = (i522 & i523) + (i522 | i523);
                f62075j = i13 % 128;
                if (i13 % 2 != 0) {
                    throw null;
                }
                if (((String) setCompoundDrawableTintBlendMode(new Object[]{setdividerpadding}, 604301021, -604301011, System.identityHashCode(setdividerpadding))) != null) {
                    iIntValue = ((Integer) setCompoundDrawableTintBlendMode(new Object[]{setdividerpadding}, 678674790, -678674776, System.identityHashCode(setdividerpadding))).intValue();
                    if (((String) setCompoundDrawableTintBlendMode(new Object[]{setdividerpadding}, 604301021, -604301011, System.identityHashCode(setdividerpadding))) != null) {
                        i10 = f62074i + 21;
                        f62075j = i10 % 128;
                        if (i10 % 2 == 0) {
                            Companion companion6 = yg.INSTANCE;
                            str2 = (String) setCompoundDrawableTintBlendMode(new Object[]{setdividerpadding}, 604301021, -604301011, System.identityHashCode(setdividerpadding));
                            Intrinsics.checkNotNull(str2);
                            int i5110 = 27 / 0;
                            if (iIntValue != ((Integer) Companion.setDividerPadding(new Object[]{str2}, -728502532, 728502538, (int) System.currentTimeMillis())).intValue()) {
                                sb2.append(AbstractJsonLexerKt.COLON);
                                sb2.append(iIntValue);
                                int i5111 = f62075j;
                                int i612 = ((i5111 & (-10)) | ((~i5111) & 9)) + ((i5111 & 9) << 1);
                                f62074i = i612 % 128;
                                int i613 = i612 % 2;
                            }
                        } else {
                            Companion companion7 = yg.INSTANCE;
                            str = (String) setCompoundDrawableTintBlendMode(new Object[]{setdividerpadding}, 604301021, -604301011, System.identityHashCode(setdividerpadding));
                            Intrinsics.checkNotNull(str);
                            if (iIntValue != ((Integer) Companion.setDividerPadding(new Object[]{str}, -728502532, 728502538, (int) System.currentTimeMillis())).intValue()) {
                                sb2.append(AbstractJsonLexerKt.COLON);
                                sb2.append(iIntValue);
                                int i5112 = f62075j;
                                int i614 = ((i5112 & (-10)) | ((~i5112) & 9)) + ((i5112 & 9) << 1);
                                f62074i = i614 % 128;
                                int i615 = i614 % 2;
                            }
                        }
                    } else {
                        sb2.append(AbstractJsonLexerKt.COLON);
                        sb2.append(iIntValue);
                        int i5113 = f62075j;
                        int i616 = ((i5113 & (-10)) | ((~i5113) & 9)) + ((i5113 & 9) << 1);
                        f62074i = i616 % 128;
                        int i617 = i616 % 2;
                    }
                }
            } else {
                iIntValue = ((Integer) setCompoundDrawableTintBlendMode(new Object[]{setdividerpadding}, 678674790, -678674776, System.identityHashCode(setdividerpadding))).intValue();
                if (((String) setCompoundDrawableTintBlendMode(new Object[]{setdividerpadding}, 604301021, -604301011, System.identityHashCode(setdividerpadding))) != null) {
                    i10 = f62074i + 21;
                    f62075j = i10 % 128;
                    if (i10 % 2 == 0) {
                        Companion companion8 = yg.INSTANCE;
                        str2 = (String) setCompoundDrawableTintBlendMode(new Object[]{setdividerpadding}, 604301021, -604301011, System.identityHashCode(setdividerpadding));
                        Intrinsics.checkNotNull(str2);
                        int i5114 = 27 / 0;
                        if (iIntValue != ((Integer) Companion.setDividerPadding(new Object[]{str2}, -728502532, 728502538, (int) System.currentTimeMillis())).intValue()) {
                            sb2.append(AbstractJsonLexerKt.COLON);
                            sb2.append(iIntValue);
                            int i5115 = f62075j;
                            int i618 = ((i5115 & (-10)) | ((~i5115) & 9)) + ((i5115 & 9) << 1);
                            f62074i = i618 % 128;
                            int i619 = i618 % 2;
                        }
                    } else {
                        Companion companion9 = yg.INSTANCE;
                        str = (String) setCompoundDrawableTintBlendMode(new Object[]{setdividerpadding}, 604301021, -604301011, System.identityHashCode(setdividerpadding));
                        Intrinsics.checkNotNull(str);
                        if (iIntValue != ((Integer) Companion.setDividerPadding(new Object[]{str}, -728502532, 728502538, (int) System.currentTimeMillis())).intValue()) {
                            sb2.append(AbstractJsonLexerKt.COLON);
                            sb2.append(iIntValue);
                            int i5116 = f62075j;
                            int i6110 = ((i5116 & (-10)) | ((~i5116) & 9)) + ((i5116 & 9) << 1);
                            f62074i = i6110 % 128;
                            int i6111 = i6110 % 2;
                        }
                    }
                } else {
                    sb2.append(AbstractJsonLexerKt.COLON);
                    sb2.append(iIntValue);
                    int i5117 = f62075j;
                    int i6112 = ((i5117 & (-10)) | ((~i5117) & 9)) + ((i5117 & 9) << 1);
                    f62074i = i6112 % 128;
                    int i6113 = i6112 % 2;
                }
            }
            Companion companion10 = yg.INSTANCE;
            Companion.setDividerPadding(new Object[]{(List) setCompoundDrawableTintBlendMode(new Object[]{setdividerpadding}, 1185071282, -1185071254, System.identityHashCode(setdividerpadding)), sb2}, 618922324, -618922319, (int) System.currentTimeMillis());
            if (((List) setCompoundDrawableTintBlendMode(new Object[]{setdividerpadding}, -27388724, 27388735, System.identityHashCode(setdividerpadding))) != null) {
                int i710 = f62075j;
                int i711 = ((i710 ^ 121) | (i710 & 121)) << 1;
                int i712 = -(((~i710) & 121) | (i710 & (-122)));
                i12 = ((i711 | i712) << 1) - (i712 ^ i711);
                f62074i = i12 % 128;
                if (i12 % 2 != 0) {
                    sb2.append('Y');
                    List list3 = (List) setCompoundDrawableTintBlendMode(new Object[]{setdividerpadding}, -27388724, 27388735, System.identityHashCode(setdividerpadding));
                    Intrinsics.checkNotNull(list3);
                    Companion.setDividerPadding(new Object[]{list3, sb2}, -313014387, 313014395, (int) System.currentTimeMillis());
                } else {
                    sb2.append('?');
                    List list4 = (List) setCompoundDrawableTintBlendMode(new Object[]{setdividerpadding}, -27388724, 27388735, System.identityHashCode(setdividerpadding));
                    Intrinsics.checkNotNull(list4);
                    Companion.setDividerPadding(new Object[]{list4, sb2}, -313014387, 313014395, (int) System.currentTimeMillis());
                }
            }
            if (((String) setCompoundDrawableTintBlendMode(new Object[]{setdividerpadding}, -1324665459, 1324665486, System.identityHashCode(setdividerpadding))) != null) {
                int i713 = f62074i;
                int i714 = i713 & 75;
                i11 = (i714 - (~((i713 ^ 75) | i714))) - 1;
                f62075j = i11 % 128;
                if (i11 % 2 == 0) {
                    sb2.append('^');
                    compoundDrawableTintBlendMode = setCompoundDrawableTintBlendMode(new Object[]{setdividerpadding}, -1324665459, 1324665486, System.identityHashCode(setdividerpadding));
                } else {
                    sb2.append(MaskTextWatcher.WILDCARD);
                    compoundDrawableTintBlendMode = setCompoundDrawableTintBlendMode(new Object[]{setdividerpadding}, -1324665459, 1324665486, System.identityHashCode(setdividerpadding));
                }
                sb2.append((String) compoundDrawableTintBlendMode);
            }
            String string2 = sb2.toString();
            Intrinsics.checkNotNullExpressionValue(string2, "");
            int i715 = f62075j;
            int i716 = i715 | 117;
            int i717 = ((i716 << 1) - (~(-((~(i715 & 117)) & i716)))) - 1;
            f62074i = i717 % 128;
            int i718 = i717 % 2;
            return string2;
        }

        public static /* synthetic */ String x(Object[] objArr) {
            setDividerPadding setdividerpadding = (setDividerPadding) objArr[0];
            int i10 = f62074i;
            int i11 = i10 & 117;
            int i12 = (i10 | 117) & (~i11);
            int i13 = i11 << 1;
            int i14 = (i12 ^ i13) + ((i12 & i13) << 1);
            int i15 = i14 % 128;
            f62075j = i15;
            int i16 = i14 % 2;
            String str = setdividerpadding.getNavBarTitleString;
            int i17 = i15 + 31;
            f62074i = i17 % 128;
            if (i17 % 2 != 0) {
                int i18 = 60 / 0;
            }
            return str;
        }

        public static /* synthetic */ void y(Object[] objArr) {
            setDividerPadding setdividerpadding = (setDividerPadding) objArr[0];
            String str = (String) objArr[1];
            int i10 = f62075j;
            int i11 = i10 & 29;
            int i12 = i11 + ((i10 ^ 29) | i11);
            f62074i = i12 % 128;
            if (i12 % 2 == 0) {
                Intrinsics.checkNotNullParameter(str, "");
                setdividerpadding.setOnFocusChangeListener = str;
            } else {
                Intrinsics.checkNotNullParameter(str, "");
                setdividerpadding.setOnFocusChangeListener = str;
                throw null;
            }
        }

        /* JADX WARN: Code duplicated, block: B:100:0x09df  */
        /* JADX WARN: Code duplicated, block: B:101:0x0ad0  */
        /* JADX WARN: Code duplicated, block: B:104:0x0adc A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:105:0x0add  */
        /* JADX WARN: Code duplicated, block: B:106:0x0ade  */
        /* JADX WARN: Code duplicated, block: B:116:0x0532 A[ADDED_TO_REGION, EDGE_INSN: B:116:0x0532->B:72:0x0532 BREAK  A[LOOP:0: B:41:0x02f2->B:123:0x02f2], REMOVE, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:24:0x01cf  */
        /* JADX WARN: Code duplicated, block: B:26:0x01e0 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:27:0x01e2  */
        /* JADX WARN: Code duplicated, block: B:29:0x01f2  */
        /* JADX WARN: Code duplicated, block: B:31:0x0208  */
        /* JADX WARN: Code duplicated, block: B:33:0x0286  */
        /* JADX WARN: Code duplicated, block: B:35:0x02a1  */
        /* JADX WARN: Code duplicated, block: B:37:0x02d1  */
        /* JADX WARN: Code duplicated, block: B:39:0x02e5  */
        /* JADX WARN: Code duplicated, block: B:40:0x02e6  */
        /* JADX WARN: Code duplicated, block: B:43:0x0319  */
        /* JADX WARN: Code duplicated, block: B:45:0x032e  */
        /* JADX WARN: Code duplicated, block: B:46:0x0336  */
        /* JADX WARN: Code duplicated, block: B:48:0x033c  */
        /* JADX WARN: Code duplicated, block: B:50:0x0355 A[ADDED_TO_REGION] */
        /* JADX WARN: Code duplicated, block: B:74:0x05d4  */
        /* JADX WARN: Code duplicated, block: B:76:0x05e0  */
        /* JADX WARN: Code duplicated, block: B:79:0x0653  */
        /* JADX WARN: Code duplicated, block: B:84:0x07a4  */
        /* JADX WARN: Code duplicated, block: B:87:0x080e  */
        /* JADX WARN: Code duplicated, block: B:90:0x0875  */
        /* JADX WARN: Code duplicated, block: B:92:0x0892  */
        /* JADX WARN: Code duplicated, block: B:94:0x08a7  */
        /* JADX WARN: Code duplicated, block: B:96:0x092e  */
        /* JADX WARN: Code duplicated, block: B:98:0x09c4  */
        /* JADX WARN: Code restructure failed: missing block: B:77:0x0650, code lost:
        
            if (r3 != (-1)) goto L81;
         */
        /* JADX WARN: Code restructure failed: missing block: B:80:0x06cc, code lost:
        
            if (r3 != (-1)) goto L81;
         */
        /* JADX WARN: Code restructure failed: missing block: B:81:0x06ce, code lost:
        
            r2 = com.mypinpad.tsdk.i.yg.setDividerPadding.f62075j;
            r3 = (r2 & 117) + (r2 | 117);
            com.mypinpad.tsdk.i.yg.setDividerPadding.f62074i = r3 % 128;
            r3 = r3 % 2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:82:0x06dd, code lost:
        
            r3 = com.mypinpad.tsdk.i.yg.setDividerPadding.f62074i;
            r4 = r3 & 67;
            r3 = r3 | 67;
            r7 = (r4 & r3) + (r3 | r4);
            com.mypinpad.tsdk.i.yg.setDividerPadding.f62075j = r7 % 128;
            r7 = r7 % 2;
            r3 = new java.lang.StringBuilder("Invalid URL port: \"");
            r1 = java.lang.System.identityHashCode(r1);
            r4 = -(-(r0 * (-344)));
            r8 = (-344) ^ r4;
            r4 = (r4 & (-344)) << 1;
            r9 = ((r8 | r4) << 1) - (r4 ^ r8);
            r0 = (r0 | r13) & r13;
            r4 = ((-2) & (~r0)) | (r0 & 1);
            r0 = (-2) & r0;
            r0 = ~((r0 & r4) | (r4 ^ r0));
            r4 = ~(((-2) ^ r1) | ((-2) & r1));
            r7 = ((~r4) & r0) | ((~r0) & r4);
            r0 = r0 & r4;
            r0 = -(-(((r0 & r7) | (r7 ^ r0)) * 345));
            r4 = ((r9 ^ r0) | (r9 & r0)) << 1;
            r0 = -((r0 & (~r9)) | ((~r0) & r9));
            r8 = ((r4 | r0) << 1) - (r0 ^ r4);
            r0 = ~r1;
            r4 = ((-2) & (~r0)) | (r0 & 1);
            r0 = (-2) & r0;
            r0 = ~((r0 & r4) | (r4 ^ r0));
            r2 = ~((r2 & r28) | (r2 ^ r28));
            r0 = -(-(((r0 & r2) | (r0 ^ r2)) * 345));
            r2 = (((r8 ^ r0) | (r8 & r0)) << 1) - ((r0 & (~r8)) | ((~r0) & r8));
            r0 = ((-2) & r14) | r28;
            r0 = (r0 & r12) | (r0 ^ r12);
            r0 = (r0 & r1) | (r0 ^ r1);
            r1 = ~r0;
            r0 = -(-(((r0 | r1) & r1) * 345));
            r1 = ((~r0) & r2) | ((~r2) & r0);
            r0 = -(-((r0 & r2) << 1));
            r0 = r5.substring((r1 & r0) + (r0 | r1), r10);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, "");
            r3.append(r0);
            r3.append('\"');
         */
        /* JADX WARN: Code restructure failed: missing block: B:83:0x07a3, code lost:
        
            throw new java.lang.IllegalArgumentException(r3.toString().toString());
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static /* synthetic */ com.mypinpad.tsdk.i.yg.setDividerPadding z(java.lang.Object[] r33) {
            /*
                Method dump skipped, instruction units count: 2929
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.i.yg.setDividerPadding.z(java.lang.Object[]):com.mypinpad.tsdk.i.yg$setDividerPadding");
        }

        @NotNull
        public final setDividerPadding getNavBarTitleString(@Nullable String p4) {
            return (setDividerPadding) setCompoundDrawableTintBlendMode(new Object[]{this, p4}, -1248415072, 1248415093, System.identityHashCode(this));
        }

        @NotNull
        public final yg setDividerPadding() {
            return (yg) setCompoundDrawableTintBlendMode(new Object[]{this}, -761647430, 761647459, System.identityHashCode(this));
        }

        @NotNull
        public final setDividerPadding setLayoutAnimation(@NotNull String p4) {
            return (setDividerPadding) setCompoundDrawableTintBlendMode(new Object[]{this, p4}, 173084554, -173084530, System.identityHashCode(this));
        }

        @NotNull
        public final setDividerPadding setNavigationOnClickListener(@NotNull String p4) {
            return (setDividerPadding) setCompoundDrawableTintBlendMode(new Object[]{this, p4}, 1445977854, -1445977846, System.identityHashCode(this));
        }

        @NotNull
        public final setDividerPadding setOnDragListener(@NotNull String p4) {
            return (setDividerPadding) setCompoundDrawableTintBlendMode(new Object[]{this, p4}, -1828450400, 1828450425, System.identityHashCode(this));
        }

        @NotNull
        public final setDividerPadding setOnFocusChangeListener(@Nullable yg p4, @NotNull String p10) {
            return (setDividerPadding) setCompoundDrawableTintBlendMode(new Object[]{this, p4, p10}, 789124859, -789124844, System.identityHashCode(this));
        }

        @NotNull
        public final setDividerPadding setOnLongClickListener(@NotNull String p4) {
            return (setDividerPadding) setCompoundDrawableTintBlendMode(new Object[]{this, p4}, -1502678913, 1502678929, System.identityHashCode(this));
        }

        @JvmName(name = "setX")
        public final void setX(@Nullable String str) {
            setCompoundDrawableTintBlendMode(new Object[]{this, str}, -1035438385, 1035438388, System.identityHashCode(this));
        }

        @NotNull
        public final setDividerPadding setY() {
            return (setDividerPadding) setCompoundDrawableTintBlendMode(new Object[]{this}, 1090928229, -1090928220, System.identityHashCode(this));
        }

        @NotNull
        public final String toString() {
            return (String) setCompoundDrawableTintBlendMode(new Object[]{this}, 1570075491, -1570075469, System.identityHashCode(this));
        }

        @NotNull
        public final setDividerPadding setDividerPadding(int p4) {
            return (setDividerPadding) setCompoundDrawableTintBlendMode(new Object[]{this, Integer.valueOf(p4)}, 802490738, -802490736, p4);
        }

        @JvmName(name = "setOnFocusChangeListener")
        public final void setOnFocusChangeListener(@Nullable String str) {
            setCompoundDrawableTintBlendMode(new Object[]{this, str}, 182830887, -182830874, System.identityHashCode(this));
        }

        @JvmName(name = "setY")
        public final void setY(@Nullable String str) {
            setCompoundDrawableTintBlendMode(new Object[]{this, str}, -1518800833, 1518800839, System.identityHashCode(this));
        }

        @JvmName(name = "setDividerPadding")
        public final void setDividerPadding(@NotNull String str) {
            setCompoundDrawableTintBlendMode(new Object[]{this, str}, 1369753135, -1369753135, System.identityHashCode(this));
        }

        @JvmName(name = "setOnFocusChangeListener")
        public final void setOnFocusChangeListener(int i10) {
            setCompoundDrawableTintBlendMode(new Object[]{this, Integer.valueOf(i10)}, 1630367285, -1630367268, i10);
        }

        @JvmName(name = "setCompoundDrawableTintBlendMode")
        @NotNull
        public final List<String> setCompoundDrawableTintBlendMode() {
            return (List) setCompoundDrawableTintBlendMode(new Object[]{this}, 1185071282, -1185071254, System.identityHashCode(this));
        }

        @JvmName(name = "setCompoundDrawableTintBlendMode")
        public final void setCompoundDrawableTintBlendMode(@NotNull String str) {
            setCompoundDrawableTintBlendMode(new Object[]{this, str}, -281855663, 281855675, System.identityHashCode(this));
        }
    }

    static {
        int i10 = f62064h;
        int i11 = i10 ^ 17;
        int i12 = ((i10 & 17) | i11) << 1;
        int i13 = -i11;
        int i14 = (i12 & i13) + (i12 | i13);
        f62065i = i14 % 128;
        if (i14 % 2 == 0) {
            throw null;
        }
    }

    public yg(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, int i10, @NotNull List<String> list, @Nullable List<String> list2, @Nullable String str5, @NotNull String str6) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str6, "");
        this.setTextAlignment = str;
        this.getAmountFieldTextColor = str2;
        this.setLayoutAnimation = str3;
        this.setOnLongClickListener = str4;
        this.setAlwaysDrawnWithCacheEnabled = i10;
        this.setIncludeFontPadding = list;
        this.f62069d = list2;
        this.setNavigationOnClickListener = str5;
        this.f62070e = str6;
        this.getNavBarTitleString = Intrinsics.areEqual(str, ProxyConfig.MATCH_HTTPS);
    }

    public static /* synthetic */ setDividerPadding a(Object[] objArr) {
        setDividerPadding setdividerpadding;
        yg ygVar = (yg) objArr[0];
        String str = (String) objArr[1];
        Intrinsics.checkNotNullParameter(str, "");
        try {
            setDividerPadding setdividerpadding2 = new setDividerPadding();
            setdividerpadding = (setDividerPadding) setDividerPadding.setCompoundDrawableTintBlendMode(new Object[]{setdividerpadding2, ygVar, str}, 789124859, -789124844, System.identityHashCode(setdividerpadding2));
            int i10 = f62065i;
            int i11 = i10 | 119;
            int i12 = (i11 << 1) - ((~(i10 & 119)) & i11);
            f62064h = i12 % 128;
            int i13 = i12 % 2;
        } catch (IllegalArgumentException unused) {
            setdividerpadding = null;
        }
        int i14 = f62065i;
        int i15 = ((i14 | 115) << 1) - (i14 ^ 115);
        f62064h = i15 % 128;
        if (i15 % 2 != 0) {
            int i16 = 82 / 0;
        }
        return setdividerpadding;
    }

    public static /* synthetic */ URI b(Object[] objArr) {
        URI uriCreate;
        yg ygVar = (yg) objArr[0];
        setDividerPadding setdividerpadding = (setDividerPadding) setOnFocusChangeListener(new Object[]{ygVar}, 2089282318, -2089282310, System.identityHashCode(ygVar));
        String string = ((setDividerPadding) setDividerPadding.setCompoundDrawableTintBlendMode(new Object[]{setdividerpadding}, 1090928229, -1090928220, System.identityHashCode(setdividerpadding))).toString();
        try {
            uriCreate = new URI(string);
            int i10 = f62064h + 111;
            f62065i = i10 % 128;
            int i11 = i10 % 2;
        } catch (URISyntaxException e5) {
            try {
                uriCreate = URI.create(new Regex("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]").replace(string, ""));
                Intrinsics.checkNotNullExpressionValue(uriCreate, "");
                int i12 = f62065i;
                int i13 = ((i12 & 30) + (i12 | 30)) - 1;
                f62064h = i13 % 128;
                int i14 = i13 % 2;
            } catch (Exception unused) {
                throw new RuntimeException(e5);
            }
        }
        int i15 = f62064h;
        int i16 = ((i15 | 79) << 1) - (i15 ^ 79);
        f62065i = i16 % 128;
        if (i16 % 2 == 0) {
            int i17 = 68 / 0;
        }
        return uriCreate;
    }

    public static /* synthetic */ ArrayList c(Object[] objArr) {
        yg ygVar = (yg) objArr[0];
        String str = ygVar.f62070e;
        int length = ygVar.setTextAlignment.length();
        int iIndexOf$default = StringsKt__StringsKt.indexOf$default((CharSequence) str, JsonPointer.SEPARATOR, ((length ^ 4) + ((length & 4) << 1)) - 1, false, 4, (Object) null);
        String str2 = ygVar.f62070e;
        int iIntValue = ((Integer) yt.setY(new Object[]{str2, "?#", Integer.valueOf(iIndexOf$default), Integer.valueOf(str2.length())}, -1077986288, 1077986324, iIndexOf$default)).intValue();
        ArrayList arrayList = new ArrayList();
        int i10 = f62064h;
        int i11 = ((i10 | 63) << 1) - (i10 ^ 63);
        f62065i = i11 % 128;
        int i12 = i11 % 2;
        while (iIndexOf$default < iIntValue) {
            int i13 = f62064h;
            int i14 = (i13 ^ 1) + ((i13 & 1) << 1);
            f62065i = i14 % 128;
            int i15 = i14 % 2;
            int i16 = (((iIndexOf$default ^ 1) | (iIndexOf$default & 1)) << 1) - (((~iIndexOf$default) & 1) | (iIndexOf$default & (-2)));
            iIndexOf$default = ((Integer) yt.setY(new Object[]{str2, Character.valueOf(JsonPointer.SEPARATOR), Integer.valueOf(i16), Integer.valueOf(iIntValue)}, -1105526239, 1105526263, i16)).intValue();
            String strSubstring = str2.substring(i16, iIndexOf$default);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "");
            arrayList.add(strSubstring);
            int i17 = f62065i + 17;
            f62064h = i17 % 128;
            int i18 = i17 % 2;
        }
        int i19 = f62065i;
        int i20 = (-2) - ((((i19 | 24) << 1) - (i19 ^ 24)) ^ (-1));
        f62064h = i20 % 128;
        if (i20 % 2 == 0) {
            return arrayList;
        }
        throw null;
    }

    public static /* synthetic */ Boolean d(Object[] objArr) {
        yg ygVar = (yg) objArr[0];
        int i10 = f62064h;
        int i11 = i10 & 21;
        int i12 = i11 + ((i10 ^ 21) | i11);
        f62065i = i12 % 128;
        int i13 = i12 % 2;
        boolean z10 = ygVar.getNavBarTitleString;
        if (i13 != 0) {
            return Boolean.valueOf(z10);
        }
        throw null;
    }

    public static /* synthetic */ setDividerPadding e(Object[] objArr) {
        int i10;
        yg ygVar = (yg) objArr[0];
        setDividerPadding setdividerpadding = new setDividerPadding();
        setDividerPadding.setCompoundDrawableTintBlendMode(new Object[]{setdividerpadding, ygVar.setTextAlignment}, -1518800833, 1518800839, System.identityHashCode(setdividerpadding));
        setDividerPadding.setCompoundDrawableTintBlendMode(new Object[]{setdividerpadding, (String) setOnFocusChangeListener(new Object[]{ygVar}, 1476306531, -1476306529, System.identityHashCode(ygVar))}, 1369753135, -1369753135, System.identityHashCode(setdividerpadding));
        setDividerPadding.setCompoundDrawableTintBlendMode(new Object[]{setdividerpadding, (String) setOnFocusChangeListener(new Object[]{ygVar}, 37053058, -37053057, System.identityHashCode(ygVar))}, -281855663, 281855675, System.identityHashCode(setdividerpadding));
        setDividerPadding.setCompoundDrawableTintBlendMode(new Object[]{setdividerpadding, ygVar.setOnLongClickListener}, -1035438385, 1035438388, System.identityHashCode(setdividerpadding));
        int iIntValue = ((Integer) Companion.setDividerPadding(new Object[]{ygVar.setTextAlignment}, -728502532, 728502538, (int) System.currentTimeMillis())).intValue();
        int i11 = ygVar.setAlwaysDrawnWithCacheEnabled;
        if (i11 != iIntValue) {
            int iIdentityHashCode = System.identityHashCode(ygVar);
            int i12 = ~iIdentityHashCode;
            int i13 = (-658841896) ^ i12;
            int i14 = (-658841896) & i12;
            int i15 = (i13 & i14) | (i13 ^ i14);
            int i16 = ~i15;
            int i17 = (i15 | i16) & i16;
            int i18 = iIdentityHashCode & 1850363269;
            int i19 = ((-1850363270) & i12) | i18;
            int i20 = (-1850363270) & iIdentityHashCode;
            int i21 = ~((i19 ^ i20) | (i19 & i20));
            int i22 = i17 ^ i21;
            int i23 = i17 & i21;
            int i24 = (i22 & i23) | (i22 ^ i23);
            int i25 = (i12 | iIdentityHashCode) & i12;
            int i26 = i25 & (-1850363270);
            int i27 = ~i25;
            int i28 = i26 | (1850363269 & i27);
            int i29 = i25 & 1850363269;
            int i30 = ~((i28 ^ i29) | (i28 & i29));
            int i31 = i24 ^ i30;
            int i32 = i30 & i24;
            int i33 = ((i31 & i32) | (i31 ^ i32)) * 959;
            int i34 = 1363138648 | i33;
            int i35 = i34 << 1;
            int i36 = -((~(i33 & 1363138648)) & i34);
            int i37 = (i35 ^ i36) + ((i35 & i36) << 1);
            int i38 = i37 & (-91502504);
            int i39 = ((i37 ^ (-91502504)) | i38) << 1;
            int i40 = -(((-91502504) | i37) & (~i38));
            int i41 = ((i39 | i40) << 1) - (i39 ^ i40);
            int i42 = (i27 & (-1850363270)) | i29;
            int i43 = (i42 & i26) | (i42 ^ i26);
            int i44 = ~i43;
            int i45 = (i43 | i44) & i44;
            int i46 = (-658841896) & iIdentityHashCode;
            int i47 = (iIdentityHashCode | (-658841896)) & (~i46);
            int i48 = (i47 & i46) | (i47 ^ i46);
            int i49 = ~i48;
            int i50 = (i48 | i49) & i49;
            int i51 = (i45 & i50) | (i45 ^ i50);
            int i52 = (1850363269 & i12) | i20;
            int i53 = ~((i52 & i18) | (i52 ^ i18));
            int i54 = ((~i53) & i51) | ((~i51) & i53);
            int i55 = i51 & i53;
            int i56 = (((i55 & i54) | (i54 ^ i55)) * 959) + i41;
            int iIdentityHashCode2 = System.identityHashCode(ygVar);
            int i57 = ~iIdentityHashCode2;
            int i58 = 5698941 & i57;
            int i59 = (i57 | 5698941) & (~i58);
            int i60 = (i59 & i58) | (i59 ^ i58);
            int i61 = -(-((~((i60 & 500871078) | (i60 ^ 500871078))) * 130));
            int i62 = (((-934421024) ^ i61) | ((-934421024) & i61)) << 1;
            int i63 = -((i61 & 934421023) | ((-934421024) & (~i61)));
            int i64 = (i62 & i63) + (i63 | i62);
            int i65 = i64 & 1450967040;
            int i66 = 1450967040 | i64;
            int i67 = (i65 & i66) + (i66 | i65);
            int i68 = ~((iIdentityHashCode2 & 501153791) | (501153791 ^ iIdentityHashCode2));
            int i69 = 5416228 ^ i68;
            int i70 = i68 & 5416228;
            int i71 = -(-(((i70 & i69) | (i69 ^ i70)) * 130));
            if (i56 > (((i67 ^ i71) | (i67 & i71)) << 1) - ((i71 & (~i67)) | ((~i71) & i67))) {
                throw null;
            }
            i10 = 2;
        } else {
            int i72 = f62065i;
            int i73 = ((i72 ^ 101) | (i72 & 101)) << 1;
            int i74 = -(((~i72) & 101) | (i72 & (-102)));
            int i75 = (i73 ^ i74) + ((i74 & i73) << 1);
            f62064h = i75 % 128;
            i10 = 2;
            int i76 = i75 % 2;
            i11 = -1;
        }
        Object[] objArr2 = new Object[i10];
        objArr2[0] = setdividerpadding;
        objArr2[1] = Integer.valueOf(i11);
        setDividerPadding.setCompoundDrawableTintBlendMode(objArr2, 1630367285, -1630367268, i11);
        ((List) setDividerPadding.setCompoundDrawableTintBlendMode(new Object[]{setdividerpadding}, 1185071282, -1185071254, System.identityHashCode(setdividerpadding))).clear();
        ((List) setDividerPadding.setCompoundDrawableTintBlendMode(new Object[]{setdividerpadding}, 1185071282, -1185071254, System.identityHashCode(setdividerpadding))).addAll((List) setOnFocusChangeListener(new Object[]{ygVar}, 844570556, -844570546, System.identityHashCode(ygVar)));
        setDividerPadding.setCompoundDrawableTintBlendMode(new Object[]{setdividerpadding, (String) setOnFocusChangeListener(new Object[]{ygVar}, -1955732447, 1955732447, System.identityHashCode(ygVar))}, 182830887, -182830874, System.identityHashCode(setdividerpadding));
        int i77 = f62065i;
        int i78 = (i77 & 23) + (i77 | 23);
        f62064h = i78 % 128;
        if (i78 % 2 == 0) {
            return setdividerpadding;
        }
        throw null;
    }

    public static /* synthetic */ yg f(Object[] objArr) {
        yg ygVar = (yg) objArr[0];
        String str = (String) objArr[1];
        int i10 = f62064h;
        int i11 = i10 & 51;
        int i12 = (i10 ^ 51) | i11;
        int i13 = (i11 & i12) + (i12 | i11);
        f62065i = i13 % 128;
        int i14 = i13 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        setDividerPadding setdividerpadding = (setDividerPadding) setOnFocusChangeListener(new Object[]{ygVar, str}, 732059098, -732059093, System.identityHashCode(ygVar));
        if (setdividerpadding != null) {
            yg ygVar2 = (yg) setDividerPadding.setCompoundDrawableTintBlendMode(new Object[]{setdividerpadding}, -761647430, 761647459, System.identityHashCode(setdividerpadding));
            int i15 = f62065i;
            int i16 = ((i15 ^ 55) - (~(-(-((i15 & 55) << 1))))) - 1;
            f62064h = i16 % 128;
            int i17 = i16 % 2;
            return ygVar2;
        }
        int i18 = f62064h;
        int i19 = i18 & 87;
        int i20 = (i18 | 87) & (~i19);
        int i21 = i19 << 1;
        int i22 = (i20 ^ i21) + ((i20 & i21) << 1);
        int i23 = i22 % 128;
        f62065i = i23;
        int i24 = i22 % 2;
        int i25 = (-2) - ((i23 + 78) ^ (-1));
        f62064h = i25 % 128;
        if (i25 % 2 == 0) {
            return null;
        }
        throw null;
    }

    public static /* synthetic */ String g(Object[] objArr) {
        boolean z10;
        yg ygVar = (yg) objArr[0];
        int i10 = (-2) - ((f62064h + 8) ^ (-1));
        f62065i = i10 % 128;
        int i11 = i10 % 2;
        if (ygVar.getAmountFieldTextColor.length() == 0) {
            int i12 = f62064h;
            int i13 = i12 & 9;
            int i14 = (i13 - (~(-(-((i12 ^ 9) | i13))))) - 1;
            f62065i = i14 % 128;
            int i15 = i14 % 2;
            int i16 = i12 + 73;
            f62065i = i16 % 128;
            int i17 = i16 % 2;
            z10 = true;
        } else {
            int i18 = f62065i + 61;
            f62064h = i18 % 128;
            int i19 = i18 % 2;
            z10 = false;
        }
        if (!(!z10)) {
            int i20 = f62065i;
            int i21 = (((i20 & (-8)) | ((~i20) & 7)) - (~((i20 & 7) << 1))) - 1;
            f62064h = i21 % 128;
            if (i21 % 2 == 0) {
                return "";
            }
            throw null;
        }
        int length = ygVar.setTextAlignment.length();
        int i22 = length & 3;
        int i23 = (length ^ 3) | i22;
        int i24 = (i22 ^ i23) + ((i23 & i22) << 1);
        String str = ygVar.f62070e;
        String strSubstring = str.substring(i24, ((Integer) yt.setY(new Object[]{str, ":@", Integer.valueOf(i24), Integer.valueOf(str.length())}, -1077986288, 1077986324, i24)).intValue());
        Intrinsics.checkNotNullExpressionValue(strSubstring, "");
        int i25 = f62065i + 105;
        f62064h = i25 % 128;
        int i26 = i25 % 2;
        return strSubstring;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x003a  */
    /* JADX WARN: Code duplicated, block: B:9:0x0026  */
    public static /* synthetic */ String h(Object[] objArr) {
        boolean z10;
        yg ygVar = (yg) objArr[0];
        int i10 = f62065i + 31;
        f62064h = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = 96 / 0;
            if (ygVar.setLayoutAnimation.length() == 0) {
                int i12 = f62064h;
                int i13 = i12 ^ 75;
                int i14 = ((((i12 & 75) | i13) << 1) - (~(-i13))) - 1;
                f62065i = i14 % 128;
                int i15 = i14 % 2;
                z10 = true;
            } else {
                int i16 = f62065i;
                int i17 = i16 & 87;
                int i18 = -(-((i16 ^ 87) | i17));
                int i19 = (i17 ^ i18) + ((i18 & i17) << 1);
                f62064h = i19 % 128;
                int i20 = i19 % 2;
                z10 = false;
            }
        } else if (ygVar.setLayoutAnimation.length() == 0) {
            int i110 = f62064h;
            int i111 = i110 ^ 75;
            int i112 = ((((i110 & 75) | i111) << 1) - (~(-i111))) - 1;
            f62065i = i112 % 128;
            int i113 = i112 % 2;
            z10 = true;
        } else {
            int i114 = f62065i;
            int i115 = i114 & 87;
            int i116 = -(-((i114 ^ 87) | i115));
            int i117 = (i115 ^ i116) + ((i116 & i115) << 1);
            f62064h = i117 % 128;
            int i21 = i117 % 2;
            z10 = false;
        }
        if (!(!z10)) {
            int i22 = f62065i;
            int i23 = (i22 & 11) + (i22 | 11);
            int i24 = i23 % 128;
            f62064h = i24;
            if (i23 % 2 != 0) {
                int i25 = 36 / 0;
            }
            int i26 = i24 + 45;
            f62065i = i26 % 128;
            if (i26 % 2 != 0) {
                return "";
            }
            throw null;
        }
        String str = ygVar.f62070e;
        int length = ygVar.setTextAlignment.length();
        int iIndexOf$default = StringsKt__StringsKt.indexOf$default((CharSequence) str, AbstractJsonLexerKt.COLON, (((length & (-4)) | ((~length) & 3)) - (~((length & 3) << 1))) - 1, false, 4, (Object) null);
        System.identityHashCode(ygVar);
        int i27 = -(-(iIndexOf$default * (-676)));
        int i28 = 678 & i27;
        int i29 = (i27 ^ 678) | i28;
        int i30 = (i28 ^ i29) + ((i29 & i28) << 1);
        int i31 = (i30 & (-1354)) + (i30 | (-1354));
        int i32 = ~iIndexOf$default;
        int i33 = ~i32;
        int i34 = i32 & 1;
        int i35 = ((-2) & i33) | i34;
        int i36 = i32 & (-2);
        int i37 = -(-(((i35 & i36) | (i35 ^ i36)) * (-677)));
        int i38 = ((i31 ^ i37) | (i31 & i37)) << 1;
        int i39 = -(((~i31) & i37) | ((~i37) & i31));
        int i40 = (i38 & i39) + (i39 | i38);
        int i41 = i36 | (i33 & 1);
        int i42 = -(-((~((i41 & i34) | (i41 ^ i34))) * 677));
        int i43 = i40 & i42;
        int i44 = (i42 ^ i40) | i43;
        String strSubstring = ygVar.f62070e.substring((i43 ^ i44) + ((i44 & i43) << 1), StringsKt__StringsKt.indexOf$default((CharSequence) ygVar.f62070e, '@', 0, false, 6, (Object) null));
        Intrinsics.checkNotNullExpressionValue(strSubstring, "");
        int i45 = f62064h;
        int i46 = (-2) - (((i45 & 92) + (i45 | 92)) ^ (-1));
        f62065i = i46 % 128;
        int i47 = i46 % 2;
        return strSubstring;
    }

    public static final /* synthetic */ char[] setAlwaysDrawnWithCacheEnabled() {
        return (char[]) setOnFocusChangeListener(new Object[0], -243040182, 243040188, (int) System.currentTimeMillis());
    }

    /* JADX WARN: Code duplicated, block: B:70:0x0500  */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x0054, code lost:
    
        if (r0.setNavigationOnClickListener == null) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:?, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0056, code lost:
    
        r0 = (r1 & 25) + (r1 | 25);
        com.mypinpad.tsdk.isolation.yg.f62064h = r0 % 128;
        r0 = r0 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0062, code lost:
    
        r1 = kotlin.text.StringsKt__StringsKt.indexOf$default((java.lang.CharSequence) r0.f62070e, com.bbva.cellswidgets.MaskTextWatcher.WILDCARD, 0, false, 6, (java.lang.Object) null);
        r2 = java.lang.System.identityHashCode(r0);
        r3 = r1 * (-396);
        r7 = (398 & r3) + (r3 | 398);
        r3 = ~r2;
        r5 = (r3 | r2) & r3;
        r5 = ~((r5 & (-2)) | ((-2) ^ r5));
        r8 = (-2) & r1;
        r11 = (~r8) & ((-2) | r1);
        r12 = ~r1;
        r11 = r11 | r8;
        r13 = ~r11;
        r11 = (r11 | r13) & r13;
        r5 = (r5 & r11) | (r5 ^ r11);
        r3 = (r3 & r1) | ((r3 & r12) | ((~r3) & r1));
        r13 = ~r3;
        r3 = (r3 | r13) & r13;
        r13 = ((~r3) & r5) | ((~r5) & r3);
        r3 = r3 & r5;
        r3 = (-2) - ((r7 - (~(((r3 & r13) | (r13 ^ r3)) * (-397)))) ^ (-1));
        r5 = -(~(r11 * (-397)));
        r7 = (r3 ^ r5) + ((r3 & r5) << 1);
        r3 = (r7 ^ (-1)) + (r7 << 1);
        r1 = r1 ^ (-2);
        r1 = ~((r1 & r8) | (r1 ^ r8));
        r4 = r2 ^ r1;
        r1 = r1 & r2;
        r1 = (r1 & r4) | (r4 ^ r1);
        r2 = ~(r12 | 1);
        r4 = ((~r2) & r1) | ((~r1) & r2);
        r1 = r1 & r2;
        r1 = ((r1 & r4) | (r4 ^ r1)) * 397;
        r2 = r3 & r1;
        r1 = (r1 | r3) & (~r2);
        r2 = -(-(r2 << 1));
        r7 = r0.f62070e.substring(((r1 | r2) << 1) - (r1 ^ r2));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, "");
        r0 = com.mypinpad.tsdk.isolation.yg.f62065i;
        r1 = (((r0 & (-50)) | ((~r0) & 49)) - (~(-(-((r0 & 49) << 1))))) - 1;
        com.mypinpad.tsdk.isolation.yg.f62064h = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x027b, code lost:
    
        if (r0.f62069d == null) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0280, code lost:
    
        if (r0.f62069d == null) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0282, code lost:
    
        r2 = r2 + 114;
        r0 = (r2 ^ (-1)) + (r2 << 1);
        com.mypinpad.tsdk.isolation.yg.f62064h = r0 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x028e, code lost:
    
        if ((r0 % 2) != 0) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0292, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0293, code lost:
    
        r1 = new java.lang.StringBuilder();
        com.mypinpad.tsdk.isolation.yg.Companion.setDividerPadding(new java.lang.Object[]{r0.f62069d, r1}, -313014387, 313014395, (int) java.lang.System.currentTimeMillis());
        r0 = r1.toString();
        r1 = com.mypinpad.tsdk.isolation.yg.f62065i;
        r2 = (r1 ^ 25) + ((r1 & 25) << 1);
        com.mypinpad.tsdk.isolation.yg.f62064h = r2 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x02bf, code lost:
    
        if ((r2 % 2) != 0) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x02c2, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x004f, code lost:
    
        if (r0.setNavigationOnClickListener == null) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:?, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:?, code lost:
    
        return r7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ java.lang.Object setOnFocusChangeListener(java.lang.Object[] r17, int r18, int r19, int r20) {
        /*
            Method dump skipped, instruction units count: 1438
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.yg.setOnFocusChangeListener(java.lang.Object[], int, int, int):java.lang.Object");
    }

    public final boolean equals(@Nullable Object p4) {
        return ((Boolean) setOnFocusChangeListener(new Object[]{this, p4}, 593879514, -593879507, System.identityHashCode(this))).booleanValue();
    }

    @JvmName(name = "getNavBarTitleString")
    @NotNull
    public final String getNavBarTitleString() {
        return (String) setOnFocusChangeListener(new Object[]{this}, 145484652, -145484636, System.identityHashCode(this));
    }

    public final int hashCode() {
        return ((Integer) setOnFocusChangeListener(new Object[]{this}, -145106696, 145106711, System.identityHashCode(this))).intValue();
    }

    @JvmName(name = "setCompoundDrawableTintBlendMode")
    public final int setCompoundDrawableTintBlendMode() {
        return ((Integer) setOnFocusChangeListener(new Object[]{this}, -2100304715, 2100304729, System.identityHashCode(this))).intValue();
    }

    @JvmName(name = "setDividerPadding")
    @NotNull
    public final String setDividerPadding() {
        return (String) setOnFocusChangeListener(new Object[]{this}, 952222842, -952222825, System.identityHashCode(this));
    }

    @NotNull
    public final String setIncludeFontPadding() {
        return (String) setOnFocusChangeListener(new Object[]{this}, -1659138662, 1659138681, System.identityHashCode(this));
    }

    @JvmName(name = "uri")
    @NotNull
    public final URI setLayoutAnimation() {
        return (URI) setOnFocusChangeListener(new Object[]{this}, -1622510043, 1622510052, System.identityHashCode(this));
    }

    @JvmName(name = "setNavigationOnClickListener")
    @NotNull
    public final List<String> setNavigationOnClickListener() {
        return (List) setOnFocusChangeListener(new Object[]{this}, 844570556, -844570546, System.identityHashCode(this));
    }

    @JvmName(name = "setOnDragListener")
    @NotNull
    public final String setOnDragListener() {
        return (String) setOnFocusChangeListener(new Object[]{this}, 37053058, -37053057, System.identityHashCode(this));
    }

    @JvmName(name = "setOnLongClickListener")
    @NotNull
    public final String setOnLongClickListener() {
        return (String) setOnFocusChangeListener(new Object[]{this}, 1476306531, -1476306529, System.identityHashCode(this));
    }

    @JvmName(name = "setTextAlignment")
    @Nullable
    public final String setTextAlignment() {
        return (String) setOnFocusChangeListener(new Object[]{this}, 986177680, -986177662, System.identityHashCode(this));
    }

    @JvmName(name = "setX")
    @NotNull
    public final String setX() {
        return (String) setOnFocusChangeListener(new Object[]{this}, -1565741557, 1565741570, System.identityHashCode(this));
    }

    @Nullable
    public final yg setY(@NotNull String p4) {
        return (yg) setOnFocusChangeListener(new Object[]{this, p4}, -1625905780, 1625905791, System.identityHashCode(this));
    }

    @JvmName(name = "setZ")
    @Nullable
    public final String setZ() {
        return (String) setOnFocusChangeListener(new Object[]{this}, -237364540, 237364560, System.identityHashCode(this));
    }

    @NotNull
    public final String toString() {
        return (String) setOnFocusChangeListener(new Object[]{this}, 76457577, -76457565, System.identityHashCode(this));
    }

    @JvmName(name = "url")
    @NotNull
    public final URL setY() {
        return (URL) setOnFocusChangeListener(new Object[]{this}, -589980931, 589980935, System.identityHashCode(this));
    }

    @JvmName(name = "setOnFocusChangeListener")
    public final boolean setOnFocusChangeListener() {
        return ((Boolean) setOnFocusChangeListener(new Object[]{this}, -487732585, 487732588, System.identityHashCode(this))).booleanValue();
    }
}
