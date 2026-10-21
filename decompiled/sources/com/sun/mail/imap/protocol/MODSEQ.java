package com.sun.mail.imap.protocol;

import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.sun.mail.iap.ParsingException;

/* JADX INFO: loaded from: classes9.dex */
public class MODSEQ implements Item {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final char[] f65450p0 = {'M', 'O', 'D', 'S', 'E', 'Q'};
    public long modseq;
    public int seqnum;

    public MODSEQ(FetchResponse fetchResponse) throws ParsingException {
        this.seqnum = fetchResponse.getNumber();
        fetchResponse.skipSpaces();
        if (fetchResponse.readByte() != 40) {
            throw new ParsingException("MODSEQ parse error");
        }
        this.modseq = fetchResponse.readLong();
        if (!fetchResponse.isNextNonSpace(RootService.CLOSE_BRACKET)) {
            throw new ParsingException("MODSEQ parse error");
        }
    }
}
