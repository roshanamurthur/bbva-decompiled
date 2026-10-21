package kotlinx.serialization.json.internal;

import androidx.camera.camera2.internal.compat.u;
import androidx.camera.core.impl.utils.a;
import androidx.camera.core.processing.f;
import bk.g;
import com.adobe.marketing.mobile.EventDataKeys;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.bbva.glomohybrid.landing.data.mapper.LandingAEMContentMapper;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import java.util.ArrayList;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: AbstractJsonLexer.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\f\n\u0002\b\u0007\n\u0002\u0010\u0001\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\r\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\t\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b \u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\bh\u0010iJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0006\u0010\u0005\u001a\u00020\u0004J\u0010\u0010\b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H&J\b\u0010\t\u001a\u00020\u0004H&J\b\u0010\n\u001a\u00020\u0004H&J\b\u0010\f\u001a\u00020\u000bH&J\u0010\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\rH\u0004J\u0006\u0010\u0010\u001a\u00020\u0002J\u000e\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u000bJ\u0010\u0010\f\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\rH\u0016J\u0010\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\rH\u0004J!\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\u000b2\b\b\u0002\u0010\u0014\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0016\u0010\u0017J\u0006\u0010\u0019\u001a\u00020\u000bJ\u0010\u0010\u001b\u001a\u00020\u00042\b\b\u0002\u0010\u001a\u001a\u00020\u0004J\b\u0010\u001c\u001a\u00020\u0006H\u0016J\u001a\u0010 \u001a\u0004\u0018\u00010\u001d2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u0004H&J\u0010\u0010!\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\u001f\u001a\u00020\u0004J\u0006\u0010\"\u001a\u00020\u0002J\u0018\u0010%\u001a\u00020\u00062\u0006\u0010#\u001a\u00020\r2\u0006\u0010$\u001a\u00020\u0006H\u0016J\u0018\u0010'\u001a\u00020\u001d2\u0006\u0010$\u001a\u00020\u00062\u0006\u0010&\u001a\u00020\u0006H\u0016J\b\u0010(\u001a\u00020\u001dH&J3\u0010.\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u00042!\u0010-\u001a\u001d\u0012\u0013\u0012\u00110\u001d¢\u0006\f\b*\u0012\b\b+\u0012\u0004\b\b(,\u0012\u0004\u0012\u00020\u00020)H\u0016J\u0006\u0010/\u001a\u00020\u001dJ \u0010/\u001a\u00020\u001d2\u0006\u00101\u001a\u0002002\u0006\u00102\u001a\u00020\u00062\u0006\u00103\u001a\u00020\u0006H\u0005J\u0006\u00104\u001a\u00020\u001dJ\u0006\u00105\u001a\u00020\u001dJ\u0018\u00108\u001a\u00020\u00022\u0006\u00106\u001a\u00020\u00062\u0006\u00107\u001a\u00020\u0006H\u0014J3\u0010>\u001a\u00020\u00022\u0006\u00109\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\f\u0010;\u001a\b\u0012\u0004\u0012\u00020\u001d0:H\u0080\bø\u0001\u0000¢\u0006\u0004\b<\u0010=J\u000e\u0010@\u001a\u00020\u00022\u0006\u0010?\u001a\u00020\u0004J\b\u0010A\u001a\u00020\u001dH\u0016J\u000e\u0010C\u001a\u00020\u00022\u0006\u0010B\u001a\u00020\u001dJ\"\u0010\u0018\u001a\u00020\u00152\u0006\u0010;\u001a\u00020\u001d2\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010D\u001a\u00020\u001dJ\u0006\u0010F\u001a\u00020EJ\u0006\u0010G\u001a\u00020\u0004J\u0006\u0010H\u001a\u00020\u0004J\u0018\u0010I\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\u00042\u0006\u0010#\u001a\u00020\rH\u0002JC\u0010K\u001a\u00020\u00022\u0006\u00106\u001a\u00020\u00062\u0006\u00107\u001a\u00020\u00062\u0006\u0010J\u001a\u00020\u00042!\u0010-\u001a\u001d\u0012\u0013\u0012\u00110\u001d¢\u0006\f\b*\u0012\b\b+\u0012\u0004\b\b(,\u0012\u0004\u0012\u00020\u00020)H\u0002J\u0018\u0010M\u001a\u00020\u00062\u0006\u0010L\u001a\u00020\u00062\u0006\u00103\u001a\u00020\u0006H\u0002J\u0018\u0010O\u001a\u00020\u001d2\u0006\u0010L\u001a\u00020\u00062\u0006\u0010N\u001a\u00020\u0006H\u0002J\b\u0010P\u001a\u00020\u001dH\u0002J\b\u0010Q\u001a\u00020\u0004H\u0002J\u0010\u0010R\u001a\u00020\u00062\u0006\u00102\u001a\u00020\u0006H\u0002J\u0018\u0010S\u001a\u00020\u00062\u0006\u00101\u001a\u0002002\u0006\u0010$\u001a\u00020\u0006H\u0002J\u0018\u0010T\u001a\u00020\u00062\u0006\u00101\u001a\u0002002\u0006\u0010N\u001a\u00020\u0006H\u0002J\u0010\u0010G\u001a\u00020\u00042\u0006\u0010U\u001a\u00020\u0006H\u0003J\u0018\u0010W\u001a\u00020\u00022\u0006\u0010V\u001a\u00020\u001d2\u0006\u00103\u001a\u00020\u0006H\u0002R\u0016\u0010N\u001a\u00020\u00068\u0000@\u0000X\u0081\u000e¢\u0006\u0006\n\u0004\bN\u0010XR\u0014\u0010Z\u001a\u00020Y8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bZ\u0010[R\u0018\u0010\\\u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\\\u0010]R&\u0010`\u001a\u00060^j\u0002`_8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b`\u0010a\u001a\u0004\bb\u0010c\"\u0004\bd\u0010eR\u0014\u00101\u001a\u0002008$X¤\u0004¢\u0006\u0006\u001a\u0004\bf\u0010g\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006j"}, d2 = {"Lkotlinx/serialization/json/internal/AbstractJsonLexer;", "", "", "ensureHaveChars", "", "isNotEof", "", "position", "prefetchOrEof", "tryConsumeComma", "canConsumeValue", "", "consumeNextToken", "", "c", "isValidValueStart", "expectEof", "expected", "unexpectedToken", "expectedToken", "wasConsumed", "", "fail$kotlinx_serialization_json", "(BZ)Ljava/lang/Void;", "fail", "peekNextToken", "doConsume", "tryConsumeNull", "skipWhitespaces", "", "keyToMatch", "isLenient", "peekLeadingMatchingValue", "peekString", "discardPeeked", "char", "startPos", "indexOf", "endPos", "substring", "consumeKeyString", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "stringChunk", "consumeChunk", "consumeStringChunked", "consumeString", "", "source", "startPosition", "current", "consumeStringLenientNotNull", "consumeStringLenient", "fromIndex", "toIndex", "appendRange", LandingAEMContentMapper.CONDITION, "Lkotlin/Function0;", "message", "require$kotlinx_serialization_json", "(ZILkotlin/jvm/functions/Function0;)V", "require", "allowLenientStrings", "skipElement", "toString", "key", "failOnUnknownKey", "hint", "", "consumeNumericLiteral", "consumeBoolean", "consumeBooleanLenient", "insideString", "currentChunkHasEscape", "writeRange", "lastPosition", "appendEscape", "currentPosition", "decodedString", "takePeeked", "wasUnquotedString", "appendEsc", "appendHex", "fromHexChar", EventDataKeys.Lifecycle.LIFECYCLE_START, "literalSuffix", "consumeBooleanLiteral", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "Lkotlinx/serialization/json/internal/JsonPath;", "path", "Lkotlinx/serialization/json/internal/JsonPath;", "peekedString", "Ljava/lang/String;", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "escapedString", "Ljava/lang/StringBuilder;", "getEscapedString", "()Ljava/lang/StringBuilder;", "setEscapedString", "(Ljava/lang/StringBuilder;)V", "getSource", "()Ljava/lang/CharSequence;", "<init>", "()V", "kotlinx-serialization-json"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nAbstractJsonLexer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AbstractJsonLexer.kt\nkotlinx/serialization/json/internal/AbstractJsonLexer\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,765:1\n757#1,5:766\n1#2:771\n*S KotlinDebug\n*F\n+ 1 AbstractJsonLexer.kt\nkotlinx/serialization/json/internal/AbstractJsonLexer\n*L\n218#1:766,5\n*E\n"})
public abstract class AbstractJsonLexer {

    @JvmField
    public int currentPosition;

    @Nullable
    private String peekedString;

    @JvmField
    @NotNull
    public final JsonPath path = new JsonPath();

    @NotNull
    private StringBuilder escapedString = new StringBuilder();

    private final int appendEsc(int startPosition) {
        int iPrefetchOrEof = prefetchOrEof(startPosition);
        if (iPrefetchOrEof == -1) {
            fail$default(this, "Expected escape sequence to continue, got EOF", 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
        int i10 = iPrefetchOrEof + 1;
        char cCharAt = getSource().charAt(iPrefetchOrEof);
        if (cCharAt == 'u') {
            return appendHex(getSource(), i10);
        }
        char cEscapeToChar = AbstractJsonLexerKt.escapeToChar(cCharAt);
        if (cEscapeToChar != 0) {
            this.escapedString.append(cEscapeToChar);
            return i10;
        }
        fail$default(this, "Invalid escaped char '" + cCharAt + '\'', 0, null, 6, null);
        throw new KotlinNothingValueException();
    }

    private final int appendEscape(int lastPosition, int current) {
        appendRange(lastPosition, current);
        return appendEsc(current + 1);
    }

    private final int appendHex(CharSequence source, int startPos) {
        int i10 = startPos + 4;
        if (i10 < source.length()) {
            this.escapedString.append((char) ((fromHexChar(source, startPos) << 12) + (fromHexChar(source, startPos + 1) << 8) + (fromHexChar(source, startPos + 2) << 4) + fromHexChar(source, startPos + 3)));
            return i10;
        }
        this.currentPosition = startPos;
        ensureHaveChars();
        if (this.currentPosition + 4 < source.length()) {
            return appendHex(source, this.currentPosition);
        }
        fail$default(this, "Unexpected EOF during unicode escape", 0, null, 6, null);
        throw new KotlinNothingValueException();
    }

    private final void consumeBooleanLiteral(String literalSuffix, int current) {
        if (getSource().length() - current < literalSuffix.length()) {
            fail$default(this, "Unexpected end of boolean literal", 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
        int length = literalSuffix.length();
        for (int i10 = 0; i10 < length; i10++) {
            if (literalSuffix.charAt(i10) != (getSource().charAt(current + i10) | ' ')) {
                fail$default(this, "Expected valid boolean literal prefix, but had '" + consumeStringLenient() + '\'', 0, null, 6, null);
                throw new KotlinNothingValueException();
            }
        }
        this.currentPosition = literalSuffix.length() + current;
    }

    private static final double consumeNumericLiteral$calculateExponent(long j10, boolean z10) {
        if (!z10) {
            return Math.pow(10.0d, -j10);
        }
        if (z10) {
            return Math.pow(10.0d, j10);
        }
        throw new NoWhenBranchMatchedException();
    }

    private final String decodedString(int lastPosition, int currentPosition) {
        appendRange(lastPosition, currentPosition);
        String string = this.escapedString.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        this.escapedString.setLength(0);
        return string;
    }

    public static /* synthetic */ Void fail$default(AbstractJsonLexer abstractJsonLexer, String str, int i10, String str2, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fail");
        }
        if ((i11 & 2) != 0) {
            i10 = abstractJsonLexer.currentPosition;
        }
        if ((i11 & 4) != 0) {
            str2 = "";
        }
        return abstractJsonLexer.fail(str, i10, str2);
    }

    public static /* synthetic */ Void fail$kotlinx_serialization_json$default(AbstractJsonLexer abstractJsonLexer, byte b10, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fail");
        }
        if ((i10 & 2) != 0) {
            z10 = true;
        }
        return abstractJsonLexer.fail$kotlinx_serialization_json(b10, z10);
    }

    private final int fromHexChar(CharSequence source, int currentPosition) {
        char cCharAt = source.charAt(currentPosition);
        if ('0' <= cCharAt && cCharAt < ':') {
            return cCharAt - '0';
        }
        if ('a' <= cCharAt && cCharAt < 'g') {
            return cCharAt - 'W';
        }
        if ('A' <= cCharAt && cCharAt < 'G') {
            return cCharAt - '7';
        }
        fail$default(this, "Invalid toHexChar char '" + cCharAt + "' in unicode escape", 0, null, 6, null);
        throw new KotlinNothingValueException();
    }

    private final boolean insideString(boolean isLenient, char c10) {
        if (isLenient) {
            if (AbstractJsonLexerKt.charToTokenClass(c10) != 0) {
                return false;
            }
        } else if (c10 == '\"') {
            return false;
        }
        return true;
    }

    public static /* synthetic */ void require$kotlinx_serialization_json$default(AbstractJsonLexer abstractJsonLexer, boolean z10, int i10, Function0 message, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: require");
        }
        if ((i11 & 2) != 0) {
            i10 = abstractJsonLexer.currentPosition;
        }
        int i12 = i10;
        Intrinsics.checkNotNullParameter(message, "message");
        if (z10) {
            return;
        }
        fail$default(abstractJsonLexer, (String) message.invoke(), i12, null, 4, null);
        throw new KotlinNothingValueException();
    }

    private final String takePeeked() {
        String str = this.peekedString;
        Intrinsics.checkNotNull(str);
        this.peekedString = null;
        return str;
    }

    public static /* synthetic */ boolean tryConsumeNull$default(AbstractJsonLexer abstractJsonLexer, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: tryConsumeNull");
        }
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        return abstractJsonLexer.tryConsumeNull(z10);
    }

    private final boolean wasUnquotedString() {
        return getSource().charAt(this.currentPosition - 1) != '\"';
    }

    private final void writeRange(int fromIndex, int toIndex, boolean currentChunkHasEscape, Function1<? super String, Unit> consumeChunk) {
        if (currentChunkHasEscape) {
            consumeChunk.invoke(decodedString(fromIndex, toIndex));
        } else {
            consumeChunk.invoke(substring(fromIndex, toIndex));
        }
    }

    public void appendRange(int fromIndex, int toIndex) {
        this.escapedString.append(getSource(), fromIndex, toIndex);
    }

    public abstract boolean canConsumeValue();

    public final boolean consumeBoolean() {
        return consumeBoolean(skipWhitespaces());
    }

    public final boolean consumeBooleanLenient() {
        boolean z10;
        int iSkipWhitespaces = skipWhitespaces();
        if (iSkipWhitespaces == getSource().length()) {
            fail$default(this, "EOF", 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
        if (getSource().charAt(iSkipWhitespaces) == '\"') {
            iSkipWhitespaces++;
            z10 = true;
        } else {
            z10 = false;
        }
        boolean zConsumeBoolean = consumeBoolean(iSkipWhitespaces);
        if (z10) {
            if (this.currentPosition == getSource().length()) {
                fail$default(this, "EOF", 0, null, 6, null);
                throw new KotlinNothingValueException();
            }
            if (getSource().charAt(this.currentPosition) != '\"') {
                fail$default(this, "Expected closing quotation mark", 0, null, 6, null);
                throw new KotlinNothingValueException();
            }
            this.currentPosition++;
        }
        return zConsumeBoolean;
    }

    @NotNull
    public abstract String consumeKeyString();

    public abstract byte consumeNextToken();

    public final byte consumeNextToken(byte expected) {
        byte bConsumeNextToken = consumeNextToken();
        if (bConsumeNextToken == expected) {
            return bConsumeNextToken;
        }
        fail$kotlinx_serialization_json$default(this, expected, false, 2, null);
        throw new KotlinNothingValueException();
    }

    public final long consumeNumericLiteral() {
        boolean z10;
        boolean z11;
        int iPrefetchOrEof = prefetchOrEof(skipWhitespaces());
        if (iPrefetchOrEof >= getSource().length() || iPrefetchOrEof == -1) {
            fail$default(this, "EOF", 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
        if (getSource().charAt(iPrefetchOrEof) == '\"') {
            iPrefetchOrEof++;
            if (iPrefetchOrEof == getSource().length()) {
                fail$default(this, "EOF", 0, null, 6, null);
                throw new KotlinNothingValueException();
            }
            z10 = true;
        } else {
            z10 = false;
        }
        int i10 = iPrefetchOrEof;
        long j10 = 0;
        long j11 = 0;
        boolean z12 = false;
        boolean z13 = false;
        loop0: while (true) {
            z11 = false;
            while (true) {
                if (i10 == getSource().length()) {
                    break loop0;
                }
                char cCharAt = getSource().charAt(i10);
                if ((cCharAt == 'e' || cCharAt == 'E') && !z12) {
                    if (i10 == iPrefetchOrEof) {
                        fail$default(this, "Unexpected symbol " + cCharAt + " in numeric literal", 0, null, 6, null);
                        throw new KotlinNothingValueException();
                    }
                    i10++;
                    z12 = true;
                } else if (cCharAt != '-' || !z12) {
                    if (cCharAt != '+' || !z12) {
                        if (cCharAt != '-') {
                            if (AbstractJsonLexerKt.charToTokenClass(cCharAt) != 0) {
                                break loop0;
                            }
                            i10++;
                            int i11 = cCharAt - '0';
                            if (i11 < 0 || i11 >= 10) {
                                fail$default(this, "Unexpected symbol '" + cCharAt + "' in numeric literal", 0, null, 6, null);
                                throw new KotlinNothingValueException();
                            }
                            if (z12) {
                                j11 = (j11 * ((long) 10)) + ((long) i11);
                            } else {
                                j10 = (j10 * ((long) 10)) - ((long) i11);
                                if (j10 > 0) {
                                    fail$default(this, "Numeric value overflow", 0, null, 6, null);
                                    throw new KotlinNothingValueException();
                                }
                            }
                        } else {
                            if (i10 != iPrefetchOrEof) {
                                fail$default(this, "Unexpected symbol '-' in numeric literal", 0, null, 6, null);
                                throw new KotlinNothingValueException();
                            }
                            i10++;
                            z13 = true;
                        }
                    } else {
                        if (i10 == iPrefetchOrEof) {
                            fail$default(this, "Unexpected symbol '+' in numeric literal", 0, null, 6, null);
                            throw new KotlinNothingValueException();
                        }
                        i10++;
                    }
                }
                z11 = true;
            }
            if (i10 == iPrefetchOrEof) {
                fail$default(this, "Unexpected symbol '-' in numeric literal", 0, null, 6, null);
                throw new KotlinNothingValueException();
            }
            i10++;
        }
        boolean z14 = i10 != iPrefetchOrEof;
        if (iPrefetchOrEof == i10 || (z13 && iPrefetchOrEof == i10 - 1)) {
            fail$default(this, "Expected numeric literal", 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
        if (z10) {
            if (!z14) {
                fail$default(this, "EOF", 0, null, 6, null);
                throw new KotlinNothingValueException();
            }
            if (getSource().charAt(i10) != '\"') {
                fail$default(this, "Expected closing quotation mark", 0, null, 6, null);
                throw new KotlinNothingValueException();
            }
            i10++;
        }
        this.currentPosition = i10;
        if (z12) {
            double dConsumeNumericLiteral$calculateExponent = j10 * consumeNumericLiteral$calculateExponent(j11, z11);
            if (dConsumeNumericLiteral$calculateExponent > 9.223372036854776E18d || dConsumeNumericLiteral$calculateExponent < -9.223372036854776E18d) {
                fail$default(this, "Numeric value overflow", 0, null, 6, null);
                throw new KotlinNothingValueException();
            }
            if (Math.floor(dConsumeNumericLiteral$calculateExponent) != dConsumeNumericLiteral$calculateExponent) {
                fail$default(this, "Can't convert " + dConsumeNumericLiteral$calculateExponent + " to Long", 0, null, 6, null);
                throw new KotlinNothingValueException();
            }
            j10 = (long) dConsumeNumericLiteral$calculateExponent;
        }
        if (z13) {
            return j10;
        }
        if (j10 != Long.MIN_VALUE) {
            return -j10;
        }
        fail$default(this, "Numeric value overflow", 0, null, 6, null);
        throw new KotlinNothingValueException();
    }

    @NotNull
    public final String consumeString() {
        return this.peekedString != null ? takePeeked() : consumeKeyString();
    }

    public void consumeStringChunked(boolean isLenient, @NotNull Function1<? super String, Unit> consumeChunk) {
        int i10;
        int iPrefetchOrEof;
        Intrinsics.checkNotNullParameter(consumeChunk, "consumeChunk");
        byte bPeekNextToken = peekNextToken();
        if (!isLenient || bPeekNextToken == 0) {
            if (!isLenient) {
                consumeNextToken('\"');
            }
            int i11 = this.currentPosition;
            char cCharAt = getSource().charAt(i11);
            boolean z10 = false;
            int i12 = i11;
            while (insideString(isLenient, cCharAt)) {
                if (isLenient || cCharAt != '\\') {
                    int i13 = i12 + 1;
                    i10 = i11;
                    iPrefetchOrEof = i13;
                } else {
                    iPrefetchOrEof = prefetchOrEof(appendEscape(i11, i12));
                    z10 = true;
                    i10 = iPrefetchOrEof;
                }
                if (iPrefetchOrEof >= getSource().length()) {
                    writeRange(i10, iPrefetchOrEof, z10, consumeChunk);
                    int iPrefetchOrEof2 = prefetchOrEof(iPrefetchOrEof);
                    if (iPrefetchOrEof2 == -1) {
                        fail$default(this, "EOF", iPrefetchOrEof2, null, 4, null);
                        throw new KotlinNothingValueException();
                    }
                    z10 = false;
                    i11 = iPrefetchOrEof2;
                    i12 = i11;
                } else {
                    int i14 = i10;
                    i12 = iPrefetchOrEof;
                    i11 = i14;
                }
                cCharAt = getSource().charAt(i12);
            }
            writeRange(i11, i12, z10, consumeChunk);
            this.currentPosition = i12;
            if (isLenient) {
                return;
            }
            consumeNextToken('\"');
        }
    }

    @NotNull
    public final String consumeStringLenient() {
        if (this.peekedString != null) {
            return takePeeked();
        }
        int iSkipWhitespaces = skipWhitespaces();
        if (iSkipWhitespaces >= getSource().length() || iSkipWhitespaces == -1) {
            fail$default(this, "EOF", iSkipWhitespaces, null, 4, null);
            throw new KotlinNothingValueException();
        }
        byte bCharToTokenClass = AbstractJsonLexerKt.charToTokenClass(getSource().charAt(iSkipWhitespaces));
        if (bCharToTokenClass == 1) {
            return consumeString();
        }
        if (bCharToTokenClass != 0) {
            fail$default(this, "Expected beginning of the string, but got " + getSource().charAt(iSkipWhitespaces), 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
        boolean z10 = false;
        while (AbstractJsonLexerKt.charToTokenClass(getSource().charAt(iSkipWhitespaces)) == 0) {
            iSkipWhitespaces++;
            if (iSkipWhitespaces >= getSource().length()) {
                appendRange(this.currentPosition, iSkipWhitespaces);
                int iPrefetchOrEof = prefetchOrEof(iSkipWhitespaces);
                if (iPrefetchOrEof == -1) {
                    this.currentPosition = iSkipWhitespaces;
                    return decodedString(0, 0);
                }
                iSkipWhitespaces = iPrefetchOrEof;
                z10 = true;
            }
        }
        String strSubstring = !z10 ? substring(this.currentPosition, iSkipWhitespaces) : decodedString(this.currentPosition, iSkipWhitespaces);
        this.currentPosition = iSkipWhitespaces;
        return strSubstring;
    }

    @NotNull
    public final String consumeStringLenientNotNull() {
        String strConsumeStringLenient = consumeStringLenient();
        if (!Intrinsics.areEqual(strConsumeStringLenient, AbstractJsonLexerKt.NULL) || !wasUnquotedString()) {
            return strConsumeStringLenient;
        }
        fail$default(this, "Unexpected 'null' value instead of string literal", 0, null, 6, null);
        throw new KotlinNothingValueException();
    }

    public final void discardPeeked() {
        this.peekedString = null;
    }

    public final void expectEof() {
        if (consumeNextToken() == 10) {
            return;
        }
        fail$default(this, "Expected EOF after parsing, but had " + getSource().charAt(this.currentPosition - 1) + " instead", 0, null, 6, null);
        throw new KotlinNothingValueException();
    }

    @NotNull
    public final Void fail(@NotNull String message, int position, @NotNull String hint) {
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(hint, "hint");
        String strD = hint.length() == 0 ? "" : f.d(RootService.LINE_BREAK, hint);
        StringBuilder sbE = f.e(message, " at path: ");
        sbE.append(this.path.getPath());
        sbE.append(strD);
        throw JsonExceptionsKt.JsonDecodingException(position, sbE.toString(), getSource());
    }

    @NotNull
    public final Void fail$kotlinx_serialization_json(byte expectedToken, boolean wasConsumed) {
        String str = AbstractJsonLexerKt.tokenDescription(expectedToken);
        int i10 = wasConsumed ? this.currentPosition - 1 : this.currentPosition;
        fail$default(this, u.g("Expected ", str, ", but had '", (this.currentPosition == getSource().length() || i10 < 0) ? "EOF" : String.valueOf(getSource().charAt(i10)), "' instead"), i10, null, 4, null);
        throw new KotlinNothingValueException();
    }

    public final void failOnUnknownKey(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        fail(a.a("Encountered an unknown key '", key, '\''), StringsKt__StringsKt.lastIndexOf$default((CharSequence) substring(0, this.currentPosition), key, 0, false, 6, (Object) null), AbstractJsonLexerKt.ignoreUnknownKeysHint);
        throw new KotlinNothingValueException();
    }

    @NotNull
    public final StringBuilder getEscapedString() {
        return this.escapedString;
    }

    @NotNull
    public abstract CharSequence getSource();

    public int indexOf(char c10, int startPos) {
        return StringsKt__StringsKt.indexOf$default(getSource(), c10, startPos, false, 4, (Object) null);
    }

    public final boolean isNotEof() {
        return peekNextToken() != 10;
    }

    public final boolean isValidValueStart(char c10) {
        return !(c10 == '}' || c10 == ']' || c10 == ':' || c10 == ',');
    }

    @Nullable
    public abstract String peekLeadingMatchingValue(@NotNull String keyToMatch, boolean isLenient);

    public final byte peekNextToken() {
        CharSequence source = getSource();
        int i10 = this.currentPosition;
        while (true) {
            int iPrefetchOrEof = prefetchOrEof(i10);
            if (iPrefetchOrEof == -1) {
                this.currentPosition = iPrefetchOrEof;
                return (byte) 10;
            }
            char cCharAt = source.charAt(iPrefetchOrEof);
            if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\t') {
                this.currentPosition = iPrefetchOrEof;
                return AbstractJsonLexerKt.charToTokenClass(cCharAt);
            }
            i10 = iPrefetchOrEof + 1;
        }
    }

    @Nullable
    public final String peekString(boolean isLenient) {
        String strConsumeString;
        byte bPeekNextToken = peekNextToken();
        if (isLenient) {
            if (bPeekNextToken != 1 && bPeekNextToken != 0) {
                return null;
            }
            strConsumeString = consumeStringLenient();
        } else {
            if (bPeekNextToken != 1) {
                return null;
            }
            strConsumeString = consumeString();
        }
        this.peekedString = strConsumeString;
        return strConsumeString;
    }

    public abstract int prefetchOrEof(int position);

    public final void require$kotlinx_serialization_json(boolean condition, int position, @NotNull Function0<String> message) {
        Intrinsics.checkNotNullParameter(message, "message");
        if (condition) {
            return;
        }
        fail$default(this, message.invoke(), position, null, 4, null);
        throw new KotlinNothingValueException();
    }

    public final void setEscapedString(@NotNull StringBuilder sb2) {
        Intrinsics.checkNotNullParameter(sb2, "<set-?>");
        this.escapedString = sb2;
    }

    public final void skipElement(boolean allowLenientStrings) {
        ArrayList arrayList = new ArrayList();
        byte bPeekNextToken = peekNextToken();
        if (bPeekNextToken != 8 && bPeekNextToken != 6) {
            consumeStringLenient();
            return;
        }
        while (true) {
            byte bPeekNextToken2 = peekNextToken();
            if (bPeekNextToken2 != 1) {
                if (bPeekNextToken2 == 8 || bPeekNextToken2 == 6) {
                    arrayList.add(Byte.valueOf(bPeekNextToken2));
                } else if (bPeekNextToken2 == 9) {
                    if (((Number) CollectionsKt___CollectionsKt.last((List) arrayList)).byteValue() != 8) {
                        throw JsonExceptionsKt.JsonDecodingException(this.currentPosition, "found ] instead of } at path: " + this.path, getSource());
                    }
                    g.removeLast(arrayList);
                } else if (bPeekNextToken2 == 7) {
                    if (((Number) CollectionsKt___CollectionsKt.last((List) arrayList)).byteValue() != 6) {
                        throw JsonExceptionsKt.JsonDecodingException(this.currentPosition, "found } instead of ] at path: " + this.path, getSource());
                    }
                    g.removeLast(arrayList);
                } else if (bPeekNextToken2 == 10) {
                    fail$default(this, "Unexpected end of input due to malformed JSON during ignoring unknown keys", 0, null, 6, null);
                    throw new KotlinNothingValueException();
                }
                consumeNextToken();
                if (arrayList.size() == 0) {
                    return;
                }
            } else if (allowLenientStrings) {
                consumeStringLenient();
            } else {
                consumeKeyString();
            }
        }
    }

    public int skipWhitespaces() {
        int iPrefetchOrEof;
        char cCharAt;
        int i10 = this.currentPosition;
        while (true) {
            iPrefetchOrEof = prefetchOrEof(i10);
            if (iPrefetchOrEof == -1 || !((cCharAt = getSource().charAt(iPrefetchOrEof)) == ' ' || cCharAt == '\n' || cCharAt == '\r' || cCharAt == '\t')) {
                break;
            }
            i10 = iPrefetchOrEof + 1;
        }
        this.currentPosition = iPrefetchOrEof;
        return iPrefetchOrEof;
    }

    @NotNull
    public String substring(int startPos, int endPos) {
        return getSource().subSequence(startPos, endPos).toString();
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("JsonReader(source='");
        sb2.append((Object) getSource());
        sb2.append("', currentPosition=");
        return androidx.activity.a.d(sb2, this.currentPosition, RootService.CLOSE_BRACKET);
    }

    public abstract boolean tryConsumeComma();

    public final boolean tryConsumeNull(boolean doConsume) {
        int iPrefetchOrEof = prefetchOrEof(skipWhitespaces());
        int length = getSource().length() - iPrefetchOrEof;
        if (length < 4 || iPrefetchOrEof == -1) {
            return false;
        }
        for (int i10 = 0; i10 < 4; i10++) {
            if (AbstractJsonLexerKt.NULL.charAt(i10) != getSource().charAt(iPrefetchOrEof + i10)) {
                return false;
            }
        }
        if (length > 4 && AbstractJsonLexerKt.charToTokenClass(getSource().charAt(iPrefetchOrEof + 4)) == 0) {
            return false;
        }
        if (!doConsume) {
            return true;
        }
        this.currentPosition = iPrefetchOrEof + 4;
        return true;
    }

    public final void unexpectedToken(char expected) {
        int i10 = this.currentPosition;
        if (i10 > 0 && expected == '\"') {
            try {
                this.currentPosition = i10 - 1;
                String strConsumeStringLenient = consumeStringLenient();
                this.currentPosition = i10;
                if (Intrinsics.areEqual(strConsumeStringLenient, AbstractJsonLexerKt.NULL)) {
                    fail("Expected string literal but 'null' literal was found", this.currentPosition - 1, AbstractJsonLexerKt.coerceInputValuesHint);
                    throw new KotlinNothingValueException();
                }
            } catch (Throwable th2) {
                this.currentPosition = i10;
                throw th2;
            }
        }
        fail$kotlinx_serialization_json$default(this, AbstractJsonLexerKt.charToTokenClass(expected), false, 2, null);
        throw new KotlinNothingValueException();
    }

    private final boolean consumeBoolean(int start) {
        int iPrefetchOrEof = prefetchOrEof(start);
        if (iPrefetchOrEof >= getSource().length() || iPrefetchOrEof == -1) {
            fail$default(this, "EOF", 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
        int i10 = iPrefetchOrEof + 1;
        int iCharAt = getSource().charAt(iPrefetchOrEof) | ' ';
        if (iCharAt == 102) {
            consumeBooleanLiteral("alse", i10);
            return false;
        }
        if (iCharAt == 116) {
            consumeBooleanLiteral("rue", i10);
            return true;
        }
        fail$default(this, "Expected valid boolean literal prefix, but had '" + consumeStringLenient() + '\'', 0, null, 6, null);
        throw new KotlinNothingValueException();
    }

    public void consumeNextToken(char expected) {
        ensureHaveChars();
        CharSequence source = getSource();
        int i10 = this.currentPosition;
        while (true) {
            int iPrefetchOrEof = prefetchOrEof(i10);
            if (iPrefetchOrEof != -1) {
                int i11 = iPrefetchOrEof + 1;
                char cCharAt = source.charAt(iPrefetchOrEof);
                if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\t') {
                    this.currentPosition = i11;
                    if (cCharAt == expected) {
                        return;
                    } else {
                        unexpectedToken(expected);
                    }
                }
                i10 = i11;
            } else {
                this.currentPosition = iPrefetchOrEof;
                unexpectedToken(expected);
                return;
            }
        }
    }

    @NotNull
    public final String consumeString(@NotNull CharSequence source, int startPosition, int current) {
        String strDecodedString;
        int iPrefetchOrEof;
        Intrinsics.checkNotNullParameter(source, "source");
        char cCharAt = source.charAt(current);
        boolean z10 = false;
        while (cCharAt != '\"') {
            if (cCharAt == '\\') {
                iPrefetchOrEof = prefetchOrEof(appendEscape(startPosition, current));
                if (iPrefetchOrEof == -1) {
                    fail$default(this, "Unexpected EOF", iPrefetchOrEof, null, 4, null);
                    throw new KotlinNothingValueException();
                }
            } else {
                current++;
                if (current >= source.length()) {
                    appendRange(startPosition, current);
                    iPrefetchOrEof = prefetchOrEof(current);
                    if (iPrefetchOrEof == -1) {
                        fail$default(this, "Unexpected EOF", iPrefetchOrEof, null, 4, null);
                        throw new KotlinNothingValueException();
                    }
                } else {
                    continue;
                }
                cCharAt = source.charAt(current);
            }
            z10 = true;
            startPosition = iPrefetchOrEof;
            current = startPosition;
            cCharAt = source.charAt(current);
        }
        if (!z10) {
            strDecodedString = substring(startPosition, current);
        } else {
            strDecodedString = decodedString(startPosition, current);
        }
        this.currentPosition = current + 1;
        return strDecodedString;
    }

    public void ensureHaveChars() {
    }
}
