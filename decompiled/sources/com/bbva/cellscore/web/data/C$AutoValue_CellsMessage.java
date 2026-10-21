package com.bbva.cellscore.web.data;

import android.os.Bundle;
import com.bbva.cellscore.web.data.component.ChannelMessage;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.bbva.cellscore.web.data.$AutoValue_CellsMessage, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
abstract class C$AutoValue_CellsMessage extends CellsMessage {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final String f27074p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final String f27075q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final ArrayList<ChannelMessage> f27076r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final Bundle f27077s0;

    public C$AutoValue_CellsMessage(String str, String str2, ArrayList<ChannelMessage> arrayList, Bundle bundle) {
        if (str == null) {
            throw new NullPointerException("Null operation");
        }
        this.f27074p0 = str;
        if (str2 == null) {
            throw new NullPointerException("Null route");
        }
        this.f27075q0 = str2;
        if (arrayList == null) {
            throw new NullPointerException("Null channelMessage");
        }
        this.f27076r0 = arrayList;
        if (bundle == null) {
            throw new NullPointerException("Null params");
        }
        this.f27077s0 = bundle;
    }

    @Override // com.bbva.cellscore.web.data.CellsMessage
    public final ArrayList<ChannelMessage> channelMessage() {
        return this.f27076r0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CellsMessage)) {
            return false;
        }
        CellsMessage cellsMessage = (CellsMessage) obj;
        return this.f27074p0.equals(cellsMessage.operation()) && this.f27075q0.equals(cellsMessage.route()) && this.f27076r0.equals(cellsMessage.channelMessage()) && this.f27077s0.equals(cellsMessage.params());
    }

    public final int hashCode() {
        return ((((((this.f27074p0.hashCode() ^ 1000003) * 1000003) ^ this.f27075q0.hashCode()) * 1000003) ^ this.f27076r0.hashCode()) * 1000003) ^ this.f27077s0.hashCode();
    }

    @Override // com.bbva.cellscore.web.data.CellsMessage
    public final String operation() {
        return this.f27074p0;
    }

    @Override // com.bbva.cellscore.web.data.CellsMessage
    public final Bundle params() {
        return this.f27077s0;
    }

    @Override // com.bbva.cellscore.web.data.CellsMessage
    public final String route() {
        return this.f27075q0;
    }

    public final String toString() {
        return "CellsMessage{operation=" + this.f27074p0 + ", route=" + this.f27075q0 + ", channelMessage=" + this.f27076r0 + ", params=" + this.f27077s0 + "}";
    }
}
