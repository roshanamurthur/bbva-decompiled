package pc;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.budiyev.android.codescanner.Utils;
import com.google.zxing.MultiFormatReader;
import com.google.zxing.PlanarYUVLuminanceSource;
import com.google.zxing.ReaderException;
import com.google.zxing.Result;

/* JADX INFO: compiled from: DecodeTask.java */
/* JADX INFO: loaded from: classes9.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f92602a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f92603b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f92604c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c f92605d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final d f92606e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f92607f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f92608g;

    public a(@NonNull byte[] bArr, @NonNull c cVar, @NonNull c cVar2, @NonNull c cVar3, @NonNull d dVar, int i10, boolean z10) {
        this.f92602a = bArr;
        this.f92603b = cVar;
        this.f92604c = cVar2;
        this.f92605d = cVar3;
        this.f92606e = dVar;
        this.f92607f = i10;
        this.f92608g = z10;
    }

    @Nullable
    public final Result a(@NonNull MultiFormatReader multiFormatReader) throws ReaderException {
        int i10;
        int i11;
        c cVar = this.f92603b;
        int i12 = cVar.f92618a;
        int i13 = cVar.f92619b;
        byte[] bArr = this.f92602a;
        int i14 = this.f92607f;
        byte[] bArrD = Utils.d(i12, i13, bArr, i14);
        if (i14 == 90 || i14 == 270) {
            i10 = i13;
            i11 = i12;
        } else {
            i11 = i13;
            i10 = i12;
        }
        d dVarC = Utils.c(i10, i11, this.f92606e, this.f92604c, this.f92605d);
        int i15 = dVarC.f92620a;
        int i16 = dVarC.f92622c - i15;
        int i17 = dVarC.f92621b;
        int i18 = dVarC.f92623d - i17;
        if (i16 < 1 || i18 < 1) {
            return null;
        }
        return Utils.b(multiFormatReader, new PlanarYUVLuminanceSource(bArrD, i10, i11, i15, i17, i16, i18, this.f92608g));
    }
}
