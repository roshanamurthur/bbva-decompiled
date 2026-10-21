package androidx.work;

import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.camera.core.processing.f;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class InputMerger {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f24295a = Logger.tagWithPrefix("InputMerger");

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static InputMerger fromClassName(String str) {
        try {
            return (InputMerger) Class.forName(str).newInstance();
        } catch (Exception e5) {
            Logger.get().error(f24295a, f.d("Trouble instantiating + ", str), e5);
            return null;
        }
    }

    @NonNull
    public abstract Data merge(@NonNull List<Data> list);
}
