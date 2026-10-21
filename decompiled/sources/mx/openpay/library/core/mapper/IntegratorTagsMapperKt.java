package mx.openpay.library.core.mapper;

import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import mx.openpay.library.core.model.OpenPayIntegrator;
import mx.openpay.library.domain.model.IntegratorTags;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"mapToDomainModel", "Lmx/openpay/library/domain/model/IntegratorTags;", "Lmx/openpay/library/core/model/OpenPayIntegrator;", "library_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class IntegratorTagsMapperKt {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[OpenPayIntegrator.values().length];
            try {
                iArr[OpenPayIntegrator.GLOMO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OpenPayIntegrator.MPOS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[OpenPayIntegrator.POS_AUTONOMOUS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @NotNull
    public static final IntegratorTags mapToDomainModel(@NotNull OpenPayIntegrator openPayIntegrator) {
        Intrinsics.checkNotNullParameter(openPayIntegrator, "<this>");
        int i10 = WhenMappings.$EnumSwitchMapping$0[openPayIntegrator.ordinal()];
        if (i10 == 1) {
            return IntegratorTags.GLOMO;
        }
        if (i10 == 2) {
            return IntegratorTags.MPOS;
        }
        if (i10 == 3) {
            return IntegratorTags.POS_AUTONOMOUS;
        }
        throw new NoWhenBranchMatchedException();
    }
}
