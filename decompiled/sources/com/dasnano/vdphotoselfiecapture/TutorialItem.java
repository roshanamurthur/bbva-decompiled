package com.dasnano.vdphotoselfiecapture;

import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import com.bbva.zoomauth.facialauth.constant.AuthConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: TutorialItem.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\b\u0012\u0006\u0010\u0010\u001a\u00020\b¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\r\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0010\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\n\u001a\u0004\b\u000f\u0010\f¨\u0006\u0013"}, d2 = {"Lcom/dasnano/vdphotoselfiecapture/TutorialItem;", "", "", "a", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getImage", "()I", AuthConstants.IMAGE, "", "b", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "title", "c", "getDescription", "description", "<init>", "(ILjava/lang/String;Ljava/lang/String;)V", "photo-selfie-capture_release"}, k = 1, mv = {1, 9, 0})
public final class TutorialItem {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final int image;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String title;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String description;

    public TutorialItem(int i10, @NotNull String title, @NotNull String description) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        this.image = i10;
        this.title = title;
        this.description = description;
    }

    @NotNull
    public final String getDescription() {
        return this.description;
    }

    public final int getImage() {
        return this.image;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }
}
