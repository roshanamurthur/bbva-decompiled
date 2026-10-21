package com.bbva.glomohybrid.inappupdate.extensions;

import com.bbva.glomohybrid.base.models.InAppUpdateType;
import com.google.android.play.core.install.model.AppUpdateType;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: InappUpdateTypeExtensions.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0005\"\u001e\u0010\u0000\u001a\u00020\u0001*\u00020\u00028FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"value", "", "Lcom/bbva/glomohybrid/base/models/InAppUpdateType;", "getValue$annotations", "(Lcom/bbva/glomohybrid/base/models/InAppUpdateType;)V", "getValue", "(Lcom/bbva/glomohybrid/base/models/InAppUpdateType;)I", "app_mexicoProdGoogleRelease"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class InappUpdateTypeExtensionsKt {

    /* JADX INFO: compiled from: InappUpdateTypeExtensions.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[InAppUpdateType.values().length];
            try {
                iArr[InAppUpdateType.IMMEDIATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[InAppUpdateType.FLEXIBLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final int getValue(@NotNull InAppUpdateType inAppUpdateType) {
        Intrinsics.checkNotNullParameter(inAppUpdateType, "<this>");
        int i10 = WhenMappings.$EnumSwitchMapping$0[inAppUpdateType.ordinal()];
        if (i10 == 1) {
            return 1;
        }
        if (i10 == 2) {
            return 0;
        }
        throw new NoWhenBranchMatchedException();
    }

    @AppUpdateType
    public static /* synthetic */ void getValue$annotations(InAppUpdateType inAppUpdateType) {
    }
}
