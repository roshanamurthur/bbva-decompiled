package hh;

import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;

/* JADX INFO: compiled from: AI01AndOtherAIs.java */
/* JADX INFO: loaded from: classes10.dex */
public final class g extends h {
    @Override // com.google.zxing.oned.rss.expanded.decoders.AbstractExpandedDecoder
    public final String parseInformation() throws NotFoundException, FormatException {
        StringBuilder sbD = androidx.camera.core.impl.utils.c.d("(01)");
        int length = sbD.length();
        sbD.append(r.c(4, 4, getGeneralDecoder().f69462a));
        b(sbD, 8, length);
        return getGeneralDecoder().a(48, sbD);
    }
}
