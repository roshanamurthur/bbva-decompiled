package androidx.work;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: classes2.dex */
public abstract class InputMergerFactory {

    public class a extends InputMergerFactory {
        @Override // androidx.work.InputMergerFactory
        @Nullable
        public final InputMerger createInputMerger(@NonNull String str) {
            return null;
        }
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static InputMergerFactory getDefaultInputMergerFactory() {
        return new a();
    }

    @Nullable
    public abstract InputMerger createInputMerger(@NonNull String str);

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final InputMerger createInputMergerWithDefaultFallback(@NonNull String str) {
        InputMerger inputMergerCreateInputMerger = createInputMerger(str);
        return inputMergerCreateInputMerger == null ? InputMerger.fromClassName(str) : inputMergerCreateInputMerger;
    }
}
