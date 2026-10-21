package com.afollestad.materialdialogs.list;

import android.util.Log;
import androidx.annotation.ArrayRes;
import androidx.annotation.CheckResult;
import androidx.appcompat.widget.o1;
import androidx.recyclerview.widget.RecyclerView;
import com.afollestad.materialdialogs.MaterialDialog;
import com.afollestad.materialdialogs.WhichButton;
import com.afollestad.materialdialogs.actions.DialogActionExtKt;
import com.afollestad.materialdialogs.internal.list.DialogAdapter;
import com.afollestad.materialdialogs.internal.list.SingleChoiceDialogAdapter;
import com.afollestad.materialdialogs.utils.MDUtil;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.functions.Function3;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: DialogSingleChoiceExt.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\r\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004\u001a\u0012\u0010\u0005\u001a\u00020\u0006*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004\u001a¤\u0001\u0010\u0007\u001a\u00020\u0002*\u00020\u00022\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u00042\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u000e\u001a\u00020\u00042\b\b\u0002\u0010\u000f\u001a\u00020\u00062S\b\u0002\u0010\u0010\u001aM\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0014\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0003\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0015\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0011j\u0002`\u0016H\u0007¢\u0006\u0002\u0010\u0017\u001a\u0012\u0010\u0018\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004\u001a\u0012\u0010\u0019\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004\u001a\u008e\u0001\u0010\u001a\u001a\u00020\u0002*\u00020\u00022\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u00042\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2S\b\u0002\u0010\u0010\u001aM\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0014\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0003\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0015\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0011j\u0002`\u0016¢\u0006\u0002\u0010\u001b¨\u0006\u001c"}, d2 = {"checkItem", "", "Lcom/afollestad/materialdialogs/MaterialDialog;", FirebaseAnalytics.Param.INDEX, "", "isItemChecked", "", "listItemsSingleChoice", "res", FirebaseAnalytics.Param.ITEMS, "", "", "disabledIndices", "", "initialSelection", "waitForPositiveButton", "selection", "Lkotlin/Function3;", "Lkotlin/ParameterName;", "name", "dialog", "text", "Lcom/afollestad/materialdialogs/list/SingleChoiceListener;", "(Lcom/afollestad/materialdialogs/MaterialDialog;Ljava/lang/Integer;Ljava/util/List;[IIZLkotlin/jvm/functions/Function3;)Lcom/afollestad/materialdialogs/MaterialDialog;", "toggleItemChecked", "uncheckItem", "updateListItemsSingleChoice", "(Lcom/afollestad/materialdialogs/MaterialDialog;Ljava/lang/Integer;Ljava/util/List;[ILkotlin/jvm/functions/Function3;)Lcom/afollestad/materialdialogs/MaterialDialog;", "com.afollestad.material-dialogs.core"}, k = 2, mv = {1, 1, 15})
public final class DialogSingleChoiceExtKt {
    public static final void checkItem(@NotNull MaterialDialog materialDialog, int i10) {
        Object listAdapter = DialogListExtKt.getListAdapter(materialDialog);
        if (!(listAdapter instanceof DialogAdapter)) {
            throw new UnsupportedOperationException("Can't check item on adapter: ".concat(listAdapter != null ? listAdapter.getClass().getName() : AbstractJsonLexerKt.NULL));
        }
        ((DialogAdapter) listAdapter).checkItems(new int[]{i10});
    }

    public static final boolean isItemChecked(@NotNull MaterialDialog materialDialog, int i10) {
        Object listAdapter = DialogListExtKt.getListAdapter(materialDialog);
        if (listAdapter instanceof DialogAdapter) {
            return ((DialogAdapter) listAdapter).isItemChecked(i10);
        }
        throw new UnsupportedOperationException("Can't check if item is checked on adapter: ".concat(listAdapter != null ? listAdapter.getClass().getName() : AbstractJsonLexerKt.NULL));
    }

    @CheckResult
    @NotNull
    public static final MaterialDialog listItemsSingleChoice(@NotNull MaterialDialog materialDialog, @ArrayRes @Nullable Integer num, @Nullable List<? extends CharSequence> list, @Nullable int[] iArr, int i10, boolean z10, @Nullable Function3<? super MaterialDialog, ? super Integer, ? super CharSequence, Unit> function3) {
        MDUtil mDUtil = MDUtil.INSTANCE;
        mDUtil.assertOneSet("listItemsSingleChoice", list, num);
        List<? extends CharSequence> list2 = list != null ? list : ArraysKt___ArraysKt.toList(mDUtil.getStringArray(materialDialog.getWindowContext(), num));
        if (!(i10 >= -1 || i10 < list2.size())) {
            StringBuilder sbC = o1.c("Initial selection ", i10, " must be between -1 and the size of your items array ");
            sbC.append(list2.size());
            throw new IllegalArgumentException(sbC.toString().toString());
        }
        if (DialogListExtKt.getListAdapter(materialDialog) != null) {
            Log.w("MaterialDialogs", "Prefer calling updateListItemsSingleChoice(...) over listItemsSingleChoice(...) again.");
            return updateListItemsSingleChoice(materialDialog, num, list, iArr, function3);
        }
        DialogActionExtKt.setActionButtonEnabled(materialDialog, WhichButton.POSITIVE, i10 > -1);
        return DialogListExtKt.customListAdapter$default(materialDialog, new SingleChoiceDialogAdapter(materialDialog, list2, iArr, i10, z10, function3), null, 2, null);
    }

    public static /* synthetic */ MaterialDialog listItemsSingleChoice$default(MaterialDialog materialDialog, Integer num, List list, int[] iArr, int i10, boolean z10, Function3 function3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            num = null;
        }
        if ((i11 & 2) != 0) {
            list = null;
        }
        if ((i11 & 4) != 0) {
            iArr = null;
        }
        if ((i11 & 8) != 0) {
            i10 = -1;
        }
        if ((i11 & 16) != 0) {
            z10 = true;
        }
        if ((i11 & 32) != 0) {
            function3 = null;
        }
        return listItemsSingleChoice(materialDialog, num, list, iArr, i10, z10, function3);
    }

    public static final void toggleItemChecked(@NotNull MaterialDialog materialDialog, int i10) {
        Object listAdapter = DialogListExtKt.getListAdapter(materialDialog);
        if (!(listAdapter instanceof DialogAdapter)) {
            throw new UnsupportedOperationException("Can't toggle checked item on adapter: ".concat(listAdapter != null ? listAdapter.getClass().getName() : AbstractJsonLexerKt.NULL));
        }
        ((DialogAdapter) listAdapter).toggleItems(new int[]{i10});
    }

    public static final void uncheckItem(@NotNull MaterialDialog materialDialog, int i10) {
        Object listAdapter = DialogListExtKt.getListAdapter(materialDialog);
        if (!(listAdapter instanceof DialogAdapter)) {
            throw new UnsupportedOperationException("Can't uncheck item on adapter: ".concat(listAdapter != null ? listAdapter.getClass().getName() : AbstractJsonLexerKt.NULL));
        }
        ((DialogAdapter) listAdapter).uncheckItems(new int[]{i10});
    }

    @NotNull
    public static final MaterialDialog updateListItemsSingleChoice(@NotNull MaterialDialog materialDialog, @ArrayRes @Nullable Integer num, @Nullable List<? extends CharSequence> list, @Nullable int[] iArr, @Nullable Function3<? super MaterialDialog, ? super Integer, ? super CharSequence, Unit> function3) {
        MDUtil mDUtil = MDUtil.INSTANCE;
        mDUtil.assertOneSet("updateListItemsSingleChoice", list, num);
        if (list == null) {
            list = ArraysKt___ArraysKt.toList(mDUtil.getStringArray(materialDialog.getWindowContext(), num));
        }
        RecyclerView.Adapter<?> listAdapter = DialogListExtKt.getListAdapter(materialDialog);
        if (!(listAdapter instanceof SingleChoiceDialogAdapter)) {
            throw new IllegalStateException("updateListItemsSingleChoice(...) can't be used before you've created a single choice list dialog.".toString());
        }
        SingleChoiceDialogAdapter singleChoiceDialogAdapter = (SingleChoiceDialogAdapter) listAdapter;
        singleChoiceDialogAdapter.replaceItems2(list, function3);
        if (iArr != null) {
            singleChoiceDialogAdapter.disableItems(iArr);
        }
        return materialDialog;
    }

    public static /* synthetic */ MaterialDialog updateListItemsSingleChoice$default(MaterialDialog materialDialog, Integer num, List list, int[] iArr, Function3 function3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            num = null;
        }
        if ((i10 & 2) != 0) {
            list = null;
        }
        if ((i10 & 4) != 0) {
            iArr = null;
        }
        if ((i10 & 8) != 0) {
            function3 = null;
        }
        return updateListItemsSingleChoice(materialDialog, num, list, iArr, function3);
    }
}
