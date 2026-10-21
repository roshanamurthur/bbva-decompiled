package org.bouncycastle.asn1.eac;

import java.util.Hashtable;

/* JADX INFO: loaded from: classes12.dex */
public class BidirectionalMap extends Hashtable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Hashtable f87158p0 = new Hashtable();

    public Object getReverse(Object obj) {
        return this.f87158p0.get(obj);
    }

    @Override // java.util.Hashtable, java.util.Dictionary, java.util.Map
    public Object put(Object obj, Object obj2) {
        this.f87158p0.put(obj2, obj);
        return super.put(obj, obj2);
    }
}
