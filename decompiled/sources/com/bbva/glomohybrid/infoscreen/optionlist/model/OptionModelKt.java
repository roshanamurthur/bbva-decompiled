package com.bbva.glomohybrid.infoscreen.optionlist.model;

import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: OptionModel.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\u001a\u0016\u0010\u0000\u001a\u00020\u0001*\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¨\u0006\u0005"}, d2 = {"toOption", "Lcom/bbva/glomohybrid/infoscreen/optionlist/model/Option;", "", "", "", "info-modal_mexicoRelease"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class OptionModelKt {

    /* JADX INFO: compiled from: OptionModel.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Option.Type.values().length];
            try {
                iArr[Option.Type.NAVIGATION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Option.Type.NAVIGATION_BUNDLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Option.Type.APP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Option.Type.NONE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @NotNull
    public static final Option toOption(@NotNull Map<String, ? extends Object> map) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        Option.Type.Companion companion = Option.Type.INSTANCE;
        Object obj = map.get("type");
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.String");
        int i10 = WhenMappings.$EnumSwitchMapping$0[companion.from((String) obj).ordinal()];
        if (i10 == 1) {
            return new NavigateOption(map);
        }
        if (i10 == 2) {
            return new NavigateToRegisterUser(map);
        }
        if (i10 == 3) {
            return new AppOption(map);
        }
        if (i10 == 4) {
            return new None(map);
        }
        throw new NoWhenBranchMatchedException();
    }
}
