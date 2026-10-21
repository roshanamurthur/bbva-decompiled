package com.facetec.sdk;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public interface kh {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final kh f42031e = new kh() { // from class: com.facetec.sdk.kh.4
        @Override // com.facetec.sdk.kh
        public final List<InetAddress> e(String str) throws UnknownHostException {
            if (str == null) {
                throw new UnknownHostException("hostname == null");
            }
            try {
                return Arrays.asList(InetAddress.getAllByName(str));
            } catch (NullPointerException e5) {
                UnknownHostException unknownHostException = new UnknownHostException("Broken system behaviour for dns lookup of ".concat(str));
                unknownHostException.initCause(e5);
                throw unknownHostException;
            }
        }
    };

    List<InetAddress> e(String str) throws UnknownHostException;
}
