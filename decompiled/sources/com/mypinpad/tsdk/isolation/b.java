package com.mypinpad.tsdk.isolation;

import com.bbva.cellscore.web.model.page.components.ComponentDTO;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005"}, d2 = {"Lcom/mypinpad/tsdk/i/b;", "", "setOnFocusChangeListener", "setX", "setDividerPadding", "setCompoundDrawableTintBlendMode"}, k = 1, mv = {1, 5, 1})
public final class b {
    private static int getNavBarTitleString = 0;
    public static final b setCompoundDrawableTintBlendMode;
    private static b setDividerPadding = null;
    private static b setOnFocusChangeListener = null;
    private static int setOnLongClickListener = 1;
    public static final b setX;
    private static final /* synthetic */ b[] setY;

    static {
        b bVar = new b("QUERY_REPLY", 0);
        setOnFocusChangeListener = bVar;
        b bVar2 = new b("OUT", 1);
        setX = bVar2;
        b bVar3 = new b("STOP_ACK", 2);
        setDividerPadding = bVar3;
        b bVar4 = new b(ComponentDTO.UI, 3);
        setCompoundDrawableTintBlendMode = bVar4;
        int i10 = 25 << 1;
        int i11 = -25;
        int i12 = (i10 & i11) + (i10 | i11);
        setOnLongClickListener = i12 % 128;
        int i13 = i12 % 2;
        b[] bVarArr = {bVar, bVar2, bVar3, bVar4};
        int i14 = 119 % 128;
        setOnLongClickListener = i14;
        if (119 % 2 == 0) {
            int i15 = 52 / 0;
        }
        setY = bVarArr;
        int i16 = i14 + 53;
        getNavBarTitleString = i16 % 128;
        if (i16 % 2 != 0) {
            throw null;
        }
    }

    public b() {
        throw null;
    }

    public static b valueOf(String str) {
        int i10 = setOnLongClickListener;
        int i11 = i10 & 23;
        int i12 = ((i10 ^ 23) | i11) << 1;
        int i13 = -((i10 | 23) & (~i11));
        int i14 = (i12 ^ i13) + ((i13 & i12) << 1);
        getNavBarTitleString = i14 % 128;
        int i15 = i14 % 2;
        b bVar = (b) Enum.valueOf(b.class, str);
        int i16 = getNavBarTitleString + 41;
        setOnLongClickListener = i16 % 128;
        if (i16 % 2 != 0) {
            return bVar;
        }
        throw null;
    }

    public static b[] values() {
        b[] bVarArr;
        int i10 = getNavBarTitleString;
        int i11 = i10 & 85;
        int i12 = (i10 ^ 85) | i11;
        int i13 = (i11 & i12) + (i12 | i11);
        setOnLongClickListener = i13 % 128;
        int i14 = i13 % 2;
        b[] bVarArr2 = setY;
        if (i14 == 0) {
            bVarArr = (b[]) bVarArr2.clone();
            int i15 = 95 / 0;
        } else {
            bVarArr = (b[]) bVarArr2.clone();
        }
        int i16 = setOnLongClickListener;
        int i17 = (i16 ^ 117) + ((i16 & 117) << 1);
        getNavBarTitleString = i17 % 128;
        int i18 = i17 % 2;
        return bVarArr;
    }
}
