package com.bbva.tohu.android.product.valkyria.sdk.initializers;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.startup.Initializer;
import com.bbva.tohu.android.product.valkyria.sdk.export.MobilePayment;
import com.bbva.tohu.android.product.valkyria.sdk.export.exceptions.ContextValidatorException;
import com.bbva.tohu.android.product.valkyria.sdk.export.exceptions.LoadPropertiesException;
import com.bbva.tohu.android.product.valkyria.sdk.export.exceptions.NfcNeededException;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class MobilePaymentInitializer implements Initializer<MobilePayment> {
    @Override // androidx.startup.Initializer
    @NonNull
    public List<Class<? extends Initializer<?>>> dependencies() {
        return Collections.emptyList();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.startup.Initializer
    @NonNull
    public MobilePayment create(@NonNull Context context) {
        try {
            MobilePayment.getInstance().init(context);
            return MobilePayment.getInstance();
        } catch (ContextValidatorException | LoadPropertiesException | NfcNeededException e5) {
            throw new RuntimeException(e5);
        }
    }
}
