package androidx.emoji2.text.flatbuffer;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CoderResult;
import java.nio.charset.StandardCharsets;

/* JADX INFO: loaded from: classes2.dex */
public class Utf8Old extends Utf8 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ThreadLocal<a> f21390b = ThreadLocal.withInitial(new e());

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final CharsetEncoder f21391a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final CharsetDecoder f21392b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public CharSequence f21393c = null;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public ByteBuffer f21394d = null;

        public a() {
            Charset charset = StandardCharsets.UTF_8;
            this.f21391a = charset.newEncoder();
            this.f21392b = charset.newDecoder();
        }
    }

    @Override // androidx.emoji2.text.flatbuffer.Utf8
    public String decodeUtf8(ByteBuffer byteBuffer, int i10, int i11) {
        CharsetDecoder charsetDecoder = f21390b.get().f21392b;
        charsetDecoder.reset();
        ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
        byteBufferDuplicate.position(i10);
        byteBufferDuplicate.limit(i10 + i11);
        try {
            return charsetDecoder.decode(byteBufferDuplicate).toString();
        } catch (CharacterCodingException e5) {
            throw new IllegalArgumentException("Bad encoding", e5);
        }
    }

    @Override // androidx.emoji2.text.flatbuffer.Utf8
    public void encodeUtf8(CharSequence charSequence, ByteBuffer byteBuffer) {
        a aVar = f21390b.get();
        if (aVar.f21393c != charSequence) {
            encodedLength(charSequence);
        }
        byteBuffer.put(aVar.f21394d);
    }

    @Override // androidx.emoji2.text.flatbuffer.Utf8
    public int encodedLength(CharSequence charSequence) {
        a aVar = f21390b.get();
        int iMaxBytesPerChar = (int) (aVar.f21391a.maxBytesPerChar() * charSequence.length());
        ByteBuffer byteBuffer = aVar.f21394d;
        if (byteBuffer == null || byteBuffer.capacity() < iMaxBytesPerChar) {
            aVar.f21394d = ByteBuffer.allocate(Math.max(128, iMaxBytesPerChar));
        }
        aVar.f21394d.clear();
        aVar.f21393c = charSequence;
        CoderResult coderResultEncode = aVar.f21391a.encode(charSequence instanceof CharBuffer ? (CharBuffer) charSequence : CharBuffer.wrap(charSequence), aVar.f21394d, true);
        if (coderResultEncode.isError()) {
            try {
                coderResultEncode.throwException();
            } catch (CharacterCodingException e5) {
                throw new IllegalArgumentException("bad character encoding", e5);
            }
        }
        aVar.f21394d.flip();
        return aVar.f21394d.remaining();
    }
}
