package hh;

import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import com.google.zxing.oned.rss.expanded.decoders.AbstractExpandedDecoder;

/* JADX INFO: compiled from: AnyAIDecoder.java */
/* JADX INFO: loaded from: classes10.dex */
public final class j extends AbstractExpandedDecoder {
    @Override // com.google.zxing.oned.rss.expanded.decoders.AbstractExpandedDecoder
    public final String parseInformation() throws NotFoundException, FormatException {
        return getGeneralDecoder().a(5, new StringBuilder());
    }
}
