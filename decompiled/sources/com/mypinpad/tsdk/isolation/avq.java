package com.mypinpad.tsdk.isolation;

import org.bouncycastle.pqc.crypto.gmss.GMSSKeyPairGenerator;
import org.bouncycastle.pqc.crypto.mceliece.McElieceFujisakiCipher;
import org.bouncycastle.pqc.crypto.mceliece.McElieceKobaraImaiCipher;
import org.bouncycastle.pqc.crypto.mceliece.McEliecePointchevalCipher;

/* JADX INFO: loaded from: classes10.dex */
public interface avq {
    public static final adu getNavBarTitleString;
    public static final adu setCompoundDrawableTintBlendMode;
    public static final adu setDividerPadding;
    public static final adu setLayoutAnimation;
    public static final adu setNavigationOnClickListener;
    public static final adu setOnDragListener;
    public static final adu setOnFocusChangeListener;
    public static final adu setOnLongClickListener;
    public static final adu setX;
    public static final adu setY;

    static {
        adu aduVar = new adu("1.3.6.1.4.1.8301.3.1.3.5.3.2");
        setCompoundDrawableTintBlendMode = aduVar;
        adu aduVar2 = new adu(GMSSKeyPairGenerator.OID);
        setY = aduVar2;
        new adu("1.3.6.1.4.1.8301.3.1.3.4.1");
        setOnFocusChangeListener = new adu("1.3.6.1.4.1.8301.3.1.3.4.2");
        new adu(McElieceFujisakiCipher.OID);
        new adu(McEliecePointchevalCipher.OID);
        new adu(McElieceKobaraImaiCipher.OID);
        setX = ahb.setNavigationOnClickListener;
        setDividerPadding = ahb.setScrollX;
        setLayoutAnimation = ahb.setAlwaysDrawnWithCacheEnabled;
        setNavigationOnClickListener = ahb.setMinHeight;
        getNavBarTitleString = ahb.setCursorVisible;
        setOnDragListener = ahb.setScroller;
        setOnLongClickListener = ahb.setEllipsize;
        new adu("2.16.840.1.114027.80.5.1.1");
        new adu("2.16.840.1.114027.80.5.1.2");
        new adu("2.16.840.1.114027.80.5.1.3");
        new adu("2.16.840.1.114027.80.5.1.4");
        new adu("2.16.840.1.114027.80.5.1.5");
        new adu("2.16.840.1.114027.80.5.1.6");
        new adu("2.16.840.1.114027.80.5.1.7");
        new adu("2.16.840.1.114027.80.5.1.8");
        new adu("2.16.840.1.114027.80.5.1.9");
        new adu("2.16.840.1.114027.80.5.1.10");
    }
}
