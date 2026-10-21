package xb;

import android.content.Intent;
import com.bbva.showinfo.nativemodal.ConstantsKt;
import com.bbva.showinfo.nativemodal.activity.NativeListModalActivity;
import com.bbva.showinfo.nativemodal.modal.Item;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: NativeListModalActivity.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class b extends Lambda implements Function1<Item, Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ NativeListModalActivity f94513p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(NativeListModalActivity nativeListModalActivity) {
        super(1);
        this.f94513p0 = nativeListModalActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Item item) {
        Item item2 = item;
        NativeListModalActivity nativeListModalActivity = this.f94513p0;
        if (item2 != null) {
            Intent intent = new Intent();
            intent.putExtra(ConstantsKt.NATIVE_MODAL_ITEM_SELECTED, item2.getTag());
            nativeListModalActivity.setResult(-1, intent);
        }
        nativeListModalActivity.finish();
        return Unit.INSTANCE;
    }
}
