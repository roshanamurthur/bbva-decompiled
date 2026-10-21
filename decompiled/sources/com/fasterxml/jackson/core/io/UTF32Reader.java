package com.fasterxml.jackson.core.io;

import androidx.appcompat.widget.a;
import androidx.collection.h;
import com.fasterxml.jackson.core.base.GeneratorBase;
import java.io.CharConversionException;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import mx.openpay.library.domain.util.Constant;

/* JADX INFO: loaded from: classes9.dex */
public class UTF32Reader extends Reader {
    protected static final int LAST_VALID_UNICODE_CHAR = 1114111;
    protected static final char NC = 0;
    protected final boolean _bigEndian;
    protected byte[] _buffer;
    protected int _byteCount;
    protected int _charCount;
    protected final IOContext _context;
    protected InputStream _in;
    protected int _length;
    protected final boolean _managedBuffers;
    protected int _ptr;
    protected char _surrogate = 0;
    protected char[] _tmpBuf;

    public UTF32Reader(IOContext iOContext, InputStream inputStream, byte[] bArr, int i10, int i11, boolean z10) {
        this._context = iOContext;
        this._in = inputStream;
        this._buffer = bArr;
        this._ptr = i10;
        this._length = i11;
        this._bigEndian = z10;
        this._managedBuffers = inputStream != null;
    }

    public final void a(int i10) throws IOException {
        throw new CharConversionException(a.c(h.e("Unexpected EOF in the middle of a 4-byte UTF-32 char: got ", i10, ", needed 4, at char #", this._charCount, ", byte #"), this._byteCount + i10, ")"));
    }

    @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        InputStream inputStream = this._in;
        if (inputStream != null) {
            this._in = null;
            byte[] bArr = this._buffer;
            if (bArr != null) {
                this._buffer = null;
                this._context.releaseReadIOBuffer(bArr);
            }
            inputStream.close();
        }
    }

    @Override // java.io.Reader
    public int read() throws IOException {
        if (this._tmpBuf == null) {
            this._tmpBuf = new char[1];
        }
        if (read(this._tmpBuf, 0, 1) < 1) {
            return -1;
        }
        return this._tmpBuf[0];
    }

    /* JADX WARN: Code duplicated, block: B:79:0x0170 A[LOOP:0: B:60:0x00ac->B:79:0x0170, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:86:0x0118 A[SYNTHETIC] */
    @Override // java.io.Reader
    public int read(char[] cArr, int i10, int i11) throws IOException {
        int i12;
        int i13;
        byte[] bArr;
        int i14;
        byte[] bArr2;
        int i15;
        int i16;
        int i17;
        byte[] bArr3 = this._buffer;
        if (bArr3 == null) {
            return -1;
        }
        if (i11 < 1) {
            return i11;
        }
        if (i10 >= 0 && (i12 = i10 + i11) <= cArr.length) {
            char c10 = this._surrogate;
            if (c10 != 0) {
                i13 = i10 + 1;
                cArr[i10] = c10;
                this._surrogate = (char) 0;
            } else {
                int i18 = this._length;
                int i19 = this._ptr;
                int i20 = i18 - i19;
                if (i20 < 4) {
                    this._byteCount = (i18 - i20) + this._byteCount;
                    if (i20 > 0) {
                        if (i19 > 0) {
                            System.arraycopy(bArr3, i19, bArr3, 0, i20);
                            this._ptr = 0;
                        }
                        this._length = i20;
                    } else {
                        this._ptr = 0;
                        InputStream inputStream = this._in;
                        int i21 = inputStream == null ? -1 : inputStream.read(bArr3);
                        if (i21 < 1) {
                            this._length = 0;
                            if (i21 < 0) {
                                if (this._managedBuffers && (bArr = this._buffer) != null) {
                                    this._buffer = null;
                                    this._context.releaseReadIOBuffer(bArr);
                                }
                                if (i20 == 0) {
                                    return -1;
                                }
                                a(this._length - this._ptr);
                                throw null;
                            }
                            throw new IOException("Strange I/O stream, returned 0 bytes on read");
                        }
                        this._length = i21;
                    }
                    while (true) {
                        int i22 = this._length;
                        if (i22 >= 4) {
                            break;
                        }
                        InputStream inputStream2 = this._in;
                        if (inputStream2 == null) {
                            i14 = -1;
                        } else {
                            byte[] bArr4 = this._buffer;
                            i14 = inputStream2.read(bArr4, i22, bArr4.length - i22);
                        }
                        if (i14 < 1) {
                            if (i14 < 0) {
                                if (this._managedBuffers && (bArr2 = this._buffer) != null) {
                                    this._buffer = null;
                                    this._context.releaseReadIOBuffer(bArr2);
                                }
                                a(this._length);
                                throw null;
                            }
                            throw new IOException("Strange I/O stream, returned 0 bytes on read");
                        }
                        this._length += i14;
                    }
                }
                i13 = i10;
            }
            int i23 = this._length - 4;
            while (i13 < i12) {
                int i24 = this._ptr;
                if (this._bigEndian) {
                    byte[] bArr5 = this._buffer;
                    i15 = (bArr5[i24] << 8) | (bArr5[i24 + 1] & 255);
                    i16 = (bArr5[i24 + 3] & 255) | ((bArr5[i24 + 2] & 255) << 8);
                } else {
                    byte[] bArr6 = this._buffer;
                    int i25 = (bArr6[i24] & 255) | ((bArr6[i24 + 1] & 255) << 8);
                    i15 = (bArr6[i24 + 3] << 8) | (bArr6[i24 + 2] & 255);
                    i16 = i25;
                }
                int i26 = i24 + 4;
                this._ptr = i26;
                if (i15 != 0) {
                    int i27 = i15 & 65535;
                    int i28 = i16 | ((i27 - 1) << 16);
                    if (i27 <= 16) {
                        i17 = i13 + 1;
                        cArr[i13] = (char) ((i28 >> 10) + GeneratorBase.SURR1_FIRST);
                        int i29 = (i28 & 1023) | 56320;
                        if (i17 >= i12) {
                            this._surrogate = (char) i28;
                        } else {
                            i16 = i29;
                            i13 = i17;
                            i17 = i13 + 1;
                            cArr[i13] = (char) i16;
                            if (i26 > i23) {
                                i13 = i17;
                            }
                        }
                    } else {
                        int i30 = i13 - i10;
                        String str = String.format(" (above 0x%08x)", Integer.valueOf(LAST_VALID_UNICODE_CHAR));
                        int i31 = (this._byteCount + this._ptr) - 1;
                        throw new CharConversionException("Invalid UTF-32 character 0x" + Integer.toHexString(i28) + str + " at char #" + (this._charCount + i30) + ", byte #" + i31 + ")");
                    }
                } else {
                    i17 = i13 + 1;
                    cArr[i13] = (char) i16;
                    if (i26 > i23) {
                        i13 = i17;
                    }
                }
                i13 = i17;
                break;
            }
            int i32 = i13 - i10;
            this._charCount += i32;
            return i32;
        }
        throw new ArrayIndexOutOfBoundsException(a.c(h.e("read(buf,", i10, ",", i11, "), cbuf["), cArr.length, Constant.BRACKET_CLOSE));
    }
}
