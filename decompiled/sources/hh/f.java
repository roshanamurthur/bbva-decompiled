package hh;

import com.google.zxing.NotFoundException;

/* JADX INFO: compiled from: AI013x0xDecoder.java */
/* JADX INFO: loaded from: classes10.dex */
public abstract class f extends i {
    @Override // com.google.zxing.oned.rss.expanded.decoders.AbstractExpandedDecoder
    public final String parseInformation() throws NotFoundException {
        if (getInformation().getSize() != 60) {
            throw NotFoundException.getNotFoundInstance();
        }
        StringBuilder sb2 = new StringBuilder();
        a(5, sb2);
        e(sb2, 45, 15);
        return sb2.toString();
    }
}
