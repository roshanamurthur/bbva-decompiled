package hh;

import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;

/* JADX INFO: compiled from: AI01393xDecoder.java */
/* JADX INFO: loaded from: classes10.dex */
public final class d extends h {
    @Override // com.google.zxing.oned.rss.expanded.decoders.AbstractExpandedDecoder
    public final String parseInformation() throws NotFoundException, FormatException {
        if (getInformation().getSize() < 48) {
            throw NotFoundException.getNotFoundInstance();
        }
        StringBuilder sb2 = new StringBuilder();
        a(8, sb2);
        int iC = r.c(48, 2, getGeneralDecoder().f69462a);
        sb2.append("(393");
        sb2.append(iC);
        sb2.append(RootService.CLOSE_BRACKET);
        int iC2 = r.c(50, 10, getGeneralDecoder().f69462a);
        if (iC2 / 100 == 0) {
            sb2.append('0');
        }
        if (iC2 / 10 == 0) {
            sb2.append('0');
        }
        sb2.append(iC2);
        sb2.append(getGeneralDecoder().b(60, null).f69451b);
        return sb2.toString();
    }
}
