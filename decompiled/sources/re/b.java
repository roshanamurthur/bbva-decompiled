package re;

import com.google.android.odml.image.ImageProperties;

/* JADX INFO: compiled from: com.google.android.odml:image@@1.0.0-beta1 */
/* JADX INFO: loaded from: classes10.dex */
public final class b extends ImageProperties {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f92994a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f92995b;

    public /* synthetic */ b(int i10, int i11) {
        this.f92994a = i10;
        this.f92995b = i11;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ImageProperties) {
            ImageProperties imageProperties = (ImageProperties) obj;
            if (this.f92994a == imageProperties.getImageFormat() && this.f92995b == imageProperties.getStorageType()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.odml.image.ImageProperties
    public final int getImageFormat() {
        return this.f92994a;
    }

    @Override // com.google.android.odml.image.ImageProperties
    public final int getStorageType() {
        return this.f92995b;
    }

    public final int hashCode() {
        return ((this.f92994a ^ 1000003) * 1000003) ^ this.f92995b;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(65);
        sb2.append("ImageProperties{imageFormat=");
        sb2.append(this.f92994a);
        sb2.append(", storageType=");
        sb2.append(this.f92995b);
        sb2.append("}");
        return sb2.toString();
    }
}
