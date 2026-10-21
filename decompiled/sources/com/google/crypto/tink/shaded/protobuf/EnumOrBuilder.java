package com.google.crypto.tink.shaded.protobuf;

import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public interface EnumOrBuilder extends MessageLiteOrBuilder {
    EnumValue getEnumvalue(int i10);

    int getEnumvalueCount();

    List<EnumValue> getEnumvalueList();

    String getName();

    ByteString getNameBytes();

    Option getOptions(int i10);

    int getOptionsCount();

    List<Option> getOptionsList();

    SourceContext getSourceContext();

    Syntax getSyntax();

    int getSyntaxValue();

    boolean hasSourceContext();
}
