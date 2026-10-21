package androidx.appcompat.view.menu;

import androidx.compose.ui.graphics.vector.PathBuilder;
import com.google.android.gms.internal.mlkit_common.zzay;
import com.google.firebase.encoders.FieldDescriptor;
import java.util.ArrayList;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlinx.coroutines.flow.FlowKt;
import org.koin.core.definition.BeanDefinition;
import org.koin.core.instance.SingleInstanceFactory;
import org.koin.core.module.Module;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b {
    public static FieldDescriptor a(int i10, FieldDescriptor.Builder builder) {
        zzay zzayVar = new zzay();
        zzayVar.zza(i10);
        return builder.withProperty(zzayVar.zzb()).build();
    }

    public static Object b(ArrayList arrayList, int i10) {
        return arrayList.get(arrayList.size() - i10);
    }

    public static String c(Exception exc, StringBuilder sb2) {
        sb2.append(exc.toString());
        return sb2.toString();
    }

    public static List d(PathBuilder pathBuilder, float f6, float f10, float f11, float f12) {
        pathBuilder.lineTo(f6, f10);
        pathBuilder.lineTo(f11, f12);
        pathBuilder.close();
        return pathBuilder.getNodes();
    }

    public static KotlinNothingValueException e() {
        FlowKt.noImpl();
        return new KotlinNothingValueException();
    }

    public static SingleInstanceFactory f(BeanDefinition beanDefinition, Module module) {
        SingleInstanceFactory singleInstanceFactory = new SingleInstanceFactory(beanDefinition);
        module.indexPrimaryType(singleInstanceFactory);
        return singleInstanceFactory;
    }
}
