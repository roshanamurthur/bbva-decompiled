package com.bbva.library.digipassmanager.callbacks;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: compiled from: OnDigipassOperation.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0005H&¨\u0006\b"}, d2 = {"Lcom/bbva/library/digipassmanager/callbacks/OnDigipassOperation;", "", "onOperationComplete", "", "responseSuccess", "Lorg/json/JSONObject;", "onOperationFailure", "responseFailure", "digipassmanager-library_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface OnDigipassOperation {
    void onOperationComplete(@NotNull JSONObject responseSuccess);

    void onOperationFailure(@NotNull JSONObject responseFailure);
}
