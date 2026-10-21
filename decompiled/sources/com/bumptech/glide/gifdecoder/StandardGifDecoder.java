package com.bumptech.glide.gifdecoder;

import android.graphics.Bitmap;
import android.util.Log;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.FragmentTransaction;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.Iterator;
import rc.a;

/* JADX INFO: loaded from: classes9.dex */
public class StandardGifDecoder implements GifDecoder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @ColorInt
    public int[] f38109a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @ColorInt
    public final int[] f38110b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final GifDecoder.BitmapProvider f38111c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ByteBuffer f38112d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public byte[] f38113e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public GifHeaderParser f38114f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public short[] f38115g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public byte[] f38116h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public byte[] f38117i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public byte[] f38118j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @ColorInt
    public int[] f38119k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f38120l;
    public GifHeader m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Bitmap f38121n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f38122o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f38123p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f38124q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f38125r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f38126s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @Nullable
    public Boolean f38127t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @NonNull
    public Bitmap.Config f38128u;

    public StandardGifDecoder(@NonNull GifDecoder.BitmapProvider bitmapProvider, GifHeader gifHeader, ByteBuffer byteBuffer) {
        this(bitmapProvider, gifHeader, byteBuffer, 1);
    }

    public final Bitmap a() {
        Boolean bool = this.f38127t;
        Bitmap bitmapObtain = this.f38111c.obtain(this.f38126s, this.f38125r, (bool == null || bool.booleanValue()) ? Bitmap.Config.ARGB_8888 : this.f38128u);
        bitmapObtain.setHasAlpha(true);
        return bitmapObtain;
    }

    @Override // com.bumptech.glide.gifdecoder.GifDecoder
    public void advance() {
        this.f38120l = (this.f38120l + 1) % this.m.f38095c;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0043  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v25 */
    /* JADX WARN: Type inference failed for: r5v26 */
    /* JADX WARN: Type inference failed for: r5v27 */
    /* JADX WARN: Type inference failed for: r5v32, types: [short] */
    /* JADX WARN: Type inference failed for: r5v34 */
    public final Bitmap b(a aVar, a aVar2) {
        byte b10;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        short s4;
        int i18;
        Bitmap bitmap;
        int i19;
        int[] iArr = this.f38119k;
        GifDecoder.BitmapProvider bitmapProvider = this.f38111c;
        byte b11 = 0;
        if (aVar2 == null) {
            Bitmap bitmap2 = this.f38121n;
            if (bitmap2 != null) {
                bitmapProvider.release(bitmap2);
            }
            this.f38121n = null;
            Arrays.fill(iArr, 0);
        }
        if (aVar2 != null && aVar2.f92984g == 3 && this.f38121n == null) {
            Arrays.fill(iArr, 0);
        }
        if (aVar2 != null && (i18 = aVar2.f92984g) > 0) {
            if (i18 == 2) {
                if (aVar.f92983f) {
                    i19 = 0;
                } else {
                    GifHeader gifHeader = this.m;
                    i19 = gifHeader.f38103k;
                    if (aVar.f92988k != null && gifHeader.f38102j == aVar.f92985h) {
                        i19 = 0;
                    }
                }
                int i20 = aVar2.f92981d;
                int i21 = this.f38124q;
                int i22 = i20 / i21;
                int i23 = aVar2.f92979b / i21;
                int i24 = aVar2.f92980c / i21;
                int i25 = aVar2.f92978a / i21;
                int i26 = this.f38126s;
                int i27 = (i23 * i26) + i25;
                int i28 = (i22 * i26) + i27;
                while (i27 < i28) {
                    int i29 = i27 + i24;
                    for (int i30 = i27; i30 < i29; i30++) {
                        iArr[i30] = i19;
                    }
                    i27 += this.f38126s;
                }
            } else if (i18 == 3 && (bitmap = this.f38121n) != null) {
                int i31 = this.f38126s;
                bitmap.getPixels(iArr, 0, i31, 0, 0, i31, this.f38125r);
            }
        }
        this.f38112d.position(aVar.f92987j);
        int i32 = aVar.f92980c * aVar.f92981d;
        byte[] bArr = this.f38118j;
        if (bArr == null || bArr.length < i32) {
            this.f38118j = bitmapProvider.obtainByteArray(i32);
        }
        byte[] bArr2 = this.f38118j;
        if (this.f38115g == null) {
            this.f38115g = new short[4096];
        }
        short[] sArr = this.f38115g;
        if (this.f38116h == null) {
            this.f38116h = new byte[4096];
        }
        byte[] bArr3 = this.f38116h;
        if (this.f38117i == null) {
            this.f38117i = new byte[FragmentTransaction.TRANSIT_FRAGMENT_OPEN];
        }
        byte[] bArr4 = this.f38117i;
        int i33 = this.f38112d.get() & 255;
        int i34 = 1 << i33;
        int i35 = i34 + 1;
        int i36 = i34 + 2;
        int i37 = i33 + 1;
        int i38 = (1 << i37) - 1;
        for (int i39 = 0; i39 < i34; i39++) {
            sArr[i39] = 0;
            bArr3[i39] = (byte) i39;
        }
        byte[] bArr5 = this.f38113e;
        int i40 = i37;
        int i41 = 0;
        int i42 = 0;
        int i43 = 0;
        int i44 = 0;
        int i45 = 0;
        int i46 = 0;
        int i47 = 0;
        int i48 = 0;
        int i49 = i36;
        int i50 = i38;
        int i51 = -1;
        while (true) {
            if (i41 >= i32) {
                b10 = b11;
                break;
            }
            if (i42 == 0) {
                int i52 = this.f38112d.get() & 255;
                if (i52 > 0) {
                    ByteBuffer byteBuffer = this.f38112d;
                    byteBuffer.get(this.f38113e, 0, Math.min(i52, byteBuffer.remaining()));
                }
                if (i52 <= 0) {
                    this.f38123p = 3;
                    b10 = 0;
                    break;
                }
                i42 = i52;
                i43 = 0;
            } else {
                i37 = i37;
                i41 = i41;
            }
            i45 += (bArr5[i43] & 255) << i44;
            i43++;
            i42--;
            i51 = i51;
            int i53 = i44 + 8;
            i49 = i49;
            i40 = i40;
            i41 = i41;
            bArr5 = bArr5;
            i47 = i47;
            while (true) {
                if (i53 < i40) {
                    i44 = i53;
                    b11 = 0;
                    break;
                }
                iArr = iArr;
                int i54 = i45 & i50;
                i45 >>= i40;
                i53 -= i40;
                if (i54 == i34) {
                    i49 = i36;
                    i50 = i38;
                    i40 = i37;
                    i51 = -1;
                } else {
                    if (i54 == i35) {
                        iArr = iArr;
                        i44 = i53;
                        b11 = 0;
                        break;
                    }
                    if (i51 == -1) {
                        bArr2[i46] = bArr3[i54];
                        i46++;
                        i41++;
                        i47 = i54;
                        i51 = i47;
                        i53 = i53;
                    } else {
                        if (i54 >= i49) {
                            bArr4[i48] = (byte) i47;
                            i48++;
                            s4 = i51;
                        } else {
                            s4 = i54;
                        }
                        while (s4 >= i34) {
                            bArr4[i48] = bArr3[s4];
                            i48++;
                            s4 = sArr[s4];
                        }
                        int i55 = bArr3[s4] & 255;
                        byte b12 = (byte) i55;
                        bArr2[i46] = b12;
                        while (true) {
                            i46++;
                            i41++;
                            if (i48 <= 0) {
                                break;
                            }
                            i48--;
                            bArr2[i46] = bArr4[i48];
                        }
                        if (i49 < 4096) {
                            sArr[i49] = (short) i51;
                            bArr3[i49] = b12;
                            i49++;
                            if ((i49 & i50) == 0 && i49 < 4096) {
                                i40++;
                                i50 += i49;
                            }
                        }
                        i51 = i54;
                        i53 = i53;
                        i47 = i55;
                    }
                }
            }
        }
        Arrays.fill(bArr2, i46, i32, b10);
        if (aVar.f92982e || this.f38124q != 1) {
            int[] iArr2 = this.f38119k;
            int i56 = aVar.f92981d;
            int i57 = this.f38124q;
            int i58 = i56 / i57;
            int i59 = aVar.f92979b / i57;
            int i60 = aVar.f92980c / i57;
            int i61 = aVar.f92978a / i57;
            boolean z10 = this.f38120l == 0;
            int i62 = this.f38126s;
            int i63 = this.f38125r;
            byte[] bArr6 = this.f38118j;
            int[] iArr3 = this.f38109a;
            Boolean bool = this.f38127t;
            int i64 = 8;
            int i65 = 0;
            int i66 = 0;
            int i67 = 1;
            while (i65 < i58) {
                Boolean bool2 = bool;
                if (aVar.f92982e) {
                    if (i66 >= i58) {
                        int i68 = i67 + 1;
                        i10 = i58;
                        if (i68 == 2) {
                            i66 = 4;
                        } else if (i68 == 3) {
                            i64 = 4;
                            i67 = i68;
                            i66 = 2;
                        } else if (i68 == 4) {
                            i67 = i68;
                            i66 = 1;
                            i64 = 2;
                        }
                        i67 = i68;
                    } else {
                        i10 = i58;
                    }
                    i11 = i66 + i64;
                } else {
                    i10 = i58;
                    i11 = i66;
                    i66 = i65;
                }
                int i69 = i66 + i59;
                boolean z11 = i57 == 1;
                if (i69 < i63) {
                    int i70 = i69 * i62;
                    int i71 = i70 + i61;
                    int i72 = i71 + i60;
                    int i73 = i70 + i62;
                    if (i73 < i72) {
                        i72 = i73;
                    }
                    int i74 = i65 * i57 * aVar.f92980c;
                    if (z11) {
                        bool = bool2;
                        int i75 = i71;
                        while (i75 < i72) {
                            int i76 = i60;
                            int i77 = iArr3[bArr6[i74] & 255];
                            if (i77 != 0) {
                                iArr2[i75] = i77;
                            } else if (z10 && bool == null) {
                                bool = Boolean.TRUE;
                            }
                            i74 += i57;
                            i75++;
                            i60 = i76;
                        }
                        i12 = i60;
                    } else {
                        i12 = i60;
                        int i78 = ((i72 - i71) * i57) + i74;
                        bool = bool2;
                        int i79 = i71;
                        while (i79 < i72) {
                            int i80 = i72;
                            int i81 = aVar.f92980c;
                            int i82 = i61;
                            int i83 = i62;
                            int i84 = i74;
                            int i85 = 0;
                            int i86 = 0;
                            int i87 = 0;
                            int i88 = 0;
                            int i89 = 0;
                            while (true) {
                                if (i84 >= this.f38124q + i74) {
                                    i16 = i63;
                                    break;
                                }
                                byte[] bArr7 = this.f38118j;
                                i16 = i63;
                                if (i84 >= bArr7.length || i84 >= i78) {
                                    break;
                                }
                                int i90 = this.f38109a[bArr7[i84] & 255];
                                if (i90 != 0) {
                                    i85 += (i90 >> 24) & 255;
                                    i86 += (i90 >> 16) & 255;
                                    i87 += (i90 >> 8) & 255;
                                    i88 += i90 & 255;
                                    i89++;
                                }
                                i84++;
                                i63 = i16;
                            }
                            int i91 = i81 + i74;
                            for (int i92 = i91; i92 < this.f38124q + i91; i92++) {
                                byte[] bArr8 = this.f38118j;
                                if (i92 >= bArr8.length || i92 >= i78) {
                                    break;
                                }
                                int i93 = this.f38109a[bArr8[i92] & 255];
                                if (i93 != 0) {
                                    i85 += (i93 >> 24) & 255;
                                    i86 += (i93 >> 16) & 255;
                                    i87 += (i93 >> 8) & 255;
                                    i88 += i93 & 255;
                                    i89++;
                                }
                            }
                            int i94 = i89 == 0 ? 0 : ((i85 / i89) << 24) | ((i86 / i89) << 16) | ((i87 / i89) << 8) | (i88 / i89);
                            if (i94 != 0) {
                                iArr2[i79] = i94;
                            } else if (z10 && bool == null) {
                                bool = Boolean.TRUE;
                            }
                            i74 += i57;
                            i79++;
                            i72 = i80;
                            i61 = i82;
                            i62 = i83;
                            i63 = i16;
                        }
                    }
                    i13 = i61;
                    i14 = i62;
                    i15 = i63;
                } else {
                    i12 = i60;
                    i13 = i61;
                    i14 = i62;
                    i15 = i63;
                    bool = bool2;
                }
                i65++;
                i58 = i10;
                i66 = i11;
                i59 = i59;
                i60 = i12;
                i61 = i13;
                i62 = i14;
                i63 = i15;
            }
            Boolean bool3 = bool;
            if (this.f38127t == null) {
                this.f38127t = Boolean.valueOf(bool3 == null ? false : bool3.booleanValue());
            }
        } else {
            int[] iArr4 = this.f38119k;
            int i95 = aVar.f92981d;
            int i96 = aVar.f92979b;
            int i97 = aVar.f92980c;
            int i98 = aVar.f92978a;
            byte b13 = this.f38120l == 0 ? (byte) 1 : b10;
            int i99 = this.f38126s;
            byte[] bArr9 = this.f38118j;
            int[] iArr5 = this.f38109a;
            byte b14 = -1;
            for (int i100 = b10; i100 < i95; i100++) {
                int i101 = (i100 + i96) * i99;
                int i102 = i101 + i98;
                int i103 = i102 + i97;
                int i104 = i101 + i99;
                if (i104 < i103) {
                    i103 = i104;
                }
                int i105 = aVar.f92980c * i100;
                while (i102 < i103) {
                    int i106 = i95;
                    byte b15 = bArr9[i105];
                    int i107 = i96;
                    int i108 = b15 & 255;
                    if (i108 != b14) {
                        int i109 = iArr5[i108];
                        if (i109 != 0) {
                            iArr4[i102] = i109;
                        } else {
                            b14 = b15;
                        }
                    }
                    i105++;
                    i102++;
                    i95 = i106;
                    i96 = i107;
                }
            }
            Boolean bool4 = this.f38127t;
            this.f38127t = Boolean.valueOf((bool4 != null && bool4.booleanValue()) || !(this.f38127t != null || b13 == 0 || b14 == -1));
        }
        if (this.f38122o && ((i17 = aVar.f92984g) == 0 || i17 == 1)) {
            if (this.f38121n == null) {
                this.f38121n = a();
            }
            Bitmap bitmap3 = this.f38121n;
            int i110 = this.f38126s;
            bitmap3.setPixels(iArr, 0, i110, 0, 0, i110, this.f38125r);
        }
        Bitmap bitmapA = a();
        int i111 = this.f38126s;
        bitmapA.setPixels(iArr, 0, i111, 0, 0, i111, this.f38125r);
        return bitmapA;
    }

    @Override // com.bumptech.glide.gifdecoder.GifDecoder
    public void clear() {
        this.m = null;
        byte[] bArr = this.f38118j;
        GifDecoder.BitmapProvider bitmapProvider = this.f38111c;
        if (bArr != null) {
            bitmapProvider.release(bArr);
        }
        int[] iArr = this.f38119k;
        if (iArr != null) {
            bitmapProvider.release(iArr);
        }
        Bitmap bitmap = this.f38121n;
        if (bitmap != null) {
            bitmapProvider.release(bitmap);
        }
        this.f38121n = null;
        this.f38112d = null;
        this.f38127t = null;
        byte[] bArr2 = this.f38113e;
        if (bArr2 != null) {
            bitmapProvider.release(bArr2);
        }
    }

    @Override // com.bumptech.glide.gifdecoder.GifDecoder
    public int getByteSize() {
        return (this.f38119k.length * 4) + this.f38112d.limit() + this.f38118j.length;
    }

    @Override // com.bumptech.glide.gifdecoder.GifDecoder
    public int getCurrentFrameIndex() {
        return this.f38120l;
    }

    @Override // com.bumptech.glide.gifdecoder.GifDecoder
    @NonNull
    public ByteBuffer getData() {
        return this.f38112d;
    }

    @Override // com.bumptech.glide.gifdecoder.GifDecoder
    public int getDelay(int i10) {
        if (i10 >= 0) {
            GifHeader gifHeader = this.m;
            if (i10 < gifHeader.f38095c) {
                return ((a) gifHeader.f38097e.get(i10)).f92986i;
            }
        }
        return -1;
    }

    @Override // com.bumptech.glide.gifdecoder.GifDecoder
    public int getFrameCount() {
        return this.m.f38095c;
    }

    @Override // com.bumptech.glide.gifdecoder.GifDecoder
    public int getHeight() {
        return this.m.f38099g;
    }

    @Override // com.bumptech.glide.gifdecoder.GifDecoder
    @Deprecated
    public int getLoopCount() {
        int i10 = this.m.f38104l;
        if (i10 == -1) {
            return 1;
        }
        return i10;
    }

    @Override // com.bumptech.glide.gifdecoder.GifDecoder
    public int getNetscapeLoopCount() {
        return this.m.f38104l;
    }

    @Override // com.bumptech.glide.gifdecoder.GifDecoder
    public int getNextDelay() {
        int i10;
        if (this.m.f38095c <= 0 || (i10 = this.f38120l) < 0) {
            return 0;
        }
        return getDelay(i10);
    }

    @Override // com.bumptech.glide.gifdecoder.GifDecoder
    @Nullable
    public synchronized Bitmap getNextFrame() {
        try {
            if (this.m.f38095c <= 0 || this.f38120l < 0) {
                if (Log.isLoggable("StandardGifDecoder", 3)) {
                    int i10 = this.m.f38095c;
                }
                this.f38123p = 1;
            }
            int i11 = this.f38123p;
            if (i11 != 1 && i11 != 2) {
                this.f38123p = 0;
                if (this.f38113e == null) {
                    this.f38113e = this.f38111c.obtainByteArray(255);
                }
                a aVar = (a) this.m.f38097e.get(this.f38120l);
                int i12 = this.f38120l - 1;
                a aVar2 = i12 >= 0 ? (a) this.m.f38097e.get(i12) : null;
                int[] iArr = aVar.f92988k;
                if (iArr == null) {
                    iArr = this.m.f38093a;
                }
                this.f38109a = iArr;
                if (iArr == null) {
                    this.f38123p = 1;
                    return null;
                }
                if (aVar.f92983f) {
                    System.arraycopy(iArr, 0, this.f38110b, 0, iArr.length);
                    int[] iArr2 = this.f38110b;
                    this.f38109a = iArr2;
                    iArr2[aVar.f92985h] = 0;
                    if (aVar.f92984g == 2 && this.f38120l == 0) {
                        this.f38127t = Boolean.TRUE;
                    }
                }
                return b(aVar, aVar2);
            }
            return null;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // com.bumptech.glide.gifdecoder.GifDecoder
    public int getStatus() {
        return this.f38123p;
    }

    @Override // com.bumptech.glide.gifdecoder.GifDecoder
    public int getTotalIterationCount() {
        int i10 = this.m.f38104l;
        if (i10 == -1) {
            return 1;
        }
        if (i10 == 0) {
            return 0;
        }
        return i10 + 1;
    }

    @Override // com.bumptech.glide.gifdecoder.GifDecoder
    public int getWidth() {
        return this.m.f38098f;
    }

    @Override // com.bumptech.glide.gifdecoder.GifDecoder
    public int read(@Nullable InputStream inputStream, int i10) {
        if (inputStream != null) {
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(i10 > 0 ? i10 + 4096 : 16384);
                byte[] bArr = new byte[16384];
                while (true) {
                    int i11 = inputStream.read(bArr, 0, 16384);
                    if (i11 == -1) {
                        break;
                    }
                    byteArrayOutputStream.write(bArr, 0, i11);
                }
                byteArrayOutputStream.flush();
                read(byteArrayOutputStream.toByteArray());
            } catch (IOException e5) {
                Log.w("StandardGifDecoder", "Error reading data from stream", e5);
            }
        } else {
            this.f38123p = 2;
        }
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException e7) {
                Log.w("StandardGifDecoder", "Error closing stream", e7);
            }
        }
        return this.f38123p;
    }

    @Override // com.bumptech.glide.gifdecoder.GifDecoder
    public void resetFrameIndex() {
        this.f38120l = -1;
    }

    @Override // com.bumptech.glide.gifdecoder.GifDecoder
    public synchronized void setData(@NonNull GifHeader gifHeader, @NonNull byte[] bArr) {
        setData(gifHeader, ByteBuffer.wrap(bArr));
    }

    @Override // com.bumptech.glide.gifdecoder.GifDecoder
    public void setDefaultBitmapConfig(@NonNull Bitmap.Config config) {
        Bitmap.Config config2;
        Bitmap.Config config3 = Bitmap.Config.ARGB_8888;
        if (config == config3 || config == (config2 = Bitmap.Config.RGB_565)) {
            this.f38128u = config;
            return;
        }
        throw new IllegalArgumentException("Unsupported format: " + config + ", must be one of " + config3 + " or " + config2);
    }

    public StandardGifDecoder(@NonNull GifDecoder.BitmapProvider bitmapProvider, GifHeader gifHeader, ByteBuffer byteBuffer, int i10) {
        this(bitmapProvider);
        setData(gifHeader, byteBuffer, i10);
    }

    @Override // com.bumptech.glide.gifdecoder.GifDecoder
    public synchronized void setData(@NonNull GifHeader gifHeader, @NonNull ByteBuffer byteBuffer) {
        setData(gifHeader, byteBuffer, 1);
    }

    public StandardGifDecoder(@NonNull GifDecoder.BitmapProvider bitmapProvider) {
        this.f38110b = new int[256];
        this.f38128u = Bitmap.Config.ARGB_8888;
        this.f38111c = bitmapProvider;
        this.m = new GifHeader();
    }

    @Override // com.bumptech.glide.gifdecoder.GifDecoder
    public synchronized void setData(@NonNull GifHeader gifHeader, @NonNull ByteBuffer byteBuffer, int i10) {
        try {
            if (i10 > 0) {
                int iHighestOneBit = Integer.highestOneBit(i10);
                this.f38123p = 0;
                this.m = gifHeader;
                this.f38120l = -1;
                ByteBuffer byteBufferAsReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
                this.f38112d = byteBufferAsReadOnlyBuffer;
                byteBufferAsReadOnlyBuffer.position(0);
                this.f38112d.order(ByteOrder.LITTLE_ENDIAN);
                this.f38122o = false;
                Iterator it = gifHeader.f38097e.iterator();
                while (it.hasNext()) {
                    if (((a) it.next()).f92984g == 3) {
                        this.f38122o = true;
                        break;
                    }
                }
                this.f38124q = iHighestOneBit;
                int i11 = gifHeader.f38098f;
                this.f38126s = i11 / iHighestOneBit;
                int i12 = gifHeader.f38099g;
                this.f38125r = i12 / iHighestOneBit;
                this.f38118j = this.f38111c.obtainByteArray(i11 * i12);
                this.f38119k = this.f38111c.obtainIntArray(this.f38126s * this.f38125r);
            } else {
                throw new IllegalArgumentException("Sample size must be >=0, not: " + i10);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // com.bumptech.glide.gifdecoder.GifDecoder
    public synchronized int read(@Nullable byte[] bArr) {
        try {
            if (this.f38114f == null) {
                this.f38114f = new GifHeaderParser();
            }
            GifHeader header = this.f38114f.setData(bArr).parseHeader();
            this.m = header;
            if (bArr != null) {
                setData(header, bArr);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f38123p;
    }
}
