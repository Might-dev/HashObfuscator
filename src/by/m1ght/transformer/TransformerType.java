package by.m1ght.transformer;

public enum TransformerType {
    GLOBAL,

    CLASS_RENAME,
    CLASS_PUBLIC,
    INNER_REMOVER,

    METHOD_RENAME,
    METHOD_PUBLIC,
    METHOD_SHUFFLE,
    METHOD_STATIC_MOVE,
    INDY_RENAME,

    FIELD_RENAME,
    FIELD_PUBLIC,
    FIELD_SHUFFLE,

    LOCAL_RENAME,

    DEBUG_CLEAR,
    REPACKAGER,

    STRING_REPLACE,
    STRING_DETACH,
    STRING_RANDOMIZE


    ,
}
