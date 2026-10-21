package com.sun.mail.util;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes9.dex */
public class UUDecoderStream extends FilterInputStream {
    public String E0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public String f65590p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public int f65591q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final byte[] f65592r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public int f65593s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public int f65594t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public boolean f65595u0;
    public boolean v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public final LineInputStream f65596w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public final boolean f65597x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public final boolean f65598y0;

    public UUDecoderStream(InputStream inputStream) {
        super(inputStream);
        this.f65592r0 = new byte[45];
        this.f65593s0 = 0;
        this.f65594t0 = 0;
        this.f65595u0 = false;
        this.v0 = false;
        this.f65596w0 = new LineInputStream(inputStream);
        this.f65597x0 = PropUtil.getBooleanSystemProperty("mail.mime.uudecode.ignoreerrors", false);
        this.f65598y0 = PropUtil.getBooleanSystemProperty("mail.mime.uudecode.ignoremissingbeginend", false);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int available() throws IOException {
        return (this.f65593s0 - this.f65594t0) + ((((FilterInputStream) this).in.available() * 3) / 4);
    }

    public final void b() throws IOException {
        String line;
        int iCharAt;
        boolean z10 = this.f65597x0;
        if (this.f65595u0) {
            return;
        }
        this.f65591q0 = 438;
        this.f65590p0 = "encoder.buf";
        while (true) {
            line = this.f65596w0.readLine();
            boolean z11 = this.f65598y0;
            if (line != null) {
                if (!line.regionMatches(false, 0, "begin", 0, 5)) {
                    if (z11 && line.length() != 0 && ((iCharAt = ((((line.charAt(0) - ' ') & 63) * 8) + 5) / 6) == 0 || line.length() >= iCharAt + 1)) {
                        break;
                    }
                } else {
                    try {
                        this.f65591q0 = Integer.parseInt(line.substring(6, 9));
                    } catch (NumberFormatException e5) {
                        if (!z10) {
                            throw new DecodingException("UUDecoder: Error in mode: " + e5.toString());
                        }
                    }
                    if (line.length() > 10) {
                        this.f65590p0 = line.substring(10);
                    } else if (!z10) {
                        throw new DecodingException("UUDecoder: Missing name: ".concat(line));
                    }
                    this.f65595u0 = true;
                    return;
                }
            } else {
                if (!z11) {
                    throw new DecodingException("UUDecoder: Missing begin");
                }
                this.f65595u0 = true;
                this.v0 = true;
                return;
            }
        }
        this.E0 = line;
        this.f65595u0 = true;
    }

    public int getMode() throws IOException {
        b();
        return this.f65591q0;
    }

    public String getName() throws IOException {
        b();
        return this.f65590p0;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public boolean markSupported() {
        return false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() throws IOException {
        int i10 = this.f65594t0;
        int i11 = this.f65593s0;
        byte[] bArr = this.f65592r0;
        if (i10 >= i11) {
            b();
            if (this.v0) {
                return -1;
            }
            this.f65593s0 = 0;
            while (true) {
                String line = this.E0;
                LineInputStream lineInputStream = this.f65596w0;
                if (line != null) {
                    this.E0 = null;
                } else {
                    line = lineInputStream.readLine();
                }
                int i12 = 1;
                boolean z10 = this.f65598y0;
                if (line == null) {
                    if (!z10) {
                        throw new DecodingException("UUDecoder: Missing end at EOF");
                    }
                    this.v0 = true;
                    return -1;
                }
                if (line.equals("end")) {
                    this.v0 = true;
                    return -1;
                }
                if (line.length() != 0) {
                    char cCharAt = line.charAt(0);
                    boolean z11 = this.f65597x0;
                    if (cCharAt >= ' ') {
                        int i13 = (cCharAt - ' ') & 63;
                        if (i13 == 0) {
                            String line2 = lineInputStream.readLine();
                            if ((line2 == null || !line2.equals("end")) && !z10) {
                                throw new DecodingException("UUDecoder: Missing End after count 0 line");
                            }
                            this.v0 = true;
                            return -1;
                        }
                        if (line.length() >= (((i13 * 8) + 5) / 6) + 1) {
                            while (this.f65593s0 < i13) {
                                byte bCharAt = (byte) ((line.charAt(i12) - ' ') & 63);
                                int i14 = i12 + 2;
                                byte bCharAt2 = (byte) ((line.charAt(i12 + 1) - ' ') & 63);
                                int i15 = this.f65593s0;
                                int i16 = i15 + 1;
                                this.f65593s0 = i16;
                                bArr[i15] = (byte) (((bCharAt << 2) & 252) | ((bCharAt2 >>> 4) & 3));
                                if (i16 < i13) {
                                    i12 += 3;
                                    byte bCharAt3 = (byte) ((line.charAt(i14) - ' ') & 63);
                                    int i17 = this.f65593s0;
                                    this.f65593s0 = i17 + 1;
                                    bArr[i17] = (byte) (((bCharAt2 << 4) & 240) | ((bCharAt3 >>> 2) & 15));
                                    bCharAt2 = bCharAt3;
                                } else {
                                    i12 = i14;
                                }
                                if (this.f65593s0 < i13) {
                                    int i18 = i12 + 1;
                                    byte bCharAt4 = (byte) ((line.charAt(i12) - ' ') & 63);
                                    int i19 = this.f65593s0;
                                    this.f65593s0 = i19 + 1;
                                    bArr[i19] = (byte) (((bCharAt2 << 6) & 192) | (bCharAt4 & 63));
                                    i12 = i18;
                                }
                            }
                            this.f65594t0 = 0;
                        } else if (!z11) {
                            throw new DecodingException("UUDecoder: Short buffer error");
                        }
                    } else if (!z11) {
                        throw new DecodingException("UUDecoder: Buffer format error");
                    }
                }
            }
        }
        int i20 = this.f65594t0;
        this.f65594t0 = i20 + 1;
        return bArr[i20] & 255;
    }

    public UUDecoderStream(InputStream inputStream, boolean z10, boolean z11) {
        super(inputStream);
        this.f65592r0 = new byte[45];
        this.f65593s0 = 0;
        this.f65594t0 = 0;
        this.f65595u0 = false;
        this.v0 = false;
        this.f65596w0 = new LineInputStream(inputStream);
        this.f65597x0 = z10;
        this.f65598y0 = z11;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i10, int i11) throws IOException {
        int i12 = 0;
        while (i12 < i11) {
            int i13 = read();
            if (i13 == -1) {
                if (i12 == 0) {
                    return -1;
                }
                return i12;
            }
            bArr[i10 + i12] = (byte) i13;
            i12++;
        }
        return i12;
    }
}
