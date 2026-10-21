package com.adobe.marketing.mobile.services;

import com.mypinpad.tsdk.isolation.y2;
import java.util.Date;
import java.util.UUID;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes2.dex */
public final class DataEntity {
    private final String data;
    private final Date timestamp;
    private final String uniqueIdentifier;

    public DataEntity(String str) {
        this(UUID.randomUUID().toString(), new Date(), str);
    }

    public String getData() {
        return this.data;
    }

    public Date getTimestamp() {
        return this.timestamp;
    }

    public String getUniqueIdentifier() {
        return this.uniqueIdentifier;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("DataEntity{uniqueIdentifier='");
        sb2.append(this.uniqueIdentifier);
        sb2.append("', timeStamp=");
        sb2.append(this.timestamp);
        sb2.append(", data=");
        return y2.b(sb2, this.data, AbstractJsonLexerKt.END_OBJ);
    }

    public DataEntity(String str, Date date, String str2) {
        this.uniqueIdentifier = str;
        this.timestamp = date;
        this.data = str2;
    }
}
