package kotlinx.serialization.json.internal;

import java.util.Iterator;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.StringsKt___StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: StringJsonLexer.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0007\u001a\u00020\bH\u0016J\b\u0010\t\u001a\u00020\u0003H\u0016J\b\u0010\n\u001a\u00020\u000bH\u0016J\u0010\u0010\n\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J3\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\b2!\u0010\u0011\u001a\u001d\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0015\u0012\u0004\u0012\u00020\f0\u0012H\u0016J\u001a\u0010\u0016\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\bH\u0016J\u0010\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0019H\u0016J\b\u0010\u001b\u001a\u00020\u0019H\u0016J\b\u0010\u001c\u001a\u00020\bH\u0016R\u0014\u0010\u0002\u001a\u00020\u0003X\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u001d"}, d2 = {"Lkotlinx/serialization/json/internal/StringJsonLexer;", "Lkotlinx/serialization/json/internal/AbstractJsonLexer;", "source", "", "(Ljava/lang/String;)V", "getSource", "()Ljava/lang/String;", "canConsumeValue", "", "consumeKeyString", "consumeNextToken", "", "", "expected", "", "consumeStringChunked", "isLenient", "consumeChunk", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "stringChunk", "peekLeadingMatchingValue", "keyToMatch", "prefetchOrEof", "", "position", "skipWhitespaces", "tryConsumeComma", "kotlinx-serialization-json"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nStringJsonLexer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StringJsonLexer.kt\nkotlinx/serialization/json/internal/StringJsonLexer\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,127:1\n1855#2,2:128\n*S KotlinDebug\n*F\n+ 1 StringJsonLexer.kt\nkotlinx/serialization/json/internal/StringJsonLexer\n*L\n107#1:128,2\n*E\n"})
public final class StringJsonLexer extends AbstractJsonLexer {

    @NotNull
    private final String source;

    public StringJsonLexer(@NotNull String source) {
        Intrinsics.checkNotNullParameter(source, "source");
        this.source = source;
    }

    @Override // kotlinx.serialization.json.internal.AbstractJsonLexer
    public boolean canConsumeValue() {
        int i10 = this.currentPosition;
        if (i10 == -1) {
            return false;
        }
        while (i10 < getSource().length()) {
            char cCharAt = getSource().charAt(i10);
            if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\t') {
                this.currentPosition = i10;
                return isValidValueStart(cCharAt);
            }
            i10++;
        }
        this.currentPosition = i10;
        return false;
    }

    @Override // kotlinx.serialization.json.internal.AbstractJsonLexer
    @NotNull
    public String consumeKeyString() {
        consumeNextToken('\"');
        int i10 = this.currentPosition;
        int iIndexOf$default = StringsKt__StringsKt.indexOf$default((CharSequence) getSource(), '\"', i10, false, 4, (Object) null);
        if (iIndexOf$default == -1) {
            consumeStringLenient();
            fail$kotlinx_serialization_json((byte) 1, false);
            throw new KotlinNothingValueException();
        }
        for (int i11 = i10; i11 < iIndexOf$default; i11++) {
            if (getSource().charAt(i11) == '\\') {
                return consumeString(getSource(), this.currentPosition, i11);
            }
        }
        this.currentPosition = iIndexOf$default + 1;
        String strSubstring = getSource().substring(i10, iIndexOf$default);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return strSubstring;
    }

    @Override // kotlinx.serialization.json.internal.AbstractJsonLexer
    public byte consumeNextToken() {
        byte bCharToTokenClass;
        String source = getSource();
        do {
            int i10 = this.currentPosition;
            if (i10 == -1 || i10 >= source.length()) {
                return (byte) 10;
            }
            int i11 = this.currentPosition;
            this.currentPosition = i11 + 1;
            bCharToTokenClass = AbstractJsonLexerKt.charToTokenClass(source.charAt(i11));
        } while (bCharToTokenClass == 3);
        return bCharToTokenClass;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.json.internal.AbstractJsonLexer
    public void consumeStringChunked(boolean isLenient, @NotNull Function1<? super String, Unit> consumeChunk) {
        Intrinsics.checkNotNullParameter(consumeChunk, "consumeChunk");
        Iterator<T> it = StringsKt___StringsKt.chunked(isLenient ? consumeStringLenient() : consumeString(), 16384).iterator();
        while (it.hasNext()) {
            consumeChunk.invoke(it.next());
        }
    }

    @Override // kotlinx.serialization.json.internal.AbstractJsonLexer
    @Nullable
    public String peekLeadingMatchingValue(@NotNull String keyToMatch, boolean isLenient) {
        Intrinsics.checkNotNullParameter(keyToMatch, "keyToMatch");
        int i10 = this.currentPosition;
        try {
            if (consumeNextToken() == 6 && Intrinsics.areEqual(peekString(isLenient), keyToMatch)) {
                discardPeeked();
                if (consumeNextToken() == 5) {
                    return peekString(isLenient);
                }
            }
            return null;
        } finally {
            this.currentPosition = i10;
            discardPeeked();
        }
    }

    @Override // kotlinx.serialization.json.internal.AbstractJsonLexer
    public int prefetchOrEof(int position) {
        if (position < getSource().length()) {
            return position;
        }
        return -1;
    }

    @Override // kotlinx.serialization.json.internal.AbstractJsonLexer
    public int skipWhitespaces() {
        char cCharAt;
        int i10 = this.currentPosition;
        if (i10 == -1) {
            return i10;
        }
        while (i10 < getSource().length() && ((cCharAt = getSource().charAt(i10)) == ' ' || cCharAt == '\n' || cCharAt == '\r' || cCharAt == '\t')) {
            i10++;
        }
        this.currentPosition = i10;
        return i10;
    }

    @Override // kotlinx.serialization.json.internal.AbstractJsonLexer
    public boolean tryConsumeComma() {
        int iSkipWhitespaces = skipWhitespaces();
        if (iSkipWhitespaces == getSource().length() || iSkipWhitespaces == -1 || getSource().charAt(iSkipWhitespaces) != ',') {
            return false;
        }
        this.currentPosition++;
        return true;
    }

    @Override // kotlinx.serialization.json.internal.AbstractJsonLexer
    @NotNull
    public String getSource() {
        return this.source;
    }

    @Override // kotlinx.serialization.json.internal.AbstractJsonLexer
    public void consumeNextToken(char expected) {
        if (this.currentPosition == -1) {
            unexpectedToken(expected);
        }
        String source = getSource();
        while (this.currentPosition < source.length()) {
            int i10 = this.currentPosition;
            this.currentPosition = i10 + 1;
            char cCharAt = source.charAt(i10);
            if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\t') {
                if (cCharAt == expected) {
                    return;
                } else {
                    unexpectedToken(expected);
                }
            }
        }
        this.currentPosition = -1;
        unexpectedToken(expected);
    }
}
