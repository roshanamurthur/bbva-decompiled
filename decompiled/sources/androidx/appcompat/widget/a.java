package androidx.appcompat.widget;

import androidx.compose.ui.graphics.vector.PathBuilder;
import com.google.android.gms.internal.mlkit_common.zzay;
import com.google.firebase.encoders.FieldDescriptor;
import java.util.List;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a {
    public static int a(int i10, int i11, int i12, int i13) {
        return ((i10 - i11) / i12) + i13;
    }

    public static FieldDescriptor.Builder b(int i10, FieldDescriptor.Builder builder, String str) {
        zzay zzayVar = new zzay();
        zzayVar.zza(i10);
        builder.withProperty(zzayVar.zzb()).build();
        return FieldDescriptor.builder(str);
    }

    public static String c(StringBuilder sb2, int i10, String str) {
        sb2.append(i10);
        sb2.append(str);
        return sb2.toString();
    }

    public static List d(PathBuilder pathBuilder, float f6, float f10, float f11, float f12) {
        pathBuilder.lineToRelative(f6, f10);
        pathBuilder.lineToRelative(f11, f12);
        pathBuilder.close();
        return pathBuilder.getNodes();
    }
}
