package com.bbva.ui.utils;

import android.content.Intent;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import com.bbva.ui.R;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Animation.kt */
/* JADX INFO: loaded from: classes9.dex */
@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001:\u0001\u0007B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\b"}, d2 = {"Lcom/bbva/ui/utils/Animation;", "", "()V", "getAnimationType", "Lcom/bbva/ui/utils/Animation$AnimationType;", "intent", "Landroid/content/Intent;", "AnimationType", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class Animation {
    public static final int $stable = 0;

    @NotNull
    public static final Animation INSTANCE = new Animation();

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'FADING' uses external variables
    	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:160)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX INFO: compiled from: Animation.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0010\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001a\u0004\b\b\u0010\u0006R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0004\u001a\u0004\b\n\u0010\u0006R\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0004\u001a\u0004\b\f\u0010\u0006j\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u0012"}, d2 = {"Lcom/bbva/ui/utils/Animation$AnimationType;", "", "", "enterAnim", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getEnterAnim", "()I", "exitAnim", "getExitAnim", "finishEnterAnim", "getFinishEnterAnim", "finishExitAnim", "getFinishExitAnim", "FADING", "FADING_FAST", "LATERAL", "LATERAL_FINISH", "MODAL", "ui_release"}, k = 1, mv = {1, 9, 0})
    public static final class AnimationType {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ AnimationType[] $VALUES;
        public static final AnimationType FADING;
        public static final AnimationType FADING_FAST;
        public static final AnimationType LATERAL;
        public static final AnimationType LATERAL_FINISH;
        public static final AnimationType MODAL;
        private final int enterAnim;
        private final int exitAnim;
        private final int finishEnterAnim;
        private final int finishExitAnim;

        static {
            int i10 = R.anim.fade_in;
            int i11 = R.anim.fade_out;
            AnimationType animationType = new AnimationType("FADING", 0, i10, i11, i10, i11);
            FADING = animationType;
            int i12 = R.anim.fade_in_fast;
            int i13 = R.anim.fade_out_fast;
            AnimationType animationType2 = new AnimationType("FADING_FAST", 1, i12, i13, i12, i13);
            FADING_FAST = animationType2;
            int i14 = R.anim.slide_right_in;
            int i15 = R.anim.slide_left_out;
            int i16 = R.anim.slide_left_in;
            int i17 = R.anim.slide_right_out;
            AnimationType animationType3 = new AnimationType("LATERAL", 2, i14, i15, i16, i17);
            LATERAL = animationType3;
            AnimationType animationType4 = new AnimationType("LATERAL_FINISH", 3, i12, R.anim.nothing, i16, i17);
            LATERAL_FINISH = animationType4;
            AnimationType animationType5 = new AnimationType("MODAL", 4, R.anim.slide_from_bottom_to_top, R.anim.slide_hold, 0, R.anim.slide_from_top_to_bottom);
            MODAL = animationType5;
            AnimationType[] animationTypeArr = {animationType, animationType2, animationType3, animationType4, animationType5};
            $VALUES = animationTypeArr;
            $ENTRIES = EnumEntriesKt.enumEntries(animationTypeArr);
        }

        public AnimationType(String str, int i10, int i11, int i12, int i13, int i14) {
            super(str, i10);
            this.enterAnim = i11;
            this.exitAnim = i12;
            this.finishEnterAnim = i13;
            this.finishExitAnim = i14;
        }

        @NotNull
        public static EnumEntries<AnimationType> getEntries() {
            return $ENTRIES;
        }

        public static AnimationType valueOf(String str) {
            return (AnimationType) Enum.valueOf(AnimationType.class, str);
        }

        public static AnimationType[] values() {
            return (AnimationType[]) $VALUES.clone();
        }

        public final int getEnterAnim() {
            return this.enterAnim;
        }

        public final int getExitAnim() {
            return this.exitAnim;
        }

        public final int getFinishEnterAnim() {
            return this.finishEnterAnim;
        }

        public final int getFinishExitAnim() {
            return this.finishExitAnim;
        }
    }

    @Nullable
    public final AnimationType getAnimationType(@NotNull Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        int intExtra = intent.getIntExtra(AnimationType.class.getName(), -1);
        if (intExtra < 0 || intExtra >= AnimationType.getEntries().size()) {
            return null;
        }
        return AnimationType.getEntries().get(intExtra);
    }
}
