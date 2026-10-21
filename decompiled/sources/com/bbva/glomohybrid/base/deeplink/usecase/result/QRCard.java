package com.bbva.glomohybrid.base.deeplink.usecase.result;

import ad.d;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.glomohybrid.base.deeplink.model.QRPayload;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: DynamicLinkResult.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\u000b\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003J)\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0001J\t\u0010\u000b\u001a\u00020\u0002HÖ\u0001J\t\u0010\r\u001a\u00020\fHÖ\u0001J\u0013\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0013\u001a\u0004\b\u001b\u0010\u0015¨\u0006\u001e"}, d2 = {"Lcom/bbva/glomohybrid/base/deeplink/usecase/result/QRCard;", "Lcom/bbva/glomohybrid/base/deeplink/usecase/result/DynamicLinkResult;", "", "component1", "Lcom/bbva/glomohybrid/base/deeplink/model/QRPayload;", "component2", "component3", "id", "data", "origin", "copy", "toString", "", GenerateActivationFormCommand.HASH_CODE, "", "other", "", "equals", "a", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "b", "Lcom/bbva/glomohybrid/base/deeplink/model/QRPayload;", "getData", "()Lcom/bbva/glomohybrid/base/deeplink/model/QRPayload;", "c", "getOrigin", "<init>", "(Ljava/lang/String;Lcom/bbva/glomohybrid/base/deeplink/model/QRPayload;Ljava/lang/String;)V", "Base_release"}, k = 1, mv = {1, 9, 0})
public final /* data */ class QRCard extends DynamicLinkResult {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final QRPayload data;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final String origin;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QRCard(@NotNull String id, @NotNull QRPayload data, @Nullable String str) {
        super(null);
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(data, "data");
        this.id = id;
        this.data = data;
        this.origin = str;
    }

    public static /* synthetic */ QRCard copy$default(QRCard qRCard, String str, QRPayload qRPayload, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = qRCard.id;
        }
        if ((i10 & 2) != 0) {
            qRPayload = qRCard.data;
        }
        if ((i10 & 4) != 0) {
            str2 = qRCard.origin;
        }
        return qRCard.copy(str, qRPayload, str2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final QRPayload getData() {
        return this.data;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getOrigin() {
        return this.origin;
    }

    @NotNull
    public final QRCard copy(@NotNull String id, @NotNull QRPayload data, @Nullable String origin) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(data, "data");
        return new QRCard(id, data, origin);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof QRCard)) {
            return false;
        }
        QRCard qRCard = (QRCard) other;
        return Intrinsics.areEqual(this.id, qRCard.id) && Intrinsics.areEqual(this.data, qRCard.data) && Intrinsics.areEqual(this.origin, qRCard.origin);
    }

    @NotNull
    public final QRPayload getData() {
        return this.data;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    @Nullable
    public final String getOrigin() {
        return this.origin;
    }

    public int hashCode() {
        int iHashCode = (this.data.hashCode() + (this.id.hashCode() * 31)) * 31;
        String str = this.origin;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("QRCard(id=");
        sb2.append(this.id);
        sb2.append(", data=");
        sb2.append(this.data);
        sb2.append(", origin=");
        return d.f(sb2, this.origin, ")");
    }
}
