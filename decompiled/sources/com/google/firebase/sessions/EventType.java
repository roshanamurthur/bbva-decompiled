package com.google.firebase.sessions;

import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import com.google.firebase.encoders.json.NumberedEnum;
import kotlin.Metadata;

/* JADX INFO: compiled from: SessionEvent.kt */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/google/firebase/sessions/EventType;", "", "Lcom/google/firebase/encoders/json/NumberedEnum;", "", "number", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getNumber", "()I", "EVENT_TYPE_UNKNOWN", "SESSION_START", "com.google.firebase-firebase-sessions"}, k = 1, mv = {1, 7, 1})
public enum EventType implements NumberedEnum {
    EVENT_TYPE_UNKNOWN(0),
    SESSION_START(1);

    private final int number;

    EventType(int i10) {
        this.number = i10;
    }

    @Override // com.google.firebase.encoders.json.NumberedEnum
    public int getNumber() {
        return this.number;
    }
}
