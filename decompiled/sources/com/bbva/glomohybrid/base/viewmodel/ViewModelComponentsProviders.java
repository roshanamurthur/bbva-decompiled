package com.bbva.glomohybrid.base.viewmodel;

import androidx.exifinterface.media.ExifInterface;
import com.bbva.cellscore.app.ComponentManager;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.Koin;
import org.koin.core.component.KoinComponent;

/* JADX INFO: compiled from: ViewModelComponentsProviders.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\b\u0016\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\f\u001a\u00020\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0005\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\f\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\u000f"}, d2 = {"Lcom/bbva/glomohybrid/base/viewmodel/ViewModelComponentsProviders;", "Lorg/koin/core/component/KoinComponent;", ExifInterface.GPS_DIRECTION_TRUE, "", "id", "provide", "(Ljava/lang/String;)Ljava/lang/Object;", "", "p0", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getPageId", "()I", "pageId", "<init>", "(I)V", "Base_release"}, k = 1, mv = {1, 9, 0})
public class ViewModelComponentsProviders implements KoinComponent {

    /* JADX INFO: renamed from: p0, reason: collision with root package name and from kotlin metadata */
    public final int pageId;

    public ViewModelComponentsProviders(int i10) {
        this.pageId = i10;
    }

    @Override // org.koin.core.component.KoinComponent
    @NotNull
    public Koin getKoin() {
        return KoinComponent.DefaultImpls.getKoin(this);
    }

    public final int getPageId() {
        return this.pageId;
    }

    @Nullable
    public <T> T provide(@NotNull String id) {
        Intrinsics.checkNotNullParameter(id, "id");
        T t10 = (T) ComponentManager.get(this.pageId, id);
        return t10 == null ? (T) ComponentManager.get(id) : t10;
    }
}
