package com.afollestad.materialdialogs.list;

import android.util.Log;
import androidx.annotation.ArrayRes;
import androidx.annotation.CheckResult;
import androidx.recyclerview.widget.RecyclerView;
import com.afollestad.materialdialogs.MaterialDialog;
import com.afollestad.materialdialogs.WhichButton;
import com.afollestad.materialdialogs.actions.DialogActionExtKt;
import com.afollestad.materialdialogs.internal.list.DialogAdapter;
import com.afollestad.materialdialogs.internal.list.MultiChoiceDialogAdapter;
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

/* JADX INFO: compiled from: DialogMultiChoiceExt.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\u0012\u0010\u0003\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0005\u001a´\u0001\u0010\u0006\u001a\u00020\u0002*\u00020\u00022\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\r\u001a\u00020\u00052\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2Y\b\u0002\u0010\u0011\u001aS\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0015\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0004\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0012j\u0002`\u0016H\u0007¢\u0006\u0002\u0010\u0017\u001a\n\u0010\u0018\u001a\u00020\u0001*\u00020\u0002\u001a\u0012\u0010\u0019\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0005\u001a\n\u0010\u001a\u001a\u00020\u0001*\u00020\u0002\u001a\u0012\u0010\u001b\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0005\u001a\u0094\u0001\u0010\u001c\u001a\u00020\u0002*\u00020\u00022\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00052Y\b\u0002\u0010\u0011\u001aS\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0015\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0004\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0012j\u0002`\u0016¢\u0006\u0002\u0010\u001d¨\u0006\u001e"}, d2 = {"checkAllItems", "", "Lcom/afollestad/materialdialogs/MaterialDialog;", "checkItems", "indices", "", "listItemsMultiChoice", "res", "", FirebaseAnalytics.Param.ITEMS, "", "", "disabledIndices", "initialSelection", "waitForPositiveButton", "", "allowEmptySelection", "selection", "Lkotlin/Function3;", "Lkotlin/ParameterName;", "name", "dialog", "Lcom/afollestad/materialdialogs/list/MultiChoiceListener;", "(Lcom/afollestad/materialdialogs/MaterialDialog;Ljava/lang/Integer;Ljava/util/List;[I[IZZLkotlin/jvm/functions/Function3;)Lcom/afollestad/materialdialogs/MaterialDialog;", "toggleAllItemsChecked", "toggleItemsChecked", "uncheckAllItems", "uncheckItems", "updateListItemsMultiChoice", "(Lcom/afollestad/materialdialogs/MaterialDialog;Ljava/lang/Integer;Ljava/util/List;[ILkotlin/jvm/functions/Function3;)Lcom/afollestad/materialdialogs/MaterialDialog;", "com.afollestad.material-dialogs.core"}, k = 2, mv = {1, 1, 15})
public final class DialogMultiChoiceExtKt {
    public static final void checkAllItems(@NotNull MaterialDialog materialDialog) {
        Object listAdapter = DialogListExtKt.getListAdapter(materialDialog);
        if (!(listAdapter instanceof DialogAdapter)) {
            throw new UnsupportedOperationException("Can't check all items on adapter: ".concat(listAdapter != null ? listAdapter.getClass().getName() : AbstractJsonLexerKt.NULL));
        }
        ((DialogAdapter) listAdapter).checkAllItems();
    }

    public static final void checkItems(@NotNull MaterialDialog materialDialog, @NotNull int[] iArr) {
        Object listAdapter = DialogListExtKt.getListAdapter(materialDialog);
        if (!(listAdapter instanceof DialogAdapter)) {
            throw new UnsupportedOperationException("Can't check items on adapter: ".concat(listAdapter != null ? listAdapter.getClass().getName() : AbstractJsonLexerKt.NULL));
        }
        ((DialogAdapter) listAdapter).checkItems(iArr);
    }

    @CheckResult
    @NotNull
    public static final MaterialDialog listItemsMultiChoice(@NotNull MaterialDialog materialDialog, @ArrayRes @Nullable Integer num, @Nullable List<? extends CharSequence> list, @Nullable int[] iArr, @NotNull int[] iArr2, boolean z10, boolean z11, @Nullable Function3<? super MaterialDialog, ? super int[], ? super List<? extends CharSequence>, Unit> function3) {
        MDUtil mDUtil = MDUtil.INSTANCE;
        mDUtil.assertOneSet("listItemsMultiChoice", list, num);
        List<? extends CharSequence> list2 = list != null ? list : ArraysKt___ArraysKt.toList(mDUtil.getStringArray(materialDialog.getWindowContext(), num));
        if (DialogListExtKt.getListAdapter(materialDialog) != null) {
            Log.w("MaterialDialogs", "Prefer calling updateListItemsMultiChoice(...) over listItemsMultiChoice(...) again.");
            return updateListItemsMultiChoice(materialDialog, num, list, iArr, function3);
        }
        WhichButton whichButton = WhichButton.POSITIVE;
        boolean z12 = true;
        if (!z11) {
            if (!(!(iArr2.length == 0))) {
                z12 = false;
            }
        }
        DialogActionExtKt.setActionButtonEnabled(materialDialog, whichButton, z12);
        return DialogListExtKt.customListAdapter$default(materialDialog, new MultiChoiceDialogAdapter(materialDialog, list2, iArr, iArr2, z10, z11, function3), null, 2, null);
    }

    public static /* synthetic */ MaterialDialog listItemsMultiChoice$default(MaterialDialog materialDialog, Integer num, List list, int[] iArr, int[] iArr2, boolean z10, boolean z11, Function3 function3, int i10, Object obj) {
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
            iArr2 = new int[0];
        }
        if ((i10 & 16) != 0) {
            z10 = true;
        }
        if ((i10 & 32) != 0) {
            z11 = false;
        }
        if ((i10 & 64) != 0) {
            function3 = null;
        }
        return listItemsMultiChoice(materialDialog, num, list, iArr, iArr2, z10, z11, function3);
    }

    public static final void toggleAllItemsChecked(@NotNull MaterialDialog materialDialog) {
        Object listAdapter = DialogListExtKt.getListAdapter(materialDialog);
        if (!(listAdapter instanceof DialogAdapter)) {
            throw new UnsupportedOperationException("Can't uncheck all items on adapter: ".concat(listAdapter != null ? listAdapter.getClass().getName() : AbstractJsonLexerKt.NULL));
        }
        ((DialogAdapter) listAdapter).toggleAllChecked();
    }

    public static final void toggleItemsChecked(@NotNull MaterialDialog materialDialog, @NotNull int[] iArr) {
        Object listAdapter = DialogListExtKt.getListAdapter(materialDialog);
        if (!(listAdapter instanceof DialogAdapter)) {
            throw new UnsupportedOperationException("Can't toggle checked items on adapter: ".concat(listAdapter != null ? listAdapter.getClass().getName() : AbstractJsonLexerKt.NULL));
        }
        ((DialogAdapter) listAdapter).toggleItems(iArr);
    }

    public static final void uncheckAllItems(@NotNull MaterialDialog materialDialog) {
        Object listAdapter = DialogListExtKt.getListAdapter(materialDialog);
        if (!(listAdapter instanceof DialogAdapter)) {
            throw new UnsupportedOperationException("Can't uncheck all items on adapter: ".concat(listAdapter != null ? listAdapter.getClass().getName() : AbstractJsonLexerKt.NULL));
        }
        ((DialogAdapter) listAdapter).uncheckAllItems();
    }

    public static final void uncheckItems(@NotNull MaterialDialog materialDialog, @NotNull int[] iArr) {
        Object listAdapter = DialogListExtKt.getListAdapter(materialDialog);
        if (!(listAdapter instanceof DialogAdapter)) {
            throw new UnsupportedOperationException("Can't uncheck items on adapter: ".concat(listAdapter != null ? listAdapter.getClass().getName() : AbstractJsonLexerKt.NULL));
        }
        ((DialogAdapter) listAdapter).uncheckItems(iArr);
    }

    @NotNull
    public static final MaterialDialog updateListItemsMultiChoice(@NotNull MaterialDialog materialDialog, @ArrayRes @Nullable Integer num, @Nullable List<? extends CharSequence> list, @Nullable int[] iArr, @Nullable Function3<? super MaterialDialog, ? super int[], ? super List<? extends CharSequence>, Unit> function3) {
        MDUtil mDUtil = MDUtil.INSTANCE;
        mDUtil.assertOneSet("updateListItemsMultiChoice", list, num);
        if (list == null) {
            list = ArraysKt___ArraysKt.toList(mDUtil.getStringArray(materialDialog.getWindowContext(), num));
        }
        RecyclerView.Adapter<?> listAdapter = DialogListExtKt.getListAdapter(materialDialog);
        if (!(listAdapter instanceof MultiChoiceDialogAdapter)) {
            throw new IllegalStateException("updateListItemsMultiChoice(...) can't be used before you've created a multiple choice list dialog.".toString());
        }
        MultiChoiceDialogAdapter multiChoiceDialogAdapter = (MultiChoiceDialogAdapter) listAdapter;
        multiChoiceDialogAdapter.replaceItems2(list, function3);
        if (iArr != null) {
            multiChoiceDialogAdapter.disableItems(iArr);
        }
        return materialDialog;
    }

    public static /* synthetic */ MaterialDialog updateListItemsMultiChoice$default(MaterialDialog materialDialog, Integer num, List list, int[] iArr, Function3 function3, int i10, Object obj) {
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
        return updateListItemsMultiChoice(materialDialog, num, list, iArr, function3);
    }
}
