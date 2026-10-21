package ye;

import androidx.annotation.Nullable;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import com.google.android.play.core.splitinstall.testing.zzv;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.play:feature-delivery@@2.1.0 */
/* JADX INFO: loaded from: classes10.dex */
public final class b extends zzv {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f94788a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f94789b;

    public /* synthetic */ b(Integer num, Map map) {
        this.f94788a = num;
        this.f94789b = map;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzv) {
            zzv zzvVar = (zzv) obj;
            Integer num = this.f94788a;
            if (num != null ? num.equals(zzvVar.zza()) : zzvVar.zza() == null) {
                if (this.f94789b.equals(zzvVar.zzb())) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        Integer num = this.f94788a;
        return (((num == null ? 0 : num.hashCode()) ^ 1000003) * 1000003) ^ this.f94789b.hashCode();
    }

    public final String toString() {
        return "LocalTestingConfig{defaultSplitInstallErrorCode=" + this.f94788a + ", splitInstallErrorCodeByModule=" + String.valueOf(this.f94789b) + "}";
    }

    @Override // com.google.android.play.core.splitinstall.testing.zzv
    @Nullable
    @SplitInstallErrorCode
    public final Integer zza() {
        return this.f94788a;
    }

    @Override // com.google.android.play.core.splitinstall.testing.zzv
    public final Map zzb() {
        return this.f94789b;
    }
}
