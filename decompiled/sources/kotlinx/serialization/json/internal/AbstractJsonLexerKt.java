package kotlinx.serialization.json.internal;

import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import com.dasnano.vdvideoselfiecapture.config.VDVideoSelfieConfiguration;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: AbstractJsonLexer.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\f\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b#\u001a\u0010\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000\u001a\u0010\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0000\u001a\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0007H\u0000\"\u0014\u0010\t\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b\t\u0010\n\"\u0014\u0010\u000b\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u000b\u0010\n\"\u0014\u0010\f\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b\f\u0010\n\"\u0014\u0010\r\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b\r\u0010\n\"\u0014\u0010\u000e\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u000e\u0010\n\"\u0014\u0010\u000f\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u000f\u0010\n\"\u0014\u0010\u0010\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011\"\u0014\u0010\u0012\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0011\"\u0014\u0010\u0013\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0011\"\u0014\u0010\u0014\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0011\"\u0014\u0010\u0015\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0011\"\u0014\u0010\u0016\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0011\"\u0014\u0010\u0017\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0011\"\u0014\u0010\u0018\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0011\"\u0014\u0010\u0019\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0019\u0010\u0011\"\u0014\u0010\u001a\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u001a\u0010\u0011\"\u0014\u0010\u001b\u001a\u00020\u00008\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c\"\u0014\u0010\u001d\u001a\u00020\u00008\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u001d\u0010\u001c\"\u0014\u0010\u001e\u001a\u00020\u00008\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u001e\u0010\u001c\"\u0014\u0010\u001f\u001a\u00020\u00008\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u001f\u0010\u001c\"\u0014\u0010 \u001a\u00020\u00008\u0000X\u0080T¢\u0006\u0006\n\u0004\b \u0010\u001c\"\u0014\u0010!\u001a\u00020\u00008\u0000X\u0080T¢\u0006\u0006\n\u0004\b!\u0010\u001c\"\u0014\u0010\"\u001a\u00020\u00008\u0000X\u0080T¢\u0006\u0006\n\u0004\b\"\u0010\u001c\"\u0014\u0010#\u001a\u00020\u00008\u0000X\u0080T¢\u0006\u0006\n\u0004\b#\u0010\u001c\"\u0014\u0010$\u001a\u00020\u00008\u0000X\u0080T¢\u0006\u0006\n\u0004\b$\u0010\u001c\"\u0014\u0010%\u001a\u00020\u00008\u0000X\u0080T¢\u0006\u0006\n\u0004\b%\u0010\u001c\"\u0014\u0010&\u001a\u00020\u00008\u0000X\u0080T¢\u0006\u0006\n\u0004\b&\u0010\u001c\"\u0014\u0010'\u001a\u00020\u00008\u0000X\u0080T¢\u0006\u0006\n\u0004\b'\u0010\u001c\"\u0014\u0010(\u001a\u00020\u00078\u0000X\u0080T¢\u0006\u0006\n\u0004\b(\u0010)¨\u0006*"}, d2 = {"", "token", "", "tokenDescription", "", "c", "charToTokenClass", "", "escapeToChar", "lenientHint", "Ljava/lang/String;", "coerceInputValuesHint", "specialFlowingValuesHint", "ignoreUnknownKeysHint", "allowStructuredMapKeysHint", VDVideoSelfieConfiguration.NULL, "COMMA", "C", "COLON", "BEGIN_OBJ", "END_OBJ", "BEGIN_LIST", "END_LIST", "STRING", "STRING_ESC", "INVALID", "UNICODE_ESC", "TC_OTHER", "B", "TC_STRING", "TC_STRING_ESC", "TC_WHITESPACE", "TC_COMMA", "TC_COLON", "TC_BEGIN_OBJ", "TC_END_OBJ", "TC_BEGIN_LIST", "TC_END_LIST", "TC_EOF", "TC_INVALID", "asciiCaseMask", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "kotlinx-serialization-json"}, k = 2, mv = {1, 9, 0})
public final class AbstractJsonLexerKt {
    public static final char BEGIN_LIST = '[';
    public static final char BEGIN_OBJ = '{';
    public static final char COLON = ':';
    public static final char COMMA = ',';
    public static final char END_LIST = ']';
    public static final char END_OBJ = '}';
    public static final char INVALID = 0;

    @NotNull
    public static final String NULL = "null";
    public static final char STRING = '\"';
    public static final char STRING_ESC = '\\';
    public static final byte TC_BEGIN_LIST = 8;
    public static final byte TC_BEGIN_OBJ = 6;
    public static final byte TC_COLON = 5;
    public static final byte TC_COMMA = 4;
    public static final byte TC_END_LIST = 9;
    public static final byte TC_END_OBJ = 7;
    public static final byte TC_EOF = 10;
    public static final byte TC_INVALID = 127;
    public static final byte TC_OTHER = 0;
    public static final byte TC_STRING = 1;
    public static final byte TC_STRING_ESC = 2;
    public static final byte TC_WHITESPACE = 3;
    public static final char UNICODE_ESC = 'u';

    @NotNull
    public static final String allowStructuredMapKeysHint = "Use 'allowStructuredMapKeys = true' in 'Json {}' builder to convert such maps to [key1, value1, key2, value2,...] arrays.";
    public static final int asciiCaseMask = 32;

    @NotNull
    public static final String coerceInputValuesHint = "Use 'coerceInputValues = true' in 'Json {}' builder to coerce nulls if property has a default value.";

    @NotNull
    public static final String ignoreUnknownKeysHint = "Use 'ignoreUnknownKeys = true' in 'Json {}' builder to ignore unknown keys.";

    @NotNull
    public static final String lenientHint = "Use 'isLenient = true' in 'Json {}' builder to accept non-compliant JSON.";

    @NotNull
    public static final String specialFlowingValuesHint = "It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'";

    public static final byte charToTokenClass(char c10) {
        if (c10 < '~') {
            return CharMappings.CHAR_TO_TOKEN[c10];
        }
        return (byte) 0;
    }

    public static final char escapeToChar(int i10) {
        if (i10 < 117) {
            return CharMappings.ESCAPE_2_CHAR[i10];
        }
        return (char) 0;
    }

    @NotNull
    public static final String tokenDescription(byte b10) {
        if (b10 == 1) {
            return "quotation mark '\"'";
        }
        if (b10 == 2) {
            return "string escape sequence '\\'";
        }
        if (b10 == 4) {
            return "comma ','";
        }
        if (b10 == 5) {
            return "colon ':'";
        }
        if (b10 == 6) {
            return "start of the object '{'";
        }
        if (b10 == 7) {
            return "end of the object '}'";
        }
        if (b10 == 8) {
            return "start of the array '['";
        }
        if (b10 == 9) {
            return "end of the array ']'";
        }
        if (b10 == 10) {
            return "end of the input";
        }
        return b10 == 127 ? "invalid token" : "valid token";
    }
}
