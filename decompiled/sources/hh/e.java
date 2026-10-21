package hh;

import androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.google.zxing.NotFoundException;
import com.google.zxing.common.BitArray;

/* JADX INFO: compiled from: AI013x0x1xDecoder.java */
/* JADX INFO: loaded from: classes10.dex */
public final class e extends i {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f69444c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f69445d;

    public e(BitArray bitArray, String str, String str2) {
        super(bitArray);
        this.f69444c = str2;
        this.f69445d = str;
    }

    @Override // hh.i
    public final void c(int i10, StringBuilder sb2) {
        sb2.append(RootService.OPEN_BRACKET);
        sb2.append(this.f69445d);
        sb2.append(i10 / AndroidComposeViewAccessibilityDelegateCompat.ParcelSafeTextLength);
        sb2.append(RootService.CLOSE_BRACKET);
    }

    @Override // hh.i
    public final int d(int i10) {
        return i10 % AndroidComposeViewAccessibilityDelegateCompat.ParcelSafeTextLength;
    }

    @Override // com.google.zxing.oned.rss.expanded.decoders.AbstractExpandedDecoder
    public final String parseInformation() throws NotFoundException {
        if (getInformation().getSize() != 84) {
            throw NotFoundException.getNotFoundInstance();
        }
        StringBuilder sb2 = new StringBuilder();
        a(8, sb2);
        e(sb2, 48, 20);
        int iC = r.c(68, 16, getGeneralDecoder().f69462a);
        if (iC != 38400) {
            sb2.append(RootService.OPEN_BRACKET);
            sb2.append(this.f69444c);
            sb2.append(RootService.CLOSE_BRACKET);
            int i10 = iC % 32;
            int i11 = iC / 32;
            int i12 = (i11 % 12) + 1;
            int i13 = i11 / 12;
            if (i13 / 10 == 0) {
                sb2.append('0');
            }
            sb2.append(i13);
            if (i12 / 10 == 0) {
                sb2.append('0');
            }
            sb2.append(i12);
            if (i10 / 10 == 0) {
                sb2.append('0');
            }
            sb2.append(i10);
        }
        return sb2.toString();
    }
}
